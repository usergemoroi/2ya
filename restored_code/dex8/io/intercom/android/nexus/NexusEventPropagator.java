/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.LruCache
 *  androidx.annotation.NonNull
 *  com.intercom.twig.Twig
 */
package io.intercom.android.nexus;

import android.util.LruCache;
import androidx.annotation.NonNull;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.nexus.NexusListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class NexusEventPropagator
implements NexusListener {
    private final LruCache<String, Boolean> cache = new LruCache(100);
    private final List<NexusListener> listeners = new CopyOnWriteArrayList<NexusListener>();
    private final Twig twig;

    public NexusEventPropagator(Twig twig) {
        this.twig = twig;
    }

    void addListener(@NonNull NexusListener nexusListener) {
        this.listeners.add(nexusListener);
    }

    void cacheEvent(NexusEvent nexusEvent) {
        this.cache.put((Object)nexusEvent.getGuid(), (Object)Boolean.TRUE);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void notifyEvent(@NonNull NexusEvent nexusEvent) {
        if (nexusEvent.getEventType() == NexusEventType.UNKNOWN) return;
        LruCache<String, Boolean> lruCache = this.cache;
        synchronized (lruCache) {
            try {
                if (this.cache.get((Object)nexusEvent.getGuid()) != null) {
                    Twig twig = this.twig;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("dropping event, already in cache: ");
                    stringBuilder.append(nexusEvent.toStringEncodedJsonObject());
                    twig.internal(stringBuilder.toString());
                    return;
                }
                this.cache.put((Object)nexusEvent.getGuid(), (Object)Boolean.TRUE);
                Object object = this.twig;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("notifying listeners of event: ");
                stringBuilder.append((Object)nexusEvent.getEventType());
                object.internal(stringBuilder.toString());
                object = this.listeners.iterator();
                while (object.hasNext()) {
                    ((NexusListener)object.next()).notifyEvent(nexusEvent);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public void onConnect() {
        this.twig.d("notifying listeners that a connection opened", new Object[0]);
        Iterator<NexusListener> iterator = this.listeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().onConnect();
        }
    }

    @Override
    public void onConnectFailed() {
        this.twig.d("notifying listeners that a connection failed to open", new Object[0]);
        Iterator<NexusListener> iterator = this.listeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().onConnectFailed();
        }
    }

    @Override
    public void onShutdown() {
        this.twig.d("notifying listeners that a connection has shutdown", new Object[0]);
        Iterator<NexusListener> iterator = this.listeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().onShutdown();
        }
    }

    void removeListener(@NonNull NexusListener nexusListener) {
        this.listeners.remove(nexusListener);
    }
}


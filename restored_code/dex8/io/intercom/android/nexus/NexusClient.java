/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.intercom.twig.Twig
 *  okhttp3.z
 */
package io.intercom.android.nexus;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.nexus.NexusEventPropagator;
import io.intercom.android.nexus.NexusListener;
import io.intercom.android.nexus.NexusSocket;
import io.intercom.android.nexus.NexusTopicProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import okhttp3.z;

public class NexusClient
implements NexusTopicProvider {
    @Nullable
    private ScheduledExecutorService backgroundTaskExecutor;
    private final z client;
    private final NexusEventPropagator eventPropagator;
    private ScheduledFuture future;
    private long heartbeatInterval;
    private final List<NexusSocket> sockets = new ArrayList<NexusSocket>();
    private final List<String> topics = new ArrayList<String>();
    private final Twig twig;

    public NexusClient(Twig twig) {
        this(twig, NexusClient.defaultOkHttpClientBuilder().c());
    }

    public NexusClient(Twig twig, z z13) {
        this(twig, z13, new NexusEventPropagator(twig));
    }

    NexusClient(Twig twig, z z13, NexusEventPropagator nexusEventPropagator) {
        this.twig = twig;
        this.eventPropagator = nexusEventPropagator;
        this.client = z13;
    }

    public static z.a defaultOkHttpClientBuilder() {
        z.a a14 = new z.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a14.P(130L, timeUnit).S(130L, timeUnit).f(20L, timeUnit);
    }

    private void schedulePing() {
        if (this.heartbeatInterval > 0L) {
            this.future = this.backgroundTaskExecutor.schedule(new Runnable(this){
                final NexusClient this$0;
                {
                    this.this$0 = nexusClient;
                }

                @Override
                public void run() {
                    this.this$0.fire(NexusEvent.getPingEvent());
                    this.this$0.schedulePing();
                }
            }, this.heartbeatInterval, TimeUnit.SECONDS);
        }
    }

    private void subscribeToTopics(@NonNull List<String> list) {
        if (!list.isEmpty()) {
            this.fire(NexusEvent.getSubscribeEvent(list));
        }
    }

    private void unSubscribeFromTopics(@NonNull List<String> list) {
        if (!list.isEmpty()) {
            this.fire(NexusEvent.getUnsubscribeEvent(list));
        }
    }

    public void addEventListener(@NonNull NexusListener nexusListener) {
        this.eventPropagator.addListener(nexusListener);
    }

    public void addTopics(@NonNull List<String> list) {
        synchronized (this) {
            ArrayList<String> arrayList = new ArrayList<String>(list);
            arrayList.removeAll(this.topics);
            this.subscribeToTopics(arrayList);
            this.topics.addAll(arrayList);
            return;
        }
    }

    public void clearTopics() {
        synchronized (this) {
            this.unSubscribeFromTopics(this.topics);
            this.topics.clear();
            return;
        }
    }

    public void connect(NexusConfig nexusConfig, boolean bl2) {
        if (nexusConfig.getEndpoints().isEmpty()) {
            this.twig.e("No endpoints present", new Object[0]);
            return;
        }
        if (this.backgroundTaskExecutor == null) {
            NexusThreadFactory nexusThreadFactory = new NexusThreadFactory();
            this.backgroundTaskExecutor = Executors.newScheduledThreadPool(nexusConfig.getEndpoints().size() + 1, nexusThreadFactory);
        }
        for (String string2 : nexusConfig.getEndpoints()) {
            this.twig.i("Adding socket", new Object[0]);
            NexusSocket object = new NexusSocket(string2, nexusConfig.getConnectionTimeout(), bl2, this.twig, this.backgroundTaskExecutor, this.client, this.eventPropagator, this);
            object.connect();
            this.sockets.add(object);
        }
        this.heartbeatInterval = nexusConfig.getPresenceHeartbeatInterval();
        if (bl2) {
            this.schedulePing();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void disconnect() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object;
                block5: {
                    try {
                        if (this.sockets.isEmpty()) break block5;
                        object = this.sockets.iterator();
                        while (object.hasNext()) {
                            NexusSocket nexusSocket = (NexusSocket)object.next();
                            this.twig.i("disconnecting socket", new Object[0]);
                            nexusSocket.disconnect();
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    this.sockets.clear();
                    this.twig.i("client disconnected", new Object[0]);
                }
                if ((object = this.future) != null) {
                    object.cancel(true);
                }
                return;
            }
            throw throwable2;
        }
    }

    public void fire(NexusEvent object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        this.eventPropagator.cacheEvent((NexusEvent)object);
                        object = ((NexusEvent)object).toStringEncodedJsonObject();
                        if (((String)object).isEmpty()) break block4;
                        Iterator<NexusSocket> iterator = this.sockets.iterator();
                        while (iterator.hasNext()) {
                            iterator.next().fire((String)object);
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    @NonNull
    public List<String> getTopics() {
        synchronized (this) {
            List<String> list = this.topics;
            return list;
        }
    }

    public boolean isConnected() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    Iterator<NexusSocket> iterator = this.sockets.iterator();
                    while (iterator.hasNext()) {
                        boolean bl2 = iterator.next().isConnected();
                        if (!bl2) continue;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                {
                    return true;
                    break;
                }
                return false;
            }
            throw throwable2;
        }
    }

    public void localUpdate(@NonNull NexusEvent nexusEvent) {
        synchronized (this) {
            this.eventPropagator.notifyEvent(nexusEvent);
            return;
        }
    }

    public void removeEventListener(@NonNull NexusListener nexusListener) {
        this.eventPropagator.removeListener(nexusListener);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void removeTopics(@NonNull List<String> object) {
        synchronized (this) {
            try {
                ArrayList<String> arrayList = new ArrayList<String>();
                object = object.iterator();
                while (true) {
                    if (!object.hasNext()) {
                        this.unSubscribeFromTopics(arrayList);
                        this.topics.removeAll(arrayList);
                        return;
                    }
                    String string2 = (String)object.next();
                    if (!this.topics.contains(string2)) continue;
                    arrayList.add(string2);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void setTopics(@NonNull List<String> list) {
        synchronized (this) {
            ArrayList<String> arrayList = new ArrayList<String>(list);
            arrayList.removeAll(this.topics);
            ArrayList<String> arrayList2 = new ArrayList<String>(this.topics);
            arrayList2.removeAll(list);
            this.subscribeToTopics(arrayList);
            this.unSubscribeFromTopics(arrayList2);
            this.topics.clear();
            this.topics.addAll(list);
            return;
        }
    }

    private static class NexusThreadFactory
    implements ThreadFactory {
        private final ThreadFactory defaultFactory = Executors.defaultThreadFactory();
        private int threadCount = 0;

        private NexusThreadFactory() {
        }

        @Override
        public Thread newThread(@NonNull Runnable runnable) {
            runnable = this.defaultFactory.newThread(runnable);
            ++this.threadCount;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("IntercomNexus-");
            stringBuilder.append(this.threadCount);
            ((Thread)runnable).setName(stringBuilder.toString());
            return runnable;
        }
    }
}


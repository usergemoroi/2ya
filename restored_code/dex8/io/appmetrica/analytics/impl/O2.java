/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.impl.Bk;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;

public final class o2
implements Bk,
ApplicationStateProvider {
    public final HashSet a = new HashSet();
    public final HashSet b = new HashSet();
    public volatile ApplicationState c = ApplicationState.UNKNOWN;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();

    public final void a() {
        Object object = ApplicationState.UNKNOWN;
        if (!this.a.isEmpty()) {
            object = ApplicationState.VISIBLE;
        } else if (!this.b.isEmpty()) {
            object = ApplicationState.BACKGROUND;
        }
        if (this.c != object) {
            this.c = object;
            object = this.d.iterator();
            while (object.hasNext()) {
                ((ApplicationStateObserver)object.next()).onApplicationStateChanged(this.c);
            }
        }
    }

    public final void a(int n10) {
        this.a.remove(n10);
        this.a();
    }

    public final void b(int n10) {
        this.b.add(n10);
        this.a.remove(n10);
        this.a();
    }

    public final void c(int n10) {
        this.a.add(n10);
        this.b.remove(n10);
        this.a();
    }

    @Override
    @NonNull
    public final ApplicationState getCurrentState() {
        return this.c;
    }

    @Override
    public final void onCreate() {
        this.a();
    }

    @Override
    public final void onDestroy() {
        if (this.c == ApplicationState.VISIBLE) {
            this.c = ApplicationState.BACKGROUND;
        }
    }

    @Override
    @NonNull
    public final ApplicationState registerStickyObserver(@Nullable ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.d.add(applicationStateObserver);
        }
        return this.c;
    }
}


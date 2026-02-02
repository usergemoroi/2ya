/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Qn;
import io.appmetrica.analytics.impl.pc;
import io.appmetrica.analytics.impl.qc;
import io.appmetrica.analytics.impl.rc;
import io.appmetrica.analytics.impl.tq;
import io.appmetrica.analytics.impl.uq;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class sc
implements pc,
ToggleObserver {
    public final ArrayList a = new ArrayList();
    public final IHandlerExecutor b = Na.j().w().c();
    public Qn c;
    public boolean d;

    public static final void a(sc sc3, LocationControllerObserver locationControllerObserver, boolean bl2) {
        sc3.a.add(locationControllerObserver);
        if (bl2) {
            if (sc3.d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(sc object, boolean bl2) {
        if (((sc)object).d != bl2) {
            ((sc)object).d = bl2;
            a0 a04 = bl2 ? qc.a : rc.a;
            object = ((sc)object).a.iterator();
            while (object.hasNext()) {
                a04.invoke((LocationControllerObserver)object.next());
            }
        }
    }

    public final void a(@Nullable Toggle object) {
        this.c = object = new Qn((Toggle)object);
        ((Qn)object).c.registerObserver(this, true);
    }

    public final void a(@NotNull LocationControllerObserver locationControllerObserver, boolean bl2) {
        this.b.execute(new uq(this, locationControllerObserver, bl2));
    }

    public final void a(@NotNull Object object) {
        Qn qn3;
        Qn qn4 = qn3 = this.c;
        if (qn3 == null) {
            y.B("togglesHolder");
            qn4 = null;
        }
        qn4.b.a(object);
    }

    public final void a(boolean bl2) {
        Qn qn3;
        Qn qn4 = qn3 = this.c;
        if (qn3 == null) {
            y.B("togglesHolder");
            qn4 = null;
        }
        qn4.a.a(bl2);
    }

    public final void b(@NotNull Object object) {
        Qn qn3;
        Qn qn4 = qn3 = this.c;
        if (qn3 == null) {
            y.B("togglesHolder");
            qn4 = null;
        }
        qn4.b.b(object);
    }

    @Override
    public final void onStateChanged(boolean bl2) {
        this.b.execute(new tq(this, bl2));
    }
}


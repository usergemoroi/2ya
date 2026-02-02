/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.impl.Co;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Zm;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.sm;
import io.appmetrica.analytics.impl.tm;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class qm
implements tm {
    public volatile om a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public final void a(@NotNull Context object) {
        ProtobufStateStorage<Object> protobufStateStorage = Zm.a(sm.class).a((Context)object);
        object = Na.j().B().a();
        synchronized (object) {
            String string2 = JsonUtils.optStringOrNull(((Co)object).a.a(), "device_id");
            // MONITOREXIT @DISABLED, blocks:[0, 1] lbl6 : MonitorExitStatement: MONITOREXIT : var1_1
            this.a(new om(string2, ((Co)object).a(), (sm)protobufStateStorage.read()));
            return;
        }
    }

    @Override
    public final void a(@NotNull om om3) {
        this.a = om3;
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((tm)iterator.next()).a(om3);
        }
    }

    public final void a(@NotNull tm tm3) {
        this.b.add(tm3);
        if (this.a != null) {
            om om3;
            om om4 = om3 = this.a;
            if (om3 == null) {
                y.B("startupState");
                om4 = null;
            }
            tm3.a(om4);
        }
    }

    @NotNull
    public final om b() {
        om om3;
        om om4 = om3 = this.a;
        if (om3 == null) {
            y.B("startupState");
            om4 = null;
        }
        return om4;
    }

    public final void b(@NotNull tm tm3) {
        this.b.remove(tm3);
    }
}


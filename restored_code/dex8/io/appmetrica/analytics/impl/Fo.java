/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.S4;
import io.appmetrica.analytics.impl.T;
import io.appmetrica.analytics.impl.V4;
import io.appmetrica.analytics.impl.Y4;
import io.appmetrica.analytics.impl.d7;
import io.appmetrica.analytics.impl.o6;

public final class fo
extends Y4 {
    public final d7 b;

    public fo(@NonNull V4 v44, @NonNull d7 d72) {
        super(v44);
        this.b = d72;
    }

    @Override
    public final boolean a(@NonNull o6 object, @NonNull S4 object2) {
        object = ((S4)object2).b.d.a;
        object2 = ((M4)object).i;
        this.b.a((Boolean)object2);
        object2 = Na.F.l();
        Boolean bl2 = ((M4)object).b;
        boolean bl3 = Boolean.TRUE.equals(bl2);
        boolean bl4 = true;
        if (bl3) {
            object2.a(true);
        } else {
            bl2 = ((M4)object).b;
            if (Boolean.FALSE.equals(bl2)) {
                object2.a(false);
            }
        }
        object2.a(((M4)object).c);
        object = ((M4)object).n;
        object2 = Na.F.b();
        if (object != null) {
            bl4 = (Boolean)object;
        }
        ((T)object2).b(bl4);
        return false;
    }
}


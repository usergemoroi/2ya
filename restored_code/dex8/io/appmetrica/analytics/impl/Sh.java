/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Do;
import io.appmetrica.analytics.impl.Eo;
import io.appmetrica.analytics.impl.K9;
import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.v5;

public final class sh
extends nh {
    public final Do b;

    public sh(@NonNull v5 v54) {
        this(v54, v54.u());
    }

    public sh(v5 v54, Do do_) {
        super(v54);
        this.b = do_;
    }

    @Override
    public final boolean a(@NonNull o6 object) {
        Object object2 = this.a;
        if (!this.b.c()) {
            if (!this.b.d()) {
                object2 = ((v5)object2).n;
                object = o6.a((o6)object, Bb.A);
                ((K9)object2).c.b((o6)object);
            }
            object = this.b;
            synchronized (object) {
                object2 = ((Do)object).a;
                ((Eo)object2).a(((Eo)object2).a().put("first_event_done", true));
            }
        }
        return false;
    }
}


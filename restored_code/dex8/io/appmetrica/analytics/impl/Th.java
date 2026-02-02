/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Da;
import io.appmetrica.analytics.impl.k9;
import io.appmetrica.analytics.impl.m9;
import io.appmetrica.analytics.impl.n9;
import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.o9;
import io.appmetrica.analytics.impl.p9;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

public final class th
extends nh {
    public final k9 b;

    public th(@NonNull v5 v54) {
        this(v54, v54.j());
    }

    public th(v5 v54, k9 k94) {
        super(v54);
        this.b = k94;
    }

    @Override
    public final boolean a(@NonNull o6 o63) {
        if (!TextUtils.isEmpty((CharSequence)o63.getName())) {
            int n10;
            Object object = this.b;
            Object object2 = o63.getName();
            if (((k9)object).c == null) {
                ((k9)object).a();
            }
            if (((k9)object).c.b.contains(n10 = object2.hashCode())) {
                object2 = Da.d;
            } else {
                Object object3 = ((k9)object).c;
                object2 = ((m9)object3).a ? Da.c : Da.b;
                if (((m9)object3).d < 1000) {
                    ((m9)object3).b.add(n10);
                    ++((m9)object3).d;
                } else {
                    ((m9)object3).a = false;
                }
                object3 = ((k9)object).b;
                m9 m94 = ((k9)object).c;
                object = ((p9)object3).c;
                o9 o92 = ((p9)object3).b;
                ((p9)object3).a.getClass();
                object3 = n9.a(m94);
                o92.getClass();
                object.insert("event_hashes", MessageNano.toByteArray((MessageNano)object3));
            }
            o63.k = object2;
        }
        return false;
    }
}


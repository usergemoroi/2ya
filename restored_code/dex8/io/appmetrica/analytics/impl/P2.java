/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.impl.Do;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.k9;
import io.appmetrica.analytics.impl.m9;
import io.appmetrica.analytics.impl.n9;
import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.p9;
import io.appmetrica.analytics.impl.qk;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashSet;

public final class p2
extends nh {
    public final Do b;
    public final qk c;

    public p2(@NonNull v5 v54) {
        this(v54, v54.u(), qk.c());
    }

    public p2(v5 v54, Do do_, qk qk3) {
        super(v54);
        this.b = do_;
        this.c = qk3;
    }

    @Override
    public final boolean a(@NonNull o6 object) {
        object = this.a;
        if (!this.b.c() && !this.b.d()) {
            if (((Gh)((v5)object).k.a()).e) {
                this.c.b();
            }
            Object object2 = this.a.l;
            if (((k9)object2).c == null) {
                ((k9)object2).a();
            }
            object = ((k9)object2).c;
            object.getClass();
            ((m9)object).b = new HashSet();
            ((m9)object).d = 0;
            object = ((k9)object2).c;
            ((m9)object).a = true;
            p9 p92 = ((k9)object2).b;
            IBinaryDataHelper iBinaryDataHelper = p92.c;
            object2 = p92.b;
            p92.a.getClass();
            object = n9.a((m9)object);
            object2.getClass();
            iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray((MessageNano)object));
        }
        return false;
    }
}


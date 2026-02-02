/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.impl.F2;
import io.appmetrica.analytics.impl.G2;
import io.appmetrica.analytics.impl.J2;
import io.appmetrica.analytics.impl.K9;
import io.appmetrica.analytics.impl.M2;
import io.appmetrica.analytics.impl.N2;
import io.appmetrica.analytics.impl.Qe;
import io.appmetrica.analytics.impl.Zm;
import io.appmetrica.analytics.impl.b2;
import io.appmetrica.analytics.impl.bl;
import io.appmetrica.analytics.impl.k2;
import io.appmetrica.analytics.impl.lj;
import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.v5;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class xh
extends nh {
    public final Qe b;
    public final ProtobufStateStorage c;
    public final N2 d;
    public final k2 e;
    public final G2 f;

    public xh(v5 v54, Qe qe3) {
        this(v54, qe3, Zm.a(b2.class).a(v54.getContext()), new N2(v54.getContext()), new k2(), new G2(v54.getContext()));
    }

    public xh(v5 v54, Qe qe3, ProtobufStateStorage protobufStateStorage, N2 n23, k2 k24, G2 g22) {
        super(v54);
        this.b = qe3;
        this.c = protobufStateStorage;
        this.d = n23;
        this.e = k24;
        this.f = g22;
    }

    @Override
    public final boolean a(@NonNull o6 o63) {
        v5 v54 = this.a;
        v54.b.toString();
        if (v54.t.c() && v54.x()) {
            b2 b22 = (b2)this.c.read();
            List list = b22.a;
            M2 m24 = b22.b;
            Object object = this.d;
            object.getClass();
            boolean bl2 = AndroidUtils.isApiAchieved(28);
            Object var8_8 = null;
            Object object2 = bl2 ? J2.a(((N2)object).a, ((N2)object).b) : null;
            List list2 = b22.c;
            List list3 = SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f.a, "getting available providers", "location manager", Collections.emptyList(), new F2());
            object = this.b;
            Object object3 = this.a.a;
            object.getClass();
            object3 = new lj((Context)object3, new SafePackageManager()).a();
            object = object3;
            if (CollectionUtils.areCollectionsEqual((Collection<? extends Object>)object3, list)) {
                object = null;
            }
            if (object == null && ro.a(m24, object2) && CollectionUtils.areCollectionsEqual(list2, list3)) {
                object = var8_8;
            } else {
                if (object == null) {
                    object = list;
                }
                object = new b2((List)object, (M2)object2, list3);
            }
            if (object == null) {
                if (v54.A()) {
                    long l10;
                    object = v54.n;
                    o63 = o6.a(o63, b22.a, b22.b, this.e, b22.c);
                    ((K9)object).a(o63, bl.a(((K9)object).c.b(o63), o63.i));
                    ((K9)object).l = l10 = ((K9)object).j.currentTimeSeconds();
                    ((K9)object).a.a(l10).b();
                }
            } else {
                long l11;
                object2 = v54.n;
                o63 = o6.a(o63, ((b2)object).a, ((b2)object).b, this.e, ((b2)object).c);
                ((K9)object2).a(o63, bl.a(((K9)object2).c.b(o63), o63.i));
                ((K9)object2).l = l11 = ((K9)object2).j.currentTimeSeconds();
                ((K9)object2).a.a(l11).b();
                this.c.save(object);
            }
        }
        return false;
    }
}


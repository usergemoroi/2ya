/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bm0
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.dd2
 *  com.yandex.mobile.ads.impl.h10
 *  com.yandex.mobile.ads.impl.jc2
 *  com.yandex.mobile.ads.impl.kd2
 *  com.yandex.mobile.ads.impl.o70
 *  com.yandex.mobile.ads.impl.tz1
 *  com.yandex.mobile.ads.impl.ws
 *  com.yandex.mobile.ads.impl.yv0
 *  com.yandex.mobile.ads.impl.zd2
 *  com.yandex.mobile.ads.impl.zl0
 *  kotlin.collections.t
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bm0;
import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.dd2;
import com.yandex.mobile.ads.impl.h10;
import com.yandex.mobile.ads.impl.jc2;
import com.yandex.mobile.ads.impl.kd2;
import com.yandex.mobile.ads.impl.lu;
import com.yandex.mobile.ads.impl.o70;
import com.yandex.mobile.ads.impl.tn0;
import com.yandex.mobile.ads.impl.tz1;
import com.yandex.mobile.ads.impl.ws;
import com.yandex.mobile.ads.impl.xb2;
import com.yandex.mobile.ads.impl.yv0;
import com.yandex.mobile.ads.impl.zd2;
import com.yandex.mobile.ads.impl.zl0;
import java.util.ArrayList;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public final class io0
implements dd2<co0> {
    @NotNull
    private final ws a;
    private final long b;
    @NotNull
    private final tz1 c;
    @NotNull
    private final h10 d;
    @NotNull
    private final jc2 e;
    @NotNull
    private final bm0 f;

    public io0(@NotNull ws ws3, long l10, @NotNull tz1 tz12, @NotNull h10 h102, @NotNull jc2 jc22, @NotNull bm0 bm02) {
        this.a = ws3;
        this.b = l10;
        this.c = tz12;
        this.d = h102;
        this.e = jc22;
        this.f = bm02;
    }

    public final Object a(xb2 xb22, lu lu3, yv0 object3, kd2 kd22, String string2, String string3, JSONObject jSONObject) {
        String string4;
        long l10;
        ArrayList<tn0> arrayList;
        tn0 tn02;
        Object var14_10;
        Object object2;
        block4: {
            object2 = this.c;
            boolean bl2 = this.d.a();
            var14_10 = null;
            if (bl2) {
                object2 = null;
            }
            object2 = object2 != null ? object2.a(lu3) : null;
            tn02 = new tn0(this.a, object3.f(), object3.h(), object3.d(), object3.e(), object3.b(), object3.a());
            object3 = lu3.h();
            arrayList = new ArrayList<tn0>(t.x((Iterable)object3, (int)10));
            for (Object object3 : object3) {
                arrayList.add(new tn0(this.a, object3.f(), object3.h(), object3.d(), object3.e(), object3.b(), object3.a()));
            }
            l10 = lu3.e();
            object3 = this.e;
            long l11 = this.b;
            object3.getClass();
            string4 = jc2.a((long)l11, (kd2)kd22, (xb2)xb22);
            this.f.getClass();
            for (Object object3 : xb22.l().a()) {
                if (!y.e(((o70)object3).a(), "bannerId")) continue;
                break block4;
            }
            object3 = null;
        }
        o70 o702 = (o70)object3;
        object3 = var14_10;
        if (o702 != null) {
            object3 = o702.b();
        }
        return new co0(string4, tn02, arrayList, kd22, (zd2)object2, new zl0(xb22.g(), lu3.g(), (String)object3, string2, string3, lu3.b()), jSONObject, l10, xb22.l().a());
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.a1
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.cp
 *  com.yandex.mobile.ads.impl.d20
 *  com.yandex.mobile.ads.impl.h52
 *  com.yandex.mobile.ads.impl.jq
 *  com.yandex.mobile.ads.impl.nr
 *  com.yandex.mobile.ads.impl.t2
 *  com.yandex.mobile.ads.impl.t20
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.impl.v00
 *  com.yandex.mobile.ads.impl.v5
 *  com.yandex.mobile.ads.impl.vv
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xd0
 *  com.yandex.mobile.ads.impl.xq1
 *  com.yandex.mobile.ads.impl.yp0
 *  com.yandex.mobile.ads.impl.zp0
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.a1;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.cp;
import com.yandex.mobile.ads.impl.d20;
import com.yandex.mobile.ads.impl.f51;
import com.yandex.mobile.ads.impl.h52;
import com.yandex.mobile.ads.impl.jq;
import com.yandex.mobile.ads.impl.ni2;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.ns1;
import com.yandex.mobile.ads.impl.oj1;
import com.yandex.mobile.ads.impl.s01;
import com.yandex.mobile.ads.impl.t2;
import com.yandex.mobile.ads.impl.t20;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.tp;
import com.yandex.mobile.ads.impl.v00;
import com.yandex.mobile.ads.impl.v5;
import com.yandex.mobile.ads.impl.vv;
import com.yandex.mobile.ads.impl.wq0;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xd0;
import com.yandex.mobile.ads.impl.xq0;
import com.yandex.mobile.ads.impl.xq1;
import com.yandex.mobile.ads.impl.yp0;
import com.yandex.mobile.ads.impl.zp0;
import java.util.Collection;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class aq0
implements v00 {
    @NotNull
    private final x2 a;
    @NotNull
    private final zp0 b;
    @NotNull
    private final f51 c;

    @JvmOverloads
    public aq0(@NotNull x2 x22, @NotNull zp0 zp02, @NotNull f51 f512) {
        this.a = x22;
        this.b = zp02;
        this.c = f512;
    }

    @NotNull
    public final List a(@NotNull Context context, @NotNull b8 b82, @NotNull t61 t612, @NotNull nr nr2, @NotNull a1 a12, @NotNull vv vv2, @NotNull t2 t22, @NotNull ns1 object, @NotNull h52 h522, @NotNull d20 d202, @Nullable t20 t202, @Nullable v5 v52) {
        object = new yp0(b82, a12, nr2, (cp)new ni2()).a(this.c, vv2, h522);
        s01 s012 = this.a.p().c();
        object = t.p((Object[])new xd0[]{new oj1((tp)object, s012, new jq()), new xq0((tp)object, s012, new xq1(), new jq()), new wq0((tp)object, s012, new xq1(), new jq())});
        return t.o0((Iterable)t.M0((Collection)t.e((Object)this.b.a(context, b82, t612, a12, nr2, t22, vv2, d202, h522, t202, v52)), (Iterable)object));
    }
}


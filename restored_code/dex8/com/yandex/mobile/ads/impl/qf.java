/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.a01
 *  com.yandex.mobile.ads.impl.c01
 *  com.yandex.mobile.ads.impl.ca
 *  com.yandex.mobile.ads.impl.d01
 *  com.yandex.mobile.ads.impl.dp0
 *  com.yandex.mobile.ads.impl.ep0
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.ht0
 *  com.yandex.mobile.ads.impl.j11
 *  com.yandex.mobile.ads.impl.l0
 *  com.yandex.mobile.ads.impl.lz0
 *  com.yandex.mobile.ads.impl.lz0$a
 *  com.yandex.mobile.ads.impl.n82
 *  com.yandex.mobile.ads.impl.qw1
 *  com.yandex.mobile.ads.impl.qz0
 *  com.yandex.mobile.ads.impl.r11
 *  com.yandex.mobile.ads.impl.wd
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.a01;
import com.yandex.mobile.ads.impl.c01;
import com.yandex.mobile.ads.impl.ca;
import com.yandex.mobile.ads.impl.d01;
import com.yandex.mobile.ads.impl.dp0;
import com.yandex.mobile.ads.impl.ep0;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.ht0;
import com.yandex.mobile.ads.impl.j11;
import com.yandex.mobile.ads.impl.l0;
import com.yandex.mobile.ads.impl.lz0;
import com.yandex.mobile.ads.impl.n82;
import com.yandex.mobile.ads.impl.qw1;
import com.yandex.mobile.ads.impl.qz0;
import com.yandex.mobile.ads.impl.r11;
import com.yandex.mobile.ads.impl.wd;
import com.yandex.mobile.ads.impl.wp1;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.core.initializer.AppStartupInitializer$initialize$1", f="AppStartupInitializer.kt", i={}, l={}, m="invokeSuspend", n={}, s={})
final class qf
extends k
implements p<q0, d<? super k0>, Object> {
    final Context b;
    final gv1 c;

    qf(Context context, gv1 gv12, d<? super qf> d14) {
        this.b = context;
        this.c = gv12;
        super(2, d14);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
        return new qf(this.b, this.c, d14);
    }

    public final Object invoke(Object object, Object object2) {
        object = (q0)object;
        object = (d)object2;
        return new qf(this.b, this.c, (d<? super qf>)object).invokeSuspend(k0.a);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        kotlin.coroutines.intrinsics.b.f();
        v.b(object);
        int n10 = n82.c;
        n82.a((Context)this.b, (wp1)this.c.c());
        wd.a((Context)this.b, (wp1)this.c.c());
        object = new ht0();
        Comparable<Boolean> comparable = ht0.c((Context)this.b);
        if (comparable != null) {
            r11.b((boolean)((Boolean)comparable));
        }
        if ((comparable = ht0.f((Context)this.b)) != null) {
            r11.a((boolean)((Boolean)comparable));
        }
        if (ca.a((Context)this.b)) {
            new j11();
            comparable = j11.a((Context)this.b);
            if (comparable instanceof j11.a.b) {
                dp0.a((String)new ep0().a((j11.a.b)((Object)comparable)), (Object[])new Object[0]);
            } else if (comparable instanceof j11.a.a) {
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append("Yandex Mobile Ads");
                ((StringBuilder)comparable).append(" ");
                ((StringBuilder)comparable).append("7.15.2");
                ((StringBuilder)comparable).append(" integrated successfully");
                dp0.b((String)((StringBuilder)comparable).toString(), (Object[])new Object[0]);
            }
            comparable = new qz0();
            n10 = lz0.e;
            List list = lz0.a.a();
            list = new a01().a(list);
            c01.a((ArrayList)new d01(comparable).a((ArrayList)list));
        }
        object = new qw1((ht0)object, this.c);
        l0.a((Context)this.b);
        object.a(this.b);
        return k0.a;
    }
}


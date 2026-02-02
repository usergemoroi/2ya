/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.al0
 *  com.yandex.mobile.ads.impl.fx
 *  com.yandex.mobile.ads.impl.gx
 *  com.yandex.mobile.ads.impl.is0
 *  com.yandex.mobile.ads.impl.jx
 *  com.yandex.mobile.ads.impl.kx
 *  com.yandex.mobile.ads.impl.lx
 *  com.yandex.mobile.ads.impl.so1
 *  com.yandex.mobile.ads.impl.yk0
 *  com.yandex.mobile.ads.impl.zk0
 *  com.yandex.mobile.ads.impl.zz0
 *  kotlin.collections.t
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.jvm.functions.p
 *  kotlinx.coroutines.m0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.al0;
import com.yandex.mobile.ads.impl.fx;
import com.yandex.mobile.ads.impl.gx;
import com.yandex.mobile.ads.impl.is0;
import com.yandex.mobile.ads.impl.jx;
import com.yandex.mobile.ads.impl.kx;
import com.yandex.mobile.ads.impl.lx;
import com.yandex.mobile.ads.impl.so1;
import com.yandex.mobile.ads.impl.yk0;
import com.yandex.mobile.ads.impl.zk0;
import com.yandex.mobile.ads.impl.zz0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.t;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.u;
import kotlin.v;
import kotlinx.coroutines.i;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class mx
implements lx {
    @NotNull
    private final is0 a;
    @NotNull
    private final so1 b;
    @NotNull
    private final zz0 c;
    @NotNull
    private final yk0 d;
    @NotNull
    private final al0 e;
    @NotNull
    private final m0 f;

    public mx(@NotNull is0 is02, @NotNull so1 so12, @NotNull zz0 zz02, @NotNull yk0 yk02, @NotNull al0 al02, @NotNull m0 m02) {
        this.a = is02;
        this.b = so12;
        this.c = zz02;
        this.d = yk02;
        this.e = al02;
        this.f = m02;
    }

    @Nullable
    public final Object a(@NotNull d<? super zk0> d14) {
        return i.g((g)this.f, new p<q0, d<? super zk0>, Object>(this, null){
            fx b;
            gx c;
            int d;
            final mx e;
            {
                this.e = mx3;
                super(2, d14);
            }

            @NotNull
            public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
                return new /* invalid duplicate definition of identical inner class */;
            }

            public final Object invoke(Object object, Object object2) {
                object = (q0)object;
                object = (d)object2;
                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)k0.a);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Nullable
            public final Object invokeSuspend(@NotNull Object object) {
                fx fx3;
                gx gx3;
                Object object2;
                block10: {
                    block9: {
                        object2 = kotlin.coroutines.intrinsics.b.f();
                        int n10 = this.d;
                        if (n10 != 0) {
                            if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            gx3 = this.c;
                            fx3 = this.b;
                            v.b(object);
                            object = ((u)object).j();
                        } else {
                            v.b(object);
                            fx3 = this.e.a.a();
                            gx3 = fx3.d();
                            if (gx3 == null) {
                                return zk0.b.a;
                            }
                            object = this.e.b;
                            this.b = fx3;
                            this.c = gx3;
                            this.d = 1;
                            if ((object = object.a((d)((Object)this))) == object2) {
                                return object2;
                            }
                        }
                        object2 = object;
                        if (u.g(object)) {
                            object2 = null;
                        }
                        if ((object = (jx)object2) == null) break block9;
                        object = object2 = object.f();
                        if (object2 != null) break block10;
                    }
                    object = t.m();
                }
                object2 = fx3.e();
                object = this.e.c.a((List)object);
                if (((ArrayList)object).isEmpty()) {
                    object = object2;
                }
                object = new kx(fx3.a(), fx3.f(), (List)object, fx3.b(), gx3.b(), gx3.a());
                object = this.e.d.a((kx)object);
                return this.e.e.a((String)object);
            }
        }, d14);
    }
}


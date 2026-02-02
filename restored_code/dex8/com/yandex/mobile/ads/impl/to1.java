/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ay
 *  com.yandex.mobile.ads.impl.cl0
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.ed1
 *  com.yandex.mobile.ads.impl.jx
 *  com.yandex.mobile.ads.impl.kq1
 *  com.yandex.mobile.ads.impl.kq1$a
 *  com.yandex.mobile.ads.impl.lq1
 *  com.yandex.mobile.ads.impl.so1
 *  com.yandex.mobile.ads.impl.yp1
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.d
 *  kotlin.jvm.functions.l
 *  kotlinx.coroutines.n
 *  kotlinx.coroutines.p
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ay;
import com.yandex.mobile.ads.impl.bl0;
import com.yandex.mobile.ads.impl.cl0;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.ed1;
import com.yandex.mobile.ads.impl.jx;
import com.yandex.mobile.ads.impl.kq1;
import com.yandex.mobile.ads.impl.lq1;
import com.yandex.mobile.ads.impl.so1;
import com.yandex.mobile.ads.impl.yo0;
import com.yandex.mobile.ads.impl.yp1;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.functions.l;
import kotlin.k0;
import kotlin.u;
import kotlin.v;
import kotlinx.coroutines.p;
import kotlinx.serialization.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class to1
implements so1 {
    @NotNull
    private final Context a;
    @NotNull
    private final lq1<jx> b;
    @NotNull
    private final ay c;
    @NotNull
    private final cl0 d;

    public to1(@NotNull Context context, @NotNull lq1<jx> lq12, @NotNull ay ay3, @NotNull cl0 cl02) {
        this.a = context;
        this.b = lq12;
        this.c = ay3;
        this.d = cl02;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Nullable
    public final Object a(@NotNull d<? super u<jx>> var1_1) {
        if (!(var1_1 /* !! */  instanceof a)) ** GOTO lbl-1000
        var3_3 /* !! */  = var1_1 /* !! */ ;
        var2_4 = var3_3 /* !! */ .d;
        if ((var2_4 & -2147483648) != 0) {
            var3_3 /* !! */ .d = var2_4 + -2147483648;
            var1_1 /* !! */  = var3_3 /* !! */ ;
        } else lbl-1000:
        // 2 sources

        {
            var1_1 /* !! */  = new kotlin.coroutines.jvm.internal.d(this, var1_1 /* !! */ ){
                Object b;
                final to1 c;
                int d;
                {
                    this.c = to12;
                    super(d14);
                }

                @Nullable
                public final Object invokeSuspend(@NotNull Object object) {
                    this.b = object;
                    this.d |= Integer.MIN_VALUE;
                    object = this.c.a((d<? super u<jx>>)((Object)this));
                    if (object == kotlin.coroutines.intrinsics.b.f()) {
                        return object;
                    }
                    return u.a(object);
                }
            };
        }
        var3_3 /* !! */  = var1_1 /* !! */ .b;
        var4_5 = kotlin.coroutines.intrinsics.b.f();
        var2_4 = var1_1 /* !! */ .d;
        if (var2_4 == 0) ** GOTO lbl18
        if (var2_4 == 1) {
            v.b((Object)var3_3 /* !! */ );
            var1_1 /* !! */  = var3_3 /* !! */ ;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl18:
            // 1 sources

            v.b((Object)var3_3 /* !! */ );
            var1_1 /* !! */ .d = 1;
            var3_3 /* !! */  = new p(kotlin.coroutines.intrinsics.b.c(var1_1 /* !! */ ), 1);
            var3_3 /* !! */ .H();
            var6_6 /* !! */  = this.d;
            var5_7 /* !! */  = new l<jx, k0>((p)var3_3 /* !! */ ){
                final kotlinx.coroutines.n<u<jx>> b;
                {
                    this.b = p14;
                    super(1);
                }

                public final Object invoke(Object object) {
                    object = (jx)object;
                    this.b.resumeWith(u.b(u.a(u.b(object))));
                    return k0.a;
                }
            };
            var7_8 = new l<dj2, k0>((p)var3_3 /* !! */ ){
                final kotlinx.coroutines.n<u<jx>> b;
                {
                    this.b = p14;
                    super(1);
                }

                public final Object invoke(Object n10) {
                    dj2 dj22 = (dj2)n10;
                    if (!(dj22.getCause() instanceof n)) {
                        n10 = this.b;
                        u.a a14 = u.d;
                        n10.resumeWith(u.b(u.a(u.b(v.a((Throwable)dj22)))));
                        return k0.a;
                    }
                    throw dj22;
                }
            };
            var6_6 /* !! */ .getClass();
            var5_7 /* !! */  = new bl0((l<? super jx, k0>)var5_7 /* !! */ , (l<? super dj2, k0>)var7_8);
            var6_6 /* !! */  = new yo0(this.a, this.c.b(), this.b, this.c.a(), (bl0)var5_7 /* !! */ );
            var2_4 = kq1.c;
            var5_7 /* !! */  = kq1.a.a();
            var7_8 = this.a;
            synchronized (var5_7 /* !! */ ) {
                ed1.a((Context)var7_8).a((yp1)var6_6 /* !! */ );
            }
            var3_3 /* !! */  = var3_3 /* !! */ .z();
            if (var3_3 /* !! */  == kotlin.coroutines.intrinsics.b.f()) {
                g.c(var1_1 /* !! */ );
            }
            var1_1 /* !! */  = var3_3 /* !! */ ;
            if (var3_3 /* !! */  == var4_5) {
                return var4_5;
            }
        }
        return ((u)var1_1 /* !! */ ).j();
        {
            catch (Throwable var1_2) {
                throw var1_2;
            }
        }
    }
}


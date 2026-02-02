/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.gf0
 *  com.yandex.mobile.ads.impl.ik1
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.qk
 *  com.yandex.mobile.ads.impl.w82
 *  com.yandex.mobile.ads.impl.x2
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 *  kotlinx.coroutines.x0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.gf0;
import com.yandex.mobile.ads.impl.ik1;
import com.yandex.mobile.ads.impl.lj;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.qk;
import com.yandex.mobile.ads.impl.w82;
import com.yandex.mobile.ads.impl.x2;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.base.BaseAdLoadController$loadBiddingData$1", f="BaseAdLoadController.kt", i={0}, l={173, 174}, m="invokeSuspend", n={"prefetchedMediationData"}, s={"L$0"})
final class nj
extends k
implements p<q0, d<? super k0>, Object> {
    x2 b;
    int c;
    private Object d;
    final lj<Object> e;
    final w82 f;
    final qk g;

    nj(lj<Object> lj3, w82 w822, qk qk3, d<? super nj> d14) {
        this.e = lj3;
        this.f = w822;
        this.g = qk3;
        super(2, d14);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
        d14 = new nj(this.e, this.f, this.g, d14);
        ((nj)((Object)d14)).d = object;
        return d14;
    }

    public final Object invoke(Object object, Object object2) {
        return ((nj)((Object)this.create((q0)object, (d)object2))).invokeSuspend(k0.a);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        Object object2;
        Object object3;
        block5: {
            Object object4;
            block6: {
                block2: {
                    block3: {
                        block4: {
                            object4 = kotlin.coroutines.intrinsics.b.f();
                            int n10 = this.c;
                            if (n10 == 0) break block2;
                            if (n10 == 1) break block3;
                            if (n10 != 2) break block4;
                            object3 = (x2)this.d;
                            v.b(object);
                            object2 = object;
                            break block5;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    object3 = this.b;
                    object2 = (x0)this.d;
                    v.b(object);
                    break block6;
                }
                v.b(object);
                object = (q0)this.d;
                object2 = i.b((q0)object, null, null, (p)new p<q0, d<? super String>, Object>(this.e, this.g, null){
                    int b;
                    final lj<Object> c;
                    final qk d;
                    {
                        this.c = lj3;
                        this.d = qk3;
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
                        Object object2 = kotlin.coroutines.intrinsics.b.f();
                        int n10 = this.b;
                        if (n10 != 0) {
                            if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            v.b(object);
                            return object;
                        } else {
                            Object object3;
                            v.b(object);
                            ik1 ik12 = lj.b(this.c);
                            Context context = this.c.k();
                            object = this.d;
                            this.b = 1;
                            object = object3 = ik12.a(context, (qk)object, (d)((Object)this));
                            if (object3 != object2) return object;
                            return object2;
                        }
                    }
                }, 3, null);
                object = i.b((q0)object, null, null, (p)new p<q0, d<? super String>, Object>(this.e, this.g, null){
                    int b;
                    final lj<Object> c;
                    final qk d;
                    {
                        this.c = lj3;
                        this.d = qk3;
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
                        Object object2 = kotlin.coroutines.intrinsics.b.f();
                        int n10 = this.b;
                        if (n10 != 0) {
                            if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            v.b(object);
                            return object;
                        } else {
                            Object object3;
                            v.b(object);
                            gf0 gf02 = lj.a(this.c);
                            Context context = this.c.k();
                            object = this.d;
                            this.b = 1;
                            object = object3 = gf02.a(context, (qk)object, (d)((Object)this));
                            if (object3 != object2) return object;
                            return object2;
                        }
                    }
                }, 3, null);
                object3 = this.e.e();
                this.d = object2;
                this.b = object3;
                this.c = 1;
                object = object.l((d)((Object)this));
                if (object == object4) {
                    return object4;
                }
            }
            object3.c((String)object);
            this.d = object = this.e.e();
            this.b = null;
            this.c = 2;
            object2 = object2.l((d)((Object)this));
            if (object2 == object4) {
                return object4;
            }
            object3 = object;
        }
        object3.d((String)object2);
        this.e.h().a(o4.g);
        this.e.a(this.f);
        return k0.a;
    }
}


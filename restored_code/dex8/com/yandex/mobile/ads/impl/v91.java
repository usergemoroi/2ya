/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ej0
 *  com.yandex.mobile.ads.impl.j51
 *  com.yandex.mobile.ads.impl.j7
 *  com.yandex.mobile.ads.impl.p91
 *  com.yandex.mobile.ads.impl.pa1
 *  com.yandex.mobile.ads.impl.u91
 *  com.yandex.mobile.ads.impl.u91$a
 *  com.yandex.mobile.ads.impl.v41
 *  com.yandex.mobile.ads.impl.vv
 *  com.yandex.mobile.ads.impl.x2
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 *  kotlinx.coroutines.m0
 *  kotlinx.coroutines.x0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.bl1;
import com.yandex.mobile.ads.impl.ej0;
import com.yandex.mobile.ads.impl.j51;
import com.yandex.mobile.ads.impl.j7;
import com.yandex.mobile.ads.impl.o91;
import com.yandex.mobile.ads.impl.p91;
import com.yandex.mobile.ads.impl.pa1;
import com.yandex.mobile.ads.impl.u91;
import com.yandex.mobile.ads.impl.v41;
import com.yandex.mobile.ads.impl.vv;
import com.yandex.mobile.ads.impl.x2;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.u;
import kotlin.v;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.nativeads.creator.NativeResourcesLoader$load$1", f="NativeResourcesLoader.kt", i={0, 0, 1}, l={55, 57}, m="invokeSuspend", n={"imageProvider", "updatedNativeAdBlockTask", "imageProvider"}, s={"L$0", "L$1", "L$0"})
final class v91
extends k
implements p<q0, d<? super k0>, Object> {
    x0 b;
    int c;
    private Object d;
    final Context e;
    final j51 f;
    final u91.a g;
    final u91 h;
    final x2 i;
    final v41 j;
    final vv k;

    v91(Context context, j51 j512, u91.a a14, u91 u912, x2 x22, v41 v412, vv vv2, d<? super v91> d14) {
        this.e = context;
        this.f = j512;
        this.g = a14;
        this.h = u912;
        this.i = x22;
        this.j = v412;
        this.k = vv2;
        super(2, d14);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
        d14 = new v91(this.e, this.f, this.g, this.h, this.i, this.j, this.k, d14);
        ((v91)((Object)d14)).d = object;
        return d14;
    }

    public final Object invoke(Object object, Object object2) {
        return ((v91)((Object)this.create((q0)object, (d)object2))).invokeSuspend(k0.a);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        Object object2;
        Object object3;
        block7: {
            Object object4;
            block8: {
                block4: {
                    block5: {
                        block6: {
                            object4 = kotlin.coroutines.intrinsics.b.f();
                            int n10 = this.c;
                            if (n10 == 0) break block4;
                            if (n10 == 1) break block5;
                            if (n10 != 2) break block6;
                            object3 = (bl1)this.d;
                            v.b(object);
                            object2 = object;
                            break block7;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    object3 = this.b;
                    object2 = (bl1)this.d;
                    v.b(object);
                    object = object2;
                    break block8;
                }
                v.b(object);
                object2 = (q0)this.d;
                object = new bl1(this.e);
                object3 = kotlinx.coroutines.i.b((q0)object2, null, null, (p)new p<q0, d<? super v41>, Object>(this.h, this.i, this.e, this.j, (bl1)object, this.k, null){
                    int b;
                    private Object c;
                    final u91 d;
                    final x2 e;
                    final Context f;
                    final v41 g;
                    final bl1 h;
                    final vv i;
                    {
                        this.d = u912;
                        this.e = x22;
                        this.f = context;
                        this.g = v412;
                        this.h = bl12;
                        this.i = vv2;
                        super(2, d14);
                    }

                    @NotNull
                    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
                        d14 = new /* invalid duplicate definition of identical inner class */;
                        d14.c = object;
                        return d14;
                    }

                    public final Object invoke(Object object, Object object2) {
                        return ((Object)this.create((q0)object, (d)object2)).invokeSuspend(k0.a);
                    }

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object) {
                        Object object2;
                        block7: {
                            Throwable throwable2;
                            block6: {
                                Object object3 = kotlin.coroutines.intrinsics.b.f();
                                int n10 = this.b;
                                if (n10 != 0) {
                                    if (n10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    v.b(object);
                                    break block6;
                                }
                                v.b(object);
                                object = (q0)this.c;
                                u91 u912 = this.d;
                                x2 x22 = this.e;
                                Context context = this.f;
                                object2 = this.g;
                                object = this.h;
                                vv vv2 = this.i;
                                try {
                                    Object object4 = u.d;
                                    u912 = u91.a((u91)u912);
                                    this.b = 1;
                                    u912.getClass();
                                    m0 m02 = g1.b();
                                    object4 = new o91(x22, (p91)u912, context, (v41)object2, vv2, (ej0)object, null);
                                    object = object2 = kotlinx.coroutines.i.g((g)m02, object4, this);
                                    if (object2 != object3) break block6;
                                    return object3;
                                }
                                catch (Throwable throwable2) {}
                            }
                            object = u.b((v41)object);
                            break block7;
                            object2 = u.d;
                            object = u.b(v.a(throwable2));
                        }
                        object2 = object;
                        if (!u.g(object)) return object2;
                        return null;
                    }
                }, 3, null);
                object2 = kotlinx.coroutines.i.d((q0)object2, null, null, (p)new p<q0, d<? super k0>, Object>(this.h, this.j, null){
                    int b;
                    final u91 c;
                    final v41 d;
                    {
                        this.c = u912;
                        this.d = v412;
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
                            return k0.a;
                        } else {
                            v.b(object);
                            pa1 pa12 = u91.b((u91)this.c);
                            object = this.d;
                            this.b = 1;
                            if (pa12.a((v41)object, (d)((Object)this)) != object2) return k0.a;
                            return object2;
                        }
                    }
                }, 3, null);
                this.d = object;
                this.b = object3;
                this.c = 1;
                if (object2.C((d)((Object)this)) == object4) {
                    return object4;
                }
            }
            this.d = object;
            this.b = null;
            this.c = 2;
            object2 = object3.l((d)((Object)this));
            if (object2 == object4) {
                return object4;
            }
            object3 = object;
        }
        object = (v41)object2;
        if (object == null) {
            this.f.a(j7.d());
        } else {
            this.g.a((bl1)object3, (v41)object);
        }
        return k0.a;
    }
}


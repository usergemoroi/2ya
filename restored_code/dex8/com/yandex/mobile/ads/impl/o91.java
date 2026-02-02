/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.eb1
 *  com.yandex.mobile.ads.impl.ej0
 *  com.yandex.mobile.ads.impl.h91
 *  com.yandex.mobile.ads.impl.hc1
 *  com.yandex.mobile.ads.impl.p91
 *  com.yandex.mobile.ads.impl.v41
 *  com.yandex.mobile.ads.impl.vv
 *  com.yandex.mobile.ads.impl.x2
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 *  kotlinx.coroutines.d2
 *  kotlinx.coroutines.x0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.eb1;
import com.yandex.mobile.ads.impl.ej0;
import com.yandex.mobile.ads.impl.h91;
import com.yandex.mobile.ads.impl.hc1;
import com.yandex.mobile.ads.impl.p91;
import com.yandex.mobile.ads.impl.v41;
import com.yandex.mobile.ads.impl.vv;
import com.yandex.mobile.ads.impl.x2;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.nativeads.creator.NativeMediaLoader$loadMedia$2", f="NativeMediaLoader.kt", i={0, 0, 1}, l={42, 43, 44, 46}, m="invokeSuspend", n={"webViewLoadJob", "loadVideoTask", "loadVideoTask"}, s={"L$0", "L$1", "L$0"})
final class o91
extends k
implements p<q0, d<? super v41>, Object> {
    x0 b;
    int c;
    private Object d;
    final x2 e;
    final p91 f;
    final Context g;
    final v41 h;
    final vv i;
    final ej0 j;

    o91(x2 x22, p91 p912, Context context, v41 v412, vv vv2, ej0 ej02, d<? super o91> d14) {
        this.e = x22;
        this.f = p912;
        this.g = context;
        this.h = v412;
        this.i = vv2;
        this.j = ej02;
        super(2, d14);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
        d14 = new o91(this.e, this.f, this.g, this.h, this.i, this.j, d14);
        ((o91)((Object)d14)).d = object;
        return d14;
    }

    public final Object invoke(Object object, Object object2) {
        return ((o91)((Object)this.create((q0)object, (d)object2))).invokeSuspend(k0.a);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        Object object2;
        Object object3;
        block7: {
            void var3_7;
            block8: {
                block5: {
                    block6: {
                        object3 = kotlin.coroutines.intrinsics.b.f();
                        int n10 = this.c;
                        if (n10 == 0) break block5;
                        if (n10 == 1) break block6;
                        if (n10 != 2) {
                            if (n10 != 3) {
                                if (n10 != 4) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                v.b(object);
                                return object;
                            }
                            v.b(object);
                            return object;
                        }
                        x0 x04 = (x0)this.d;
                        v.b(object);
                        object = x04;
                        break block7;
                    }
                    x0 x05 = this.b;
                    d2 d24 = (d2)this.d;
                    v.b(object);
                    object = x05;
                    break block8;
                }
                v.b(object);
                object = (q0)this.d;
                if (!this.e.t()) {
                    Object object4;
                    eb1 eb12 = p91.b((p91)this.f);
                    Context context = this.g;
                    v41 v412 = this.h;
                    object = this.i;
                    this.c = 4;
                    object = object4 = eb12.a(false, context, v412, (vv)object, (d)((Object)this));
                    if (object4 != object3) return object;
                    return object3;
                }
                d2 d25 = kotlinx.coroutines.i.d((q0)object, null, null, (p)new p<q0, d<? super k0>, Object>(this.f, this.h, this.j, null){
                    int b;
                    final p91 c;
                    final v41 d;
                    final ej0 e;
                    {
                        this.c = p912;
                        this.d = v412;
                        this.e = ej02;
                        super(2, d14);
                    }

                    @NotNull
                    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
                        return new /* invalid duplicate definition of identical inner class */;
                    }

                    public final Object invoke(Object object, Object object2) {
                        return ((Object)this.create((q0)object, (d)object2)).invokeSuspend(k0.a);
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
                            h91 h912 = p91.a((p91)this.c);
                            v41 v412 = this.d;
                            object = this.e;
                            this.b = 1;
                            if (h912.a(v412, (ej0)object, (d)((Object)this)) != object2) return k0.a;
                            return object2;
                        }
                    }
                }, 3, null);
                d2 d26 = kotlinx.coroutines.i.d((q0)object, null, null, (p)new p<q0, d<? super k0>, Object>(this.f, this.g, this.h, null){
                    int b;
                    final p91 c;
                    final Context d;
                    final v41 e;
                    {
                        this.c = p912;
                        this.d = context;
                        this.e = v412;
                        super(2, d14);
                    }

                    @NotNull
                    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
                        return new /* invalid duplicate definition of identical inner class */;
                    }

                    public final Object invoke(Object object, Object object2) {
                        return ((Object)this.create((q0)object, (d)object2)).invokeSuspend(k0.a);
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
                            hc1 hc12 = p91.c((p91)this.c);
                            Context context = this.d;
                            object = this.e;
                            this.b = 1;
                            if (hc12.a(context, (v41)object, (d)((Object)this)) != object2) return k0.a;
                            return object2;
                        }
                    }
                }, 3, null);
                object = kotlinx.coroutines.i.b((q0)object, null, null, (p)new p<q0, d<? super v41>, Object>(this.f, this.g, this.h, this.i, null){
                    int b;
                    final p91 c;
                    final Context d;
                    final v41 e;
                    final vv f;
                    {
                        this.c = p912;
                        this.d = context;
                        this.e = v412;
                        this.f = vv2;
                        super(2, d14);
                    }

                    @NotNull
                    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
                        return new /* invalid duplicate definition of identical inner class */;
                    }

                    public final Object invoke(Object object, Object object2) {
                        return ((Object)this.create((q0)object, (d)object2)).invokeSuspend(k0.a);
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
                            eb1 eb12 = p91.b((p91)this.c);
                            Context context = this.d;
                            v41 v412 = this.e;
                            object = this.f;
                            this.b = 1;
                            object = object3 = eb12.a(true, context, v412, (vv)object, (d)((Object)this));
                            if (object3 != object2) return object;
                            return object2;
                        }
                    }
                }, 3, null);
                this.d = d26;
                this.b = object;
                this.c = 1;
                if (d25.C((d)((Object)this)) == object3) {
                    return object3;
                }
            }
            this.d = object;
            this.b = null;
            this.c = 2;
            if (var3_7.C((d)((Object)this)) == object3) {
                return object3;
            }
        }
        this.d = null;
        this.c = 3;
        object = object2 = object.l((d)((Object)this));
        if (object2 != object3) return object;
        return object3;
    }
}


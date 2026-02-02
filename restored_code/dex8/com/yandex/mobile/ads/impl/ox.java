/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.fx
 *  com.yandex.mobile.ads.impl.jx
 *  com.yandex.mobile.ads.impl.tw
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fx;
import com.yandex.mobile.ads.impl.jx;
import com.yandex.mobile.ads.impl.px;
import com.yandex.mobile.ads.impl.tw;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.u;
import kotlin.v;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.sync.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.yandex.mobile.ads.features.debugpanel.data.repo.DebugPanelRepositoryImpl$getAllData$2", f="DebugPanelRepositoryImpl.kt", i={0, 1}, l={46, 25}, m="invokeSuspend", n={"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s={"L$0", "L$0"})
final class ox
extends k
implements p<q0, d<? super tw>, Object> {
    a b;
    px c;
    px d;
    boolean e;
    int f;
    final px g;
    final boolean h;

    ox(px px2, boolean bl2, d<? super ox> d14) {
        this.g = px2;
        this.h = bl2;
        super(2, d14);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
        return new ox(this.g, this.h, d14);
    }

    public final Object invoke(Object object, Object object2) {
        object = (q0)object;
        object = (d)object2;
        return new ox(this.g, this.h, (d<? super ox>)object).invokeSuspend(k0.a);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        void var1_4;
        Object object2;
        block15: {
            Object object3;
            Object object4;
            block14: {
                Object object5;
                Object object6;
                block13: {
                    boolean bl2;
                    object6 = kotlin.coroutines.intrinsics.b.f();
                    int n10 = this.f;
                    if (n10 != 0) {
                        if (n10 != 1) {
                            if (n10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            object6 = this.d;
                            object5 = this.c;
                            object2 = object4 = this.b;
                            v.b(object);
                            object2 = object4;
                            object3 = ((u)object).j();
                            object = object5;
                            break block13;
                        }
                        bl2 = this.e;
                        object4 = this.c;
                        object2 = this.b;
                        v.b(object);
                        object = object4;
                    } else {
                        v.b(object);
                        object4 = px.d(this.g);
                        object = this.g;
                        bl2 = this.h;
                        this.b = object4;
                        this.c = object;
                        this.e = bl2;
                        this.f = 1;
                        object2 = object4;
                        if (object4.d(null, (d<? super k0>)((Object)this)) == object6) {
                            return object6;
                        }
                    }
                    if (px.b((px)object) != null && !bl2) {
                        object4 = object2;
                        break block14;
                    }
                    object4 = px.e((px)object);
                    this.b = object2;
                    this.c = object;
                    this.d = object;
                    this.f = 2;
                    object3 = object4.a((d)((Object)this));
                    if (object3 == object6) {
                        return object6;
                    }
                    object6 = object;
                    object4 = object2;
                }
                object2 = object4;
                object5 = object3;
                try {
                    if (u.g(object3)) {
                        object5 = null;
                    }
                    object2 = object4;
                    px.a((px)object6, (jx)object5);
                }
                catch (Throwable throwable) {
                    break block15;
                }
            }
            object2 = object4;
            object3 = px.c((px)object).a();
            object2 = object4;
            object = px.a((px)object).a((fx)object3, px.b((px)object));
            object4.e(null);
            return object;
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        object2.e(null);
        throw var1_4;
    }
}


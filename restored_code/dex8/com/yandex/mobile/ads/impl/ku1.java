/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.lu1
 *  com.yandex.mobile.ads.impl.mu1
 *  com.yandex.mobile.ads.impl.nk
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.ps
 *  com.yandex.mobile.ads.impl.rv1
 *  com.yandex.mobile.ads.impl.sq0
 *  com.yandex.mobile.ads.impl.tk0
 *  com.yandex.mobile.ads.impl.uv1
 *  com.yandex.mobile.ads.impl.v52
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.functions.p
 *  kotlinx.coroutines.selects.k
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lu1;
import com.yandex.mobile.ads.impl.mu1;
import com.yandex.mobile.ads.impl.nk;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.ps;
import com.yandex.mobile.ads.impl.rv1;
import com.yandex.mobile.ads.impl.sq0;
import com.yandex.mobile.ads.impl.tk0;
import com.yandex.mobile.ads.impl.uv1;
import com.yandex.mobile.ads.impl.v52;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.r;
import kotlin.v;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.selects.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.base.bidder.SdkBidderTokenLoader$loadBidderToken$1", f="SdkBidderTokenLoader.kt", i={0, 0}, l={109, 78, 83}, m="invokeSuspend", n={"this_$iv", "phase$iv"}, s={"L$0", "L$1"})
final class ku1
extends kotlin.coroutines.jvm.internal.k
implements p<q0, d<? super k0>, Object> {
    o4 b;
    lu1 c;
    nk d;
    int e;
    private Object f;
    final lu1 g;
    final nk h;
    final ps i;

    ku1(lu1 lu12, nk nk2, ps ps3, d<? super ku1> d14) {
        this.g = lu12;
        this.h = nk2;
        this.i = ps3;
        super(2, d14);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
        d14 = new ku1(this.g, this.h, this.i, d14);
        ((ku1)((Object)d14)).f = object;
        return d14;
    }

    public final Object invoke(Object object, Object object2) {
        return ((ku1)((Object)this.create((q0)object, (d)object2))).invokeSuspend(k0.a);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        block8: {
            Object object2;
            p4 p42;
            Object object3;
            lu1 lu12;
            nk nk2;
            Object object4;
            block9: {
                block6: {
                    block7: {
                        object4 = kotlin.coroutines.intrinsics.b.f();
                        int n10 = this.e;
                        if (n10 == 0) break block6;
                        if (n10 == 1) break block7;
                        if (n10 != 2 && n10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v.b(object);
                        break block8;
                    }
                    nk2 = this.d;
                    lu12 = this.c;
                    object3 = this.b;
                    p42 = (p4)this.f;
                    v.b(object);
                    object2 = object;
                    object = p42;
                    break block9;
                }
                v.b(object);
                object2 = (q0)this.f;
                lu1.h((lu1)this.g).b(sq0.b, (Object)this.g);
                object = lu1.a((lu1)this.g);
                object3 = o4.x;
                lu12 = this.g;
                nk2 = this.h;
                object.a(object3, null);
                p42 = new k(this.getContext());
                p42.a(kotlinx.coroutines.i.d((q0)object2, null, null, (p)new p<q0, d<? super k0>, Object>(null){
                    int b;

                    @NotNull
                    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
                        return new /* invalid duplicate definition of identical inner class */;
                    }

                    public final Object invoke(Object object, Object object2) {
                        object = (q0)object;
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
                            this.b = 1;
                            if (a1.b(2000L, (d<? super k0>)((Object)this)) != object2) return k0.a;
                            return object2;
                        }
                    }
                }, 3, null).r(), (l)new l<d<? super mu1>, Object>(null){

                    @NotNull
                    public final d<k0> create(@NotNull d<?> d14) {
                        return new /* invalid duplicate definition of identical inner class */;
                    }

                    public final Object invoke(Object object) {
                        new /* invalid duplicate definition of identical inner class */;
                        object = k0.a;
                        kotlin.coroutines.intrinsics.b.f();
                        v.b(object);
                        return mu1.d;
                    }

                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object) {
                        kotlin.coroutines.intrinsics.b.f();
                        v.b(object);
                        return mu1.d;
                    }
                });
                p42.g(kotlinx.coroutines.i.b((q0)object2, null, null, (p)new p<q0, d<? super mu1>, Object>(lu12, null){
                    int b;
                    final lu1 c;
                    {
                        this.c = lu12;
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
                        } else {
                            Object object3;
                            v.b(object);
                            uv1 uv12 = lu1.g((lu1)this.c);
                            object = tk0.f;
                            this.b = 1;
                            object = object3 = uv12.a((tk0)object, (d)((Object)this));
                            if (object3 == object2) {
                                return object2;
                            }
                        }
                        object = (rv1)object;
                        if (object instanceof rv1.b) {
                            return null;
                        }
                        if (!(object instanceof rv1.a)) throw new r();
                        return mu1.c;
                    }
                }, 3, null).A(), (p)new p<mu1, d<? super mu1>, Object>(null){
                    Object b;

                    @NotNull
                    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
                        d14 = new /* invalid duplicate definition of identical inner class */;
                        d14.b = object;
                        return d14;
                    }

                    public final Object invoke(Object object, Object object2) {
                        object = (mu1)object;
                        object2 = new /* invalid duplicate definition of identical inner class */;
                        object2.b = object;
                        return object2.invokeSuspend(k0.a);
                    }

                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object) {
                        kotlin.coroutines.intrinsics.b.f();
                        v.b(object);
                        return (mu1)this.b;
                    }
                });
                this.f = object;
                this.b = object3;
                this.c = lu12;
                this.d = nk2;
                this.e = 1;
                object2 = p42.o((d)((Object)this));
                if (object2 == object4) {
                    return object4;
                }
            }
            p42 = (mu1)object2;
            nk2 = new v52(lu1.d((lu1)lu12).a(lu1.c((lu1)lu12), lu1.b((lu1)lu12), lu1.e((lu1)lu12).c(), nk2, (mu1)p42), (mu1)p42);
            object.a(object3);
            if (nk2.a() != null) {
                lu1.f((lu1)this.g).a(this.h, nk2.b());
                object = g1.c().H();
                object3 = new p<q0, d<? super k0>, Object>(this.i, (v52)nk2, null){
                    final ps b;
                    final v52 c;
                    {
                        this.b = ps3;
                        this.c = v522;
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

                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object) {
                        kotlin.coroutines.intrinsics.b.f();
                        v.b(object);
                        this.b.onBidderTokenLoaded(this.c.a());
                        return k0.a;
                    }
                };
                this.f = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = 2;
                if (kotlinx.coroutines.i.g((g)object, object3, this) == object4) {
                    return object4;
                }
            } else {
                lu1.f((lu1)this.g).a(this.h);
                object = g1.c().H();
                object3 = new p<q0, d<? super k0>, Object>(this.i, null){
                    final ps b;
                    {
                        this.b = ps3;
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

                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object) {
                        kotlin.coroutines.intrinsics.b.f();
                        v.b(object);
                        this.b.a();
                        return k0.a;
                    }
                };
                this.f = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = 3;
                if (kotlinx.coroutines.i.g((g)object, object3, this) == object4) {
                    return object4;
                }
            }
        }
        lu1.h((lu1)this.g).a(sq0.b, (Object)this.g);
        return k0.a;
    }
}


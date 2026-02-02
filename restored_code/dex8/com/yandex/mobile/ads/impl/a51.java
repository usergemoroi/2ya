/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.i41
 *  com.yandex.mobile.ads.impl.kc2
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.z41
 *  com.yandex.mobile.ads.impl.zw0
 *  kotlin.collections.t
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.i41;
import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.z41;
import com.yandex.mobile.ads.impl.zw0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.f;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.nativeads.creator.videowrapper.NativeAdBlockVideoWrapperLoader$updateNativeAdsWithWrappers$2", f="NativeAdBlockVideoWrapperLoader.kt", i={0, 0, 0}, l={47}, m="invokeSuspend", n={"$this$withContext", "destination$iv$iv", "native"}, s={"L$0", "L$2", "L$4"})
final class a51
extends k
implements p<q0, d<? super List<? extends i41>>, Object> {
    z41 b;
    Collection c;
    Iterator d;
    i41 e;
    Collection f;
    int g;
    private Object h;
    final List<i41> i;
    final z41 j;

    a51(List<i41> list, z41 z412, d<? super a51> d10) {
        this.i = list;
        this.j = z412;
        super(2, d10);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d10) {
        d10 = new a51(this.i, this.j, d10);
        ((a51)((Object)d10)).h = object;
        return d10;
    }

    public final Object invoke(Object object, Object object2) {
        return ((a51)((Object)this.create((q0)object, (d)object2))).invokeSuspend(k0.a);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Nullable
    public final Object invokeSuspend(@NotNull Object var1_1) {
        block9: {
            block10: {
                var10_2 = kotlin.coroutines.intrinsics.b.f();
                var2_3 = this.g;
                if (var2_3 == 0) break block9;
                if (var2_3 != 1) break block10;
                var9_4 = this.f;
                var7_5 = this.e;
                var5_6 = this.d;
                var4_7 /* !! */  = this.c;
                var6_8 = this.b;
                var3_9 = (q0)this.h;
                v.b(var1_1);
                var8_10 = var1_1;
                var1_1 = var9_4;

            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v.b(var1_1);
        var3_9 = (q0)this.h;
        var5_6 = this.i;
        var4_7 /* !! */  = this.j;
        var1_1 = new ArrayList(t.x((Iterable)var5_6, (int)10));
        var5_6 = var5_6.iterator();
        while (var5_6.hasNext()) {
            var8_10 = (i41)var5_6.next();
            var7_5 = var8_10.c();
            var6_8 = new ArrayList<E>(t.x((Iterable)var7_5, (int)10));
            var11_11 = var7_5.iterator();
            while (var11_11.hasNext()) {
                var9_4 = (vf)var11_11.next();
                z41.a((z41)var4_7 /* !! */ ).getClass();
                if (var9_4.d() instanceof zw0) {
                    y.h(var9_4, "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<R of com.monetization.ads.network.model.AssetKt.castGeneric>");
                    var7_5 = var9_4;
                } else {
                    var7_5 = null;
                }
                if (var7_5 != null && (var7_5 = (zw0)var7_5.d()) != null && (var7_5 = var7_5.c()) != null && (var7_5 = var7_5.c()) != null && !var7_5.isEmpty()) {
                    var7_5 = var7_5.iterator();
                    while (var7_5.hasNext()) {
                        if (!((kc2)var7_5.next()).h().o()) continue;
                        var7_5 = kotlinx.coroutines.i.b(var3_9, null, null, (p)new p<q0, d<? super vf<?>>, Object>(var4_7 /* !! */ , var9_4, null){
                            int b;
                            final z41 c;
                            final vf<?> d;
                            {
                                this.c = z412;
                                this.d = vf3;
                                super(2, d10);
                            }

                            @NotNull
                            public final d<k0> create(@Nullable Object object, @NotNull d<?> d10) {
                                return new /* invalid duplicate definition of identical inner class */;
                            }

                            public final Object invoke(Object object, Object object2) {
                                object = (q0)object;
                                object = (d)object2;
                                return new /* invalid duplicate definition of identical inner class */.invokeSuspend(k0.a);
                            }

                            /*
                             * WARNING - void declaration
                             * Enabled force condition propagation
                             * Lifted jumps to return sites
                             */
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object object) {
                                void var1_4;
                                Object object2 = kotlin.coroutines.intrinsics.b.f();
                                int n10 = this.b;
                                if (n10 != 0) {
                                    if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    v.b(object);
                                    return var1_4;
                                } else {
                                    Object object3;
                                    v.b(object);
                                    z41 z412 = this.c;
                                    vf<?> vf3 = this.d;
                                    this.b = 1;
                                    Object object4 = object3 = z41.a((z41)z412, vf3, (d)((Object)this));
                                    if (object3 != object2) return var1_4;
                                    return object2;
                                }
                            }
                        }, 3, null);
                        break;
                    }
                } else {
                    var7_5 = z.a(var9_4);
                }
                var6_8.add(var7_5);
            }
            this.h = var3_9;
            this.b = var4_7 /* !! */ ;
            this.c = var1_1;
            this.d = var5_6;
            this.e = var8_10;
            this.f = var1_1;
            this.g = 1;
            var9_4 = kotlinx.coroutines.f.a(var6_8, this);
            if (var9_4 == var10_2) {
                return var10_2;
            }
            var7_5 = var8_10;
            var8_10 = var1_1;
            var6_8 = var4_7 /* !! */ ;
            var4_7 /* !! */  = var8_10;
            var8_10 = var9_4;
lbl63:

            var8_10 = (List)var8_10;
            var9_4 = t.o0((Iterable)var8_10);
            if (var8_10.size() != var9_4.size()) {
                return null;
            }
            var1_1.add(i41.a((i41)var7_5, (List)var9_4));
            var1_1 = var4_7 /* !! */ ;
            var4_7 /* !! */  = var6_8;
        }
        return (List)var1_1;
    }
}


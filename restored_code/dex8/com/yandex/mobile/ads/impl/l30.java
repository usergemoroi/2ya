/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.k30
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k30;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.base.dns.DnsPrefetcher$prefetchUrlList$2", f="DnsPrefetcher.kt", i={}, l={}, m="invokeSuspend", n={}, s={})
final class l30
extends k
implements p<q0, d<? super k0>, Object> {
    private Object b;
    final List<String> c;
    final k30 d;

    l30(k30 k302, List list, d d14) {
        this.c = list;
        this.d = k302;
        super(2, d14);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
        List<String> list = this.c;
        d14 = new l30(this.d, list, d14);
        ((l30)((Object)d14)).b = object;
        return d14;
    }

    public final Object invoke(Object object, Object object2) {
        return ((l30)((Object)this.create((q0)object, (d)object2))).invokeSuspend(k0.a);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        kotlin.coroutines.intrinsics.b.f();
        v.b(object);
        object = (q0)this.b;
        Object object2 = this.c;
        k30 k302 = this.d;
        object2 = object2.iterator();
        while (object2.hasNext()) {
            i.d((q0)object, null, null, (p)new p<q0, d<? super k0>, Object>(k302, (String)object2.next(), null){
                final k30 b;
                final String c;
                {
                    this.b = k302;
                    this.c = string2;
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
                    k30.a((k30)this.b, (String)this.c);
                    return k0.a;
                }
            }, 3, null);
        }
        return k0.a;
    }
}


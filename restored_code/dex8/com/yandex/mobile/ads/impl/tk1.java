/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.jk1
 *  kotlin.collections.t
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 *  kotlinx.coroutines.x0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jk1;
import java.util.List;
import kotlin.collections.t;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.f;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader$loadNetworksMediationDataInternal$prefetchedMediationAdapterInfos$1", f="PrefetchedMediationNetworksDataLoader.kt", i={}, l={79}, m="invokeSuspend", n={}, s={})
final class tk1
extends k
implements p<q0, d<? super List<? extends jk1>>, Object> {
    int b;
    final List<x0<jk1>> c;

    tk1(List<? extends x0<jk1>> list, d<? super tk1> d14) {
        this.c = list;
        super(2, d14);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
        return new tk1(this.c, d14);
    }

    public final Object invoke(Object object, Object object2) {
        object = (q0)object;
        object = (d)object2;
        return new tk1(this.c, (d<? super tk1>)object).invokeSuspend(k0.a);
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
            return t.o0((Iterable)((Iterable)object));
        } else {
            Object object3;
            v.b(object);
            object = this.c;
            this.b = 1;
            object = object3 = f.a(object, this);
            if (object3 != object2) return t.o0((Iterable)((Iterable)object));
            return object2;
        }
    }
}


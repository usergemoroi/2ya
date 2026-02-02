/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ej0
 *  com.yandex.mobile.ads.impl.l51
 *  com.yandex.mobile.ads.impl.l51$a
 *  com.yandex.mobile.ads.impl.v41
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ej0;
import com.yandex.mobile.ads.impl.l51;
import com.yandex.mobile.ads.impl.v41;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.nativeads.creator.NativeAdCreationManager$NativeAdCreationRunnable$ResourcesLoaderListener$onLoaded$1", f="NativeAdCreationManager.kt", i={}, l={}, m="invokeSuspend", n={}, s={})
final class k51
extends k
implements p<q0, d<? super k0>, Object> {
    final l51 b;
    final v41 c;
    final ej0 d;
    final l51.a e;
    final l51.a.a f;

    k51(l51 l512, v41 v412, ej0 ej02, l51.a a13, l51.a.a a14, d<? super k51> d14) {
        this.b = l512;
        this.c = v412;
        this.d = ej02;
        this.e = a13;
        this.f = a14;
        super(2, d14);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
        return new k51(this.b, this.c, this.d, this.e, this.f, d14);
    }

    public final Object invoke(Object object, Object object2) {
        return ((k51)((Object)this.create((q0)object, (d)object2))).invokeSuspend(k0.a);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        kotlin.coroutines.intrinsics.b.f();
        v.b(object);
        l51.e((l51)this.b).a(l51.c((l51)this.b), this.c, this.d, l51.a.a((l51.a)this.e), l51.a.a.a(this.f));
        return k0.a;
    }
}


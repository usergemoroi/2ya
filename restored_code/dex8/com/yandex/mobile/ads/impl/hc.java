/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ic
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ic;
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

@DebugMetadata(c="com.monetization.ads.core.identifiers.ad.AdvertisingInfoHolderLoader$_advertisingInfo$1", f="AdvertisingInfoHolderLoader.kt", i={}, l={22}, m="invokeSuspend", n={}, s={})
final class hc
extends k
implements p<q0, d<Object>, Object> {
    int b;
    final ic c;

    hc(ic ic3, d<? super hc> d10) {
        this.c = ic3;
        super(2, d10);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d10) {
        return new hc(this.c, d10);
    }

    public final Object invoke(Object object, Object object2) {
        object = (q0)object;
        object = (d)object2;
        return new hc(this.c, (d<? super hc>)object).invokeSuspend(k0.a);
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
            object = ic.a((ic)this.c);
            this.b = 1;
            object = object3 = object.a((d)((Object)this));
            if (object3 != object2) return object;
            return object2;
        }
    }
}


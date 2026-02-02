/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.id1
 *  com.yandex.mobile.ads.impl.iz1
 *  com.yandex.mobile.ads.impl.kz0
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 *  org.json.JSONArray
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.id1;
import com.yandex.mobile.ads.impl.iz1;
import com.yandex.mobile.ads.impl.kz0;
import java.util.List;
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
import org.json.JSONArray;

@DebugMetadata(c="com.monetization.ads.base.mediation.bidding.NetworksHeaderBiddingDataLoader$loadNetworksBiddingData$2", f="NetworksHeaderBiddingDataLoader.kt", i={}, l={32}, m="invokeSuspend", n={}, s={})
final class hd1
extends k
implements p<q0, d<? super JSONArray>, Object> {
    int b;
    final id1 c;
    final Context d;
    final iz1 e;
    final List<kz0> f;

    hd1(id1 id12, Context context, iz1 iz12, List<kz0> list, d<? super hd1> d10) {
        this.c = id12;
        this.d = context;
        this.e = iz12;
        this.f = list;
        super(2, d10);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d10) {
        return new hd1(this.c, this.d, this.e, this.f, d10);
    }

    public final Object invoke(Object object, Object object2) {
        return ((hd1)((Object)this.create((q0)object, (d)object2))).invokeSuspend(k0.a);
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
            v.b(object);
            object = this.c;
            Context context = this.d;
            iz1 iz12 = this.e;
            Object object3 = this.f;
            this.b = 1;
            object = object3 = id1.a((id1)object, (Context)context, (iz1)iz12, object3, (d)((Object)this));
            if (object3 != object2) return object;
            return object2;
        }
    }
}


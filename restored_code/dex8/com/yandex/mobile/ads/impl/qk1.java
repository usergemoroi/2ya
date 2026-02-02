/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.g01
 *  com.yandex.mobile.ads.impl.hk1
 *  com.yandex.mobile.ads.impl.is
 *  com.yandex.mobile.ads.impl.iz1
 *  com.yandex.mobile.ads.impl.uk1
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.g01;
import com.yandex.mobile.ads.impl.hk1;
import com.yandex.mobile.ads.impl.is;
import com.yandex.mobile.ads.impl.iz1;
import com.yandex.mobile.ads.impl.uk1;
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

@DebugMetadata(c="com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader$loadNetworksMediationData$2", f="PrefetchedMediationNetworksDataLoader.kt", i={}, l={51}, m="invokeSuspend", n={}, s={})
final class qk1
extends k
implements p<q0, d<? super hk1>, Object> {
    int b;
    final uk1 c;
    final Context d;
    final String e;
    final is f;
    final iz1 g;
    final List<g01> h;
    final long i;

    qk1(long l10, Context context, is is3, iz1 iz12, uk1 uk12, String string2, List list, d d14) {
        this.c = uk12;
        this.d = context;
        this.e = string2;
        this.f = is3;
        this.g = iz12;
        this.h = list;
        this.i = l10;
        super(2, d14);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
        uk1 uk12 = this.c;
        object = this.d;
        String string2 = this.e;
        is is3 = this.f;
        iz1 iz12 = this.g;
        List<g01> list = this.h;
        return new qk1(this.i, (Context)object, is3, iz12, uk12, string2, list, d14);
    }

    public final Object invoke(Object object, Object object2) {
        return ((qk1)((Object)this.create((q0)object, (d)object2))).invokeSuspend(k0.a);
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
            uk1 uk12 = this.c;
            Context context = this.d;
            String string2 = this.e;
            is is3 = this.f;
            iz1 iz12 = this.g;
            List<g01> list = this.h;
            long l10 = this.i;
            this.b = 1;
            Object object4 = object3 = uk1.a((long)l10, (Context)context, (is)is3, (iz1)iz12, (uk1)uk12, (String)string2, list, (d)((Object)this));
            if (object3 != object2) return var1_4;
            return object2;
        }
    }
}


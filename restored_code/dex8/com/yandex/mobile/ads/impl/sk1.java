/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.g01
 *  com.yandex.mobile.ads.impl.is
 *  com.yandex.mobile.ads.impl.iz1
 *  com.yandex.mobile.ads.impl.jk1
 *  com.yandex.mobile.ads.impl.uk1
 *  kotlin.collections.t
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.p
 *  kotlinx.coroutines.x0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.g01;
import com.yandex.mobile.ads.impl.is;
import com.yandex.mobile.ads.impl.iz1;
import com.yandex.mobile.ads.impl.jk1;
import com.yandex.mobile.ads.impl.pk1;
import com.yandex.mobile.ads.impl.uk1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.t;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader$loadNetworksMediationDataInternal$asyncAdaptersResults$1", f="PrefetchedMediationNetworksDataLoader.kt", i={}, l={}, m="invokeSuspend", n={}, s={})
final class sk1
extends k
implements p<q0, d<? super List<? extends x0<? extends jk1>>>, Object> {
    private Object b;
    final List<g01> c;
    final uk1 d;
    final Context e;
    final String f;
    final is g;
    final iz1 h;
    final long i;

    sk1(long l10, Context context, is is3, iz1 iz12, uk1 uk12, String string2, List list, d d14) {
        this.c = list;
        this.d = uk12;
        this.e = context;
        this.f = string2;
        this.g = is3;
        this.h = iz12;
        this.i = l10;
        super(2, d14);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
        List<g01> list = this.c;
        uk1 uk12 = this.d;
        Context context = this.e;
        String string2 = this.f;
        is is3 = this.g;
        iz1 iz12 = this.h;
        d14 = new sk1(this.i, context, is3, iz12, uk12, string2, list, d14);
        ((sk1)((Object)d14)).b = object;
        return d14;
    }

    public final Object invoke(Object object, Object object2) {
        return ((sk1)((Object)this.create((q0)object, (d)object2))).invokeSuspend(k0.a);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        kotlin.coroutines.intrinsics.b.f();
        v.b(object);
        q0 q02 = (q0)this.b;
        Object object2 = this.c;
        uk1 uk12 = this.d;
        Context context = this.e;
        String string2 = this.f;
        object = this.g;
        iz1 iz12 = this.h;
        long l10 = this.i;
        ArrayList<x0> arrayList = new ArrayList<x0>(t.x(object2, (int)10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            g01 g012 = (g01)object2.next();
            uk12.getClass();
            arrayList.add(kotlinx.coroutines.i.b(q02, null, null, new pk1(uk12, g012, context, string2, (is)object, l10, iz12, null), 3, null));
        }
        return arrayList;
    }
}


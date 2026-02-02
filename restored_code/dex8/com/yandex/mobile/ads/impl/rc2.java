/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cc
 *  com.yandex.mobile.ads.impl.dc2
 *  com.yandex.mobile.ads.impl.h50
 *  com.yandex.mobile.ads.impl.rv1
 *  com.yandex.mobile.ads.impl.tk0
 *  com.yandex.mobile.ads.impl.wc2
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.functions.p
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cc;
import com.yandex.mobile.ads.impl.dc2;
import com.yandex.mobile.ads.impl.h50;
import com.yandex.mobile.ads.impl.rv1;
import com.yandex.mobile.ads.impl.tk0;
import com.yandex.mobile.ads.impl.wc2;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.video.core.VideoAdLoaderController$initSdk$1", f="VideoAdLoaderController.kt", i={}, l={100}, m="invokeSuspend", n={}, s={})
final class rc2
extends k
implements p<q0, d<? super k0>, Object> {
    int b;
    final wc2 c;
    final Object d;
    final a<k0> e;
    final l<dc2, k0> f;

    rc2(wc2 wc22, Object object, a<k0> a14, l<? super dc2, k0> l10, d<? super rc2> d14) {
        this.c = wc22;
        this.d = object;
        this.e = a14;
        this.f = l10;
        super(2, d14);
    }

    @NotNull
    public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
        return new rc2(this.c, this.d, this.e, this.f, d14);
    }

    public final Object invoke(Object object, Object object2) {
        return ((rc2)((Object)this.create((q0)object, (d)object2))).invokeSuspend(k0.a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        Object object2;
        Object object3 = kotlin.coroutines.intrinsics.b.f();
        int n10 = this.b;
        if (n10 != 0) {
            if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            v.b(object);
        } else {
            v.b(object);
            object2 = wc2.e((wc2)this.c);
            object = tk0.e;
            this.b = 1;
            object = object2 = object2.a((tk0)object, (d)((Object)this));
            if (object2 == object3) {
                return object3;
            }
        }
        object2 = (rv1)object;
        if (object2 instanceof rv1.b) {
            object = this.c;
            object2 = (rv1.b)object2;
            wc2.a((wc2)object, (cc)((rv1.b)object2).a(), (h50)((rv1.b)object2).b());
            wc2.d((wc2)this.c).add(this.d);
            this.e.invoke();
            return k0.a;
        } else {
            if (!(object2 instanceof rv1.a)) return k0.a;
            object = wc2.g((wc2)this.c);
            object2 = ((rv1.a)object2).a();
            object.getClass();
            object = object2.d() != null ? object2.c() : "Internal error occured while loading ads.";
            object = new dc2(object2.b(), (String)object);
            this.f.invoke(object);
        }
        return k0.a;
    }
}


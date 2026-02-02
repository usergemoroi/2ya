/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.fa0
 *  com.yandex.mobile.ads.impl.y90
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.k
 *  kotlin.jvm.functions.q
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fa0;
import com.yandex.mobile.ads.impl.h90;
import com.yandex.mobile.ads.impl.y90;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.q;
import kotlin.k0;
import kotlin.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.feed.domain.FeedItemListUseCase$feedStateStateFlow$1", f="FeedItemListUseCase.kt", i={}, l={}, m="invokeSuspend", n={}, s={})
final class m90
extends k
implements q<y90, List<? extends h90>, d<? super fa0>, Object> {
    y90 b;
    List c;

    m90(d<? super m90> d14) {
        super(3, d14);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (y90)object;
        object2 = (List)object2;
        object3 = new m90((d)object3);
        ((m90)((Object)object3)).b = object;
        ((m90)((Object)object3)).c = object2;
        return ((m90)((Object)object3)).invokeSuspend(k0.a);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        kotlin.coroutines.intrinsics.b.f();
        v.b(object);
        return new fa0(this.b, this.c);
    }
}


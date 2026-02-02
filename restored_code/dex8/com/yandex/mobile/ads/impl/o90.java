/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.n90
 *  kotlin.coroutines.jvm.internal.d
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n90;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.feed.domain.FeedItemListUseCase", f="FeedItemListUseCase.kt", i={0}, l={56}, m="loadMore", n={"this"}, s={"L$0"})
final class o90
extends d {
    n90 b;
    Object c;
    final n90 d;
    int e;

    o90(n90 n902, kotlin.coroutines.d<? super o90> d14) {
        this.d = n902;
        super(d14);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        this.c = object;
        this.e |= Integer.MIN_VALUE;
        return n90.a((n90)this.d, (kotlin.coroutines.d)((Object)this));
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.z41
 *  kotlin.coroutines.jvm.internal.d
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.z41;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.nativeads.creator.videowrapper.NativeAdBlockVideoWrapperLoader", f="NativeAdBlockVideoWrapperLoader.kt", i={0}, l={56}, m="loadVideoWrapperAsset", n={"castedAsset"}, s={"L$0"})
final class y41
extends d {
    vf b;
    Object c;
    final z41 d;
    int e;

    y41(z41 z412, kotlin.coroutines.d<? super y41> d14) {
        this.d = z412;
        super(d14);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        this.c = object;
        this.e |= Integer.MIN_VALUE;
        return z41.a((z41)this.d, null, (kotlin.coroutines.d)((Object)this));
    }
}


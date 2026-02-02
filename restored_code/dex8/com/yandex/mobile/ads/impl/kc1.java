/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.mc1
 *  kotlin.coroutines.jvm.internal.d
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.mc1;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c="com.monetization.ads.nativeads.creator.videowrapper.NativeWrapperVideoLoader", f="NativeWrapperVideoLoader.kt", i={0}, l={62}, m="loadWrapperVideoAdsInfo", n={"this"}, s={"L$0"})
final class kc1
extends d {
    mc1 b;
    Object c;
    final mc1 d;
    int e;

    kc1(mc1 mc12, kotlin.coroutines.d<? super kc1> d14) {
        this.d = mc12;
        super(d14);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object object) {
        this.c = object;
        this.e |= Integer.MIN_VALUE;
        return mc1.a((mc1)this.d, null, (kotlin.coroutines.d)((Object)this));
    }
}


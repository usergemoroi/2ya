/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.TextureView
 *  com.yandex.mobile.ads.impl.bc0
 *  com.yandex.mobile.ads.impl.jd2
 *  com.yandex.mobile.ads.impl.jg2
 */
package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.jb1;
import com.yandex.mobile.ads.impl.jd2;
import com.yandex.mobile.ads.impl.jg2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface sa1
extends bc0 {
    public void a();

    public void a(@Nullable TextureView var1);

    public void a(@NotNull jb1 var1, @Nullable jb1 var2);

    public void a(@Nullable jd2 var1);

    public void a(@Nullable jg2 var1);

    public long b();

    public void c();

    public void e();

    public boolean f();

    public long getAdPosition();

    public float getVolume();

    public boolean isPlayingAd();

    public void pauseAd();

    public void resumeAd();

    public void setVolume(float var1);
}


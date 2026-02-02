/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.util.LruCache
 *  com.yandex.mobile.ads.impl.fd1$c
 *  com.yandex.mobile.ads.impl.gd1
 *  com.yandex.mobile.ads.impl.si0
 */
package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.yandex.mobile.ads.impl.fd1;
import com.yandex.mobile.ads.impl.gd1;
import com.yandex.mobile.ads.impl.si0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class v82
implements fd1.c {
    @NotNull
    private final LruCache<String, Bitmap> a;
    @NotNull
    private final si0 b;

    public v82(@NotNull gd1 gd12, @NotNull si0 si02) {
        this.a = gd12;
        this.b = si02;
    }

    @Nullable
    public final Bitmap a(@NotNull String string2) {
        this.b.getClass();
        string2 = si0.a((String)string2);
        return (Bitmap)this.a.get((Object)string2);
    }

    public final void a(@NotNull String string2, @NotNull Bitmap bitmap) {
        this.b.getClass();
        string2 = si0.a((String)string2);
        this.a.put((Object)string2, (Object)bitmap);
    }
}


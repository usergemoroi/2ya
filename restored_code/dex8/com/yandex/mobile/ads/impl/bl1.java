/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  com.yandex.mobile.ads.impl.ej0
 *  com.yandex.mobile.ads.impl.jj0
 *  com.yandex.mobile.ads.impl.nm
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.ej0;
import com.yandex.mobile.ads.impl.jj0;
import com.yandex.mobile.ads.impl.nm;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class bl1
implements ej0 {
    @NotNull
    private final nm a;
    @NotNull
    private final LinkedHashMap b;
    @NotNull
    private final LinkedHashMap c;

    public /* synthetic */ bl1(Context context) {
        this(new nm(context, 0));
    }

    public bl1(@NotNull nm nm3) {
        this.a = nm3;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
    }

    @Nullable
    public final Bitmap a(@NotNull jj0 object) {
        String string2 = object.c();
        Bitmap bitmap = null;
        object = string2 != null ? new /* Unavailable Anonymous Inner Class!! */ : null;
        if (object != null) {
            bitmap = (Bitmap)this.c.get(object);
        }
        return bitmap;
    }

    public final void a(@NotNull Bitmap bitmap, @NotNull jj0 object) {
        String string2 = object.c();
        if ((object = string2 != null ? new /* Unavailable Anonymous Inner Class!! */ : null) != null) {
            this.c.put(object, bitmap);
        }
    }

    public final void a(@NotNull String string2, @NotNull Bitmap bitmap) {
        this.b.put(string2, bitmap);
    }

    public final void a(@NotNull Map<String, Bitmap> map2) {
        this.b.putAll(map2);
    }

    @Nullable
    public final Bitmap b(@NotNull jj0 jj02) {
        Bitmap bitmap;
        String string2 = jj02.f();
        Bitmap bitmap2 = bitmap = (Bitmap)this.b.get(string2);
        if (bitmap == null) {
            bitmap2 = this.a.a(jj02);
            if (bitmap2 != null) {
                this.b.put(string2, bitmap2);
            } else {
                bitmap2 = null;
            }
        }
        return bitmap2;
    }
}


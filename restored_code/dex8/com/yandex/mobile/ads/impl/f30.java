/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  com.yandex.div.core.font.DivTypefaceProvider
 *  com.yandex.mobile.ads.impl.xb0
 *  com.yandex.mobile.ads.impl.yb0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.mobile.ads.impl.xb0;
import com.yandex.mobile.ads.impl.yb0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class f30
implements DivTypefaceProvider {
    @NotNull
    private final Context a;

    public f30(@NotNull Context context) {
        this.a = context;
    }

    @Nullable
    public final Typeface getBold() {
        xb0 xb02;
        block3: {
            block2: {
                xb02 = yb0.a((Context)this.a);
                if (xb02 == null) break block2;
                Typeface typeface = xb02.a();
                xb02 = typeface;
                if (typeface != null) break block3;
            }
            xb02 = Typeface.DEFAULT_BOLD;
        }
        return xb02;
    }

    @Nullable
    public final Typeface getLight() {
        Object object = yb0.a((Context)this.a);
        object = object != null ? object.b() : null;
        return object;
    }

    @Nullable
    public final Typeface getMedium() {
        Object object = yb0.a((Context)this.a);
        object = object != null ? object.c() : null;
        return object;
    }

    @Nullable
    public final Typeface getRegular() {
        Object object = yb0.a((Context)this.a);
        object = object != null ? object.d() : null;
        return object;
    }
}


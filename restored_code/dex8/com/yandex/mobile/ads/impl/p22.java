/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.FloatRange
 *  androidx.annotation.IntRange
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.vl$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.on1;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.v13;
import com.yandex.mobile.ads.impl.vl;
import java.util.Arrays;

public final class p22
extends on1 {
    public static final vl.a<p22> e = new v13();
    @IntRange(from=1L)
    private final int c;
    private final float d;

    public p22(@IntRange(from=1L) int n10) {
        boolean bl2 = n10 > 0;
        uf.a((String)"maxStars must be a positive integer", (boolean)bl2);
        this.c = n10;
        this.d = -1.0f;
    }

    public p22(@IntRange(from=1L) int n10, @FloatRange(from=0.0) float f11) {
        boolean bl2 = true;
        boolean bl3 = n10 > 0;
        uf.a((String)"maxStars must be a positive integer", (boolean)bl3);
        bl3 = f11 >= 0.0f && f11 <= (float)n10 ? bl2 : false;
        uf.a((String)"starRating is out of range [0, maxStars]", (boolean)bl3);
        this.c = n10;
        this.d = f11;
    }

    private static p22 b(Bundle object) {
        if (object.getInt(Integer.toString(0, 36), -1) == 2) {
            int n10 = object.getInt(Integer.toString(1, 36), 5);
            float f11 = object.getFloat(Integer.toString(2, 36), -1.0f);
            object = f11 == -1.0f ? new p22(n10) : new p22(n10, f11);
            return object;
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ p22 d(Bundle bundle) {
        return p22.b(bundle);
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof p22;
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        object = (p22)object;
        bl2 = bl3;
        if (this.c == ((p22)object).c) {
            bl2 = bl3;
            if (this.d == ((p22)object).d) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Float.valueOf(this.d)});
    }
}


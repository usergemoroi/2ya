/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.FloatRange
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.vl
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.kr2;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.vl;
import java.util.Locale;

public final class bi1
implements vl {
    public static final bi1 e = new bi1(1.0f, 1.0f);
    public final float b;
    public final float c;
    private final int d;

    static {
        new kr2();
    }

    public bi1(@FloatRange(from=0.0, fromInclusive=false) float f10, @FloatRange(from=0.0, fromInclusive=false) float f11) {
        boolean bl2 = true;
        boolean bl3 = f10 > 0.0f;
        uf.a((boolean)bl3);
        bl3 = f11 > 0.0f ? bl2 : false;
        uf.a((boolean)bl3);
        this.b = f10;
        this.c = f11;
        this.d = Math.round(f10 * 1000.0f);
    }

    private static bi1 a(Bundle bundle) {
        return new bi1(bundle.getFloat(Integer.toString(0, 36), 1.0f), bundle.getFloat(Integer.toString(1, 36), 1.0f));
    }

    public static /* synthetic */ bi1 b(Bundle bundle) {
        return bi1.a(bundle);
    }

    public final long a(long l10) {
        return l10 * (long)this.d;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && bi1.class == object.getClass()) {
            object = (bi1)object;
            if (this.b != ((bi1)object).b || this.c != ((bi1)object).c) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n10 = Float.floatToRawIntBits(this.b);
        return Float.floatToRawIntBits(this.c) + (n10 + 527) * 31;
    }

    public final String toString() {
        float f10 = this.b;
        float f11 = this.c;
        int n10 = m92.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(f10), Float.valueOf(f11));
    }
}


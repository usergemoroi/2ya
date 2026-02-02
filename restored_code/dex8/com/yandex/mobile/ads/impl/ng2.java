/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.FloatRange
 *  androidx.annotation.IntRange
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.vl
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.i13;
import com.yandex.mobile.ads.impl.vl;

public final class ng2
implements vl {
    public static final int f = 0;
    @IntRange(from=0L)
    public final int b;
    @IntRange(from=0L)
    public final int c;
    @IntRange(from=0L, to=359L)
    public final int d;
    @FloatRange(from=0.0, fromInclusive=false)
    public final float e;

    static {
        new i13();
    }

    public ng2(@IntRange(from=0L) int n10, @IntRange(from=0L) int n13, @IntRange(from=0L, to=359L) int n14, @FloatRange(from=0.0, fromInclusive=false) float f11) {
        this.b = n10;
        this.c = n13;
        this.d = n14;
        this.e = f11;
    }

    private static ng2 a(Bundle bundle) {
        return new ng2(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0), bundle.getFloat(Integer.toString(3, 36), 1.0f));
    }

    public static /* synthetic */ ng2 b(Bundle bundle) {
        return ng2.a(bundle);
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object instanceof ng2) {
            object = (ng2)object;
            if (this.b != ((ng2)object).b || this.c != ((ng2)object).c || this.d != ((ng2)object).d || this.e != ((ng2)object).e) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n10 = this.b;
        int n13 = this.c;
        int n14 = this.d;
        return Float.floatToRawIntBits(this.e) + (((n10 + 217) * 31 + n13) * 31 + n14) * 31;
    }
}


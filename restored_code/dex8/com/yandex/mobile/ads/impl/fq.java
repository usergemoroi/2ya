/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.vl
 *  com.yandex.mobile.ads.impl.vl$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.gt2;
import com.yandex.mobile.ads.impl.vl;
import java.util.Arrays;

public final class fq
implements vl {
    public static final vl.a<fq> g = new gt2();
    public final int b;
    public final int c;
    public final int d;
    @Nullable
    public final byte[] e;
    private int f;

    public fq(int n10, int n12, int n13, @Nullable byte[] byArray) {
        this.b = n10;
        this.c = n12;
        this.d = n13;
        this.e = byArray;
    }

    private static fq a(Bundle bundle) {
        return new fq(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public static /* synthetic */ fq b(Bundle bundle) {
        return fq.a(bundle);
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && fq.class == object.getClass()) {
            object = (fq)object;
            if (this.b != ((fq)object).b || this.c != ((fq)object).c || this.d != ((fq)object).d || !Arrays.equals(this.e, ((fq)object).e)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f == 0) {
            int n10 = this.b;
            int n12 = this.c;
            int n13 = this.d;
            this.f = Arrays.hashCode(this.e) + (((n10 + 527) * 31 + n12) * 31 + n13) * 31;
        }
        return this.f;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ColorInfo(");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        stringBuilder.append(this.c);
        stringBuilder.append(", ");
        stringBuilder.append(this.d);
        stringBuilder.append(", ");
        boolean bl2 = this.e != null;
        stringBuilder.append(bl2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}


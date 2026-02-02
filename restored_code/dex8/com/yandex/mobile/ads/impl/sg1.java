/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.FloatRange
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.vl$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.on1;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.vl;
import com.yandex.mobile.ads.impl.y33;
import java.util.Arrays;

public final class sg1
extends on1 {
    public static final vl.a<sg1> d = new y33();
    private final float c;

    public sg1() {
        this.c = -1.0f;
    }

    public sg1(@FloatRange(from=0.0, to=100.0) float f11) {
        boolean bl2 = f11 >= 0.0f && f11 <= 100.0f;
        uf.a((String)"percent must be in the range of [0, 100]", (boolean)bl2);
        this.c = f11;
    }

    private static sg1 b(Bundle object) {
        if (object.getInt(Integer.toString(0, 36), -1) == 1) {
            float f11 = object.getFloat(Integer.toString(1, 36), -1.0f);
            object = f11 == -1.0f ? new sg1() : new sg1(f11);
            return object;
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ sg1 d(Bundle bundle) {
        return sg1.b(bundle);
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof sg1;
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        if (this.c == ((sg1)object).c) {
            bl3 = true;
        }
        return bl3;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.c)});
    }
}


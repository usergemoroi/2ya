/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.vl
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.vl;
import com.yandex.mobile.ads.impl.xp2;

public final class a10
implements vl {
    public final int b;
    public final int c;
    public final int d;

    static {
        new xp2();
    }

    public a10(int n10, int n12, int n13) {
        this.b = n10;
        this.c = n12;
        this.d = n13;
    }

    private static a10 a(Bundle bundle) {
        return new a10(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0));
    }

    public static /* synthetic */ a10 b(Bundle bundle) {
        return a10.a(bundle);
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof a10)) {
            return false;
        }
        object = (a10)object;
        if (this.b != ((a10)object).b || this.c != ((a10)object).c || this.d != ((a10)object).d) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        return ((this.b + 527) * 31 + this.c) * 31 + this.d;
    }
}


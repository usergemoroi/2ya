/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.vl$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.i03;
import com.yandex.mobile.ads.impl.on1;
import com.yandex.mobile.ads.impl.vl;
import java.util.Arrays;

public final class mf0
extends on1 {
    public static final vl.a<mf0> e = new i03();
    private final boolean c;
    private final boolean d;

    public mf0() {
        this.c = false;
        this.d = false;
    }

    public mf0(boolean bl2) {
        this.c = true;
        this.d = bl2;
    }

    private static mf0 b(Bundle object) {
        if (object.getInt(Integer.toString(0, 36), -1) == 0) {
            object = object.getBoolean(Integer.toString(1, 36), false) ? new mf0(object.getBoolean(Integer.toString(2, 36), false)) : new mf0();
            return object;
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ mf0 d(Bundle bundle) {
        return mf0.b(bundle);
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof mf0;
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        object = (mf0)object;
        bl2 = bl3;
        if (this.d == ((mf0)object).d) {
            bl2 = bl3;
            if (this.c == ((mf0)object).c) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d});
    }
}


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
import com.yandex.mobile.ads.impl.br2;
import com.yandex.mobile.ads.impl.on1;
import com.yandex.mobile.ads.impl.vl;
import java.util.Arrays;

public final class b52
extends on1 {
    public static final vl.a<b52> e = new br2();
    private final boolean c;
    private final boolean d;

    public b52() {
        this.c = false;
        this.d = false;
    }

    public b52(boolean bl2) {
        this.c = true;
        this.d = bl2;
    }

    private static b52 b(Bundle object) {
        if (object.getInt(Integer.toString(0, 36), -1) == 3) {
            object = object.getBoolean(Integer.toString(1, 36), false) ? new b52(object.getBoolean(Integer.toString(2, 36), false)) : new b52();
            return object;
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ b52 d(Bundle bundle) {
        return b52.b(bundle);
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof b52;
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        object = (b52)object;
        bl2 = bl3;
        if (this.d == ((b52)object).d) {
            bl2 = bl3;
            if (this.c == ((b52)object).c) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d});
    }
}


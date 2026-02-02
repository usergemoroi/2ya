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
import com.yandex.mobile.ads.impl.b62;
import com.yandex.mobile.ads.impl.dq0;
import com.yandex.mobile.ads.impl.lw2;
import com.yandex.mobile.ads.impl.vl;
import com.yandex.mobile.ads.impl.xj0;
import java.util.Collections;
import java.util.List;

public final class j62
implements vl {
    public static final vl.a<j62> d = new lw2();
    public final b62 b;
    public final xj0<Integer> c;

    public j62(b62 b622, List<Integer> list) {
        if (!(list.isEmpty() || Collections.min(list) >= 0 && Collections.max(list) < b622.b)) {
            throw new IndexOutOfBoundsException();
        }
        this.b = b622;
        this.c = xj0.a(list);
    }

    private static j62 a(Bundle object) {
        Object object2 = object.getBundle(Integer.toString(0, 36));
        object2.getClass();
        object2 = (b62)b62.g.fromBundle(object2);
        object = object.getIntArray(Integer.toString(1, 36));
        object.getClass();
        return new j62((b62)object2, dq0.a((int[])object));
    }

    public static /* synthetic */ j62 b(Bundle bundle) {
        return j62.a(bundle);
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && j62.class == object.getClass()) {
            object = (j62)object;
            if (!this.b.equals(((j62)object).b) || !this.c.equals(((j62)object).c)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n10 = this.b.hashCode();
        return this.c.hashCode() * 31 + n10;
    }
}


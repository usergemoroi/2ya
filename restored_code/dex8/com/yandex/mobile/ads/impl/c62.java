/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.vl
 *  com.yandex.mobile.ads.impl.vl$a
 *  com.yandex.mobile.ads.impl.wl
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.b62;
import com.yandex.mobile.ads.impl.qr2;
import com.yandex.mobile.ads.impl.vl;
import com.yandex.mobile.ads.impl.wl;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.zs0;
import java.util.AbstractCollection;
import java.util.ArrayList;

public final class c62
implements vl {
    public static final c62 e = new c62(new b62[0]);
    public static final vl.a<c62> f = new qr2();
    public final int b;
    private final xj0<b62> c;
    private int d;

    public c62(b62 ... b62Array) {
        this.c = xj0.b(b62Array);
        this.b = b62Array.length;
        this.a();
    }

    private static c62 a(Bundle object) {
        if ((object = object.getParcelableArrayList(Integer.toString(0, 36))) == null) {
            return new c62(new b62[0]);
        }
        return new c62((b62[])wl.a(b62.g, (ArrayList)object).toArray(new b62[0]));
    }

    private void a() {
        int n10 = 0;
        while (n10 < ((AbstractCollection)((Object)this.c)).size()) {
            int n12;
            for (int i14 = n12 = n10 + 1; i14 < ((AbstractCollection)((Object)this.c)).size(); ++i14) {
                if (!((b62)this.c.get(n10)).equals(this.c.get(i14))) continue;
                zs0.a((String)"TrackGroupArray", (String)"", (Throwable)new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
            }
            n10 = n12;
        }
    }

    public static /* synthetic */ c62 b(Bundle bundle) {
        return c62.a(bundle);
    }

    public final int a(b62 b622) {
        int n10 = this.c.indexOf(b622);
        if (n10 < 0) {
            n10 = -1;
        }
        return n10;
    }

    public final b62 a(int n10) {
        return (b62)this.c.get(n10);
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && c62.class == object.getClass()) {
            object = (c62)object;
            if (this.b != ((c62)object).b || !this.c.equals(((c62)object).c)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode();
        }
        return this.d;
    }
}


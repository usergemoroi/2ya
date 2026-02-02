/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.vl
 *  com.yandex.mobile.ads.impl.vl$a
 *  com.yandex.mobile.ads.impl.wl
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.b62;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.pv2;
import com.yandex.mobile.ads.impl.qv2;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.vl;
import com.yandex.mobile.ads.impl.wl;
import com.yandex.mobile.ads.impl.xj0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;

public final class i72
implements vl {
    public static final i72 c = new i72(xj0.h());
    private final xj0<a> b;

    static {
        new pv2();
    }

    public i72(xj0 xj02) {
        this.b = xj0.a(xj02);
    }

    private static i72 a(Bundle object) {
        object = (object = object.getParcelableArrayList(Integer.toString(0, 36))) == null ? xj0.h() : wl.a(a.g, (ArrayList)object);
        return new i72((xj0)object);
    }

    public static /* synthetic */ i72 b(Bundle bundle) {
        return i72.a(bundle);
    }

    public final xj0<a> a() {
        return this.b;
    }

    public final boolean a(int n10) {
        for (int i14 = 0; i14 < ((AbstractCollection)((Object)this.b)).size(); ++i14) {
            a a13 = (a)this.b.get(i14);
            if (!a13.b() || a13.a() != n10) continue;
            return true;
        }
        return false;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && i72.class == object.getClass()) {
            object = (i72)object;
            return this.b.equals(((i72)object).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public static final class a
    implements vl {
        public static final vl.a<a> g = new qv2();
        public final int b;
        private final b62 c;
        private final boolean d;
        private final int[] e;
        private final boolean[] f;

        public a(b62 b622, boolean bl2, int[] nArray, boolean[] blArray) {
            int n10;
            this.b = n10 = b622.b;
            int n13 = nArray.length;
            boolean bl3 = false;
            boolean bl4 = n10 == n13 && n10 == blArray.length;
            uf.a((boolean)bl4);
            this.c = b622;
            bl4 = bl3;
            if (bl2) {
                bl4 = bl3;
                if (n10 > 1) {
                    bl4 = true;
                }
            }
            this.d = bl4;
            this.e = (int[])nArray.clone();
            this.f = (boolean[])blArray.clone();
        }

        private static a a(Bundle bundle) {
            Object object = b62.g;
            Object object2 = bundle.getBundle(Integer.toString(0, 36));
            object2.getClass();
            b62 b622 = (b62)object.fromBundle((Bundle)object2);
            object = bundle.getIntArray(Integer.toString(1, 36));
            object2 = new int[b622.b];
            if (object != null) {
                object2 = object;
            }
            object = bundle.getBooleanArray(Integer.toString(3, 36));
            boolean[] blArray = new boolean[b622.b];
            if (object == null) {
                object = blArray;
            }
            return new a(b622, bundle.getBoolean(Integer.toString(4, 36), false), (int[])object2, (boolean[])object);
        }

        public static /* synthetic */ a b(Bundle bundle) {
            return a.a(bundle);
        }

        public final int a() {
            return this.c.d;
        }

        public final cc0 a(int n10) {
            return this.c.a(n10);
        }

        public final boolean b() {
            boolean bl2;
            boolean[] blArray = this.f;
            int n10 = blArray.length;
            boolean bl3 = false;
            int n13 = 0;
            while (true) {
                bl2 = bl3;
                if (n13 >= n10) break;
                if (blArray[n13]) {
                    bl2 = true;
                    break;
                }
                ++n13;
            }
            return bl2;
        }

        public final boolean b(int n10) {
            return this.f[n10];
        }

        public final boolean equals(@Nullable Object object) {
            boolean bl2 = true;
            if (this == object) {
                return true;
            }
            if (object != null && a.class == object.getClass()) {
                object = (a)object;
                if (!(this.d == ((a)object).d && this.c.equals(((a)object).c) && Arrays.equals(this.e, ((a)object).e) && Arrays.equals(this.f, ((a)object).f))) {
                    bl2 = false;
                }
                return bl2;
            }
            return false;
        }

        public final int hashCode() {
            int n10 = this.c.hashCode();
            int n13 = this.d;
            int n14 = Arrays.hashCode(this.e);
            return Arrays.hashCode(this.f) + (n14 + (n10 * 31 + n13) * 31) * 31;
        }
    }
}


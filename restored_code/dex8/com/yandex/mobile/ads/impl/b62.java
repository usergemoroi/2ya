/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.e3
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.vl
 *  com.yandex.mobile.ads.impl.vl$a
 *  com.yandex.mobile.ads.impl.w01
 *  com.yandex.mobile.ads.impl.wl
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.dr2;
import com.yandex.mobile.ads.impl.e3;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.vl;
import com.yandex.mobile.ads.impl.w01;
import com.yandex.mobile.ads.impl.wl;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.zs0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class b62
implements vl {
    public static final vl.a<b62> g = new dr2();
    public final int b;
    public final String c;
    public final int d;
    private final cc0[] e;
    private int f;

    public b62(String string2, cc0 ... cc0Array) {
        int n10;
        boolean bl2 = cc0Array.length > 0;
        uf.a((boolean)bl2);
        this.c = string2;
        this.e = cc0Array;
        this.b = cc0Array.length;
        int n12 = n10 = w01.c((String)cc0Array[0].m);
        if (n10 == -1) {
            n12 = w01.c((String)cc0Array[0].l);
        }
        this.d = n12;
        this.a();
    }

    private static b62 a(Bundle bundle) {
        List list = bundle.getParcelableArrayList(Integer.toString(0, 36));
        list = list == null ? xj0.h() : wl.a(cc0.I, (ArrayList)list);
        return new b62(bundle.getString(Integer.toString(1, 36), ""), (cc0[])list.toArray(new cc0[0]));
    }

    private void a() {
        Object object;
        Object object2;
        block9: {
            block8: {
                object2 = this.e[0].d;
                if (object2 == null) break block8;
                object = object2;
                if (!object2.equals("und")) break block9;
            }
            object = "";
        }
        int n10 = this.e[0].f;
        for (int i14 = 1; i14 < ((cc0[])(object2 = this.e)).length; ++i14) {
            CharSequence charSequence;
            block11: {
                block10: {
                    charSequence = object2[i14].d;
                    if (charSequence == null) break block10;
                    object2 = charSequence;
                    if (!((String)charSequence).equals("und")) break block11;
                }
                object2 = "";
            }
            if (!((String)object).equals(object2)) {
                object2 = this.e;
                object = object2[0].d;
                object2 = object2[i14].d;
                charSequence = new StringBuilder("Different languages combined in one TrackGroup: '");
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append("' (track 0) and '");
                ((StringBuilder)charSequence).append((String)object2);
                ((StringBuilder)charSequence).append("' (track ");
                ((StringBuilder)charSequence).append(i14);
                ((StringBuilder)charSequence).append(")");
                zs0.a((String)"TrackGroup", (String)"", (Throwable)new IllegalStateException(((StringBuilder)charSequence).toString()));
                return;
            }
            object2 = this.e;
            if ((n10 | 0x4000) == (object2[i14].f | 0x4000)) continue;
            charSequence = Integer.toBinaryString(object2[0].f);
            object2 = Integer.toBinaryString(this.e[i14].f);
            object = new StringBuilder("Different role flags combined in one TrackGroup: '");
            ((StringBuilder)object).append((String)charSequence);
            ((StringBuilder)object).append("' (track 0) and '");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append("' (track ");
            ((StringBuilder)object).append(i14);
            ((StringBuilder)object).append(")");
            zs0.a((String)"TrackGroup", (String)"", (Throwable)new IllegalStateException(((StringBuilder)object).toString()));
            return;
        }
    }

    public static /* synthetic */ b62 b(Bundle bundle) {
        return b62.a(bundle);
    }

    public final int a(cc0 cc02) {
        cc0[] cc0Array;
        for (int i14 = 0; i14 < (cc0Array = this.e).length; ++i14) {
            if (cc02 != cc0Array[i14]) continue;
            return i14;
        }
        return -1;
    }

    public final cc0 a(int n10) {
        return this.e[n10];
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && b62.class == object.getClass()) {
            object = (b62)object;
            if (!this.c.equals(((b62)object).c) || !Arrays.equals(this.e, ((b62)object).e)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = e3.a((String)this.c, (int)527, (int)31) + Arrays.hashCode(this.e);
        }
        return this.f;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.os.Bundle
 *  android.text.Layout$Alignment
 *  android.text.Spanned
 *  android.text.SpannedString
 *  android.text.TextUtils
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.m73
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.vl
 *  com.yandex.mobile.ads.impl.vl$a
 *  com.yandex.mobile.ads.impl.wu$a
 */
package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.k73;
import com.yandex.mobile.ads.impl.m73;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.vl;
import com.yandex.mobile.ads.impl.wu;
import java.util.Arrays;

/*
 * Exception performing whole class analysis ignored.
 */
public final class wu
implements vl {
    public static final wu s;
    public static final vl.a<wu> t;
    @Nullable
    public final CharSequence b;
    @Nullable
    public final Layout.Alignment c;
    @Nullable
    public final Layout.Alignment d;
    @Nullable
    public final Bitmap e;
    public final float f;
    public final int g;
    public final int h;
    public final float i;
    public final int j;
    public final float k;
    public final float l;
    public final boolean m;
    public final int n;
    public final int o;
    public final float p;
    public final int q;
    public final float r;

    static {
        a a14 = new /* Unavailable Anonymous Inner Class!! */;
        a.a(a14, (CharSequence)"");
        s = a14.a();
        t = new k73();
    }

    private wu(@Nullable CharSequence charSequence, @Nullable Layout.Alignment alignment, @Nullable Layout.Alignment alignment2, @Nullable Bitmap bitmap, float f11, int n10, int n13, float f12, int n14, int n15, float f13, float f14, float f15, boolean bl2, int n16, int n17, float f16) {
        if (charSequence == null) {
            uf.a((Object)bitmap);
        } else {
            boolean bl3 = bitmap == null;
            uf.a((boolean)bl3);
        }
        this.b = charSequence instanceof Spanned ? SpannedString.valueOf((CharSequence)charSequence) : (charSequence != null ? charSequence.toString() : null);
        this.c = alignment;
        this.d = alignment2;
        this.e = bitmap;
        this.f = f11;
        this.g = n10;
        this.h = n13;
        this.i = f12;
        this.j = n14;
        this.k = f14;
        this.l = f15;
        this.m = bl2;
        this.n = n16;
        this.o = n15;
        this.p = f13;
        this.q = n17;
        this.r = f16;
    }

    /* synthetic */ wu(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f11, int n10, int n13, float f12, int n14, int n15, float f13, float f14, float f15, boolean bl2, int n16, int n17, float f16, m73 m732) {
        this(charSequence, alignment, alignment2, bitmap, f11, n10, n13, f12, n14, n15, f13, f14, f15, bl2, n16, n17, f16);
    }

    private static final wu a(Bundle bundle) {
        int n10;
        float f11;
        a a14 = new /* Unavailable Anonymous Inner Class!! */;
        CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
        if (charSequence != null) {
            a.a(a14, (CharSequence)charSequence);
        }
        if ((charSequence = (Layout.Alignment)bundle.getSerializable(Integer.toString(1, 36))) != null) {
            a.c(a14, (Layout.Alignment)charSequence);
        }
        if ((charSequence = (Layout.Alignment)bundle.getSerializable(Integer.toString(2, 36))) != null) {
            a.d(a14, (Layout.Alignment)charSequence);
        }
        if ((charSequence = (Bitmap)bundle.getParcelable(Integer.toString(3, 36))) != null) {
            a.b(a14, (Bitmap)charSequence);
        }
        if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
            f11 = bundle.getFloat(Integer.toString(4, 36));
            n10 = bundle.getInt(Integer.toString(5, 36));
            a.e(a14, (float)f11);
            a.f(a14, (int)n10);
        }
        if (bundle.containsKey(Integer.toString(6, 36))) {
            a.g(a14, (int)bundle.getInt(Integer.toString(6, 36)));
        }
        if (bundle.containsKey(Integer.toString(7, 36))) {
            a.h(a14, (float)bundle.getFloat(Integer.toString(7, 36)));
        }
        if (bundle.containsKey(Integer.toString(8, 36))) {
            a.i(a14, (int)bundle.getInt(Integer.toString(8, 36)));
        }
        if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
            f11 = bundle.getFloat(Integer.toString(10, 36));
            n10 = bundle.getInt(Integer.toString(9, 36));
            a.k(a14, (float)f11);
            a.j(a14, (int)n10);
        }
        if (bundle.containsKey(Integer.toString(11, 36))) {
            a.l(a14, (float)bundle.getFloat(Integer.toString(11, 36)));
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            a.m(a14, (float)bundle.getFloat(Integer.toString(12, 36)));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            a.o(a14, (int)bundle.getInt(Integer.toString(13, 36)));
            a.n(a14, (boolean)true);
        }
        if (!bundle.getBoolean(Integer.toString(14, 36), false)) {
            a.n(a14, (boolean)false);
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            a.p(a14, (int)bundle.getInt(Integer.toString(15, 36)));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            a.q(a14, (float)bundle.getFloat(Integer.toString(16, 36)));
        }
        return a14.a();
    }

    public static /* synthetic */ wu b(Bundle bundle) {
        return wu.a(bundle);
    }

    public final a a() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && wu.class == object.getClass()) {
            Bitmap bitmap;
            Bitmap bitmap2;
            object = (wu)object;
            if (!TextUtils.equals((CharSequence)this.b, (CharSequence)((wu)object).b) || this.c != ((wu)object).c || this.d != ((wu)object).d || !((bitmap2 = this.e) == null ? ((wu)object).e == null : (bitmap = ((wu)object).e) != null && bitmap2.sameAs(bitmap)) || this.f != ((wu)object).f || this.g != ((wu)object).g || this.h != ((wu)object).h || this.i != ((wu)object).i || this.j != ((wu)object).j || this.k != ((wu)object).k || this.l != ((wu)object).l || this.m != ((wu)object).m || this.n != ((wu)object).n || this.o != ((wu)object).o || this.p != ((wu)object).p || this.q != ((wu)object).q || this.r != ((wu)object).r) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, Float.valueOf(this.f), this.g, this.h, Float.valueOf(this.i), this.j, Float.valueOf(this.k), Float.valueOf(this.l), this.m, this.n, this.o, Float.valueOf(this.p), this.q, Float.valueOf(this.r)});
    }
}


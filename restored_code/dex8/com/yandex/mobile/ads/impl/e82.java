/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableStringBuilder
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 *  android.text.style.TypefaceSpan
 *  android.text.style.UnderlineSpan
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.q32
 *  com.yandex.mobile.ads.impl.vn
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.f82;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.s32;
import com.yandex.mobile.ads.impl.vn;
import com.yandex.mobile.ads.impl.wy1;
import com.yandex.mobile.ads.impl.zs0;
import java.util.List;

public final class e82
extends wy1 {
    private final bg1 m = new bg1();
    private final boolean n;
    private final int o;
    private final int p;
    private final String q;
    private final float r;
    private final int s;

    public e82(List<byte[]> object) {
        int n10 = object.size();
        String string2 = "sans-serif";
        boolean bl2 = false;
        if (n10 == 1 && (object.get(0).length == 48 || object.get(0).length == 53)) {
            byte[] byArray = object.get(0);
            this.o = byArray[24];
            this.p = (byArray[26] & 0xFF) << 24 | (byArray[27] & 0xFF) << 16 | (byArray[28] & 0xFF) << 8 | byArray[29] & 0xFF;
            object = string2;
            if ("Serif".equals(m92.a((byte[])byArray, (int)43, (int)(byArray.length - 43)))) {
                object = "serif";
            }
            this.q = object;
            this.s = n10 = byArray[25] * 20;
            if ((byArray[0] & 0x20) != 0) {
                bl2 = true;
            }
            this.n = bl2;
            if (bl2) {
                byte by = byArray[10];
                this.r = m92.a((float)((float)(byArray[11] & 0xFF | (by & 0xFF) << 8) / (float)n10));
            } else {
                this.r = 0.85f;
            }
        } else {
            this.o = 0;
            this.p = -1;
            this.q = "sans-serif";
            this.n = false;
            this.r = 0.85f;
            this.s = -1;
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int n10, int n12, int n13, int n14, int n15) {
        if (n10 != n12) {
            int n16 = n15 | 0x21;
            int n17 = 1;
            n12 = (n10 & 1) != 0 ? 1 : 0;
            n15 = (n10 & 2) != 0 ? 1 : 0;
            if (n12 != 0) {
                if (n15 != 0) {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(3), n13, n14, n16);
                } else {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(1), n13, n14, n16);
                }
            } else if (n15 != 0) {
                spannableStringBuilder.setSpan((Object)new StyleSpan(2), n13, n14, n16);
            }
            n10 = (n10 & 4) != 0 ? n17 : 0;
            if (n10 != 0) {
                spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n13, n14, n16);
            }
            if (n10 == 0 && n12 == 0 && n15 == 0) {
                spannableStringBuilder.setSpan((Object)new StyleSpan(0), n13, n14, n16);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected final q32 a(byte[] object, int n10, boolean bl2) throws s32 {
        int n12;
        this.m.a(n10, (byte[])object);
        object = this.m;
        int n13 = object.a();
        n10 = 2;
        if (n13 < 2) throw new s32("Unexpected subtitle format.");
        n13 = object.z();
        if (((String)(object = n13 == 0 ? "" : (object.a() >= 2 && ((n12 = object.f()) == 65279 || n12 == 65534) ? object.a(n13, vn.e) : object.a(n13, vn.c)))).isEmpty()) {
            return f82.c;
        }
        object = new SpannableStringBuilder((CharSequence)object);
        e82.a((SpannableStringBuilder)object, this.o, 0, 0, object.length(), 0xFF0000);
        n12 = this.p;
        n13 = object.length();
        if (n12 != -1) {
            object.setSpan((Object)new ForegroundColorSpan(n12 >>> 8 | (n12 & 0xFF) << 24), 0, n13, 16711713);
        }
        CharSequence charSequence = this.q;
        n13 = object.length();
        if (charSequence != "sans-serif") {
            object.setSpan((Object)new TypefaceSpan((String)charSequence), 0, n13, 16711713);
        }
        float f11 = this.r;
        while (this.m.a() >= 8) {
            float f12;
            int n14 = this.m.d();
            int n15 = this.m.h();
            n13 = this.m.h();
            if (n13 == 1937013100) {
                if (this.m.a() < n10) throw new s32("Unexpected subtitle format.");
                n12 = this.m.z();
                int n16 = 0;
                n13 = n10;
                while (true) {
                    f12 = f11;
                    n10 = n13;
                    if (n16 < n12) {
                        charSequence = this.m;
                        if (charSequence.a() < 12) throw new s32("Unexpected subtitle format.");
                        int n17 = charSequence.z();
                        int n18 = charSequence.z();
                        charSequence.f(n13);
                        n13 = charSequence.t();
                        charSequence.f(1);
                        int n19 = charSequence.h();
                        n10 = n18;
                        if (n18 > object.length()) {
                            charSequence = new StringBuilder("Truncating styl end (");
                            ((StringBuilder)charSequence).append(n18);
                            ((StringBuilder)charSequence).append(") to cueText.length() (");
                            ((StringBuilder)charSequence).append(object.length());
                            ((StringBuilder)charSequence).append(").");
                            zs0.d((String)"Tx3gDecoder", (String)((StringBuilder)charSequence).toString());
                            n10 = object.length();
                        }
                        if (n17 >= n10) {
                            charSequence = new StringBuilder("Ignoring styl with start (");
                            ((StringBuilder)charSequence).append(n17);
                            ((StringBuilder)charSequence).append(") >= end (");
                            ((StringBuilder)charSequence).append(n10);
                            ((StringBuilder)charSequence).append(").");
                            zs0.d((String)"Tx3gDecoder", (String)((StringBuilder)charSequence).toString());
                        } else {
                            e82.a((SpannableStringBuilder)object, n13, this.o, n17, n10, 0);
                            if (n19 != this.p) {
                                object.setSpan((Object)new ForegroundColorSpan((n19 & 0xFF) << 24 | n19 >>> 8), n17, n10, 33);
                            }
                        }
                        ++n16;
                        n13 = 2;
                        continue;
                    }
                    break;
                }
            } else if (n13 == 1952608120 && this.n) {
                n13 = this.m.a();
                n10 = 2;
                if (n13 < 2) throw new s32("Unexpected subtitle format.");
                f12 = (float)this.m.z() / (float)this.s;
                n13 = m92.a;
                f12 = Math.max(0.0f, Math.min(f12, 0.95f));
            } else {
                n10 = 2;
                f12 = f11;
            }
            this.m.e(n14 + n15);
            f11 = f12;
        }
        return new f82(new /* Unavailable Anonymous Inner Class!! */.a((CharSequence)object).a(0, f11).a(0).a());
    }
}


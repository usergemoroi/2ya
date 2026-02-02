/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.text.Layout$Alignment
 *  android.text.SpannableString
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StrikethroughSpan
 *  android.text.style.StyleSpan
 *  android.text.style.UnderlineSpan
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.i22
 *  com.yandex.mobile.ads.impl.j22
 *  com.yandex.mobile.ads.impl.j22$a
 *  com.yandex.mobile.ads.impl.j22$b
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.q32
 *  com.yandex.mobile.ads.impl.sf
 *  com.yandex.mobile.ads.impl.sr0
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.i22;
import com.yandex.mobile.ads.impl.j22;
import com.yandex.mobile.ads.impl.k22;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.sf;
import com.yandex.mobile.ads.impl.sr0;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.wy1;
import com.yandex.mobile.ads.impl.zs0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class h22
extends wy1 {
    private static final Pattern r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean m;
    @Nullable
    private final i22 n;
    private LinkedHashMap o;
    private float p = -3.4028235E38f;
    private float q = -3.4028235E38f;

    public h22(@Nullable List<byte[]> list) {
        if (list != null && !list.isEmpty()) {
            this.m = true;
            String string2 = m92.a((byte[])list.get(0));
            uf.a((boolean)string2.startsWith("Format:"));
            this.n = (i22)uf.a((Object)i22.a((String)string2));
            this.a(new bg1(list.get(1)));
        } else {
            this.m = false;
            this.n = null;
        }
    }

    private static int a(long l10, ArrayList arrayList, ArrayList arrayList2) {
        int n10;
        block2: {
            for (n10 = arrayList.size() - 1; n10 >= 0; --n10) {
                if ((Long)arrayList.get(n10) == l10) {
                    return n10;
                }
                if ((Long)arrayList.get(n10) >= l10) continue;
                ++n10;
                break block2;
            }
            n10 = 0;
        }
        arrayList.add(n10, l10);
        arrayList = n10 == 0 ? new ArrayList<Long>() : new ArrayList((Collection)arrayList2.get(n10 - 1));
        arrayList2.add(n10, arrayList);
        return n10;
    }

    private static long a(String object) {
        if (!((Matcher)(object = r.matcher(((String)object).trim()))).matches()) {
            return -9223372036854775807L;
        }
        String string2 = ((Matcher)object).group(1);
        int n10 = m92.a;
        long l10 = Long.parseLong(string2);
        long l11 = Long.parseLong(((Matcher)object).group(2));
        long l13 = Long.parseLong(((Matcher)object).group(3));
        return Long.parseLong(((Matcher)object).group(4)) * 10000L + (l13 * 1000000L + (l11 * 60000000L + l10 * 3600000000L));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    private void a(bg1 var1_1) {
        while ((var2_2 = var1_1.j()) != null) {
            block9: {
                if (!"[Script Info]".equalsIgnoreCase(var2_2)) break block9;
                while ((var2_2 = var1_1.j()) != null && (var1_1.a() == 0 || var1_1.g() != 91)) {
                    var3_4 = var2_2.split(":");
                    if (var3_4.length != 2) continue;
                    var2_2 = sf.b((String)var3_4[0].trim());
                    var2_2.getClass();
                    if (var2_2.equals("playresx")) ** GOTO lbl14
                    if (!var2_2.equals("playresy")) continue;
                    this.q = Float.parseFloat(var3_4[1].trim());
                    continue;
lbl14:
                    // 1 sources

                    this.p = Float.parseFloat(var3_4[1].trim());
                }
                continue;
            }
            if ("[V4+ Styles]".equalsIgnoreCase(var2_2)) {
                var3_4 = new LinkedHashMap();
                var2_2 = null;
                while ((var4_5 = var1_1.j()) != null && (var1_1.a() == 0 || var1_1.g() != 91)) {
                    if (var4_5.startsWith("Format:")) {
                        var2_2 = j22.a.a((String)var4_5);
                        continue;
                    }
                    if (!var4_5.startsWith("Style:")) continue;
                    if (var2_2 == null) {
                        zs0.d((String)"SsaDecoder", (String)"Skipping 'Style:' line before 'Format:' line: ".concat(var4_5));
                        continue;
                    }
                    if ((var4_5 = j22.a((String)var4_5, (j22.a)var2_2)) == null) continue;
                    var3_4.put(var4_5.a, var4_5);
                }
                this.o = var3_4;
                continue;
            }
            if ("[V4 Styles]".equalsIgnoreCase(var2_2)) {
                zs0.c((String)"SsaDecoder", (String)"[V4 Styles] are not supported");
                continue;
            }
            if (!"[Events]".equalsIgnoreCase(var2_2)) continue;
        }
        return;
        catch (NumberFormatException var2_3) {
        }
    }

    @Override
    protected final q32 a(byte[] object, int n10, boolean bl2) {
        Object object2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        bg1 bg12 = new bg1(n10, object);
        if (!this.m) {
            this.a(bg12);
        }
        object = this.m ? (Object)this.n : null;
        while ((object2 = bg12.j()) != null) {
            if (((String)object2).startsWith("Format:")) {
                object = i22.a((String)object2);
                continue;
            }
            if (!((String)object2).startsWith("Dialogue:")) continue;
            if (object == null) {
                zs0.d((String)"SsaDecoder", (String)"Skipping dialogue line before complete format: ".concat((String)object2));
                continue;
            }
            if (((String)object2).startsWith("Dialogue:")) {
                int n12;
                float f11;
                j22.b b10 = ((String)object2).substring(9).split(",", object.e);
                if (((String[])b10).length != object.e) {
                    zs0.d((String)"SsaDecoder", (String)"Skipping dialogue line with fewer columns than format: ".concat((String)object2));
                    continue;
                }
                long l10 = h22.a(b10[object.a]);
                if (l10 == -9223372036854775807L) {
                    zs0.d((String)"SsaDecoder", (String)"Skipping invalid timing: ".concat((String)object2));
                    continue;
                }
                long l11 = h22.a(b10[object.b]);
                if (l11 == -9223372036854775807L) {
                    zs0.d((String)"SsaDecoder", (String)"Skipping invalid timing: ".concat((String)object2));
                    continue;
                }
                object2 = this.o;
                object2 = object2 != null && (n10 = object.c) != -1 ? (j22)((LinkedHashMap)object2).get(b10[n10].trim()) : null;
                String string2 = b10[object.d];
                b10 = j22.b.a((String)string2);
                string2 = j22.b.c((String)string2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", "\u00a0");
                float f12 = this.p;
                float f13 = this.q;
                SpannableString spannableString = new SpannableString((CharSequence)string2);
                string2 = new /* Unavailable Anonymous Inner Class!! */.a((CharSequence)spannableString);
                if (object2 != null) {
                    if (((j22)object2).c != null) {
                        spannableString.setSpan((Object)new ForegroundColorSpan(((j22)object2).c.intValue()), 0, spannableString.length(), 33);
                    }
                    if (((j22)object2).j == 3 && ((j22)object2).d != null) {
                        spannableString.setSpan((Object)new BackgroundColorSpan(((j22)object2).d.intValue()), 0, spannableString.length(), 33);
                    }
                    if ((f11 = ((j22)object2).e) != -3.4028235E38f && f13 != -3.4028235E38f) {
                        string2.b(1, f11 / f13);
                    }
                    if ((bl2 = ((j22)object2).f) && ((j22)object2).g) {
                        spannableString.setSpan((Object)new StyleSpan(3), 0, spannableString.length(), 33);
                    } else if (bl2) {
                        spannableString.setSpan((Object)new StyleSpan(1), 0, spannableString.length(), 33);
                    } else if (((j22)object2).g) {
                        spannableString.setSpan((Object)new StyleSpan(2), 0, spannableString.length(), 33);
                    }
                    if (((j22)object2).h) {
                        spannableString.setSpan((Object)new UnderlineSpan(), 0, spannableString.length(), 33);
                    }
                    if (((j22)object2).i) {
                        spannableString.setSpan((Object)new StrikethroughSpan(), 0, spannableString.length(), 33);
                    }
                }
                if ((n12 = b10.a) == -1) {
                    n12 = object2 != null ? ((j22)object2).b : -1;
                }
                switch (n12) {
                    default: {
                        sr0.a((String)"Unknown alignment: ", (int)n12, (String)"SsaDecoder");
                    }
                    case -1: {
                        object2 = null;
                        break;
                    }
                    case 3: 
                    case 6: 
                    case 9: {
                        object2 = Layout.Alignment.ALIGN_OPPOSITE;
                        break;
                    }
                    case 2: 
                    case 5: 
                    case 8: {
                        object2 = Layout.Alignment.ALIGN_CENTER;
                        break;
                    }
                    case 1: 
                    case 4: 
                    case 7: {
                        object2 = Layout.Alignment.ALIGN_NORMAL;
                    }
                }
                object2 = string2.b((Layout.Alignment)object2);
                int n13 = Integer.MIN_VALUE;
                switch (n12) {
                    default: {
                        sr0.a((String)"Unknown alignment: ", (int)n12, (String)"SsaDecoder");
                    }
                    case -1: {
                        n10 = Integer.MIN_VALUE;
                        break;
                    }
                    case 3: 
                    case 6: 
                    case 9: {
                        n10 = 2;
                        break;
                    }
                    case 2: 
                    case 5: 
                    case 8: {
                        n10 = 1;
                        break;
                    }
                    case 1: 
                    case 4: 
                    case 7: {
                        n10 = 0;
                    }
                }
                object2 = object2.b(n10);
                n10 = n13;
                switch (n12) {
                    default: {
                        sr0.a((String)"Unknown alignment: ", (int)n12, (String)"SsaDecoder");
                        n10 = n13;
                        break;
                    }
                    case 7: 
                    case 8: 
                    case 9: {
                        n10 = 0;
                        break;
                    }
                    case 4: 
                    case 5: 
                    case 6: {
                        n10 = 1;
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 3: {
                        n10 = 2;
                    }
                    case -1: 
                }
                object2.a(n10);
                object2 = b10.b;
                if (object2 != null && f13 != -3.4028235E38f && f12 != -3.4028235E38f) {
                    string2.b(((PointF)object2).x / f12);
                    string2.a(0, b10.b.y / f13);
                } else {
                    n10 = string2.c();
                    f12 = 0.05f;
                    f11 = n10 != 0 ? (n10 != 1 ? (n10 != 2 ? -3.4028235E38f : 0.95f) : 0.5f) : 0.05f;
                    string2.b(f11);
                    n10 = string2.b();
                    f11 = f12;
                    if (n10 != 0) {
                        f11 = n10 != 1 ? (n10 != 2 ? -3.4028235E38f : 0.95f) : 0.5f;
                    }
                    string2.a(0, f11);
                }
                object2 = string2.a();
                n12 = h22.a(l11, arrayList2, arrayList);
                for (n10 = h22.a(l10, arrayList2, arrayList); n10 < n12; ++n10) {
                    ((List)arrayList.get(n10)).add(object2);
                }
                continue;
            }
            throw new IllegalArgumentException();
        }
        return new k22(arrayList, arrayList2);
    }
}


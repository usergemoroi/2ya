/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.a82
 *  com.yandex.mobile.ads.impl.c82
 *  com.yandex.mobile.ads.impl.gq
 *  com.yandex.mobile.ads.impl.lv0
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.q32
 *  com.yandex.mobile.ads.impl.sf
 *  com.yandex.mobile.ads.impl.t42
 *  com.yandex.mobile.ads.impl.tl2
 *  com.yandex.mobile.ads.impl.y72$a
 *  com.yandex.mobile.ads.impl.y72$b
 *  com.yandex.mobile.ads.impl.y72$c
 *  com.yandex.mobile.ads.impl.z72
 *  com.yandex.mobile.ads.impl.zs0
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 *  org.xmlpull.v1.XmlPullParserFactory
 */
package com.yandex.mobile.ads.impl;

import android.text.Layout;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a82;
import com.yandex.mobile.ads.impl.c82;
import com.yandex.mobile.ads.impl.d82;
import com.yandex.mobile.ads.impl.gq;
import com.yandex.mobile.ads.impl.lv0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.s32;
import com.yandex.mobile.ads.impl.sf;
import com.yandex.mobile.ads.impl.t42;
import com.yandex.mobile.ads.impl.tl2;
import com.yandex.mobile.ads.impl.wy1;
import com.yandex.mobile.ads.impl.y72;
import com.yandex.mobile.ads.impl.z72;
import com.yandex.mobile.ads.impl.zs0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class y72
extends wy1 {
    private static final Pattern n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    private static final b u = new /* Unavailable Anonymous Inner Class!! */;
    private static final a v = new /* Unavailable Anonymous Inner Class!! */;
    private final XmlPullParserFactory m;

    public y72() {
        try {
            XmlPullParserFactory xmlPullParserFactory;
            this.m = xmlPullParserFactory = XmlPullParserFactory.newInstance();
            xmlPullParserFactory.setNamespaceAware(true);
            return;
        }
        catch (XmlPullParserException xmlPullParserException) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", xmlPullParserException);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static long a(String var0, b var1_1) throws s32 {
        block23: {
            var16_2 = y72.n.matcher(var0);
            var15_3 = var16_2.matches();
            var14_4 = 4;
            if (var15_3) {
                var0 = var16_2.group(1);
                var0.getClass();
                var10_5 = Long.parseLong(var0) * 3600L;
                var0 = var16_2.group(2);
                var0.getClass();
                var8_6 = Long.parseLong(var0) * 60L;
                var0 = var16_2.group(3);
                var0.getClass();
                var12_7 = Long.parseLong(var0);
                var0 = var16_2.group(4);
                var6_8 = 0.0;
                var2_9 = var0 != null ? Double.parseDouble(var0) : 0.0;
                var0 = var16_2.group(5);
                var4_11 = var0 != null ? (double)((float)Long.parseLong(var0) / var1_1.a) : 0.0;
                var0 = var16_2.group(6);
                if (var0 == null) return (long)((var10_5 + var8_6 + var12_7 + var2_9 + var4_11 + var6_8) * 1000000.0);
                var6_8 = (double)Long.parseLong(var0) / (double)var1_1.b / (double)var1_1.a;
                return (long)((var10_5 + var8_6 + var12_7 + var2_9 + var4_11 + var6_8) * 1000000.0);
            }
            var16_2 = y72.o.matcher(var0);
            if (!var16_2.matches()) {
                var1_1 = new StringBuilder("Malformed time expression: ");
                var1_1.append(var0);
                throw new s32(var1_1.toString());
            }
            var0 = var16_2.group(1);
            var0.getClass();
            var4_12 = Double.parseDouble(var0);
            var0 = var16_2.group(2);
            var0.getClass();
            tmp = -1;
            switch (var0.hashCode()) {
                case 3494: {
                    if (!var0.equals("ms")) break;
                    tmp = 1;
                    break;
                }
                case 116: {
                    if (!var0.equals("t")) break;
                    tmp = 2;
                    break;
                }
                case 109: {
                    if (!var0.equals("m")) break;
                    tmp = 3;
                    break;
                }
                case 104: {
                    if (!var0.equals("h")) break;
                    tmp = 4;
                    break;
                }
                case 102: {
                    if (!var0.equals("f")) break;
                    tmp = 5;
                    break;
                }
            }
            switch (tmp) {
                default: {
                    var14_4 = -1;
                    break;
                }
                case 2: {
                    var14_4 = 3;
                    break;
                }
                case 3: {
                    var14_4 = 2;
                    break;
                }
                case 4: {
                    var14_4 = 1;
                    break;
                }
                case 5: {
                    var14_4 = 0;
                    break;
                }
                case 1: 
            }
            switch (var14_4) {
                default: {
                    var2_10 = var4_12;
                    return (long)(var2_10 * 1000000.0);
                }
                case 4: {
                    var2_10 = 1000.0;
                    break block23;
                }
                case 3: {
                    var2_10 = var1_1.c;
                    break block23;
                }
                case 2: {
                    var2_10 = 60.0;

                }
                case 1: {
                    var2_10 = 3600.0;
lbl93:

                    var2_10 = var4_12 * var2_10;
                    return (long)(var2_10 * 1000000.0);
                }
                case 0: 
            }
            var2_10 = var1_1.a;
        }
        var2_10 = var4_12 / var2_10;
        return (long)(var2_10 * 1000000.0);
    }

    private static c82 a(@Nullable c82 c822) {
        c82 c823 = c822;
        if (c822 == null) {
            c823 = new c82();
        }
        return c823;
    }

    /*
     * Unable to fully structure code
     */
    private static c82 a(XmlPullParser var0, c82 var1_1) {
        var8_2 = var0.getAttributeCount();
        var10_4 = var1_1;
        for (var5_3 = 0; var5_3 < var8_2; ++var5_3) {
            var11_15 = var0.getAttributeValue(var5_3);
            var1_1 = var0.getAttributeName(var5_3);
            var1_1.getClass();
            var4_11 = var1_1.hashCode();
            var6_12 = 5;
            var7_13 = -1;
            switch (var4_11) // 16 sources

            {
                default: {
                    var4_11 = -1;
                    break;
                }
                case 1754920356: {
                    if (!var1_1.equals("multiRowAlign")) ** GOTO lbl-1000
                    var4_11 = 14;
                    break;
                }
                case 1287124693: {
                    if (!var1_1.equals("backgroundColor")) ** GOTO lbl-1000
                    var4_11 = 13;
                    break;
                }
                case 1115953443: {
                    if (!var1_1.equals("rubyPosition")) ** GOTO lbl-1000
                    var4_11 = 12;
                    break;
                }
                case 921125321: {
                    if (!var1_1.equals("textEmphasis")) ** GOTO lbl-1000
                    var4_11 = 11;
                    break;
                }
                case 365601008: {
                    if (!var1_1.equals("fontSize")) ** GOTO lbl-1000
                    var4_11 = 10;
                    break;
                }
                case 110138194: {
                    if (!var1_1.equals("textCombine")) ** GOTO lbl-1000
                    var4_11 = 9;
                    break;
                }
                case 109403361: {
                    if (!var1_1.equals("shear")) ** GOTO lbl-1000
                    var4_11 = 8;
                    break;
                }
                case 94842723: {
                    if (!var1_1.equals("color")) ** GOTO lbl-1000
                    var4_11 = 7;
                    break;
                }
                case 3511770: {
                    if (!var1_1.equals("ruby")) ** GOTO lbl-1000
                    var4_11 = 6;
                    break;
                }
                case 3355: {
                    if (!var1_1.equals("id")) ** GOTO lbl-1000
                    var4_11 = 5;
                    break;
                }
                case -734428249: {
                    if (!var1_1.equals("fontWeight")) ** GOTO lbl-1000
                    var4_11 = 4;
                    break;
                }
                case -879295043: {
                    if (!var1_1.equals("textDecoration")) ** GOTO lbl-1000
                    var4_11 = 3;
                    break;
                }
                case -1065511464: {
                    if (!var1_1.equals("textAlign")) ** GOTO lbl-1000
                    var4_11 = 2;
                    break;
                }
                case -1224696685: {
                    if (!var1_1.equals("fontFamily")) ** GOTO lbl-1000
                    var4_11 = 1;
                    break;
                }
                case -1550943582: {
                    if (!var1_1.equals("fontStyle")) ** GOTO lbl-1000
                    var4_11 = 0;
                }
            }
            block22 : switch (var4_11) {
                default: {
                    var1_1 = var10_4;
                    break;
                }
                case 14: {
                    var1_1 = y72.a((c82)var10_4).a(y72.b(var11_15));
                    break;
                }
                case 13: {
                    var1_1 = y72.a((c82)var10_4);
                    try {
                        var1_1.a(gq.b((String)var11_15));
                    }
                    catch (IllegalArgumentException var10_5) {
                        lv0.a((String)"Failed parsing background value: ", (String)var11_15, (String)"TtmlDecoder");
                    }
                    break;
                }
                case 12: {
                    var1_1 = sf.b((String)var11_15);
                    var1_1.getClass();
                    if (!var1_1.equals("before")) {
                        if (!var1_1.equals("after")) {
                            var1_1 = var10_4;
                            break;
                        }
                        var1_1 = y72.a((c82)var10_4).d(2);
                        break;
                    }
                    var1_1 = y72.a((c82)var10_4).d(1);
                    break;
                }
                case 11: {
                    var1_1 = y72.a((c82)var10_4).a(t42.a((String)var11_15));
                    break;
                }
                case 10: {
                    var1_1 = var10_4;
                    var1_1 = var10_4 = y72.a((c82)var10_4);
                    try {
                        y72.a(var11_15, (c82)var10_4);
                        var1_1 = var10_4;
                    }
                    catch (s32 var10_6) {
                        lv0.a((String)"Failed parsing fontSize value: ", (String)var11_15, (String)"TtmlDecoder");
                    }
                    break;
                }
                case 9: {
                    var1_1 = sf.b((String)var11_15);
                    var1_1.getClass();
                    if (!var1_1.equals("all")) {
                        if (!var1_1.equals("none")) {
                            var1_1 = var10_4;
                            break;
                        }
                        var1_1 = y72.a((c82)var10_4).d(false);
                        break;
                    }
                    var1_1 = y72.a((c82)var10_4).d(true);
                    break;
                }
                case 8: {
                    var1_1 = y72.a((c82)var10_4);
                    var10_4 = y72.q.matcher(var11_15);
                    var9_14 = var10_4.matches();
                    var3_10 = 3.4028235E38f;
                    if (!var9_14) {
                        lv0.a((String)"Invalid value for shear: ", (String)var11_15, (String)"TtmlDecoder");
                        var2_9 = var3_10;
                    } else {
                        try {
                            var10_4 = var10_4.group(1);
                            var10_4.getClass();
                            var2_9 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String)var10_4)));
                        }
                        catch (NumberFormatException var10_7) {
                            var12_16 = new StringBuilder("Failed to parse shear: ");
                            var12_16.append(var11_15);
                            zs0.b((String)"TtmlDecoder", (String)var12_16.toString(), (Throwable)var10_7);
                            var2_9 = var3_10;
                        }
                    }
                    var1_1 = var1_1.b(var2_9);
                    break;
                }
                case 7: {
                    var1_1 = y72.a((c82)var10_4);
                    try {
                        var1_1.b(gq.b((String)var11_15));
                    }
                    catch (IllegalArgumentException var10_8) {
                        lv0.a((String)"Failed parsing color value: ", (String)var11_15, (String)"TtmlDecoder");
                    }
                    break;
                }
                case 6: {
                    var1_1 = sf.b((String)var11_15);
                    var1_1.getClass();
                    switch (var1_1.hashCode()) // 7 sources

                    {
                        default: {
                            var4_11 = -1;
                            break;
                        }
                        case 3556653: {
                            var4_11 = var6_12;
                            if (var1_1.equals("text")) break;

                        }
                        case 3016401: {
                            if (!var1_1.equals("base")) ** GOTO lbl-1000
                            var4_11 = 4;
                            break;
                        }
                        case -136074796: {
                            if (!var1_1.equals("textContainer")) ** GOTO lbl-1000
                            var4_11 = 3;
                            break;
                        }
                        case -250518009: {
                            if (!var1_1.equals("delimiter")) ** GOTO lbl-1000
                            var4_11 = 2;
                            break;
                        }
                        case -410956671: {
                            if (!var1_1.equals("container")) ** GOTO lbl-1000
                            var4_11 = 1;
                            break;
                        }
                        case -618561360: {
                            if (!var1_1.equals("baseContainer")) ** GOTO lbl-1000
                            var4_11 = 0;
                        }
                    }
                    switch (var4_11) {
                        default: {
                            var1_1 = var10_4;
                            break block22;
                        }
                        case 3: 
                        case 5: {
                            var1_1 = y72.a((c82)var10_4).e(3);
                            break block22;
                        }
                        case 2: {
                            var1_1 = y72.a((c82)var10_4).e(4);
                            break block22;
                        }
                        case 1: {
                            var1_1 = y72.a((c82)var10_4).e(1);
                            break block22;
                        }
                        case 0: 
                        case 4: 
                    }
                    var1_1 = y72.a((c82)var10_4).e(2);
                    break;
                }
                case 5: {
                    var1_1 = var10_4;
                    if (!"style".equals(var0.getName())) break;
                    var1_1 = y72.a((c82)var10_4).b(var11_15);
                    break;
                }
                case 4: {
                    var1_1 = y72.a((c82)var10_4).a("bold".equalsIgnoreCase(var11_15));
                    break;
                }
                case 3: {
                    var1_1 = sf.b((String)var11_15);
                    var1_1.getClass();
                    switch (var1_1.hashCode()) {
                        default: {
                            var4_11 = var7_13;
                            break;
                        }
                        case 1679736913: {
                            if (!var1_1.equals("linethrough")) {
                                var4_11 = var7_13;
                                break;
                            }
                            var4_11 = 3;
                            break;
                        }
                        case 913457136: {
                            if (!var1_1.equals("nolinethrough")) {
                                var4_11 = var7_13;
                                break;
                            }
                            var4_11 = 2;
                            break;
                        }
                        case -1026963764: {
                            if (!var1_1.equals("underline")) {
                                var4_11 = var7_13;
                                break;
                            }
                            var4_11 = 1;
                            break;
                        }
                        case -1461280213: {
                            var4_11 = var1_1.equals("nounderline") == false ? var7_13 : 0;
                        }
                    }
                    switch (var4_11) {
                        default: {
                            var1_1 = var10_4;
                            break block22;
                        }
                        case 3: {
                            var1_1 = y72.a((c82)var10_4).c(true);
                            break block22;
                        }
                        case 2: {
                            var1_1 = y72.a((c82)var10_4).c(false);
                            break block22;
                        }
                        case 1: {
                            var1_1 = y72.a((c82)var10_4).e(true);
                            break block22;
                        }
                        case 0: 
                    }
                    var1_1 = y72.a((c82)var10_4).e(false);
                    break;
                }
                case 2: {
                    var1_1 = y72.a((c82)var10_4).b(y72.b(var11_15));
                    break;
                }
                case 1: {
                    var1_1 = y72.a((c82)var10_4).a(var11_15);
                    break;
                }
                case 0: {
                    var1_1 = y72.a((c82)var10_4).b("italic".equalsIgnoreCase(var11_15));
                }
            }
            var10_4 = var1_1;
        }
        return var10_4;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static a a(XmlPullParser object, a a14) throws s32 {
        void var1_2;
        String string2 = object.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (string2 == null) {
            return var1_2;
        }
        Object object2 = t.matcher(string2);
        if (!((Matcher)object2).matches()) {
            zs0.d((String)"TtmlDecoder", (String)"Ignoring malformed cell resolution: ".concat(string2));
            return var1_2;
        }
        try {
            String string3 = ((Matcher)object2).group(1);
            string3.getClass();
            int n10 = Integer.parseInt(string3);
            String string4 = ((Matcher)object2).group(2);
            string4.getClass();
            int n13 = Integer.parseInt(string4);
            if (n10 != 0 && n13 != 0) {
                return new /* Unavailable Anonymous Inner Class!! */;
            }
            object2 = new StringBuilder("Invalid cell resolution ");
            ((StringBuilder)object2).append(n10);
            ((StringBuilder)object2).append(" ");
            ((StringBuilder)object2).append(n13);
            s32 s322 = new s32(((StringBuilder)object2).toString());
            throw s322;
        }
        catch (NumberFormatException numberFormatException) {
            zs0.d((String)"TtmlDecoder", (String)"Ignoring malformed cell resolution: ".concat(string2));
            return var1_2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static b a(XmlPullParser object) throws s32 {
        float f11;
        int n10;
        String string2 = object.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int n13 = string2 != null ? Integer.parseInt(string2) : 30;
        String string3 = object.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (string3 != null) {
            n10 = m92.a;
            String[] stringArray = string3.split(" ", -1);
            if (stringArray.length != 2) throw new s32("frameRateMultiplier doesn't have 2 parts");
            f11 = (float)Integer.parseInt(stringArray[0]) / (float)Integer.parseInt(stringArray[1]);
        } else {
            f11 = 1.0f;
        }
        b b11 = u;
        n10 = b11.b;
        String string4 = object.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (string4 != null) {
            n10 = Integer.parseInt(string4);
        }
        int n14 = b11.c;
        String string5 = object.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (string5 == null) return new /* Unavailable Anonymous Inner Class!! */;
        n14 = Integer.parseInt(string5);
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static z72 a(XmlPullParser var0, @Nullable z72 var1_1, HashMap var2_2, b var3_3) throws s32 {
        block38: {
            block37: {
                var6_4 = var0.getAttributeCount();
                var27_5 = y72.a(var0, null);
                var22_6 /* !! */  = null;
                var21_7 /* !! */  = null;
                var24_8 = "";
                var7_10 = -9223372036854775807L;
                var9_11 = -9223372036854775807L;
                var11_12 = -9223372036854775807L;
                for (var5_9 = 0; var5_9 < var6_4; ++var5_9) {
                    block36: {
                        var23_17 /* !! */  = var0.getAttributeName(var5_9);
                        var26_19 = var0.getAttributeValue(var5_9);
                        var23_17 /* !! */ .getClass();
                        tmp = -1;
                        switch (var23_17 /* !! */ .hashCode()) {
                            case 1292595405: {
                                if (!var23_17 /* !! */ .equals("backgroundImage")) break;
                                tmp = 1;
                                break;
                            }
                            case 109780401: {
                                if (!var23_17 /* !! */ .equals("style")) break;
                                tmp = 2;
                                break;
                            }
                            case 93616297: {
                                if (!var23_17 /* !! */ .equals("begin")) break;
                                tmp = 3;
                                break;
                            }
                            case 100571: {
                                if (!var23_17 /* !! */ .equals("end")) break;
                                tmp = 4;
                                break;
                            }
                            case 99841: {
                                if (!var23_17 /* !! */ .equals("dur")) break;
                                tmp = 5;
                                break;
                            }
                            case -934795532: {
                                if (!var23_17 /* !! */ .equals("region")) break;
                                tmp = 6;
                                break;
                            }
                        }
                        switch (tmp) {
                            default: {
                                var4_13 = -1;
                                break;
                            }
                            case 1: {
                                var4_13 = 5;
                                break;
                            }
                            case 2: {
                                var4_13 = 4;
                                break;
                            }
                            case 3: {
                                var4_13 = 3;
                                break;
                            }
                            case 4: {
                                var4_13 = 2;
                                break;
                            }
                            case 5: {
                                var4_13 = 1;
                                break;
                            }
                            case 6: {
                                var4_13 = 0;
                            }
                        }
                        switch (var4_13) {
                            default: {

                            }
                            case 5: {
                                if (var26_19.startsWith("#")) {
                                    var21_7 /* !! */  = var26_19.substring(1);
                                }
lbl67:

                                var25_18 = var22_6 /* !! */ ;
                                var23_17 /* !! */  = var21_7 /* !! */ ;
                                var13_14 = var7_10;
                                var17_16 = var9_11;
                                var15_15 = var11_12;
                                break block36;
                            }
                            case 4: {
                                var23_17 /* !! */  = var26_19.trim();
                                if (var23_17 /* !! */ .isEmpty()) {
                                    var23_17 /* !! */  = new String[]{};
                                } else {
                                    var4_13 = m92.a;
                                    var23_17 /* !! */  = var23_17 /* !! */ .split("\\s+", -1);
                                }
                                var13_14 = var7_10;
                                var17_16 = var9_11;
                                var15_15 = var11_12;
                                if (var23_17 /* !! */ .length > 0) {
                                    var22_6 /* !! */  = var23_17 /* !! */ ;
                                    var15_15 = var11_12;
                                    var17_16 = var9_11;
                                    var13_14 = var7_10;
                                }

                            }
                            case 3: {
                                var13_14 = y72.a(var26_19, var3_3);
                                var17_16 = var9_11;
                                var15_15 = var11_12;

                            }
                            case 2: {
                                var17_16 = y72.a(var26_19, var3_3);
                                var13_14 = var7_10;
                                var15_15 = var11_12;

                            }
                            case 1: {
                                var15_15 = y72.a(var26_19, var3_3);
                                var13_14 = var7_10;
                                var17_16 = var9_11;
lbl103:

                                var25_18 = var22_6 /* !! */ ;
                                var23_17 /* !! */  = var21_7 /* !! */ ;
                                break block36;
                            }
                            case 0: 
                        }
                        var25_18 = var22_6 /* !! */ ;
                        var23_17 /* !! */  = var21_7 /* !! */ ;
                        var13_14 = var7_10;
                        var17_16 = var9_11;
                        var15_15 = var11_12;
                        if (var2_2.containsKey(var26_19)) {
                            var24_8 = var26_19;
                            var15_15 = var11_12;
                            var17_16 = var9_11;
                            var13_14 = var7_10;
                            var23_17 /* !! */  = var21_7 /* !! */ ;
                            var25_18 = var22_6 /* !! */ ;
                        }
                    }
                    var22_6 /* !! */  = var25_18;
                    var21_7 /* !! */  = var23_17 /* !! */ ;
                    var7_10 = var13_14;
                    var9_11 = var17_16;
                    var11_12 = var15_15;
                }
                if (var1_1 == null) break block37;
                var19_20 = var1_1.d;
                var17_16 = var7_10;
                var13_14 = var9_11;
                if (var19_20 != -9223372036854775807L) {
                    var15_15 = var7_10;
                    if (var7_10 != -9223372036854775807L) {
                        var15_15 = var7_10 + var19_20;
                    }
                    var17_16 = var15_15;
                    var13_14 = var9_11;
                    if (var9_11 != -9223372036854775807L) {
                        var13_14 = var9_11 + var19_20;
                        var17_16 = var15_15;
                    }
                }
                break block38;
            }
            var17_16 = var7_10;
            var13_14 = var9_11;
        }
        if (var13_14 == -9223372036854775807L) {
            if (var11_12 != -9223372036854775807L) {
                var7_10 = var17_16 + var11_12;
                return z72.a((String)var0.getName(), (long)var17_16, (long)var7_10, (c82)var27_5, var22_6 /* !! */ , (String)var24_8, var21_7 /* !! */ , (z72)var1_1);
            }
            if (var1_1 != null && (var7_10 = var1_1.e) != -9223372036854775807L) {
                return z72.a((String)var0.getName(), (long)var17_16, (long)var7_10, (c82)var27_5, var22_6 /* !! */ , (String)var24_8, var21_7 /* !! */ , (z72)var1_1);
            }
        }
        var7_10 = var13_14;
        return z72.a((String)var0.getName(), (long)var17_16, (long)var7_10, (c82)var27_5, var22_6 /* !! */ , (String)var24_8, var21_7 /* !! */ , (z72)var1_1);
    }

    private static void a(String charSequence, c82 object) throws s32 {
        Object object2;
        block16: {
            int n10;
            block15: {
                block14: {
                    n10 = m92.a;
                    n10 = -1;
                    object2 = ((String)charSequence).split("\\s+", -1);
                    if (((String[])object2).length != 1) break block14;
                    object2 = p.matcher(charSequence);
                    break block15;
                }
                if (((String[])object2).length != 2) break block16;
                object2 = p.matcher((CharSequence)object2[1]);
                zs0.d((String)"TtmlDecoder", (String)"Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
            }
            if (((Matcher)object2).matches()) {
                charSequence = ((Matcher)object2).group(3);
                charSequence.getClass();
                switch (((String)charSequence).hashCode()) {
                    default: {
                        break;
                    }
                    case 3592: {
                        if (!((String)charSequence).equals("px")) break;
                        n10 = 2;
                        break;
                    }
                    case 3240: {
                        if (!((String)charSequence).equals("em")) break;
                        n10 = 1;
                        break;
                    }
                    case 37: {
                        if (!((String)charSequence).equals("%")) break;
                        n10 = 0;
                    }
                }
                switch (n10) {
                    default: {
                        object = new StringBuilder("Invalid unit for fontSize: '");
                        ((StringBuilder)object).append((String)charSequence);
                        ((StringBuilder)object).append("'.");
                        throw new s32(((StringBuilder)object).toString());
                    }
                    case 2: {
                        object.c(1);
                        break;
                    }
                    case 1: {
                        object.c(2);
                        break;
                    }
                    case 0: {
                        object.c(3);
                    }
                }
                charSequence = ((Matcher)object2).group(1);
                charSequence.getClass();
                object.a(Float.parseFloat((String)charSequence));
                return;
            }
            object = new StringBuilder("Invalid expression for fontSize: '");
            ((StringBuilder)object).append((String)charSequence);
            ((StringBuilder)object).append("'.");
            throw new s32(((StringBuilder)object).toString());
        }
        charSequence = new StringBuilder("Invalid number of entries for fontSize: ");
        ((StringBuilder)charSequence).append(((Object)object2).length);
        ((StringBuilder)charSequence).append(".");
        throw new s32(((StringBuilder)charSequence).toString());
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(XmlPullParser xmlPullParser, HashMap hashMap, a a14, @Nullable c c11, HashMap hashMap2, HashMap hashMap3) throws IOException, XmlPullParserException {
        do {
            Object object;
            block36: {
                block49: {
                    block34: {
                        block37: {
                            Object object2;
                            block38: {
                                block40: {
                                    block41: {
                                        float f11;
                                        float f12;
                                        float f13;
                                        float f14;
                                        float f15;
                                        int n10;
                                        int n13;
                                        block47: {
                                            int n14;
                                            block48: {
                                                block46: {
                                                    block45: {
                                                        block43: {
                                                            block44: {
                                                                block35: {
                                                                    Object object3;
                                                                    Object object4;
                                                                    block42: {
                                                                        Object object5;
                                                                        block33: {
                                                                            Object object6;
                                                                            block39: {
                                                                                xmlPullParser.next();
                                                                                boolean bl2 = tl2.c((XmlPullParser)xmlPullParser, (String)"style");
                                                                                n13 = 0;
                                                                                if (bl2) {
                                                                                    object = tl2.a((XmlPullParser)xmlPullParser, (String)"style");
                                                                                    object2 = y72.a(xmlPullParser, new c82());
                                                                                    if (object != null) {
                                                                                        if ((object = object.trim()).isEmpty()) {
                                                                                            object = new a82[]{};
                                                                                        } else {
                                                                                            n10 = m92.a;
                                                                                            object = object.split("\\s+", -1);
                                                                                        }
                                                                                        n10 = ((String[])object).length;
                                                                                        while (n13 < n10) {
                                                                                            object2.a((c82)hashMap.get(object[n13]));
                                                                                            ++n13;
                                                                                        }
                                                                                    }
                                                                                    if ((object = object2.f()) == null) continue;
                                                                                    hashMap.put(object, object2);
                                                                                    continue;
                                                                                }
                                                                                if (!tl2.c((XmlPullParser)xmlPullParser, (String)"region")) break block36;
                                                                                object = tl2.a((XmlPullParser)xmlPullParser, (String)"id");
                                                                                if (object == null) break block34;
                                                                                object2 = tl2.a((XmlPullParser)xmlPullParser, (String)"origin");
                                                                                if (object2 == null) break block37;
                                                                                object4 = r;
                                                                                object5 = ((Pattern)object4).matcher((CharSequence)object2);
                                                                                object3 = s;
                                                                                object6 = ((Pattern)object3).matcher((CharSequence)object2);
                                                                                bl2 = ((Matcher)object5).matches();
                                                                                n14 = 2;
                                                                                if (bl2) {
                                                                                    try {
                                                                                        object6 = ((Matcher)object5).group(1);
                                                                                        object6.getClass();
                                                                                        f15 = Float.parseFloat((String)object6) / 100.0f;
                                                                                        object5 = ((Matcher)object5).group(2);
                                                                                        object5.getClass();
                                                                                        f14 = Float.parseFloat((String)object5);
                                                                                        f14 /= 100.0f;
                                                                                        break block33;
                                                                                    }
                                                                                    catch (NumberFormatException numberFormatException) {
                                                                                        zs0.d((String)"TtmlDecoder", (String)"Ignoring region with malformed origin: ".concat((String)object2));
                                                                                        break block34;
                                                                                    }
                                                                                }
                                                                                if (!((Matcher)object6).matches()) break block38;
                                                                                if (c11 != null) break block39;
                                                                                zs0.d((String)"TtmlDecoder", (String)"Ignoring region with missing tts:extent: ".concat((String)object2));
                                                                                break block34;
                                                                            }
                                                                            object5 = ((Matcher)object6).group(1);
                                                                            object5.getClass();
                                                                            n13 = Integer.parseInt((String)object5);
                                                                            object5 = ((Matcher)object6).group(2);
                                                                            object5.getClass();
                                                                            n10 = Integer.parseInt((String)object5);
                                                                            f15 = (float)n13 / (float)c11.a;
                                                                            f14 = n10;
                                                                            n13 = c11.b;
                                                                            f14 /= (float)n13;
                                                                        }
                                                                        object5 = tl2.a((XmlPullParser)xmlPullParser, (String)"extent");
                                                                        if (object5 == null) break block40;
                                                                        object4 = ((Pattern)object4).matcher((CharSequence)object5);
                                                                        object3 = ((Pattern)object3).matcher((CharSequence)object5);
                                                                        if (((Matcher)object4).matches()) {
                                                                            try {
                                                                                object3 = ((Matcher)object4).group(1);
                                                                                object3.getClass();
                                                                                f13 = Float.parseFloat((String)object3) / 100.0f;
                                                                                object3 = ((Matcher)object4).group(2);
                                                                                object3.getClass();
                                                                                f12 = Float.parseFloat((String)object3);
                                                                                f12 /= 100.0f;
                                                                                break block35;
                                                                            }
                                                                            catch (NumberFormatException numberFormatException) {
                                                                                zs0.d((String)"TtmlDecoder", (String)"Ignoring region with malformed extent: ".concat((String)object2));
                                                                                break block34;
                                                                            }
                                                                        }
                                                                        if (!((Matcher)object3).matches()) break block41;
                                                                        if (c11 != null) break block42;
                                                                        zs0.d((String)"TtmlDecoder", (String)"Ignoring region with missing tts:extent: ".concat((String)object2));
                                                                        break block34;
                                                                    }
                                                                    object4 = ((Matcher)object3).group(1);
                                                                    object4.getClass();
                                                                    n10 = Integer.parseInt((String)object4);
                                                                    object3 = ((Matcher)object3).group(2);
                                                                    object3.getClass();
                                                                    n13 = Integer.parseInt((String)object3);
                                                                    f13 = (float)n10 / (float)c11.a;
                                                                    f12 = n13;
                                                                    try {
                                                                        n13 = c11.b;
                                                                        f12 /= (float)n13;
                                                                    }
                                                                    catch (NumberFormatException numberFormatException) {
                                                                        zs0.d((String)"TtmlDecoder", (String)"Ignoring region with malformed extent: ".concat((String)object2));
                                                                    }
                                                                }
                                                                object2 = tl2.a((XmlPullParser)xmlPullParser, (String)"displayAlign");
                                                                if (object2 == null) break block43;
                                                                object2 = sf.b((String)object2);
                                                                object2.getClass();
                                                                if (((String)object2).equals("center")) break block44;
                                                                if (!((String)object2).equals("after")) break block43;
                                                                f14 += f12;
                                                                n10 = 2;
                                                                break block45;
                                                            }
                                                            f14 = f12 / 2.0f + f14;
                                                            n10 = 1;
                                                            break block45;
                                                        }
                                                        n10 = 0;
                                                    }
                                                    f11 = 1.0f / (float)a14.a;
                                                    object2 = tl2.a((XmlPullParser)xmlPullParser, (String)"writingMode");
                                                    if (object2 == null) break block46;
                                                    object2 = sf.b((String)object2);
                                                    object2.getClass();
                                                    int n15 = -1;
                                                    switch (((String)object2).hashCode()) {
                                                        case 3553576: {
                                                            if (!((String)object2).equals("tbrl")) break;
                                                            n15 = 1;
                                                            break;
                                                        }
                                                        case 3553396: {
                                                            if (!((String)object2).equals("tblr")) break;
                                                            n15 = 2;
                                                            break;
                                                        }
                                                        case 3694: {
                                                            if (!((String)object2).equals("tb")) break;
                                                            n15 = 3;
                                                            break;
                                                        }
                                                    }
                                                    switch (n15) {
                                                        default: {
                                                            n13 = -1;
                                                            break;
                                                        }
                                                        case 1: {
                                                            n13 = 2;
                                                            break;
                                                        }
                                                        case 2: {
                                                            n13 = 1;
                                                            break;
                                                        }
                                                        case 3: {
                                                            n13 = 0;
                                                        }
                                                    }
                                                    switch (n13) {
                                                        default: {
                                                            break;
                                                        }
                                                        case 2: {
                                                            n13 = 1;
                                                            break block47;
                                                        }
                                                        case 0: 
                                                        case 1: {
                                                            break block48;
                                                        }
                                                    }
                                                }
                                                n14 = Integer.MIN_VALUE;
                                            }
                                            n13 = n14;
                                        }
                                        object = new a82((String)object, f15, f14, 0, n10, f13, f12, 1, f11, n13);
                                        break block49;
                                        break block34;
                                    }
                                    zs0.d((String)"TtmlDecoder", (String)"Ignoring region with unsupported extent: ".concat((String)object2));
                                    break block34;
                                }
                                zs0.d((String)"TtmlDecoder", (String)"Ignoring region without an extent");
                                break block34;
        // Removed invalid catch block
                                }
                                break block34;
                            }
                            zs0.d((String)"TtmlDecoder", (String)"Ignoring region with unsupported origin: ".concat((String)object2));
                            break block34;
                        }
                        zs0.d((String)"TtmlDecoder", (String)"Ignoring region without an origin");
                    }
                    object = null;
                }
                if (object == null) continue;
                hashMap2.put(object.a, object);
                continue;
            }
            if (!tl2.c((XmlPullParser)xmlPullParser, (String)"metadata")) continue;
            do {
                xmlPullParser.next();
                if (!tl2.c((XmlPullParser)xmlPullParser, (String)"image") || (object = tl2.a((XmlPullParser)xmlPullParser, (String)"id")) == null) continue;
                hashMap3.put(object, xmlPullParser.nextText());
            } while (!tl2.b((XmlPullParser)xmlPullParser, (String)"metadata"));
        } while (!tl2.b((XmlPullParser)xmlPullParser, (String)"head"));
    }

    private static boolean a(String string2) {
        boolean bl2 = string2.equals("tt") || string2.equals("head") || string2.equals("body") || string2.equals("div") || string2.equals("p") || string2.equals("span") || string2.equals("br") || string2.equals("style") || string2.equals("styling") || string2.equals("layout") || string2.equals("region") || string2.equals("metadata") || string2.equals("image") || string2.equals("data") || string2.equals("information");
        return bl2;
    }

    @Nullable
    private static Layout.Alignment b(String string2) {
        string2 = sf.b((String)string2);
        string2.getClass();
        int n10 = string2.hashCode();
        int n13 = -1;
        switch (n10) {
            default: {
                break;
            }
            case 109757538: {
                if (!string2.equals("start")) break;
                n13 = 4;
                break;
            }
            case 108511772: {
                if (!string2.equals("right")) break;
                n13 = 3;
                break;
            }
            case 3317767: {
                if (!string2.equals("left")) break;
                n13 = 2;
                break;
            }
            case 100571: {
                if (!string2.equals("end")) break;
                n13 = 1;
                break;
            }
            case -1364013995: {
                if (!string2.equals("center")) break;
                n13 = 0;
            }
        }
        switch (n13) {
            default: {
                return null;
            }
            case 2: 
            case 4: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            case 1: 
            case 3: {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            case 0: 
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    @Nullable
    private static c b(XmlPullParser object) {
        if ((object = tl2.a((XmlPullParser)object, (String)"extent")) == null) {
            return null;
        }
        Matcher matcher = s.matcher((CharSequence)object);
        if (!matcher.matches()) {
            zs0.d((String)"TtmlDecoder", (String)"Ignoring non-pixel tts extent: ".concat((String)object));
            return null;
        }
        try {
            String string2 = matcher.group(1);
            string2.getClass();
            int n10 = Integer.parseInt(string2);
            string2 = matcher.group(2);
            string2.getClass();
            string2 = new /* Unavailable Anonymous Inner Class!! */;
            return string2;
        }
        catch (NumberFormatException numberFormatException) {
            zs0.d((String)"TtmlDecoder", (String)"Ignoring malformed tts extent: ".concat((String)object));
            return null;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final q32 a(byte[] var1_1, int var2_4, boolean var3_5) throws s32 {
        block21: {
            block25: {
                block18: {
                    block19: {
                        block23: {
                            block22: {
                                block24: {
                                    block20: {
                                        try {
                                            var13_6 = this.m.newPullParser();
                                            var15_7 = new HashMap<K, V>();
                                            var16_8 = new HashMap<String, a82>();
                                            var14_9 = new HashMap<K, V>();
                                            var6_10 /* !! */  = new a82("", -3.4028235E38f, -3.4028235E38f, -2147483648, -2147483648, -3.4028235E38f, -3.4028235E38f, -2147483648, -3.4028235E38f, -2147483648);
                                            var16_8.put("", var6_10 /* !! */ );
                                            var6_10 /* !! */  = new ByteArrayInputStream(var1_1 /* !! */ , 0, var2_4);
                                            var7_11 /* !! */  = null;
                                            var13_6.setInput((InputStream)var6_10 /* !! */ , null);
                                            var17_12 = new ArrayDeque<String>();
                                            var5_13 = var13_6.getEventType();
                                            var6_10 /* !! */  = y72.u;
                                            var1_1 /* !! */  = (byte[])y72.v;
                                            var4_14 = 0;
                                            var8_15 = null;
lbl18:

                                            while (var5_13 != 1) {
                                                var9_16 = (z72)var17_12.peek();
                                                if (var4_14 != 0) break block18;
                                                var10_18 = var13_6.getName();
                                                if (var5_13 != 2) break block19;
                                                if ("tt".equals(var10_18)) {
                                                    var6_10 /* !! */  = y72.a(var13_6);
                                                    var1_1 /* !! */  = (byte[])y72.a(var13_6, y72.v);
                                                    var7_11 /* !! */  = y72.b(var13_6);
                                                }
                                                break block20;
                                            }
                                            break block21;
                                        }
        // Removed invalid catch block
                                        }
        // Removed invalid catch block
                                        }
                                    }
                                    var3_5 = y72.a(var10_18);
                                    if (var3_5) break block24;
                                    var9_16 = new StringBuilder();
                                    var9_16.append("Ignoring unsupported tag: ");
                                    var9_16.append(var13_6.getName());
                                    zs0.c((String)"TtmlDecoder", (String)var9_16.toString());

                                }
                                if ("head".equals(var10_18)) {
                                    y72.a(var13_6, var15_7, var1_1 /* !! */ , var7_11 /* !! */ , var16_8, var14_9);
                                } else {
                                    try {
                                        var10_18 = y72.a(var13_6, (z72)var9_16, var16_8, var6_10 /* !! */ );
                                        var17_12.push(var10_18);
                                        if (var9_16 == null) break block22;
                                        var9_16.a((z72)var10_18);
                                    }
                                    catch (s32 var9_17) {
                                        break block23;
                                    }
                                }
                            }
                            var9_16 = var7_11 /* !! */ ;
                            var10_18 = var6_10 /* !! */ ;
                            var11_19 /* !! */  = var1_1 /* !! */ ;
                            var2_4 = var4_14;
                            var12_20 = var8_15;
                            break block25;
                        }
                        zs0.b((String)"TtmlDecoder", (String)"Suppressing parser error", (Throwable)var9_17);

                    }
                    if (var5_13 == 4) {
                        var9_16.getClass();
                        var9_16.a(z72.a((String)var13_6.getText()));
                        var9_16 = var7_11 /* !! */ ;
                        var10_18 = var6_10 /* !! */ ;
                        var11_19 /* !! */  = var1_1 /* !! */ ;
                        var2_4 = var4_14;
                        var12_20 = var8_15;
                        break block25;
                    } else {
                        var9_16 = var7_11 /* !! */ ;
                        var10_18 = var6_10 /* !! */ ;
                        var11_19 /* !! */  = var1_1 /* !! */ ;
                        var2_4 = var4_14;
                        var12_20 = var8_15;
                        if (var5_13 == 3) {
                            if (var13_6.getName().equals("tt")) {
                                var9_16 = (z72)var17_12.peek();
                                var9_16.getClass();
                                var8_15 = new d82((z72)var9_16, var15_7, var16_8, var14_9);
                            }
                            var17_12.pop();
                            var9_16 = var7_11 /* !! */ ;
                            var10_18 = var6_10 /* !! */ ;
                            var11_19 /* !! */  = var1_1 /* !! */ ;
                            var2_4 = var4_14;
                            var12_20 = var8_15;
                        }
                    }
                    break block25;
                }
                if (var5_13 == 2) // 3 sources

                {
                    var2_4 = var4_14 + 1;
                    var9_16 = var7_11 /* !! */ ;
                    var10_18 = var6_10 /* !! */ ;
                    var11_19 /* !! */  = var1_1 /* !! */ ;
                    var12_20 = var8_15;
                } else {
                    var9_16 = var7_11 /* !! */ ;
                    var10_18 = var6_10 /* !! */ ;
                    var11_19 /* !! */  = var1_1 /* !! */ ;
                    var2_4 = var4_14;
                    var12_20 = var8_15;
                    if (var5_13 == 3) {
                        var2_4 = var4_14 - 1;
                        var12_20 = var8_15;
                        var11_19 /* !! */  = var1_1 /* !! */ ;
                        var10_18 = var6_10 /* !! */ ;
                        var9_16 = var7_11 /* !! */ ;
                    }
                }
            }
            var13_6.next();
            var5_13 = var13_6.getEventType();
            var7_11 /* !! */  = var9_16;
            var6_10 /* !! */  = var10_18;
            var1_1 /* !! */  = var11_19 /* !! */ ;
            var4_14 = var2_4;
            var8_15 = var12_20;

        }
        if (var8_15 != null) {
            return var8_15;
        }
        var1_1 /* !! */  = (byte[])new s32;
        var1_1 /* !! */ ("No TTML subtitles found");
        throw var1_1 /* !! */ ;
    }
}


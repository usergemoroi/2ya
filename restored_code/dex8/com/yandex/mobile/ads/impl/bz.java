/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bd1
 *  com.yandex.mobile.ads.impl.bd1$b
 *  com.yandex.mobile.ads.impl.bz$a
 *  com.yandex.mobile.ads.impl.fi
 *  com.yandex.mobile.ads.impl.fi$a$a
 *  com.yandex.mobile.ads.impl.i02
 *  com.yandex.mobile.ads.impl.k72
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.pv
 *  com.yandex.mobile.ads.impl.xo
 *  com.yandex.mobile.ads.impl.yj0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.b42;
import com.yandex.mobile.ads.impl.bd1;
import com.yandex.mobile.ads.impl.bz;
import com.yandex.mobile.ads.impl.fi;
import com.yandex.mobile.ads.impl.i02;
import com.yandex.mobile.ads.impl.k72;
import com.yandex.mobile.ads.impl.lr2;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.xc;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.xo;
import com.yandex.mobile.ads.impl.yj0;
import java.util.HashMap;

/*
 * Exception performing whole class analysis ignored.
 */
public final class bz
implements fi,
k72 {
    public static final xj0<Long> n;
    public static final xj0<Long> o;
    public static final xj0<Long> p;
    public static final xj0<Long> q;
    public static final xj0<Long> r;
    public static final xj0<Long> s;
    @Nullable
    private static bz t;
    private final yj0<Integer, Long> a;
    private final fi.a.a b;
    private final i02 c;
    private final xo d;
    private final boolean e;
    private int f;
    private long g;
    private long h;
    private int i;
    private long j;
    private long k;
    private long l;
    private long m;

    static {
        Long l10 = 1500000L;
        n = xj0.a(4800000L, 3100000L, 0x200B20L, l10, 800000L);
        Long l11 = 1000000L;
        o = xj0.a(l10, l11, 730000L, 440000L, 170000L);
        l10 = 1400000L;
        Long l13 = 1100000L;
        p = xj0.a(2200000L, l10, l13, 910000L, 620000L);
        q = xj0.a(3000000L, 1900000L, l10, l11, 660000L);
        r = xj0.a(6000000L, 4100000L, 3200000L, 1800000L, l11);
        s = xj0.a(2800000L, 2400000L, 1600000L, l13, 950000L);
    }

    private bz(@Nullable Context context, HashMap hashMap, int n10, b42 b422, boolean bl2) {
        this.a = yj0.a((HashMap)hashMap);
        this.b = new fi.a.a();
        this.c = new i02(n10);
        this.d = b422;
        this.e = bl2;
        if (context != null) {
            context = bd1.a((Context)context);
            this.i = n10 = context.a();
            this.l = this.a(n10);
            context.b((bd1.b)new lr2(this));
        } else {
            this.i = 0;
            this.l = this.a(0);
        }
    }

    private long a(int n10) {
        Long l10;
        Long l11 = l10 = (Long)this.a.get((Object)n10);
        if (l10 == null) {
            l11 = (Long)this.a.get((Object)0);
        }
        l10 = l11;
        if (l11 == null) {
            l10 = 1000000L;
        }
        return l10;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static bz a(Context object) {
        synchronized (bz.class) {
            try {
                if (t != null) return t;
                Context context = object == null ? null : object.getApplicationContext();
                HashMap hashMap = com.yandex.mobile.ads.impl.bz$a.b((String)m92.b((Context)object));
                b42 b422 = xo.a;
                object = new bz(context, hashMap, 2000, b422, true);
                t = object;
                return t;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static /* synthetic */ void a(bz bz3, int n10) {
        bz3.b(n10);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static int[] a(String string2) {
        int n10 = 0;
        string2.getClass();
        int n12 = -1;
        switch (string2.hashCode()) {
            case 2877: {
                if (!string2.equals("ZW")) break;
                n12 = 1;
                break;
            }
            case 2867: {
                if (!string2.equals("ZM")) break;
                n12 = 2;
                break;
            }
            case 2855: {
                if (!string2.equals("ZA")) break;
                n12 = 3;
                break;
            }
            case 2843: {
                if (!string2.equals("YT")) break;
                n12 = 4;
                break;
            }
            case 2828: {
                if (!string2.equals("YE")) break;
                n12 = 5;
                break;
            }
            case 2803: {
                if (!string2.equals("XK")) break;
                n12 = 6;
                break;
            }
            case 2780: {
                if (!string2.equals("WS")) break;
                n12 = 7;
                break;
            }
            case 2767: {
                if (!string2.equals("WF")) break;
                n12 = 8;
                break;
            }
            case 2751: {
                if (!string2.equals("VU")) break;
                n12 = 9;
                break;
            }
            case 2744: {
                if (!string2.equals("VN")) break;
                n12 = 10;
                break;
            }
            case 2739: {
                if (!string2.equals("VI")) break;
                n12 = 11;
                break;
            }
            case 2737: {
                if (!string2.equals("VG")) break;
                n12 = 12;
                break;
            }
            case 2735: {
                if (!string2.equals("VE")) break;
                n12 = 13;
                break;
            }
            case 2733: {
                if (!string2.equals("VC")) break;
                n12 = 14;
                break;
            }
            case 2731: {
                if (!string2.equals("VA")) break;
                n12 = 15;
                break;
            }
            case 2725: {
                if (!string2.equals("UZ")) break;
                n12 = 16;
                break;
            }
            case 2724: {
                if (!string2.equals("UY")) break;
                n12 = 17;
                break;
            }
            case 2718: {
                if (!string2.equals("US")) break;
                n12 = 18;
                break;
            }
            case 2706: {
                if (!string2.equals("UG")) break;
                n12 = 19;
                break;
            }
            case 2700: {
                if (!string2.equals("UA")) break;
                n12 = 20;
                break;
            }
            case 2694: {
                if (!string2.equals("TZ")) break;
                n12 = 21;
                break;
            }
            case 2691: {
                if (!string2.equals("TW")) break;
                n12 = 22;
                break;
            }
            case 2690: {
                if (!string2.equals("TV")) break;
                n12 = 23;
                break;
            }
            case 2688: {
                if (!string2.equals("TT")) break;
                n12 = 24;
                break;
            }
            case 2686: {
                if (!string2.equals("TR")) break;
                n12 = 25;
                break;
            }
            case 2683: {
                if (!string2.equals("TO")) break;
                n12 = 26;
                break;
            }
            case 2682: {
                if (!string2.equals("TN")) break;
                n12 = 27;
                break;
            }
            case 2681: {
                if (!string2.equals("TM")) break;
                n12 = 28;
                break;
            }
            case 2680: {
                if (!string2.equals("TL")) break;
                n12 = 29;
                break;
            }
            case 2679: {
                if (!string2.equals("TK")) break;
                n12 = 30;
                break;
            }
            case 2678: {
                if (!string2.equals("TJ")) break;
                n12 = 31;
                break;
            }
            case 2676: {
                if (!string2.equals("TH")) break;
                n12 = 32;
                break;
            }
            case 2675: {
                if (!string2.equals("TG")) break;
                n12 = 33;
                break;
            }
            case 2672: {
                if (!string2.equals("TD")) break;
                n12 = 34;
                break;
            }
            case 2671: {
                if (!string2.equals("TC")) break;
                n12 = 35;
                break;
            }
            case 2663: {
                if (!string2.equals("SZ")) break;
                n12 = 36;
                break;
            }
            case 2662: {
                if (!string2.equals("SY")) break;
                n12 = 37;
                break;
            }
            case 2661: {
                if (!string2.equals("SX")) break;
                n12 = 38;
                break;
            }
            case 2659: {
                if (!string2.equals("SV")) break;
                n12 = 39;
                break;
            }
            case 2657: {
                if (!string2.equals("ST")) break;
                n12 = 40;
                break;
            }
            case 2656: {
                if (!string2.equals("SS")) break;
                n12 = 41;
                break;
            }
            case 2655: {
                if (!string2.equals("SR")) break;
                n12 = 42;
                break;
            }
            case 2652: {
                if (!string2.equals("SO")) break;
                n12 = 43;
                break;
            }
            case 2651: {
                if (!string2.equals("SN")) break;
                n12 = 44;
                break;
            }
            case 2650: {
                if (!string2.equals("SM")) break;
                n12 = 45;
                break;
            }
            case 2649: {
                if (!string2.equals("SL")) break;
                n12 = 46;
                break;
            }
            case 2648: {
                if (!string2.equals("SK")) break;
                n12 = 47;
                break;
            }
            case 2646: {
                if (!string2.equals("SI")) break;
                n12 = 48;
                break;
            }
            case 2645: {
                if (!string2.equals("SH")) break;
                n12 = 49;
                break;
            }
            case 2644: {
                if (!string2.equals("SG")) break;
                n12 = 50;
                break;
            }
            case 2642: {
                if (!string2.equals("SE")) break;
                n12 = 51;
                break;
            }
            case 2641: {
                if (!string2.equals("SD")) break;
                n12 = 52;
                break;
            }
            case 2640: {
                if (!string2.equals("SC")) break;
                n12 = 53;
                break;
            }
            case 2639: {
                if (!string2.equals("SB")) break;
                n12 = 54;
                break;
            }
            case 2638: {
                if (!string2.equals("SA")) break;
                n12 = 55;
                break;
            }
            case 2629: {
                if (!string2.equals("RW")) break;
                n12 = 56;
                break;
            }
            case 2627: {
                if (!string2.equals("RU")) break;
                n12 = 57;
                break;
            }
            case 2625: {
                if (!string2.equals("RS")) break;
                n12 = 58;
                break;
            }
            case 2621: {
                if (!string2.equals("RO")) break;
                n12 = 59;
                break;
            }
            case 2611: {
                if (!string2.equals("RE")) break;
                n12 = 60;
                break;
            }
            case 2576: {
                if (!string2.equals("QA")) break;
                n12 = 61;
                break;
            }
            case 2567: {
                if (!string2.equals("PW")) break;
                n12 = 62;
                break;
            }
            case 2564: {
                if (!string2.equals("PT")) break;
                n12 = 63;
                break;
            }
            case 2563: {
                if (!string2.equals("PS")) break;
                n12 = 64;
                break;
            }
            case 2562: {
                if (!string2.equals("PR")) break;
                n12 = 65;
                break;
            }
            case 2557: {
                if (!string2.equals("PM")) break;
                n12 = 66;
                break;
            }
            case 2556: {
                if (!string2.equals("PL")) break;
                n12 = 67;
                break;
            }
            case 2555: {
                if (!string2.equals("PK")) break;
                n12 = 68;
                break;
            }
            case 2552: {
                if (!string2.equals("PH")) break;
                n12 = 69;
                break;
            }
            case 2551: {
                if (!string2.equals("PG")) break;
                n12 = 70;
                break;
            }
            case 2550: {
                if (!string2.equals("PF")) break;
                n12 = 71;
                break;
            }
            case 2549: {
                if (!string2.equals("PE")) break;
                n12 = 72;
                break;
            }
            case 2545: {
                if (!string2.equals("PA")) break;
                n12 = 73;
                break;
            }
            case 2526: {
                if (!string2.equals("OM")) break;
                n12 = 74;
                break;
            }
            case 2508: {
                if (!string2.equals("NZ")) break;
                n12 = 75;
                break;
            }
            case 2503: {
                if (!string2.equals("NU")) break;
                n12 = 76;
                break;
            }
            case 2500: {
                if (!string2.equals("NR")) break;
                n12 = 77;
                break;
            }
            case 2498: {
                if (!string2.equals("NP")) break;
                n12 = 78;
                break;
            }
            case 2497: {
                if (!string2.equals("NO")) break;
                n12 = 79;
                break;
            }
            case 2494: {
                if (!string2.equals("NL")) break;
                n12 = 80;
                break;
            }
            case 2491: {
                if (!string2.equals("NI")) break;
                n12 = 81;
                break;
            }
            case 2489: {
                if (!string2.equals("NG")) break;
                n12 = 82;
                break;
            }
            case 2487: {
                if (!string2.equals("NE")) break;
                n12 = 83;
                break;
            }
            case 2485: {
                if (!string2.equals("NC")) break;
                n12 = 84;
                break;
            }
            case 2483: {
                if (!string2.equals("NA")) break;
                n12 = 85;
                break;
            }
            case 2477: {
                if (!string2.equals("MZ")) break;
                n12 = 86;
                break;
            }
            case 2476: {
                if (!string2.equals("MY")) break;
                n12 = 87;
                break;
            }
            case 2475: {
                if (!string2.equals("MX")) break;
                n12 = 88;
                break;
            }
            case 2474: {
                if (!string2.equals("MW")) break;
                n12 = 89;
                break;
            }
            case 2473: {
                if (!string2.equals("MV")) break;
                n12 = 90;
                break;
            }
            case 2472: {
                if (!string2.equals("MU")) break;
                n12 = 91;
                break;
            }
            case 2471: {
                if (!string2.equals("MT")) break;
                n12 = 92;
                break;
            }
            case 2470: {
                if (!string2.equals("MS")) break;
                n12 = 93;
                break;
            }
            case 2469: {
                if (!string2.equals("MR")) break;
                n12 = 94;
                break;
            }
            case 2468: {
                if (!string2.equals("MQ")) break;
                n12 = 95;
                break;
            }
            case 2467: {
                if (!string2.equals("MP")) break;
                n12 = 96;
                break;
            }
            case 2466: {
                if (!string2.equals("MO")) break;
                n12 = 97;
                break;
            }
            case 2465: {
                if (!string2.equals("MN")) break;
                n12 = 98;
                break;
            }
            case 2464: {
                if (!string2.equals("MM")) break;
                n12 = 99;
                break;
            }
            case 2463: {
                if (!string2.equals("ML")) break;
                n12 = 100;
                break;
            }
            case 2462: {
                if (!string2.equals("MK")) break;
                n12 = 101;
                break;
            }
            case 2459: {
                if (!string2.equals("MH")) break;
                n12 = 102;
                break;
            }
            case 2458: {
                if (!string2.equals("MG")) break;
                n12 = 103;
                break;
            }
            case 2457: {
                if (!string2.equals("MF")) break;
                n12 = 104;
                break;
            }
            case 2456: {
                if (!string2.equals("ME")) break;
                n12 = 105;
                break;
            }
            case 2455: {
                if (!string2.equals("MD")) break;
                n12 = 106;
                break;
            }
            case 2454: {
                if (!string2.equals("MC")) break;
                n12 = 107;
                break;
            }
            case 2452: {
                if (!string2.equals("MA")) break;
                n12 = 108;
                break;
            }
            case 2445: {
                if (!string2.equals("LY")) break;
                n12 = 109;
                break;
            }
            case 2442: {
                if (!string2.equals("LV")) break;
                n12 = 110;
                break;
            }
            case 2441: {
                if (!string2.equals("LU")) break;
                n12 = 111;
                break;
            }
            case 2440: {
                if (!string2.equals("LT")) break;
                n12 = 112;
                break;
            }
            case 2439: {
                if (!string2.equals("LS")) break;
                n12 = 113;
                break;
            }
            case 2438: {
                if (!string2.equals("LR")) break;
                n12 = 114;
                break;
            }
            case 2431: {
                if (!string2.equals("LK")) break;
                n12 = 115;
                break;
            }
            case 2429: {
                if (!string2.equals("LI")) break;
                n12 = 116;
                break;
            }
            case 2423: {
                if (!string2.equals("LC")) break;
                n12 = 117;
                break;
            }
            case 2422: {
                if (!string2.equals("LB")) break;
                n12 = 118;
                break;
            }
            case 2421: {
                if (!string2.equals("LA")) break;
                n12 = 119;
                break;
            }
            case 2415: {
                if (!string2.equals("KZ")) break;
                n12 = 120;
                break;
            }
            case 2414: {
                if (!string2.equals("KY")) break;
                n12 = 121;
                break;
            }
            case 2412: {
                if (!string2.equals("KW")) break;
                n12 = 122;
                break;
            }
            case 2407: {
                if (!string2.equals("KR")) break;
                n12 = 123;
                break;
            }
            case 2405: {
                if (!string2.equals("KP")) break;
                n12 = 124;
                break;
            }
            case 2403: {
                if (!string2.equals("KN")) break;
                n12 = 125;
                break;
            }
            case 2402: {
                if (!string2.equals("KM")) break;
                n12 = 126;
                break;
            }
            case 2398: {
                if (!string2.equals("KI")) break;
                n12 = 127;
                break;
            }
            case 2397: {
                if (!string2.equals("KH")) break;
                n12 = 128;
                break;
            }
            case 2396: {
                if (!string2.equals("KG")) break;
                n12 = 129;
                break;
            }
            case 2394: {
                if (!string2.equals("KE")) break;
                n12 = 130;
                break;
            }
            case 2374: {
                if (!string2.equals("JP")) break;
                n12 = 131;
                break;
            }
            case 2373: {
                if (!string2.equals("JO")) break;
                n12 = 132;
                break;
            }
            case 2371: {
                if (!string2.equals("JM")) break;
                n12 = 133;
                break;
            }
            case 2363: {
                if (!string2.equals("JE")) break;
                n12 = 134;
                break;
            }
            case 2347: {
                if (!string2.equals("IT")) break;
                n12 = 135;
                break;
            }
            case 2346: {
                if (!string2.equals("IS")) break;
                n12 = 136;
                break;
            }
            case 2345: {
                if (!string2.equals("IR")) break;
                n12 = 137;
                break;
            }
            case 2344: {
                if (!string2.equals("IQ")) break;
                n12 = 138;
                break;
            }
            case 2342: {
                if (!string2.equals("IO")) break;
                n12 = 139;
                break;
            }
            case 2341: {
                if (!string2.equals("IN")) break;
                n12 = 140;
                break;
            }
            case 2340: {
                if (!string2.equals("IM")) break;
                n12 = 141;
                break;
            }
            case 2339: {
                if (!string2.equals("IL")) break;
                n12 = 142;
                break;
            }
            case 2332: {
                if (!string2.equals("IE")) break;
                n12 = 143;
                break;
            }
            case 2331: {
                if (!string2.equals("ID")) break;
                n12 = 144;
                break;
            }
            case 2317: {
                if (!string2.equals("HU")) break;
                n12 = 145;
                break;
            }
            case 2316: {
                if (!string2.equals("HT")) break;
                n12 = 146;
                break;
            }
            case 2314: {
                if (!string2.equals("HR")) break;
                n12 = 147;
                break;
            }
            case 2307: {
                if (!string2.equals("HK")) break;
                n12 = 148;
                break;
            }
            case 2290: {
                if (!string2.equals("GY")) break;
                n12 = 149;
                break;
            }
            case 2288: {
                if (!string2.equals("GW")) break;
                n12 = 150;
                break;
            }
            case 2286: {
                if (!string2.equals("GU")) break;
                n12 = 151;
                break;
            }
            case 2285: {
                if (!string2.equals("GT")) break;
                n12 = 152;
                break;
            }
            case 2283: {
                if (!string2.equals("GR")) break;
                n12 = 153;
                break;
            }
            case 2282: {
                if (!string2.equals("GQ")) break;
                n12 = 154;
                break;
            }
            case 2281: {
                if (!string2.equals("GP")) break;
                n12 = 155;
                break;
            }
            case 2279: {
                if (!string2.equals("GN")) break;
                n12 = 156;
                break;
            }
            case 2278: {
                if (!string2.equals("GM")) break;
                n12 = 157;
                break;
            }
            case 2277: {
                if (!string2.equals("GL")) break;
                n12 = 158;
                break;
            }
            case 2274: {
                if (!string2.equals("GI")) break;
                n12 = 159;
                break;
            }
            case 2273: {
                if (!string2.equals("GH")) break;
                n12 = 160;
                break;
            }
            case 2272: {
                if (!string2.equals("GG")) break;
                n12 = 161;
                break;
            }
            case 2271: {
                if (!string2.equals("GF")) break;
                n12 = 162;
                break;
            }
            case 2270: {
                if (!string2.equals("GE")) break;
                n12 = 163;
                break;
            }
            case 2269: {
                if (!string2.equals("GD")) break;
                n12 = 164;
                break;
            }
            case 2267: {
                if (!string2.equals("GB")) break;
                n12 = 165;
                break;
            }
            case 2266: {
                if (!string2.equals("GA")) break;
                n12 = 166;
                break;
            }
            case 2252: {
                if (!string2.equals("FR")) break;
                n12 = 167;
                break;
            }
            case 2249: {
                if (!string2.equals("FO")) break;
                n12 = 168;
                break;
            }
            case 2247: {
                if (!string2.equals("FM")) break;
                n12 = 169;
                break;
            }
            case 2245: {
                if (!string2.equals("FK")) break;
                n12 = 170;
                break;
            }
            case 2244: {
                if (!string2.equals("FJ")) break;
                n12 = 171;
                break;
            }
            case 2243: {
                if (!string2.equals("FI")) break;
                n12 = 172;
                break;
            }
            case 2223: {
                if (!string2.equals("ET")) break;
                n12 = 173;
                break;
            }
            case 2222: {
                if (!string2.equals("ES")) break;
                n12 = 174;
                break;
            }
            case 2221: {
                if (!string2.equals("ER")) break;
                n12 = 175;
                break;
            }
            case 2210: {
                if (!string2.equals("EG")) break;
                n12 = 176;
                break;
            }
            case 2208: {
                if (!string2.equals("EE")) break;
                n12 = 177;
                break;
            }
            case 2206: {
                if (!string2.equals("EC")) break;
                n12 = 178;
                break;
            }
            case 2198: {
                if (!string2.equals("DZ")) break;
                n12 = 179;
                break;
            }
            case 2187: {
                if (!string2.equals("DO")) break;
                n12 = 180;
                break;
            }
            case 2185: {
                if (!string2.equals("DM")) break;
                n12 = 181;
                break;
            }
            case 2183: {
                if (!string2.equals("DK")) break;
                n12 = 182;
                break;
            }
            case 2182: {
                if (!string2.equals("DJ")) break;
                n12 = 183;
                break;
            }
            case 2177: {
                if (!string2.equals("DE")) break;
                n12 = 184;
                break;
            }
            case 2167: {
                if (!string2.equals("CZ")) break;
                n12 = 185;
                break;
            }
            case 2166: {
                if (!string2.equals("CY")) break;
                n12 = 186;
                break;
            }
            case 2165: {
                if (!string2.equals("CX")) break;
                n12 = 187;
                break;
            }
            case 2164: {
                if (!string2.equals("CW")) break;
                n12 = 188;
                break;
            }
            case 2163: {
                if (!string2.equals("CV")) break;
                n12 = 189;
                break;
            }
            case 2162: {
                if (!string2.equals("CU")) break;
                n12 = 190;
                break;
            }
            case 2159: {
                if (!string2.equals("CR")) break;
                n12 = 191;
                break;
            }
            case 2156: {
                if (!string2.equals("CO")) break;
                n12 = 192;
                break;
            }
            case 2155: {
                if (!string2.equals("CN")) break;
                n12 = 193;
                break;
            }
            case 2154: {
                if (!string2.equals("CM")) break;
                n12 = 194;
                break;
            }
            case 2153: {
                if (!string2.equals("CL")) break;
                n12 = 195;
                break;
            }
            case 2152: {
                if (!string2.equals("CK")) break;
                n12 = 196;
                break;
            }
            case 2150: {
                if (!string2.equals("CI")) break;
                n12 = 197;
                break;
            }
            case 2149: {
                if (!string2.equals("CH")) break;
                n12 = 198;
                break;
            }
            case 2148: {
                if (!string2.equals("CG")) break;
                n12 = 199;
                break;
            }
            case 2147: {
                if (!string2.equals("CF")) break;
                n12 = 200;
                break;
            }
            case 2145: {
                if (!string2.equals("CD")) break;
                n12 = 201;
                break;
            }
            case 2142: {
                if (!string2.equals("CA")) break;
                n12 = 202;
                break;
            }
            case 2136: {
                if (!string2.equals("BZ")) break;
                n12 = 203;
                break;
            }
            case 2135: {
                if (!string2.equals("BY")) break;
                n12 = 204;
                break;
            }
            case 2133: {
                if (!string2.equals("BW")) break;
                n12 = 205;
                break;
            }
            case 2130: {
                if (!string2.equals("BT")) break;
                n12 = 206;
                break;
            }
            case 2129: {
                if (!string2.equals("BS")) break;
                n12 = 207;
                break;
            }
            case 2127: {
                if (!string2.equals("BQ")) break;
                n12 = 208;
                break;
            }
            case 2125: {
                if (!string2.equals("BO")) break;
                n12 = 209;
                break;
            }
            case 2124: {
                if (!string2.equals("BN")) break;
                n12 = 210;
                break;
            }
            case 2123: {
                if (!string2.equals("BM")) break;
                n12 = 211;
                break;
            }
            case 2122: {
                if (!string2.equals("BL")) break;
                n12 = 212;
                break;
            }
            case 2120: {
                if (!string2.equals("BJ")) break;
                n12 = 213;
                break;
            }
            case 2119: {
                if (!string2.equals("BI")) break;
                n12 = 214;
                break;
            }
            case 2118: {
                if (!string2.equals("BH")) break;
                n12 = 215;
                break;
            }
            case 2117: {
                if (!string2.equals("BG")) break;
                n12 = 216;
                break;
            }
            case 2116: {
                if (!string2.equals("BF")) break;
                n12 = 217;
                break;
            }
            case 2115: {
                if (!string2.equals("BE")) break;
                n12 = 218;
                break;
            }
            case 2114: {
                if (!string2.equals("BD")) break;
                n12 = 219;
                break;
            }
            case 2112: {
                if (!string2.equals("BB")) break;
                n12 = 220;
                break;
            }
            case 2111: {
                if (!string2.equals("BA")) break;
                n12 = 221;
                break;
            }
            case 2105: {
                if (!string2.equals("AZ")) break;
                n12 = 222;
                break;
            }
            case 2103: {
                if (!string2.equals("AX")) break;
                n12 = 223;
                break;
            }
            case 2102: {
                if (!string2.equals("AW")) break;
                n12 = 224;
                break;
            }
            case 2100: {
                if (!string2.equals("AU")) break;
                n12 = 225;
                break;
            }
            case 2099: {
                if (!string2.equals("AT")) break;
                n12 = 226;
                break;
            }
            case 2098: {
                if (!string2.equals("AS")) break;
                n12 = 227;
                break;
            }
            case 2097: {
                if (!string2.equals("AR")) break;
                n12 = 228;
                break;
            }
            case 2096: {
                if (!string2.equals("AQ")) break;
                n12 = 229;
                break;
            }
            case 2094: {
                if (!string2.equals("AO")) break;
                n12 = 230;
                break;
            }
            case 2092: {
                if (!string2.equals("AM")) break;
                n12 = 231;
                break;
            }
            case 2091: {
                if (!string2.equals("AL")) break;
                n12 = 232;
                break;
            }
            case 2088: {
                if (!string2.equals("AI")) break;
                n12 = 233;
                break;
            }
            case 2086: {
                if (!string2.equals("AG")) break;
                n12 = 234;
                break;
            }
            case 2085: {
                if (!string2.equals("AF")) break;
                n12 = 235;
                break;
            }
            case 2084: {
                if (!string2.equals("AE")) break;
                n12 = 236;
                break;
            }
            case 2083: {
                if (!string2.equals("AD")) break;
                n12 = 237;
                break;
            }
        }
        switch (n12) {
            default: {
                n10 = -1;
                break;
            }
            case 1: {
                n10 = 236;
                break;
            }
            case 2: {
                n10 = 235;
                break;
            }
            case 3: {
                n10 = 234;
                break;
            }
            case 4: {
                n10 = 233;
                break;
            }
            case 5: {
                n10 = 232;
                break;
            }
            case 6: {
                n10 = 231;
                break;
            }
            case 7: {
                n10 = 230;
                break;
            }
            case 8: {
                n10 = 229;
                break;
            }
            case 9: {
                n10 = 228;
                break;
            }
            case 10: {
                n10 = 227;
                break;
            }
            case 11: {
                n10 = 226;
                break;
            }
            case 12: {
                n10 = 225;
                break;
            }
            case 13: {
                n10 = 224;
                break;
            }
            case 14: {
                n10 = 223;
                break;
            }
            case 15: {
                n10 = 222;
                break;
            }
            case 16: {
                n10 = 221;
                break;
            }
            case 17: {
                n10 = 220;
                break;
            }
            case 18: {
                n10 = 219;
                break;
            }
            case 19: {
                n10 = 218;
                break;
            }
            case 20: {
                n10 = 217;
                break;
            }
            case 21: {
                n10 = 216;
                break;
            }
            case 22: {
                n10 = 215;
                break;
            }
            case 23: {
                n10 = 214;
                break;
            }
            case 24: {
                n10 = 213;
                break;
            }
            case 25: {
                n10 = 212;
                break;
            }
            case 26: {
                n10 = 211;
                break;
            }
            case 27: {
                n10 = 210;
                break;
            }
            case 28: {
                n10 = 209;
                break;
            }
            case 29: {
                n10 = 208;
                break;
            }
            case 30: {
                n10 = 207;
                break;
            }
            case 31: {
                n10 = 206;
                break;
            }
            case 32: {
                n10 = 205;
                break;
            }
            case 33: {
                n10 = 204;
                break;
            }
            case 34: {
                n10 = 203;
                break;
            }
            case 35: {
                n10 = 202;
                break;
            }
            case 36: {
                n10 = 201;
                break;
            }
            case 37: {
                n10 = 200;
                break;
            }
            case 38: {
                n10 = 199;
                break;
            }
            case 39: {
                n10 = 198;
                break;
            }
            case 40: {
                n10 = 197;
                break;
            }
            case 41: {
                n10 = 196;
                break;
            }
            case 42: {
                n10 = 195;
                break;
            }
            case 43: {
                n10 = 194;
                break;
            }
            case 44: {
                n10 = 193;
                break;
            }
            case 45: {
                n10 = 192;
                break;
            }
            case 46: {
                n10 = 191;
                break;
            }
            case 47: {
                n10 = 190;
                break;
            }
            case 48: {
                n10 = 189;
                break;
            }
            case 49: {
                n10 = 188;
                break;
            }
            case 50: {
                n10 = 187;
                break;
            }
            case 51: {
                n10 = 186;
                break;
            }
            case 52: {
                n10 = 185;
                break;
            }
            case 53: {
                n10 = 184;
                break;
            }
            case 54: {
                n10 = 183;
                break;
            }
            case 55: {
                n10 = 182;
                break;
            }
            case 56: {
                n10 = 181;
                break;
            }
            case 57: {
                n10 = 180;
                break;
            }
            case 58: {
                n10 = 179;
                break;
            }
            case 59: {
                n10 = 178;
                break;
            }
            case 60: {
                n10 = 177;
                break;
            }
            case 61: {
                n10 = 176;
                break;
            }
            case 62: {
                n10 = 175;
                break;
            }
            case 63: {
                n10 = 174;
                break;
            }
            case 64: {
                n10 = 173;
                break;
            }
            case 65: {
                n10 = 172;
                break;
            }
            case 66: {
                n10 = 171;
                break;
            }
            case 67: {
                n10 = 170;
                break;
            }
            case 68: {
                n10 = 169;
                break;
            }
            case 69: {
                n10 = 168;
                break;
            }
            case 70: {
                n10 = 167;
                break;
            }
            case 71: {
                n10 = 166;
                break;
            }
            case 72: {
                n10 = 165;
                break;
            }
            case 73: {
                n10 = 164;
                break;
            }
            case 74: {
                n10 = 163;
                break;
            }
            case 75: {
                n10 = 162;
                break;
            }
            case 76: {
                n10 = 161;
                break;
            }
            case 77: {
                n10 = 160;
                break;
            }
            case 78: {
                n10 = 159;
                break;
            }
            case 79: {
                n10 = 158;
                break;
            }
            case 80: {
                n10 = 157;
                break;
            }
            case 81: {
                n10 = 156;
                break;
            }
            case 82: {
                n10 = 155;
                break;
            }
            case 83: {
                n10 = 154;
                break;
            }
            case 84: {
                n10 = 153;
                break;
            }
            case 85: {
                n10 = 152;
                break;
            }
            case 86: {
                n10 = 151;
                break;
            }
            case 87: {
                n10 = 150;
                break;
            }
            case 88: {
                n10 = 149;
                break;
            }
            case 89: {
                n10 = 148;
                break;
            }
            case 90: {
                n10 = 147;
                break;
            }
            case 91: {
                n10 = 146;
                break;
            }
            case 92: {
                n10 = 145;
                break;
            }
            case 93: {
                n10 = 144;
                break;
            }
            case 94: {
                n10 = 143;
                break;
            }
            case 95: {
                n10 = 142;
                break;
            }
            case 96: {
                n10 = 141;
                break;
            }
            case 97: {
                n10 = 140;
                break;
            }
            case 98: {
                n10 = 139;
                break;
            }
            case 99: {
                n10 = 138;
                break;
            }
            case 100: {
                n10 = 137;
                break;
            }
            case 101: {
                n10 = 136;
                break;
            }
            case 102: {
                n10 = 135;
                break;
            }
            case 103: {
                n10 = 134;
                break;
            }
            case 104: {
                n10 = 133;
                break;
            }
            case 105: {
                n10 = 132;
                break;
            }
            case 106: {
                n10 = 131;
                break;
            }
            case 107: {
                n10 = 130;
                break;
            }
            case 108: {
                n10 = 129;
                break;
            }
            case 109: {
                n10 = 128;
                break;
            }
            case 110: {
                n10 = 127;
                break;
            }
            case 111: {
                n10 = 126;
                break;
            }
            case 112: {
                n10 = 125;
                break;
            }
            case 113: {
                n10 = 124;
                break;
            }
            case 114: {
                n10 = 123;
                break;
            }
            case 115: {
                n10 = 122;
                break;
            }
            case 116: {
                n10 = 121;
                break;
            }
            case 117: {
                n10 = 120;
                break;
            }
            case 118: {
                n10 = 119;
                break;
            }
            case 119: {
                n10 = 118;
                break;
            }
            case 120: {
                n10 = 117;
                break;
            }
            case 121: {
                n10 = 116;
                break;
            }
            case 122: {
                n10 = 115;
                break;
            }
            case 123: {
                n10 = 114;
                break;
            }
            case 124: {
                n10 = 113;
                break;
            }
            case 125: {
                n10 = 112;
                break;
            }
            case 126: {
                n10 = 111;
                break;
            }
            case 127: {
                n10 = 110;
                break;
            }
            case 128: {
                n10 = 109;
                break;
            }
            case 129: {
                n10 = 108;
                break;
            }
            case 130: {
                n10 = 107;
                break;
            }
            case 131: {
                n10 = 106;
                break;
            }
            case 132: {
                n10 = 105;
                break;
            }
            case 133: {
                n10 = 104;
                break;
            }
            case 134: {
                n10 = 103;
                break;
            }
            case 135: {
                n10 = 102;
                break;
            }
            case 136: {
                n10 = 101;
                break;
            }
            case 137: {
                n10 = 100;
                break;
            }
            case 138: {
                n10 = 99;
                break;
            }
            case 139: {
                n10 = 98;
                break;
            }
            case 140: {
                n10 = 97;
                break;
            }
            case 141: {
                n10 = 96;
                break;
            }
            case 142: {
                n10 = 95;
                break;
            }
            case 143: {
                n10 = 94;
                break;
            }
            case 144: {
                n10 = 93;
                break;
            }
            case 145: {
                n10 = 92;
                break;
            }
            case 146: {
                n10 = 91;
                break;
            }
            case 147: {
                n10 = 90;
                break;
            }
            case 148: {
                n10 = 89;
                break;
            }
            case 149: {
                n10 = 88;
                break;
            }
            case 150: {
                n10 = 87;
                break;
            }
            case 151: {
                n10 = 86;
                break;
            }
            case 152: {
                n10 = 85;
                break;
            }
            case 153: {
                n10 = 84;
                break;
            }
            case 154: {
                n10 = 83;
                break;
            }
            case 155: {
                n10 = 82;
                break;
            }
            case 156: {
                n10 = 81;
                break;
            }
            case 157: {
                n10 = 80;
                break;
            }
            case 158: {
                n10 = 79;
                break;
            }
            case 159: {
                n10 = 78;
                break;
            }
            case 160: {
                n10 = 77;
                break;
            }
            case 161: {
                n10 = 76;
                break;
            }
            case 162: {
                n10 = 75;
                break;
            }
            case 163: {
                n10 = 74;
                break;
            }
            case 164: {
                n10 = 73;
                break;
            }
            case 165: {
                n10 = 72;
                break;
            }
            case 166: {
                n10 = 71;
                break;
            }
            case 167: {
                n10 = 70;
                break;
            }
            case 168: {
                n10 = 69;
                break;
            }
            case 169: {
                n10 = 68;
                break;
            }
            case 170: {
                n10 = 67;
                break;
            }
            case 171: {
                n10 = 66;
                break;
            }
            case 172: {
                n10 = 65;
                break;
            }
            case 173: {
                n10 = 64;
                break;
            }
            case 174: {
                n10 = 63;
                break;
            }
            case 175: {
                n10 = 62;
                break;
            }
            case 176: {
                n10 = 61;
                break;
            }
            case 177: {
                n10 = 60;
                break;
            }
            case 178: {
                n10 = 59;
                break;
            }
            case 179: {
                n10 = 58;
                break;
            }
            case 180: {
                n10 = 57;
                break;
            }
            case 181: {
                n10 = 56;
                break;
            }
            case 182: {
                n10 = 55;
                break;
            }
            case 183: {
                n10 = 54;
                break;
            }
            case 184: {
                n10 = 53;
                break;
            }
            case 185: {
                n10 = 52;
                break;
            }
            case 186: {
                n10 = 51;
                break;
            }
            case 187: {
                n10 = 50;
                break;
            }
            case 188: {
                n10 = 49;
                break;
            }
            case 189: {
                n10 = 48;
                break;
            }
            case 190: {
                n10 = 47;
                break;
            }
            case 191: {
                n10 = 46;
                break;
            }
            case 192: {
                n10 = 45;
                break;
            }
            case 193: {
                n10 = 44;
                break;
            }
            case 194: {
                n10 = 43;
                break;
            }
            case 195: {
                n10 = 42;
                break;
            }
            case 196: {
                n10 = 41;
                break;
            }
            case 197: {
                n10 = 40;
                break;
            }
            case 198: {
                n10 = 39;
                break;
            }
            case 199: {
                n10 = 38;
                break;
            }
            case 200: {
                n10 = 37;
                break;
            }
            case 201: {
                n10 = 36;
                break;
            }
            case 202: {
                n10 = 35;
                break;
            }
            case 203: {
                n10 = 34;
                break;
            }
            case 204: {
                n10 = 33;
                break;
            }
            case 205: {
                n10 = 32;
                break;
            }
            case 206: {
                n10 = 31;
                break;
            }
            case 207: {
                n10 = 30;
                break;
            }
            case 208: {
                n10 = 29;
                break;
            }
            case 209: {
                n10 = 28;
                break;
            }
            case 210: {
                n10 = 27;
                break;
            }
            case 211: {
                n10 = 26;
                break;
            }
            case 212: {
                n10 = 25;
                break;
            }
            case 213: {
                n10 = 24;
                break;
            }
            case 214: {
                n10 = 23;
                break;
            }
            case 215: {
                n10 = 22;
                break;
            }
            case 216: {
                n10 = 21;
                break;
            }
            case 217: {
                n10 = 20;
                break;
            }
            case 218: {
                n10 = 19;
                break;
            }
            case 219: {
                n10 = 18;
                break;
            }
            case 220: {
                n10 = 17;
                break;
            }
            case 221: {
                n10 = 16;
                break;
            }
            case 222: {
                n10 = 15;
                break;
            }
            case 223: {
                n10 = 14;
                break;
            }
            case 224: {
                n10 = 13;
                break;
            }
            case 225: {
                n10 = 12;
                break;
            }
            case 226: {
                n10 = 11;
                break;
            }
            case 227: {
                n10 = 10;
                break;
            }
            case 228: {
                n10 = 9;
                break;
            }
            case 229: {
                n10 = 8;
                break;
            }
            case 230: {
                n10 = 7;
                break;
            }
            case 231: {
                n10 = 6;
                break;
            }
            case 232: {
                n10 = 5;
                break;
            }
            case 233: {
                n10 = 4;
                break;
            }
            case 234: {
                n10 = 3;
                break;
            }
            case 235: {
                n10 = 2;
                break;
            }
            case 236: {
                n10 = 1;
                break;
            }
            case 237: 
        }
        switch (n10) {
            default: {
                return new int[]{2, 2, 2, 2, 2, 2};
            }
            case 235: {
                return new int[]{3, 3, 4, 2, 2, 2};
            }
            case 234: {
                return new int[]{3, 2, 2, 1, 1, 2};
            }
            case 230: {
                return new int[]{3, 1, 3, 1, 2, 2};
            }
            case 227: {
                return new int[]{0, 3, 3, 4, 2, 2};
            }
            case 225: {
                return new int[]{2, 2, 1, 1, 2, 2};
            }
            case 221: {
                return new int[]{2, 2, 3, 4, 2, 2};
            }
            case 219: {
                return new int[]{1, 0, 2, 2, 3, 1};
            }
            case 216: {
                return new int[]{3, 4, 3, 2, 2, 2};
            }
            case 213: {
                return new int[]{1, 4, 1, 3, 2, 2};
            }
            case 212: {
                return new int[]{1, 1, 0, 0, 2, 2};
            }
            case 207: {
                return new int[]{2, 2, 2, 4, 2, 2};
            }
            case 205: {
                return new int[]{0, 2, 2, 3, 3, 4};
            }
            case 201: {
                return new int[]{3, 3, 3, 4, 2, 2};
            }
            case 199: 
            case 202: {
                return new int[]{1, 2, 1, 0, 2, 2};
            }
            case 197: {
                return new int[]{2, 2, 1, 2, 2, 2};
            }
            case 196: {
                return new int[]{4, 3, 2, 3, 2, 2};
            }
            case 195: {
                return new int[]{2, 4, 3, 0, 2, 2};
            }
            case 193: {
                return new int[]{4, 4, 4, 3, 2, 2};
            }
            case 191: 
            case 218: {
                return new int[]{3, 3, 4, 3, 2, 2};
            }
            case 187: {
                return new int[]{1, 1, 2, 2, 2, 1};
            }
            case 184: 
            case 209: {
                return new int[]{4, 2, 1, 1, 2, 2};
            }
            case 183: {
                return new int[]{4, 2, 4, 3, 2, 2};
            }
            case 182: {
                return new int[]{3, 1, 1, 1, 2, 2};
            }
            case 181: {
                return new int[]{3, 4, 2, 0, 2, 2};
            }
            case 180: {
                return new int[]{1, 0, 0, 0, 4, 3};
            }
            case 178: {
                return new int[]{0, 0, 1, 2, 1, 2};
            }
            case 176: {
                return new int[]{2, 4, 4, 4, 4, 2};
            }
            case 175: {
                return new int[]{2, 2, 4, 1, 2, 2};
            }
            case 173: {
                return new int[]{3, 4, 1, 2, 2, 2};
            }
            case 172: {
                return new int[]{2, 0, 2, 1, 2, 1};
            }
            case 168: {
                return new int[]{2, 1, 3, 3, 3, 0};
            }
            case 163: {
                return new int[]{2, 3, 1, 3, 4, 2};
            }
            case 162: 
            case 170: {
                return new int[]{1, 1, 2, 2, 4, 2};
            }
            case 160: 
            case 161: {
                return new int[]{4, 2, 2, 1, 2, 2};
            }
            case 159: {
                return new int[]{2, 2, 4, 3, 2, 2};
            }
            case 157: {
                return new int[]{0, 2, 2, 3, 0, 3};
            }
            case 156: 
            case 164: 
            case 198: {
                return new int[]{2, 3, 3, 3, 2, 2};
            }
            case 155: {
                return new int[]{3, 4, 2, 1, 2, 2};
            }
            case 153: {
                return new int[]{3, 3, 4, 4, 2, 2};
            }
            case 151: {
                return new int[]{3, 1, 2, 1, 2, 2};
            }
            case 150: {
                return new int[]{1, 0, 3, 1, 3, 2};
            }
            case 149: {
                return new int[]{2, 4, 3, 4, 2, 2};
            }
            case 148: {
                return new int[]{4, 2, 3, 3, 2, 2};
            }
            case 147: {
                return new int[]{3, 4, 1, 4, 2, 2};
            }
            case 146: {
                return new int[]{3, 1, 1, 2, 2, 2};
            }
            case 143: 
            case 236: {
                return new int[]{4, 2, 4, 4, 2, 2};
            }
            case 140: 
            case 141: {
                return new int[]{0, 2, 4, 4, 2, 2};
            }
            case 139: {
                return new int[]{2, 0, 1, 2, 2, 2};
            }
            case 138: {
                return new int[]{2, 4, 2, 3, 2, 2};
            }
            case 137: 
            case 167: {
                return new int[]{4, 3, 3, 2, 2, 2};
            }
            case 136: {
                return new int[]{1, 0, 0, 1, 3, 2};
            }
            case 133: 
            case 177: {
                return new int[]{1, 2, 1, 2, 2, 2};
            }
            case 132: {
                return new int[]{2, 0, 0, 1, 2, 2};
            }
            case 131: 
            case 179: {
                return new int[]{1, 0, 0, 0, 2, 2};
            }
            case 130: {
                return new int[]{0, 2, 2, 0, 2, 2};
            }
            case 129: {
                return new int[]{3, 3, 1, 1, 2, 2};
            }
            case 126: {
                return new int[]{1, 0, 3, 2, 1, 4};
            }
            case 125: {
                return new int[]{0, 0, 0, 0, 2, 2};
            }
            case 124: {
                return new int[]{3, 3, 2, 2, 2, 2};
            }
            case 122: {
                return new int[]{3, 1, 3, 3, 4, 2};
            }
            case 119: {
                return new int[]{3, 3, 2, 4, 2, 2};
            }
            case 118: {
                return new int[]{1, 2, 1, 3, 2, 2};
            }
            case 117: {
                return new int[]{2, 1, 2, 2, 2, 2};
            }
            case 114: {
                return new int[]{0, 1, 1, 3, 4, 4};
            }
            case 109: {
                return new int[]{2, 1, 4, 2, 2, 2};
            }
            case 106: {
                return new int[]{0, 1, 1, 2, 2, 4};
            }
            case 105: {
                return new int[]{2, 1, 1, 2, 2, 2};
            }
            case 104: {
                return new int[]{2, 4, 3, 2, 2, 2};
            }
            case 103: 
            case 233: {
                return new int[]{4, 2, 2, 3, 2, 2};
            }
            case 102: {
                return new int[]{0, 0, 0, 1, 1, 2};
            }
            case 100: {
                return new int[]{3, 0, 1, 1, 4, 1};
            }
            case 99: {
                return new int[]{3, 2, 2, 3, 2, 2};
            }
            case 98: 
            case 135: 
            case 214: 
            case 229: {
                return new int[]{4, 2, 2, 4, 2, 2};
            }
            case 97: {
                return new int[]{1, 1, 3, 2, 3, 3};
            }
            case 96: 
            case 217: {
                return new int[]{0, 2, 1, 1, 2, 2};
            }
            case 93: {
                return new int[]{3, 1, 2, 2, 3, 2};
            }
            case 92: {
                return new int[]{0, 0, 0, 1, 3, 2};
            }
            case 89: {
                return new int[]{0, 1, 2, 3, 2, 0};
            }
            case 88: {
                return new int[]{3, 2, 2, 1, 2, 2};
            }
            case 86: 
            case 165: {
                return new int[]{1, 2, 4, 4, 4, 2};
            }
            case 85: {
                return new int[]{2, 3, 2, 2, 2, 2};
            }
            case 84: 
            case 90: 
            case 189: {
                return new int[]{1, 0, 0, 0, 1, 2};
            }
            case 83: {
                return new int[]{4, 2, 1, 4, 2, 2};
            }
            case 82: 
            case 142: {
                return new int[]{2, 1, 2, 3, 2, 2};
            }
            case 81: {
                return new int[]{4, 3, 4, 2, 2, 2};
            }
            case 77: 
            case 152: 
            case 228: {
                return new int[]{3, 3, 3, 2, 2, 2};
            }
            case 76: 
            case 226: {
                return new int[]{0, 2, 0, 1, 2, 2};
            }
            case 74: {
                return new int[]{1, 1, 1, 2, 2, 2};
            }
            case 72: {
                return new int[]{0, 0, 1, 1, 1, 1};
            }
            case 71: 
            case 204: {
                return new int[]{3, 4, 1, 0, 2, 2};
            }
            case 70: {
                return new int[]{1, 2, 3, 1, 0, 2};
            }
            case 68: {
                return new int[]{4, 2, 4, 1, 2, 2};
            }
            case 67: 
            case 107: 
            case 113: {
                return new int[]{3, 2, 2, 2, 2, 2};
            }
            case 66: {
                return new int[]{3, 1, 2, 2, 2, 2};
            }
            case 65: {
                return new int[]{0, 0, 0, 3, 0, 2};
            }
            case 64: {
                return new int[]{4, 3, 3, 1, 2, 2};
            }
            case 63: 
            case 94: {
                return new int[]{0, 1, 1, 1, 2, 2};
            }
            case 60: 
            case 101: 
            case 127: 
            case 174: 
            case 186: 
            case 215: {
                return new int[]{0, 0, 0, 0, 0, 2};
            }
            case 59: {
                return new int[]{2, 3, 2, 1, 2, 2};
            }
            case 57: {
                return new int[]{3, 4, 4, 4, 4, 2};
            }
            case 55: {
                return new int[]{0, 0, 3, 2, 0, 2};
            }
            case 53: {
                return new int[]{0, 1, 2, 2, 2, 3};
            }
            case 52: 
            case 158: {
                return new int[]{0, 0, 2, 0, 1, 2};
            }
            case 51: 
            case 115: {
                return new int[]{1, 0, 0, 0, 0, 2};
            }
            case 48: {
                return new int[]{2, 1, 0, 0, 2, 2};
            }
            case 47: 
            case 54: 
            case 200: 
            case 206: 
            case 208: {
                return new int[]{4, 3, 4, 4, 2, 2};
            }
            case 46: {
                return new int[]{2, 3, 4, 4, 2, 2};
            }
            case 45: {
                return new int[]{2, 3, 4, 3, 2, 2};
            }
            case 44: {
                return new int[]{2, 0, 1, 1, 3, 2};
            }
            case 43: {
                return new int[]{3, 3, 3, 3, 2, 2};
            }
            case 42: 
            case 95: {
                return new int[]{1, 2, 2, 2, 3, 2};
            }
            case 41: 
            case 166: {
                return new int[]{2, 2, 2, 1, 2, 2};
            }
            case 40: 
            case 58: 
            case 123: {
                return new int[]{3, 4, 4, 4, 2, 2};
            }
            case 39: {
                return new int[]{0, 0, 0, 1, 0, 2};
            }
            case 38: 
            case 61: 
            case 87: {
                return new int[]{3, 4, 3, 3, 2, 2};
            }
            case 37: 
            case 110: {
                return new int[]{4, 2, 4, 2, 2, 2};
            }
            case 36: {
                return new int[]{4, 2, 3, 2, 2, 2};
            }
            case 35: {
                return new int[]{0, 2, 2, 2, 3, 2};
            }
            case 34: {
                return new int[]{2, 4, 2, 1, 2, 2};
            }
            case 33: {
                return new int[]{0, 1, 2, 3, 2, 2};
            }
            case 32: {
                return new int[]{3, 2, 1, 0, 2, 2};
            }
            case 31: {
                return new int[]{3, 1, 3, 2, 2, 2};
            }
            case 30: {
                return new int[]{4, 4, 2, 2, 2, 2};
            }
            case 28: {
                return new int[]{1, 2, 3, 2, 2, 2};
            }
            case 27: 
            case 49: {
                return new int[]{2, 2, 0, 0, 2, 2};
            }
            case 25: 
            case 50: 
            case 222: {
                return new int[]{1, 2, 2, 2, 2, 2};
            }
            case 24: {
                return new int[]{4, 4, 3, 3, 2, 2};
            }
            case 23: 
            case 91: 
            case 111: 
            case 134: 
            case 154: 
            case 185: 
            case 203: 
            case 224: 
            case 232: {
                return new int[]{4, 4, 4, 4, 2, 2};
            }
            case 22: {
                return new int[]{1, 2, 1, 3, 4, 2};
            }
            case 21: 
            case 145: 
            case 190: {
                return new int[]{0, 0, 0, 0, 1, 2};
            }
            case 20: {
                return new int[]{4, 3, 4, 3, 2, 2};
            }
            case 19: {
                return new int[]{0, 1, 4, 4, 3, 2};
            }
            case 18: {
                return new int[]{2, 1, 3, 3, 2, 2};
            }
            case 17: 
            case 56: 
            case 69: 
            case 78: {
                return new int[]{0, 2, 0, 0, 2, 2};
            }
            case 16: {
                return new int[]{1, 2, 1, 1, 2, 2};
            }
            case 15: 
            case 75: 
            case 128: 
            case 169: 
            case 194: 
            case 211: {
                return new int[]{3, 2, 3, 3, 2, 2};
            }
            case 14: 
            case 121: 
            case 144: 
            case 171: 
            case 192: {
                return new int[]{0, 2, 2, 2, 2, 2};
            }
            case 13: {
                return new int[]{1, 3, 4, 4, 2, 2};
            }
            case 12: {
                return new int[]{0, 1, 1, 1, 2, 0};
            }
            case 11: {
                return new int[]{1, 0, 1, 1, 0, 0};
            }
            case 10: {
                return new int[]{2, 2, 3, 3, 2, 2};
            }
            case 9: 
            case 108: 
            case 210: 
            case 220: {
                return new int[]{2, 1, 1, 1, 2, 2};
            }
            case 8: 
            case 62: 
            case 188: {
                return new int[]{4, 2, 2, 2, 2, 2};
            }
            case 7: {
                return new int[]{4, 4, 3, 2, 2, 2};
            }
            case 6: {
                return new int[]{2, 3, 2, 3, 2, 2};
            }
            case 5: 
            case 231: {
                return new int[]{1, 1, 1, 1, 2, 2};
            }
            case 4: {
                return new int[]{0, 2, 0, 3, 2, 2};
            }
            case 3: {
                return new int[]{2, 4, 1, 2, 2, 2};
            }
            case 2: 
            case 80: {
                return new int[]{4, 3, 3, 4, 2, 2};
            }
            case 1: {
                return new int[]{1, 4, 4, 4, 4, 0};
            }
            case 0: 
            case 26: 
            case 29: 
            case 73: 
            case 79: 
            case 112: 
            case 116: 
            case 120: 
            case 223: 
        }
        return new int[]{1, 2, 0, 0, 2, 2};
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b(int n10) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                block8: {
                    block7: {
                        int n12;
                        block6: {
                            try {
                                boolean bl2;
                                n12 = this.i;
                                if (n12 == 0 || (bl2 = this.e)) break block6;
                            }
                            catch (Throwable throwable2) {}
                            return;
                        }
                        if (n12 == n10) {
                            return;
                        }
                        this.i = n10;
                        if (n10 != 1 && n10 != 0 && n10 != 8) break block7;
                        break block8;
                        break block9;
                    }
                    this.l = this.a(n10);
                    long l10 = this.d.b();
                    n10 = this.f > 0 ? (int)(l10 - this.g) : 0;
                    long l11 = this.h;
                    long l13 = this.l;
                    if (n10 != 0 || l11 != 0L || l13 != this.m) {
                        this.m = l13;
                        this.b.a(n10, l11, l13);
                    }
                    this.g = l10;
                    this.h = 0L;
                    this.k = 0L;
                    this.j = 0L;
                    this.c.b();
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    static /* bridge */ /* synthetic */ int[] b(String string2) {
        return bz.a(string2);
    }

    public final bz a() {
        return this;
    }

    public final void a(Handler handler, xc xc2) {
        xc2.getClass();
        this.b.a(handler, xc2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(pv object, boolean bl2) {
        synchronized (this) {
            block7: {
                if (bl2) {
                    Throwable throwable2;
                    block10: {
                        block8: {
                            block9: {
                                long l10;
                                long l11;
                                int n10;
                                long l13;
                                try {
                                    if ((object.i & 8) == 8) break block7;
                                    if (this.f <= 0) break block8;
                                    l13 = this.d.b();
                                    n10 = (int)(l13 - this.g);
                                    this.j += (long)n10;
                                    l11 = this.k;
                                    l10 = this.h;
                                    this.k = l11 + l10;
                                    if (n10 <= 0) break block9;
                                }
                                catch (Throwable throwable2) {
                                    break block10;
                                }
                                float f10 = (float)l10 * 8000.0f / (float)n10;
                                this.c.a((int)Math.sqrt(l10), f10);
                                if (this.j >= 2000L || this.k >= 524288L) {
                                    this.l = (long)this.c.a();
                                }
                                l11 = this.h;
                                l10 = this.l;
                                if (n10 != 0 || l11 != 0L || l10 != this.m) {
                                    this.m = l10;
                                    this.b.a(n10, l11, l10);
                                }
                                this.g = l13;
                                this.h = 0L;
                            }
                            --this.f;
                            return;
                        }
                        object = new IllegalStateException();
                        throw object;
                    }
                    throw throwable2;
                }
            }
            return;
        }
    }

    public final void a(pv pv3, boolean bl2, int n10) {
        synchronized (this) {
            block6: {
                if (bl2) {
                    if ((pv3.i & 8) == 8) {
                        break block6;
                    }
                    this.h += (long)n10;
                    return;
                }
            }
            return;
        }
    }

    public final void a(xc xc2) {
        this.b.a(xc2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(pv pv3, boolean bl2) {
        synchronized (this) {
            block4: {
                if (bl2) {
                    Throwable throwable2;
                    block6: {
                        block5: {
                            try {
                                if ((pv3.i & 8) == 8) break block4;
                                if (this.f != 0) break block5;
                                this.g = this.d.b();
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        ++this.f;
                        return;
                    }
                    throw throwable2;
                }
            }
            return;
        }
    }
}


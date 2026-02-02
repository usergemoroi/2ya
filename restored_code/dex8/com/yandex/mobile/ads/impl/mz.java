/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.mz$a
 *  com.yandex.mobile.ads.impl.s40
 *  com.yandex.mobile.ads.impl.t40
 *  com.yandex.mobile.ads.impl.x92
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.hu0;
import com.yandex.mobile.ads.impl.mz;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.s40;
import com.yandex.mobile.ads.impl.t40;
import com.yandex.mobile.ads.impl.x92;
import java.io.IOException;
import java.util.ArrayDeque;

/*
 * Exception performing whole class analysis ignored.
 */
final class mz
implements t40 {
    private final byte[] a = new byte[8];
    private final ArrayDeque<a> b = new ArrayDeque();
    private final x92 c = new x92();
    private s40 d;
    private int e;
    private int f;
    private long g;

    public final void a() {
        this.e = 0;
        this.b.clear();
        this.c.b();
    }

    public final void a(s40 s402) {
        this.d = s402;
    }

    public final boolean a(oz object) throws IOException {
        if (this.d != null) {
            while (true) {
                int n10;
                long l10;
                long l11;
                int n13;
                a a13;
                if ((a13 = this.b.peek()) != null && ((oz)object).a() >= com.yandex.mobile.ads.impl.mz$a.b(a13)) {
                    object = this.d;
                    n13 = com.yandex.mobile.ads.impl.mz$a.a(this.b.pop());
                    ((hu0.a)object).a.b(n13);
                    return true;
                }
                if (this.e == 0) {
                    l10 = l11 = this.c.a((oz)object, true, false, 4);
                    if (l11 == -2L) {
                        ((oz)object).c();
                        while (true) {
                            ((oz)object).b(this.a, 0, 4, false);
                            n10 = x92.a((int)this.a[0]);
                            if (n10 != -1 && n10 <= 4) {
                                n13 = (int)x92.a((byte[])this.a, (int)n10, (boolean)false);
                                ((hu0.a)this.d).a.getClass();
                                if (n13 == 357149030 || n13 == 524531317 || n13 == 475249515 || n13 == 374648427) {
                                    ((oz)object).a(n10);
                                    l10 = n13;
                                    break;
                                }
                            }
                            ((oz)object).a(1);
                        }
                    }
                    if (l10 == -1L) {
                        return false;
                    }
                    this.f = (int)l10;
                    this.e = 1;
                }
                if (this.e == 1) {
                    this.g = this.c.a((oz)object, false, true, 8);
                    this.e = 2;
                }
                a13 = this.d;
                n13 = this.f;
                ((hu0.a)a13).a.getClass();
                switch (n13) {
                    default: {
                        n13 = 0;
                        break;
                    }
                    case 181: 
                    case 17545: 
                    case 21969: 
                    case 21970: 
                    case 21971: 
                    case 21972: 
                    case 21973: 
                    case 21974: 
                    case 21975: 
                    case 21976: 
                    case 21977: 
                    case 21978: 
                    case 30323: 
                    case 30324: 
                    case 30325: {
                        n13 = 5;
                        break;
                    }
                    case 161: 
                    case 163: 
                    case 165: 
                    case 16877: 
                    case 16981: 
                    case 18402: 
                    case 21419: 
                    case 25506: 
                    case 30322: {
                        n13 = 4;
                        break;
                    }
                    case 160: 
                    case 166: 
                    case 174: 
                    case 183: 
                    case 187: 
                    case 224: 
                    case 225: 
                    case 16868: 
                    case 18407: 
                    case 19899: 
                    case 20532: 
                    case 20533: 
                    case 21936: 
                    case 21968: 
                    case 25152: 
                    case 28032: 
                    case 30113: 
                    case 30320: 
                    case 290298740: 
                    case 357149030: 
                    case 374648427: 
                    case 408125543: 
                    case 440786851: 
                    case 475249515: 
                    case 524531317: {
                        n13 = 1;
                        break;
                    }
                    case 134: 
                    case 17026: 
                    case 21358: 
                    case 2274716: {
                        n13 = 3;
                        break;
                    }
                    case 131: 
                    case 136: 
                    case 155: 
                    case 159: 
                    case 176: 
                    case 179: 
                    case 186: 
                    case 215: 
                    case 231: 
                    case 238: 
                    case 241: 
                    case 251: 
                    case 16871: 
                    case 16980: 
                    case 17029: 
                    case 17143: 
                    case 18401: 
                    case 18408: 
                    case 20529: 
                    case 20530: 
                    case 21420: 
                    case 21432: 
                    case 21680: 
                    case 21682: 
                    case 21690: 
                    case 21930: 
                    case 21945: 
                    case 21946: 
                    case 21947: 
                    case 21948: 
                    case 21949: 
                    case 21998: 
                    case 22186: 
                    case 22203: 
                    case 25188: 
                    case 30114: 
                    case 30321: 
                    case 2352003: 
                    case 2807729: {
                        n13 = 2;
                    }
                }
                if (n13 != 0) {
                    if (n13 != 1) {
                        l10 = 0L;
                        if (n13 != 2) {
                            if (n13 != 3) {
                                if (n13 != 4) {
                                    if (n13 == 5) {
                                        l11 = this.g;
                                        if (l11 != 4L && l11 != 8L) {
                                            object = new StringBuilder("Invalid float size: ");
                                            ((StringBuilder)object).append(this.g);
                                            throw fg1.a((String)((StringBuilder)object).toString(), null);
                                        }
                                        a13 = this.d;
                                        n10 = this.f;
                                        int n14 = (int)l11;
                                        ((oz)object).a(this.a, 0, n14, false);
                                        for (n13 = 0; n13 < n14; ++n13) {
                                            l10 = (long)(this.a[n13] & 0xFF) | l10 << 8;
                                        }
                                        double d14 = n14 == 4 ? (double)Float.intBitsToFloat((int)l10) : Double.longBitsToDouble(l10);
                                        ((hu0.a)a13).a(n10, d14);
                                        this.e = 0;
                                        return true;
                                    }
                                    object = new StringBuilder("Invalid element type ");
                                    ((StringBuilder)object).append(n13);
                                    throw fg1.a((String)((StringBuilder)object).toString(), null);
                                }
                                a13 = this.d;
                                n10 = this.f;
                                n13 = (int)this.g;
                                ((hu0.a)a13).a(n10, n13, (oz)object);
                                this.e = 0;
                                return true;
                            }
                            l10 = this.g;
                            if (l10 <= Integer.MAX_VALUE) {
                                a13 = this.d;
                                n10 = this.f;
                                n13 = (int)l10;
                                if (n13 == 0) {
                                    object = "";
                                } else {
                                    byte[] byArray = new byte[n13];
                                    ((oz)object).a(byArray, 0, n13, false);
                                    while (n13 > 0 && byArray[n13 - 1] == 0) {
                                        --n13;
                                    }
                                    object = new String(byArray, 0, n13);
                                }
                                ((hu0.a)a13).a(n10, (String)object);
                                this.e = 0;
                                return true;
                            }
                            object = new StringBuilder("String element size: ");
                            ((StringBuilder)object).append(this.g);
                            throw fg1.a((String)((StringBuilder)object).toString(), null);
                        }
                        l11 = this.g;
                        if (l11 <= 8L) {
                            a13 = this.d;
                            n10 = this.f;
                            int n15 = (int)l11;
                            ((oz)object).a(this.a, 0, n15, false);
                            for (n13 = 0; n13 < n15; ++n13) {
                                l10 = l10 << 8 | (long)(this.a[n13] & 0xFF);
                            }
                            ((hu0.a)a13).a(n10, l10);
                            this.e = 0;
                            return true;
                        }
                        object = new StringBuilder("Invalid integer size: ");
                        ((StringBuilder)object).append(this.g);
                        throw fg1.a((String)((StringBuilder)object).toString(), null);
                    }
                    l10 = ((oz)object).a();
                    l11 = this.g;
                    this.b.push(new /* Unavailable Anonymous Inner Class!! */);
                    object = this.d;
                    n13 = this.f;
                    l11 = this.g;
                    ((hu0.a)object).a(n13, l10, l11);
                    this.e = 0;
                    return true;
                }
                ((oz)object).a((int)this.g);
                this.e = 0;
            }
        }
        throw new IllegalStateException();
    }
}


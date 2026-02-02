/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.sr0
 *  com.yandex.mobile.ads.impl.xh
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a32;
import com.yandex.mobile.ads.impl.ai;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.q82;
import com.yandex.mobile.ads.impl.sr0;
import com.yandex.mobile.ads.impl.xh;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.y22;
import com.yandex.mobile.ads.impl.zh;
import com.yandex.mobile.ads.impl.zs0;

final class tr0
implements xh {
    public final xj0<xh> a;
    private final int b;

    private tr0(int n10, xj0<xh> xj02) {
        this.b = n10;
        this.a = xj02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static tr0 a(int n10, bg1 bg12) {
        xj0.a a14 = new xj0.a();
        int n13 = bg12.e();
        int n14 = -2;
        while (true) {
            int n15;
            int n16;
            block26: {
                Object object;
                block15: {
                    block27: {
                        ai ai2;
                        Object object2;
                        block17: {
                            block21: {
                                block24: {
                                    int n17;
                                    int n18;
                                    block25: {
                                        block22: {
                                            block23: {
                                                block18: {
                                                    block19: {
                                                        block20: {
                                                            block16: {
                                                                if (bg12.a() <= 8) {
                                                                    return new tr0(n10, a14.a());
                                                                }
                                                                n16 = bg12.k();
                                                                n15 = bg12.k();
                                                                n15 = bg12.d() + n15;
                                                                bg12.d(n15);
                                                                if (n16 != 1414744396) break block16;
                                                                object = tr0.a(bg12.k(), bg12);
                                                                break block17;
                                                            }
                                                            if (n16 == 1718776947) break block18;
                                                            if (n16 == 1751742049) break block19;
                                                            if (n16 == 1752331379) break block20;
                                                            if (n16 != 1852994675) break block21;
                                                            object = a32.a(bg12);
                                                            break block17;
                                                        }
                                                        object = ai.a(bg12);
                                                        break block17;
                                                    }
                                                    object = zh.a(bg12);
                                                    break block17;
                                                }
                                                if (n14 != 2) break block22;
                                                bg12.f(4);
                                                n18 = bg12.k();
                                                n16 = bg12.k();
                                                bg12.f(4);
                                                n17 = bg12.k();
                                                switch (n17) {
                                                    default: {
                                                        object = null;
                                                        break;
                                                    }
                                                    case 1196444237: 
                                                    case 1735420525: {
                                                        object = "video/mjpeg";
                                                        break;
                                                    }
                                                    case 859066445: {
                                                        object = "video/mp43";
                                                        break;
                                                    }
                                                    case 842289229: {
                                                        object = "video/mp42";
                                                        break;
                                                    }
                                                    case 826496577: 
                                                    case 828601953: 
                                                    case 875967048: {
                                                        object = "video/avc";
                                                        break;
                                                    }
                                                    case 808802372: 
                                                    case 877677894: 
                                                    case 1145656883: 
                                                    case 1145656920: 
                                                    case 1482049860: 
                                                    case 1684633208: 
                                                    case 2021026148: {
                                                        object = "video/mp4v-es";
                                                    }
                                                }
                                                if (object != null) break block23;
                                                sr0.a((String)"Ignoring track with unsupported compression ", (int)n17, (String)"StreamFormatChunk");
                                                break block21;
                                            }
                                            object2 = new /* Unavailable Anonymous Inner Class!! */;
                                            object2.o(n18).f(n16).e((String)object);
                                            object = new y22(object2.a());
                                            break block17;
                                        }
                                        if (n14 != 1) break block24;
                                        n16 = bg12.o();
                                        object = n16 != 1 ? (n16 != 85 ? (n16 != 255 ? (n16 != 8192 ? (n16 != 8193 ? null : "audio/vnd.dts") : "audio/ac3") : "audio/mp4a-latm") : "audio/mpeg") : "audio/raw";
                                        if (object != null) break block25;
                                        sr0.a((String)"Ignoring track with unsupported format tag ", (int)n16, (String)"StreamFormatChunk");
                                        break block21;
                                    }
                                    n17 = bg12.o();
                                    int n19 = bg12.k();
                                    bg12.f(6);
                                    n18 = m92.b((int)bg12.z());
                                    n16 = bg12.o();
                                    object2 = new byte[n16];
                                    bg12.a((byte[])object2, 0, n16);
                                    ai2 = new /* Unavailable Anonymous Inner Class!! */;
                                    ai2.e((String)object).c(n17).l(n19);
                                    if ("audio/raw".equals(object) && n18 != 0) {
                                        ai2.i(n18);
                                    }
                                    if ("audio/mp4a-latm".equals(object) && n16 > 0) {
                                        ai2.a(xj0.a(object2));
                                    }
                                    object = new y22(ai2.a());
                                    break block17;
                                }
                                object = new StringBuilder("Ignoring strf box for unsupported track type: ");
                                ((StringBuilder)object).append(m92.d((int)n14));
                                zs0.d((String)"StreamFormatChunk", (String)((StringBuilder)object).toString());
                            }
                            object = null;
                        }
                        n16 = n14;
                        if (object == null) break block26;
                        if (object.getType() != 1752331379) break block15;
                        ai2 = (ai)object;
                        n14 = ai2.a;
                        if (n14 == 1935960438) break block27;
                        if (n14 != 1935963489) {
                            if (n14 != 1937012852) {
                                object2 = new StringBuilder("Found unsupported streamType fourCC: ");
                                ((StringBuilder)object2).append(Integer.toHexString(ai2.a));
                                zs0.d((String)"AviStreamHeaderChunk", (String)((StringBuilder)object2).toString());
                                n14 = -1;
                                break block15;
                            } else {
                                n14 = 3;
                            }
                            break block15;
                        } else {
                            n14 = 1;
                        }
                        break block15;
                    }
                    n14 = 2;
                }
                a14.b(object);
                n16 = n14;
            }
            bg12.e(n15);
            bg12.d(n13);
            n14 = n16;
        }
    }

    @Nullable
    public final <T extends xh> T a(Class<T> clazz) {
        q82<xh> q822 = this.a.a(0);
        while (q822.hasNext()) {
            xh xh2 = (xh)q822.next();
            if (xh2.getClass() != clazz) continue;
            return (T)xh2;
        }
        return null;
    }

    public final int getType() {
        return this.b;
    }
}


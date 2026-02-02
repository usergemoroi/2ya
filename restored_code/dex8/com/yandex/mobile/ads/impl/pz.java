/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.pz$a
 *  com.yandex.mobile.ads.impl.s52
 *  com.yandex.mobile.ads.impl.t70
 *  com.yandex.mobile.ads.impl.w01
 *  com.yandex.mobile.ads.impl.x70
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ab;
import com.yandex.mobile.ads.impl.b21;
import com.yandex.mobile.ads.impl.c21;
import com.yandex.mobile.ads.impl.cn1;
import com.yandex.mobile.ads.impl.hu0;
import com.yandex.mobile.ads.impl.ic0;
import com.yandex.mobile.ads.impl.n;
import com.yandex.mobile.ads.impl.nq0;
import com.yandex.mobile.ads.impl.ob0;
import com.yandex.mobile.ads.impl.pz;
import com.yandex.mobile.ads.impl.q;
import com.yandex.mobile.ads.impl.s52;
import com.yandex.mobile.ads.impl.t70;
import com.yandex.mobile.ads.impl.v72;
import com.yandex.mobile.ads.impl.w01;
import com.yandex.mobile.ads.impl.wb0;
import com.yandex.mobile.ads.impl.wc;
import com.yandex.mobile.ads.impl.wj2;
import com.yandex.mobile.ads.impl.x70;
import com.yandex.mobile.ads.impl.xd1;
import com.yandex.mobile.ads.impl.yh;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class pz
implements x70 {
    private static final int[] a = new int[]{5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    private static final a b = new /* Unavailable Anonymous Inner Class!! */;
    private static final a c = new /* Unavailable Anonymous Inner Class!! */;

    private static void a(int n10, ArrayList arrayList) {
        switch (n10) {
            default: {
                break;
            }
            case 16: {
                arrayList.add(new yh());
                break;
            }
            case 15: {
                t70 t702 = c.a(new Object[0]);
                if (t702 == null) break;
                arrayList.add(t702);
                break;
            }
            case 14: {
                arrayList.add(new nq0());
                break;
            }
            case 12: {
                arrayList.add(new wj2());
                break;
            }
            case 11: {
                arrayList.add(new v72(0));
                break;
            }
            case 10: {
                arrayList.add(new cn1(new s52(0L)));
                break;
            }
            case 9: {
                arrayList.add(new xd1());
                break;
            }
            case 8: {
                arrayList.add(new ic0(Collections.emptyList()));
                arrayList.add(new c21(0));
                break;
            }
            case 7: {
                arrayList.add(new b21(null));
                break;
            }
            case 6: {
                arrayList.add(new hu0());
                break;
            }
            case 5: {
                arrayList.add(new wb0());
                break;
            }
            case 4: {
                t70 t703 = b.a(new Object[]{0});
                if (t703 != null) {
                    arrayList.add(t703);
                    break;
                }
                arrayList.add(new ob0());
                break;
            }
            case 3: {
                arrayList.add(new wc());
                break;
            }
            case 2: {
                arrayList.add(new ab());
                break;
            }
            case 1: {
                arrayList.add(new q());
                break;
            }
            case 0: {
                arrayList.add(new n());
            }
        }
    }

    @Nullable
    private static Constructor<? extends t70> b() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (Boolean.TRUE.equals(Class.forName("com.monetization.ads.exo.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("com.monetization.ads.exo.ext.flac.FlacExtractor").asSubclass(t70.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    private static Constructor<? extends t70> c() throws ClassNotFoundException, NoSuchMethodException {
        return Class.forName("com.monetization.ads.exo.decoder.midi.MidiExtractor").asSubclass(t70.class).getConstructor(new Class[0]);
    }

    public static /* synthetic */ Constructor d() {
        return pz.c();
    }

    public static /* synthetic */ Constructor e() {
        return pz.b();
    }

    public final t70[] a() {
        synchronized (this) {
            Uri uri = Uri.EMPTY;
            t70[] t70Array = new HashMap();
            t70Array = this.a(uri, (Map<String, List<String>>)t70Array);
            return t70Array;
        }
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final t70[] a(Uri var1_1, Map<String, List<String>> var2_3) {
        synchronized (this) {
            block61: {
                block68: {
                    block67: {
                        block66: {
                            block65: {
                                block63: {
                                    block64: {
                                        var8_5 = pz.a;
                                        var7_4 = new ArrayList<E>(16);
                                        var2_3 = (List)var2_3.get("Content-Type");
                                        var2_3 = var2_3 != null && !var2_3.isEmpty() ? (String)var2_3.get(0) : null;
                                        var5_6 = 1;
                                        if (var2_3 == null) ** GOTO lbl-1000
                                        var3_7 = w01.c;
                                        var3_7 = var2_3.hashCode();
                                        if (var3_7 == -1007807498) break block63;
                                        if (var3_7 == -586683234) break block64;
                                        if (var3_7 != 187090231 || !var2_3.equals("audio/mp3")) ** GOTO lbl-1000
                                        var3_7 = 2;
                                        break block65;
                                    }
                                    if (!var2_3.equals("audio/x-wav")) ** GOTO lbl-1000
                                    var3_7 = 1;
                                    break block65;
                                }
                                if (!var2_3.equals("audio/x-flac")) // 3 sources

                                {
                                    var3_7 = -1;
                                } else {
                                    var3_7 = 0;
                                }
                            }
                            if (var3_7 == 0) break block66;
                            if (var3_7 != 1) {
                                if (var3_7 == 2) {
                                    var2_3 = "audio/mpeg";
                                }
                                break block67;
                            } else {
                                var2_3 = "audio/wav";
                            }
                            break block67;
                        }
                        var2_3 = "audio/flac";
                    }
                    switch (var2_3.hashCode()) {
                        default: {
                            break;
                        }
                        case 2039520277: {
                            if (!var2_3.equals("video/x-matroska")) break;
                            var3_7 = 25;
                            break block61;
                        }
                        case 1505118770: {
                            if (!var2_3.equals("audio/webm")) break;
                            var3_7 = 24;
                            break block61;
                        }
                        case 1504831518: {
                            if (!var2_3.equals("audio/mpeg")) break;
                            var3_7 = 23;
                            break block61;
                        }
                        case 1504824762: {
                            if (!var2_3.equals("audio/midi")) break;
                            var3_7 = 22;
                            break block61;
                        }
                        case 1504619009: {
                            if (!var2_3.equals("audio/flac")) break;
                            var3_7 = 21;
                            break block61;
                        }
                        case 1504578661: {
                            if (!var2_3.equals("audio/eac3")) break;
                            var3_7 = 20;
                            break block61;
                        }
                        case 1503095341: {
                            if (!var2_3.equals("audio/3gpp")) break;
                            var3_7 = 19;
                            break block61;
                        }
                        case 1331848029: {
                            if (!var2_3.equals("video/mp4")) break;
                            var3_7 = 18;
                            break block61;
                        }
                        case 187099443: {
                            if (!var2_3.equals("audio/wav")) break;
                            var3_7 = 17;
                            break block61;
                        }
                        case 187091926: {
                            if (!var2_3.equals("audio/ogg")) break;
                            var3_7 = 16;
                            break block61;
                        }
                        case 187090232: {
                            if (!var2_3.equals("audio/mp4")) break;
                            var3_7 = 15;
                            break block61;
                        }
                        case 187078669: {
                            if (!var2_3.equals("audio/amr")) break;
                            var3_7 = 14;
                            break block61;
                        }
                        case 187078297: {
                            if (!var2_3.equals("audio/ac4")) break;
                            var3_7 = 13;
                            break block61;
                        }
                        case 187078296: {
                            if (!var2_3.equals("audio/ac3")) break;
                            var3_7 = 12;
                            break block61;
                        }
                        case 13915911: {
                            if (!var2_3.equals("video/x-flv")) break;
                            var3_7 = 11;
                            break block61;
                        }
                        case -43467528: {
                            if (!var2_3.equals("application/webm")) break;
                            var3_7 = 10;
                            break block61;
                        }
                        case -387023398: {
                            if (!var2_3.equals("audio/x-matroska")) break;
                            var3_7 = 9;
                            break block61;
                        }
                        case -1004728940: {
                            if (!var2_3.equals("text/vtt")) break;
                            var3_7 = 8;
                            break block61;
                        }
                        case -1079884372: {
                            if (!var2_3.equals("video/x-msvideo")) break;
                            var3_7 = 7;
                            break block61;
                        }
                        case -1248337486: {
                            if (!var2_3.equals("application/mp4")) break;
                            var3_7 = 6;
                            break block61;
                        }
                        case -1487394660: {
                            if (!var2_3.equals("image/jpeg")) break;
                            var3_7 = 5;
                            break block61;
                        }
                        case -1606874997: {
                            if (!var2_3.equals("audio/amr-wb")) break;
                            var3_7 = 4;
                            break block61;
                        }
                        case -1662095187: {
                            if (!var2_3.equals("video/webm")) break;
                            var3_7 = 3;
                            break block61;
                        }
                        case -1662384007: {
                            if (!var2_3.equals("video/mp2t")) break;
                            var3_7 = 2;
                            break block61;
                        }
                        case -1662384011: {
                            if (!var2_3.equals("video/mp2p")) break;
                            var3_7 = 1;
                            break block61;
                        }
                        case -2123537834: {
                            if (var2_3.equals("audio/eac3-joc")) break block68;
                        }
                    }
                    var3_7 = -1;
                    break block61;
                }
                var3_7 = 0;
            }
            switch (var3_7) {
                default: // 2 sources

                {
                    var4_8 = -1;
                    break;
                }
                case 23: {
                    var4_8 = 7;
                    break;
                }
                case 22: {
                    var4_8 = 15;
                    break;
                }
                case 21: {
                    var4_8 = 4;
                    break;
                }
                case 17: {
                    var4_8 = 12;
                    break;
                }
                case 16: {
                    var4_8 = 9;
                    break;
                }
                case 13: {
                    var4_8 = 1;
                    break;
                }
                case 11: {
                    var4_8 = 5;
                    break;
                }
                case 8: {
                    var4_8 = 13;
                    break;
                }
                case 7: {
                    var4_8 = 16;
                    break;
                }
                case 6: 
                case 15: 
                case 18: {
                    var4_8 = 8;
                    break;
                }
                case 5: {
                    var4_8 = 14;
                    break;
                }
                case 4: 
                case 14: 
                case 19: {
                    var4_8 = 3;
                    break;
                }
                case 3: 
                case 9: 
                case 10: 
                case 24: 
                case 25: {
                    var4_8 = 6;
                    break;
                }
                case 2: {
                    var4_8 = 11;
                    break;
                }
                case 1: {
                    var4_8 = 10;
                    break;
                }
                case 0: 
                case 12: 
                case 20: {
                    var4_8 = 0;
                }
            }
            if (var4_8 == -1) ** GOTO lbl200
            try {
                block62: {
                    block69: {
                        block71: {
                            block75: {
                                block76: {
                                    block78: {
                                        block79: {
                                            block80: {
                                                block81: {
                                                    block82: {
                                                        block83: {
                                                            block84: {
                                                                block77: {
                                                                    block74: {
                                                                        block73: {
                                                                            block72: {
                                                                                block70: {
                                                                                    pz.a(var4_8, var7_4);
lbl200:

                                                                                    if ((var1_1 = var1_1.getLastPathSegment()) == null) ** GOTO lbl-1000
                                                                                    if (var1_1.endsWith(".ac3") || var1_1.endsWith(".ec3")) break block69;
                                                                                    if (!var1_1.endsWith(".ac4")) break block70;
                                                                                    var3_7 = var5_6;
                                                                                    break block62;
                                                                                }
                                                                                if (var1_1.endsWith(".adts") || var1_1.endsWith(".aac")) break block71;
                                                                                if (!var1_1.endsWith(".amr")) break block72;
                                                                                var3_7 = 3;
                                                                                break block62;
                                                                            }
                                                                            if (!var1_1.endsWith(".flac")) break block73;
                                                                            var3_7 = 4;
                                                                            break block62;
                                                                        }
                                                                        if (!var1_1.endsWith(".flv")) break block74;
                                                                        var3_7 = 5;
                                                                        break block62;
                                                                    }
                                                                    if (var1_1.endsWith(".mid") || var1_1.endsWith(".midi") || var1_1.endsWith(".smf")) break block75;
                                                                    if (var1_1.startsWith(".mk", var1_1.length() - 4) || var1_1.endsWith(".webm")) break block76;
                                                                    if (!var1_1.endsWith(".mp3")) break block77;
                                                                    var3_7 = 7;
                                                                    break block62;
                                                                }
                                                                if (var1_1.endsWith(".mp4") || var1_1.startsWith(".m4", var1_1.length() - 4) || var1_1.startsWith(".mp4", var1_1.length() - 5) || var1_1.startsWith(".cmf", var1_1.length() - 5)) break block78;
                                                                if (var1_1.startsWith(".og", var1_1.length() - 4) || var1_1.endsWith(".opus")) break block79;
                                                                if (var1_1.endsWith(".ps") || var1_1.endsWith(".mpeg") || var1_1.endsWith(".mpg") || var1_1.endsWith(".m2p")) break block80;
                                                                if (var1_1.endsWith(".ts") || var1_1.startsWith(".ts", var1_1.length() - 4)) break block81;
                                                                if (var1_1.endsWith(".wav") || var1_1.endsWith(".wave")) break block82;
                                                                if (var1_1.endsWith(".vtt") || var1_1.endsWith(".webvtt")) break block83;
                                                                if (!var1_1.endsWith(".jpg") && !var1_1.endsWith(".jpeg")) {
                                                                    ** if (!var1_1.endsWith((String)".avi")) goto lbl-1000

                                                                    {
                                                                        var3_7 = 16;
                                                                        break block62;
                                                                    }
                                                                }
                                                                break block84;

                                                                {
                                                                    var3_7 = -1;
                                                                }
                                                                break block62;
                                                            }
                                                            var3_7 = 14;
                                                            break block62;
                                                        }
                                                        var3_7 = 13;
                                                        break block62;
                                                    }
                                                    var3_7 = 12;
                                                    break block62;
                                                }
                                                var3_7 = 11;
                                                break block62;
                                            }
                                            var3_7 = 10;
                                            break block62;
                                        }
                                        var3_7 = 9;
                                        break block62;
                                    }
                                    var3_7 = 8;
                                    break block62;
                                }
                                var3_7 = 6;
                                break block62;
                            }
                            var3_7 = 15;
                            break block62;
                        }
                        var3_7 = 2;
                        break block62;
                    }
                    var3_7 = 0;
                }
                if (var3_7 != -1 && var3_7 != var4_8) {
                    pz.a(var3_7, var7_4);
                }
                for (var5_6 = 0; var5_6 < 16; ++var5_6) {
                    var6_9 = var8_5[var5_6];
                    if (var6_9 == var4_8 || var6_9 == var3_7) continue;
                    pz.a(var6_9, var7_4);
                }
            }
        // Removed invalid catch block
            throw var1_2;
        }
    }
}


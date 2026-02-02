/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.h42
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.h42;
import com.yandex.mobile.ads.impl.k40;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class wt1
extends h42 {
    private long b = -9223372036854775807L;
    private long[] c = new long[0];
    private long[] d = new long[0];

    public wt1() {
        super((g62)new k40());
    }

    @Nullable
    private static Serializable a(int n10, bg1 bg12) {
        if (n10 != 8) {
            int n13 = 0;
            boolean bl2 = false;
            if (n10 != 10) {
                if (n10 != 11) {
                    if (n10 != 0) {
                        if (n10 != 1) {
                            if (n10 != 2) {
                                if (n10 != 3) {
                                    return null;
                                }
                                HashMap<String, Serializable> hashMap = new HashMap<String, Serializable>();
                                while (true) {
                                    n10 = bg12.z();
                                    n13 = bg12.d();
                                    bg12.f(n10);
                                    String string2 = new String(bg12.c(), n13, n10);
                                    n10 = bg12.t();
                                    if (n10 == 9) {
                                        return hashMap;
                                    }
                                    Serializable serializable = wt1.a(n10, bg12);
                                    if (serializable == null) continue;
                                    hashMap.put(string2, serializable);
                                }
                            }
                            n13 = bg12.z();
                            n10 = bg12.d();
                            bg12.f(n13);
                            return new String(bg12.c(), n10, n13);
                        }
                        if (bg12.t() == 1) {
                            bl2 = true;
                        }
                        return Boolean.valueOf(bl2);
                    }
                    return Double.valueOf(Double.longBitsToDouble(bg12.p()));
                }
                Date date = new Date((long)Double.longBitsToDouble(bg12.p()));
                bg12.f(2);
                return date;
            }
            int n14 = bg12.x();
            ArrayList<Serializable> arrayList = new ArrayList<Serializable>(n14);
            for (n10 = n13; n10 < n14; ++n10) {
                Serializable serializable = wt1.a(bg12.t(), bg12);
                if (serializable == null) continue;
                arrayList.add(serializable);
            }
            return arrayList;
        }
        return wt1.a(bg12);
    }

    private static HashMap<String, Object> a(bg1 bg12) {
        int n10 = bg12.x();
        HashMap<String, Object> hashMap = new HashMap<String, Object>(n10);
        for (int i14 = 0; i14 < n10; ++i14) {
            int n13 = bg12.z();
            int n14 = bg12.d();
            bg12.f(n13);
            String string2 = new String(bg12.c(), n14, n13);
            Serializable serializable = wt1.a(bg12.t(), bg12);
            if (serializable == null) continue;
            hashMap.put(string2, serializable);
        }
        return hashMap;
    }

    public final long a() {
        return this.b;
    }

    protected final boolean a(long l10, bg1 object) {
        double d14;
        if (object.t() != 2) {
            return false;
        }
        int n10 = object.z();
        int n13 = object.d();
        object.f(n10);
        if (!"onMetaData".equals(new String(object.c(), n13, n10))) {
            return false;
        }
        if (object.a() == 0) {
            return false;
        }
        if (object.t() != 8) {
            return false;
        }
        HashMap<String, Object> hashMap = wt1.a((bg1)object);
        if ((object = hashMap.get("duration")) instanceof Double && (d14 = ((Double)object).doubleValue()) > 0.0) {
            this.b = (long)(d14 * 1000000.0);
        }
        if ((object = hashMap.get("keyframes")) instanceof Map) {
            hashMap = (Map)object;
            object = hashMap.get("filepositions");
            hashMap = hashMap.get("times");
            if (object instanceof List && hashMap instanceof List) {
                object = (List)object;
                hashMap = (List)((Object)hashMap);
                n10 = hashMap.size();
                this.c = new long[n10];
                this.d = new long[n10];
                for (n13 = 0; n13 < n10; ++n13) {
                    Object e11 = object.get(n13);
                    Object e14 = hashMap.get(n13);
                    if (e14 instanceof Double && e11 instanceof Double) {
                        this.c[n13] = (long)((Double)e14 * 1000000.0);
                        this.d[n13] = ((Double)e11).longValue();
                        continue;
                    }
                    this.c = new long[0];
                    this.d = new long[0];
                    break;
                }
            }
        }
        return false;
    }

    public final long[] b() {
        return this.d;
    }

    public final long[] c() {
        return this.c;
    }
}


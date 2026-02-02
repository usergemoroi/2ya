/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.b8$a
 *  com.yandex.mobile.ads.impl.ba
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.c8
 *  com.yandex.mobile.ads.impl.ea0
 *  com.yandex.mobile.ads.impl.er1
 *  com.yandex.mobile.ads.impl.fd
 *  com.yandex.mobile.ads.impl.g80
 *  com.yandex.mobile.ads.impl.gh0
 *  com.yandex.mobile.ads.impl.hf0
 *  com.yandex.mobile.ads.impl.hf0$a
 *  com.yandex.mobile.ads.impl.is
 *  com.yandex.mobile.ads.impl.iz1$a
 *  com.yandex.mobile.ads.impl.m80
 *  com.yandex.mobile.ads.impl.ps0
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xr
 *  com.yandex.mobile.ads.impl.yc1
 *  com.yandex.mobile.ads.impl.zf0
 *  com.yandex.mobile.ads.impl.zq1
 *  com.yandex.mobile.ads.impl.zr1
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.ba;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.c8;
import com.yandex.mobile.ads.impl.ea0;
import com.yandex.mobile.ads.impl.er1;
import com.yandex.mobile.ads.impl.fd;
import com.yandex.mobile.ads.impl.g80;
import com.yandex.mobile.ads.impl.gh0;
import com.yandex.mobile.ads.impl.gz0;
import com.yandex.mobile.ads.impl.hf0;
import com.yandex.mobile.ads.impl.is;
import com.yandex.mobile.ads.impl.iz1;
import com.yandex.mobile.ads.impl.lq2;
import com.yandex.mobile.ads.impl.m80;
import com.yandex.mobile.ads.impl.mq2;
import com.yandex.mobile.ads.impl.ps0;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xr;
import com.yandex.mobile.ads.impl.yc1;
import com.yandex.mobile.ads.impl.zf0;
import com.yandex.mobile.ads.impl.zq1;
import com.yandex.mobile.ads.impl.zr1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public final class ad1<T>
implements yc1<T> {
    private static final long k = TimeUnit.SECONDS.toMillis(1L);
    @NotNull
    private final x2 a;
    @NotNull
    private final er1<T> b;
    @NotNull
    private final m80 c;
    @NotNull
    private final gz0 d;
    @NotNull
    private final zr1 e;
    @NotNull
    private final xr f;
    @NotNull
    private final zf0 g;
    @NotNull
    private final ps0 h;
    @NotNull
    private final fd i;
    @NotNull
    private final c8 j;

    public ad1(@NotNull x2 x22, @NotNull er1<T> er12, @NotNull m80 m802, @NotNull gz0 gz02, @NotNull zr1 zr12, @NotNull xr xr2, @NotNull zf0 zf02, @NotNull ps0 ps02, @NotNull fd fd3, @NotNull c8 c82) {
        this.a = x22;
        this.b = er12;
        this.c = m802;
        this.d = gz02;
        this.e = zr12;
        this.f = xr2;
        this.g = zf02;
        this.h = ps02;
        this.i = fd3;
        this.j = c82;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final Long a(String string2) {
        Long l10 = 0L;
        int n10 = ba.b;
        Long l11 = l10;
        if (string2 == null) return l11;
        try {
            return Long.valueOf(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return l10;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final Integer b(String string2) {
        int n10 = ba.b;
        if (string2 != null) {
            try {
                n10 = Integer.parseInt(string2);
                return Math.min(n10, 100);
            }
            catch (NumberFormatException numberFormatException) {}
        }
        n10 = 0;
        return Math.min(n10, 100);
    }

    public static /* synthetic */ Integer c(String string2) {
        return ad1.b(string2);
    }

    public static /* synthetic */ Long d(String string2) {
        return ad1.a(string2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NotNull
    public final b8<T> a(@NotNull zq1 object, @NotNull Map<String, String> map2, @NotNull is object2) {
        void var1_4;
        boolean bl2;
        String string2;
        void var2_13;
        Object object3;
        b8.a a12;
        block17: {
            a12 = new b8.a();
            a12.f(this.a.c());
            a12.a((is)object3);
            int n10 = hf0.d((Map)var2_13, (gh0)gh0.c);
            int n12 = hf0.d((Map)var2_13, (gh0)gh0.d);
            a12.e(n10);
            a12.b(n12);
            string2 = hf0.c((Map)var2_13, (gh0)gh0.Q);
            object3 = hf0.c((Map)var2_13, (gh0)gh0.R);
            a12.e(string2);
            a12.k((String)object3);
            a12.b(hf0.c((Map)var2_13, (gh0)gh0.g));
            String string3 = hf0.c((Map)var2_13, (gh0)gh0.V);
            if (string3 != null) {
                this.i.getClass();
                object3 = new HashMap();
                try {
                    string2 = new JSONObject(string3);
                    Iterator iterator = string2.keys();
                    while (iterator.hasNext()) {
                        String string4 = (String)iterator.next();
                        ((HashMap)object3).put(string4, string2.get(string4));
                    }
                }
                catch (Throwable throwable) {}
                a12.a((HashMap)object3);
            }
            object3 = this.a.q();
            string2 = null;
            object3 = object3 != null ? object3.a() : null;
            a12.a((iz1.a)object3);
            a12.c(hf0.f((Map)var2_13, (gh0)gh0.h));
            a12.f(hf0.f((Map)var2_13, (gh0)gh0.q));
            this.j.getClass();
            a12.a(c8.a((Map)var2_13));
            a12.a(hf0.a((Map)var2_13, (gh0)gh0.t, (hf0.a)new lq2()));
            a12.d(hf0.a((Map)var2_13, (gh0)gh0.O, (hf0.a)new mq2()));
            a12.e(hf0.f((Map)var2_13, (gh0)gh0.i));
            object3 = hf0.c((Map)var2_13, (gh0)gh0.j);
            n10 = ba.b;
            if (object3 != null) {
                try {
                    object3 = Integer.valueOf((String)object3);
                }
                catch (NumberFormatException numberFormatException) {}
            }
            object3 = null;
            object3 = object3 != null ? Long.valueOf((long)((Integer)object3).intValue() * k) : null;
            a12.a((Long)object3);
            object3 = hf0.c((Map)var2_13, (gh0)gh0.C);
            n10 = ba.b;
            if (object3 != null) {
                try {
                    object3 = Integer.valueOf((String)object3);
                }
                catch (NumberFormatException numberFormatException) {}
            }
            object3 = null;
            object3 = object3 != null ? Long.valueOf((long)((Integer)object3).intValue() * k) : null;
            a12.b((Long)object3);
            a12.g(hf0.c((Map)var2_13, (gh0)gh0.o));
            this.h.getClass();
            object3 = hf0.c((Map)var2_13, (gh0)gh0.p);
            Locale[] localeArray = Locale.getAvailableLocales();
            n12 = localeArray.length;
            bl2 = false;
            for (n10 = 0; n10 < n12; ++n10) {
                if (!y.e(localeArray[n10].getLanguage(), object3)) continue;
                object3 = new Locale((String)object3);
                break block17;
            }
            object3 = null;
        }
        a12.a((Locale)object3);
        a12.b(hf0.f((Map)var2_13, (gh0)gh0.n));
        a12.f(hf0.d((Map)var2_13, (gh0)gh0.y));
        a12.c(hf0.d((Map)var2_13, (gh0)gh0.z));
        a12.d(hf0.d((Map)var2_13, (gh0)gh0.A));
        a12.a(hf0.d((Map)var2_13, (gh0)gh0.F));
        a12.l(hf0.c((Map)var2_13, (gh0)gh0.x));
        a12.k(hf0.b((Map)var2_13, (gh0)gh0.l));
        a12.h(hf0.c((Map)var2_13, (gh0)gh0.Y));
        a12.j(hf0.c((Map)var2_13, (gh0)gh0.Z));
        a12.i(hf0.c((Map)var2_13, (gh0)gh0.a0));
        a12.c(hf0.c((Map)var2_13, (gh0)gh0.G));
        this.f.getClass();
        a12.a(xr.a((Map)var2_13));
        a12.a(this.e.a(object));
        this.c.getClass();
        object3 = object.b();
        String string5 = hf0.e((Map)object3, (gh0)gh0.v);
        object3 = hf0.c((Map)object3, (gh0)gh0.w);
        if (object3 != null) {
            try {
                object3 = Long.valueOf((String)object3);
            }
            catch (NumberFormatException numberFormatException) {}
        }
        object3 = null;
        object3 = string5 != null && object3 != null ? new g80(string5, ((Long)object3).longValue()) : null;
        a12.a((g80)object3);
        this.g.getClass();
        object3 = hf0.c((Map)var2_13, (gh0)gh0.k);
        object3 = object3 != null && ((String)object3).length() > 0 ? new c4((String)object3) : null;
        a12.a((c4)object3);
        object3 = hf0.c((Map)var2_13, (gh0)gh0.H);
        boolean bl3 = object3 == null ? false : Boolean.parseBoolean((String)object3);
        a12.l(bl3);
        object3 = hf0.c((Map)var2_13, (gh0)gh0.P);
        bl3 = object3 == null ? false : Boolean.parseBoolean((String)object3);
        a12.h(bl3);
        bl3 = hf0.b((Map)var2_13, (gh0)gh0.s);
        a12.f(bl3);
        if (bl3) {
            a12.a(this.d.b((zq1)object));
        } else {
            a12.a(this.b.a(object));
        }
        a12.d(hf0.c((Map)var2_13, (gh0)gh0.S));
        a12.a(hf0.c((Map)var2_13, (gh0)gh0.f));
        a12.d(hf0.b((Map)var2_13, (gh0)gh0.W));
        object3 = hf0.c((Map)var2_13, (gh0)gh0.L);
        String string6 = string2;
        if (object3 != null) {
            ea0 ea02 = new ea0((String)object3);
        }
        a12.a((ea0)var1_4);
        String string7 = hf0.c((Map)var2_13, (gh0)gh0.m);
        boolean bl4 = true;
        bl3 = string7 == null ? true : Boolean.parseBoolean(string7);
        a12.j(bl3);
        String string8 = hf0.c((Map)var2_13, (gh0)gh0.c0);
        bl3 = string8 == null ? false : Boolean.parseBoolean(string8);
        a12.i(bl3);
        String string9 = hf0.c((Map)var2_13, (gh0)gh0.d0);
        bl3 = string9 == null ? true : Boolean.parseBoolean(string9);
        a12.a(bl3);
        String string10 = hf0.c((Map)var2_13, (gh0)gh0.e0);
        bl3 = string10 == null ? true : Boolean.parseBoolean(string10);
        a12.e(bl3);
        String string11 = hf0.c((Map)var2_13, (gh0)gh0.f0);
        bl3 = string11 == null ? true : Boolean.parseBoolean(string11);
        a12.b(bl3);
        String string12 = hf0.c((Map)var2_13, (gh0)gh0.g0);
        bl3 = string12 == null ? bl4 : Boolean.parseBoolean(string12);
        a12.m(bl3);
        String string13 = hf0.c((Map)var2_13, (gh0)gh0.h0);
        bl3 = string13 == null ? false : Boolean.parseBoolean(string13);
        a12.g(bl3);
        String string14 = hf0.c((Map)var2_13, (gh0)gh0.i0);
        bl3 = string14 == null ? bl2 : Boolean.parseBoolean(string14);
        a12.c(bl3);
        return a12.a();
    }
}


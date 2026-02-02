/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  com.yandex.mobile.ads.impl.a3$a
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.em$a
 *  com.yandex.mobile.ads.impl.gh0
 *  com.yandex.mobile.ads.impl.hf0
 *  com.yandex.mobile.ads.impl.hh0
 *  com.yandex.mobile.ads.impl.iq1
 *  com.yandex.mobile.ads.impl.is
 *  com.yandex.mobile.ads.impl.is$a
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.pq1
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.r7
 *  com.yandex.mobile.ads.impl.tx1
 *  com.yandex.mobile.ads.impl.uc1
 *  com.yandex.mobile.ads.impl.ux1
 *  com.yandex.mobile.ads.impl.ux1$a
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.x3
 *  com.yandex.mobile.ads.impl.zc1
 *  kotlin.collections.s0
 *  kotlin.collections.t
 *  kotlin.jvm.functions.l
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.a3;
import com.yandex.mobile.ads.impl.ak;
import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.gh0;
import com.yandex.mobile.ads.impl.hf0;
import com.yandex.mobile.ads.impl.hh0;
import com.yandex.mobile.ads.impl.iq1;
import com.yandex.mobile.ads.impl.is;
import com.yandex.mobile.ads.impl.o62;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.ph;
import com.yandex.mobile.ads.impl.pq1;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.r7;
import com.yandex.mobile.ads.impl.tx1;
import com.yandex.mobile.ads.impl.uc1;
import com.yandex.mobile.ads.impl.ux1;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.x3;
import com.yandex.mobile.ads.impl.zc1;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class kj<T>
extends o62<x2, b8<T>> {
    @NotNull
    private final x2 C;
    @NotNull
    private final String D;
    @NotNull
    private final zc1<T> E;
    @NotNull
    private final ux1 F;
    @NotNull
    private final tx1 G;
    @NotNull
    private final x3 H;
    @NotNull
    private final r7 I;
    private final Context J;

    public /* synthetic */ kj(Context context, x2 x22, String string2, String string3, zc1 zc12, iq1 iq12, ak.a a12, pq1 pq12, ux1 ux12, int n10) {
        if ((n10 & 0x100) != 0) {
            ux1.a.getClass();
            ux12 = ux1.a.a((Context)context);
        }
        this(context, x22, string2, string3, zc12, iq12, a12, pq12, ux12, new tx1(ux12), new x3(), new r7());
    }

    public kj(@NotNull Context context, @NotNull x2 x22, @NotNull String string2, @NotNull String string3, @NotNull zc1<T> zc12, @Nullable iq1 iq12, @NotNull ak.a<b8<T>> a12, @NotNull pq1<x2, b8<T>> pq12, @NotNull ux1 ux12, @NotNull tx1 tx12, @NotNull x3 x33, @NotNull r7 r72) {
        x22.j().getClass();
        super(context, x22, 1, string2, a12, x22, pq12, iq12, 1792);
        this.C = x22;
        this.D = string3;
        this.E = zc12;
        this.F = ux12;
        this.G = tx12;
        this.H = x33;
        this.I = r72;
        this.J = context.getApplicationContext();
        int n10 = op0.b;
        this.a(context);
    }

    @Override
    private final void a(Context context) {
        int n10 = pw1.l;
        Object object = pw1.a.a().a(context);
        n10 = object != null && (object = object.X()) != null ? ((Integer)object).intValue() : this.C.g();
        this.a(this.I.a(context, n10));
    }

    @Override
    @NotNull
    protected final ar1<b8<T>> a(@NotNull uc1 uc12, int n10) {
        if (this.b(uc12, n10)) {
            Object object = uc12.c;
            Map map2 = object;
            if (object == null) {
                map2 = s0.j();
            }
            this.a(map2);
            String string2 = hf0.c((Map)map2, (gh0)gh0.e);
            object = string2;
            if (string2 == null) {
                object = "";
            }
            is.c.getClass();
            object = is.a.a((String)object);
            if (object == this.C.b()) {
                string2 = this.E.a(this.C);
                this.G.a(map2);
                map2 = string2.a(uc12, map2, (is)object);
                if (204 != n10) {
                    return ar1.a((Object)map2, (em.a)hh0.a((uc1)uc12));
                }
            }
        }
        n10 = a3.d;
        return ar1.a((dj2)a3.a.a((uc1)uc12));
    }

    @Override
    @NotNull
    public final dj2 b(@NotNull dj2 dj22) {
        int n10 = op0.b;
        n10 = a3.d;
        return super.b(a3.a.a((uc1)dj22.b));
    }

    protected boolean b(@NotNull uc1 object, int n10) {
        boolean bl2;
        boolean bl3 = bl2 = false;
        if (200 == n10) {
            object = object.b;
            bl3 = bl2;
            if (object != null) {
                n10 = ((uc1)object).length == 0 ? 1 : 0;
                bl3 = bl2;
                if ((n10 ^ 1) == 1) {
                    bl3 = true;
                }
            }
        }
        return bl3;
    }

    @Nullable
    public final byte[] b() throws ph {
        Object object;
        block3: {
            if (1 == this.f()) {
                try {
                    object = this.D;
                    Charset charset = Charset.forName("UTF-8");
                    y.i(charset, "forName(...)");
                    object = ((String)object).getBytes(charset);
                    y.i(object, "getBytes(...)");
                    break block3;
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    int n10 = op0.b;
                }
            }
            object = null;
        }
        return object;
    }

    @Override
    @NotNull
    public Map<String, String> e() {
        Map map2 = s0.d();
        String string2 = this.F.a();
        if (string2 != null) {
            int n10 = op0.b;
            string2 = map2.put(gh0.K.a(), string2);
        }
        map2.put(gh0.M.a(), this.H.b(this.J));
        map2.put(gh0.N.a(), this.H.a(this.J));
        map2.putAll(this.C.j().d());
        return s0.c((Map)map2);
    }

    @NotNull
    public final String l() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f() == 0) {
            stringBuilder.append(this.D);
        }
        List list = this.C.j().f();
        if (stringBuilder.length() > 0 && list.isEmpty() ^ true) {
            stringBuilder.append("&");
        }
        stringBuilder.append(t.B0((Iterable)list, (CharSequence)"&", null, null, (int)0, null, (l)a.b, (int)30, null));
        return Uri.parse((String)super.l()).buildUpon().encodedQuery(stringBuilder.toString()).build().toString();
    }
}


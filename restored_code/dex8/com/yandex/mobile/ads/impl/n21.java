/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.view.View
 *  android.webkit.WebViewClient
 *  com.yandex.mobile.ads.impl.af1
 *  com.yandex.mobile.ads.impl.ba
 *  com.yandex.mobile.ads.impl.bf1
 *  com.yandex.mobile.ads.impl.d92
 *  com.yandex.mobile.ads.impl.gf2
 *  com.yandex.mobile.ads.impl.h21
 *  com.yandex.mobile.ads.impl.ii2
 *  com.yandex.mobile.ads.impl.j70
 *  com.yandex.mobile.ads.impl.k70
 *  com.yandex.mobile.ads.impl.kq1
 *  com.yandex.mobile.ads.impl.kq1$a
 *  com.yandex.mobile.ads.impl.l21
 *  com.yandex.mobile.ads.impl.m70
 *  com.yandex.mobile.ads.impl.mg0
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.oq0
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.s11
 *  com.yandex.mobile.ads.impl.t11
 *  com.yandex.mobile.ads.impl.t21
 *  com.yandex.mobile.ads.impl.t21$a
 *  com.yandex.mobile.ads.impl.u21
 *  com.yandex.mobile.ads.impl.u21$a
 *  com.yandex.mobile.ads.impl.v0
 *  com.yandex.mobile.ads.impl.v21
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.webkit.WebViewClient;
import com.yandex.mobile.ads.impl.a31;
import com.yandex.mobile.ads.impl.af1;
import com.yandex.mobile.ads.impl.ba;
import com.yandex.mobile.ads.impl.bf1;
import com.yandex.mobile.ads.impl.d92;
import com.yandex.mobile.ads.impl.di2;
import com.yandex.mobile.ads.impl.gf2;
import com.yandex.mobile.ads.impl.h21;
import com.yandex.mobile.ads.impl.ii2;
import com.yandex.mobile.ads.impl.j70;
import com.yandex.mobile.ads.impl.k70;
import com.yandex.mobile.ads.impl.kq1;
import com.yandex.mobile.ads.impl.l21;
import com.yandex.mobile.ads.impl.l70;
import com.yandex.mobile.ads.impl.m70;
import com.yandex.mobile.ads.impl.mg0;
import com.yandex.mobile.ads.impl.mi2;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.oq0;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.s11;
import com.yandex.mobile.ads.impl.t11;
import com.yandex.mobile.ads.impl.t21;
import com.yandex.mobile.ads.impl.u21;
import com.yandex.mobile.ads.impl.v0;
import com.yandex.mobile.ads.impl.v21;
import com.yandex.mobile.ads.impl.x03;
import com.yandex.mobile.ads.impl.x32;
import com.yandex.mobile.ads.impl.zf1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z0;
import kotlin.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class n21
implements bf1 {
    @NotNull
    private final zf1 a;
    @NotNull
    private final h21 b;
    @NotNull
    private final u21 c;
    @NotNull
    private final ii2 d;
    @NotNull
    private final d92 e;
    @NotNull
    private final k70 f;
    @Nullable
    private final ou1 g;
    @NotNull
    private final a31 h;
    private boolean i;
    @NotNull
    private final m70<?> j;
    @NotNull
    private final String k;
    @Nullable
    private v21 l;
    @Nullable
    private t11 m;
    @Nullable
    private s11 n;
    @Nullable
    private af1 o;
    @Nullable
    private gf2 p;
    @NotNull
    private di2 q;
    @Nullable
    private j70 r;

    public /* synthetic */ n21(zf1 zf12) {
        h21 h212 = new h21(zf12);
        u21 u212 = new u21();
        ii2 ii22 = new ii2();
        d92 d922 = new d92();
        k70 k702 = new k70();
        int n10 = pw1.l;
        this(zf12, h212, u212, ii22, d922, k702, pw1.a.a().a(zf12.i()));
    }

    public n21(@NotNull zf1 zf12, @NotNull h21 object, @NotNull u21 u212, @NotNull ii2 ii22, @NotNull d92 d922, @NotNull k70 k702, @Nullable ou1 ou12) {
        this.a = zf12;
        this.b = object;
        this.c = u212;
        this.d = ii22;
        this.e = d922;
        this.f = k702;
        this.g = ou12;
        object = new a31(new a(this));
        this.h = object;
        this.q = di2.d;
        zf12.setWebViewClient((WebViewClient)object);
        this.j = new m70((View)zf12, k702, (bf1)this);
        this.k = ba.a((Object)this);
    }

    private static final void a(n21 n212, String string2, String string3) {
        n212.h.a(string3);
        n212.b.b(string2);
    }

    private final void a(t21 object, LinkedHashMap linkedHashMap) throws l21 {
        if (this.l != null) {
            switch (object.ordinal()) {
                default: {
                    throw new l21("Unspecified MRAID Javascript command");
                }
                case 8: {
                    object = this.g;
                    if (object == null || !object.S()) break;
                    this.a.a();
                    break;
                }
                case 6: {
                    boolean bl2 = Boolean.parseBoolean((String)linkedHashMap.get("shouldUseCustomClose"));
                    object = this.o;
                    if (object == null) break;
                    object.a(bl2);
                    break;
                }
                case 5: {
                    object = this.m;
                    if (object == null) break;
                    object.a();
                    break;
                }
                case 4: {
                    this.a(linkedHashMap);
                    break;
                }
                case 3: {
                    if (di2.c != this.q) break;
                    object = di2.e;
                    this.q = object;
                    this.b.a(new oq0[]{object});
                    object = this.o;
                    if (object == null) break;
                    object.c();
                    break;
                }
                case 2: {
                    object = this.n;
                    if (object == null) break;
                    object.b();
                    break;
                }
                case 1: {
                    object = this.n;
                    if (object == null) break;
                    object.e();
                    break;
                }
                case 0: {
                    object = this.p;
                    if (object == null) break;
                    object.onVideoComplete();
                }
            }
            return;
        }
        throw new l21("Invalid state to execute this command");
    }

    private final void a(Map<String, String> object) throws l21 {
        Object object2;
        if (this.l != null && ((object2 = this.g) == null || !object2.Y() || this.i)) {
            if ((object = object.get("url")) != null && object.length() > 0) {
                object2 = this.l;
                if (object2 != null) {
                    object2.a((String)object);
                }
                int n10 = op0.b;
            } else {
                object2 = z0.a;
                throw new l21(v0.a((Object[])new Object[]{object}, (int)1, (String)"Mraid open command sent an invalid URL: %s", (String)"format(...)"));
            }
        }
    }

    public static /* synthetic */ void b(n21 n212, String string2, String string3) {
        n21.a(n212, string2, string3);
    }

    public final void a() {
        this.j.b();
        u21 u212 = this.c;
        Context context = this.a.getContext();
        String string2 = this.k;
        u212.getClass();
        int n10 = kq1.c;
        kq1.a.a();
        kq1.a((Context)context, (Object)string2);
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    public final void a(@Nullable af1 af12) {
        this.o = af12;
    }

    public final void a(@Nullable gf2 gf22) {
        this.p = gf22;
    }

    public final void a(@NotNull j70 object) {
        if (!y.e(object, this.r)) {
            this.r = object;
            object = new l70(object.a(), object.b());
            this.b.a(new oq0[]{object});
        }
    }

    public final void a(@Nullable s11 s112) {
        this.n = s112;
    }

    public final void a(@Nullable t11 t112) {
        this.m = t112;
    }

    public final void a(@Nullable v21 v212) {
        this.l = v212;
    }

    public final void a(@NotNull zf1 zf12, @NotNull Map map2) {
        Object object = this.a;
        x32 x322 = new x32((zf1)((Object)object));
        this.d.getClass();
        object = new mi2(ii2.a((View)object));
        Object object2 = this.f.a((View)this.a);
        l70 l702 = new l70(object2.a(), object2.b());
        object2 = di2.c;
        this.q = object2;
        this.b.a(new oq0[]{object2, object, l702, x322});
        this.b.a();
        x322 = this.l;
        if (x322 != null) {
            x322.a(zf12, map2);
        }
    }

    public final void a(@NotNull String object) {
        Context context = this.a.getContext();
        u21 u212 = this.c;
        String string2 = this.k;
        object = new x03(this, (String)object);
        u212.getClass();
        u21.a((Context)context, (String)string2, (u21.a)object);
    }

    public final void a(boolean bl2) {
        Object object = new mi2(bl2);
        this.b.a(new oq0[]{object});
        if (bl2) {
            this.j.a();
        } else {
            this.j.b();
            object = this.f.a((View)this.a);
            if (!y.e(object, this.r)) {
                this.r = object;
                object = new l70(object.a(), object.b());
                this.b.a(new oq0[]{object});
            }
        }
    }

    public final void b() {
        if (di2.c == this.q) {
            di2 di22;
            this.q = di22 = di2.e;
            this.b.a(new oq0[]{di22});
        }
    }

    public final void b(@NotNull String object) {
        this.e.getClass();
        if (d92.a((String)object)) {
            Uri uri = Uri.parse((String)object);
            String string2 = uri.getScheme();
            String string3 = uri.getHost();
            if (!y.e("mraid", string2) && !y.e("mobileads", string2)) {
                this.a(s0.g(z.a("url", object)));
            } else {
                object = new LinkedHashMap();
                for (String string4 : uri.getQueryParameterNames()) {
                    object.put(string4, uri.getQueryParameter(string4));
                }
                t21.c.getClass();
                uri = t21.a.a((String)string3);
                try {
                    this.a((t21)uri, (LinkedHashMap)object);
                }
                catch (Exception exception) {
                    String string5 = string3 = exception.getMessage();
                    if (string3 == null) {
                        string5 = "Unknown exception";
                    }
                    this.b.a((t21)uri, string5);
                }
                this.b.a((t21)uri);
            }
        } else {
            int n10 = op0.b;
            this.b.a(t21.d, "Mraid command sent an invalid URL");
        }
    }

    public final void c() {
        this.i = true;
        v21 v212 = this.l;
        if (v212 != null) {
            v212.a();
        }
    }

    private final class a
    implements mg0 {
        final n21 a;

        public a(n21 n212) {
            this.a = n212;
        }

        public final void a() {
            this.a.a.a();
        }

        public final void a(int n10) {
            this.a.a.a(n10);
        }

        public final void a(@NotNull Context context, @NotNull String string2) {
            this.a.a.a(context, string2);
        }
    }
}


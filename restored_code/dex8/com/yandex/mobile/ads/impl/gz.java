/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.k72
 *  com.yandex.mobile.ads.impl.lv$a
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.pv
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ab0;
import com.yandex.mobile.ads.impl.fg;
import com.yandex.mobile.ads.impl.g82;
import com.yandex.mobile.ads.impl.jv;
import com.yandex.mobile.ads.impl.k72;
import com.yandex.mobile.ads.impl.lv;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.rr;
import com.yandex.mobile.ads.impl.tj;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.wn1;
import com.yandex.mobile.ads.impl.zs0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class gz
implements lv {
    private final Context a;
    private final ArrayList b;
    private final lv c;
    @Nullable
    private ab0 d;
    @Nullable
    private fg e;
    @Nullable
    private rr f;
    @Nullable
    private lv g;
    @Nullable
    private g82 h;
    @Nullable
    private jv i;
    @Nullable
    private wn1 j;
    @Nullable
    private lv k;

    public gz(Context context, lv lv2) {
        this.a = context.getApplicationContext();
        this.c = (lv)uf.a((Object)lv2);
        this.b = new ArrayList();
    }

    private void a(lv lv2) {
        for (int i14 = 0; i14 < this.b.size(); ++i14) {
            lv2.a((k72)this.b.get(i14));
        }
    }

    @Override
    public final long a(pv pv3) throws IOException {
        if (this.k == null) {
            Object object = pv3.a.getScheme();
            Object object2 = pv3.a;
            int n10 = m92.a;
            if (!TextUtils.isEmpty((CharSequence)(object2 = object2.getScheme())) && !"file".equals(object2)) {
                if ("asset".equals(object)) {
                    if (this.e == null) {
                        this.e = object = new fg(this.a);
                        this.a((lv)object);
                    }
                    this.k = this.e;
                } else if ("content".equals(object)) {
                    if (this.f == null) {
                        this.f = object = new rr(this.a);
                        this.a((lv)object);
                    }
                    this.k = this.f;
                } else if ("rtmp".equals(object)) {
                    if (this.g == null) {
                        try {
                            this.g = object = (lv)Class.forName("com.monetization.ads.exo.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                            this.a((lv)object);
                        }
                        catch (Exception exception) {
                            throw new RuntimeException("Error instantiating RTMP extension", exception);
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            zs0.d((String)"DefaultDataSource", (String)"Attempting to play RTMP stream without depending on the RTMP extension");
                        }
                        if (this.g == null) {
                            this.g = this.c;
                        }
                    }
                    this.k = this.g;
                } else if ("udp".equals(object)) {
                    if (this.h == null) {
                        this.h = object = new g82(0);
                        this.a((lv)object);
                    }
                    this.k = this.h;
                } else if ("data".equals(object)) {
                    if (this.i == null) {
                        this.i = object = new jv();
                        this.a((lv)object);
                    }
                    this.k = this.i;
                } else if (!"rawresource".equals(object) && !"android.resource".equals(object)) {
                    this.k = this.c;
                } else {
                    if (this.j == null) {
                        this.j = object = new wn1(this.a);
                        this.a((lv)object);
                    }
                    this.k = this.j;
                }
            } else {
                object = pv3.a.getPath();
                if (object != null && ((String)object).startsWith("/android_asset/")) {
                    if (this.e == null) {
                        this.e = object = new fg(this.a);
                        this.a((lv)object);
                    }
                    this.k = this.e;
                } else {
                    if (this.d == null) {
                        this.d = object = new ab0();
                        this.a((lv)object);
                    }
                    this.k = this.d;
                }
            }
            return this.k.a(pv3);
        }
        throw new IllegalStateException();
    }

    @Override
    public final void a(k72 k722) {
        k722.getClass();
        this.c.a(k722);
        this.b.add(k722);
        lv lv2 = this.d;
        if (lv2 != null) {
            ((tj)lv2).a(k722);
        }
        if ((lv2 = this.e) != null) {
            ((tj)lv2).a(k722);
        }
        if ((lv2 = this.f) != null) {
            ((tj)lv2).a(k722);
        }
        if ((lv2 = this.g) != null) {
            lv2.a(k722);
        }
        if ((lv2 = this.h) != null) {
            ((tj)lv2).a(k722);
        }
        if ((lv2 = this.i) != null) {
            ((tj)lv2).a(k722);
        }
        if ((lv2 = this.j) != null) {
            ((tj)lv2).a(k722);
        }
    }

    @Override
    public final void close() throws IOException {
        lv lv2 = this.k;
        if (lv2 != null) {
            try {
                lv2.close();
            }
            finally {
                this.k = null;
            }
        }
    }

    @Override
    public final Map<String, List<String>> getResponseHeaders() {
        Object object = this.k;
        object = object == null ? Collections.emptyMap() : object.getResponseHeaders();
        return object;
    }

    @Override
    @Nullable
    public final Uri getUri() {
        lv lv2 = this.k;
        lv2 = lv2 == null ? null : lv2.getUri();
        return lv2;
    }

    public final int read(byte[] byArray, int n10, int n12) throws IOException {
        lv lv2 = this.k;
        lv2.getClass();
        return lv2.read(byArray, n10, n12);
    }

    public static final class a
    implements lv.a {
        private final Context a;
        private final lv.a b;

        public a(Context context, lv.a a13) {
            this.a = context.getApplicationContext();
            this.b = a13;
        }

        public final lv a() {
            return new gz(this.a, this.b.a());
        }
    }
}


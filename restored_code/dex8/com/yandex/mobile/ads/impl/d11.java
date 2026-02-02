/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ef0
 *  com.yandex.mobile.ads.impl.jq1
 *  com.yandex.mobile.ads.impl.m11
 *  com.yandex.mobile.ads.impl.mh0
 *  com.yandex.mobile.ads.impl.nh0
 *  com.yandex.mobile.ads.impl.uc1
 *  com.yandex.mobile.ads.impl.vc1
 *  com.yandex.mobile.ads.impl.vh0
 *  com.yandex.mobile.ads.impl.xj
 *  com.yandex.mobile.ads.impl.xn1
 *  com.yandex.mobile.ads.impl.yp1
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ef0;
import com.yandex.mobile.ads.impl.jq1;
import com.yandex.mobile.ads.impl.m11;
import com.yandex.mobile.ads.impl.mh0;
import com.yandex.mobile.ads.impl.nh0;
import com.yandex.mobile.ads.impl.ph;
import com.yandex.mobile.ads.impl.uc1;
import com.yandex.mobile.ads.impl.vc1;
import com.yandex.mobile.ads.impl.vh0;
import com.yandex.mobile.ads.impl.xj;
import com.yandex.mobile.ads.impl.xn1;
import com.yandex.mobile.ads.impl.yp1;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import kotlin.io.b;
import kotlin.io.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class d11
extends xj {
    @NotNull
    private final xn1 a;
    @NotNull
    private final vc1 b;
    @NotNull
    private final nh0 c;
    @NotNull
    private final xj d;

    public d11(@NotNull Context context, @Nullable SSLSocketFactory sSLSocketFactory, @NotNull xn1 xn12, @NotNull vc1 vc12, @NotNull nh0 nh02, @NotNull vh0 vh02) {
        this.a = xn12;
        this.b = vc12;
        this.c = nh02;
        vh02.getClass();
        this.d = vh0.a((Context)context, (SSLSocketFactory)sSLSocketFactory);
    }

    private final mh0 b(yp1<?> object, Map<String, String> object2) {
        uc1 uc12 = this.b.a((yp1)object);
        if (uc12 != null) {
            this.a.getClass();
            object = new ArrayList();
            object2 = uc12.c;
            if (object2 != null) {
                for (Map.Entry entry : object2.entrySet()) {
                    ((ArrayList)object).add(new ef0((String)entry.getKey(), (String)entry.getValue()));
                }
            }
            object = new mh0(uc12.a, (List)object, uc12.b);
        } else {
            object = this.d.a((yp1)object, (Map)((Object)object2));
        }
        return object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NotNull
    public final mh0 a(@NotNull yp1<?> var1_1, @NotNull Map<String, String> var2_2) throws IOException, ph {
        block9: {
            if (!m11.a.a()) {
                return this.b((yp1<?>)var1_1 /* !! */ , (Map<String, String>)var2_2);
            }
            var3_4 = System.currentTimeMillis();
            var6_5 = this.b((yp1<?>)var1_1 /* !! */ , (Map<String, String>)var2_2);
            this.c.getClass();
            var2_2 = var6_5.a();
            if (var2_2 == null) ** GOTO lbl24
            var5_6 /* !! */  = kotlin.io.b.c((InputStream)var2_2);
            kotlin.io.c.a((Closeable)var2_2, null);
            var2_2 = var5_6 /* !! */ ;
            if (var5_6 /* !! */  != null) break block9;
            ** GOTO lbl24
            catch (Throwable var7_8) {
                try {
                    throw var7_8;
                }
                catch (Throwable var5_7) {
                    try {
                        kotlin.io.c.a((Closeable)var2_2, var7_8);
                        throw var5_7;
lbl24:
                        // 2 sources

                        var2_2 = new byte[0];
                    }
                    catch (Exception var2_3) {
                        var2_2 = new byte[0];
                    }
                }
            }
        }
        var2_2 = new mh0(var6_5.e(), var6_5.d(), (byte[])var2_2);
        var5_6 /* !! */  = (byte[])new uc1(var2_2.e(), var2_2.b(), true, System.currentTimeMillis() - var3_4, var2_2.d());
        jq1.a((long)System.currentTimeMillis(), (yp1)var1_1 /* !! */ , (uc1)var5_6 /* !! */ );
        return var2_2;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.XmlResourceParser
 *  android.os.Build$VERSION
 *  android.util.Log
 *  com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
 *  com.yandex.varioqub.analyticadapter.data.ConfigData
 *  com.yandex.varioqub.config.FetchError
 *  com.yandex.varioqub.config.OnFetchCompleteListener
 *  com.yandex.varioqub.config.VarioqubApi
 *  com.yandex.varioqub.config.VarioqubSettings
 *  com.yandex.varioqub.config.impl.C
 *  com.yandex.varioqub.config.impl.D
 *  com.yandex.varioqub.config.impl.a
 *  com.yandex.varioqub.config.impl.a0
 *  com.yandex.varioqub.config.impl.b
 *  com.yandex.varioqub.config.impl.b0
 *  com.yandex.varioqub.config.impl.c
 *  com.yandex.varioqub.config.impl.c0
 *  com.yandex.varioqub.config.impl.d
 *  com.yandex.varioqub.config.impl.d0
 *  com.yandex.varioqub.config.impl.e0
 *  com.yandex.varioqub.config.impl.g
 *  com.yandex.varioqub.config.impl.h
 *  com.yandex.varioqub.config.impl.i
 *  com.yandex.varioqub.config.impl.l
 *  com.yandex.varioqub.config.impl.m
 *  com.yandex.varioqub.config.impl.t
 *  com.yandex.varioqub.config.impl.u
 *  com.yandex.varioqub.config.model.ConfigValue
 *  com.yandex.varioqub.protobuf.nano.MessageNano
 *  kotlin.collections.l
 *  kotlin.collections.s0
 *  kotlin.collections.t
 *  kotlin.jvm.functions.a
 */
package com.yandex.varioqub.config.impl;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.Log;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.config.FetchError;
import com.yandex.varioqub.config.OnFetchCompleteListener;
import com.yandex.varioqub.config.VarioqubApi;
import com.yandex.varioqub.config.VarioqubSettings;
import com.yandex.varioqub.config.impl.C;
import com.yandex.varioqub.config.impl.D;
import com.yandex.varioqub.config.impl.a;
import com.yandex.varioqub.config.impl.a0;
import com.yandex.varioqub.config.impl.b;
import com.yandex.varioqub.config.impl.b0;
import com.yandex.varioqub.config.impl.c;
import com.yandex.varioqub.config.impl.c0;
import com.yandex.varioqub.config.impl.d;
import com.yandex.varioqub.config.impl.d0;
import com.yandex.varioqub.config.impl.e;
import com.yandex.varioqub.config.impl.e0;
import com.yandex.varioqub.config.impl.f;
import com.yandex.varioqub.config.impl.g;
import com.yandex.varioqub.config.impl.h;
import com.yandex.varioqub.config.impl.i;
import com.yandex.varioqub.config.impl.l;
import com.yandex.varioqub.config.impl.m;
import com.yandex.varioqub.config.impl.n;
import com.yandex.varioqub.config.impl.o;
import com.yandex.varioqub.config.impl.p;
import com.yandex.varioqub.config.impl.r;
import com.yandex.varioqub.config.impl.s;
import com.yandex.varioqub.config.impl.t;
import com.yandex.varioqub.config.impl.u;
import com.yandex.varioqub.config.impl.v;
import com.yandex.varioqub.config.impl.w;
import com.yandex.varioqub.config.impl.x;
import com.yandex.varioqub.config.impl.y;
import com.yandex.varioqub.config.model.ConfigValue;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.s0;
import kotlin.k0;
import okhttp3.b0;

public final class B
implements VarioqubApi {
    public a a;
    public c b;
    public t c;
    public Executor d;
    public g e;
    public VarioqubSettings f;
    public final AtomicBoolean g = new AtomicBoolean(false);

    public static final void a(B b11) {
        VarioqubSettings varioqubSettings = b11.f;
        b11 = varioqubSettings;
        if (varioqubSettings == null) {
            kotlin.jvm.internal.y.B("settings");
            b11 = null;
        }
        b11.clearClientFeatures$config_release();
    }

    public static final void a(B object, int n10, kotlin.jvm.functions.a a14) {
        Object object2 = ((B)object).c;
        object = null;
        t t13 = object2;
        if (object2 == null) {
            kotlin.jvm.internal.y.B("storage");
            t13 = null;
        }
        if (n10 != -1) {
            object2 = com.yandex.varioqub.config.impl.d.a;
            if (object2 == null) {
                kotlin.jvm.internal.y.B("appContext");
            } else {
                object = object2;
            }
            LinkedHashMap<String, ConfigValue> linkedHashMap = new LinkedHashMap<String, ConfigValue>();
            if (object != null && object.getResources() != null) {
                XmlResourceParser xmlResourceParser = object.getResources().getXml(n10);
                String string2 = "";
                object2 = object = "";
                while (xmlResourceParser.next() != 1) {
                    n10 = xmlResourceParser.getEventType();
                    if (n10 != 2) {
                        if (n10 != 3) {
                            if (n10 != 4) continue;
                            if (kotlin.jvm.internal.y.e(object, "key")) {
                                string2 = xmlResourceParser.getText();
                                continue;
                            }
                            if (!kotlin.jvm.internal.y.e(object, "value")) continue;
                            object2 = xmlResourceParser.getText();
                            continue;
                        }
                        if (kotlin.jvm.internal.y.e(xmlResourceParser.getName(), "entry") && string2.length() > 0 && ((String)object2).length() > 0) {
                            linkedHashMap.put(string2, ConfigValue.Companion.createInappDefault$config_release((String)object2));
                        }
                        object = "";
                        continue;
                    }
                    object = xmlResourceParser.getName();
                }
            }
            t13.a = linkedHashMap;
            if (a14 != null) {
                a14.invoke();
            }
            return;
        }
        object = new StringBuilder("Invalid resId: ");
        ((StringBuilder)object).append(n10);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(B var0, OnFetchCompleteListener var1_7) {
        block60: {
            block56: {
                block57: {
                    block62: {
                        block61: {
                            block59: {
                                block54: {
                                    block55: {
                                        block52: {
                                            block58: {
                                                block50: {
                                                    block53: {
                                                        var8_8 = var0 /* !! */ .b;
                                                        var7_10 = var8_8;
                                                        if (var8_8 == null) {
                                                            kotlin.jvm.internal.y.B("configFetcher");
                                                            var7_10 = null;
                                                        }
                                                        var8_8 = var9_11 = var0 /* !! */ .f;
                                                        if (var9_11 == null) {
                                                            kotlin.jvm.internal.y.B("settings");
                                                            var8_8 = null;
                                                        }
                                                        var9_11 = var0 /* !! */ .e;
                                                        var0 /* !! */  = var9_11;
                                                        if (var9_11 == null) {
                                                            kotlin.jvm.internal.y.B("identifierProvider");
                                                            var0 /* !! */  = null;
                                                        }
                                                        var7_10.a();
                                                        var9_11 = TimeUnit.SECONDS;
                                                        var0 /* !! */  = var0 /* !! */ .b.await(10L, (TimeUnit)var9_11) != false ? new h(var0 /* !! */ .c, var0 /* !! */ .d) : null;
                                                        if (var0 /* !! */  == null) {
                                                            if (var1_7 == null) return;
                                                            var1_7.onError("identifiers is null", FetchError.IDENTIFIERS_NULL);
                                                            return;
                                                        }
                                                        var7_10.e.getClass();
                                                        if (System.currentTimeMillis() - var7_10.f <= var7_10.b) break block57;
                                                        l.b((int)1);
                                                        var10_12 = var7_10.a;
                                                        var9_11 = D.a((String)var8_8.getClientId$config_release());
                                                        var12_13 = var7_10.i;
                                                        var11_14 = var0 /* !! */ .a;
                                                        var13_15 /* !! */  = var0 /* !! */ .b;
                                                        var14_16 = var8_8.getClientFeatures$config_release();
                                                        var8_8 = var7_10.d.a.getAdapterName();
                                                        var0 /* !! */  = new p();
                                                        var0 /* !! */ .a = var12_13;
                                                        var0 /* !! */ .b = var11_14;
                                                        var0 /* !! */ .f = com.yandex.varioqub.config.impl.b.c().versionName;
                                                        var0 /* !! */ .g = com.yandex.varioqub.config.impl.b.d();
                                                        var0 /* !! */ .d = "0.7.0";
                                                        var0 /* !! */ .e = "android";
                                                        var0 /* !! */ .h = com.yandex.varioqub.config.impl.b.b();
                                                        var0 /* !! */ .i = var13_15 /* !! */ ;
                                                        var11_14 = new ArrayList<E>(var14_16.size());
                                                        for (Iterator<T> var12_13 : var14_16.entrySet()) {
                                                            var14_16 = new n();
                                                            var14_16.a = (String)var12_13.getKey();
                                                            var14_16.b = (String)var12_13.getValue();
                                                            var11_14.add(var14_16);
                                                        }
                                                        if ((var11_14 = var11_14.toArray(new n[0])) == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                                        var0 /* !! */ .c = var11_14;
                                                        var11_14 = l.c;
                                                        synchronized (var11_14) {
                                                            var12_13 = s0.C((Map)l.b);
                                                        }
                                                        var3_17 = var12_13.size();
                                                        var11_14 = new o[var3_17];
                                                        for (var2_18 = 0; var2_18 < var3_17; ++var2_18) {
                                                            var11_14[var2_18] = new o();
                                                        }
                                                        var12_13 = var12_13.entrySet().iterator();
                                                        var2_18 = 0;
                                                        while (var12_13.hasNext()) {
                                                            var13_15 /* !! */  = var12_13.next();
                                                            if (var2_18 < 0) {
                                                                kotlin.collections.t.w();
                                                            }
                                                            var14_16 = (Map.Entry)var13_15 /* !! */ ;
                                                            var13_15 /* !! */  = new o();
                                                            var13_15 /* !! */ .a = (String)var14_16.getKey();
                                                            var13_15 /* !! */ .b = ((Number)var14_16.getValue()).longValue();
                                                            var14_16 = k0.a;
                                                            var11_14[var2_18] = var13_15 /* !! */ ;
                                                            ++var2_18;
                                                        }
                                                        var0 /* !! */ .j = var11_14;
                                                        var0 /* !! */ .k = String.valueOf(com.yandex.varioqub.config.impl.b.a());
                                                        var0 /* !! */ .l = Build.VERSION.RELEASE;
                                                        var0 /* !! */ .m = var8_8;
                                                        var0 /* !! */ .n = var8_8;
                                                        var8_8 = new StringBuilder("Varioqub request formed - ");
                                                        var8_8.append(var0 /* !! */ );
                                                        var8_8 = var8_8.toString();
                                                        if (C.a) {
                                                            Log.d((String)"Varioqub/RequestBodyFormer", (String)var8_8);
                                                        }
                                                        var11_14 = MessageNano.toByteArray((MessageNano)var0 /* !! */ );
                                                        if (var10_12.b.compareAndSet(false, true)) {
                                                            var8_8 = com.yandex.varioqub.config.impl.d.a;
                                                            var0 /* !! */  = var8_8;
                                                            if (var8_8 == null) {
                                                                kotlin.jvm.internal.y.B("appContext");
                                                                var0 /* !! */  = null;
                                                            }
                                                            var8_8 = new StringBuilder();
                                                            var8_8.append(var0 /* !! */ .getPackageName());
                                                            var8_8.append("_varioqub_pref");
                                                            var8_8 = var0 /* !! */ .getSharedPreferences(var8_8.toString(), 0).getString("etag", "");
                                                            var0 /* !! */  = var8_8;
                                                            if (var8_8 == null) {
                                                                var0 /* !! */  = "";
                                                            }
                                                            var10_12.c = var0 /* !! */ ;
                                                        }
                                                        var0 /* !! */  = new StringBuilder("Network request to: ");
                                                        var0 /* !! */ .append((String)var9_11);
                                                        var0 /* !! */ .append(". Content length - ");
                                                        var0 /* !! */ .append(((n[])var11_14).length);
                                                        var0 /* !! */  = var0 /* !! */ .toString();
                                                        if (C.a) {
                                                            Log.d((String)"Varioqub/NetworkClient", (String)var0 /* !! */ );
                                                        }
                                                        var0 /* !! */  = new b0.a();
                                                        var0 /* !! */  = var0 /* !! */ .h(okhttp3.c0.create(okhttp3.x.g("application/x-protobuf"), (byte[])var11_14)).k((String)var9_11).e("If-None-Match", var10_12.c).b();
                                                        var11_14 = var10_12.a.a((okhttp3.b0)var0 /* !! */ ).execute();
                                                        try {
                                                            block51: {
                                                                var8_8 = var11_14.r("ETag");
                                                                var0 /* !! */  = var8_8;
                                                                if (var8_8 == null) {
                                                                    var0 /* !! */  = "";
                                                                }
                                                                var10_12.c = var0 /* !! */ ;
                                                                m.b((String)var0 /* !! */ );
                                                                if (!var11_14.A()) break block50;
                                                                var0 /* !! */  = var11_14.d();
                                                                if (var0 /* !! */  != null) {
                                                                    try {
                                                                        var0 /* !! */  = (B)var0 /* !! */ .bytes();
                                                                        break block51;
                                                                    }
                                                                    catch (Throwable var0_1) {
                                                                        break block52;
                                                                    }
                                                                }
                                                                var0 /* !! */  = null;
                                                            }
                                                            if (var0 /* !! */  != null) break block53;
                                                        }
                                                        catch (Throwable var0_3) {
                                                            break block52;
                                                        }
                                                        try {
                                                            var0 /* !! */  = (B)new byte[0];
                                                        }
                                                        catch (Throwable var0_2) {
                                                            break block52;
                                                        }
                                                    }
                                                    var8_8 = new y((byte[])var0 /* !! */ );
                                                    var0 /* !! */  = var8_8;
                                                    break block58;
                                                }
                                                var0 /* !! */  = var11_14.m() == 304 ? v.a : new x(var11_14.m());
                                            }
                                            kotlin.io.c.a((Closeable)var11_14, null);
                                            break block54;
                                            {
                                                catch (Throwable var0_4) {
                                                    break block55;
                                                }
                                            }
                                        }
                                        try {
                                            throw var0 /* !! */ ;
                                        }
                                        catch (Throwable var8_9) {
                                            kotlin.io.c.a((Closeable)var11_14, (Throwable)var0 /* !! */ );
                                            throw var8_9;
                                        }
                                        catch (Throwable var0_5) {
                                            // empty catch block
                                        }
                                    }
                                    var8_8 = new StringBuilder("request for ");
                                    var8_8.append((String)var9_11);
                                    var8_8.append(" failed : ");
                                    var8_8 = var8_8.toString();
                                    if (C.a) {
                                        Log.e((String)"Varioqub/NetworkClient", (String)var8_8, (Throwable)var0 /* !! */ );
                                    }
                                    var0 /* !! */  = new w((Throwable)var0 /* !! */ );
                                }
                                if (!(var0 /* !! */  instanceof v)) break block59;
                                if (C.a) {
                                    Log.d((String)"Varioqub/ConfigFetcher", (String)"fetch response from cache");
                                }
                                if (var1_7 != null) {
                                    var1_7.onSuccess();
                                }
                                break block60;
                            }
                            if (!(var0 /* !! */  instanceof w)) break block61;
                            var8_8 = new StringBuilder("fetch failed with exception ");
                            var8_8.append(((w)var0 /* !! */ ).a);
                            var0 /* !! */  = var8_8.toString();
                            if (C.a) {
                                Log.d((String)"Varioqub/ConfigFetcher", (String)var0 /* !! */ );
                            }
                            if (var1_7 != null) {
                                var1_7.onError((String)var0 /* !! */ , FetchError.INTERNAL_ERROR);
                            }
                            break block60;
                        }
                        if (!(var0 /* !! */  instanceof x)) break block62;
                        var8_8 = new StringBuilder("failed with network code ");
                        var8_8.append(((x)var0 /* !! */ ).a);
                        var0 /* !! */  = var8_8.toString();
                        if (C.a) {
                            Log.d((String)"Varioqub/ConfigFetcher", (String)var0 /* !! */ );
                        }
                        if (var1_7 != null) {
                            var1_7.onError((String)var0 /* !! */ , FetchError.NETWORK_ERROR);
                        }
                        break block60;
                    }
                    if (!(var0 /* !! */  instanceof y)) break block60;
                    var0 /* !! */  = (y)var0 /* !! */ ;
                    var7_10.h.clear();
                    if (var0 /* !! */ .a.length == 0) {
                        var6_19 = C.a;
                        if (var6_19 && var6_19) {
                            Log.e((String)"Varioqub/Varioqub/ConfigFetcher", (String)"fetch failed with empty body", null);
                        }
                        if (var1_7 != null) {
                            var1_7.onError("fetch failed with empty body", FetchError.EMPTY_RESULT);
                        }
                    }
                    try {
                        var8_8 = var0 /* !! */ .a;
                        var0 /* !! */  = new r();
                        var0 /* !! */  = (r)MessageNano.mergeFrom((MessageNano)var0 /* !! */ , (byte[])var8_8);
                        var8_8 = new StringBuilder("fetched config - ");
                        var8_8.append(var0 /* !! */ );
                        var8_8 = var8_8.toString();
                        if (C.a) {
                            var9_11 = new StringBuilder("Varioqub/");
                            var9_11.append("ConfigFetcher");
                            Log.d((String)var9_11.toString(), (String)var8_8);
                        }
                        var7_10.m = kotlin.jvm.internal.y.e(var7_10.j, var0 /* !! */ .b) ^ true;
                        var7_10.j = var0 /* !! */ .b;
                        var7_10.i = var0 /* !! */ .a;
                        var7_10.k = var0 /* !! */ .d;
                        var9_11 = var0 /* !! */ .c;
                        var3_17 = ((Object)var9_11).length;
                        break block56;
                    }
                    catch (Throwable var0_6) {}
                }
                if (C.a) {
                    Log.d((String)"Varioqub/ConfigFetcher", (String)"fetch request was throttled");
                }
                if (var1_7 == null) return;
                var1_7.onError("fetch request was throttled", FetchError.REQUEST_THROTTLED);
                return;
                if (C.a) {
                    Log.e((String)"Varioqub/ConfigFetcher", (String)"exception while fetch ", (Throwable)var0_6);
                }
                if (var1_7 != null) {
                    var1_7.onError("exception while fetch ", FetchError.RESPONSE_PARSE_ERROR);
                }
                break block60;
            }
            for (var2_18 = 0; var2_18 < var3_17; ++var2_18) {
                var0 /* !! */  = var9_11[var2_18];
                {
                    var8_8 = var0 /* !! */ .a;
                    var4_20 = ((s)kotlin.collections.l.I0((Object[])var0 /* !! */ .b)).b;
                    var0 /* !! */  = (s)kotlin.collections.l.I0((Object[])var0 /* !! */ .b);
                    var10_12 = var7_10.h;
                    var0 /* !! */  = var0 /* !! */ .c != false ? null : var0 /* !! */ .a;
                    var11_14 = new ConfigValue((String)var0 /* !! */ , 2, var4_20);
                    var10_12.put(var8_8, var11_14);
                    continue;
                }
            }
            if (var1_7 == null) ** GOTO lbl267
            {
                var1_7.onSuccess();
lbl267:
                // 2 sources

                var7_10.e.getClass();
                var7_10.g = System.currentTimeMillis();
            }
        }
        var7_10.e.getClass();
        var7_10.f = var4_20 = System.currentTimeMillis();
        m.a((long)var4_20);
        m.b((long)var7_10.g);
        var0 /* !! */  = var7_10.j;
        if (!m.a().edit().putString("experiments", (String)var0 /* !! */ ).commit() && (var6_19 = C.a) && var6_19) {
            Log.e((String)"Varioqub/Varioqub/PreferenceManager", (String)"save experiments failed", null);
        }
        m.c((String)var7_10.i);
        m.b((HashMap)var7_10.h);
        m.a((boolean)var7_10.m);
        l.a((int)1);
    }

    public static final void a(B b11, String string2, String string3) {
        VarioqubSettings varioqubSettings = b11.f;
        b11 = varioqubSettings;
        if (varioqubSettings == null) {
            kotlin.jvm.internal.y.B("settings");
            b11 = null;
        }
        b11.putClientFeature$config_release(string2, string3);
    }

    public static final void a(g object) {
        object.getClass();
        l.b((int)3);
        a a14 = object.a;
        e e11 = new e((g)object);
        a14.a.requestDeviceId(e11);
        a14 = object.a;
        object = new f((g)object);
        a14.a.requestUserId((AdapterIdentifiersCallback)object);
    }

    public final void a() {
        if (this.g.get()) {
            return;
        }
        throw new IllegalStateException("VarioqubConfig is not inited. Please call init() method first");
    }

    public final void a(VarioqubSettings object, a a14, ExecutorService executorService, Context object2, t object3, c c11, g g11) {
        this.f = object;
        this.a = a14;
        this.c = object3;
        this.b = c11;
        this.d = executorService;
        this.e = g11;
        com.yandex.varioqub.config.impl.d.a = object2.getApplicationContext();
        D.a = object.getUrl$config_release();
        C.a = object.getLogs$config_release();
        object = m.a();
        object2 = "";
        object3 = object.getString("experiments", "");
        object = object3;
        if (object3 == null) {
            object = "";
        }
        a14.d = object;
        a14.c = m.b();
        object = m.a().getString("config_version", "");
        if (object == null) {
            object = object2;
        }
        a14.e = object;
        a14.a.setExperiments(a14.d);
        a14.a.setTriggeredTestIds(a14.c);
        this.g.set(true);
        executorService.execute((Runnable)new a0(g11));
    }

    public final void activateConfig(kotlin.jvm.functions.a a14) {
        Iterator iterator;
        c c11;
        this.a();
        Object object = c11 = this.b;
        if (c11 == null) {
            kotlin.jvm.internal.y.B("configFetcher");
            object = null;
        }
        object.a();
        c11 = object.d;
        Object object2 = object.k;
        long l10 = object.g;
        if (!kotlin.jvm.internal.y.e(c11.e, object2) && c11.b.getActivateEvent$config_release()) {
            iterator = c11.e;
            c11.a.reportConfigChanged(new ConfigData((String)((Object)iterator), (String)object2, l10));
            m.a((String)object2);
        }
        c11.e = object2;
        if (object.m) {
            c11 = object.d;
            iterator = object.h.values();
            c11.getClass();
            object2 = new ArrayList(kotlin.collections.t.x((Iterable)((Object)iterator), (int)10));
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                ((ArrayList)object2).add(((ConfigValue)iterator.next()).getTestId());
            }
            c11.c = object2 = kotlin.collections.t.i1((Iterable)kotlin.collections.t.x0((Iterable)kotlin.collections.t.j1((Iterable)object2), (Iterable)c11.c));
            c11.a.setTriggeredTestIds((Set)object2);
            m.a((Set)c11.c);
            c11 = object.d;
            c11.d = object2 = object.j;
            c11.a.setExperiments((String)object2);
            object.m = false;
        }
        c11 = object.c;
        object = new HashMap(object.h);
        c11.a();
        c11.b = object;
        m.a((HashMap)object);
        if (a14 != null) {
            a14.invoke();
        }
    }

    public final void clearClientFeatures() {
        Executor executor;
        Executor executor2 = executor = this.d;
        if (executor == null) {
            kotlin.jvm.internal.y.B("executor");
            executor2 = null;
        }
        executor2.execute((Runnable)new b0(this));
    }

    public final void fetchConfig(OnFetchCompleteListener onFetchCompleteListener) {
        Executor executor;
        this.a();
        Executor executor2 = executor = this.d;
        if (executor == null) {
            kotlin.jvm.internal.y.B("executor");
            executor2 = null;
        }
        executor2.execute((Runnable)new d0(this, onFetchCompleteListener));
    }

    public final Set getAllKeys() {
        t t13;
        this.a();
        t t14 = t13 = this.c;
        if (t13 == null) {
            kotlin.jvm.internal.y.B("storage");
            t14 = null;
        }
        t14.a();
        return kotlin.collections.t.j1((Iterable)kotlin.collections.t.k1(t14.b.keySet(), t14.a.keySet()));
    }

    public final boolean getBoolean(String string2, boolean bl2) {
        if ((string2 = this.getValue(string2)) != null) {
            bl2 = string2.asBoolean();
        }
        return bl2;
    }

    public final double getDouble(String string2, double d14) {
        if ((string2 = this.getValue(string2)) != null) {
            d14 = string2.asDouble();
        }
        return d14;
    }

    public final String getId() {
        c c11;
        this.a();
        c c13 = c11 = this.b;
        if (c11 == null) {
            kotlin.jvm.internal.y.B("configFetcher");
            c13 = null;
        }
        c13.a();
        return c13.i;
    }

    public final long getLong(String string2, long l10) {
        if ((string2 = this.getValue(string2)) != null) {
            l10 = string2.asLong();
        }
        return l10;
    }

    public final String getString(String string2, String string3) {
        block0: {
            ConfigValue configValue = this.getValue(string2);
            string2 = string3;
            if (configValue == null || (string2 = configValue.asString()) != null) break block0;
            string2 = string3;
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ConfigValue getValue(String string2) {
        this.a();
        t t13 = this.c;
        Object var6_3 = null;
        t t14 = t13;
        if (t13 == null) {
            kotlin.jvm.internal.y.B("storage");
            t14 = null;
        }
        t14.a();
        Object object = (ConfigValue)t14.b.get(string2);
        t13 = object;
        if (object == null) {
            t14.a();
            t13 = (ConfigValue)t14.a.get(string2);
        }
        t14 = t13;
        if (t13 == null) return t14;
        t14 = t13;
        if (t13.getTestId() <= 0L) return t14;
        object = this.a;
        t14 = object;
        if (object == null) {
            kotlin.jvm.internal.y.B("analyticAdapter");
            t14 = null;
        }
        long l10 = t13.getTestId();
        object = t14.f;
        synchronized (object) {
            t14.c.add(l10);
        }
        t14.a.setTriggeredTestIds(t14.c);
        m.a((Set)t14.c);
        t14 = t13;
        if (t13.getValue() != null) return t14;
        t13 = this.c;
        if (t13 == null) {
            kotlin.jvm.internal.y.B("storage");
            t13 = var6_3;
        }
        t13.a();
        return (ConfigValue)t13.a.get(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void init(VarioqubSettings object, VarioqubConfigAdapter varioqubConfigAdapter, Context context) {
        if (this.g.get()) return;
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.g.get()) break block3;
                        l.b((int)2);
                        a a14 = new a(varioqubConfigAdapter, object);
                        ExecutorService executorService = Executors.newSingleThreadExecutor();
                        varioqubConfigAdapter = new t();
                        long l10 = TimeUnit.SECONDS.toMillis(object.getFetchThrottleIntervalSec$config_release());
                        u u11 = new u();
                        i i14 = new i();
                        c c11 = new c(i14, l10, (t)varioqubConfigAdapter, a14, u11);
                        u11 = new g(a14);
                        this.a((VarioqubSettings)object, a14, executorService, context, (t)varioqubConfigAdapter, c11, (g)u11);
                        l.a((int)2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = k0.a;
                return;
            }
            throw throwable2;
        }
    }

    public final void putClientFeature(String string2, String string3) {
        Executor executor;
        Executor executor2 = executor = this.d;
        if (executor == null) {
            kotlin.jvm.internal.y.B("executor");
            executor2 = null;
        }
        executor2.execute((Runnable)new c0(this, string2, string3));
    }

    public final void setDefaults(int n10, kotlin.jvm.functions.a a14) {
        Executor executor;
        this.a();
        Executor executor2 = executor = this.d;
        if (executor == null) {
            kotlin.jvm.internal.y.B("executor");
            executor2 = null;
        }
        executor2.execute((Runnable)new e0(this, n10, a14));
    }

    public final void setDefaults(Map object2) {
        this.a();
        HashMap hashMap = new HashMap();
        t t13 = object2.entrySet().iterator();
        while (t13.hasNext()) {
            Map.Entry entry = t13.next();
            hashMap.put(entry.getKey(), ConfigValue.Companion.createInappDefault$config_release(entry.getValue().toString()));
        }
        t t14 = t13 = this.c;
        if (t13 == null) {
            kotlin.jvm.internal.y.B("storage");
            Object var1_5 = null;
        }
        var1_6.a = hashMap;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.client.engine.android.c
 *  io.ktor.client.engine.android.d
 *  io.ktor.client.engine.android.e
 *  io.ktor.client.engine.e
 *  io.ktor.client.engine.m
 *  io.ktor.client.plugins.y
 *  io.ktor.client.request.d
 *  io.ktor.client.request.g
 *  io.ktor.http.content.b
 *  io.ktor.http.o
 *  io.ktor.http.u
 *  io.ktor.http.v
 *  io.ktor.util.date.a
 *  io.ktor.util.date.b
 *  io.ktor.utils.io.g
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.jvm.internal.b
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.v
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.client.engine.android;

import io.ktor.client.engine.android.c;
import io.ktor.client.engine.android.d;
import io.ktor.client.engine.android.e;
import io.ktor.client.engine.m;
import io.ktor.client.request.g;
import io.ktor.http.content.b;
import io.ktor.http.k;
import io.ktor.http.o;
import io.ktor.http.u;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.collections.s0;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.text.p;
import kotlin.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\f\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00128\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2={"Lio/ktor/client/engine/android/b;", "Lio/ktor/client/engine/c;", "", "urlString", "Ljava/net/HttpURLConnection;", "i", "(Ljava/lang/String;)Ljava/net/HttpURLConnection;", "Lio/ktor/client/request/d;", "data", "Lio/ktor/client/request/g;", "Q", "(Lio/ktor/client/request/d;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lio/ktor/client/engine/android/d;", "g", "Lio/ktor/client/engine/android/d;", "h", "()Lio/ktor/client/engine/android/d;", "config", "", "Lio/ktor/client/engine/e;", "Ljava/util/Set;", "v", "()Ljava/util/Set;", "supportedCapabilities", "<init>", "(Lio/ktor/client/engine/android/d;)V", "ktor-client-android"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nAndroidClientEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClientEngine.kt\nio/ktor/client/engine/android/AndroidClientEngine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class b
extends io.ktor.client.engine.c {
    @NotNull
    private final d g;
    @NotNull
    private final Set<io.ktor.client.engine.e<?>> h;

    public b(@NotNull d d4) {
        y.j((Object)d4, (String)"config");
        super("ktor-android");
        this.g = d4;
        this.h = b1.d(io.ktor.client.plugins.y.d);
    }

    private final HttpURLConnection i(String object) {
        URL uRL = new URL((String)object);
        object = this.h().a();
        object = object != null ? uRL.openConnection((Proxy)object) : null;
        Object object2 = object;
        if (object == null) {
            object2 = uRL.openConnection();
            y.i((Object)object2, (String)"url.openConnection()");
        }
        return (HttpURLConnection)object2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Nullable
    public Object Q(@NotNull io.ktor.client.request.d var1_1, @NotNull kotlin.coroutines.d<? super g> var2_2) {
        block17: {
            block18: {
                block13: {
                    block14: {
                        block15: {
                            block16: {
                                if (!(var2_2 instanceof a)) ** GOTO lbl-1000
                                var6_3 = var2_2;
                                var3_4 = var6_3.r;
                                if ((var3_4 & -2147483648) != 0) {
                                    var6_3.r = var3_4 + -2147483648;
                                } else // 2 sources

                                {
                                    var6_3 = new kotlin.coroutines.jvm.internal.d(this, (kotlin.coroutines.d<? super a>)var2_2){
                                        Object l;
                                        Object m;
                                        Object n;
                                        Object o;
                                        Object p;
                                        final b q;
                                        int r;
                                        {
                                            this.q = b4;
                                            super(d4);
                                        }

                                        @Override
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object object) {
                                            this.p = object;
                                            this.r |= Integer.MIN_VALUE;
                                            return this.q.Q(null, this);
                                        }
                                    };
                                }
                                var2_2 = var6_3.p;
                                var9_5 = kotlin.coroutines.intrinsics.b.f();
                                var3_4 = var6_3.r;
                                if (var3_4 == 0) break block13;
                                if (var3_4 == 1) break block14;
                                if (var3_4 == 2) break block15;
                                if (var3_4 != 3) break block16;
                                v.b(var2_2);
                                break block17;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        var5_6 = (HttpURLConnection)var6_3.o;
                        var4_7 /* !! */  = (io.ktor.util.date.b)var6_3.n;
                        var7_8 = (kotlin.coroutines.g)var6_3.m;
                        var1_1 /* !! */  = (io.ktor.client.request.d)var6_3.l;
                        v.b((Object)var2_2);
                        var2_2 = var7_8;

                    }
                    var1_1 /* !! */  = (io.ktor.client.request.d)var6_3.m;
                    var7_8 = (b)var6_3.l;
                    v.b(var2_2);
                    break block18;
                }
                v.b(var2_2);
                var6_3.l = this;
                var6_3.m = var1_1 /* !! */ ;
                var6_3.r = 1;
                var2_2 = m.b((kotlin.coroutines.d)var6_3);
                if (var2_2 == var9_5) {
                    return var9_5;
                }
                var7_8 = this;
            }
            var4_7 /* !! */  = (kotlin.coroutines.g)var2_2;
            var2_2 = io.ktor.util.date.a.b(null, (int)1, null);
            var5_6 = var1_1 /* !! */ .h().toString();
            var10_9 = var1_1 /* !! */ .b();
            var8_10 = var1_1 /* !! */ .e();
            var11_11 = o.a;
            var8_10 = var8_10.get(var11_11.g());
            var8_10 = var8_10 != null ? kotlin.coroutines.jvm.internal.b.e((long)Long.parseLong((String)var8_10)) : var10_9.a();
            var5_6 = var7_8.i((String)var5_6);
            var5_6.setConnectTimeout(var7_8.h().b());
            var5_6.setReadTimeout(var7_8.h().d());
            e.d((HttpURLConnection)var5_6, (io.ktor.client.request.d)var1_1 /* !! */ );
            if (var5_6 instanceof HttpsURLConnection) {
                var7_8.h().e().invoke(var5_6);
            }
            var5_6.setRequestMethod(var1_1 /* !! */ .f().d());
            var5_6.setUseCaches(false);
            var5_6.setInstanceFollowRedirects(false);
            m.c((k)var1_1 /* !! */ .e(), (io.ktor.http.content.b)var10_9, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<String, String, k0>((HttpURLConnection)var5_6){
                final HttpURLConnection g;
                {
                    this.g = httpURLConnection;
                    super(2);
                }

                public final void a(@NotNull String string, @NotNull String string2) {
                    y.j((Object)string, (String)"key");
                    y.j((Object)string2, (String)"value");
                    this.g.addRequestProperty(string, string2);
                }
            });
            var7_8.h().c().invoke(var5_6);
            if (c.a().contains(var1_1 /* !! */ .f())) {
                if (!(var10_9 instanceof b.b)) {
                    var2_2 = new StringBuilder();
                    var2_2.append("Request of type ");
                    var2_2.append(var1_1 /* !! */ .f());
                    var2_2.append(" couldn't send a body with the [Android] engine.");
                    throw new IllegalStateException(var2_2.toString().toString());
                }
            } else {
                if (var8_10 == null && var5_6.getRequestProperty(var11_11.u()) == null) {
                    var5_6.addRequestProperty(var11_11.u(), "chunked");
                }
                if (var8_10 != null) {
                    var5_6.setFixedLengthStreamingMode(var8_10.longValue());
                    var7_8 = k0.a;
                } else {
                    var7_8 = null;
                }
                if (var7_8 == null) {
                    var5_6.setChunkedStreamingMode(0);
                }
                var5_6.setDoOutput(true);
                var7_8 = var5_6.getOutputStream();
                y.i((Object)var7_8, (String)"outputStream");
                var6_3.l = var1_1 /* !! */ ;
                var6_3.m = var4_7 /* !! */ ;
                var6_3.n = var2_2;
                var6_3.o = var5_6;
                var6_3.r = 2;
                if (c.b((io.ktor.http.content.b)var10_9, (OutputStream)var7_8, (kotlin.coroutines.g)var4_7 /* !! */ , (kotlin.coroutines.d)var6_3) == var9_5) {
                    return var9_5;
                }
                var7_8 = var2_2;
                var2_2 = var4_7 /* !! */ ;
                var4_7 /* !! */  = var7_8;
lbl96:

                var7_8 = var2_2;
                var2_2 = var4_7 /* !! */ ;
                var4_7 /* !! */  = var7_8;
            }
            var2_2 = new l<HttpURLConnection, g>((kotlin.coroutines.g)var4_7 /* !! */ , var1_1 /* !! */ , (io.ktor.util.date.b)var2_2){
                final kotlin.coroutines.g g;
                final io.ktor.client.request.d h;
                final io.ktor.util.date.b i;
                {
                    this.g = g4;
                    this.h = d4;
                    this.i = b4;
                    super(1);
                }

                @NotNull
                public final g a(@NotNull HttpURLConnection object) {
                    Object object2;
                    y.j((Object)object, (String)"current");
                    int n4 = ((HttpURLConnection)object).getResponseCode();
                    String string = ((HttpURLConnection)object).getResponseMessage();
                    string = string != null ? new io.ktor.http.v(n4, string) : io.ktor.http.v.e.a(n4);
                    io.ktor.utils.io.g g4 = e.a((HttpURLConnection)object, (kotlin.coroutines.g)this.g, (io.ktor.client.request.d)this.h);
                    object = ((URLConnection)object).getHeaderFields();
                    y.i((Object)object, (String)"current.headerFields");
                    Map.Entry entry3 = new LinkedHashMap(s0.f(object.size()));
                    for (Map.Entry entry2 : (Iterable)object.entrySet()) {
                        block6: {
                            block5: {
                                object = (String)entry2.getKey();
                                if (object == null) break block5;
                                y.i((Object)object, (String)"key");
                                object2 = Locale.getDefault();
                                y.i((Object)object2, (String)"getDefault()");
                                object2 = ((String)object).toLowerCase((Locale)object2);
                                y.i((Object)object2, (String)"this as java.lang.String).toLowerCase(locale)");
                                object = object2;
                                if (object2 != null) break block6;
                            }
                            object = "";
                        }
                        entry3.put(object, entry2.getValue());
                    }
                    object = new LinkedHashMap();
                    for (Map.Entry entry3 : entry3.entrySet()) {
                        if (!(p.h0((CharSequence)entry3.getKey()) ^ true)) continue;
                        object.put(entry3.getKey(), entry3.getValue());
                    }
                    object2 = u.d.a();
                    object = new io.ktor.http.m((Map<String, ? extends List<String>>)object);
                    return new g((io.ktor.http.v)string, this.i, (k)object, object2, (Object)g4, this.g);
                }
            };
            var6_3.l = null;
            var6_3.m = null;
            var6_3.n = null;
            var6_3.o = null;
            var6_3.r = 3;
            var1_1 /* !! */  = e.e((HttpURLConnection)var5_6, (io.ktor.client.request.d)var1_1 /* !! */ , (l)var2_2, (kotlin.coroutines.d)var6_3);
            var2_2 = var1_1 /* !! */ ;
            if (var1_1 /* !! */  == var9_5) {
                return var9_5;
            }
        }
        return var2_2;
    }

    @NotNull
    public d h() {
        return this.g;
    }

    @Override
    @NotNull
    public Set<io.ktor.client.engine.e<?>> v() {
        return this.h;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  okhttp3.d0
 *  okhttp3.internal.d
 *  okhttp3.internal.http.f
 *  okhttp3.internal.http2.a
 *  okhttp3.w
 *  okhttp3.w$a
 *  okio.j0
 *  okio.x
 *  org.jetbrains.annotations.NotNull
 */
package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import okhttp3.d0;
import okhttp3.internal.d;
import okhttp3.internal.http.f;
import okhttp3.internal.http.g;
import okhttp3.internal.http2.a;
import okhttp3.w;
import okio.j0;
import okio.x;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\f\u00a8\u0006\u0010"}, d2={"Lokhttp3/internal/http/b;", "Lokhttp3/w;", "", "code", "", "a", "(I)Z", "Lokhttp3/w$a;", "chain", "Lokhttp3/d0;", "intercept", "(Lokhttp3/w$a;)Lokhttp3/d0;", "Z", "forWebSocket", "<init>", "(Z)V", "okhttp"}, k=1, mv={1, 8, 0})
public final class b
implements w {
    private final boolean a;

    public b(boolean bl) {
        this.a = bl;
    }

    private final boolean a(int n4) {
        boolean bl = true;
        if (n4 != 100 && (102 > n4 || n4 >= 200)) {
            bl = false;
        }
        return bl;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NotNull
    public d0 intercept(@NotNull w.a var1_1) throws IOException {
        block34: {
            block30: {
                block29: {
                    y.j((Object)var1_1, (String)"chain");
                    var1_1 = (g)var1_1;
                    var10_6 = var1_1.e();
                    y.g((Object)var10_6);
                    var11_7 = var1_1.g();
                    var12_8 = var11_7.a();
                    var5_9 = System.currentTimeMillis();
                    var9_10 = null;
                    var10_6.w(var11_7);
                    if (!f.b((String)var11_7.h()) || var12_8 == null) ** GOTO lbl-1000
                    if (!p.z("100-continue", var11_7.d("Expect"), true)) break block29;
                    var10_6.f();
                    var7_11 /* !! */  = var10_6.r(true);
                    try {
                        var10_6.t();
                        var3_12 = 0;
                        break block30;
                    }
                    catch (IOException var1_2) {
                        var2_13 = 1;
                    }
lbl21:
                    // 3 sources

                    while (true) {
                        if (var1_1 instanceof a) {
                            throw var1_1;
                        }
                        if (!var10_6.k()) {
                            throw var1_1;
                        }
                        var8_14 = var1_1;
lbl27:
                        // 2 sources

                        while (true) {
                            block32: {
                                block31: {
                                    var1_1 = var7_11 /* !! */ ;
                                    var3_12 = var2_13;
                                    if (var7_11 /* !! */  == null) {
                                        try {
                                            var7_11 /* !! */  = var10_6.r(false);
                                            y.g((Object)var7_11 /* !! */ );
                                            var1_1 = var7_11 /* !! */ ;
                                            var3_12 = var2_13;
                                            if (var2_13 == 0) break block31;
                                            var10_6.t();
                                            var3_12 = 0;
                                            var1_1 = var7_11 /* !! */ ;
                                        }
                                        catch (IOException var1_5) {
                                            break block32;
                                        }
                                    }
                                }
                                var1_1 = var1_1.r(var11_7).i(var10_6.h().r()).s(var5_9).q(System.currentTimeMillis()).c();
                                var2_13 = var4_15 = var1_1.m();
                                if (this.a(var4_15)) {
                                    var1_1 = var10_6.r(false);
                                    y.g((Object)var1_1);
                                    if (var3_12 != 0) {
                                        var10_6.t();
                                    }
                                    var1_1 = var1_1.r(var11_7).i(var10_6.h().r()).s(var5_9).q(System.currentTimeMillis()).c();
                                    var2_13 = var1_1.m();
                                }
                                var10_6.s((d0)var1_1);
                                var1_1 = this.a != false && var2_13 == 101 ? var1_1.L().b(d.c).c() : var1_1.L().b(var10_6.q((d0)var1_1)).c();
                                if (p.z("close", var1_1.V().d("Connection"), true) || p.z("close", d0.w((d0)var1_1, (String)"Connection", null, (int)2, null), true)) {
                                    var10_6.o();
                                }
                                if ((var2_13 == 204 || var2_13 == 205) && (var5_9 = (var7_11 /* !! */  = var1_1.d()) != null ? var7_11 /* !! */ .contentLength() : -1L) > 0L) {
                                    var10_6 = new StringBuilder();
                                    var10_6.append("HTTP ");
                                    var10_6.append(var2_13);
                                    var10_6.append(" had non-zero Content-Length: ");
                                    var11_7 = var1_1.d();
                                    var1_1 = var9_10;
                                    if (var11_7 != null) {
                                        var1_1 = Long.valueOf(var11_7.contentLength());
                                    }
                                    var10_6.append(var1_1);
                                    var7_11 /* !! */  = new ProtocolException(var10_6.toString());
                                    throw var7_11 /* !! */ ;
                                }
                                return var1_1;
                            }
                            if (var8_14 != null) {
                                kotlin.f.a((Throwable)var8_14, var1_5);
                                throw var8_14;
                            }
                            throw var1_5;
                        }
                        break;
                    }
                    catch (IOException var1_3) {
                        var2_13 = 1;
                        var7_11 /* !! */  = null;
                        ** GOTO lbl21
                    }
                }
                var3_12 = 1;
                var7_11 /* !! */  = null;
            }
            if (var7_11 /* !! */  == null) {
                block33: {
                    var8_14 = var7_11 /* !! */ ;
                    var4_15 = var3_12;
                    try {
                        if (!var12_8.isDuplex()) break block33;
                        var8_14 = var7_11 /* !! */ ;
                        var4_15 = var3_12;
                        var10_6.f();
                        var8_14 = var7_11 /* !! */ ;
                        var4_15 = var3_12;
                        var12_8.writeTo(x.c((j0)var10_6.c(var11_7, true)));
                        var1_1 = var7_11 /* !! */ ;
                        var2_13 = var3_12;
                        break block34;
                    }
                    catch (IOException var1_4) {
                        var7_11 /* !! */  = var8_14;
                        var2_13 = var4_15;
                        ** continue;
                    }
                }
                var8_14 = var7_11 /* !! */ ;
                var4_15 = var3_12;
                var1_1 = x.c((j0)var10_6.c(var11_7, false));
                var8_14 = var7_11 /* !! */ ;
                var4_15 = var3_12;
                var12_8.writeTo((okio.f)var1_1);
                var8_14 = var7_11 /* !! */ ;
                var4_15 = var3_12;
                var1_1.close();
                var1_1 = var7_11 /* !! */ ;
                var2_13 = var3_12;
                break block34;
            } else {
                var8_14 = var7_11 /* !! */ ;
                var4_15 = var3_12;
                var10_6.p();
                var8_14 = var7_11 /* !! */ ;
                var4_15 = var3_12;
                var1_1 = var7_11 /* !! */ ;
                var2_13 = var3_12;
                if (!var10_6.h().v()) {
                    var8_14 = var7_11 /* !! */ ;
                    var4_15 = var3_12;
                    var10_6.o();
                    var1_1 = var7_11 /* !! */ ;
                    var2_13 = var3_12;
                }
            }
            break block34;
lbl-1000:
            // 1 sources

            {
                var10_6.p();
                var2_13 = 1;
                var1_1 = null;
            }
        }
        if (var12_8 == null) ** GOTO lbl140
        var8_14 = var1_1;
        var4_15 = var2_13;
        {
            block35: {
                if (var12_8.isDuplex()) break block35;
lbl140:
                // 2 sources

                var8_14 = var1_1;
                var4_15 = var2_13;
                var10_6.e();
            }
            var8_14 = null;
            var7_11 /* !! */  = var1_1;
            ** continue;
        }
    }
}


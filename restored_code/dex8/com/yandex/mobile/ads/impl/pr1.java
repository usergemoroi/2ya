/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cq1
 *  com.yandex.mobile.ads.impl.ho1
 *  com.yandex.mobile.ads.impl.ip0
 *  com.yandex.mobile.ads.impl.kh0
 *  com.yandex.mobile.ads.impl.rh0
 *  com.yandex.mobile.ads.impl.rh0$a
 *  com.yandex.mobile.ads.impl.v50
 *  com.yandex.mobile.ads.impl.yq1
 *  com.yandex.mobile.ads.impl.zp1
 *  com.yandex.mobile.ads.impl.zp1$a
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ce1;
import com.yandex.mobile.ads.impl.cq1;
import com.yandex.mobile.ads.impl.do1;
import com.yandex.mobile.ads.impl.ho1;
import com.yandex.mobile.ads.impl.ip0;
import com.yandex.mobile.ads.impl.kh0;
import com.yandex.mobile.ads.impl.rh0;
import com.yandex.mobile.ads.impl.v50;
import com.yandex.mobile.ads.impl.yq1;
import com.yandex.mobile.ads.impl.zp1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.y;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

public final class pr1
implements ip0 {
    @NotNull
    private final ce1 a;

    public pr1(@NotNull ce1 ce12) {
        this.a = ce12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final zp1 a(yq1 var1_1, v50 var2_2) throws IOException {
        var7_4 = null;
        var6_5 = null;
        var5_6 /* !! */  = var2_2 /* !! */  != null && (var5_6 /* !! */  = var2_2 /* !! */ .e()) != null ? var5_6 /* !! */ .k() : null;
        var3_7 = var1_1.c();
        var8_8 = var1_1.n().f();
        if (var3_7 != 307 && var3_7 != 308) {
            if (var3_7 != 401) {
                if (var3_7 != 421) {
                    if (var3_7 != 503) {
                        if (var3_7 != 407) {
                            if (var3_7 != 408) {
                                switch (var3_7) {
                                    default: {
                                        return null;
                                    }
                                    case 300: 
                                    case 301: 
                                    case 302: 
                                    case 303: {
                                        ** if (this.a.l()) goto lbl-1000
                                    }
                                }
                            }
                            if (!this.a.v()) {
                                return null;
                            }
                            var1_1.n().getClass();
                            var2_2 /* !! */  = var1_1.k();
                            if (var2_2 /* !! */  != null && var2_2 /* !! */ .c() == 408) {
                                return null;
                            }
                            var2_2 /* !! */  = yq1.a((yq1)var1_1, (String)"Retry-After");
                            if (var2_2 /* !! */  == null || new m("\\d+").c((CharSequence)var2_2 /* !! */ ) && Integer.valueOf((String)var2_2 /* !! */ ) <= 0) {
                                return var1_1.n();
                            }
                            return null;
                        }
                        y.g((Object)var5_6 /* !! */ );
                        if (var5_6 /* !! */ .b().type() == Proxy.Type.HTTP) {
                            this.a.s().getClass();
                            return null;
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    var2_2 /* !! */  = var1_1.k();
                    if (var2_2 /* !! */  != null && var2_2 /* !! */ .c() == 503) {
                        return null;
                    }
                    var2_2 /* !! */  = yq1.a((yq1)var1_1, (String)"Retry-After");
                    if (var2_2 /* !! */  != null && new m("\\d+").c((CharSequence)var2_2 /* !! */ ) && Integer.valueOf((String)var2_2 /* !! */ ) == 0) {
                        return var1_1.n();
                    }
                    return null;
                }
                var1_1.n().getClass();
                if (var2_2 /* !! */  != null && var2_2 /* !! */ .h()) {
                    var2_2 /* !! */ .e().i();
                    return var1_1.n();
                }
                return null;
            }
            this.a.c().getClass();
            return null;
        }
        if (!this.a.l()) lbl-1000:
        // 2 sources

        {
            var1_1 = var7_4;
        } else if ((var9_9 = yq1.a((yq1)var1_1, (String)"Location")) == null) {
            var1_1 = var7_4;
        } else {
            var2_2 /* !! */  = var1_1.n().g();
            var2_2 /* !! */ .getClass();
            try {
                var5_6 /* !! */  = new rh0.a();
                var2_2 /* !! */  = var5_6 /* !! */ .a((rh0)var2_2 /* !! */ , var9_9);
            }
            catch (IllegalArgumentException var2_3) {
                var2_2 /* !! */  = null;
            }
            var2_2 /* !! */  = var2_2 /* !! */  != null ? var2_2 /* !! */ .a() : null;
            if (var2_2 /* !! */  == null) {
                var1_1 = var7_4;
            } else if (!y.e(var2_2 /* !! */ .k(), var1_1.n().g().k()) && !this.a.m()) {
                var1_1 = var7_4;
            } else {
                var5_6 /* !! */  = var1_1.n();
                var5_6 /* !! */ .getClass();
                var7_4 = new zp1.a((zp1)var5_6 /* !! */ );
                if (kh0.a((String)var8_8)) {
                    var4_10 = var1_1.c();
                    var3_7 = !y.e(var8_8, "PROPFIND") && var4_10 != 308 && var4_10 != 307 ? 0 : 1;
                    if (y.e(var8_8, "PROPFIND") ^ true && var4_10 != 308 && var4_10 != 307) {
                        var7_4.a("GET", null);
                    } else {
                        var5_6 /* !! */  = var6_5;
                        if (var3_7 != 0) {
                            var5_6 /* !! */  = var1_1.n().a();
                        }
                        var7_4.a(var8_8, (cq1)var5_6 /* !! */ );
                    }
                    if (var3_7 == 0) {
                        var7_4.a("Transfer-Encoding");
                        var7_4.a("Content-Length");
                        var7_4.a("Content-Type");
                    }
                }
                if (!y.e((var1_1 = var1_1.n().g()).g(), var2_2 /* !! */ .g()) || var1_1.i() != var2_2 /* !! */ .i() || !y.e(var1_1.k(), var2_2 /* !! */ .k())) {
                    var7_4.a("Authorization");
                }
                var1_1 = var7_4.a((rh0)var2_2 /* !! */ ).a();
            }
        }
        return var1_1;
    }

    private final boolean a(IOException iOException, do1 do12, zp1 zp12, boolean bl2) {
        if (!this.a.v()) {
            return false;
        }
        if (bl2) {
            zp12.getClass();
            if (iOException instanceof FileNotFoundException) {
                return false;
            }
        }
        if (iOException instanceof ProtocolException || !(!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : iOException instanceof SocketTimeoutException && !bl2)) {
            return false;
        }
        return do12.m();
    }

    /*
     * Exception decompiling
     */
    @NotNull
    public final yq1 a(@NotNull ho1 var1_1) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [5 : 97->114)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}


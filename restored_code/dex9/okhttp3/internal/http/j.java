/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlin.text.m
 *  okhttp3.b0
 *  okhttp3.b0$a
 *  okhttp3.c0
 *  okhttp3.d0
 *  okhttp3.f0
 *  okhttp3.internal.connection.c
 *  okhttp3.internal.d
 *  okhttp3.internal.http.f
 *  okhttp3.internal.http.j$a
 *  okhttp3.v
 *  okhttp3.w
 *  okhttp3.w$a
 *  org.jetbrains.annotations.NotNull
 */
package okhttp3.internal.http;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlin.text.m;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.internal.connection.c;
import okhttp3.internal.connection.e;
import okhttp3.internal.d;
import okhttp3.internal.http.f;
import okhttp3.internal.http.j;
import okhttp3.v;
import okhttp3.w;
import okhttp3.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010#\u001a\u00020!\u00a2\u0006\u0004\b$\u0010%J/\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0003\u0010\fJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\"\u00a8\u0006&"}, d2={"Lokhttp3/internal/http/j;", "Lokhttp3/w;", "Ljava/io/IOException;", "e", "Lokhttp3/internal/connection/e;", "call", "Lokhttp3/b0;", "userRequest", "", "requestSendStarted", "d", "(Ljava/io/IOException;Lokhttp3/internal/connection/e;Lokhttp3/b0;Z)Z", "(Ljava/io/IOException;Lokhttp3/b0;)Z", "c", "(Ljava/io/IOException;Z)Z", "Lokhttp3/d0;", "userResponse", "Lokhttp3/internal/connection/c;", "exchange", "b", "(Lokhttp3/d0;Lokhttp3/internal/connection/c;)Lokhttp3/b0;", "", "method", "a", "(Lokhttp3/d0;Ljava/lang/String;)Lokhttp3/b0;", "", "defaultDelay", "f", "(Lokhttp3/d0;I)I", "Lokhttp3/w$a;", "chain", "intercept", "(Lokhttp3/w$a;)Lokhttp3/d0;", "Lokhttp3/z;", "Lokhttp3/z;", "client", "<init>", "(Lokhttp3/z;)V", "okhttp"}, k=1, mv={1, 8, 0})
public final class j
implements w {
    @NotNull
    public static final a b = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private final z a;

    public j(@NotNull z z3) {
        y.j((Object)z3, (String)"client");
        this.a = z3;
    }

    private final b0 a(d0 d02, String string) {
        boolean bl = this.a.r();
        c0 c02 = null;
        if (!bl) {
            return null;
        }
        String string2 = d0.w((d0)d02, (String)"Location", null, (int)2, null);
        if (string2 == null) {
            return null;
        }
        string2 = d02.V().k().q(string2);
        if (string2 == null) {
            return null;
        }
        if (!y.e((Object)string2.r(), (Object)d02.V().k().r()) && !this.a.s()) {
            return null;
        }
        b0.a a4 = d02.V().i();
        if (f.b((String)string)) {
            int n4 = d02.m();
            f f4 = f.a;
            boolean bl2 = f4.d(string) || n4 == 308 || n4 == 307;
            if (f4.c(string) && n4 != 308 && n4 != 307) {
                a4.g("GET", null);
            } else {
                if (bl2) {
                    c02 = d02.V().a();
                }
                a4.g(string, c02);
            }
            if (!bl2) {
                a4.i("Transfer-Encoding");
                a4.i("Content-Length");
                a4.i("Content-Type");
            }
        }
        if (!d.j((v)d02.V().k(), (v)string2)) {
            a4.i("Authorization");
        }
        return a4.l((v)string2).b();
    }

    private final b0 b(d0 d02, c c4) throws IOException {
        okhttp3.internal.connection.f f4;
        f4 = c4 != null && (f4 = c4.h()) != null ? f4.A() : null;
        int n4 = d02.m();
        String string = d02.V().h();
        if (n4 != 307 && n4 != 308) {
            if (n4 != 401) {
                if (n4 != 421) {
                    if (n4 != 503) {
                        if (n4 != 407) {
                            if (n4 != 408) {
                                switch (n4) {
                                    default: {
                                        return null;
                                    }
                                    case 300: 
                                    case 301: 
                                    case 302: 
                                    case 303: {
                                        return this.a(d02, string);
                                    }
                                }
                            }
                            if (!this.a.G()) {
                                return null;
                            }
                            c4 = d02.V().a();
                            if (c4 != null && c4.isOneShot()) {
                                return null;
                            }
                            c4 = d02.S();
                            if (c4 != null && c4.m() == 408) {
                                return null;
                            }
                            if (this.f(d02, 0) > 0) {
                                return null;
                            }
                            return d02.V();
                        }
                        y.g((Object)((Object)f4));
                        if (f4.b().type() == Proxy.Type.HTTP) {
                            return this.a.D().a((f0)f4, d02);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    c4 = d02.S();
                    if (c4 != null && c4.m() == 503) {
                        return null;
                    }
                    if (this.f(d02, Integer.MAX_VALUE) == 0) {
                        return d02.V();
                    }
                    return null;
                }
                f4 = d02.V().a();
                if (f4 != null && f4.isOneShot()) {
                    return null;
                }
                if (c4 != null && c4.l()) {
                    c4.h().y();
                    return d02.V();
                }
                return null;
            }
            return this.a.e().a((f0)f4, d02);
        }
        return this.a(d02, string);
    }

    private final boolean c(IOException iOException, boolean bl) {
        boolean bl2 = iOException instanceof ProtocolException;
        boolean bl3 = false;
        if (bl2) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            bl2 = bl3;
            if (iOException instanceof SocketTimeoutException) {
                bl2 = bl3;
                if (!bl) {
                    bl2 = true;
                }
            }
            return bl2;
        }
        if (iOException instanceof SSLHandshakeException && iOException.getCause() instanceof CertificateException) {
            return false;
        }
        return !(iOException instanceof SSLPeerUnverifiedException);
    }

    private final boolean d(IOException iOException, e e4, b0 b02, boolean bl) {
        if (!this.a.G()) {
            return false;
        }
        if (bl && this.e(iOException, b02)) {
            return false;
        }
        if (!this.c(iOException, bl)) {
            return false;
        }
        return e4.v();
    }

    private final boolean e(IOException iOException, b0 b02) {
        boolean bl = (b02 = b02.a()) != null && b02.isOneShot() || iOException instanceof FileNotFoundException;
        return bl;
    }

    private final int f(d0 object, int n4) {
        if ((object = d0.w((d0)object, (String)"Retry-After", null, (int)2, null)) == null) {
            return n4;
        }
        if (new m("\\d+").c((CharSequence)object)) {
            object = Integer.valueOf((String)object);
            y.i((Object)object, (String)"valueOf(header)");
            return ((Number)object).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /*
     * Exception decompiling
     */
    @NotNull
    public d0 intercept(@NotNull w.a var1_1) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [5 : 105->121)] java.lang.Throwable
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


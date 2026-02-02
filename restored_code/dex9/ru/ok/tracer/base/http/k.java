/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.TrafficStats
 *  android.os.Build$VERSION
 *  kotlin.Metadata
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  ru.ok.tracer.base.http.b
 *  ru.ok.tracer.base.http.g
 *  ru.ok.tracer.base.http.i
 *  ru.ok.tracer.base.http.k$a
 */
package ru.ok.tracer.base.http;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Build;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ok.tracer.base.http.b;
import ru.ok.tracer.base.http.g;
import ru.ok.tracer.base.http.i;
import ru.ok.tracer.base.http.k;

@Metadata(d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0011B9\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u0019\u00a8\u0006\u001f"}, d2={"Lru/ok/tracer/base/http/k;", "Lru/ok/tracer/base/http/b;", "Ljava/net/HttpURLConnection;", "connection", "", "c", "(Ljava/net/HttpURLConnection;)I", "conn", "trafficStatsTag", "connectTimeout", "readTimeout", "Lkotlin/k0;", "b", "(Ljava/net/HttpURLConnection;III)V", "Lru/ok/tracer/base/http/g;", "request", "Lru/ok/tracer/base/http/i;", "a", "(Lru/ok/tracer/base/http/g;)Lru/ok/tracer/base/http/i;", "Landroid/content/Context;", "Landroid/content/Context;", "context", "", "Ljava/lang/String;", "userAgent", "I", "d", "e", "<init>", "(Landroid/content/Context;Ljava/lang/String;III)V", "f", "tracer-base_release"}, k=1, mv={1, 7, 1})
public final class k
implements b {
    @NotNull
    public static final a f = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private final Context a;
    @Nullable
    private final String b;
    private final int c;
    private final int d;
    private final int e;

    public k(@NotNull Context context, @Nullable String string, int n4, int n5, int n6) {
        y.j((Object)context, (String)"context");
        this.a = context;
        this.b = string;
        this.c = n4;
        this.d = n5;
        this.e = n6;
    }

    public /* synthetic */ k(Context context, String string, int n4, int n5, int n6, int n7, p p4) {
        if ((n7 & 2) != 0) {
            string = null;
        }
        if ((n7 & 4) != 0) {
            n4 = -1;
        }
        if ((n7 & 8) != 0) {
            n5 = 0;
        }
        if ((n7 & 0x10) != 0) {
            n6 = 0;
        }
        this(context, string, n4, n5, n6);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void b(HttpURLConnection var1_1, int var2_6, int var3_7, int var4_8) throws IOException {
        block15: {
            block16: {
                if (var2_6 != -1) {
                    var5_9 = TrafficStats.getThreadStatsTag();
                    TrafficStats.setThreadStatsTag((int)var2_6);
                    var2_6 = var5_9;
                } else {
                    var2_6 = -1;
                }
                if (var3_7 <= 0) break block16;
                try {
                    var1_1.setConnectTimeout(var3_7);
                }
                catch (Throwable var1_2) {
                    break block15;
                }
                catch (NullPointerException var6_10) {

                }
                catch (IllegalArgumentException var1_3) {

                }
                catch (SecurityException var1_4) {

                }
            }
            if (var4_8 > 0) {
                var1_1.setReadTimeout(var4_8);
            }
            var1_1.connect();
            if (var2_6 != -1) {
                TrafficStats.setThreadStatsTag((int)var2_6);
            }
            return;

            {
                if (Build.VERSION.SDK_INT <= 23 && y.e((Object)"ssl_session == null", (Object)var6_10.getMessage())) {
                    var1_1 = new IOException(var6_10);
                    throw var1_1;
                }
                throw var6_10;
lbl30:

                if (Build.VERSION.SDK_INT <= 23 && y.e((Object)"timeout < 0", (Object)var1_3.getMessage())) {
                    var6_11 = new IOException(var1_3);
                    throw var6_11;
                }
                throw var1_3;
lbl34:

                var6_12 = var1_4.getCause();
                if (var6_12 == null) {
                    throw var1_4;
                }
                if (!y.e((Object)(var6_12 = var6_12.getClass().getName()), (Object)"libcore.io.GaiException") && !y.e((Object)var6_12, (Object)"android.system.GaiException")) {
                    throw var1_4;
                }
                var1_5 = new UnknownHostException();
                throw var1_5;
            }
        }
        if (var2_6 != -1) {
            TrafficStats.setThreadStatsTag((int)var2_6);
        }
        throw var1_2;
    }

    private final int c(HttpURLConnection object) throws IOException {
        try {
            int n4 = ((HttpURLConnection)object).getResponseCode();
            return n4;
        }
        catch (NullPointerException nullPointerException) {
            object = ((Throwable)nullPointerException).getMessage();
            if (object != null && kotlin.text.p.M((String)object, "Attempt to read from field 'int com.android.okhttp.okio.Segment.limit'", false, 2, null)) {
                throw new IOException(nullPointerException);
            }
            throw nullPointerException;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new IOException(arrayIndexOutOfBoundsException);
        }
    }

    /*
     * Exception decompiling
     */
    @NotNull
    public i a(@NotNull g var1_1) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 110->180)] java.io.IOException
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


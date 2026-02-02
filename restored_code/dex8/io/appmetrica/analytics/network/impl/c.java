/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.network.impl;

import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.network.impl.d;
import io.appmetrica.analytics.network.internal.Call;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;

public final class c
implements Call {
    public final NetworkClient a;
    public final Request b;
    public final d c;

    public c(@NotNull NetworkClient networkClient, @NotNull Request request) {
        this(networkClient, request, new d());
    }

    @VisibleForTesting
    public c(@NotNull NetworkClient networkClient, @NotNull Request request, @NotNull d d14) {
        this.a = networkClient;
        this.b = request;
        this.c = d14;
    }

    public final void a(HttpsURLConnection httpsURLConnection) {
        Boolean bl2;
        Boolean bl3;
        Integer n10;
        for (Map.Entry object2 : this.b.getHeaders().entrySet()) {
            httpsURLConnection.addRequestProperty((String)object2.getKey(), (String)object2.getValue());
        }
        Integer n13 = this.a.getReadTimeout();
        if (n13 != null) {
            httpsURLConnection.setReadTimeout(n13);
        }
        if ((n10 = this.a.getConnectTimeout()) != null) {
            httpsURLConnection.setConnectTimeout(n10);
        }
        if ((bl3 = this.a.getUseCaches()) != null) {
            httpsURLConnection.setUseCaches(bl3);
        }
        if ((bl2 = this.a.getInstanceFollowRedirects()) != null) {
            httpsURLConnection.setInstanceFollowRedirects(bl2);
        }
        httpsURLConnection.setRequestMethod(this.b.getMethod());
        SSLSocketFactory sSLSocketFactory = this.a.getSslSocketFactory();
        if (sSLSocketFactory != null) {
            httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    @NotNull
    public final Response execute() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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


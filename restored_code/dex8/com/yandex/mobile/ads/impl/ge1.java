/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.fh0
 *  com.yandex.mobile.ads.impl.fm
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.n92
 *  com.yandex.mobile.ads.impl.o60
 *  com.yandex.mobile.ads.impl.pv
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.xj1
 *  com.yandex.mobile.ads.impl.ym$a
 *  com.yandex.mobile.ads.impl.yq1
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ce1;
import com.yandex.mobile.ads.impl.ch0;
import com.yandex.mobile.ads.impl.fh0;
import com.yandex.mobile.ads.impl.fm;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.n92;
import com.yandex.mobile.ads.impl.o60;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.tj;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.xj1;
import com.yandex.mobile.ads.impl.ym;
import com.yandex.mobile.ads.impl.yq1;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ge1
extends tj {
    private final ym.a e;
    private final fh0 f;
    @Nullable
    private final String g;
    @Nullable
    private final fm h;
    @Nullable
    private final fh0 i;
    @Nullable
    private xj1<String> j;
    @Nullable
    private yq1 k;
    @Nullable
    private InputStream l;
    private boolean m;
    private long n;
    private long o;

    static {
        o60.a((String)"goog.exo.okhttp");
    }

    public ge1(ce1 ce12, @Nullable String string2, @Nullable fh0 fh02) {
        super(true);
        this.e = (ym.a)uf.a((Object)ce12);
        this.g = string2;
        this.h = null;
        this.i = fh02;
        this.j = null;
        this.f = new fh0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(long l10) throws ch0 {
        IOException iOException2;
        block8: {
            Object object;
            block7: {
                if (l10 == 0L) {
                    return;
                }
                byte[] byArray = new byte[4096];
                while (true) {
                    int n10;
                    if (l10 <= 0L) {
                        return;
                    }
                    long l11 = 4096;
                    try {
                        n10 = (int)Math.min(l10, l11);
                        object = this.l;
                        int n12 = m92.a;
                        n10 = ((InputStream)object).read(byArray, 0, n10);
                        if (Thread.currentThread().isInterrupted()) break block7;
                        if (n10 == -1) break;
                    }
                    catch (IOException iOException2) {
                        break block8;
                    }
                    l10 -= (long)n10;
                    this.c(n10);
                }
                object = new ch0(2008);
                throw object;
            }
            object = new InterruptedIOException();
            throw object;
        }
        if (iOException2 instanceof ch0) {
            throw (ch0)((Object)iOException2);
        }
        throw new ch0(2000);
    }

    private int c(byte[] byArray, int n10, int n12) throws IOException {
        if (n12 == 0) {
            return 0;
        }
        long l10 = this.n;
        int n13 = n12;
        if (l10 != -1L) {
            if ((l10 -= this.o) == 0L) {
                return -1;
            }
            n13 = (int)Math.min((long)n12, l10);
        }
        InputStream inputStream = this.l;
        n12 = m92.a;
        if ((n10 = inputStream.read(byArray, n10, n13)) == -1) {
            return -1;
        }
        this.o += (long)n10;
        this.c(n10);
        return n10;
    }

    private void f() {
        yq1 yq12 = this.k;
        if (yq12 != null) {
            yq12 = yq12.a();
            yq12.getClass();
            n92.a((Closeable)yq12.c());
            this.k = null;
        }
        this.l = null;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final long a(pv var1_1) throws ch0 {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [11 : 897->909)] java.io.IOException
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

    @Override
    public final void close() {
        if (this.m) {
            this.m = false;
            this.e();
            this.f();
        }
    }

    @Override
    public final Map<String, List<String>> getResponseHeaders() {
        Object object = this.k;
        object = object == null ? Collections.emptyMap() : object.f().c();
        return object;
    }

    @Override
    @Nullable
    public final Uri getUri() {
        Object object = this.k;
        object = object == null ? null : Uri.parse((String)object.n().g().toString());
        return object;
    }

    public final int read(byte[] byArray, int n10, int n12) throws ch0 {
        try {
            n10 = this.c(byArray, n10, n12);
            return n10;
        }
        catch (IOException iOException) {
            n10 = m92.a;
            throw ch0.a(iOException, 2);
        }
    }
}


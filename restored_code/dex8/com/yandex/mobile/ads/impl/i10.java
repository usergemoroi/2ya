/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.mobile.ads.impl.ej2
 *  com.yandex.mobile.ads.impl.em
 *  com.yandex.mobile.ads.impl.em$a
 *  com.yandex.mobile.ads.impl.i10$b
 *  com.yandex.mobile.ads.impl.i10$c
 *  com.yandex.mobile.ads.impl.i10$d
 *  com.yandex.mobile.ads.impl.op0
 */
package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.ej2;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.i10;
import com.yandex.mobile.ads.impl.op0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
public final class i10
implements em {
    private final LinkedHashMap a = new LinkedHashMap(16, 0.75f, true);
    private long b = 0L;
    private final d c;
    private final int d;

    public i10(File file, int n10) {
        this.c = new d(file){
            final File a;
            {
                this.a = file;
            }
        };
        this.d = n10;
    }

    static int a(InputStream inputStream) throws IOException {
        int n10 = inputStream.read();
        if (n10 != -1) {
            int n13 = inputStream.read();
            if (n13 != -1) {
                int n14 = inputStream.read();
                if (n14 != -1) {
                    int n15 = inputStream.read();
                    if (n15 != -1) {
                        return n15 << 24 | (n10 | n13 << 8 | n14 << 16);
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    static void a(BufferedOutputStream bufferedOutputStream, int n10) throws IOException {
        ((OutputStream)bufferedOutputStream).write(n10 & 0xFF);
        ((OutputStream)bufferedOutputStream).write(n10 >> 8 & 0xFF);
        ((OutputStream)bufferedOutputStream).write(n10 >> 16 & 0xFF);
        ((OutputStream)bufferedOutputStream).write(n10 >> 24 & 0xFF);
    }

    static void a(BufferedOutputStream bufferedOutputStream, long l10) throws IOException {
        ((OutputStream)bufferedOutputStream).write((byte)l10);
        ((OutputStream)bufferedOutputStream).write((byte)(l10 >>> 8));
        ((OutputStream)bufferedOutputStream).write((byte)(l10 >>> 16));
        ((OutputStream)bufferedOutputStream).write((byte)(l10 >>> 24));
        ((OutputStream)bufferedOutputStream).write((byte)(l10 >>> 32));
        ((OutputStream)bufferedOutputStream).write((byte)(l10 >>> 40));
        ((OutputStream)bufferedOutputStream).write((byte)(l10 >>> 48));
        ((OutputStream)bufferedOutputStream).write((byte)(l10 >>> 56));
    }

    @VisibleForTesting
    static byte[] a(c object, long l10) throws IOException {
        int n10;
        long l11 = com.yandex.mobile.ads.impl.i10$c.a(object) - com.yandex.mobile.ads.impl.i10$c.c(object);
        if (l10 >= 0L && l10 <= l11 && (long)(n10 = (int)l10) == l10) {
            byte[] byArray = new byte[n10];
            new DataInputStream((InputStream)object).readFully(byArray);
            return byArray;
        }
        object = new StringBuilder("streamToBytes length=");
        ((StringBuilder)object).append(l10);
        ((StringBuilder)object).append(", maxLength=");
        ((StringBuilder)object).append(l11);
        throw new IOException(((StringBuilder)object).toString());
    }

    static long b(InputStream inputStream) throws IOException {
        int n10 = inputStream.read();
        if (n10 != -1) {
            long l10 = n10;
            n10 = inputStream.read();
            if (n10 != -1) {
                long l11 = n10;
                n10 = inputStream.read();
                if (n10 != -1) {
                    long l13 = n10;
                    n10 = inputStream.read();
                    if (n10 != -1) {
                        long l14 = n10;
                        n10 = inputStream.read();
                        if (n10 != -1) {
                            long l15 = n10;
                            n10 = inputStream.read();
                            if (n10 != -1) {
                                long l16 = n10;
                                n10 = inputStream.read();
                                if (n10 != -1) {
                                    long l17 = n10;
                                    n10 = inputStream.read();
                                    if (n10 != -1) {
                                        return ((long)n10 & 0xFFL) << 56 | (l10 & 0xFFL | (l11 & 0xFFL) << 8 | (l13 & 0xFFL) << 16 | (l14 & 0xFFL) << 24 | (l15 & 0xFFL) << 32 | (l16 & 0xFFL) << 40 | (l17 & 0xFFL) << 48);
                                    }
                                    throw new EOFException();
                                }
                                throw new EOFException();
                            }
                            throw new EOFException();
                        }
                        throw new EOFException();
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    private void b() {
        int n10;
        if (this.b < (long)this.d) {
            return;
        }
        if (ej2.a) {
            n10 = op0.b;
        }
        SystemClock.elapsedRealtime();
        Iterator iterator = this.a.entrySet().iterator();
        while (iterator.hasNext()) {
            b b10 = iterator.next().getValue();
            String string2 = b10.b;
            Object object = (this.c).a;
            int n13 = string2.length() / 2;
            n10 = string2.substring(0, n13).hashCode();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(String.valueOf(n10));
            stringBuilder.append(String.valueOf(string2.substring(n13).hashCode()));
            if (new File((File)object, stringBuilder.toString()).delete()) {
                this.b -= b10.a;
            } else {
                object = b10.b;
                n10 = ((String)object).length() / 2;
                ((String)object).substring(0, n10).hashCode();
                ((String)object).substring(n10).hashCode();
                n10 = op0.b;
            }
            iterator.remove();
            if (!((float)this.b < (float)this.d * 0.9f)) continue;
        }
        if (ej2.a) {
            SystemClock.elapsedRealtime();
            n10 = op0.b;
        }
    }

    /*
     * Exception decompiling
     */
    public final void a() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 56->63)] java.lang.Throwable
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

    public final void a(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    em.a a13;
                    try {
                        a13 = this.get(string2);
                        if (a13 == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    a13.f = 0L;
                    a13.e = 0L;
                    this.a(string2, a13);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String object, em.a a13) {
        synchronized (this) {
            Throwable throwable2;
            block13: {
                List list;
                long l10;
                long l11;
                String string2;
                int n10;
                int n13;
                long l13;
                Object object2;
                long l14;
                try {
                    l14 = this.b;
                    object2 = a13.a;
                    l13 = ((byte[])object2).length;
                    n13 = this.d;
                }
                catch (Throwable throwable2) {}
                if (l14 + l13 > (long)n13 && (float)(n10 = ((byte[])object2).length) > (float)n13 * 0.9f) {
                    return;
                }
                object2 = new File;
                Object object3 = (this.c).a;
                n10 = ((String)object).length() / 2;
                n13 = ((String)object).substring(0, n10).hashCode();
                Object object4 = new StringBuilder();
                ((StringBuilder)object4).append(String.valueOf(n13));
                ((StringBuilder)object4).append(String.valueOf(((String)object).substring(n10).hashCode()));
                ((File)object2)((File)object3, ((StringBuilder)object4).toString());
                try {
                    object4 = new FileOutputStream((File)object2);
                    object3 = new BufferedOutputStream((OutputStream)object4);
                    string2 = a13.b;
                    l11 = a13.c;
                    l10 = a13.d;
                    l14 = a13.e;
                    l13 = a13.f;
                    list = com.yandex.mobile.ads.impl.i10$b.b((em.a)a13);
                }
                catch (IOException iOException) {}
                try {
                    object4 = new /* Unavailable Anonymous Inner Class!! */;
                    if (!object4.a((BufferedOutputStream)object3)) {
                        ((OutputStream)object3).close();
                        ((File)object2).getAbsolutePath();
                        boolean bl2 = ej2.a;
                        n13 = op0.b;
                        object = new IOException();
                        throw object;
                    }
                    ((OutputStream)object3).write(a13.a);
                    ((OutputStream)object3).close();
                    object4.a = ((File)object2).length();
                    if (!this.a.containsKey(object)) {
                        this.b += object4.a;
                    } else {
                        a13 = this.a.get(object);
                        l14 = this.b;
                        this.b = object4.a - a13.a + l14;
                    }
                    this.a.put(object, object4);
                    this.b();
                    break block13;
                }
        // Removed invalid catch block
            }
            return;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                int n10;
                block4: {
                    try {
                        File file = (this.c).a;
                        n10 = string2.length() / 2;
                        int n13 = string2.substring(0, n10).hashCode();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(String.valueOf(n13));
                        stringBuilder.append(String.valueOf(string2.substring(n10).hashCode()));
                        File file2 = new File(file, stringBuilder.toString());
                        bl2 = file2.delete();
                        file = this.a.remove(string2);
                        if (file == null) break block4;
                        this.b -= file.a;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if (!bl2) {
                    n10 = string2.length() / 2;
                    string2.substring(0, n10).hashCode();
                    string2.substring(n10).hashCode();
                    bl2 = ej2.a;
                    n10 = op0.b;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final em.a get(String var1_1) {
        synchronized (this) {
            block14: {
                block13: {
                    var7_3 = this.a.get(var1_1);
                    if (var7_3 != null) break block13;
                    {
        // Removed invalid catch block
                    return null;
                }
                var8_6 = (this.c).a;
                var2_7 = var1_1.length() / 2;
                var3_8 = var1_1.substring(0, var2_7).hashCode();
                var6_9 = new StringBuilder();
                var6_9.append(String.valueOf(var3_8));
                var6_9.append(String.valueOf(var1_1.substring(var2_7).hashCode()));
                var5_5 = new File((File)var8_6, var6_9.toString());
                ** try [egrp 2[TRYBLOCK] [2 : 107->148)] { 

                {
        // Removed invalid catch block
                        var4_12 = ej2.a;
                        var2_7 = op0.b;
                        this.b(var1_1);
                        return null;
                    }
                }
lbl26:

                {
                    break block14;
lbl28:

                    var9_11 = new FileInputStream(var5_5);
                    var8_6 = new BufferedInputStream(var9_11);
                    var6_9 = new /* Unavailable Anonymous Inner Class!! */;
                    try {
                        if (TextUtils.equals((CharSequence)var1_1, (CharSequence)com.yandex.mobile.ads.impl.i10$b.a(var6_9).b)) ** GOTO lbl-1000
                        var5_5.getAbsolutePath();
                        var4_12 = ej2.a;
                        var2_7 = op0.b;
                        var7_3 = this.a.remove(var1_1);
                        if (var7_3 != null) {
                            this.b -= var7_3.a;
                        }
                    }
                    catch (Throwable var7_4) {

                    }
                    {
                        var6_9.close();
                        return null;
                    }

                    {
                        var7_3 = var7_3.a(i10.a(var6_9, com.yandex.mobile.ads.impl.i10$c.a(var6_9) - com.yandex.mobile.ads.impl.i10$c.c(var6_9)));
                    }
                    {
                        var6_9.close();
                        return var7_3;
lbl49:

                        var6_9.close();
                        throw var7_4;
                    }
                }
            }
            throw var1_2;
        }
    }
}


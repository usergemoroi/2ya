/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okio.c0
 *  okio.c0$a
 *  okio.internal.i
 *  okio.internal.j
 *  okio.j
 *  okio.j0
 *  okio.k
 *  okio.l
 *  okio.l0
 *  okio.o0$a
 *  okio.x
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.f;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okio.c0;
import okio.internal.g;
import okio.internal.i;
import okio.internal.j;
import okio.j0;
import okio.k;
import okio.l;
import okio.l0;
import okio.o0;
import okio.s;
import okio.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 '2\u00020\u0001:\u00018B7\b\u0000\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0001\u0012\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020/0.\u0012\b\u00105\u001a\u0004\u0018\u000102\u00a2\u0006\u0004\b6\u00107J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u001f\u0010\u001eJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b'\u0010\"R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u00100R\u0016\u00105\u001a\u0004\u0018\u0001028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00104\u00a8\u00069"}, d2={"Lokio/o0;", "Lokio/l;", "Lokio/c0;", "path", "t", "(Lokio/c0;)Lokio/c0;", "dir", "", "throwOnFailure", "", "u", "(Lokio/c0;Z)Ljava/util/List;", "Lokio/k;", "m", "(Lokio/c0;)Lokio/k;", "file", "Lokio/j;", "n", "(Lokio/c0;)Lokio/j;", "mustCreate", "mustExist", "p", "(Lokio/c0;ZZ)Lokio/j;", "k", "(Lokio/c0;)Ljava/util/List;", "Lokio/l0;", "s", "(Lokio/c0;)Lokio/l0;", "Lokio/j0;", "r", "(Lokio/c0;Z)Lokio/j0;", "b", "Lkotlin/k0;", "g", "(Lokio/c0;Z)V", "source", "target", "c", "(Lokio/c0;Lokio/c0;)V", "i", "e", "Lokio/c0;", "zipPath", "f", "Lokio/l;", "fileSystem", "", "Lokio/internal/i;", "Ljava/util/Map;", "entries", "", "h", "Ljava/lang/String;", "comment", "<init>", "(Lokio/c0;Lokio/l;Ljava/util/Map;Ljava/lang/String;)V", "a", "okio"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nZipFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,175:1\n52#2,5:176\n52#2,21:181\n60#2,10:202\n57#2,2:212\n71#2,2:214\n52#2,21:216\n*S KotlinDebug\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n*L\n102#1:176,5\n103#1:181,21\n102#1:202,10\n102#1:212,2\n102#1:214,2\n132#1:216,21\n*E\n"})
public final class o0
extends l {
    @NotNull
    private static final a i = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final c0 j = c0.a.e((c0.a)c0.d, (String)"/", (boolean)false, (int)1, null);
    @NotNull
    private final c0 e;
    @NotNull
    private final l f;
    @NotNull
    private final Map<c0, i> g;
    @Nullable
    private final String h;

    public o0(@NotNull c0 c02, @NotNull l l4, @NotNull Map<c0, i> map2, @Nullable String string) {
        y.j((Object)c02, (String)"zipPath");
        y.j((Object)l4, (String)"fileSystem");
        y.j(map2, (String)"entries");
        this.e = c02;
        this.f = l4;
        this.g = map2;
        this.h = string;
    }

    private final c0 t(c0 c02) {
        return j.m(c02, true);
    }

    private final List<c0> u(c0 c02, boolean bl) {
        Object object = this.t(c02);
        if ((object = this.g.get(object)) == null) {
            if (!bl) {
                return null;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("not a directory: ");
            ((StringBuilder)object).append(c02);
            throw new IOException(((StringBuilder)object).toString());
        }
        return t.e1((Iterable)object.b());
    }

    @NotNull
    public j0 b(@NotNull c0 c02, boolean bl) {
        y.j((Object)c02, (String)"file");
        throw new IOException("zip file systems are read-only");
    }

    public void c(@NotNull c0 c02, @NotNull c0 c03) {
        y.j((Object)c02, (String)"source");
        y.j((Object)c03, (String)"target");
        throw new IOException("zip file systems are read-only");
    }

    public void g(@NotNull c0 c02, boolean bl) {
        y.j((Object)c02, (String)"dir");
        throw new IOException("zip file systems are read-only");
    }

    public void i(@NotNull c0 c02, boolean bl) {
        y.j((Object)c02, (String)"path");
        throw new IOException("zip file systems are read-only");
    }

    @NotNull
    public List<c0> k(@NotNull c0 object) {
        y.j((Object)object, (String)"dir");
        object = this.u((c0)object, true);
        y.g((Object)object);
        return object;
    }

    /*
     * Exception decompiling
     */
    @Nullable
    public k m(@NotNull c0 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 211->215)] java.lang.Throwable
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

    @NotNull
    public okio.j n(@NotNull c0 c02) {
        y.j((Object)c02, (String)"file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @NotNull
    public okio.j p(@NotNull c0 c02, boolean bl, boolean bl2) {
        y.j((Object)c02, (String)"file");
        throw new IOException("zip entries are not writable");
    }

    @NotNull
    public j0 r(@NotNull c0 c02, boolean bl) {
        y.j((Object)c02, (String)"file");
        throw new IOException("zip file systems are read-only");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NotNull
    public l0 s(@NotNull c0 object) throws IOException {
        void var1_9;
        void var1_6;
        i i4;
        Object object2;
        block9: {
            okio.g g4;
            y.j((Object)object, (String)"file");
            object2 = this.t((c0)object);
            i4 = this.g.get(object2);
            if (i4 == null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("no such file: ");
                ((StringBuilder)object2).append(object);
                throw new FileNotFoundException(((StringBuilder)object2).toString());
            }
            okio.j j4 = this.f.n(this.e);
            Object var4_14 = null;
            try {
                g4 = x.d((l0)j4.y(i4.f()));
                Object var1_2 = var4_14;
                object2 = g4;
                if (j4 == null) break block9;
            }
            catch (Throwable throwable) {
                if (j4 != null) {
                    try {
                        j4.close();
                    }
                    catch (Throwable throwable2) {
                        kotlin.f.a(throwable, throwable2);
                    }
                }
                object2 = null;
                break block9;
            }
            try {
                j4.close();
                Object var1_3 = var4_14;
                object2 = g4;
            }
            catch (Throwable throwable) {
                object2 = g4;
            }
        }
        if (var1_6 != null) throw var1_6;
        y.g((Object)object2);
        okio.internal.j.k((okio.g)object2);
        if (i4.d() == 0) {
            g g5 = new g((l0)object2, i4.g(), true);
            return var1_9;
        }
        g g6 = new g(new s(new g((l0)object2, i4.c(), true), new Inflater(true)), i4.g(), false);
        return var1_9;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.io.j
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.io;

import java.io.File;
import kotlin.Metadata;
import kotlin.io.j;
import kotlin.io.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0002*\u00020\u0000\u00a2\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000\u00a2\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\r\u00a2\u0006\u0004\b\u000e\u0010\u000f\"\u0015\u0010\u0012\u001a\u00020\r*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2={"Ljava/io/File;", "target", "", "overwrite", "", "bufferSize", "s", "(Ljava/io/File;Ljava/io/File;ZI)Ljava/io/File;", "u", "(Ljava/io/File;)Z", "relative", "w", "(Ljava/io/File;Ljava/io/File;)Ljava/io/File;", "", "x", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "v", "(Ljava/io/File;)Ljava/lang/String;", "extension", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/io/FilesKt")
@SourceDebugExtension(value={"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1288#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
class m
extends l {
    /*
     * Exception decompiling
     */
    @NotNull
    public static final File s(@NotNull File var0, @NotNull File var1_1, boolean var2_4, int var3_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 161->170)] java.lang.Throwable
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

    public static /* synthetic */ File t(File file, File file2, boolean bl, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            bl = false;
        }
        if ((n5 & 4) != 0) {
            n4 = 8192;
        }
        return m.s(file, file2, bl, n4);
    }

    public static boolean u(@NotNull File object) {
        boolean bl;
        y.j((Object)object, (String)"<this>");
        object = l.q((File)object).iterator();
        block0: while (true) {
            bl = true;
            while (object.hasNext()) {
                File file = (File)object.next();
                if ((file.delete() || !file.exists()) && bl) continue block0;
                bl = false;
            }
            break;
        }
        return bl;
    }

    @NotNull
    public static String v(@NotNull File object) {
        y.j((Object)object, (String)"<this>");
        object = ((File)object).getName();
        y.i((Object)object, (String)"getName(...)");
        return p.T0((String)object, '.', "");
    }

    @NotNull
    public static final File w(@NotNull File object, @NotNull File file) {
        char c4;
        y.j((Object)object, (String)"<this>");
        y.j((Object)file, (String)"relative");
        if (j.b((File)file)) {
            return file;
        }
        object = ((File)object).toString();
        y.i((Object)object, (String)"toString(...)");
        if (object.length() == 0 || p.V((CharSequence)object, c4 = File.separatorChar, false, 2, null)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(file);
            object = new File(stringBuilder.toString());
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(c4);
            stringBuilder.append(file);
            object = new File(stringBuilder.toString());
        }
        return object;
    }

    @NotNull
    public static File x(@NotNull File file, @NotNull String string) {
        y.j((Object)file, (String)"<this>");
        y.j((Object)string, (String)"relative");
        return m.w(file, new File(string));
    }
}


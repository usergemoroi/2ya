/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.io.c
 *  kotlin.io.j
 *  kotlin.io.p
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.text.d
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.io;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.c;
import kotlin.io.i;
import kotlin.io.j;
import kotlin.io.p;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0010\u001a\u00020\u0003*\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012*\u00020\u0007H\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\b\u001a\u0010\u001b\u001a>\u0010!\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u001c\u00a2\u0006\u0004\b!\u0010\"\u001a!\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0#*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b$\u0010%\u00a8\u0006&"}, d2={"Ljava/io/File;", "", "array", "Lkotlin/k0;", "k", "(Ljava/io/File;[B)V", "c", "Ljava/nio/charset/Charset;", "charset", "", "i", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;", "text", "l", "(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "Ljava/io/OutputStream;", "n", "(Ljava/io/OutputStream;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "Ljava/nio/charset/CharsetEncoder;", "kotlin.jvm.PlatformType", "f", "(Ljava/nio/charset/Charset;)Ljava/nio/charset/CharsetEncoder;", "", "chunkSize", "encoder", "Ljava/nio/ByteBuffer;", "d", "(ILjava/nio/charset/CharsetEncoder;)Ljava/nio/ByteBuffer;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "line", "action", "e", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/l;)V", "", "g", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/util/List;", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/io/FilesKt")
@SourceDebugExtension(value={"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
class k
extends j {
    public static void c(@NotNull File object, @NotNull byte[] object2) {
        y.j((Object)object, (String)"<this>");
        y.j((Object)object2, (String)"array");
        object = new FileOutputStream((File)object, true);
        try {
            ((FileOutputStream)object).write((byte[])object2);
            object2 = k0.a;
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                c.a((Closeable)object, (Throwable)throwable);
                throw throwable2;
            }
        }
        c.a((Closeable)object, null);
    }

    @NotNull
    public static final ByteBuffer d(int n4, @NotNull CharsetEncoder object) {
        y.j((Object)object, (String)"encoder");
        object = ByteBuffer.allocate(n4 * (int)Math.ceil(((CharsetEncoder)object).maxBytesPerChar()));
        y.i((Object)object, (String)"allocate(...)");
        return object;
    }

    public static final void e(@NotNull File file, @NotNull Charset charset, @NotNull l<? super String, k0> l4) {
        y.j((Object)file, (String)"<this>");
        y.j((Object)charset, (String)"charset");
        y.j(l4, (String)"action");
        p.c((Reader)new BufferedReader(new InputStreamReader((InputStream)new FileInputStream(file), charset)), l4);
    }

    public static final CharsetEncoder f(@NotNull Charset object) {
        y.j((Object)object, (String)"<this>");
        object = ((Charset)object).newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return ((CharsetEncoder)object).onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    @NotNull
    public static final List<String> g(@NotNull File file, @NotNull Charset charset) {
        y.j((Object)file, (String)"<this>");
        y.j((Object)charset, (String)"charset");
        ArrayList<String> arrayList = new ArrayList<String>();
        k.e(file, charset, (l<? super String, k0>)new l<String, k0>(arrayList){
            final ArrayList<String> g;
            {
                this.g = arrayList;
                super(1);
            }

            @Override
            public final void invoke(String string) {
                y.j((Object)string, (String)"it");
                this.g.add(string);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ List h(File file, Charset charset, int n4, Object object) {
        if ((n4 & 1) != 0) {
            charset = d.b;
        }
        return k.g(file, charset);
    }

    @NotNull
    public static final String i(@NotNull File object, @NotNull Charset object2) {
        y.j((Object)object, (String)"<this>");
        y.j((Object)object2, (String)"charset");
        object = new InputStreamReader((InputStream)new FileInputStream((File)object), (Charset)object2);
        try {
            object2 = p.f((Reader)object);
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                c.a((Closeable)object, (Throwable)throwable);
                throw throwable2;
            }
        }
        c.a((Closeable)object, null);
        return object2;
    }

    public static /* synthetic */ String j(File file, Charset charset, int n4, Object object) {
        if ((n4 & 1) != 0) {
            charset = d.b;
        }
        return k.i(file, charset);
    }

    public static void k(@NotNull File object, @NotNull byte[] object2) {
        y.j((Object)object, (String)"<this>");
        y.j((Object)object2, (String)"array");
        object = new FileOutputStream((File)object);
        try {
            ((FileOutputStream)object).write((byte[])object2);
            object2 = k0.a;
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                c.a((Closeable)object, (Throwable)throwable);
                throw throwable2;
            }
        }
        c.a((Closeable)object, null);
    }

    public static void l(@NotNull File object, @NotNull String string, @NotNull Charset charset) {
        y.j((Object)object, (String)"<this>");
        y.j((Object)string, (String)"text");
        y.j((Object)charset, (String)"charset");
        object = new FileOutputStream((File)object);
        try {
            k.n((OutputStream)object, string, charset);
            string = k0.a;
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                c.a((Closeable)object, (Throwable)throwable);
                throw throwable2;
            }
        }
        c.a((Closeable)object, null);
    }

    public static /* synthetic */ void m(File file, String string, Charset charset, int n4, Object object) {
        if ((n4 & 2) != 0) {
            charset = d.b;
        }
        i.l(file, string, charset);
    }

    public static final void n(@NotNull OutputStream outputStream, @NotNull String object, @NotNull Charset comparable) {
        y.j((Object)outputStream, (String)"<this>");
        y.j((Object)object, (String)"text");
        y.j((Object)comparable, (String)"charset");
        if (((String)object).length() < 16384) {
            object = ((String)object).getBytes((Charset)comparable);
            y.i((Object)object, (String)"getBytes(...)");
            outputStream.write((byte[])object);
            return;
        }
        CharsetEncoder charsetEncoder = k.f((Charset)comparable);
        comparable = CharBuffer.allocate(8192);
        y.g((Object)charsetEncoder);
        ByteBuffer byteBuffer = k.d(8192, charsetEncoder);
        int n4 = 0;
        int n5 = 0;
        while (n4 < ((String)object).length()) {
            int n6 = Math.min(8192 - n5, ((String)object).length() - n4);
            int n7 = n4 + n6;
            char[] cArray = ((CharBuffer)comparable).array();
            y.i((Object)cArray, (String)"array(...)");
            ((String)object).getChars(n4, n7, cArray, n5);
            ((CharBuffer)comparable).limit(n6 + n5);
            n4 = ((String)object).length();
            n5 = 1;
            boolean bl = n7 == n4;
            if (charsetEncoder.encode((CharBuffer)comparable, byteBuffer, bl).isUnderflow()) {
                outputStream.write(byteBuffer.array(), 0, byteBuffer.position());
                if (((Buffer)((Object)comparable)).position() != ((Buffer)((Object)comparable)).limit()) {
                    ((CharBuffer)comparable).put(0, ((CharBuffer)comparable).get());
                } else {
                    n5 = 0;
                }
                ((CharBuffer)comparable).clear();
                byteBuffer.clear();
                n4 = n7;
                continue;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}


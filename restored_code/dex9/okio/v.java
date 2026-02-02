/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okio.c0
 *  okio.j
 *  okio.j0
 *  okio.k
 *  okio.l
 *  okio.l0
 *  okio.x
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okio.c0;
import okio.j;
import okio.j0;
import okio.k;
import okio.l;
import okio.l0;
import okio.u;
import okio.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b,\u0010-J'\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\u0002H\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\u0002H\u0002\u00a2\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b!\u0010 J\u001f\u0010\"\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b(\u0010#J\u000f\u0010*\u001a\u00020)H\u0016\u00a2\u0006\u0004\b*\u0010+\u00a8\u0006."}, d2={"Lokio/v;", "Lokio/l;", "Lokio/c0;", "dir", "", "throwOnFailure", "", "t", "(Lokio/c0;Z)Ljava/util/List;", "Lkotlin/k0;", "v", "(Lokio/c0;)V", "u", "path", "Lokio/k;", "m", "(Lokio/c0;)Lokio/k;", "k", "(Lokio/c0;)Ljava/util/List;", "file", "Lokio/j;", "n", "(Lokio/c0;)Lokio/j;", "mustCreate", "mustExist", "p", "(Lokio/c0;ZZ)Lokio/j;", "Lokio/l0;", "s", "(Lokio/c0;)Lokio/l0;", "Lokio/j0;", "r", "(Lokio/c0;Z)Lokio/j0;", "b", "g", "(Lokio/c0;Z)V", "source", "target", "c", "(Lokio/c0;Lokio/c0;)V", "i", "", "toString", "()Ljava/lang/String;", "<init>", "()V", "okio"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nJvmSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,158:1\n11400#2,3:159\n*S KotlinDebug\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n*L\n77#1:159,3\n*E\n"})
public class v
extends l {
    private final List<c0> t(c0 c02, boolean bl) {
        Object object3 = c02.o();
        Object object2 = ((File)object3).list();
        if (object2 == null) {
            if (bl) {
                if (!((File)object3).exists()) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("no such file: ");
                    ((StringBuilder)object2).append(c02);
                    throw new FileNotFoundException(((StringBuilder)object2).toString());
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("failed to list ");
                ((StringBuilder)object2).append(c02);
                throw new IOException(((StringBuilder)object2).toString());
            }
            return null;
        }
        ArrayList<c0> arrayList = new ArrayList<c0>();
        for (Object object3 : object2) {
            y.g((Object)object3);
            arrayList.add(c02.l((String)object3));
        }
        t.C(arrayList);
        return arrayList;
    }

    private final void u(c0 c02) {
        if (!this.j(c02)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c02);
        stringBuilder.append(" already exists.");
        throw new IOException(stringBuilder.toString());
    }

    private final void v(c0 c02) {
        if (this.j(c02)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c02);
        stringBuilder.append(" doesn't exist.");
        throw new IOException(stringBuilder.toString());
    }

    @NotNull
    public j0 b(@NotNull c0 c02, boolean bl) {
        y.j((Object)c02, (String)"file");
        if (bl) {
            this.v(c02);
        }
        return x.f((File)c02.o(), (boolean)true);
    }

    public void c(@NotNull c0 c02, @NotNull c0 c03) {
        y.j((Object)c02, (String)"source");
        y.j((Object)c03, (String)"target");
        if (c02.o().renameTo(c03.o())) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("failed to move ");
        stringBuilder.append(c02);
        stringBuilder.append(" to ");
        stringBuilder.append(c03);
        throw new IOException(stringBuilder.toString());
    }

    public void g(@NotNull c0 c02, boolean bl) {
        y.j((Object)c02, (String)"dir");
        if (!c02.o().mkdir()) {
            Object object = this.m(c02);
            if (object != null && object.f()) {
                if (!bl) {
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append(c02);
                ((StringBuilder)object).append(" already exists.");
                throw new IOException(((StringBuilder)object).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("failed to create directory: ");
            ((StringBuilder)object).append(c02);
            throw new IOException(((StringBuilder)object).toString());
        }
    }

    public void i(@NotNull c0 c02, boolean bl) {
        y.j((Object)c02, (String)"path");
        if (!Thread.interrupted()) {
            Comparable<File> comparable = c02.o();
            if (!((File)comparable).delete()) {
                if (!((File)comparable).exists()) {
                    if (bl) {
                        comparable = new StringBuilder();
                        ((StringBuilder)comparable).append("no such file: ");
                        ((StringBuilder)comparable).append(c02);
                        throw new FileNotFoundException(((StringBuilder)comparable).toString());
                    }
                } else {
                    comparable = new StringBuilder();
                    ((StringBuilder)comparable).append("failed to delete ");
                    ((StringBuilder)comparable).append(c02);
                    throw new IOException(((StringBuilder)comparable).toString());
                }
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @NotNull
    public List<c0> k(@NotNull c0 object) {
        y.j((Object)object, (String)"dir");
        object = this.t((c0)object, true);
        y.g((Object)object);
        return object;
    }

    @Nullable
    public k m(@NotNull c0 object) {
        y.j((Object)object, (String)"path");
        object = object.o();
        boolean bl = ((File)object).isFile();
        boolean bl2 = ((File)object).isDirectory();
        long l4 = ((File)object).lastModified();
        long l5 = ((File)object).length();
        if (!(bl || bl2 || l4 != 0L || l5 != 0L || ((File)object).exists())) {
            return null;
        }
        return new k(bl, bl2, null, Long.valueOf(l5), null, Long.valueOf(l4), null, null, 128, null);
    }

    @NotNull
    public j n(@NotNull c0 c02) {
        y.j((Object)c02, (String)"file");
        return new u(false, new RandomAccessFile(c02.o(), "r"));
    }

    @NotNull
    public j p(@NotNull c0 c02, boolean bl, boolean bl2) {
        y.j((Object)c02, (String)"file");
        if (bl && bl2) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
        }
        if (bl) {
            this.u(c02);
        }
        if (bl2) {
            this.v(c02);
        }
        return new u(true, new RandomAccessFile(c02.o(), "rw"));
    }

    @NotNull
    public j0 r(@NotNull c0 c02, boolean bl) {
        y.j((Object)c02, (String)"file");
        if (bl) {
            this.u(c02);
        }
        return x.i((File)c02.o(), (boolean)false, (int)1, null);
    }

    @NotNull
    public l0 s(@NotNull c0 c02) {
        y.j((Object)c02, (String)"file");
        return x.j((File)c02.o());
    }

    @NotNull
    public String toString() {
        return "JvmSystemFileSystem";
    }
}


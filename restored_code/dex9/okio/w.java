/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.applovin.shadow.okio.a0
 *  com.applovin.shadow.okio.b
 *  com.applovin.shadow.okio.b0
 *  com.applovin.shadow.okio.c
 *  com.applovin.shadow.okio.c0
 *  com.applovin.shadow.okio.d0
 *  com.applovin.shadow.okio.e0
 *  com.applovin.shadow.okio.r
 *  com.applovin.shadow.okio.s
 *  com.applovin.shadow.okio.t
 *  com.applovin.shadow.okio.u
 *  com.applovin.shadow.okio.v
 *  com.applovin.shadow.okio.w
 *  com.applovin.shadow.okio.x
 *  com.applovin.shadow.okio.y
 *  com.applovin.shadow.okio.z
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okio.c0
 *  okio.c0$a
 *  okio.k
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okio;

import com.applovin.shadow.okio.a0;
import com.applovin.shadow.okio.b;
import com.applovin.shadow.okio.b0;
import com.applovin.shadow.okio.c;
import com.applovin.shadow.okio.d0;
import com.applovin.shadow.okio.e0;
import com.applovin.shadow.okio.r;
import com.applovin.shadow.okio.s;
import com.applovin.shadow.okio.t;
import com.applovin.shadow.okio.u;
import com.applovin.shadow.okio.x;
import com.applovin.shadow.okio.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystemException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okio.c0;
import okio.k;
import okio.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0004\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0019"}, d2={"Lokio/w;", "Lokio/v;", "Ljava/nio/file/attribute/FileTime;", "", "x", "(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;", "Lokio/c0;", "path", "Lokio/k;", "m", "(Lokio/c0;)Lokio/k;", "Ljava/nio/file/Path;", "nioPath", "w", "(Ljava/nio/file/Path;)Lokio/k;", "source", "target", "Lkotlin/k0;", "c", "(Lokio/c0;Lokio/c0;)V", "", "toString", "()Ljava/lang/String;", "<init>", "()V", "okio"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nNioSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioSystemFileSystem.kt\nokio/NioSystemFileSystem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
public class w
extends v {
    private final Long x(FileTime comparable) {
        if (((Number)((Object)(comparable = Long.valueOf(com.applovin.shadow.okio.v.a((FileTime)comparable))))).longValue() == 0L) {
            comparable = null;
        }
        return comparable;
    }

    @Override
    public void c(@NotNull c0 c02, @NotNull c0 c03) {
        y.j((Object)c02, (String)"source");
        y.j((Object)c03, (String)"target");
        try {
            b.a((Path)c02.p(), (Path)c03.p(), (CopyOption[])new CopyOption[]{r.a(), s.a()});
            return;
        }
        catch (NoSuchFileException noSuchFileException) {
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw new IOException("atomic move not supported");
        }
        throw new FileNotFoundException(c.a((NoSuchFileException)noSuchFileException));
    }

    @Override
    @Nullable
    public k m(@NotNull c0 c02) {
        y.j((Object)c02, (String)"path");
        return this.w(c02.p());
    }

    @Override
    @NotNull
    public String toString() {
        return "NioSystemFileSystem";
    }

    @Nullable
    protected final k w(@NotNull Path path) {
        Object object;
        y.j((Object)path, (String)"nioPath");
        Long l4 = null;
        try {
            object = com.applovin.shadow.okio.y.a((Path)path, (Class)t.a(), (LinkOption[])new LinkOption[]{x.a()});
        }
        catch (FileSystemException | NoSuchFileException fileSystemException) {
            return null;
        }
        path = z.a((BasicFileAttributes)object) ? a0.a((Path)path) : null;
        boolean bl = b0.a((BasicFileAttributes)object);
        boolean bl2 = com.applovin.shadow.okio.c0.a((BasicFileAttributes)object);
        path = path != null ? c0.a.f((c0.a)c0.d, (Path)path, (boolean)false, (int)1, null) : null;
        long l5 = d0.a((BasicFileAttributes)object);
        Comparable<FileTime> comparable = e0.a((BasicFileAttributes)object);
        comparable = comparable != null ? this.x((FileTime)comparable) : null;
        Comparable<FileTime> comparable2 = u.a((BasicFileAttributes)object);
        comparable2 = comparable2 != null ? this.x((FileTime)comparable2) : null;
        object = com.applovin.shadow.okio.w.a((BasicFileAttributes)object);
        if (object != null) {
            l4 = this.x((FileTime)object);
        }
        return new k(bl, bl2, (c0)path, Long.valueOf(l5), (Long)comparable, (Long)comparable2, l4, null, 128, null);
    }
}


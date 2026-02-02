/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.JvmName
 *  kotlin.jvm.internal.y
 *  okhttp3.c0
 *  okhttp3.x
 *  okhttp3.x$a
 *  okhttp3.y$b
 *  okhttp3.y$c
 *  okio.h
 *  org.jetbrains.annotations.NotNull
 */
package okhttp3;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import okhttp3.c0;
import okhttp3.u;
import okhttp3.x;
import okhttp3.y;
import okio.e;
import okio.f;
import okio.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0003\u0012\u0007\u0019B'\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\u0004\b#\u0010$J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\t8\u0007\u00a2\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0007\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020 8G\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010!\u00a8\u0006&"}, d2={"Lokhttp3/y;", "Lokhttp3/c0;", "Lokio/f;", "sink", "", "countBytes", "", "b", "(Lokio/f;Z)J", "Lokhttp3/x;", "contentType", "()Lokhttp3/x;", "contentLength", "()J", "Lkotlin/k0;", "writeTo", "(Lokio/f;)V", "Lokio/h;", "a", "Lokio/h;", "boundaryByteString", "Lokhttp3/x;", "type", "", "Lokhttp3/y$c;", "c", "Ljava/util/List;", "parts", "()Ljava/util/List;", "d", "e", "J", "", "()Ljava/lang/String;", "boundary", "<init>", "(Lokio/h;Lokhttp3/x;Ljava/util/List;)V", "f", "okhttp"}, k=1, mv={1, 8, 0})
public final class y
extends c0 {
    @NotNull
    public static final b f = new /* Unavailable Anonymous Inner Class!! */;
    @JvmField
    @NotNull
    public static final x g;
    @JvmField
    @NotNull
    public static final x h;
    @JvmField
    @NotNull
    public static final x i;
    @JvmField
    @NotNull
    public static final x j;
    @JvmField
    @NotNull
    public static final x k;
    @NotNull
    private static final byte[] l;
    @NotNull
    private static final byte[] m;
    @NotNull
    private static final byte[] n;
    @NotNull
    private final h a;
    @NotNull
    private final x b;
    @NotNull
    private final List<c> c;
    @NotNull
    private final x d;
    private long e;

    static {
        x.a a4 = x.e;
        g = a4.a("multipart/mixed");
        h = a4.a("multipart/alternative");
        i = a4.a("multipart/digest");
        j = a4.a("multipart/parallel");
        k = a4.a("multipart/form-data");
        l = new byte[]{58, 32};
        m = new byte[]{13, 10};
        n = new byte[]{45, 45};
    }

    public y(@NotNull h h4, @NotNull x x3, @NotNull List<c> object) {
        kotlin.jvm.internal.y.j((Object)h4, (String)"boundaryByteString");
        kotlin.jvm.internal.y.j((Object)x3, (String)"type");
        kotlin.jvm.internal.y.j(object, (String)"parts");
        this.a = h4;
        this.b = x3;
        this.c = object;
        h4 = x.e;
        object = new StringBuilder();
        ((StringBuilder)object).append(x3);
        ((StringBuilder)object).append("; boundary=");
        ((StringBuilder)object).append(this.a());
        this.d = h4.a(((StringBuilder)object).toString());
        this.e = -1L;
    }

    private final long b(f f4, boolean bl) throws IOException {
        long l4;
        Object object;
        f f5 = bl ? (f4 = new e()) : null;
        int n4 = this.c.size();
        long l5 = 0L;
        for (int i4 = 0; i4 < n4; ++i4) {
            object = this.c.get(i4);
            Object object2 = object.b();
            object = object.a();
            kotlin.jvm.internal.y.g((Object)f4);
            f4.write(n);
            f4.j(this.a);
            f4.write(m);
            if (object2 != null) {
                int n5 = ((u)object2).size();
                for (int i5 = 0; i5 < n5; ++i5) {
                    f4.writeUtf8(((u)object2).d(i5)).write(l).writeUtf8(((u)object2).h(i5)).write(m);
                }
            }
            if ((object2 = object.contentType()) != null) {
                f4.writeUtf8("Content-Type: ").writeUtf8(object2.toString()).write(m);
            }
            if ((l4 = object.contentLength()) != -1L) {
                f4.writeUtf8("Content-Length: ").writeDecimalLong(l4).write(m);
            } else if (bl) {
                kotlin.jvm.internal.y.g((Object)f5);
                ((e)f5).k();
                return -1L;
            }
            object2 = m;
            f4.write((byte[])object2);
            if (bl) {
                l5 += l4;
            } else {
                object.writeTo(f4);
            }
            f4.write((byte[])object2);
        }
        kotlin.jvm.internal.y.g((Object)f4);
        object = n;
        f4.write((byte[])object);
        f4.j(this.a);
        f4.write((byte[])object);
        f4.write(m);
        l4 = l5;
        if (bl) {
            kotlin.jvm.internal.y.g((Object)f5);
            l4 = l5 + ((e)f5).size();
            ((e)f5).k();
        }
        return l4;
    }

    @JvmName(name="boundary")
    @NotNull
    public final String a() {
        return this.a.I();
    }

    public long contentLength() throws IOException {
        long l4;
        long l5 = l4 = this.e;
        if (l4 == -1L) {
            this.e = l5 = this.b(null, true);
        }
        return l5;
    }

    @NotNull
    public x contentType() {
        return this.d;
    }

    public void writeTo(@NotNull f f4) throws IOException {
        kotlin.jvm.internal.y.j((Object)f4, (String)"sink");
        this.b(f4, false);
    }
}


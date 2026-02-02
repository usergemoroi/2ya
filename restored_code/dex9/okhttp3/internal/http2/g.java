/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  okhttp3.a0
 *  okhttp3.b0
 *  okhttp3.d0
 *  okhttp3.d0$a
 *  okhttp3.internal.d
 *  okhttp3.internal.http.d
 *  okhttp3.internal.http.e
 *  okhttp3.internal.http2.b
 *  okhttp3.internal.http2.f
 *  okhttp3.internal.http2.g$a
 *  okhttp3.internal.http2.i
 *  okio.j0
 *  okio.l0
 *  okio.m0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.internal.d;
import okhttp3.internal.http.e;
import okhttp3.internal.http2.b;
import okhttp3.internal.http2.f;
import okhttp3.internal.http2.g;
import okhttp3.internal.http2.i;
import okhttp3.u;
import okhttp3.z;
import okio.j0;
import okio.l0;
import okio.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 52\u00020\u0001:\u0001\u0019B'\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u0010 \u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020$\u00a2\u0006\u0004\b3\u00104J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u001b\u0010\rR\u001a\u0010 \u001a\u00020\u001c8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\n\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b.\u0010/\u00a8\u00066"}, d2={"Lokhttp3/internal/http2/g;", "Lokhttp3/internal/http/d;", "Lokhttp3/b0;", "request", "", "contentLength", "Lokio/j0;", "b", "(Lokhttp3/b0;J)Lokio/j0;", "Lkotlin/k0;", "d", "(Lokhttp3/b0;)V", "flushRequest", "()V", "finishRequest", "", "expectContinue", "Lokhttp3/d0$a;", "readResponseHeaders", "(Z)Lokhttp3/d0$a;", "Lokhttp3/d0;", "response", "c", "(Lokhttp3/d0;)J", "Lokio/l0;", "a", "(Lokhttp3/d0;)Lokio/l0;", "cancel", "Lokhttp3/internal/connection/f;", "Lokhttp3/internal/connection/f;", "getConnection", "()Lokhttp3/internal/connection/f;", "connection", "Lokhttp3/internal/http/g;", "Lokhttp3/internal/http/g;", "chain", "Lokhttp3/internal/http2/f;", "Lokhttp3/internal/http2/f;", "http2Connection", "Lokhttp3/internal/http2/i;", "Lokhttp3/internal/http2/i;", "stream", "Lokhttp3/a0;", "e", "Lokhttp3/a0;", "protocol", "f", "Z", "canceled", "Lokhttp3/z;", "client", "<init>", "(Lokhttp3/z;Lokhttp3/internal/connection/f;Lokhttp3/internal/http/g;Lokhttp3/internal/http2/f;)V", "g", "okhttp"}, k=1, mv={1, 8, 0})
public final class g
implements okhttp3.internal.http.d {
    @NotNull
    public static final a g = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final List<String> h = okhttp3.internal.d.w((Object[])new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    @NotNull
    private static final List<String> i = okhttp3.internal.d.w((Object[])new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    @NotNull
    private final okhttp3.internal.connection.f a;
    @NotNull
    private final okhttp3.internal.http.g b;
    @NotNull
    private final f c;
    @Nullable
    private volatile i d;
    @NotNull
    private final a0 e;
    private volatile boolean f;

    public g(@NotNull z z3, @NotNull okhttp3.internal.connection.f object, @NotNull okhttp3.internal.http.g g4, @NotNull f f4) {
        y.j((Object)z3, (String)"client");
        y.j((Object)object, (String)"connection");
        y.j((Object)g4, (String)"chain");
        y.j((Object)f4, (String)"http2Connection");
        this.a = object;
        this.b = g4;
        this.c = f4;
        object = z3.B();
        z3 = a0.i;
        if (!object.contains(z3)) {
            z3 = a0.h;
        }
        this.e = z3;
    }

    public static final /* synthetic */ List e() {
        return h;
    }

    public static final /* synthetic */ List f() {
        return i;
    }

    @NotNull
    public l0 a(@NotNull d0 d02) {
        y.j((Object)d02, (String)"response");
        d02 = this.d;
        y.g((Object)d02);
        return d02.p();
    }

    @NotNull
    public j0 b(@NotNull b0 b02, long l4) {
        y.j((Object)b02, (String)"request");
        b02 = this.d;
        y.g((Object)b02);
        return b02.n();
    }

    public long c(@NotNull d0 d02) {
        y.j((Object)d02, (String)"response");
        long l4 = !okhttp3.internal.http.e.b((d0)d02) ? 0L : okhttp3.internal.d.v((d0)d02);
        return l4;
    }

    public void cancel() {
        this.f = true;
        i i4 = this.d;
        if (i4 != null) {
            i4.f(okhttp3.internal.http2.b.m);
        }
    }

    public void d(@NotNull b0 object) {
        y.j((Object)object, (String)"request");
        if (this.d != null) {
            return;
        }
        boolean bl = object.a() != null;
        object = g.a(object);
        this.d = this.c.f0((List)object, bl);
        if (!this.f) {
            object = this.d;
            y.g((Object)object);
            m0 m02 = object.v();
            long l4 = this.b.f();
            object = TimeUnit.MILLISECONDS;
            m02.timeout(l4, (TimeUnit)((Object)object));
            m02 = this.d;
            y.g((Object)m02);
            m02.E().timeout((long)this.b.h(), (TimeUnit)((Object)object));
            return;
        }
        object = this.d;
        y.g((Object)object);
        object.f(okhttp3.internal.http2.b.m);
        throw new IOException("Canceled");
    }

    public void finishRequest() {
        i i4 = this.d;
        y.g((Object)i4);
        i4.n().close();
    }

    public void flushRequest() {
        this.c.flush();
    }

    @NotNull
    public okhttp3.internal.connection.f getConnection() {
        return this.a;
    }

    @Nullable
    public d0.a readResponseHeaders(boolean bl) {
        Object object = this.d;
        if (object != null) {
            object = object.C();
            d0.a a4 = g.b((u)object, this.e);
            object = a4;
            if (bl) {
                object = a4;
                if (a4.h() == 100) {
                    object = null;
                }
            }
            return object;
        }
        throw new IOException("stream wasn't created");
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okhttp3.b0
 *  okhttp3.d0
 *  okhttp3.d0$a
 *  okhttp3.internal.d
 *  okhttp3.internal.http.d
 *  okhttp3.internal.http.e
 *  okhttp3.internal.http.i
 *  okhttp3.internal.http.k
 *  okhttp3.internal.http1.a
 *  okhttp3.internal.http1.b$d
 *  okhttp3.n
 *  okhttp3.v
 *  okio.j0
 *  okio.l0
 *  okio.m0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.http1;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.internal.http.i;
import okhttp3.internal.http.k;
import okhttp3.internal.http1.b;
import okhttp3.n;
import okhttp3.u;
import okhttp3.v;
import okhttp3.z;
import okio.j0;
import okio.l0;
import okio.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 T2\u00020\u0001:\u0007#\u0019!\u001dCGJB)\u0012\b\u00106\u001a\u0004\u0018\u000104\u0012\u0006\u0010;\u001a\u000207\u0012\u0006\u0010>\u001a\u00020<\u0012\u0006\u0010A\u001a\u00020?\u00a2\u0006\u0004\bR\u0010SJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b&\u0010\u001cJ\u001d\u0010+\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)\u00a2\u0006\u0004\b+\u0010,J\u0019\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010.\u001a\u00020-H\u0016\u00a2\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f\u00a2\u0006\u0004\b2\u00103R\u0016\u00106\u001a\u0004\u0018\u0001048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u00105R\u001a\u0010;\u001a\u0002078\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0019\u00108\u001a\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010=R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u00020-*\u00020\u001f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bM\u0010NR\u0018\u0010O\u001a\u00020-*\u00020\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bP\u0010Q\u00a8\u0006U"}, d2={"Lokhttp3/internal/http1/b;", "Lokhttp3/internal/http/d;", "Lokio/j0;", "q", "()Lokio/j0;", "t", "", "length", "Lokio/l0;", "s", "(J)Lokio/l0;", "Lokhttp3/v;", "url", "r", "(Lokhttp3/v;)Lokio/l0;", "u", "()Lokio/l0;", "Lokio/p;", "timeout", "Lkotlin/k0;", "n", "(Lokio/p;)V", "Lokhttp3/b0;", "request", "contentLength", "b", "(Lokhttp3/b0;J)Lokio/j0;", "cancel", "()V", "d", "(Lokhttp3/b0;)V", "Lokhttp3/d0;", "response", "c", "(Lokhttp3/d0;)J", "a", "(Lokhttp3/d0;)Lokio/l0;", "flushRequest", "finishRequest", "Lokhttp3/u;", "headers", "", "requestLine", "w", "(Lokhttp3/u;Ljava/lang/String;)V", "", "expectContinue", "Lokhttp3/d0$a;", "readResponseHeaders", "(Z)Lokhttp3/d0$a;", "v", "(Lokhttp3/d0;)V", "Lokhttp3/z;", "Lokhttp3/z;", "client", "Lokhttp3/internal/connection/f;", "Lokhttp3/internal/connection/f;", "getConnection", "()Lokhttp3/internal/connection/f;", "connection", "Lokio/g;", "Lokio/g;", "source", "Lokio/f;", "Lokio/f;", "sink", "", "e", "I", "state", "Lokhttp3/internal/http1/a;", "f", "Lokhttp3/internal/http1/a;", "headersReader", "g", "Lokhttp3/u;", "trailers", "p", "(Lokhttp3/d0;)Z", "isChunked", "o", "(Lokhttp3/b0;)Z", "<init>", "(Lokhttp3/z;Lokhttp3/internal/connection/f;Lokio/g;Lokio/f;)V", "h", "okhttp"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
public final class b
implements okhttp3.internal.http.d {
    @NotNull
    public static final d h = new /* Unavailable Anonymous Inner Class!! */;
    @Nullable
    private final z a;
    @NotNull
    private final okhttp3.internal.connection.f b;
    @NotNull
    private final okio.g c;
    @NotNull
    private final okio.f d;
    private int e;
    @NotNull
    private final okhttp3.internal.http1.a f;
    @Nullable
    private u g;

    public b(@Nullable z z3, @NotNull okhttp3.internal.connection.f f4, @NotNull okio.g g4, @NotNull okio.f f5) {
        y.j((Object)((Object)f4), (String)"connection");
        y.j((Object)g4, (String)"source");
        y.j((Object)f5, (String)"sink");
        this.a = z3;
        this.b = f4;
        this.c = g4;
        this.d = f5;
        this.f = new okhttp3.internal.http1.a(g4);
    }

    private final void n(okio.p p4) {
        m0 m02 = p4.b();
        p4.c(m0.NONE);
        m02.clearDeadline();
        m02.clearTimeout();
    }

    private final boolean o(b0 b02) {
        return p.z("chunked", b02.d("Transfer-Encoding"), true);
    }

    private final boolean p(d0 d02) {
        return p.z("chunked", d0.w((d0)d02, (String)"Transfer-Encoding", null, (int)2, null), true);
    }

    private final j0 q() {
        if (this.e == 1) {
            this.e = 2;
            return new b(this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.e);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private final l0 r(v object) {
        if (this.e == 4) {
            this.e = 5;
            return new c(this, (v)object);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("state: ");
        ((StringBuilder)object).append(this.e);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    private final l0 s(long l4) {
        if (this.e == 4) {
            this.e = 5;
            return new e(this, l4);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.e);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private final j0 t() {
        if (this.e == 1) {
            this.e = 2;
            return new f(this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.e);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private final l0 u() {
        if (this.e == 4) {
            this.e = 5;
            this.getConnection().z();
            return new g(this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.e);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    @NotNull
    public l0 a(@NotNull d0 d02) {
        long l4;
        y.j((Object)d02, (String)"response");
        d02 = !okhttp3.internal.http.e.b((d0)d02) ? this.s(0L) : (this.p(d02) ? this.r(d02.V().k()) : ((l4 = okhttp3.internal.d.v((d0)d02)) != -1L ? this.s(l4) : this.u()));
        return d02;
    }

    @NotNull
    public j0 b(@NotNull b0 b02, long l4) {
        block6: {
            block5: {
                block4: {
                    y.j((Object)b02, (String)"request");
                    if (b02.a() != null && b02.a().isDuplex()) {
                        throw new ProtocolException("Duplex connections are not supported for HTTP/1");
                    }
                    if (!this.o(b02)) break block4;
                    b02 = this.q();
                    break block5;
                }
                if (l4 == -1L) break block6;
                b02 = this.t();
            }
            return b02;
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public long c(@NotNull d0 d02) {
        y.j((Object)d02, (String)"response");
        long l4 = !okhttp3.internal.http.e.b((d0)d02) ? 0L : (this.p(d02) ? -1L : okhttp3.internal.d.v((d0)d02));
        return l4;
    }

    public void cancel() {
        this.getConnection().d();
    }

    public void d(@NotNull b0 b02) {
        y.j((Object)b02, (String)"request");
        Object object = i.a;
        Proxy.Type type = this.getConnection().A().b().type();
        y.i((Object)((Object)type), (String)"connection.route().proxy.type()");
        object = object.a(b02, type);
        this.w(b02.f(), (String)object);
    }

    public void finishRequest() {
        this.d.flush();
    }

    public void flushRequest() {
        this.d.flush();
    }

    @NotNull
    public okhttp3.internal.connection.f getConnection() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public d0.a readResponseHeaders(boolean bl) {
        EOFException eOFException2;
        block6: {
            d0.a a4;
            k k4;
            int n4 = this.e;
            if (n4 != 1 && n4 != 2 && n4 != 3) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("state: ");
                stringBuilder.append(this.e);
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
            try {
                k4 = k.d.a(this.f.b());
                a4 = new d0.a();
                a4 = a4.p(k4.a).g(k4.b).m(k4.c).k(this.f.a());
                if (bl && k4.b == 100) {
                    return null;
                }
            }
            catch (EOFException eOFException2) {
                break block6;
            }
            n4 = k4.b;
            if (n4 == 100) {
                this.e = 3;
                return a4;
            }
            if (102 <= n4 && n4 < 200) {
                this.e = 3;
                return a4;
            }
            this.e = 4;
            return a4;
        }
        String string = this.getConnection().A().a().l().p();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected end of stream on ");
        stringBuilder.append(string);
        throw new IOException(stringBuilder.toString(), eOFException2);
    }

    public final void v(@NotNull d0 d02) {
        y.j((Object)d02, (String)"response");
        long l4 = okhttp3.internal.d.v((d0)d02);
        if (l4 == -1L) {
            return;
        }
        d02 = this.s(l4);
        okhttp3.internal.d.N((l0)d02, (int)Integer.MAX_VALUE, (TimeUnit)TimeUnit.MILLISECONDS);
        d02.close();
    }

    public final void w(@NotNull u object, @NotNull String string) {
        y.j((Object)object, (String)"headers");
        y.j((Object)string, (String)"requestLine");
        if (this.e == 0) {
            this.d.writeUtf8(string).writeUtf8("\r\n");
            int n4 = ((u)object).size();
            for (int i4 = 0; i4 < n4; ++i4) {
                this.d.writeUtf8(((u)object).d(i4)).writeUtf8(": ").writeUtf8(((u)object).h(i4)).writeUtf8("\r\n");
            }
            this.d.writeUtf8("\r\n");
            this.e = 1;
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("state: ");
        ((StringBuilder)object).append(this.e);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    @Metadata(d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u00a2\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u000e8\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00138\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001c"}, d2={"Lokhttp3/internal/http1/b$a;", "Lokio/l0;", "Lokio/m0;", "timeout", "()Lokio/m0;", "Lokio/e;", "sink", "", "byteCount", "read", "(Lokio/e;J)J", "Lkotlin/k0;", "h", "()V", "Lokio/p;", "c", "Lokio/p;", "getTimeout", "()Lokio/p;", "", "d", "Z", "()Z", "i", "(Z)V", "closed", "<init>", "(Lokhttp3/internal/http1/b;)V", "okhttp"}, k=1, mv={1, 8, 0})
    private abstract class a
    implements l0 {
        @NotNull
        private final okio.p c;
        private boolean d;
        final b e;

        public a(b b4) {
            this.e = b4;
            this.c = new okio.p(b4.c.timeout());
        }

        protected final boolean d() {
            return this.d;
        }

        public final void h() {
            if (this.e.e == 6) {
                return;
            }
            if (this.e.e == 5) {
                this.e.n(this.c);
                this.e.e = 6;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("state: ");
            stringBuilder.append(this.e.e);
            throw new IllegalStateException(stringBuilder.toString());
        }

        protected final void i(boolean bl) {
            this.d = bl;
        }

        public long read(@NotNull okio.e e4, long l4) {
            y.j((Object)e4, (String)"sink");
            try {
                l4 = this.e.c.read(e4, l4);
                return l4;
            }
            catch (IOException iOException) {
                this.e.getConnection().z();
                this.h();
                throw iOException;
            }
        }

        @NotNull
        public m0 timeout() {
            return this.c;
        }
    }

    @Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0018"}, d2={"Lokhttp3/internal/http1/b$b;", "Lokio/j0;", "Lokio/m0;", "timeout", "()Lokio/m0;", "Lokio/e;", "source", "", "byteCount", "Lkotlin/k0;", "write", "(Lokio/e;J)V", "flush", "()V", "close", "Lokio/p;", "c", "Lokio/p;", "", "d", "Z", "closed", "<init>", "(Lokhttp3/internal/http1/b;)V", "okhttp"}, k=1, mv={1, 8, 0})
    @SourceDebugExtension(value={"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    private final class b
    implements j0 {
        @NotNull
        private final okio.p c;
        private boolean d;
        final b e;

        public b(b b4) {
            this.e = b4;
            this.c = new okio.p(b4.d.timeout());
        }

        public void close() {
            synchronized (this) {
                block4: {
                    boolean bl = this.d;
                    if (!bl) break block4;
                    return;
                }
                this.d = true;
                this.e.d.writeUtf8("0\r\n\r\n");
                this.e.n(this.c);
                this.e.e = 3;
                return;
            }
        }

        public void flush() {
            synchronized (this) {
                block4: {
                    boolean bl = this.d;
                    if (!bl) break block4;
                    return;
                }
                this.e.d.flush();
                return;
            }
        }

        @NotNull
        public m0 timeout() {
            return this.c;
        }

        public void write(@NotNull okio.e e4, long l4) {
            y.j((Object)e4, (String)"source");
            if (this.d ^ true) {
                if (l4 == 0L) {
                    return;
                }
                this.e.d.writeHexadecimalUnsignedLong(l4);
                this.e.d.writeUtf8("\r\n");
                this.e.d.write(e4, l4);
                this.e.d.writeUtf8("\r\n");
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    @Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001a"}, d2={"Lokhttp3/internal/http1/b$c;", "Lokhttp3/internal/http1/b$a;", "Lokhttp3/internal/http1/b;", "Lkotlin/k0;", "k", "()V", "Lokio/e;", "sink", "", "byteCount", "read", "(Lokio/e;J)J", "close", "Lokhttp3/v;", "f", "Lokhttp3/v;", "url", "g", "J", "bytesRemainingInChunk", "", "h", "Z", "hasMoreChunks", "<init>", "(Lokhttp3/internal/http1/b;Lokhttp3/v;)V", "okhttp"}, k=1, mv={1, 8, 0})
    @SourceDebugExtension(value={"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    private final class c
    extends a {
        @NotNull
        private final v f;
        private long g;
        private boolean h;
        final b i;

        public c(@NotNull b b4, v v3) {
            y.j((Object)v3, (String)"url");
            this.i = b4;
            super(b4);
            this.f = v3;
            this.g = -1L;
            this.h = true;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private final void k() {
            Object object;
            block4: {
                Object object2;
                if (this.g != -1L) {
                    this.i.c.readUtf8LineStrict();
                }
                try {
                    boolean bl;
                    this.g = this.i.c.readHexadecimalUnsignedLong();
                    object = ((Object)p.g1(this.i.c.readUtf8LineStrict())).toString();
                    if (this.g < 0L || object.length() > 0 && !(bl = p.M((String)object, ";", false, 2, null))) break block4;
                    if (this.g != 0L) return;
                    this.h = false;
                    object2 = this.i;
                }
                catch (NumberFormatException numberFormatException) {
                    throw new ProtocolException(numberFormatException.getMessage());
                }
                ((b)object2).g = ((b)object2).f.a();
                object2 = this.i.a;
                y.g((Object)object2);
                object2 = ((z)object2).n();
                v v3 = this.f;
                object = this.i.g;
                y.g((Object)object);
                okhttp3.internal.http.e.f((n)object2, (v)v3, (u)object);
                this.h();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected chunk size and optional extensions but was \"");
            stringBuilder.append(this.g);
            stringBuilder.append((String)object);
            stringBuilder.append('\"');
            ProtocolException protocolException = new ProtocolException(stringBuilder.toString());
            throw protocolException;
        }

        public void close() {
            if (this.d()) {
                return;
            }
            if (this.h && !okhttp3.internal.d.s((l0)this, (int)100, (TimeUnit)TimeUnit.MILLISECONDS)) {
                this.i.getConnection().z();
                this.h();
            }
            this.i(true);
        }

        @Override
        public long read(@NotNull okio.e object, long l4) {
            y.j((Object)object, (String)"sink");
            if (l4 >= 0L) {
                if (this.d() ^ true) {
                    if (!this.h) {
                        return -1L;
                    }
                    long l5 = this.g;
                    if (l5 == 0L || l5 == -1L) {
                        this.k();
                        if (!this.h) {
                            return -1L;
                        }
                    }
                    if ((l4 = super.read((okio.e)object, Math.min(l4, this.g))) != -1L) {
                        this.g -= l4;
                        return l4;
                    }
                    this.i.getConnection().z();
                    object = new ProtocolException("unexpected end of stream");
                    this.h();
                    throw object;
                }
                throw new IllegalStateException("closed".toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("byteCount < 0: ");
            ((StringBuilder)object).append(l4);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
    }

    @Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2={"Lokhttp3/internal/http1/b$e;", "Lokhttp3/internal/http1/b$a;", "Lokhttp3/internal/http1/b;", "Lokio/e;", "sink", "", "byteCount", "read", "(Lokio/e;J)J", "Lkotlin/k0;", "close", "()V", "f", "J", "bytesRemaining", "<init>", "(Lokhttp3/internal/http1/b;J)V", "okhttp"}, k=1, mv={1, 8, 0})
    @SourceDebugExtension(value={"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    private final class e
    extends a {
        private long f;
        final b g;

        public e(b b4, long l4) {
            this.g = b4;
            super(b4);
            this.f = l4;
            if (l4 == 0L) {
                this.h();
            }
        }

        public void close() {
            if (this.d()) {
                return;
            }
            if (this.f != 0L && !okhttp3.internal.d.s((l0)this, (int)100, (TimeUnit)TimeUnit.MILLISECONDS)) {
                this.g.getConnection().z();
                this.h();
            }
            this.i(true);
        }

        @Override
        public long read(@NotNull okio.e object, long l4) {
            y.j((Object)object, (String)"sink");
            if (l4 >= 0L) {
                if (this.d() ^ true) {
                    long l5 = this.f;
                    if (l5 == 0L) {
                        return -1L;
                    }
                    if ((l5 = super.read((okio.e)object, Math.min(l5, l4))) != -1L) {
                        this.f = l4 = this.f - l5;
                        if (l4 == 0L) {
                            this.h();
                        }
                        return l5;
                    }
                    this.g.getConnection().z();
                    object = new ProtocolException("unexpected end of stream");
                    this.h();
                    throw object;
                }
                throw new IllegalStateException("closed".toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("byteCount < 0: ");
            ((StringBuilder)object).append(l4);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
    }

    @Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0018"}, d2={"Lokhttp3/internal/http1/b$f;", "Lokio/j0;", "Lokio/m0;", "timeout", "()Lokio/m0;", "Lokio/e;", "source", "", "byteCount", "Lkotlin/k0;", "write", "(Lokio/e;J)V", "flush", "()V", "close", "Lokio/p;", "c", "Lokio/p;", "", "d", "Z", "closed", "<init>", "(Lokhttp3/internal/http1/b;)V", "okhttp"}, k=1, mv={1, 8, 0})
    @SourceDebugExtension(value={"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    private final class f
    implements j0 {
        @NotNull
        private final okio.p c;
        private boolean d;
        final b e;

        public f(b b4) {
            this.e = b4;
            this.c = new okio.p(b4.d.timeout());
        }

        public void close() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.e.n(this.c);
            this.e.e = 3;
        }

        public void flush() {
            if (this.d) {
                return;
            }
            this.e.d.flush();
        }

        @NotNull
        public m0 timeout() {
            return this.c;
        }

        public void write(@NotNull okio.e e4, long l4) {
            y.j((Object)e4, (String)"source");
            if (this.d ^ true) {
                okhttp3.internal.d.l((long)e4.size(), (long)0L, (long)l4);
                this.e.d.write(e4, l4);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    @Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2={"Lokhttp3/internal/http1/b$g;", "Lokhttp3/internal/http1/b$a;", "Lokhttp3/internal/http1/b;", "Lokio/e;", "sink", "", "byteCount", "read", "(Lokio/e;J)J", "Lkotlin/k0;", "close", "()V", "", "f", "Z", "inputExhausted", "<init>", "(Lokhttp3/internal/http1/b;)V", "okhttp"}, k=1, mv={1, 8, 0})
    @SourceDebugExtension(value={"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    private final class g
    extends a {
        private boolean f;
        final b g;

        public g(b b4) {
            this.g = b4;
            super(b4);
        }

        public void close() {
            if (this.d()) {
                return;
            }
            if (!this.f) {
                this.h();
            }
            this.i(true);
        }

        @Override
        public long read(@NotNull okio.e object, long l4) {
            y.j((Object)object, (String)"sink");
            if (l4 >= 0L) {
                if (this.d() ^ true) {
                    if (this.f) {
                        return -1L;
                    }
                    if ((l4 = super.read((okio.e)object, l4)) == -1L) {
                        this.f = true;
                        this.h();
                        return -1L;
                    }
                    return l4;
                }
                throw new IllegalStateException("closed".toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("byteCount < 0: ");
            ((StringBuilder)object).append(l4);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
    }
}


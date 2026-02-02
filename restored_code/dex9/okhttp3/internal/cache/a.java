/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  okhttp3.a0
 *  okhttp3.b0
 *  okhttp3.c
 *  okhttp3.d0
 *  okhttp3.d0$a
 *  okhttp3.e
 *  okhttp3.e0
 *  okhttp3.internal.cache.a$a
 *  okhttp3.internal.cache.b
 *  okhttp3.internal.cache.c
 *  okhttp3.internal.cache.c$b
 *  okhttp3.internal.d
 *  okhttp3.internal.http.e
 *  okhttp3.internal.http.f
 *  okhttp3.r
 *  okhttp3.w
 *  okhttp3.w$a
 *  okio.j0
 *  okio.l0
 *  okio.m0
 *  okio.x
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.e0;
import okhttp3.internal.cache.a;
import okhttp3.internal.cache.b;
import okhttp3.internal.cache.c;
import okhttp3.internal.d;
import okhttp3.internal.http.h;
import okhttp3.r;
import okhttp3.u;
import okhttp3.w;
import okio.f;
import okio.g;
import okio.j0;
import okio.l0;
import okio.m0;
import okio.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Exception performing whole class analysis ignored.
 */
@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2={"Lokhttp3/internal/cache/a;", "Lokhttp3/w;", "Lokhttp3/internal/cache/b;", "cacheRequest", "Lokhttp3/d0;", "response", "a", "(Lokhttp3/internal/cache/b;Lokhttp3/d0;)Lokhttp3/d0;", "Lokhttp3/w$a;", "chain", "intercept", "(Lokhttp3/w$a;)Lokhttp3/d0;", "Lokhttp3/c;", "Lokhttp3/c;", "getCache$okhttp", "()Lokhttp3/c;", "cache", "<init>", "(Lokhttp3/c;)V", "b", "okhttp"}, k=1, mv={1, 8, 0})
public final class a
implements w {
    @NotNull
    public static final a b = new /* Unavailable Anonymous Inner Class!! */;
    @Nullable
    private final okhttp3.c a;

    public a(@Nullable okhttp3.c c4) {
        this.a = c4;
    }

    private final d0 a(b object, d0 d02) throws IOException {
        if (object == null) {
            return d02;
        }
        Object object2 = object.body();
        e0 e02 = d02.d();
        y.g((Object)e02);
        object2 = new l0(e02.source(), (b)object, x.c((j0)object2)){
            private boolean c;
            final g d;
            final b e;
            final f f;
            {
                this.d = g4;
                this.e = b4;
                this.f = f4;
            }

            public void close() throws IOException {
                if (!this.c && !d.s((l0)this, (int)100, (TimeUnit)TimeUnit.MILLISECONDS)) {
                    this.c = true;
                    this.e.abort();
                }
                this.d.close();
            }

            public long read(@NotNull okio.e e4, long l4) throws IOException {
                block3: {
                    block4: {
                        y.j((Object)e4, (String)"sink");
                        try {
                            l4 = this.d.read(e4, l4);
                            if (l4 != -1L) break block3;
                            if (this.c) break block4;
                            this.c = true;
                        }
                        catch (IOException iOException) {
                            if (!this.c) {
                                this.c = true;
                                this.e.abort();
                            }
                            throw iOException;
                        }
                        this.f.close();
                    }
                    return -1L;
                }
                e4.q(this.f.getBuffer(), e4.size() - l4, l4);
                this.f.emitCompleteSegments();
                return l4;
            }

            @NotNull
            public m0 timeout() {
                return this.d.timeout();
            }
        };
        object = d0.w((d0)d02, (String)"Content-Type", null, (int)2, null);
        long l4 = d02.d().contentLength();
        return d02.L().b((e0)new h((String)object, l4, x.d((l0)object2))).c();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NotNull
    public d0 intercept(@NotNull w.a a4) throws IOException {
        e0 e02;
        okhttp3.c c4;
        d0 d02;
        b0 b02;
        void var3_7;
        okhttp3.internal.connection.e e4;
        e e5;
        block23: {
            block22: {
                y.j((Object)a4, (String)"chain");
                e5 = a4.call();
                okhttp3.c c5 = this.a;
                e4 = null;
                if (c5 != null) {
                    d0 d03 = c5.c(a4.request());
                } else {
                    Object var3_6 = null;
                }
                c c6 = new c.b(System.currentTimeMillis(), a4.request(), (d0)var3_7).b();
                b02 = c6.b();
                d02 = c6.a();
                c4 = this.a;
                if (c4 != null) {
                    c4.q(c6);
                }
                if (e5 instanceof okhttp3.internal.connection.e) {
                    e4 = (okhttp3.internal.connection.e)e5;
                }
                if (e4 == null) break block22;
                c4 = e4.l();
                e4 = c4;
                if (c4 != null) break block23;
            }
            e4 = r.b;
        }
        if (var3_7 != null && d02 == null && (c4 = var3_7.d()) != null) {
            d.m((Closeable)c4);
        }
        if (b02 == null && d02 == null) {
            a4 = new d0.a().r(a4.request()).p(a0.f).g(504).m("Unsatisfiable Request (only-if-cached)").b(d.c).s(-1L).q(System.currentTimeMillis()).c();
            e4.A(e5, (d0)a4);
            return a4;
        }
        if (b02 == null) {
            y.g((Object)d02);
            a4 = d02.L().d(okhttp3.internal.cache.a$a.b(b, (d0)d02)).c();
            e4.b(e5, (d0)a4);
            return a4;
        }
        if (d02 != null) {
            e4.a(e5, d02);
        } else if (this.a != null) {
            e4.c(e5);
        }
        try {
            a4 = a4.proceed(b02);
        }
        catch (Throwable throwable) {
            if (var3_7 == null) throw throwable;
            e4 = var3_7.d();
            if (e4 == null) throw throwable;
            d.m((Closeable)((Object)e4));
            throw throwable;
        }
        if (a4 == null && var3_7 != null && (e02 = var3_7.d()) != null) {
            d.m((Closeable)e02);
        }
        if (d02 != null) {
            if (a4 != null && a4.m() == 304) {
                c4 = d02.L();
                a a5 = b;
                d0 d04 = c4.k(okhttp3.internal.cache.a$a.a(a5, (u)d02.z(), (u)a4.z())).s(a4.W()).q(a4.U()).d(okhttp3.internal.cache.a$a.b(a5, (d0)d02)).n(okhttp3.internal.cache.a$a.b(a5, (d0)a4)).c();
                a4 = a4.d();
                y.g((Object)a4);
                a4.close();
                a4 = this.a;
                y.g((Object)a4);
                a4.p();
                this.a.r(d02, d04);
                e4.b(e5, d04);
                return d04;
            }
            e0 e03 = d02.d();
            if (e03 != null) {
                d.m((Closeable)e03);
            }
        }
        y.g((Object)a4);
        c4 = a4.L();
        a a6 = b;
        a4 = c4.d(okhttp3.internal.cache.a$a.b(a6, (d0)d02)).n(okhttp3.internal.cache.a$a.b(a6, (d0)a4)).c();
        if (this.a == null) return a4;
        if (okhttp3.internal.http.e.b((d0)a4) && c.c.a((d0)a4, b02)) {
            a4 = this.a(this.a.i((d0)a4), (d0)a4);
            if (d02 == null) return a4;
            e4.c(e5);
            return a4;
        }
        if (!okhttp3.internal.http.f.a.a(b02.h())) return a4;
        try {}
        catch (IOException iOException) {
            return a4;
        }
        this.a.k(b02);
        return a4;
    }
}


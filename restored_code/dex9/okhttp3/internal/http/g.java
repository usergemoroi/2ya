/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okhttp3.b0
 *  okhttp3.d0
 *  okhttp3.e
 *  okhttp3.internal.connection.c
 *  okhttp3.internal.d
 *  okhttp3.j
 *  okhttp3.w
 *  okhttp3.w$a
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.internal.connection.c;
import okhttp3.internal.d;
import okhttp3.j;
import okhttp3.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0019\u001a\u00020\u001f\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\b3\u00104JM\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\b\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\t\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\n\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\n\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0007\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0019\u001a\u00020\u001f8\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010(R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b.\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b)\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u0010R\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b0\u0010\u0010R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b1\u0010(\u00a8\u00065"}, d2={"Lokhttp3/internal/http/g;", "Lokhttp3/w$a;", "", "index", "Lokhttp3/internal/connection/c;", "exchange", "Lokhttp3/b0;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "a", "(ILokhttp3/internal/connection/c;Lokhttp3/b0;III)Lokhttp3/internal/http/g;", "Lokhttp3/j;", "connection", "()Lokhttp3/j;", "()I", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "withConnectTimeout", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/w$a;", "withReadTimeout", "withWriteTimeout", "Lokhttp3/e;", "call", "()Lokhttp3/e;", "()Lokhttp3/b0;", "Lokhttp3/d0;", "proceed", "(Lokhttp3/b0;)Lokhttp3/d0;", "Lokhttp3/internal/connection/e;", "Lokhttp3/internal/connection/e;", "c", "()Lokhttp3/internal/connection/e;", "", "Lokhttp3/w;", "b", "Ljava/util/List;", "interceptors", "I", "d", "Lokhttp3/internal/connection/c;", "e", "()Lokhttp3/internal/connection/c;", "Lokhttp3/b0;", "g", "f", "h", "i", "calls", "<init>", "(Lokhttp3/internal/connection/e;Ljava/util/List;ILokhttp3/internal/connection/c;Lokhttp3/b0;III)V", "okhttp"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nRealInterceptorChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealInterceptorChain.kt\nokhttp3/internal/http/RealInterceptorChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class g
implements w.a {
    @NotNull
    private final okhttp3.internal.connection.e a;
    @NotNull
    private final List<w> b;
    private final int c;
    @Nullable
    private final c d;
    @NotNull
    private final b0 e;
    private final int f;
    private final int g;
    private final int h;
    private int i;

    public g(@NotNull okhttp3.internal.connection.e e4, @NotNull List<? extends w> list, int n4, @Nullable c c4, @NotNull b0 b02, int n5, int n6, int n7) {
        y.j((Object)e4, (String)"call");
        y.j(list, (String)"interceptors");
        y.j((Object)b02, (String)"request");
        this.a = e4;
        this.b = list;
        this.c = n4;
        this.d = c4;
        this.e = b02;
        this.f = n5;
        this.g = n6;
        this.h = n7;
    }

    public static /* synthetic */ g b(g g4, int n4, c c4, b0 b02, int n5, int n6, int n7, int n8, Object object) {
        if ((n8 & 1) != 0) {
            n4 = g4.c;
        }
        if ((n8 & 2) != 0) {
            c4 = g4.d;
        }
        if ((n8 & 4) != 0) {
            b02 = g4.e;
        }
        if ((n8 & 8) != 0) {
            n5 = g4.f;
        }
        if ((n8 & 0x10) != 0) {
            n6 = g4.g;
        }
        if ((n8 & 0x20) != 0) {
            n7 = g4.h;
        }
        return g4.a(n4, c4, b02, n5, n6, n7);
    }

    @NotNull
    public final g a(int n4, @Nullable c c4, @NotNull b0 b02, int n5, int n6, int n7) {
        y.j((Object)b02, (String)"request");
        return new g(this.a, this.b, n4, c4, b02, n5, n6, n7);
    }

    @NotNull
    public final okhttp3.internal.connection.e c() {
        return this.a;
    }

    @NotNull
    public e call() {
        return this.a;
    }

    public int connectTimeoutMillis() {
        return this.f;
    }

    @Nullable
    public j connection() {
        Object object = this.d;
        object = object != null ? object.h() : null;
        return object;
    }

    public final int d() {
        return this.f;
    }

    @Nullable
    public final c e() {
        return this.d;
    }

    public final int f() {
        return this.g;
    }

    @NotNull
    public final b0 g() {
        return this.e;
    }

    public final int h() {
        return this.h;
    }

    @NotNull
    public d0 proceed(@NotNull b0 object) throws IOException {
        y.j((Object)object, (String)"request");
        if (this.c < this.b.size()) {
            ++this.i;
            Object object2 = this.d;
            if (object2 != null) {
                if (object2.j().g(object.k())) {
                    if (this.i != 1) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("network interceptor ");
                        ((StringBuilder)object).append(this.b.get(this.c - 1));
                        ((StringBuilder)object).append(" must call proceed() exactly once");
                        throw new IllegalStateException(((StringBuilder)object).toString().toString());
                    }
                } else {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("network interceptor ");
                    ((StringBuilder)object).append(this.b.get(this.c - 1));
                    ((StringBuilder)object).append(" must retain the same host and port");
                    throw new IllegalStateException(((StringBuilder)object).toString().toString());
                }
            }
            g g4 = okhttp3.internal.http.g.b(this, this.c + 1, null, (b0)object, 0, 0, 0, 58, null);
            object = this.b.get(this.c);
            object2 = object.intercept((w.a)g4);
            if (object2 != null) {
                if (this.d != null && this.c + 1 < this.b.size() && g4.i != 1) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("network interceptor ");
                    ((StringBuilder)object2).append(object);
                    ((StringBuilder)object2).append(" must call proceed() exactly once");
                    throw new IllegalStateException(((StringBuilder)object2).toString().toString());
                }
                if (object2.d() != null) {
                    return object2;
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("interceptor ");
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(" returned a response with no body");
                throw new IllegalStateException(((StringBuilder)object2).toString().toString());
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("interceptor ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(" returned null");
            throw new NullPointerException(((StringBuilder)object2).toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public int readTimeoutMillis() {
        return this.g;
    }

    @NotNull
    public b0 request() {
        return this.e;
    }

    @NotNull
    public w.a withConnectTimeout(int n4, @NotNull TimeUnit timeUnit) {
        y.j((Object)((Object)timeUnit), (String)"unit");
        if (this.d == null) {
            return okhttp3.internal.http.g.b(this, 0, null, null, okhttp3.internal.d.k((String)"connectTimeout", (long)n4, (TimeUnit)timeUnit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @NotNull
    public w.a withReadTimeout(int n4, @NotNull TimeUnit timeUnit) {
        y.j((Object)((Object)timeUnit), (String)"unit");
        if (this.d == null) {
            return okhttp3.internal.http.g.b(this, 0, null, null, 0, okhttp3.internal.d.k((String)"readTimeout", (long)n4, (TimeUnit)timeUnit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @NotNull
    public w.a withWriteTimeout(int n4, @NotNull TimeUnit timeUnit) {
        y.j((Object)((Object)timeUnit), (String)"unit");
        if (this.d == null) {
            return okhttp3.internal.http.g.b(this, 0, null, null, 0, 0, okhttp3.internal.d.k((String)"writeTimeout", (long)n4, (TimeUnit)timeUnit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    public int writeTimeoutMillis() {
        return this.h;
    }
}


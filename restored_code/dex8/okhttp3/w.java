/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2={"Lokhttp3/w;", "", "Lokhttp3/w$a;", "chain", "Lokhttp3/d0;", "intercept", "(Lokhttp3/w$a;)Lokhttp3/d0;", "a", "okhttp"}, k=1, mv={1, 8, 0})
public interface w {
    @NotNull
    public d0 intercept(@NotNull a var1) throws IOException;

    @Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH&\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H&\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH&\u00a2\u0006\u0004\b\u0016\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H&\u00a2\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u000eH&\u00a2\u0006\u0004\b\u0018\u0010\u0010J\u001f\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H&\u00a2\u0006\u0004\b\u0019\u0010\u0015\u00a8\u0006\u001a"}, d2={"Lokhttp3/w$a;", "", "Lokhttp3/b0;", "request", "()Lokhttp3/b0;", "Lokhttp3/d0;", "proceed", "(Lokhttp3/b0;)Lokhttp3/d0;", "Lokhttp3/j;", "connection", "()Lokhttp3/j;", "Lokhttp3/e;", "call", "()Lokhttp3/e;", "", "connectTimeoutMillis", "()I", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "withConnectTimeout", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/w$a;", "readTimeoutMillis", "withReadTimeout", "writeTimeoutMillis", "withWriteTimeout", "okhttp"}, k=1, mv={1, 8, 0})
    public static interface a {
        @NotNull
        public e call();

        public int connectTimeoutMillis();

        @Nullable
        public j connection();

        @NotNull
        public d0 proceed(@NotNull b0 var1) throws IOException;

        public int readTimeoutMillis();

        @NotNull
        public b0 request();

        @NotNull
        public a withConnectTimeout(int var1, @NotNull TimeUnit var2);

        @NotNull
        public a withReadTimeout(int var1, @NotNull TimeUnit var2);

        @NotNull
        public a withWriteTimeout(int var1, @NotNull TimeUnit var2);

        public int writeTimeoutMillis();
    }
}


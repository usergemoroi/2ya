/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  okhttp3.d0
 *  okhttp3.w
 *  okhttp3.w$a
 *  org.jetbrains.annotations.NotNull
 */
package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import okhttp3.d0;
import okhttp3.internal.http.g;
import okhttp3.w;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2={"Lokhttp3/internal/connection/a;", "Lokhttp3/w;", "Lokhttp3/w$a;", "chain", "Lokhttp3/d0;", "intercept", "(Lokhttp3/w$a;)Lokhttp3/d0;", "<init>", "()V", "okhttp"}, k=1, mv={1, 8, 0})
public final class a
implements w {
    @NotNull
    public static final a a = new a();

    private a() {
    }

    @NotNull
    public d0 intercept(@NotNull w.a a4) throws IOException {
        y.j((Object)a4, (String)"chain");
        a4 = (g)a4;
        return g.b((g)a4, 0, a4.c().q((g)a4), null, 0, 0, 0, 61, null).proceed(a4.g());
    }
}


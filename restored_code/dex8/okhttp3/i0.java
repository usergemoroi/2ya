/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.internal.y;
import okhttp3.d0;
import okhttp3.h0;
import okio.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u000b\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0014J)\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001c"}, d2={"Lokhttp3/i0;", "", "Lokhttp3/h0;", "webSocket", "Lokhttp3/d0;", "response", "Lkotlin/k0;", "onOpen", "(Lokhttp3/h0;Lokhttp3/d0;)V", "", "text", "onMessage", "(Lokhttp3/h0;Ljava/lang/String;)V", "Lokio/h;", "bytes", "(Lokhttp3/h0;Lokio/h;)V", "", "code", "reason", "onClosing", "(Lokhttp3/h0;ILjava/lang/String;)V", "onClosed", "", "t", "onFailure", "(Lokhttp3/h0;Ljava/lang/Throwable;Lokhttp3/d0;)V", "<init>", "()V", "okhttp"}, k=1, mv={1, 8, 0})
public abstract class i0 {
    public void onClosed(@NotNull h0 h03, int n10, @NotNull String string2) {
        y.j(h03, "webSocket");
        y.j(string2, "reason");
    }

    public void onClosing(@NotNull h0 h03, int n10, @NotNull String string2) {
        y.j(h03, "webSocket");
        y.j(string2, "reason");
    }

    public void onFailure(@NotNull h0 h03, @NotNull Throwable throwable, @Nullable d0 d03) {
        y.j(h03, "webSocket");
        y.j(throwable, "t");
    }

    public void onMessage(@NotNull h0 h03, @NotNull String string2) {
        y.j(h03, "webSocket");
        y.j(string2, "text");
    }

    public void onMessage(@NotNull h0 h03, @NotNull h h14) {
        y.j(h03, "webSocket");
        y.j(h14, "bytes");
    }

    public void onOpen(@NotNull h0 h03, @NotNull d0 d03) {
        y.j(h03, "webSocket");
        y.j(d03, "response");
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  okhttp3.e0
 *  okhttp3.x
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.y;
import okhttp3.e0;
import okhttp3.x;
import okio.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2={"Lokhttp3/internal/http/h;", "Lokhttp3/e0;", "", "contentLength", "()J", "Lokhttp3/x;", "contentType", "()Lokhttp3/x;", "Lokio/g;", "source", "()Lokio/g;", "", "c", "Ljava/lang/String;", "contentTypeString", "d", "J", "e", "Lokio/g;", "<init>", "(Ljava/lang/String;JLokio/g;)V", "okhttp"}, k=1, mv={1, 8, 0})
public final class h
extends e0 {
    @Nullable
    private final String c;
    private final long d;
    @NotNull
    private final g e;

    public h(@Nullable String string, long l4, @NotNull g g4) {
        y.j((Object)g4, (String)"source");
        this.c = string;
        this.d = l4;
        this.e = g4;
    }

    public long contentLength() {
        return this.d;
    }

    @Nullable
    public x contentType() {
        String string = this.c;
        string = string != null ? x.e.b(string) : null;
        return string;
    }

    @NotNull
    public g source() {
        return this.e;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  okio.j0
 *  org.jetbrains.annotations.NotNull
 */
package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.y;
import kotlin.k0;
import okio.j0;
import okio.n;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u000b\u0010\nR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f8\u0006\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001b"}, d2={"Lokhttp3/internal/cache/e;", "Lokio/n;", "Lokio/e;", "source", "", "byteCount", "Lkotlin/k0;", "write", "(Lokio/e;J)V", "flush", "()V", "close", "Lkotlin/Function1;", "Ljava/io/IOException;", "f", "Lkotlin/jvm/functions/l;", "getOnException", "()Lkotlin/jvm/functions/l;", "onException", "", "g", "Z", "hasErrors", "Lokio/j0;", "delegate", "<init>", "(Lokio/j0;Lkotlin/jvm/functions/l;)V", "okhttp"}, k=1, mv={1, 8, 0})
public class e
extends n {
    @NotNull
    private final l<IOException, k0> f;
    private boolean g;

    public e(@NotNull j0 j02, @NotNull l<? super IOException, k0> l4) {
        y.j((Object)j02, (String)"delegate");
        y.j(l4, (String)"onException");
        super(j02);
        this.f = l4;
    }

    @Override
    public void close() {
        if (this.g) {
            return;
        }
        try {
            super.close();
        }
        catch (IOException iOException) {
            this.g = true;
            this.f.invoke(iOException);
        }
    }

    @Override
    public void flush() {
        if (this.g) {
            return;
        }
        try {
            super.flush();
        }
        catch (IOException iOException) {
            this.g = true;
            this.f.invoke(iOException);
        }
    }

    @Override
    public void write(@NotNull okio.e e4, long l4) {
        y.j((Object)e4, (String)"source");
        if (this.g) {
            e4.skip(l4);
            return;
        }
        try {
            super.write(e4, l4);
        }
        catch (IOException iOException) {
            this.g = true;
            this.f.invoke(iOException);
        }
    }
}


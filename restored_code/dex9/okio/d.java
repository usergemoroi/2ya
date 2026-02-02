/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  okio.j0
 *  okio.m0
 *  org.jetbrains.annotations.NotNull
 */
package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.y;
import okio.e;
import okio.j0;
import okio.m0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u000f\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u000e\u0010\n\u00a8\u0006\u0010"}, d2={"Lokio/d;", "Lokio/j0;", "Lokio/e;", "source", "", "byteCount", "Lkotlin/k0;", "write", "(Lokio/e;J)V", "flush", "()V", "Lokio/m0;", "timeout", "()Lokio/m0;", "close", "<init>", "okio"}, k=1, mv={1, 9, 0})
final class d
implements j0 {
    public void close() {
    }

    public void flush() {
    }

    @NotNull
    public m0 timeout() {
        return m0.NONE;
    }

    public void write(@NotNull e e4, long l4) {
        y.j((Object)e4, (String)"source");
        e4.skip(l4);
    }
}


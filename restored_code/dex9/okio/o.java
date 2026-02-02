/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.ReplaceWith
 *  kotlin.e
 *  kotlin.jvm.JvmName
 *  kotlin.jvm.internal.y
 *  okio.l0
 *  okio.m0
 *  org.jetbrains.annotations.NotNull
 */
package okio;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.y;
import okio.e;
import okio.l0;
import okio.m0;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00018\u0007\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0012\u00a8\u0006\u0017"}, d2={"Lokio/o;", "Lokio/l0;", "Lokio/e;", "sink", "", "byteCount", "read", "(Lokio/e;J)J", "Lokio/m0;", "timeout", "()Lokio/m0;", "Lkotlin/k0;", "close", "()V", "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()Lokio/l0;", "delegate", "Lokio/l0;", "<init>", "(Lokio/l0;)V", "okio"}, k=1, mv={1, 9, 0})
public abstract class o
implements l0 {
    @NotNull
    private final l0 delegate;

    public o(@NotNull l0 l02) {
        y.j((Object)l02, (String)"delegate");
        this.delegate = l02;
    }

    @Deprecated(level=kotlin.e.d, message="moved to val", replaceWith=@ReplaceWith(expression="delegate", imports={}))
    @JvmName(name="-deprecated_delegate")
    @NotNull
    public final l0 -deprecated_delegate() {
        return this.delegate;
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    @JvmName(name="delegate")
    @NotNull
    public final l0 delegate() {
        return this.delegate;
    }

    public long read(@NotNull e e4, long l4) throws IOException {
        y.j((Object)e4, (String)"sink");
        return this.delegate.read(e4, l4);
    }

    @NotNull
    public m0 timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append('(');
        stringBuilder.append(this.delegate);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}


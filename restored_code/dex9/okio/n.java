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
 *  okio.j0
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
import okio.j0;
import okio.m0;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00018\u0007\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0013\u00a8\u0006\u0018"}, d2={"Lokio/n;", "Lokio/j0;", "Lokio/e;", "source", "", "byteCount", "Lkotlin/k0;", "write", "(Lokio/e;J)V", "flush", "()V", "Lokio/m0;", "timeout", "()Lokio/m0;", "close", "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()Lokio/j0;", "delegate", "Lokio/j0;", "<init>", "(Lokio/j0;)V", "okio"}, k=1, mv={1, 9, 0})
public abstract class n
implements j0 {
    @NotNull
    private final j0 delegate;

    public n(@NotNull j0 j02) {
        y.j((Object)j02, (String)"delegate");
        this.delegate = j02;
    }

    @Deprecated(level=kotlin.e.d, message="moved to val", replaceWith=@ReplaceWith(expression="delegate", imports={}))
    @JvmName(name="-deprecated_delegate")
    @NotNull
    public final j0 -deprecated_delegate() {
        return this.delegate;
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    @JvmName(name="delegate")
    @NotNull
    public final j0 delegate() {
        return this.delegate;
    }

    public void flush() throws IOException {
        this.delegate.flush();
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

    public void write(@NotNull e e4, long l4) throws IOException {
        y.j((Object)e4, (String)"source");
        this.delegate.write(e4, l4);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmName
 *  kotlin.jvm.internal.y
 *  okio.m0
 *  org.jetbrains.annotations.NotNull
 */
package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.y;
import okio.m0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0001H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0001H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001c"}, d2={"Lokio/p;", "Lokio/m0;", "delegate", "c", "(Lokio/m0;)Lokio/p;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Lokio/m0;", "timeoutNanos", "()J", "", "hasDeadline", "()Z", "deadlineNanoTime", "(J)Lokio/m0;", "clearTimeout", "()Lokio/m0;", "clearDeadline", "Lkotlin/k0;", "throwIfReached", "()V", "b", "Lokio/m0;", "setDelegate", "(Lokio/m0;)V", "<init>", "okio"}, k=1, mv={1, 9, 0})
public class p
extends m0 {
    @NotNull
    private m0 b;

    public p(@NotNull m0 m02) {
        y.j((Object)m02, (String)"delegate");
        this.b = m02;
    }

    @JvmName(name="delegate")
    @NotNull
    public final m0 b() {
        return this.b;
    }

    @NotNull
    public final p c(@NotNull m0 m02) {
        y.j((Object)m02, (String)"delegate");
        this.b = m02;
        return this;
    }

    @NotNull
    public m0 clearDeadline() {
        return this.b.clearDeadline();
    }

    @NotNull
    public m0 clearTimeout() {
        return this.b.clearTimeout();
    }

    public long deadlineNanoTime() {
        return this.b.deadlineNanoTime();
    }

    @NotNull
    public m0 deadlineNanoTime(long l4) {
        return this.b.deadlineNanoTime(l4);
    }

    public boolean hasDeadline() {
        return this.b.hasDeadline();
    }

    public void throwIfReached() throws IOException {
        this.b.throwIfReached();
    }

    @NotNull
    public m0 timeout(long l4, @NotNull TimeUnit timeUnit) {
        y.j((Object)((Object)timeUnit), (String)"unit");
        return this.b.timeout(l4, timeUnit);
    }

    public long timeoutNanos() {
        return this.b.timeoutNanos();
    }
}


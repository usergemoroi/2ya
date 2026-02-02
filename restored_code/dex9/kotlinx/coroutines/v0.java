/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlinx.coroutines.c
 *  kotlinx.coroutines.c3
 *  kotlinx.coroutines.i1
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.ranges.j;
import kotlinx.coroutines.c;
import kotlinx.coroutines.c3;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.n1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\b\u00c0\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002\u00a2\u0006\u0004\b2\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\r\u0010\u0006J\u001b\u0010\u000f\u001a\u00020\u00042\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0014\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0006J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00112\n\u0010\u0019\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010&\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\f\n\u0004\b&\u0010'\u0012\u0004\b(\u0010\u0006R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010\fR\u0014\u0010/\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010\fR\u0014\u00101\u001a\u00020\u00078TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b0\u0010\t\u00a8\u00063"}, d2={"Lkotlinx/coroutines/v0;", "Lkotlinx/coroutines/n1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlin/k0;", "A0", "()V", "Ljava/lang/Thread;", "w0", "()Ljava/lang/Thread;", "", "z0", "()Z", "v0", "task", "h0", "(Ljava/lang/Runnable;)V", "", "now", "Lkotlinx/coroutines/n1$c;", "delayedTask", "c0", "(JLkotlinx/coroutines/n1$c;)V", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/i1;", "q", "(JLjava/lang/Runnable;Lkotlin/coroutines/g;)Lkotlinx/coroutines/i1;", "run", "", "toString", "()Ljava/lang/String;", "j", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "debugStatus", "I", "x0", "isShutDown", "y0", "isShutdownRequested", "b0", "thread", "<init>", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nDefaultExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultExecutor.kt\nkotlinx/coroutines/DefaultExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
public final class v0
extends n1
implements Runnable {
    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    @NotNull
    public static final v0 i;
    private static final long j;

    static {
        Object object = new v0();
        i = object;
        m1.V((m1)object, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            object = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        }
        catch (SecurityException securityException) {
            object = 1000L;
        }
        j = timeUnit.toNanos((Long)object);
    }

    private v0() {
    }

    private final void A0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    private final void v0() {
        synchronized (this) {
            block4: {
                boolean bl = this.y0();
                if (bl) break block4;
                return;
            }
            debugStatus = 3;
            this.p0();
            y.h((Object)this, (String)"null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
            return;
        }
    }

    private final Thread w0() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Thread thread;
                block4: {
                    try {
                        Thread thread2;
                        thread = thread2 = _thread;
                        if (thread2 != null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    _thread = thread = new Thread((Runnable)this, "kotlinx.coroutines.DefaultExecutor");
                    thread.setContextClassLoader(i.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
                return thread;
            }
            throw throwable2;
        }
    }

    private final boolean x0() {
        boolean bl = debugStatus == 4;
        return bl;
    }

    private final boolean y0() {
        int n4 = debugStatus;
        boolean bl = n4 == 2 || n4 == 3;
        return bl;
    }

    private final boolean z0() {
        synchronized (this) {
            block4: {
                boolean bl = this.y0();
                if (!bl) break block4;
                return false;
            }
            debugStatus = 1;
            y.h((Object)this, (String)"null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
            return true;
        }
    }

    @Override
    @NotNull
    protected Thread b0() {
        Thread thread;
        Thread thread2 = thread = _thread;
        if (thread == null) {
            thread2 = this.w0();
        }
        return thread2;
    }

    @Override
    protected void c0(long l4, @NotNull n1.c c4) {
        this.A0();
    }

    @Override
    public void h0(@NotNull Runnable runnable) {
        if (this.x0()) {
            this.A0();
        }
        super.h0(runnable);
    }

    @Override
    @NotNull
    public i1 q(long l4, @NotNull Runnable runnable, @NotNull g g4) {
        return this.s0(l4, runnable);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        block11: {
            c3.a.d((m1)this);
            c.a();
            try {
                var9_1 = this.z0();
                if (var9_1) break block11;
                v0._thread = null;
                this.v0();
            }
            catch (Throwable var10_6) {}
            c.a();
            if (!this.n0()) {
                this.b0();
            }
            return;
        }
        var3_2 = 0x7FFFFFFFFFFFFFFFL;
        while (true) {
            Thread.interrupted();
            var5_4 = this.Y();
            if (var5_4 != 0x7FFFFFFFFFFFFFFFL) ** GOTO lbl44
            c.a();
            var7_5 = System.nanoTime();
            var1_3 = var3_2;
            if (var3_2 != 0x7FFFFFFFFFFFFFFFL) ** break block12
            var1_3 = v0.j;
            var1_3 += var7_5;
            break;
        }
        {
            block13: {
                block14: {
                    if ((var3_2 = var1_3 - var7_5) <= 0L) {
                        v0._thread = null;
                        this.v0();
                        c.a();
                        if (!this.n0()) {
                            this.b0();
                        }
                        return;
                    }
                    var5_4 = kotlin.ranges.j.j(var5_4, var3_2);
                    break block14;
lbl44:

                    var1_3 = 0x7FFFFFFFFFFFFFFFL;
                }
                var3_2 = var1_3;
                if (var5_4 <= 0L) continue;
                var9_1 = this.y0();
                if (!var9_1) break block13;
                v0._thread = null;
                this.v0();
                c.a();
                if (!this.n0()) {
                    this.b0();
                }
                return;
            }
            c.a();
            LockSupport.parkNanos(this, var5_4);
            var3_2 = var1_3;
            continue;
        }
        v0._thread = null;
        this.v0();
        c.a();
        if (!this.n0()) {
            this.b0();
        }
        throw var10_6;
    }

    @Override
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override
    @NotNull
    public String toString() {
        return "DefaultExecutor";
    }
}


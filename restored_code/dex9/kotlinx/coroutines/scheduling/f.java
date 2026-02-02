/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlinx.coroutines.scheduling.a
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlinx.coroutines.scheduling.a;
import kotlinx.coroutines.t1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010 \u001a\u00020\u001d\u00a2\u0006\u0004\b(\u0010)J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016\u00a2\u0006\u0004\b\r\u0010\fJ/\u0010\u0011\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\n\u0010\u0006\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&\u00a8\u0006*"}, d2={"Lkotlinx/coroutines/scheduling/f;", "Lkotlinx/coroutines/t1;", "Lkotlinx/coroutines/scheduling/a;", "L", "()Lkotlinx/coroutines/scheduling/a;", "Lkotlin/coroutines/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/k0;", "dispatch", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "dispatchYield", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "tailDispatch", "M", "(Ljava/lang/Runnable;ZZ)V", "", "d", "I", "corePoolSize", "e", "maxPoolSize", "", "f", "J", "idleWorkerKeepAliveNs", "", "g", "Ljava/lang/String;", "schedulerName", "h", "Lkotlinx/coroutines/scheduling/a;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "H", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public class f
extends t1 {
    private final int d;
    private final int e;
    private final long f;
    @NotNull
    private final String g;
    @NotNull
    private a h;

    public f(int n4, int n5, long l4, @NotNull String string) {
        this.d = n4;
        this.e = n5;
        this.f = l4;
        this.g = string;
        this.h = this.L();
    }

    private final a L() {
        return new a(this.d, this.e, this.f, this.g);
    }

    @Override
    @NotNull
    public Executor H() {
        return this.h;
    }

    public final void M(@NotNull Runnable runnable, boolean bl, boolean bl2) {
        this.h.l(runnable, bl, bl2);
    }

    @Override
    public void dispatch(@NotNull g g4, @NotNull Runnable runnable) {
        a.m((a)this.h, (Runnable)runnable, (boolean)false, (boolean)false, (int)6, null);
    }

    @Override
    public void dispatchYield(@NotNull g g4, @NotNull Runnable runnable) {
        a.m((a)this.h, (Runnable)runnable, (boolean)false, (boolean)true, (int)2, null);
    }
}


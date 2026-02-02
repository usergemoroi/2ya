/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.k0
 *  kotlinx.coroutines.c
 *  kotlinx.coroutines.g1
 *  kotlinx.coroutines.g2
 *  kotlinx.coroutines.i1
 *  kotlinx.coroutines.r
 *  kotlinx.coroutines.r1
 *  kotlinx.coroutines.v2
 *  kotlinx.coroutines.z0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.k0;
import kotlinx.coroutines.c;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.h1;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.l;
import kotlinx.coroutines.m;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.n;
import kotlinx.coroutines.r;
import kotlinx.coroutines.r1;
import kotlinx.coroutines.t1;
import kotlinx.coroutines.v0;
import kotlinx.coroutines.v2;
import kotlinx.coroutines.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010.\u001a\u00020)\u00a2\u0006\u0004\b/\u00100J5\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u00032\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002\u00a2\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016\u00a2\u0006\u0004\b'\u0010(R\u001a\u0010.\u001a\u00020)8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\u00a8\u00061"}, d2={"Lkotlinx/coroutines/u1;", "Lkotlinx/coroutines/t1;", "Lkotlinx/coroutines/z0;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/g;", "context", "", "timeMillis", "Ljava/util/concurrent/ScheduledFuture;", "M", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lkotlin/coroutines/g;J)Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "Lkotlin/k0;", "L", "(Lkotlin/coroutines/g;Ljava/util/concurrent/RejectedExecutionException;)V", "dispatch", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "Lkotlinx/coroutines/n;", "continuation", "p", "(JLkotlinx/coroutines/n;)V", "Lkotlinx/coroutines/i1;", "q", "(JLjava/lang/Runnable;Lkotlin/coroutines/g;)Lkotlinx/coroutines/i1;", "close", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/concurrent/Executor;", "d", "Ljava/util/concurrent/Executor;", "H", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public final class u1
extends t1
implements z0 {
    @NotNull
    private final Executor d;

    public u1(@NotNull Executor executor) {
        this.d = executor;
        if (this.H() instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor)this.H()).setRemoveOnCancelPolicy(true);
        }
    }

    private final void L(g g4, RejectedExecutionException rejectedExecutionException) {
        g2.c((g)g4, (CancellationException)r1.a((String)"The task was rejected", (Throwable)rejectedExecutionException));
    }

    private final ScheduledFuture<?> M(ScheduledExecutorService object, Runnable runnable, g g4, long l4) {
        try {
            object = object.schedule(runnable, l4, TimeUnit.MILLISECONDS);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            this.L(g4, rejectedExecutionException);
            object = null;
        }
        return object;
    }

    @Override
    @NotNull
    public Executor H() {
        return this.d;
    }

    @Override
    public void close() {
        Executor executor = this.H();
        executor = executor instanceof ExecutorService ? (ExecutorService)executor : null;
        if (executor != null) {
            executor.shutdown();
        }
    }

    @Override
    public void dispatch(@NotNull g g4, @NotNull Runnable runnable) {
        try {
            Executor executor = this.H();
            kotlinx.coroutines.c.a();
            executor.execute(runnable);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            kotlinx.coroutines.c.a();
            this.L(g4, rejectedExecutionException);
            g1.b().dispatch(g4, runnable);
        }
    }

    public boolean equals(@Nullable Object object) {
        boolean bl = object instanceof u1 && ((u1)object).H() == this.H();
        return bl;
    }

    public int hashCode() {
        return System.identityHashCode(this.H());
    }

    public void p(long l4, @NotNull n<? super k0> n4) {
        Executor executor = this.H();
        boolean bl = executor instanceof ScheduledExecutorService;
        ScheduledFuture<?> scheduledFuture = null;
        executor = bl ? (ScheduledExecutorService)executor : null;
        if (executor != null) {
            scheduledFuture = this.M((ScheduledExecutorService)executor, (Runnable)new v2((m0)this, n4), n4.getContext(), l4);
        }
        if (scheduledFuture != null) {
            r.c(n4, (m)new l(scheduledFuture));
            return;
        }
        v0.i.p(l4, n4);
    }

    @NotNull
    public i1 q(long l4, @NotNull Runnable object, @NotNull g g4) {
        Executor executor = this.H();
        boolean bl = executor instanceof ScheduledExecutorService;
        ScheduledFuture<?> scheduledFuture = null;
        executor = bl ? (ScheduledExecutorService)executor : null;
        if (executor != null) {
            scheduledFuture = this.M((ScheduledExecutorService)executor, (Runnable)object, g4, l4);
        }
        object = scheduledFuture != null ? new h1(scheduledFuture) : v0.i.q(l4, (Runnable)object, g4);
        return object;
    }

    @Override
    @NotNull
    public String toString() {
        return this.H().toString();
    }
}


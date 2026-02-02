/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlinx.coroutines.InternalCoroutinesApi
 *  kotlinx.coroutines.internal.e0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.ranges.j;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.e0;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.scheduling.k;
import kotlinx.coroutines.t1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u00c0\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002\u00a2\u0006\u0004\b \u0010\u0017J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0017\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006!"}, d2={"Lkotlinx/coroutines/scheduling/b;", "Lkotlinx/coroutines/t1;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Lkotlin/k0;", "execute", "(Ljava/lang/Runnable;)V", "", "parallelism", "", "name", "Lkotlinx/coroutines/m0;", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/Runnable;", "block", "dispatch", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "dispatchYield", "close", "()V", "toString", "()Ljava/lang/String;", "e", "Lkotlinx/coroutines/m0;", "default", "H", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public final class b
extends t1
implements Executor {
    @NotNull
    public static final b d = new b();
    @NotNull
    private static final m0 e = m0.limitedParallelism$default(k.c, e0.g((String)"kotlinx.coroutines.io.parallelism", (int)j.e(64, e0.a()), (int)0, (int)0, (int)12, null), null, 2, null);

    private b() {
    }

    @Override
    @NotNull
    public Executor H() {
        return this;
    }

    @Override
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override
    public void dispatch(@NotNull g g4, @NotNull Runnable runnable) {
        e.dispatch(g4, runnable);
    }

    @Override
    @InternalCoroutinesApi
    public void dispatchYield(@NotNull g g4, @NotNull Runnable runnable) {
        e.dispatchYield(g4, runnable);
    }

    @Override
    public void execute(@NotNull Runnable runnable) {
        this.dispatch(h.c, runnable);
    }

    @Override
    @NotNull
    public m0 limitedParallelism(int n4, @Nullable String string) {
        return k.c.limitedParallelism(n4, string);
    }

    @Override
    @NotNull
    public String toString() {
        return "Dispatchers.IO";
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.k0
 *  kotlinx.coroutines.InternalCoroutinesApi
 *  kotlinx.coroutines.i1
 *  kotlinx.coroutines.w0
 *  kotlinx.coroutines.z0
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.k0;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.n;
import kotlinx.coroutines.w0;
import kotlinx.coroutines.z0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010 \u001a\u00020\u0001\u0012\u0006\u0010#\u001a\u00020\u0018\u00a2\u0006\u0004\b$\u0010%J&\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096\u0001\u00a2\u0006\u0004\b\b\u0010\tJ,\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0017\u00a2\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0003H\u0097A\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\"\u00a8\u0006&"}, d2={"Lkotlinx/coroutines/internal/v;", "Lkotlinx/coroutines/m0;", "Lkotlinx/coroutines/z0;", "", "timeMillis", "Lkotlinx/coroutines/n;", "Lkotlin/k0;", "continuation", "p", "(JLkotlinx/coroutines/n;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/i1;", "q", "(JLjava/lang/Runnable;Lkotlin/coroutines/g;)Lkotlinx/coroutines/i1;", "", "isDispatchNeeded", "(Lkotlin/coroutines/g;)Z", "dispatch", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "dispatchYield", "", "toString", "()Ljava/lang/String;", "time", "delay", "(J)V", "d", "Lkotlinx/coroutines/m0;", "dispatcher", "e", "Ljava/lang/String;", "name", "<init>", "(Lkotlinx/coroutines/m0;Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public final class v
extends m0
implements z0 {
    private final z0 c;
    @NotNull
    private final m0 d;
    @NotNull
    private final String e;

    public v(@NotNull m0 m02, @NotNull String string) {
        z0 z02 = m02 instanceof z0 ? (z0)m02 : null;
        z0 z03 = z02;
        if (z02 == null) {
            z03 = w0.a();
        }
        this.c = z03;
        this.d = m02;
        this.e = string;
    }

    @Override
    public void dispatch(@NotNull g g4, @NotNull Runnable runnable) {
        this.d.dispatch(g4, runnable);
    }

    @Override
    @InternalCoroutinesApi
    public void dispatchYield(@NotNull g g4, @NotNull Runnable runnable) {
        this.d.dispatchYield(g4, runnable);
    }

    @Override
    public boolean isDispatchNeeded(@NotNull g g4) {
        return this.d.isDispatchNeeded(g4);
    }

    public void p(long l4, @NotNull n<? super k0> n4) {
        this.c.p(l4, n4);
    }

    @NotNull
    public i1 q(long l4, @NotNull Runnable runnable, @NotNull g g4) {
        return this.c.q(l4, runnable, g4);
    }

    @Override
    @NotNull
    public String toString() {
        return this.e;
    }
}


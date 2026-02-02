/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlinx.coroutines.InternalCoroutinesApi
 *  kotlinx.coroutines.internal.l
 *  kotlinx.coroutines.scheduling.j
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.scheduling.c;
import kotlinx.coroutines.scheduling.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u00c2\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0017\u00a2\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016\u00a2\u0006\u0004\b\n\u0010\tJ!\u0010\u000f\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2={"Lkotlinx/coroutines/scheduling/k;", "Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/k0;", "dispatchYield", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "dispatch", "", "parallelism", "", "name", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/m0;", "toString", "()Ljava/lang/String;", "<init>", "()V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class k
extends m0 {
    @NotNull
    public static final k c = new k();

    private k() {
    }

    @Override
    public void dispatch(@NotNull g g4, @NotNull Runnable runnable) {
        kotlinx.coroutines.scheduling.c.i.M(runnable, true, false);
    }

    @Override
    @InternalCoroutinesApi
    public void dispatchYield(@NotNull g g4, @NotNull Runnable runnable) {
        kotlinx.coroutines.scheduling.c.i.M(runnable, true, true);
    }

    @Override
    @NotNull
    public m0 limitedParallelism(int n4, @Nullable String string) {
        l.a((int)n4);
        if (n4 >= j.d) {
            return l.b((m0)this, (String)string);
        }
        return super.limitedParallelism(n4, string);
    }

    @Override
    @NotNull
    public String toString() {
        return "Dispatchers.IO";
    }
}


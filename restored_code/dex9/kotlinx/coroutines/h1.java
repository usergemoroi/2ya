/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlinx.coroutines.i1
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlinx.coroutines.i1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2={"Lkotlinx/coroutines/h1;", "Lkotlinx/coroutines/i1;", "Lkotlin/k0;", "dispose", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/util/concurrent/Future;", "c", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class h1
implements i1 {
    @NotNull
    private final Future<?> c;

    public h1(@NotNull Future<?> future) {
        this.c = future;
    }

    public void dispose() {
        this.c.cancel(false);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DisposableFutureHandle[");
        stringBuilder.append(this.c);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}


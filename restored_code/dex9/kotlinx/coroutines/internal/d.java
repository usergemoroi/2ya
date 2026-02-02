/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlinx.coroutines.q0
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2={"Lkotlinx/coroutines/internal/d;", "Lkotlinx/coroutines/q0;", "", "toString", "()Ljava/lang/String;", "Lkotlin/coroutines/g;", "c", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "context", "<init>", "(Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public final class d
implements q0 {
    @NotNull
    private final g c;

    public d(@NotNull g g4) {
        this.c = g4;
    }

    @NotNull
    public g getCoroutineContext() {
        return this.c;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CoroutineScope(coroutineContext=");
        stringBuilder.append(this.getCoroutineContext());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlinx.coroutines.internal.l
 *  kotlinx.coroutines.scheduling.j
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.scheduling.f;
import kotlinx.coroutines.scheduling.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000bJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\f\u0010\r\u00a8\u0006\u000f"}, d2={"Lkotlinx/coroutines/scheduling/c;", "Lkotlinx/coroutines/scheduling/f;", "", "parallelism", "", "name", "Lkotlinx/coroutines/m0;", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/m0;", "Lkotlin/k0;", "close", "()V", "toString", "()Ljava/lang/String;", "<init>", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public final class c
extends f {
    @NotNull
    public static final c i = new c();

    private c() {
        super(j.c, j.d, j.e, j.a);
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override
    @NotNull
    public m0 limitedParallelism(int n4, @Nullable String string) {
        l.a((int)n4);
        if (n4 >= j.c) {
            return l.b((m0)this, (String)string);
        }
        return super.limitedParallelism(n4, string);
    }

    @Override
    @NotNull
    public String toString() {
        return "Dispatchers.Default";
    }
}


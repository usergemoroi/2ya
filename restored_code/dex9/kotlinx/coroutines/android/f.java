/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.p
 *  kotlinx.coroutines.i1
 *  kotlinx.coroutines.z0
 *  kotlinx.coroutines.z0$a
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines.android;

import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.z0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00008&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\b\u00a8\u0006\t"}, d2={"Lkotlinx/coroutines/android/f;", "Lkotlinx/coroutines/n2;", "Lkotlinx/coroutines/z0;", "M", "()Lkotlinx/coroutines/android/f;", "immediate", "<init>", "()V", "Lkotlinx/coroutines/android/e;", "kotlinx-coroutines-android"}, k=1, mv={2, 0, 0})
public abstract class f
extends n2
implements z0 {
    private f() {
    }

    public /* synthetic */ f(p p4) {
        this();
    }

    @NotNull
    public abstract f M();

    @NotNull
    public i1 q(long l4, @NotNull Runnable runnable, @NotNull g g4) {
        return z0.a.a((z0)this, (long)l4, (Runnable)runnable, (g)g4);
    }
}


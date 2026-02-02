/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlinx.coroutines.channels.a
 *  kotlinx.coroutines.flow.h
 *  kotlinx.coroutines.flow.i
 *  kotlinx.coroutines.flow.s0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.flow.c;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.internal.q;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.flow.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096A\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0016X\u0096\u0005R\u000b\u0010\u0019\u001a\u00028\u00008\u0016X\u0096\u0005\u00a8\u0006\u001d"}, d2={"Lkotlinx/coroutines/flow/e0;", "T", "Lkotlinx/coroutines/flow/q0;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/q;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/a;", "onBufferOverflow", "Lkotlinx/coroutines/flow/h;", "b", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)Lkotlinx/coroutines/flow/h;", "Lkotlinx/coroutines/flow/i;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/i;)Ljava/lang/Void;", "Lkotlinx/coroutines/d2;", "d", "Lkotlinx/coroutines/d2;", "job", "", "replayCache", "value", "flow", "<init>", "(Lkotlinx/coroutines/flow/q0;Lkotlinx/coroutines/d2;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class e0<T>
implements q0<T>,
c<T>,
q<T> {
    private final q0<T> c;
    @Nullable
    private final d2 d;

    public e0(@NotNull q0<? extends T> q02, @Nullable d2 d22) {
        this.c = q02;
        this.d = d22;
    }

    @Override
    @NotNull
    public List<T> a() {
        return this.c.a();
    }

    @Override
    @NotNull
    public h<T> b(@NotNull g g4, int n4, @NotNull a a4) {
        return s0.d((q0)this, (g)g4, (int)n4, (a)a4);
    }

    @Override
    @Nullable
    public Object collect(@NotNull i<? super T> i4, @NotNull d<?> d4) {
        return this.c.collect(i4, d4);
    }

    @Override
    public T getValue() {
        return this.c.getValue();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.a;
import kotlinx.coroutines.j2;
import kotlinx.coroutines.selects.f;
import kotlinx.coroutines.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0004\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096@\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2={"Lkotlinx/coroutines/y0;", "T", "Lkotlinx/coroutines/a;", "Lkotlinx/coroutines/x0;", "k", "()Ljava/lang/Object;", "l", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", "A", "()Lkotlinx/coroutines/selects/f;", "onAwait", "Lkotlin/coroutines/g;", "parentContext", "", "active", "<init>", "(Lkotlin/coroutines/g;Z)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
class y0<T>
extends a<T>
implements x0<T> {
    public y0(@NotNull g g4, boolean bl) {
        super(g4, true, bl);
    }

    static /* synthetic */ <T> Object c1(y0<T> object, d<? super T> d4) {
        object = ((j2)object).R(d4);
        b.f();
        return object;
    }

    @Override
    @NotNull
    public f<T> A() {
        f<?> f4 = this.i0();
        y.h(f4, (String)"null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return f4;
    }

    @Override
    public T k() {
        return (T)this.e0();
    }

    @Override
    @Nullable
    public Object l(@NotNull d<? super T> d4) {
        return y0.c1(this, d4);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.jvm.internal.y
 *  kotlinx.coroutines.c0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.j2;
import kotlinx.coroutines.selects.f;
import kotlinx.coroutines.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0004\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096@\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\t8PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001b"}, d2={"Lkotlinx/coroutines/y;", "T", "Lkotlinx/coroutines/j2;", "Lkotlinx/coroutines/x;", "k", "()Ljava/lang/Object;", "l", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "value", "", "g", "(Ljava/lang/Object;)Z", "", "exception", "a", "(Ljava/lang/Throwable;)Z", "j0", "()Z", "onCancelComplete", "Lkotlinx/coroutines/selects/f;", "A", "()Lkotlinx/coroutines/selects/f;", "onAwait", "Lkotlinx/coroutines/d2;", "parent", "<init>", "(Lkotlinx/coroutines/d2;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class y<T>
extends j2
implements x<T> {
    public y(@Nullable d2 d22) {
        super(true);
        this.s0(d22);
    }

    @Override
    @NotNull
    public f<T> A() {
        f<?> f4 = this.i0();
        kotlin.jvm.internal.y.h(f4, (String)"null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return f4;
    }

    @Override
    public boolean a(@NotNull Throwable throwable) {
        return this.y0(new c0(throwable, false, 2, null));
    }

    @Override
    public boolean g(T t3) {
        return this.y0(t3);
    }

    @Override
    public boolean j0() {
        return true;
    }

    @Override
    public T k() {
        return (T)this.e0();
    }

    @Override
    @Nullable
    public Object l(@NotNull d<? super T> object) {
        object = this.R((d<Object>)object);
        b.f();
        return object;
    }
}


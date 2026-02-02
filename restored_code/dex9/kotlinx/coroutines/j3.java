/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$b$a
 *  kotlin.coroutines.g$c
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.functions.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c2\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\b"}, d2={"Lkotlinx/coroutines/j3;", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "key", "<init>", "()V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class j3
implements g.b,
g.c<j3> {
    @NotNull
    public static final j3 c = new j3();

    private j3() {
    }

    @Override
    public <R> R fold(R r4, @NotNull p<? super R, ? super g.b, ? extends R> p4) {
        return (R)g.b.a.a((g.b)this, r4, p4);
    }

    @Override
    @Nullable
    public <E extends g.b> E get(@NotNull g.c<E> c4) {
        return (E)g.b.a.b((g.b)this, c4);
    }

    @Override
    @NotNull
    public g.c<?> getKey() {
        return this;
    }

    @Override
    @NotNull
    public g minusKey(@NotNull g.c<?> c4) {
        return g.b.a.c((g.b)this, c4);
    }

    @NotNull
    public g plus(@NotNull g g4) {
        return g.b.a.d((g.b)this, (g)g4);
    }
}


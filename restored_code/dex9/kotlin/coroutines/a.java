/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$b$a
 *  kotlin.coroutines.g$c
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.g;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u00a2\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2={"Lkotlin/coroutines/a;", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g$c;", "key", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "<init>", "(Lkotlin/coroutines/g$c;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SinceKotlin(version="1.3")
public abstract class a
implements g.b {
    @NotNull
    private final g.c<?> key;

    public a(@NotNull g.c<?> c4) {
        y.j(c4, (String)"key");
        this.key = c4;
    }

    @Override
    public <R> R fold(R r2, @NotNull p<? super R, ? super g.b, ? extends R> p4) {
        return (R)g.b.a.a((g.b)this, r2, p4);
    }

    @Override
    @Nullable
    public <E extends g.b> E get(@NotNull g.c<E> c4) {
        return (E)g.b.a.b((g.b)this, c4);
    }

    @Override
    @NotNull
    public g.c<?> getKey() {
        return this.key;
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


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.client.engine.j$a
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$b$a
 *  kotlin.coroutines.g$c
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.client.engine;

import io.ktor.client.engine.j;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2={"Lio/ktor/client/engine/j;", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g;", "c", "Lkotlin/coroutines/g;", "b", "()Lkotlin/coroutines/g;", "callContext", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "key", "<init>", "(Lkotlin/coroutines/g;)V", "d", "a", "ktor-client-core"}, k=1, mv={1, 8, 0})
public final class j
implements g.b {
    @NotNull
    public static final a d = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private final g c;

    public j(@NotNull g g4) {
        y.j((Object)g4, (String)"callContext");
        this.c = g4;
    }

    @NotNull
    public final g b() {
        return this.c;
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
        return d;
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


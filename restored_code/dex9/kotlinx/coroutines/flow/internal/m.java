/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$c
 *  kotlin.jvm.JvmField
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0004\u001a\u00020\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0096\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0096\u0003\u00a2\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2={"Lkotlinx/coroutines/flow/internal/m;", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/g$c;", "key", "minusKey", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;", "context", "plus", "(Lkotlin/coroutines/g;)Lkotlin/coroutines/g;", "", "d", "Ljava/lang/Throwable;", "e", "originalContext", "<init>", "(Ljava/lang/Throwable;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public final class m
implements g {
    private final g c;
    @JvmField
    @NotNull
    public final Throwable d;

    public m(@NotNull Throwable throwable, @NotNull g g4) {
        this.c = g4;
        this.d = throwable;
    }

    public <R> R fold(R r4, @NotNull p<? super R, ? super g.b, ? extends R> p4) {
        return (R)this.c.fold(r4, p4);
    }

    @Nullable
    public <E extends g.b> E get(@NotNull g.c<E> c4) {
        return (E)this.c.get(c4);
    }

    @NotNull
    public g minusKey(@NotNull g.c<?> c4) {
        return this.c.minusKey(c4);
    }

    @NotNull
    public g plus(@NotNull g g4) {
        return this.c.plus(g4);
    }
}


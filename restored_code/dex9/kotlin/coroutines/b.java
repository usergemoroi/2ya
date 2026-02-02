/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.ExperimentalStdlibApi
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.coroutines.g$c
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.coroutines;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.g;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B:\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012#\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00010\f\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000\u00a2\u0006\u0004\b\n\u0010\u000bR1\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00010\f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0018"}, d2={"Lkotlin/coroutines/b;", "Lkotlin/coroutines/g$b;", "B", "E", "Lkotlin/coroutines/g$c;", "element", "b", "(Lkotlin/coroutines/g$b;)Lkotlin/coroutines/g$b;", "key", "", "a", "(Lkotlin/coroutines/g$c;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "c", "Lkotlin/jvm/functions/l;", "safeCast", "d", "Lkotlin/coroutines/g$c;", "topmostKey", "baseKey", "<init>", "(Lkotlin/coroutines/g$c;Lkotlin/jvm/functions/l;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@ExperimentalStdlibApi
@SinceKotlin(version="1.3")
public abstract class b<B extends g.b, E extends B>
implements g.c<E> {
    @NotNull
    private final l<g.b, E> c;
    @NotNull
    private final g.c<?> d;

    public b(@NotNull g.c<B> c4, @NotNull l<? super g.b, ? extends E> l4) {
        y.j(c4, (String)"baseKey");
        y.j(l4, (String)"safeCast");
        this.c = l4;
        l4 = c4;
        if (c4 instanceof b) {
            l4 = ((b)c4).d;
        }
        this.d = l4;
    }

    public final boolean a(@NotNull g.c<?> c4) {
        y.j(c4, (String)"key");
        boolean bl = c4 == this || this.d == c4;
        return bl;
    }

    @Nullable
    public final E b(@NotNull g.b b4) {
        y.j((Object)b4, (String)"element");
        return (E)((g.b)this.c.invoke(b4));
    }
}


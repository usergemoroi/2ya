/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$c
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.sequences.i
 *  kotlinx.coroutines.InternalCoroutinesApi
 *  kotlinx.coroutines.i1
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.utils.io;

import io.ktor.utils.io.c;
import io.ktor.utils.io.t;
import io.ktor.utils.io.v;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.sequences.i;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.u;
import kotlinx.coroutines.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010:\u001a\u00020\u0003\u0012\u0006\u0010@\u001a\u00020;\u00a2\u0006\u0004\bN\u0010OJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001\u00a2\u0006\u0004\b\u0007\u0010\bJ\"\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0096\u0001\u00a2\u0006\u0004\b\r\u0010\u000eJ8\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0016*\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0003\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u001b\u001a\u00060\tj\u0002`\nH\u0097\u0001\u00a2\u0006\u0004\b\u001b\u0010\u001cJM\u0010'\u001a\u00020&2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2'\u0010%\u001a#\u0012\u0015\u0012\u0013\u0018\u00010!\u00a2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0 j\u0002`$H\u0097\u0001\u00a2\u0006\u0004\b'\u0010(J9\u0010)\u001a\u00020&2'\u0010%\u001a#\u0012\u0015\u0012\u0013\u0018\u00010!\u00a2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0 j\u0002`$H\u0096\u0001\u00a2\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\u00020\fH\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0004\b+\u0010,J\u001c\u0010.\u001a\u00020-2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0096\u0001\u00a2\u0006\u0004\b.\u0010/J\u0018\u00101\u001a\u00020-2\u0006\u00100\u001a\u00020-H\u0096\u0003\u00a2\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u001dH\u0096\u0001\u00a2\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016\u00a2\u0006\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010@\u001a\u00020;8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030A8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b<\u0010BR\u0014\u0010D\u001a\u00020\u001d8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bD\u00104R\u0014\u0010E\u001a\u00020\u001d8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bE\u00104R\u0014\u0010G\u001a\u00020\u001d8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bF\u00104R\u0018\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00178\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020J8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bK\u0010L\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006P"}, d2={"Lio/ktor/utils/io/l;", "Lio/ktor/utils/io/t;", "Lio/ktor/utils/io/v;", "Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/w;", "child", "Lkotlinx/coroutines/u;", "s", "(Lkotlinx/coroutines/w;)Lkotlinx/coroutines/u;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/k0;", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/g$b;", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/p;)Ljava/lang/Object;", "E", "Lkotlin/coroutines/g$c;", "key", "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "y", "()Ljava/util/concurrent/CancellationException;", "", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/i1;", "w", "(ZZLkotlin/jvm/functions/l;)Lkotlinx/coroutines/i1;", "f", "(Lkotlin/jvm/functions/l;)Lkotlinx/coroutines/i1;", "C", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "minusKey", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;", "context", "plus", "(Lkotlin/coroutines/g;)Lkotlin/coroutines/g;", "start", "()Z", "", "toString", "()Ljava/lang/String;", "c", "Lkotlinx/coroutines/d2;", "delegate", "Lio/ktor/utils/io/c;", "d", "Lio/ktor/utils/io/c;", "b", "()Lio/ktor/utils/io/c;", "channel", "Lkotlin/sequences/i;", "()Lkotlin/sequences/i;", "children", "isActive", "isCancelled", "h", "isCompleted", "getKey", "()Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/selects/d;", "r", "()Lkotlinx/coroutines/selects/d;", "onJoin", "<init>", "(Lkotlinx/coroutines/d2;Lio/ktor/utils/io/c;)V", "ktor-io"}, k=1, mv={1, 8, 0})
final class l
implements t,
v,
d2 {
    @NotNull
    private final d2 c;
    @NotNull
    private final c d;

    public l(@NotNull d2 d22, @NotNull c c4) {
        y.j((Object)d22, (String)"delegate");
        y.j((Object)c4, (String)"channel");
        this.c = d22;
        this.d = c4;
    }

    @Override
    @Nullable
    public Object C(@NotNull d<? super k0> d4) {
        return this.c.C(d4);
    }

    @NotNull
    public c b() {
        return this.d;
    }

    @Override
    public void cancel(@Nullable CancellationException cancellationException) {
        this.c.cancel(cancellationException);
    }

    @Override
    @NotNull
    public i<d2> d() {
        return this.c.d();
    }

    @Override
    @NotNull
    public i1 f(@NotNull kotlin.jvm.functions.l<? super Throwable, k0> l4) {
        y.j(l4, (String)"handler");
        return this.c.f(l4);
    }

    @Override
    public <R> R fold(R r2, @NotNull p<? super R, ? super g.b, ? extends R> p4) {
        y.j(p4, (String)"operation");
        return this.c.fold(r2, p4);
    }

    @Override
    @Nullable
    public <E extends g.b> E get(@NotNull g.c<E> c4) {
        y.j(c4, (String)"key");
        return this.c.get(c4);
    }

    @Override
    @NotNull
    public g.c<?> getKey() {
        return this.c.getKey();
    }

    @Override
    public boolean h() {
        return this.c.h();
    }

    @Override
    public boolean isActive() {
        return this.c.isActive();
    }

    @Override
    public boolean isCancelled() {
        return this.c.isCancelled();
    }

    @Override
    @NotNull
    public g minusKey(@NotNull g.c<?> c4) {
        y.j(c4, (String)"key");
        return this.c.minusKey(c4);
    }

    @NotNull
    public g plus(@NotNull g g4) {
        y.j((Object)g4, (String)"context");
        return this.c.plus(g4);
    }

    @Override
    @NotNull
    public kotlinx.coroutines.selects.d r() {
        return this.c.r();
    }

    @Override
    @InternalCoroutinesApi
    @NotNull
    public u s(@NotNull w w3) {
        y.j((Object)w3, (String)"child");
        return this.c.s(w3);
    }

    @Override
    public boolean start() {
        return this.c.start();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChannelJob[");
        stringBuilder.append(this.c);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    @Override
    @InternalCoroutinesApi
    @NotNull
    public i1 w(boolean bl, boolean bl2, @NotNull kotlin.jvm.functions.l<? super Throwable, k0> l4) {
        y.j(l4, (String)"handler");
        return this.c.w(bl, bl2, l4);
    }

    @Override
    @InternalCoroutinesApi
    @NotNull
    public CancellationException y() {
        return this.c.y();
    }
}


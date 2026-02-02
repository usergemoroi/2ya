/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$c
 *  kotlin.jvm.internal.y
 *  kotlinx.coroutines.a3$a
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.internal.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0018\u001a\u00028\u0000\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\u00a2\u0006\u0004\b!\u0010\"J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0011\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0010*\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0096\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00028\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \u00a8\u0006#"}, d2={"Lkotlinx/coroutines/internal/l0;", "T", "Lkotlinx/coroutines/a3;", "Lkotlin/coroutines/g;", "context", "updateThreadContext", "(Lkotlin/coroutines/g;)Ljava/lang/Object;", "oldState", "Lkotlin/k0;", "restoreThreadContext", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "Lkotlin/coroutines/g$c;", "key", "minusKey", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;", "Lkotlin/coroutines/g$b;", "E", "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Object;", "value", "Ljava/lang/ThreadLocal;", "d", "Ljava/lang/ThreadLocal;", "threadLocal", "e", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public final class l0<T>
implements a3<T> {
    private final T c;
    @NotNull
    private final ThreadLocal<T> d;
    @NotNull
    private final g.c<?> e;

    public l0(T t3, @NotNull ThreadLocal<T> threadLocal) {
        this.c = t3;
        this.d = threadLocal;
        this.e = new m0(threadLocal);
    }

    @Override
    public <R> R fold(R r4, @NotNull p<? super R, ? super g.b, ? extends R> p4) {
        return (R)a3.a.a((a3)this, r4, p4);
    }

    @Override
    @Nullable
    public <E extends g.b> E get(@NotNull g.c<E> object) {
        if (y.e(this.getKey(), object)) {
            y.h((Object)this, (String)"null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
            object = this;
        } else {
            object = null;
        }
        return (E)object;
    }

    @Override
    @NotNull
    public g.c<?> getKey() {
        return this.e;
    }

    @Override
    @NotNull
    public g minusKey(@NotNull g.c<?> object) {
        object = y.e(this.getKey(), object) ? h.c : this;
        return object;
    }

    @NotNull
    public g plus(@NotNull g g4) {
        return a3.a.b((a3)this, (g)g4);
    }

    @Override
    public void restoreThreadContext(@NotNull g g4, T t3) {
        this.d.set(t3);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ThreadLocal(value=");
        stringBuilder.append(this.c);
        stringBuilder.append(", threadLocal = ");
        stringBuilder.append(this.d);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Override
    public T updateThreadContext(@NotNull g object) {
        object = this.d.get();
        this.d.set(this.c);
        return (T)object;
    }
}


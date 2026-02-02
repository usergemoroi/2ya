/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.util.KtorDsl
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.jvm.internal.y
 *  kotlinx.coroutines.q0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.util.pipeline;

import io.ktor.util.KtorDsl;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KtorDsl
@Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004B\u000f\u0012\u0006\u0010\u000f\u001a\u00028\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00028\u0000H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u00a0@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000b\u0010\u0007R\u0017\u0010\u000f\u001a\u00028\u00018\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2={"Lio/ktor/util/pipeline/e;", "", "TSubject", "TContext", "Lkotlinx/coroutines/q0;", "subject", "d", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "initial", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "context", "<init>", "(Ljava/lang/Object;)V", "ktor-utils"}, k=1, mv={1, 8, 0})
public abstract class e<TSubject, TContext>
implements q0 {
    @NotNull
    private final TContext c;

    public e(@NotNull TContext TContext) {
        y.j(TContext, (String)"context");
        this.c = TContext;
    }

    @Nullable
    public abstract Object a(@NotNull TSubject var1, @NotNull d<? super TSubject> var2);

    @NotNull
    public final TContext b() {
        return this.c;
    }

    @Nullable
    public abstract Object c(@NotNull d<? super TSubject> var1);

    @Nullable
    public abstract Object d(@NotNull TSubject var1, @NotNull d<? super TSubject> var2);
}


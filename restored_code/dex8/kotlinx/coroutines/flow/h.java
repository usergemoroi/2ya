/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.k0;
import kotlinx.coroutines.flow.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u00a6@\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2={"Lkotlinx/coroutines/flow/h;", "T", "", "Lkotlinx/coroutines/flow/i;", "collector", "Lkotlin/k0;", "collect", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public interface h<T> {
    @Nullable
    public Object collect(@NotNull i<? super T> var1, @NotNull d<? super k0> var2);
}


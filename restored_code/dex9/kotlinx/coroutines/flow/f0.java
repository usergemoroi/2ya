/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.k0
 *  kotlinx.coroutines.flow.i
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlinx.coroutines.flow.a;
import kotlinx.coroutines.flow.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B6\u0012-\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b\u00a2\u0006\u0002\b\u000b\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@\u00a2\u0006\u0004\b\u0006\u0010\u0007R;\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b\u00a2\u0006\u0002\b\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2={"Lkotlinx/coroutines/flow/f0;", "T", "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/i;", "collector", "Lkotlin/k0;", "g", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/ExtensionFunctionType;", "c", "Lkotlin/jvm/functions/p;", "block", "<init>", "(Lkotlin/jvm/functions/p;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class f0<T>
extends a<T> {
    @NotNull
    private final p<i<? super T>, d<? super k0>, Object> c;

    public f0(@NotNull p<? super i<? super T>, ? super d<? super k0>, ? extends Object> p4) {
        this.c = p4;
    }

    @Override
    @Nullable
    public Object g(@NotNull i<? super T> object, @NotNull d<? super k0> d4) {
        if ((object = this.c.invoke((i<T>)object, (d<k0>)d4)) == b.f()) {
            return object;
        }
        return k0.a;
    }
}


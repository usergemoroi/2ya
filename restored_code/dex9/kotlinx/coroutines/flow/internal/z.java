/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.k0
 *  kotlinx.coroutines.InternalCoroutinesApi
 *  kotlinx.coroutines.channels.y
 *  kotlinx.coroutines.flow.i
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.k0;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.y;
import kotlinx.coroutines.flow.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2={"Lkotlinx/coroutines/flow/internal/z;", "T", "Lkotlinx/coroutines/flow/i;", "value", "Lkotlin/k0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/y;", "c", "Lkotlinx/coroutines/channels/y;", "channel", "<init>", "(Lkotlinx/coroutines/channels/y;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@InternalCoroutinesApi
public final class z<T>
implements i<T> {
    @NotNull
    private final y<T> c;

    public z(@NotNull y<? super T> y3) {
        this.c = y3;
    }

    @Nullable
    public Object emit(T object, @NotNull d<? super k0> d4) {
        if ((object = this.c.send(object, d4)) == b.f()) {
            return object;
        }
        return k0.a;
    }
}


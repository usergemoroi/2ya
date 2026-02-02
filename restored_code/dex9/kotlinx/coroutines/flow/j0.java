/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.k0
 *  kotlinx.coroutines.flow.internal.d
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.internal.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0015"}, d2={"Lkotlinx/coroutines/flow/j0;", "Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/flow/h0;", "flow", "", "c", "(Lkotlinx/coroutines/flow/h0;)Z", "", "Lkotlin/coroutines/d;", "Lkotlin/k0;", "d", "(Lkotlinx/coroutines/flow/h0;)[Lkotlin/coroutines/d;", "", "a", "J", "index", "b", "Lkotlin/coroutines/d;", "cont", "<init>", "()V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
public final class j0
extends d<h0<?>> {
    @JvmField
    public long a = -1L;
    @JvmField
    @Nullable
    public kotlin.coroutines.d<? super k0> b;

    public boolean c(@NotNull h0<?> h02) {
        if (this.a >= 0L) {
            return false;
        }
        this.a = h02.Y();
        return true;
    }

    @NotNull
    public kotlin.coroutines.d<k0>[] d(@NotNull h0<?> h02) {
        long l4 = this.a;
        this.a = -1L;
        this.b = null;
        return h02.X(l4);
    }
}


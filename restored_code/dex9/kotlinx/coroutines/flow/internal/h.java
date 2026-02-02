/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.p
 *  kotlin.k0
 *  kotlinx.coroutines.channels.a
 *  kotlinx.coroutines.flow.h
 *  kotlinx.coroutines.flow.i
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.p;
import kotlin.k0;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.internal.e;
import kotlinx.coroutines.flow.internal.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0015\u0010\u0016J-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0094@\u00a2\u0006\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2={"Lkotlinx/coroutines/flow/internal/h;", "T", "Lkotlinx/coroutines/flow/internal/g;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/a;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/e;", "j", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)Lkotlinx/coroutines/flow/internal/e;", "Lkotlinx/coroutines/flow/h;", "k", "()Lkotlinx/coroutines/flow/h;", "Lkotlinx/coroutines/flow/i;", "collector", "Lkotlin/k0;", "r", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "flow", "<init>", "(Lkotlinx/coroutines/flow/h;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public final class h<T>
extends g<T, T> {
    public h(@NotNull kotlinx.coroutines.flow.h<? extends T> h4, @NotNull kotlin.coroutines.g g4, int n4, @NotNull a a4) {
        super(h4, g4, n4, a4);
    }

    public /* synthetic */ h(kotlinx.coroutines.flow.h h4, kotlin.coroutines.g g4, int n4, a a4, int n5, p p4) {
        if ((n5 & 2) != 0) {
            g4 = kotlin.coroutines.h.c;
        }
        if ((n5 & 4) != 0) {
            n4 = -3;
        }
        if ((n5 & 8) != 0) {
            a4 = a.c;
        }
        this((kotlinx.coroutines.flow.h<T>)h4, g4, n4, a4);
    }

    @Override
    @NotNull
    protected e<T> j(@NotNull kotlin.coroutines.g g4, int n4, @NotNull a a4) {
        return new h(this.f, g4, n4, a4);
    }

    @Override
    @NotNull
    public kotlinx.coroutines.flow.h<T> k() {
        return this.f;
    }

    @Override
    @Nullable
    protected Object r(@NotNull i<? super T> object, @NotNull d<? super k0> d4) {
        if ((object = this.f.collect(object, d4)) == b.f()) {
            return object;
        }
        return k0.a;
    }
}


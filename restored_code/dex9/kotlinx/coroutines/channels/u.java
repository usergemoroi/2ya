/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.k0
 *  kotlinx.coroutines.channels.y$a
 *  kotlinx.coroutines.o0
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.k0;
import kotlinx.coroutines.channels.g;
import kotlinx.coroutines.channels.h;
import kotlinx.coroutines.channels.v;
import kotlinx.coroutines.channels.y;
import kotlinx.coroutines.o0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014\u00a2\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0016"}, d2={"Lkotlinx/coroutines/channels/u;", "E", "Lkotlinx/coroutines/channels/h;", "Lkotlinx/coroutines/channels/v;", "Lkotlin/k0;", "value", "e1", "(Lkotlin/k0;)V", "", "cause", "", "handled", "Z0", "(Ljava/lang/Throwable;Z)V", "isActive", "()Z", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/g;", "channel", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/g;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class u<E>
extends h<E>
implements v<E> {
    public u(@NotNull kotlin.coroutines.g g4, @NotNull g<E> g5) {
        super(g4, g5, true, true);
    }

    @Override
    protected void Z0(@NotNull Throwable throwable, boolean bl) {
        if (!this.d1().close(throwable) && !bl) {
            o0.a((kotlin.coroutines.g)this.getContext(), (Throwable)throwable);
        }
    }

    protected void e1(@NotNull k0 k02) {
        y.a.a(this.d1(), null, (int)1, null);
    }

    @Override
    public boolean isActive() {
        return super.isActive();
    }
}


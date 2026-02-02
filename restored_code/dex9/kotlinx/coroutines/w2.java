/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.k0
 *  kotlinx.coroutines.o0
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.k0;
import kotlinx.coroutines.a;
import kotlinx.coroutines.o0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\r"}, d2={"Lkotlinx/coroutines/w2;", "Lkotlinx/coroutines/a;", "Lkotlin/k0;", "", "exception", "", "q0", "(Ljava/lang/Throwable;)Z", "Lkotlin/coroutines/g;", "parentContext", "active", "<init>", "(Lkotlin/coroutines/g;Z)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
class w2
extends a<k0> {
    public w2(@NotNull g g4, boolean bl) {
        super(g4, true, bl);
    }

    @Override
    protected boolean q0(@NotNull Throwable throwable) {
        o0.a((g)this.getContext(), (Throwable)throwable);
        return true;
    }
}


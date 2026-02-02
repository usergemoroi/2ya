/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlinx.coroutines.i1
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.i2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2={"Lkotlinx/coroutines/k1;", "Lkotlinx/coroutines/i2;", "", "cause", "Lkotlin/k0;", "v", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/i1;", "g", "Lkotlinx/coroutines/i1;", "handle", "", "u", "()Z", "onCancelling", "<init>", "(Lkotlinx/coroutines/i1;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class k1
extends i2 {
    @NotNull
    private final i1 g;

    public k1(@NotNull i1 i12) {
        this.g = i12;
    }

    @Override
    public boolean u() {
        return false;
    }

    @Override
    public void v(@Nullable Throwable throwable) {
        this.g.dispose();
    }
}


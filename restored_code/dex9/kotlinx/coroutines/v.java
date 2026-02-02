/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmField
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.u;
import kotlinx.coroutines.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0018"}, d2={"Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/i2;", "Lkotlinx/coroutines/u;", "", "cause", "Lkotlin/k0;", "v", "(Ljava/lang/Throwable;)V", "", "c", "(Ljava/lang/Throwable;)Z", "Lkotlinx/coroutines/w;", "g", "Lkotlinx/coroutines/w;", "childJob", "Lkotlinx/coroutines/d2;", "getParent", "()Lkotlinx/coroutines/d2;", "parent", "u", "()Z", "onCancelling", "<init>", "(Lkotlinx/coroutines/w;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class v
extends i2
implements u {
    @JvmField
    @NotNull
    public final w g;

    public v(@NotNull w w3) {
        this.g = w3;
    }

    @Override
    public boolean c(@NotNull Throwable throwable) {
        return this.t().Z(throwable);
    }

    @Override
    @NotNull
    public d2 getParent() {
        return this.t();
    }

    @Override
    public boolean u() {
        return true;
    }

    @Override
    public void v(@Nullable Throwable throwable) {
        this.g.e(this.t());
    }
}


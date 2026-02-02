/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlinx.coroutines.i1
 *  kotlinx.coroutines.internal.o
 *  kotlinx.coroutines.u0
 *  kotlinx.coroutines.y1
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.j2;
import kotlinx.coroutines.o2;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.y1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\u00a2\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&\u00a2\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006 "}, d2={"Lkotlinx/coroutines/i2;", "Lkotlinx/coroutines/internal/o;", "Lkotlinx/coroutines/i1;", "Lkotlinx/coroutines/y1;", "Lkotlin/k0;", "dispose", "()V", "", "toString", "()Ljava/lang/String;", "", "cause", "v", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/j2;", "f", "Lkotlinx/coroutines/j2;", "t", "()Lkotlinx/coroutines/j2;", "w", "(Lkotlinx/coroutines/j2;)V", "job", "", "u", "()Z", "onCancelling", "isActive", "Lkotlinx/coroutines/o2;", "a", "()Lkotlinx/coroutines/o2;", "list", "<init>", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public abstract class i2
extends o
implements i1,
y1 {
    public j2 f;

    @Nullable
    public o2 a() {
        return null;
    }

    public void dispose() {
        this.t().M0(this);
    }

    public boolean isActive() {
        return true;
    }

    @NotNull
    public final j2 t() {
        j2 j22 = this.f;
        if (j22 != null) {
            return j22;
        }
        y.B((String)"job");
        return null;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(u0.a((Object)((Object)this)));
        stringBuilder.append('@');
        stringBuilder.append(u0.b((Object)((Object)this)));
        stringBuilder.append("[job@");
        stringBuilder.append(u0.b((Object)this.t()));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public abstract boolean u();

    public abstract void v(@Nullable Throwable var1);

    public final void w(@NotNull j2 j22) {
        this.f = j22;
    }
}


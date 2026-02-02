/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmField
 *  kotlinx.coroutines.scheduling.h
 *  kotlinx.coroutines.scheduling.j
 *  kotlinx.coroutines.u0
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.scheduling.h;
import kotlinx.coroutines.scheduling.j;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\f\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\f\u001a\u00060\bj\u0002`\t8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2={"Lkotlinx/coroutines/scheduling/i;", "Lkotlinx/coroutines/scheduling/h;", "Lkotlin/k0;", "run", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "e", "Ljava/lang/Runnable;", "block", "", "submissionTime", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "<init>", "(Ljava/lang/Runnable;JZ)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class i
extends h {
    @JvmField
    @NotNull
    public final Runnable e;

    public i(@NotNull Runnable runnable, long l4, boolean bl) {
        super(l4, bl);
        this.e = runnable;
    }

    public void run() {
        this.e.run();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Task[");
        stringBuilder.append(u0.a((Object)this.e));
        stringBuilder.append('@');
        stringBuilder.append(u0.b((Object)this.e));
        stringBuilder.append(", ");
        stringBuilder.append(this.c);
        stringBuilder.append(", ");
        stringBuilder.append(j.a((boolean)this.d));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}


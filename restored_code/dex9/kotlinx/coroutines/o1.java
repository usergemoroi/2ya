/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlinx.coroutines.c
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlinx.coroutines.c;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.n1;
import kotlinx.coroutines.v0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0004\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2={"Lkotlinx/coroutines/o1;", "Lkotlinx/coroutines/m1;", "Lkotlin/k0;", "d0", "()V", "", "now", "Lkotlinx/coroutines/n1$c;", "delayedTask", "c0", "(JLkotlinx/coroutines/n1$c;)V", "Ljava/lang/Thread;", "b0", "()Ljava/lang/Thread;", "thread", "<init>", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public abstract class o1
extends m1 {
    @NotNull
    protected abstract Thread b0();

    protected void c0(long l4, @NotNull n1.c c4) {
        v0.i.q0(l4, c4);
    }

    protected final void d0() {
        Thread thread = this.b0();
        if (Thread.currentThread() != thread) {
            c.a();
            LockSupport.unpark(thread);
        }
    }
}


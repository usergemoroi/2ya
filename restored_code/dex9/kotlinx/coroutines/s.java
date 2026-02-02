/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlinx.coroutines.c0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\r\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004R\u000b\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a8\u0006\u000e"}, d2={"Lkotlinx/coroutines/s;", "Lkotlinx/coroutines/c0;", "", "e", "()Z", "Lkotlinx/atomicfu/AtomicBoolean;", "_resumed", "Lkotlin/coroutines/d;", "continuation", "", "cause", "handled", "<init>", "(Lkotlin/coroutines/d;Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public final class s
extends c0 {
    private static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(s.class, "_resumed$volatile");
    private volatile int _resumed$volatile;

    public s(@NotNull d<?> d4, @Nullable Throwable serializable, boolean bl) {
        Throwable throwable = serializable;
        if (serializable == null) {
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("Continuation ");
            ((StringBuilder)serializable).append(d4);
            ((StringBuilder)serializable).append(" was cancelled normally");
            throwable = new CancellationException(((StringBuilder)serializable).toString());
        }
        super(throwable, bl);
        this._resumed$volatile = 0;
    }

    public final boolean e() {
        return s.c.compareAndSet(this, 0, 1);
    }
}


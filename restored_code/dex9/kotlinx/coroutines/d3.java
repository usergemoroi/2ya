/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.j
 *  kotlinx.coroutines.g2
 *  kotlinx.coroutines.i1
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.j;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.i2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b!\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t\u00a2\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u000b\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a8\u0006\""}, d2={"Lkotlinx/coroutines/d3;", "Lkotlinx/coroutines/i2;", "", "state", "", "z", "(I)Ljava/lang/Void;", "Lkotlinx/coroutines/d2;", "job", "Lkotlin/k0;", "A", "(Lkotlinx/coroutines/d2;)V", "x", "()V", "", "cause", "v", "(Ljava/lang/Throwable;)V", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "g", "Ljava/lang/Thread;", "targetThread", "Lkotlinx/coroutines/i1;", "h", "Lkotlinx/coroutines/i1;", "cancelHandle", "", "u", "()Z", "onCancelling", "Lkotlinx/atomicfu/AtomicInt;", "_state", "<init>", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class d3
extends i2 {
    private static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(d3.class, "_state$volatile");
    private volatile int _state$volatile;
    private final Thread g = Thread.currentThread();
    @Nullable
    private i1 h;

    private final Void z(int n4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Illegal state ");
        stringBuilder.append(n4);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public final void A(@NotNull d2 object) {
        int n4;
        this.h = g2.o((d2)object, (boolean)false, (i2)this, (int)1, null);
        object = d3.i;
        do {
            if ((n4 = ((AtomicIntegerFieldUpdater)object).get(this)) == 0) continue;
            if (n4 != 2 && n4 != 3) {
                this.z(n4);
                throw new j();
            }
            return;
        } while (!d3.i.compareAndSet(this, n4, 0));
    }

    @Override
    public boolean u() {
        return true;
    }

    @Override
    public void v(@Nullable Throwable object) {
        int n4;
        object = d3.i;
        do {
            if ((n4 = ((AtomicIntegerFieldUpdater)object).get(this)) == 0) continue;
            if (n4 != 1 && n4 != 2 && n4 != 3) {
                this.z(n4);
                throw new j();
            }
            return;
        } while (!d3.i.compareAndSet(this, n4, 2));
        this.g.interrupt();
        d3.i.set(this, 3);
    }

    public final void x() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d3.i;
        while (true) {
            int n4;
            if ((n4 = atomicIntegerFieldUpdater.get(this)) != 0) {
                if (n4 == 2) continue;
                if (n4 == 3) {
                    Thread.interrupted();
                    return;
                }
                this.z(n4);
                throw new j();
            }
            if (d3.i.compareAndSet(this, n4, 1)) break;
        }
        atomicIntegerFieldUpdater = this.h;
        if (atomicIntegerFieldUpdater != null) {
            atomicIntegerFieldUpdater.dispose();
        }
    }
}


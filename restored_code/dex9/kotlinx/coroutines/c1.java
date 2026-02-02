/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlinx.coroutines.c0
 *  kotlinx.coroutines.e0
 *  kotlinx.coroutines.internal.i
 *  kotlinx.coroutines.k2
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.internal.i;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014\u00a2\u0006\u0004\b\f\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0000\u00a2\u0006\u0004\b\r\u0010\u000eR\u000b\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a8\u0006\u0017"}, d2={"Lkotlinx/coroutines/c1;", "T", "Lkotlinx/coroutines/internal/z;", "", "f1", "()Z", "e1", "", "state", "Lkotlin/k0;", "P", "(Ljava/lang/Object;)V", "Y0", "c1", "()Ljava/lang/Object;", "Lkotlinx/atomicfu/AtomicInt;", "_decision", "Lkotlin/coroutines/g;", "context", "Lkotlin/coroutines/d;", "uCont", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public final class c1<T>
extends z<T> {
    private static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(c1.class, "_decision$volatile");
    private volatile int _decision$volatile;

    public c1(@NotNull g g4, @NotNull d<? super T> d4) {
        super(g4, d4);
    }

    private final boolean e1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c1.g;
        do {
            int n4;
            if ((n4 = atomicIntegerFieldUpdater.get(this)) == 0) continue;
            if (n4 == 1) {
                return false;
            }
            throw new IllegalStateException("Already resumed".toString());
        } while (!c1.g.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean f1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c1.g;
        do {
            int n4;
            if ((n4 = atomicIntegerFieldUpdater.get(this)) == 0) continue;
            if (n4 == 2) {
                return false;
            }
            throw new IllegalStateException("Already suspended".toString());
        } while (!c1.g.compareAndSet(this, 0, 1));
        return true;
    }

    @Override
    protected void P(@Nullable Object object) {
        this.Y0(object);
    }

    @Override
    protected void Y0(@Nullable Object object) {
        if (this.e1()) {
            return;
        }
        i.b((d)b.c(this.f), (Object)e0.a((Object)object, this.f));
    }

    @Nullable
    public final Object c1() {
        if (this.f1()) {
            return b.f();
        }
        Object object = k2.h((Object)this.n0());
        if (!(object instanceof c0)) {
            return object;
        }
        throw ((c0)object).a;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.k0
 *  kotlinx.coroutines.InternalCoroutinesApi
 *  kotlinx.coroutines.i1
 *  kotlinx.coroutines.internal.l
 *  kotlinx.coroutines.internal.p
 *  kotlinx.coroutines.w0
 *  kotlinx.coroutines.z0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.internal.p;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.n;
import kotlinx.coroutines.w0;
import kotlinx.coroutines.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u00019B!\u0012\u0006\u0010'\u001a\u00020\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\b7\u00108J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ&\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0006j\u0002`\u0007H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0006j\u0002`\u0007H\u0017\u00a2\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\nH\u0097A\u00a2\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010+R\u001e\u0010/\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00104\u001a\u000600j\u0002`18\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b2\u00103R\u000b\u00106\u001a\u0002058\u0002X\u0082\u0004\u00a8\u0006:"}, d2={"Lkotlinx/coroutines/internal/k;", "Lkotlinx/coroutines/m0;", "Lkotlinx/coroutines/z0;", "", "T", "()Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "S", "()Ljava/lang/Runnable;", "", "timeMillis", "Lkotlinx/coroutines/n;", "Lkotlin/k0;", "continuation", "p", "(JLkotlinx/coroutines/n;)V", "block", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/i1;", "q", "(JLjava/lang/Runnable;Lkotlin/coroutines/g;)Lkotlinx/coroutines/i1;", "", "parallelism", "", "name", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/m0;", "dispatch", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "dispatchYield", "toString", "()Ljava/lang/String;", "time", "delay", "(J)V", "d", "Lkotlinx/coroutines/m0;", "dispatcher", "e", "I", "f", "Ljava/lang/String;", "Lkotlinx/coroutines/internal/p;", "g", "Lkotlinx/coroutines/internal/p;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "h", "Ljava/lang/Object;", "workerAllocationLock", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", "<init>", "(Lkotlinx/coroutines/m0;ILjava/lang/String;)V", "a", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,135:1\n62#1,8:136\n62#1,8:144\n27#2:152\n27#2:154\n16#3:153\n16#3:155\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n44#1:136,8\n51#1:144,8\n75#1:152\n88#1:154\n75#1:153\n88#1:155\n*E\n"})
public final class k
extends m0
implements z0 {
    private static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(k.class, "runningWorkers$volatile");
    private final z0 c;
    @NotNull
    private final m0 d;
    private final int e;
    @Nullable
    private final String f;
    @NotNull
    private final p<Runnable> g;
    @NotNull
    private final Object h;
    private volatile int runningWorkers$volatile;

    public k(@NotNull m0 m02, int n4, @Nullable String string) {
        z0 z02 = m02 instanceof z0 ? (z0)m02 : null;
        z0 z03 = z02;
        if (z02 == null) {
            z03 = w0.a();
        }
        this.c = z03;
        this.d = m02;
        this.e = n4;
        this.f = string;
        this.g = new p(false);
        this.h = new Object();
    }

    public static final /* synthetic */ m0 H(k k4) {
        return k4.d;
    }

    public static final /* synthetic */ Runnable L(k k4) {
        return k4.S();
    }

    private final Runnable S() {
        Runnable runnable;
        while ((runnable = (Runnable)this.g.e()) == null) {
            Object object = this.h;
            synchronized (object) {
                block5: {
                    k.i.decrementAndGet(this);
                    int n4 = this.g.c();
                    if (n4 != 0) break block5;
                    return null;
                }
                k.i.incrementAndGet(this);
            }
        }
        return runnable;
    }

    private final boolean T() {
        Object object = this.h;
        synchronized (object) {
            block4: {
                int n4 = k.i.get(this);
                int n5 = this.e;
                if (n4 < n5) break block4;
                return false;
            }
            k.i.incrementAndGet(this);
            return true;
        }
    }

    @Override
    public void dispatch(@NotNull g object, @NotNull Runnable runnable) {
        this.g.a((Object)runnable);
        if (k.i.get(this) < this.e && this.T() && (object = this.S()) != null) {
            object = new /* Unavailable Anonymous Inner Class!! */;
            this.d.dispatch(this, (Runnable)object);
        }
    }

    @Override
    @InternalCoroutinesApi
    public void dispatchYield(@NotNull g object, @NotNull Runnable runnable) {
        this.g.a((Object)runnable);
        if (k.i.get(this) < this.e && this.T() && (object = this.S()) != null) {
            object = new /* Unavailable Anonymous Inner Class!! */;
            this.d.dispatchYield(this, (Runnable)object);
        }
    }

    @Override
    @NotNull
    public m0 limitedParallelism(int n4, @Nullable String string) {
        l.a((int)n4);
        if (n4 >= this.e) {
            return l.b((m0)this, (String)string);
        }
        return super.limitedParallelism(n4, string);
    }

    public void p(long l4, @NotNull n<? super k0> n4) {
        this.c.p(l4, n4);
    }

    @NotNull
    public i1 q(long l4, @NotNull Runnable runnable, @NotNull g g4) {
        return this.c.q(l4, runnable, g4);
    }

    @Override
    @NotNull
    public String toString() {
        String string = this.f;
        CharSequence charSequence = string;
        if (string == null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.d);
            ((StringBuilder)charSequence).append(".limitedParallelism(");
            ((StringBuilder)charSequence).append(this.e);
            ((StringBuilder)charSequence).append(')');
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }
}


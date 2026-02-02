/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.concurrent.futures.a
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.jvm.internal.e
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlinx.coroutines.c3
 *  kotlinx.coroutines.e0
 *  kotlinx.coroutines.internal.d0
 *  kotlinx.coroutines.internal.i
 *  kotlinx.coroutines.internal.k0
 *  kotlinx.coroutines.u0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.internal;

import androidx.concurrent.futures.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlinx.coroutines.c3;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.i;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.n;
import kotlinx.coroutines.p;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010*\u001a\u00020'\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0004\b=\u0010>J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0000\u00a2\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0000\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0000\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0010\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00028\u0000H\u0000\u00a2\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016\u00a2\u0006\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,R\u001e\u00100\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0081\u000e\u00a2\u0006\f\n\u0004\b-\u0010.\u0012\u0004\b/\u0010\u000bR\u0014\u00102\u001a\u00020\u00188\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\b1\u0010.R\u001a\u00104\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b3\u0010\u000fR\u001c\u00107\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b5\u00106R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180;8\u0002X\u0082\u0004R\u000b\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0005\u00a8\u0006?"}, d2={"Lkotlinx/coroutines/internal/h;", "T", "Lkotlinx/coroutines/d1;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/d;", "", "q", "()Z", "Lkotlin/k0;", "k", "()V", "s", "Lkotlinx/coroutines/p;", "l", "()Lkotlinx/coroutines/p;", "Lkotlinx/coroutines/n;", "continuation", "", "v", "(Lkotlinx/coroutines/n;)Ljava/lang/Throwable;", "cause", "r", "(Ljava/lang/Throwable;)Z", "", "j", "()Ljava/lang/Object;", "Lkotlin/u;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/g;", "context", "value", "m", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/m0;", "f", "Lkotlinx/coroutines/m0;", "dispatcher", "g", "Lkotlin/coroutines/d;", "h", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "i", "countOrElement", "n", "reusableCancellableContinuation", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "d", "()Lkotlin/coroutines/d;", "delegate", "Lkotlinx/atomicfu/AtomicRef;", "_reusableCancellableContinuation", "<init>", "(Lkotlinx/coroutines/m0;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,297:1\n224#1,8:361\n236#1:369\n237#1,2:380\n239#1:384\n1#2:298\n1#2:304\n1#2:345\n277#3,5:299\n282#3,12:305\n294#3:339\n277#3,5:340\n282#3,12:346\n294#3:399\n186#4,3:317\n189#4,14:325\n186#4,3:358\n189#4,14:385\n91#5,5:320\n103#5,10:370\n114#5,2:382\n103#5,13:400\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n*L\n214#1:361,8\n215#1:369\n215#1:380,2\n215#1:384\n195#1:304\n213#1:345\n195#1:299,5\n195#1:305,12\n195#1:339\n213#1:340,5\n213#1:346,12\n213#1:399\n195#1:317,3\n195#1:325,14\n213#1:358,3\n213#1:385,14\n196#1:320,5\n215#1:370,10\n215#1:382,2\n236#1:400,13\n*E\n"})
public final class h<T>
extends d1<T>
implements e,
d<T> {
    private static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;
    @JvmField
    @NotNull
    public final m0 f;
    @JvmField
    @NotNull
    public final d<T> g;
    @JvmField
    @Nullable
    public Object h;
    @JvmField
    @NotNull
    public final Object i;

    public h(@NotNull m0 m02, @NotNull d<? super T> d4) {
        super(-1);
        this.f = m02;
        this.g = d4;
        this.h = kotlinx.coroutines.internal.i.a();
        this.i = kotlinx.coroutines.internal.k0.g((g)this.getContext());
    }

    private final p<?> n() {
        Object object = kotlinx.coroutines.internal.h.j.get(this);
        object = object instanceof p ? (p)object : null;
        return object;
    }

    @Override
    @NotNull
    public d<T> d() {
        return this;
    }

    @Nullable
    public e getCallerFrame() {
        Object object = this.g;
        object = object instanceof e ? (e)object : null;
        return object;
    }

    @NotNull
    public g getContext() {
        return this.g.getContext();
    }

    @Override
    @Nullable
    public Object j() {
        Object object = this.h;
        this.h = kotlinx.coroutines.internal.i.a();
        return object;
    }

    public final void k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.h.j;
        while (atomicReferenceFieldUpdater.get(this) == kotlinx.coroutines.internal.i.b) {
        }
    }

    @Nullable
    public final p<T> l() {
        Object v3;
        Object object = kotlinx.coroutines.internal.h.j;
        while (true) {
            if ((v3 = ((AtomicReferenceFieldUpdater)object).get(this)) == null) {
                kotlinx.coroutines.internal.h.j.set(this, kotlinx.coroutines.internal.i.b);
                return null;
            }
            if (v3 instanceof p) {
                if (!a.a((AtomicReferenceFieldUpdater)kotlinx.coroutines.internal.h.j, (Object)((Object)this), v3, (Object)kotlinx.coroutines.internal.i.b)) continue;
                return (p)v3;
            }
            if (v3 != kotlinx.coroutines.internal.i.b && !(v3 instanceof Throwable)) break;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Inconsistent state ");
        ((StringBuilder)object).append(v3);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    public final void m(@NotNull g g4, T t3) {
        this.h = t3;
        this.e = 1;
        this.f.dispatchYield(g4, (Runnable)((Object)this));
    }

    public final boolean q() {
        boolean bl = kotlinx.coroutines.internal.h.j.get(this) != null;
        return bl;
    }

    public final boolean r(@NotNull Throwable throwable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.h.j;
        while (true) {
            d0 d02;
            Object v3;
            if (y.e(v3 = atomicReferenceFieldUpdater.get(this), (Object)(d02 = kotlinx.coroutines.internal.i.b))) {
                if (!a.a((AtomicReferenceFieldUpdater)kotlinx.coroutines.internal.h.j, (Object)((Object)this), (Object)d02, (Object)throwable)) continue;
                return true;
            }
            if (v3 instanceof Throwable) {
                return true;
            }
            if (a.a((AtomicReferenceFieldUpdater)kotlinx.coroutines.internal.h.j, (Object)((Object)this), v3, null)) break;
        }
        return false;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void resumeWith(@NotNull Object object) {
        Throwable throwable222222;
        boolean bl;
        Object object2 = e0.b((Object)object);
        if (this.f.isDispatchNeeded(this.getContext())) {
            this.h = object2;
            this.e = 0;
            this.f.dispatch(this.getContext(), (Runnable)((Object)this));
            return;
        }
        m1 m12 = c3.a.b();
        if (m12.W()) {
            this.h = object2;
            this.e = 0;
            m12.S(this);
            return;
        }
        m12.U(true);
        g g4 = this.getContext();
        object2 = kotlinx.coroutines.internal.k0.i((g)g4, (Object)this.i);
        this.g.resumeWith(object);
        object = k0.a;
        kotlinx.coroutines.internal.k0.f((g)g4, (Object)object2);
        while (bl = m12.Z()) {
        }
        return;
        {
        // Removed invalid catch block
        // Removed invalid catch block
            throw throwable3;
        }
        try {
            this.g(throwable222222);
            return;
        }
        finally {
            m12.H(true);
        }
    }

    public final void s() {
        this.k();
        p<?> p4 = this.n();
        if (p4 != null) {
            p4.r();
        }
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DispatchedContinuation[");
        stringBuilder.append(this.f);
        stringBuilder.append(", ");
        stringBuilder.append(u0.c(this.g));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    @Nullable
    public final Throwable v(@NotNull n<?> object) {
        d0 d02;
        Object v3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.h.j;
        while ((v3 = atomicReferenceFieldUpdater.get(this)) == (d02 = kotlinx.coroutines.internal.i.b)) {
            if (!a.a((AtomicReferenceFieldUpdater)kotlinx.coroutines.internal.h.j, (Object)((Object)this), (Object)d02, object)) continue;
            return null;
        }
        if (v3 instanceof Throwable) {
            if (a.a((AtomicReferenceFieldUpdater)kotlinx.coroutines.internal.h.j, (Object)((Object)this), v3, null)) {
                return (Throwable)v3;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Inconsistent state ");
        ((StringBuilder)object).append(v3);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }
}


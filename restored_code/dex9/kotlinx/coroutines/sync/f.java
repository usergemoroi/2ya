/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.concurrent.futures.a
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.ReplaceWith
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.jvm.internal.g
 *  kotlin.e
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.k0
 *  kotlinx.coroutines.ExperimentalCoroutinesApi
 *  kotlinx.coroutines.InternalCoroutinesApi
 *  kotlinx.coroutines.internal.d0
 *  kotlinx.coroutines.k3
 *  kotlinx.coroutines.r
 *  kotlinx.coroutines.selects.l
 *  kotlinx.coroutines.sync.a
 *  kotlinx.coroutines.sync.g
 *  kotlinx.coroutines.sync.j
 *  kotlinx.coroutines.u0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.k3;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.n;
import kotlinx.coroutines.p;
import kotlinx.coroutines.r;
import kotlinx.coroutines.sync.b;
import kotlinx.coroutines.sync.c;
import kotlinx.coroutines.sync.d;
import kotlinx.coroutines.sync.e;
import kotlinx.coroutines.sync.g;
import kotlinx.coroutines.sync.j;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u000f\u0012\u0006\u0010&\u001a\u00020\r\u00a2\u0006\u0004\b'\u0010(J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0082@\u00a2\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002\u00a2\u0006\u0004\b\u000b\u0010\u0007J\u001a\u0010\f\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096@\u00a2\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u007f\u0010!\u001am\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0016\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b0\u00150\u0015j\u0002`\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030%8\u0002X\u0082\u0004\u00a8\u0006)"}, d2={"Lkotlinx/coroutines/sync/f;", "Lkotlinx/coroutines/sync/j;", "Lkotlinx/coroutines/sync/a;", "", "owner", "", "A", "(Ljava/lang/Object;)I", "Lkotlin/k0;", "C", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "F", "d", "", "a", "(Ljava/lang/Object;)Z", "e", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/l;", "Lkotlin/ParameterName;", "name", "select", "param", "internalResult", "", "Lkotlin/coroutines/g;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "h", "Lkotlin/jvm/functions/q;", "onSelectCancellationUnlockConstructor", "b", "()Z", "isLocked", "Lkotlinx/atomicfu/AtomicRef;", "locked", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n369#2,12:315\n1#3:327\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n171#1:315,12\n*E\n"})
public class f
extends j
implements kotlinx.coroutines.sync.a {
    private static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");
    @NotNull
    private final q<kotlinx.coroutines.selects.l<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.g, k0>> h;
    private volatile Object owner$volatile;

    public f(boolean bl) {
        super(1, bl ? 1 : 0);
        d0 d02 = bl ? null : g.c();
        this.owner$volatile = d02;
        this.h = new b(this);
    }

    private final int A(Object object) {
        Object v3;
        do {
            if (this.b()) continue;
            return 0;
        } while ((v3 = f.i.get(this)) == g.c());
        int n4 = v3 == object ? 1 : 2;
        return n4;
    }

    static /* synthetic */ Object B(f object, Object object2, kotlin.coroutines.d<? super k0> d4) {
        if (object.a(object2)) {
            return k0.a;
        }
        if ((object = object.C(object2, d4)) == kotlin.coroutines.intrinsics.b.f()) {
            return object;
        }
        return k0.a;
    }

    private final Object C(Object object, kotlin.coroutines.d<? super k0> d4) {
        p p4 = r.b((kotlin.coroutines.d)kotlin.coroutines.intrinsics.b.c(d4));
        try {
            a a4 = new a(this, p4, object);
            this.h(a4);
            object = p4.z();
        }
        catch (Throwable throwable) {
            p4.P();
            throw throwable;
        }
        if (object == kotlin.coroutines.intrinsics.b.f()) {
            kotlin.coroutines.jvm.internal.g.c(d4);
        }
        if (object == kotlin.coroutines.intrinsics.b.f()) {
            return object;
        }
        return k0.a;
    }

    private static final q D(f f4, kotlinx.coroutines.selects.l l4, Object object, Object object2) {
        return new c(f4, object);
    }

    private static final k0 E(f f4, Object object, Throwable throwable, Object object2, kotlin.coroutines.g g4) {
        f4.e(object);
        return k0.a;
    }

    private final int F(Object object) {
        block3: {
            int n4;
            do {
                if (this.t()) {
                    f.i.set(this, object);
                    return 0;
                }
                if (object == null) {
                    return 1;
                }
                n4 = this.A(object);
                if (n4 == 1) break block3;
            } while (n4 != 2);
            return 1;
        }
        return 2;
    }

    public static /* synthetic */ k0 w(f f4, Object object, Throwable throwable, Object object2, kotlin.coroutines.g g4) {
        return f.E(f4, object, throwable, object2, g4);
    }

    public static /* synthetic */ q x(f f4, kotlinx.coroutines.selects.l l4, Object object, Object object2) {
        return f.D(f4, l4, object, object2);
    }

    public boolean a(@Nullable Object object) {
        int n4 = this.F(object);
        boolean bl = true;
        if (n4 != 0) {
            if (n4 != 1) {
                if (n4 != 2) {
                    throw new IllegalStateException("unexpected".toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("This mutex is already locked by the specified owner: ");
                stringBuilder.append(object);
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
            bl = false;
        }
        return bl;
    }

    public boolean b() {
        boolean bl = this.m() == 0;
        return bl;
    }

    @Nullable
    public Object d(@Nullable Object object, @NotNull kotlin.coroutines.d<? super k0> d4) {
        return f.B(this, object, d4);
    }

    public void e(@Nullable Object object) {
        while (this.b()) {
            Object v3 = f.i.get(this);
            if (v3 == g.c()) continue;
            if (v3 != object && object != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("This mutex is locked by ");
                stringBuilder.append(v3);
                stringBuilder.append(", but ");
                stringBuilder.append(object);
                stringBuilder.append(" is expected");
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
            if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)f.i, (Object)((Object)this), v3, (Object)g.c())) continue;
            this.release();
            return;
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Mutex@");
        stringBuilder.append(u0.b((Object)((Object)this)));
        stringBuilder.append("[isLocked=");
        stringBuilder.append(this.b());
        stringBuilder.append(",owner=");
        stringBuilder.append(f.i.get(this));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    @Metadata(d1={"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000203\u0012\b\u00108\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b<\u0010=J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0097\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0096\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0015\u001a\u00020\u00022'\u0010\u0014\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00020\u0010j\u0002`\u0013H\u0096\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u001b\u001a\u00020\u00022\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0001\u00a2\u0006\u0004\b\u001b\u0010\u001cJ|\u0010$\u001a\u0004\u0018\u00010\u0006\"\b\b\u0000\u0010\u001d*\u00020\u00022\u0006\u0010\u001e\u001a\u00028\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062M\u0010#\u001aI\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110!\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u0002\u0018\u00010 H\u0016\u00a2\u0006\u0004\b$\u0010%Jp\u0010&\u001a\u00020\u0002\"\b\b\u0000\u0010\u001d*\u00020\u00022\u0006\u0010\u001e\u001a\u00028\u00002M\u0010#\u001aI\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110!\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u0002\u0018\u00010 H\u0016\u00a2\u0006\u0004\b&\u0010'J=\u0010(\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022#\u0010#\u001a\u001f\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010H\u0097\u0001\u00a2\u0006\u0004\b(\u0010)J\u001c\u0010+\u001a\u00020\u0002*\u00020*2\u0006\u0010\u001e\u001a\u00020\u0002H\u0097\u0001\u00a2\u0006\u0004\b+\u0010,J\u001e\u0010/\u001a\u00020\u00022\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020-H\u0096\u0001\u00a2\u0006\u0004\b/\u00100J$\u00101\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0097\u0001\u00a2\u0006\u0004\b1\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0002038\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u00104R\u0016\u00108\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b6\u00107R\u000b\u0010\"\u001a\u00020!8\u0016X\u0096\u0005R\u000b\u00109\u001a\u00020\r8\u0016X\u0096\u0005R\u000b\u0010:\u001a\u00020\r8\u0016X\u0096\u0005R\u000b\u0010;\u001a\u00020\r8\u0016X\u0096\u0005\u00a8\u0006>"}, d2={"Lkotlinx/coroutines/sync/f$a;", "Lkotlinx/coroutines/n;", "Lkotlin/k0;", "Lkotlinx/coroutines/k3;", "", "exception", "", "x", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "t", "(Ljava/lang/Object;)V", "cause", "", "b", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "u", "(Lkotlin/jvm/functions/l;)V", "Lkotlinx/coroutines/internal/a0;", "segment", "", "index", "c", "(Lkotlinx/coroutines/internal/a0;I)V", "R", "value", "idempotent", "Lkotlin/Function3;", "Lkotlin/coroutines/g;", "context", "onCancellation", "k", "(Lkotlin/k0;Ljava/lang/Object;Lkotlin/jvm/functions/q;)Ljava/lang/Object;", "f", "(Lkotlin/k0;Lkotlin/jvm/functions/q;)V", "resume", "(VLkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/m0;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;V)V", "Lkotlin/u;", "result", "resumeWith", "(Lkotlin/u;)V", "tryResume", "(VLjava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/p;", "Lkotlinx/coroutines/p;", "cont", "d", "Ljava/lang/Object;", "owner", "isActive", "isCancelled", "isCompleted", "<init>", "(Lkotlinx/coroutines/sync/f;Lkotlinx/coroutines/p;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    @SourceDebugExtension(value={"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n1#2:315\n*E\n"})
    private final class a
    implements n<k0>,
    k3 {
        @JvmField
        @NotNull
        public final p<k0> c;
        @JvmField
        @Nullable
        public final Object d;
        final f e;

        public a(@NotNull f f4, @Nullable p<? super k0> p4, Object object) {
            this.e = f4;
            this.c = p4;
            this.d = object;
        }

        public static /* synthetic */ k0 a(f f4, a a4, Throwable throwable, k0 k02, kotlin.coroutines.g g4) {
            return a.l(f4, a4, throwable, k02, g4);
        }

        public static /* synthetic */ k0 d(f f4, a a4, Throwable throwable) {
            return a.g(f4, a4, throwable);
        }

        private static final k0 g(f f4, a a4, Throwable throwable) {
            f4.e(a4.d);
            return k0.a;
        }

        private static final k0 l(f f4, a a4, Throwable throwable, k0 k02, kotlin.coroutines.g g4) {
            f.i.set(f4, a4.d);
            f4.e(a4.d);
            return k0.a;
        }

        @Override
        public boolean b(@Nullable Throwable throwable) {
            return this.c.b(throwable);
        }

        public void c(@NotNull a0<?> a02, int n4) {
            this.c.c(a02, n4);
        }

        @Deprecated(level=kotlin.e.c, message="Use the overload that also accepts the `value` and the coroutine context in lambda", replaceWith=@ReplaceWith(expression="resume(value) { cause, _, _ -> onCancellation(cause) }", imports={}))
        public void e(@NotNull k0 k02, @Nullable l<? super Throwable, k0> l4) {
            this.c.i(k02, l4);
        }

        public <R extends k0> void f(@NotNull R r4, @Nullable q<? super Throwable, ? super R, ? super kotlin.coroutines.g, k0> q4) {
            f.i.set(this.e, this.d);
            this.c.i(r4, new e(this.e, this));
        }

        @NotNull
        public kotlin.coroutines.g getContext() {
            return this.c.getContext();
        }

        @Override
        public boolean h() {
            return this.c.h();
        }

        @Override
        public boolean isActive() {
            return this.c.isActive();
        }

        @ExperimentalCoroutinesApi
        public void j(@NotNull m0 m02, @NotNull k0 k02) {
            this.c.E(m02, k02);
        }

        @Nullable
        public <R extends k0> Object k(@NotNull R object, @Nullable Object object2, @Nullable q<? super Throwable, ? super R, ? super kotlin.coroutines.g, k0> object3) {
            object3 = this.e;
            if ((object = this.c.G(object, object2, new d((f)((Object)object3), this))) != null) {
                f.i.set(this.e, this.d);
            }
            return object;
        }

        public void resumeWith(@NotNull Object object) {
            this.c.resumeWith(object);
        }

        @Override
        @InternalCoroutinesApi
        public void t(@NotNull Object object) {
            this.c.t(object);
        }

        @Override
        public void u(@NotNull l<? super Throwable, k0> l4) {
            this.c.u(l4);
        }

        @Override
        @InternalCoroutinesApi
        @Nullable
        public Object x(@NotNull Throwable throwable) {
            return this.c.x(throwable);
        }
    }
}


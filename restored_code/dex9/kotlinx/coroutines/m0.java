/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Deprecated
 *  kotlin.ExperimentalStdlibApi
 *  kotlin.Metadata
 *  kotlin.ReplaceWith
 *  kotlin.coroutines.d
 *  kotlin.coroutines.e$a
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$c
 *  kotlin.e
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  kotlinx.coroutines.InternalCoroutinesApi
 *  kotlinx.coroutines.internal.l
 *  kotlinx.coroutines.u0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.b;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.e;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001%B\u0007\u00a2\u0006\u0004\b\"\u0010#J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0017\u00a2\u0006\u0004\b\f\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H&\u00a2\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0017\u00a2\u0006\u0004\b\u0015\u0010\u0014J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00122\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0087\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016\u00a2\u0006\u0004\b \u0010!\u00a8\u0006&"}, d2={"Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/a;", "Lkotlin/coroutines/e;", "Lkotlin/coroutines/g;", "context", "", "isDispatchNeeded", "(Lkotlin/coroutines/g;)Z", "", "parallelism", "", "name", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/m0;", "(I)Lkotlinx/coroutines/m0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/k0;", "dispatch", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "dispatchYield", "T", "Lkotlin/coroutines/d;", "continuation", "interceptContinuation", "(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "releaseInterceptedContinuation", "(Lkotlin/coroutines/d;)V", "other", "plus", "(Lkotlinx/coroutines/m0;)Lkotlinx/coroutines/m0;", "toString", "()Ljava/lang/String;", "<init>", "()V", "Key", "a", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public abstract class m0
extends kotlin.coroutines.a
implements kotlin.coroutines.e {
    @NotNull
    public static final a Key = new a(null);

    public m0() {
        super(kotlin.coroutines.e.A8);
    }

    public static /* synthetic */ m0 limitedParallelism$default(m0 m02, int n4, String string, int n5, Object object) {
        if (object == null) {
            if ((n5 & 2) != 0) {
                string = null;
            }
            return m02.limitedParallelism(n4, string);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
    }

    public abstract void dispatch(@NotNull g var1, @NotNull Runnable var2);

    @InternalCoroutinesApi
    public void dispatchYield(@NotNull g g4, @NotNull Runnable runnable) {
        this.dispatch(g4, runnable);
    }

    @Override
    @Nullable
    public <E extends g.b> E get(@NotNull g.c<E> c4) {
        return (E)e.a.a((kotlin.coroutines.e)this, c4);
    }

    @Override
    @NotNull
    public final <T> d<T> interceptContinuation(@NotNull d<? super T> d4) {
        return new h<T>(this, d4);
    }

    public boolean isDispatchNeeded(@NotNull g g4) {
        return true;
    }

    @Deprecated(level=e.e, message="Deprecated for good. Override 'limitedParallelism(parallelism: Int, name: String?)' instead", replaceWith=@ReplaceWith(expression="limitedParallelism(parallelism, null)", imports={}))
    public /* synthetic */ m0 limitedParallelism(int n4) {
        return this.limitedParallelism(n4, null);
    }

    @NotNull
    public m0 limitedParallelism(int n4, @Nullable String string) {
        l.a((int)n4);
        return new k(this, n4, string);
    }

    @Override
    @NotNull
    public g minusKey(@NotNull g.c<?> c4) {
        return e.a.b((kotlin.coroutines.e)this, c4);
    }

    @Deprecated(level=e.d, message="Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    @NotNull
    public final m0 plus(@NotNull m0 m02) {
        return m02;
    }

    @Override
    public final void releaseInterceptedContinuation(@NotNull d<?> d4) {
        y.h(d4, (String)"null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((h)d4).s();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(u0.a((Object)this));
        stringBuilder.append('@');
        stringBuilder.append(u0.b((Object)this));
        return stringBuilder.toString();
    }

    @Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2={"Lkotlinx/coroutines/m0$a;", "Lkotlin/coroutines/b;", "Lkotlin/coroutines/e;", "Lkotlinx/coroutines/m0;", "<init>", "()V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    @ExperimentalStdlibApi
    public static final class a
    extends b<kotlin.coroutines.e, m0> {
        private a() {
            super(kotlin.coroutines.e.A8, new l0());
        }

        public /* synthetic */ a(p p4) {
            this();
        }

        public static /* synthetic */ m0 c(g.b b4) {
            return a.d(b4);
        }

        private static final m0 d(g.b b4) {
            b4 = b4 instanceof m0 ? (m0)b4 : null;
            return b4;
        }
    }
}


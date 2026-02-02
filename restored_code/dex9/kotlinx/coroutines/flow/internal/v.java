/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.jvm.internal.e
 *  kotlin.coroutines.jvm.internal.g
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.u
 *  kotlinx.coroutines.flow.i
 *  kotlinx.coroutines.flow.internal.w
 *  kotlinx.coroutines.flow.internal.y
 *  kotlinx.coroutines.g2
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.p;
import kotlin.u;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.internal.m;
import kotlinx.coroutines.flow.internal.r;
import kotlinx.coroutines.flow.internal.w;
import kotlinx.coroutines.flow.internal.y;
import kotlinx.coroutines.g2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010$\u001a\u00020\f\u00a2\u0006\u0004\b4\u00105J'\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\t2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0018H\u0014\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0096@\u00a2\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010 R\u0014\u0010$\u001a\u00020\f8\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b)\u0010#R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b1\u00102\u00a8\u00066"}, d2={"Lkotlinx/coroutines/flow/internal/v;", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlin/coroutines/d;", "Lkotlin/k0;", "uCont", "value", "", "k", "(Lkotlin/coroutines/d;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "currentContext", "previousContext", "g", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/internal/m;", "exception", "l", "(Lkotlinx/coroutines/flow/internal/m;Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/u;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/i;", "collector", "m", "Lkotlin/coroutines/g;", "collectContext", "", "n", "I", "collectContextSize", "o", "lastEmissionContext", "p", "Lkotlin/coroutines/d;", "completion_", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "getContext", "()Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public final class v<T>
extends kotlin.coroutines.jvm.internal.d
implements i<T>,
e {
    @JvmField
    @NotNull
    public final i<T> l;
    @JvmField
    @NotNull
    public final g m;
    @JvmField
    public final int n;
    @Nullable
    private g o;
    @Nullable
    private d<? super k0> p;

    public v(@NotNull i<? super T> i4, @NotNull g g4) {
        super(r.c, h.c);
        this.l = i4;
        this.m = g4;
        this.n = ((Number)g4.fold((Object)0, (kotlin.jvm.functions.p)new kotlinx.coroutines.flow.internal.u())).intValue();
    }

    public static /* synthetic */ int a(int n4, g.b b4) {
        return v.j(n4, b4);
    }

    private final void g(g g4, g g5, T t3) {
        if (g5 instanceof m) {
            this.l((m)g5, t3);
        }
        y.b((v)this, (g)g4);
    }

    private static final int j(int n4, g.b b4) {
        return n4 + 1;
    }

    private final Object k(d<? super k0> object, T t3) {
        Object object2 = object.getContext();
        g2.k((g)object2);
        g g4 = this.o;
        if (g4 != object2) {
            this.g((g)object2, g4, t3);
            this.o = object2;
        }
        this.p = object;
        object2 = w.a();
        object = this.l;
        kotlin.jvm.internal.y.h(object, (String)"null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        kotlin.jvm.internal.y.h((Object)this, (String)"null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        object = object2.invoke(object, t3, this);
        if (!kotlin.jvm.internal.y.e(object, (Object)b.f())) {
            this.p = null;
        }
        return object;
    }

    private final void l(m m4, Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
        stringBuilder.append(m4.d);
        stringBuilder.append(", but then emission attempt of value '");
        stringBuilder.append(object);
        stringBuilder.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(kotlin.text.p.f(stringBuilder.toString()).toString());
    }

    @Nullable
    public Object emit(T object, @NotNull d<? super k0> d4) {
        try {
            object = this.k(d4, object);
        }
        catch (Throwable throwable) {
            this.o = new m(throwable, d4.getContext());
            throw throwable;
        }
        if (object == b.f()) {
            kotlin.coroutines.jvm.internal.g.c(d4);
        }
        if (object == b.f()) {
            return object;
        }
        return k0.a;
    }

    @Override
    @Nullable
    public e getCallerFrame() {
        Object object = this.p;
        object = object instanceof e ? (e)object : null;
        return object;
    }

    @Override
    @NotNull
    public g getContext() {
        g g4;
        g g5 = g4 = this.o;
        if (g4 == null) {
            g5 = h.c;
        }
        return g5;
    }

    @Override
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    @NotNull
    protected Object invokeSuspend(@NotNull Object object) {
        d<? super k0> d4 = u.e((Object)object);
        if (d4 != null) {
            this.o = new m((Throwable)d4, this.getContext());
        }
        if ((d4 = this.p) != null) {
            d4.resumeWith(object);
        }
        return b.f();
    }

    @Override
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}


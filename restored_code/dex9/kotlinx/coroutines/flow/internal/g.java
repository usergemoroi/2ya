/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$c
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.v
 *  kotlinx.coroutines.channels.a
 *  kotlinx.coroutines.flow.h
 *  kotlinx.coroutines.flow.i
 *  kotlinx.coroutines.flow.internal.f
 *  kotlinx.coroutines.k0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.internal.e;
import kotlinx.coroutines.flow.internal.f;
import kotlinx.coroutines.flow.internal.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\b\u001e\u0010\u001fJ&\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u00a4@\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0094@\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096@\u00a2\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0004X\u0085\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u00a8\u0006 "}, d2={"Lkotlinx/coroutines/flow/internal/g;", "S", "T", "Lkotlinx/coroutines/flow/internal/e;", "Lkotlinx/coroutines/flow/i;", "collector", "Lkotlin/coroutines/g;", "newContext", "Lkotlin/k0;", "q", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "r", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/v;", "scope", "i", "(Lkotlinx/coroutines/channels/v;Lkotlin/coroutines/d;)Ljava/lang/Object;", "collect", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/flow/h;", "f", "Lkotlinx/coroutines/flow/h;", "flow", "context", "", "capacity", "Lkotlinx/coroutines/channels/a;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/h;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public abstract class g<S, T>
extends e<T> {
    @JvmField
    @NotNull
    protected final h<S> f;

    public g(@NotNull h<? extends S> h4, @NotNull kotlin.coroutines.g g4, int n4, @NotNull a a4) {
        super(g4, n4, a4);
        this.f = h4;
    }

    static /* synthetic */ <S, T> Object o(g<S, T> object, i<? super T> i4, d<? super k0> d4) {
        if (((e)object).d == -3) {
            kotlin.coroutines.g g4 = d4.getContext();
            kotlin.coroutines.g g5 = kotlinx.coroutines.k0.j((kotlin.coroutines.g)g4, (kotlin.coroutines.g)((e)object).c);
            if (y.e((Object)g5, (Object)g4)) {
                if ((object = ((g)object).r(i4, d4)) == b.f()) {
                    return object;
                }
                return k0.a;
            }
            e.b b4 = kotlin.coroutines.e.A8;
            if (y.e((Object)g5.get((g.c)b4), (Object)g4.get((g.c)b4))) {
                if ((object = super.q(i4, g5, d4)) == b.f()) {
                    return object;
                }
                return k0.a;
            }
        }
        if ((object = super.collect(i4, d4)) == b.f()) {
            return object;
        }
        return k0.a;
    }

    static /* synthetic */ <S, T> Object p(g<S, T> object, kotlinx.coroutines.channels.v<? super T> v3, d<? super k0> d4) {
        if ((object = ((g)object).r(new z<T>(v3), d4)) == b.f()) {
            return object;
        }
        return k0.a;
    }

    private final Object q(i<? super T> i4, kotlin.coroutines.g g4, d<? super k0> d4) {
        return kotlinx.coroutines.flow.internal.f.c((kotlin.coroutines.g)g4, (Object)kotlinx.coroutines.flow.internal.f.a(i4, (kotlin.coroutines.g)d4.getContext()), null, (p)new p<i<? super T>, d<? super k0>, Object>(this, null){
            int l;
            Object m;
            final g<S, T> n;
            {
                this.n = g4;
                super(2, d4);
            }

            @Override
            public final d<k0> create(Object object, d<?> p4) {
                p4 = new /* invalid duplicate definition of identical inner class */;
                p4.m = object;
                return p4;
            }

            @Override
            public final Object invoke(i<? super T> i4, d<? super k0> d4) {
                return (this.create(i4, d4)).invokeSuspend(k0.a);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final Object invokeSuspend(Object g4) {
                Object object = b.f();
                int n4 = this.l;
                if (n4 != 0) {
                    if (n4 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    v.b(g4);
                    return k0.a;
                } else {
                    v.b(g4);
                    i i4 = (i)this.m;
                    g4 = this.n;
                    this.l = 1;
                    if (g4.r(i4, this) != object) return k0.a;
                    return object;
                }
            }
        }, d4, (int)4, null);
    }

    @Override
    @Nullable
    public Object collect(@NotNull i<? super T> i4, @NotNull d<? super k0> d4) {
        return g.o(this, i4, d4);
    }

    @Override
    @Nullable
    protected Object i(@NotNull kotlinx.coroutines.channels.v<? super T> v3, @NotNull d<? super k0> d4) {
        return g.p(this, v3, d4);
    }

    @Nullable
    protected abstract Object r(@NotNull i<? super T> var1, @NotNull d<? super k0> var2);

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f);
        stringBuilder.append(" -> ");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.k0
 *  kotlin.v
 *  kotlinx.coroutines.flow.i
 *  kotlinx.coroutines.flow.internal.f
 *  kotlinx.coroutines.internal.k0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR0\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2={"Lkotlinx/coroutines/flow/internal/c0;", "T", "Lkotlinx/coroutines/flow/i;", "value", "Lkotlin/k0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "c", "Lkotlin/coroutines/g;", "emitContext", "", "d", "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "e", "Lkotlin/jvm/functions/p;", "emitRef", "downstream", "<init>", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class c0<T>
implements i<T> {
    @NotNull
    private final g c;
    @NotNull
    private final Object d;
    @NotNull
    private final p<T, d<? super k0>, Object> e;

    public c0(@NotNull i<? super T> i4, @NotNull g g4) {
        this.c = g4;
        this.d = kotlinx.coroutines.internal.k0.g((g)g4);
        this.e = new p<T, d<? super k0>, Object>(i4, null){
            int l;
            Object m;
            final i<T> n;
            {
                this.n = i4;
                super(2, d4);
            }

            @Override
            public final d<k0> create(Object object, d<?> p4) {
                p4 = new /* invalid duplicate definition of identical inner class */;
                p4.m = object;
                return p4;
            }

            @Override
            public final Object invoke(T t3, d<? super k0> d4) {
                return (this.create(t3, d4)).invokeSuspend(k0.a);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final Object invokeSuspend(Object object) {
                Object object2 = b.f();
                int n4 = this.l;
                if (n4 != 0) {
                    if (n4 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    v.b((Object)object);
                    return k0.a;
                } else {
                    v.b((Object)object);
                    object = this.m;
                    i i4 = this.n;
                    this.l = 1;
                    if (i4.emit(object, (d)this) != object2) return k0.a;
                    return object2;
                }
            }
        };
    }

    @Nullable
    public Object emit(T object, @NotNull d<? super k0> d4) {
        if ((object = f.b((g)this.c, object, (Object)this.d, this.e, d4)) == b.f()) {
            return object;
        }
        return k0.a;
    }
}


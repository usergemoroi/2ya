/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.j
 *  kotlin.k0
 *  kotlin.v
 *  kotlinx.coroutines.flow.i
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.j;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.flow.g0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BD\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b\u00a2\u0006\u0002\b\u000f\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\tR;\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b\u00a2\u0006\u0002\b\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0016X\u0096\u0005\u00a8\u0006\u0017"}, d2={"Lkotlinx/coroutines/flow/v0;", "T", "Lkotlinx/coroutines/flow/g0;", "Lkotlinx/coroutines/flow/i;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "Lkotlinx/coroutines/flow/g0;", "sharedFlow", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "Lkotlin/k0;", "", "Lkotlin/ExtensionFunctionType;", "d", "Lkotlin/jvm/functions/p;", "action", "", "replayCache", "<init>", "(Lkotlinx/coroutines/flow/g0;Lkotlin/jvm/functions/p;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class v0<T>
implements g0<T> {
    @NotNull
    private final g0<T> c;
    @NotNull
    private final p<i<? super T>, d<? super k0>, Object> d;

    public v0(@NotNull g0<? extends T> g02, @NotNull p<? super i<? super T>, ? super d<? super k0>, ? extends Object> p4) {
        this.c = g02;
        this.d = p4;
    }

    @Override
    @NotNull
    public List<T> a() {
        return this.c.a();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    @Nullable
    public Object collect(@NotNull i<? super T> var1_1, @NotNull d<?> var2_2) {
        if (!(var2_2 instanceof a)) ** GOTO lbl-1000
        var4_3 = var2_2;
        var3_4 = var4_3.n;
        if ((var3_4 & -2147483648) != 0) {
            var4_3.n = var3_4 + -2147483648;
            var2_2 = var4_3;
        } else // 2 sources

        {
            var2_2 = new kotlin.coroutines.jvm.internal.d(this, (d<? super a>)var2_2){
                Object l;
                final v0<T> m;
                int n;
                {
                    this.m = v02;
                    super(d4);
                }

                @Override
                @Nullable
                public final Object invokeSuspend(@NotNull Object object) {
                    this.l = object;
                    this.n |= Integer.MIN_VALUE;
                    return this.m.collect(null, this);
                }
            };
        }
        var5_5 = var2_2.l;
        var4_3 = b.f();
        var3_4 = var2_2.n;
        if (var3_4 != 0) {
            if (var3_4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b((Object)var5_5);
        } else {
            v.b((Object)var5_5);
            var5_5 = this.c;
            var1_1 = new u0<T>(var1_1, this.d);
            var2_2.n = 1;
            if (var5_5.collect(var1_1, (d<?>)var2_2) == var4_3) {
                return var4_3;
            }
        }
        throw new j();
    }
}


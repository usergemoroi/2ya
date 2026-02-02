/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.k0
 *  kotlin.v
 *  kotlinx.coroutines.flow.h
 *  kotlinx.coroutines.flow.i
 *  kotlinx.coroutines.g2
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.flow.c;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.g2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2={"Lkotlinx/coroutines/flow/d;", "T", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/i;", "collector", "Lkotlin/k0;", "collect", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/h;", "c", "Lkotlinx/coroutines/flow/h;", "flow", "<init>", "(Lkotlinx/coroutines/flow/h;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class d<T>
implements c<T> {
    @NotNull
    private final h<T> c;

    public d(@NotNull h<? extends T> h4) {
        this.c = h4;
    }

    @Nullable
    public Object collect(@NotNull i<? super T> object, @NotNull kotlin.coroutines.d<? super k0> d4) {
        if ((object = this.c.collect(new i(object){
            final i<T> c;
            {
                this.c = i4;
            }

            /*
             * Unable to fully structure code
             */
            public final Object emit(T var1_1, kotlin.coroutines.d<? super k0> var2_2) {
                if (!(var2_2 instanceof a)) ** GOTO lbl-1000
                var4_3 = var2_2;
                var3_4 = var4_3.n;
                if ((var3_4 & -2147483648) != 0) {
                    var4_3.n = var3_4 + -2147483648;
                    var2_2 = var4_3;
                } else // 2 sources

                {
                    var2_2 = new kotlin.coroutines.jvm.internal.d(this, (kotlin.coroutines.d<? super a>)var2_2){
                        Object l;
                        final a<T> m;
                        int n;
                        {
                            this.m = a4;
                            super(d4);
                        }

                        @Override
                        public final Object invokeSuspend(Object object) {
                            this.l = object;
                            this.n |= Integer.MIN_VALUE;
                            return this.m.emit(null, this);
                        }
                    };
                }
                var5_5 = var2_2.l;
                var4_3 = b.f();
                var3_4 = var2_2.n;
                if (var3_4 == 0) ** GOTO lbl17
                if (var3_4 == 1) {
                    v.b((Object)var5_5);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl17:

                    v.b((Object)var5_5);
                    g2.k((g)var2_2.getContext());
                    var5_5 = this.c;
                    var2_2.n = 1;
                    if (var5_5.emit(var1_1, (kotlin.coroutines.d)var2_2) == var4_3) {
                        return var4_3;
                    }
                }
                return k0.a;
            }
        }, d4)) == b.f()) {
            return object;
        }
        return k0.a;
    }
}


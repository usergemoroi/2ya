/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.k0
 *  kotlin.v
 *  kotlinx.coroutines.ExperimentalCoroutinesApi
 *  kotlinx.coroutines.flow.h
 *  kotlinx.coroutines.flow.i
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.flow.c;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u00a6@\u00a2\u0006\u0004\b\t\u0010\b\u00a8\u0006\f"}, d2={"Lkotlinx/coroutines/flow/a;", "T", "Lkotlinx/coroutines/flow/h;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/i;", "collector", "Lkotlin/k0;", "collect", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "g", "<init>", "()V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@ExperimentalCoroutinesApi
public abstract class a<T>
implements h<T>,
c<T> {
    /*
     * Unable to fully structure code
     */
    @Nullable
    public final Object collect(@NotNull i<? super T> var1_1, @NotNull d<? super k0> var2_2) {
        block9: {
            block8: {
                if (!(var2_2 instanceof a)) ** GOTO lbl-1000
                var4_6 = var2_2;
                var3_7 = var4_6.o;
                if ((var3_7 & -2147483648) != 0) {
                    var4_6.o = var3_7 + -2147483648;
                    var2_2 = var4_6;
                } else // 2 sources

                {
                    var2_2 = new kotlin.coroutines.jvm.internal.d(this, (d<? super a>)var2_2){
                        Object l;
                        Object m;
                        final a<T> n;
                        int o;
                        {
                            this.n = a4;
                            super(d4);
                        }

                        @Override
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object object) {
                            this.m = object;
                            this.o |= Integer.MIN_VALUE;
                            return this.n.collect(null, this);
                        }
                    };
                }
                var5_8 = var2_2.m;
                var4_6 = b.f();
                var3_7 = var2_2.o;
                if (var3_7 != 0) {
                    if (var3_7 == 1) {
                        var1_1 = (kotlinx.coroutines.flow.internal.v<T>)var2_2.l;
                        try {
                            v.b((Object)var5_8);
                            break block8;
                        }
                        catch (Throwable var2_3) {
                            break block9;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b((Object)var5_8);
                var1_1 = new kotlinx.coroutines.flow.internal.v<T>(var1_1, var2_2.getContext());
                try {
                    var2_2.l = var1_1;
                    var2_2.o = 1;
                    var2_2 = this.g(var1_1, (d<k0>)var2_2);
                    if (var2_2 != var4_6) break block8;
                    return var4_6;
                }
                catch (Throwable var2_4) {
                    // empty catch block
                }
            }
            var1_1.releaseIntercepted();
            return k0.a;
        }
        var1_1.releaseIntercepted();
        throw var2_5;
    }

    @Nullable
    public abstract Object g(@NotNull i<? super T> var1, @NotNull d<? super k0> var2);
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.j
 *  kotlin.jvm.internal.p0
 *  kotlin.k0
 *  kotlin.v
 *  kotlinx.coroutines.flow.h
 *  kotlinx.coroutines.flow.i
 *  kotlinx.coroutines.flow.j
 *  kotlinx.coroutines.flow.k0
 *  kotlinx.coroutines.flow.m0
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.p0;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.q0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\f\u0010\rJ#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2={"Lkotlinx/coroutines/flow/o0;", "Lkotlinx/coroutines/flow/m0;", "Lkotlinx/coroutines/flow/q0;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/h;", "Lkotlinx/coroutines/flow/k0;", "a", "(Lkotlinx/coroutines/flow/q0;)Lkotlinx/coroutines/flow/h;", "", "toString", "()Ljava/lang/String;", "<init>", "()V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class o0
implements m0 {
    @NotNull
    public h<kotlinx.coroutines.flow.k0> a(@NotNull q0<Integer> q02) {
        return j.E((p)new p<i<? super kotlinx.coroutines.flow.k0>, d<? super k0>, Object>(q02, null){
            int l;
            private Object m;
            final q0<Integer> n;
            {
                this.n = q02;
                super(2, d4);
            }

            @Override
            public final d<k0> create(Object object, d<?> p4) {
                p4 = new /* invalid duplicate definition of identical inner class */;
                p4.m = object;
                return p4;
            }

            @Override
            public final Object invoke(i<? super kotlinx.coroutines.flow.k0> i4, d<? super k0> d4) {
                return (this.create(i4, d4)).invokeSuspend(k0.a);
            }

            @Override
            public final Object invokeSuspend(Object q02) {
                Object object = b.f();
                int n4 = this.l;
                if (n4 != 0) {
                    if (n4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b((Object)q02);
                } else {
                    v.b((Object)q02);
                    i i4 = (i)this.m;
                    p0 p02 = new p0();
                    q02 = this.n;
                    i4 = new i(p02, (i<? super kotlinx.coroutines.flow.k0>)i4){
                        final p0 c;
                        final i<kotlinx.coroutines.flow.k0> d;
                        {
                            this.c = p02;
                            this.d = i4;
                        }

                        /*
                         * Unable to fully structure code
                         */
                        public final Object a(int var1_1, d<? super k0> var2_2) {
                            block8: {
                                block7: {
                                    block5: {
                                        block6: {
                                            if (!(var2_2 instanceof a)) ** GOTO lbl-1000
                                            var4_3 = var2_2;
                                            var3_4 = var4_3.n;
                                            if ((var3_4 & -2147483648) != 0) {
                                                var4_3.n = var3_4 + -2147483648;
                                                var2_2 = var4_3;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var2_2 = new kotlin.coroutines.jvm.internal.d(this, (d<? super a>)var2_2){
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
                                                        return this.m.a(0, this);
                                                    }
                                                };
                                            }
                                            var5_5 = var2_2.l;
                                            var4_3 = b.f();
                                            var3_4 = var2_2.n;
                                            if (var3_4 == 0) break block5;
                                            if (var3_4 != 1) break block6;
                                            v.b((Object)var5_5);
                                            break block7;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    v.b((Object)var5_5);
                                    if (var1_1 > 0) {
                                        var5_5 = this.c;
                                        if (!var5_5.c) {
                                            var5_5.c = true;
                                            var6_6 = this.d;
                                            var5_5 = kotlinx.coroutines.flow.k0.c;
                                            var2_2.n = 1;
                                            if (var6_6.emit(var5_5, (d)var2_2) == var4_3) {
                                                return var4_3;
                                            } else {
                                                ** GOTO lbl30
                                            }
                                        }
                                    }
                                    break block8;
                                }
                                return k0.a;
                            }
                            return k0.a;
                        }
                    };
                    this.l = 1;
                    if (q02.collect(i4, this) == object) {
                        return object;
                    }
                }
                throw new kotlin.j();
            }
        });
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Lazily";
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.u0
 *  kotlin.k0
 *  kotlin.v
 *  kotlinx.coroutines.channels.a
 *  kotlinx.coroutines.flow.h
 *  kotlinx.coroutines.flow.i
 *  kotlinx.coroutines.flow.internal.k
 *  kotlinx.coroutines.i
 *  kotlinx.coroutines.q0
 *  kotlinx.coroutines.r0
 *  kotlinx.coroutines.s0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.u0;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.internal.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.internal.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bw\u0012B\u0010\u001b\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0012\u00a2\u0006\u0002\b\u0018\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0094@\u00a2\u0006\u0004\b\u0010\u0010\u0011RP\u0010\u001b\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0012\u00a2\u0006\u0002\b\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u00a8\u0006 "}, d2={"Lkotlinx/coroutines/flow/internal/i;", "T", "R", "Lkotlinx/coroutines/flow/internal/g;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/a;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/e;", "j", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)Lkotlinx/coroutines/flow/internal/e;", "Lkotlinx/coroutines/flow/i;", "collector", "Lkotlin/k0;", "r", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/d;", "", "Lkotlin/ExtensionFunctionType;", "g", "Lkotlin/jvm/functions/q;", "transform", "Lkotlinx/coroutines/flow/h;", "flow", "<init>", "(Lkotlin/jvm/functions/q;Lkotlinx/coroutines/flow/h;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
public final class i<T, R>
extends g<T, R> {
    @NotNull
    private final q<kotlinx.coroutines.flow.i<? super R>, T, d<? super k0>, Object> g;

    public i(@NotNull q<? super kotlinx.coroutines.flow.i<? super R>, ? super T, ? super d<? super k0>, ? extends Object> q4, @NotNull h<? extends T> h4, @NotNull kotlin.coroutines.g g4, int n4, @NotNull kotlinx.coroutines.channels.a a4) {
        super(h4, g4, n4, a4);
        this.g = q4;
    }

    public /* synthetic */ i(q q4, h h4, kotlin.coroutines.g g4, int n4, kotlinx.coroutines.channels.a a4, int n5, p p4) {
        if ((n5 & 4) != 0) {
            g4 = kotlin.coroutines.h.c;
        }
        if ((n5 & 8) != 0) {
            n4 = -2;
        }
        if ((n5 & 0x10) != 0) {
            a4 = kotlinx.coroutines.channels.a.c;
        }
        this(q4, h4, g4, n4, a4);
    }

    @Override
    @NotNull
    protected e<R> j(@NotNull kotlin.coroutines.g g4, int n4, @NotNull kotlinx.coroutines.channels.a a4) {
        return new i<T, R>(this.g, this.f, g4, n4, a4);
    }

    @Override
    @Nullable
    protected Object r(@NotNull kotlinx.coroutines.flow.i<? super R> object, @NotNull d<? super k0> d4) {
        if ((object = r0.g((kotlin.jvm.functions.p)new kotlin.jvm.functions.p<q0, d<? super k0>, Object>(this, object, null){
            int l;
            private Object m;
            final i<T, R> n;
            final kotlinx.coroutines.flow.i<R> o;
            {
                this.n = i4;
                this.o = i5;
                super(2, d4);
            }

            @Override
            public final d<k0> create(Object object, d<?> p4) {
                p4 = new /* invalid duplicate definition of identical inner class */;
                p4.m = object;
                return p4;
            }

            @Override
            public final Object invoke(q0 q02, d<? super k0> d4) {
                return (this.create(q02, d4)).invokeSuspend(k0.a);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final Object invokeSuspend(Object h4) {
                Object object = kotlin.coroutines.intrinsics.b.f();
                int n4 = this.l;
                if (n4 != 0) {
                    if (n4 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    v.b(h4);
                    return k0.a;
                } else {
                    v.b(h4);
                    q0 q02 = (q0)this.m;
                    u0 u02 = new u0();
                    i i4 = this.n;
                    h4 = i4.f;
                    kotlinx.coroutines.flow.i i5 = new kotlinx.coroutines.flow.i((u0<d2>)u02, q02, i4, this.o){
                        final u0<d2> c;
                        final q0 d;
                        final i<T, R> e;
                        final kotlinx.coroutines.flow.i<R> f;
                        {
                            this.c = u02;
                            this.d = q02;
                            this.e = i4;
                            this.f = i5;
                        }

                        /*
                         * Unable to fully structure code
                         * Could not resolve type clashes
                         */
                        public final Object emit(T var1_1, d<? super k0> var2_2) {
                            if (!(var2_2 instanceof b)) ** GOTO lbl-1000
                            var4_3 = var2_2;
                            var3_4 = var4_3.q;
                            if ((var3_4 & -2147483648) != 0) {
                                var4_3.q = var3_4 + -2147483648;
                                var2_2 = var4_3;
                            } else // 2 sources

                            {
                                var2_2 = new kotlin.coroutines.jvm.internal.d(this, (d<? super b>)var2_2){
                                    Object l;
                                    Object m;
                                    Object n;
                                    Object o;
                                    final a<T> p;
                                    int q;
                                    {
                                        this.p = a4;
                                        super(d4);
                                    }

                                    @Override
                                    public final Object invokeSuspend(Object object) {
                                        this.o = object;
                                        this.q |= Integer.MIN_VALUE;
                                        return this.p.emit(null, this);
                                    }
                                };
                            }
                            var5_5 = var2_2.o;
                            var4_3 = kotlin.coroutines.intrinsics.b.f();
                            var3_4 = var2_2.q;
                            if (var3_4 == 0) ** GOTO lbl21
                            if (var3_4 == 1) {
                                var1_1 /* !! */  = (d2)var2_2.n;
                                var4_3 = var2_2.m;
                                var1_1 /* !! */  = var2_2.l;
                                v.b((Object)var5_5);
                                var2_2 = var4_3;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl21:

                                v.b((Object)var5_5);
                                var5_5 = (d2)this.c.c;
                                if (var5_5 != null) {
                                    var5_5.cancel((CancellationException)new k());
                                    var2_2.l = this;
                                    var2_2.m = var1_1 /* !! */ ;
                                    var2_2.n = var5_5;
                                    var2_2.q = 1;
                                    if (var5_5.C((d<? super k0>)var2_2) == var4_3) {
                                        return var4_3;
                                    }
                                }
                                var4_3 = this;
                                var2_2 = var1_1 /* !! */ ;
                                var1_1 /* !! */  = var4_3;
                            }
                            var1_1 /* !! */ .c.c = kotlinx.coroutines.i.d((q0)var1_1 /* !! */ .d, null, (s0)s0.f, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<q0, d<? super k0>, Object>(var1_1 /* !! */ .e, var1_1 /* !! */ .f, var2_2, null){
                                int l;
                                final i<T, R> m;
                                final kotlinx.coroutines.flow.i<R> n;
                                final T o;
                                {
                                    this.m = i4;
                                    this.n = i5;
                                    this.o = t3;
                                    super(2, d4);
                                }

                                @Override
                                public final d<k0> create(Object object, d<?> d4) {
                                    return new /* invalid duplicate definition of identical inner class */;
                                }

                                @Override
                                public final Object invoke(q0 q02, d<? super k0> d4) {
                                    return (this.create(q02, d4)).invokeSuspend(k0.a);
                                }

                                /*
                                 * Enabled force condition propagation
                                 * Lifted jumps to return sites
                                 */
                                @Override
                                public final Object invokeSuspend(Object i4) {
                                    Object object = kotlin.coroutines.intrinsics.b.f();
                                    int n4 = this.l;
                                    if (n4 != 0) {
                                        if (n4 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        v.b(i4);
                                        return k0.a;
                                    } else {
                                        v.b(i4);
                                        q q4 = this.m.g;
                                        i4 = this.n;
                                        Object t3 = this.o;
                                        this.l = 1;
                                        if (q4.invoke(i4, t3, this) != object) return k0.a;
                                        return object;
                                    }
                                }
                            }, (int)1, null);
                            return k0.a;
                        }
                    };
                    this.l = 1;
                    if (h4.collect(i5, (d)this) != object) return k0.a;
                    return object;
                }
            }
        }, d4)) == kotlin.coroutines.intrinsics.b.f()) {
            return object;
        }
        return k0.a;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.u0
 *  kotlin.k0
 *  kotlin.v
 *  kotlinx.coroutines.flow.h
 *  kotlinx.coroutines.flow.i
 *  kotlinx.coroutines.flow.internal.t
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.u0;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.internal.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002Bg\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012:\u0010\u0018\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\f\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\f\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000eRH\u0010\u0018\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\f\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\f\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u00108\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001b"}, d2={"Lkotlinx/coroutines/flow/g;", "T", "Lkotlinx/coroutines/flow/h;", "Lkotlinx/coroutines/flow/i;", "collector", "Lkotlin/k0;", "collect", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "Lkotlinx/coroutines/flow/h;", "upstream", "Lkotlin/Function1;", "", "d", "Lkotlin/jvm/functions/l;", "keySelector", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "", "e", "Lkotlin/jvm/functions/p;", "areEquivalent", "<init>", "(Lkotlinx/coroutines/flow/h;Lkotlin/jvm/functions/l;Lkotlin/jvm/functions/p;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class g<T>
implements h<T> {
    @NotNull
    private final h<T> c;
    @JvmField
    @NotNull
    public final l<T, Object> d;
    @JvmField
    @NotNull
    public final p<Object, Object, Boolean> e;

    public g(@NotNull h<? extends T> h4, @NotNull l<? super T, ? extends Object> l4, @NotNull p<Object, Object, Boolean> p4) {
        this.c = h4;
        this.d = l4;
        this.e = p4;
    }

    @Nullable
    public Object collect(@NotNull i<? super T> object, @NotNull d<? super k0> d4) {
        u0 u02 = new u0();
        u02.c = t.a;
        if ((object = this.c.collect(new i(this, (u0<Object>)u02, object){
            final g<T> c;
            final u0<Object> d;
            final i<T> e;
            {
                this.c = g4;
                this.d = u02;
                this.e = i4;
            }

            /*
             * Unable to fully structure code
             */
            public final Object emit(T var1_1, d<? super k0> var2_2) {
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
                    // 1 sources

                    v.b((Object)var5_5);
                    var6_6 = this.c.d.invoke(var1_1);
                    var5_5 = this.d.c;
                    if (var5_5 != t.a && this.c.e.invoke(var5_5, var6_6).booleanValue()) {
                        return k0.a;
                    }
                    this.d.c = var6_6;
                    var5_5 = this.e;
                    var2_2.n = 1;
                    if (var5_5.emit(var1_1, (d)var2_2) == var4_3) {
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


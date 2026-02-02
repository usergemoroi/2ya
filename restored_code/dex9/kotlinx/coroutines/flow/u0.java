/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.k0
 *  kotlin.v
 *  kotlinx.coroutines.flow.i
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.flow.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BD\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u000f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t\u00a2\u0006\u0002\b\f\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u0003H\u0086@\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0007R;\u0010\u000f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t\u00a2\u0006\u0002\b\f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2={"Lkotlinx/coroutines/flow/u0;", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/k0;", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "Lkotlinx/coroutines/flow/i;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/ExtensionFunctionType;", "d", "Lkotlin/jvm/functions/p;", "action", "<init>", "(Lkotlinx/coroutines/flow/i;Lkotlin/jvm/functions/p;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,425:1\n326#2:426\n*S KotlinDebug\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n*L\n416#1:426\n*E\n"})
public final class u0<T>
implements i<T> {
    @NotNull
    private final i<T> c;
    @NotNull
    private final p<i<? super T>, d<? super k0>, Object> d;

    public u0(@NotNull i<? super T> i4, @NotNull p<? super i<? super T>, ? super d<? super k0>, ? extends Object> p4) {
        this.c = i4;
        this.d = p4;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final Object a(@NotNull d<? super k0> var1_1) {
        block9: {
            block8: {
                if (!(var1_1 instanceof a)) ** GOTO lbl-1000
                var3_3 = var1_1;
                var2_4 = var3_3.p;
                if ((var2_4 & -2147483648) != 0) {
                    var3_3.p = var2_4 + -2147483648;
                    var1_1 = var3_3;
                } else // 2 sources

                {
                    var1_1 = new kotlin.coroutines.jvm.internal.d(this, var1_1){
                        Object l;
                        Object m;
                        Object n;
                        final u0<T> o;
                        int p;
                        {
                            this.o = u02;
                            super(d4);
                        }

                        @Override
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object object) {
                            this.n = object;
                            this.p |= Integer.MIN_VALUE;
                            return this.o.a(this);
                        }
                    };
                }
                var7_5 = var1_1.n;
                var6_6 = b.f();
                var2_4 = var1_1.p;
                if (var2_4 != 0) {
                    if (var2_4 != 1) {
                        if (var2_4 != 2) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        v.b((Object)var7_5);
                        return k0.a;
                    }
                    var4_7 = (kotlinx.coroutines.flow.internal.v<T>)var1_1.m;
                    var5_8 = (u0)var1_1.l;
                    var3_3 = var4_7;
                    try {
                        v.b((Object)var7_5);
                        var3_3 = var5_8;
                        break block8;
                    }
                    catch (Throwable var1_2) {
                        break block9;
                    }
                }
                v.b((Object)var7_5);
                var4_7 = new kotlinx.coroutines.flow.internal.v<T>(this.c, var1_1.getContext());
                var3_3 = var4_7;
                {
                    var5_9 = this.d;
                    var3_3 = var4_7;
                    var1_1.l = this;
                    var3_3 = var4_7;
                    var1_1.m = var4_7;
                    var3_3 = var4_7;
                    var1_1.p = 1;
                    var3_3 = var4_7;
                    var5_9 = var5_9.invoke(var4_7, (d<? super k0>)var1_1);
                    if (var5_9 == var6_6) {
                        return var6_6;
                    }
                    var3_3 = this;
                }
            }
            var4_7.releaseIntercepted();
            var3_3 = var3_3.c;
            if (var3_3 instanceof u0 == false) return k0.a;
            var3_3 = (u0)var3_3;
            var1_1.l = null;
            var1_1.m = null;
            var1_1.p = 2;
            if (var3_3.a(var1_1) != var6_6) return k0.a;
            return var6_6;
        }
        var3_3.releaseIntercepted();
        throw var1_2;
    }

    @Nullable
    public Object emit(T t3, @NotNull d<? super k0> d4) {
        return this.c.emit(t3, d4);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$c
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.v
 *  kotlinx.coroutines.channels.a
 *  kotlinx.coroutines.flow.h
 *  kotlinx.coroutines.flow.i
 *  kotlinx.coroutines.flow.internal.b
 *  kotlinx.coroutines.flow.internal.t
 *  kotlinx.coroutines.flow.s0
 *  kotlinx.coroutines.g2
 *  kotlinx.coroutines.internal.d0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.flow.c;
import kotlinx.coroutines.flow.c0;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.internal.b;
import kotlinx.coroutines.flow.internal.q;
import kotlinx.coroutines.flow.internal.t;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.flow.s0;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.flow.u0;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u00109\u001a\u00020\u0007\u00a2\u0006\u0004\b:\u00102J!\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u0000H\u0096@\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096@\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030!2\u0006\u0010 \u001a\u00020\u001fH\u0014\u00a2\u0006\u0004\b\"\u0010#J-\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'H\u0016\u00a2\u0006\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b,\u0010-R$\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00008V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00108\u001a\b\u0012\u0004\u0012\u00020\u0007078\u0002X\u0082\u0004\u00a8\u0006;"}, d2={"Lkotlinx/coroutines/flow/r0;", "T", "Lkotlinx/coroutines/flow/internal/b;", "Lkotlinx/coroutines/flow/t0;", "Lkotlinx/coroutines/flow/c0;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/q;", "", "expectedState", "newState", "", "r", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "expect", "update", "c", "value", "e", "(Ljava/lang/Object;)Z", "Lkotlin/k0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "d", "()V", "Lkotlinx/coroutines/flow/i;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "o", "()Lkotlinx/coroutines/flow/t0;", "", "size", "", "p", "(I)[Lkotlinx/coroutines/flow/t0;", "Lkotlin/coroutines/g;", "context", "capacity", "Lkotlinx/coroutines/channels/a;", "onBufferOverflow", "Lkotlinx/coroutines/flow/h;", "b", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)Lkotlinx/coroutines/flow/h;", "g", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "", "a", "()Ljava/util/List;", "replayCache", "Lkotlinx/atomicfu/AtomicRef;", "_state", "initialState", "<init>", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,433:1\n14#2:434\n14#2:442\n27#3:435\n27#3:439\n16#4:436\n16#4:440\n13346#5,2:437\n326#6:441\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n*L\n320#1:434\n401#1:442\n329#1:435\n357#1:439\n329#1:436\n357#1:440\n353#1:437,2\n390#1:441\n*E\n"})
final class r0<T>
extends b<t0>
implements c0<T>,
c<T>,
q<T> {
    private static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(r0.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    private int g;

    public r0(@NotNull Object object) {
        this._state$volatile = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean r(Object dArray, Object object2) {
        Throwable throwable3;
        int n4;
        block17: {
            synchronized (this) {
                Throwable throwable22;
                block16: {
                    block15: {
                        boolean bl;
                        Object v3;
                        block14: {
                            try {
                                v3 = r0.h.get(this);
                                if (dArray == null || (bl = y.e(v3, (Object)dArray))) break block14;
                            }
                            catch (Throwable throwable22) {}
                            return false;
                        }
                        bl = y.e(v3, (Object)object2);
                        if (!bl) break block15;
                        return true;
                    }
                    r0.h.set(this, object2);
                    n4 = this.g;
                    if ((n4 & 1) != 0) break block16;
                    ++n4;
                    this.g = n4;
                    dArray = this.n();
                    object2 = k0.a;
                    break block17;
                }
                this.g = n4 + 2;
                return true;
                throw throwable22;
            }
        }
        while (true) {
            int n5;
            if ((dArray = (t0[])dArray) != null) {
                for (Object object2 : dArray) {
                    if (object2 == null) continue;
                    ((t0)((Object)object2)).g();
                }
            }
            synchronized (this) {
                try {
                    n5 = this.g;
                    if (n5 == n4) {
                        this.g = n4 + 1;
                        return true;
                    }
                }
                catch (Throwable throwable3) {
                    break;
                }
                dArray = this.n();
                object2 = k0.a;
            }
            n4 = n5;
        }
        {
            throw throwable3;
        }
    }

    @Override
    @NotNull
    public List<T> a() {
        return kotlin.collections.t.e(this.getValue());
    }

    @Override
    @NotNull
    public h<T> b(@NotNull g g4, int n4, @NotNull kotlinx.coroutines.channels.a a4) {
        return s0.d((q0)this, (g)g4, (int)n4, (kotlinx.coroutines.channels.a)a4);
    }

    @Override
    public boolean c(T object, T t3) {
        Object object2 = object;
        if (object == null) {
            object2 = t.a;
        }
        object = t3;
        if (t3 == null) {
            object = t.a;
        }
        return this.r(object2, object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @Nullable
    public Object collect(@NotNull i<? super T> var1_1, @NotNull d<?> var2_3) {
        block18: {
            block19: {
                block20: {
                    block21: {
                        block22: {
                            block23: {
                                if (!(var2_3 /* !! */  instanceof a)) ** GOTO lbl-1000
                                var4_4 = var2_3 /* !! */ ;
                                var3_5 = var4_4.s;
                                if ((var3_5 & -2147483648) != 0) {
                                    var4_4.s = var3_5 + -2147483648;
                                } else // 2 sources

                                {
                                    var4_4 = new kotlin.coroutines.jvm.internal.d(this, var2_3 /* !! */ ){
                                        Object l;
                                        Object m;
                                        Object n;
                                        Object o;
                                        Object p;
                                        Object q;
                                        final r0<T> r;
                                        int s;
                                        {
                                            this.r = r02;
                                            super(d4);
                                        }

                                        @Override
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object object) {
                                            this.q = object;
                                            this.s |= Integer.MIN_VALUE;
                                            return this.r.collect(null, this);
                                        }
                                    };
                                }
                                var12_6 = var4_4.q;
                                var17_7 = kotlin.coroutines.intrinsics.b.f();
                                var3_5 = var4_4.s;
                                if (var3_5 == 0) break block21;
                                if (var3_5 == 1) break block22;
                                if (var3_5 == 2) break block23;
                                if (var3_5 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                var9_8 = var4_4.p;
                                var7_9 = (d2)var4_4.o;
                                var5_10 = (t0)var4_4.n;
                                var8_12 = (i)var4_4.m;
                                var6_13 = (r0)var4_4.l;
                                var2_3 /* !! */  = var5_10;
                                var1_1 = var6_13;
                                try {
                                    v.b((Object)var12_6);
                                    var12_6 = var4_4;

                                }
                                catch (Throwable var5_11) {
                                    var4_4 = var1_1;
                                    var1_1 = var5_11;
                                    break block18;
                                }
                            }
                            var11_14 = var4_4.p;
                            var14_15 = (d2)var4_4.o;
                            var5_10 = (t0)var4_4.n;
                            var15_16 = (i)var4_4.m;
                            var10_17 = (r0)var4_4.l;
                            var2_3 /* !! */  = var5_10;
                            var1_1 = var10_17;
                            {
                                v.b((Object)var12_6);
                                var13_18 = var4_4;
                                var4_4 = var5_10;

                            }
                        }
                        var5_10 = (t0)var4_4.n;
                        var7_9 = (r0)var4_4.m;
                        var6_13 = (r0)var4_4.l;
                        var2_3 /* !! */  = var5_10;
                        var1_1 = var6_13;
                        {
                            v.b((Object)var12_6);
                            break block19;
                        }
                    }
                    v.b((Object)var12_6);
                    var2_3 /* !! */  = (t0)this.i();
                    try {
                        if (!(var1_1 instanceof u0)) break block20;
                        var5_10 = (u0)var1_1;
                        var4_4.l = this;
                        var4_4.m = var1_1;
                        var4_4.n = var2_3 /* !! */ ;
                        var4_4.s = 1;
                        if ((var5_10 = var5_10.a((d<k0>)var4_4)) == var17_7) {
                            return var17_7;
                        }
                    }
                    catch (Throwable var1_2) {
                        var4_4 = this;
                        break block18;
                    }
                }
                var6_13 = this;
                var7_9 = var1_1;
                var5_10 = var2_3 /* !! */ ;
            }
            var2_3 /* !! */  = var5_10;
            var1_1 = var6_13;
            {
                var9_8 = (d2)var4_4.getContext().get((g.c)d2.C8);
                var8_12 = var7_9;
                var7_9 = var9_8;
                var9_8 = null;
                var12_6 = var4_4;
lbl79:

                while (true) {
                    block25: {
                        block24: {
                            var2_3 /* !! */  = var5_10;
                            var1_1 = var6_13;
                            var16_19 /* !! */  = r0.q().get(var6_13);
                            if (var7_9 != null) {
                                var2_3 /* !! */  = var5_10;
                                var1_1 = var6_13;
                                g2.l((d2)var7_9);
                            }
                            if (var9_8 == null) break block24;
                            var2_3 /* !! */  = var5_10;
                            var1_1 = var6_13;
                            var13_18 = var12_6;
                            var14_15 = var7_9;
                            var4_4 = var5_10;
                            var15_16 = var8_12;
                            var10_17 = var6_13;
                            var11_14 = var9_8;
                            if (y.e((Object)var9_8, var16_19 /* !! */ )) break block25;
                        }
                        var2_3 /* !! */  = var5_10;
                        var1_1 = var6_13;
                        var4_4 = var16_19 /* !! */  == t.a ? null : var16_19 /* !! */ ;
                        var2_3 /* !! */  = var5_10;
                        var1_1 = var6_13;
                        var12_6.l = var6_13;
                        var2_3 /* !! */  = var5_10;
                        var1_1 = var6_13;
                        var12_6.m = var8_12;
                        var2_3 /* !! */  = var5_10;
                        var1_1 = var6_13;
                        var12_6.n = var5_10;
                        var2_3 /* !! */  = var5_10;
                        var1_1 = var6_13;
                        var12_6.o = var7_9;
                        var2_3 /* !! */  = var5_10;
                        var1_1 = var6_13;
                        var12_6.p = var16_19 /* !! */ ;
                        var2_3 /* !! */  = var5_10;
                        var1_1 = var6_13;
                        var12_6.s = 2;
                        var2_3 /* !! */  = var5_10;
                        var1_1 = var6_13;
                        if (var8_12.emit(var4_4, (d)var12_6) == var17_7) {
                            return var17_7;
                        }
                        var11_14 = var16_19 /* !! */ ;
                        var10_17 = var6_13;
                        var15_16 = var8_12;
                        var4_4 = var5_10;
                        var14_15 = var7_9;
                        var13_18 = var12_6;
                    }
                    var2_3 /* !! */  = var4_4;
                    var1_1 = var10_17;
                    var12_6 = var13_18;
                    var7_9 = var14_15;
                    var5_10 = var4_4;
                    var8_12 = var15_16;
                    var6_13 = var10_17;
                    var9_8 = var11_14;
                    if (var4_4.h()) continue;
                    var2_3 /* !! */  = var4_4;
                    var1_1 = var10_17;
                    var13_18.l = var10_17;
                    var2_3 /* !! */  = var4_4;
                    var1_1 = var10_17;
                    var13_18.m = var15_16;
                    var2_3 /* !! */  = var4_4;
                    var1_1 = var10_17;
                    var13_18.n = var4_4;
                    var2_3 /* !! */  = var4_4;
                    var1_1 = var10_17;
                    var13_18.o = var14_15;
                    var2_3 /* !! */  = var4_4;
                    var1_1 = var10_17;
                    var13_18.p = var11_14;
                    var2_3 /* !! */  = var4_4;
                    var1_1 = var10_17;
                    var13_18.s = 3;
                    var2_3 /* !! */  = var4_4;
                    var1_1 = var10_17;
                    var16_19 /* !! */  = var4_4.e((d<? super k0>)var13_18);
                    var12_6 = var13_18;
                    var7_9 = var14_15;
                    var5_10 = var4_4;
                    var8_12 = var15_16;
                    var6_13 = var10_17;
                    var9_8 = var11_14;
                    if (var16_19 /* !! */  == var17_7) break;
                }
                return var17_7;
            }
        }
        var4_4.l(var2_3 /* !! */ );
        throw var1_1;
    }

    @Override
    public void d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override
    public boolean e(T t3) {
        this.setValue(t3);
        return true;
    }

    @Override
    @Nullable
    public Object emit(T t3, @NotNull d<? super k0> d4) {
        this.setValue(t3);
        return k0.a;
    }

    @Override
    public T getValue() {
        Object v3;
        d0 d02 = t.a;
        Object v4 = v3 = r0.h.get(this);
        if (v3 == d02) {
            v4 = null;
        }
        return (T)v4;
    }

    @NotNull
    protected t0 o() {
        return new t0();
    }

    @NotNull
    protected t0[] p(int n4) {
        return new t0[n4];
    }

    @Override
    public void setValue(T t3) {
        Object object = t3;
        if (t3 == null) {
            object = t.a;
        }
        this.r(null, object);
    }
}


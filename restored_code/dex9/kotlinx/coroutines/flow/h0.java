/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$c
 *  kotlin.coroutines.jvm.internal.g
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.r
 *  kotlin.u
 *  kotlin.u$a
 *  kotlin.v
 *  kotlinx.coroutines.channels.a
 *  kotlinx.coroutines.flow.h
 *  kotlinx.coroutines.flow.h0$b
 *  kotlinx.coroutines.flow.i
 *  kotlinx.coroutines.flow.i0
 *  kotlinx.coroutines.flow.internal.b
 *  kotlinx.coroutines.flow.internal.c
 *  kotlinx.coroutines.flow.internal.d
 *  kotlinx.coroutines.g2
 *  kotlinx.coroutines.i1
 *  kotlinx.coroutines.internal.d0
 *  kotlinx.coroutines.r
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.u;
import kotlin.v;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.flow.b0;
import kotlinx.coroutines.flow.g0;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.i0;
import kotlinx.coroutines.flow.internal.d;
import kotlinx.coroutines.flow.internal.q;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u0;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.p;
import kotlinx.coroutines.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010 \n\u0002\b\u0015\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001dB\u001f\u0012\u0006\u0010S\u001a\u00020\u001d\u0012\u0006\u0010U\u001a\u00020\u001d\u0012\u0006\u0010'\u001a\u00020&\u00a2\u0006\u0004\bv\u0010wJ\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096@\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00028\u0000H\u0096@\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00180\u00172\u0006\u0010\u0016\u001a\u00020\u0013H\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0014\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b!\u0010\"J-\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020&H\u0016\u00a2\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\b+\u0010\u000fJ\u0017\u0010\u0001\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\b\u0001\u0010\u000fJ\u000f\u0010,\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b,\u0010\"J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u000100H\u0002\u00a2\u0006\u0004\b2\u00103J9\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00172\u0010\u00104\u001a\f\u0012\u0006\u0012\u0004\u0018\u000100\u0018\u00010\u00172\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u00020\u00102\u0006\u0010\f\u001a\u00028\u0000H\u0082@\u00a2\u0006\u0004\b9\u0010\u0012J\u0017\u0010<\u001a\u00020\u00102\u0006\u0010;\u001a\u00020:H\u0002\u00a2\u0006\u0004\b<\u0010=J/\u0010B\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\bD\u0010\"J\u0019\u0010F\u001a\u0004\u0018\u0001002\u0006\u0010E\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bH\u0010IJ\u0019\u0010K\u001a\u0004\u0018\u0001002\u0006\u0010J\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\bM\u0010NJ3\u0010P\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00180\u00172\u0014\u0010O\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00180\u0017H\u0002\u00a2\u0006\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bR\u00102R\u0014\u0010U\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bT\u00102R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bV\u0010WR \u0010Z\u001a\f\u0012\u0006\u0012\u0004\u0018\u000100\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b[\u0010PR\u0016\u0010^\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b]\u0010PR\u0016\u0010`\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b_\u00102R\u0016\u0010b\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\ba\u00102R\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bd\u0010eR\u001a\u0010j\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\f\u0012\u0004\bi\u0010\"\u001a\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bk\u0010\u0015R\u0014\u0010o\u001a\u00020\u001d8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020\u001d8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bp\u0010nR\u0014\u0010s\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\br\u0010\u0015R\u0014\u0010u\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bt\u0010\u0015\u00a8\u0006x"}, d2={"Lkotlinx/coroutines/flow/h0;", "T", "Lkotlinx/coroutines/flow/internal/b;", "Lkotlinx/coroutines/flow/j0;", "Lkotlinx/coroutines/flow/b0;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/q;", "Lkotlinx/coroutines/flow/i;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "value", "", "e", "(Ljava/lang/Object;)Z", "Lkotlin/k0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "Y", "()J", "oldIndex", "", "Lkotlin/coroutines/d;", "X", "(J)[Lkotlin/coroutines/d;", "D", "()Lkotlinx/coroutines/flow/j0;", "", "size", "E", "(I)[Lkotlinx/coroutines/flow/j0;", "d", "()V", "Lkotlin/coroutines/g;", "context", "capacity", "Lkotlinx/coroutines/channels/a;", "onBufferOverflow", "Lkotlinx/coroutines/flow/h;", "b", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)Lkotlinx/coroutines/flow/h;", "S", "F", "newHead", "C", "(J)V", "", "item", "I", "(Ljava/lang/Object;)V", "curBuffer", "curSize", "newSize", "R", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "H", "Lkotlinx/coroutines/flow/h0$a;", "emitter", "z", "(Lkotlinx/coroutines/flow/h0$a;)V", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "W", "(JJJJ)V", "A", "slot", "V", "(Lkotlinx/coroutines/flow/j0;)Ljava/lang/Object;", "U", "(Lkotlinx/coroutines/flow/j0;)J", "index", "N", "(J)Ljava/lang/Object;", "y", "(Lkotlinx/coroutines/flow/j0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "resumesIn", "J", "([Lkotlin/coroutines/d;)[Lkotlin/coroutines/d;", "g", "replay", "h", "bufferCapacity", "i", "Lkotlinx/coroutines/channels/a;", "j", "[Ljava/lang/Object;", "buffer", "k", "replayIndex", "l", "minCollectorIndex", "m", "bufferSize", "n", "queueSize", "", "a", "()Ljava/util/List;", "replayCache", "M", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "lastReplayedLocked", "L", "head", "P", "()I", "replaySize", "Q", "totalSize", "K", "bufferEndIndex", "O", "queueEndIndex", "<init>", "(IILkotlinx/coroutines/channels/a;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,746:1\n27#2:747\n27#2:750\n27#2:769\n27#2:773\n27#2:782\n27#2:793\n27#2:804\n16#3:748\n16#3:751\n16#3:770\n16#3:774\n16#3:783\n16#3:794\n16#3:805\n326#4:749\n1#5:752\n91#6,2:753\n93#6,2:756\n95#6:759\n91#6,2:775\n93#6,2:778\n95#6:781\n91#6,2:797\n93#6,2:800\n95#6:803\n13346#7:755\n13347#7:758\n13346#7:777\n13347#7:780\n13346#7:799\n13347#7:802\n351#8,9:760\n360#8,2:771\n351#8,9:784\n360#8,2:795\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n366#1:747\n406#1:750\n500#1:769\n521#1:773\n641#1:782\n676#1:793\n704#1:804\n366#1:748\n406#1:751\n500#1:770\n521#1:774\n641#1:783\n676#1:794\n704#1:805\n388#1:749\n468#1:753,2\n468#1:756,2\n468#1:759\n544#1:775,2\n544#1:778,2\n544#1:781\n691#1:797,2\n691#1:800,2\n691#1:803\n468#1:755\n468#1:758\n544#1:777\n544#1:780\n691#1:799\n691#1:802\n498#1:760,9\n498#1:771,2\n675#1:784,9\n675#1:795,2\n*E\n"})
public class h0<T>
extends kotlinx.coroutines.flow.internal.b<j0>
implements b0<T>,
kotlinx.coroutines.flow.c<T>,
q<T> {
    private final int g;
    private final int h;
    @NotNull
    private final kotlinx.coroutines.channels.a i;
    @Nullable
    private Object[] j;
    private long k;
    private long l;
    private int m;
    private int n;

    public h0(int n4, int n5, @NotNull kotlinx.coroutines.channels.a a4) {
        this.g = n4;
        this.h = n5;
        this.i = a4;
    }

    private final void A() {
        if (this.h == 0 && this.n <= 1) {
            return;
        }
        Object[] objectArray = this.j;
        y.g((Object)objectArray);
        while (this.n > 0 && i0.c((Object[])objectArray, (long)(this.L() + (long)this.Q() - 1L)) == i0.a) {
            --this.n;
            i0.d((Object[])objectArray, (long)(this.L() + (long)this.Q()), null);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static /* synthetic */ <T> Object B(h0<T> var0, i<? super T> var1_2, kotlin.coroutines.d<?> var2_3) {
        block22: {
            block19: {
                block20: {
                    block21: {
                        block23: {
                            if (!(var2_3 /* !! */  instanceof c)) ** GOTO lbl-1000
                            var6_6 = (kotlin.coroutines.jvm.internal.d)var2_3 /* !! */ ;
                            var3_7 = var6_6.r;
                            if ((var3_7 & -2147483648) != 0) {
                                var6_6.r = var3_7 + -2147483648;
                            } else // 2 sources

                            {
                                var6_6 = new kotlin.coroutines.jvm.internal.d(var0, (kotlin.coroutines.d<? super c>)var2_3 /* !! */ ){
                                    Object l;
                                    Object m;
                                    Object n;
                                    Object o;
                                    Object p;
                                    final h0<T> q;
                                    int r;
                                    {
                                        this.q = h02;
                                        super(d4);
                                    }

                                    @Override
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object) {
                                        this.p = object;
                                        this.r |= Integer.MIN_VALUE;
                                        return h0.B(this.q, null, this);
                                    }
                                };
                            }
                            var7_8 = var6_6.p;
                            var9_9 = kotlin.coroutines.intrinsics.b.f();
                            var3_7 = var6_6.r;
                            if (var3_7 == 0) break block23;
                            if (var3_7 != 1) {
                                if (var3_7 != 2) {
                                    if (var3_7 != 3) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    var2_3 /* !! */  = (d2)var6_6.o;
                                    var0 = (j0)var6_6.n;
                                    var4_10 = var6_6.m;
                                    var1_2 = (h0)var6_6.l;
                                } else {
                                    var2_3 /* !! */  = (d2)var6_6.o;
                                    var0 = (j0)var6_6.n;
                                    var4_10 = (i)var6_6.m;
                                    var1_2 = (h0)var6_6.l;
                                }
                                try {
                                    v.b((Object)var7_8);
                                }
                                catch (Throwable var2_4) {
                                    break block19;
                                }
                                var8_12 /* !! */  = var2_3 /* !! */ ;
                                var5_13 = var1_2;
                                var1_2 = var0;
                                var7_8 = var4_10;
                                break block22;
                            } else {
                                var4_10 = (j0)var6_6.n;
                                var5_13 = var6_6.m;
                                var0 = (h0)var6_6.l;
                                try {
                                    v.b((Object)var7_8);
                                    var1_2 = var4_10;
                                    break block20;
                                }
                                catch (Throwable var2_5) {
                                    var1_2 = var0;
                                    var0 = var4_10;
                                    break block19;
                                }
                            }
                        }
                        v.b((Object)var7_8);
                        var2_3 /* !! */  = (j0)var0.i();
                        try {
                            if (!(var1_2 instanceof u0)) break block21;
                            var4_10 = (u0)var1_2;
                            var6_6.l = var0;
                            var6_6.m = var1_2;
                            var6_6.n = var2_3 /* !! */ ;
                            var6_6.r = 1;
                            if ((var4_10 = var4_10.a(var6_6)) == var9_9) {
                                return var9_9;
                            }
                        }
                        catch (Throwable var5_14) {
                            var4_11 /* !! */  = var2_3 /* !! */ ;
                            var1_2 = var0;
                            var2_3 /* !! */  = var5_14;
                            var0 = var4_11 /* !! */ ;
                            break block19;
                        }
                    }
                    var5_13 = var1_2;
                    var1_2 = var2_3 /* !! */ ;
                }
                var2_3 /* !! */  = var0;
                var4_10 = var1_2;
                try {
                    var8_12 /* !! */  = (kotlin.coroutines.d<?>)var6_6.getContext().get((g.c)d2.C8);
                    var7_8 = var5_13;
                    var5_13 = var0;
                    break block22;
                }
                catch (Throwable var0_1) {
                    var1_2 = var2_3 /* !! */ ;
                    var2_3 /* !! */  = var0_1;
                    var0 = var4_10;
                }
            }
            var1_2.l(var0);
            throw var2_3 /* !! */ ;
        }
        while (true) {
            var2_3 /* !! */  = var5_13;
            var4_10 = var1_2;
            var0 = super.V((j0)var1_2);
            var2_3 /* !! */  = var5_13;
            var4_10 = var1_2;
            if (var0 == i0.a) {
                var2_3 /* !! */  = var5_13;
                var4_10 = var1_2;
                var6_6.l = var5_13;
                var2_3 /* !! */  = var5_13;
                var4_10 = var1_2;
                var6_6.m = var7_8;
                var2_3 /* !! */  = var5_13;
                var4_10 = var1_2;
                var6_6.n = var1_2;
                var2_3 /* !! */  = var5_13;
                var4_10 = var1_2;
                var6_6.o = var8_12 /* !! */ ;
                var2_3 /* !! */  = var5_13;
                var4_10 = var1_2;
                var6_6.r = 2;
                var2_3 /* !! */  = var5_13;
                var4_10 = var1_2;
                if (super.y((j0)var1_2, var6_6) != var9_9) continue;
                return var9_9;
            }
            if (var8_12 /* !! */  != null) {
                var2_3 /* !! */  = var5_13;
                var4_10 = var1_2;
                g2.l(var8_12 /* !! */ );
            }
            var2_3 /* !! */  = var5_13;
            var4_10 = var1_2;
            var6_6.l = var5_13;
            var2_3 /* !! */  = var5_13;
            var4_10 = var1_2;
            var6_6.m = var7_8;
            var2_3 /* !! */  = var5_13;
            var4_10 = var1_2;
            var6_6.n = var1_2;
            var2_3 /* !! */  = var5_13;
            var4_10 = var1_2;
            var6_6.o = var8_12 /* !! */ ;
            var2_3 /* !! */  = var5_13;
            var4_10 = var1_2;
            var6_6.r = 3;
            var2_3 /* !! */  = var5_13;
            var4_10 = var1_2;
            if ((var0 = var7_8.emit(var0, var6_6)) == var9_9) break;
        }
        return var9_9;
    }

    private final void C(long l4) {
        d[] dArray;
        if (kotlinx.coroutines.flow.internal.b.g((kotlinx.coroutines.flow.internal.b)this) != 0 && (dArray = kotlinx.coroutines.flow.internal.b.h((kotlinx.coroutines.flow.internal.b)this)) != null) {
            for (d d4 : dArray) {
                if (d4 == null) continue;
                d4 = (j0)d4;
                long l5 = d4.a;
                if (l5 < 0L || l5 >= l4) continue;
                d4.a = l4;
            }
        }
        this.l = l4;
    }

    private final void F() {
        Object[] objectArray = this.j;
        y.g((Object)objectArray);
        i0.d((Object[])objectArray, (long)this.L(), null);
        --this.m;
        long l4 = this.L() + 1L;
        if (this.k < l4) {
            this.k = l4;
        }
        if (this.l < l4) {
            this.C(l4);
        }
    }

    static /* synthetic */ <T> Object G(h0<T> object, T t3, kotlin.coroutines.d<? super k0> d4) {
        if (((h0)object).e(t3)) {
            return k0.a;
        }
        if ((object = super.H(t3, d4)) == kotlin.coroutines.intrinsics.b.f()) {
            return object;
        }
        return k0.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final Object H(T object, kotlin.coroutines.d<? super k0> d4) {
        a a4;
        p p4;
        block8: {
            Object object2;
            block7: {
                p4 = new p(kotlin.coroutines.intrinsics.b.c(d4), 1);
                p4.H();
                object2 = kotlinx.coroutines.flow.internal.c.a;
                // MONITORENTER : this
                if (!this.S(object)) break block7;
                object = u.d;
                p4.resumeWith(u.b((Object)k0.a));
                object = this.J(object2);
                a4 = null;
                break block8;
            }
            long l4 = this.L();
            a4 = new a(this, (long)this.Q() + l4, object, p4);
            this.I(a4);
            this.n = this.n + 1;
            object = object2;
            if (this.h == 0) {
                object = this.J(object2);
            }
        }
        // MONITOREXIT : this
        if (a4 != null) {
            r.a(p4, (i1)a4);
        }
        for (Object object2 : object) {
            if (object2 == null) continue;
            a4 = u.d;
            object2.resumeWith(u.b((Object)k0.a));
        }
        object = p4.z();
        if (object == kotlin.coroutines.intrinsics.b.f()) {
            kotlin.coroutines.jvm.internal.g.c(d4);
        }
        if (object != kotlin.coroutines.intrinsics.b.f()) return k0.a;
        return object;
    }

    private final void I(Object object) {
        Object[] objectArray;
        int n4 = this.Q();
        Object[] objectArray2 = this.j;
        if (objectArray2 == null) {
            objectArray = this.R(null, 0, 2);
        } else {
            objectArray = objectArray2;
            if (n4 >= objectArray2.length) {
                objectArray = this.R(objectArray2, n4, objectArray2.length * 2);
            }
        }
        i0.d((Object[])objectArray, (long)(this.L() + (long)n4), (Object)object);
    }

    private final kotlin.coroutines.d<k0>[] J(kotlin.coroutines.d<k0>[] dArray) {
        int n4 = dArray.length;
        kotlin.coroutines.d<k0>[] dArray2 = dArray;
        if (kotlinx.coroutines.flow.internal.b.g((kotlinx.coroutines.flow.internal.b)this) != 0) {
            d[] dArray3 = kotlinx.coroutines.flow.internal.b.h((kotlinx.coroutines.flow.internal.b)this);
            dArray2 = dArray;
            if (dArray3 != null) {
                int n5 = dArray3.length;
                int n6 = 0;
                while (true) {
                    dArray2 = dArray;
                    if (n6 >= n5) break;
                    d d4 = dArray3[n6];
                    int n7 = n4;
                    dArray2 = dArray;
                    if (d4 != null) {
                        d4 = (j0)d4;
                        kotlin.coroutines.d<? super k0> d5 = d4.b;
                        if (d5 == null) {
                            n7 = n4;
                            dArray2 = dArray;
                        } else {
                            n7 = n4;
                            dArray2 = dArray;
                            if (this.U((j0)d4) >= 0L) {
                                dArray2 = dArray;
                                if (n4 >= dArray.length) {
                                    dArray2 = Arrays.copyOf(dArray, Math.max(2, dArray.length * 2));
                                    y.i(dArray2, (String)"copyOf(...)");
                                }
                                dArray2[n4] = d5;
                                d4.b = null;
                                n7 = n4 + 1;
                            }
                        }
                    }
                    ++n6;
                    n4 = n7;
                    dArray = dArray2;
                }
            }
        }
        return dArray2;
    }

    private final long K() {
        return this.L() + (long)this.m;
    }

    private final long L() {
        return Math.min(this.l, this.k);
    }

    private final Object N(long l4) {
        Object object = this.j;
        y.g((Object)object);
        Object object2 = i0.c((Object[])object, (long)l4);
        object = object2;
        if (object2 instanceof a) {
            object = ((a)object2).e;
        }
        return object;
    }

    private final long O() {
        return this.L() + (long)this.m + (long)this.n;
    }

    private final int P() {
        return (int)(this.L() + (long)this.m - this.k);
    }

    private final int Q() {
        return this.m + this.n;
    }

    private final Object[] R(Object[] objectArray, int n4, int n5) {
        if (n5 > 0) {
            Object[] objectArray2 = new Object[n5];
            this.j = objectArray2;
            if (objectArray == null) {
                return objectArray2;
            }
            long l4 = this.L();
            for (n5 = 0; n5 < n4; ++n5) {
                long l5 = (long)n5 + l4;
                i0.d((Object[])objectArray2, (long)l5, (Object)i0.c((Object[])objectArray, (long)l5));
            }
            return objectArray2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean S(T t3) {
        int n4;
        if (this.m() == 0) {
            return this.T(t3);
        }
        if (this.m >= this.h && this.l <= this.k) {
            kotlinx.coroutines.channels.a a4 = this.i;
            n4 = b.a[a4.ordinal()];
            if (n4 == 1) return false;
            if (n4 == 2) return true;
            if (n4 != 3) {
                throw new kotlin.r();
            }
        }
        this.I(t3);
        this.m = n4 = this.m + 1;
        if (n4 > this.h) {
            this.F();
        }
        if (this.P() <= this.g) return true;
        this.W(this.k + 1L, this.l, this.K(), this.O());
        return true;
    }

    private final boolean T(T t3) {
        int n4;
        if (this.g == 0) {
            return true;
        }
        this.I(t3);
        this.m = n4 = this.m + 1;
        if (n4 > this.g) {
            this.F();
        }
        this.l = this.L() + (long)this.m;
        return true;
    }

    private final long U(j0 j02) {
        long l4 = j02.a;
        if (l4 < this.K()) {
            return l4;
        }
        if (this.h > 0) {
            return -1L;
        }
        if (l4 > this.L()) {
            return -1L;
        }
        if (this.n == 0) {
            return -1L;
        }
        return l4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final Object V(j0 a4) {
        u.a a5;
        Object object;
        block6: {
            long l4;
            block5: {
                object = kotlinx.coroutines.flow.internal.c.a;
                // MONITORENTER : this
                l4 = this.U((j0)a4);
                if (l4 >= 0L) break block5;
                a5 = i0.a;
                a4 = object;
                object = a5;
                break block6;
            }
            long l5 = a4.a;
            object = this.N(l4);
            a4.a = l4 + 1L;
            a4 = this.X(l5);
        }
        // MONITOREXIT : this
        int n4 = ((d0)a4).length;
        int n5 = 0;
        while (n5 < n4) {
            kotlin.coroutines.d<k0> d4 = a4[n5];
            if (d4 != null) {
                a5 = u.d;
                d4.resumeWith(u.b((Object)k0.a));
            }
            ++n5;
        }
        return object;
    }

    private final void W(long l4, long l5, long l6, long l7) {
        long l8 = Math.min(l5, l4);
        for (long i4 = this.L(); i4 < l8; ++i4) {
            Object[] objectArray = this.j;
            y.g((Object)objectArray);
            i0.d((Object[])objectArray, (long)i4, null);
        }
        this.k = l4;
        this.l = l5;
        this.m = (int)(l6 - l8);
        this.n = (int)(l7 - l6);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final Object y(j0 object, kotlin.coroutines.d<? super k0> d4) {
        p<? super k0> p4;
        block5: {
            block4: {
                p4 = new p<k0>(kotlin.coroutines.intrinsics.b.c(d4), 1);
                p4.H();
                // MONITORENTER : this
                if (this.U(object) >= 0L) break block4;
                object.b = p4;
                break block5;
            }
            object = u.d;
            p4.resumeWith(u.b((Object)k0.a));
        }
        object = k0.a;
        // MONITOREXIT : this
        object = p4.z();
        if (object == kotlin.coroutines.intrinsics.b.f()) {
            kotlin.coroutines.jvm.internal.g.c(d4);
        }
        if (object != kotlin.coroutines.intrinsics.b.f()) return k0.a;
        return object;
    }

    private final void z(a a4) {
        synchronized (this) {
            Object[] objectArray;
            block6: {
                block5: {
                    long l4 = a4.d;
                    long l5 = this.L();
                    if (l4 >= l5) break block5;
                    return;
                }
                objectArray = this.j;
                y.g((Object)objectArray);
                Object object = i0.c((Object[])objectArray, (long)a4.d);
                if (object == a4) break block6;
                return;
            }
            i0.d((Object[])objectArray, (long)a4.d, (Object)i0.a);
            this.A();
            a4 = k0.a;
            return;
        }
    }

    @NotNull
    protected j0 D() {
        return new j0();
    }

    @NotNull
    protected j0[] E(int n4) {
        return new j0[n4];
    }

    protected final T M() {
        Object[] objectArray = this.j;
        y.g((Object)objectArray);
        return (T)i0.c((Object[])objectArray, (long)(this.k + (long)this.P() - 1L));
    }

    /*
     * Exception decompiling
     */
    @NotNull
    public final kotlin.coroutines.d<k0>[] X(long var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:760)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final long Y() {
        long l4 = this.k;
        if (l4 < this.l) {
            this.l = l4;
        }
        return l4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NotNull
    public List<T> a() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                int n4;
                try {
                    n4 = this.P();
                    if (n4 == 0) {
                        return t.m();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                ArrayList<Object> arrayList = new ArrayList<Object>(n4);
                Object[] objectArray = this.j;
                y.g((Object)objectArray);
                int n5 = 0;
                while (n5 < n4) {
                    arrayList.add(i0.c((Object[])objectArray, (long)(this.k + (long)n5)));
                    ++n5;
                }
                return arrayList;
            }
            throw throwable2;
        }
    }

    @Override
    @NotNull
    public h<T> b(@NotNull kotlin.coroutines.g g4, int n4, @NotNull kotlinx.coroutines.channels.a a4) {
        return i0.e((g0)this, (kotlin.coroutines.g)g4, (int)n4, (kotlinx.coroutines.channels.a)a4);
    }

    @Override
    @Nullable
    public Object collect(@NotNull i<? super T> i4, @NotNull kotlin.coroutines.d<?> d4) {
        return h0.B(this, i4, d4);
    }

    @Override
    public void d() {
        synchronized (this) {
            this.W(this.K(), this.l, this.K(), this.O());
            k0 k02 = k0.a;
            return;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public boolean e(T object) {
        void var1_5;
        int n4;
        boolean bl;
        block6: {
            kotlin.coroutines.d[] dArray;
            block5: {
                dArray = kotlinx.coroutines.flow.internal.c.a;
                // MONITORENTER : this
                bl = this.S(object);
                n4 = 0;
                if (!bl) break block5;
                kotlin.coroutines.d<k0>[] dArray2 = this.J(dArray);
                bl = true;
                break block6;
            }
            bl = false;
            kotlin.coroutines.d[] dArray3 = dArray;
        }
        // MONITOREXIT : this
        int n5 = ((void)var1_5).length;
        while (n4 < n5) {
            void var5_8 = var1_5[n4];
            if (var5_8 != null) {
                u.a a4 = u.d;
                var5_8.resumeWith(u.b((Object)k0.a));
            }
            ++n4;
        }
        return bl;
    }

    @Override
    @Nullable
    public Object emit(T t3, @NotNull kotlin.coroutines.d<? super k0> d4) {
        return h0.G(this, t3, d4);
    }

    @Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2={"Lkotlinx/coroutines/flow/h0$a;", "Lkotlinx/coroutines/i1;", "Lkotlin/k0;", "dispose", "()V", "Lkotlinx/coroutines/flow/h0;", "c", "Lkotlinx/coroutines/flow/h0;", "flow", "", "d", "J", "index", "", "e", "Ljava/lang/Object;", "value", "Lkotlin/coroutines/d;", "f", "Lkotlin/coroutines/d;", "cont", "<init>", "(Lkotlinx/coroutines/flow/h0;JLjava/lang/Object;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    private static final class a
    implements i1 {
        @JvmField
        @NotNull
        public final h0<?> c;
        @JvmField
        public long d;
        @JvmField
        @Nullable
        public final Object e;
        @JvmField
        @NotNull
        public final kotlin.coroutines.d<k0> f;

        public a(@NotNull h0<?> h02, long l4, @Nullable Object object, @NotNull kotlin.coroutines.d<? super k0> d4) {
            this.c = h02;
            this.d = l4;
            this.e = object;
            this.f = d4;
        }

        public void dispose() {
            ((h0)this.c).z(this);
        }
    }
}


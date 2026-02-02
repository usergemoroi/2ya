/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.concurrent.futures.a
 *  io.ktor.utils.io.core.a
 *  io.ktor.utils.io.core.internal.g
 *  io.ktor.utils.io.core.m
 *  io.ktor.utils.io.core.n
 *  io.ktor.utils.io.core.p
 *  io.ktor.utils.io.core.q
 *  io.ktor.utils.io.g
 *  io.ktor.utils.io.internal.a
 *  io.ktor.utils.io.j
 *  io.ktor.utils.io.n
 *  io.ktor.utils.io.o
 *  io.ktor.utils.io.p
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.jvm.internal.b
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.v
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.utils.io;

import io.ktor.utils.io.core.m;
import io.ktor.utils.io.core.p;
import io.ktor.utils.io.core.q;
import io.ktor.utils.io.n;
import io.ktor.utils.io.o;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00042\u00020\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u001f\u0010\nJ\u000f\u0010 \u001a\u00020\bH\u0004\u00a2\u0006\u0004\b \u0010\nJ\u001b\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\b#\u0010$J+\u0010(\u001a\u00020\b2\u0006\u0010\"\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0004\u00a2\u0006\u0004\b*\u0010\u001aJ\u001b\u0010+\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\b+\u0010,J\u001b\u0010/\u001a\u00020\u00172\u0006\u0010.\u001a\u00020-H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\b/\u00100J\u001b\u00101\u001a\u00020\u00172\u0006\u0010.\u001a\u00020!H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\b1\u0010$J+\u00102\u001a\u00020\u00172\u0006\u0010.\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\b2\u0010)J\u0013\u00103\u001a\u00020\u0005H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\b3\u00104J\u001b\u00106\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0017H\u0084@\u00f8\u0001\u0000\u00a2\u0006\u0004\b6\u0010\u001dJ\u0019\u00109\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u000107H\u0016\u00a2\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u000107H\u0016\u00a2\u0006\u0004\b;\u0010:J\u001f\u0010<\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0004\u00a2\u0006\u0004\b>\u0010\u001aR\u001a\u0010A\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b9\u0010?\u001a\u0004\b@\u0010\u0007R\u001a\u0010F\u001a\u00020\r8\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010J\u001a\u00020\u00148\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b/\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b@\u0010LR\u0018\u0010P\u001a\u00060\u0004j\u0002`N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010OR\u0014\u0010R\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bQ\u0010CR\u0014\u0010T\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bS\u0010\u0007R$\u0010Y\u001a\u00020\u00052\u0006\u0010U\u001a\u00020\u00058D@DX\u0084\u000e\u00a2\u0006\f\u001a\u0004\bV\u0010\u0007\"\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bB\u0010ZR\u0014\u0010]\u001a\u00020\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\\\u0010ZR\u0014\u0010_\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b^\u0010\u0007R(\u0010c\u001a\u0004\u0018\u0001072\b\u0010U\u001a\u0004\u0018\u0001078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bQ\u0010`\"\u0004\ba\u0010b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006d"}, d2={"Lio/ktor/utils/io/f;", "Lio/ktor/utils/io/c;", "Lio/ktor/utils/io/g;", "Lio/ktor/utils/io/j;", "", "", "z", "()Z", "Lkotlin/k0;", "A", "()V", "w", "x", "Lio/ktor/utils/io/core/i;", "closeable", "y", "(Lio/ktor/utils/io/core/i;)V", "builder", "", "limit", "Lio/ktor/utils/io/core/j;", "J", "(Lio/ktor/utils/io/core/i;JLkotlin/coroutines/d;)Ljava/lang/Object;", "", "count", "o", "(I)V", "p", "t", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "s", "flush", "E", "Lio/ktor/utils/io/core/a;", "src", "l", "(Lio/ktor/utils/io/core/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "offset", "length", "i", "([BIILkotlin/coroutines/d;)Ljava/lang/Object;", "q", "f", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lio/ktor/utils/io/core/internal/a;", "dst", "d", "(Lio/ktor/utils/io/core/internal/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "F", "h", "u", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "atLeast", "v", "", "cause", "b", "(Ljava/lang/Throwable;)Z", "close", "K", "(Lio/ktor/utils/io/f;J)J", "r", "Z", "e", "autoFlush", "c", "Lio/ktor/utils/io/core/i;", "getWritable", "()Lio/ktor/utils/io/core/i;", "writable", "Lio/ktor/utils/io/core/j;", "getReadable", "()Lio/ktor/utils/io/core/j;", "readable", "Lio/ktor/utils/io/internal/a;", "Lio/ktor/utils/io/internal/a;", "slot", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "Ljava/lang/Object;", "flushMutex", "g", "flushBuffer", "D", "isCancelled", "<anonymous parameter 0>", "C", "setClosed", "(Z)V", "closed", "()I", "availableForRead", "B", "availableForWrite", "m", "isClosedForRead", "()Ljava/lang/Throwable;", "setClosedCause", "(Ljava/lang/Throwable;)V", "closedCause", "ktor-io"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nByteChannelSequential.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannelSequential.kt\nio/ktor/utils/io/ByteChannelSequentialBase\n+ 2 AtomicFU.kt\nkotlinx/atomicfu/AtomicInt\n+ 3 AtomicFU.kt\nkotlinx/atomicfu/AtomicRef\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Buffer.kt\nio/ktor/utils/io/core/Buffer\n+ 6 Packet.kt\nio/ktor/utils/io/core/PacketKt\n*L\n1#1,855:1\n207#2,3:856\n302#2,2:874\n302#2,2:876\n295#2,2:878\n87#3,3:859\n1#4:862\n69#5:863\n69#5:864\n74#5:867\n74#5:868\n74#5:869\n69#5:870\n69#5:873\n43#6:865\n43#6:866\n43#6:871\n39#6:872\n*S KotlinDebug\n*F\n+ 1 ByteChannelSequential.kt\nio/ktor/utils/io/ByteChannelSequentialBase\n*L\n42#1:856,3\n838#1:874,2\n840#1:876,2\n849#1:878,2\n43#1:859,3\n194#1:863\n229#1:864\n483#1:867\n493#1:868\n504#1:869\n576#1:870\n651#1:873\n293#1:865\n315#1:866\n602#1:871\n640#1:872\n*E\n"})
public abstract class f
implements io.ktor.utils.io.c,
io.ktor.utils.io.g,
io.ktor.utils.io.j {
    private static final AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(f.class, "_totalBytesRead");
    private static final AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(f.class, "_totalBytesWritten");
    private static final AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(f.class, "_availableForRead");
    private static final AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(f.class, "channelSize");
    private static final AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_closed");
    @NotNull
    private volatile int _availableForRead;
    @NotNull
    private volatile Object _closed;
    @NotNull
    private volatile Object _lastReadView;
    @NotNull
    private volatile long _totalBytesRead;
    @NotNull
    private volatile long _totalBytesWritten;
    private final boolean b;
    @NotNull
    private final io.ktor.utils.io.core.i c;
    @NotNull
    private volatile int channelSize;
    @NotNull
    private final io.ktor.utils.io.core.j d;
    @NotNull
    private final io.ktor.utils.io.internal.a e;
    @NotNull
    private final Object f;
    @NotNull
    private final io.ktor.utils.io.core.i g;
    @NotNull
    private volatile int lastReadAvailable$delegate;
    @NotNull
    private volatile Object lastReadView$delegate;

    private final void A() {
        Object object = this.f;
        synchronized (object) {
            int n4 = this.c.d0();
            io.ktor.utils.io.core.internal.a a4 = this.c.T();
            y.g((Object)((Object)a4));
            this.g.U(a4);
            j.addAndGet(this, n4);
            return;
        }
    }

    private final boolean D() {
        Object object = (n)this._closed;
        object = object != null ? object.a() : null;
        boolean bl = object != null;
        return bl;
    }

    static /* synthetic */ Object G(f f4, io.ktor.utils.io.core.internal.a a4, d<? super Integer> d4) {
        y.h((Object)((Object)a4), (String)"null cannot be cast to non-null type io.ktor.utils.io.core.Buffer");
        return f4.F(a4, d4);
    }

    /*
     * Unable to fully structure code
     */
    static /* synthetic */ Object H(f var0, byte[] var1_1, int var2_2, int var3_3, d<? super Integer> var4_4) {
        block11: {
            block10: {
                block8: {
                    block9: {
                        if (!(var4_4 instanceof g)) ** GOTO lbl-1000
                        var7_5 = var4_4;
                        var5_6 = var7_5.r;
                        if ((var5_6 & -2147483648) != 0) {
                            var7_5.r = var5_6 + -2147483648;
                            var4_4 = var7_5;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var4_4 = new kotlin.coroutines.jvm.internal.d(var0, var4_4){
                                Object l;
                                Object m;
                                int n;
                                int o;
                                Object p;
                                final f q;
                                int r;
                                {
                                    this.q = f4;
                                    super(d4);
                                }

                                @Override
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object) {
                                    this.p = object;
                                    this.r |= Integer.MIN_VALUE;
                                    return io.ktor.utils.io.f.H(this.q, null, 0, 0, this);
                                }
                            };
                        }
                        var10_7 = var4_4.p;
                        var9_8 = kotlin.coroutines.intrinsics.b.f();
                        var5_6 = var4_4.r;
                        if (var5_6 == 0) break block8;
                        if (var5_6 != 1) break block9;
                        var6_9 = var4_4.o;
                        var5_6 = var4_4.n;
                        var8_10 = (byte[])var4_4.m;
                        var7_5 = (f)var4_4.l;
                        v.b((Object)var10_7);
                        break block10;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b((Object)var10_7);
                var7_5 = var0.g();
                if (var7_5 == null) {
                    if (var0.C() && var0.c() == 0) {
                        return kotlin.coroutines.jvm.internal.b.d((int)-1);
                    }
                    if (var3_3 == 0) {
                        return kotlin.coroutines.jvm.internal.b.d((int)0);
                    }
                    var7_5 = var0;
                    var8_10 = var1_1;
                    var5_6 = var2_2;
                    var6_9 = var3_3;
                    if (var0.c() == 0) {
                        var4_4.l = var0;
                        var4_4.m = var1_1;
                        var4_4.n = var2_2;
                        var4_4.o = var3_3;
                        var4_4.r = 1;
                        var7_5 = var0;
                        var8_10 = var1_1;
                        var5_6 = var2_2;
                        var6_9 = var3_3;
                        if (var0.v(1, var4_4) == var9_8) {
                            return var9_8;
                        } else {
                            ** GOTO lbl47
                        }
                    } else {
                        ** GOTO lbl47
                    }
                }
                break block11;
            }
            if (!var7_5.d.h()) {
                var7_5.E();
            }
            var2_2 = (int)Math.min((long)var6_9, var7_5.d.W());
            io.ktor.utils.io.core.n.b((m)var7_5.d, (byte[])var8_10, (int)var5_6, (int)var2_2);
            var7_5.q(var2_2);
            return kotlin.coroutines.jvm.internal.b.d((int)var2_2);
        }
        throw var7_5;
    }

    static /* synthetic */ Object I(f f4, long l4, d<? super io.ktor.utils.io.core.j> d4) {
        f4.x();
        io.ktor.utils.io.core.i i4 = new io.ktor.utils.io.core.i(null, 1, null);
        long l5 = Math.min(l4, f4.d.W());
        i4.W(f4.d, l5);
        f4.q((int)l5);
        if (l4 - (long)i4.d0() != 0L && !f4.m()) {
            return f4.J(i4, l4, d4);
        }
        f4.y(i4);
        return i4.c0();
    }

    /*
     * Unable to fully structure code
     */
    private final Object J(io.ktor.utils.io.core.i var1_1, long var2_2, d<? super io.ktor.utils.io.core.j> var4_3) {
        if (!(var4_3 instanceof h)) ** GOTO lbl-1000
        var8_4 = var4_3;
        var5_5 = var8_4.q;
        if ((var5_5 & -2147483648) != 0) {
            var8_4.q = var5_5 + -2147483648;
            var4_3 = var8_4;
        } else lbl-1000:
        // 2 sources

        {
            var4_3 = new kotlin.coroutines.jvm.internal.d(this, var4_3){
                Object l;
                Object m;
                long n;
                Object o;
                final f p;
                int q;
                {
                    this.p = f4;
                    super(d4);
                }

                @Override
                @Nullable
                public final Object invokeSuspend(@NotNull Object object) {
                    this.o = object;
                    this.q |= Integer.MIN_VALUE;
                    return this.p.J(null, 0L, (d<? super io.ktor.utils.io.core.j>)this);
                }
            };
        }
        var10_6 = var4_3.o;
        var9_7 = kotlin.coroutines.intrinsics.b.f();
        var5_5 = var4_3.q;
        if (var5_5 == 0) ** GOTO lbl20
        if (var5_5 == 1) {
            var2_2 = var4_3.n;
            var1_1 = (io.ktor.utils.io.core.i)var4_3.m;
            var8_4 = (f)var4_3.l;
            v.b((Object)var10_6);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl20:
            // 1 sources

            v.b((Object)var10_6);
            var8_4 = this;
        }
        while ((long)var1_1.d0() < var2_2) {
            var6_8 = Math.min(var2_2 - (long)var1_1.d0(), var8_4.d.W());
            var1_1.W(var8_4.d, var6_8);
            var8_4.q((int)var6_8);
            super.y(var1_1);
            if (var8_4.m() || var1_1.d0() == (int)var2_2) break;
            var4_3.l = var8_4;
            var4_3.m = var1_1;
            var4_3.n = var2_2;
            var4_3.q = 1;
            if (var8_4.v(1, var4_3) != var9_7) continue;
            return var9_7;
        }
        super.y(var1_1);
        return var1_1.c0();
    }

    /*
     * Unable to fully structure code
     */
    static /* synthetic */ Object L(f var0, io.ktor.utils.io.core.a var1_1, d<? super k0> var2_2) {
        if (!(var2_2 instanceof i)) ** GOTO lbl-1000
        var5_3 = var2_2;
        var3_4 = var5_3.p;
        if ((var3_4 & -2147483648) != 0) {
            var5_3.p = var3_4 + -2147483648;
            var2_2 = var5_3;
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = new kotlin.coroutines.jvm.internal.d(var0, var2_2){
                Object l;
                Object m;
                Object n;
                final f o;
                int p;
                {
                    this.o = f4;
                    super(d4);
                }

                @Override
                @Nullable
                public final Object invokeSuspend(@NotNull Object object) {
                    this.n = object;
                    this.p |= Integer.MIN_VALUE;
                    return io.ktor.utils.io.f.L(this.o, null, this);
                }
            };
        }
        var7_5 = var2_2.n;
        var6_6 = kotlin.coroutines.intrinsics.b.f();
        var3_4 = var2_2.p;
        if (var3_4 == 0) ** GOTO lbl19
        if (var3_4 == 1) {
            var1_1 = (io.ktor.utils.io.core.a)var2_2.m;
            var5_3 = (f)var2_2.l;
            v.b((Object)var7_5);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl19:
            // 1 sources

            v.b((Object)var7_5);
            var2_2.l = var0;
            var2_2.m = var1_1;
            var2_2.p = 1;
            var5_3 = var0;
            if (var0.t(1, var2_2) == var6_6) {
                return var6_6;
            }
        }
        var3_4 = var1_1.j();
        var4_7 = var1_1.h();
        q.c((p)var5_3.c, (io.ktor.utils.io.core.a)var1_1, (int)0, (int)2, null);
        var5_3.r(var3_4 - var4_7);
        return k0.a;
    }

    /*
     * Unable to fully structure code
     */
    static /* synthetic */ Object M(f var0, byte[] var1_1, int var2_2, int var3_3, d<? super k0> var4_4) {
        block4: {
            block5: {
                if (!(var4_4 instanceof j)) ** GOTO lbl-1000
                var6_5 = var4_4;
                var5_6 = var6_5.r;
                if ((var5_6 & -2147483648) != 0) {
                    var6_5.r = var5_6 + -2147483648;
                    var4_4 = var6_5;
                } else lbl-1000:
                // 2 sources

                {
                    var4_4 = new kotlin.coroutines.jvm.internal.d((f)var0, (d<? super j>)var4_4){
                        Object l;
                        Object m;
                        int n;
                        int o;
                        Object p;
                        final f q;
                        int r;
                        {
                            this.q = f4;
                            super(d4);
                        }

                        @Override
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object object) {
                            this.p = object;
                            this.r |= Integer.MIN_VALUE;
                            return io.ktor.utils.io.f.M(this.q, null, 0, 0, this);
                        }
                    };
                }
                var6_5 = var4_4.p;
                var8_7 = kotlin.coroutines.intrinsics.b.f();
                var5_6 = var4_4.r;
                if (var5_6 == 0) break block4;
                if (var5_6 != 1) break block5;
                var3_3 = var4_4.o;
                var2_2 = var4_4.n;
                var0 = (byte[])var4_4.m;
                var1_1 = (f)var4_4.l;
                v.b((Object)var6_5);
                ** GOTO lbl38
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v.b((Object)var6_5);
        var6_5 = var0;
        var3_3 += var2_2;
        var0 = var1_1;
        var7_8 = var4_4;
        while (var2_2 < var3_3) {
            var7_8.l = var6_5;
            var7_8.m = var0;
            var7_8.n = var2_2;
            var7_8.o = var3_3;
            var7_8.r = 1;
            var4_4 = var7_8;
            var1_1 = var6_5;
            if (var6_5.t(1, (d<? super k0>)var7_8) == var8_7) {
                return var8_7;
            }
lbl38:
            // 3 sources

            var5_6 = Math.min(var1_1.B(), var3_3 - var2_2);
            q.b((p)var1_1.c, (byte[])var0, (int)var2_2, (int)var5_6);
            var2_2 += var5_6;
            var1_1.r(var5_6);
            var7_8 = var4_4;
            var6_5 = var1_1;
        }
        return k0.a;
    }

    private final void o(int n4) {
        if (n4 >= 0) {
            Object object = k;
            int n5 = -n4;
            ((AtomicIntegerFieldUpdater)object).getAndAdd(this, n5);
            h.addAndGet(this, n4);
            j.getAndAdd(this, n5);
            if (this.channelSize >= 0) {
                if (this.c() >= 0) {
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Readable bytes count is negative: ");
                ((StringBuilder)object).append(this.c());
                ((StringBuilder)object).append(", ");
                ((StringBuilder)object).append(n4);
                ((StringBuilder)object).append(" in ");
                ((StringBuilder)object).append(this);
                throw new IllegalStateException(((StringBuilder)object).toString().toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Readable bytes count is negative: ");
            ((StringBuilder)object).append(this.c());
            ((StringBuilder)object).append(", ");
            ((StringBuilder)object).append(n4);
            ((StringBuilder)object).append(" in ");
            ((StringBuilder)object).append(this);
            throw new IllegalStateException(((StringBuilder)object).toString().toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't read negative amount of bytes: ");
        stringBuilder.append(n4);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    private final void p(int n4) {
        if (n4 >= 0) {
            k.getAndAdd(this, n4);
            i.addAndGet(this, n4);
            if (this.channelSize >= 0) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Readable bytes count is negative: ");
            stringBuilder.append(this.channelSize);
            stringBuilder.append(", ");
            stringBuilder.append(n4);
            stringBuilder.append(" in ");
            stringBuilder.append(this);
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't write negative amount of bytes: ");
        stringBuilder.append(n4);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    private final void w() {
        if (this.C()) {
            Throwable throwable = this.g();
            Serializable serializable = throwable;
            if (throwable == null) {
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append("Channel ");
                ((StringBuilder)serializable).append(this);
                ((StringBuilder)serializable).append(" is already closed");
                serializable = new io.ktor.utils.io.p(((StringBuilder)serializable).toString());
            }
            throw serializable;
        }
    }

    private final void x() {
        Throwable throwable = this.g();
        if (throwable == null) {
            return;
        }
        throw throwable;
    }

    private final void y(io.ktor.utils.io.core.i i4) {
        Throwable throwable = this.g();
        if (throwable == null) {
            return;
        }
        i4.release();
        throw throwable;
    }

    private final boolean z() {
        if (this.c.e0()) {
            this.e.c();
            return false;
        }
        this.A();
        this.e.c();
        return true;
    }

    public int B() {
        return Math.max(0, 4088 - this.channelSize);
    }

    protected final boolean C() {
        boolean bl = this._closed != null;
        return bl;
    }

    protected final void E() {
        Object object = this.f;
        synchronized (object) {
            io.ktor.utils.io.core.internal.g.e((io.ktor.utils.io.core.j)this.d, (io.ktor.utils.io.core.i)this.g);
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public final Object F(@NotNull io.ktor.utils.io.core.a var1_1, @NotNull d<? super Integer> var2_2) {
        block13: {
            block12: {
                block10: {
                    block11: {
                        if (!(var2_2 instanceof f)) ** GOTO lbl-1000
                        var4_3 = var2_2;
                        var3_4 = var4_3.p;
                        if ((var3_4 & -2147483648) != 0) {
                            var4_3.p = var3_4 + -2147483648;
                            var2_2 = var4_3;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var2_2 = new kotlin.coroutines.jvm.internal.d(this, (d<? super f>)var2_2){
                                Object l;
                                Object m;
                                Object n;
                                final f o;
                                int p;
                                {
                                    this.o = f4;
                                    super(d4);
                                }

                                @Override
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object) {
                                    this.n = object;
                                    this.p |= Integer.MIN_VALUE;
                                    return this.o.F(null, this);
                                }
                            };
                        }
                        var4_3 = var2_2.n;
                        var5_5 = kotlin.coroutines.intrinsics.b.f();
                        var3_4 = var2_2.p;
                        if (var3_4 == 0) break block10;
                        if (var3_4 != 1) break block11;
                        var1_1 = (io.ktor.utils.io.core.a)var2_2.m;
                        var2_2 = (f)var2_2.l;
                        v.b((Object)var4_3);
                        break block12;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b((Object)var4_3);
                var4_3 = this.g();
                if (var4_3 != null) break block13;
                if (this.C() && this.c() == 0) {
                    return kotlin.coroutines.jvm.internal.b.d((int)-1);
                }
                if (var1_1.f() - var1_1.j() == 0) {
                    return kotlin.coroutines.jvm.internal.b.d((int)0);
                }
                if (this.c() == 0) {
                    var2_2.l = this;
                    var2_2.m = var1_1;
                    var2_2.p = 1;
                    if (this.v(1, (d<? super Boolean>)var2_2) == var5_5) {
                        return var5_5;
                    }
                }
                var2_2 = this;
            }
            if (!var2_2.d.h()) {
                var2_2.E();
            }
            var3_4 = (int)Math.min((long)(var1_1.f() - var1_1.j()), var2_2.d.W());
            io.ktor.utils.io.core.n.a((m)var2_2.d, (io.ktor.utils.io.core.a)var1_1, (int)var3_4);
            var2_2.q(var3_4);
            return kotlin.coroutines.jvm.internal.b.d((int)var3_4);
        }
        throw var4_3;
    }

    public final long K(@NotNull f f4, long l4) {
        y.j((Object)f4, (String)"dst");
        long l5 = this.d.W();
        if (l5 <= l4) {
            f4.c.V(this.d);
            int n4 = (int)l5;
            f4.r(n4);
            this.q(n4);
            l4 = l5;
        } else {
            l4 = 0L;
        }
        return l4;
    }

    public boolean b(@Nullable Throwable throwable) {
        if (this.g() == null && !this.C()) {
            Throwable throwable2 = throwable;
            if (throwable == null) {
                throwable2 = new CancellationException("Channel cancelled");
            }
            return this.close(throwable2);
        }
        return false;
    }

    public int c() {
        return this._availableForRead;
    }

    public boolean close(@Nullable Throwable throwable) {
        n n4 = throwable == null ? o.a() : new n(throwable);
        if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)l, (Object)this, null, (Object)n4)) {
            return false;
        }
        if (throwable != null) {
            this.d.release();
            this.c.release();
            this.g.release();
        } else {
            this.flush();
            this.c.release();
        }
        this.e.b(throwable);
        return true;
    }

    @Nullable
    public Object d(@NotNull io.ktor.utils.io.core.internal.a a4, @NotNull d<? super Integer> d4) {
        return io.ktor.utils.io.f.G(this, a4, d4);
    }

    public boolean e() {
        return this.b;
    }

    @Nullable
    public Object f(long l4, @NotNull d<? super io.ktor.utils.io.core.j> d4) {
        return io.ktor.utils.io.f.I(this, l4, d4);
    }

    public void flush() {
        this.z();
    }

    @Nullable
    public final Throwable g() {
        Object object = (n)this._closed;
        object = object != null ? object.a() : null;
        return object;
    }

    @Nullable
    public Object h(@NotNull byte[] byArray, int n4, int n5, @NotNull d<? super Integer> d4) {
        return io.ktor.utils.io.f.H(this, byArray, n4, n5, d4);
    }

    @Nullable
    public Object i(@NotNull byte[] byArray, int n4, int n5, @NotNull d<? super k0> d4) {
        return io.ktor.utils.io.f.M(this, byArray, n4, n5, d4);
    }

    @Nullable
    public Object l(@NotNull io.ktor.utils.io.core.a a4, @NotNull d<? super k0> d4) {
        return io.ktor.utils.io.f.L(this, a4, d4);
    }

    public boolean m() {
        boolean bl = this.D() || this.C() && this.channelSize == 0;
        return bl;
    }

    protected final void q(int n4) {
        this.o(n4);
        this.e.c();
    }

    protected final void r(int n4) {
        this.p(n4);
        if (this.C()) {
            this.c.release();
            this.w();
        }
        if (this.e() || this.B() == 0) {
            this.flush();
        }
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public final Object s(int var1_1, @NotNull d<? super k0> var2_2) {
        if (!(var2_2 instanceof a)) ** GOTO lbl-1000
        var4_3 = var2_2;
        var3_4 = var4_3.p;
        if ((var3_4 & -2147483648) != 0) {
            var4_3.p = var3_4 + -2147483648;
            var2_2 = var4_3;
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = new kotlin.coroutines.jvm.internal.d(this, var2_2){
                Object l;
                int m;
                Object n;
                final f o;
                int p;
                {
                    this.o = f4;
                    super(d4);
                }

                @Override
                @Nullable
                public final Object invokeSuspend(@NotNull Object object) {
                    this.n = object;
                    this.p |= Integer.MIN_VALUE;
                    return this.o.s(0, this);
                }
            };
        }
        var6_5 = var2_2.n;
        var5_6 = kotlin.coroutines.intrinsics.b.f();
        var3_4 = var2_2.p;
        if (var3_4 == 0) ** GOTO lbl19
        if (var3_4 == 1) {
            var1_1 = var2_2.m;
            var4_3 = (f)var2_2.l;
            v.b((Object)var6_5);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl19:
            // 1 sources

            v.b((Object)var6_5);
            var4_3 = this;
        }
        while (var4_3.c() < var1_1 && !var4_3.m()) {
            var6_5 = var4_3.e;
            var7_7 = new kotlin.jvm.functions.a<Boolean>((f)var4_3, var1_1){
                final f g;
                final int h;
                {
                    this.g = f4;
                    this.h = n4;
                    super(0);
                }

                @Override
                @NotNull
                public final Boolean invoke() {
                    boolean bl = this.g.c() < this.h && !this.g.m();
                    return bl;
                }
            };
            var2_2.l = var4_3;
            var2_2.m = var1_1;
            var2_2.p = 1;
            if (var6_5.d((kotlin.jvm.functions.a)var7_7, (d)var2_2) != var5_6) continue;
            return var5_6;
        }
        return k0.a;
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public final Object t(int var1_1, @NotNull d<? super k0> var2_2) {
        if (!(var2_2 instanceof c)) ** GOTO lbl-1000
        var4_3 = var2_2;
        var3_4 = var4_3.p;
        if ((var3_4 & -2147483648) != 0) {
            var4_3.p = var3_4 + -2147483648;
            var2_2 = var4_3;
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = new kotlin.coroutines.jvm.internal.d(this, var2_2){
                Object l;
                int m;
                Object n;
                final f o;
                int p;
                {
                    this.o = f4;
                    super(d4);
                }

                @Override
                @Nullable
                public final Object invokeSuspend(@NotNull Object object) {
                    this.n = object;
                    this.p |= Integer.MIN_VALUE;
                    return this.o.t(0, this);
                }
            };
        }
        var6_5 = var2_2.n;
        var5_6 = kotlin.coroutines.intrinsics.b.f();
        var3_4 = var2_2.p;
        if (var3_4 == 0) ** GOTO lbl19
        if (var3_4 == 1) {
            var1_1 = var2_2.m;
            var4_3 = (f)var2_2.l;
            v.b((Object)var6_5);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl19:
            // 1 sources

            v.b((Object)var6_5);
            var4_3 = this;
        }
        while (var4_3.B() < var1_1 && !var4_3.C()) {
            if (super.z()) continue;
            var7_7 = var4_3.e;
            var6_5 = new kotlin.jvm.functions.a<Boolean>((f)var4_3, var1_1){
                final f g;
                final int h;
                {
                    this.g = f4;
                    this.h = n4;
                    super(0);
                }

                @Override
                @NotNull
                public final Boolean invoke() {
                    boolean bl = this.g.B() < this.h && !this.g.C();
                    return bl;
                }
            };
            var2_2.l = var4_3;
            var2_2.m = var1_1;
            var2_2.p = 1;
            if (var7_7.d((kotlin.jvm.functions.a)var6_5, (d)var2_2) != var5_6) continue;
            return var5_6;
        }
        return k0.a;
    }

    @Nullable
    public final Object u(@NotNull d<? super Boolean> d4) {
        if (this.d.L() ^ true) {
            return kotlin.coroutines.jvm.internal.b.a((boolean)true);
        }
        return this.v(1, d4);
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    protected final Object v(int var1_1, @NotNull d<? super Boolean> var2_2) {
        block11: {
            block10: {
                block8: {
                    block9: {
                        if (!(var2_2 instanceof e)) ** GOTO lbl-1000
                        var5_3 = var2_2;
                        var3_4 = var5_3.p;
                        if ((var3_4 & -2147483648) != 0) {
                            var5_3.p = var3_4 + -2147483648;
                            var2_2 = var5_3;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var2_2 = new kotlin.coroutines.jvm.internal.d(this, (d<? super e>)var2_2){
                                Object l;
                                int m;
                                Object n;
                                final f o;
                                int p;
                                {
                                    this.o = f4;
                                    super(d4);
                                }

                                @Override
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object) {
                                    this.n = object;
                                    this.p |= Integer.MIN_VALUE;
                                    return this.o.v(0, this);
                                }
                            };
                        }
                        var5_3 = var2_2.n;
                        var6_5 = kotlin.coroutines.intrinsics.b.f();
                        var3_4 = var2_2.p;
                        var4_6 = true;
                        if (var3_4 == 0) break block8;
                        if (var3_4 != 1) break block9;
                        var1_1 = var2_2.m;
                        var2_2 = (f)var2_2.l;
                        v.b((Object)var5_3);
                        break block10;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b((Object)var5_3);
                if (var1_1 < 0) break block11;
                var2_2.l = this;
                var2_2.m = var1_1;
                var2_2.p = 1;
                if (this.s(var1_1, (d<? super k0>)var2_2) == var6_5) {
                    return var6_5;
                }
                var2_2 = this;
            }
            var2_2.E();
            var5_3 = var2_2.g();
            if (var5_3 == null) {
                if (var2_2.m() || var2_2.c() < var1_1) {
                    var4_6 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a((boolean)var4_6);
            }
            throw var5_3;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}


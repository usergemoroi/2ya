/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.concurrent.futures.a
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlinx.coroutines.c
 *  kotlinx.coroutines.c3
 *  kotlinx.coroutines.i1
 *  kotlinx.coroutines.internal.d0
 *  kotlinx.coroutines.internal.o0
 *  kotlinx.coroutines.internal.p0
 *  kotlinx.coroutines.internal.q
 *  kotlinx.coroutines.q1
 *  kotlinx.coroutines.r
 *  kotlinx.coroutines.z0
 *  kotlinx.coroutines.z0$a
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.ranges.j;
import kotlinx.coroutines.c3;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.internal.p0;
import kotlinx.coroutines.internal.q;
import kotlinx.coroutines.n;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.q1;
import kotlinx.coroutines.q2;
import kotlinx.coroutines.r;
import kotlinx.coroutines.v0;
import kotlinx.coroutines.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004@ABCB\u0007\u00a2\u0006\u0004\b?\u0010\rJ\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u0018\u0010\rJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\u0019\u0010\rJ%\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001bH\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00122\n\u0010\u001f\u001a\u00060\u0003j\u0002`\u0004H\u0004\u00a2\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b#\u0010$J!\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%2\n\u0010\u001f\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u000b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016\u00a2\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f\u00a2\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000bH\u0004\u00a2\u0006\u0004\b-\u0010\rR$\u00103\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00068B@BX\u0082\u000e\u00a2\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00068TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b4\u00100R\u0014\u00107\u001a\u00020\u00128TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b6\u0010$R\u0013\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u000109088\u0002X\u0082\u0004R\u0013\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;088\u0002X\u0082\u0004R\u000b\u0010>\u001a\u00020=8\u0002X\u0082\u0004\u00a8\u0006D"}, d2={"Lkotlinx/coroutines/n1;", "Lkotlinx/coroutines/o1;", "Lkotlinx/coroutines/z0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "j0", "(Ljava/lang/Runnable;)Z", "g0", "()Ljava/lang/Runnable;", "Lkotlin/k0;", "i0", "()V", "f0", "Lkotlinx/coroutines/n1$c;", "u0", "(Lkotlinx/coroutines/n1$c;)Z", "", "now", "delayedTask", "", "r0", "(JLkotlinx/coroutines/n1$c;)I", "o0", "shutdown", "timeMillis", "Lkotlinx/coroutines/n;", "continuation", "p", "(JLkotlinx/coroutines/n;)V", "block", "Lkotlinx/coroutines/i1;", "s0", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/i1;", "Y", "()J", "Lkotlin/coroutines/g;", "context", "dispatch", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "h0", "(Ljava/lang/Runnable;)V", "q0", "(JLkotlinx/coroutines/n1$c;)V", "p0", "value", "h", "()Z", "t0", "(Z)V", "isCompleted", "n0", "isEmpty", "T", "nextTime", "Lkotlinx/atomicfu/AtomicRef;", "", "_queue", "Lkotlinx/coroutines/n1$d;", "_delayed", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleted", "<init>", "c", "a", "b", "d", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n+ 2 EventLoop.kt\nkotlinx/coroutines/EventLoopKt\n+ 3 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n53#2:548\n51#3:549\n52#3,7:552\n27#4:550\n16#5:551\n1#6:559\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n*L\n263#1:548\n336#1:549\n336#1:552,7\n336#1:550\n336#1:551\n*E\n"})
public abstract class n1
extends o1
implements z0 {
    private static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_queue$volatile");
    private static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_delayed$volatile");
    private static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(n1.class, "_isCompleted$volatile");
    private volatile Object _delayed$volatile;
    private volatile int _isCompleted$volatile = 0;
    private volatile Object _queue$volatile;

    public static final /* synthetic */ boolean e0(n1 n12) {
        return n12.h();
    }

    private final void f0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n1.f;
        while (true) {
            Object v3;
            if ((v3 = atomicReferenceFieldUpdater.get(this)) == null) {
                if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)n1.f, (Object)this, null, (Object)q1.a())) continue;
                return;
            }
            if (v3 instanceof q) {
                ((q)v3).d();
                return;
            }
            if (v3 == q1.a()) {
                return;
            }
            q q4 = new q(8, true);
            y.h(v3, (String)"null cannot be cast to non-null type java.lang.Runnable");
            q4.a((Object)((Runnable)v3));
            if (androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)n1.f, (Object)this, v3, (Object)q4)) break;
        }
    }

    private final Runnable g0() {
        Object v3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n1.f;
        while (true) {
            if ((v3 = atomicReferenceFieldUpdater.get(this)) == null) {
                return null;
            }
            if (v3 instanceof q) {
                y.h(v3, (String)"null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                q q4 = (q)v3;
                Object object = q4.m();
                if (object != q.h) {
                    return (Runnable)object;
                }
                androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)n1.f, (Object)this, v3, (Object)q4.l());
                continue;
            }
            if (v3 == q1.a()) {
                return null;
            }
            if (androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)n1.f, (Object)this, v3, null)) break;
        }
        y.h(v3, (String)"null cannot be cast to non-null type java.lang.Runnable");
        return (Runnable)v3;
    }

    private final boolean h() {
        boolean bl = n1.h.get(this) != 0;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final void i0() {
        p0 p02;
        d d4 = (d)((Object)n1.g.get(this));
        if (d4 == null) return;
        if (d4.e()) return;
        kotlinx.coroutines.c.a();
        long l4 = System.nanoTime();
        do {
            block7: {
                p0 p03;
                p0 p04;
                block6: {
                    // MONITORENTER : d4
                    p04 = d4.b();
                    p02 = null;
                    p03 = null;
                    if (p04 != null) break block6;
                    continue;
                }
                p04 = (c)p04;
                p02 = p03;
                if (!p04.g(l4)) break block7;
                p02 = p03;
                if (this.j0((Runnable)p04)) {
                    p02 = d4.i(0);
                }
            }
            // MONITOREXIT : d4
        } while ((c)p02 != null);
    }

    private final boolean j0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n1.f;
        while (true) {
            q q4;
            Object v3 = atomicReferenceFieldUpdater.get(this);
            if (this.h()) {
                return false;
            }
            if (v3 == null) {
                if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)n1.f, (Object)this, null, (Object)runnable)) continue;
                return true;
            }
            if (v3 instanceof q) {
                y.h(v3, (String)"null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                q4 = (q)v3;
                int n4 = q4.a((Object)runnable);
                if (n4 != 0) {
                    if (n4 != 1) {
                        if (n4 != 2) continue;
                        return false;
                    }
                    androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)n1.f, (Object)this, v3, (Object)q4.l());
                    continue;
                }
                return true;
            }
            if (v3 == q1.a()) {
                return false;
            }
            q4 = new q(8, true);
            y.h(v3, (String)"null cannot be cast to non-null type java.lang.Runnable");
            q4.a((Object)((Runnable)v3));
            q4.a((Object)runnable);
            if (androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)n1.f, (Object)this, v3, (Object)q4)) break;
        }
        return true;
    }

    private final void o0() {
        Object object;
        kotlinx.coroutines.c.a();
        long l4 = System.nanoTime();
        while ((object = (d)((Object)n1.g.get(this))) != null && (object = (c)object.j()) != null) {
            this.c0(l4, (c)object);
        }
    }

    private final int r0(long l4, c c4) {
        d d4;
        if (this.h()) {
            return 1;
        }
        d d5 = d4 = (d)((Object)n1.g.get(this));
        if (d4 == null) {
            androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)n1.g, (Object)this, null, (Object)((Object)new d(l4)));
            d5 = n1.g.get(this);
            y.g((Object)((Object)d5));
        }
        return c4.f(l4, d5, this);
    }

    private final void t0(boolean bl) {
        n1.h.set(this, bl ? 1 : 0);
    }

    private final boolean u0(c c4) {
        Object object = (d)((Object)n1.g.get(this));
        object = object != null ? (c)object.f() : null;
        boolean bl = object == c4;
        return bl;
    }

    @Override
    protected long T() {
        if (super.T() == 0L) {
            return 0L;
        }
        Object object = n1.f.get(this);
        if (object != null) {
            if (object instanceof q) {
                if (!((q)object).j()) {
                    return 0L;
                }
            } else {
                if (object == q1.a()) {
                    return Long.MAX_VALUE;
                }
                return 0L;
            }
        }
        if ((object = (d)((Object)n1.g.get(this))) != null && (object = (c)object.f()) != null) {
            long l4 = ((c)object).c;
            kotlinx.coroutines.c.a();
            return j.f(l4 - System.nanoTime(), 0L);
        }
        return Long.MAX_VALUE;
    }

    @Override
    public long Y() {
        if (this.Z()) {
            return 0L;
        }
        this.i0();
        Runnable runnable = this.g0();
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        return this.T();
    }

    @Override
    public final void dispatch(@NotNull g g4, @NotNull Runnable runnable) {
        this.h0(runnable);
    }

    public void h0(@NotNull Runnable runnable) {
        this.i0();
        if (this.j0(runnable)) {
            this.d0();
        } else {
            v0.i.h0(runnable);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean n0() {
        boolean bl = this.X();
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        d d4 = (d)((Object)n1.g.get(this));
        if (d4 != null && !d4.e()) {
            return false;
        }
        Object v3 = n1.f.get(this);
        if (v3 == null) {
            return true;
        }
        if (v3 instanceof q) {
            return ((q)v3).j();
        }
        if (v3 != q1.a()) return bl2;
        return true;
    }

    public void p(long l4, @NotNull n<? super k0> n4) {
        long l5 = q1.c((long)l4);
        if (l5 < 0x3FFFFFFFFFFFFFFFL) {
            kotlinx.coroutines.c.a();
            l4 = System.nanoTime();
            a a4 = new a(this, l5 + l4, n4);
            this.q0(l4, a4);
            r.a(n4, (i1)a4);
        }
    }

    protected final void p0() {
        n1.f.set(this, null);
        n1.g.set(this, null);
    }

    @NotNull
    public i1 q(long l4, @NotNull Runnable runnable, @NotNull g g4) {
        return z0.a.a((z0)this, (long)l4, (Runnable)runnable, (g)g4);
    }

    public final void q0(long l4, @NotNull c c4) {
        int n4 = this.r0(l4, c4);
        if (n4 != 0) {
            if (n4 != 1) {
                if (n4 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
            } else {
                this.c0(l4, c4);
            }
        } else if (this.u0(c4)) {
            this.d0();
        }
    }

    @NotNull
    protected final i1 s0(long l4, @NotNull Runnable object) {
        long l5 = q1.c((long)l4);
        if (l5 < 0x3FFFFFFFFFFFFFFFL) {
            kotlinx.coroutines.c.a();
            l4 = System.nanoTime();
            object = new b(l5 + l4, (Runnable)object);
            this.q0(l4, (c)object);
        } else {
            object = q2.c;
        }
        return object;
    }

    @Override
    public void shutdown() {
        c3.a.c();
        this.t0(true);
        this.f0();
        while (this.Y() <= 0L) {
        }
        this.o0();
    }

    @Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2={"Lkotlinx/coroutines/n1$a;", "Lkotlinx/coroutines/n1$c;", "Lkotlin/k0;", "run", "()V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/n;", "e", "Lkotlinx/coroutines/n;", "cont", "", "nanoTime", "<init>", "(Lkotlinx/coroutines/n1;JLkotlinx/coroutines/n;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    @SourceDebugExtension(value={"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
    private final class a
    extends c {
        @NotNull
        private final n<k0> e;
        final n1 f;

        public a(n1 n12, @NotNull long l4, n<? super k0> n4) {
            this.f = n12;
            super(l4);
            this.e = n4;
        }

        @Override
        public void run() {
            this.e.E(this.f, k0.a);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(super.toString());
            stringBuilder.append(this.e);
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0010\f\u001a\u00060\bj\u0002`\t\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\f\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2={"Lkotlinx/coroutines/n1$b;", "Lkotlinx/coroutines/n1$c;", "Lkotlin/k0;", "run", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "e", "Ljava/lang/Runnable;", "block", "", "nanoTime", "<init>", "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    private static final class b
    extends c {
        @NotNull
        private final Runnable e;

        public b(long l4, @NotNull Runnable runnable) {
            super(l4);
            this.e = runnable;
        }

        @Override
        public void run() {
            this.e.run();
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(super.toString());
            stringBuilder.append(this.e);
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\f\u00a2\u0006\u0004\b/\u00100J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b \u0010!R\"\u0010(\u001a\u00020\t8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R0\u0010.\u001a\b\u0012\u0002\b\u0003\u0018\u00010)2\f\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010)8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010+\"\u0004\b,\u0010-\u00a8\u00061"}, d2={"Lkotlinx/coroutines/n1$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/i1;", "Lkotlinx/coroutines/internal/p0;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "other", "", "e", "(Lkotlinx/coroutines/n1$c;)I", "", "now", "", "g", "(J)Z", "Lkotlinx/coroutines/n1$d;", "delayed", "Lkotlinx/coroutines/n1;", "eventLoop", "f", "(JLkotlinx/coroutines/n1$d;Lkotlinx/coroutines/n1;)I", "Lkotlin/k0;", "dispose", "()V", "", "toString", "()Ljava/lang/String;", "c", "J", "nanoTime", "_heap", "Ljava/lang/Object;", "d", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "Lkotlinx/coroutines/internal/o0;", "value", "()Lkotlinx/coroutines/internal/o0;", "a", "(Lkotlinx/coroutines/internal/o0;)V", "heap", "<init>", "(J)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    @SourceDebugExtension(value={"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,547:1\n27#2:548\n27#2:551\n27#2:560\n16#3:549\n16#3:552\n16#3:561\n63#4:550\n64#4,7:553\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n441#1:548\n443#1:551\n483#1:560\n441#1:549\n443#1:552\n483#1:561\n443#1:550\n443#1:553,7\n*E\n"})
    public static abstract class c
    implements Runnable,
    Comparable<c>,
    i1,
    p0 {
        @Nullable
        private volatile Object _heap;
        @JvmField
        public long c;
        private int d;

        public c(long l4) {
            this.c = l4;
            this.d = -1;
        }

        public void a(@Nullable o0<?> o02) {
            if (this._heap != q1.b()) {
                this._heap = o02;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Nullable
        public o0<?> d() {
            Object object = this._heap;
            object = object instanceof o0 ? (o0)object : null;
            return object;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void dispose() {
            synchronized (this) {
                Throwable throwable2;
                block6: {
                    Object object;
                    block5: {
                        try {
                            object = this._heap;
                            d0 d02 = q1.b();
                            if (object != d02) break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        return;
                    }
                    if ((object = object instanceof d ? (d)((Object)object) : null) != null) {
                        object.h((p0)this);
                    }
                    this._heap = q1.b();
                    object = k0.a;
                    return;
                }
                throw throwable2;
            }
        }

        public int e(@NotNull c c4) {
            long l4 = this.c - c4.c - 0L;
            long l5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            l5 = l5 > 0 ? (long)1 : (l5 < 0 ? (long)-1 : (long)0);
            return (int)l5;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final int f(long var1_1, @NotNull d var3_2, @NotNull n1 var4_4) {
            synchronized (this) {
                block15: {
                    try {
                        var9_6 = this._heap;
                        var8_7 /* !! */  = q1.b();
                        if (var9_6 == var8_7 /* !! */ ) {
                        }

                    }
                    catch (Throwable var3_3) {
                        break block15;
                    }
                    return 2;

                    {
                        ** synchronized (var3_2)
                    }

                    {
                        block16: {
                            block14: {
                                try {
                                    var8_7 /* !! */  = (c)var3_2.b();
                                    var5_8 = n1.e0(var4_4);
                                    if (!var5_8) break block14;
                                }
                                catch (Throwable var4_5) {

                                }
                                return 1;
                            }
                            if (var8_7 /* !! */  != null) break block16;
                            var3_2.c = var1_1;

                        }
                        var6_9 = var8_7 /* !! */ .c;
                        if (var6_9 - var1_1 >= 0L) ** GOTO lbl-1000
                        var1_1 = var6_9;

                        {
                            if (var1_1 - var3_2.c > 0L) {
                                var3_2.c = var1_1;
                            }
lbl30:

                            var6_9 = this.c;
                            var1_1 = var3_2.c;
                            if (var6_9 - var1_1 >= 0L) ** GOTO lbl34
                        }
                        {
                            this.c = var1_1;
lbl34:

                            var3_2.a(this);
                            return 0;
                        }

                        {
                            throw var4_5;
                        }
                    }
                }
                throw var3_3;
            }
        }

        public final boolean g(long l4) {
            boolean bl = l4 - this.c >= 0L;
            return bl;
        }

        public int getIndex() {
            return this.d;
        }

        public void setIndex(int n4) {
            this.d = n4;
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Delayed[nanos=");
            stringBuilder.append(this.c);
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u0005\u00a8\u0006\t"}, d2={"Lkotlinx/coroutines/n1$d;", "Lkotlinx/coroutines/internal/o0;", "Lkotlinx/coroutines/n1$c;", "", "c", "J", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    public static final class d
    extends o0<c> {
        @JvmField
        public long c;

        public d(long l4) {
            this.c = l4;
        }
    }
}


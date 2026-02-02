/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.utils.io.pool.c
 *  io.ktor.utils.io.pool.d$b
 *  io.ktor.utils.io.pool.g
 *  io.ktor.utils.io.pool.g$a
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.utils.io.pool;

import io.ktor.utils.io.pool.c;
import io.ktor.utils.io.pool.d;
import io.ktor.utils.io.pool.g;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\b&\u0018\u0000 \u000f*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001-B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\n\u00a2\u0006\u0004\b,\u0010\u000eJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00028\u0000H$\u00a2\u0006\u0004\b\u0011\u0010\tJ\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0017\u0010\tJ\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0018\u0010\u0015J\r\u0010\u0019\u001a\u00020\f\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\n8\u0006\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010*\u00a8\u0006."}, d2={"Lio/ktor/utils/io/pool/d;", "", "T", "Lio/ktor/utils/io/pool/g;", "instance", "", "p", "(Ljava/lang/Object;)Z", "m", "()Ljava/lang/Object;", "", "index", "Lkotlin/k0;", "l", "(I)V", "h", "()I", "k", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "q", "(Ljava/lang/Object;)V", "e", "O", "o", "dispose", "()V", "c", "I", "getCapacity", "capacity", "", "top", "J", "maxIndex", "shift", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "f", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "instances", "", "g", "[I", "next", "<init>", "b", "ktor-io"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nDefaultPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultPool.kt\nio/ktor/utils/io/pool/DefaultPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Atomic.kt\nio/ktor/utils/io/utils/AtomicKt\n*L\n1#1,114:1\n1#2:115\n7#3:116\n*S KotlinDebug\n*F\n+ 1 DefaultPool.kt\nio/ktor/utils/io/pool/DefaultPool\n*L\n111#1:116\n*E\n"})
public abstract class d<T>
implements g<T> {
    @NotNull
    public static final b h = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final AtomicLongFieldUpdater<d<?>> i;
    private final int c;
    private final int d;
    private final int e;
    @NotNull
    private final AtomicReferenceArray<T> f;
    @NotNull
    private final int[] g;
    private volatile long top;

    static {
        AtomicLongFieldUpdater<d> atomicLongFieldUpdater = AtomicLongFieldUpdater.newUpdater(d.class, a.c.getName());
        y.i(atomicLongFieldUpdater, (String)"newUpdater(Owner::class.java, p.name)");
        i = atomicLongFieldUpdater;
    }

    public d(int n4) {
        this.c = n4;
        if (n4 > 0) {
            if (n4 <= 0x1FFFFFFF) {
                this.d = n4 = Integer.highestOneBit(n4 * 4 - 1) * 2;
                this.e = Integer.numberOfLeadingZeros(n4) + 1;
                this.f = new AtomicReferenceArray(n4 + 1);
                this.g = new int[n4 + 1];
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("capacity should be less or equal to 536870911 but it is ");
            stringBuilder.append(n4);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("capacity should be positive but it is ");
        stringBuilder.append(n4);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    private final int h() {
        int n4;
        long l4;
        long l5;
        do {
            if ((l5 = this.top) == 0L) {
                return 0;
            }
            n4 = (int)(0xFFFFFFFFL & l5);
            if (n4 != 0) continue;
            return 0;
        } while (!i.compareAndSet(this, l5, (l5 >> 32 & 0xFFFFFFFFL) + 1L << 32 | (l4 = (long)this.g[n4])));
        return n4;
    }

    private final void l(int n4) {
        if (n4 > 0) {
            long l4;
            long l5;
            do {
                l5 = this.top;
                int n5 = (int)(0xFFFFFFFFL & l5);
                l4 = n4;
                this.g[n4] = n5;
            } while (!i.compareAndSet(this, l5, (l5 >> 32 & 0xFFFFFFFFL) + 1L << 32 | l4));
            return;
        }
        throw new IllegalArgumentException("index should be positive".toString());
    }

    private final T m() {
        int n4 = this.h();
        Object var2_2 = null;
        if (n4 != 0) {
            var2_2 = this.f.getAndSet(n4, null);
        }
        return var2_2;
    }

    private final boolean p(T t3) {
        int n4 = (System.identityHashCode(t3) * -1640531527 >>> this.e) + 1;
        for (int i4 = 0; i4 < 8; ++i4) {
            int n5;
            if (io.ktor.utils.io.pool.c.a(this.f, (int)n4, null, t3)) {
                this.l(n4);
                return true;
            }
            n4 = n5 = n4 - 1;
            if (n5 != 0) continue;
            n4 = this.d;
        }
        return false;
    }

    @NotNull
    public final T O() {
        T t3;
        block3: {
            block2: {
                T t4;
                t3 = this.m();
                if (t3 == null) break block2;
                t3 = t4 = this.d(t3);
                if (t4 != null) break block3;
            }
            t3 = this.k();
        }
        return t3;
    }

    public void close() {
        g.a.a((g)this);
    }

    @NotNull
    protected T d(@NotNull T t3) {
        y.j(t3, (String)"instance");
        return t3;
    }

    public final void dispose() {
        T t3;
        while ((t3 = this.m()) != null) {
            this.e(t3);
        }
        return;
    }

    protected void e(@NotNull T t3) {
        y.j(t3, (String)"instance");
    }

    @NotNull
    protected abstract T k();

    public final void o(@NotNull T t3) {
        y.j(t3, (String)"instance");
        this.q(t3);
        if (!this.p(t3)) {
            this.e(t3);
        }
    }

    protected void q(@NotNull T t3) {
        y.j(t3, (String)"instance");
    }
}


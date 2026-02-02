/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.utils.io.pool.c
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlinx.coroutines.channels.f
 *  kotlinx.coroutines.channels.z
 *  kotlinx.coroutines.internal.w
 *  kotlinx.coroutines.k3
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.channels;

import io.ktor.utils.io.pool.c;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.channels.e;
import kotlinx.coroutines.channels.f;
import kotlinx.coroutines.channels.z;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.k3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002B7\u0012\u0006\u00100\u001a\u00020/\u0012\u000e\u00101\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#\u0012\u0006\u00102\u001a\u00020\u0003\u00a2\u0006\u0004\b3\u00104J!\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002\u00a2\u0006\u0004\b\u0001\u0010\bJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0000\u00a2\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\b\u0010\u0010\fJ!\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000\u00a2\u0006\u0004\b\u0011\u0010\bJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0000\u00a2\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0014\u00a2\u0006\u0004\b!\u0010\"R\u001c\u0010&\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000#8F\u00a2\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050-8\u0002X\u0082\u0004\u00a8\u00065"}, d2={"Lkotlinx/coroutines/channels/l;", "E", "Lkotlinx/coroutines/internal/a0;", "", "index", "", "value", "Lkotlin/k0;", "(ILjava/lang/Object;)V", "element", "G", "A", "(I)Ljava/lang/Object;", "D", "w", "(I)V", "B", "F", "from", "to", "", "v", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "update", "x", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "cause", "Lkotlin/coroutines/g;", "context", "s", "(ILjava/lang/Throwable;Lkotlin/coroutines/g;)V", "receiver", "C", "(IZ)V", "Lkotlinx/coroutines/channels/e;", "g", "Lkotlinx/coroutines/channels/e;", "_channel", "y", "()Lkotlinx/coroutines/channels/e;", "channel", "r", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "data", "", "id", "prev", "pointers", "<init>", "(JLkotlinx/coroutines/channels/l;Lkotlinx/coroutines/channels/e;I)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/ChannelSegment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3116:1\n1#2:3117\n*E\n"})
public final class l<E>
extends a0<l<E>> {
    @Nullable
    private final e<E> g;
    private final AtomicReferenceArray h;

    public l(long l4, @Nullable l<E> l5, @Nullable e<E> e4, int n4) {
        super(l4, l5, n4);
        this.g = e4;
        this.h = new AtomicReferenceArray(f.b * 2);
    }

    private final void E(int n4, Object object) {
        this.z().set(n4 * 2, object);
    }

    private final /* synthetic */ AtomicReferenceArray z() {
        return this.h;
    }

    public final E A(int n4) {
        return this.z().get(n4 * 2);
    }

    @Nullable
    public final Object B(int n4) {
        return this.z().get(n4 * 2 + 1);
    }

    public final void C(int n4, boolean bl) {
        if (bl) {
            this.y().t1(this.e * (long)f.b + (long)n4);
        }
        this.t();
    }

    public final E D(int n4) {
        E e4 = this.A(n4);
        this.w(n4);
        return e4;
    }

    public final void F(int n4, @Nullable Object object) {
        this.z().set(n4 * 2 + 1, object);
    }

    public final void G(int n4, E e4) {
        this.E(n4, e4);
    }

    @Override
    public int r() {
        return f.b;
    }

    @Override
    public void s(int n4, @Nullable Throwable object, @NotNull g g4) {
        int n5 = f.b;
        boolean bl = n4 >= n5;
        int n6 = n4;
        if (bl) {
            n6 = n4 - n5;
        }
        E e4 = this.A(n6);
        while (true) {
            Object object2;
            if (!((object2 = this.B(n6)) instanceof k3) && !(object2 instanceof z)) {
                if (object2 != f.j() && object2 != f.i()) {
                    if (object2 == f.p() || object2 == f.q()) continue;
                    if (object2 != f.f() && object2 != f.d) {
                        if (object2 == f.z()) {
                            return;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("unexpected state: ");
                        ((StringBuilder)object).append(object2);
                        throw new IllegalStateException(((StringBuilder)object).toString().toString());
                    }
                    return;
                }
                this.w(n6);
                if (bl && (object = this.y().d) != null) {
                    w.a((kotlin.jvm.functions.l)object, e4, (g)g4);
                }
                return;
            }
            object = bl ? f.j() : f.i();
            if (this.v(n6, object2, object)) break;
        }
        this.w(n6);
        this.C(n6, bl ^ true);
        if (bl && (object = this.y().d) != null) {
            w.a((kotlin.jvm.functions.l)object, e4, (g)g4);
        }
    }

    public final boolean v(int n4, @Nullable Object object, @Nullable Object object2) {
        return c.a((AtomicReferenceArray)this.z(), (int)(n4 * 2 + 1), (Object)object, (Object)object2);
    }

    public final void w(int n4) {
        this.E(n4, null);
    }

    @Nullable
    public final Object x(int n4, @Nullable Object object) {
        return this.z().getAndSet(n4 * 2 + 1, object);
    }

    @NotNull
    public final e<E> y() {
        e<E> e4 = this.g;
        y.g(e4);
        return e4;
    }
}


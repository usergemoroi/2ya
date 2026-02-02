/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.animation.core.k
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.jvm.internal.g
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.u
 *  kotlin.u$a
 *  kotlinx.coroutines.flow.internal.c
 *  kotlinx.coroutines.flow.internal.d
 *  kotlinx.coroutines.flow.s0
 *  kotlinx.coroutines.internal.c
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow;

import androidx.compose.animation.core.k;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.u;
import kotlinx.coroutines.flow.internal.c;
import kotlinx.coroutines.flow.internal.d;
import kotlinx.coroutines.flow.r0;
import kotlinx.coroutines.flow.s0;
import kotlinx.coroutines.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0018\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t\u00a2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tH\u0086@\u00a2\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0017\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013`\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0019"}, d2={"Lkotlinx/coroutines/flow/t0;", "Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/flow/r0;", "flow", "", "d", "(Lkotlinx/coroutines/flow/r0;)Z", "", "Lkotlin/coroutines/d;", "Lkotlin/k0;", "f", "(Lkotlinx/coroutines/flow/r0;)[Lkotlin/coroutines/d;", "g", "()V", "h", "()Z", "e", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "_state", "<init>", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n+ 2 Concurrent.common.kt\nkotlinx/coroutines/internal/Concurrent_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,433:1\n37#2,2:434\n1#3:436\n351#4,11:437\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n*L\n280#1:434,2\n303#1:437,11\n*E\n"})
final class t0
extends d<r0<?>> {
    @NotNull
    private final AtomicReference<Object> a = new AtomicReference<Object>(null);

    public boolean d(@NotNull r0<?> r02) {
        if (kotlinx.coroutines.internal.c.a(this.a) != null) {
            return false;
        }
        kotlinx.coroutines.internal.c.b(this.a, (Object)s0.b());
        return true;
    }

    @Nullable
    public final Object e(@NotNull kotlin.coroutines.d<? super k0> d4) {
        Object object;
        p p4 = new p(b.c(d4), 1);
        p4.H();
        if (!k.a((AtomicReference)this.a, (Object)s0.b(), p4)) {
            object = u.d;
            p4.resumeWith(u.b((Object)k0.a));
        }
        if ((object = p4.z()) == b.f()) {
            g.c(d4);
        }
        if (object == b.f()) {
            return object;
        }
        return k0.a;
    }

    @NotNull
    public kotlin.coroutines.d<k0>[] f(@NotNull r0<?> r02) {
        kotlinx.coroutines.internal.c.b(this.a, null);
        return c.a;
    }

    public final void g() {
        Object object;
        u.a a4 = this.a;
        while (true) {
            if ((object = kotlinx.coroutines.internal.c.a(a4)) == null) {
                return;
            }
            if (object == s0.c()) {
                return;
            }
            if (object == s0.b()) {
                if (!k.a(this.a, (Object)object, (Object)s0.c())) continue;
                return;
            }
            if (k.a(this.a, (Object)object, (Object)s0.b())) break;
        }
        object = (p)object;
        a4 = u.d;
        object.resumeWith(u.b((Object)k0.a));
    }

    public final boolean h() {
        Object object = this.a.getAndSet(s0.b());
        y.g((Object)object);
        boolean bl = object == s0.c();
        return bl;
    }
}


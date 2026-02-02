/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$c
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.k0
 *  kotlin.t
 *  kotlin.z
 *  kotlinx.coroutines.e0
 *  kotlinx.coroutines.internal.k0
 *  kotlinx.coroutines.k0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.t;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.j3;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0014\u00a2\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00110\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001b"}, d2={"Lkotlinx/coroutines/i3;", "T", "Lkotlinx/coroutines/internal/z;", "Lkotlin/coroutines/g;", "context", "", "oldValue", "Lkotlin/k0;", "d1", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "", "c1", "()Z", "state", "Y0", "(Ljava/lang/Object;)V", "Ljava/lang/ThreadLocal;", "Lkotlin/t;", "g", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "threadLocalIsSet", "Z", "Lkotlin/coroutines/d;", "uCont", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,310:1\n1#2:311\n103#3,13:312\n*S KotlinDebug\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n*L\n265#1:312,13\n*E\n"})
public final class i3<T>
extends z<T> {
    @NotNull
    private final ThreadLocal<t<g, Object>> g;
    private volatile boolean threadLocalIsSet;

    public i3(@NotNull g g4, @NotNull d<? super T> object) {
        j3 j32 = j3.c;
        j32 = g4.get((g.c)j32) == null ? g4.plus((g)j32) : g4;
        super(j32, object);
        this.g = new ThreadLocal();
        if (!(object.getContext().get((g.c)e.A8) instanceof m0)) {
            object = kotlinx.coroutines.internal.k0.i((g)g4, null);
            kotlinx.coroutines.internal.k0.f((g)g4, object);
            this.d1(g4, object);
        }
    }

    @Override
    protected void Y0(@Nullable Object object) {
        g g4;
        if (this.threadLocalIsSet) {
            g4 = this.g.get();
            if (g4 != null) {
                kotlinx.coroutines.internal.k0.f((g)((g)g4.a()), (Object)g4.b());
            }
            this.g.remove();
        }
        Object object2 = e0.a((Object)object, this.f);
        d d4 = this.f;
        g4 = d4.getContext();
        object = null;
        Object object3 = kotlinx.coroutines.internal.k0.i((g)g4, null);
        if (object3 != kotlinx.coroutines.internal.k0.a) {
            object = k0.m(d4, (g)g4, (Object)object3);
        }
        try {
            this.f.resumeWith(object2);
            object2 = kotlin.k0.a;
            return;
        }
        finally {
            if (object == null || ((i3)object).c1()) {
                kotlinx.coroutines.internal.k0.f((g)g4, (Object)object3);
            }
        }
    }

    public final boolean c1() {
        boolean bl = this.threadLocalIsSet && this.g.get() == null;
        this.g.remove();
        return bl ^ true;
    }

    public final void d1(@NotNull g g4, @Nullable Object object) {
        this.threadLocalIsSet = true;
        this.g.set((t<g, Object>)kotlin.z.a((Object)g4, (Object)object));
    }
}


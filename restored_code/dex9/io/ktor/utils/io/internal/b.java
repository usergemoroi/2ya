/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.concurrent.futures.a
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$c
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.u
 *  kotlin.u$a
 *  kotlin.v
 *  kotlinx.coroutines.d2$a
 *  kotlinx.coroutines.i1
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.utils.io.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.u;
import kotlin.v;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001#B\u0007\u00a2\u0006\u0004\b!\u0010\"J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0010\u0010\n\u001a\f0\tR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001e\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2={"Lio/ktor/utils/io/internal/b;", "", "T", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/g;", "context", "Lkotlin/k0;", "j", "(Lkotlin/coroutines/g;)V", "Lio/ktor/utils/io/internal/b$a;", "relation", "g", "(Lio/ktor/utils/io/internal/b$a;)V", "Lkotlinx/coroutines/d2;", "job", "", "exception", "k", "(Lkotlinx/coroutines/d2;Ljava/lang/Throwable;)V", "value", "d", "(Ljava/lang/Object;)V", "cause", "e", "(Ljava/lang/Throwable;)V", "actual", "f", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/u;", "result", "resumeWith", "getContext", "()Lkotlin/coroutines/g;", "<init>", "()V", "a", "ktor-io"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nCancellableReusableContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableReusableContinuation.kt\nio/ktor/utils/io/internal/CancellableReusableContinuation\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,137:1\n175#2,4:138\n175#2,4:142\n175#2,4:146\n*S KotlinDebug\n*F\n+ 1 CancellableReusableContinuation.kt\nio/ktor/utils/io/internal/CancellableReusableContinuation\n*L\n60#1:138,4\n82#1:142,4\n99#1:146,4\n*E\n"})
public final class b<T>
implements d<T> {
    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "state");
    private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "jobCancellationHandler");
    @NotNull
    private volatile Object jobCancellationHandler = null;
    @NotNull
    private volatile Object state = null;

    private final void g(a a4) {
        androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)d, (Object)this, (Object)a4, null);
    }

    private final void j(g object) {
        d2 d22;
        object = (a)this.jobCancellationHandler;
        object = object != null ? ((a)object).b() : null;
        if (object == (d22 = (d2)object.get((g.c)d2.C8))) {
            return;
        }
        if (d22 == null) {
            object = d.getAndSet(this, null);
            if (object != null) {
                ((a)object).a();
            }
        } else {
            a a4;
            a a5 = new a(this, d22);
            do {
                if ((a4 = (a)(object = this.jobCancellationHandler)) == null || a4.b() != d22) continue;
                a5.a();
                return;
            } while (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)d, (Object)this, (Object)object, (Object)a5));
            if (a4 != null) {
                a4.a();
            }
        }
    }

    private final void k(d2 d22, Throwable throwable) {
        d d4;
        Object object;
        do {
            if (!((object = this.state) instanceof d)) {
                return;
            }
            d4 = (d)object;
            if (d4.getContext().get((g.c)d2.C8) == d22) continue;
            return;
        } while (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)c, (Object)this, (Object)object, null));
        y.h((Object)object, (String)"null cannot be cast to non-null type kotlin.coroutines.Continuation<T of io.ktor.utils.io.internal.CancellableReusableContinuation>");
        d22 = u.d;
        d4.resumeWith(u.b((Object)v.a((Throwable)throwable)));
    }

    public final void d(@NotNull T object) {
        y.j(object, (String)"value");
        this.resumeWith(u.b(object));
        object = d.getAndSet(this, null);
        if (object != null) {
            ((a)object).a();
        }
    }

    public final void e(@NotNull Throwable object) {
        y.j((Object)object, (String)"cause");
        u.a a4 = u.d;
        this.resumeWith(u.b((Object)v.a((Throwable)object)));
        object = d.getAndSet(this, null);
        if (object != null) {
            ((a)object).a();
        }
    }

    @NotNull
    public final Object f(@NotNull d<? super T> d4) {
        Object object;
        y.j(d4, (String)"actual");
        while (true) {
            if ((object = this.state) == null) {
                if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)c, (Object)this, null, d4)) continue;
                this.j(d4.getContext());
                return kotlin.coroutines.intrinsics.b.f();
            }
            if (androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)c, (Object)this, (Object)object, null)) break;
        }
        if (!(object instanceof Throwable)) {
            y.h((Object)object, (String)"null cannot be cast to non-null type T of io.ktor.utils.io.internal.CancellableReusableContinuation");
            return object;
        }
        throw (Throwable)object;
    }

    @NotNull
    public g getContext() {
        Object object;
        block3: {
            block2: {
                object = this.state;
                object = object instanceof d ? (d)object : null;
                if (object == null) break block2;
                g g4 = object.getContext();
                object = g4;
                if (g4 != null) break block3;
            }
            object = h.c;
        }
        return object;
    }

    public void resumeWith(@NotNull Object object) {
        block3: {
            Object object2;
            Object object3;
            do {
                if ((object3 = this.state) == null) {
                    Throwable throwable = u.e((Object)object);
                    object2 = throwable;
                    if (throwable != null) continue;
                    v.b((Object)object);
                    object2 = object;
                    continue;
                }
                if (!(object3 instanceof d)) break block3;
                object2 = null;
            } while (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)c, (Object)this, (Object)object3, (Object)object2));
            if (object3 instanceof d) {
                ((d)object3).resumeWith(object);
            }
        }
    }

    @Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00a2\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\f8\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2={"Lio/ktor/utils/io/internal/b$a;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/k0;", "Lkotlinx/coroutines/CompletionHandler;", "c", "(Ljava/lang/Throwable;)V", "a", "()V", "Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/d2;", "b", "()Lkotlinx/coroutines/d2;", "job", "Lkotlinx/coroutines/i1;", "d", "Lkotlinx/coroutines/i1;", "handler", "<init>", "(Lio/ktor/utils/io/internal/b;Lkotlinx/coroutines/d2;)V", "ktor-io"}, k=1, mv={1, 8, 0})
    private final class a
    implements l<Throwable, k0> {
        @NotNull
        private final d2 c;
        @Nullable
        private i1 d;
        final b<T> e;

        public a(@NotNull b b4, d2 d22) {
            y.j((Object)d22, (String)"job");
            this.e = b4;
            this.c = d22;
            b4 = d2.a.d((d2)d22, (boolean)true, (boolean)false, (l)this, (int)2, null);
            if (d22.isActive()) {
                this.d = b4;
            }
        }

        public final void a() {
            i1 i12 = this.d;
            if (i12 != null) {
                this.d = null;
                i12.dispose();
            }
        }

        @NotNull
        public final d2 b() {
            return this.c;
        }

        public void c(@Nullable Throwable throwable) {
            this.e.g(this);
            this.a();
            if (throwable != null) {
                this.e.k(this.c, throwable);
            }
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$c
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.u
 *  kotlin.v
 *  kotlinx.coroutines.c0
 *  kotlinx.coroutines.e1
 *  kotlinx.coroutines.internal.k0
 *  kotlinx.coroutines.k0
 *  kotlinx.coroutines.o0
 *  kotlinx.coroutines.scheduling.h
 *  kotlinx.coroutines.t0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.u;
import kotlin.v;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i3;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H \u00a2\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010\u00a2\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\bH\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006 "}, d2={"Lkotlinx/coroutines/d1;", "T", "Lkotlinx/coroutines/scheduling/h;", "Lkotlinx/coroutines/SchedulerTask;", "", "j", "()Ljava/lang/Object;", "takenState", "", "cause", "Lkotlin/k0;", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "()V", "exception", "g", "(Ljava/lang/Throwable;)V", "", "I", "resumeMode", "Lkotlin/coroutines/d;", "d", "()Lkotlin/coroutines/d;", "delegate", "<init>", "(I)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,208:1\n1#2:209\n103#3,10:210\n114#3,2:224\n206#4:220\n207#4:223\n57#5,2:221\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n*L\n83#1:210,10\n83#1:224,2\n96#1:220\n96#1:223\n96#1:221,2\n*E\n"})
public abstract class d1<T>
extends kotlinx.coroutines.scheduling.h {
    @JvmField
    public int e;

    public d1(int n4) {
        this.e = n4;
    }

    public void a(@Nullable Object object, @NotNull Throwable throwable) {
    }

    @NotNull
    public abstract d<T> d();

    @Nullable
    public Throwable e(@Nullable Object object) {
        boolean bl = object instanceof c0;
        Throwable throwable = null;
        object = bl ? (c0)object : null;
        if (object != null) {
            throwable = ((c0)object).a;
        }
        return throwable;
    }

    public <T> T f(@Nullable Object object) {
        return (T)object;
    }

    public final void g(@NotNull Throwable throwable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fatal exception in coroutines machinery for ");
        stringBuilder.append((Object)this);
        stringBuilder.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        throwable = new t0(stringBuilder.toString(), throwable);
        o0.a((g)this.d().getContext(), (Throwable)throwable);
    }

    @Nullable
    public abstract Object j();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable4;
        block14: {
            Throwable throwable22;
            Object object;
            g g4;
            Object object2;
            block12: {
                block13: {
                    Object object3;
                    Throwable throwable3;
                    Object object4;
                    d2 d22;
                    d d4;
                    block11: {
                        try {
                            object2 = this.d();
                            y.h(object2, (String)"null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
                            object2 = (h)((Object)object2);
                            d4 = ((h)((Object)object2)).g;
                            object2 = ((h)((Object)object2)).i;
                            g4 = d4.getContext();
                            object = kotlinx.coroutines.internal.k0.i((g)g4, (Object)object2);
                            object2 = kotlinx.coroutines.internal.k0.a;
                            d22 = null;
                            object2 = object != object2 ? kotlinx.coroutines.k0.m(d4, (g)g4, (Object)object) : null;
                        }
                        catch (Throwable throwable4) {}
                        try {
                            g g5 = d4.getContext();
                            object4 = this.j();
                            throwable3 = this.e(object4);
                            object3 = d22;
                            if (throwable3 != null) break block11;
                            object3 = d22;
                            if (!e1.b((int)this.e)) break block11;
                            object3 = (d2)g5.get((g.c)d2.C8);
                        }
                        catch (Throwable throwable22) {
                            break block12;
                        }
                    }
                    if (object3 != null && !object3.isActive()) {
                        object3 = object3.y();
                        this.a(object4, (Throwable)object3);
                        d22 = u.d;
                        d4.resumeWith(u.b((Object)v.a((Throwable)object3)));
                    } else if (throwable3 != null) {
                        object3 = u.d;
                        d4.resumeWith(u.b((Object)v.a((Throwable)throwable3)));
                    } else {
                        object3 = u.d;
                        d4.resumeWith(u.b(this.f(object4)));
                    }
                    object3 = k0.a;
                    if (object2 == null) break block13;
                    if (!((i3)object2).c1()) return;
                    break block14;
                }
                kotlinx.coroutines.internal.k0.f((g)g4, (Object)object);
                return;
            }
            if (object2 != null) {
                if (!((i3)object2).c1()) throw throwable22;
            }
            kotlinx.coroutines.internal.k0.f((g)g4, (Object)object);
            throw throwable22;
        }
        this.g(throwable4);
    }
}


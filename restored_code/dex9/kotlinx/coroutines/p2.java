/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.e
 *  kotlin.k0
 *  kotlin.sequences.i
 *  kotlinx.coroutines.i1
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.a;
import kotlin.e;
import kotlin.jvm.functions.l;
import kotlin.k0;
import kotlin.sequences.i;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.q2;
import kotlinx.coroutines.selects.d;
import kotlinx.coroutines.u;
import kotlinx.coroutines.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002\u00a2\u0006\u0004\b7\u0010'J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0097@\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0017\u00a2\u0006\u0004\b\u000b\u0010\fJ8\u0010\u0015\u001a\u00020\u00142'\u0010\u0013\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u0012H\u0017\u00a2\u0006\u0004\b\u0015\u0010\u0016JH\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032'\u0010\u0013\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u0012H\u0017\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00062\u000e\u0010\u0011\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0017\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017\u00a2\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00038VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0005R\u001a\u0010*\u001a\u00020\u00038VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0005R\u001a\u0010+\u001a\u00020\u00038VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u0005R\u001a\u00101\u001a\u00020-8VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b0\u0010'\u001a\u0004\b.\u0010/R \u00106\u001a\b\u0012\u0004\u0012\u00020\u0002028VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b5\u0010'\u001a\u0004\b3\u00104\u00a8\u00068"}, d2={"Lkotlinx/coroutines/p2;", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/d2;", "", "start", "()Z", "Lkotlin/k0;", "C", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "y", "()Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/i1;", "f", "(Lkotlin/jvm/functions/l;)Lkotlinx/coroutines/i1;", "onCancelling", "invokeImmediately", "w", "(ZZLkotlin/jvm/functions/l;)Lkotlinx/coroutines/i1;", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "Lkotlinx/coroutines/w;", "child", "Lkotlinx/coroutines/u;", "s", "(Lkotlinx/coroutines/w;)Lkotlinx/coroutines/u;", "", "toString", "()Ljava/lang/String;", "isActive", "isActive$annotations", "()V", "h", "isCompleted$annotations", "isCompleted", "isCancelled", "isCancelled$annotations", "Lkotlinx/coroutines/selects/d;", "r", "()Lkotlinx/coroutines/selects/d;", "getOnJoin$annotations", "onJoin", "Lkotlin/sequences/i;", "d", "()Lkotlin/sequences/i;", "getChildren$annotations", "children", "<init>", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public final class p2
extends a
implements d2 {
    @NotNull
    public static final p2 c = new p2();

    private p2() {
        super(d2.C8);
    }

    @Override
    @Deprecated(level=e.c, message="NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @Nullable
    public Object C(@NotNull kotlin.coroutines.d<? super k0> d4) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override
    @Deprecated(level=e.c, message="NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public void cancel(@Nullable CancellationException cancellationException) {
    }

    @Override
    @NotNull
    public i<d2> d() {
        return kotlin.sequences.l.e();
    }

    @Override
    @Deprecated(level=e.c, message="NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @NotNull
    public i1 f(@NotNull l<? super Throwable, k0> l4) {
        return q2.c;
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public boolean isActive() {
        return true;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    @NotNull
    public d r() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override
    @Deprecated(level=e.c, message="NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @NotNull
    public u s(@NotNull w w3) {
        return q2.c;
    }

    @Override
    @Deprecated(level=e.c, message="NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public boolean start() {
        return false;
    }

    @NotNull
    public String toString() {
        return "NonCancellable";
    }

    @Override
    @Deprecated(level=e.c, message="NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @NotNull
    public i1 w(boolean bl, boolean bl2, @NotNull l<? super Throwable, k0> l4) {
        return q2.c;
    }

    @Override
    @Deprecated(level=e.c, message="NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @NotNull
    public CancellationException y() {
        throw new IllegalStateException("This job is always active");
    }
}


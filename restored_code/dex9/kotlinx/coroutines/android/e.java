/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlinx.coroutines.android.e$a
 *  kotlinx.coroutines.g1
 *  kotlinx.coroutines.g2
 *  kotlinx.coroutines.i1
 *  kotlinx.coroutines.z0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.ranges.j;
import kotlinx.coroutines.android.c;
import kotlinx.coroutines.android.d;
import kotlinx.coroutines.android.e;
import kotlinx.coroutines.android.f;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.n;
import kotlinx.coroutines.q2;
import kotlinx.coroutines.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010%\u001a\u00020\"\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010+\u001a\u00020\u000b\u00a2\u0006\u0004\b1\u00102B\u001d\b\u0016\u0012\u0006\u0010%\u001a\u00020\"\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\b1\u00103J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016\u00a2\u0006\u0004\b\u000e\u0010\nJ%\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u001a\u00100\u001a\u00020\u00008\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\u00a8\u00064"}, d2={"Lkotlinx/coroutines/android/e;", "Lkotlinx/coroutines/android/f;", "Lkotlinx/coroutines/z0;", "Lkotlin/coroutines/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/k0;", "U", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "", "isDispatchNeeded", "(Lkotlin/coroutines/g;)Z", "dispatch", "", "timeMillis", "Lkotlinx/coroutines/n;", "continuation", "p", "(JLkotlinx/coroutines/n;)V", "Lkotlinx/coroutines/i1;", "q", "(JLjava/lang/Runnable;Lkotlin/coroutines/g;)Lkotlinx/coroutines/i1;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "handler", "d", "Ljava/lang/String;", "name", "e", "Z", "invokeImmediately", "f", "Lkotlinx/coroutines/android/e;", "V", "()Lkotlinx/coroutines/android/e;", "immediate", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,212:1\n13#2:213\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n*L\n140#1:213\n*E\n"})
public final class e
extends f
implements z0 {
    @NotNull
    private final Handler c;
    @Nullable
    private final String d;
    private final boolean e;
    @NotNull
    private final e f;

    public e(@NotNull Handler handler, @Nullable String string) {
        this(handler, string, false);
    }

    public /* synthetic */ e(Handler handler, String string, int n4, p p4) {
        if ((n4 & 2) != 0) {
            string = null;
        }
        this(handler, string);
    }

    private e(Handler object, String string, boolean bl) {
        super((p)null);
        this.c = object;
        this.d = string;
        this.e = bl;
        object = bl ? this : new e((Handler)object, string, true);
        this.f = object;
    }

    public static /* synthetic */ void S(e e4, Runnable runnable) {
        kotlinx.coroutines.android.e.W(e4, runnable);
    }

    public static /* synthetic */ k0 T(e e4, Runnable runnable, Throwable throwable) {
        return kotlinx.coroutines.android.e.X(e4, runnable, throwable);
    }

    private final void U(g g4, Runnable runnable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The task was rejected, the handler underlying the dispatcher '");
        stringBuilder.append(this);
        stringBuilder.append("' was closed");
        g2.c((g)g4, (CancellationException)new CancellationException(stringBuilder.toString()));
        g1.b().dispatch(g4, runnable);
    }

    private static final void W(e e4, Runnable runnable) {
        e4.c.removeCallbacks(runnable);
    }

    private static final k0 X(e e4, Runnable runnable, Throwable throwable) {
        e4.c.removeCallbacks(runnable);
        return k0.a;
    }

    @NotNull
    public e V() {
        return this.f;
    }

    @Override
    public void dispatch(@NotNull g g4, @NotNull Runnable runnable) {
        if (!this.c.post(runnable)) {
            this.U(g4, runnable);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@Nullable Object object) {
        if (!(object instanceof e)) return false;
        object = (e)object;
        if (((e)object).c != this.c) return false;
        if (((e)object).e != this.e) return false;
        return true;
    }

    public int hashCode() {
        int n4 = System.identityHashCode(this.c);
        int n5 = this.e ? 1231 : 1237;
        return n4 ^ n5;
    }

    @Override
    public boolean isDispatchNeeded(@NotNull g g4) {
        boolean bl = !this.e || !y.e((Object)Looper.myLooper(), (Object)this.c.getLooper());
        return bl;
    }

    public void p(long l4, @NotNull n<? super k0> n4) {
        a a4 = new a(n4, this);
        if (this.c.postDelayed((Runnable)a4, j.j(l4, 0x3FFFFFFFFFFFFFFFL))) {
            n4.u(new d(this, (Runnable)a4));
        } else {
            this.U(n4.getContext(), (Runnable)a4);
        }
    }

    @Override
    @NotNull
    public i1 q(long l4, @NotNull Runnable runnable, @NotNull g g4) {
        if (this.c.postDelayed(runnable, j.j(l4, 0x3FFFFFFFFFFFFFFFL))) {
            return new c(this, runnable);
        }
        this.U(g4, runnable);
        return q2.c;
    }

    @Override
    @NotNull
    public String toString() {
        String string = this.L();
        CharSequence charSequence = string;
        if (string == null) {
            charSequence = this.d;
            string = charSequence;
            if (charSequence == null) {
                string = this.c.toString();
            }
            charSequence = string;
            if (this.e) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append(".immediate");
                charSequence = ((StringBuilder)charSequence).toString();
            }
        }
        return charSequence;
    }
}


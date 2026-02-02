/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SubclassOptInRequired
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g$c
 *  kotlin.k0
 *  kotlin.sequences.i
 *  kotlinx.coroutines.InternalCoroutinesApi
 *  kotlinx.coroutines.InternalForInheritanceCoroutinesApi
 *  kotlinx.coroutines.i1
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.SubclassOptInRequired;
import kotlin.coroutines.g;
import kotlin.jvm.functions.l;
import kotlin.k0;
import kotlin.sequences.i;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.InternalForInheritanceCoroutinesApi;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.selects.d;
import kotlinx.coroutines.u;
import kotlinx.coroutines.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 -2\u00020\u0001:\u0001.J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH\u00a6@\u00a2\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u001b\u001a\u00020\u001a2'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015\u00a2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0018H&\u00a2\u0006\u0004\b\u001b\u0010\u001cJL\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015\u00a2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0018H'\u00a2\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\bR\u0014\u0010#\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\bR\u0014\u0010$\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\bR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00000%8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010+\u00a8\u0006/"}, d2={"Lkotlinx/coroutines/d2;", "Lkotlin/coroutines/g$b;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "y", "()Ljava/util/concurrent/CancellationException;", "", "start", "()Z", "cause", "Lkotlin/k0;", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "Lkotlinx/coroutines/w;", "child", "Lkotlinx/coroutines/u;", "s", "(Lkotlinx/coroutines/w;)Lkotlinx/coroutines/u;", "C", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/i1;", "f", "(Lkotlin/jvm/functions/l;)Lkotlinx/coroutines/i1;", "onCancelling", "invokeImmediately", "w", "(ZZLkotlin/jvm/functions/l;)Lkotlinx/coroutines/i1;", "isActive", "h", "isCompleted", "isCancelled", "Lkotlin/sequences/i;", "d", "()Lkotlin/sequences/i;", "children", "Lkotlinx/coroutines/selects/d;", "r", "()Lkotlinx/coroutines/selects/d;", "onJoin", "C8", "b", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SubclassOptInRequired(markerClass=InternalForInheritanceCoroutinesApi.class)
public interface d2
extends g.b {
    @NotNull
    public static final b C8 = b.c;

    @Nullable
    public Object C(@NotNull kotlin.coroutines.d<? super k0> var1);

    public void cancel(@Nullable CancellationException var1);

    @NotNull
    public i<d2> d();

    @NotNull
    public i1 f(@NotNull l<? super Throwable, k0> var1);

    public boolean h();

    public boolean isActive();

    public boolean isCancelled();

    @NotNull
    public d r();

    @InternalCoroutinesApi
    @NotNull
    public u s(@NotNull w var1);

    public boolean start();

    @InternalCoroutinesApi
    @NotNull
    public i1 w(boolean var1, boolean var2, @NotNull l<? super Throwable, k0> var3);

    @InternalCoroutinesApi
    @NotNull
    public CancellationException y();

    @Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2={"Lkotlinx/coroutines/d2$b;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/d2;", "<init>", "()V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    public static final class b
    implements g.c<d2> {
        static final b c = new b();

        private b() {
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.ReplaceWith
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.e
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.k0
 *  kotlinx.coroutines.channels.i
 *  kotlinx.coroutines.channels.k
 *  kotlinx.coroutines.channels.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.e;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.a;
import kotlinx.coroutines.channels.g;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.channels.k;
import kotlinx.coroutines.channels.y;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.j2;
import kotlinx.coroutines.selects.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(d1={"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010/\u001a\u00020.\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u00100\u001a\u00020\u0007\u0012\u0006\u00101\u001a\u00020\u0007\u00a2\u0006\u0004\b2\u00103J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001\u00a2\u0006\u0004\b\b\u0010\tJ5\u0010\u000e\u001a\u00020\u00032#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\nH\u0096\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096A\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001bR \u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010 R\u000b\u0010$\u001a\u00020\u00078\u0016X\u0097\u0005R\u000b\u0010%\u001a\u00020\u00078\u0016X\u0097\u0005R\u000b\u0010&\u001a\u00020\u00078\u0016X\u0097\u0005R\u0011\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'8\u0016X\u0096\u0005R\u0017\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190'8\u0016X\u0096\u0005R\u0013\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000'8\u0016X\u0097\u0005R\u001d\u0010-\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0+8\u0016X\u0096\u0005\u00a8\u00064"}, d2={"Lkotlinx/coroutines/channels/h;", "E", "Lkotlinx/coroutines/a;", "Lkotlin/k0;", "Lkotlinx/coroutines/channels/g;", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/l;)V", "Lkotlinx/coroutines/channels/i;", "iterator", "()Lkotlinx/coroutines/channels/i;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "V", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/channels/k;", "receiveCatching", "()Lkotlinx/coroutines/channels/k;", "tryReceive", "f", "Lkotlinx/coroutines/channels/g;", "d1", "()Lkotlinx/coroutines/channels/g;", "_channel", "c1", "channel", "isClosedForReceive", "isClosedForSend", "isEmpty", "Lkotlinx/coroutines/selects/f;", "onReceive", "onReceiveCatching", "onReceiveOrNull", "Lkotlinx/coroutines/selects/h;", "Lkotlinx/coroutines/channels/y;", "onSend", "Lkotlin/coroutines/g;", "parentContext", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/g;ZZ)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nChannelCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,39:1\n732#2,3:40\n732#2,3:43\n732#2,3:46\n*S KotlinDebug\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n*L\n17#1:40,3\n23#1:43,3\n30#1:46,3\n*E\n"})
public class h<E>
extends a<k0>
implements g<E> {
    @NotNull
    private final g<E> f;

    public h(@NotNull kotlin.coroutines.g g4, @NotNull g<E> g5, boolean bl, boolean bl2) {
        super(g4, bl, bl2);
        this.f = g5;
    }

    @NotNull
    public f<E> D() {
        return this.f.D();
    }

    @Nullable
    public Object F(@NotNull d<? super E> d4) {
        return this.f.F(d4);
    }

    @Override
    public void V(@NotNull Throwable throwable) {
        throwable = j2.R0(this, throwable, null, 1, null);
        this.f.cancel((CancellationException)throwable);
        this.T(throwable);
    }

    @NotNull
    public final g<E> c1() {
        return this;
    }

    @Override
    public final void cancel(@Nullable CancellationException cancellationException) {
        if (this.isCancelled()) {
            return;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException == null) {
            cancellationException2 = new e2(j2.I(this), null, this);
        }
        this.V(cancellationException2);
    }

    public boolean close(@Nullable Throwable throwable) {
        return this.f.close(throwable);
    }

    @NotNull
    protected final g<E> d1() {
        return this.f;
    }

    @NotNull
    public kotlinx.coroutines.selects.h<E, y<E>> getOnSend() {
        return this.f.getOnSend();
    }

    public void invokeOnClose(@NotNull l<? super Throwable, k0> l4) {
        this.f.invokeOnClose(l4);
    }

    public boolean isClosedForSend() {
        return this.f.isClosedForSend();
    }

    @NotNull
    public i<E> iterator() {
        return this.f.iterator();
    }

    @NotNull
    public f<k<E>> j() {
        return this.f.j();
    }

    @NotNull
    public Object n() {
        return this.f.n();
    }

    @Nullable
    public Object o(@NotNull d<? super k<? extends E>> object) {
        object = this.f.o((d)object);
        b.f();
        return object;
    }

    @Deprecated(level=e.d, message="Deprecated in the favour of 'trySend' method", replaceWith=@ReplaceWith(expression="trySend(element).isSuccess", imports={}))
    public boolean offer(E e4) {
        return this.f.offer(e4);
    }

    @Nullable
    public Object send(E e4, @NotNull d<? super k0> d4) {
        return this.f.send(e4, d4);
    }

    @NotNull
    public Object trySend-JP2dKIU(E e4) {
        return this.f.trySend-JP2dKIU(e4);
    }
}


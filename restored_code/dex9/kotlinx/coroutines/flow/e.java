/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.k0
 *  kotlinx.coroutines.channels.a
 *  kotlinx.coroutines.channels.x
 *  kotlinx.coroutines.flow.h
 *  kotlinx.coroutines.flow.i
 *  kotlinx.coroutines.flow.l
 *  kotlinx.coroutines.q0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.k0;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.channels.v;
import kotlinx.coroutines.channels.x;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.internal.z;
import kotlinx.coroutines.flow.l;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0006\u0010%\u001a\u00020#\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b(\u0010)J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014\u00a2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0013\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0094@\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0012\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096@\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014\u00a2\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010$R\u000b\u0010'\u001a\u00020&8\u0002X\u0082\u0004\u00a8\u0006*"}, d2={"Lkotlinx/coroutines/flow/e;", "T", "Lkotlinx/coroutines/flow/internal/e;", "Lkotlin/k0;", "p", "()V", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/a;", "onBufferOverflow", "j", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)Lkotlinx/coroutines/flow/internal/e;", "Lkotlinx/coroutines/flow/h;", "k", "()Lkotlinx/coroutines/flow/h;", "Lkotlinx/coroutines/channels/v;", "scope", "i", "(Lkotlinx/coroutines/channels/v;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/channels/x;", "n", "(Lkotlinx/coroutines/q0;)Lkotlinx/coroutines/channels/x;", "Lkotlinx/coroutines/flow/i;", "collector", "collect", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "g", "()Ljava/lang/String;", "f", "Lkotlinx/coroutines/channels/x;", "channel", "", "Z", "consume", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "<init>", "(Lkotlinx/coroutines/channels/x;ZLkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/ChannelAsFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
final class e<T>
extends kotlinx.coroutines.flow.internal.e<T> {
    private static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(e.class, "consumed$volatile");
    private volatile int consumed$volatile;
    @NotNull
    private final x<T> f;
    private final boolean g;

    public e(@NotNull x<? extends T> x3, boolean bl, @NotNull g g4, int n4, @NotNull a a4) {
        super(g4, n4, a4);
        this.f = x3;
        this.g = bl;
        this.consumed$volatile = 0;
    }

    public /* synthetic */ e(x x3, boolean bl, g g4, int n4, a a4, int n5, p p4) {
        if ((n5 & 4) != 0) {
            g4 = kotlin.coroutines.h.c;
        }
        if ((n5 & 8) != 0) {
            n4 = -3;
        }
        if ((n5 & 0x10) != 0) {
            a4 = a.c;
        }
        this(x3, bl, g4, n4, a4);
    }

    private final void p() {
        if (this.g && kotlinx.coroutines.flow.e.h.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
    }

    @Override
    @Nullable
    public Object collect(@NotNull i<? super T> object, @NotNull d<? super k0> d4) {
        if (this.d == -3) {
            this.p();
            object = l.a(object, this.f, (boolean)this.g, d4);
            if (object == b.f()) {
                return object;
            }
            return k0.a;
        }
        if ((object = super.collect(object, d4)) == b.f()) {
            return object;
        }
        return k0.a;
    }

    @Override
    @NotNull
    protected String g() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("channel=");
        stringBuilder.append(this.f);
        return stringBuilder.toString();
    }

    @Override
    @Nullable
    protected Object i(@NotNull v<? super T> object, @NotNull d<? super k0> d4) {
        if ((object = l.a(new z<T>(object), this.f, (boolean)this.g, d4)) == b.f()) {
            return object;
        }
        return k0.a;
    }

    @Override
    @NotNull
    protected kotlinx.coroutines.flow.internal.e<T> j(@NotNull g g4, int n4, @NotNull a a4) {
        return new e<T>(this.f, this.g, g4, n4, a4);
    }

    @Override
    @NotNull
    public h<T> k() {
        return new e<T>(this.f, this.g, null, 0, null, 28, null);
    }

    @Override
    @NotNull
    public x<T> n(@NotNull q0 x3) {
        this.p();
        x3 = this.d == -3 ? this.f : super.n((q0)x3);
        return x3;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.v0
 *  kotlin.k0
 *  kotlinx.coroutines.channels.a
 *  kotlinx.coroutines.channels.f
 *  kotlinx.coroutines.channels.k
 *  kotlinx.coroutines.channels.k$c
 *  kotlinx.coroutines.internal.w
 *  kotlinx.coroutines.selects.l
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.v0;
import kotlin.k0;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.channels.e;
import kotlinx.coroutines.channels.f;
import kotlinx.coroutines.channels.k;
import kotlinx.coroutines.internal.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(d1={"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\"\b\u0002\u0010\"\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010 j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`!\u00a2\u0006\u0004\b#\u0010$J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\n\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00072\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012H\u0014\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006%"}, d2={"Lkotlinx/coroutines/channels/r;", "E", "Lkotlinx/coroutines/channels/e;", "element", "", "isSendOp", "Lkotlinx/coroutines/channels/k;", "Lkotlin/k0;", "w1", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "v1", "send", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "Lkotlinx/coroutines/selects/l;", "select", "", "a1", "(Lkotlinx/coroutines/selects/l;Ljava/lang/Object;)V", "", "o", "I", "capacity", "Lkotlinx/coroutines/channels/a;", "p", "Lkotlinx/coroutines/channels/a;", "onBufferOverflow", "w0", "()Z", "isConflatedDropOldest", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/a;Lkotlin/jvm/functions/l;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nConflatedBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,90:1\n562#2,2:91\n529#2,2:93\n529#2,2:95\n562#2,2:97\n*S KotlinDebug\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n*L\n33#1:91,2\n45#1:93,2\n77#1:95,2\n80#1:97,2\n*E\n"})
public class r<E>
extends e<E> {
    private final int o;
    @NotNull
    private final a p;

    public r(int n4, @NotNull a object, @Nullable l<? super E, k0> l4) {
        super(n4, l4);
        this.o = n4;
        this.p = object;
        if (object != a.c) {
            if (n4 >= 1) {
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Buffered channel capacity must be at least 1, but ");
            ((StringBuilder)object).append(n4);
            ((StringBuilder)object).append(" was specified");
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("This implementation does not support suspension for senders, use ");
        ((StringBuilder)object).append(v0.b(e.class).getSimpleName());
        ((StringBuilder)object).append(" instead");
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    static /* synthetic */ <E> Object u1(r<E> r4, E object, d<? super k0> object2) {
        object2 = super.w1(object, true);
        if (object2 instanceof k.a) {
            k.e(object2);
            object2 = r4.d;
            if (object2 != null && (object = w.c(object2, object, null, (int)2, null)) != null) {
                kotlin.f.a(object, r4.i0());
                throw object;
            }
            throw r4.i0();
        }
        return k0.a;
    }

    private final Object v1(E object, boolean bl) {
        l l4 = super.trySend-JP2dKIU(object);
        if (!k.i((Object)l4) && !k.h((Object)l4)) {
            if (bl && (l4 = this.d) != null && (object = w.c(l4, object, null, (int)2, null)) != null) {
                throw object;
            }
            return k.b.c((Object)k0.a);
        }
        return l4;
    }

    private final Object w1(E object, boolean bl) {
        object = this.p == a.e ? this.v1(object, bl) : this.k1(object);
        return object;
    }

    @Override
    protected void a1(@NotNull kotlinx.coroutines.selects.l<?> l4, @Nullable Object object) {
        if (!((object = this.trySend-JP2dKIU(object)) instanceof k.c)) {
            object = (k0)object;
            l4.d((Object)k0.a);
            return;
        }
        if (object instanceof k.a) {
            k.e((Object)object);
            l4.d((Object)f.z());
            return;
        }
        throw new IllegalStateException("unreachable".toString());
    }

    @Override
    @Nullable
    public Object send(E e4, @NotNull d<? super k0> d4) {
        return r.u1(this, e4, d4);
    }

    @Override
    @NotNull
    public Object trySend-JP2dKIU(E e4) {
        return this.w1(e4, false);
    }

    @Override
    protected boolean w0() {
        boolean bl = this.p == a.d;
        return bl;
    }
}


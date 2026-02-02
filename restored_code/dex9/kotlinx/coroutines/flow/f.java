/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.p
 *  kotlin.k0
 *  kotlinx.coroutines.channels.a
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.p;
import kotlin.k0;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.channels.v;
import kotlinx.coroutines.flow.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BT\u0012-\u0010\u0019\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013\u00a2\u0006\u0002\b\u0016\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0094@\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012R;\u0010\u0019\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013\u00a2\u0006\u0002\b\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001c"}, d2={"Lkotlinx/coroutines/flow/f;", "T", "Lkotlinx/coroutines/flow/internal/e;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/a;", "onBufferOverflow", "j", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)Lkotlinx/coroutines/flow/internal/e;", "Lkotlinx/coroutines/channels/v;", "scope", "Lkotlin/k0;", "i", "(Lkotlinx/coroutines/channels/v;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/ExtensionFunctionType;", "f", "Lkotlin/jvm/functions/p;", "block", "<init>", "(Lkotlin/jvm/functions/p;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
class f<T>
extends e<T> {
    @NotNull
    private final kotlin.jvm.functions.p<v<? super T>, d<? super k0>, Object> f;

    public f(@NotNull kotlin.jvm.functions.p<? super v<? super T>, ? super d<? super k0>, ? extends Object> p4, @NotNull g g4, int n4, @NotNull a a4) {
        super(g4, n4, a4);
        this.f = p4;
    }

    public /* synthetic */ f(kotlin.jvm.functions.p p4, g g4, int n4, a a4, int n5, p p5) {
        if ((n5 & 2) != 0) {
            g4 = h.c;
        }
        if ((n5 & 4) != 0) {
            n4 = -2;
        }
        if ((n5 & 8) != 0) {
            a4 = a.c;
        }
        this(p4, g4, n4, a4);
    }

    static /* synthetic */ <T> Object o(f<T> object, v<? super T> v3, d<? super k0> d4) {
        object = ((f)object).f.invoke(v3, d4);
        if (object == b.f()) {
            return object;
        }
        return k0.a;
    }

    @Override
    @Nullable
    protected Object i(@NotNull v<? super T> v3, @NotNull d<? super k0> d4) {
        return kotlinx.coroutines.flow.f.o(this, v3, d4);
    }

    @Override
    @NotNull
    protected e<T> j(@NotNull g g4, int n4, @NotNull a a4) {
        return new f<T>(this.f, g4, n4, a4);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("block[");
        stringBuilder.append(this.f);
        stringBuilder.append("] -> ");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }
}


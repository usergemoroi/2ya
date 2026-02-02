/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.k0
 *  kotlinx.coroutines.intrinsics.a
 *  kotlinx.coroutines.q0
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlinx.coroutines.intrinsics.a;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.y0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B8\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u00a2\u0006\u0002\b\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2={"Lkotlinx/coroutines/l2;", "T", "Lkotlinx/coroutines/y0;", "Lkotlin/k0;", "I0", "()V", "Lkotlin/coroutines/d;", "f", "Lkotlin/coroutines/d;", "continuation", "Lkotlin/coroutines/g;", "parentContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/q0;", "", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/coroutines/g;Lkotlin/jvm/functions/p;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class l2<T>
extends y0<T> {
    @NotNull
    private final d<k0> f;

    public l2(@NotNull g g4, @NotNull p<? super q0, ? super d<? super T>, ? extends Object> p4) {
        super(g4, false);
        this.f = b.a(p4, this, this);
    }

    @Override
    protected void I0() {
        a.b(this.f, (d)this);
    }
}


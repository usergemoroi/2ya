/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.u
 *  kotlin.u$a
 *  kotlin.v
 *  kotlinx.coroutines.c0
 *  kotlinx.coroutines.k2
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.u;
import kotlin.v;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2={"Lkotlinx/coroutines/t2;", "T", "Lkotlinx/coroutines/i2;", "", "cause", "Lkotlin/k0;", "v", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/p;", "g", "Lkotlinx/coroutines/p;", "continuation", "", "u", "()Z", "onCancelling", "<init>", "(Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/ResumeAwaitOnCompletion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
final class t2<T>
extends i2 {
    @NotNull
    private final p<T> g;

    public t2(@NotNull p<? super T> p4) {
        this.g = p4;
    }

    @Override
    public boolean u() {
        return false;
    }

    @Override
    public void v(@Nullable Throwable object) {
        object = this.t().n0();
        if (object instanceof c0) {
            p<T> p4 = this.g;
            u.a a4 = u.d;
            p4.resumeWith(u.b((Object)v.a((Throwable)((c0)object).a)));
        } else {
            p<T> p5 = this.g;
            u.a a5 = u.d;
            p5.resumeWith(u.b((Object)k2.h((Object)object)));
        }
    }
}


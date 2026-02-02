/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.jvm.internal.e
 *  kotlin.jvm.JvmField
 *  kotlinx.coroutines.e0
 *  kotlinx.coroutines.internal.i
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.a;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.internal.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014\u00a2\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014\u00a2\u0006\u0004\b\n\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001a"}, d2={"Lkotlinx/coroutines/internal/z;", "T", "Lkotlinx/coroutines/a;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "state", "Lkotlin/k0;", "P", "(Ljava/lang/Object;)V", "Y0", "Lkotlin/coroutines/d;", "f", "Lkotlin/coroutines/d;", "uCont", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "", "u0", "()Z", "isScopedCoroutine", "Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public class z<T>
extends a<T>
implements e {
    @JvmField
    @NotNull
    public final d<T> f;

    public z(@NotNull g g4, @NotNull d<? super T> d4) {
        super(g4, true, true);
        this.f = d4;
    }

    @Override
    protected void P(@Nullable Object object) {
        i.b((d)b.c(this.f), (Object)e0.a((Object)object, this.f));
    }

    @Override
    protected void Y0(@Nullable Object object) {
        d<T> d4 = this.f;
        d4.resumeWith(e0.a((Object)object, d4));
    }

    @Nullable
    public final e getCallerFrame() {
        Object object = this.f;
        object = object instanceof e ? (e)object : null;
        return object;
    }

    @Override
    protected final boolean u0() {
        return true;
    }
}


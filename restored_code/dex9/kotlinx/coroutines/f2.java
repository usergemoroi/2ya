/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.k0
 *  kotlinx.coroutines.c0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.k0;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.j2;
import kotlinx.coroutines.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u00038\u0010X\u0090\u0004\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00038PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005\u00a8\u0006\u0015"}, d2={"Lkotlinx/coroutines/f2;", "Lkotlinx/coroutines/j2;", "Lkotlinx/coroutines/a0;", "", "Y0", "()Z", "complete", "", "exception", "a", "(Ljava/lang/Throwable;)Z", "e", "Z", "h0", "handlesException", "j0", "onCancelComplete", "Lkotlinx/coroutines/d2;", "parent", "<init>", "(Lkotlinx/coroutines/d2;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@PublishedApi
public class f2
extends j2
implements a0 {
    private final boolean e;

    public f2(@Nullable d2 d22) {
        super(true);
        this.s0(d22);
        this.e = this.Y0();
    }

    private final boolean Y0() {
        Object object = this.m0();
        object = object instanceof v ? (v)object : null;
        if (object != null) {
            j2 j22 = ((i2)((Object)object)).t();
            object = j22;
            if (j22 != null) {
                do {
                    if (((j2)object).h0()) {
                        return true;
                    }
                    if ((object = (object = ((j2)object).m0()) instanceof v ? (v)object : null) == null) break;
                    j22 = ((i2)((Object)object)).t();
                    object = j22;
                } while (j22 != null);
            }
        }
        return false;
    }

    @Override
    public boolean a(@NotNull Throwable throwable) {
        return this.y0(new c0(throwable, false, 2, null));
    }

    @Override
    public boolean complete() {
        return this.y0(k0.a);
    }

    @Override
    public boolean h0() {
        return this.e;
    }

    @Override
    public boolean j0() {
        return true;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlinx.coroutines.InternalCoroutinesApi
 *  kotlinx.coroutines.g1
 *  kotlinx.coroutines.internal.l
 *  kotlinx.coroutines.u0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0005\u00a2\u0006\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00008&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2={"Lkotlinx/coroutines/n2;", "Lkotlinx/coroutines/m0;", "", "toString", "()Ljava/lang/String;", "", "parallelism", "name", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/m0;", "L", "H", "()Lkotlinx/coroutines/n2;", "immediate", "<init>", "()V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public abstract class n2
extends m0 {
    @NotNull
    public abstract n2 H();

    @InternalCoroutinesApi
    @Nullable
    protected final String L() {
        n2 n22 = g1.c();
        if (this == n22) {
            return "Dispatchers.Main";
        }
        try {
            n22 = n22.H();
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            n22 = null;
        }
        if (this == n22) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override
    @NotNull
    public m0 limitedParallelism(int n4, @Nullable String string) {
        l.a((int)n4);
        return l.b((m0)this, (String)string);
    }

    @Override
    @NotNull
    public String toString() {
        String string = this.L();
        CharSequence charSequence = string;
        if (string == null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(u0.a((Object)this));
            ((StringBuilder)charSequence).append('@');
            ((StringBuilder)charSequence).append(u0.b((Object)this));
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }
}


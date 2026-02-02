/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlinx.coroutines.scheduling.g
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlinx.coroutines.scheduling.g;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0007"}, d2={"Lkotlinx/coroutines/scheduling/e;", "Lkotlinx/coroutines/scheduling/g;", "", "a", "()J", "<init>", "()V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public final class e
extends g {
    @NotNull
    public static final e a = new e();

    private e() {
    }

    public long a() {
        return System.nanoTime();
    }
}


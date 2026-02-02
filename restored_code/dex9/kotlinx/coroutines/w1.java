/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlinx.coroutines.DelicateCoroutinesApi
 *  kotlinx.coroutines.q0
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlinx.coroutines.DelicateCoroutinesApi;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\b"}, d2={"Lkotlinx/coroutines/w1;", "Lkotlinx/coroutines/q0;", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "<init>", "()V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@DelicateCoroutinesApi
public final class w1
implements q0 {
    @NotNull
    public static final w1 c = new w1();

    private w1() {
    }

    @NotNull
    public g getCoroutineContext() {
        return h.c;
    }
}


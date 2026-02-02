/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.y
 *  kotlinx.coroutines.q0
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.utils.io;

import io.ktor.utils.io.c;
import io.ktor.utils.io.u;
import io.ktor.utils.io.w;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2={"Lio/ktor/utils/io/m;", "Lio/ktor/utils/io/u;", "Lio/ktor/utils/io/w;", "Lkotlinx/coroutines/q0;", "Lio/ktor/utils/io/c;", "c", "Lio/ktor/utils/io/c;", "a", "()Lio/ktor/utils/io/c;", "channel", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "delegate", "<init>", "(Lkotlinx/coroutines/q0;Lio/ktor/utils/io/c;)V", "ktor-io"}, k=1, mv={1, 8, 0})
final class m
implements u,
w,
q0 {
    @NotNull
    private final c c;
    private final q0 d;

    public m(@NotNull q0 q02, @NotNull c c4) {
        y.j((Object)q02, (String)"delegate");
        y.j((Object)c4, (String)"channel");
        this.c = c4;
        this.d = q02;
    }

    @NotNull
    public c a() {
        return this.c;
    }

    @NotNull
    public g getCoroutineContext() {
        return this.d.getCoroutineContext();
    }
}


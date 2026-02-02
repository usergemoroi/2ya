/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.utils.io.jvm.javaio;

import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.m0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c2\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016\u00a2\u0006\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2={"Lio/ktor/utils/io/jvm/javaio/i;", "Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/g;", "context", "", "isDispatchNeeded", "(Lkotlin/coroutines/g;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/k0;", "dispatch", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "<init>", "()V", "ktor-io"}, k=1, mv={1, 8, 0})
final class i
extends m0 {
    @NotNull
    public static final i c = new i();

    private i() {
    }

    @Override
    public void dispatch(@NotNull g g4, @NotNull Runnable runnable) {
        y.j((Object)g4, (String)"context");
        y.j((Object)runnable, (String)"block");
        runnable.run();
    }

    @Override
    public boolean isDispatchNeeded(@NotNull g g4) {
        y.j((Object)g4, (String)"context");
        return true;
    }
}


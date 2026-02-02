/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.utils.io.jvm.javaio.e
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.jvm.javaio.e;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c2\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2={"Lio/ktor/utils/io/jvm/javaio/c;", "Lio/ktor/utils/io/jvm/javaio/e;", "Ljava/lang/Thread;", "", "timeNanos", "Lkotlin/k0;", "a", "(J)V", "token", "c", "(Ljava/lang/Thread;)V", "<init>", "()V", "ktor-io"}, k=1, mv={1, 8, 0})
final class c
implements e<Thread> {
    @NotNull
    public static final c a = new c();

    private c() {
    }

    public void a(long l4) {
        if (l4 >= 0L) {
            LockSupport.parkNanos(l4);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public void c(@NotNull Thread thread) {
        y.j((Object)thread, (String)"token");
        LockSupport.unpark(thread);
    }
}


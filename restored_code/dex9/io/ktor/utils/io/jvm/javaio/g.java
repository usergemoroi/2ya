/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.utils.io.jvm.javaio.e
 *  kotlin.Metadata
 *  kotlin.j
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.jvm.javaio.c;
import io.ktor.utils.io.jvm.javaio.e;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c2\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2={"Lio/ktor/utils/io/jvm/javaio/g;", "Lio/ktor/utils/io/jvm/javaio/e;", "Ljava/lang/Thread;", "", "c", "()Ljava/lang/Void;", "", "timeNanos", "Lkotlin/k0;", "a", "(J)V", "token", "d", "(Ljava/lang/Thread;)V", "<init>", "()V", "ktor-io"}, k=1, mv={1, 8, 0})
final class g
implements e<Thread> {
    @NotNull
    public static final g a = new g();

    private g() {
    }

    private final Void c() {
        throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
    }

    public void a(long l4) {
        this.c();
        throw new j();
    }

    public void d(@NotNull Thread thread) {
        y.j((Object)thread, (String)"token");
        c.a.c(thread);
    }
}


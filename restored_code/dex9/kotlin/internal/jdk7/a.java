/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.internal.a
 *  kotlin.internal.jdk7.a$a
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.internal.jdk7;

import kotlin.Metadata;
import kotlin.internal.jdk7.a;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2={"Lkotlin/internal/jdk7/a;", "Lkotlin/internal/a;", "", "version", "", "c", "(I)Z", "", "cause", "exception", "Lkotlin/k0;", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "<init>", "()V", "kotlin-stdlib-jdk7"}, k=1, mv={1, 9, 0})
public class a
extends kotlin.internal.a {
    private final boolean c(int n4) {
        Integer n5 = a.b;
        boolean bl = n5 == null || n5 >= n4;
        return bl;
    }

    public void a(@NotNull Throwable throwable, @NotNull Throwable throwable2) {
        y.j((Object)throwable, (String)"cause");
        y.j((Object)throwable2, (String)"exception");
        if (this.c(19)) {
            throwable.addSuppressed(throwable2);
        } else {
            super.a(throwable, throwable2);
        }
    }
}


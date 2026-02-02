/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.internal.jdk8.a$a
 *  kotlin.random.c
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.internal.jdk8;

import kotlin.Metadata;
import kotlin.internal.jdk8.a;
import kotlin.random.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001:\u0001\fB\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2={"Lkotlin/internal/jdk8/a;", "Lkotlin/internal/jdk7/a;", "", "version", "", "c", "(I)Z", "Lkotlin/random/c;", "b", "()Lkotlin/random/c;", "<init>", "()V", "a", "kotlin-stdlib-jdk8"}, k=1, mv={1, 9, 0})
public class a
extends kotlin.internal.jdk7.a {
    private final boolean c(int n4) {
        Integer n5 = a.b;
        boolean bl = n5 == null || n5 >= n4;
        return bl;
    }

    @NotNull
    public c b() {
        c c4 = this.c(34) ? new kotlin.random.jdk8.a() : super.b();
        return c4;
    }
}


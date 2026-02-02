/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.g$c
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u00d6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004\u00a8\u0006\u0015"}, d2={"Lkotlinx/coroutines/p0;", "Lkotlin/coroutines/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "H", "name", "<init>", "(Ljava/lang/String;)V", "d", "a", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public final class p0
extends kotlin.coroutines.a {
    @NotNull
    public static final a d = new a(null);
    @NotNull
    private final String c;

    public p0(@NotNull String string) {
        super(d);
        this.c = string;
    }

    @NotNull
    public final String H() {
        return this.c;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof p0)) {
            return false;
        }
        object = (p0)object;
        return y.e((Object)this.c, (Object)((p0)object).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CoroutineName(");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2={"Lkotlinx/coroutines/p0$a;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/p0;", "<init>", "()V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    public static final class a
    implements g.c<p0> {
        private a() {
        }

        public /* synthetic */ a(p p4) {
            this();
        }
    }
}


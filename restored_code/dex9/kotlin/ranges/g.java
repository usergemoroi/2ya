/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.internal.c
 *  kotlin.jvm.internal.markers.a
 *  kotlin.ranges.g$a
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.o0;
import kotlin.internal.c;
import kotlin.ranges.g;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0016\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB!\b\u0000\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0017\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0019\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0018\u0010\u000e\u00a8\u0006\u001f"}, d2={"Lkotlin/ranges/g;", "", "", "Lkotlin/collections/o0;", "g", "()Lkotlin/collections/o0;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "I", "d", "first", "e", "last", "f", "step", "start", "endInclusive", "<init>", "(III)V", "a", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public class g
implements Iterable<Integer>,
kotlin.jvm.internal.markers.a {
    @NotNull
    public static final a f = new /* Unavailable Anonymous Inner Class!! */;
    private final int c;
    private final int d;
    private final int e;

    public g(int n4, int n5, int n6) {
        if (n6 != 0) {
            if (n6 != Integer.MIN_VALUE) {
                this.c = n4;
                this.d = kotlin.internal.c.b((int)n4, (int)n5, (int)n6);
                this.e = n6;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@Nullable Object object) {
        if (!(object instanceof g)) return false;
        if (this.isEmpty()) {
            if (((g)object).isEmpty()) return true;
        }
        int n4 = this.c;
        object = (g)object;
        if (n4 != ((g)object).c) return false;
        if (this.d != ((g)object).d) return false;
        if (this.e != ((g)object).e) return false;
        return true;
    }

    public final int f() {
        return this.e;
    }

    @NotNull
    public o0 g() {
        return new h(this.c, this.d, this.e);
    }

    public int hashCode() {
        int n4 = this.isEmpty() ? -1 : (this.c * 31 + this.d) * 31 + this.e;
        return n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean isEmpty() {
        int n4 = this.e;
        boolean bl = false;
        if (n4 > 0) {
            if (this.c <= this.d) return bl;
            return true;
        }
        if (this.c >= this.d) return bl;
        return true;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @NotNull
    public String toString() {
        void var2_2;
        int n4;
        if (this.e > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.c);
            stringBuilder.append("..");
            stringBuilder.append(this.d);
            stringBuilder.append(" step ");
            n4 = this.e;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.c);
            stringBuilder.append(" downTo ");
            stringBuilder.append(this.d);
            stringBuilder.append(" step ");
            n4 = -this.e;
        }
        var2_2.append(n4);
        return var2_2.toString();
    }
}


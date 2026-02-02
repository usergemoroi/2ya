/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.internal.c
 *  kotlin.jvm.internal.markers.a
 *  kotlin.ranges.a$a
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.s;
import kotlin.internal.c;
import kotlin.ranges.a;
import kotlin.ranges.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B!\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\r\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\f\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\u0011\u001a\u00020\r8\u0006\u00a2\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0017"}, d2={"Lkotlin/ranges/a;", "", "", "Lkotlin/collections/s;", "f", "()Lkotlin/collections/s;", "c", "C", "d", "()C", "first", "e", "last", "", "I", "getStep", "()I", "step", "start", "endInclusive", "<init>", "(CCI)V", "a", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public class a
implements Iterable<Character>,
kotlin.jvm.internal.markers.a {
    @NotNull
    public static final a f = new /* Unavailable Anonymous Inner Class!! */;
    private final char c;
    private final char d;
    private final int e;

    public a(char c4, char c5, int n4) {
        if (n4 != 0) {
            if (n4 != Integer.MIN_VALUE) {
                this.c = c4;
                this.d = (char)kotlin.internal.c.b((int)c4, (int)c5, (int)n4);
                this.e = n4;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final char d() {
        return this.c;
    }

    public final char e() {
        return this.d;
    }

    @NotNull
    public s f() {
        return new b(this.c, this.d, this.e);
    }
}


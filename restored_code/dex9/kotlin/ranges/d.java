/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.ranges;

import kotlin.Metadata;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0004\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u001b\u00a8\u0006 "}, d2={"Lkotlin/ranges/d;", "Lkotlin/ranges/e;", "", "a", "b", "", "e", "(FF)Z", "value", "(F)Z", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "F", "_start", "d", "_endInclusive", "()Ljava/lang/Float;", "start", "endInclusive", "<init>", "(FF)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
final class d
implements e<Float> {
    private final float c;
    private final float d;

    public d(float f4, float f5) {
        this.c = f4;
        this.d = f5;
    }

    public boolean b(float f4) {
        boolean bl = f4 >= this.c && f4 <= this.d;
        return bl;
    }

    @NotNull
    public Float c() {
        return Float.valueOf(this.d);
    }

    @NotNull
    public Float d() {
        return Float.valueOf(this.c);
    }

    public boolean e(float f4, float f5) {
        boolean bl = f4 <= f5;
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@Nullable Object object) {
        if (!(object instanceof d)) return false;
        if (this.isEmpty()) {
            if (((d)object).isEmpty()) return true;
        }
        float f4 = this.c;
        object = (d)object;
        if (f4 != ((d)object).c) return false;
        if (this.d != ((d)object).d) return false;
        return true;
    }

    public int hashCode() {
        int n4 = this.isEmpty() ? -1 : Float.floatToIntBits(this.c) * 31 + Float.floatToIntBits(this.d);
        return n4;
    }

    @Override
    public boolean isEmpty() {
        boolean bl = !(this.c <= this.d);
        return bl;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c);
        stringBuilder.append("..");
        stringBuilder.append(this.d);
        return stringBuilder.toString();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.ranges.f
 *  kotlin.ranges.i$a
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.ranges;

import kotlin.Metadata;
import kotlin.ranges.f;
import kotlin.ranges.g;
import kotlin.ranges.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001bB\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0096\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\u00a8\u0006\u001c"}, d2={"Lkotlin/ranges/i;", "Lkotlin/ranges/g;", "Lkotlin/ranges/f;", "", "", "value", "", "i", "(I)Z", "isEmpty", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "l", "()Ljava/lang/Integer;", "start", "k", "endInclusive", "<init>", "(II)V", "g", "a", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class i
extends g
implements f<Integer> {
    @NotNull
    public static final a g = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final i h = new i(1, 0);

    public i(int n4, int n5) {
        super(n4, n5, 1);
    }

    public static final /* synthetic */ i h() {
        return h;
    }

    @Override
    public boolean equals(@Nullable Object object) {
        int n4;
        boolean bl = object instanceof i && (this.isEmpty() && ((i)object).isEmpty() || (n4 = this.d()) == ((g)(object = (i)object)).d() && this.e() == ((g)object).e());
        return bl;
    }

    @Override
    public int hashCode() {
        int n4 = this.isEmpty() ? -1 : this.d() * 31 + this.e();
        return n4;
    }

    public boolean i(int n4) {
        boolean bl = this.d() <= n4 && n4 <= this.e();
        return bl;
    }

    @Override
    public boolean isEmpty() {
        boolean bl = this.d() > this.e();
        return bl;
    }

    @NotNull
    public Integer k() {
        return this.e();
    }

    @NotNull
    public Integer l() {
        return this.d();
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.d());
        stringBuilder.append("..");
        stringBuilder.append(this.e());
        return stringBuilder.toString();
    }
}


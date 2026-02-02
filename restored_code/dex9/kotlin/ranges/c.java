/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlin.ranges.c$a
 *  kotlin.ranges.f
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlin.ranges.c;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0018B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0096\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\u00a8\u0006\u0019"}, d2={"Lkotlin/ranges/c;", "Lkotlin/ranges/a;", "Lkotlin/ranges/f;", "", "", "", "isEmpty", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "h", "()Ljava/lang/Character;", "start", "g", "endInclusive", "<init>", "(CC)V", "a", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class c
extends kotlin.ranges.a
implements f<Character> {
    @NotNull
    public static final a g = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final c h = new c('\u0001', '\u0000');

    public c(char c4, char c5) {
        super(c4, c5, 1);
    }

    public boolean equals(@Nullable Object object) {
        char c4;
        boolean bl = object instanceof c && (this.isEmpty() && ((c)object).isEmpty() || (c4 = this.d()) == ((kotlin.ranges.a)(object = (c)object)).d() && this.e() == ((kotlin.ranges.a)object).e());
        return bl;
    }

    @NotNull
    public Character g() {
        return Character.valueOf(this.e());
    }

    @NotNull
    public Character h() {
        return Character.valueOf(this.d());
    }

    public int hashCode() {
        int n4 = this.isEmpty() ? -1 : this.d() * 31 + this.e();
        return n4;
    }

    public boolean isEmpty() {
        boolean bl = y.l((int)this.d(), (int)this.e()) > 0;
        return bl;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.d());
        stringBuilder.append("..");
        stringBuilder.append(this.e());
        return stringBuilder.toString();
    }
}


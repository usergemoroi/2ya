/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.comparisons.c
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.comparisons.c;
import kotlin.comparisons.d;
import kotlin.comparisons.e;
import kotlin.jvm.functions.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"kotlin/comparisons/c", "kotlin/comparisons/d", "kotlin/comparisons/e"}, d2={}, k=4, mv={1, 9, 0})
public final class a
extends e {
    @NotNull
    public static /* bridge */ /* synthetic */ Comparator b(l ... lArray) {
        return c.b((l[])lArray);
    }

    public static /* bridge */ /* synthetic */ int d(@Nullable Comparable comparable, @Nullable Comparable comparable2) {
        return c.d((Comparable)comparable, (Comparable)comparable2);
    }

    public static /* bridge */ /* synthetic */ int e(Object object, Object object2, l ... lArray) {
        return c.e((Object)object, (Object)object2, (l[])lArray);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ Comparator g() {
        return c.g();
    }

    @SinceKotlin(version="1.4")
    public static /* bridge */ /* synthetic */ float h(float f4, float ... fArray) {
        return d.h(f4, fArray);
    }

    @SinceKotlin(version="1.4")
    public static /* bridge */ /* synthetic */ int i(int n4, int ... nArray) {
        return d.i(n4, nArray);
    }

    @SinceKotlin(version="1.1")
    @NotNull
    public static /* bridge */ /* synthetic */ Comparable j(@NotNull Comparable comparable, @NotNull Comparable comparable2) {
        return d.j(comparable, comparable2);
    }

    @SinceKotlin(version="1.4")
    public static /* bridge */ /* synthetic */ float k(float f4, float ... fArray) {
        return d.k(f4, fArray);
    }
}


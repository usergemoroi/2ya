/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.BuilderInference
 *  kotlin.Metadata
 *  kotlin.OverloadResolutionByLambdaReturnType
 *  kotlin.SinceKotlin
 *  kotlin.internal.LowPriorityInOverloadResolution
 *  kotlin.jvm.JvmName
 *  kotlin.sequences.i
 *  kotlin.sequences.m
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.sequences;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.SinceKotlin;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.p;
import kotlin.sequences.i;
import kotlin.sequences.m;
import kotlin.sequences.o;
import kotlin.sequences.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"kotlin/sequences/m", "kotlin/sequences/n", "kotlin/sequences/o", "kotlin/sequences/p", "kotlin/sequences/q"}, d2={}, k=4, mv={1, 9, 0})
public final class l
extends q {
    @SinceKotlin(version="1.4")
    @Nullable
    public static /* bridge */ /* synthetic */ Object A(@NotNull i i4, @NotNull Comparator comparator) {
        return q.A(i4, comparator);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ i B(@NotNull i i4, @NotNull i i5) {
        return q.B(i4, i5);
    }

    @SinceKotlin(version="1.4")
    @NotNull
    public static /* bridge */ /* synthetic */ i C(@NotNull i i4, Object object, @NotNull p p4) {
        return q.C(i4, object, p4);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ i D(@NotNull i i4, @NotNull Comparator comparator) {
        return q.D(i4, comparator);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ i E(@NotNull i i4, int n4) {
        return q.E(i4, n4);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ i F(@NotNull i i4, @NotNull kotlin.jvm.functions.l l4) {
        return q.F(i4, l4);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ List H(@NotNull i i4) {
        return q.H(i4);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ Set J(@NotNull i i4) {
        return q.J(i4);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ i K(@NotNull i i4, @NotNull i i5) {
        return q.K(i4, i5);
    }

    @SinceKotlin(version="1.3")
    @NotNull
    public static /* bridge */ /* synthetic */ Iterator a(@BuilderInference @NotNull p p4) {
        return m.a((p)p4);
    }

    @SinceKotlin(version="1.3")
    @NotNull
    public static /* bridge */ /* synthetic */ i b(@BuilderInference @NotNull p p4) {
        return m.b((p)p4);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ i c(@NotNull Iterator iterator) {
        return o.c(iterator);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ i d(@NotNull i i4) {
        return o.d(i4);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ i e() {
        return o.e();
    }

    @LowPriorityInOverloadResolution
    @NotNull
    public static /* bridge */ /* synthetic */ i h(@Nullable Object object, @NotNull kotlin.jvm.functions.l l4) {
        return o.h(object, l4);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ i i(@NotNull a a4) {
        return o.i(a4);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ i j(Object ... objectArray) {
        return o.j(objectArray);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ Iterable k(@NotNull i i4) {
        return q.k(i4);
    }

    public static /* bridge */ /* synthetic */ boolean l(@NotNull i i4, Object object) {
        return q.l(i4, object);
    }

    public static /* bridge */ /* synthetic */ int m(@NotNull i i4) {
        return q.m(i4);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ i n(@NotNull i i4, int n4) {
        return q.n(i4, n4);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ i o(@NotNull i i4, @NotNull kotlin.jvm.functions.l l4) {
        return q.o(i4, l4);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ i q(@NotNull i i4) {
        return q.q(i4);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ Object r(@NotNull i i4) {
        return q.r(i4);
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version="1.4")
    @JvmName(name="flatMapIterable")
    @NotNull
    public static /* bridge */ /* synthetic */ i s(@NotNull i i4, @NotNull kotlin.jvm.functions.l l4) {
        return q.s(i4, l4);
    }

    public static /* bridge */ /* synthetic */ String w(i i4, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n4, CharSequence charSequence4, kotlin.jvm.functions.l l4, int n5, Object object) {
        return q.w(i4, charSequence, charSequence2, charSequence3, n4, charSequence4, l4, n5, object);
    }

    public static /* bridge */ /* synthetic */ Object x(@NotNull i i4) {
        return q.x(i4);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ i y(@NotNull i i4, @NotNull kotlin.jvm.functions.l l4) {
        return q.y(i4, l4);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ i z(@NotNull i i4, @NotNull kotlin.jvm.functions.l l4) {
        return q.z(i4, l4);
    }
}


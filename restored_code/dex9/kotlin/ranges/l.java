/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.random.c
 *  kotlin.random.d
 *  kotlin.ranges.f
 *  kotlin.ranges.g$a
 *  kotlin.ranges.k
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.random.c;
import kotlin.random.d;
import kotlin.ranges.e;
import kotlin.ranges.f;
import kotlin.ranges.g;
import kotlin.ranges.i;
import kotlin.ranges.j;
import kotlin.ranges.k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0004\u00a2\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0007*\u00020\u0007\u00a2\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003H\u0086\u0004\u00a2\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u000f\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0004\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0012\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0015\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0018\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0017\u00a2\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001b\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001a\u00a2\u0006\u0004\b\u001b\u0010\u001c\u001a)\u0010 \u001a\u00028\u0000\"\u000e\b\u0000\u0010\u001e*\b\u0012\u0004\u0012\u00028\u00000\u001d*\u00028\u00002\u0006\u0010\u001f\u001a\u00028\u0000\u00a2\u0006\u0004\b \u0010!\u001a\u0019\u0010\"\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\u0004\b\"\u0010\u0013\u001a\u0019\u0010#\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0014\u00a2\u0006\u0004\b#\u0010\u0016\u001a\u0019\u0010$\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017\u00a2\u0006\u0004\b$\u0010\u0019\u001a\u0019\u0010%\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a\u00a2\u0006\u0004\b%\u0010\u001c\u001a!\u0010&\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\u0004\b&\u0010'\u001a!\u0010(\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0014\u00a2\u0006\u0004\b(\u0010)\u001a!\u0010*\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017\u00a2\u0006\u0004\b*\u0010+\u001a!\u0010,\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a\u00a2\u0006\u0004\b,\u0010-\u001a1\u00100\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u001e*\b\u0012\u0004\u0012\u00028\u00000\u001d*\u00028\u00002\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0007\u00a2\u0006\u0004\b0\u00101\u001a\u001f\u00103\u001a\u00020\u0003*\u00020\u00032\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000302\u00a2\u0006\u0004\b3\u00104\u00a8\u00065"}, d2={"Lkotlin/ranges/i;", "Lkotlin/random/c;", "random", "", "s", "(Lkotlin/ranges/i;Lkotlin/random/c;)I", "to", "Lkotlin/ranges/g;", "r", "(II)Lkotlin/ranges/g;", "t", "(Lkotlin/ranges/g;)Lkotlin/ranges/g;", "step", "u", "(Lkotlin/ranges/g;I)Lkotlin/ranges/g;", "v", "(II)Lkotlin/ranges/i;", "minimumValue", "e", "(II)I", "", "f", "(JJ)J", "", "d", "(FF)F", "", "c", "(DD)D", "", "T", "maximumValue", "k", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "i", "j", "h", "g", "n", "(III)I", "p", "(JJJ)J", "m", "(FFF)F", "l", "(DDD)D", "Lkotlin/ranges/e;", "range", "q", "(Ljava/lang/Comparable;Lkotlin/ranges/e;)Ljava/lang/Comparable;", "Lkotlin/ranges/f;", "o", "(ILkotlin/ranges/f;)I", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/ranges/RangesKt")
@SourceDebugExtension(value={"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1538:1\n1#2:1539\n*E\n"})
class l
extends k {
    public static double c(double d4, double d5) {
        double d6 = d4;
        if (d4 < d5) {
            d6 = d5;
        }
        return d6;
    }

    public static float d(float f4, float f5) {
        float f6 = f4;
        if (f4 < f5) {
            f6 = f5;
        }
        return f6;
    }

    public static int e(int n4, int n5) {
        int n6 = n4;
        if (n4 < n5) {
            n6 = n5;
        }
        return n6;
    }

    public static long f(long l4, long l5) {
        long l6 = l4;
        if (l4 < l5) {
            l6 = l5;
        }
        return l6;
    }

    public static double g(double d4, double d5) {
        double d6 = d4;
        if (d4 > d5) {
            d6 = d5;
        }
        return d6;
    }

    public static float h(float f4, float f5) {
        float f6 = f4;
        if (f4 > f5) {
            f6 = f5;
        }
        return f6;
    }

    public static int i(int n4, int n5) {
        int n6 = n4;
        if (n4 > n5) {
            n6 = n5;
        }
        return n6;
    }

    public static long j(long l4, long l5) {
        long l6 = l4;
        if (l4 > l5) {
            l6 = l5;
        }
        return l6;
    }

    @NotNull
    public static <T extends Comparable<? super T>> T k(@NotNull T t3, @NotNull T t4) {
        y.j(t3, (String)"<this>");
        y.j(t4, (String)"maximumValue");
        T t5 = t3;
        if (t3.compareTo(t4) > 0) {
            t5 = t4;
        }
        return t5;
    }

    public static double l(double d4, double d5, double d6) {
        if (!(d5 > d6)) {
            if (d4 < d5) {
                return d5;
            }
            if (d4 > d6) {
                return d6;
            }
            return d4;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot coerce value to an empty range: maximum ");
        stringBuilder.append(d6);
        stringBuilder.append(" is less than minimum ");
        stringBuilder.append(d5);
        stringBuilder.append('.');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static float m(float f4, float f5, float f6) {
        if (!(f5 > f6)) {
            if (f4 < f5) {
                return f5;
            }
            if (f4 > f6) {
                return f6;
            }
            return f4;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot coerce value to an empty range: maximum ");
        stringBuilder.append(f6);
        stringBuilder.append(" is less than minimum ");
        stringBuilder.append(f5);
        stringBuilder.append('.');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int n(int n4, int n5, int n6) {
        if (n5 <= n6) {
            if (n4 < n5) {
                return n5;
            }
            if (n4 > n6) {
                return n6;
            }
            return n4;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot coerce value to an empty range: maximum ");
        stringBuilder.append(n6);
        stringBuilder.append(" is less than minimum ");
        stringBuilder.append(n5);
        stringBuilder.append('.');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int o(int n4, @NotNull f<Integer> f4) {
        y.j(f4, (String)"range");
        if (f4 instanceof e) {
            return ((Number)((Object)j.q(Integer.valueOf(n4), (e)f4))).intValue();
        }
        if (!f4.isEmpty()) {
            int n5;
            if (n4 < ((Number)((Object)f4.getStart())).intValue()) {
                n5 = ((Number)((Object)f4.getStart())).intValue();
            } else {
                n5 = n4;
                if (n4 > ((Number)((Object)f4.getEndInclusive())).intValue()) {
                    n5 = ((Number)((Object)f4.getEndInclusive())).intValue();
                }
            }
            return n5;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot coerce value to an empty range: ");
        stringBuilder.append(f4);
        stringBuilder.append('.');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static long p(long l4, long l5, long l6) {
        if (l5 <= l6) {
            if (l4 < l5) {
                return l5;
            }
            if (l4 > l6) {
                return l6;
            }
            return l4;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot coerce value to an empty range: maximum ");
        stringBuilder.append(l6);
        stringBuilder.append(" is less than minimum ");
        stringBuilder.append(l5);
        stringBuilder.append('.');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @SinceKotlin(version="1.1")
    @NotNull
    public static <T extends Comparable<? super T>> T q(@NotNull T object, @NotNull e<T> e4) {
        y.j(object, (String)"<this>");
        y.j(e4, (String)"range");
        if (!e4.isEmpty()) {
            Object object2;
            if (e4.a((Comparable)object, e4.getStart()) && !e4.a(e4.getStart(), (Comparable)object)) {
                object2 = e4.getStart();
            } else {
                object2 = object;
                if (e4.a(e4.getEndInclusive(), (Comparable)object)) {
                    object2 = object;
                    if (!e4.a((Comparable)object, e4.getEndInclusive())) {
                        object2 = e4.getEndInclusive();
                    }
                }
            }
            return (T)object2;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Cannot coerce value to an empty range: ");
        ((StringBuilder)object).append(e4);
        ((StringBuilder)object).append('.');
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    @NotNull
    public static g r(int n4, int n5) {
        return g.f.a(n4, n5, -1);
    }

    @SinceKotlin(version="1.3")
    public static int s(@NotNull i i4, @NotNull c c4) {
        y.j((Object)i4, (String)"<this>");
        y.j((Object)c4, (String)"random");
        try {
            int n4 = d.e((c)c4, (i)i4);
            return n4;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new NoSuchElementException(illegalArgumentException.getMessage());
        }
    }

    @NotNull
    public static g t(@NotNull g g4) {
        y.j((Object)g4, (String)"<this>");
        return g.f.a(g4.e(), g4.d(), -g4.f());
    }

    @NotNull
    public static g u(@NotNull g g4, int n4) {
        y.j((Object)g4, (String)"<this>");
        boolean bl = n4 > 0;
        k.a((boolean)bl, (Number)n4);
        g.a a4 = g.f;
        int n5 = g4.d();
        int n6 = g4.e();
        if (g4.f() <= 0) {
            n4 = -n4;
        }
        return a4.a(n5, n6, n4);
    }

    @NotNull
    public static i v(int n4, int n5) {
        if (n5 <= Integer.MIN_VALUE) {
            return i.g.a();
        }
        return new i(n4, n5 - 1);
    }
}


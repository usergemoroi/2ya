/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.SinceKotlin
 *  kotlin.collections.u
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.g0;
import kotlin.collections.j;
import kotlin.collections.l;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.comparisons.a;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.ranges.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000T\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0000\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000\u00a2\u0006\u0004\b\t\u0010\n\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000\u00a2\u0006\u0004\b\f\u0010\n\u001a7\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u000e\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00112\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\b\u0015\u0010\n\u001a%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000\u00a2\u0006\u0004\b\u0016\u0010\u0017\u001aG\u0010\u001c\u001a\u00020\u0019\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00052\b\u0010\u0012\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0019\u00a2\u0006\u0004\b\u001c\u0010\u001d\u001aE\u0010 \u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u001e\u00a2\u0006\u0004\b \u0010!\u001a'\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020#H\u0001\u00a2\u0006\u0004\b&\u0010'\u001a\u000f\u0010(\u001a\u00020#H\u0001\u00a2\u0006\u0004\b(\u0010'\"\u0019\u0010,\u001a\u00020)*\u0006\u0012\u0002\b\u00030\u00028F\u00a2\u0006\u0006\u001a\u0004\b*\u0010+\"!\u0010/\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00058F\u00a2\u0006\u0006\u001a\u0004\b-\u0010.\u00a8\u00060"}, d2={"T", "", "", "h", "([Ljava/lang/Object;)Ljava/util/Collection;", "", "m", "()Ljava/util/List;", "elements", "p", "([Ljava/lang/Object;)Ljava/util/List;", "", "s", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "g", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "", "element", "q", "(Ljava/lang/Object;)Ljava/util/List;", "r", "t", "(Ljava/util/List;)Ljava/util/List;", "", "", "fromIndex", "toIndex", "j", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "Lkotlin/Function1;", "comparison", "i", "(Ljava/util/List;IILkotlin/jvm/functions/l;)I", "size", "Lkotlin/k0;", "u", "(III)V", "w", "()V", "v", "Lkotlin/ranges/i;", "n", "(Ljava/util/Collection;)Lkotlin/ranges/i;", "indices", "o", "(Ljava/util/List;)I", "lastIndex", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/collections/CollectionsKt")
@SourceDebugExtension(value={"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,526:1\n1#2:527\n*E\n"})
class v
extends u {
    @NotNull
    public static <T> ArrayList<T> g(T ... object) {
        y.j(object, (String)"elements");
        object = ((T[])object).length == 0 ? new ArrayList() : new ArrayList<T>(new j<T>((T[])object, true));
        return object;
    }

    @NotNull
    public static final <T> Collection<T> h(@NotNull T[] TArray) {
        y.j(TArray, (String)"<this>");
        return new j<T>(TArray, false);
    }

    public static <T> int i(@NotNull List<? extends T> list, int n4, int n5, @NotNull kotlin.jvm.functions.l<? super T, Integer> l4) {
        y.j(list, (String)"<this>");
        y.j(l4, (String)"comparison");
        v.u(list.size(), n4, n5);
        --n5;
        while (n4 <= n5) {
            int n6 = n4 + n5 >>> 1;
            int n7 = ((Number)l4.invoke(list.get(n6))).intValue();
            if (n7 < 0) {
                n4 = n6 + 1;
                continue;
            }
            if (n7 > 0) {
                n5 = n6 - 1;
                continue;
            }
            return n6;
        }
        return -(n4 + 1);
    }

    public static final <T extends Comparable<? super T>> int j(@NotNull List<? extends T> list, @Nullable T t3, int n4, int n5) {
        y.j(list, (String)"<this>");
        v.u(list.size(), n4, n5);
        --n5;
        while (n4 <= n5) {
            int n6 = n4 + n5 >>> 1;
            int n7 = a.d((Comparable)list.get(n6), t3);
            if (n7 < 0) {
                n4 = n6 + 1;
                continue;
            }
            if (n7 > 0) {
                n5 = n6 - 1;
                continue;
            }
            return n6;
        }
        return -(n4 + 1);
    }

    public static /* synthetic */ int k(List list, int n4, int n5, kotlin.jvm.functions.l l4, int n6, Object object) {
        if ((n6 & 1) != 0) {
            n4 = 0;
        }
        if ((n6 & 2) != 0) {
            n5 = list.size();
        }
        return t.i(list, n4, n5, l4);
    }

    public static /* synthetic */ int l(List list, Comparable comparable, int n4, int n5, int n6, Object object) {
        if ((n6 & 2) != 0) {
            n4 = 0;
        }
        if ((n6 & 4) != 0) {
            n5 = list.size();
        }
        return v.j(list, comparable, n4, n5);
    }

    @NotNull
    public static <T> List<T> m() {
        return g0.c;
    }

    @NotNull
    public static i n(@NotNull Collection<?> collection) {
        y.j(collection, (String)"<this>");
        return new i(0, collection.size() - 1);
    }

    public static <T> int o(@NotNull List<? extends T> list) {
        y.j(list, (String)"<this>");
        return list.size() - 1;
    }

    @NotNull
    public static <T> List<T> p(T ... object) {
        y.j(object, (String)"elements");
        object = ((T[])object).length > 0 ? l.e((Object[])object) : t.m();
        return object;
    }

    @NotNull
    public static <T> List<T> q(@Nullable T object) {
        object = object != null ? t.e(object) : t.m();
        return object;
    }

    @NotNull
    public static <T> List<T> r(T ... TArray) {
        y.j(TArray, (String)"elements");
        return l.g0((Object[])TArray);
    }

    @NotNull
    public static <T> List<T> s(T ... object) {
        y.j(object, (String)"elements");
        object = ((T[])object).length == 0 ? new ArrayList() : new ArrayList<T>(new j<T>((T[])object, true));
        return object;
    }

    @NotNull
    public static final <T> List<T> t(@NotNull List<? extends T> list) {
        y.j(list, (String)"<this>");
        int n4 = list.size();
        if (n4 != 0) {
            if (n4 == 1) {
                list = t.e(list.get(0));
            }
        } else {
            list = t.m();
        }
        return list;
    }

    private static final void u(int n4, int n5, int n6) {
        if (n5 <= n6) {
            if (n5 >= 0) {
                if (n6 <= n4) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("toIndex (");
                stringBuilder.append(n6);
                stringBuilder.append(") is greater than size (");
                stringBuilder.append(n4);
                stringBuilder.append(").");
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fromIndex (");
            stringBuilder.append(n5);
            stringBuilder.append(") is less than zero.");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fromIndex (");
        stringBuilder.append(n5);
        stringBuilder.append(") is greater than toIndex (");
        stringBuilder.append(n6);
        stringBuilder.append(").");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @PublishedApi
    @SinceKotlin(version="1.3")
    public static void v() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @PublishedApi
    @SinceKotlin(version="1.3")
    public static void w() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}


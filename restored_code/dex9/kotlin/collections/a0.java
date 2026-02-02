/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.jvm.internal.a1
 *  kotlin.jvm.internal.y
 *  kotlin.sequences.i
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.collections;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.l;
import kotlin.collections.t;
import kotlin.collections.z;
import kotlin.jvm.internal.a1;
import kotlin.jvm.internal.y;
import kotlin.sequences.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000@\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\n\u001a-\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\u00a2\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0010\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0006\u001a-\u0010\u0011\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0004\b\u0011\u0010\t\u001a/\u0010\u0012\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\u00a2\u0006\u0004\b\u0012\u0010\f\u001a-\u0010\u0013\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0006\u001a1\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0015\u00a2\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u0000\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0015\u00a2\u0006\u0004\b\u0000\u0010\u0018\u001a;\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0007\u00a2\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0007\u00a2\u0006\u0004\b\u001f\u0010\u001e\u001a\u001f\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0007\u00a2\u0006\u0004\b \u0010\u001e\u001a!\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0007\u00a2\u0006\u0004\b!\u0010\u001e\u001a1\u0010\"\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0015\u00a2\u0006\u0004\b\"\u0010#\u001a;\u0010$\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b$\u0010%\u00a8\u0006&"}, d2={"T", "", "", "elements", "", "E", "(Ljava/util/Collection;Ljava/lang/Iterable;)Z", "Lkotlin/sequences/i;", "F", "(Ljava/util/Collection;Lkotlin/sequences/i;)Z", "", "G", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "H", "(Ljava/lang/Iterable;)Ljava/util/Collection;", "L", "M", "N", "U", "", "Lkotlin/Function1;", "predicate", "K", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/l;)Z", "predicateResultToRemove", "I", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/l;Z)Z", "", "P", "(Ljava/util/List;)Ljava/lang/Object;", "Q", "R", "S", "O", "(Ljava/util/List;Lkotlin/jvm/functions/l;)Z", "J", "(Ljava/util/List;Lkotlin/jvm/functions/l;Z)Z", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/collections/CollectionsKt")
class a0
extends z {
    public static <T> boolean E(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> object) {
        y.j(collection, (String)"<this>");
        y.j(object, (String)"elements");
        if (object instanceof Collection) {
            return collection.addAll((Collection)object);
        }
        object = object.iterator();
        boolean bl = false;
        while (object.hasNext()) {
            if (!collection.add(object.next())) continue;
            bl = true;
        }
        return bl;
    }

    public static <T> boolean F(@NotNull Collection<? super T> collection, @NotNull i<? extends T> object) {
        y.j(collection, (String)"<this>");
        y.j(object, (String)"elements");
        object = object.iterator();
        boolean bl = false;
        while (object.hasNext()) {
            if (!collection.add(object.next())) continue;
            bl = true;
        }
        return bl;
    }

    public static <T> boolean G(@NotNull Collection<? super T> collection, @NotNull T[] TArray) {
        y.j(collection, (String)"<this>");
        y.j(TArray, (String)"elements");
        return collection.addAll(l.e((Object[])TArray));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NotNull
    public static final <T> Collection<T> H(@NotNull Iterable<? extends T> collection) {
        y.j((Object)collection, (String)"<this>");
        if (!(collection instanceof Collection)) return t.e1((Iterable)collection);
        return collection;
    }

    private static final <T> boolean I(Iterable<? extends T> object, kotlin.jvm.functions.l<? super T, Boolean> l4, boolean bl) {
        object = object.iterator();
        boolean bl2 = false;
        while (object.hasNext()) {
            if (l4.invoke(object.next()) != bl) continue;
            object.remove();
            bl2 = true;
        }
        return bl2;
    }

    private static final <T> boolean J(List<T> list, kotlin.jvm.functions.l<? super T, Boolean> l4, boolean bl) {
        int n4;
        int n5;
        if (!(list instanceof RandomAccess)) {
            y.h(list, (String)"null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return a0.I(a1.b(list), l4, bl);
        }
        int n6 = t.o(list);
        if (n6 >= 0) {
            int n7 = 0;
            n5 = 0;
            while (true) {
                T t3;
                if (l4.invoke(t3 = list.get(n7)) != bl && n5 != n7) {
                    list.set(n5, t3);
                }
                n4 = ++n5;
                if (n7 != n6) {
                    ++n7;
                    continue;
                }
                break;
            }
        } else {
            n4 = 0;
        }
        if (n4 < list.size()) {
            n5 = t.o(list);
            if (n4 <= n5) {
                while (true) {
                    list.remove(n5);
                    if (n5 == n4) break;
                    --n5;
                }
            }
            return true;
        }
        return false;
    }

    public static <T> boolean K(@NotNull Iterable<? extends T> iterable, @NotNull kotlin.jvm.functions.l<? super T, Boolean> l4) {
        y.j(iterable, (String)"<this>");
        y.j(l4, (String)"predicate");
        return a0.I(iterable, l4, true);
    }

    public static <T> boolean L(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        y.j(collection, (String)"<this>");
        y.j(iterable, (String)"elements");
        return collection.removeAll(a0.H(iterable));
    }

    public static <T> boolean M(@NotNull Collection<? super T> collection, @NotNull i<? extends T> object) {
        y.j(collection, (String)"<this>");
        y.j(object, (String)"elements");
        object = kotlin.sequences.l.H(object);
        boolean bl = object.isEmpty();
        boolean bl2 = true;
        if (!(bl ^ true) || !collection.removeAll((Collection<?>)object)) {
            bl2 = false;
        }
        return bl2;
    }

    public static <T> boolean N(@NotNull Collection<? super T> collection, @NotNull T[] TArray) {
        y.j(collection, (String)"<this>");
        y.j(TArray, (String)"elements");
        int n4 = TArray.length;
        boolean bl = false;
        n4 = n4 == 0 ? 1 : 0;
        boolean bl2 = bl;
        if ((n4 ^ 1) != 0) {
            bl2 = bl;
            if (collection.removeAll(l.e((Object[])TArray))) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public static <T> boolean O(@NotNull List<T> list, @NotNull kotlin.jvm.functions.l<? super T, Boolean> l4) {
        y.j(list, (String)"<this>");
        y.j(l4, (String)"predicate");
        return a0.J(list, l4, true);
    }

    @SinceKotlin(version="1.4")
    public static <T> T P(@NotNull List<T> list) {
        y.j(list, (String)"<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    @SinceKotlin(version="1.4")
    @Nullable
    public static <T> T Q(@NotNull List<T> list) {
        y.j(list, (String)"<this>");
        list = list.isEmpty() ? null : list.remove(0);
        return (T)list;
    }

    @SinceKotlin(version="1.4")
    public static <T> T R(@NotNull List<T> list) {
        y.j(list, (String)"<this>");
        if (!list.isEmpty()) {
            return list.remove(t.o(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    @SinceKotlin(version="1.4")
    @Nullable
    public static <T> T S(@NotNull List<T> list) {
        y.j(list, (String)"<this>");
        list = list.isEmpty() ? null : list.remove(t.o(list));
        return (T)list;
    }

    public static <T> boolean T(@NotNull Iterable<? extends T> iterable, @NotNull kotlin.jvm.functions.l<? super T, Boolean> l4) {
        y.j(iterable, (String)"<this>");
        y.j(l4, (String)"predicate");
        return a0.I(iterable, l4, false);
    }

    public static <T> boolean U(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        y.j(collection, (String)"<this>");
        y.j(iterable, (String)"elements");
        return collection.retainAll(a0.H(iterable));
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.SinceKotlin
 *  kotlin.collections.t0
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.t
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.collections;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.builders.d;
import kotlin.collections.s0;
import kotlin.collections.t0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.t;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a9\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0001\u00a2\u0006\u0004\b\b\u0010\t\u001a/\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\b\f\u0010\r\u001a;\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a[\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0001\u0010\u00012*\u0010\u0013\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0012\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0000\u00a2\u0006\u0004\b\u0017\u0010\u0010\u001a\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0001\u00a2\u0006\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2={"K", "V", "Lkotlin/t;", "pair", "", "g", "(Lkotlin/t;)Ljava/util/Map;", "", "d", "()Ljava/util/Map;", "", "capacity", "e", "(I)Ljava/util/Map;", "builder", "c", "(Ljava/util/Map;)Ljava/util/Map;", "", "", "pairs", "Ljava/util/SortedMap;", "h", "([Lkotlin/t;)Ljava/util/SortedMap;", "i", "expectedSize", "f", "(I)I", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/collections/MapsKt")
@SourceDebugExtension(value={"SMAP\nMapsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
class u0
extends t0 {
    @PublishedApi
    @SinceKotlin(version="1.3")
    @NotNull
    public static <K, V> Map<K, V> c(@NotNull Map<K, V> map2) {
        y.j(map2, (String)"builder");
        return ((d)map2).m();
    }

    @PublishedApi
    @SinceKotlin(version="1.3")
    @NotNull
    public static <K, V> Map<K, V> d() {
        return new d();
    }

    @PublishedApi
    @SinceKotlin(version="1.3")
    @NotNull
    public static <K, V> Map<K, V> e(int n4) {
        return new d(n4);
    }

    @PublishedApi
    public static int f(int n4) {
        if (n4 >= 0) {
            n4 = n4 < 3 ? ++n4 : (n4 < 0x40000000 ? (int)((float)n4 / 0.75f + 1.0f) : Integer.MAX_VALUE);
        }
        return n4;
    }

    @NotNull
    public static <K, V> Map<K, V> g(@NotNull t<? extends K, ? extends V> object) {
        y.j(object, (String)"pair");
        object = Collections.singletonMap(object.c(), object.d());
        y.i(object, (String)"singletonMap(...)");
        return object;
    }

    @NotNull
    public static <K extends Comparable<? super K>, V> SortedMap<K, V> h(t<? extends K, ? extends V> ... tArray) {
        y.j(tArray, (String)"pairs");
        TreeMap treeMap = new TreeMap();
        s0.u(treeMap, tArray);
        return treeMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> i(@NotNull Map<? extends K, ? extends V> map2) {
        y.j(map2, (String)"<this>");
        map2 = map2.entrySet().iterator().next();
        map2 = Collections.singletonMap(map2.getKey(), map2.getValue());
        y.i(map2, (String)"with(...)");
        return map2;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.sequences.i
 *  kotlin.t
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.collections;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.h0;
import kotlin.collections.s0;
import kotlin.collections.u0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.sequences.i;
import kotlin.t;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000B\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\u001a%\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001aQ\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u00a2\u0006\u0004\b\b\u0010\t\u001aQ\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u00a2\u0006\u0004\b\u000b\u0010\t\u001aa\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0010\u001a\u00028\u0000H\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001aI\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u001a\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u00a2\u0006\u0004\b\u0014\u0010\u0015\u001aG\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018\u001aG\u0010\u001a\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0019\u00a2\u0006\u0004\b\u001a\u0010\u001b\u001a;\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001d\u001aQ\u0010 \u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u001e*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00162\u0006\u0010\u001f\u001a\u00028\u0002\u00a2\u0006\u0004\b \u0010!\u001a=\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u00a2\u0006\u0004\b\"\u0010\t\u001aS\u0010#\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u001e*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010\u001f\u001a\u00028\u0002\u00a2\u0006\u0004\b#\u0010$\u001a;\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0019\u00a2\u0006\u0004\b%\u0010&\u001aQ\u0010'\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u001e*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00192\u0006\u0010\u001f\u001a\u00028\u0002\u00a2\u0006\u0004\b'\u0010(\u001a9\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u00a2\u0006\u0004\b)\u0010*\u001a9\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u00a2\u0006\u0004\b+\u0010*\u001aN\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\u0002\u00a2\u0006\u0004\b-\u0010.\u001aP\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0014\u0010/\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\u0002\u00a2\u0006\u0004\b0\u00101\u001aB\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0010\u001a\u00028\u0000H\u0087\u0002\u00a2\u0006\u0004\b2\u00103\u001a7\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000\u00a2\u0006\u0004\b4\u0010*\u00a8\u00065"}, d2={"K", "V", "", "j", "()Ljava/util/Map;", "", "Lkotlin/t;", "pairs", "m", "([Lkotlin/t;)Ljava/util/Map;", "", "o", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "l", "([Lkotlin/t;)Ljava/util/HashMap;", "key", "k", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/k0;", "u", "(Ljava/util/Map;[Lkotlin/t;)V", "", "s", "(Ljava/util/Map;Ljava/lang/Iterable;)V", "Lkotlin/sequences/i;", "t", "(Ljava/util/Map;Lkotlin/sequences/i;)V", "v", "(Ljava/lang/Iterable;)Ljava/util/Map;", "M", "destination", "w", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "A", "B", "([Lkotlin/t;Ljava/util/Map;)Ljava/util/Map;", "y", "(Lkotlin/sequences/i;)Ljava/util/Map;", "z", "(Lkotlin/sequences/i;Ljava/util/Map;)Ljava/util/Map;", "x", "(Ljava/util/Map;)Ljava/util/Map;", "C", "pair", "r", "(Ljava/util/Map;Lkotlin/t;)Ljava/util/Map;", "map", "q", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "n", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;", "p", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/collections/MapsKt")
@SourceDebugExtension(value={"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,813:1\n412#1:823\n423#1:828\n520#1,6:833\n545#1,6:839\n1#2:814\n1246#3,4:815\n1246#3,4:819\n1246#3,4:824\n1246#3,4:829\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n462#1:823\n477#1:828\n535#1:833,6\n560#1:839,6\n412#1:815,4\n423#1:819,4\n462#1:824,4\n477#1:829,4\n*E\n"})
class v0
extends u0 {
    @NotNull
    public static <K, V> Map<K, V> A(@NotNull t<? extends K, ? extends V>[] object) {
        y.j(object, (String)"<this>");
        int n4 = ((t<? extends K, ? extends V>[])object).length;
        object = n4 != 0 ? (n4 != 1 ? v0.B(object, new LinkedHashMap(s0.f(((t<? extends K, ? extends V>[])object).length))) : s0.g(object[0])) : s0.j();
        return object;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M B(@NotNull t<? extends K, ? extends V>[] tArray, @NotNull M m4) {
        y.j(tArray, (String)"<this>");
        y.j(m4, (String)"destination");
        s0.u(m4, tArray);
        return m4;
    }

    @SinceKotlin(version="1.1")
    @NotNull
    public static <K, V> Map<K, V> C(@NotNull Map<? extends K, ? extends V> map2) {
        y.j(map2, (String)"<this>");
        return new LinkedHashMap<K, V>(map2);
    }

    @NotNull
    public static <K, V> Map<K, V> j() {
        h0 h02 = h0.c;
        y.h((Object)h02, (String)"null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return h02;
    }

    @SinceKotlin(version="1.1")
    public static <K, V> V k(@NotNull Map<K, ? extends V> map2, K k2) {
        y.j(map2, (String)"<this>");
        return (V)s0.a(map2, k2);
    }

    @NotNull
    public static <K, V> HashMap<K, V> l(t<? extends K, ? extends V> ... tArray) {
        y.j(tArray, (String)"pairs");
        HashMap hashMap = new HashMap(s0.f(tArray.length));
        s0.u(hashMap, tArray);
        return hashMap;
    }

    @NotNull
    public static <K, V> Map<K, V> m(t<? extends K, ? extends V> ... object) {
        y.j(object, (String)"pairs");
        object = ((t<? extends K, ? extends V>[])object).length > 0 ? v0.B(object, new LinkedHashMap(s0.f(((t<? extends K, ? extends V>[])object).length))) : s0.j();
        return object;
    }

    @SinceKotlin(version="1.1")
    @NotNull
    public static <K, V> Map<K, V> n(@NotNull Map<? extends K, ? extends V> map2, K k2) {
        y.j(map2, (String)"<this>");
        map2 = s0.C(map2);
        map2.remove(k2);
        return v0.p(map2);
    }

    @NotNull
    public static <K, V> Map<K, V> o(t<? extends K, ? extends V> ... tArray) {
        y.j(tArray, (String)"pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(s0.f(tArray.length));
        s0.u(linkedHashMap, tArray);
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> p(@NotNull Map<K, ? extends V> map2) {
        y.j(map2, (String)"<this>");
        int n4 = map2.size();
        if (n4 != 0) {
            if (n4 == 1) {
                map2 = u0.i(map2);
            }
        } else {
            map2 = s0.j();
        }
        return map2;
    }

    @NotNull
    public static <K, V> Map<K, V> q(@NotNull Map<? extends K, ? extends V> map2, @NotNull Map<? extends K, ? extends V> map3) {
        y.j(map2, (String)"<this>");
        y.j(map3, (String)"map");
        map2 = new LinkedHashMap<K, V>(map2);
        ((AbstractMap)map2).putAll(map3);
        return map2;
    }

    @NotNull
    public static <K, V> Map<K, V> r(@NotNull Map<? extends K, ? extends V> linkedHashMap, @NotNull t<? extends K, ? extends V> t3) {
        y.j(linkedHashMap, (String)"<this>");
        y.j(t3, (String)"pair");
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = s0.g(t3);
        } else {
            linkedHashMap = new LinkedHashMap<Object, Object>(linkedHashMap);
            ((AbstractMap)linkedHashMap).put(t3.c(), t3.d());
        }
        return linkedHashMap;
    }

    public static <K, V> void s(@NotNull Map<? super K, ? super V> map2, @NotNull Iterable<? extends t<? extends K, ? extends V>> iterable2) {
        y.j(map2, (String)"<this>");
        y.j(iterable2, (String)"pairs");
        for (t<K, V> t3 : iterable2) {
            map2.put(t3.a(), t3.b());
        }
    }

    public static <K, V> void t(@NotNull Map<? super K, ? super V> map2, @NotNull i<? extends t<? extends K, ? extends V>> object) {
        y.j(map2, (String)"<this>");
        y.j(object, (String)"pairs");
        object = object.iterator();
        while (object.hasNext()) {
            t t3 = (t)object.next();
            map2.put(t3.a(), t3.b());
        }
    }

    public static <K, V> void u(@NotNull Map<? super K, ? super V> map2, @NotNull t<? extends K, ? extends V>[] tArray) {
        y.j(map2, (String)"<this>");
        y.j(tArray, (String)"pairs");
        for (t<? extends K, ? extends V> t3 : tArray) {
            map2.put(t3.a(), t3.b());
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @NotNull
    public static <K, V> Map<K, V> v(@NotNull Iterable<? extends t<? extends K, ? extends V>> object) {
        void var0_3;
        void var0_8;
        y.j((Object)object, (String)"<this>");
        if (!(object instanceof Collection)) return v0.p(v0.w(object, new LinkedHashMap()));
        Collection collection = (Collection)object;
        int n4 = collection.size();
        if (n4 == 0) {
            Map map2 = s0.j();
            return var0_8;
        }
        if (n4 != 1) {
            LinkedHashMap linkedHashMap = v0.w(object, new LinkedHashMap(s0.f(collection.size())));
            return var0_8;
        }
        if (object instanceof List) {
            Object e4 = ((List)object).get(0);
        } else {
            Object t3 = object.iterator().next();
        }
        t t4 = (t)var0_3;
        Map map3 = s0.g(t4);
        return var0_8;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M w(@NotNull Iterable<? extends t<? extends K, ? extends V>> iterable, @NotNull M m4) {
        y.j(iterable, (String)"<this>");
        y.j(m4, (String)"destination");
        s0.s(m4, iterable);
        return m4;
    }

    @SinceKotlin(version="1.1")
    @NotNull
    public static <K, V> Map<K, V> x(@NotNull Map<? extends K, ? extends V> map2) {
        y.j(map2, (String)"<this>");
        int n4 = map2.size();
        map2 = n4 != 0 ? (n4 != 1 ? s0.C(map2) : u0.i(map2)) : s0.j();
        return map2;
    }

    @NotNull
    public static <K, V> Map<K, V> y(@NotNull i<? extends t<? extends K, ? extends V>> i4) {
        y.j(i4, (String)"<this>");
        return v0.p(v0.z(i4, new LinkedHashMap()));
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M z(@NotNull i<? extends t<? extends K, ? extends V>> i4, @NotNull M m4) {
        y.j(i4, (String)"<this>");
        y.j(m4, (String)"destination");
        s0.t(m4, i4);
        return m4;
    }
}


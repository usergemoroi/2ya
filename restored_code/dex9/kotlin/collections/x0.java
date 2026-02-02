/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.sequences.i
 *  kotlin.t
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.w0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.sequences.i;
import kotlin.t;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\u001a=\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a=\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u00a2\u0006\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"K", "V", "", "", "Lkotlin/t;", "E", "(Ljava/util/Map;)Ljava/util/List;", "Lkotlin/sequences/i;", "", "D", "(Ljava/util/Map;)Lkotlin/sequences/i;", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/collections/MapsKt")
@SourceDebugExtension(value={"SMAP\n_Maps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,595:1\n97#1,5:596\n112#1,5:601\n153#1,3:606\n144#1:609\n216#1:610\n217#1:612\n145#1:613\n216#1:614\n217#1:616\n1#2:611\n1#2:615\n1948#3,14:617\n1971#3,14:631\n2318#3,14:645\n2341#3,14:659\n1872#3,3:673\n*S KotlinDebug\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n77#1:596,5\n90#1:601,5\n126#1:606,3\n136#1:609\n136#1:610\n136#1:612\n136#1:613\n144#1:614\n144#1:616\n136#1:611\n231#1:617,14\n242#1:631,14\n391#1:645,14\n402#1:659,14\n575#1:673,3\n*E\n"})
class x0
extends w0 {
    @NotNull
    public static <K, V> i<Map.Entry<K, V>> D(@NotNull Map<? extends K, ? extends V> map2) {
        y.j(map2, (String)"<this>");
        return kotlin.collections.t.f0(map2.entrySet());
    }

    @NotNull
    public static <K, V> List<t<K, V>> E(@NotNull Map<? extends K, ? extends V> object) {
        y.j(object, (String)"<this>");
        if (object.size() == 0) {
            return kotlin.collections.t.m();
        }
        Iterator<Map.Entry<K, V>> iterator = object.entrySet().iterator();
        if (!iterator.hasNext()) {
            return kotlin.collections.t.m();
        }
        Map.Entry<K, V> entry = iterator.next();
        if (!iterator.hasNext()) {
            return kotlin.collections.t.e(new t(entry.getKey(), entry.getValue()));
        }
        object = new ArrayList(object.size());
        ((ArrayList)object).add(new t(entry.getKey(), entry.getValue()));
        do {
            entry = iterator.next();
            ((ArrayList)object).add(new t(entry.getKey(), entry.getValue()));
        } while (iterator.hasNext());
        return object;
    }
}


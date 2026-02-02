/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.collections;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a0;
import kotlin.collections.d1;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.collections.w;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0006\u001a.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002\u00a2\u0006\u0004\b\u0007\u0010\b\u001a.\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\b\t\u0010\u0004\u001a4\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002\u00a2\u0006\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2={"T", "", "element", "l", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "", "elements", "k", "(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;", "n", "m", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/collections/SetsKt")
@SourceDebugExtension(value={"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n865#2,2:141\n855#2,2:143\n1#3:145\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n29#1:141,2\n53#1:143,2\n*E\n"})
class e1
extends d1 {
    @NotNull
    public static <T> Set<T> k(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        y.j(set, (String)"<this>");
        y.j(iterable, (String)"elements");
        iterable = a0.H(iterable);
        if (iterable.isEmpty()) {
            return t.j1(set);
        }
        if (iterable instanceof Set) {
            Object object = set;
            set = new LinkedHashSet<T>();
            object = object.iterator();
            while (object.hasNext()) {
                Object e4 = object.next();
                if (iterable.contains(e4)) continue;
                set.add(e4);
            }
            return set;
        }
        set = new LinkedHashSet<T>((Collection)set);
        ((AbstractCollection)((Object)set)).removeAll((Collection<?>)iterable);
        return set;
    }

    @NotNull
    public static <T> Set<T> l(@NotNull Set<? extends T> object, T t3) {
        y.j(object, (String)"<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(s0.f(object.size()));
        object = ((Iterable)object).iterator();
        boolean bl = false;
        while (object.hasNext()) {
            Object e4 = object.next();
            boolean bl2 = true;
            boolean bl3 = bl;
            boolean bl4 = bl2;
            if (!bl) {
                bl3 = bl;
                bl4 = bl2;
                if (y.e(e4, t3)) {
                    bl3 = true;
                    bl4 = false;
                }
            }
            bl = bl3;
            if (!bl4) continue;
            linkedHashSet.add(e4);
            bl = bl3;
        }
        return linkedHashSet;
    }

    @NotNull
    public static <T> Set<T> m(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        int n4;
        y.j(set, (String)"<this>");
        y.j(iterable, (String)"elements");
        Serializable serializable = w.y(iterable);
        if (serializable != null) {
            n4 = ((Number)serializable).intValue();
            n4 = set.size() + n4;
        } else {
            n4 = set.size() * 2;
        }
        serializable = new LinkedHashSet(s0.f(n4));
        ((AbstractCollection)((Object)serializable)).addAll((Collection)set);
        t.E((Collection)((Object)serializable), iterable);
        return serializable;
    }

    @NotNull
    public static <T> Set<T> n(@NotNull Set<? extends T> set, T t3) {
        y.j(set, (String)"<this>");
        LinkedHashSet<T> linkedHashSet = new LinkedHashSet<T>(s0.f(set.size() + 1));
        linkedHashSet.addAll((Collection)set);
        ((AbstractCollection)linkedHashSet).add(t3);
        return linkedHashSet;
    }
}


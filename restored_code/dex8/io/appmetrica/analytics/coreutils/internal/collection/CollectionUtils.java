/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  kotlin.collections.l
 *  kotlin.collections.s0
 *  kotlin.collections.t
 *  kotlin.ranges.j
 *  kotlin.text.p
 */
package io.appmetrica.analytics.coreutils.internal.collection;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.jvm.JvmStatic;
import kotlin.ranges.j;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010&\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001J/\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002H\u0007\u00a2\u0006\u0004\b\u0006\u0010\u0007JC\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00018\u00002\b\u0010\r\u001a\u0004\u0018\u00018\u0001H\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00112\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\f\u001a\u00020\u0013H\u0007\u00a2\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00112\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00028\u00000\u0012H\u0007\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007\u00a2\u0006\u0004\b\u001c\u0010\u001dJ?\u0010\u001f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0007\u00a2\u0006\u0004\b\u001f\u0010 J?\u0010!\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0012\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\nH\u0007\u00a2\u0006\u0004\b!\u0010\u0017J)\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007\u00a2\u0006\u0004\b$\u0010%J;\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H\u0007\u00a2\u0006\u0004\b&\u0010\u0017J;\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H\u0007\u00a2\u0006\u0004\b'\u0010\u0017J/\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00112\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000(\"\u00028\u0000H\u0007\u00a2\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0#2\u0006\u0010,\u001a\u00020\u0018H\u0007\u00a2\u0006\u0004\b-\u0010.J)\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130#2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130(\"\u00020\u0013H\u0007\u00a2\u0006\u0004\b0\u00101JE\u00103\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000102\u0018\u00010#\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0012H\u0007\u00a2\u0006\u0004\b3\u00104JC\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2\u001a\u00105\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000102\u0018\u00010#H\u0007\u00a2\u0006\u0004\b6\u00107JE\u00108\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0012\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2\u001a\u00105\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000102\u0018\u00010#H\u0007\u00a2\u0006\u0004\b8\u00107J-\u00109\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#\"\u0004\b\u0000\u0010\u00112\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002H\u0007\u00a2\u0006\u0004\b9\u0010%J?\u0010:\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0012\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0012H\u0007\u00a2\u0006\u0004\b:\u0010\u0017J)\u0010;\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00112\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010#H\u0007\u00a2\u0006\u0004\b;\u0010<J#\u0010?\u001a\u00020>2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020=0\u0012H\u0007\u00a2\u0006\u0004\b?\u0010@J%\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020=0\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010>H\u0007\u00a2\u0006\u0004\bA\u0010BJ-\u0010C\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#\"\u0004\b\u0000\u0010\u00112\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#H\u0007\u00a2\u0006\u0004\bC\u0010DJ\u001d\u0010F\u001a\u00020\u00052\f\u0010E\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0007\u00a2\u0006\u0004\bF\u0010GJ7\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00112\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000H2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0007\u00a2\u0006\u0004\bK\u0010L\u00a8\u0006M"}, d2={"Lio/appmetrica/analytics/coreutils/internal/collection/CollectionUtils;", "", "", "left", "right", "", "areCollectionsEqual", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "K", "V", "", "map", "key", "value", "Lkotlin/k0;", "putOpt", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V", "T", "", "", "getFromMapIgnoreCase", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;", "convertMapKeysToLowerCase", "(Ljava/util/Map;)Ljava/util/Map;", "", "input", "", "", "hashSetFromIntArray", "([I)Ljava/util/Set;", "defValue", "getOrDefault", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "copyOf", "original", "", "unmodifiableListCopy", "(Ljava/util/Collection;)Ljava/util/List;", "unmodifiableMapCopy", "unmodifiableSameOrderMapCopy", "", "values", "unmodifiableSetOf", "([Ljava/lang/Object;)Ljava/util/Set;", "array", "toIntList", "([I)Ljava/util/List;", "elements", "createSortedListWithoutRepetitions", "([Ljava/lang/String;)Ljava/util/List;", "", "getListFromMap", "(Ljava/util/Map;)Ljava/util/List;", "list", "getMapFromList", "(Ljava/util/List;)Ljava/util/Map;", "getMapFromListOrNull", "arrayListCopyOfNullableCollection", "mapCopyOfNullableMap", "getFirstOrNull", "(Ljava/util/List;)Ljava/lang/Object;", "", "Landroid/os/Bundle;", "mapToBundle", "(Ljava/util/Map;)Landroid/os/Bundle;", "bundleToMap", "(Landroid/os/Bundle;)Ljava/util/Map;", "nullIfEmptyList", "(Ljava/util/List;)Ljava/util/List;", "collection", "isNullOrEmpty", "(Ljava/util/Collection;)Z", "", "target", "source", "merge", "(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class CollectionUtils {
    @NotNull
    public static final CollectionUtils INSTANCE = new CollectionUtils();

    private CollectionUtils() {
    }

    @JvmStatic
    public static final boolean areCollectionsEqual(@Nullable Collection<? extends Object> object, @Nullable Collection<? extends Object> hashSet) {
        if (object == null && hashSet == null) {
            return true;
        }
        if (object != null && hashSet != null && object.size() == hashSet.size()) {
            HashSet<? extends Object> hashSet2;
            if (object instanceof HashSet) {
                hashSet2 = (HashSet<? extends Object>)object;
                object = hashSet;
                hashSet = hashSet2;
            } else if (hashSet instanceof HashSet) {
                hashSet = hashSet;
            } else {
                hashSet2 = new HashSet<Object>((Collection<? extends Object>)object);
                object = hashSet;
                hashSet = hashSet2;
            }
            object = object.iterator();
            while (object.hasNext()) {
                if (hashSet.contains(object.next())) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    @JvmStatic
    @Nullable
    public static final <T> List<T> arrayListCopyOfNullableCollection(@Nullable Collection<? extends T> list) {
        list = list != null ? t.e1(list) : null;
        return list;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, byte[]> bundleToMap(@Nullable Bundle bundle) {
        HashMap<String, byte[]> hashMap = new HashMap<String, byte[]>();
        if (bundle != null) {
            for (String string2 : bundle.keySet()) {
                byte[] byArray = bundle.getByteArray(string2);
                if (byArray == null) continue;
                hashMap.put(string2, byArray);
            }
        }
        return hashMap;
    }

    @JvmStatic
    @NotNull
    public static final <T> Map<String, T> convertMapKeysToLowerCase(@NotNull Map<String, ? extends T> object) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(s0.f((int)object.size()));
        for (Map.Entry entry : object.entrySet()) {
            object = (String)entry.getKey();
            object = object != null ? ((String)object).toLowerCase(Locale.getDefault()) : null;
            linkedHashMap.put(object, entry.getValue());
        }
        return linkedHashMap;
    }

    @JvmStatic
    @Nullable
    public static final <K, V> Map<K, V> copyOf(@Nullable Map<K, V> map2) {
        map2 = map2 != null && !map2.isEmpty() ? new HashMap<K, V>(map2) : null;
        return map2;
    }

    @JvmStatic
    @NotNull
    public static final List<String> createSortedListWithoutRepetitions(String ... stringArray) {
        return CollectionUtils.unmodifiableListCopy(l.R((Comparable[])((Comparable[])stringArray)));
    }

    @JvmStatic
    @Nullable
    public static final <T> T getFirstOrNull(@Nullable List<? extends T> object) {
        object = object != null ? t.t0(object) : null;
        return (T)object;
    }

    @JvmStatic
    @Nullable
    public static final <T> T getFromMapIgnoreCase(@NotNull Map<String, ? extends T> map2, @NotNull String object) {
        Object var3_4;
        block3: {
            block2: {
                Map.Entry entry;
                CharSequence charSequence;
                Iterator iterator = map2.entrySet().iterator();
                do {
                    boolean bl2 = iterator.hasNext();
                    var3_4 = null;
                    if (!bl2) break block2;
                } while ((charSequence = (CharSequence)(entry = (Map.Entry)((Object)(map2 = iterator.next()))).getKey()) == null || charSequence.length() == 0 || !p.z((String)((String)entry.getKey()), (String)object, (boolean)true));
                break block3;
            }
            map2 = null;
        }
        object = (Map.Entry)((Object)map2);
        map2 = var3_4;
        if (object != null) {
            map2 = object.getValue();
        }
        return (T)map2;
    }

    @JvmStatic
    @Nullable
    public static final <K, V> List<Map.Entry<K, V>> getListFromMap(@Nullable Map<K, ? extends V> object) {
        if (object != null) {
            ArrayList<AbstractMap.SimpleEntry<K, ? extends V>> arrayList = new ArrayList<AbstractMap.SimpleEntry<K, ? extends V>>(object.size());
            Iterator<Map.Entry<K, V>> iterator = object.entrySet().iterator();
            while (true) {
                object = arrayList;
                if (iterator.hasNext()) {
                    arrayList.add(new AbstractMap.SimpleEntry<K, V>(iterator.next()));
                    continue;
                }
                break;
            }
        } else {
            object = null;
        }
        return object;
    }

    @JvmStatic
    @NotNull
    public static final <K, V> Map<K, V> getMapFromList(@Nullable List<? extends Map.Entry<? extends K, ? extends V>> object) {
        if (object != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(j.e((int)s0.f((int)t.x(object, (int)10)), (int)16));
            Iterator iterator = object.iterator();
            while (true) {
                object = linkedHashMap;
                if (iterator.hasNext()) {
                    object = (Map.Entry)iterator.next();
                    linkedHashMap.put(object.getKey(), object.getValue());
                    continue;
                }
                break;
            }
        } else {
            object = new LinkedHashMap();
        }
        return object;
    }

    @JvmStatic
    @Nullable
    public static final <K, V> Map<K, V> getMapFromListOrNull(@Nullable List<? extends Map.Entry<? extends K, ? extends V>> object) {
        if (object != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(j.e((int)s0.f((int)t.x(object, (int)10)), (int)16));
            Iterator iterator = object.iterator();
            while (true) {
                object = linkedHashMap;
                if (iterator.hasNext()) {
                    object = (Map.Entry)iterator.next();
                    linkedHashMap.put(object.getKey(), object.getValue());
                    continue;
                }
                break;
            }
        } else {
            object = null;
        }
        return object;
    }

    @JvmStatic
    public static final <K, V> V getOrDefault(@NotNull Map<K, ? extends V> map2, K k11, V v14) {
        block0: {
            if ((map2 = map2.get(k11)) != null) break block0;
            map2 = v14;
        }
        return (V)map2;
    }

    @JvmStatic
    @NotNull
    public static final Set<Integer> hashSetFromIntArray(@NotNull int[] nArray) {
        return l.f1((int[])nArray);
    }

    @JvmStatic
    public static final boolean isNullOrEmpty(@Nullable Collection<?> collection) {
        boolean bl2 = collection == null || collection.isEmpty();
        return bl2;
    }

    @JvmStatic
    @Nullable
    public static final <K, V> Map<K, V> mapCopyOfNullableMap(@Nullable Map<K, ? extends V> map2) {
        map2 = map2 != null ? s0.x(map2) : null;
        return map2;
    }

    @JvmStatic
    @NotNull
    public static final Bundle mapToBundle(@NotNull Map<String, byte[]> object2) {
        Bundle bundle = new Bundle(object2.size());
        for (Map.Entry entry : object2.entrySet()) {
            bundle.putByteArray((String)entry.getKey(), (byte[])entry.getValue());
        }
        return bundle;
    }

    @JvmStatic
    @NotNull
    public static final <T> Set<T> merge(@NotNull Set<T> set, @NotNull Set<? extends T> set2) {
        set.addAll(set2);
        return set;
    }

    @JvmStatic
    @Nullable
    public static final <T> List<T> nullIfEmptyList(@Nullable List<? extends T> list) {
        if (list == null || !(list.isEmpty() ^ true)) {
            list = null;
        }
        return list;
    }

    @JvmStatic
    public static final <K, V> void putOpt(@NotNull Map<K, V> map2, @Nullable K k11, @Nullable V v14) {
        if (k11 != null && v14 != null) {
            map2.put(k11, v14);
        }
    }

    @JvmStatic
    @NotNull
    public static final List<Integer> toIntList(@NotNull int[] nArray) {
        return l.h1((int[])nArray);
    }

    @JvmStatic
    @NotNull
    public static final <T> List<T> unmodifiableListCopy(@NotNull Collection<? extends T> collection) {
        return Collections.unmodifiableList(new ArrayList<T>(collection));
    }

    @JvmStatic
    @NotNull
    public static final <K, V> Map<K, V> unmodifiableMapCopy(@NotNull Map<K, ? extends V> map2) {
        return Collections.unmodifiableMap(new HashMap<K, V>(map2));
    }

    @JvmStatic
    @NotNull
    public static final <K, V> Map<K, V> unmodifiableSameOrderMapCopy(@NotNull Map<K, ? extends V> map2) {
        return Collections.unmodifiableMap(new LinkedHashMap<K, V>(map2));
    }

    @JvmStatic
    @NotNull
    public static final <T> Set<T> unmodifiableSetOf(T ... TArray) {
        return Collections.unmodifiableSet(l.g1((Object[])TArray));
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.a1;
import kotlinx.serialization.internal.l1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00060\u0003B#\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 \u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010 \u00a2\u0006\u0004\b#\u0010$J\u001f\u0010\b\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014\u00a2\u0006\u0004\b\b\u0010\tJ1\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b0\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014\u00a2\u0006\u0004\b\f\u0010\rJ+\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014\u00a2\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0010\u001a\u00020\u0007*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014\u00a2\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014\u00a2\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014\u00a2\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\u00020\u0017*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00062\u0006\u0010\u0016\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006%"}, d2={"Lkotlinx/serialization/internal/b1;", "K", "V", "Lkotlinx/serialization/internal/l1;", "", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "", "u", "(Ljava/util/Map;)I", "", "", "t", "(Ljava/util/Map;)Ljava/util/Iterator;", "q", "()Ljava/util/LinkedHashMap;", "r", "(Ljava/util/LinkedHashMap;)I", "w", "(Ljava/util/LinkedHashMap;)Ljava/util/Map;", "v", "(Ljava/util/Map;)Ljava/util/LinkedHashMap;", "size", "Lkotlin/k0;", "s", "(Ljava/util/LinkedHashMap;I)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/KSerializer;", "kSerializer", "vSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class b1<K, V>
extends l1<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    @NotNull
    private final SerialDescriptor c;

    public b1(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> kSerializer2) {
        y.j(kSerializer, (String)"kSerializer");
        y.j(kSerializer2, (String)"vSerializer");
        super(kSerializer, kSerializer2, null);
        this.c = new a1(kSerializer.getDescriptor(), kSerializer2.getDescriptor());
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.c;
    }

    @NotNull
    protected LinkedHashMap<K, V> q() {
        return new LinkedHashMap();
    }

    protected int r(@NotNull LinkedHashMap<K, V> linkedHashMap) {
        y.j(linkedHashMap, (String)"<this>");
        return ((AbstractMap)linkedHashMap).size() * 2;
    }

    protected void s(@NotNull LinkedHashMap<K, V> linkedHashMap, int n4) {
        y.j(linkedHashMap, (String)"<this>");
    }

    @NotNull
    protected Iterator<Map.Entry<K, V>> t(@NotNull Map<K, ? extends V> map2) {
        y.j(map2, (String)"<this>");
        return map2.entrySet().iterator();
    }

    protected int u(@NotNull Map<K, ? extends V> map2) {
        y.j(map2, (String)"<this>");
        return map2.size();
    }

    @NotNull
    protected LinkedHashMap<K, V> v(@NotNull Map<K, ? extends V> map2) {
        y.j(map2, (String)"<this>");
        LinkedHashMap<K, ? extends V> linkedHashMap = map2 instanceof LinkedHashMap ? (LinkedHashMap<K, ? extends V>)map2 : null;
        LinkedHashMap<K, ? extends V> linkedHashMap2 = linkedHashMap;
        if (linkedHashMap == null) {
            linkedHashMap2 = new LinkedHashMap<K, V>(map2);
        }
        return linkedHashMap2;
    }

    @NotNull
    protected Map<K, V> w(@NotNull LinkedHashMap<K, V> linkedHashMap) {
        y.j(linkedHashMap, (String)"<this>");
        return linkedHashMap;
    }
}


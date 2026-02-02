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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.l1;
import kotlinx.serialization.internal.o0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00060\u0003B#\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 \u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010 \u00a2\u0006\u0004\b#\u0010$J\u001f\u0010\b\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014\u00a2\u0006\u0004\b\b\u0010\tJ1\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b0\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014\u00a2\u0006\u0004\b\f\u0010\rJ+\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014\u00a2\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0010\u001a\u00020\u0007*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014\u00a2\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014\u00a2\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014\u00a2\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\u00020\u0017*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00062\u0006\u0010\u0016\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006%"}, d2={"Lkotlinx/serialization/internal/p0;", "K", "V", "Lkotlinx/serialization/internal/l1;", "", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "", "u", "(Ljava/util/Map;)I", "", "", "t", "(Ljava/util/Map;)Ljava/util/Iterator;", "q", "()Ljava/util/HashMap;", "r", "(Ljava/util/HashMap;)I", "w", "(Ljava/util/HashMap;)Ljava/util/Map;", "v", "(Ljava/util/Map;)Ljava/util/HashMap;", "size", "Lkotlin/k0;", "s", "(Ljava/util/HashMap;I)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/KSerializer;", "kSerializer", "vSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class p0<K, V>
extends l1<K, V, Map<K, ? extends V>, HashMap<K, V>> {
    @NotNull
    private final SerialDescriptor c;

    public p0(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> kSerializer2) {
        y.j(kSerializer, (String)"kSerializer");
        y.j(kSerializer2, (String)"vSerializer");
        super(kSerializer, kSerializer2, null);
        this.c = new o0(kSerializer.getDescriptor(), kSerializer2.getDescriptor());
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.c;
    }

    @NotNull
    protected HashMap<K, V> q() {
        return new HashMap();
    }

    protected int r(@NotNull HashMap<K, V> hashMap) {
        y.j(hashMap, (String)"<this>");
        return hashMap.size() * 2;
    }

    protected void s(@NotNull HashMap<K, V> hashMap, int n4) {
        y.j(hashMap, (String)"<this>");
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
    protected HashMap<K, V> v(@NotNull Map<K, ? extends V> map2) {
        y.j(map2, (String)"<this>");
        HashMap<K, ? extends V> hashMap = map2 instanceof HashMap ? (HashMap<K, ? extends V>)map2 : null;
        HashMap<K, ? extends V> hashMap2 = hashMap;
        if (hashMap == null) {
            hashMap2 = new HashMap<K, V>(map2);
        }
        return hashMap2;
    }

    @NotNull
    protected Map<K, V> w(@NotNull HashMap<K, V> hashMap) {
        y.j(hashMap, (String)"<this>");
        return hashMap;
    }
}


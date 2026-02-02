/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B>\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00028\u00010\u001d\u00a2\u0006\u0004\b/\u00100J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\u0014\u0010\bJ\u001a\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0016R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00188\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR/\u0010\"\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00028\u00010\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\u000bR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010*R&\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,0$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b-\u0010&\u00a8\u00061"}, d2={"Lkotlin/collections/r0;", "K", "V", "Lkotlin/collections/q0;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "key", "containsKey", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "c", "", "Ljava/util/Map;", "j", "()Ljava/util/Map;", "map", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "d", "Lkotlin/jvm/functions/l;", "default", "size", "", "b", "()Ljava/util/Set;", "keys", "", "e", "()Ljava/util/Collection;", "values", "", "a", "entries", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/l;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n350#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n*L\n80#1:105,6\n*E\n"})
final class r0<K, V>
implements q0<K, V> {
    @NotNull
    private final Map<K, V> c;
    @NotNull
    private final l<K, V> d;

    public r0(@NotNull Map<K, ? extends V> map2, @NotNull l<? super K, ? extends V> l4) {
        y.j(map2, (String)"map");
        y.j(l4, (String)"default");
        this.c = map2;
        this.d = l4;
    }

    @NotNull
    public Set<Map.Entry<K, V>> a() {
        return this.j().entrySet();
    }

    @NotNull
    public Set<K> b() {
        return this.j().keySet();
    }

    @Override
    public V c(K k2) {
        V v3;
        Map<K, V> map2 = this.j();
        V v4 = v3 = map2.get(k2);
        if (v3 == null) {
            v4 = v3;
            if (!map2.containsKey(k2)) {
                v4 = this.d.invoke(k2);
            }
        }
        return v4;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean containsKey(Object object) {
        return this.j().containsKey(object);
    }

    @Override
    public boolean containsValue(Object object) {
        return this.j().containsValue(object);
    }

    public int d() {
        return this.j().size();
    }

    @NotNull
    public Collection<V> e() {
        return this.j().values();
    }

    @Override
    public boolean equals(@Nullable Object object) {
        return ((Object)this.j()).equals(object);
    }

    @Override
    @Nullable
    public V get(Object object) {
        return this.j().get(object);
    }

    @Override
    public int hashCode() {
        return ((Object)this.j()).hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.j().isEmpty();
    }

    @Override
    @NotNull
    public Map<K, V> j() {
        return this.c;
    }

    @Override
    public V put(K k2, V v3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public V remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public String toString() {
        return this.j().toString();
    }
}


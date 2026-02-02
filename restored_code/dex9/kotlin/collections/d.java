/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.collections.d$a
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.markers.a
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u000f\b'\u0018\u0000 1*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u00012B\t\b\u0004\u00a2\u0006\u0004\b/\u00100J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\b\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\b\u0007\u0010\u000bJ%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\f\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0011J!\u0010\u0016\u001a\u00020\u000f2\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0096\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0011J\u001a\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0007\u0010 R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010$8\b@\bX\u0088\u000e\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b'\u0010\u001dR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000!8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010-\u00a8\u00063"}, d2={"Lkotlin/collections/d;", "K", "V", "", "", "entry", "", "toString", "(Ljava/util/Map$Entry;)Ljava/lang/String;", "", "o", "(Ljava/lang/Object;)Ljava/lang/String;", "key", "implFindEntry", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "containsEntry$kotlin_stdlib", "(Ljava/util/Map$Entry;)Z", "containsEntry", "other", "equals", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode", "()I", "isEmpty", "()Z", "()Ljava/lang/String;", "", "_keys", "Ljava/util/Set;", "", "_values", "Ljava/util/Collection;", "getSize", "size", "getKeys", "()Ljava/util/Set;", "keys", "getValues", "()Ljava/util/Collection;", "values", "<init>", "()V", "Companion", "a", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SinceKotlin(version="1.1")
@SourceDebugExtension(value={"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1755#2,3:154\n1734#2,3:157\n295#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
public abstract class d<K, V>
implements Map<K, V>,
kotlin.jvm.internal.markers.a {
    @NotNull
    public static final a Companion = new /* Unavailable Anonymous Inner Class!! */;
    @Nullable
    private volatile Set<? extends K> _keys;
    @Nullable
    private volatile Collection<? extends V> _values;

    protected d() {
    }

    private final Map.Entry<K, V> implFindEntry(K object) {
        block1: {
            for (Object t3 : (Iterable)this.entrySet()) {
                if (!y.e(((Map.Entry)t3).getKey(), object)) continue;
                object = t3;
                break block1;
            }
            object = null;
        }
        return (Map.Entry)object;
    }

    private final String toString(Object object) {
        object = object == this ? "(this Map)" : String.valueOf(object);
        return object;
    }

    private final String toString(Map.Entry<? extends K, ? extends V> entry) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.toString(entry.getKey()));
        stringBuilder.append('=');
        stringBuilder.append(this.toString(entry.getValue()));
        return stringBuilder.toString();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsEntry$kotlin_stdlib(@Nullable Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object obj = entry.getKey();
        Object obj2 = entry.getValue();
        y.h((Object)this, (String)"null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        entry = this.get(obj);
        if (!y.e(obj2, entry)) {
            return false;
        }
        if (entry == null) {
            y.h((Object)this, (String)"null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
            if (!this.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsKey(Object object) {
        boolean bl = this.implFindEntry(object) != null;
        return bl;
    }

    @Override
    public boolean containsValue(Object object) {
        boolean bl;
        block3: {
            Object object2 = this.entrySet();
            bl = object2 instanceof Collection;
            boolean bl2 = false;
            if (bl && ((Collection)object2).isEmpty()) {
                bl = bl2;
            } else {
                object2 = object2.iterator();
                do {
                    bl = bl2;
                    if (!object2.hasNext()) break block3;
                } while (!y.e(((Map.Entry)object2.next()).getValue(), (Object)object));
                bl = true;
            }
        }
        return bl;
    }

    @Override
    public boolean equals(@Nullable Object iterator) {
        boolean bl;
        block6: {
            boolean bl2 = true;
            if (iterator == this) {
                return true;
            }
            if (!(iterator instanceof Map)) {
                return false;
            }
            int n4 = this.size();
            if (n4 != (iterator = (Map)((Object)iterator)).size()) {
                return false;
            }
            if ((iterator = (Iterable)iterator.entrySet()) instanceof Collection && ((Collection)((Object)iterator)).isEmpty()) {
                bl = bl2;
            } else {
                iterator = iterator.iterator();
                do {
                    bl = bl2;
                    if (!iterator.hasNext()) break block6;
                } while (this.containsEntry$kotlin_stdlib((Map.Entry)iterator.next()));
                bl = false;
            }
        }
        return bl;
    }

    @Override
    @Nullable
    public V get(Object entry) {
        entry = (entry = this.implFindEntry(entry)) != null ? entry.getValue() : null;
        return (V)entry;
    }

    public abstract Set getEntries();

    @NotNull
    public Set<K> getKeys() {
        if (this._keys == null) {
            this._keys = new i<K>(this){
                final d<K, V> c;
                {
                    this.c = d4;
                }

                @Override
                public boolean contains(Object object) {
                    return this.c.containsKey(object);
                }

                @Override
                public int getSize() {
                    return this.c.size();
                }

                @Override
                public Iterator<K> iterator() {
                    return new Iterator<K>(this.c.entrySet().iterator()){
                        final Iterator<Map.Entry<K, V>> c;
                        {
                            this.c = iterator;
                        }

                        @Override
                        public boolean hasNext() {
                            return this.c.hasNext();
                        }

                        @Override
                        public K next() {
                            return this.c.next().getKey();
                        }

                        @Override
                        public void remove() {
                            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        }
                    };
                }
            };
        }
        Set<? extends K> set = this._keys;
        y.g(set);
        return set;
    }

    public int getSize() {
        return this.entrySet().size();
    }

    @NotNull
    public Collection<V> getValues() {
        if (this._values == null) {
            this._values = new kotlin.collections.a<V>(this){
                final d<K, V> c;
                {
                    this.c = d4;
                }

                @Override
                public boolean contains(Object object) {
                    return this.c.containsValue(object);
                }

                @Override
                public int getSize() {
                    return this.c.size();
                }

                @Override
                public Iterator<V> iterator() {
                    return new Iterator<V>(this.c.entrySet().iterator()){
                        final Iterator<Map.Entry<K, V>> c;
                        {
                            this.c = iterator;
                        }

                        @Override
                        public boolean hasNext() {
                            return this.c.hasNext();
                        }

                        @Override
                        public V next() {
                            return this.c.next().getValue();
                        }

                        @Override
                        public void remove() {
                            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        }
                    };
                }
            };
        }
        Collection<? extends V> collection = this._values;
        y.g(collection);
        return collection;
    }

    @Override
    public int hashCode() {
        return ((Object)this.entrySet()).hashCode();
    }

    @Override
    public boolean isEmpty() {
        boolean bl = this.size() == 0;
        return bl;
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
        return t.B0(this.entrySet(), ", ", "{", "}", 0, null, new l<Map.Entry<? extends K, ? extends V>, CharSequence>(this){
            final d<K, V> g;
            {
                this.g = d4;
                super(1);
            }

            @Override
            public final CharSequence invoke(Map.Entry<? extends K, ? extends V> entry) {
                y.j(entry, (String)"it");
                return this.g.toString(entry);
            }
        }, 24, null);
    }
}


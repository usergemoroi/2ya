/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.util.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.e;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0011\u0012\b\b\u0002\u00103\u001a\u00020\u0019\u00a2\u0006\u0004\b4\u00105J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\t\u0010\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u000e2\u0014\u0010\u0014\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u000bJ\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002\u00a2\u0006\u0004\b\u001e\u0010\u0007J\u000f\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\b \u0010!R \u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u001bR&\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)0(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b-\u0010+R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010/8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b0\u00101\u00a8\u00066"}, d2={"Lio/ktor/util/collections/a;", "Key", "Value", "", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "Lkotlin/k0;", "clear", "()V", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "other", "equals", "", "toString", "()Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "delegate", "d", "size", "", "", "a", "()Ljava/util/Set;", "entries", "b", "keys", "", "e", "()Ljava/util/Collection;", "values", "initialCapacity", "<init>", "(I)V", "ktor-utils"}, k=1, mv={1, 8, 0})
public final class a<Key, Value>
implements Map<Key, Value>,
e {
    @NotNull
    private final ConcurrentHashMap<Key, Value> c;

    public a(int n4) {
        this.c = new ConcurrentHashMap(n4);
    }

    public /* synthetic */ a(int n4, int n5, p p4) {
        if ((n5 & 1) != 0) {
            n4 = 32;
        }
        this(n4);
    }

    @NotNull
    public Set<Map.Entry<Key, Value>> a() {
        Set<Map.Entry<Key, Value>> set = this.c.entrySet();
        y.i(set, (String)"delegate.entries");
        return set;
    }

    @NotNull
    public Set<Key> b() {
        Set set = this.c.keySet();
        y.i((Object)set, (String)"delegate.keys");
        return set;
    }

    @Override
    public void clear() {
        this.c.clear();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.c.containsKey(object);
    }

    @Override
    public boolean containsValue(Object object) {
        return this.c.containsValue(object);
    }

    public int d() {
        return this.c.size();
    }

    @NotNull
    public Collection<Value> e() {
        Collection<Value> collection = this.c.values();
        y.i(collection, (String)"delegate.values");
        return collection;
    }

    @Override
    public boolean equals(@Nullable Object object) {
        if (!(object instanceof Map)) {
            return false;
        }
        return y.e((Object)object, this.c);
    }

    @Override
    @Nullable
    public Value get(Object object) {
        return this.c.get(object);
    }

    @Override
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override
    @Nullable
    public Value put(Key Key2, Value Value) {
        return this.c.put(Key2, Value);
    }

    @Override
    public void putAll(@NotNull Map<? extends Key, ? extends Value> map2) {
        y.j(map2, (String)"from");
        this.c.putAll(map2);
    }

    @Override
    @Nullable
    public Value remove(Object object) {
        return this.c.remove(object);
    }

    @Override
    public boolean remove(Object object, Object object2) {
        return this.c.remove(object, object2);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ConcurrentMapJvm by ");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.markers.a
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.a
 *  kotlinx.serialization.descriptors.k
 *  kotlinx.serialization.descriptors.l
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.internal.i1;
import kotlinx.serialization.internal.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003:\u0001\u0017B#\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\u00a2\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0014\u00a2\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0006\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010\u00a8\u0006\u0018"}, d2={"Lkotlinx/serialization/internal/j1;", "K", "V", "Lkotlinx/serialization/internal/z0;", "", "key", "value", "j", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "h", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "i", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "a", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class j1<K, V>
extends z0<K, V, Map.Entry<? extends K, ? extends V>> {
    @NotNull
    private final SerialDescriptor c;

    public j1(@NotNull KSerializer<K> object, @NotNull KSerializer<V> kSerializer) {
        y.j(object, (String)"keySerializer");
        y.j(kSerializer, (String)"valueSerializer");
        super((KSerializer)object, kSerializer, null);
        m.c c4 = m.c.a;
        object = new i1((KSerializer)object, kSerializer);
        this.c = k.d((String)"kotlin.collections.Map.Entry", (kotlinx.serialization.descriptors.l)c4, (SerialDescriptor[])new SerialDescriptor[0], (l)object);
    }

    public static /* synthetic */ k0 f(KSerializer kSerializer, KSerializer kSerializer2, kotlinx.serialization.descriptors.a a4) {
        return j1.g(kSerializer, kSerializer2, a4);
    }

    private static final k0 g(KSerializer kSerializer, KSerializer kSerializer2, kotlinx.serialization.descriptors.a a4) {
        y.j((Object)a4, (String)"$this$buildSerialDescriptor");
        kotlinx.serialization.descriptors.a.b((kotlinx.serialization.descriptors.a)a4, (String)"key", (SerialDescriptor)kSerializer.getDescriptor(), null, (boolean)false, (int)12, null);
        kotlinx.serialization.descriptors.a.b((kotlinx.serialization.descriptors.a)a4, (String)"value", (SerialDescriptor)kSerializer2.getDescriptor(), null, (boolean)false, (int)12, null);
        return k0.a;
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.c;
    }

    protected K h(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        y.j(entry, (String)"<this>");
        return entry.getKey();
    }

    protected V i(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        y.j(entry, (String)"<this>");
        return entry.getValue();
    }

    @NotNull
    protected Map.Entry<K, V> j(K k4, V v3) {
        return new a<K, V>(k4, v3);
    }

    @Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u0013\u001a\u00028\u0002\u0012\u0006\u0010\u0016\u001a\u00028\u0003\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00d6\u0003\u00a2\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00028\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00028\u00038\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\u00a8\u0006\u0019"}, d2={"Lkotlinx/serialization/internal/j1$a;", "K", "V", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "d", "getValue", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
    private static final class a<K, V>
    implements Map.Entry<K, V>,
    kotlin.jvm.internal.markers.a {
        private final K c;
        private final V d;

        public a(K k4, V v3) {
            this.c = k4;
            this.d = v3;
        }

        @Override
        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof a)) {
                return false;
            }
            object = (a)object;
            if (!y.e(this.c, ((a)object).c)) {
                return false;
            }
            return y.e(this.d, ((a)object).d);
        }

        @Override
        public K getKey() {
            return this.c;
        }

        @Override
        public V getValue() {
            return this.d;
        }

        @Override
        public int hashCode() {
            Object object = this.c;
            int n4 = 0;
            int n5 = object == null ? 0 : object.hashCode();
            object = this.d;
            if (object != null) {
                n4 = object.hashCode();
            }
            return n5 * 31 + n4;
        }

        @Override
        public V setValue(V v3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MapEntry(key=");
            stringBuilder.append(this.c);
            stringBuilder.append(", value=");
            stringBuilder.append(this.d);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }
}


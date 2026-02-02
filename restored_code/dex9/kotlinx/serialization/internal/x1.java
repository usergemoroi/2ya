/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.t
 *  kotlin.z
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.a
 *  kotlinx.serialization.descriptors.k
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.t;
import kotlin.z;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.internal.w1;
import kotlinx.serialization.internal.z0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\u00a2\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0014\u00a2\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0006\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010\u00a8\u0006\u0017"}, d2={"Lkotlinx/serialization/internal/x1;", "K", "V", "Lkotlinx/serialization/internal/z0;", "Lkotlin/t;", "key", "value", "j", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/t;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "h", "(Lkotlin/t;)Ljava/lang/Object;", "i", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class x1<K, V>
extends z0<K, V, t<? extends K, ? extends V>> {
    @NotNull
    private final SerialDescriptor c;

    public x1(@NotNull KSerializer<K> object, @NotNull KSerializer<V> kSerializer) {
        y.j(object, (String)"keySerializer");
        y.j(kSerializer, (String)"valueSerializer");
        super((KSerializer)object, kSerializer, null);
        object = new w1((KSerializer)object, kSerializer);
        this.c = k.c((String)"kotlin.Pair", (SerialDescriptor[])new SerialDescriptor[0], (l)object);
    }

    public static /* synthetic */ k0 f(KSerializer kSerializer, KSerializer kSerializer2, a a4) {
        return x1.g(kSerializer, kSerializer2, a4);
    }

    private static final k0 g(KSerializer kSerializer, KSerializer kSerializer2, a a4) {
        y.j((Object)a4, (String)"$this$buildClassSerialDescriptor");
        a.b((a)a4, (String)"first", (SerialDescriptor)kSerializer.getDescriptor(), null, (boolean)false, (int)12, null);
        a.b((a)a4, (String)"second", (SerialDescriptor)kSerializer2.getDescriptor(), null, (boolean)false, (int)12, null);
        return k0.a;
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.c;
    }

    protected K h(@NotNull t<? extends K, ? extends V> t3) {
        y.j(t3, (String)"<this>");
        return (K)t3.c();
    }

    protected V i(@NotNull t<? extends K, ? extends V> t3) {
        y.j(t3, (String)"<this>");
        return (V)t3.d();
    }

    @NotNull
    protected t<K, V> j(K k4, V v3) {
        return z.a(k4, v3);
    }
}


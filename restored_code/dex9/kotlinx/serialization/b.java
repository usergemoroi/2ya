/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.j
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlinx.serialization.ExperimentalSerializationApi
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.a
 *  kotlinx.serialization.descriptors.b
 *  kotlinx.serialization.descriptors.k
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.internal.b2
 *  kotlinx.serialization.modules.c
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.collections.t;
import kotlin.j;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.reflect.KClass;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.modules.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0010\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\"\u00a2\u0006\u0004\b#\u0010$J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \u00a8\u0006%"}, d2={"Lkotlinx/serialization/b;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/modules/c;", "serializersModule", "c", "(Lkotlinx/serialization/modules/c;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/k0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "a", "Lkotlin/reflect/KClass;", "serializableClass", "b", "Lkotlinx/serialization/KSerializer;", "fallbackSerializer", "", "Ljava/util/List;", "typeArgumentsSerializers", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "d", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "<init>", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;[Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@ExperimentalSerializationApi
public final class b<T>
implements KSerializer<T> {
    @NotNull
    private final KClass<T> a;
    @Nullable
    private final KSerializer<T> b;
    @NotNull
    private final List<KSerializer<?>> c;
    @NotNull
    private final SerialDescriptor d;

    public b(@NotNull KClass<T> kClass, @Nullable KSerializer<T> object, @NotNull KSerializer<?>[] object2) {
        y.j(kClass, (String)"serializableClass");
        y.j(object2, (String)"typeArgumentsSerializers");
        this.a = kClass;
        this.b = object;
        this.c = l.e(object2);
        object = l.a.a;
        object2 = new a(this);
        this.d = kotlinx.serialization.descriptors.b.c((SerialDescriptor)k.d((String)"kotlinx.serialization.ContextualSerializer", object, (SerialDescriptor[])new SerialDescriptor[0], object2), kClass);
    }

    public static /* synthetic */ k0 a(b b4, kotlinx.serialization.descriptors.a a4) {
        return kotlinx.serialization.b.b(b4, a4);
    }

    private static final k0 b(b list, kotlinx.serialization.descriptors.a a4) {
        y.j((Object)a4, (String)"$this$buildSerialDescriptor");
        list = ((b)((Object)list)).b;
        list = list != null && (list = list.getDescriptor()) != null ? list.getAnnotations() : null;
        Object object = list;
        if (list == null) {
            object = t.m();
        }
        a4.h((List)object);
        return k0.a;
    }

    private final KSerializer<T> c(c object) {
        KSerializer kSerializer = object.b(this.a, this.c);
        object = kSerializer;
        if (kSerializer == null && (object = this.b) == null) {
            b2.f(this.a);
            throw new j();
        }
        return object;
    }

    @NotNull
    public T deserialize(@NotNull Decoder decoder) {
        y.j((Object)decoder, (String)"decoder");
        return (T)decoder.G(this.c(decoder.a()));
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.d;
    }

    public void serialize(@NotNull Encoder encoder, @NotNull T t3) {
        y.j((Object)encoder, (String)"encoder");
        y.j(t3, (String)"value");
        encoder.e(this.c(encoder.a()), t3);
    }
}


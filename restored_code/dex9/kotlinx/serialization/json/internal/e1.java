/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.c
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.modules.f
 *  kotlinx.serialization.modules.f$a
 *  kotlinx.serialization.o
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.y;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.c;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.d;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.modules.f;
import kotlinx.serialization.o;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020 \u00a2\u0006\u0004\b*\u0010+J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002\u00a2\u0006\u0004\b\t\u0010\bJX\u0010\u0014\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042/\u0010\u0013\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e\u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\rH\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015JM\u0010\u001a\u001a\u00020\u0006\"\b\b\u0000\u0010\u0016*\u00020\n\"\b\b\u0001\u0010\u0017*\u00028\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fH\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJR\u0010\u001f\u001a\u00020\u0006\"\b\b\u0000\u0010\u0016*\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042)\u0010\u001e\u001a%\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d0\rH\u0016\u00a2\u0006\u0004\b\u001f\u0010\u0015JT\u0010$\u001a\u00020\u0006\"\b\b\u0000\u0010\u0016*\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042+\u0010#\u001a'\u0012\u0015\u0012\u0013\u0018\u00010 \u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(!\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"0\rH\u0016\u00a2\u0006\u0004\b$\u0010\u0015R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b$\u0010&R\u0014\u0010)\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010(\u00a8\u0006,"}, d2={"Lkotlinx/serialization/json/internal/e1;", "Lkotlinx/serialization/modules/f;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/reflect/KClass;", "actualClass", "Lkotlin/k0;", "g", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/reflect/KClass;)V", "f", "", "T", "kClass", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "e", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/l;)V", "Base", "Sub", "baseClass", "actualSerializer", "c", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "value", "Lkotlinx/serialization/o;", "defaultSerializerProvider", "b", "", "className", "Lkotlinx/serialization/c;", "defaultDeserializerProvider", "a", "", "Z", "useArrayPolymorphism", "Ljava/lang/String;", "discriminator", "<init>", "(ZLjava/lang/String;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
public final class e1
implements f {
    private final boolean a;
    @NotNull
    private final String b;

    public e1(boolean bl, @NotNull String string) {
        y.j((Object)string, (String)"discriminator");
        this.a = bl;
        this.b = string;
    }

    private final void f(SerialDescriptor object, KClass<?> kClass) {
        int n4 = object.e();
        for (int i4 = 0; i4 < n4; ++i4) {
            String string = object.f(i4);
            if (!y.e((Object)string, (Object)this.b)) {
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Polymorphic serializer for ");
            ((StringBuilder)object).append(kClass);
            ((StringBuilder)object).append(" has property '");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
    }

    private final void g(SerialDescriptor serialDescriptor, KClass<?> kClass) {
        if (!((serialDescriptor = serialDescriptor.getKind()) instanceof d) && !y.e((Object)serialDescriptor, (Object)((Object)l.a.a))) {
            if (this.a) {
                return;
            }
            if (!(y.e((Object)serialDescriptor, (Object)((Object)m.b.a)) || y.e((Object)serialDescriptor, (Object)((Object)m.c.a)) || serialDescriptor instanceof e || serialDescriptor instanceof l.b)) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Serializer for ");
            stringBuilder.append(kClass.getSimpleName());
            stringBuilder.append(" of kind ");
            stringBuilder.append(serialDescriptor);
            stringBuilder.append(" cannot be serialized polymorphically with class discriminator.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Serializer for ");
        stringBuilder.append(kClass.getSimpleName());
        stringBuilder.append(" can't be registered as a subclass for polymorphic serialization because its kind ");
        stringBuilder.append(serialDescriptor);
        stringBuilder.append(" is not concrete. To work with multiple hierarchies, register it as a base class.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public <Base> void a(@NotNull KClass<Base> kClass, @NotNull l<? super String, ? extends c<? extends Base>> l4) {
        y.j(kClass, (String)"baseClass");
        y.j(l4, (String)"defaultDeserializerProvider");
    }

    public <Base> void b(@NotNull KClass<Base> kClass, @NotNull l<? super Base, ? extends o<? super Base>> l4) {
        y.j(kClass, (String)"baseClass");
        y.j(l4, (String)"defaultSerializerProvider");
    }

    public <Base, Sub extends Base> void c(@NotNull KClass<Base> serialDescriptor, @NotNull KClass<Sub> kClass, @NotNull KSerializer<Sub> kSerializer) {
        y.j(serialDescriptor, (String)"baseClass");
        y.j(kClass, (String)"actualClass");
        y.j(kSerializer, (String)"actualSerializer");
        serialDescriptor = kSerializer.getDescriptor();
        this.g(serialDescriptor, kClass);
        if (!this.a) {
            this.f(serialDescriptor, kClass);
        }
    }

    public <T> void d(@NotNull KClass<T> kClass, @NotNull KSerializer<T> kSerializer) {
        f.a.b((f)this, kClass, kSerializer);
    }

    public <T> void e(@NotNull KClass<T> kClass, @NotNull l<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> l4) {
        y.j(kClass, (String)"kClass");
        y.j(l4, (String)"provider");
    }
}


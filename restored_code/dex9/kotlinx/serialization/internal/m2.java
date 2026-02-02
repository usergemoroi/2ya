/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.encoding.d
 *  kotlinx.serialization.internal.k2
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.k2;
import kotlinx.serialization.internal.l2;
import kotlinx.serialization.internal.w;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-\u00a2\u0006\u0004\b/\u00100J\u0013\u0010\u0007\u001a\u00020\u0006*\u00028\u0002H\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00028\u0001*\u00028\u0002H\u0004\u00a2\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f*\u00028\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0004\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f*\u00028\u0001H\u0004\u00a2\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\f*\u00028\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00028\u0002H\u0004\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00028\u0001H$\u00a2\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\u0006H$\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u0001\u00a2\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00028\u00012\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\b%\u0010&R\u0017\u0010,\u001a\u00020'8\u0006\u00a2\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\u00a8\u00061"}, d2={"Lkotlinx/serialization/internal/m2;", "Element", "Array", "Lkotlinx/serialization/internal/k2;", "Builder", "Lkotlinx/serialization/internal/w;", "", "p", "(Lkotlinx/serialization/internal/k2;)I", "t", "(Lkotlinx/serialization/internal/k2;)Ljava/lang/Object;", "size", "Lkotlin/k0;", "q", "(Lkotlinx/serialization/internal/k2;I)V", "", "d", "(Ljava/lang/Object;)Ljava/util/Iterator;", "index", "element", "s", "(Lkotlinx/serialization/internal/k2;ILjava/lang/Object;)V", "o", "()Lkotlinx/serialization/internal/k2;", "r", "()Ljava/lang/Object;", "Lkotlinx/serialization/encoding/d;", "encoder", "content", "u", "(Lkotlinx/serialization/encoding/d;Ljava/lang/Object;I)V", "Lkotlinx/serialization/encoding/Encoder;", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/KSerializer;", "primitiveSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
@SourceDebugExtension(value={"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/PrimitiveArraySerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n*L\n1#1,283:1\n488#2,4:284\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/PrimitiveArraySerializer\n*L\n174#1:284,4\n*E\n"})
public abstract class m2<Element, Array, Builder extends k2<Array>>
extends w<Element, Array, Builder> {
    @NotNull
    private final SerialDescriptor b;

    public m2(@NotNull KSerializer<Element> kSerializer) {
        y.j(kSerializer, (String)"primitiveSerializer");
        super(kSerializer, null);
        this.b = new l2(kSerializer.getDescriptor());
    }

    @Override
    @NotNull
    protected final Iterator<Element> d(Array Array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override
    public final Array deserialize(@NotNull Decoder decoder) {
        y.j((Object)decoder, (String)"decoder");
        return this.f(decoder, null);
    }

    @Override
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @NotNull
    protected final Builder o() {
        return (Builder)((k2)this.k(this.r()));
    }

    protected final int p(@NotNull Builder Builder2) {
        y.j(Builder2, (String)"<this>");
        return Builder2.d();
    }

    protected final void q(@NotNull Builder Builder2, int n4) {
        y.j(Builder2, (String)"<this>");
        Builder2.b(n4);
    }

    protected abstract Array r();

    protected final void s(@NotNull Builder Builder2, int n4, Element Element) {
        y.j(Builder2, (String)"<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    @Override
    public final void serialize(@NotNull Encoder encoder, Array Array) {
        y.j((Object)encoder, (String)"encoder");
        int n4 = this.e(Array);
        SerialDescriptor serialDescriptor = this.b;
        encoder = encoder.z(serialDescriptor, n4);
        this.u((d)encoder, Array, n4);
        encoder.c(serialDescriptor);
    }

    protected final Array t(@NotNull Builder Builder2) {
        y.j(Builder2, (String)"<this>");
        return (Array)Builder2.a();
    }

    protected abstract void u(@NotNull d var1, Array var2, int var3);
}


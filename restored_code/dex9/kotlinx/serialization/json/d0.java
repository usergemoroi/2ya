/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.json.JsonElement
 *  kotlinx.serialization.json.internal.r1
 *  kotlinx.serialization.json.q
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.g;
import kotlinx.serialization.json.internal.r1;
import kotlinx.serialization.json.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001b"}, d2={"Lkotlinx/serialization/json/d0;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/k0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "element", "transformDeserialize", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;", "transformSerialize", "tSerializer", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
public abstract class d0<T>
implements KSerializer<T> {
    @NotNull
    private final KSerializer<T> tSerializer;

    public d0(@NotNull KSerializer<T> kSerializer) {
        y.j(kSerializer, (String)"tSerializer");
        this.tSerializer = kSerializer;
    }

    @NotNull
    public final T deserialize(@NotNull Decoder decoder) {
        y.j((Object)decoder, (String)"decoder");
        g g4 = q.d((Decoder)decoder);
        decoder = g4.t();
        return g4.d().d(this.tSerializer, this.transformDeserialize((JsonElement)decoder));
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull T t3) {
        y.j((Object)encoder, (String)"encoder");
        y.j(t3, (String)"value");
        encoder = q.e((Encoder)encoder);
        encoder.r(this.transformSerialize(r1.d((b)encoder.d(), t3, this.tSerializer)));
    }

    @NotNull
    protected JsonElement transformDeserialize(@NotNull JsonElement jsonElement) {
        y.j((Object)jsonElement, (String)"element");
        return jsonElement;
    }

    @NotNull
    protected JsonElement transformSerialize(@NotNull JsonElement jsonElement) {
        y.j((Object)jsonElement, (String)"element");
        return jsonElement;
    }
}


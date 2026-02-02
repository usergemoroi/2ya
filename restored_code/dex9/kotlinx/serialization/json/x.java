/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.k
 *  kotlinx.serialization.descriptors.l
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.json.q
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.j0;
import kotlinx.serialization.json.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c1\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2={"Lkotlinx/serialization/json/x;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/k0;", "b", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonNull;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class x
implements KSerializer<JsonNull> {
    @NotNull
    public static final x a = new x();
    @NotNull
    private static final SerialDescriptor b = k.e((String)"kotlinx.serialization.json.JsonNull", (l)l.b.a, (SerialDescriptor[])new SerialDescriptor[0], null, (int)8, null);

    private x() {
    }

    @NotNull
    public JsonNull a(@NotNull Decoder decoder) {
        y.j((Object)decoder, (String)"decoder");
        q.b((Decoder)decoder);
        if (!decoder.D()) {
            decoder.g();
            return JsonNull.INSTANCE;
        }
        throw new j0("Expected 'null' literal");
    }

    public void b(@NotNull Encoder encoder, @NotNull JsonNull jsonNull) {
        y.j((Object)encoder, (String)"encoder");
        y.j((Object)((Object)jsonNull), (String)"value");
        q.c((Encoder)encoder);
        encoder.B();
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return b;
    }
}


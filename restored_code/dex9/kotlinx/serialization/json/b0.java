/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.v0
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.k
 *  kotlinx.serialization.descriptors.l
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.json.internal.n0
 *  kotlinx.serialization.json.q
 *  kotlinx.serialization.o
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.n0;
import kotlinx.serialization.json.q;
import kotlinx.serialization.json.u;
import kotlinx.serialization.json.v;
import kotlinx.serialization.json.x;
import kotlinx.serialization.o;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c1\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2={"Lkotlinx/serialization/json/b0;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/k0;", "b", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonPrimitive;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class b0
implements KSerializer<JsonPrimitive> {
    @NotNull
    public static final b0 a = new b0();
    @NotNull
    private static final SerialDescriptor b = k.e((String)"kotlinx.serialization.json.JsonPrimitive", (l)e.i.a, (SerialDescriptor[])new SerialDescriptor[0], null, (int)8, null);

    private b0() {
    }

    @NotNull
    public JsonPrimitive a(@NotNull Decoder decoder) {
        y.j((Object)decoder, (String)"decoder");
        decoder = q.d((Decoder)decoder).t();
        if (decoder instanceof JsonPrimitive) {
            return (JsonPrimitive)decoder;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected JSON element, expected JsonPrimitive, had ");
        stringBuilder.append(v0.b(decoder.getClass()));
        throw n0.f((int)-1, (String)stringBuilder.toString(), (CharSequence)decoder.toString());
    }

    public void b(@NotNull Encoder encoder, @NotNull JsonPrimitive jsonPrimitive) {
        y.j((Object)encoder, (String)"encoder");
        y.j((Object)((Object)jsonPrimitive), (String)"value");
        q.c((Encoder)encoder);
        if (jsonPrimitive instanceof JsonNull) {
            encoder.e((o)x.a, (Object)JsonNull.INSTANCE);
        } else {
            encoder.e((o)v.a, (Object)((u)jsonPrimitive));
        }
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return b;
    }
}


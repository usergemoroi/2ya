/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.r
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.a
 *  kotlinx.serialization.descriptors.k
 *  kotlinx.serialization.descriptors.l
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.json.JsonElement
 *  kotlinx.serialization.json.q
 *  kotlinx.serialization.o
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.r;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.d;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.a0;
import kotlinx.serialization.json.b0;
import kotlinx.serialization.json.d;
import kotlinx.serialization.json.j;
import kotlinx.serialization.json.k;
import kotlinx.serialization.json.l;
import kotlinx.serialization.json.m;
import kotlinx.serialization.json.n;
import kotlinx.serialization.json.q;
import kotlinx.serialization.json.v;
import kotlinx.serialization.json.x;
import kotlinx.serialization.o;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c1\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0015"}, d2={"Lkotlinx/serialization/json/p;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/k0;", "n", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonElement;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "m", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class p
implements KSerializer<JsonElement> {
    @NotNull
    public static final p a = new p();
    @NotNull
    private static final SerialDescriptor b;

    static {
        d.b b4 = d.b.a;
        j j4 = new j();
        b = kotlinx.serialization.descriptors.k.d((String)"kotlinx.serialization.json.JsonElement", (kotlinx.serialization.descriptors.l)b4, (SerialDescriptor[])new SerialDescriptor[0], (kotlin.jvm.functions.l)j4);
    }

    private p() {
    }

    public static /* synthetic */ k0 a(kotlinx.serialization.descriptors.a a4) {
        return p.g(a4);
    }

    public static /* synthetic */ SerialDescriptor b() {
        return p.h();
    }

    public static /* synthetic */ SerialDescriptor c() {
        return p.i();
    }

    public static /* synthetic */ SerialDescriptor d() {
        return p.j();
    }

    public static /* synthetic */ SerialDescriptor e() {
        return p.k();
    }

    public static /* synthetic */ SerialDescriptor f() {
        return p.l();
    }

    private static final k0 g(kotlinx.serialization.descriptors.a a4) {
        y.j((Object)a4, (String)"$this$buildSerialDescriptor");
        kotlinx.serialization.descriptors.a.b((kotlinx.serialization.descriptors.a)a4, (String)"JsonPrimitive", (SerialDescriptor)q.a((a)new k()), null, (boolean)false, (int)12, null);
        kotlinx.serialization.descriptors.a.b((kotlinx.serialization.descriptors.a)a4, (String)"JsonNull", (SerialDescriptor)q.a((a)new l()), null, (boolean)false, (int)12, null);
        kotlinx.serialization.descriptors.a.b((kotlinx.serialization.descriptors.a)a4, (String)"JsonLiteral", (SerialDescriptor)q.a((a)new m()), null, (boolean)false, (int)12, null);
        kotlinx.serialization.descriptors.a.b((kotlinx.serialization.descriptors.a)a4, (String)"JsonObject", (SerialDescriptor)q.a((a)new n()), null, (boolean)false, (int)12, null);
        kotlinx.serialization.descriptors.a.b((kotlinx.serialization.descriptors.a)a4, (String)"JsonArray", (SerialDescriptor)q.a((a)new kotlinx.serialization.json.o()), null, (boolean)false, (int)12, null);
        return k0.a;
    }

    private static final SerialDescriptor h() {
        return b0.a.getDescriptor();
    }

    private static final SerialDescriptor i() {
        return x.a.getDescriptor();
    }

    private static final SerialDescriptor j() {
        return v.a.getDescriptor();
    }

    private static final SerialDescriptor k() {
        return a0.a.getDescriptor();
    }

    private static final SerialDescriptor l() {
        return d.a.getDescriptor();
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return b;
    }

    @NotNull
    public JsonElement m(@NotNull Decoder decoder) {
        y.j((Object)decoder, (String)"decoder");
        return q.d((Decoder)decoder).t();
    }

    public void n(@NotNull Encoder encoder, @NotNull JsonElement jsonElement) {
        block5: {
            block3: {
                block4: {
                    block2: {
                        y.j((Object)encoder, (String)"encoder");
                        y.j((Object)jsonElement, (String)"value");
                        q.c((Encoder)encoder);
                        if (!(jsonElement instanceof JsonPrimitive)) break block2;
                        encoder.e((o)b0.a, (Object)jsonElement);
                        break block3;
                    }
                    if (!(jsonElement instanceof JsonObject)) break block4;
                    encoder.e((o)a0.a, (Object)jsonElement);
                    break block3;
                }
                if (!(jsonElement instanceof JsonArray)) break block5;
                encoder.e((o)d.a, (Object)jsonElement);
            }
            return;
        }
        throw new r();
    }
}


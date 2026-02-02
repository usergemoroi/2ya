/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.e0
 *  kotlin.e0$a
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.v0
 *  kotlin.jvm.internal.y
 *  kotlin.text.e0
 *  kotlinx.serialization.builtins.a
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.k
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.json.JsonElement
 *  kotlinx.serialization.json.internal.n0
 *  kotlinx.serialization.json.q
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json;

import java.lang.constant.Constable;
import kotlin.Metadata;
import kotlin.e0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.a;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.n0;
import kotlinx.serialization.json.q;
import kotlinx.serialization.json.u;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c2\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2={"Lkotlinx/serialization/json/v;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/u;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/k0;", "b", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/u;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/u;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nJsonElementSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElementSerializers.kt\nkotlinx/serialization/json/JsonLiteralSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
final class v
implements KSerializer<u> {
    @NotNull
    public static final v a = new v();
    @NotNull
    private static final SerialDescriptor b = k.b((String)"kotlinx.serialization.json.JsonLiteral", (e)e.i.a);

    private v() {
    }

    @NotNull
    public u a(@NotNull Decoder object) {
        y.j((Object)object, (String)"decoder");
        JsonElement jsonElement = q.d((Decoder)object).t();
        if (jsonElement instanceof u) {
            return (u)jsonElement;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unexpected JSON element, expected JsonLiteral, had ");
        ((StringBuilder)object).append(v0.b(jsonElement.getClass()));
        throw n0.f((int)-1, (String)((StringBuilder)object).toString(), (CharSequence)jsonElement.toString());
    }

    public void b(@NotNull Encoder encoder, @NotNull u u3) {
        y.j((Object)encoder, (String)"encoder");
        y.j((Object)((Object)u3), (String)"value");
        q.c((Encoder)encoder);
        if (u3.f()) {
            encoder.v(u3.d());
            return;
        }
        if (u3.e() != null) {
            encoder.h(u3.e()).v(u3.d());
            return;
        }
        Constable constable = p.o(u3.d());
        if (constable != null) {
            encoder.A(((Number)((Object)constable)).longValue());
            return;
        }
        constable = kotlin.text.e0.h((String)u3.d());
        if (constable != null) {
            long l4 = constable.h();
            encoder.h(kotlinx.serialization.builtins.a.x((e0.a)e0.d).getDescriptor()).A(l4);
            return;
        }
        constable = p.j(u3.d());
        if (constable != null) {
            encoder.x(((Number)((Object)constable)).doubleValue());
            return;
        }
        constable = p.f1(u3.d());
        if (constable != null) {
            encoder.l(((Boolean)constable).booleanValue());
            return;
        }
        encoder.v(u3.d());
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return b;
    }
}


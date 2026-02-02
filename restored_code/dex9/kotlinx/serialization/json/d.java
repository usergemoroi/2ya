/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.ExperimentalSerializationApi
 *  kotlinx.serialization.builtins.a
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.l
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.json.q
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.y;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.p;
import kotlinx.serialization.json.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c1\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\t\b\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2={"Lkotlinx/serialization/json/d;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/k0;", "b", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonArray;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class d
implements KSerializer<JsonArray> {
    @NotNull
    public static final d a = new d();
    @NotNull
    private static final SerialDescriptor b = kotlinx.serialization.json.d$a.b;

    private d() {
    }

    @NotNull
    public JsonArray a(@NotNull Decoder decoder) {
        y.j((Object)decoder, (String)"decoder");
        q.b((Decoder)decoder);
        return new JsonArray((List)kotlinx.serialization.builtins.a.h((KSerializer)p.a).deserialize(decoder));
    }

    public void b(@NotNull Encoder encoder, @NotNull JsonArray jsonArray) {
        y.j((Object)encoder, (String)"encoder");
        y.j((Object)jsonArray, (String)"value");
        q.c((Encoder)encoder);
        kotlinx.serialization.builtins.a.h((KSerializer)p.a).serialize(encoder, jsonArray);
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return b;
    }

    @Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u00c2\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b'\u0010\u0017J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0097\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001\u00a2\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0018\u001a\u00020\u00048\u0016X\u0097D\u00a2\u0006\u0012\n\u0004\b\b\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00198\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00108VX\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00108VX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0014\u0010#\u001a\u00020\u00028\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b$\u0010%\u00a8\u0006("}, d2={"Lkotlinx/serialization/json/d$a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "", "g", "(I)Ljava/util/List;", "d", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "i", "(I)Z", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "getSerialName$annotations", "()V", "serialName", "Lkotlinx/serialization/descriptors/l;", "getKind", "()Lkotlinx/serialization/descriptors/l;", "kind", "b", "()Z", "isNullable", "isInline", "e", "()I", "elementsCount", "getAnnotations", "()Ljava/util/List;", "annotations", "<init>", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
    private static final class a
    implements SerialDescriptor {
        @NotNull
        public static final a b = new a();
        @NotNull
        private static final String c = "kotlinx.serialization.json.JsonArray";
        private final SerialDescriptor a = kotlinx.serialization.builtins.a.h((KSerializer)p.a).getDescriptor();

        private a() {
        }

        public boolean b() {
            return this.a.b();
        }

        @ExperimentalSerializationApi
        public int c(@NotNull String string) {
            y.j((Object)string, (String)"name");
            return this.a.c(string);
        }

        @ExperimentalSerializationApi
        @NotNull
        public SerialDescriptor d(int n4) {
            return this.a.d(n4);
        }

        public int e() {
            return this.a.e();
        }

        @ExperimentalSerializationApi
        @NotNull
        public String f(int n4) {
            return this.a.f(n4);
        }

        @ExperimentalSerializationApi
        @NotNull
        public List<Annotation> g(int n4) {
            return this.a.g(n4);
        }

        @NotNull
        public List<Annotation> getAnnotations() {
            return this.a.getAnnotations();
        }

        @NotNull
        public l getKind() {
            return this.a.getKind();
        }

        @NotNull
        public String h() {
            return c;
        }

        @ExperimentalSerializationApi
        public boolean i(int n4) {
            return this.a.i(n4);
        }

        public boolean isInline() {
            return this.a.isInline();
        }
    }
}


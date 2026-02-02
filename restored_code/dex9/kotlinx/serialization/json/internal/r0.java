/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.json.JsonElement
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.internal.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0016"}, d2={"Lkotlinx/serialization/json/internal/r0;", "Lkotlinx/serialization/json/internal/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "w", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "", "tag", "Lkotlinx/serialization/json/JsonElement;", "l0", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "g", "Lkotlinx/serialization/json/JsonElement;", "z0", "()Lkotlinx/serialization/json/JsonElement;", "value", "Lkotlinx/serialization/json/b;", "json", "polymorphicDiscriminator", "<init>", "(Lkotlinx/serialization/json/b;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonPrimitiveDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
final class r0
extends c {
    @NotNull
    private final JsonElement g;

    public r0(@NotNull b b4, @NotNull JsonElement jsonElement, @Nullable String string) {
        y.j((Object)b4, (String)"json");
        y.j((Object)jsonElement, (String)"value");
        super(b4, jsonElement, string, null);
        this.g = jsonElement;
        this.c0("primitive");
    }

    public /* synthetic */ r0(b b4, JsonElement jsonElement, String string, int n4, p p4) {
        if ((n4 & 4) != 0) {
            string = null;
        }
        this(b4, jsonElement, string);
    }

    @Override
    @NotNull
    protected JsonElement l0(@NotNull String string) {
        y.j((Object)string, (String)"tag");
        if (string == "primitive") {
            return this.z0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    public int w(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return 0;
    }

    @Override
    @NotNull
    public JsonElement z0() {
        return this.g;
    }
}


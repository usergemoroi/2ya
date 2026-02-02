/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.json.JsonElement
 *  kotlinx.serialization.o
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.json.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.internal.e;
import kotlinx.serialization.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001e\u00a2\u0006\u0004\b \u0010!J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJA\u0010\u0012\u001a\u00020\u0006\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00168\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\""}, d2={"Lkotlinx/serialization/json/internal/x0;", "Lkotlinx/serialization/json/internal/e;", "", "key", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlin/k0;", "w0", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "", "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "Lkotlinx/serialization/o;", "serializer", "value", "y", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/o;Ljava/lang/Object;)V", "s0", "()Lkotlinx/serialization/json/JsonElement;", "", "g", "Ljava/util/Map;", "x0", "()Ljava/util/Map;", "content", "Lkotlinx/serialization/json/b;", "json", "Lkotlin/Function1;", "nodeConsumer", "<init>", "(Lkotlinx/serialization/json/b;Lkotlin/jvm/functions/l;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
class x0
extends e {
    @NotNull
    private final Map<String, JsonElement> g;

    public x0(@NotNull b b4, @NotNull l<? super JsonElement, k0> l4) {
        y.j((Object)b4, (String)"json");
        y.j(l4, (String)"nodeConsumer");
        super(b4, l4, null);
        this.g = new LinkedHashMap<String, JsonElement>();
    }

    @Override
    @NotNull
    public JsonElement s0() {
        return new JsonObject(this.g);
    }

    @Override
    public void w0(@NotNull String string, @NotNull JsonElement jsonElement) {
        y.j((Object)string, (String)"key");
        y.j((Object)jsonElement, (String)"element");
        this.g.put(string, jsonElement);
    }

    @NotNull
    protected final Map<String, JsonElement> x0() {
        return this.g;
    }

    @Override
    public <T> void y(@NotNull SerialDescriptor serialDescriptor, int n4, @NotNull o<? super T> o4, @Nullable T t3) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        y.j(o4, (String)"serializer");
        if (t3 != null || this.d.j()) {
            super.y(serialDescriptor, n4, o4, t3);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.json.JsonElement
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u0018\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0011j\b\u0012\u0004\u0012\u00020\n`\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001c"}, d2={"Lkotlinx/serialization/json/internal/z0;", "Lkotlinx/serialization/json/internal/e;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "b0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "key", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlin/k0;", "w0", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "s0", "()Lkotlinx/serialization/json/JsonElement;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "g", "Ljava/util/ArrayList;", "array", "Lkotlinx/serialization/json/b;", "json", "Lkotlin/Function1;", "nodeConsumer", "<init>", "(Lkotlinx/serialization/json/b;Lkotlin/jvm/functions/l;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
final class z0
extends e {
    @NotNull
    private final ArrayList<JsonElement> g;

    public z0(@NotNull b b4, @NotNull l<? super JsonElement, k0> l4) {
        y.j((Object)b4, (String)"json");
        y.j(l4, (String)"nodeConsumer");
        super(b4, l4, null);
        this.g = new ArrayList();
    }

    @Override
    @NotNull
    protected String b0(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return String.valueOf(n4);
    }

    @Override
    @NotNull
    public JsonElement s0() {
        return new JsonArray(this.g);
    }

    @Override
    public void w0(@NotNull String string, @NotNull JsonElement jsonElement) {
        y.j((Object)string, (String)"key");
        y.j((Object)jsonElement, (String)"element");
        int n4 = Integer.parseInt(string);
        this.g.add(n4, jsonElement);
    }
}


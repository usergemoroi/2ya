/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.r
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.json.JsonElement
 *  kotlinx.serialization.json.internal.n0
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.r;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.a0;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;
import kotlinx.serialization.json.internal.n0;
import kotlinx.serialization.json.internal.x0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0014\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0018"}, d2={"Lkotlinx/serialization/json/internal/b1;", "Lkotlinx/serialization/json/internal/x0;", "", "key", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlin/k0;", "w0", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "s0", "()Lkotlinx/serialization/json/JsonElement;", "h", "Ljava/lang/String;", "tag", "", "i", "Z", "isKey", "Lkotlinx/serialization/json/b;", "json", "Lkotlin/Function1;", "nodeConsumer", "<init>", "(Lkotlinx/serialization/json/b;Lkotlin/jvm/functions/l;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
final class b1
extends x0 {
    private String h;
    private boolean i;

    public b1(@NotNull b b4, @NotNull l<? super JsonElement, k0> l4) {
        y.j((Object)b4, (String)"json");
        y.j(l4, (String)"nodeConsumer");
        super(b4, l4);
        this.i = true;
    }

    @Override
    @NotNull
    public JsonElement s0() {
        return new JsonObject(this.x0());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void w0(@NotNull String string, @NotNull JsonElement jsonElement) {
        String string2;
        y.j((Object)string, (String)"key");
        y.j((Object)jsonElement, (String)"element");
        if (this.i) {
            if (jsonElement instanceof JsonPrimitive) {
                this.h = ((JsonPrimitive)jsonElement).d();
                this.i = false;
                return;
            }
            if (jsonElement instanceof JsonObject) throw n0.d((SerialDescriptor)a0.a.getDescriptor());
            if (!(jsonElement instanceof JsonArray)) throw new r();
            throw n0.d((SerialDescriptor)kotlinx.serialization.json.d.a.getDescriptor());
        }
        Map<String, JsonElement> map2 = this.x0();
        string = string2 = this.h;
        if (string2 == null) {
            y.B((String)"tag");
            string = null;
        }
        map2.put(string, jsonElement);
        this.i = true;
    }
}


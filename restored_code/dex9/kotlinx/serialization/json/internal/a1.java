/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.json.JsonElement
 *  kotlinx.serialization.json.i
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json.internal;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.i;
import kotlinx.serialization.json.internal.w0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u00a2\u0006\u0004\b#\u0010$J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001f\u0010\u001d\u00a8\u0006%"}, d2={"Lkotlinx/serialization/json/internal/a1;", "Lkotlinx/serialization/json/internal/w0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "f0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "w", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "tag", "Lkotlinx/serialization/json/JsonElement;", "l0", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "Lkotlin/k0;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lkotlinx/serialization/json/JsonObject;", "k", "Lkotlinx/serialization/json/JsonObject;", "E0", "()Lkotlinx/serialization/json/JsonObject;", "value", "", "l", "Ljava/util/List;", "keys", "m", "I", "size", "n", "position", "Lkotlinx/serialization/json/b;", "json", "<init>", "(Lkotlinx/serialization/json/b;Lkotlinx/serialization/json/JsonObject;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
final class a1
extends w0 {
    @NotNull
    private final JsonObject k;
    @NotNull
    private final List<String> l;
    private final int m;
    private int n;

    public a1(@NotNull b object, @NotNull JsonObject jsonObject) {
        y.j((Object)object, (String)"json");
        y.j((Object)jsonObject, (String)"value");
        super((b)object, jsonObject, null, null, 12, null);
        this.k = jsonObject;
        this.l = object = t.e1(this.E0().keySet());
        this.m = object.size() * 2;
        this.n = -1;
    }

    @Override
    @NotNull
    public JsonObject E0() {
        return this.k;
    }

    @Override
    public void c(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
    }

    @Override
    @NotNull
    protected String f0(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.l.get(n4 /= 2);
    }

    @Override
    @NotNull
    protected JsonElement l0(@NotNull String object) {
        y.j((Object)object, (String)"tag");
        object = this.n % 2 == 0 ? i.c((String)object) : (JsonElement)s0.k((Map)this.E0(), object);
        return object;
    }

    @Override
    public int w(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        int n4 = this.n;
        if (n4 < this.m - 1) {
            this.n = ++n4;
            return n4;
        }
        return -1;
    }
}


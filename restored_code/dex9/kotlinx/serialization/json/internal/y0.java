/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.json.JsonElement
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.internal.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0016\u00a8\u0006\u001e"}, d2={"Lkotlinx/serialization/json/internal/y0;", "Lkotlinx/serialization/json/internal/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "f0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "tag", "Lkotlinx/serialization/json/JsonElement;", "l0", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "w", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "Lkotlinx/serialization/json/JsonArray;", "g", "Lkotlinx/serialization/json/JsonArray;", "C0", "()Lkotlinx/serialization/json/JsonArray;", "value", "h", "I", "size", "i", "currentIndex", "Lkotlinx/serialization/json/b;", "json", "<init>", "(Lkotlinx/serialization/json/b;Lkotlinx/serialization/json/JsonArray;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
final class y0
extends c {
    @NotNull
    private final JsonArray g;
    private final int h;
    private int i;

    public y0(@NotNull b b4, @NotNull JsonArray jsonArray) {
        y.j((Object)b4, (String)"json");
        y.j((Object)jsonArray, (String)"value");
        super(b4, jsonArray, null, 4, null);
        this.g = jsonArray;
        this.h = this.C0().size();
        this.i = -1;
    }

    @NotNull
    public JsonArray C0() {
        return this.g;
    }

    @Override
    @NotNull
    protected String f0(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return String.valueOf(n4);
    }

    @Override
    @NotNull
    protected JsonElement l0(@NotNull String string) {
        y.j((Object)string, (String)"tag");
        return this.C0().d(Integer.parseInt(string));
    }

    public int w(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        int n4 = this.i;
        if (n4 < this.h - 1) {
            this.i = ++n4;
            return n4;
        }
        return -1;
    }
}


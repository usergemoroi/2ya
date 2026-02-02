/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.p
 *  kotlinx.serialization.Serializable
 *  kotlinx.serialization.json.JsonElement
 *  kotlinx.serialization.json.JsonPrimitive$Companion
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.b0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004\u0082\u0001\u0002\n\u000b\u00a8\u0006\f"}, d2={"Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/json/JsonElement;", "", "toString", "()Ljava/lang/String;", "d", "content", "<init>", "()V", "Companion", "Lkotlinx/serialization/json/u;", "Lkotlinx/serialization/json/JsonNull;", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@Serializable(with=b0.class)
public abstract class JsonPrimitive
extends JsonElement {
    @NotNull
    public static final Companion Companion = new /* Unavailable Anonymous Inner Class!! */;

    private JsonPrimitive() {
        super(null);
    }

    public /* synthetic */ JsonPrimitive(p p4) {
        this();
    }

    @NotNull
    public abstract String d();

    @NotNull
    public String toString() {
        return this.d();
    }
}


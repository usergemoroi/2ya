/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlinx.serialization.Serializable
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.x;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2={"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "content", "<init>", "()V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@Serializable(with=x.class)
public final class JsonNull
extends JsonPrimitive {
    @NotNull
    public static final JsonNull INSTANCE = new JsonNull();
    @NotNull
    private static final String c = "null";

    private JsonNull() {
        super(null);
    }

    @Override
    @NotNull
    public String d() {
        return c;
    }

    @NotNull
    public final KSerializer<JsonNull> serializer() {
        return x.a;
    }
}


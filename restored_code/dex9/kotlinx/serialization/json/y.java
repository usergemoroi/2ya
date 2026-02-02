/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.json;

import java.util.Map;
import kotlin.jvm.functions.l;
import kotlinx.serialization.json.JsonObject;

public final class y
implements l {
    public final Object invoke(Object object) {
        return JsonObject.a((Map.Entry)object);
    }
}


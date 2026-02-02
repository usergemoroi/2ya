/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.encoding.d
 *  kotlinx.serialization.json.JsonElement
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2={"Lkotlinx/serialization/json/r;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/d;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlin/k0;", "r", "(Lkotlinx/serialization/json/JsonElement;)V", "Lkotlinx/serialization/json/b;", "d", "()Lkotlinx/serialization/json/b;", "json", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
public interface r
extends Encoder,
d {
    @NotNull
    public b d();

    public void r(@NotNull JsonElement var1);
}


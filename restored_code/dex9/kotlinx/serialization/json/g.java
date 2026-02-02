/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.c
 *  kotlinx.serialization.json.JsonElement
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2={"Lkotlinx/serialization/json/g;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/c;", "Lkotlinx/serialization/json/JsonElement;", "t", "()Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/json/b;", "d", "()Lkotlinx/serialization/json/b;", "json", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
public interface g
extends Decoder,
c {
    @NotNull
    public b d();

    @NotNull
    public JsonElement t();
}


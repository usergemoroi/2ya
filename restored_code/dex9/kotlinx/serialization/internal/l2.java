/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.e1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2={"Lkotlinx/serialization/internal/l2;", "Lkotlinx/serialization/internal/e1;", "", "c", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "serialName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "primitive", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
public final class l2
extends e1 {
    @NotNull
    private final String c;

    public l2(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"primitive");
        super(serialDescriptor, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(serialDescriptor.h());
        stringBuilder.append("Array");
        this.c = stringBuilder.toString();
    }

    @NotNull
    public String h() {
        return this.c;
    }
}


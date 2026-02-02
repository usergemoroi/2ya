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

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\n"}, d2={"Lkotlinx/serialization/internal/q0;", "Lkotlinx/serialization/internal/e1;", "", "h", "()Ljava/lang/String;", "serialName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDesc", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
public final class q0
extends e1 {
    public q0(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"elementDesc");
        super(serialDescriptor, null);
    }

    @NotNull
    public String h() {
        return "kotlin.collections.HashSet";
    }
}


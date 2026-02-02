/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlinx.serialization.c
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.o
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization;

import kotlin.Metadata;
import kotlinx.serialization.c;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.o;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2={"Lkotlinx/serialization/KSerializer;", "T", "Lkotlinx/serialization/o;", "Lkotlinx/serialization/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
public interface KSerializer<T>
extends o<T>,
c<T> {
    @NotNull
    public SerialDescriptor getDescriptor();
}


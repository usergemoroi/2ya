/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlinx.serialization.c
 *  kotlinx.serialization.m
 *  kotlinx.serialization.o
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization;

import kotlin.Metadata;
import kotlinx.serialization.c;
import kotlinx.serialization.m;
import kotlinx.serialization.o;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00020\u0006H&\u00a2\u0006\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2={"Lkotlinx/serialization/a0;", "Lkotlinx/serialization/m;", "T", "Lkotlinx/serialization/o;", "serializer", "value", "", "b", "(Lkotlinx/serialization/o;Ljava/lang/Object;)Ljava/lang/String;", "Lkotlinx/serialization/c;", "deserializer", "string", "c", "(Lkotlinx/serialization/c;Ljava/lang/String;)Ljava/lang/Object;", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
public interface a0
extends m {
    @NotNull
    public <T> String b(@NotNull o<? super T> var1, T var2);

    public <T> T c(@NotNull c<? extends T> var1, @NotNull String var2);
}


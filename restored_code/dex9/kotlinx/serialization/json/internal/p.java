/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.json.internal.o
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlinx.serialization.json.internal.o;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2={"Lkotlinx/serialization/json/internal/p;", "Lkotlinx/serialization/json/internal/o;", "", "d", "()[C", "array", "Lkotlin/k0;", "c", "([C)V", "<init>", "()V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nArrayPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayPools.kt\nkotlinx/serialization/json/internal/CharArrayPoolBatchSize\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class p
extends o {
    @NotNull
    public static final p c = new p();

    private p() {
    }

    public final void c(@NotNull char[] cArray) {
        y.j((Object)cArray, (String)"array");
        if (cArray.length == 16384) {
            this.a(cArray);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Inconsistent internal invariant: unexpected array size ");
        stringBuilder.append(cArray.length);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    @NotNull
    public final char[] d() {
        return super.b(16384);
    }
}


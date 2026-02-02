/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.text;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.text.t;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2={"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "i", "(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/text/StringsKt")
@SourceDebugExtension(value={"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n1#2:422\n*E\n"})
class u
extends t {
    @SinceKotlin(version="1.3")
    @NotNull
    public static StringBuilder i(@NotNull StringBuilder stringBuilder) {
        y.j((Object)stringBuilder, (String)"<this>");
        stringBuilder.setLength(0);
        return stringBuilder;
    }
}


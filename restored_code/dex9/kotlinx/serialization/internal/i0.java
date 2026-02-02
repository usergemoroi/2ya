/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.m
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.n
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.m;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.g0;
import kotlinx.serialization.internal.h0;
import kotlinx.serialization.internal.h2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u000e\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\u00a2\u0006\u0004\b \u0010!B'\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u00a2\u0006\u0004\b \u0010\"J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u00068VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006#"}, d2={"Lkotlinx/serialization/internal/i0;", "", "T", "Lkotlinx/serialization/KSerializer;", "", "serialName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "(Ljava/lang/String;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/k0;", "e", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "d", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "toString", "()Ljava/lang/String;", "", "a", "[Ljava/lang/Enum;", "values", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "overriddenDescriptor", "c", "Lkotlin/m;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "(Ljava/lang/String;[Ljava/lang/Enum;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
@SourceDebugExtension(value={"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,148:1\n13409#2,2:149\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumSerializer\n*L\n120#1:149,2\n*E\n"})
public final class i0<T extends Enum<T>>
implements KSerializer<T> {
    @NotNull
    private final T[] a;
    @Nullable
    private SerialDescriptor b;
    @NotNull
    private final m c;

    public i0(@NotNull String string, @NotNull T[] TArray) {
        y.j((Object)string, (String)"serialName");
        y.j(TArray, (String)"values");
        this.a = TArray;
        this.c = n.b(new h0(this, string));
    }

    public i0(@NotNull String string, @NotNull T[] TArray, @NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)string, (String)"serialName");
        y.j(TArray, (String)"values");
        y.j((Object)serialDescriptor, (String)"descriptor");
        this(string, (Enum[])TArray);
        this.b = serialDescriptor;
    }

    public static /* synthetic */ SerialDescriptor a(i0 i02, String string) {
        return i0.c(i02, string);
    }

    private final SerialDescriptor b(String object) {
        object = new g0((String)object, this.a.length);
        T[] TArray = this.a;
        int n4 = TArray.length;
        for (int i4 = 0; i4 < n4; ++i4) {
            h2.p((h2)object, ((Enum)TArray[i4]).name(), false, 2, null);
        }
        return object;
    }

    private static final SerialDescriptor c(i0 i02, String string) {
        SerialDescriptor serialDescriptor;
        SerialDescriptor serialDescriptor2 = serialDescriptor = i02.b;
        if (serialDescriptor == null) {
            serialDescriptor2 = i02.b(string);
        }
        return serialDescriptor2;
    }

    @NotNull
    public T d(@NotNull Decoder object) {
        y.j((Object)object, (String)"decoder");
        int n4 = object.s(this.getDescriptor());
        if (n4 >= 0 && n4 < ((T[])(object = this.a)).length) {
            return (T)object[n4];
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(" is not among valid ");
        ((StringBuilder)object).append(this.getDescriptor().h());
        ((StringBuilder)object).append(" enum values, values size is ");
        ((StringBuilder)object).append(this.a.length);
        throw new kotlinx.serialization.n(((StringBuilder)object).toString());
    }

    public void e(@NotNull Encoder object, @NotNull T object2) {
        y.j((Object)object, (String)"encoder");
        y.j(object2, (String)"value");
        int n4 = l.x0((Object[])this.a, object2);
        if (n4 != -1) {
            object.g(this.getDescriptor(), n4);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(object2);
        ((StringBuilder)object).append(" is not a valid enum ");
        ((StringBuilder)object).append(this.getDescriptor().h());
        ((StringBuilder)object).append(", must be one of ");
        object2 = Arrays.toString(this.a);
        y.i(object2, (String)"toString(...)");
        ((StringBuilder)object).append((String)object2);
        throw new kotlinx.serialization.n(((StringBuilder)object).toString());
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.c.getValue();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("kotlinx.serialization.internal.EnumSerializer<");
        stringBuilder.append(this.getDescriptor().h());
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}


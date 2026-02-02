/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Timestamp
 *  kotlin.jvm.functions.l
 */
package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.TimestampsKt;
import gatewayprotocol.v1.TimestampsOuterClass;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\b\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\n\"\u0017\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0010"}, d2={"Lkotlin/Function1;", "Lgatewayprotocol/v1/TimestampsKt$Dsl;", "Lkotlin/k0;", "Lkotlin/ExtensionFunctionType;", "block", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "-initializetimestamps", "(Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "timestamps", "copy", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "Lgatewayprotocol/v1/TimestampsOuterClass$TimestampsOrBuilder;", "Lcom/google/protobuf/Timestamp;", "getTimestampOrNull", "(Lgatewayprotocol/v1/TimestampsOuterClass$TimestampsOrBuilder;)Lcom/google/protobuf/Timestamp;", "timestampOrNull", "unity-ads_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nTimestampsKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimestampsKt.kt\ngatewayprotocol/v1/TimestampsKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
public final class TimestampsKtKt {
    @JvmName(name="-initializetimestamps")
    @NotNull
    public static final TimestampsOuterClass.Timestamps -initializetimestamps(@NotNull l<? super TimestampsKt.Dsl, k0> l10) {
        y.j(l10, "block");
        TimestampsKt.Dsl.Companion companion = TimestampsKt.Dsl.Companion;
        Object object = TimestampsOuterClass.Timestamps.newBuilder();
        y.i(object, "newBuilder()");
        object = companion._create((TimestampsOuterClass.Timestamps.Builder)object);
        l10.invoke(object);
        return ((TimestampsKt.Dsl)object)._build();
    }

    @NotNull
    public static final TimestampsOuterClass.Timestamps copy(@NotNull TimestampsOuterClass.Timestamps object, @NotNull l<? super TimestampsKt.Dsl, k0> l10) {
        y.j(object, "<this>");
        y.j(l10, "block");
        TimestampsKt.Dsl.Companion companion = TimestampsKt.Dsl.Companion;
        object = object.toBuilder();
        y.i(object, "this.toBuilder()");
        object = companion._create((TimestampsOuterClass.Timestamps.Builder)object);
        l10.invoke(object);
        return ((TimestampsKt.Dsl)object)._build();
    }

    @Nullable
    public static final Timestamp getTimestampOrNull(@NotNull TimestampsOuterClass.TimestampsOrBuilder timestampsOrBuilder) {
        y.j(timestampsOrBuilder, "<this>");
        timestampsOrBuilder = timestampsOrBuilder.hasTimestamp() ? timestampsOrBuilder.getTimestamp() : null;
        return timestampsOrBuilder;
    }
}


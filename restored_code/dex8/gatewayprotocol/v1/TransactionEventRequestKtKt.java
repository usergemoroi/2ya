/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.l
 */
package gatewayprotocol.v1;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TransactionEventRequestKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
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
@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\b\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\n\"\u0017\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0014"}, d2={"Lkotlin/Function1;", "Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl;", "Lkotlin/k0;", "Lkotlin/ExtensionFunctionType;", "block", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "-initializetransactionEventRequest", "(Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "transactionEventRequest", "copy", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfoOrNull", "unity-ads_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nTransactionEventRequestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionEventRequestKt.kt\ngatewayprotocol/v1/TransactionEventRequestKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
public final class TransactionEventRequestKtKt {
    @JvmName(name="-initializetransactionEventRequest")
    @NotNull
    public static final TransactionEventRequestOuterClass.TransactionEventRequest -initializetransactionEventRequest(@NotNull l<? super TransactionEventRequestKt.Dsl, k0> l10) {
        y.j(l10, "block");
        TransactionEventRequestKt.Dsl.Companion companion = TransactionEventRequestKt.Dsl.Companion;
        Object object = TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder();
        y.i(object, "newBuilder()");
        object = companion._create((TransactionEventRequestOuterClass.TransactionEventRequest.Builder)object);
        l10.invoke(object);
        return ((TransactionEventRequestKt.Dsl)object)._build();
    }

    @NotNull
    public static final TransactionEventRequestOuterClass.TransactionEventRequest copy(@NotNull TransactionEventRequestOuterClass.TransactionEventRequest object, @NotNull l<? super TransactionEventRequestKt.Dsl, k0> l10) {
        y.j(object, "<this>");
        y.j(l10, "block");
        TransactionEventRequestKt.Dsl.Companion companion = TransactionEventRequestKt.Dsl.Companion;
        object = object.toBuilder();
        y.i(object, "this.toBuilder()");
        object = companion._create((TransactionEventRequestOuterClass.TransactionEventRequest.Builder)object);
        l10.invoke(object);
        return ((TransactionEventRequestKt.Dsl)object)._build();
    }

    @Nullable
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(@NotNull TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasDynamicDeviceInfo() ? object.getDynamicDeviceInfo() : null;
        return object;
    }

    @Nullable
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(@NotNull TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasStaticDeviceInfo() ? object.getStaticDeviceInfo() : null;
        return object;
    }
}


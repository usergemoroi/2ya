/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gatewayprotocol.v1.OperativeEventRequestKt$Dsl$Companion
 *  kotlin.jvm.functions.l
 */
package gatewayprotocol.v1;

import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.OperativeEventRequestKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
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
@Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\b\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\n\"\u0017\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u0014*\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u0018*\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001c"}, d2={"Lkotlin/Function1;", "Lgatewayprotocol/v1/OperativeEventRequestKt$Dsl;", "Lkotlin/k0;", "Lkotlin/ExtensionFunctionType;", "block", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "-initializeoperativeEventRequest", "(Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "operativeEventRequest", "copy", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCountersOrNull", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "sessionCountersOrNull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfoOrNull", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "getCampaignStateOrNull", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;)Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "campaignStateOrNull", "unity-ads_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nOperativeEventRequestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperativeEventRequestKt.kt\ngatewayprotocol/v1/OperativeEventRequestKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n1#2:399\n*E\n"})
public final class OperativeEventRequestKtKt {
    @JvmName(name="-initializeoperativeEventRequest")
    @NotNull
    public static final OperativeEventRequestOuterClass.OperativeEventRequest -initializeoperativeEventRequest(@NotNull l<? super OperativeEventRequestKt.Dsl, k0> l10) {
        y.j(l10, "block");
        OperativeEventRequestKt.Dsl.Companion companion = OperativeEventRequestKt.Dsl.Companion;
        Object object = OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder();
        y.i(object, "newBuilder()");
        object = companion._create((OperativeEventRequestOuterClass.OperativeEventRequest.Builder)object);
        l10.invoke(object);
        return ((OperativeEventRequestKt.Dsl)object)._build();
    }

    @NotNull
    public static final OperativeEventRequestOuterClass.OperativeEventRequest copy(@NotNull OperativeEventRequestOuterClass.OperativeEventRequest object, @NotNull l<? super OperativeEventRequestKt.Dsl, k0> l10) {
        y.j(object, "<this>");
        y.j(l10, "block");
        OperativeEventRequestKt.Dsl.Companion companion = OperativeEventRequestKt.Dsl.Companion;
        object = object.toBuilder();
        y.i(object, "this.toBuilder()");
        object = companion._create((OperativeEventRequestOuterClass.OperativeEventRequest.Builder)object);
        l10.invoke(object);
        return ((OperativeEventRequestKt.Dsl)object)._build();
    }

    @Nullable
    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(@NotNull OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasCampaignState() ? object.getCampaignState() : null;
        return object;
    }

    @Nullable
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(@NotNull OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasDynamicDeviceInfo() ? object.getDynamicDeviceInfo() : null;
        return object;
    }

    @Nullable
    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(@NotNull OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasSessionCounters() ? object.getSessionCounters() : null;
        return object;
    }

    @Nullable
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(@NotNull OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasStaticDeviceInfo() ? object.getStaticDeviceInfo() : null;
        return object;
    }
}


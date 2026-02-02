/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Timestamp
 *  kotlin.jvm.functions.l
 */
package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
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
@Metadata(d1={"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a,\u0010\b\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\n\u001a0\u0010\t\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\r\u001a0\u0010\t\u001a\u00020\u000e*\u00020\u000e2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\u0010\"\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u0012*\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u0016*\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001a*\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0017\u0010!\u001a\u0004\u0018\u00010\u001e*\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0017\u0010%\u001a\u0004\u0018\u00010\"*\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b#\u0010$\"\u0017\u0010'\u001a\u0004\u0018\u00010\"*\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b&\u0010$\"\u0017\u0010+\u001a\u0004\u0018\u00010(*\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b)\u0010*\"\u0017\u00100\u001a\u0004\u0018\u00010-*\u00020,8F\u00a2\u0006\u0006\u001a\u0004\b.\u0010/\"\u0017\u00104\u001a\u0004\u0018\u000101*\u00020,8F\u00a2\u0006\u0006\u001a\u0004\b2\u00103\"\u0017\u00108\u001a\u0004\u0018\u000105*\u00020,8F\u00a2\u0006\u0006\u001a\u0004\b6\u00107\"\u0017\u0010<\u001a\u0004\u0018\u000109*\u00020,8F\u00a2\u0006\u0006\u001a\u0004\b:\u0010;\"\u0017\u0010@\u001a\u0004\u0018\u00010=*\u00020,8F\u00a2\u0006\u0006\u001a\u0004\b>\u0010?\"\u0017\u0010D\u001a\u0004\u0018\u00010A*\u00020,8F\u00a2\u0006\u0006\u001a\u0004\bB\u0010C\"\u0017\u0010H\u001a\u0004\u0018\u00010E*\u00020,8F\u00a2\u0006\u0006\u001a\u0004\bF\u0010G\"\u0017\u0010L\u001a\u0004\u0018\u00010I*\u00020,8F\u00a2\u0006\u0006\u001a\u0004\bJ\u0010K\"\u0017\u0010P\u001a\u0004\u0018\u00010M*\u00020,8F\u00a2\u0006\u0006\u001a\u0004\bN\u0010O\"\u0017\u0010T\u001a\u0004\u0018\u00010Q*\u00020,8F\u00a2\u0006\u0006\u001a\u0004\bR\u0010S\"\u0017\u0010X\u001a\u0004\u0018\u00010\u000b*\u00020U8F\u00a2\u0006\u0006\u001a\u0004\bV\u0010W\"\u0017\u0010[\u001a\u0004\u0018\u00010\u000e*\u00020U8F\u00a2\u0006\u0006\u001a\u0004\bY\u0010Z\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\\"}, d2={"Lkotlin/Function1;", "Lgatewayprotocol/v1/UniversalRequestKt$Dsl;", "Lkotlin/k0;", "Lkotlin/ExtensionFunctionType;", "block", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "-initializeuniversalRequest", "(Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "universalRequest", "copy", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl;", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "getTimestampsOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "timestampsOrNull", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "getPiiOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/PiiOuterClass$Pii;", "piiOrNull", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "getDeveloperConsentOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "developerConsentOrNull", "Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "getTestDataOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "testDataOrNull", "Lcom/google/protobuf/Timestamp;", "getAppStartTimeOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lcom/google/protobuf/Timestamp;", "appStartTimeOrNull", "getSdkStartTimeOrNull", "sdkStartTimeOrNull", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "getLimitedSessionTokenOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "limitedSessionTokenOrNull", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "getInitializationRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "initializationRequestOrNull", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "getAdRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "adRequestOrNull", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "getOperativeEventOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "operativeEventOrNull", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "getDiagnosticEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "diagnosticEventRequestOrNull", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "getAdPlayerConfigRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "adPlayerConfigRequestOrNull", "Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "getGetTokenEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "getTokenEventRequestOrNull", "Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "getPrivacyUpdateRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "privacyUpdateRequestOrNull", "Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "getAdDataRefreshRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "adDataRefreshRequestOrNull", "Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "getInitializationCompletedEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "initializationCompletedEventRequestOrNull", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "getTransactionEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "transactionEventRequestOrNull", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequestOrBuilder;", "getSharedDataOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequestOrBuilder;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "sharedDataOrNull", "getPayloadOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequestOrBuilder;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "payloadOrNull", "unity-ads_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nUniversalRequestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UniversalRequestKt.kt\ngatewayprotocol/v1/UniversalRequestKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,939:1\n1#2:940\n*E\n"})
public final class UniversalRequestKtKt {
    @JvmName(name="-initializeuniversalRequest")
    @NotNull
    public static final UniversalRequestOuterClass.UniversalRequest -initializeuniversalRequest(@NotNull l<? super UniversalRequestKt.Dsl, k0> l10) {
        y.j(l10, "block");
        Object object = UniversalRequestKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Builder builder = UniversalRequestOuterClass.UniversalRequest.newBuilder();
        y.i(builder, "newBuilder()");
        object = ((UniversalRequestKt.Dsl.Companion)object)._create(builder);
        l10.invoke(object);
        return ((UniversalRequestKt.Dsl)object)._build();
    }

    @NotNull
    public static final UniversalRequestOuterClass.UniversalRequest.Payload copy(@NotNull UniversalRequestOuterClass.UniversalRequest.Payload object, @NotNull l<? super UniversalRequestKt.PayloadKt.Dsl, k0> l10) {
        y.j(object, "<this>");
        y.j(l10, "block");
        UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.Companion;
        object = object.toBuilder();
        y.i(object, "this.toBuilder()");
        object = companion._create((UniversalRequestOuterClass.UniversalRequest.Payload.Builder)object);
        l10.invoke(object);
        return ((UniversalRequestKt.PayloadKt.Dsl)object)._build();
    }

    @NotNull
    public static final UniversalRequestOuterClass.UniversalRequest.SharedData copy(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedData object, @NotNull l<? super UniversalRequestKt.SharedDataKt.Dsl, k0> l10) {
        y.j(object, "<this>");
        y.j(l10, "block");
        UniversalRequestKt.SharedDataKt.Dsl.Companion companion = UniversalRequestKt.SharedDataKt.Dsl.Companion;
        object = object.toBuilder();
        y.i(object, "this.toBuilder()");
        object = companion._create((UniversalRequestOuterClass.UniversalRequest.SharedData.Builder)object);
        l10.invoke(object);
        return ((UniversalRequestKt.SharedDataKt.Dsl)object)._build();
    }

    @NotNull
    public static final UniversalRequestOuterClass.UniversalRequest copy(@NotNull UniversalRequestOuterClass.UniversalRequest object, @NotNull l<? super UniversalRequestKt.Dsl, k0> l10) {
        y.j(object, "<this>");
        y.j(l10, "block");
        UniversalRequestKt.Dsl.Companion companion = UniversalRequestKt.Dsl.Companion;
        object = object.toBuilder();
        y.i(object, "this.toBuilder()");
        object = companion._create((UniversalRequestOuterClass.UniversalRequest.Builder)object);
        l10.invoke(object);
        return ((UniversalRequestKt.Dsl)object)._build();
    }

    @Nullable
    public static final AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasAdDataRefreshRequest() ? object.getAdDataRefreshRequest() : null;
        return object;
    }

    @Nullable
    public static final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasAdPlayerConfigRequest() ? object.getAdPlayerConfigRequest() : null;
        return object;
    }

    @Nullable
    public static final AdRequestOuterClass.AdRequest getAdRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasAdRequest() ? object.getAdRequest() : null;
        return object;
    }

    @Nullable
    public static final Timestamp getAppStartTimeOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        y.j(sharedDataOrBuilder, "<this>");
        sharedDataOrBuilder = sharedDataOrBuilder.hasAppStartTime() ? sharedDataOrBuilder.getAppStartTime() : null;
        return sharedDataOrBuilder;
    }

    @Nullable
    public static final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsentOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasDeveloperConsent() ? object.getDeveloperConsent() : null;
        return object;
    }

    @Nullable
    public static final DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasDiagnosticEventRequest() ? object.getDiagnosticEventRequest() : null;
        return object;
    }

    @Nullable
    public static final GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasGetTokenEventRequest() ? object.getGetTokenEventRequest() : null;
        return object;
    }

    @Nullable
    public static final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasInitializationCompletedEventRequest() ? object.getInitializationCompletedEventRequest() : null;
        return object;
    }

    @Nullable
    public static final InitializationRequestOuterClass.InitializationRequest getInitializationRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasInitializationRequest() ? object.getInitializationRequest() : null;
        return object;
    }

    @Nullable
    public static final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasLimitedSessionToken() ? object.getLimitedSessionToken() : null;
        return object;
    }

    @Nullable
    public static final OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEventOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasOperativeEvent() ? object.getOperativeEvent() : null;
        return object;
    }

    @Nullable
    public static final UniversalRequestOuterClass.UniversalRequest.Payload getPayloadOrNull(@NotNull UniversalRequestOuterClass.UniversalRequestOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasPayload() ? object.getPayload() : null;
        return object;
    }

    @Nullable
    public static final PiiOuterClass.Pii getPiiOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasPii() ? object.getPii() : null;
        return object;
    }

    @Nullable
    public static final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasPrivacyUpdateRequest() ? object.getPrivacyUpdateRequest() : null;
        return object;
    }

    @Nullable
    public static final Timestamp getSdkStartTimeOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        y.j(sharedDataOrBuilder, "<this>");
        sharedDataOrBuilder = sharedDataOrBuilder.hasSdkStartTime() ? sharedDataOrBuilder.getSdkStartTime() : null;
        return sharedDataOrBuilder;
    }

    @Nullable
    public static final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedDataOrNull(@NotNull UniversalRequestOuterClass.UniversalRequestOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasSharedData() ? object.getSharedData() : null;
        return object;
    }

    @Nullable
    public static final TestDataOuterClass.TestData getTestDataOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasTestData() ? object.getTestData() : null;
        return object;
    }

    @Nullable
    public static final TimestampsOuterClass.Timestamps getTimestampsOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasTimestamps() ? object.getTimestamps() : null;
        return object;
    }

    @Nullable
    public static final TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasTransactionEventRequest() ? object.getTransactionEventRequest() : null;
        return object;
    }
}


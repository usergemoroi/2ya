/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.l
 */
package gatewayprotocol.v1;

import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import gatewayprotocol.v1.UniversalResponseKt;
import gatewayprotocol.v1.UniversalResponseOuterClass;
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
@Metadata(d1={"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\b\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\n\u001a0\u0010\t\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0017*\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001b*\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0017\u0010\"\u001a\u0004\u0018\u00010\u001f*\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b \u0010!\"\u0017\u0010&\u001a\u0004\u0018\u00010\u000b*\u00020#8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010%\"\u0017\u0010*\u001a\u0004\u0018\u00010'*\u00020#8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010)\"\u0017\u0010.\u001a\u0004\u0018\u00010+*\u00020#8F\u00a2\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006/"}, d2={"Lkotlin/Function1;", "Lgatewayprotocol/v1/UniversalResponseKt$Dsl;", "Lkotlin/k0;", "Lkotlin/ExtensionFunctionType;", "block", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "-initializeuniversalResponse", "(Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "universalResponse", "copy", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt$Dsl;", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "getInitializationResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "initializationResponseOrNull", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "getAdResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "adResponseOrNull", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "getAdPlayerConfigResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "adPlayerConfigResponseOrNull", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "getAdDataRefreshResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "adDataRefreshResponseOrNull", "Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "getPrivacyUpdateResponseOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder;)Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "privacyUpdateResponseOrNull", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;", "getPayloadOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "payloadOrNull", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "getMutableDataOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;)Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "mutableDataOrNull", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "getErrorOrNull", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponseOrBuilder;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "errorOrNull", "unity-ads_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nUniversalResponseKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UniversalResponseKt.kt\ngatewayprotocol/v1/UniversalResponseKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n1#2:391\n*E\n"})
public final class UniversalResponseKtKt {
    @JvmName(name="-initializeuniversalResponse")
    @NotNull
    public static final UniversalResponseOuterClass.UniversalResponse -initializeuniversalResponse(@NotNull l<? super UniversalResponseKt.Dsl, k0> l10) {
        y.j(l10, "block");
        Object object = UniversalResponseKt.Dsl.Companion;
        UniversalResponseOuterClass.UniversalResponse.Builder builder = UniversalResponseOuterClass.UniversalResponse.newBuilder();
        y.i(builder, "newBuilder()");
        object = ((UniversalResponseKt.Dsl.Companion)object)._create(builder);
        l10.invoke(object);
        return ((UniversalResponseKt.Dsl)object)._build();
    }

    @NotNull
    public static final UniversalResponseOuterClass.UniversalResponse.Payload copy(@NotNull UniversalResponseOuterClass.UniversalResponse.Payload object, @NotNull l<? super UniversalResponseKt.PayloadKt.Dsl, k0> l10) {
        y.j(object, "<this>");
        y.j(l10, "block");
        UniversalResponseKt.PayloadKt.Dsl.Companion companion = UniversalResponseKt.PayloadKt.Dsl.Companion;
        object = object.toBuilder();
        y.i(object, "this.toBuilder()");
        object = companion._create((UniversalResponseOuterClass.UniversalResponse.Payload.Builder)object);
        l10.invoke(object);
        return ((UniversalResponseKt.PayloadKt.Dsl)object)._build();
    }

    @NotNull
    public static final UniversalResponseOuterClass.UniversalResponse copy(@NotNull UniversalResponseOuterClass.UniversalResponse object, @NotNull l<? super UniversalResponseKt.Dsl, k0> l10) {
        y.j(object, "<this>");
        y.j(l10, "block");
        UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.Companion;
        object = object.toBuilder();
        y.i(object, "this.toBuilder()");
        object = companion._create((UniversalResponseOuterClass.UniversalResponse.Builder)object);
        l10.invoke(object);
        return ((UniversalResponseKt.Dsl)object)._build();
    }

    @Nullable
    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponseOrNull(@NotNull UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasAdDataRefreshResponse() ? object.getAdDataRefreshResponse() : null;
        return object;
    }

    @Nullable
    public static final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponseOrNull(@NotNull UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasAdPlayerConfigResponse() ? object.getAdPlayerConfigResponse() : null;
        return object;
    }

    @Nullable
    public static final AdResponseOuterClass.AdResponse getAdResponseOrNull(@NotNull UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasAdResponse() ? object.getAdResponse() : null;
        return object;
    }

    @Nullable
    public static final ErrorOuterClass.Error getErrorOrNull(@NotNull UniversalResponseOuterClass.UniversalResponseOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasError() ? object.getError() : null;
        return object;
    }

    @Nullable
    public static final InitializationResponseOuterClass.InitializationResponse getInitializationResponseOrNull(@NotNull UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasInitializationResponse() ? object.getInitializationResponse() : null;
        return object;
    }

    @Nullable
    public static final MutableDataOuterClass.MutableData getMutableDataOrNull(@NotNull UniversalResponseOuterClass.UniversalResponseOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasMutableData() ? object.getMutableData() : null;
        return object;
    }

    @Nullable
    public static final UniversalResponseOuterClass.UniversalResponse.Payload getPayloadOrNull(@NotNull UniversalResponseOuterClass.UniversalResponseOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasPayload() ? object.getPayload() : null;
        return object;
    }

    @Nullable
    public static final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponseOrNull(@NotNull UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder object) {
        y.j(object, "<this>");
        object = object.hasPrivacyUpdateResponse() ? object.getPrivacyUpdateResponse() : null;
        return object;
    }
}


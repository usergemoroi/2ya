/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.kotlin.ProtoDslMarker
 *  kotlin.jvm.functions.l
 */
package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
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
import gatewayprotocol.v1.UniversalRequestKtKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\t\b\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J,\u0010\n\u001a\u00020\u00072\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0002\b\u0005H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\b\u0010\tJ,\u0010\u000f\u001a\u00020\f2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0002\b\u0005H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0015"}, d2={"Lgatewayprotocol/v1/UniversalRequestKt;", "", "Lkotlin/Function1;", "Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;", "Lkotlin/k0;", "Lkotlin/ExtensionFunctionType;", "block", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "-initializesharedData", "(Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "sharedData", "Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl;", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "-initializepayload", "(Lkotlin/jvm/functions/l;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "payload", "<init>", "()V", "Dsl", "PayloadKt", "SharedDataKt", "unity-ads_release"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nUniversalRequestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UniversalRequestKt.kt\ngatewayprotocol/v1/UniversalRequestKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,939:1\n1#2:940\n*E\n"})
public final class UniversalRequestKt {
    @NotNull
    public static final UniversalRequestKt INSTANCE = new UniversalRequestKt();

    private UniversalRequestKt() {
    }

    @JvmName(name="-initializepayload")
    @NotNull
    public final UniversalRequestOuterClass.UniversalRequest.Payload -initializepayload(@NotNull l<? super PayloadKt.Dsl, k0> l10) {
        y.j(l10, "block");
        PayloadKt.Dsl.Companion companion = PayloadKt.Dsl.Companion;
        Object object = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        y.i(object, "newBuilder()");
        object = companion._create((UniversalRequestOuterClass.UniversalRequest.Payload.Builder)object);
        l10.invoke(object);
        return ((PayloadKt.Dsl)object)._build();
    }

    @JvmName(name="-initializesharedData")
    @NotNull
    public final UniversalRequestOuterClass.UniversalRequest.SharedData -initializesharedData(@NotNull l<? super SharedDataKt.Dsl, k0> l10) {
        y.j(l10, "block");
        Object object = SharedDataKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder = UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder();
        y.i(builder, "newBuilder()");
        object = ((SharedDataKt.Dsl.Companion)object)._create(builder);
        l10.invoke(object);
        return ((SharedDataKt.Dsl)object)._build();
    }

    @Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\f\u001a\u00020\b\u00a2\u0006\u0004\b\f\u0010\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006 "}, d2={"Lgatewayprotocol/v1/UniversalRequestKt$Dsl;", "", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "_build", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "Lkotlin/k0;", "clearSharedData", "()V", "", "hasSharedData", "()Z", "clearPayload", "hasPayload", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Builder;", "_builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Builder;", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "value", "getSharedData", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "setSharedData", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;)V", "sharedData", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "getPayload", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "setPayload", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;)V", "payload", "<init>", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Builder;)V", "Companion", "unity-ads_release"}, k=1, mv={1, 8, 0})
    @ProtoDslMarker
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final UniversalRequestOuterClass.UniversalRequest.Builder _builder;

        private Dsl(UniversalRequestOuterClass.UniversalRequest.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.Builder builder, p p14) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest _build() {
            GeneratedMessageLite generatedMessageLite = this._builder.build();
            y.i(generatedMessageLite, "_builder.build()");
            return (UniversalRequestOuterClass.UniversalRequest)generatedMessageLite;
        }

        public final void clearPayload() {
            this._builder.clearPayload();
        }

        public final void clearSharedData() {
            this._builder.clearSharedData();
        }

        @JvmName(name="getPayload")
        @NotNull
        public final UniversalRequestOuterClass.UniversalRequest.Payload getPayload() {
            UniversalRequestOuterClass.UniversalRequest.Payload payload = this._builder.getPayload();
            y.i(payload, "_builder.getPayload()");
            return payload;
        }

        @JvmName(name="getSharedData")
        @NotNull
        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this._builder.getSharedData();
            y.i(sharedData, "_builder.getSharedData()");
            return sharedData;
        }

        public final boolean hasPayload() {
            return this._builder.hasPayload();
        }

        public final boolean hasSharedData() {
            return this._builder.hasSharedData();
        }

        @JvmName(name="setPayload")
        public final void setPayload(@NotNull UniversalRequestOuterClass.UniversalRequest.Payload payload) {
            y.j(payload, "value");
            this._builder.setPayload(payload);
        }

        @JvmName(name="setSharedData")
        public final void setSharedData(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            y.j(sharedData, "value");
            this._builder.setSharedData(sharedData);
        }

        @Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a8\u0006\u0007"}, d2={"Lgatewayprotocol/v1/UniversalRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/UniversalRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Builder;", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(p p14) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.Builder builder) {
                y.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2={"Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt;", "", "()V", "Dsl", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class PayloadKt {
        @NotNull
        public static final PayloadKt INSTANCE = new PayloadKt();

        private PayloadKt() {
        }

        @Metadata(d1={"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 d2\u00020\u0001:\u0001dB\u0011\b\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\bb\u0010cJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\f\u001a\u00020\b\u00a2\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0004\b\r\u0010\u0007J\r\u0010\u000e\u001a\u00020\b\u00a2\u0006\u0004\b\u000e\u0010\nJ\r\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000f\u0010\u0007J\r\u0010\u0010\u001a\u00020\b\u00a2\u0006\u0004\b\u0010\u0010\nJ\r\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0011\u0010\u0007J\r\u0010\u0012\u001a\u00020\b\u00a2\u0006\u0004\b\u0012\u0010\nJ\r\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0013\u0010\u0007J\r\u0010\u0014\u001a\u00020\b\u00a2\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0015\u0010\u0007J\r\u0010\u0016\u001a\u00020\b\u00a2\u0006\u0004\b\u0016\u0010\nJ\r\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0017\u0010\u0007J\r\u0010\u0018\u001a\u00020\b\u00a2\u0006\u0004\b\u0018\u0010\nJ\r\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0019\u0010\u0007J\r\u0010\u001a\u001a\u00020\b\u00a2\u0006\u0004\b\u001a\u0010\nJ\r\u0010\u001b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001b\u0010\u0007J\r\u0010\u001c\u001a\u00020\b\u00a2\u0006\u0004\b\u001c\u0010\nJ\r\u0010\u001d\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010-\u001a\u00020(2\u0006\u0010\"\u001a\u00020(8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00103\u001a\u00020.2\u0006\u0010\"\u001a\u00020.8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00109\u001a\u0002042\u0006\u0010\"\u001a\u0002048G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010?\u001a\u00020:2\u0006\u0010\"\u001a\u00020:8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010E\u001a\u00020@2\u0006\u0010\"\u001a\u00020@8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010K\u001a\u00020F2\u0006\u0010\"\u001a\u00020F8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010Q\u001a\u00020L2\u0006\u0010\"\u001a\u00020L8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010W\u001a\u00020R2\u0006\u0010\"\u001a\u00020R8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010]\u001a\u00020X2\u0006\u0010\"\u001a\u00020X8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0011\u0010a\u001a\u00020^8G\u00a2\u0006\u0006\u001a\u0004\b_\u0010`\u00a8\u0006e"}, d2={"Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl;", "", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "_build", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "Lkotlin/k0;", "clearInitializationRequest", "()V", "", "hasInitializationRequest", "()Z", "clearAdRequest", "hasAdRequest", "clearOperativeEvent", "hasOperativeEvent", "clearDiagnosticEventRequest", "hasDiagnosticEventRequest", "clearAdPlayerConfigRequest", "hasAdPlayerConfigRequest", "clearGetTokenEventRequest", "hasGetTokenEventRequest", "clearPrivacyUpdateRequest", "hasPrivacyUpdateRequest", "clearAdDataRefreshRequest", "hasAdDataRefreshRequest", "clearInitializationCompletedEventRequest", "hasInitializationCompletedEventRequest", "clearTransactionEventRequest", "hasTransactionEventRequest", "clearValue", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$Builder;", "_builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$Builder;", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "value", "getInitializationRequest", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "setInitializationRequest", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;)V", "initializationRequest", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "getAdRequest", "()Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "setAdRequest", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;)V", "adRequest", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "getOperativeEvent", "()Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "setOperativeEvent", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;)V", "operativeEvent", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "getDiagnosticEventRequest", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "setDiagnosticEventRequest", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;)V", "diagnosticEventRequest", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "getAdPlayerConfigRequest", "()Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "setAdPlayerConfigRequest", "(Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;)V", "adPlayerConfigRequest", "Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "getGetTokenEventRequest", "()Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "setGetTokenEventRequest", "(Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;)V", "getTokenEventRequest", "Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "getPrivacyUpdateRequest", "()Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "setPrivacyUpdateRequest", "(Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;)V", "privacyUpdateRequest", "Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "getAdDataRefreshRequest", "()Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "setAdDataRefreshRequest", "(Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;)V", "adDataRefreshRequest", "Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "getInitializationCompletedEventRequest", "()Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "setInitializationCompletedEventRequest", "(Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;)V", "initializationCompletedEventRequest", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "getTransactionEventRequest", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "setTransactionEventRequest", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;)V", "transactionEventRequest", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$ValueCase;", "getValueCase", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$ValueCase;", "valueCase", "<init>", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$Builder;)V", "Companion", "unity-ads_release"}, k=1, mv={1, 8, 0})
        @ProtoDslMarker
        public static final class Dsl {
            @NotNull
            public static final Companion Companion = new Companion(null);
            @NotNull
            private final UniversalRequestOuterClass.UniversalRequest.Payload.Builder _builder;

            private Dsl(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                this._builder = builder;
            }

            public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder, p p14) {
                this(builder);
            }

            @PublishedApi
            public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest.Payload _build() {
                GeneratedMessageLite generatedMessageLite = this._builder.build();
                y.i(generatedMessageLite, "_builder.build()");
                return (UniversalRequestOuterClass.UniversalRequest.Payload)generatedMessageLite;
            }

            public final void clearAdDataRefreshRequest() {
                this._builder.clearAdDataRefreshRequest();
            }

            public final void clearAdPlayerConfigRequest() {
                this._builder.clearAdPlayerConfigRequest();
            }

            public final void clearAdRequest() {
                this._builder.clearAdRequest();
            }

            public final void clearDiagnosticEventRequest() {
                this._builder.clearDiagnosticEventRequest();
            }

            public final void clearGetTokenEventRequest() {
                this._builder.clearGetTokenEventRequest();
            }

            public final void clearInitializationCompletedEventRequest() {
                this._builder.clearInitializationCompletedEventRequest();
            }

            public final void clearInitializationRequest() {
                this._builder.clearInitializationRequest();
            }

            public final void clearOperativeEvent() {
                this._builder.clearOperativeEvent();
            }

            public final void clearPrivacyUpdateRequest() {
                this._builder.clearPrivacyUpdateRequest();
            }

            public final void clearTransactionEventRequest() {
                this._builder.clearTransactionEventRequest();
            }

            public final void clearValue() {
                this._builder.clearValue();
            }

            @JvmName(name="getAdDataRefreshRequest")
            @NotNull
            public final AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest() {
                AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest = this._builder.getAdDataRefreshRequest();
                y.i(adDataRefreshRequest, "_builder.getAdDataRefreshRequest()");
                return adDataRefreshRequest;
            }

            @JvmName(name="getAdPlayerConfigRequest")
            @NotNull
            public final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest() {
                AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest = this._builder.getAdPlayerConfigRequest();
                y.i(adPlayerConfigRequest, "_builder.getAdPlayerConfigRequest()");
                return adPlayerConfigRequest;
            }

            @JvmName(name="getAdRequest")
            @NotNull
            public final AdRequestOuterClass.AdRequest getAdRequest() {
                AdRequestOuterClass.AdRequest adRequest = this._builder.getAdRequest();
                y.i(adRequest, "_builder.getAdRequest()");
                return adRequest;
            }

            @JvmName(name="getDiagnosticEventRequest")
            @NotNull
            public final DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest() {
                DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest = this._builder.getDiagnosticEventRequest();
                y.i(diagnosticEventRequest, "_builder.getDiagnosticEventRequest()");
                return diagnosticEventRequest;
            }

            @JvmName(name="getGetTokenEventRequest")
            @NotNull
            public final GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest() {
                GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest = this._builder.getGetTokenEventRequest();
                y.i(getTokenEventRequest, "_builder.getGetTokenEventRequest()");
                return getTokenEventRequest;
            }

            @JvmName(name="getInitializationCompletedEventRequest")
            @NotNull
            public final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest = this._builder.getInitializationCompletedEventRequest();
                y.i(initializationCompletedEventRequest, "_builder.getInitializationCompletedEventRequest()");
                return initializationCompletedEventRequest;
            }

            @JvmName(name="getInitializationRequest")
            @NotNull
            public final InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                InitializationRequestOuterClass.InitializationRequest initializationRequest = this._builder.getInitializationRequest();
                y.i(initializationRequest, "_builder.getInitializationRequest()");
                return initializationRequest;
            }

            @JvmName(name="getOperativeEvent")
            @NotNull
            public final OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent() {
                OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest = this._builder.getOperativeEvent();
                y.i(operativeEventRequest, "_builder.getOperativeEvent()");
                return operativeEventRequest;
            }

            @JvmName(name="getPrivacyUpdateRequest")
            @NotNull
            public final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest() {
                PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest = this._builder.getPrivacyUpdateRequest();
                y.i(privacyUpdateRequest, "_builder.getPrivacyUpdateRequest()");
                return privacyUpdateRequest;
            }

            @JvmName(name="getTransactionEventRequest")
            @NotNull
            public final TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest() {
                TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest = this._builder.getTransactionEventRequest();
                y.i(transactionEventRequest, "_builder.getTransactionEventRequest()");
                return transactionEventRequest;
            }

            @JvmName(name="getValueCase")
            @NotNull
            public final UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase getValueCase() {
                UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase valueCase = this._builder.getValueCase();
                y.i((Object)valueCase, "_builder.getValueCase()");
                return valueCase;
            }

            public final boolean hasAdDataRefreshRequest() {
                return this._builder.hasAdDataRefreshRequest();
            }

            public final boolean hasAdPlayerConfigRequest() {
                return this._builder.hasAdPlayerConfigRequest();
            }

            public final boolean hasAdRequest() {
                return this._builder.hasAdRequest();
            }

            public final boolean hasDiagnosticEventRequest() {
                return this._builder.hasDiagnosticEventRequest();
            }

            public final boolean hasGetTokenEventRequest() {
                return this._builder.hasGetTokenEventRequest();
            }

            public final boolean hasInitializationCompletedEventRequest() {
                return this._builder.hasInitializationCompletedEventRequest();
            }

            public final boolean hasInitializationRequest() {
                return this._builder.hasInitializationRequest();
            }

            public final boolean hasOperativeEvent() {
                return this._builder.hasOperativeEvent();
            }

            public final boolean hasPrivacyUpdateRequest() {
                return this._builder.hasPrivacyUpdateRequest();
            }

            public final boolean hasTransactionEventRequest() {
                return this._builder.hasTransactionEventRequest();
            }

            @JvmName(name="setAdDataRefreshRequest")
            public final void setAdDataRefreshRequest(@NotNull AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                y.j(adDataRefreshRequest, "value");
                this._builder.setAdDataRefreshRequest(adDataRefreshRequest);
            }

            @JvmName(name="setAdPlayerConfigRequest")
            public final void setAdPlayerConfigRequest(@NotNull AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                y.j(adPlayerConfigRequest, "value");
                this._builder.setAdPlayerConfigRequest(adPlayerConfigRequest);
            }

            @JvmName(name="setAdRequest")
            public final void setAdRequest(@NotNull AdRequestOuterClass.AdRequest adRequest) {
                y.j(adRequest, "value");
                this._builder.setAdRequest(adRequest);
            }

            @JvmName(name="setDiagnosticEventRequest")
            public final void setDiagnosticEventRequest(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                y.j(diagnosticEventRequest, "value");
                this._builder.setDiagnosticEventRequest(diagnosticEventRequest);
            }

            @JvmName(name="setGetTokenEventRequest")
            public final void setGetTokenEventRequest(@NotNull GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                y.j(getTokenEventRequest, "value");
                this._builder.setGetTokenEventRequest(getTokenEventRequest);
            }

            @JvmName(name="setInitializationCompletedEventRequest")
            public final void setInitializationCompletedEventRequest(@NotNull InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                y.j(initializationCompletedEventRequest, "value");
                this._builder.setInitializationCompletedEventRequest(initializationCompletedEventRequest);
            }

            @JvmName(name="setInitializationRequest")
            public final void setInitializationRequest(@NotNull InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                y.j(initializationRequest, "value");
                this._builder.setInitializationRequest(initializationRequest);
            }

            @JvmName(name="setOperativeEvent")
            public final void setOperativeEvent(@NotNull OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                y.j(operativeEventRequest, "value");
                this._builder.setOperativeEvent(operativeEventRequest);
            }

            @JvmName(name="setPrivacyUpdateRequest")
            public final void setPrivacyUpdateRequest(@NotNull PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                y.j(privacyUpdateRequest, "value");
                this._builder.setPrivacyUpdateRequest(privacyUpdateRequest);
            }

            @JvmName(name="setTransactionEventRequest")
            public final void setTransactionEventRequest(@NotNull TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                y.j(transactionEventRequest, "value");
                this._builder.setTransactionEventRequest(transactionEventRequest);
            }

            @Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a8\u0006\u0007"}, d2={"Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$Builder;", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(p p14) {
                    this();
                }

                @PublishedApi
                public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                    y.j(builder, "builder");
                    return new Dsl(builder, null);
                }
            }
        }
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2={"Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt;", "", "()V", "Dsl", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class SharedDataKt {
        @NotNull
        public static final SharedDataKt INSTANCE = new SharedDataKt();

        private SharedDataKt() {
        }

        @Metadata(d1={"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 e2\u00020\u0001:\u0001eB\u0011\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\bc\u0010dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\f\u001a\u00020\b\u00a2\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0004\b\r\u0010\u0007J\r\u0010\u000e\u001a\u00020\b\u00a2\u0006\u0004\b\u000e\u0010\nJ\r\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000f\u0010\u0007J\r\u0010\u0010\u001a\u00020\b\u00a2\u0006\u0004\b\u0010\u0010\nJ\r\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0011\u0010\u0007J\r\u0010\u0012\u001a\u00020\b\u00a2\u0006\u0004\b\u0012\u0010\nJ\r\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0013\u0010\u0007J\r\u0010\u0014\u001a\u00020\b\u00a2\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0015\u0010\u0007J\r\u0010\u0016\u001a\u00020\b\u00a2\u0006\u0004\b\u0016\u0010\nJ\r\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0017\u0010\u0007J\r\u0010\u0018\u001a\u00020\b\u00a2\u0006\u0004\b\u0018\u0010\nJ\r\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0019\u0010\u0007J\r\u0010\u001a\u001a\u00020\b\u00a2\u0006\u0004\b\u001a\u0010\nJ\r\u0010\u001b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001b\u0010\u0007J\r\u0010\u001c\u001a\u00020\b\u00a2\u0006\u0004\b\u001c\u0010\nR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u00020 2\u0006\u0010!\u001a\u00020 8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010,\u001a\u00020'2\u0006\u0010!\u001a\u00020'8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00102\u001a\u00020-2\u0006\u0010!\u001a\u00020-8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0017\u00105\u001a\u0004\u0018\u00010-*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b3\u00104R$\u0010;\u001a\u0002062\u0006\u0010!\u001a\u0002068G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0017\u0010>\u001a\u0004\u0018\u000106*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b<\u0010=R$\u0010D\u001a\u00020?2\u0006\u0010!\u001a\u00020?8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010G\u001a\u00020 2\u0006\u0010!\u001a\u00020 8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bE\u0010#\"\u0004\bF\u0010%R$\u0010M\u001a\u00020H2\u0006\u0010!\u001a\u00020H8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0017\u0010P\u001a\u0004\u0018\u00010H*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\bN\u0010OR$\u0010V\u001a\u00020Q2\u0006\u0010!\u001a\u00020Q8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010Y\u001a\u00020Q2\u0006\u0010!\u001a\u00020Q8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bW\u0010S\"\u0004\bX\u0010UR$\u0010_\u001a\u00020Z2\u0006\u0010!\u001a\u00020Z8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0017\u0010b\u001a\u0004\u0018\u00010Z*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b`\u0010a\u00a8\u0006f"}, d2={"Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;", "", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "_build", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "Lkotlin/k0;", "clearSessionToken", "()V", "", "hasSessionToken", "()Z", "clearTimestamps", "hasTimestamps", "clearPii", "hasPii", "clearDeveloperConsent", "hasDeveloperConsent", "clearWebviewVersion", "hasWebviewVersion", "clearCurrentState", "hasCurrentState", "clearTestData", "hasTestData", "clearAppStartTime", "hasAppStartTime", "clearSdkStartTime", "hasSdkStartTime", "clearLimitedSessionToken", "hasLimitedSessionToken", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData$Builder;", "_builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData$Builder;", "Lcom/google/protobuf/ByteString;", "value", "getSessionToken", "()Lcom/google/protobuf/ByteString;", "setSessionToken", "(Lcom/google/protobuf/ByteString;)V", "sessionToken", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "getTimestamps", "()Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "setTimestamps", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;)V", "timestamps", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "getPii", "()Lgatewayprotocol/v1/PiiOuterClass$Pii;", "setPii", "(Lgatewayprotocol/v1/PiiOuterClass$Pii;)V", "pii", "getPiiOrNull", "(Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgatewayprotocol/v1/PiiOuterClass$Pii;", "piiOrNull", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "getDeveloperConsent", "()Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "setDeveloperConsent", "(Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;)V", "developerConsent", "getDeveloperConsentOrNull", "(Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "developerConsentOrNull", "", "getWebviewVersion", "()I", "setWebviewVersion", "(I)V", "webviewVersion", "getCurrentState", "setCurrentState", "currentState", "Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "getTestData", "()Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "setTestData", "(Lgatewayprotocol/v1/TestDataOuterClass$TestData;)V", "testData", "getTestDataOrNull", "(Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "testDataOrNull", "Lcom/google/protobuf/Timestamp;", "getAppStartTime", "()Lcom/google/protobuf/Timestamp;", "setAppStartTime", "(Lcom/google/protobuf/Timestamp;)V", "appStartTime", "getSdkStartTime", "setSdkStartTime", "sdkStartTime", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "getLimitedSessionToken", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "setLimitedSessionToken", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;)V", "limitedSessionToken", "getLimitedSessionTokenOrNull", "(Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "limitedSessionTokenOrNull", "<init>", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData$Builder;)V", "Companion", "unity-ads_release"}, k=1, mv={1, 8, 0})
        @ProtoDslMarker
        public static final class Dsl {
            @NotNull
            public static final Companion Companion = new Companion(null);
            @NotNull
            private final UniversalRequestOuterClass.UniversalRequest.SharedData.Builder _builder;

            private Dsl(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                this._builder = builder;
            }

            public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder, p p14) {
                this(builder);
            }

            @PublishedApi
            public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest.SharedData _build() {
                GeneratedMessageLite generatedMessageLite = this._builder.build();
                y.i(generatedMessageLite, "_builder.build()");
                return (UniversalRequestOuterClass.UniversalRequest.SharedData)generatedMessageLite;
            }

            public final void clearAppStartTime() {
                this._builder.clearAppStartTime();
            }

            public final void clearCurrentState() {
                this._builder.clearCurrentState();
            }

            public final void clearDeveloperConsent() {
                this._builder.clearDeveloperConsent();
            }

            public final void clearLimitedSessionToken() {
                this._builder.clearLimitedSessionToken();
            }

            public final void clearPii() {
                this._builder.clearPii();
            }

            public final void clearSdkStartTime() {
                this._builder.clearSdkStartTime();
            }

            public final void clearSessionToken() {
                this._builder.clearSessionToken();
            }

            public final void clearTestData() {
                this._builder.clearTestData();
            }

            public final void clearTimestamps() {
                this._builder.clearTimestamps();
            }

            public final void clearWebviewVersion() {
                this._builder.clearWebviewVersion();
            }

            @JvmName(name="getAppStartTime")
            @NotNull
            public final Timestamp getAppStartTime() {
                Timestamp timestamp = this._builder.getAppStartTime();
                y.i(timestamp, "_builder.getAppStartTime()");
                return timestamp;
            }

            @JvmName(name="getCurrentState")
            @NotNull
            public final ByteString getCurrentState() {
                ByteString byteString = this._builder.getCurrentState();
                y.i(byteString, "_builder.getCurrentState()");
                return byteString;
            }

            @JvmName(name="getDeveloperConsent")
            @NotNull
            public final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
                DeveloperConsentOuterClass.DeveloperConsent developerConsent = this._builder.getDeveloperConsent();
                y.i(developerConsent, "_builder.getDeveloperConsent()");
                return developerConsent;
            }

            @Nullable
            public final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsentOrNull(@NotNull Dsl dsl) {
                y.j(dsl, "<this>");
                return UniversalRequestKtKt.getDeveloperConsentOrNull(dsl._builder);
            }

            @JvmName(name="getLimitedSessionToken")
            @NotNull
            public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
                UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this._builder.getLimitedSessionToken();
                y.i(limitedSessionToken, "_builder.getLimitedSessionToken()");
                return limitedSessionToken;
            }

            @Nullable
            public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(@NotNull Dsl dsl) {
                y.j(dsl, "<this>");
                return UniversalRequestKtKt.getLimitedSessionTokenOrNull(dsl._builder);
            }

            @JvmName(name="getPii")
            @NotNull
            public final PiiOuterClass.Pii getPii() {
                PiiOuterClass.Pii pii = this._builder.getPii();
                y.i(pii, "_builder.getPii()");
                return pii;
            }

            @Nullable
            public final PiiOuterClass.Pii getPiiOrNull(@NotNull Dsl dsl) {
                y.j(dsl, "<this>");
                return UniversalRequestKtKt.getPiiOrNull(dsl._builder);
            }

            @JvmName(name="getSdkStartTime")
            @NotNull
            public final Timestamp getSdkStartTime() {
                Timestamp timestamp = this._builder.getSdkStartTime();
                y.i(timestamp, "_builder.getSdkStartTime()");
                return timestamp;
            }

            @JvmName(name="getSessionToken")
            @NotNull
            public final ByteString getSessionToken() {
                ByteString byteString = this._builder.getSessionToken();
                y.i(byteString, "_builder.getSessionToken()");
                return byteString;
            }

            @JvmName(name="getTestData")
            @NotNull
            public final TestDataOuterClass.TestData getTestData() {
                TestDataOuterClass.TestData testData = this._builder.getTestData();
                y.i(testData, "_builder.getTestData()");
                return testData;
            }

            @Nullable
            public final TestDataOuterClass.TestData getTestDataOrNull(@NotNull Dsl dsl) {
                y.j(dsl, "<this>");
                return UniversalRequestKtKt.getTestDataOrNull(dsl._builder);
            }

            @JvmName(name="getTimestamps")
            @NotNull
            public final TimestampsOuterClass.Timestamps getTimestamps() {
                TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
                y.i(timestamps, "_builder.getTimestamps()");
                return timestamps;
            }

            @JvmName(name="getWebviewVersion")
            public final int getWebviewVersion() {
                return this._builder.getWebviewVersion();
            }

            public final boolean hasAppStartTime() {
                return this._builder.hasAppStartTime();
            }

            public final boolean hasCurrentState() {
                return this._builder.hasCurrentState();
            }

            public final boolean hasDeveloperConsent() {
                return this._builder.hasDeveloperConsent();
            }

            public final boolean hasLimitedSessionToken() {
                return this._builder.hasLimitedSessionToken();
            }

            public final boolean hasPii() {
                return this._builder.hasPii();
            }

            public final boolean hasSdkStartTime() {
                return this._builder.hasSdkStartTime();
            }

            public final boolean hasSessionToken() {
                return this._builder.hasSessionToken();
            }

            public final boolean hasTestData() {
                return this._builder.hasTestData();
            }

            public final boolean hasTimestamps() {
                return this._builder.hasTimestamps();
            }

            public final boolean hasWebviewVersion() {
                return this._builder.hasWebviewVersion();
            }

            @JvmName(name="setAppStartTime")
            public final void setAppStartTime(@NotNull Timestamp timestamp) {
                y.j(timestamp, "value");
                this._builder.setAppStartTime(timestamp);
            }

            @JvmName(name="setCurrentState")
            public final void setCurrentState(@NotNull ByteString byteString) {
                y.j(byteString, "value");
                this._builder.setCurrentState(byteString);
            }

            @JvmName(name="setDeveloperConsent")
            public final void setDeveloperConsent(@NotNull DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                y.j(developerConsent, "value");
                this._builder.setDeveloperConsent(developerConsent);
            }

            @JvmName(name="setLimitedSessionToken")
            public final void setLimitedSessionToken(@NotNull UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
                y.j(limitedSessionToken, "value");
                this._builder.setLimitedSessionToken(limitedSessionToken);
            }

            @JvmName(name="setPii")
            public final void setPii(@NotNull PiiOuterClass.Pii pii) {
                y.j(pii, "value");
                this._builder.setPii(pii);
            }

            @JvmName(name="setSdkStartTime")
            public final void setSdkStartTime(@NotNull Timestamp timestamp) {
                y.j(timestamp, "value");
                this._builder.setSdkStartTime(timestamp);
            }

            @JvmName(name="setSessionToken")
            public final void setSessionToken(@NotNull ByteString byteString) {
                y.j(byteString, "value");
                this._builder.setSessionToken(byteString);
            }

            @JvmName(name="setTestData")
            public final void setTestData(@NotNull TestDataOuterClass.TestData testData) {
                y.j(testData, "value");
                this._builder.setTestData(testData);
            }

            @JvmName(name="setTimestamps")
            public final void setTimestamps(@NotNull TimestampsOuterClass.Timestamps timestamps) {
                y.j(timestamps, "value");
                this._builder.setTimestamps(timestamps);
            }

            @JvmName(name="setWebviewVersion")
            public final void setWebviewVersion(int n10) {
                this._builder.setWebviewVersion(n10);
            }

            @Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a8\u0006\u0007"}, d2={"Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData$Builder;", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(p p14) {
                    this();
                }

                @PublishedApi
                public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                    y.j(builder, "builder");
                    return new Dsl(builder, null);
                }
            }
        }
    }
}


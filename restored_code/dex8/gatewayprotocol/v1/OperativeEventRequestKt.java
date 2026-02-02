/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.kotlin.ProtoDslMarker
 *  gatewayprotocol.v1.OperativeEventRequestKt$Dsl$Companion
 */
package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.OperativeEventRequestKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2={"Lgatewayprotocol/v1/OperativeEventRequestKt;", "", "()V", "Dsl", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
public final class OperativeEventRequestKt {
    @NotNull
    public static final OperativeEventRequestKt INSTANCE = new OperativeEventRequestKt();

    private OperativeEventRequestKt() {
    }

    @Metadata(d1={"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 a2\u00020\u0001:\u0001aB\u0011\b\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\b_\u0010`J\u000f\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0004\b\n\u0010\u0007J\r\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0004\b\f\u0010\u0007J\r\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0004\b\r\u0010\u0007J\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0011\u0010\u0007J\r\u0010\u0012\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0013\u0010\u0007J\r\u0010\u0014\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0014\u0010\u0010J\r\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0015\u0010\u0007J\r\u0010\u0016\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0016\u0010\u0010J\r\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0017\u0010\u0007J\r\u0010\u0018\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0018\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010(\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020#8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010.\u001a\u00020)2\u0006\u0010\u001d\u001a\u00020)8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00101\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!R$\u00104\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R$\u00107\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u0010!R$\u0010=\u001a\u0002082\u0006\u0010\u001d\u001a\u0002088G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010C\u001a\u00020>2\u0006\u0010\u001d\u001a\u00020>8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010I\u001a\u00020D2\u0006\u0010\u001d\u001a\u00020D8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010O\u001a\u00020J2\u0006\u0010\u001d\u001a\u00020J8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010U\u001a\u00020P2\u0006\u0010\u001d\u001a\u00020P8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010[\u001a\u00020V2\u0006\u0010\u001d\u001a\u00020V8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010^\u001a\u00020)2\u0006\u0010\u001d\u001a\u00020)8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\\\u0010+\"\u0004\b]\u0010-\u00a8\u0006b"}, d2={"Lgatewayprotocol/v1/OperativeEventRequestKt$Dsl;", "", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "_build", "()Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "Lkotlin/k0;", "clearEventId", "()V", "clearEventType", "clearImpressionOpportunityId", "clearTrackingToken", "clearAdditionalData", "clearSid", "clearSessionCounters", "", "hasSessionCounters", "()Z", "clearStaticDeviceInfo", "hasStaticDeviceInfo", "clearDynamicDeviceInfo", "hasDynamicDeviceInfo", "clearCampaignState", "hasCampaignState", "clearAdFormat", "hasAdFormat", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest$Builder;", "_builder", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest$Builder;", "Lcom/google/protobuf/ByteString;", "value", "getEventId", "()Lcom/google/protobuf/ByteString;", "setEventId", "(Lcom/google/protobuf/ByteString;)V", "eventId", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;", "getEventType", "()Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;", "setEventType", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;)V", "eventType", "", "getEventTypeValue", "()I", "setEventTypeValue", "(I)V", "eventTypeValue", "getImpressionOpportunityId", "setImpressionOpportunityId", "impressionOpportunityId", "getTrackingToken", "setTrackingToken", "trackingToken", "getAdditionalData", "setAdditionalData", "additionalData", "", "getSid", "()Ljava/lang/String;", "setSid", "(Ljava/lang/String;)V", "sid", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "sessionCounters", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "staticDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "dynamicDeviceInfo", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "getCampaignState", "()Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "setCampaignState", "(Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;)V", "campaignState", "Lgatewayprotocol/v1/InitializationResponseOuterClass$AdFormat;", "getAdFormat", "()Lgatewayprotocol/v1/InitializationResponseOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$AdFormat;)V", "adFormat", "getAdFormatValue", "setAdFormatValue", "adFormatValue", "<init>", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest$Builder;)V", "Companion", "unity-ads_release"}, k=1, mv={1, 8, 0})
    @ProtoDslMarker
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new /* Unavailable Anonymous Inner Class!! */;
        @NotNull
        private final OperativeEventRequestOuterClass.OperativeEventRequest.Builder _builder;

        private Dsl(OperativeEventRequestOuterClass.OperativeEventRequest.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(OperativeEventRequestOuterClass.OperativeEventRequest.Builder builder, p p14) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ OperativeEventRequestOuterClass.OperativeEventRequest _build() {
            GeneratedMessageLite generatedMessageLite = this._builder.build();
            y.i(generatedMessageLite, "_builder.build()");
            return (OperativeEventRequestOuterClass.OperativeEventRequest)generatedMessageLite;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearAdditionalData() {
            this._builder.clearAdditionalData();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearEventType() {
            this._builder.clearEventType();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSid() {
            this._builder.clearSid();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTrackingToken() {
            this._builder.clearTrackingToken();
        }

        @JvmName(name="getAdFormat")
        @NotNull
        public final InitializationResponseOuterClass.AdFormat getAdFormat() {
            InitializationResponseOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            y.i((Object)adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        @JvmName(name="getAdFormatValue")
        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        @JvmName(name="getAdditionalData")
        @NotNull
        public final ByteString getAdditionalData() {
            ByteString byteString = this._builder.getAdditionalData();
            y.i(byteString, "_builder.getAdditionalData()");
            return byteString;
        }

        @JvmName(name="getCampaignState")
        @NotNull
        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this._builder.getCampaignState();
            y.i(campaignState, "_builder.getCampaignState()");
            return campaignState;
        }

        @JvmName(name="getDynamicDeviceInfo")
        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            y.i(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        @JvmName(name="getEventId")
        @NotNull
        public final ByteString getEventId() {
            ByteString byteString = this._builder.getEventId();
            y.i(byteString, "_builder.getEventId()");
            return byteString;
        }

        @JvmName(name="getEventType")
        @NotNull
        public final OperativeEventRequestOuterClass.OperativeEventType getEventType() {
            OperativeEventRequestOuterClass.OperativeEventType operativeEventType = this._builder.getEventType();
            y.i((Object)operativeEventType, "_builder.getEventType()");
            return operativeEventType;
        }

        @JvmName(name="getEventTypeValue")
        public final int getEventTypeValue() {
            return this._builder.getEventTypeValue();
        }

        @JvmName(name="getImpressionOpportunityId")
        @NotNull
        public final ByteString getImpressionOpportunityId() {
            ByteString byteString = this._builder.getImpressionOpportunityId();
            y.i(byteString, "_builder.getImpressionOpportunityId()");
            return byteString;
        }

        @JvmName(name="getSessionCounters")
        @NotNull
        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            y.i(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        @JvmName(name="getSid")
        @NotNull
        public final String getSid() {
            String string2 = this._builder.getSid();
            y.i(string2, "_builder.getSid()");
            return string2;
        }

        @JvmName(name="getStaticDeviceInfo")
        @NotNull
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            y.i(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        @JvmName(name="getTrackingToken")
        @NotNull
        public final ByteString getTrackingToken() {
            ByteString byteString = this._builder.getTrackingToken();
            y.i(byteString, "_builder.getTrackingToken()");
            return byteString;
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        @JvmName(name="setAdFormat")
        public final void setAdFormat(@NotNull InitializationResponseOuterClass.AdFormat adFormat) {
            y.j((Object)adFormat, "value");
            this._builder.setAdFormat(adFormat);
        }

        @JvmName(name="setAdFormatValue")
        public final void setAdFormatValue(int n10) {
            this._builder.setAdFormatValue(n10);
        }

        @JvmName(name="setAdditionalData")
        public final void setAdditionalData(@NotNull ByteString byteString) {
            y.j(byteString, "value");
            this._builder.setAdditionalData(byteString);
        }

        @JvmName(name="setCampaignState")
        public final void setCampaignState(@NotNull CampaignStateOuterClass.CampaignState campaignState) {
            y.j(campaignState, "value");
            this._builder.setCampaignState(campaignState);
        }

        @JvmName(name="setDynamicDeviceInfo")
        public final void setDynamicDeviceInfo(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            y.j(dynamicDeviceInfo, "value");
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        @JvmName(name="setEventId")
        public final void setEventId(@NotNull ByteString byteString) {
            y.j(byteString, "value");
            this._builder.setEventId(byteString);
        }

        @JvmName(name="setEventType")
        public final void setEventType(@NotNull OperativeEventRequestOuterClass.OperativeEventType operativeEventType) {
            y.j((Object)operativeEventType, "value");
            this._builder.setEventType(operativeEventType);
        }

        @JvmName(name="setEventTypeValue")
        public final void setEventTypeValue(int n10) {
            this._builder.setEventTypeValue(n10);
        }

        @JvmName(name="setImpressionOpportunityId")
        public final void setImpressionOpportunityId(@NotNull ByteString byteString) {
            y.j(byteString, "value");
            this._builder.setImpressionOpportunityId(byteString);
        }

        @JvmName(name="setSessionCounters")
        public final void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters sessionCounters) {
            y.j(sessionCounters, "value");
            this._builder.setSessionCounters(sessionCounters);
        }

        @JvmName(name="setSid")
        public final void setSid(@NotNull String string2) {
            y.j(string2, "value");
            this._builder.setSid(string2);
        }

        @JvmName(name="setStaticDeviceInfo")
        public final void setStaticDeviceInfo(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            y.j(staticDeviceInfo, "value");
            this._builder.setStaticDeviceInfo(staticDeviceInfo);
        }

        @JvmName(name="setTrackingToken")
        public final void setTrackingToken(@NotNull ByteString byteString) {
            y.j(byteString, "value");
            this._builder.setTrackingToken(byteString);
        }
    }
}


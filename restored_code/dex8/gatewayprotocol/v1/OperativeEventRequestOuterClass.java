/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.Internal$EnumLite
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.Internal$EnumVerifier
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Parser
 */
package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class OperativeEventRequestOuterClass {
    private OperativeEventRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static final class OperativeEventErrorData
    extends GeneratedMessageLite<OperativeEventErrorData, Builder>
    implements OperativeEventErrorDataOrBuilder {
        private static final OperativeEventErrorData DEFAULT_INSTANCE;
        public static final int ERROR_TYPE_FIELD_NUMBER = 1;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        private static volatile Parser<OperativeEventErrorData> PARSER;
        private int errorType_;
        private String message_ = "";

        static {
            OperativeEventErrorData operativeEventErrorData;
            DEFAULT_INSTANCE = operativeEventErrorData = new OperativeEventErrorData();
            GeneratedMessageLite.registerDefaultInstance(OperativeEventErrorData.class, (GeneratedMessageLite)operativeEventErrorData);
        }

        private OperativeEventErrorData() {
        }

        private void clearErrorType() {
            this.errorType_ = 0;
        }

        private void clearMessage() {
            this.message_ = OperativeEventErrorData.getDefaultInstance().getMessage();
        }

        public static OperativeEventErrorData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(OperativeEventErrorData operativeEventErrorData) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(operativeEventErrorData);
        }

        public static OperativeEventErrorData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static OperativeEventErrorData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static OperativeEventErrorData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static OperativeEventErrorData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static OperativeEventErrorData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static OperativeEventErrorData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static OperativeEventErrorData parseFrom(InputStream inputStream) throws IOException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static OperativeEventErrorData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static OperativeEventErrorData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static OperativeEventErrorData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static OperativeEventErrorData parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
        }

        public static OperativeEventErrorData parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<OperativeEventErrorData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setErrorType(OperativeEventErrorType operativeEventErrorType) {
            this.errorType_ = operativeEventErrorType.getNumber();
        }

        private void setErrorTypeValue(int n10) {
            this.errorType_ = n10;
        }

        private void setMessage(String string2) {
            string2.getClass();
            this.message_ = string2;
        }

        private void setMessageBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.message_ = byteString.toStringUtf8();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke defaultInstanceBasedParser, Object defaultInstanceBasedParser2, Object object) {
            switch (a.a[defaultInstanceBasedParser.ordinal()]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return (byte)1;
                }
                case 5: {
                    defaultInstanceBasedParser = defaultInstanceBasedParser2 = PARSER;
                    if (defaultInstanceBasedParser2 != null) return defaultInstanceBasedParser;
                    synchronized (OperativeEventErrorData.class) {
                        try {
                            defaultInstanceBasedParser = defaultInstanceBasedParser2 = PARSER;
                            if (defaultInstanceBasedParser2 != null) return defaultInstanceBasedParser;
                            PARSER = defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                            return defaultInstanceBasedParser;
                        }
                        catch (Throwable throwable) {}
                        throw throwable;
                    }
                }
                case 4: {
                    return DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0208", (Object[])new Object[]{"errorType_", "message_"});
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new OperativeEventErrorData();
        }

        @Override
        public OperativeEventErrorType getErrorType() {
            OperativeEventErrorType operativeEventErrorType;
            OperativeEventErrorType operativeEventErrorType2 = operativeEventErrorType = OperativeEventErrorType.forNumber(this.errorType_);
            if (operativeEventErrorType == null) {
                operativeEventErrorType2 = OperativeEventErrorType.UNRECOGNIZED;
            }
            return operativeEventErrorType2;
        }

        @Override
        public int getErrorTypeValue() {
            return this.errorType_;
        }

        @Override
        public String getMessage() {
            return this.message_;
        }

        @Override
        public ByteString getMessageBytes() {
            return ByteString.copyFromUtf8((String)this.message_);
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<OperativeEventErrorData, Builder>
        implements OperativeEventErrorDataOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearErrorType() {
                this.copyOnWrite();
                ((OperativeEventErrorData)this.instance).clearErrorType();
                return this;
            }

            public Builder clearMessage() {
                this.copyOnWrite();
                ((OperativeEventErrorData)this.instance).clearMessage();
                return this;
            }

            @Override
            public OperativeEventErrorType getErrorType() {
                return ((OperativeEventErrorData)this.instance).getErrorType();
            }

            @Override
            public int getErrorTypeValue() {
                return ((OperativeEventErrorData)this.instance).getErrorTypeValue();
            }

            @Override
            public String getMessage() {
                return ((OperativeEventErrorData)this.instance).getMessage();
            }

            @Override
            public ByteString getMessageBytes() {
                return ((OperativeEventErrorData)this.instance).getMessageBytes();
            }

            public Builder setErrorType(OperativeEventErrorType operativeEventErrorType) {
                this.copyOnWrite();
                ((OperativeEventErrorData)this.instance).setErrorType(operativeEventErrorType);
                return this;
            }

            public Builder setErrorTypeValue(int n10) {
                this.copyOnWrite();
                ((OperativeEventErrorData)this.instance).setErrorTypeValue(n10);
                return this;
            }

            public Builder setMessage(String string2) {
                this.copyOnWrite();
                ((OperativeEventErrorData)this.instance).setMessage(string2);
                return this;
            }

            public Builder setMessageBytes(ByteString byteString) {
                this.copyOnWrite();
                ((OperativeEventErrorData)this.instance).setMessageBytes(byteString);
                return this;
            }
        }
    }

    public static interface OperativeEventErrorDataOrBuilder
    extends MessageLiteOrBuilder {
        public OperativeEventErrorType getErrorType();

        public int getErrorTypeValue();

        public String getMessage();

        public ByteString getMessageBytes();
    }

    public static enum OperativeEventErrorType implements Internal.EnumLite
    {
        OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED(0),
        OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT(1),
        UNRECOGNIZED(-1);

        public static final int OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT_VALUE = 1;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<OperativeEventErrorType> internalValueMap;
        private final int value;

        static {
            internalValueMap = new Internal.EnumLiteMap<OperativeEventErrorType>(){

                public OperativeEventErrorType a(int n10) {
                    return OperativeEventErrorType.forNumber(n10);
                }
            };
        }

        private OperativeEventErrorType(int n13) {
            this.value = n13;
        }

        public static OperativeEventErrorType forNumber(int n10) {
            if (n10 != 0) {
                if (n10 != 1) {
                    return null;
                }
                return OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT;
            }
            return OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<OperativeEventErrorType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        public static OperativeEventErrorType valueOf(String string2) {
            return Enum.valueOf(OperativeEventErrorType.class, string2);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        private static final class b
        implements Internal.EnumVerifier {
            static final Internal.EnumVerifier a = new b();

            private b() {
            }

            public boolean isInRange(int n10) {
                boolean bl2 = OperativeEventErrorType.forNumber(n10) != null;
                return bl2;
            }
        }
    }

    public static final class OperativeEventRequest
    extends GeneratedMessageLite<OperativeEventRequest, Builder>
    implements OperativeEventRequestOrBuilder {
        public static final int ADDITIONAL_DATA_FIELD_NUMBER = 5;
        public static final int AD_FORMAT_FIELD_NUMBER = 11;
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 10;
        private static final OperativeEventRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 9;
        public static final int EVENT_ID_FIELD_NUMBER = 1;
        public static final int EVENT_TYPE_FIELD_NUMBER = 2;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 3;
        private static volatile Parser<OperativeEventRequest> PARSER;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 7;
        public static final int SID_FIELD_NUMBER = 6;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 8;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 4;
        private int adFormat_;
        private ByteString additionalData_;
        private int bitField0_;
        private CampaignStateOuterClass.CampaignState campaignState_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private ByteString eventId_;
        private int eventType_;
        private ByteString impressionOpportunityId_;
        private SessionCountersOuterClass.SessionCounters sessionCounters_;
        private String sid_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;
        private ByteString trackingToken_;

        static {
            OperativeEventRequest operativeEventRequest;
            DEFAULT_INSTANCE = operativeEventRequest = new OperativeEventRequest();
            GeneratedMessageLite.registerDefaultInstance(OperativeEventRequest.class, (GeneratedMessageLite)operativeEventRequest);
        }

        private OperativeEventRequest() {
            ByteString byteString;
            this.eventId_ = byteString = ByteString.EMPTY;
            this.impressionOpportunityId_ = byteString;
            this.trackingToken_ = byteString;
            this.additionalData_ = byteString;
            this.sid_ = "";
        }

        private void clearAdFormat() {
            this.bitField0_ &= 0xFFFFFFEF;
            this.adFormat_ = 0;
        }

        private void clearAdditionalData() {
            this.additionalData_ = OperativeEventRequest.getDefaultInstance().getAdditionalData();
        }

        private void clearCampaignState() {
            this.campaignState_ = null;
            this.bitField0_ &= 0xFFFFFFF7;
        }

        private void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= 0xFFFFFFFB;
        }

        private void clearEventId() {
            this.eventId_ = OperativeEventRequest.getDefaultInstance().getEventId();
        }

        private void clearEventType() {
            this.eventType_ = 0;
        }

        private void clearImpressionOpportunityId() {
            this.impressionOpportunityId_ = OperativeEventRequest.getDefaultInstance().getImpressionOpportunityId();
        }

        private void clearSessionCounters() {
            this.sessionCounters_ = null;
            this.bitField0_ &= 0xFFFFFFFE;
        }

        private void clearSid() {
            this.sid_ = OperativeEventRequest.getDefaultInstance().getSid();
        }

        private void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= 0xFFFFFFFD;
        }

        private void clearTrackingToken() {
            this.trackingToken_ = OperativeEventRequest.getDefaultInstance().getTrackingToken();
        }

        public static OperativeEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            CampaignStateOuterClass.CampaignState campaignState2 = this.campaignState_;
            this.campaignState_ = campaignState2 != null && campaignState2 != CampaignStateOuterClass.CampaignState.getDefaultInstance() ? (CampaignStateOuterClass.CampaignState)((CampaignStateOuterClass.CampaignState.Builder)CampaignStateOuterClass.CampaignState.newBuilder(this.campaignState_).mergeFrom(campaignState)).buildPartial() : campaignState;
            this.bitField0_ |= 8;
        }

        private void mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            this.dynamicDeviceInfo_ = dynamicDeviceInfo2 != null && dynamicDeviceInfo2 != DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() ? (DynamicDeviceInfoOuterClass.DynamicDeviceInfo)((DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder)DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom(dynamicDeviceInfo)).buildPartial() : dynamicDeviceInfo;
            this.bitField0_ |= 4;
        }

        private void mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            SessionCountersOuterClass.SessionCounters sessionCounters2 = this.sessionCounters_;
            this.sessionCounters_ = sessionCounters2 != null && sessionCounters2 != SessionCountersOuterClass.SessionCounters.getDefaultInstance() ? (SessionCountersOuterClass.SessionCounters)((SessionCountersOuterClass.SessionCounters.Builder)SessionCountersOuterClass.SessionCounters.newBuilder(this.sessionCounters_).mergeFrom(sessionCounters)).buildPartial() : sessionCounters;
            this.bitField0_ |= 1;
        }

        private void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            this.staticDeviceInfo_ = staticDeviceInfo2 != null && staticDeviceInfo2 != StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() ? (StaticDeviceInfoOuterClass.StaticDeviceInfo)((StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder)StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom(staticDeviceInfo)).buildPartial() : staticDeviceInfo;
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(OperativeEventRequest operativeEventRequest) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(operativeEventRequest);
        }

        public static OperativeEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperativeEventRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static OperativeEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static OperativeEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static OperativeEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static OperativeEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static OperativeEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static OperativeEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static OperativeEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static OperativeEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static OperativeEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static OperativeEventRequest parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
        }

        public static OperativeEventRequest parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<OperativeEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdFormat(InitializationResponseOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
            this.bitField0_ |= 0x10;
        }

        private void setAdFormatValue(int n10) {
            this.bitField0_ |= 0x10;
            this.adFormat_ = n10;
        }

        private void setAdditionalData(ByteString byteString) {
            byteString.getClass();
            this.additionalData_ = byteString;
        }

        private void setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            this.campaignState_ = campaignState;
            this.bitField0_ |= 8;
        }

        private void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 4;
        }

        private void setEventId(ByteString byteString) {
            byteString.getClass();
            this.eventId_ = byteString;
        }

        private void setEventType(OperativeEventType operativeEventType) {
            this.eventType_ = operativeEventType.getNumber();
        }

        private void setEventTypeValue(int n10) {
            this.eventType_ = n10;
        }

        private void setImpressionOpportunityId(ByteString byteString) {
            byteString.getClass();
            this.impressionOpportunityId_ = byteString;
        }

        private void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            this.sessionCounters_ = sessionCounters;
            this.bitField0_ |= 1;
        }

        private void setSid(String string2) {
            string2.getClass();
            this.sid_ = string2;
        }

        private void setSidBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.sid_ = byteString.toStringUtf8();
        }

        private void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 2;
        }

        private void setTrackingToken(ByteString byteString) {
            byteString.getClass();
            this.trackingToken_ = byteString;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke defaultInstanceBasedParser, Object defaultInstanceBasedParser2, Object object) {
            switch (a.a[defaultInstanceBasedParser.ordinal()]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return (byte)1;
                }
                case 5: {
                    defaultInstanceBasedParser = defaultInstanceBasedParser2 = PARSER;
                    if (defaultInstanceBasedParser2 != null) return defaultInstanceBasedParser;
                    synchronized (OperativeEventRequest.class) {
                        try {
                            defaultInstanceBasedParser = defaultInstanceBasedParser2 = PARSER;
                            if (defaultInstanceBasedParser2 != null) return defaultInstanceBasedParser;
                            PARSER = defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                            return defaultInstanceBasedParser;
                        }
                        catch (Throwable throwable) {}
                        throw throwable;
                    }
                }
                case 4: {
                    return DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\n\u0002\f\u0003\n\u0004\n\u0005\n\u0006\u0208\u0007\u1009\u0000\b\u1009\u0001\t\u1009\u0002\n\u1009\u0003\u000b\u100c\u0004", (Object[])new Object[]{"bitField0_", "eventId_", "eventType_", "impressionOpportunityId_", "trackingToken_", "additionalData_", "sid_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "campaignState_", "adFormat_"});
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new OperativeEventRequest();
        }

        @Override
        public InitializationResponseOuterClass.AdFormat getAdFormat() {
            InitializationResponseOuterClass.AdFormat adFormat;
            InitializationResponseOuterClass.AdFormat adFormat2 = adFormat = InitializationResponseOuterClass.AdFormat.forNumber(this.adFormat_);
            if (adFormat == null) {
                adFormat2 = InitializationResponseOuterClass.AdFormat.UNRECOGNIZED;
            }
            return adFormat2;
        }

        @Override
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        @Override
        public ByteString getAdditionalData() {
            return this.additionalData_;
        }

        @Override
        public CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState;
            CampaignStateOuterClass.CampaignState campaignState2 = campaignState = this.campaignState_;
            if (campaignState == null) {
                campaignState2 = CampaignStateOuterClass.CampaignState.getDefaultInstance();
            }
            return campaignState2;
        }

        @Override
        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo;
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = dynamicDeviceInfo = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo == null) {
                dynamicDeviceInfo2 = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance();
            }
            return dynamicDeviceInfo2;
        }

        @Override
        public ByteString getEventId() {
            return this.eventId_;
        }

        @Override
        public OperativeEventType getEventType() {
            OperativeEventType operativeEventType;
            OperativeEventType operativeEventType2 = operativeEventType = OperativeEventType.forNumber(this.eventType_);
            if (operativeEventType == null) {
                operativeEventType2 = OperativeEventType.UNRECOGNIZED;
            }
            return operativeEventType2;
        }

        @Override
        public int getEventTypeValue() {
            return this.eventType_;
        }

        @Override
        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        @Override
        public SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters;
            SessionCountersOuterClass.SessionCounters sessionCounters2 = sessionCounters = this.sessionCounters_;
            if (sessionCounters == null) {
                sessionCounters2 = SessionCountersOuterClass.SessionCounters.getDefaultInstance();
            }
            return sessionCounters2;
        }

        @Override
        public String getSid() {
            return this.sid_;
        }

        @Override
        public ByteString getSidBytes() {
            return ByteString.copyFromUtf8((String)this.sid_);
        }

        @Override
        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo;
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = staticDeviceInfo = this.staticDeviceInfo_;
            if (staticDeviceInfo == null) {
                staticDeviceInfo2 = StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance();
            }
            return staticDeviceInfo2;
        }

        @Override
        public ByteString getTrackingToken() {
            return this.trackingToken_;
        }

        @Override
        public boolean hasAdFormat() {
            boolean bl2 = (this.bitField0_ & 0x10) != 0;
            return bl2;
        }

        @Override
        public boolean hasCampaignState() {
            boolean bl2 = (this.bitField0_ & 8) != 0;
            return bl2;
        }

        @Override
        public boolean hasDynamicDeviceInfo() {
            boolean bl2 = (this.bitField0_ & 4) != 0;
            return bl2;
        }

        @Override
        public boolean hasSessionCounters() {
            int n10 = this.bitField0_;
            boolean bl2 = true;
            if ((n10 & 1) == 0) {
                bl2 = false;
            }
            return bl2;
        }

        @Override
        public boolean hasStaticDeviceInfo() {
            boolean bl2 = (this.bitField0_ & 2) != 0;
            return bl2;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<OperativeEventRequest, Builder>
        implements OperativeEventRequestOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearAdFormat() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearAdFormat();
                return this;
            }

            public Builder clearAdditionalData() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearAdditionalData();
                return this;
            }

            public Builder clearCampaignState() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearCampaignState();
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearDynamicDeviceInfo();
                return this;
            }

            public Builder clearEventId() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearEventId();
                return this;
            }

            public Builder clearEventType() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearEventType();
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearImpressionOpportunityId();
                return this;
            }

            public Builder clearSessionCounters() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearSessionCounters();
                return this;
            }

            public Builder clearSid() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearSid();
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearStaticDeviceInfo();
                return this;
            }

            public Builder clearTrackingToken() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearTrackingToken();
                return this;
            }

            @Override
            public InitializationResponseOuterClass.AdFormat getAdFormat() {
                return ((OperativeEventRequest)this.instance).getAdFormat();
            }

            @Override
            public int getAdFormatValue() {
                return ((OperativeEventRequest)this.instance).getAdFormatValue();
            }

            @Override
            public ByteString getAdditionalData() {
                return ((OperativeEventRequest)this.instance).getAdditionalData();
            }

            @Override
            public CampaignStateOuterClass.CampaignState getCampaignState() {
                return ((OperativeEventRequest)this.instance).getCampaignState();
            }

            @Override
            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((OperativeEventRequest)this.instance).getDynamicDeviceInfo();
            }

            @Override
            public ByteString getEventId() {
                return ((OperativeEventRequest)this.instance).getEventId();
            }

            @Override
            public OperativeEventType getEventType() {
                return ((OperativeEventRequest)this.instance).getEventType();
            }

            @Override
            public int getEventTypeValue() {
                return ((OperativeEventRequest)this.instance).getEventTypeValue();
            }

            @Override
            public ByteString getImpressionOpportunityId() {
                return ((OperativeEventRequest)this.instance).getImpressionOpportunityId();
            }

            @Override
            public SessionCountersOuterClass.SessionCounters getSessionCounters() {
                return ((OperativeEventRequest)this.instance).getSessionCounters();
            }

            @Override
            public String getSid() {
                return ((OperativeEventRequest)this.instance).getSid();
            }

            @Override
            public ByteString getSidBytes() {
                return ((OperativeEventRequest)this.instance).getSidBytes();
            }

            @Override
            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((OperativeEventRequest)this.instance).getStaticDeviceInfo();
            }

            @Override
            public ByteString getTrackingToken() {
                return ((OperativeEventRequest)this.instance).getTrackingToken();
            }

            @Override
            public boolean hasAdFormat() {
                return ((OperativeEventRequest)this.instance).hasAdFormat();
            }

            @Override
            public boolean hasCampaignState() {
                return ((OperativeEventRequest)this.instance).hasCampaignState();
            }

            @Override
            public boolean hasDynamicDeviceInfo() {
                return ((OperativeEventRequest)this.instance).hasDynamicDeviceInfo();
            }

            @Override
            public boolean hasSessionCounters() {
                return ((OperativeEventRequest)this.instance).hasSessionCounters();
            }

            @Override
            public boolean hasStaticDeviceInfo() {
                return ((OperativeEventRequest)this.instance).hasStaticDeviceInfo();
            }

            public Builder mergeCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).mergeCampaignState(campaignState);
                return this;
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).mergeSessionCounters(sessionCounters);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).mergeStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder setAdFormat(InitializationResponseOuterClass.AdFormat adFormat) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setAdFormat(adFormat);
                return this;
            }

            public Builder setAdFormatValue(int n10) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setAdFormatValue(n10);
                return this;
            }

            public Builder setAdditionalData(ByteString byteString) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setAdditionalData(byteString);
                return this;
            }

            public Builder setCampaignState(CampaignStateOuterClass.CampaignState.Builder builder) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setCampaignState((CampaignStateOuterClass.CampaignState)builder.build());
                return this;
            }

            public Builder setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setCampaignState(campaignState);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setDynamicDeviceInfo((DynamicDeviceInfoOuterClass.DynamicDeviceInfo)builder.build());
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder setEventId(ByteString byteString) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setEventId(byteString);
                return this;
            }

            public Builder setEventType(OperativeEventType operativeEventType) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setEventType(operativeEventType);
                return this;
            }

            public Builder setEventTypeValue(int n10) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setEventTypeValue(n10);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setImpressionOpportunityId(byteString);
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters.Builder builder) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setSessionCounters((SessionCountersOuterClass.SessionCounters)builder.build());
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setSessionCounters(sessionCounters);
                return this;
            }

            public Builder setSid(String string2) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setSid(string2);
                return this;
            }

            public Builder setSidBytes(ByteString byteString) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setSidBytes(byteString);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo)builder.build());
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder setTrackingToken(ByteString byteString) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setTrackingToken(byteString);
                return this;
            }
        }
    }

    public static interface OperativeEventRequestOrBuilder
    extends MessageLiteOrBuilder {
        public InitializationResponseOuterClass.AdFormat getAdFormat();

        public int getAdFormatValue();

        public ByteString getAdditionalData();

        public CampaignStateOuterClass.CampaignState getCampaignState();

        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        public ByteString getEventId();

        public OperativeEventType getEventType();

        public int getEventTypeValue();

        public ByteString getImpressionOpportunityId();

        public SessionCountersOuterClass.SessionCounters getSessionCounters();

        public String getSid();

        public ByteString getSidBytes();

        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        public ByteString getTrackingToken();

        public boolean hasAdFormat();

        public boolean hasCampaignState();

        public boolean hasDynamicDeviceInfo();

        public boolean hasSessionCounters();

        public boolean hasStaticDeviceInfo();
    }

    public static enum OperativeEventType implements Internal.EnumLite
    {
        OPERATIVE_EVENT_TYPE_UNSPECIFIED(0),
        OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER(1),
        OPERATIVE_EVENT_TYPE_LOAD_ERROR(2),
        OPERATIVE_EVENT_TYPE_SHOW_ERROR(3),
        UNRECOGNIZED(-1);

        public static final int OPERATIVE_EVENT_TYPE_LOAD_ERROR_VALUE = 2;
        public static final int OPERATIVE_EVENT_TYPE_SHOW_ERROR_VALUE = 3;
        public static final int OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER_VALUE = 1;
        public static final int OPERATIVE_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<OperativeEventType> internalValueMap;
        private final int value;

        static {
            internalValueMap = new Internal.EnumLiteMap<OperativeEventType>(){

                public OperativeEventType a(int n10) {
                    return OperativeEventType.forNumber(n10);
                }
            };
        }

        private OperativeEventType(int n13) {
            this.value = n13;
        }

        public static OperativeEventType forNumber(int n10) {
            if (n10 != 0) {
                if (n10 != 1) {
                    if (n10 != 2) {
                        if (n10 != 3) {
                            return null;
                        }
                        return OPERATIVE_EVENT_TYPE_SHOW_ERROR;
                    }
                    return OPERATIVE_EVENT_TYPE_LOAD_ERROR;
                }
                return OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER;
            }
            return OPERATIVE_EVENT_TYPE_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<OperativeEventType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        public static OperativeEventType valueOf(String string2) {
            return Enum.valueOf(OperativeEventType.class, string2);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        private static final class b
        implements Internal.EnumVerifier {
            static final Internal.EnumVerifier a = new b();

            private b() {
            }

            public boolean isInRange(int n10) {
                boolean bl2 = OperativeEventType.forNumber(n10) != null;
                return bl2;
            }
        }
    }
}


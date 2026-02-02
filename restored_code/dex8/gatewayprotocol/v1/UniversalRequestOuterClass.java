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
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
 */
package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UniversalRequestOuterClass {
    private UniversalRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static final class LimitedSessionToken
    extends GeneratedMessageLite<LimitedSessionToken, Builder>
    implements LimitedSessionTokenOrBuilder {
        public static final int CUSTOM_MEDIATION_NAME_FIELD_NUMBER = 11;
        private static final LimitedSessionToken DEFAULT_INSTANCE;
        public static final int DEVICE_MAKE_FIELD_NUMBER = 1;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 2;
        public static final int GAME_ID_FIELD_NUMBER = 8;
        public static final int IDFI_FIELD_NUMBER = 4;
        public static final int MEDIATION_PROVIDER_FIELD_NUMBER = 10;
        public static final int MEDIATION_VERSION_FIELD_NUMBER = 12;
        public static final int OS_VERSION_FIELD_NUMBER = 3;
        private static volatile Parser<LimitedSessionToken> PARSER;
        public static final int PLATFORM_FIELD_NUMBER = 9;
        public static final int SDK_VERSION_FIELD_NUMBER = 5;
        public static final int SDK_VERSION_NAME_FIELD_NUMBER = 7;
        public static final int SESSION_ID_FIELD_NUMBER = 13;
        private int bitField0_;
        private String customMediationName_ = "";
        private String deviceMake_ = "";
        private String deviceModel_ = "";
        private String gameId_ = "";
        private String idfi_ = "";
        private int mediationProvider_;
        private String mediationVersion_ = "";
        private String osVersion_ = "";
        private int platform_;
        private String sdkVersionName_ = "";
        private int sdkVersion_;
        private ByteString sessionId_ = ByteString.EMPTY;

        static {
            LimitedSessionToken limitedSessionToken;
            DEFAULT_INSTANCE = limitedSessionToken = new LimitedSessionToken();
            GeneratedMessageLite.registerDefaultInstance(LimitedSessionToken.class, (GeneratedMessageLite)limitedSessionToken);
        }

        private LimitedSessionToken() {
        }

        private void clearCustomMediationName() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.customMediationName_ = LimitedSessionToken.getDefaultInstance().getCustomMediationName();
        }

        private void clearDeviceMake() {
            this.deviceMake_ = LimitedSessionToken.getDefaultInstance().getDeviceMake();
        }

        private void clearDeviceModel() {
            this.deviceModel_ = LimitedSessionToken.getDefaultInstance().getDeviceModel();
        }

        private void clearGameId() {
            this.gameId_ = LimitedSessionToken.getDefaultInstance().getGameId();
        }

        private void clearIdfi() {
            this.idfi_ = LimitedSessionToken.getDefaultInstance().getIdfi();
        }

        private void clearMediationProvider() {
            this.mediationProvider_ = 0;
        }

        private void clearMediationVersion() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.mediationVersion_ = LimitedSessionToken.getDefaultInstance().getMediationVersion();
        }

        private void clearOsVersion() {
            this.osVersion_ = LimitedSessionToken.getDefaultInstance().getOsVersion();
        }

        private void clearPlatform() {
            this.platform_ = 0;
        }

        private void clearSdkVersion() {
            this.sdkVersion_ = 0;
        }

        private void clearSdkVersionName() {
            this.sdkVersionName_ = LimitedSessionToken.getDefaultInstance().getSdkVersionName();
        }

        private void clearSessionId() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.sessionId_ = LimitedSessionToken.getDefaultInstance().getSessionId();
        }

        public static LimitedSessionToken getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(LimitedSessionToken limitedSessionToken) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(limitedSessionToken);
        }

        public static LimitedSessionToken parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LimitedSessionToken)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static LimitedSessionToken parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LimitedSessionToken)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static LimitedSessionToken parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static LimitedSessionToken parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static LimitedSessionToken parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static LimitedSessionToken parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static LimitedSessionToken parseFrom(InputStream inputStream) throws IOException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static LimitedSessionToken parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static LimitedSessionToken parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static LimitedSessionToken parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static LimitedSessionToken parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
        }

        public static LimitedSessionToken parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<LimitedSessionToken> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCustomMediationName(String string2) {
            string2.getClass();
            this.bitField0_ |= 1;
            this.customMediationName_ = string2;
        }

        private void setCustomMediationNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.customMediationName_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setDeviceMake(String string2) {
            string2.getClass();
            this.deviceMake_ = string2;
        }

        private void setDeviceMakeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.deviceMake_ = byteString.toStringUtf8();
        }

        private void setDeviceModel(String string2) {
            string2.getClass();
            this.deviceModel_ = string2;
        }

        private void setDeviceModelBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.deviceModel_ = byteString.toStringUtf8();
        }

        private void setGameId(String string2) {
            string2.getClass();
            this.gameId_ = string2;
        }

        private void setGameIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.gameId_ = byteString.toStringUtf8();
        }

        private void setIdfi(String string2) {
            string2.getClass();
            this.idfi_ = string2;
        }

        private void setIdfiBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.idfi_ = byteString.toStringUtf8();
        }

        private void setMediationProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
            this.mediationProvider_ = mediationProvider.getNumber();
        }

        private void setMediationProviderValue(int n10) {
            this.mediationProvider_ = n10;
        }

        private void setMediationVersion(String string2) {
            string2.getClass();
            this.bitField0_ |= 2;
            this.mediationVersion_ = string2;
        }

        private void setMediationVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.mediationVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setOsVersion(String string2) {
            string2.getClass();
            this.osVersion_ = string2;
        }

        private void setOsVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.osVersion_ = byteString.toStringUtf8();
        }

        private void setPlatform(ClientInfoOuterClass.Platform platform) {
            this.platform_ = platform.getNumber();
        }

        private void setPlatformValue(int n10) {
            this.platform_ = n10;
        }

        private void setSdkVersion(int n10) {
            this.sdkVersion_ = n10;
        }

        private void setSdkVersionName(String string2) {
            string2.getClass();
            this.sdkVersionName_ = string2;
        }

        private void setSdkVersionNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.sdkVersionName_ = byteString.toStringUtf8();
        }

        private void setSessionId(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 4;
            this.sessionId_ = byteString;
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
                    synchronized (LimitedSessionToken.class) {
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
                    return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\f\u0000\u0001\u0001\r\f\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u000b\u0007\u0208\b\u0208\t\f\n\f\u000b\u1208\u0000\f\u1208\u0001\r\u100a\u0002", (Object[])new Object[]{"bitField0_", "deviceMake_", "deviceModel_", "osVersion_", "idfi_", "sdkVersion_", "sdkVersionName_", "gameId_", "platform_", "mediationProvider_", "customMediationName_", "mediationVersion_", "sessionId_"});
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new LimitedSessionToken();
        }

        @Override
        public String getCustomMediationName() {
            return this.customMediationName_;
        }

        @Override
        public ByteString getCustomMediationNameBytes() {
            return ByteString.copyFromUtf8((String)this.customMediationName_);
        }

        @Override
        public String getDeviceMake() {
            return this.deviceMake_;
        }

        @Override
        public ByteString getDeviceMakeBytes() {
            return ByteString.copyFromUtf8((String)this.deviceMake_);
        }

        @Override
        public String getDeviceModel() {
            return this.deviceModel_;
        }

        @Override
        public ByteString getDeviceModelBytes() {
            return ByteString.copyFromUtf8((String)this.deviceModel_);
        }

        @Override
        public String getGameId() {
            return this.gameId_;
        }

        @Override
        public ByteString getGameIdBytes() {
            return ByteString.copyFromUtf8((String)this.gameId_);
        }

        @Override
        public String getIdfi() {
            return this.idfi_;
        }

        @Override
        public ByteString getIdfiBytes() {
            return ByteString.copyFromUtf8((String)this.idfi_);
        }

        @Override
        public ClientInfoOuterClass.MediationProvider getMediationProvider() {
            ClientInfoOuterClass.MediationProvider mediationProvider;
            ClientInfoOuterClass.MediationProvider mediationProvider2 = mediationProvider = ClientInfoOuterClass.MediationProvider.forNumber(this.mediationProvider_);
            if (mediationProvider == null) {
                mediationProvider2 = ClientInfoOuterClass.MediationProvider.UNRECOGNIZED;
            }
            return mediationProvider2;
        }

        @Override
        public int getMediationProviderValue() {
            return this.mediationProvider_;
        }

        @Override
        public String getMediationVersion() {
            return this.mediationVersion_;
        }

        @Override
        public ByteString getMediationVersionBytes() {
            return ByteString.copyFromUtf8((String)this.mediationVersion_);
        }

        @Override
        public String getOsVersion() {
            return this.osVersion_;
        }

        @Override
        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8((String)this.osVersion_);
        }

        @Override
        public ClientInfoOuterClass.Platform getPlatform() {
            ClientInfoOuterClass.Platform platform;
            ClientInfoOuterClass.Platform platform2 = platform = ClientInfoOuterClass.Platform.forNumber(this.platform_);
            if (platform == null) {
                platform2 = ClientInfoOuterClass.Platform.UNRECOGNIZED;
            }
            return platform2;
        }

        @Override
        public int getPlatformValue() {
            return this.platform_;
        }

        @Override
        public int getSdkVersion() {
            return this.sdkVersion_;
        }

        @Override
        public String getSdkVersionName() {
            return this.sdkVersionName_;
        }

        @Override
        public ByteString getSdkVersionNameBytes() {
            return ByteString.copyFromUtf8((String)this.sdkVersionName_);
        }

        @Override
        public ByteString getSessionId() {
            return this.sessionId_;
        }

        @Override
        public boolean hasCustomMediationName() {
            int n10 = this.bitField0_;
            boolean bl2 = true;
            if ((n10 & 1) == 0) {
                bl2 = false;
            }
            return bl2;
        }

        @Override
        public boolean hasMediationVersion() {
            boolean bl2 = (this.bitField0_ & 2) != 0;
            return bl2;
        }

        @Override
        public boolean hasSessionId() {
            boolean bl2 = (this.bitField0_ & 4) != 0;
            return bl2;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<LimitedSessionToken, Builder>
        implements LimitedSessionTokenOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearCustomMediationName() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearCustomMediationName();
                return this;
            }

            public Builder clearDeviceMake() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearDeviceMake();
                return this;
            }

            public Builder clearDeviceModel() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearDeviceModel();
                return this;
            }

            public Builder clearGameId() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearGameId();
                return this;
            }

            public Builder clearIdfi() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearIdfi();
                return this;
            }

            public Builder clearMediationProvider() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearMediationProvider();
                return this;
            }

            public Builder clearMediationVersion() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearMediationVersion();
                return this;
            }

            public Builder clearOsVersion() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearOsVersion();
                return this;
            }

            public Builder clearPlatform() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearPlatform();
                return this;
            }

            public Builder clearSdkVersion() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearSdkVersion();
                return this;
            }

            public Builder clearSdkVersionName() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearSdkVersionName();
                return this;
            }

            public Builder clearSessionId() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearSessionId();
                return this;
            }

            @Override
            public String getCustomMediationName() {
                return ((LimitedSessionToken)this.instance).getCustomMediationName();
            }

            @Override
            public ByteString getCustomMediationNameBytes() {
                return ((LimitedSessionToken)this.instance).getCustomMediationNameBytes();
            }

            @Override
            public String getDeviceMake() {
                return ((LimitedSessionToken)this.instance).getDeviceMake();
            }

            @Override
            public ByteString getDeviceMakeBytes() {
                return ((LimitedSessionToken)this.instance).getDeviceMakeBytes();
            }

            @Override
            public String getDeviceModel() {
                return ((LimitedSessionToken)this.instance).getDeviceModel();
            }

            @Override
            public ByteString getDeviceModelBytes() {
                return ((LimitedSessionToken)this.instance).getDeviceModelBytes();
            }

            @Override
            public String getGameId() {
                return ((LimitedSessionToken)this.instance).getGameId();
            }

            @Override
            public ByteString getGameIdBytes() {
                return ((LimitedSessionToken)this.instance).getGameIdBytes();
            }

            @Override
            public String getIdfi() {
                return ((LimitedSessionToken)this.instance).getIdfi();
            }

            @Override
            public ByteString getIdfiBytes() {
                return ((LimitedSessionToken)this.instance).getIdfiBytes();
            }

            @Override
            public ClientInfoOuterClass.MediationProvider getMediationProvider() {
                return ((LimitedSessionToken)this.instance).getMediationProvider();
            }

            @Override
            public int getMediationProviderValue() {
                return ((LimitedSessionToken)this.instance).getMediationProviderValue();
            }

            @Override
            public String getMediationVersion() {
                return ((LimitedSessionToken)this.instance).getMediationVersion();
            }

            @Override
            public ByteString getMediationVersionBytes() {
                return ((LimitedSessionToken)this.instance).getMediationVersionBytes();
            }

            @Override
            public String getOsVersion() {
                return ((LimitedSessionToken)this.instance).getOsVersion();
            }

            @Override
            public ByteString getOsVersionBytes() {
                return ((LimitedSessionToken)this.instance).getOsVersionBytes();
            }

            @Override
            public ClientInfoOuterClass.Platform getPlatform() {
                return ((LimitedSessionToken)this.instance).getPlatform();
            }

            @Override
            public int getPlatformValue() {
                return ((LimitedSessionToken)this.instance).getPlatformValue();
            }

            @Override
            public int getSdkVersion() {
                return ((LimitedSessionToken)this.instance).getSdkVersion();
            }

            @Override
            public String getSdkVersionName() {
                return ((LimitedSessionToken)this.instance).getSdkVersionName();
            }

            @Override
            public ByteString getSdkVersionNameBytes() {
                return ((LimitedSessionToken)this.instance).getSdkVersionNameBytes();
            }

            @Override
            public ByteString getSessionId() {
                return ((LimitedSessionToken)this.instance).getSessionId();
            }

            @Override
            public boolean hasCustomMediationName() {
                return ((LimitedSessionToken)this.instance).hasCustomMediationName();
            }

            @Override
            public boolean hasMediationVersion() {
                return ((LimitedSessionToken)this.instance).hasMediationVersion();
            }

            @Override
            public boolean hasSessionId() {
                return ((LimitedSessionToken)this.instance).hasSessionId();
            }

            public Builder setCustomMediationName(String string2) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setCustomMediationName(string2);
                return this;
            }

            public Builder setCustomMediationNameBytes(ByteString byteString) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setCustomMediationNameBytes(byteString);
                return this;
            }

            public Builder setDeviceMake(String string2) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setDeviceMake(string2);
                return this;
            }

            public Builder setDeviceMakeBytes(ByteString byteString) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setDeviceMakeBytes(byteString);
                return this;
            }

            public Builder setDeviceModel(String string2) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setDeviceModel(string2);
                return this;
            }

            public Builder setDeviceModelBytes(ByteString byteString) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setDeviceModelBytes(byteString);
                return this;
            }

            public Builder setGameId(String string2) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setGameId(string2);
                return this;
            }

            public Builder setGameIdBytes(ByteString byteString) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setGameIdBytes(byteString);
                return this;
            }

            public Builder setIdfi(String string2) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setIdfi(string2);
                return this;
            }

            public Builder setIdfiBytes(ByteString byteString) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setIdfiBytes(byteString);
                return this;
            }

            public Builder setMediationProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setMediationProvider(mediationProvider);
                return this;
            }

            public Builder setMediationProviderValue(int n10) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setMediationProviderValue(n10);
                return this;
            }

            public Builder setMediationVersion(String string2) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setMediationVersion(string2);
                return this;
            }

            public Builder setMediationVersionBytes(ByteString byteString) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setMediationVersionBytes(byteString);
                return this;
            }

            public Builder setOsVersion(String string2) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setOsVersion(string2);
                return this;
            }

            public Builder setOsVersionBytes(ByteString byteString) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setOsVersionBytes(byteString);
                return this;
            }

            public Builder setPlatform(ClientInfoOuterClass.Platform platform) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setPlatform(platform);
                return this;
            }

            public Builder setPlatformValue(int n10) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setPlatformValue(n10);
                return this;
            }

            public Builder setSdkVersion(int n10) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setSdkVersion(n10);
                return this;
            }

            public Builder setSdkVersionName(String string2) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setSdkVersionName(string2);
                return this;
            }

            public Builder setSdkVersionNameBytes(ByteString byteString) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setSdkVersionNameBytes(byteString);
                return this;
            }

            public Builder setSessionId(ByteString byteString) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setSessionId(byteString);
                return this;
            }
        }
    }

    public static interface LimitedSessionTokenOrBuilder
    extends MessageLiteOrBuilder {
        public String getCustomMediationName();

        public ByteString getCustomMediationNameBytes();

        public String getDeviceMake();

        public ByteString getDeviceMakeBytes();

        public String getDeviceModel();

        public ByteString getDeviceModelBytes();

        public String getGameId();

        public ByteString getGameIdBytes();

        public String getIdfi();

        public ByteString getIdfiBytes();

        public ClientInfoOuterClass.MediationProvider getMediationProvider();

        public int getMediationProviderValue();

        public String getMediationVersion();

        public ByteString getMediationVersionBytes();

        public String getOsVersion();

        public ByteString getOsVersionBytes();

        public ClientInfoOuterClass.Platform getPlatform();

        public int getPlatformValue();

        public int getSdkVersion();

        public String getSdkVersionName();

        public ByteString getSdkVersionNameBytes();

        public ByteString getSessionId();

        public boolean hasCustomMediationName();

        public boolean hasMediationVersion();

        public boolean hasSessionId();
    }

    public static final class UniversalRequest
    extends GeneratedMessageLite<UniversalRequest, Builder>
    implements UniversalRequestOrBuilder {
        private static final UniversalRequest DEFAULT_INSTANCE;
        private static volatile Parser<UniversalRequest> PARSER;
        public static final int PAYLOAD_FIELD_NUMBER = 2;
        public static final int SHARED_DATA_FIELD_NUMBER = 1;
        private int bitField0_;
        private Payload payload_;
        private SharedData sharedData_;

        static {
            UniversalRequest universalRequest;
            DEFAULT_INSTANCE = universalRequest = new UniversalRequest();
            GeneratedMessageLite.registerDefaultInstance(UniversalRequest.class, (GeneratedMessageLite)universalRequest);
        }

        private UniversalRequest() {
        }

        private void clearPayload() {
            this.payload_ = null;
            this.bitField0_ &= 0xFFFFFFFD;
        }

        private void clearSharedData() {
            this.sharedData_ = null;
            this.bitField0_ &= 0xFFFFFFFE;
        }

        public static UniversalRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergePayload(Payload payload) {
            payload.getClass();
            Payload payload2 = this.payload_;
            this.payload_ = payload2 != null && payload2 != Payload.getDefaultInstance() ? (Payload)((Payload.Builder)Payload.newBuilder(this.payload_).mergeFrom(payload)).buildPartial() : payload;
            this.bitField0_ |= 2;
        }

        private void mergeSharedData(SharedData sharedData) {
            sharedData.getClass();
            SharedData sharedData2 = this.sharedData_;
            this.sharedData_ = sharedData2 != null && sharedData2 != SharedData.getDefaultInstance() ? (SharedData)((SharedData.Builder)SharedData.newBuilder(this.sharedData_).mergeFrom(sharedData)).buildPartial() : sharedData;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(UniversalRequest universalRequest) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(universalRequest);
        }

        public static UniversalRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UniversalRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static UniversalRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UniversalRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static UniversalRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UniversalRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static UniversalRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UniversalRequest parseFrom(InputStream inputStream) throws IOException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static UniversalRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UniversalRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static UniversalRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UniversalRequest parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
        }

        public static UniversalRequest parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<UniversalRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPayload(Payload payload) {
            payload.getClass();
            this.payload_ = payload;
            this.bitField0_ |= 2;
        }

        private void setSharedData(SharedData sharedData) {
            sharedData.getClass();
            this.sharedData_ = sharedData;
            this.bitField0_ |= 1;
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
                    synchronized (UniversalRequest.class) {
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
                    return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", (Object[])new Object[]{"bitField0_", "sharedData_", "payload_"});
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new UniversalRequest();
        }

        @Override
        public Payload getPayload() {
            Payload payload;
            Payload payload2 = payload = this.payload_;
            if (payload == null) {
                payload2 = Payload.getDefaultInstance();
            }
            return payload2;
        }

        @Override
        public SharedData getSharedData() {
            SharedData sharedData;
            SharedData sharedData2 = sharedData = this.sharedData_;
            if (sharedData == null) {
                sharedData2 = SharedData.getDefaultInstance();
            }
            return sharedData2;
        }

        @Override
        public boolean hasPayload() {
            boolean bl2 = (this.bitField0_ & 2) != 0;
            return bl2;
        }

        @Override
        public boolean hasSharedData() {
            int n10 = this.bitField0_;
            boolean bl2 = true;
            if ((n10 & 1) == 0) {
                bl2 = false;
            }
            return bl2;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<UniversalRequest, Builder>
        implements UniversalRequestOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearPayload() {
                this.copyOnWrite();
                ((UniversalRequest)this.instance).clearPayload();
                return this;
            }

            public Builder clearSharedData() {
                this.copyOnWrite();
                ((UniversalRequest)this.instance).clearSharedData();
                return this;
            }

            @Override
            public Payload getPayload() {
                return ((UniversalRequest)this.instance).getPayload();
            }

            @Override
            public SharedData getSharedData() {
                return ((UniversalRequest)this.instance).getSharedData();
            }

            @Override
            public boolean hasPayload() {
                return ((UniversalRequest)this.instance).hasPayload();
            }

            @Override
            public boolean hasSharedData() {
                return ((UniversalRequest)this.instance).hasSharedData();
            }

            public Builder mergePayload(Payload payload) {
                this.copyOnWrite();
                ((UniversalRequest)this.instance).mergePayload(payload);
                return this;
            }

            public Builder mergeSharedData(SharedData sharedData) {
                this.copyOnWrite();
                ((UniversalRequest)this.instance).mergeSharedData(sharedData);
                return this;
            }

            public Builder setPayload(Payload.Builder builder) {
                this.copyOnWrite();
                ((UniversalRequest)this.instance).setPayload((Payload)builder.build());
                return this;
            }

            public Builder setPayload(Payload payload) {
                this.copyOnWrite();
                ((UniversalRequest)this.instance).setPayload(payload);
                return this;
            }

            public Builder setSharedData(SharedData.Builder builder) {
                this.copyOnWrite();
                ((UniversalRequest)this.instance).setSharedData((SharedData)builder.build());
                return this;
            }

            public Builder setSharedData(SharedData sharedData) {
                this.copyOnWrite();
                ((UniversalRequest)this.instance).setSharedData(sharedData);
                return this;
            }
        }

        public static final class Payload
        extends GeneratedMessageLite<Payload, Builder>
        implements PayloadOrBuilder {
            public static final int AD_DATA_REFRESH_REQUEST_FIELD_NUMBER = 9;
            public static final int AD_PLAYER_CONFIG_REQUEST_FIELD_NUMBER = 6;
            public static final int AD_REQUEST_FIELD_NUMBER = 3;
            private static final Payload DEFAULT_INSTANCE;
            public static final int DIAGNOSTIC_EVENT_REQUEST_FIELD_NUMBER = 5;
            public static final int GET_TOKEN_EVENT_REQUEST_FIELD_NUMBER = 7;
            public static final int INITIALIZATION_COMPLETED_EVENT_REQUEST_FIELD_NUMBER = 10;
            public static final int INITIALIZATION_REQUEST_FIELD_NUMBER = 2;
            public static final int OPERATIVE_EVENT_FIELD_NUMBER = 4;
            private static volatile Parser<Payload> PARSER;
            public static final int PRIVACY_UPDATE_REQUEST_FIELD_NUMBER = 8;
            public static final int TRANSACTION_EVENT_REQUEST_FIELD_NUMBER = 11;
            private int valueCase_ = 0;
            private Object value_;

            static {
                Payload payload;
                DEFAULT_INSTANCE = payload = new Payload();
                GeneratedMessageLite.registerDefaultInstance(Payload.class, (GeneratedMessageLite)payload);
            }

            private Payload() {
            }

            private void clearAdDataRefreshRequest() {
                if (this.valueCase_ == 9) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearAdPlayerConfigRequest() {
                if (this.valueCase_ == 6) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearAdRequest() {
                if (this.valueCase_ == 3) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearDiagnosticEventRequest() {
                if (this.valueCase_ == 5) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearGetTokenEventRequest() {
                if (this.valueCase_ == 7) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearInitializationCompletedEventRequest() {
                if (this.valueCase_ == 10) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearInitializationRequest() {
                if (this.valueCase_ == 2) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearOperativeEvent() {
                if (this.valueCase_ == 4) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearPrivacyUpdateRequest() {
                if (this.valueCase_ == 8) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearTransactionEventRequest() {
                if (this.valueCase_ == 11) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearValue() {
                this.valueCase_ = 0;
                this.value_ = null;
            }

            public static Payload getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                adDataRefreshRequest.getClass();
                this.value_ = this.valueCase_ == 9 && this.value_ != AdDataRefreshRequestOuterClass.AdDataRefreshRequest.getDefaultInstance() ? ((AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder)AdDataRefreshRequestOuterClass.AdDataRefreshRequest.newBuilder((AdDataRefreshRequestOuterClass.AdDataRefreshRequest)this.value_).mergeFrom(adDataRefreshRequest)).buildPartial() : adDataRefreshRequest;
                this.valueCase_ = 9;
            }

            private void mergeAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                adPlayerConfigRequest.getClass();
                this.value_ = this.valueCase_ == 6 && this.value_ != AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.getDefaultInstance() ? ((AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder)AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.newBuilder((AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest)this.value_).mergeFrom(adPlayerConfigRequest)).buildPartial() : adPlayerConfigRequest;
                this.valueCase_ = 6;
            }

            private void mergeAdRequest(AdRequestOuterClass.AdRequest adRequest) {
                adRequest.getClass();
                this.value_ = this.valueCase_ == 3 && this.value_ != AdRequestOuterClass.AdRequest.getDefaultInstance() ? ((AdRequestOuterClass.AdRequest.Builder)AdRequestOuterClass.AdRequest.newBuilder((AdRequestOuterClass.AdRequest)this.value_).mergeFrom(adRequest)).buildPartial() : adRequest;
                this.valueCase_ = 3;
            }

            private void mergeDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                diagnosticEventRequest.getClass();
                this.value_ = this.valueCase_ == 5 && this.value_ != DiagnosticEventRequestOuterClass.DiagnosticEventRequest.getDefaultInstance() ? ((DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder)DiagnosticEventRequestOuterClass.DiagnosticEventRequest.newBuilder((DiagnosticEventRequestOuterClass.DiagnosticEventRequest)this.value_).mergeFrom(diagnosticEventRequest)).buildPartial() : diagnosticEventRequest;
                this.valueCase_ = 5;
            }

            private void mergeGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                getTokenEventRequest.getClass();
                this.value_ = this.valueCase_ == 7 && this.value_ != GetTokenEventRequestOuterClass.GetTokenEventRequest.getDefaultInstance() ? ((GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder)GetTokenEventRequestOuterClass.GetTokenEventRequest.newBuilder((GetTokenEventRequestOuterClass.GetTokenEventRequest)this.value_).mergeFrom(getTokenEventRequest)).buildPartial() : getTokenEventRequest;
                this.valueCase_ = 7;
            }

            private void mergeInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                initializationCompletedEventRequest.getClass();
                this.value_ = this.valueCase_ == 10 && this.value_ != InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getDefaultInstance() ? ((InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder)InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder((InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest)this.value_).mergeFrom(initializationCompletedEventRequest)).buildPartial() : initializationCompletedEventRequest;
                this.valueCase_ = 10;
            }

            private void mergeInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                initializationRequest.getClass();
                this.value_ = this.valueCase_ == 2 && this.value_ != InitializationRequestOuterClass.InitializationRequest.getDefaultInstance() ? ((InitializationRequestOuterClass.InitializationRequest.Builder)InitializationRequestOuterClass.InitializationRequest.newBuilder((InitializationRequestOuterClass.InitializationRequest)this.value_).mergeFrom(initializationRequest)).buildPartial() : initializationRequest;
                this.valueCase_ = 2;
            }

            private void mergeOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                operativeEventRequest.getClass();
                this.value_ = this.valueCase_ == 4 && this.value_ != OperativeEventRequestOuterClass.OperativeEventRequest.getDefaultInstance() ? ((OperativeEventRequestOuterClass.OperativeEventRequest.Builder)OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder((OperativeEventRequestOuterClass.OperativeEventRequest)this.value_).mergeFrom(operativeEventRequest)).buildPartial() : operativeEventRequest;
                this.valueCase_ = 4;
            }

            private void mergePrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                privacyUpdateRequest.getClass();
                this.value_ = this.valueCase_ == 8 && this.value_ != PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.getDefaultInstance() ? ((PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder)PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder((PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest)this.value_).mergeFrom(privacyUpdateRequest)).buildPartial() : privacyUpdateRequest;
                this.valueCase_ = 8;
            }

            private void mergeTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                transactionEventRequest.getClass();
                this.value_ = this.valueCase_ == 11 && this.value_ != TransactionEventRequestOuterClass.TransactionEventRequest.getDefaultInstance() ? ((TransactionEventRequestOuterClass.TransactionEventRequest.Builder)TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder((TransactionEventRequestOuterClass.TransactionEventRequest)this.value_).mergeFrom(transactionEventRequest)).buildPartial() : transactionEventRequest;
                this.valueCase_ = 11;
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Payload payload) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(payload);
            }

            public static Payload parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Payload)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Payload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Payload)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Payload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
            }

            public static Payload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Payload parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Payload)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
            }

            public static Payload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Payload)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Payload parseFrom(InputStream inputStream) throws IOException {
                return (Payload)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Payload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Payload)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Payload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
            }

            public static Payload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Payload parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
            }

            public static Payload parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Parser<Payload> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                adDataRefreshRequest.getClass();
                this.value_ = adDataRefreshRequest;
                this.valueCase_ = 9;
            }

            private void setAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                adPlayerConfigRequest.getClass();
                this.value_ = adPlayerConfigRequest;
                this.valueCase_ = 6;
            }

            private void setAdRequest(AdRequestOuterClass.AdRequest adRequest) {
                adRequest.getClass();
                this.value_ = adRequest;
                this.valueCase_ = 3;
            }

            private void setDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                diagnosticEventRequest.getClass();
                this.value_ = diagnosticEventRequest;
                this.valueCase_ = 5;
            }

            private void setGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                getTokenEventRequest.getClass();
                this.value_ = getTokenEventRequest;
                this.valueCase_ = 7;
            }

            private void setInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                initializationCompletedEventRequest.getClass();
                this.value_ = initializationCompletedEventRequest;
                this.valueCase_ = 10;
            }

            private void setInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                initializationRequest.getClass();
                this.value_ = initializationRequest;
                this.valueCase_ = 2;
            }

            private void setOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                operativeEventRequest.getClass();
                this.value_ = operativeEventRequest;
                this.valueCase_ = 4;
            }

            private void setPrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                privacyUpdateRequest.getClass();
                this.value_ = privacyUpdateRequest;
                this.valueCase_ = 8;
            }

            private void setTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                transactionEventRequest.getClass();
                this.value_ = transactionEventRequest;
                this.valueCase_ = 11;
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
                        synchronized (Payload.class) {
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
                        return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\n\u0001\u0000\u0002\u000b\n\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", (Object[])new Object[]{"value_", "valueCase_", InitializationRequestOuterClass.InitializationRequest.class, AdRequestOuterClass.AdRequest.class, OperativeEventRequestOuterClass.OperativeEventRequest.class, DiagnosticEventRequestOuterClass.DiagnosticEventRequest.class, AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.class, GetTokenEventRequestOuterClass.GetTokenEventRequest.class, PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.class, AdDataRefreshRequestOuterClass.AdDataRefreshRequest.class, InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.class, TransactionEventRequestOuterClass.TransactionEventRequest.class});
                    }
                    case 2: {
                        return new Builder();
                    }
                    case 1: 
                }
                return new Payload();
            }

            @Override
            public AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest() {
                if (this.valueCase_ == 9) {
                    return (AdDataRefreshRequestOuterClass.AdDataRefreshRequest)this.value_;
                }
                return AdDataRefreshRequestOuterClass.AdDataRefreshRequest.getDefaultInstance();
            }

            @Override
            public AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest() {
                if (this.valueCase_ == 6) {
                    return (AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest)this.value_;
                }
                return AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.getDefaultInstance();
            }

            @Override
            public AdRequestOuterClass.AdRequest getAdRequest() {
                if (this.valueCase_ == 3) {
                    return (AdRequestOuterClass.AdRequest)this.value_;
                }
                return AdRequestOuterClass.AdRequest.getDefaultInstance();
            }

            @Override
            public DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest() {
                if (this.valueCase_ == 5) {
                    return (DiagnosticEventRequestOuterClass.DiagnosticEventRequest)this.value_;
                }
                return DiagnosticEventRequestOuterClass.DiagnosticEventRequest.getDefaultInstance();
            }

            @Override
            public GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest() {
                if (this.valueCase_ == 7) {
                    return (GetTokenEventRequestOuterClass.GetTokenEventRequest)this.value_;
                }
                return GetTokenEventRequestOuterClass.GetTokenEventRequest.getDefaultInstance();
            }

            @Override
            public InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                if (this.valueCase_ == 10) {
                    return (InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest)this.value_;
                }
                return InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getDefaultInstance();
            }

            @Override
            public InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                if (this.valueCase_ == 2) {
                    return (InitializationRequestOuterClass.InitializationRequest)this.value_;
                }
                return InitializationRequestOuterClass.InitializationRequest.getDefaultInstance();
            }

            @Override
            public OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent() {
                if (this.valueCase_ == 4) {
                    return (OperativeEventRequestOuterClass.OperativeEventRequest)this.value_;
                }
                return OperativeEventRequestOuterClass.OperativeEventRequest.getDefaultInstance();
            }

            @Override
            public PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest() {
                if (this.valueCase_ == 8) {
                    return (PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest)this.value_;
                }
                return PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.getDefaultInstance();
            }

            @Override
            public TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest() {
                if (this.valueCase_ == 11) {
                    return (TransactionEventRequestOuterClass.TransactionEventRequest)this.value_;
                }
                return TransactionEventRequestOuterClass.TransactionEventRequest.getDefaultInstance();
            }

            @Override
            public ValueCase getValueCase() {
                return ValueCase.forNumber(this.valueCase_);
            }

            @Override
            public boolean hasAdDataRefreshRequest() {
                boolean bl2 = this.valueCase_ == 9;
                return bl2;
            }

            @Override
            public boolean hasAdPlayerConfigRequest() {
                boolean bl2 = this.valueCase_ == 6;
                return bl2;
            }

            @Override
            public boolean hasAdRequest() {
                boolean bl2 = this.valueCase_ == 3;
                return bl2;
            }

            @Override
            public boolean hasDiagnosticEventRequest() {
                boolean bl2 = this.valueCase_ == 5;
                return bl2;
            }

            @Override
            public boolean hasGetTokenEventRequest() {
                boolean bl2 = this.valueCase_ == 7;
                return bl2;
            }

            @Override
            public boolean hasInitializationCompletedEventRequest() {
                boolean bl2 = this.valueCase_ == 10;
                return bl2;
            }

            @Override
            public boolean hasInitializationRequest() {
                boolean bl2 = this.valueCase_ == 2;
                return bl2;
            }

            @Override
            public boolean hasOperativeEvent() {
                boolean bl2 = this.valueCase_ == 4;
                return bl2;
            }

            @Override
            public boolean hasPrivacyUpdateRequest() {
                boolean bl2 = this.valueCase_ == 8;
                return bl2;
            }

            @Override
            public boolean hasTransactionEventRequest() {
                boolean bl2 = this.valueCase_ == 11;
                return bl2;
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<Payload, Builder>
            implements PayloadOrBuilder {
                private Builder() {
                    super((GeneratedMessageLite)DEFAULT_INSTANCE);
                }

                public Builder clearAdDataRefreshRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearAdDataRefreshRequest();
                    return this;
                }

                public Builder clearAdPlayerConfigRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearAdPlayerConfigRequest();
                    return this;
                }

                public Builder clearAdRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearAdRequest();
                    return this;
                }

                public Builder clearDiagnosticEventRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearDiagnosticEventRequest();
                    return this;
                }

                public Builder clearGetTokenEventRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearGetTokenEventRequest();
                    return this;
                }

                public Builder clearInitializationCompletedEventRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearInitializationCompletedEventRequest();
                    return this;
                }

                public Builder clearInitializationRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearInitializationRequest();
                    return this;
                }

                public Builder clearOperativeEvent() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearOperativeEvent();
                    return this;
                }

                public Builder clearPrivacyUpdateRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearPrivacyUpdateRequest();
                    return this;
                }

                public Builder clearTransactionEventRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearTransactionEventRequest();
                    return this;
                }

                public Builder clearValue() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearValue();
                    return this;
                }

                @Override
                public AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest() {
                    return ((Payload)this.instance).getAdDataRefreshRequest();
                }

                @Override
                public AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest() {
                    return ((Payload)this.instance).getAdPlayerConfigRequest();
                }

                @Override
                public AdRequestOuterClass.AdRequest getAdRequest() {
                    return ((Payload)this.instance).getAdRequest();
                }

                @Override
                public DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest() {
                    return ((Payload)this.instance).getDiagnosticEventRequest();
                }

                @Override
                public GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest() {
                    return ((Payload)this.instance).getGetTokenEventRequest();
                }

                @Override
                public InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                    return ((Payload)this.instance).getInitializationCompletedEventRequest();
                }

                @Override
                public InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                    return ((Payload)this.instance).getInitializationRequest();
                }

                @Override
                public OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent() {
                    return ((Payload)this.instance).getOperativeEvent();
                }

                @Override
                public PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest() {
                    return ((Payload)this.instance).getPrivacyUpdateRequest();
                }

                @Override
                public TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest() {
                    return ((Payload)this.instance).getTransactionEventRequest();
                }

                @Override
                public ValueCase getValueCase() {
                    return ((Payload)this.instance).getValueCase();
                }

                @Override
                public boolean hasAdDataRefreshRequest() {
                    return ((Payload)this.instance).hasAdDataRefreshRequest();
                }

                @Override
                public boolean hasAdPlayerConfigRequest() {
                    return ((Payload)this.instance).hasAdPlayerConfigRequest();
                }

                @Override
                public boolean hasAdRequest() {
                    return ((Payload)this.instance).hasAdRequest();
                }

                @Override
                public boolean hasDiagnosticEventRequest() {
                    return ((Payload)this.instance).hasDiagnosticEventRequest();
                }

                @Override
                public boolean hasGetTokenEventRequest() {
                    return ((Payload)this.instance).hasGetTokenEventRequest();
                }

                @Override
                public boolean hasInitializationCompletedEventRequest() {
                    return ((Payload)this.instance).hasInitializationCompletedEventRequest();
                }

                @Override
                public boolean hasInitializationRequest() {
                    return ((Payload)this.instance).hasInitializationRequest();
                }

                @Override
                public boolean hasOperativeEvent() {
                    return ((Payload)this.instance).hasOperativeEvent();
                }

                @Override
                public boolean hasPrivacyUpdateRequest() {
                    return ((Payload)this.instance).hasPrivacyUpdateRequest();
                }

                @Override
                public boolean hasTransactionEventRequest() {
                    return ((Payload)this.instance).hasTransactionEventRequest();
                }

                public Builder mergeAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeAdDataRefreshRequest(adDataRefreshRequest);
                    return this;
                }

                public Builder mergeAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeAdPlayerConfigRequest(adPlayerConfigRequest);
                    return this;
                }

                public Builder mergeAdRequest(AdRequestOuterClass.AdRequest adRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeAdRequest(adRequest);
                    return this;
                }

                public Builder mergeDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeDiagnosticEventRequest(diagnosticEventRequest);
                    return this;
                }

                public Builder mergeGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeGetTokenEventRequest(getTokenEventRequest);
                    return this;
                }

                public Builder mergeInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeInitializationCompletedEventRequest(initializationCompletedEventRequest);
                    return this;
                }

                public Builder mergeInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeInitializationRequest(initializationRequest);
                    return this;
                }

                public Builder mergeOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeOperativeEvent(operativeEventRequest);
                    return this;
                }

                public Builder mergePrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergePrivacyUpdateRequest(privacyUpdateRequest);
                    return this;
                }

                public Builder mergeTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeTransactionEventRequest(transactionEventRequest);
                    return this;
                }

                public Builder setAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder builder) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdDataRefreshRequest((AdDataRefreshRequestOuterClass.AdDataRefreshRequest)builder.build());
                    return this;
                }

                public Builder setAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdDataRefreshRequest(adDataRefreshRequest);
                    return this;
                }

                public Builder setAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdPlayerConfigRequest((AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest)builder.build());
                    return this;
                }

                public Builder setAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdPlayerConfigRequest(adPlayerConfigRequest);
                    return this;
                }

                public Builder setAdRequest(AdRequestOuterClass.AdRequest.Builder builder) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdRequest((AdRequestOuterClass.AdRequest)builder.build());
                    return this;
                }

                public Builder setAdRequest(AdRequestOuterClass.AdRequest adRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdRequest(adRequest);
                    return this;
                }

                public Builder setDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setDiagnosticEventRequest((DiagnosticEventRequestOuterClass.DiagnosticEventRequest)builder.build());
                    return this;
                }

                public Builder setDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setDiagnosticEventRequest(diagnosticEventRequest);
                    return this;
                }

                public Builder setGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setGetTokenEventRequest((GetTokenEventRequestOuterClass.GetTokenEventRequest)builder.build());
                    return this;
                }

                public Builder setGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setGetTokenEventRequest(getTokenEventRequest);
                    return this;
                }

                public Builder setInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builder) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setInitializationCompletedEventRequest((InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest)builder.build());
                    return this;
                }

                public Builder setInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setInitializationCompletedEventRequest(initializationCompletedEventRequest);
                    return this;
                }

                public Builder setInitializationRequest(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setInitializationRequest((InitializationRequestOuterClass.InitializationRequest)builder.build());
                    return this;
                }

                public Builder setInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setInitializationRequest(initializationRequest);
                    return this;
                }

                public Builder setOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest.Builder builder) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setOperativeEvent((OperativeEventRequestOuterClass.OperativeEventRequest)builder.build());
                    return this;
                }

                public Builder setOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setOperativeEvent(operativeEventRequest);
                    return this;
                }

                public Builder setPrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setPrivacyUpdateRequest((PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest)builder.build());
                    return this;
                }

                public Builder setPrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setPrivacyUpdateRequest(privacyUpdateRequest);
                    return this;
                }

                public Builder setTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setTransactionEventRequest((TransactionEventRequestOuterClass.TransactionEventRequest)builder.build());
                    return this;
                }

                public Builder setTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setTransactionEventRequest(transactionEventRequest);
                    return this;
                }
            }

            public static enum ValueCase {
                INITIALIZATION_REQUEST(2),
                AD_REQUEST(3),
                OPERATIVE_EVENT(4),
                DIAGNOSTIC_EVENT_REQUEST(5),
                AD_PLAYER_CONFIG_REQUEST(6),
                GET_TOKEN_EVENT_REQUEST(7),
                PRIVACY_UPDATE_REQUEST(8),
                AD_DATA_REFRESH_REQUEST(9),
                INITIALIZATION_COMPLETED_EVENT_REQUEST(10),
                TRANSACTION_EVENT_REQUEST(11),
                VALUE_NOT_SET(0);

                private final int value;

                private ValueCase(int n13) {
                    this.value = n13;
                }

                public static ValueCase forNumber(int n10) {
                    if (n10 != 0) {
                        switch (n10) {
                            default: {
                                return null;
                            }
                            case 11: {
                                return TRANSACTION_EVENT_REQUEST;
                            }
                            case 10: {
                                return INITIALIZATION_COMPLETED_EVENT_REQUEST;
                            }
                            case 9: {
                                return AD_DATA_REFRESH_REQUEST;
                            }
                            case 8: {
                                return PRIVACY_UPDATE_REQUEST;
                            }
                            case 7: {
                                return GET_TOKEN_EVENT_REQUEST;
                            }
                            case 6: {
                                return AD_PLAYER_CONFIG_REQUEST;
                            }
                            case 5: {
                                return DIAGNOSTIC_EVENT_REQUEST;
                            }
                            case 4: {
                                return OPERATIVE_EVENT;
                            }
                            case 3: {
                                return AD_REQUEST;
                            }
                            case 2: 
                        }
                        return INITIALIZATION_REQUEST;
                    }
                    return VALUE_NOT_SET;
                }

                public static ValueCase valueOf(String string2) {
                    return Enum.valueOf(ValueCase.class, string2);
                }

                public int getNumber() {
                    return this.value;
                }
            }
        }

        public static interface PayloadOrBuilder
        extends MessageLiteOrBuilder {
            public AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest();

            public AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest();

            public AdRequestOuterClass.AdRequest getAdRequest();

            public DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest();

            public GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest();

            public InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest();

            public InitializationRequestOuterClass.InitializationRequest getInitializationRequest();

            public OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent();

            public PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest();

            public TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest();

            public Payload.ValueCase getValueCase();

            public boolean hasAdDataRefreshRequest();

            public boolean hasAdPlayerConfigRequest();

            public boolean hasAdRequest();

            public boolean hasDiagnosticEventRequest();

            public boolean hasGetTokenEventRequest();

            public boolean hasInitializationCompletedEventRequest();

            public boolean hasInitializationRequest();

            public boolean hasOperativeEvent();

            public boolean hasPrivacyUpdateRequest();

            public boolean hasTransactionEventRequest();
        }

        public static final class SharedData
        extends GeneratedMessageLite<SharedData, Builder>
        implements SharedDataOrBuilder {
            public static final int APP_START_TIME_FIELD_NUMBER = 8;
            public static final int CURRENT_STATE_FIELD_NUMBER = 6;
            private static final SharedData DEFAULT_INSTANCE;
            public static final int DEVELOPER_CONSENT_FIELD_NUMBER = 4;
            public static final int LIMITED_SESSION_TOKEN_FIELD_NUMBER = 10;
            private static volatile Parser<SharedData> PARSER;
            public static final int PII_FIELD_NUMBER = 3;
            public static final int SDK_START_TIME_FIELD_NUMBER = 9;
            public static final int SESSION_TOKEN_FIELD_NUMBER = 1;
            public static final int TEST_DATA_FIELD_NUMBER = 7;
            public static final int TIMESTAMPS_FIELD_NUMBER = 2;
            public static final int WEBVIEW_VERSION_FIELD_NUMBER = 5;
            private Timestamp appStartTime_;
            private int bitField0_;
            private ByteString currentState_;
            private DeveloperConsentOuterClass.DeveloperConsent developerConsent_;
            private LimitedSessionToken limitedSessionToken_;
            private PiiOuterClass.Pii pii_;
            private Timestamp sdkStartTime_;
            private ByteString sessionToken_;
            private TestDataOuterClass.TestData testData_;
            private TimestampsOuterClass.Timestamps timestamps_;
            private int webviewVersion_;

            static {
                SharedData sharedData;
                DEFAULT_INSTANCE = sharedData = new SharedData();
                GeneratedMessageLite.registerDefaultInstance(SharedData.class, (GeneratedMessageLite)sharedData);
            }

            private SharedData() {
                ByteString byteString;
                this.sessionToken_ = byteString = ByteString.EMPTY;
                this.currentState_ = byteString;
            }

            private void clearAppStartTime() {
                this.appStartTime_ = null;
                this.bitField0_ &= 0xFFFFFF7F;
            }

            private void clearCurrentState() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.currentState_ = SharedData.getDefaultInstance().getCurrentState();
            }

            private void clearDeveloperConsent() {
                this.developerConsent_ = null;
                this.bitField0_ &= 0xFFFFFFF7;
            }

            private void clearLimitedSessionToken() {
                this.limitedSessionToken_ = null;
                this.bitField0_ &= 0xFFFFFDFF;
            }

            private void clearPii() {
                this.pii_ = null;
                this.bitField0_ &= 0xFFFFFFFB;
            }

            private void clearSdkStartTime() {
                this.sdkStartTime_ = null;
                this.bitField0_ &= 0xFFFFFEFF;
            }

            private void clearSessionToken() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.sessionToken_ = SharedData.getDefaultInstance().getSessionToken();
            }

            private void clearTestData() {
                this.testData_ = null;
                this.bitField0_ &= 0xFFFFFFBF;
            }

            private void clearTimestamps() {
                this.timestamps_ = null;
                this.bitField0_ &= 0xFFFFFFFD;
            }

            private void clearWebviewVersion() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.webviewVersion_ = 0;
            }

            public static SharedData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeAppStartTime(Timestamp timestamp) {
                timestamp.getClass();
                Timestamp timestamp2 = this.appStartTime_;
                this.appStartTime_ = timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance() ? (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.appStartTime_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
                this.bitField0_ |= 0x80;
            }

            private void mergeDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                developerConsent.getClass();
                DeveloperConsentOuterClass.DeveloperConsent developerConsent2 = this.developerConsent_;
                this.developerConsent_ = developerConsent2 != null && developerConsent2 != DeveloperConsentOuterClass.DeveloperConsent.getDefaultInstance() ? (DeveloperConsentOuterClass.DeveloperConsent)((DeveloperConsentOuterClass.DeveloperConsent.Builder)DeveloperConsentOuterClass.DeveloperConsent.newBuilder(this.developerConsent_).mergeFrom(developerConsent)).buildPartial() : developerConsent;
                this.bitField0_ |= 8;
            }

            private void mergeLimitedSessionToken(LimitedSessionToken limitedSessionToken) {
                limitedSessionToken.getClass();
                LimitedSessionToken limitedSessionToken2 = this.limitedSessionToken_;
                this.limitedSessionToken_ = limitedSessionToken2 != null && limitedSessionToken2 != LimitedSessionToken.getDefaultInstance() ? (LimitedSessionToken)((LimitedSessionToken.Builder)LimitedSessionToken.newBuilder(this.limitedSessionToken_).mergeFrom(limitedSessionToken)).buildPartial() : limitedSessionToken;
                this.bitField0_ |= 0x200;
            }

            private void mergePii(PiiOuterClass.Pii pii) {
                pii.getClass();
                PiiOuterClass.Pii pii2 = this.pii_;
                this.pii_ = pii2 != null && pii2 != PiiOuterClass.Pii.getDefaultInstance() ? (PiiOuterClass.Pii)((PiiOuterClass.Pii.Builder)PiiOuterClass.Pii.newBuilder(this.pii_).mergeFrom(pii)).buildPartial() : pii;
                this.bitField0_ |= 4;
            }

            private void mergeSdkStartTime(Timestamp timestamp) {
                timestamp.getClass();
                Timestamp timestamp2 = this.sdkStartTime_;
                this.sdkStartTime_ = timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance() ? (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.sdkStartTime_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
                this.bitField0_ |= 0x100;
            }

            private void mergeTestData(TestDataOuterClass.TestData testData) {
                testData.getClass();
                TestDataOuterClass.TestData testData2 = this.testData_;
                this.testData_ = testData2 != null && testData2 != TestDataOuterClass.TestData.getDefaultInstance() ? (TestDataOuterClass.TestData)((TestDataOuterClass.TestData.Builder)TestDataOuterClass.TestData.newBuilder(this.testData_).mergeFrom(testData)).buildPartial() : testData;
                this.bitField0_ |= 0x40;
            }

            private void mergeTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                timestamps.getClass();
                TimestampsOuterClass.Timestamps timestamps2 = this.timestamps_;
                this.timestamps_ = timestamps2 != null && timestamps2 != TimestampsOuterClass.Timestamps.getDefaultInstance() ? (TimestampsOuterClass.Timestamps)((TimestampsOuterClass.Timestamps.Builder)TimestampsOuterClass.Timestamps.newBuilder(this.timestamps_).mergeFrom(timestamps)).buildPartial() : timestamps;
                this.bitField0_ |= 2;
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(SharedData sharedData) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(sharedData);
            }

            public static SharedData parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (SharedData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static SharedData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (SharedData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static SharedData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (SharedData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
            }

            public static SharedData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (SharedData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static SharedData parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (SharedData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
            }

            public static SharedData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (SharedData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static SharedData parseFrom(InputStream inputStream) throws IOException {
                return (SharedData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static SharedData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (SharedData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static SharedData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (SharedData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
            }

            public static SharedData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (SharedData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static SharedData parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
                return (SharedData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
            }

            public static SharedData parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (SharedData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Parser<SharedData> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAppStartTime(Timestamp timestamp) {
                timestamp.getClass();
                this.appStartTime_ = timestamp;
                this.bitField0_ |= 0x80;
            }

            private void setCurrentState(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 0x20;
                this.currentState_ = byteString;
            }

            private void setDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                developerConsent.getClass();
                this.developerConsent_ = developerConsent;
                this.bitField0_ |= 8;
            }

            private void setLimitedSessionToken(LimitedSessionToken limitedSessionToken) {
                limitedSessionToken.getClass();
                this.limitedSessionToken_ = limitedSessionToken;
                this.bitField0_ |= 0x200;
            }

            private void setPii(PiiOuterClass.Pii pii) {
                pii.getClass();
                this.pii_ = pii;
                this.bitField0_ |= 4;
            }

            private void setSdkStartTime(Timestamp timestamp) {
                timestamp.getClass();
                this.sdkStartTime_ = timestamp;
                this.bitField0_ |= 0x100;
            }

            private void setSessionToken(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.sessionToken_ = byteString;
            }

            private void setTestData(TestDataOuterClass.TestData testData) {
                testData.getClass();
                this.testData_ = testData;
                this.bitField0_ |= 0x40;
            }

            private void setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                timestamps.getClass();
                this.timestamps_ = timestamps;
                this.bitField0_ |= 2;
            }

            private void setWebviewVersion(int n10) {
                this.bitField0_ |= 0x10;
                this.webviewVersion_ = n10;
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
                        synchronized (SharedData.class) {
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
                        return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1004\u0004\u0006\u100a\u0005\u0007\u1009\u0006\b\u1009\u0007\t\u1009\b\n\u1009\t", (Object[])new Object[]{"bitField0_", "sessionToken_", "timestamps_", "pii_", "developerConsent_", "webviewVersion_", "currentState_", "testData_", "appStartTime_", "sdkStartTime_", "limitedSessionToken_"});
                    }
                    case 2: {
                        return new Builder();
                    }
                    case 1: 
                }
                return new SharedData();
            }

            @Override
            public Timestamp getAppStartTime() {
                Timestamp timestamp;
                Timestamp timestamp2 = timestamp = this.appStartTime_;
                if (timestamp == null) {
                    timestamp2 = Timestamp.getDefaultInstance();
                }
                return timestamp2;
            }

            @Override
            public ByteString getCurrentState() {
                return this.currentState_;
            }

            @Override
            public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
                DeveloperConsentOuterClass.DeveloperConsent developerConsent;
                DeveloperConsentOuterClass.DeveloperConsent developerConsent2 = developerConsent = this.developerConsent_;
                if (developerConsent == null) {
                    developerConsent2 = DeveloperConsentOuterClass.DeveloperConsent.getDefaultInstance();
                }
                return developerConsent2;
            }

            @Override
            public LimitedSessionToken getLimitedSessionToken() {
                LimitedSessionToken limitedSessionToken;
                LimitedSessionToken limitedSessionToken2 = limitedSessionToken = this.limitedSessionToken_;
                if (limitedSessionToken == null) {
                    limitedSessionToken2 = LimitedSessionToken.getDefaultInstance();
                }
                return limitedSessionToken2;
            }

            @Override
            public PiiOuterClass.Pii getPii() {
                PiiOuterClass.Pii pii;
                PiiOuterClass.Pii pii2 = pii = this.pii_;
                if (pii == null) {
                    pii2 = PiiOuterClass.Pii.getDefaultInstance();
                }
                return pii2;
            }

            @Override
            public Timestamp getSdkStartTime() {
                Timestamp timestamp;
                Timestamp timestamp2 = timestamp = this.sdkStartTime_;
                if (timestamp == null) {
                    timestamp2 = Timestamp.getDefaultInstance();
                }
                return timestamp2;
            }

            @Override
            public ByteString getSessionToken() {
                return this.sessionToken_;
            }

            @Override
            public TestDataOuterClass.TestData getTestData() {
                TestDataOuterClass.TestData testData;
                TestDataOuterClass.TestData testData2 = testData = this.testData_;
                if (testData == null) {
                    testData2 = TestDataOuterClass.TestData.getDefaultInstance();
                }
                return testData2;
            }

            @Override
            public TimestampsOuterClass.Timestamps getTimestamps() {
                TimestampsOuterClass.Timestamps timestamps;
                TimestampsOuterClass.Timestamps timestamps2 = timestamps = this.timestamps_;
                if (timestamps == null) {
                    timestamps2 = TimestampsOuterClass.Timestamps.getDefaultInstance();
                }
                return timestamps2;
            }

            @Override
            public int getWebviewVersion() {
                return this.webviewVersion_;
            }

            @Override
            public boolean hasAppStartTime() {
                boolean bl2 = (this.bitField0_ & 0x80) != 0;
                return bl2;
            }

            @Override
            public boolean hasCurrentState() {
                boolean bl2 = (this.bitField0_ & 0x20) != 0;
                return bl2;
            }

            @Override
            public boolean hasDeveloperConsent() {
                boolean bl2 = (this.bitField0_ & 8) != 0;
                return bl2;
            }

            @Override
            public boolean hasLimitedSessionToken() {
                boolean bl2 = (this.bitField0_ & 0x200) != 0;
                return bl2;
            }

            @Override
            public boolean hasPii() {
                boolean bl2 = (this.bitField0_ & 4) != 0;
                return bl2;
            }

            @Override
            public boolean hasSdkStartTime() {
                boolean bl2 = (this.bitField0_ & 0x100) != 0;
                return bl2;
            }

            @Override
            public boolean hasSessionToken() {
                int n10 = this.bitField0_;
                boolean bl2 = true;
                if ((n10 & 1) == 0) {
                    bl2 = false;
                }
                return bl2;
            }

            @Override
            public boolean hasTestData() {
                boolean bl2 = (this.bitField0_ & 0x40) != 0;
                return bl2;
            }

            @Override
            public boolean hasTimestamps() {
                boolean bl2 = (this.bitField0_ & 2) != 0;
                return bl2;
            }

            @Override
            public boolean hasWebviewVersion() {
                boolean bl2 = (this.bitField0_ & 0x10) != 0;
                return bl2;
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<SharedData, Builder>
            implements SharedDataOrBuilder {
                private Builder() {
                    super((GeneratedMessageLite)DEFAULT_INSTANCE);
                }

                public Builder clearAppStartTime() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearAppStartTime();
                    return this;
                }

                public Builder clearCurrentState() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearCurrentState();
                    return this;
                }

                public Builder clearDeveloperConsent() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearDeveloperConsent();
                    return this;
                }

                public Builder clearLimitedSessionToken() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearLimitedSessionToken();
                    return this;
                }

                public Builder clearPii() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearPii();
                    return this;
                }

                public Builder clearSdkStartTime() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearSdkStartTime();
                    return this;
                }

                public Builder clearSessionToken() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearSessionToken();
                    return this;
                }

                public Builder clearTestData() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearTestData();
                    return this;
                }

                public Builder clearTimestamps() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearTimestamps();
                    return this;
                }

                public Builder clearWebviewVersion() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearWebviewVersion();
                    return this;
                }

                @Override
                public Timestamp getAppStartTime() {
                    return ((SharedData)this.instance).getAppStartTime();
                }

                @Override
                public ByteString getCurrentState() {
                    return ((SharedData)this.instance).getCurrentState();
                }

                @Override
                public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
                    return ((SharedData)this.instance).getDeveloperConsent();
                }

                @Override
                public LimitedSessionToken getLimitedSessionToken() {
                    return ((SharedData)this.instance).getLimitedSessionToken();
                }

                @Override
                public PiiOuterClass.Pii getPii() {
                    return ((SharedData)this.instance).getPii();
                }

                @Override
                public Timestamp getSdkStartTime() {
                    return ((SharedData)this.instance).getSdkStartTime();
                }

                @Override
                public ByteString getSessionToken() {
                    return ((SharedData)this.instance).getSessionToken();
                }

                @Override
                public TestDataOuterClass.TestData getTestData() {
                    return ((SharedData)this.instance).getTestData();
                }

                @Override
                public TimestampsOuterClass.Timestamps getTimestamps() {
                    return ((SharedData)this.instance).getTimestamps();
                }

                @Override
                public int getWebviewVersion() {
                    return ((SharedData)this.instance).getWebviewVersion();
                }

                @Override
                public boolean hasAppStartTime() {
                    return ((SharedData)this.instance).hasAppStartTime();
                }

                @Override
                public boolean hasCurrentState() {
                    return ((SharedData)this.instance).hasCurrentState();
                }

                @Override
                public boolean hasDeveloperConsent() {
                    return ((SharedData)this.instance).hasDeveloperConsent();
                }

                @Override
                public boolean hasLimitedSessionToken() {
                    return ((SharedData)this.instance).hasLimitedSessionToken();
                }

                @Override
                public boolean hasPii() {
                    return ((SharedData)this.instance).hasPii();
                }

                @Override
                public boolean hasSdkStartTime() {
                    return ((SharedData)this.instance).hasSdkStartTime();
                }

                @Override
                public boolean hasSessionToken() {
                    return ((SharedData)this.instance).hasSessionToken();
                }

                @Override
                public boolean hasTestData() {
                    return ((SharedData)this.instance).hasTestData();
                }

                @Override
                public boolean hasTimestamps() {
                    return ((SharedData)this.instance).hasTimestamps();
                }

                @Override
                public boolean hasWebviewVersion() {
                    return ((SharedData)this.instance).hasWebviewVersion();
                }

                public Builder mergeAppStartTime(Timestamp timestamp) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).mergeAppStartTime(timestamp);
                    return this;
                }

                public Builder mergeDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).mergeDeveloperConsent(developerConsent);
                    return this;
                }

                public Builder mergeLimitedSessionToken(LimitedSessionToken limitedSessionToken) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).mergeLimitedSessionToken(limitedSessionToken);
                    return this;
                }

                public Builder mergePii(PiiOuterClass.Pii pii) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).mergePii(pii);
                    return this;
                }

                public Builder mergeSdkStartTime(Timestamp timestamp) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).mergeSdkStartTime(timestamp);
                    return this;
                }

                public Builder mergeTestData(TestDataOuterClass.TestData testData) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).mergeTestData(testData);
                    return this;
                }

                public Builder mergeTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).mergeTimestamps(timestamps);
                    return this;
                }

                public Builder setAppStartTime(Timestamp.Builder builder) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setAppStartTime((Timestamp)builder.build());
                    return this;
                }

                public Builder setAppStartTime(Timestamp timestamp) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setAppStartTime(timestamp);
                    return this;
                }

                public Builder setCurrentState(ByteString byteString) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setCurrentState(byteString);
                    return this;
                }

                public Builder setDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent.Builder builder) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setDeveloperConsent((DeveloperConsentOuterClass.DeveloperConsent)builder.build());
                    return this;
                }

                public Builder setDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setDeveloperConsent(developerConsent);
                    return this;
                }

                public Builder setLimitedSessionToken(LimitedSessionToken.Builder builder) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setLimitedSessionToken((LimitedSessionToken)builder.build());
                    return this;
                }

                public Builder setLimitedSessionToken(LimitedSessionToken limitedSessionToken) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setLimitedSessionToken(limitedSessionToken);
                    return this;
                }

                public Builder setPii(PiiOuterClass.Pii.Builder builder) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setPii((PiiOuterClass.Pii)builder.build());
                    return this;
                }

                public Builder setPii(PiiOuterClass.Pii pii) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setPii(pii);
                    return this;
                }

                public Builder setSdkStartTime(Timestamp.Builder builder) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setSdkStartTime((Timestamp)builder.build());
                    return this;
                }

                public Builder setSdkStartTime(Timestamp timestamp) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setSdkStartTime(timestamp);
                    return this;
                }

                public Builder setSessionToken(ByteString byteString) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setSessionToken(byteString);
                    return this;
                }

                public Builder setTestData(TestDataOuterClass.TestData.Builder builder) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setTestData((TestDataOuterClass.TestData)builder.build());
                    return this;
                }

                public Builder setTestData(TestDataOuterClass.TestData testData) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setTestData(testData);
                    return this;
                }

                public Builder setTimestamps(TimestampsOuterClass.Timestamps.Builder builder) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setTimestamps((TimestampsOuterClass.Timestamps)builder.build());
                    return this;
                }

                public Builder setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setTimestamps(timestamps);
                    return this;
                }

                public Builder setWebviewVersion(int n10) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setWebviewVersion(n10);
                    return this;
                }
            }
        }

        public static interface SharedDataOrBuilder
        extends MessageLiteOrBuilder {
            public Timestamp getAppStartTime();

            public ByteString getCurrentState();

            public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent();

            public LimitedSessionToken getLimitedSessionToken();

            public PiiOuterClass.Pii getPii();

            public Timestamp getSdkStartTime();

            public ByteString getSessionToken();

            public TestDataOuterClass.TestData getTestData();

            public TimestampsOuterClass.Timestamps getTimestamps();

            public int getWebviewVersion();

            public boolean hasAppStartTime();

            public boolean hasCurrentState();

            public boolean hasDeveloperConsent();

            public boolean hasLimitedSessionToken();

            public boolean hasPii();

            public boolean hasSdkStartTime();

            public boolean hasSessionToken();

            public boolean hasTestData();

            public boolean hasTimestamps();

            public boolean hasWebviewVersion();
        }
    }

    public static interface UniversalRequestOrBuilder
    extends MessageLiteOrBuilder {
        public UniversalRequest.Payload getPayload();

        public UniversalRequest.SharedData getSharedData();

        public boolean hasPayload();

        public boolean hasSharedData();
    }
}


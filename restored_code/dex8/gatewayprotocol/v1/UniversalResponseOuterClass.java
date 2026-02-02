/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 */
package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UniversalResponseOuterClass {
    private UniversalResponseOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static final class UniversalResponse
    extends GeneratedMessageLite<UniversalResponse, Builder>
    implements UniversalResponseOrBuilder {
        private static final UniversalResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int MUTABLE_DATA_FIELD_NUMBER = 2;
        private static volatile Parser<UniversalResponse> PARSER;
        public static final int PAYLOAD_FIELD_NUMBER = 1;
        private int bitField0_;
        private ErrorOuterClass.Error error_;
        private MutableDataOuterClass.MutableData mutableData_;
        private Payload payload_;

        static {
            UniversalResponse universalResponse;
            DEFAULT_INSTANCE = universalResponse = new UniversalResponse();
            GeneratedMessageLite.registerDefaultInstance(UniversalResponse.class, (GeneratedMessageLite)universalResponse);
        }

        private UniversalResponse() {
        }

        private void clearError() {
            this.error_ = null;
            this.bitField0_ &= 0xFFFFFFFB;
        }

        private void clearMutableData() {
            this.mutableData_ = null;
            this.bitField0_ &= 0xFFFFFFFD;
        }

        private void clearPayload() {
            this.payload_ = null;
            this.bitField0_ &= 0xFFFFFFFE;
        }

        public static UniversalResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeError(ErrorOuterClass.Error error) {
            error.getClass();
            ErrorOuterClass.Error error2 = this.error_;
            this.error_ = error2 != null && error2 != ErrorOuterClass.Error.getDefaultInstance() ? (ErrorOuterClass.Error)((ErrorOuterClass.Error.Builder)ErrorOuterClass.Error.newBuilder(this.error_).mergeFrom(error)).buildPartial() : error;
            this.bitField0_ |= 4;
        }

        private void mergeMutableData(MutableDataOuterClass.MutableData mutableData) {
            mutableData.getClass();
            MutableDataOuterClass.MutableData mutableData2 = this.mutableData_;
            this.mutableData_ = mutableData2 != null && mutableData2 != MutableDataOuterClass.MutableData.getDefaultInstance() ? (MutableDataOuterClass.MutableData)((MutableDataOuterClass.MutableData.Builder)MutableDataOuterClass.MutableData.newBuilder(this.mutableData_).mergeFrom(mutableData)).buildPartial() : mutableData;
            this.bitField0_ |= 2;
        }

        private void mergePayload(Payload payload) {
            payload.getClass();
            Payload payload2 = this.payload_;
            this.payload_ = payload2 != null && payload2 != Payload.getDefaultInstance() ? (Payload)((Payload.Builder)Payload.newBuilder(this.payload_).mergeFrom(payload)).buildPartial() : payload;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(UniversalResponse universalResponse) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(universalResponse);
        }

        public static UniversalResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UniversalResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static UniversalResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static UniversalResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static UniversalResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(InputStream inputStream) throws IOException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static UniversalResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static UniversalResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
        }

        public static UniversalResponse parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<UniversalResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 4;
        }

        private void setMutableData(MutableDataOuterClass.MutableData mutableData) {
            mutableData.getClass();
            this.mutableData_ = mutableData;
            this.bitField0_ |= 2;
        }

        private void setPayload(Payload payload) {
            payload.getClass();
            this.payload_ = payload;
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
                    synchronized (UniversalResponse.class) {
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
                    return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002", (Object[])new Object[]{"bitField0_", "payload_", "mutableData_", "error_"});
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new UniversalResponse();
        }

        @Override
        public ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error;
            ErrorOuterClass.Error error2 = error = this.error_;
            if (error == null) {
                error2 = ErrorOuterClass.Error.getDefaultInstance();
            }
            return error2;
        }

        @Override
        public MutableDataOuterClass.MutableData getMutableData() {
            MutableDataOuterClass.MutableData mutableData;
            MutableDataOuterClass.MutableData mutableData2 = mutableData = this.mutableData_;
            if (mutableData == null) {
                mutableData2 = MutableDataOuterClass.MutableData.getDefaultInstance();
            }
            return mutableData2;
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
        public boolean hasError() {
            boolean bl2 = (this.bitField0_ & 4) != 0;
            return bl2;
        }

        @Override
        public boolean hasMutableData() {
            boolean bl2 = (this.bitField0_ & 2) != 0;
            return bl2;
        }

        @Override
        public boolean hasPayload() {
            int n10 = this.bitField0_;
            boolean bl2 = true;
            if ((n10 & 1) == 0) {
                bl2 = false;
            }
            return bl2;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<UniversalResponse, Builder>
        implements UniversalResponseOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearError() {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).clearError();
                return this;
            }

            public Builder clearMutableData() {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).clearMutableData();
                return this;
            }

            public Builder clearPayload() {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).clearPayload();
                return this;
            }

            @Override
            public ErrorOuterClass.Error getError() {
                return ((UniversalResponse)this.instance).getError();
            }

            @Override
            public MutableDataOuterClass.MutableData getMutableData() {
                return ((UniversalResponse)this.instance).getMutableData();
            }

            @Override
            public Payload getPayload() {
                return ((UniversalResponse)this.instance).getPayload();
            }

            @Override
            public boolean hasError() {
                return ((UniversalResponse)this.instance).hasError();
            }

            @Override
            public boolean hasMutableData() {
                return ((UniversalResponse)this.instance).hasMutableData();
            }

            @Override
            public boolean hasPayload() {
                return ((UniversalResponse)this.instance).hasPayload();
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).mergeError(error);
                return this;
            }

            public Builder mergeMutableData(MutableDataOuterClass.MutableData mutableData) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).mergeMutableData(mutableData);
                return this;
            }

            public Builder mergePayload(Payload payload) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).mergePayload(payload);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).setError((ErrorOuterClass.Error)builder.build());
                return this;
            }

            public Builder setError(ErrorOuterClass.Error error) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).setError(error);
                return this;
            }

            public Builder setMutableData(MutableDataOuterClass.MutableData.Builder builder) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).setMutableData((MutableDataOuterClass.MutableData)builder.build());
                return this;
            }

            public Builder setMutableData(MutableDataOuterClass.MutableData mutableData) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).setMutableData(mutableData);
                return this;
            }

            public Builder setPayload(Payload.Builder builder) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).setPayload((Payload)builder.build());
                return this;
            }

            public Builder setPayload(Payload payload) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).setPayload(payload);
                return this;
            }
        }

        public static final class Payload
        extends GeneratedMessageLite<Payload, Builder>
        implements PayloadOrBuilder {
            public static final int AD_DATA_REFRESH_RESPONSE_FIELD_NUMBER = 4;
            public static final int AD_PLAYER_CONFIG_RESPONSE_FIELD_NUMBER = 3;
            public static final int AD_RESPONSE_FIELD_NUMBER = 2;
            private static final Payload DEFAULT_INSTANCE;
            public static final int INITIALIZATION_RESPONSE_FIELD_NUMBER = 1;
            private static volatile Parser<Payload> PARSER;
            public static final int PRIVACY_UPDATE_RESPONSE_FIELD_NUMBER = 5;
            private int valueCase_ = 0;
            private Object value_;

            static {
                Payload payload;
                DEFAULT_INSTANCE = payload = new Payload();
                GeneratedMessageLite.registerDefaultInstance(Payload.class, (GeneratedMessageLite)payload);
            }

            private Payload() {
            }

            private void clearAdDataRefreshResponse() {
                if (this.valueCase_ == 4) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearAdPlayerConfigResponse() {
                if (this.valueCase_ == 3) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearAdResponse() {
                if (this.valueCase_ == 2) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearInitializationResponse() {
                if (this.valueCase_ == 1) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearPrivacyUpdateResponse() {
                if (this.valueCase_ == 5) {
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

            private void mergeAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                adDataRefreshResponse.getClass();
                this.value_ = this.valueCase_ == 4 && this.value_ != AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getDefaultInstance() ? ((AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder)AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder((AdDataRefreshResponseOuterClass.AdDataRefreshResponse)this.value_).mergeFrom(adDataRefreshResponse)).buildPartial() : adDataRefreshResponse;
                this.valueCase_ = 4;
            }

            private void mergeAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                adPlayerConfigResponse.getClass();
                this.value_ = this.valueCase_ == 3 && this.value_ != AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.getDefaultInstance() ? ((AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder)AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.newBuilder((AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse)this.value_).mergeFrom(adPlayerConfigResponse)).buildPartial() : adPlayerConfigResponse;
                this.valueCase_ = 3;
            }

            private void mergeAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                adResponse.getClass();
                this.value_ = this.valueCase_ == 2 && this.value_ != AdResponseOuterClass.AdResponse.getDefaultInstance() ? ((AdResponseOuterClass.AdResponse.Builder)AdResponseOuterClass.AdResponse.newBuilder((AdResponseOuterClass.AdResponse)this.value_).mergeFrom(adResponse)).buildPartial() : adResponse;
                this.valueCase_ = 2;
            }

            private void mergeInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                initializationResponse.getClass();
                this.value_ = this.valueCase_ == 1 && this.value_ != InitializationResponseOuterClass.InitializationResponse.getDefaultInstance() ? ((InitializationResponseOuterClass.InitializationResponse.Builder)InitializationResponseOuterClass.InitializationResponse.newBuilder((InitializationResponseOuterClass.InitializationResponse)this.value_).mergeFrom(initializationResponse)).buildPartial() : initializationResponse;
                this.valueCase_ = 1;
            }

            private void mergePrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                privacyUpdateResponse.getClass();
                this.value_ = this.valueCase_ == 5 && this.value_ != PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.getDefaultInstance() ? ((PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder)PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.newBuilder((PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse)this.value_).mergeFrom(privacyUpdateResponse)).buildPartial() : privacyUpdateResponse;
                this.valueCase_ = 5;
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

            private void setAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                adDataRefreshResponse.getClass();
                this.value_ = adDataRefreshResponse;
                this.valueCase_ = 4;
            }

            private void setAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                adPlayerConfigResponse.getClass();
                this.value_ = adPlayerConfigResponse;
                this.valueCase_ = 3;
            }

            private void setAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                adResponse.getClass();
                this.value_ = adResponse;
                this.valueCase_ = 2;
            }

            private void setInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                initializationResponse.getClass();
                this.value_ = initializationResponse;
                this.valueCase_ = 1;
            }

            private void setPrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                privacyUpdateResponse.getClass();
                this.value_ = privacyUpdateResponse;
                this.valueCase_ = 5;
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
                        return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", (Object[])new Object[]{"value_", "valueCase_", InitializationResponseOuterClass.InitializationResponse.class, AdResponseOuterClass.AdResponse.class, AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.class, AdDataRefreshResponseOuterClass.AdDataRefreshResponse.class, PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.class});
                    }
                    case 2: {
                        return new Builder();
                    }
                    case 1: 
                }
                return new Payload();
            }

            @Override
            public AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse() {
                if (this.valueCase_ == 4) {
                    return (AdDataRefreshResponseOuterClass.AdDataRefreshResponse)this.value_;
                }
                return AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getDefaultInstance();
            }

            @Override
            public AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse() {
                if (this.valueCase_ == 3) {
                    return (AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse)this.value_;
                }
                return AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.getDefaultInstance();
            }

            @Override
            public AdResponseOuterClass.AdResponse getAdResponse() {
                if (this.valueCase_ == 2) {
                    return (AdResponseOuterClass.AdResponse)this.value_;
                }
                return AdResponseOuterClass.AdResponse.getDefaultInstance();
            }

            @Override
            public InitializationResponseOuterClass.InitializationResponse getInitializationResponse() {
                if (this.valueCase_ == 1) {
                    return (InitializationResponseOuterClass.InitializationResponse)this.value_;
                }
                return InitializationResponseOuterClass.InitializationResponse.getDefaultInstance();
            }

            @Override
            public PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse() {
                if (this.valueCase_ == 5) {
                    return (PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse)this.value_;
                }
                return PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.getDefaultInstance();
            }

            @Override
            public ValueCase getValueCase() {
                return ValueCase.forNumber(this.valueCase_);
            }

            @Override
            public boolean hasAdDataRefreshResponse() {
                boolean bl2 = this.valueCase_ == 4;
                return bl2;
            }

            @Override
            public boolean hasAdPlayerConfigResponse() {
                boolean bl2 = this.valueCase_ == 3;
                return bl2;
            }

            @Override
            public boolean hasAdResponse() {
                boolean bl2 = this.valueCase_ == 2;
                return bl2;
            }

            @Override
            public boolean hasInitializationResponse() {
                int n10 = this.valueCase_;
                boolean bl2 = true;
                if (n10 != 1) {
                    bl2 = false;
                }
                return bl2;
            }

            @Override
            public boolean hasPrivacyUpdateResponse() {
                boolean bl2 = this.valueCase_ == 5;
                return bl2;
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<Payload, Builder>
            implements PayloadOrBuilder {
                private Builder() {
                    super((GeneratedMessageLite)DEFAULT_INSTANCE);
                }

                public Builder clearAdDataRefreshResponse() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearAdDataRefreshResponse();
                    return this;
                }

                public Builder clearAdPlayerConfigResponse() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearAdPlayerConfigResponse();
                    return this;
                }

                public Builder clearAdResponse() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearAdResponse();
                    return this;
                }

                public Builder clearInitializationResponse() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearInitializationResponse();
                    return this;
                }

                public Builder clearPrivacyUpdateResponse() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearPrivacyUpdateResponse();
                    return this;
                }

                public Builder clearValue() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearValue();
                    return this;
                }

                @Override
                public AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse() {
                    return ((Payload)this.instance).getAdDataRefreshResponse();
                }

                @Override
                public AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse() {
                    return ((Payload)this.instance).getAdPlayerConfigResponse();
                }

                @Override
                public AdResponseOuterClass.AdResponse getAdResponse() {
                    return ((Payload)this.instance).getAdResponse();
                }

                @Override
                public InitializationResponseOuterClass.InitializationResponse getInitializationResponse() {
                    return ((Payload)this.instance).getInitializationResponse();
                }

                @Override
                public PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse() {
                    return ((Payload)this.instance).getPrivacyUpdateResponse();
                }

                @Override
                public ValueCase getValueCase() {
                    return ((Payload)this.instance).getValueCase();
                }

                @Override
                public boolean hasAdDataRefreshResponse() {
                    return ((Payload)this.instance).hasAdDataRefreshResponse();
                }

                @Override
                public boolean hasAdPlayerConfigResponse() {
                    return ((Payload)this.instance).hasAdPlayerConfigResponse();
                }

                @Override
                public boolean hasAdResponse() {
                    return ((Payload)this.instance).hasAdResponse();
                }

                @Override
                public boolean hasInitializationResponse() {
                    return ((Payload)this.instance).hasInitializationResponse();
                }

                @Override
                public boolean hasPrivacyUpdateResponse() {
                    return ((Payload)this.instance).hasPrivacyUpdateResponse();
                }

                public Builder mergeAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeAdDataRefreshResponse(adDataRefreshResponse);
                    return this;
                }

                public Builder mergeAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeAdPlayerConfigResponse(adPlayerConfigResponse);
                    return this;
                }

                public Builder mergeAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeAdResponse(adResponse);
                    return this;
                }

                public Builder mergeInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeInitializationResponse(initializationResponse);
                    return this;
                }

                public Builder mergePrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergePrivacyUpdateResponse(privacyUpdateResponse);
                    return this;
                }

                public Builder setAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdDataRefreshResponse((AdDataRefreshResponseOuterClass.AdDataRefreshResponse)builder.build());
                    return this;
                }

                public Builder setAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdDataRefreshResponse(adDataRefreshResponse);
                    return this;
                }

                public Builder setAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder builder) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdPlayerConfigResponse((AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse)builder.build());
                    return this;
                }

                public Builder setAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdPlayerConfigResponse(adPlayerConfigResponse);
                    return this;
                }

                public Builder setAdResponse(AdResponseOuterClass.AdResponse.Builder builder) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdResponse((AdResponseOuterClass.AdResponse)builder.build());
                    return this;
                }

                public Builder setAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdResponse(adResponse);
                    return this;
                }

                public Builder setInitializationResponse(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setInitializationResponse((InitializationResponseOuterClass.InitializationResponse)builder.build());
                    return this;
                }

                public Builder setInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setInitializationResponse(initializationResponse);
                    return this;
                }

                public Builder setPrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setPrivacyUpdateResponse((PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse)builder.build());
                    return this;
                }

                public Builder setPrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setPrivacyUpdateResponse(privacyUpdateResponse);
                    return this;
                }
            }

            public static enum ValueCase {
                INITIALIZATION_RESPONSE(1),
                AD_RESPONSE(2),
                AD_PLAYER_CONFIG_RESPONSE(3),
                AD_DATA_REFRESH_RESPONSE(4),
                PRIVACY_UPDATE_RESPONSE(5),
                VALUE_NOT_SET(0);

                private final int value;

                private ValueCase(int n13) {
                    this.value = n13;
                }

                public static ValueCase forNumber(int n10) {
                    if (n10 != 0) {
                        if (n10 != 1) {
                            if (n10 != 2) {
                                if (n10 != 3) {
                                    if (n10 != 4) {
                                        if (n10 != 5) {
                                            return null;
                                        }
                                        return PRIVACY_UPDATE_RESPONSE;
                                    }
                                    return AD_DATA_REFRESH_RESPONSE;
                                }
                                return AD_PLAYER_CONFIG_RESPONSE;
                            }
                            return AD_RESPONSE;
                        }
                        return INITIALIZATION_RESPONSE;
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
            public AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse();

            public AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse();

            public AdResponseOuterClass.AdResponse getAdResponse();

            public InitializationResponseOuterClass.InitializationResponse getInitializationResponse();

            public PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse();

            public Payload.ValueCase getValueCase();

            public boolean hasAdDataRefreshResponse();

            public boolean hasAdPlayerConfigResponse();

            public boolean hasAdResponse();

            public boolean hasInitializationResponse();

            public boolean hasPrivacyUpdateResponse();
        }
    }

    public static interface UniversalResponseOrBuilder
    extends MessageLiteOrBuilder {
        public ErrorOuterClass.Error getError();

        public MutableDataOuterClass.MutableData getMutableData();

        public UniversalResponse.Payload getPayload();

        public boolean hasError();

        public boolean hasMutableData();

        public boolean hasPayload();
    }
}


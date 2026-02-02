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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class PrivacyUpdateResponseOuterClass {
    private PrivacyUpdateResponseOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static final class PrivacyUpdateResponse
    extends GeneratedMessageLite<PrivacyUpdateResponse, Builder>
    implements PrivacyUpdateResponseOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 2;
        private static final PrivacyUpdateResponse DEFAULT_INSTANCE;
        private static volatile Parser<PrivacyUpdateResponse> PARSER;
        public static final int VERSION_FIELD_NUMBER = 1;
        private ByteString content_ = ByteString.EMPTY;
        private int version_;

        static {
            PrivacyUpdateResponse privacyUpdateResponse;
            DEFAULT_INSTANCE = privacyUpdateResponse = new PrivacyUpdateResponse();
            GeneratedMessageLite.registerDefaultInstance(PrivacyUpdateResponse.class, (GeneratedMessageLite)privacyUpdateResponse);
        }

        private PrivacyUpdateResponse() {
        }

        private void clearContent() {
            this.content_ = PrivacyUpdateResponse.getDefaultInstance().getContent();
        }

        private void clearVersion() {
            this.version_ = 0;
        }

        public static PrivacyUpdateResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PrivacyUpdateResponse privacyUpdateResponse) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(privacyUpdateResponse);
        }

        public static PrivacyUpdateResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static PrivacyUpdateResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static PrivacyUpdateResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static PrivacyUpdateResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static PrivacyUpdateResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static PrivacyUpdateResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static PrivacyUpdateResponse parseFrom(InputStream inputStream) throws IOException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static PrivacyUpdateResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static PrivacyUpdateResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static PrivacyUpdateResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static PrivacyUpdateResponse parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
        }

        public static PrivacyUpdateResponse parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<PrivacyUpdateResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setContent(ByteString byteString) {
            byteString.getClass();
            this.content_ = byteString;
        }

        private void setVersion(int n10) {
            this.version_ = n10;
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
                    synchronized (PrivacyUpdateResponse.class) {
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
                    return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", (Object[])new Object[]{"version_", "content_"});
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new PrivacyUpdateResponse();
        }

        @Override
        public ByteString getContent() {
            return this.content_;
        }

        @Override
        public int getVersion() {
            return this.version_;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<PrivacyUpdateResponse, Builder>
        implements PrivacyUpdateResponseOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearContent() {
                this.copyOnWrite();
                ((PrivacyUpdateResponse)this.instance).clearContent();
                return this;
            }

            public Builder clearVersion() {
                this.copyOnWrite();
                ((PrivacyUpdateResponse)this.instance).clearVersion();
                return this;
            }

            @Override
            public ByteString getContent() {
                return ((PrivacyUpdateResponse)this.instance).getContent();
            }

            @Override
            public int getVersion() {
                return ((PrivacyUpdateResponse)this.instance).getVersion();
            }

            public Builder setContent(ByteString byteString) {
                this.copyOnWrite();
                ((PrivacyUpdateResponse)this.instance).setContent(byteString);
                return this;
            }

            public Builder setVersion(int n10) {
                this.copyOnWrite();
                ((PrivacyUpdateResponse)this.instance).setVersion(n10);
                return this;
            }
        }
    }

    public static interface PrivacyUpdateResponseOrBuilder
    extends MessageLiteOrBuilder {
        public ByteString getContent();

        public int getVersion();
    }
}


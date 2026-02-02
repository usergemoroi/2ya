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
 *  com.google.protobuf.Internal$ProtobufList
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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class WebviewConfiguration {
    private WebviewConfiguration() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static final class WebViewConfiguration
    extends GeneratedMessageLite<WebViewConfiguration, Builder>
    implements WebViewConfigurationOrBuilder {
        public static final int ADDITIONAL_FILES_FIELD_NUMBER = 3;
        private static final WebViewConfiguration DEFAULT_INSTANCE;
        public static final int ENTRY_POINT_FIELD_NUMBER = 2;
        private static volatile Parser<WebViewConfiguration> PARSER;
        public static final int TYPE_FIELD_NUMBER = 4;
        public static final int VERSION_FIELD_NUMBER = 1;
        private Internal.ProtobufList<String> additionalFiles_ = GeneratedMessageLite.emptyProtobufList();
        private String entryPoint_ = "";
        private String type_ = "";
        private int version_;

        static {
            WebViewConfiguration webViewConfiguration;
            DEFAULT_INSTANCE = webViewConfiguration = new WebViewConfiguration();
            GeneratedMessageLite.registerDefaultInstance(WebViewConfiguration.class, (GeneratedMessageLite)webViewConfiguration);
        }

        private WebViewConfiguration() {
        }

        private void addAdditionalFiles(String string2) {
            string2.getClass();
            this.ensureAdditionalFilesIsMutable();
            this.additionalFiles_.add(string2);
        }

        private void addAdditionalFilesBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureAdditionalFilesIsMutable();
            this.additionalFiles_.add(byteString.toStringUtf8());
        }

        private void addAllAdditionalFiles(Iterable<String> iterable) {
            this.ensureAdditionalFilesIsMutable();
            AbstractMessageLite.addAll(iterable, this.additionalFiles_);
        }

        private void clearAdditionalFiles() {
            this.additionalFiles_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearEntryPoint() {
            this.entryPoint_ = WebViewConfiguration.getDefaultInstance().getEntryPoint();
        }

        private void clearType() {
            this.type_ = WebViewConfiguration.getDefaultInstance().getType();
        }

        private void clearVersion() {
            this.version_ = 0;
        }

        private void ensureAdditionalFilesIsMutable() {
            Internal.ProtobufList<String> protobufList = this.additionalFiles_;
            if (!protobufList.isModifiable()) {
                this.additionalFiles_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static WebViewConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(WebViewConfiguration webViewConfiguration) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(webViewConfiguration);
        }

        public static WebViewConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (WebViewConfiguration)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static WebViewConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WebViewConfiguration)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static WebViewConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static WebViewConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static WebViewConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static WebViewConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static WebViewConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static WebViewConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static WebViewConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static WebViewConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static WebViewConfiguration parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
        }

        public static WebViewConfiguration parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WebViewConfiguration)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<WebViewConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdditionalFiles(int n10, String string2) {
            string2.getClass();
            this.ensureAdditionalFilesIsMutable();
            this.additionalFiles_.set(n10, string2);
        }

        private void setEntryPoint(String string2) {
            string2.getClass();
            this.entryPoint_ = string2;
        }

        private void setEntryPointBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.entryPoint_ = byteString.toStringUtf8();
        }

        private void setType(String string2) {
            string2.getClass();
            this.type_ = string2;
        }

        private void setTypeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.type_ = byteString.toStringUtf8();
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
                    synchronized (WebViewConfiguration.class) {
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
                    return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002\u0208\u0003\u021a\u0004\u0208", (Object[])new Object[]{"version_", "entryPoint_", "additionalFiles_", "type_"});
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new WebViewConfiguration();
        }

        @Override
        public String getAdditionalFiles(int n10) {
            return (String)this.additionalFiles_.get(n10);
        }

        @Override
        public ByteString getAdditionalFilesBytes(int n10) {
            return ByteString.copyFromUtf8((String)((String)this.additionalFiles_.get(n10)));
        }

        @Override
        public int getAdditionalFilesCount() {
            return this.additionalFiles_.size();
        }

        @Override
        public List<String> getAdditionalFilesList() {
            return this.additionalFiles_;
        }

        @Override
        public String getEntryPoint() {
            return this.entryPoint_;
        }

        @Override
        public ByteString getEntryPointBytes() {
            return ByteString.copyFromUtf8((String)this.entryPoint_);
        }

        @Override
        public String getType() {
            return this.type_;
        }

        @Override
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8((String)this.type_);
        }

        @Override
        public int getVersion() {
            return this.version_;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<WebViewConfiguration, Builder>
        implements WebViewConfigurationOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder addAdditionalFiles(String string2) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).addAdditionalFiles(string2);
                return this;
            }

            public Builder addAdditionalFilesBytes(ByteString byteString) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).addAdditionalFilesBytes(byteString);
                return this;
            }

            public Builder addAllAdditionalFiles(Iterable<String> iterable) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).addAllAdditionalFiles(iterable);
                return this;
            }

            public Builder clearAdditionalFiles() {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).clearAdditionalFiles();
                return this;
            }

            public Builder clearEntryPoint() {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).clearEntryPoint();
                return this;
            }

            public Builder clearType() {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).clearType();
                return this;
            }

            public Builder clearVersion() {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).clearVersion();
                return this;
            }

            @Override
            public String getAdditionalFiles(int n10) {
                return ((WebViewConfiguration)this.instance).getAdditionalFiles(n10);
            }

            @Override
            public ByteString getAdditionalFilesBytes(int n10) {
                return ((WebViewConfiguration)this.instance).getAdditionalFilesBytes(n10);
            }

            @Override
            public int getAdditionalFilesCount() {
                return ((WebViewConfiguration)this.instance).getAdditionalFilesCount();
            }

            @Override
            public List<String> getAdditionalFilesList() {
                return Collections.unmodifiableList(((WebViewConfiguration)this.instance).getAdditionalFilesList());
            }

            @Override
            public String getEntryPoint() {
                return ((WebViewConfiguration)this.instance).getEntryPoint();
            }

            @Override
            public ByteString getEntryPointBytes() {
                return ((WebViewConfiguration)this.instance).getEntryPointBytes();
            }

            @Override
            public String getType() {
                return ((WebViewConfiguration)this.instance).getType();
            }

            @Override
            public ByteString getTypeBytes() {
                return ((WebViewConfiguration)this.instance).getTypeBytes();
            }

            @Override
            public int getVersion() {
                return ((WebViewConfiguration)this.instance).getVersion();
            }

            public Builder setAdditionalFiles(int n10, String string2) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).setAdditionalFiles(n10, string2);
                return this;
            }

            public Builder setEntryPoint(String string2) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).setEntryPoint(string2);
                return this;
            }

            public Builder setEntryPointBytes(ByteString byteString) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).setEntryPointBytes(byteString);
                return this;
            }

            public Builder setType(String string2) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).setType(string2);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).setTypeBytes(byteString);
                return this;
            }

            public Builder setVersion(int n10) {
                this.copyOnWrite();
                ((WebViewConfiguration)this.instance).setVersion(n10);
                return this;
            }
        }
    }

    public static interface WebViewConfigurationOrBuilder
    extends MessageLiteOrBuilder {
        public String getAdditionalFiles(int var1);

        public ByteString getAdditionalFilesBytes(int var1);

        public int getAdditionalFilesCount();

        public List<String> getAdditionalFilesList();

        public String getEntryPoint();

        public ByteString getEntryPointBytes();

        public String getType();

        public ByteString getTypeBytes();

        public int getVersion();
    }
}


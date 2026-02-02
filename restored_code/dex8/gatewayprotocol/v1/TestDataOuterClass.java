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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class TestDataOuterClass {
    private TestDataOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static final class TestData
    extends GeneratedMessageLite<TestData, Builder>
    implements TestDataOrBuilder {
        private static final TestData DEFAULT_INSTANCE;
        public static final int FORCE_CAMPAIGN_ID_FIELD_NUMBER = 1;
        public static final int FORCE_COUNTRY_FIELD_NUMBER = 2;
        public static final int FORCE_COUNTRY_SUBDIVISION_FIELD_NUMBER = 3;
        public static final int FORCE_EXCHANGE_TEST_MODE_FIELD_NUMBER = 4;
        private static volatile Parser<TestData> PARSER;
        private int bitField0_;
        private String forceCampaignId_ = "";
        private String forceCountrySubdivision_ = "";
        private String forceCountry_ = "";
        private int forceExchangeTestMode_;

        static {
            TestData testData;
            DEFAULT_INSTANCE = testData = new TestData();
            GeneratedMessageLite.registerDefaultInstance(TestData.class, (GeneratedMessageLite)testData);
        }

        private TestData() {
        }

        private void clearForceCampaignId() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.forceCampaignId_ = TestData.getDefaultInstance().getForceCampaignId();
        }

        private void clearForceCountry() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.forceCountry_ = TestData.getDefaultInstance().getForceCountry();
        }

        private void clearForceCountrySubdivision() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.forceCountrySubdivision_ = TestData.getDefaultInstance().getForceCountrySubdivision();
        }

        private void clearForceExchangeTestMode() {
            this.bitField0_ &= 0xFFFFFFF7;
            this.forceExchangeTestMode_ = 0;
        }

        public static TestData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(TestData testData) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(testData);
        }

        public static TestData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TestData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static TestData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TestData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static TestData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static TestData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static TestData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static TestData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static TestData parseFrom(InputStream inputStream) throws IOException {
            return (TestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static TestData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static TestData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static TestData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static TestData parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
            return (TestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
        }

        public static TestData parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<TestData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setForceCampaignId(String string2) {
            string2.getClass();
            this.bitField0_ |= 1;
            this.forceCampaignId_ = string2;
        }

        private void setForceCampaignIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.forceCampaignId_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setForceCountry(String string2) {
            string2.getClass();
            this.bitField0_ |= 2;
            this.forceCountry_ = string2;
        }

        private void setForceCountryBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.forceCountry_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setForceCountrySubdivision(String string2) {
            string2.getClass();
            this.bitField0_ |= 4;
            this.forceCountrySubdivision_ = string2;
        }

        private void setForceCountrySubdivisionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.forceCountrySubdivision_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        private void setForceExchangeTestMode(int n10) {
            this.bitField0_ |= 8;
            this.forceExchangeTestMode_ = n10;
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
                    synchronized (TestData.class) {
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
                    return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1208\u0000\u0002\u1208\u0001\u0003\u1208\u0002\u0004\u100b\u0003", (Object[])new Object[]{"bitField0_", "forceCampaignId_", "forceCountry_", "forceCountrySubdivision_", "forceExchangeTestMode_"});
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new TestData();
        }

        @Override
        public String getForceCampaignId() {
            return this.forceCampaignId_;
        }

        @Override
        public ByteString getForceCampaignIdBytes() {
            return ByteString.copyFromUtf8((String)this.forceCampaignId_);
        }

        @Override
        public String getForceCountry() {
            return this.forceCountry_;
        }

        @Override
        public ByteString getForceCountryBytes() {
            return ByteString.copyFromUtf8((String)this.forceCountry_);
        }

        @Override
        public String getForceCountrySubdivision() {
            return this.forceCountrySubdivision_;
        }

        @Override
        public ByteString getForceCountrySubdivisionBytes() {
            return ByteString.copyFromUtf8((String)this.forceCountrySubdivision_);
        }

        @Override
        public int getForceExchangeTestMode() {
            return this.forceExchangeTestMode_;
        }

        @Override
        public boolean hasForceCampaignId() {
            int n10 = this.bitField0_;
            boolean bl2 = true;
            if ((n10 & 1) == 0) {
                bl2 = false;
            }
            return bl2;
        }

        @Override
        public boolean hasForceCountry() {
            boolean bl2 = (this.bitField0_ & 2) != 0;
            return bl2;
        }

        @Override
        public boolean hasForceCountrySubdivision() {
            boolean bl2 = (this.bitField0_ & 4) != 0;
            return bl2;
        }

        @Override
        public boolean hasForceExchangeTestMode() {
            boolean bl2 = (this.bitField0_ & 8) != 0;
            return bl2;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<TestData, Builder>
        implements TestDataOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearForceCampaignId() {
                this.copyOnWrite();
                ((TestData)this.instance).clearForceCampaignId();
                return this;
            }

            public Builder clearForceCountry() {
                this.copyOnWrite();
                ((TestData)this.instance).clearForceCountry();
                return this;
            }

            public Builder clearForceCountrySubdivision() {
                this.copyOnWrite();
                ((TestData)this.instance).clearForceCountrySubdivision();
                return this;
            }

            public Builder clearForceExchangeTestMode() {
                this.copyOnWrite();
                ((TestData)this.instance).clearForceExchangeTestMode();
                return this;
            }

            @Override
            public String getForceCampaignId() {
                return ((TestData)this.instance).getForceCampaignId();
            }

            @Override
            public ByteString getForceCampaignIdBytes() {
                return ((TestData)this.instance).getForceCampaignIdBytes();
            }

            @Override
            public String getForceCountry() {
                return ((TestData)this.instance).getForceCountry();
            }

            @Override
            public ByteString getForceCountryBytes() {
                return ((TestData)this.instance).getForceCountryBytes();
            }

            @Override
            public String getForceCountrySubdivision() {
                return ((TestData)this.instance).getForceCountrySubdivision();
            }

            @Override
            public ByteString getForceCountrySubdivisionBytes() {
                return ((TestData)this.instance).getForceCountrySubdivisionBytes();
            }

            @Override
            public int getForceExchangeTestMode() {
                return ((TestData)this.instance).getForceExchangeTestMode();
            }

            @Override
            public boolean hasForceCampaignId() {
                return ((TestData)this.instance).hasForceCampaignId();
            }

            @Override
            public boolean hasForceCountry() {
                return ((TestData)this.instance).hasForceCountry();
            }

            @Override
            public boolean hasForceCountrySubdivision() {
                return ((TestData)this.instance).hasForceCountrySubdivision();
            }

            @Override
            public boolean hasForceExchangeTestMode() {
                return ((TestData)this.instance).hasForceExchangeTestMode();
            }

            public Builder setForceCampaignId(String string2) {
                this.copyOnWrite();
                ((TestData)this.instance).setForceCampaignId(string2);
                return this;
            }

            public Builder setForceCampaignIdBytes(ByteString byteString) {
                this.copyOnWrite();
                ((TestData)this.instance).setForceCampaignIdBytes(byteString);
                return this;
            }

            public Builder setForceCountry(String string2) {
                this.copyOnWrite();
                ((TestData)this.instance).setForceCountry(string2);
                return this;
            }

            public Builder setForceCountryBytes(ByteString byteString) {
                this.copyOnWrite();
                ((TestData)this.instance).setForceCountryBytes(byteString);
                return this;
            }

            public Builder setForceCountrySubdivision(String string2) {
                this.copyOnWrite();
                ((TestData)this.instance).setForceCountrySubdivision(string2);
                return this;
            }

            public Builder setForceCountrySubdivisionBytes(ByteString byteString) {
                this.copyOnWrite();
                ((TestData)this.instance).setForceCountrySubdivisionBytes(byteString);
                return this;
            }

            public Builder setForceExchangeTestMode(int n10) {
                this.copyOnWrite();
                ((TestData)this.instance).setForceExchangeTestMode(n10);
                return this;
            }
        }
    }

    public static interface TestDataOrBuilder
    extends MessageLiteOrBuilder {
        public String getForceCampaignId();

        public ByteString getForceCampaignIdBytes();

        public String getForceCountry();

        public ByteString getForceCountryBytes();

        public String getForceCountrySubdivision();

        public ByteString getForceCountrySubdivisionBytes();

        public int getForceExchangeTestMode();

        public boolean hasForceCampaignId();

        public boolean hasForceCountry();

        public boolean hasForceCountrySubdivision();

        public boolean hasForceExchangeTestMode();
    }
}


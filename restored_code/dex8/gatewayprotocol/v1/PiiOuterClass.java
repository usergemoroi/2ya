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

public final class PiiOuterClass {
    private PiiOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static final class Pii
    extends GeneratedMessageLite<Pii, Builder>
    implements PiiOrBuilder {
        public static final int ADVERTISING_ID_FIELD_NUMBER = 1;
        private static final Pii DEFAULT_INSTANCE;
        public static final int FID_FIELD_NUMBER = 4;
        public static final int OPEN_ADVERTISING_TRACKING_ID_FIELD_NUMBER = 3;
        private static volatile Parser<Pii> PARSER;
        public static final int VENDOR_ID_FIELD_NUMBER = 2;
        private ByteString advertisingId_;
        private int bitField0_;
        private String fid_;
        private ByteString openAdvertisingTrackingId_;
        private ByteString vendorId_;

        static {
            Pii pii;
            DEFAULT_INSTANCE = pii = new Pii();
            GeneratedMessageLite.registerDefaultInstance(Pii.class, (GeneratedMessageLite)pii);
        }

        private Pii() {
            ByteString byteString;
            this.advertisingId_ = byteString = ByteString.EMPTY;
            this.vendorId_ = byteString;
            this.openAdvertisingTrackingId_ = byteString;
            this.fid_ = "";
        }

        private void clearAdvertisingId() {
            this.advertisingId_ = Pii.getDefaultInstance().getAdvertisingId();
        }

        private void clearFid() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.fid_ = Pii.getDefaultInstance().getFid();
        }

        private void clearOpenAdvertisingTrackingId() {
            this.openAdvertisingTrackingId_ = Pii.getDefaultInstance().getOpenAdvertisingTrackingId();
        }

        private void clearVendorId() {
            this.vendorId_ = Pii.getDefaultInstance().getVendorId();
        }

        public static Pii getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Pii pii) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(pii);
        }

        public static Pii parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Pii)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Pii parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Pii)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Pii parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Pii)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Pii parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Pii)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Pii parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Pii)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Pii parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Pii)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Pii parseFrom(InputStream inputStream) throws IOException {
            return (Pii)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Pii parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Pii)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Pii parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Pii)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static Pii parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Pii)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Pii parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
            return (Pii)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
        }

        public static Pii parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Pii)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Pii> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdvertisingId(ByteString byteString) {
            byteString.getClass();
            this.advertisingId_ = byteString;
        }

        private void setFid(String string2) {
            string2.getClass();
            this.bitField0_ |= 1;
            this.fid_ = string2;
        }

        private void setFidBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.fid_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setOpenAdvertisingTrackingId(ByteString byteString) {
            byteString.getClass();
            this.openAdvertisingTrackingId_ = byteString;
        }

        private void setVendorId(ByteString byteString) {
            byteString.getClass();
            this.vendorId_ = byteString;
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
                    synchronized (Pii.class) {
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
                    return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\u1208\u0000", (Object[])new Object[]{"bitField0_", "advertisingId_", "vendorId_", "openAdvertisingTrackingId_", "fid_"});
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new Pii();
        }

        @Override
        public ByteString getAdvertisingId() {
            return this.advertisingId_;
        }

        @Override
        public String getFid() {
            return this.fid_;
        }

        @Override
        public ByteString getFidBytes() {
            return ByteString.copyFromUtf8((String)this.fid_);
        }

        @Override
        public ByteString getOpenAdvertisingTrackingId() {
            return this.openAdvertisingTrackingId_;
        }

        @Override
        public ByteString getVendorId() {
            return this.vendorId_;
        }

        @Override
        public boolean hasFid() {
            int n10 = this.bitField0_;
            boolean bl2 = true;
            if ((n10 & 1) == 0) {
                bl2 = false;
            }
            return bl2;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Pii, Builder>
        implements PiiOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearAdvertisingId() {
                this.copyOnWrite();
                ((Pii)this.instance).clearAdvertisingId();
                return this;
            }

            public Builder clearFid() {
                this.copyOnWrite();
                ((Pii)this.instance).clearFid();
                return this;
            }

            public Builder clearOpenAdvertisingTrackingId() {
                this.copyOnWrite();
                ((Pii)this.instance).clearOpenAdvertisingTrackingId();
                return this;
            }

            public Builder clearVendorId() {
                this.copyOnWrite();
                ((Pii)this.instance).clearVendorId();
                return this;
            }

            @Override
            public ByteString getAdvertisingId() {
                return ((Pii)this.instance).getAdvertisingId();
            }

            @Override
            public String getFid() {
                return ((Pii)this.instance).getFid();
            }

            @Override
            public ByteString getFidBytes() {
                return ((Pii)this.instance).getFidBytes();
            }

            @Override
            public ByteString getOpenAdvertisingTrackingId() {
                return ((Pii)this.instance).getOpenAdvertisingTrackingId();
            }

            @Override
            public ByteString getVendorId() {
                return ((Pii)this.instance).getVendorId();
            }

            @Override
            public boolean hasFid() {
                return ((Pii)this.instance).hasFid();
            }

            public Builder setAdvertisingId(ByteString byteString) {
                this.copyOnWrite();
                ((Pii)this.instance).setAdvertisingId(byteString);
                return this;
            }

            public Builder setFid(String string2) {
                this.copyOnWrite();
                ((Pii)this.instance).setFid(string2);
                return this;
            }

            public Builder setFidBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Pii)this.instance).setFidBytes(byteString);
                return this;
            }

            public Builder setOpenAdvertisingTrackingId(ByteString byteString) {
                this.copyOnWrite();
                ((Pii)this.instance).setOpenAdvertisingTrackingId(byteString);
                return this;
            }

            public Builder setVendorId(ByteString byteString) {
                this.copyOnWrite();
                ((Pii)this.instance).setVendorId(byteString);
                return this;
            }
        }
    }

    public static interface PiiOrBuilder
    extends MessageLiteOrBuilder {
        public ByteString getAdvertisingId();

        public String getFid();

        public ByteString getFidBytes();

        public ByteString getOpenAdvertisingTrackingId();

        public ByteString getVendorId();

        public boolean hasFid();
    }
}


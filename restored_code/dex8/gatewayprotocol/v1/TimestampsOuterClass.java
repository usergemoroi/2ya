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
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
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
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class TimestampsOuterClass {
    private TimestampsOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static final class Timestamps
    extends GeneratedMessageLite<Timestamps, Builder>
    implements TimestampsOrBuilder {
        private static final Timestamps DEFAULT_INSTANCE;
        private static volatile Parser<Timestamps> PARSER;
        public static final int SESSION_TIMESTAMP_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private int bitField0_;
        private long sessionTimestamp_;
        private Timestamp timestamp_;

        static {
            Timestamps timestamps;
            DEFAULT_INSTANCE = timestamps = new Timestamps();
            GeneratedMessageLite.registerDefaultInstance(Timestamps.class, (GeneratedMessageLite)timestamps);
        }

        private Timestamps() {
        }

        private void clearSessionTimestamp() {
            this.sessionTimestamp_ = 0L;
        }

        private void clearTimestamp() {
            this.timestamp_ = null;
            this.bitField0_ &= 0xFFFFFFFE;
        }

        public static Timestamps getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.timestamp_;
            this.timestamp_ = timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance() ? (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.timestamp_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Timestamps timestamps) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(timestamps);
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Timestamps)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Timestamps)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Timestamps parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Timestamps)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Timestamps parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Timestamps)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Timestamps parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Timestamps)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Timestamps parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Timestamps)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Timestamps parseFrom(InputStream inputStream) throws IOException {
            return (Timestamps)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Timestamps parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Timestamps)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Timestamps)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Timestamps)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Timestamps parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
            return (Timestamps)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
        }

        public static Timestamps parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Timestamps)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Timestamps> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setSessionTimestamp(long l10) {
            this.sessionTimestamp_ = l10;
        }

        private void setTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            this.timestamp_ = timestamp;
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
                    synchronized (Timestamps.class) {
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
                    return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u0002", (Object[])new Object[]{"bitField0_", "timestamp_", "sessionTimestamp_"});
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new Timestamps();
        }

        @Override
        public long getSessionTimestamp() {
            return this.sessionTimestamp_;
        }

        @Override
        public Timestamp getTimestamp() {
            Timestamp timestamp;
            Timestamp timestamp2 = timestamp = this.timestamp_;
            if (timestamp == null) {
                timestamp2 = Timestamp.getDefaultInstance();
            }
            return timestamp2;
        }

        @Override
        public boolean hasTimestamp() {
            int n10 = this.bitField0_;
            boolean bl2 = true;
            if ((n10 & 1) == 0) {
                bl2 = false;
            }
            return bl2;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Timestamps, Builder>
        implements TimestampsOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearSessionTimestamp() {
                this.copyOnWrite();
                ((Timestamps)this.instance).clearSessionTimestamp();
                return this;
            }

            public Builder clearTimestamp() {
                this.copyOnWrite();
                ((Timestamps)this.instance).clearTimestamp();
                return this;
            }

            @Override
            public long getSessionTimestamp() {
                return ((Timestamps)this.instance).getSessionTimestamp();
            }

            @Override
            public Timestamp getTimestamp() {
                return ((Timestamps)this.instance).getTimestamp();
            }

            @Override
            public boolean hasTimestamp() {
                return ((Timestamps)this.instance).hasTimestamp();
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                this.copyOnWrite();
                ((Timestamps)this.instance).mergeTimestamp(timestamp);
                return this;
            }

            public Builder setSessionTimestamp(long l10) {
                this.copyOnWrite();
                ((Timestamps)this.instance).setSessionTimestamp(l10);
                return this;
            }

            public Builder setTimestamp(Timestamp.Builder builder) {
                this.copyOnWrite();
                ((Timestamps)this.instance).setTimestamp((Timestamp)builder.build());
                return this;
            }

            public Builder setTimestamp(Timestamp timestamp) {
                this.copyOnWrite();
                ((Timestamps)this.instance).setTimestamp(timestamp);
                return this;
            }
        }
    }

    public static interface TimestampsOrBuilder
    extends MessageLiteOrBuilder {
        public long getSessionTimestamp();

        public Timestamp getTimestamp();

        public boolean hasTimestamp();
    }
}


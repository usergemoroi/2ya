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

public final class SessionCountersOuterClass {
    private SessionCountersOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static final class SessionCounters
    extends GeneratedMessageLite<SessionCounters, Builder>
    implements SessionCountersOrBuilder {
        public static final int BANNER_IMPRESSIONS_FIELD_NUMBER = 5;
        public static final int BANNER_LOAD_REQUESTS_FIELD_NUMBER = 3;
        public static final int BANNER_REQUESTS_ADM_FIELD_NUMBER = 4;
        private static final SessionCounters DEFAULT_INSTANCE;
        public static final int FOCUS_CHANGE_COUNT_FIELD_NUMBER = 8;
        public static final int GLOBAL_ADS_FOCUS_CHANGE_COUNT_FIELD_NUMBER = 7;
        public static final int GLOBAL_ADS_FOCUS_TIME_FIELD_NUMBER = 6;
        public static final int LOAD_REQUESTS_ADM_FIELD_NUMBER = 2;
        public static final int LOAD_REQUESTS_FIELD_NUMBER = 1;
        private static volatile Parser<SessionCounters> PARSER;
        private int bannerImpressions_;
        private int bannerLoadRequests_;
        private int bannerRequestsAdm_;
        private int focusChangeCount_;
        private int globalAdsFocusChangeCount_;
        private int globalAdsFocusTime_;
        private int loadRequestsAdm_;
        private int loadRequests_;

        static {
            SessionCounters sessionCounters;
            DEFAULT_INSTANCE = sessionCounters = new SessionCounters();
            GeneratedMessageLite.registerDefaultInstance(SessionCounters.class, (GeneratedMessageLite)sessionCounters);
        }

        private SessionCounters() {
        }

        private void clearBannerImpressions() {
            this.bannerImpressions_ = 0;
        }

        private void clearBannerLoadRequests() {
            this.bannerLoadRequests_ = 0;
        }

        private void clearBannerRequestsAdm() {
            this.bannerRequestsAdm_ = 0;
        }

        private void clearFocusChangeCount() {
            this.focusChangeCount_ = 0;
        }

        private void clearGlobalAdsFocusChangeCount() {
            this.globalAdsFocusChangeCount_ = 0;
        }

        private void clearGlobalAdsFocusTime() {
            this.globalAdsFocusTime_ = 0;
        }

        private void clearLoadRequests() {
            this.loadRequests_ = 0;
        }

        private void clearLoadRequestsAdm() {
            this.loadRequestsAdm_ = 0;
        }

        public static SessionCounters getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(SessionCounters sessionCounters) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(sessionCounters);
        }

        public static SessionCounters parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SessionCounters)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static SessionCounters parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionCounters)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static SessionCounters parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SessionCounters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static SessionCounters parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SessionCounters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static SessionCounters parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SessionCounters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static SessionCounters parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionCounters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static SessionCounters parseFrom(InputStream inputStream) throws IOException {
            return (SessionCounters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static SessionCounters parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionCounters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static SessionCounters parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SessionCounters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static SessionCounters parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SessionCounters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static SessionCounters parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
            return (SessionCounters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
        }

        public static SessionCounters parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SessionCounters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<SessionCounters> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setBannerImpressions(int n10) {
            this.bannerImpressions_ = n10;
        }

        private void setBannerLoadRequests(int n10) {
            this.bannerLoadRequests_ = n10;
        }

        private void setBannerRequestsAdm(int n10) {
            this.bannerRequestsAdm_ = n10;
        }

        private void setFocusChangeCount(int n10) {
            this.focusChangeCount_ = n10;
        }

        private void setGlobalAdsFocusChangeCount(int n10) {
            this.globalAdsFocusChangeCount_ = n10;
        }

        private void setGlobalAdsFocusTime(int n10) {
            this.globalAdsFocusTime_ = n10;
        }

        private void setLoadRequests(int n10) {
            this.loadRequests_ = n10;
        }

        private void setLoadRequestsAdm(int n10) {
            this.loadRequestsAdm_ = n10;
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
                    synchronized (SessionCounters.class) {
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
                    return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004", (Object[])new Object[]{"loadRequests_", "loadRequestsAdm_", "bannerLoadRequests_", "bannerRequestsAdm_", "bannerImpressions_", "globalAdsFocusTime_", "globalAdsFocusChangeCount_", "focusChangeCount_"});
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new SessionCounters();
        }

        @Override
        public int getBannerImpressions() {
            return this.bannerImpressions_;
        }

        @Override
        public int getBannerLoadRequests() {
            return this.bannerLoadRequests_;
        }

        @Override
        public int getBannerRequestsAdm() {
            return this.bannerRequestsAdm_;
        }

        @Override
        public int getFocusChangeCount() {
            return this.focusChangeCount_;
        }

        @Override
        public int getGlobalAdsFocusChangeCount() {
            return this.globalAdsFocusChangeCount_;
        }

        @Override
        public int getGlobalAdsFocusTime() {
            return this.globalAdsFocusTime_;
        }

        @Override
        public int getLoadRequests() {
            return this.loadRequests_;
        }

        @Override
        public int getLoadRequestsAdm() {
            return this.loadRequestsAdm_;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<SessionCounters, Builder>
        implements SessionCountersOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearBannerImpressions() {
                this.copyOnWrite();
                ((SessionCounters)this.instance).clearBannerImpressions();
                return this;
            }

            public Builder clearBannerLoadRequests() {
                this.copyOnWrite();
                ((SessionCounters)this.instance).clearBannerLoadRequests();
                return this;
            }

            public Builder clearBannerRequestsAdm() {
                this.copyOnWrite();
                ((SessionCounters)this.instance).clearBannerRequestsAdm();
                return this;
            }

            public Builder clearFocusChangeCount() {
                this.copyOnWrite();
                ((SessionCounters)this.instance).clearFocusChangeCount();
                return this;
            }

            public Builder clearGlobalAdsFocusChangeCount() {
                this.copyOnWrite();
                ((SessionCounters)this.instance).clearGlobalAdsFocusChangeCount();
                return this;
            }

            public Builder clearGlobalAdsFocusTime() {
                this.copyOnWrite();
                ((SessionCounters)this.instance).clearGlobalAdsFocusTime();
                return this;
            }

            public Builder clearLoadRequests() {
                this.copyOnWrite();
                ((SessionCounters)this.instance).clearLoadRequests();
                return this;
            }

            public Builder clearLoadRequestsAdm() {
                this.copyOnWrite();
                ((SessionCounters)this.instance).clearLoadRequestsAdm();
                return this;
            }

            @Override
            public int getBannerImpressions() {
                return ((SessionCounters)this.instance).getBannerImpressions();
            }

            @Override
            public int getBannerLoadRequests() {
                return ((SessionCounters)this.instance).getBannerLoadRequests();
            }

            @Override
            public int getBannerRequestsAdm() {
                return ((SessionCounters)this.instance).getBannerRequestsAdm();
            }

            @Override
            public int getFocusChangeCount() {
                return ((SessionCounters)this.instance).getFocusChangeCount();
            }

            @Override
            public int getGlobalAdsFocusChangeCount() {
                return ((SessionCounters)this.instance).getGlobalAdsFocusChangeCount();
            }

            @Override
            public int getGlobalAdsFocusTime() {
                return ((SessionCounters)this.instance).getGlobalAdsFocusTime();
            }

            @Override
            public int getLoadRequests() {
                return ((SessionCounters)this.instance).getLoadRequests();
            }

            @Override
            public int getLoadRequestsAdm() {
                return ((SessionCounters)this.instance).getLoadRequestsAdm();
            }

            public Builder setBannerImpressions(int n10) {
                this.copyOnWrite();
                ((SessionCounters)this.instance).setBannerImpressions(n10);
                return this;
            }

            public Builder setBannerLoadRequests(int n10) {
                this.copyOnWrite();
                ((SessionCounters)this.instance).setBannerLoadRequests(n10);
                return this;
            }

            public Builder setBannerRequestsAdm(int n10) {
                this.copyOnWrite();
                ((SessionCounters)this.instance).setBannerRequestsAdm(n10);
                return this;
            }

            public Builder setFocusChangeCount(int n10) {
                this.copyOnWrite();
                ((SessionCounters)this.instance).setFocusChangeCount(n10);
                return this;
            }

            public Builder setGlobalAdsFocusChangeCount(int n10) {
                this.copyOnWrite();
                ((SessionCounters)this.instance).setGlobalAdsFocusChangeCount(n10);
                return this;
            }

            public Builder setGlobalAdsFocusTime(int n10) {
                this.copyOnWrite();
                ((SessionCounters)this.instance).setGlobalAdsFocusTime(n10);
                return this;
            }

            public Builder setLoadRequests(int n10) {
                this.copyOnWrite();
                ((SessionCounters)this.instance).setLoadRequests(n10);
                return this;
            }

            public Builder setLoadRequestsAdm(int n10) {
                this.copyOnWrite();
                ((SessionCounters)this.instance).setLoadRequestsAdm(n10);
                return this;
            }
        }
    }

    public static interface SessionCountersOrBuilder
    extends MessageLiteOrBuilder {
        public int getBannerImpressions();

        public int getBannerLoadRequests();

        public int getBannerRequestsAdm();

        public int getFocusChangeCount();

        public int getGlobalAdsFocusChangeCount();

        public int getGlobalAdsFocusTime();

        public int getLoadRequests();

        public int getLoadRequestsAdm();
    }
}


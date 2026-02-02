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
 *  com.google.protobuf.Internal$ProtobufList
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class TransactionEventRequestOuterClass {
    private TransactionEventRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static enum StoreType implements Internal.EnumLite
    {
        STORE_TYPE_UNSPECIFIED(0),
        STORE_TYPE_CUSTOM(1),
        STORE_TYPE_APPLE_APP_STORE(2),
        STORE_TYPE_GOOGLE_PLAY(3),
        UNRECOGNIZED(-1);

        public static final int STORE_TYPE_APPLE_APP_STORE_VALUE = 2;
        public static final int STORE_TYPE_CUSTOM_VALUE = 1;
        public static final int STORE_TYPE_GOOGLE_PLAY_VALUE = 3;
        public static final int STORE_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<StoreType> internalValueMap;
        private final int value;

        static {
            internalValueMap = new Internal.EnumLiteMap<StoreType>(){

                public StoreType a(int n10) {
                    return StoreType.forNumber(n10);
                }
            };
        }

        private StoreType(int n13) {
            this.value = n13;
        }

        public static StoreType forNumber(int n10) {
            if (n10 != 0) {
                if (n10 != 1) {
                    if (n10 != 2) {
                        if (n10 != 3) {
                            return null;
                        }
                        return STORE_TYPE_GOOGLE_PLAY;
                    }
                    return STORE_TYPE_APPLE_APP_STORE;
                }
                return STORE_TYPE_CUSTOM;
            }
            return STORE_TYPE_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<StoreType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        public static StoreType valueOf(String string2) {
            return Enum.valueOf(StoreType.class, string2);
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
                boolean bl2 = StoreType.forNumber(n10) != null;
                return bl2;
            }
        }
    }

    public static final class TransactionData
    extends GeneratedMessageLite<TransactionData, Builder>
    implements TransactionDataOrBuilder {
        private static final TransactionData DEFAULT_INSTANCE;
        public static final int EVENT_ID_FIELD_NUMBER = 3;
        private static volatile Parser<TransactionData> PARSER;
        public static final int PRODUCT_FIELD_NUMBER = 5;
        public static final int PRODUCT_ID_FIELD_NUMBER = 2;
        public static final int RECEIPT_FIELD_NUMBER = 7;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        public static final int TRANSACTION_FIELD_NUMBER = 6;
        public static final int TRANSACTION_ID_FIELD_NUMBER = 4;
        public static final int TRANSACTION_STATE_FIELD_NUMBER = 8;
        private int bitField0_;
        private ByteString eventId_ = ByteString.EMPTY;
        private String productId_ = "";
        private String product_ = "";
        private String receipt_ = "";
        private Timestamp timestamp_;
        private String transactionId_ = "";
        private int transactionState_;
        private String transaction_ = "";

        static {
            TransactionData transactionData;
            DEFAULT_INSTANCE = transactionData = new TransactionData();
            GeneratedMessageLite.registerDefaultInstance(TransactionData.class, (GeneratedMessageLite)transactionData);
        }

        private TransactionData() {
        }

        private void clearEventId() {
            this.eventId_ = TransactionData.getDefaultInstance().getEventId();
        }

        private void clearProduct() {
            this.product_ = TransactionData.getDefaultInstance().getProduct();
        }

        private void clearProductId() {
            this.productId_ = TransactionData.getDefaultInstance().getProductId();
        }

        private void clearReceipt() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.receipt_ = TransactionData.getDefaultInstance().getReceipt();
        }

        private void clearTimestamp() {
            this.timestamp_ = null;
            this.bitField0_ &= 0xFFFFFFFE;
        }

        private void clearTransaction() {
            this.transaction_ = TransactionData.getDefaultInstance().getTransaction();
        }

        private void clearTransactionId() {
            this.transactionId_ = TransactionData.getDefaultInstance().getTransactionId();
        }

        private void clearTransactionState() {
            this.transactionState_ = 0;
        }

        public static TransactionData getDefaultInstance() {
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

        public static Builder newBuilder(TransactionData transactionData) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(transactionData);
        }

        public static TransactionData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransactionData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static TransactionData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static TransactionData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransactionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static TransactionData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static TransactionData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TransactionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static TransactionData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static TransactionData parseFrom(InputStream inputStream) throws IOException {
            return (TransactionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static TransactionData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static TransactionData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransactionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static TransactionData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static TransactionData parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
            return (TransactionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
        }

        public static TransactionData parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<TransactionData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setEventId(ByteString byteString) {
            byteString.getClass();
            this.eventId_ = byteString;
        }

        private void setProduct(String string2) {
            string2.getClass();
            this.product_ = string2;
        }

        private void setProductBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.product_ = byteString.toStringUtf8();
        }

        private void setProductId(String string2) {
            string2.getClass();
            this.productId_ = string2;
        }

        private void setProductIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.productId_ = byteString.toStringUtf8();
        }

        private void setReceipt(String string2) {
            string2.getClass();
            this.bitField0_ |= 2;
            this.receipt_ = string2;
        }

        private void setReceiptBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.receipt_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            this.timestamp_ = timestamp;
            this.bitField0_ |= 1;
        }

        private void setTransaction(String string2) {
            string2.getClass();
            this.transaction_ = string2;
        }

        private void setTransactionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.transaction_ = byteString.toStringUtf8();
        }

        private void setTransactionId(String string2) {
            string2.getClass();
            this.transactionId_ = string2;
        }

        private void setTransactionIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.transactionId_ = byteString.toStringUtf8();
        }

        private void setTransactionState(TransactionState transactionState) {
            this.transactionState_ = transactionState.getNumber();
        }

        private void setTransactionStateValue(int n10) {
            this.transactionState_ = n10;
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
                    synchronized (TransactionData.class) {
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
                    return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u0208\u0003\n\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u1208\u0001\b\f", (Object[])new Object[]{"bitField0_", "timestamp_", "productId_", "eventId_", "transactionId_", "product_", "transaction_", "receipt_", "transactionState_"});
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new TransactionData();
        }

        @Override
        public ByteString getEventId() {
            return this.eventId_;
        }

        @Override
        public String getProduct() {
            return this.product_;
        }

        @Override
        public ByteString getProductBytes() {
            return ByteString.copyFromUtf8((String)this.product_);
        }

        @Override
        public String getProductId() {
            return this.productId_;
        }

        @Override
        public ByteString getProductIdBytes() {
            return ByteString.copyFromUtf8((String)this.productId_);
        }

        @Override
        public String getReceipt() {
            return this.receipt_;
        }

        @Override
        public ByteString getReceiptBytes() {
            return ByteString.copyFromUtf8((String)this.receipt_);
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
        public String getTransaction() {
            return this.transaction_;
        }

        @Override
        public ByteString getTransactionBytes() {
            return ByteString.copyFromUtf8((String)this.transaction_);
        }

        @Override
        public String getTransactionId() {
            return this.transactionId_;
        }

        @Override
        public ByteString getTransactionIdBytes() {
            return ByteString.copyFromUtf8((String)this.transactionId_);
        }

        @Override
        public TransactionState getTransactionState() {
            TransactionState transactionState;
            TransactionState transactionState2 = transactionState = TransactionState.forNumber(this.transactionState_);
            if (transactionState == null) {
                transactionState2 = TransactionState.UNRECOGNIZED;
            }
            return transactionState2;
        }

        @Override
        public int getTransactionStateValue() {
            return this.transactionState_;
        }

        @Override
        public boolean hasReceipt() {
            boolean bl2 = (this.bitField0_ & 2) != 0;
            return bl2;
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
        extends GeneratedMessageLite.Builder<TransactionData, Builder>
        implements TransactionDataOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearEventId() {
                this.copyOnWrite();
                ((TransactionData)this.instance).clearEventId();
                return this;
            }

            public Builder clearProduct() {
                this.copyOnWrite();
                ((TransactionData)this.instance).clearProduct();
                return this;
            }

            public Builder clearProductId() {
                this.copyOnWrite();
                ((TransactionData)this.instance).clearProductId();
                return this;
            }

            public Builder clearReceipt() {
                this.copyOnWrite();
                ((TransactionData)this.instance).clearReceipt();
                return this;
            }

            public Builder clearTimestamp() {
                this.copyOnWrite();
                ((TransactionData)this.instance).clearTimestamp();
                return this;
            }

            public Builder clearTransaction() {
                this.copyOnWrite();
                ((TransactionData)this.instance).clearTransaction();
                return this;
            }

            public Builder clearTransactionId() {
                this.copyOnWrite();
                ((TransactionData)this.instance).clearTransactionId();
                return this;
            }

            public Builder clearTransactionState() {
                this.copyOnWrite();
                ((TransactionData)this.instance).clearTransactionState();
                return this;
            }

            @Override
            public ByteString getEventId() {
                return ((TransactionData)this.instance).getEventId();
            }

            @Override
            public String getProduct() {
                return ((TransactionData)this.instance).getProduct();
            }

            @Override
            public ByteString getProductBytes() {
                return ((TransactionData)this.instance).getProductBytes();
            }

            @Override
            public String getProductId() {
                return ((TransactionData)this.instance).getProductId();
            }

            @Override
            public ByteString getProductIdBytes() {
                return ((TransactionData)this.instance).getProductIdBytes();
            }

            @Override
            public String getReceipt() {
                return ((TransactionData)this.instance).getReceipt();
            }

            @Override
            public ByteString getReceiptBytes() {
                return ((TransactionData)this.instance).getReceiptBytes();
            }

            @Override
            public Timestamp getTimestamp() {
                return ((TransactionData)this.instance).getTimestamp();
            }

            @Override
            public String getTransaction() {
                return ((TransactionData)this.instance).getTransaction();
            }

            @Override
            public ByteString getTransactionBytes() {
                return ((TransactionData)this.instance).getTransactionBytes();
            }

            @Override
            public String getTransactionId() {
                return ((TransactionData)this.instance).getTransactionId();
            }

            @Override
            public ByteString getTransactionIdBytes() {
                return ((TransactionData)this.instance).getTransactionIdBytes();
            }

            @Override
            public TransactionState getTransactionState() {
                return ((TransactionData)this.instance).getTransactionState();
            }

            @Override
            public int getTransactionStateValue() {
                return ((TransactionData)this.instance).getTransactionStateValue();
            }

            @Override
            public boolean hasReceipt() {
                return ((TransactionData)this.instance).hasReceipt();
            }

            @Override
            public boolean hasTimestamp() {
                return ((TransactionData)this.instance).hasTimestamp();
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                this.copyOnWrite();
                ((TransactionData)this.instance).mergeTimestamp(timestamp);
                return this;
            }

            public Builder setEventId(ByteString byteString) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setEventId(byteString);
                return this;
            }

            public Builder setProduct(String string2) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setProduct(string2);
                return this;
            }

            public Builder setProductBytes(ByteString byteString) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setProductBytes(byteString);
                return this;
            }

            public Builder setProductId(String string2) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setProductId(string2);
                return this;
            }

            public Builder setProductIdBytes(ByteString byteString) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setProductIdBytes(byteString);
                return this;
            }

            public Builder setReceipt(String string2) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setReceipt(string2);
                return this;
            }

            public Builder setReceiptBytes(ByteString byteString) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setReceiptBytes(byteString);
                return this;
            }

            public Builder setTimestamp(Timestamp.Builder builder) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setTimestamp((Timestamp)builder.build());
                return this;
            }

            public Builder setTimestamp(Timestamp timestamp) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setTimestamp(timestamp);
                return this;
            }

            public Builder setTransaction(String string2) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setTransaction(string2);
                return this;
            }

            public Builder setTransactionBytes(ByteString byteString) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setTransactionBytes(byteString);
                return this;
            }

            public Builder setTransactionId(String string2) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setTransactionId(string2);
                return this;
            }

            public Builder setTransactionIdBytes(ByteString byteString) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setTransactionIdBytes(byteString);
                return this;
            }

            public Builder setTransactionState(TransactionState transactionState) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setTransactionState(transactionState);
                return this;
            }

            public Builder setTransactionStateValue(int n10) {
                this.copyOnWrite();
                ((TransactionData)this.instance).setTransactionStateValue(n10);
                return this;
            }
        }
    }

    public static interface TransactionDataOrBuilder
    extends MessageLiteOrBuilder {
        public ByteString getEventId();

        public String getProduct();

        public ByteString getProductBytes();

        public String getProductId();

        public ByteString getProductIdBytes();

        public String getReceipt();

        public ByteString getReceiptBytes();

        public Timestamp getTimestamp();

        public String getTransaction();

        public ByteString getTransactionBytes();

        public String getTransactionId();

        public ByteString getTransactionIdBytes();

        public TransactionState getTransactionState();

        public int getTransactionStateValue();

        public boolean hasReceipt();

        public boolean hasTimestamp();
    }

    public static final class TransactionEventRequest
    extends GeneratedMessageLite<TransactionEventRequest, Builder>
    implements TransactionEventRequestOrBuilder {
        public static final int APP_STORE_FIELD_NUMBER = 3;
        public static final int CUSTOM_STORE_FIELD_NUMBER = 4;
        private static final TransactionEventRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 2;
        private static volatile Parser<TransactionEventRequest> PARSER;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 1;
        public static final int TRANSACTION_DATA_FIELD_NUMBER = 5;
        private int appStore_;
        private int bitField0_;
        private String customStore_ = "";
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;
        private Internal.ProtobufList<TransactionData> transactionData_ = GeneratedMessageLite.emptyProtobufList();

        static {
            TransactionEventRequest transactionEventRequest;
            DEFAULT_INSTANCE = transactionEventRequest = new TransactionEventRequest();
            GeneratedMessageLite.registerDefaultInstance(TransactionEventRequest.class, (GeneratedMessageLite)transactionEventRequest);
        }

        private TransactionEventRequest() {
        }

        private void addAllTransactionData(Iterable<? extends TransactionData> iterable) {
            this.ensureTransactionDataIsMutable();
            AbstractMessageLite.addAll(iterable, this.transactionData_);
        }

        private void addTransactionData(int n10, TransactionData transactionData) {
            transactionData.getClass();
            this.ensureTransactionDataIsMutable();
            this.transactionData_.add(n10, transactionData);
        }

        private void addTransactionData(TransactionData transactionData) {
            transactionData.getClass();
            this.ensureTransactionDataIsMutable();
            this.transactionData_.add(transactionData);
        }

        private void clearAppStore() {
            this.appStore_ = 0;
        }

        private void clearCustomStore() {
            this.customStore_ = TransactionEventRequest.getDefaultInstance().getCustomStore();
        }

        private void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= 0xFFFFFFFD;
        }

        private void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= 0xFFFFFFFE;
        }

        private void clearTransactionData() {
            this.transactionData_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureTransactionDataIsMutable() {
            Internal.ProtobufList<TransactionData> protobufList = this.transactionData_;
            if (!protobufList.isModifiable()) {
                this.transactionData_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static TransactionEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            this.dynamicDeviceInfo_ = dynamicDeviceInfo2 != null && dynamicDeviceInfo2 != DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() ? (DynamicDeviceInfoOuterClass.DynamicDeviceInfo)((DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder)DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom(dynamicDeviceInfo)).buildPartial() : dynamicDeviceInfo;
            this.bitField0_ |= 2;
        }

        private void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            this.staticDeviceInfo_ = staticDeviceInfo2 != null && staticDeviceInfo2 != StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() ? (StaticDeviceInfoOuterClass.StaticDeviceInfo)((StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder)StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom(staticDeviceInfo)).buildPartial() : staticDeviceInfo;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(TransactionEventRequest transactionEventRequest) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(transactionEventRequest);
        }

        public static TransactionEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransactionEventRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static TransactionEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionEventRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static TransactionEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static TransactionEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static TransactionEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static TransactionEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static TransactionEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static TransactionEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static TransactionEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static TransactionEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static TransactionEventRequest parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray);
        }

        public static TransactionEventRequest parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionEventRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])byArray, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<TransactionEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeTransactionData(int n10) {
            this.ensureTransactionDataIsMutable();
            this.transactionData_.remove(n10);
        }

        private void setAppStore(StoreType storeType) {
            this.appStore_ = storeType.getNumber();
        }

        private void setAppStoreValue(int n10) {
            this.appStore_ = n10;
        }

        private void setCustomStore(String string2) {
            string2.getClass();
            this.customStore_ = string2;
        }

        private void setCustomStoreBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8((ByteString)byteString);
            this.customStore_ = byteString.toStringUtf8();
        }

        private void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 2;
        }

        private void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 1;
        }

        private void setTransactionData(int n10, TransactionData transactionData) {
            transactionData.getClass();
            this.ensureTransactionDataIsMutable();
            this.transactionData_.set(n10, transactionData);
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
                    synchronized (TransactionEventRequest.class) {
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
                    return GeneratedMessageLite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\f\u0004\u0208\u0005\u001b", (Object[])new Object[]{"bitField0_", "staticDeviceInfo_", "dynamicDeviceInfo_", "appStore_", "customStore_", "transactionData_", TransactionData.class});
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new TransactionEventRequest();
        }

        @Override
        public StoreType getAppStore() {
            StoreType storeType;
            StoreType storeType2 = storeType = StoreType.forNumber(this.appStore_);
            if (storeType == null) {
                storeType2 = StoreType.UNRECOGNIZED;
            }
            return storeType2;
        }

        @Override
        public int getAppStoreValue() {
            return this.appStore_;
        }

        @Override
        public String getCustomStore() {
            return this.customStore_;
        }

        @Override
        public ByteString getCustomStoreBytes() {
            return ByteString.copyFromUtf8((String)this.customStore_);
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
        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo;
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = staticDeviceInfo = this.staticDeviceInfo_;
            if (staticDeviceInfo == null) {
                staticDeviceInfo2 = StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance();
            }
            return staticDeviceInfo2;
        }

        @Override
        public TransactionData getTransactionData(int n10) {
            return (TransactionData)this.transactionData_.get(n10);
        }

        @Override
        public int getTransactionDataCount() {
            return this.transactionData_.size();
        }

        @Override
        public List<TransactionData> getTransactionDataList() {
            return this.transactionData_;
        }

        public TransactionDataOrBuilder getTransactionDataOrBuilder(int n10) {
            return (TransactionDataOrBuilder)this.transactionData_.get(n10);
        }

        public List<? extends TransactionDataOrBuilder> getTransactionDataOrBuilderList() {
            return this.transactionData_;
        }

        @Override
        public boolean hasDynamicDeviceInfo() {
            boolean bl2 = (this.bitField0_ & 2) != 0;
            return bl2;
        }

        @Override
        public boolean hasStaticDeviceInfo() {
            int n10 = this.bitField0_;
            boolean bl2 = true;
            if ((n10 & 1) == 0) {
                bl2 = false;
            }
            return bl2;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<TransactionEventRequest, Builder>
        implements TransactionEventRequestOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder addAllTransactionData(Iterable<? extends TransactionData> iterable) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).addAllTransactionData(iterable);
                return this;
            }

            public Builder addTransactionData(int n10, TransactionData.Builder builder) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).addTransactionData(n10, (TransactionData)builder.build());
                return this;
            }

            public Builder addTransactionData(int n10, TransactionData transactionData) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).addTransactionData(n10, transactionData);
                return this;
            }

            public Builder addTransactionData(TransactionData.Builder builder) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).addTransactionData((TransactionData)builder.build());
                return this;
            }

            public Builder addTransactionData(TransactionData transactionData) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).addTransactionData(transactionData);
                return this;
            }

            public Builder clearAppStore() {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).clearAppStore();
                return this;
            }

            public Builder clearCustomStore() {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).clearCustomStore();
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).clearDynamicDeviceInfo();
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).clearStaticDeviceInfo();
                return this;
            }

            public Builder clearTransactionData() {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).clearTransactionData();
                return this;
            }

            @Override
            public StoreType getAppStore() {
                return ((TransactionEventRequest)this.instance).getAppStore();
            }

            @Override
            public int getAppStoreValue() {
                return ((TransactionEventRequest)this.instance).getAppStoreValue();
            }

            @Override
            public String getCustomStore() {
                return ((TransactionEventRequest)this.instance).getCustomStore();
            }

            @Override
            public ByteString getCustomStoreBytes() {
                return ((TransactionEventRequest)this.instance).getCustomStoreBytes();
            }

            @Override
            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((TransactionEventRequest)this.instance).getDynamicDeviceInfo();
            }

            @Override
            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((TransactionEventRequest)this.instance).getStaticDeviceInfo();
            }

            @Override
            public TransactionData getTransactionData(int n10) {
                return ((TransactionEventRequest)this.instance).getTransactionData(n10);
            }

            @Override
            public int getTransactionDataCount() {
                return ((TransactionEventRequest)this.instance).getTransactionDataCount();
            }

            @Override
            public List<TransactionData> getTransactionDataList() {
                return Collections.unmodifiableList(((TransactionEventRequest)this.instance).getTransactionDataList());
            }

            @Override
            public boolean hasDynamicDeviceInfo() {
                return ((TransactionEventRequest)this.instance).hasDynamicDeviceInfo();
            }

            @Override
            public boolean hasStaticDeviceInfo() {
                return ((TransactionEventRequest)this.instance).hasStaticDeviceInfo();
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).mergeStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder removeTransactionData(int n10) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).removeTransactionData(n10);
                return this;
            }

            public Builder setAppStore(StoreType storeType) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setAppStore(storeType);
                return this;
            }

            public Builder setAppStoreValue(int n10) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setAppStoreValue(n10);
                return this;
            }

            public Builder setCustomStore(String string2) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setCustomStore(string2);
                return this;
            }

            public Builder setCustomStoreBytes(ByteString byteString) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setCustomStoreBytes(byteString);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setDynamicDeviceInfo((DynamicDeviceInfoOuterClass.DynamicDeviceInfo)builder.build());
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo)builder.build());
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder setTransactionData(int n10, TransactionData.Builder builder) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setTransactionData(n10, (TransactionData)builder.build());
                return this;
            }

            public Builder setTransactionData(int n10, TransactionData transactionData) {
                this.copyOnWrite();
                ((TransactionEventRequest)this.instance).setTransactionData(n10, transactionData);
                return this;
            }
        }
    }

    public static interface TransactionEventRequestOrBuilder
    extends MessageLiteOrBuilder {
        public StoreType getAppStore();

        public int getAppStoreValue();

        public String getCustomStore();

        public ByteString getCustomStoreBytes();

        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        public TransactionData getTransactionData(int var1);

        public int getTransactionDataCount();

        public List<TransactionData> getTransactionDataList();

        public boolean hasDynamicDeviceInfo();

        public boolean hasStaticDeviceInfo();
    }

    public static enum TransactionState implements Internal.EnumLite
    {
        TRANSACTION_STATE_UNSPECIFIED(0),
        TRANSACTION_STATE_PENDING(1),
        TRANSACTION_STATE_PURCHASED(2),
        TRANSACTION_STATE_FAILED(3),
        TRANSACTION_STATE_RESTORED(4),
        TRANSACTION_STATE_DEFERRED(5),
        UNRECOGNIZED(-1);

        public static final int TRANSACTION_STATE_DEFERRED_VALUE = 5;
        public static final int TRANSACTION_STATE_FAILED_VALUE = 3;
        public static final int TRANSACTION_STATE_PENDING_VALUE = 1;
        public static final int TRANSACTION_STATE_PURCHASED_VALUE = 2;
        public static final int TRANSACTION_STATE_RESTORED_VALUE = 4;
        public static final int TRANSACTION_STATE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<TransactionState> internalValueMap;
        private final int value;

        static {
            internalValueMap = new Internal.EnumLiteMap<TransactionState>(){

                public TransactionState a(int n10) {
                    return TransactionState.forNumber(n10);
                }
            };
        }

        private TransactionState(int n13) {
            this.value = n13;
        }

        public static TransactionState forNumber(int n10) {
            if (n10 != 0) {
                if (n10 != 1) {
                    if (n10 != 2) {
                        if (n10 != 3) {
                            if (n10 != 4) {
                                if (n10 != 5) {
                                    return null;
                                }
                                return TRANSACTION_STATE_DEFERRED;
                            }
                            return TRANSACTION_STATE_RESTORED;
                        }
                        return TRANSACTION_STATE_FAILED;
                    }
                    return TRANSACTION_STATE_PURCHASED;
                }
                return TRANSACTION_STATE_PENDING;
            }
            return TRANSACTION_STATE_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<TransactionState> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        public static TransactionState valueOf(String string2) {
            return Enum.valueOf(TransactionState.class, string2);
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
                boolean bl2 = TransactionState.forNumber(n10) != null;
                return bl2;
            }
        }
    }
}


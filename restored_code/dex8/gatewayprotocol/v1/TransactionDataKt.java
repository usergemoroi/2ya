/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.kotlin.ProtoDslMarker
 */
package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2={"Lgatewayprotocol/v1/TransactionDataKt;", "", "()V", "Dsl", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
public final class TransactionDataKt {
    @NotNull
    public static final TransactionDataKt INSTANCE = new TransactionDataKt();

    private TransactionDataKt() {
    }

    @Metadata(d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001CB\u0011\b\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\bA\u0010BJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0004\b\f\u0010\u0007J\r\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0004\b\r\u0010\u0007J\r\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000e\u0010\u0007J\r\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000f\u0010\u0007J\r\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0010\u0010\u0007J\r\u0010\u0011\u001a\u00020\b\u00a2\u0006\u0004\b\u0011\u0010\nJ\r\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u001d8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010(\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020#8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010+\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u001d8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R$\u0010.\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u001d8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R$\u00101\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u001d8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!R$\u00104\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u001d8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R$\u0010:\u001a\u0002052\u0006\u0010\u0017\u001a\u0002058G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010@\u001a\u00020;2\u0006\u0010\u0017\u001a\u00020;8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?\u00a8\u0006D"}, d2={"Lgatewayprotocol/v1/TransactionDataKt$Dsl;", "", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "_build", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "Lkotlin/k0;", "clearTimestamp", "()V", "", "hasTimestamp", "()Z", "clearProductId", "clearEventId", "clearTransactionId", "clearProduct", "clearTransaction", "clearReceipt", "hasReceipt", "clearTransactionState", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData$Builder;", "_builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData$Builder;", "Lcom/google/protobuf/Timestamp;", "value", "getTimestamp", "()Lcom/google/protobuf/Timestamp;", "setTimestamp", "(Lcom/google/protobuf/Timestamp;)V", "timestamp", "", "getProductId", "()Ljava/lang/String;", "setProductId", "(Ljava/lang/String;)V", "productId", "Lcom/google/protobuf/ByteString;", "getEventId", "()Lcom/google/protobuf/ByteString;", "setEventId", "(Lcom/google/protobuf/ByteString;)V", "eventId", "getTransactionId", "setTransactionId", "transactionId", "getProduct", "setProduct", "product", "getTransaction", "setTransaction", "transaction", "getReceipt", "setReceipt", "receipt", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;", "getTransactionState", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;", "setTransactionState", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionState;)V", "transactionState", "", "getTransactionStateValue", "()I", "setTransactionStateValue", "(I)V", "transactionStateValue", "<init>", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData$Builder;)V", "Companion", "unity-ads_release"}, k=1, mv={1, 8, 0})
    @ProtoDslMarker
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final TransactionEventRequestOuterClass.TransactionData.Builder _builder;

        private Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder, p p14) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionData _build() {
            GeneratedMessageLite generatedMessageLite = this._builder.build();
            y.i(generatedMessageLite, "_builder.build()");
            return (TransactionEventRequestOuterClass.TransactionData)generatedMessageLite;
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearProduct() {
            this._builder.clearProduct();
        }

        public final void clearProductId() {
            this._builder.clearProductId();
        }

        public final void clearReceipt() {
            this._builder.clearReceipt();
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final void clearTransaction() {
            this._builder.clearTransaction();
        }

        public final void clearTransactionId() {
            this._builder.clearTransactionId();
        }

        public final void clearTransactionState() {
            this._builder.clearTransactionState();
        }

        @JvmName(name="getEventId")
        @NotNull
        public final ByteString getEventId() {
            ByteString byteString = this._builder.getEventId();
            y.i(byteString, "_builder.getEventId()");
            return byteString;
        }

        @JvmName(name="getProduct")
        @NotNull
        public final String getProduct() {
            String string2 = this._builder.getProduct();
            y.i(string2, "_builder.getProduct()");
            return string2;
        }

        @JvmName(name="getProductId")
        @NotNull
        public final String getProductId() {
            String string2 = this._builder.getProductId();
            y.i(string2, "_builder.getProductId()");
            return string2;
        }

        @JvmName(name="getReceipt")
        @NotNull
        public final String getReceipt() {
            String string2 = this._builder.getReceipt();
            y.i(string2, "_builder.getReceipt()");
            return string2;
        }

        @JvmName(name="getTimestamp")
        @NotNull
        public final Timestamp getTimestamp() {
            Timestamp timestamp = this._builder.getTimestamp();
            y.i(timestamp, "_builder.getTimestamp()");
            return timestamp;
        }

        @JvmName(name="getTransaction")
        @NotNull
        public final String getTransaction() {
            String string2 = this._builder.getTransaction();
            y.i(string2, "_builder.getTransaction()");
            return string2;
        }

        @JvmName(name="getTransactionId")
        @NotNull
        public final String getTransactionId() {
            String string2 = this._builder.getTransactionId();
            y.i(string2, "_builder.getTransactionId()");
            return string2;
        }

        @JvmName(name="getTransactionState")
        @NotNull
        public final TransactionEventRequestOuterClass.TransactionState getTransactionState() {
            TransactionEventRequestOuterClass.TransactionState transactionState = this._builder.getTransactionState();
            y.i((Object)transactionState, "_builder.getTransactionState()");
            return transactionState;
        }

        @JvmName(name="getTransactionStateValue")
        public final int getTransactionStateValue() {
            return this._builder.getTransactionStateValue();
        }

        public final boolean hasReceipt() {
            return this._builder.hasReceipt();
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        @JvmName(name="setEventId")
        public final void setEventId(@NotNull ByteString byteString) {
            y.j(byteString, "value");
            this._builder.setEventId(byteString);
        }

        @JvmName(name="setProduct")
        public final void setProduct(@NotNull String string2) {
            y.j(string2, "value");
            this._builder.setProduct(string2);
        }

        @JvmName(name="setProductId")
        public final void setProductId(@NotNull String string2) {
            y.j(string2, "value");
            this._builder.setProductId(string2);
        }

        @JvmName(name="setReceipt")
        public final void setReceipt(@NotNull String string2) {
            y.j(string2, "value");
            this._builder.setReceipt(string2);
        }

        @JvmName(name="setTimestamp")
        public final void setTimestamp(@NotNull Timestamp timestamp) {
            y.j(timestamp, "value");
            this._builder.setTimestamp(timestamp);
        }

        @JvmName(name="setTransaction")
        public final void setTransaction(@NotNull String string2) {
            y.j(string2, "value");
            this._builder.setTransaction(string2);
        }

        @JvmName(name="setTransactionId")
        public final void setTransactionId(@NotNull String string2) {
            y.j(string2, "value");
            this._builder.setTransactionId(string2);
        }

        @JvmName(name="setTransactionState")
        public final void setTransactionState(@NotNull TransactionEventRequestOuterClass.TransactionState transactionState) {
            y.j((Object)transactionState, "value");
            this._builder.setTransactionState(transactionState);
        }

        @JvmName(name="setTransactionStateValue")
        public final void setTransactionStateValue(int n10) {
            this._builder.setTransactionStateValue(n10);
        }

        @Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a8\u0006\u0007"}, d2={"Lgatewayprotocol/v1/TransactionDataKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/TransactionDataKt$Dsl;", "builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData$Builder;", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(p p14) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
                y.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }
    }
}


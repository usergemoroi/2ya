/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.kotlin.ProtoDslMarker
 */
package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.PiiOuterClass;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2={"Lgatewayprotocol/v1/PiiKt;", "", "()V", "Dsl", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
public final class PiiKt {
    @NotNull
    public static final PiiKt INSTANCE = new PiiKt();

    private PiiKt() {
    }

    @Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0011\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b$\u0010%J\u000f\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0004\b\n\u0010\u0007J\r\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R$\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R$\u0010#\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u001e8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006'"}, d2={"Lgatewayprotocol/v1/PiiKt$Dsl;", "", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "_build", "()Lgatewayprotocol/v1/PiiOuterClass$Pii;", "Lkotlin/k0;", "clearAdvertisingId", "()V", "clearVendorId", "clearOpenAdvertisingTrackingId", "clearFid", "", "hasFid", "()Z", "Lgatewayprotocol/v1/PiiOuterClass$Pii$Builder;", "_builder", "Lgatewayprotocol/v1/PiiOuterClass$Pii$Builder;", "Lcom/google/protobuf/ByteString;", "value", "getAdvertisingId", "()Lcom/google/protobuf/ByteString;", "setAdvertisingId", "(Lcom/google/protobuf/ByteString;)V", "advertisingId", "getVendorId", "setVendorId", "vendorId", "getOpenAdvertisingTrackingId", "setOpenAdvertisingTrackingId", "openAdvertisingTrackingId", "", "getFid", "()Ljava/lang/String;", "setFid", "(Ljava/lang/String;)V", "fid", "<init>", "(Lgatewayprotocol/v1/PiiOuterClass$Pii$Builder;)V", "Companion", "unity-ads_release"}, k=1, mv={1, 8, 0})
    @ProtoDslMarker
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final PiiOuterClass.Pii.Builder _builder;

        private Dsl(PiiOuterClass.Pii.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(PiiOuterClass.Pii.Builder builder, p p14) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ PiiOuterClass.Pii _build() {
            GeneratedMessageLite generatedMessageLite = this._builder.build();
            y.i(generatedMessageLite, "_builder.build()");
            return (PiiOuterClass.Pii)generatedMessageLite;
        }

        public final void clearAdvertisingId() {
            this._builder.clearAdvertisingId();
        }

        public final void clearFid() {
            this._builder.clearFid();
        }

        public final void clearOpenAdvertisingTrackingId() {
            this._builder.clearOpenAdvertisingTrackingId();
        }

        public final void clearVendorId() {
            this._builder.clearVendorId();
        }

        @JvmName(name="getAdvertisingId")
        @NotNull
        public final ByteString getAdvertisingId() {
            ByteString byteString = this._builder.getAdvertisingId();
            y.i(byteString, "_builder.getAdvertisingId()");
            return byteString;
        }

        @JvmName(name="getFid")
        @NotNull
        public final String getFid() {
            String string2 = this._builder.getFid();
            y.i(string2, "_builder.getFid()");
            return string2;
        }

        @JvmName(name="getOpenAdvertisingTrackingId")
        @NotNull
        public final ByteString getOpenAdvertisingTrackingId() {
            ByteString byteString = this._builder.getOpenAdvertisingTrackingId();
            y.i(byteString, "_builder.getOpenAdvertisingTrackingId()");
            return byteString;
        }

        @JvmName(name="getVendorId")
        @NotNull
        public final ByteString getVendorId() {
            ByteString byteString = this._builder.getVendorId();
            y.i(byteString, "_builder.getVendorId()");
            return byteString;
        }

        public final boolean hasFid() {
            return this._builder.hasFid();
        }

        @JvmName(name="setAdvertisingId")
        public final void setAdvertisingId(@NotNull ByteString byteString) {
            y.j(byteString, "value");
            this._builder.setAdvertisingId(byteString);
        }

        @JvmName(name="setFid")
        public final void setFid(@NotNull String string2) {
            y.j(string2, "value");
            this._builder.setFid(string2);
        }

        @JvmName(name="setOpenAdvertisingTrackingId")
        public final void setOpenAdvertisingTrackingId(@NotNull ByteString byteString) {
            y.j(byteString, "value");
            this._builder.setOpenAdvertisingTrackingId(byteString);
        }

        @JvmName(name="setVendorId")
        public final void setVendorId(@NotNull ByteString byteString) {
            y.j(byteString, "value");
            this._builder.setVendorId(byteString);
        }

        @Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a8\u0006\u0007"}, d2={"Lgatewayprotocol/v1/PiiKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/PiiKt$Dsl;", "builder", "Lgatewayprotocol/v1/PiiOuterClass$Pii$Builder;", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(p p14) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(PiiOuterClass.Pii.Builder builder) {
                y.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }
    }
}


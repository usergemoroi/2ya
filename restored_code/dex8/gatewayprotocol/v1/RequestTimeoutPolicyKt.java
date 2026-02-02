/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.kotlin.ProtoDslMarker
 */
package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2={"Lgatewayprotocol/v1/RequestTimeoutPolicyKt;", "", "()V", "Dsl", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
public final class RequestTimeoutPolicyKt {
    @NotNull
    public static final RequestTimeoutPolicyKt INSTANCE = new RequestTimeoutPolicyKt();

    private RequestTimeoutPolicyKt() {
    }

    @Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0004\b\n\u0010\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R$\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R$\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013\u00a8\u0006!"}, d2={"Lgatewayprotocol/v1/RequestTimeoutPolicyKt$Dsl;", "", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "_build", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "Lkotlin/k0;", "clearConnectTimeoutMs", "()V", "clearReadTimeoutMs", "clearWriteTimeoutMs", "clearOverallTimeoutMs", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy$Builder;", "_builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy$Builder;", "", "value", "getConnectTimeoutMs", "()I", "setConnectTimeoutMs", "(I)V", "connectTimeoutMs", "getReadTimeoutMs", "setReadTimeoutMs", "readTimeoutMs", "getWriteTimeoutMs", "setWriteTimeoutMs", "writeTimeoutMs", "getOverallTimeoutMs", "setOverallTimeoutMs", "overallTimeoutMs", "<init>", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy$Builder;)V", "Companion", "unity-ads_release"}, k=1, mv={1, 8, 0})
    @ProtoDslMarker
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder _builder;

        private Dsl(NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder, p p14) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ NativeConfigurationOuterClass.RequestTimeoutPolicy _build() {
            GeneratedMessageLite generatedMessageLite = this._builder.build();
            y.i(generatedMessageLite, "_builder.build()");
            return (NativeConfigurationOuterClass.RequestTimeoutPolicy)generatedMessageLite;
        }

        public final void clearConnectTimeoutMs() {
            this._builder.clearConnectTimeoutMs();
        }

        public final void clearOverallTimeoutMs() {
            this._builder.clearOverallTimeoutMs();
        }

        public final void clearReadTimeoutMs() {
            this._builder.clearReadTimeoutMs();
        }

        public final void clearWriteTimeoutMs() {
            this._builder.clearWriteTimeoutMs();
        }

        @JvmName(name="getConnectTimeoutMs")
        public final int getConnectTimeoutMs() {
            return this._builder.getConnectTimeoutMs();
        }

        @JvmName(name="getOverallTimeoutMs")
        public final int getOverallTimeoutMs() {
            return this._builder.getOverallTimeoutMs();
        }

        @JvmName(name="getReadTimeoutMs")
        public final int getReadTimeoutMs() {
            return this._builder.getReadTimeoutMs();
        }

        @JvmName(name="getWriteTimeoutMs")
        public final int getWriteTimeoutMs() {
            return this._builder.getWriteTimeoutMs();
        }

        @JvmName(name="setConnectTimeoutMs")
        public final void setConnectTimeoutMs(int n10) {
            this._builder.setConnectTimeoutMs(n10);
        }

        @JvmName(name="setOverallTimeoutMs")
        public final void setOverallTimeoutMs(int n10) {
            this._builder.setOverallTimeoutMs(n10);
        }

        @JvmName(name="setReadTimeoutMs")
        public final void setReadTimeoutMs(int n10) {
            this._builder.setReadTimeoutMs(n10);
        }

        @JvmName(name="setWriteTimeoutMs")
        public final void setWriteTimeoutMs(int n10) {
            this._builder.setWriteTimeoutMs(n10);
        }

        @Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a8\u0006\u0007"}, d2={"Lgatewayprotocol/v1/RequestTimeoutPolicyKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/RequestTimeoutPolicyKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy$Builder;", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(p p14) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder) {
                y.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }
    }
}


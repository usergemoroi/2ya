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

@Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2={"Lgatewayprotocol/v1/RequestPolicyKt;", "", "()V", "Dsl", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
public final class RequestPolicyKt {
    @NotNull
    public static final RequestPolicyKt INSTANCE = new RequestPolicyKt();

    private RequestPolicyKt() {
    }

    @Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\f\u001a\u00020\b\u00a2\u0006\u0004\b\f\u0010\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006 "}, d2={"Lgatewayprotocol/v1/RequestPolicyKt$Dsl;", "", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "_build", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "Lkotlin/k0;", "clearRetryPolicy", "()V", "", "hasRetryPolicy", "()Z", "clearTimeoutPolicy", "hasTimeoutPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy$Builder;", "_builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy$Builder;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "value", "getRetryPolicy", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "setRetryPolicy", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;)V", "retryPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "getTimeoutPolicy", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "setTimeoutPolicy", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;)V", "timeoutPolicy", "<init>", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy$Builder;)V", "Companion", "unity-ads_release"}, k=1, mv={1, 8, 0})
    @ProtoDslMarker
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final NativeConfigurationOuterClass.RequestPolicy.Builder _builder;

        private Dsl(NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.RequestPolicy.Builder builder, p p14) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ NativeConfigurationOuterClass.RequestPolicy _build() {
            GeneratedMessageLite generatedMessageLite = this._builder.build();
            y.i(generatedMessageLite, "_builder.build()");
            return (NativeConfigurationOuterClass.RequestPolicy)generatedMessageLite;
        }

        public final void clearRetryPolicy() {
            this._builder.clearRetryPolicy();
        }

        public final void clearTimeoutPolicy() {
            this._builder.clearTimeoutPolicy();
        }

        @JvmName(name="getRetryPolicy")
        @NotNull
        public final NativeConfigurationOuterClass.RequestRetryPolicy getRetryPolicy() {
            NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy = this._builder.getRetryPolicy();
            y.i(requestRetryPolicy, "_builder.getRetryPolicy()");
            return requestRetryPolicy;
        }

        @JvmName(name="getTimeoutPolicy")
        @NotNull
        public final NativeConfigurationOuterClass.RequestTimeoutPolicy getTimeoutPolicy() {
            NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy = this._builder.getTimeoutPolicy();
            y.i(requestTimeoutPolicy, "_builder.getTimeoutPolicy()");
            return requestTimeoutPolicy;
        }

        public final boolean hasRetryPolicy() {
            return this._builder.hasRetryPolicy();
        }

        public final boolean hasTimeoutPolicy() {
            return this._builder.hasTimeoutPolicy();
        }

        @JvmName(name="setRetryPolicy")
        public final void setRetryPolicy(@NotNull NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy) {
            y.j(requestRetryPolicy, "value");
            this._builder.setRetryPolicy(requestRetryPolicy);
        }

        @JvmName(name="setTimeoutPolicy")
        public final void setTimeoutPolicy(@NotNull NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy) {
            y.j(requestTimeoutPolicy, "value");
            this._builder.setTimeoutPolicy(requestTimeoutPolicy);
        }

        @Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a8\u0006\u0007"}, d2={"Lgatewayprotocol/v1/RequestPolicyKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/RequestPolicyKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy$Builder;", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(p p14) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
                y.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }
    }
}


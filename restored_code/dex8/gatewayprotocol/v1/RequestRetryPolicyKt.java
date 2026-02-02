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

@Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2={"Lgatewayprotocol/v1/RequestRetryPolicyKt;", "", "()V", "Dsl", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
public final class RequestRetryPolicyKt {
    @NotNull
    public static final RequestRetryPolicyKt INSTANCE = new RequestRetryPolicyKt();

    private RequestRetryPolicyKt() {
    }

    @Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0011\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b,\u0010-J\u000f\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0004\b\n\u0010\u0007J\r\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0004\b\f\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R$\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001d8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010%\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001d8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R$\u0010+\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020&8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*\u00a8\u0006/"}, d2={"Lgatewayprotocol/v1/RequestRetryPolicyKt$Dsl;", "", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "_build", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "Lkotlin/k0;", "clearMaxDuration", "()V", "clearRetryWaitBase", "clearRetryMaxInterval", "clearRetryJitterPct", "clearRetryScalingFactor", "clearShouldStoreLocally", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy$Builder;", "_builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy$Builder;", "", "value", "getMaxDuration", "()I", "setMaxDuration", "(I)V", "maxDuration", "getRetryWaitBase", "setRetryWaitBase", "retryWaitBase", "getRetryMaxInterval", "setRetryMaxInterval", "retryMaxInterval", "", "getRetryJitterPct", "()F", "setRetryJitterPct", "(F)V", "retryJitterPct", "getRetryScalingFactor", "setRetryScalingFactor", "retryScalingFactor", "", "getShouldStoreLocally", "()Z", "setShouldStoreLocally", "(Z)V", "shouldStoreLocally", "<init>", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy$Builder;)V", "Companion", "unity-ads_release"}, k=1, mv={1, 8, 0})
    @ProtoDslMarker
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final NativeConfigurationOuterClass.RequestRetryPolicy.Builder _builder;

        private Dsl(NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder, p p14) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ NativeConfigurationOuterClass.RequestRetryPolicy _build() {
            GeneratedMessageLite generatedMessageLite = this._builder.build();
            y.i(generatedMessageLite, "_builder.build()");
            return (NativeConfigurationOuterClass.RequestRetryPolicy)generatedMessageLite;
        }

        public final void clearMaxDuration() {
            this._builder.clearMaxDuration();
        }

        public final void clearRetryJitterPct() {
            this._builder.clearRetryJitterPct();
        }

        public final void clearRetryMaxInterval() {
            this._builder.clearRetryMaxInterval();
        }

        public final void clearRetryScalingFactor() {
            this._builder.clearRetryScalingFactor();
        }

        public final void clearRetryWaitBase() {
            this._builder.clearRetryWaitBase();
        }

        public final void clearShouldStoreLocally() {
            this._builder.clearShouldStoreLocally();
        }

        @JvmName(name="getMaxDuration")
        public final int getMaxDuration() {
            return this._builder.getMaxDuration();
        }

        @JvmName(name="getRetryJitterPct")
        public final float getRetryJitterPct() {
            return this._builder.getRetryJitterPct();
        }

        @JvmName(name="getRetryMaxInterval")
        public final int getRetryMaxInterval() {
            return this._builder.getRetryMaxInterval();
        }

        @JvmName(name="getRetryScalingFactor")
        public final float getRetryScalingFactor() {
            return this._builder.getRetryScalingFactor();
        }

        @JvmName(name="getRetryWaitBase")
        public final int getRetryWaitBase() {
            return this._builder.getRetryWaitBase();
        }

        @JvmName(name="getShouldStoreLocally")
        public final boolean getShouldStoreLocally() {
            return this._builder.getShouldStoreLocally();
        }

        @JvmName(name="setMaxDuration")
        public final void setMaxDuration(int n10) {
            this._builder.setMaxDuration(n10);
        }

        @JvmName(name="setRetryJitterPct")
        public final void setRetryJitterPct(float f11) {
            this._builder.setRetryJitterPct(f11);
        }

        @JvmName(name="setRetryMaxInterval")
        public final void setRetryMaxInterval(int n10) {
            this._builder.setRetryMaxInterval(n10);
        }

        @JvmName(name="setRetryScalingFactor")
        public final void setRetryScalingFactor(float f11) {
            this._builder.setRetryScalingFactor(f11);
        }

        @JvmName(name="setRetryWaitBase")
        public final void setRetryWaitBase(int n10) {
            this._builder.setRetryWaitBase(n10);
        }

        @JvmName(name="setShouldStoreLocally")
        public final void setShouldStoreLocally(boolean bl2) {
            this._builder.setShouldStoreLocally(bl2);
        }

        @Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a8\u0006\u0007"}, d2={"Lgatewayprotocol/v1/RequestRetryPolicyKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/RequestRetryPolicyKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy$Builder;", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(p p14) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder) {
                y.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }
    }
}


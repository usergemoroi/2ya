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
import gatewayprotocol.v1.SessionCountersOuterClass;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2={"Lgatewayprotocol/v1/SessionCountersKt;", "", "()V", "Dsl", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
public final class SessionCountersKt {
    @NotNull
    public static final SessionCountersKt INSTANCE = new SessionCountersKt();

    private SessionCountersKt() {
    }

    @Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0011\b\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b.\u0010/J\u000f\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0004\b\n\u0010\u0007J\r\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0004\b\f\u0010\u0007J\r\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0004\b\r\u0010\u0007J\r\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000e\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R$\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R$\u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R$\u0010'\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R$\u0010*\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R$\u0010-\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017\u00a8\u00061"}, d2={"Lgatewayprotocol/v1/SessionCountersKt$Dsl;", "", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "_build", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "Lkotlin/k0;", "clearLoadRequests", "()V", "clearLoadRequestsAdm", "clearBannerLoadRequests", "clearBannerRequestsAdm", "clearBannerImpressions", "clearGlobalAdsFocusTime", "clearGlobalAdsFocusChangeCount", "clearFocusChangeCount", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;", "_builder", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;", "", "value", "getLoadRequests", "()I", "setLoadRequests", "(I)V", "loadRequests", "getLoadRequestsAdm", "setLoadRequestsAdm", "loadRequestsAdm", "getBannerLoadRequests", "setBannerLoadRequests", "bannerLoadRequests", "getBannerRequestsAdm", "setBannerRequestsAdm", "bannerRequestsAdm", "getBannerImpressions", "setBannerImpressions", "bannerImpressions", "getGlobalAdsFocusTime", "setGlobalAdsFocusTime", "globalAdsFocusTime", "getGlobalAdsFocusChangeCount", "setGlobalAdsFocusChangeCount", "globalAdsFocusChangeCount", "getFocusChangeCount", "setFocusChangeCount", "focusChangeCount", "<init>", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;)V", "Companion", "unity-ads_release"}, k=1, mv={1, 8, 0})
    @ProtoDslMarker
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final SessionCountersOuterClass.SessionCounters.Builder _builder;

        private Dsl(SessionCountersOuterClass.SessionCounters.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(SessionCountersOuterClass.SessionCounters.Builder builder, p p14) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ SessionCountersOuterClass.SessionCounters _build() {
            GeneratedMessageLite generatedMessageLite = this._builder.build();
            y.i(generatedMessageLite, "_builder.build()");
            return (SessionCountersOuterClass.SessionCounters)generatedMessageLite;
        }

        public final void clearBannerImpressions() {
            this._builder.clearBannerImpressions();
        }

        public final void clearBannerLoadRequests() {
            this._builder.clearBannerLoadRequests();
        }

        public final void clearBannerRequestsAdm() {
            this._builder.clearBannerRequestsAdm();
        }

        public final void clearFocusChangeCount() {
            this._builder.clearFocusChangeCount();
        }

        public final void clearGlobalAdsFocusChangeCount() {
            this._builder.clearGlobalAdsFocusChangeCount();
        }

        public final void clearGlobalAdsFocusTime() {
            this._builder.clearGlobalAdsFocusTime();
        }

        public final void clearLoadRequests() {
            this._builder.clearLoadRequests();
        }

        public final void clearLoadRequestsAdm() {
            this._builder.clearLoadRequestsAdm();
        }

        @JvmName(name="getBannerImpressions")
        public final int getBannerImpressions() {
            return this._builder.getBannerImpressions();
        }

        @JvmName(name="getBannerLoadRequests")
        public final int getBannerLoadRequests() {
            return this._builder.getBannerLoadRequests();
        }

        @JvmName(name="getBannerRequestsAdm")
        public final int getBannerRequestsAdm() {
            return this._builder.getBannerRequestsAdm();
        }

        @JvmName(name="getFocusChangeCount")
        public final int getFocusChangeCount() {
            return this._builder.getFocusChangeCount();
        }

        @JvmName(name="getGlobalAdsFocusChangeCount")
        public final int getGlobalAdsFocusChangeCount() {
            return this._builder.getGlobalAdsFocusChangeCount();
        }

        @JvmName(name="getGlobalAdsFocusTime")
        public final int getGlobalAdsFocusTime() {
            return this._builder.getGlobalAdsFocusTime();
        }

        @JvmName(name="getLoadRequests")
        public final int getLoadRequests() {
            return this._builder.getLoadRequests();
        }

        @JvmName(name="getLoadRequestsAdm")
        public final int getLoadRequestsAdm() {
            return this._builder.getLoadRequestsAdm();
        }

        @JvmName(name="setBannerImpressions")
        public final void setBannerImpressions(int n10) {
            this._builder.setBannerImpressions(n10);
        }

        @JvmName(name="setBannerLoadRequests")
        public final void setBannerLoadRequests(int n10) {
            this._builder.setBannerLoadRequests(n10);
        }

        @JvmName(name="setBannerRequestsAdm")
        public final void setBannerRequestsAdm(int n10) {
            this._builder.setBannerRequestsAdm(n10);
        }

        @JvmName(name="setFocusChangeCount")
        public final void setFocusChangeCount(int n10) {
            this._builder.setFocusChangeCount(n10);
        }

        @JvmName(name="setGlobalAdsFocusChangeCount")
        public final void setGlobalAdsFocusChangeCount(int n10) {
            this._builder.setGlobalAdsFocusChangeCount(n10);
        }

        @JvmName(name="setGlobalAdsFocusTime")
        public final void setGlobalAdsFocusTime(int n10) {
            this._builder.setGlobalAdsFocusTime(n10);
        }

        @JvmName(name="setLoadRequests")
        public final void setLoadRequests(int n10) {
            this._builder.setLoadRequests(n10);
        }

        @JvmName(name="setLoadRequestsAdm")
        public final void setLoadRequestsAdm(int n10) {
            this._builder.setLoadRequestsAdm(n10);
        }

        @Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a8\u0006\u0007"}, d2={"Lgatewayprotocol/v1/SessionCountersKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/SessionCountersKt$Dsl;", "builder", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;", "unity-ads_release"}, k=1, mv={1, 8, 0}, xi=48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(p p14) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(SessionCountersOuterClass.SessionCounters.Builder builder) {
                y.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }
    }
}


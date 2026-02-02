/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  kotlin.collections.s0
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.screenshot.internal;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.screenshot.impl.B;
import io.appmetrica.analytics.screenshot.impl.G;
import io.appmetrica.analytics.screenshot.impl.H;
import io.appmetrica.analytics.screenshot.impl.I;
import io.appmetrica.analytics.screenshot.impl.g0;
import io.appmetrica.analytics.screenshot.impl.j0;
import io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016\u00a2\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001e"}, d2={"Lio/appmetrica/analytics/screenshot/internal/ScreenshotServiceModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceEntryPoint;", "Lio/appmetrica/analytics/screenshot/impl/G;", "Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;", "serviceContext", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;", "initialConfig", "Lkotlin/k0;", "initServiceSide", "(Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;)V", "", "f", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "g", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "getRemoteConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "remoteConfigExtensionConfiguration", "Lio/appmetrica/analytics/modulesapi/internal/service/ClientConfigProvider;", "h", "Lio/appmetrica/analytics/modulesapi/internal/service/ClientConfigProvider;", "getClientConfigProvider", "()Lio/appmetrica/analytics/modulesapi/internal/service/ClientConfigProvider;", "clientConfigProvider", "<init>", "()V", "screenshot_release"}, k=1, mv={1, 6, 0})
public final class ScreenshotServiceModuleEntryPoint
extends ModuleServiceEntryPoint<G> {
    private g0 a;
    private final j0 b = new j0();
    private final I c = new I(null, null, 3, null);
    private final H d = new H(null, 1, null);
    private final configUpdateListener.1 e = new RemoteConfigUpdateListener<G>(this){
        final ScreenshotServiceModuleEntryPoint a;
        {
            this.a = screenshotServiceModuleEntryPoint;
        }

        public void onRemoteConfigUpdated(@NotNull ModuleRemoteConfig<G> object) {
            ScreenshotServiceModuleEntryPoint screenshotServiceModuleEntryPoint = this.a;
            object = (object = object.getFeaturesConfig()) != null ? new g0((G)object) : null;
            ScreenshotServiceModuleEntryPoint.access$setConfig$p(screenshotServiceModuleEntryPoint, (g0)object);
        }
    };
    private final String f;
    private final remoteConfigExtensionConfiguration.1 g = new RemoteConfigExtensionConfiguration<G>(this){
        final ScreenshotServiceModuleEntryPoint a;
        {
            this.a = screenshotServiceModuleEntryPoint;
        }

        @NotNull
        public Map<String, Integer> getBlocks() {
            return s0.g(z.a("scr", 1));
        }

        @NotNull
        public List<String> getFeatures() {
            return t.e((Object)"scr");
        }

        @NotNull
        public JsonParser<G> getJsonParser() {
            return ScreenshotServiceModuleEntryPoint.access$getConfigParser$p(this.a);
        }

        @NotNull
        public Converter<G, byte[]> getProtobufConverter() {
            return ScreenshotServiceModuleEntryPoint.access$getConfigConverter$p(this.a);
        }

        @NotNull
        public RemoteConfigUpdateListener<G> getRemoteConfigUpdateListener() {
            return ScreenshotServiceModuleEntryPoint.access$getConfigUpdateListener$p(this.a);
        }
    };
    private final clientConfigProvider.1 h = new ClientConfigProvider(this){
        final ScreenshotServiceModuleEntryPoint a;
        {
            this.a = screenshotServiceModuleEntryPoint;
        }

        @Nullable
        public Bundle getConfigBundleForClient() {
            j0 j04 = ScreenshotServiceModuleEntryPoint.access$getBundleConverter$p(this.a);
            g0 g02 = ScreenshotServiceModuleEntryPoint.access$getConfig$p(this.a);
            j04.getClass();
            if (g02 == null) {
                j04 = null;
            } else {
                j04 = new Bundle();
                j04.putParcelable("config", new B(g02));
            }
            return j04;
        }
    };

    public ScreenshotServiceModuleEntryPoint() {
        this.f = "screenshot";
    }

    public static final /* synthetic */ j0 access$getBundleConverter$p(ScreenshotServiceModuleEntryPoint screenshotServiceModuleEntryPoint) {
        return screenshotServiceModuleEntryPoint.b;
    }

    public static final /* synthetic */ g0 access$getConfig$p(ScreenshotServiceModuleEntryPoint screenshotServiceModuleEntryPoint) {
        return screenshotServiceModuleEntryPoint.a;
    }

    public static final /* synthetic */ H access$getConfigConverter$p(ScreenshotServiceModuleEntryPoint screenshotServiceModuleEntryPoint) {
        return screenshotServiceModuleEntryPoint.d;
    }

    public static final /* synthetic */ I access$getConfigParser$p(ScreenshotServiceModuleEntryPoint screenshotServiceModuleEntryPoint) {
        return screenshotServiceModuleEntryPoint.c;
    }

    public static final /* synthetic */ configUpdateListener.1 access$getConfigUpdateListener$p(ScreenshotServiceModuleEntryPoint screenshotServiceModuleEntryPoint) {
        return screenshotServiceModuleEntryPoint.e;
    }

    public static final /* synthetic */ void access$setConfig$p(ScreenshotServiceModuleEntryPoint screenshotServiceModuleEntryPoint, g0 g02) {
        screenshotServiceModuleEntryPoint.a = g02;
    }

    @Override
    @NotNull
    public ClientConfigProvider getClientConfigProvider() {
        return this.h;
    }

    @Override
    @NotNull
    public String getIdentifier() {
        return this.f;
    }

    @Override
    @NotNull
    public RemoteConfigExtensionConfiguration<G> getRemoteConfigExtensionConfiguration() {
        return this.g;
    }

    @Override
    public void initServiceSide(@NotNull ServiceContext object, @NotNull ModuleRemoteConfig<G> moduleRemoteConfig) {
        object = moduleRemoteConfig.getFeaturesConfig();
        object = object != null ? new g0((G)object) : null;
        this.a = object;
    }
}


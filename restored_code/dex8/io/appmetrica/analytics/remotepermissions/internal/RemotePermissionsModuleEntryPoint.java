/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.b1
 *  kotlin.collections.s0
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.remotepermissions.internal;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.remotepermissions.impl.a;
import io.appmetrica.analytics.remotepermissions.impl.b;
import io.appmetrica.analytics.remotepermissions.impl.d;
import io.appmetrica.analytics.remotepermissions.impl.e;
import io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00020\u0004B\u0007\u00a2\u0006\u0004\b\u001f\u0010 J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016\u00a2\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096D\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006!"}, d2={"Lio/appmetrica/analytics/remotepermissions/internal/RemotePermissionsModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceEntryPoint;", "Lio/appmetrica/analytics/remotepermissions/impl/a;", "Lio/appmetrica/analytics/modulesapi/internal/common/AskForPermissionStrategyModuleProvider;", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigUpdateListener;", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;", "config", "Lkotlin/k0;", "onRemoteConfigUpdated", "(Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;)V", "Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;", "serviceContext", "initialConfig", "initServiceSide", "(Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;)V", "", "e", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/coreapi/internal/permission/PermissionStrategy;", "getAskForPermissionStrategy", "()Lio/appmetrica/analytics/coreapi/internal/permission/PermissionStrategy;", "askForPermissionStrategy", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "f", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "getRemoteConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "remoteConfigExtensionConfiguration", "<init>", "()V", "remote-permissions_release"}, k=1, mv={1, 6, 0})
public final class RemotePermissionsModuleEntryPoint
extends ModuleServiceEntryPoint<a>
implements AskForPermissionStrategyModuleProvider,
RemoteConfigUpdateListener<a> {
    private final d a = new d();
    private final b b = new b();
    private final RemotePermissionsModuleEntryPoint c = this;
    private final e d = new e();
    private final String e;
    private final remoteConfigExtensionConfiguration.1 f = new RemoteConfigExtensionConfiguration<a>(this){
        final RemotePermissionsModuleEntryPoint a;
        {
            this.a = remotePermissionsModuleEntryPoint;
        }

        @NotNull
        public Map<String, Integer> getBlocks() {
            return s0.g(z.a("permissions", 1));
        }

        @NotNull
        public List<String> getFeatures() {
            return t.m();
        }

        @NotNull
        public JsonParser<a> getJsonParser() {
            return RemotePermissionsModuleEntryPoint.access$getParser$p(this.a);
        }

        @NotNull
        public Converter<a, byte[]> getProtobufConverter() {
            return RemotePermissionsModuleEntryPoint.access$getConverter$p(this.a);
        }

        @NotNull
        public RemoteConfigUpdateListener<a> getRemoteConfigUpdateListener() {
            return RemotePermissionsModuleEntryPoint.access$getListener$p(this.a);
        }
    };

    public RemotePermissionsModuleEntryPoint() {
        this.e = "rp";
    }

    public static final /* synthetic */ Converter access$getConverter$p(RemotePermissionsModuleEntryPoint remotePermissionsModuleEntryPoint) {
        return remotePermissionsModuleEntryPoint.b;
    }

    public static final /* synthetic */ RemoteConfigUpdateListener access$getListener$p(RemotePermissionsModuleEntryPoint remotePermissionsModuleEntryPoint) {
        return remotePermissionsModuleEntryPoint.c;
    }

    public static final /* synthetic */ JsonParser access$getParser$p(RemotePermissionsModuleEntryPoint remotePermissionsModuleEntryPoint) {
        return remotePermissionsModuleEntryPoint.a;
    }

    @Override
    @NotNull
    public PermissionStrategy getAskForPermissionStrategy() {
        return this.d;
    }

    @Override
    @NotNull
    public String getIdentifier() {
        return this.e;
    }

    @Override
    @NotNull
    public RemoteConfigExtensionConfiguration<a> getRemoteConfigExtensionConfiguration() {
        return this.f;
    }

    @Override
    public void initServiceSide(@NotNull ServiceContext object, @NotNull ModuleRemoteConfig<a> object2) {
        e e11;
        block6: {
            block5: {
                e11 = this.d;
                object = object2.getFeaturesConfig();
                if (object == null) break block5;
                object = object2 = ((a)object).a;
                if (object2 != null) break block6;
            }
            object = b1.f();
        }
        synchronized (e11) {
            e11.a = object;
            return;
        }
    }

    @Override
    public void onRemoteConfigUpdated(@NotNull ModuleRemoteConfig<a> object) {
        e e11;
        block6: {
            block5: {
                e11 = this.d;
                if ((object = object.getFeaturesConfig()) == null) break block5;
                Set set = ((a)object).a;
                object = set;
                if (set != null) break block6;
            }
            object = b1.f();
        }
        synchronized (e11) {
            e11.a = object;
            return;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.screenshot.internal;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.screenshot.impl.B;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.P;
import io.appmetrica.analytics.screenshot.impl.S;
import io.appmetrica.analytics.screenshot.impl.d;
import io.appmetrica.analytics.screenshot.impl.d0;
import io.appmetrica.analytics.screenshot.impl.h;
import io.appmetrica.analytics.screenshot.impl.k;
import io.appmetrica.analytics.screenshot.impl.l;
import io.appmetrica.analytics.screenshot.impl.u;
import io.appmetrica.analytics.screenshot.impl.v;
import io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0016\u0010\tJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0017"}, d2={"Lio/appmetrica/analytics/screenshot/internal/ScreenshotClientModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/client/ModuleClientEntryPoint;", "Lio/appmetrica/analytics/screenshot/impl/B;", "Lio/appmetrica/analytics/modulesapi/internal/client/ClientContext;", "clientContext", "Lkotlin/k0;", "initClientSide", "(Lio/appmetrica/analytics/modulesapi/internal/client/ClientContext;)V", "onActivated", "()V", "", "e", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", "f", "Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", "getServiceConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", "serviceConfigExtensionConfiguration", "<init>", "screenshot_release"}, k=1, mv={1, 6, 0})
public final class ScreenshotClientModuleEntryPoint
extends ModuleClientEntryPoint<B> {
    private k a;
    private final h b = new h();
    private final configUpdateListener.1 c = new ServiceConfigUpdateListener<B>(this){
        final ScreenshotClientModuleEntryPoint a;
        {
            this.a = screenshotClientModuleEntryPoint;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onServiceConfigUpdated(@NotNull ModuleServiceConfig<B> object) {
            ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint = this.a;
            synchronized (screenshotClientModuleEntryPoint) {
                Throwable throwable2;
                block7: {
                    Object var3_4;
                    block8: {
                        block6: {
                            boolean bl2;
                            try {
                                object = object.getFeaturesConfig();
                                var3_4 = null;
                                if (object != null) {
                                    bl2 = ((B)object).b();
                                    D d14 = ((B)object).a();
                                    object = d14 != null ? new l(d14) : null;
                                }
                                break block6;
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                            k k11 = new k(bl2, (l)object);
                            object = k11;
                            break block8;
                        }
                        object = null;
                    }
                    ScreenshotClientModuleEntryPoint.access$setClientSideRemoteScreenshotConfig$p(screenshotClientModuleEntryPoint, (k)object);
                    if (ScreenshotClientModuleEntryPoint.access$getScreenshotCaptorsController$p(screenshotClientModuleEntryPoint) != null) {
                        object = ScreenshotClientModuleEntryPoint.access$getScreenshotCaptorsController$p(screenshotClientModuleEntryPoint);
                        if (object == null) {
                            y.B("screenshotCaptorsController");
                            object = var3_4;
                        }
                        ((S)object).a(ScreenshotClientModuleEntryPoint.access$getClientSideRemoteScreenshotConfig$p(screenshotClientModuleEntryPoint));
                    }
                    object = k0.a;
                    return;
                }
                throw throwable2;
            }
        }
    };
    private S d;
    private final String e;
    private final serviceConfigExtensionConfiguration.1 f = new ServiceConfigExtensionConfiguration<B>(this){
        final ScreenshotClientModuleEntryPoint a;
        {
            this.a = screenshotClientModuleEntryPoint;
        }

        @NotNull
        public h getBundleConverter() {
            return ScreenshotClientModuleEntryPoint.access$getBundleConverter$p(this.a);
        }

        @NotNull
        public configUpdateListener.1 getServiceConfigUpdateListener() {
            return ScreenshotClientModuleEntryPoint.access$getConfigUpdateListener$p(this.a);
        }
    };

    public ScreenshotClientModuleEntryPoint() {
        this.e = "screenshot";
    }

    public static final /* synthetic */ h access$getBundleConverter$p(ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint) {
        return screenshotClientModuleEntryPoint.b;
    }

    public static final /* synthetic */ k access$getClientSideRemoteScreenshotConfig$p(ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint) {
        return screenshotClientModuleEntryPoint.a;
    }

    public static final /* synthetic */ configUpdateListener.1 access$getConfigUpdateListener$p(ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint) {
        return screenshotClientModuleEntryPoint.c;
    }

    public static final /* synthetic */ S access$getScreenshotCaptorsController$p(ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint) {
        return screenshotClientModuleEntryPoint.d;
    }

    public static final /* synthetic */ void access$setClientSideRemoteScreenshotConfig$p(ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint, k k11) {
        screenshotClientModuleEntryPoint.a = k11;
    }

    @Override
    @NotNull
    public String getIdentifier() {
        return this.e;
    }

    @Override
    @NotNull
    public ServiceConfigExtensionConfiguration<B> getServiceConfigExtensionConfiguration() {
        return this.f;
    }

    @Override
    public void initClientSide(@NotNull ClientContext object) {
        synchronized (this) {
            S s13;
            v v14 = new v((ClientContext)object);
            d d14 = new d((ClientContext)object, v14);
            d0 d03 = new d0((ClientContext)object, v14);
            u u11 = new u((ClientContext)object, v14);
            this.d = s13 = new S(t.p((Object[])new P[]{d14, d03, u11}));
            object = k0.a;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void onActivated() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object;
                block4: {
                    S s13;
                    try {
                        s13 = this.d;
                        if (s13 == null) break block4;
                        object = this.a;
                        Iterator iterator = s13.a.iterator();
                        while (iterator.hasNext()) {
                            ((P)iterator.next()).a();
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    s13.a((k)object);
                }
                object = k0.a;
                return;
            }
            throw throwable2;
        }
    }
}


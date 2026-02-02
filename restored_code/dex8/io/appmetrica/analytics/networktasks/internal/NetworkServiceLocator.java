/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.AnyThread
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.internal.NetworkCore;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0004R\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2={"Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator;", "Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLifecycleObserver;", "Lkotlin/k0;", "onCreate", "()V", "onDestroy", "Lio/appmetrica/analytics/networktasks/internal/NetworkCore;", "a", "Lio/appmetrica/analytics/networktasks/internal/NetworkCore;", "getNetworkCore", "()Lio/appmetrica/analytics/networktasks/internal/NetworkCore;", "networkCore", "Lio/appmetrica/analytics/coreapi/internal/io/IExecutionPolicy;", "executionPolicy", "<init>", "(Lio/appmetrica/analytics/coreapi/internal/io/IExecutionPolicy;)V", "Companion", "network-tasks_release"}, k=1, mv={1, 6, 0})
public final class NetworkServiceLocator
implements NetworkServiceLifecycleObserver {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static volatile NetworkServiceLocator b;
    private final NetworkCore a;

    @AnyThread
    @VisibleForTesting
    public NetworkServiceLocator(@NotNull IExecutionPolicy object) {
        object = new NetworkCore((IExecutionPolicy)object);
        ((Thread)object).setName("IAA-NC");
        ((Thread)object).start();
        this.a = object;
    }

    @JvmStatic
    @NotNull
    public static final NetworkServiceLocator getInstance() {
        return Companion.getInstance();
    }

    @JvmStatic
    @AnyThread
    public static final void init(@NotNull IExecutionPolicy iExecutionPolicy) {
        Companion.init(iExecutionPolicy);
    }

    @JvmStatic
    @VisibleForTesting
    public static final void init(@NotNull NetworkServiceLocator networkServiceLocator) {
        Companion.init(networkServiceLocator);
    }

    @NotNull
    public final NetworkCore getNetworkCore() {
        return this.a;
    }

    @Override
    public void onCreate() {
    }

    @Override
    public void onDestroy() {
        this.a.stopTasks();
    }

    @Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\b\b\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2={"Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator$Companion;", "", "Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator;", "getInstance", "()Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator;", "Lio/appmetrica/analytics/coreapi/internal/io/IExecutionPolicy;", "executionPolicy", "Lkotlin/k0;", "init", "(Lio/appmetrica/analytics/coreapi/internal/io/IExecutionPolicy;)V", "networkServiceLocator", "(Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator;)V", "instance", "Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator;", "network-tasks_release"}, k=1, mv={1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        @JvmStatic
        @NotNull
        public final NetworkServiceLocator getInstance() {
            NetworkServiceLocator networkServiceLocator;
            NetworkServiceLocator networkServiceLocator2 = networkServiceLocator = b;
            if (networkServiceLocator == null) {
                y.B("instance");
                networkServiceLocator2 = null;
            }
            return networkServiceLocator2;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @JvmStatic
        @AnyThread
        public final void init(@NotNull IExecutionPolicy object) {
            if (b != null) return;
            synchronized (NetworkServiceLocator.class) {
                Throwable throwable2;
                block4: {
                    block3: {
                        try {
                            if (b != null) break block3;
                            NetworkServiceLocator networkServiceLocator = new NetworkServiceLocator((IExecutionPolicy)object);
                            b = networkServiceLocator;
                        }
                        catch (Throwable throwable2) {
                            break block4;
                        }
                    }
                    object = k0.a;
                    return;
                }
                throw throwable2;
            }
        }

        @JvmStatic
        @VisibleForTesting
        public final void init(@NotNull NetworkServiceLocator networkServiceLocator) {
            b = networkServiceLocator;
        }
    }
}


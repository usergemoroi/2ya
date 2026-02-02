/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.WorkerThread
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingClient$Builder
 *  com.android.billingclient.api.BillingClientStateListener
 *  com.android.billingclient.api.PendingPurchasesParams
 *  com.android.billingclient.api.PurchasesUpdatedListener
 */
package io.appmetrica.analytics.billingv8.internal;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.PurchasesUpdatedListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv8.impl.b;
import io.appmetrica.analytics.billingv8.impl.c;
import io.appmetrica.analytics.billingv8.impl.d;
import io.appmetrica.analytics.billingv8.impl.l;
import io.appmetrica.analytics.billingv8.impl.n;
import io.appmetrica.analytics.billingv8.impl.o;
import io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor$updateBilling$1;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\n\u0010\u0005\u00a8\u0006\u001a"}, d2={"Lio/appmetrica/analytics/billingv8/internal/BillingLibraryMonitor;", "Lio/appmetrica/analytics/billinginterface/internal/monitor/BillingMonitor;", "Lio/appmetrica/analytics/billingv8/impl/n;", "Lkotlin/k0;", "onSessionResumed", "()V", "Lio/appmetrica/analytics/billinginterface/internal/config/BillingConfig;", "billingConfig", "onBillingConfigChanged", "(Lio/appmetrica/analytics/billinginterface/internal/config/BillingConfig;)V", "onUpdateFinished", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "workerExecutor", "uiExecutor", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoStorage;", "billingInfoStorage", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoSender;", "billingInfoSender", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoManager;", "billingInfoManager", "Lio/appmetrica/analytics/billinginterface/internal/update/UpdatePolicy;", "updatePolicy", "<init>", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoStorage;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoSender;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoManager;Lio/appmetrica/analytics/billinginterface/internal/update/UpdatePolicy;)V", "billing-v8_release"}, k=1, mv={1, 6, 0})
public final class BillingLibraryMonitor
implements BillingMonitor,
n {
    private final Context a;
    private final Executor b;
    private final Executor c;
    private final BillingInfoSender d;
    private final BillingInfoManager e;
    private final UpdatePolicy f;
    private BillingConfig g;
    private boolean h;

    public BillingLibraryMonitor(@NotNull Context context, @NotNull Executor executor, @NotNull Executor executor2, @NotNull BillingInfoStorage billingInfoStorage, @NotNull BillingInfoSender billingInfoSender, @NotNull BillingInfoManager billingInfoManager, @NotNull UpdatePolicy updatePolicy) {
        this.a = context;
        this.b = executor;
        this.c = executor2;
        this.d = billingInfoSender;
        this.e = billingInfoManager;
        this.f = updatePolicy;
    }

    public /* synthetic */ BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy, int n10, p p14) {
        if ((n10 & 0x20) != 0) {
            billingInfoManager = new c(billingInfoStorage);
        }
        if ((n10 & 0x40) != 0) {
            updatePolicy = new o(null, 1, null);
        }
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, billingInfoManager, updatePolicy);
    }

    public static final /* synthetic */ BillingInfoManager access$getBillingInfoManager$p(BillingLibraryMonitor billingLibraryMonitor) {
        return billingLibraryMonitor.e;
    }

    public static final /* synthetic */ BillingInfoSender access$getBillingInfoSender$p(BillingLibraryMonitor billingLibraryMonitor) {
        return billingLibraryMonitor.d;
    }

    public static final /* synthetic */ Executor access$getUiExecutor$p(BillingLibraryMonitor billingLibraryMonitor) {
        return billingLibraryMonitor.c;
    }

    public static final /* synthetic */ UpdatePolicy access$getUpdatePolicy$p(BillingLibraryMonitor billingLibraryMonitor) {
        return billingLibraryMonitor.f;
    }

    public static final /* synthetic */ Executor access$getWorkerExecutor$p(BillingLibraryMonitor billingLibraryMonitor) {
        return billingLibraryMonitor.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void onBillingConfigChanged(@Nullable BillingConfig billingConfig) {
        synchronized (this) {
            block5: {
                try {
                    boolean bl2 = y.e(this.g, billingConfig);
                    if (!bl2) break block5;
                }
                catch (Throwable throwable) {}
                return;
            }
            this.g = billingConfig;
            if (billingConfig != null && !this.h) {
                this.h = true;
                BillingClient.Builder builder = BillingClient.newBuilder((Context)this.a);
                Object object = new l();
                BillingClient billingClient = builder.setListener((PurchasesUpdatedListener)object).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).build();
                object = new BillingLibraryMonitor$updateBilling$1(this);
                d d14 = new d(billingClient);
                b b11 = new b(billingConfig, billingClient, (BillingLibraryMonitor$updateBilling$1)object, d14, this);
                billingClient.startConnection((BillingClientStateListener)b11);
            }
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @WorkerThread
    public void onSessionResumed() {
        BillingConfig billingConfig;
        try {
            billingConfig = this.g;
            if (billingConfig == null) return;
        }
        catch (Throwable throwable) {
            return;
        }
        if (!this.h) {
            this.h = true;
            BillingClient.Builder builder = BillingClient.newBuilder((Context)this.a);
            Object object = new l();
            builder = builder.setListener((PurchasesUpdatedListener)object).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).build();
            object = new BillingLibraryMonitor$updateBilling$1(this);
            d d14 = new d((BillingClient)builder);
            b b11 = new b(billingConfig, (BillingClient)builder, (BillingLibraryMonitor$updateBilling$1)object, d14, this);
            builder.startConnection((BillingClientStateListener)b11);
        }
    }

    @Override
    public void onUpdateFinished() {
        synchronized (this) {
            this.h = false;
            return;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.e;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

public class NetworkTask {
    private int a = 1;
    private final Executor b;
    private final IExecutionPolicy c;
    private final ExponentialBackoffPolicy d;
    private final UnderlyingNetworkTask e;
    private final List f;
    private final String g;

    public NetworkTask(@NonNull Executor executor, @NonNull IExecutionPolicy iExecutionPolicy, @NonNull ExponentialBackoffPolicy exponentialBackoffPolicy, @NonNull UnderlyingNetworkTask underlyingNetworkTask, @NonNull List<ShouldTryNextHostCondition> list, @NonNull String string2) {
        this.b = executor;
        this.c = iExecutionPolicy;
        this.d = exponentialBackoffPolicy;
        this.e = underlyingNetworkTask;
        this.f = list;
        this.g = string2;
    }

    private boolean a(int n10) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    if (this.a(new int[]{n10})) {
                        this.a = n10;
                        return true;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean a(int ... var1_1) {
        synchronized (this) {
            block24: {
                try {
                    var9_3 = Boolean.TRUE;
                    var3_4 = this.a;
                    var4_5 = ((int[])var1_1).length;
                    var2_6 = 0;
lbl7:

                    while (true) {
                        var8_10 = var9_3;
                        if (var2_6 < var4_5) {
                            var5_7 = io.appmetrica.analytics.networktasks.impl.e.a(var1_1[var2_6]);
                            var6_8 = true;
                            var7_9 = true;
                        }

                        break;
                    }
                }
                catch (Throwable var1_2) {
                    break block24;
                }
                cfr_temp_0 = -2147483648;
                block16: do {
                    switch (cfr_temp_0 == -2147483648 ? var5_7 : cfr_temp_0) {
                        default: {
                            var8_10 = Boolean.FALSE;
                            break;
                        }
                        case 8: {
                            if (var3_4 == 1) {
                                cfr_temp_0 = 0;
                                continue block16;
                            }
                            var6_8 = var3_4 != 9 ? var7_9 : false;
                            var8_10 = var6_8;
                            break;
                        }
                        case 7: {
                            if (var3_4 != 5 && var3_4 != 6 && var3_4 != 7 && var3_4 != 2 && var3_4 != 3 && var3_4 != 4) {
                                cfr_temp_0 = 0;
                                if (var3_4 != 9) continue block16;
                                var8_10 = Boolean.FALSE;
                                break;
                            }
                            var8_10 = Boolean.TRUE;
                            break;
                        }
                        case 6: {
                            cfr_temp_0 = 2;
                            if (var3_4 != 3) continue block16;
                            var8_10 = Boolean.TRUE;
                            break;
                        }
                        case 4: 
                        case 5: {
                            if (var3_4 == 4) {
                                var8_10 = Boolean.TRUE;
                                break;
                            }
                            cfr_temp_0 = 0;
                            if (var3_4 != 9) continue block16;
                            var8_10 = Boolean.FALSE;
                            break;
                        }
                        case 3: {
                            if (var3_4 != 3 && var3_4 != 5 && var3_4 != 6) {
                                cfr_temp_0 = 0;
                                if (var3_4 != 9) continue block16;
                                var8_10 = Boolean.FALSE;
                                break;
                            }
                            var8_10 = Boolean.TRUE;
                            break;
                        }
                        case 2: {
                            if (var3_4 == 2) {
                                var8_10 = Boolean.TRUE;
                                break;
                            }
                            cfr_temp_0 = 0;
                            if (var3_4 != 9) continue block16;
                            var8_10 = Boolean.FALSE;
                            break;
                        }
                        case 1: {
                            if (var3_4 != 1) {
                                var6_8 = false;
                            }
                            var8_10 = var6_8;
                            break;
                        }
                        case 0: {
                            var8_10 = null;
                        }
                    }
                    break;
                } while (true);
                if (!Boolean.TRUE.equals(var8_10)) ** GOTO lbl-1000
                ++var2_6;

                {
                    var1_1 = Boolean.TRUE;
                    var1_1.equals(var8_10);
                    return var1_1.equals(var8_10);
                }
            }
            throw var1_2;
        }
    }

    @NonNull
    public String description() {
        return this.e.description();
    }

    @NonNull
    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.c;
    }

    @NonNull
    public Executor getExecutor() {
        return this.b;
    }

    @NonNull
    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.d;
    }

    @NonNull
    public RequestDataHolder getRequestDataHolder() {
        return this.e.getRequestDataHolder();
    }

    @NonNull
    public ResponseDataHolder getResponseDataHolder() {
        return this.e.getResponseDataHolder();
    }

    @Nullable
    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.e.getRetryPolicyConfig();
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.e.getSslSocketFactory();
    }

    @NonNull
    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.e;
    }

    @Nullable
    public String getUrl() {
        return this.e.getFullUrlFormer().getUrl();
    }

    @NonNull
    public String getUserAgent() {
        return this.g;
    }

    public boolean isRemoved() {
        boolean bl2 = this.a == 9;
        return bl2;
    }

    public boolean onCreateNetworkTask() {
        if (this.a(3)) {
            return this.e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean bl2 = this.a(4);
        if (bl2) {
            this.e.getFullUrlFormer().incrementAttemptNumber();
            this.e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.e.onPerformRequest();
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean onRequestComplete() {
        synchronized (this) {
            try {
                if (!this.a(5, 6)) return false;
                boolean bl2 = this.e.onRequestComplete();
                this.a = bl2 ? 5 : 6;
                boolean bl3 = true;
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl7 : MonitorExitStatement: MONITOREXIT : this
                if (!bl3) return bl2;
                this.e.onPostRequestComplete(bl2);
                return bl2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void onRequestError(@Nullable Throwable throwable) {
        if (this.a(6)) {
            this.e.onRequestError(throwable);
        }
    }

    public void onShouldNotExecute() {
        if (this.a(7)) {
            this.e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean bl2 = this.a(2);
        if (bl2) {
            this.e.onTaskAdded();
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onTaskFinished() {
        boolean bl2;
        int n10;
        synchronized (this) {
            n10 = this.a;
            bl2 = this.a(8);
        }
        if (!bl2) return;
        this.e.onTaskFinished();
        if (n10 == 5) {
            this.e.onSuccessfulTaskFinished();
            return;
        }
        if (n10 != 6) {
            if (n10 != 7) return;
        }
        this.e.onUnsuccessfulTaskFinished();
    }

    public void onTaskRemoved() {
        if (this.a(9)) {
            this.e.onTaskRemoved();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean shouldTryNextHost() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                int n10;
                boolean bl3;
                block5: {
                    block4: {
                        try {
                            bl3 = this.e.getFullUrlFormer().hasMoreHosts();
                            n10 = this.e.getResponseDataHolder().getResponseCode();
                            Iterator iterator = this.f.iterator();
                            do {
                                boolean bl4 = iterator.hasNext();
                                bl2 = true;
                                if (!bl4) break block4;
                            } while (((ShouldTryNextHostCondition)iterator.next()).shouldTryNextHost(n10));
                            n10 = 0;
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    n10 = 1;
                }
                int n13 = this.a;
                if (n13 == 9) return false;
                if (n13 == 8) return false;
                if (!bl3) return false;
                if (n10 == 0) return false;
                return bl2;
            }
            throw throwable2;
        }
    }

    public static final class Method
    extends Enum<Method> {
        public static final /* enum */ Method GET;
        public static final /* enum */ Method POST;
        private static final Method[] a;

        static {
            Method method;
            Method method2;
            GET = method2 = new Method();
            POST = method = new Method();
            a = new Method[]{method2, method};
        }

        public static Method valueOf(String string2) {
            return Enum.valueOf(Method.class, string2);
        }

        public static Method[] values() {
            return (Method[])a.clone();
        }
    }

    public static interface ShouldTryNextHostCondition {
        public boolean shouldTryNextHost(int var1);
    }
}


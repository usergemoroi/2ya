/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  kotlin.collections.t
 *  kotlin.text.p
 */
package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.impl.b;
import io.appmetrica.analytics.networktasks.impl.f;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import kotlin.text.p;

public final class h
implements Runnable {
    public final NetworkTask a;
    public final InterruptionSafeThread b;
    public final f c;

    public h(NetworkTask networkTask, InterruptionSafeThread interruptionSafeThread, f f11) {
        this.a = networkTask;
        this.b = interruptionSafeThread;
        this.c = f11;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void run() {
        Object object;
        ExponentialBackoffPolicy exponentialBackoffPolicy = this.a.getExponentialBackoffPolicy();
        boolean bl2 = this.a.getConnectionExecutionPolicy().canBeExecuted();
        boolean bl3 = this.a.getExponentialBackoffPolicy().canBeExecuted(this.a.getRetryPolicyConfig());
        if (this.b.isRunning() && bl2 && bl3) {
            bl2 = this.a.onCreateNetworkTask();
            object = null;
        } else {
            this.a.onShouldNotExecute();
            return;
        }
        while (this.b.isRunning() && bl2 && exponentialBackoffPolicy.canBeExecuted(this.a.getRetryPolicyConfig())) {
            boolean bl4;
            block13: {
                block14: {
                    NetworkTask networkTask;
                    block10: {
                        Object object2;
                        block11: {
                            block12: {
                                int n10;
                                byte[] byArray;
                                object = this.c;
                                networkTask = this.a;
                                object.getClass();
                                bl2 = networkTask.onPerformRequest();
                                bl4 = false;
                                if (!bl2) break block10;
                                object = networkTask.getUrl();
                                if (object == null || TextUtils.isEmpty((CharSequence)((Object)p.g1((CharSequence)object)).toString())) break block11;
                                object = new Request.Builder((String)object).addHeader("Accept", "application/json").addHeader("User-Agent", networkTask.getUserAgent());
                                object2 = networkTask.getRequestDataHolder();
                                for (Map.Entry entry : ((RequestDataHolder)object2).getHeaders().entrySet()) {
                                    ((Request.Builder)object).addHeader((String)entry.getKey(), t.B0((Iterable)((Iterable)entry.getValue()), (CharSequence)",", null, null, (int)0, null, null, (int)62, null));
                                }
                                if (NetworkTask.Method.POST == ((RequestDataHolder)object2).getMethod() && (byArray = ((RequestDataHolder)object2).getPostData()) != null && ((n10 = byArray.length == 0 ? 1 : 0) ^ 1) == 1) {
                                    ((Request.Builder)object).post(byArray);
                                    Long l10 = ((RequestDataHolder)object2).getSendTimestamp();
                                    if (l10 != null) {
                                        ((Request.Builder)object).addHeader("Send-Timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(l10)));
                                    }
                                    if ((object2 = ((RequestDataHolder)object2).getSendTimezoneSec()) != null) {
                                        ((Request.Builder)object).addHeader("Send-Timezone", String.valueOf((Integer)object2));
                                    }
                                }
                                object2 = new NetworkClient.Builder();
                                n10 = io.appmetrica.analytics.networktasks.impl.b.a;
                                object = ((NetworkClient.Builder)object2).withConnectTimeout(n10).withReadTimeout(n10).withSslSocketFactory(networkTask.getSslSocketFactory()).build().newCall(((Request.Builder)object).build()).execute();
                                n10 = ((Response)object).getCode();
                                object2 = networkTask.getResponseDataHolder();
                                ((ResponseDataHolder)object2).setResponseCode(n10);
                                ((ResponseDataHolder)object2).setResponseHeaders(CollectionUtils.convertMapKeysToLowerCase(((Response)object).getHeaders()));
                                if (((ResponseDataHolder)object2).isValidResponse()) {
                                    ((ResponseDataHolder)object2).setResponseData(((Response)object).getResponseData());
                                }
                                if (!((Response)object).isCompleted()) break block12;
                                bl3 = networkTask.onRequestComplete();
                                break block13;
                            }
                            networkTask.onRequestError(((Response)object).getException());
                            break block14;
                        }
                        object2 = new StringBuilder("Task ");
                        ((StringBuilder)object2).append(networkTask.description());
                        ((StringBuilder)object2).append(" url is `");
                        ((StringBuilder)object2).append((String)object);
                        ((StringBuilder)object2).append("`. All hosts = ");
                        object = networkTask.getUnderlyingTask().getFullUrlFormer().getAllHosts();
                        object = object != null ? object.toString() : null;
                        ((StringBuilder)object2).append((String)object);
                        networkTask.onRequestError(new IllegalArgumentException(((StringBuilder)object2).toString()));
                        break block14;
                    }
                    networkTask.onRequestError(null);
                }
                bl3 = false;
            }
            object = bl3;
            bl2 = bl4;
            if (!bl3) {
                bl2 = bl4;
                if (this.a.shouldTryNextHost()) {
                    bl2 = true;
                }
            }
            exponentialBackoffPolicy.onHostAttemptFinished(bl3);
        }
        exponentialBackoffPolicy.onAllHostsAttemptsFinished(y.e(object, Boolean.TRUE));
    }
}


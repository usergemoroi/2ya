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
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import javax.net.ssl.SSLSocketFactory;

public interface UnderlyingNetworkTask {
    @NonNull
    public String description();

    @NonNull
    public FullUrlFormer<?> getFullUrlFormer();

    @NonNull
    public RequestDataHolder getRequestDataHolder();

    @NonNull
    public ResponseDataHolder getResponseDataHolder();

    @Nullable
    public RetryPolicyConfig getRetryPolicyConfig();

    @Nullable
    public SSLSocketFactory getSslSocketFactory();

    public boolean onCreateTask();

    public void onPerformRequest();

    public void onPostRequestComplete(boolean var1);

    public boolean onRequestComplete();

    public void onRequestError(@Nullable Throwable var1);

    public void onShouldNotExecute();

    public void onSuccessfulTaskFinished();

    public void onTaskAdded();

    public void onTaskFinished();

    public void onTaskRemoved();

    public void onUnsuccessfulTaskFinished();
}


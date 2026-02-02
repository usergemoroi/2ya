/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.api;

import io.intercom.android.sdk.IntercomStatusCallback;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;

public class UserUpdater {
    private final Provider<Api> apiProvider;
    private OpsMetricTracker opsMetricTracker;
    private final Store<State> store;

    public UserUpdater(Provider<Api> provider, Store<State> store, OpsMetricTracker opsMetricTracker) {
        this.apiProvider = provider;
        this.store = store;
        this.opsMetricTracker = opsMetricTracker;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void updateUser(UserUpdateRequest userUpdateRequest, IntercomStatusCallback intercomStatusCallback) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        this.opsMetricTracker.trackEvent("start", "time-to-complete-ping-ms");
                        boolean bl2 = userUpdateRequest.isValidUpdate();
                        if (bl2) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                if (userUpdateRequest.isNewSession()) {
                    this.store.dispatch(Actions.sessionStarted());
                }
                this.apiProvider.get().updateUser(userUpdateRequest, intercomStatusCallback);
                return;
            }
            throw throwable2;
        }
    }
}


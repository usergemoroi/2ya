/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.user.DeviceData;
import io.intercom.android.sdk.utilities.ActivityFinisher;

public class ResetManager {
    private final ActivityFinisher activityFinisher;
    private final Provider<Api> apiProvider;
    private final Provider<AppConfig> appConfigProvider;
    private final Context context;
    private final IntercomDataLayer dataLayer;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Runnable hardResetTask;
    private final OverlayPresenter overlayPresenter;
    private final Store<State> store;
    private final Twig twig = LumberMill.getLogger();
    private final UserIdentity userIdentity;
    private final UserUpdater userUpdater;

    public ResetManager(Provider<Api> provider, UserIdentity userIdentity, OverlayPresenter overlayPresenter, Provider<AppConfig> provider2, Store<State> store, UserUpdater userUpdater, Context context, ActivityFinisher activityFinisher, IntercomDataLayer intercomDataLayer) {
        this.hardResetTask = new Runnable(this){
            final ResetManager this$0;
            {
                this.this$0 = resetManager;
            }

            @Override
            public void run() {
                this.this$0.hardReset();
            }
        };
        this.apiProvider = provider;
        this.userIdentity = userIdentity;
        this.overlayPresenter = overlayPresenter;
        this.appConfigProvider = provider2;
        this.store = store;
        this.userUpdater = userUpdater;
        this.context = context;
        this.activityFinisher = activityFinisher;
        this.dataLayer = intercomDataLayer;
    }

    public void clear() {
        this.handler.removeCallbacks(this.hardResetTask);
    }

    public void hardReset() {
        this.handler.removeCallbacks(this.hardResetTask);
        this.dataLayer.clear();
        if (this.isSoftReset()) {
            String string2 = DeviceData.getDeviceToken(this.context);
            if (TextUtils.isEmpty((CharSequence)string2)) {
                this.twig.internal("There is no device token to remove.");
            } else {
                this.apiProvider.get().removeDeviceToken(string2, this.userIdentity);
            }
            this.store.dispatch(Actions.hardReset());
        }
    }

    boolean isSoftReset() {
        return this.userIdentity.isSoftReset();
    }

    public void softReset() {
        this.activityFinisher.finishActivities();
        this.overlayPresenter.softReset();
        this.handler.postDelayed(this.hardResetTask, this.appConfigProvider.get().getSoftResetTimeoutMs());
        this.store.dispatch(Actions.softReset());
        this.twig.i("Successfully reset the user. To resume communicating with Intercom, you can register a user", new Object[0]);
    }
}


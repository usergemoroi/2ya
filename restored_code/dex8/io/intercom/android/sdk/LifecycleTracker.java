/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.app.KeyguardManager
 *  android.content.Context
 *  android.os.Looper
 *  android.text.TextUtils
 *  androidx.annotation.VisibleForTesting
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.ActivityLifecycleHandler;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.ResetManager;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.DeDuper;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.errorreporting.ErrorReporter;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import io.intercom.android.sdk.metrics.MetricsStore;
import io.intercom.android.sdk.push.IntercomLegacyPushClientHandler;
import io.intercom.android.sdk.push.SystemNotificationManager;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.utilities.SimpleActivityLifecycleCallbacks;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class LifecycleTracker
extends SimpleActivityLifecycleCallbacks
implements Application.ActivityLifecycleCallbacks {
    private final Provider<Api> apiProvider;
    private final DeDuper deDuper;
    private final ErrorReporter errorReporter;
    private final ActivityLifecycleHandler handler;
    private final MetricsStore metricsStore;
    private final ResetManager resetManager;
    private final Set<Integer> startedActivities = new HashSet<Integer>();
    final Store<State> store;
    private final SystemNotificationManager systemNotificationManager;
    private final TimeProvider timeProvider;
    private final Twig twig = LumberMill.getLogger();
    private final UserUpdater userUpdater;

    @VisibleForTesting
    LifecycleTracker(SystemNotificationManager systemNotificationManager, MetricsStore metricsStore, ErrorReporter errorReporter, DeDuper deDuper, TimeProvider timeProvider, UserUpdater userUpdater, Store<State> store, ResetManager resetManager, ActivityLifecycleHandler activityLifecycleHandler, Provider<Api> provider) {
        this.systemNotificationManager = systemNotificationManager;
        this.metricsStore = metricsStore;
        this.errorReporter = errorReporter;
        this.deDuper = deDuper;
        this.timeProvider = timeProvider;
        this.userUpdater = userUpdater;
        this.store = store;
        this.resetManager = resetManager;
        this.handler = activityLifecycleHandler;
        this.apiProvider = provider;
    }

    static LifecycleTracker create(SystemNotificationManager systemNotificationManager, MetricsStore metricsStore, ErrorReporter errorReporter, DeDuper deDuper, TimeProvider timeProvider, UserUpdater userUpdater, Store<State> store, ResetManager resetManager, float f11, Provider<Api> provider) {
        return new LifecycleTracker(systemNotificationManager, metricsStore, errorReporter, deDuper, timeProvider, userUpdater, store, resetManager, new ActivityLifecycleHandler(Looper.getMainLooper(), store, f11), provider);
    }

    private void handleExtras(Activity activity) {
        String string2 = activity.getIntent().getStringExtra("io.intercom.android.sdk.INTERCOM_PUSH_INSTANCE_ID");
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            Twig twig = this.twig;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Activity started from Mobile Push: ");
            stringBuilder.append(activity);
            twig.i(stringBuilder.toString(), new Object[0]);
            this.apiProvider.get().markPushAsOpened(string2);
            Injector.get().getMetricTracker().openedPushOnlyNotification(string2);
        }
    }

    private boolean hasApplicationBecomeBackgrounded(Activity activity) {
        boolean bl2 = this.isApplicationInBackground(activity) && this.store.select(Selectors.APP_IS_BACKGROUNDED) == false;
        return bl2;
    }

    private static boolean isScreenLocked(Context context) {
        return ((KeyguardManager)context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    private void registerActivity(Activity activity) {
        this.startedActivities.add(System.identityHashCode(activity));
        Twig twig = this.twig;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Started observing ");
        stringBuilder.append(activity);
        twig.i(stringBuilder.toString(), new Object[0]);
    }

    private void unregisterActivity(Activity activity) {
        this.startedActivities.remove(System.identityHashCode(activity));
        Twig twig = this.twig;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stopped observing ");
        stringBuilder.append(activity);
        twig.i(stringBuilder.toString(), new Object[0]);
    }

    @VisibleForTesting
    boolean isApplicationInBackground(Activity activity) {
        boolean bl2 = LifecycleTracker.isScreenLocked((Context)activity) || this.startedActivities.isEmpty() && !activity.isChangingConfigurations();
        return bl2;
    }

    @Override
    public void onActivityPaused(Activity activity) {
        this.handler.sendMessage(ActivityLifecycleHandler.getMessage(2, activity));
    }

    @Override
    public void onActivityResumed(Activity activity) {
        this.handler.removeMessages(1, activity);
        this.handler.sendMessage(ActivityLifecycleHandler.getMessage(0, activity));
    }

    @Override
    public void onActivityStarted(Activity activity) {
        this.registerActivity(activity);
        this.handleExtras(activity);
        if (this.store.select(Selectors.APP_IS_BACKGROUNDED).booleanValue()) {
            this.store.dispatch(Actions.appEnteredForeground(this.timeProvider.currentTimeMillis()));
            this.metricsStore.loadAndSendMetrics();
            this.errorReporter.sendSavedReport();
            if (activity instanceof IntercomRootActivity) {
                IntercomLegacyPushClientHandler.Companion.clear(this.systemNotificationManager, (Context)activity);
            }
        }
    }

    @Override
    public void onActivityStopped(Activity activity) {
        this.unregisterActivity(activity);
        this.handler.removeMessages(1, activity);
        this.handler.sendMessage(ActivityLifecycleHandler.getMessage(3, activity));
        if (this.hasApplicationBecomeBackgrounded(activity)) {
            if (this.resetManager.isSoftReset()) {
                this.resetManager.hardReset();
            }
            this.store.dispatch(Actions.appEnteredBackground(this.timeProvider.currentTimeMillis()));
            this.deDuper.reset();
            this.metricsStore.loadAndSendMetrics();
        }
    }

    void registerActivities(Collection<Integer> collection) {
        this.startedActivities.addAll(collection);
    }
}


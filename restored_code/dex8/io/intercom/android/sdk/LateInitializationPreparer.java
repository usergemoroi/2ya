/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.LifecycleTracker;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.SimpleActivityLifecycleCallbacks;
import java.util.HashSet;
import java.util.Set;

public class LateInitializationPreparer
extends SimpleActivityLifecycleCallbacks {
    @SuppressLint(value={"StaticFieldLeak"})
    @Nullable
    private static LateInitializationPreparer instance;
    private boolean hasPaused;
    private boolean isRegistered;
    @Nullable
    private Activity lastResumedActivity;
    private final Set<Integer> startedActivities;
    private final Twig twig = LumberMill.getLogger();

    public LateInitializationPreparer() {
        this.startedActivities = new HashSet<Integer>();
    }

    public static LateInitializationPreparer getInstance() {
        if (instance == null) {
            instance = new LateInitializationPreparer();
        }
        return instance;
    }

    public void handlePastLifecycleEvents(Application object, Injector injector2) {
        Activity activity = this.lastResumedActivity;
        boolean bl2 = this.hasPaused;
        Set<Integer> set = this.startedActivities;
        this.unregister((Application)object);
        if (activity != null) {
            Twig twig = this.twig;
            object = new StringBuilder();
            ((StringBuilder)object).append("Handling lifecycle events for ");
            ((StringBuilder)object).append(activity);
            ((StringBuilder)object).append(" during late initialisation");
            twig.i(((StringBuilder)object).toString(), new Object[0]);
            object = injector2.getLifecycleTracker();
            ((LifecycleTracker)object).onActivityStarted(activity);
            ((LifecycleTracker)object).onActivityResumed(activity);
            if (bl2) {
                ((LifecycleTracker)object).onActivityPaused(activity);
            }
        }
        if (!set.isEmpty()) {
            injector2.getLifecycleTracker().registerActivities(set);
            injector2 = this.twig;
            object = new StringBuilder();
            ((StringBuilder)object).append("Observed Activities with hashcodes ");
            ((StringBuilder)object).append(set);
            ((StringBuilder)object).append(" during late initialization");
            injector2.i(((StringBuilder)object).toString(), new Object[0]);
        }
    }

    @VisibleForTesting
    boolean hasPaused() {
        return this.hasPaused;
    }

    @Nullable
    @VisibleForTesting
    Activity lastResumedActivity() {
        return this.lastResumedActivity;
    }

    @Override
    public void onActivityPaused(Activity activity) {
        this.startedActivities.add(System.identityHashCode(activity));
        this.hasPaused = true;
    }

    @Override
    public void onActivityResumed(Activity activity) {
        this.startedActivities.add(System.identityHashCode(activity));
        this.lastResumedActivity = activity;
        this.hasPaused = false;
    }

    @Override
    public void onActivityStarted(Activity activity) {
        this.startedActivities.add(System.identityHashCode(activity));
    }

    @Override
    public void onActivityStopped(Activity activity) {
        this.startedActivities.remove(System.identityHashCode(activity));
        if (activity == this.lastResumedActivity) {
            this.lastResumedActivity = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void register(Application application) {
        this.twig.i("Registering for later initialization", new Object[0]);
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.isRegistered) break block3;
                        application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
                        this.isRegistered = true;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    @VisibleForTesting
    Set<Integer> startedActivities() {
        return this.startedActivities;
    }

    public void unregister(Application application) {
        this.twig.i("Unregistering for later initialization", new Object[0]);
        application.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
        this.isRegistered = false;
        this.lastResumedActivity = null;
        this.hasPaused = false;
    }
}


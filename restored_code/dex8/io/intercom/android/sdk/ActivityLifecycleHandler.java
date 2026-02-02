/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  androidx.annotation.VisibleForTesting
 */
package io.intercom.android.sdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.VisibleForTesting;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;

class ActivityLifecycleHandler
extends Handler {
    private static final int ESTIMATED_ACTIVITY_TRANSITION_DURATION_MS = 500;
    static final int PAUSED_CODE = 2;
    static final int READY_FOR_VIEW_CODE = 1;
    static final int RESUMED_CODE = 0;
    static final int STOPPED_CODE = 3;
    private final long readyForViewDelayMs;
    private final Store<State> store;

    ActivityLifecycleHandler(Looper looper, Store<State> store, float f11) {
        super(looper);
        this.store = store;
        this.readyForViewDelayMs = (long)(f11 * 500.0f);
    }

    static Message getMessage(int n10, Activity activity) {
        Message message = Message.obtain();
        message.what = n10;
        message.obj = activity;
        return message;
    }

    public void handleMessage(Message message) {
        Activity activity = (Activity)message.obj;
        int n10 = message.what;
        if (n10 != 0) {
            if (n10 != 1) {
                if (n10 != 2) {
                    if (n10 == 3) {
                        this.store.dispatch(Actions.activityStopped(activity));
                    }
                } else {
                    this.store.dispatch(Actions.activityPaused(activity));
                }
            } else {
                this.store.dispatch(Actions.activityReadyForViewAttachment(activity));
            }
        } else {
            this.sendMessageAfterDelay(ActivityLifecycleHandler.getMessage(1, activity), this.readyForViewDelayMs);
        }
    }

    @VisibleForTesting
    void sendMessageAfterDelay(Message message, long l10) {
        this.sendMessageDelayed(message, l10);
    }
}


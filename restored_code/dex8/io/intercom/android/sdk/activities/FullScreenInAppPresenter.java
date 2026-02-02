/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.app.Activity
 *  android.view.View
 */
package io.intercom.android.sdk.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;

class FullScreenInAppPresenter {
    FullScreenInAppPresenter() {
    }

    void closeWindow(Activity activity) {
        View view = activity.getWindow().getDecorView();
        view.setAlpha(1.0f);
        view.animate().alpha(0.0f).setDuration(200L).setListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, activity){
            final FullScreenInAppPresenter this$0;
            final Activity val$activity;
            {
                this.this$0 = fullScreenInAppPresenter;
                this.val$activity = activity;
            }

            public void onAnimationEnd(Animator animator) {
                this.val$activity.finish();
                this.val$activity.overridePendingTransition(0, 0);
            }
        }).start();
    }
}


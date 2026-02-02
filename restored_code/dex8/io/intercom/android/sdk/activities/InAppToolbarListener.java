/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package io.intercom.android.sdk.activities;

import android.app.Activity;
import io.intercom.android.sdk.views.IntercomToolbar;

class InAppToolbarListener
implements IntercomToolbar.Listener {
    private final Activity activity;

    InAppToolbarListener(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void onCloseClicked() {
        this.activity.onBackPressed();
    }

    @Override
    public void onInboxClicked() {
    }

    @Override
    public void onToolbarClicked() {
    }
}


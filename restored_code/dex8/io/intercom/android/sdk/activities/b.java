/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.activity.result.ActivityResult
 *  androidx.activity.result.ActivityResultCallback
 */
package io.intercom.android.sdk.activities;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import io.intercom.android.sdk.activities.IntercomSheetActivity;

public final class b
implements ActivityResultCallback {
    public final IntercomSheetActivity a;

    public /* synthetic */ b(IntercomSheetActivity intercomSheetActivity) {
        this.a = intercomSheetActivity;
    }

    public final void onActivityResult(Object object) {
        IntercomSheetActivity.k(this.a, (ActivityResult)object);
    }
}


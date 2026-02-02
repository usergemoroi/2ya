/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package io.intercom.android.sdk.activities;

import android.view.View;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;

public final class a
implements View.OnClickListener {
    public final IntercomCarouselActivity c;

    public /* synthetic */ a(IntercomCarouselActivity intercomCarouselActivity) {
        this.c = intercomCarouselActivity;
    }

    public final void onClick(View view) {
        IntercomCarouselActivity.k(this.c, view);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package io.intercom.android.sdk.helpcenter.search;

import android.view.View;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;

public final class a
implements View.OnClickListener {
    public final IntercomArticleSearchActivity c;

    public /* synthetic */ a(IntercomArticleSearchActivity intercomArticleSearchActivity) {
        this.c = intercomArticleSearchActivity;
    }

    public final void onClick(View view) {
        IntercomArticleSearchActivity.l(this.c, view);
    }
}


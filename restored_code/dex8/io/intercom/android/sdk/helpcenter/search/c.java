/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package io.intercom.android.sdk.helpcenter.search;

import android.view.View;
import io.intercom.android.sdk.databinding.IntercomActivityArticleSearchBinding;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;

public final class c
implements View.OnClickListener {
    public final IntercomActivityArticleSearchBinding c;

    public /* synthetic */ c(IntercomActivityArticleSearchBinding intercomActivityArticleSearchBinding) {
        this.c = intercomActivityArticleSearchBinding;
    }

    public final void onClick(View view) {
        IntercomArticleSearchActivity.m(this.c, view);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package io.intercom.android.sdk.helpcenter.articles;

import android.view.View;
import io.intercom.android.sdk.helpcenter.articles.ArticleFragment;

public final class c
implements View.OnClickListener {
    public final ArticleFragment c;

    public /* synthetic */ c(ArticleFragment articleFragment) {
        this.c = articleFragment;
    }

    public final void onClick(View view) {
        ArticleFragment.d(this.c, view);
    }
}


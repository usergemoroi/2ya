/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.helpcenter.articles;

import io.intercom.android.sdk.databinding.IntercomFragmentHelpCenterArticleBinding;
import io.intercom.android.sdk.helpcenter.articles.ArticleFragment;

public final class g
implements Runnable {
    public final IntercomFragmentHelpCenterArticleBinding c;
    public final ArticleFragment.renderContent.1.2 d;

    public /* synthetic */ g(IntercomFragmentHelpCenterArticleBinding intercomFragmentHelpCenterArticleBinding, ArticleFragment.renderContent.1.2 var2_2) {
        this.c = intercomFragmentHelpCenterArticleBinding;
        this.d = var2_2;
    }

    @Override
    public final void run() {
        ArticleFragment.renderContent.1.2.a(this.c, this.d);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.ValueCallback
 */
package io.intercom.android.sdk.helpcenter.articles;

import android.webkit.ValueCallback;
import io.intercom.android.sdk.helpcenter.articles.ArticleFragment;

public final class f
implements ValueCallback {
    public final ArticleFragment a;

    public /* synthetic */ f(ArticleFragment articleFragment) {
        this.a = articleFragment;
    }

    public final void onReceiveValue(Object object) {
        ArticleFragment.e(this.a, (String)object);
    }
}


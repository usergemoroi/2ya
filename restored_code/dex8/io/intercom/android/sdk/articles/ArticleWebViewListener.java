/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.articles;

public interface ArticleWebViewListener {
    public void articleNotFound();

    public void onArticleFinishedLoading();

    public void onArticleLoadingError();

    public void onArticleStartedLoading();

    public void scrollArticleViewTo(int var1);
}


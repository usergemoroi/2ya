/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
package io.intercom.android.sdk.helpcenter.search;

import android.view.KeyEvent;
import android.widget.TextView;
import io.intercom.android.sdk.databinding.IntercomActivityArticleSearchBinding;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;

public final class b
implements TextView.OnEditorActionListener {
    public final IntercomActivityArticleSearchBinding c;

    public /* synthetic */ b(IntercomActivityArticleSearchBinding intercomActivityArticleSearchBinding) {
        this.c = intercomActivityArticleSearchBinding;
    }

    public final boolean onEditorAction(TextView textView, int n10, KeyEvent keyEvent) {
        return IntercomArticleSearchActivity.k(this.c, textView, n10, keyEvent);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.webkit.WebView
 *  android.widget.ImageView
 */
package io.intercom.android.sdk.blocks;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import io.intercom.android.sdk.blocks.VideoFile;

public final class d
implements View.OnClickListener {
    public final ImageView c;
    public final WebView d;
    public final String e;

    public /* synthetic */ d(ImageView imageView, WebView webView, String string2) {
        this.c = imageView;
        this.d = webView;
        this.e = string2;
    }

    public final void onClick(View view) {
        VideoFile.a(this.c, this.d, this.e, view);
    }
}


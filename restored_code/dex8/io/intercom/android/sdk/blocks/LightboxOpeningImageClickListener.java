/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.View
 *  androidx.core.app.ActivityOptionsCompat
 */
package io.intercom.android.sdk.blocks;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.ActivityOptionsCompat;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.ImageClickListener;
import io.intercom.android.sdk.lightbox.LightBoxActivity;
import io.intercom.android.sdk.utilities.LinkOpener;

public class LightboxOpeningImageClickListener
implements ImageClickListener {
    private final Api api;

    public LightboxOpeningImageClickListener(Api api) {
        this.api = api;
    }

    @Override
    public void onImageClicked(String string2, String string3, View view, int n10, int n13) {
        Context context = view.getContext();
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            LinkOpener.handleUrl(string3, context, this.api);
            return;
        }
        boolean bl2 = context instanceof Activity;
        boolean bl3 = false;
        if (bl2) {
            string3 = (Activity)context;
            if ((string3.getWindow().getAttributes().flags & 0x400) != 0) {
                bl3 = true;
            }
            string3.startActivity(LightBoxActivity.imageIntent((Context)string3, string2, bl3), ActivityOptionsCompat.makeSceneTransitionAnimation((Activity)string3, (View)view, (String)"lightbox_image").toBundle());
        } else {
            context.startActivity(LightBoxActivity.imageIntent(context, string2, false));
        }
    }
}


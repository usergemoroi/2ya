/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package io.intercom.android.sdk.blocks;

import android.view.View;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.ButtonClickListener;
import io.intercom.android.sdk.utilities.LinkOpener;

public class LinkOpeningButtonClickListener
implements ButtonClickListener {
    private final Api api;

    public LinkOpeningButtonClickListener(Api api) {
        this.api = api;
    }

    @Override
    public void onButtonClicked(View view, String string2) {
        LinkOpener.handleUrl(string2, view.getContext(), this.api);
    }

    @Override
    public boolean shouldHandleClicks() {
        return true;
    }
}


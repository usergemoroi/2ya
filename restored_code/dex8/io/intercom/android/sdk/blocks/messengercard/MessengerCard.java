/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ProgressBar
 *  com.google.gson.Gson
 */
package io.intercom.android.sdk.blocks.messengercard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.gson.Gson;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.MessengerCardBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewPresenter;
import io.intercom.android.sdk.blocks.views.ParagraphView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.commons.HtmlCompat;

public class MessengerCard
implements MessengerCardBlock {
    private final Provider<AppConfig> appConfigProvider;
    private final String conversationId;
    private final Gson gson;
    private final MetricTracker metricTracker;

    public MessengerCard(Provider<AppConfig> provider, Gson gson, MetricTracker metricTracker, String string2) {
        this.appConfigProvider = provider;
        this.gson = gson;
        this.metricTracker = metricTracker;
        this.conversationId = string2;
    }

    private View textFallback(String string2, ViewGroup object) {
        object = new ParagraphView(object.getContext(), StyleType.ADMIN, BlockAlignment.LEFT, this.appConfigProvider.get());
        object.setText((CharSequence)HtmlCompat.fromHtml(string2));
        return object;
    }

    @Override
    @SuppressLint(value={"SetJavaScriptEnabled"})
    public View addCard(String string2, String string3, BlockMetadata object, ViewGroup viewGroup) {
        if (TextUtils.isEmpty((CharSequence)string3)) {
            return this.textFallback(string2, viewGroup);
        }
        string2 = viewGroup.getContext();
        viewGroup = (FrameLayout)LayoutInflater.from((Context)string2).inflate(R.layout.intercom_messenger_card_block, viewGroup, false);
        viewGroup.getLayoutTransition().enableTransitionType(4);
        ProgressBar progressBar = (ProgressBar)viewGroup.findViewById(R.id.loading_view);
        object = MessengerCardWebViewPresenter.createCardWebView((Context)string2);
        viewGroup.addView((View)object);
        new MessengerCardWebViewPresenter((CardWebView)((Object)object), (View)progressBar, string3, ColorUtils.primaryOrDarkColor(object.getContext(), this.appConfigProvider.get()), this.gson, this.metricTracker, string2.getCacheDir(), this.conversationId, false, (Context)string2).setUpWebView();
        object.loadUrl(string3);
        return viewGroup;
    }
}


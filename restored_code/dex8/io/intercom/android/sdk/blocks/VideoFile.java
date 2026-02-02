/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 */
package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.d;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.VideoFileBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.views.ParagraphView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.commons.HtmlCompat;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

public class VideoFile
implements VideoFileBlock {
    private static final int PLAY_ARROW_OFFSET_DP = 3;
    private static final int PLAY_BUTTON_DIAMETER_DP = 36;
    private final Provider<AppConfig> appConfigProvider;
    private final MetricTracker metricTracker;
    private final StyleType style;

    VideoFile(StyleType styleType, Provider<AppConfig> provider, MetricTracker metricTracker) {
        this.style = styleType;
        this.appConfigProvider = provider;
        this.metricTracker = metricTracker;
    }

    public static /* synthetic */ void a(ImageView imageView, WebView webView, String string2, View view) {
        VideoFile.lambda$addVideoFile$0(imageView, webView, string2, view);
    }

    private ImageView getPlayButtonView(Context context) {
        int n10 = ScreenUtils.dpToPx(36.0f, context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(n10, n10);
        layoutParams.addRule(13);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.intercom_play_arrow);
        imageView.setPadding(ScreenUtils.dpToPx(3.0f, context), 0, 0, 0);
        imageView.setBackgroundResource(R.drawable.intercom_solid_circle);
        imageView.setVisibility(0);
        imageView.setId(R.id.intercom_video_thumbnail_play_button);
        AccessibilityUtils.INSTANCE.addClickAbilityAnnouncement((View)imageView);
        return imageView;
    }

    private static /* synthetic */ void lambda$addVideoFile$0(ImageView imageView, WebView webView, String string2, View view) {
        imageView.setVisibility(8);
        webView.loadUrl(string2);
    }

    private View textFallback(String string2, ViewGroup object) {
        object = new ParagraphView(object.getContext(), StyleType.ADMIN, BlockAlignment.LEFT, this.appConfigProvider.get());
        object.setText((CharSequence)HtmlCompat.fromHtml(string2));
        return object;
    }

    @Override
    public View addVideoFile(String string2, String string3, String string4, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        if (TextUtils.isEmpty((CharSequence)string3)) {
            return this.textFallback(string2, viewGroup);
        }
        string2 = new RelativeLayout(viewGroup.getContext());
        blockMetadata = new WebView(viewGroup.getContext());
        BlockUtils.createLayoutParams((View)blockMetadata, -1, 480);
        BlockUtils.setMarginBottom((View)blockMetadata, 16);
        blockMetadata.setWebChromeClient(new WebChromeClient());
        WebSettings webSettings = blockMetadata.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setMediaPlaybackRequiresUserGesture(true);
        blockMetadata.loadUrl(string4);
        string4 = this.getPlayButtonView(viewGroup.getContext());
        string4.setOnClickListener((View.OnClickListener)new d((ImageView)string4, (WebView)blockMetadata, string3));
        string2.addView((View)blockMetadata);
        string2.addView((View)string4);
        return string2;
    }
}


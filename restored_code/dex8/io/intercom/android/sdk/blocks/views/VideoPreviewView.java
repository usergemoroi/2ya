/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PorterDuff$Mode
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  androidx.annotation.NonNull
 *  androidx.core.content.ContextCompat
 *  coil.request.f
 *  coil.request.i
 *  coil.request.i$a
 *  coil.request.i$b
 *  coil.request.s
 */
package io.intercom.android.sdk.blocks.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import coil.request.f;
import coil.request.i;
import coil.request.s;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.views.a;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import org.jetbrains.annotations.NotNull;

public class VideoPreviewView
extends RelativeLayout {
    private static final int PLAY_ARROW_OFFSET_DP = 3;
    private static final int PLAY_BUTTON_DIAMETER_DP = 48;
    private final ProgressBar loadingSpinner;
    private final ImageView playButton;
    private final ImageView thumbnailImageView;

    public VideoPreviewView(@NonNull Context object, Provider<AppConfig> provider, StyleType styleType) {
        super((Context)object);
        int n10;
        ProgressBar progressBar;
        ImageView imageView;
        ImageView imageView2;
        BlockUtils.createLayoutParams((View)this, -2, -2);
        BlockUtils.setDefaultMarginBottom((View)this);
        this.thumbnailImageView = imageView2 = this.getVideoImageView((Context)object);
        this.playButton = imageView = this.getPlayButtonView((Context)object);
        this.loadingSpinner = progressBar = this.getLoadingSpinner();
        this.addView((View)imageView2);
        this.addView((View)imageView);
        this.addView((View)progressBar);
        int n13 = n10 = provider.get().getPrimaryColor();
        if (styleType == StyleType.POST) {
            n13 = ColorUtils.lightenColor(n10);
        }
        if (ColorUtils.isColorLight(n13)) {
            imageView.setColorFilter(ContextCompat.getColor((Context)object, (int)R.color.intercom_accessibility_black), PorterDuff.Mode.SRC_ATOP);
        } else {
            imageView.setColorFilter(n13, PorterDuff.Mode.SRC_ATOP);
        }
        object = AccessibilityUtils.INSTANCE;
        ((AccessibilityUtils)object).removeClickAbilityAnnouncement((View)this);
        ((AccessibilityUtils)object).addClickAbilityAnnouncement((View)imageView);
    }

    public static /* synthetic */ void a(VideoPreviewView videoPreviewView) {
        videoPreviewView.lambda$showFailedImage$0();
    }

    private ProgressBar getLoadingSpinner() {
        return (ProgressBar)View.inflate((Context)this.getContext(), (int)R.layout.intercom_progress_bar, null).findViewById(R.id.progressBar);
    }

    private ImageView getPlayButtonView(Context context) {
        int n10 = ScreenUtils.dpToPx(48.0f, context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(n10, n10);
        layoutParams.addRule(13);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.intercom_play_arrow);
        imageView.setPadding(ScreenUtils.dpToPx(3.0f, context), 0, 0, 0);
        imageView.setBackgroundResource(R.drawable.intercom_solid_circle);
        imageView.setVisibility(8);
        imageView.setId(R.id.intercom_video_thumbnail_play_button);
        AccessibilityUtils.INSTANCE.addClickAbilityAnnouncement((View)imageView);
        return imageView;
    }

    private ImageView getVideoImageView(Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        context = new ImageView(context);
        context.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        context.setAdjustViewBounds(true);
        context.setScaleType(ImageView.ScaleType.CENTER_CROP);
        context.setId(R.id.intercom_video_thumbnail);
        return context;
    }

    private /* synthetic */ void lambda$showFailedImage$0() {
        BackgroundUtils.setBackground((View)this.thumbnailImageView, ContextCompat.getDrawable((Context)this.getContext(), (int)R.drawable.intercom_video_thumbnail_fallback));
    }

    private void updateThumbnailAspectRatio() {
        this.thumbnailImageView.getLayoutParams().height = this.thumbnailImageView.getWidth() * 3 / 4;
    }

    public void displayThumbnail(String string2) {
        this.loadingSpinner.setVisibility(0);
        this.thumbnailImageView.setVisibility(4);
        string2 = new i.a(this.getContext()).d((Object)string2);
        int n10 = R.drawable.intercom_video_thumbnail_fallback;
        string2 = string2.m(n10).h(n10).c(true).B(this.thumbnailImageView).j(new i.b(this){
            final VideoPreviewView this$0;
            {
                this.this$0 = videoPreviewView;
            }

            public void onCancel(@NotNull i i14) {
            }

            public void onError(@NonNull i i14, @NonNull f f11) {
                this.this$0.loadingSpinner.setVisibility(8);
                this.this$0.thumbnailImageView.setVisibility(0);
                this.this$0.updateThumbnailAspectRatio();
                this.this$0.playButton.setVisibility(8);
            }

            public void onStart(@NotNull i i14) {
            }

            public void onSuccess(@NonNull i i14, @NonNull s s13) {
                this.this$0.loadingSpinner.setVisibility(8);
                this.this$0.thumbnailImageView.setVisibility(0);
                this.this$0.updateThumbnailAspectRatio();
                int n10 = ContextCompat.getColor((Context)this.this$0.thumbnailImageView.getContext(), (int)R.color.intercom_semi_transparent);
                this.this$0.thumbnailImageView.setColorFilter(n10, PorterDuff.Mode.DARKEN);
                this.this$0.playButton.setVisibility(0);
            }
        }).a();
        IntercomCoilKt.loadIntercomImage(this.getContext(), (i)string2);
    }

    public ImageView getThumbnailImageView() {
        return this.thumbnailImageView;
    }

    public void showFailedImage() {
        this.thumbnailImageView.post((Runnable)new a(this));
    }
}


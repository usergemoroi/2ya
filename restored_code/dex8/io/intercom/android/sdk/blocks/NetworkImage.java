/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  coil.request.f
 *  coil.request.i
 *  coil.request.i$a
 *  coil.request.i$b
 *  coil.request.s
 *  coil.transform.d
 *  coil.transform.e
 *  com.facebook.shimmer.ShimmerFrameLayout
 *  com.intercom.twig.Twig
 *  io.intercom.android.sdk.views.ResizableImageView
 */
package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import coil.request.f;
import coil.request.i;
import coil.request.s;
import coil.transform.d;
import coil.transform.e;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.Image;
import io.intercom.android.sdk.blocks.ImageClickListener;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.ImageBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.coil.GrayscaleTransformation;
import io.intercom.android.sdk.utilities.coil.RoundedCornersAnimatedTransformation;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.IntercomShimmerLayout;
import io.intercom.android.sdk.views.ResizableImageView;
import org.jetbrains.annotations.NotNull;

public class NetworkImage
extends Image
implements ImageBlock {
    @Nullable
    private final ImageClickListener listener;
    private final Twig twig = LumberMill.getLogger();
    private final UploadingImageCache uploadingImageCache;

    NetworkImage(StyleType styleType, UploadingImageCache uploadingImageCache, @Nullable ImageClickListener imageClickListener) {
        super(styleType);
        this.uploadingImageCache = uploadingImageCache;
        this.listener = imageClickListener;
    }

    private void loadImageFromUrl(String string2, String string3, Context context, int n10, int n13, ResizableImageView resizableImageView, ShimmerFrameLayout shimmerFrameLayout) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            this.hideLoadingState(shimmerFrameLayout, (ImageView)resizableImageView);
            resizableImageView.setImageResource(R.drawable.intercom_image_load_failed);
            resizableImageView.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        i.a a14 = new i.a(context).h(R.drawable.intercom_image_load_failed).c(true).B((ImageView)resizableImageView).d((Object)string2);
        this.setImageViewBounds(n10, n13, resizableImageView, a14);
        Resources resources = context.getResources();
        if (this.getStyle() != StyleType.CAROUSEL) {
            if (ImageUtils.isGif(string2)) {
                a14.v("coil#animated_transformation", (Object)new RoundedCornersAnimatedTransformation(resources.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners)));
            } else {
                a14.F(new e[]{new d((float)resources.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners))});
            }
        }
        if ((resources = this.uploadingImageCache.getLocalImageUriForRemoteUrl(string2)) != null) {
            a14.F(new e[]{new GrayscaleTransformation()}).d((Object)resources);
        }
        a14.j(new i.b(){
            final NetworkImage this$0;
            final Context val$context;
            final int val$heightPx;
            final ResizableImageView val$imageView;
            final String val$linkUrl;
            final ShimmerFrameLayout val$shimmerView;
            final String val$url;
            final int val$widthPx;
            {
                this.this$0 = networkImage;
                this.val$imageView = resizableImageView;
                this.val$shimmerView = shimmerFrameLayout;
                this.val$context = context;
                this.val$url = string2;
                this.val$linkUrl = string3;
                this.val$widthPx = n10;
                this.val$heightPx = n13;
            }

            public void onCancel(@NotNull i i14) {
            }

            public void onError(@NonNull i i14, @NonNull f f11) {
                i14 = this.val$imageView;
                f11 = ImageView.ScaleType.CENTER;
                i14.setScaleType((ImageView.ScaleType)f11);
                this.this$0.hideLoadingState(this.val$shimmerView, (ImageView)this.val$imageView);
                this.this$0.twig.internal("images", "FAILURE");
                this.val$imageView.setScaleType((ImageView.ScaleType)f11);
            }

            public void onStart(@NotNull i i14) {
            }

            public void onSuccess(@NonNull i i14, @NonNull s s13) {
                this.this$0.twig.internal("images", "SUCCESS");
                this.this$0.hideLoadingState(this.val$shimmerView, (ImageView)this.val$imageView);
                if (this.this$0.getStyle() != StyleType.CHAT_FULL && this.this$0.listener != null) {
                    this.val$imageView.setOnClickListener(new View.OnClickListener(this){
                        final 1 this$1;
                        {
                            this.this$1 = var1_1;
                        }

                        public void onClick(View object) {
                            ((InputMethodManager)this.this$1.val$context.getSystemService("input_method")).hideSoftInputFromWindow(object.getWindowToken(), 0);
                            object = this.this$1.this$0.listener;
                            1 var2_2 = this.this$1;
                            object.onImageClicked(var2_2.val$url, var2_2.val$linkUrl, (View)var2_2.val$imageView, var2_2.val$widthPx, var2_2.val$heightPx);
                        }
                    });
                }
            }
        });
        IntercomCoilKt.loadIntercomImage(context, a14.a());
    }

    @Override
    public View addImage(String string2, String string3, String string4, int n10, int n13, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup object) {
        Context context = object.getContext();
        n10 = ScreenUtils.dpToPx(n10, context);
        n13 = ScreenUtils.dpToPx(n13, context);
        object = new IntercomShimmerLayout(context);
        BlockUtils.createLayoutParams((View)object, -2, -2);
        BlockUtils.setDefaultMarginBottom((View)object);
        ResizableImageView resizableImageView = new ResizableImageView(context);
        resizableImageView.setTransitionName("lightbox_image");
        resizableImageView.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-2, -2));
        resizableImageView.setAdjustViewBounds(true);
        resizableImageView.setScaleType(ImageView.ScaleType.FIT_START);
        this.setBackground((ImageView)resizableImageView);
        object.addView((View)resizableImageView);
        this.loadImageFromUrl(string2, string3, context, n10, n13, resizableImageView, (ShimmerFrameLayout)object);
        BlockUtils.setLayoutMarginsAndGravity((View)object, blockAlignment.getGravity(), blockMetadata.isLastObject());
        if (TextUtils.isEmpty((CharSequence)string3) && TextUtils.isEmpty((CharSequence)string4)) {
            AccessibilityUtils.INSTANCE.removeClickAbilityAnnouncement((View)resizableImageView);
        } else if (!TextUtils.isEmpty((CharSequence)string4)) {
            resizableImageView.setFocusable(true);
            resizableImageView.setContentDescription((CharSequence)string4);
        }
        return object;
    }

    @VisibleForTesting
    int getSampleSize(int n10, int n13, DisplayMetrics displayMetrics) {
        int n14 = displayMetrics.widthPixels;
        n10 = n10 <= n14 && n13 <= displayMetrics.heightPixels ? 1 : (int)Math.pow(2.0, (int)Math.ceil(Math.log((double)n14 / (double)Math.max(n13, n10)) / Math.log(0.5)));
        return n10;
    }

    void hideLoadingState(ShimmerFrameLayout shimmerFrameLayout, ImageView imageView) {
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.hideShimmer();
            imageView.setBackgroundResource(17170445);
        }
    }
}


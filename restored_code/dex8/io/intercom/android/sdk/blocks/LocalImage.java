/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.ColorFilter
 *  android.graphics.ColorMatrix
 *  android.graphics.ColorMatrixColorFilter
 *  android.net.Uri
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  androidx.annotation.NonNull
 *  coil.request.f
 *  coil.request.i
 *  coil.request.i$a
 *  coil.request.i$b
 *  coil.request.s
 *  coil.transform.d
 *  coil.transform.e
 *  com.intercom.twig.Twig
 *  io.intercom.android.sdk.views.ResizableImageView
 */
package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import coil.request.f;
import coil.request.i;
import coil.request.s;
import coil.transform.d;
import coil.transform.e;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.Image;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.LocalImageBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.ProgressFrameLayout;
import io.intercom.android.sdk.views.ResizableImageView;
import io.intercom.android.sdk.views.UploadProgressBar;
import org.jetbrains.annotations.NotNull;

class LocalImage
extends Image
implements LocalImageBlock {
    private final Twig twig = LumberMill.getLogger();

    LocalImage(StyleType styleType) {
        super(styleType);
    }

    @Override
    public View addImage(Uri uri, int n10, int n13, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        viewGroup = viewGroup.getContext();
        n10 = ScreenUtils.dpToPx(n10, (Context)viewGroup);
        n13 = ScreenUtils.dpToPx(n13, (Context)viewGroup);
        ProgressFrameLayout progressFrameLayout = new ProgressFrameLayout((Context)viewGroup);
        BlockUtils.createLayoutParams((View)progressFrameLayout, -2, -2);
        BlockUtils.setDefaultMarginBottom((View)progressFrameLayout);
        ResizableImageView resizableImageView = new ResizableImageView((Context)viewGroup);
        BlockUtils.createLayoutParams((View)resizableImageView, -2, -2);
        resizableImageView.setAdjustViewBounds(true);
        resizableImageView.setScaleType(ImageView.ScaleType.FIT_START);
        progressFrameLayout.addView((View)resizableImageView);
        i.a a14 = new i.a((Context)viewGroup).B((ImageView)resizableImageView).d((Object)uri);
        this.setImageViewBounds(n10, n13, resizableImageView, a14);
        View view = progressFrameLayout.getChildAt(0);
        uri = viewGroup.getResources();
        if (view instanceof UploadProgressBar) {
            n10 = uri.getDimensionPixelSize(R.dimen.intercom_local_image_upload_size);
            view.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(n10, n10, 17));
            view.bringToFront();
            progressFrameLayout.uploadStarted();
        }
        this.setBackground((ImageView)resizableImageView);
        view = new ColorMatrix();
        view.setSaturation(0.0f);
        resizableImageView.setColorFilter((ColorFilter)new ColorMatrixColorFilter((ColorMatrix)view));
        a14.F(new e[]{new d((float)uri.getDimensionPixelSize(R.dimen.intercom_image_rounded_corners))}).c(true).j(new i.b(){
            final LocalImage this$0;
            final ResizableImageView val$imageView;
            {
                this.this$0 = localImage;
                this.val$imageView = resizableImageView;
            }

            public void onCancel(@NotNull i i14) {
            }

            public void onError(@NonNull i i14, @NonNull f f11) {
                this.this$0.twig.internal("images", "FAILURE");
            }

            public void onStart(@NotNull i i14) {
            }

            public void onSuccess(@NonNull i i14, @NonNull s s13) {
                this.this$0.twig.internal("images", "SUCCESS");
                this.val$imageView.setBackgroundResource(17170445);
            }
        });
        IntercomCoilKt.loadIntercomImage((Context)viewGroup, a14.a());
        BlockUtils.setLayoutMarginsAndGravity((View)progressFrameLayout, blockAlignment.getGravity(), blockMetadata.isLastObject());
        return progressFrameLayout;
    }
}


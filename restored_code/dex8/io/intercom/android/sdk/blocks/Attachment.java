/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils$TruncateAt
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  androidx.core.content.ContextCompat
 */
package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.lib.interfaces.AttachmentListBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.LocalAttachmentBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.views.AttachmentView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.ProgressLinearLayout;
import io.intercom.android.sdk.views.UploadProgressBar;
import java.util.List;

class Attachment
implements AttachmentListBlock,
LocalAttachmentBlock {
    private static final int ATTACHMENT_LINE_SPACING_DP = 12;
    private static final int DIVIDER_MARGIN_DP = 6;
    private static final int DIVIDER_WIDTH_DP = 1;
    private static final int LOCAL_ICON_SIZE_DP = 20;
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;

    public Attachment(StyleType styleType, Provider<AppConfig> provider) {
        this.style = styleType;
        this.appConfigProvider = provider;
    }

    private ImageView getAttachmentIcon(Context context) {
        context = new ImageView(context);
        context.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
        context.setVisibility(8);
        context.setImageResource(R.drawable.intercom_icn_attachment);
        return context;
    }

    private LinearLayout getAttachmentListView(Context context) {
        context = new LinearLayout(context);
        context.setOrientation(1);
        context.setBackgroundResource(R.color.intercom_full_transparent_full_black);
        BlockUtils.createLayoutParams((View)context, -2, -2);
        BlockUtils.setDefaultMarginBottom((View)context);
        return context;
    }

    private View getDivider(Context context) {
        int n10 = ScreenUtils.dpToPx(6.0f, context);
        int n13 = ScreenUtils.dpToPx(1.0f, context);
        context = new View(context);
        context.setBackgroundResource(R.color.intercom_white);
        BlockUtils.createLayoutParams((View)context, n13, -1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)context.getLayoutParams();
        layoutParams.leftMargin = n10;
        layoutParams.rightMargin = n10;
        return context;
    }

    private FrameLayout getIconHolder(Context context) {
        int n10 = ScreenUtils.dpToPx(20.0f, context);
        context = new FrameLayout(context);
        BlockUtils.createLayoutParams((View)context, n10, n10);
        ((LinearLayout.LayoutParams)context.getLayoutParams()).gravity = 8388627;
        return context;
    }

    private ProgressLinearLayout getLocalAttachmentView(Context object) {
        object = new ProgressLinearLayout((Context)object);
        BlockUtils.createLayoutParams((View)object, -2, -2);
        BlockUtils.setDefaultMarginBottom((View)object);
        object.setOrientation(0);
        return object;
    }

    private TextView getTextView(String string2, Context context) {
        TextView textView = new TextView(context);
        BlockUtils.createLayoutParams((View)textView, -2, -2);
        BlockUtils.setSmallLineSpacing(textView);
        textView.setGravity(8388627);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(15.0f);
        textView.setTextColor(ContextCompat.getColor((Context)context, (int)R.color.intercom_white));
        textView.setBackgroundResource(R.color.intercom_full_transparent_full_black);
        textView.setText((CharSequence)string2);
        return textView;
    }

    private UploadProgressBar getUploadProgressBar(Context object) {
        object = new UploadProgressBar((Context)object);
        object.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
        return object;
    }

    @Override
    public View addAttachment(BlockAttachment blockAttachment, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        ProgressLinearLayout progressLinearLayout = this.getLocalAttachmentView(context);
        FrameLayout frameLayout = this.getIconHolder(context);
        viewGroup = this.getAttachmentIcon(context);
        UploadProgressBar uploadProgressBar = this.getUploadProgressBar(context);
        this.getDivider(context);
        blockAttachment = this.getTextView(blockAttachment.getName(), context);
        frameLayout.addView((View)uploadProgressBar);
        frameLayout.addView((View)viewGroup);
        progressLinearLayout.setUploadProgressBar(uploadProgressBar);
        progressLinearLayout.setAttachmentIcon((ImageView)viewGroup);
        progressLinearLayout.addView((View)blockAttachment);
        BlockUtils.setLayoutMarginsAndGravity((View)progressLinearLayout, 0x800003, blockMetadata.isLastObject());
        return progressLinearLayout;
    }

    @Override
    public View addAttachmentList(List<BlockAttachment> list, BlockMetadata blockMetadata, ViewGroup object) {
        Context context = object.getContext();
        LinearLayout linearLayout = this.getAttachmentListView(context);
        int n10 = this.appConfigProvider.get().getPrimaryColor();
        int n13 = ContextCompat.getColor((Context)context, (int)R.color.intercom_white);
        int n14 = ContextCompat.getColor((Context)context, (int)R.color.intercom_accessibility_black);
        int n15 = n10;
        if (ColorUtils.isComparedColorsLowerThanAccessibilityContrastRatio(n10, n13)) {
            n15 = n14;
        }
        n14 = list.size();
        for (n10 = 0; n10 < n14; ++n10) {
            object = new AttachmentView(context, this.style, n15, list.get(n10));
            if (n10 < n14 - 1) {
                object.setPadding(object.getPaddingLeft(), object.getPaddingTop(), object.getPaddingRight(), ScreenUtils.dpToPx(12.0f, context));
            }
            linearLayout.addView((View)object);
        }
        BlockUtils.setLayoutMarginsAndGravity((View)linearLayout, 0x800003, blockMetadata.isLastObject());
        return linearLayout;
    }
}


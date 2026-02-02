/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.text.Spanned
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 */
package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.graphics.Color;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.NetworkImage;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.ImageTextBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.utilities.FontUtils;

public class ImageText
implements ImageTextBlock {
    private final StyleType style;
    private final UploadingImageCache uploadingImageCache;

    ImageText(StyleType styleType, UploadingImageCache uploadingImageCache) {
        this.style = styleType;
        this.uploadingImageCache = uploadingImageCache;
    }

    @Override
    public View addImageText(Spanned object, Spanned spanned, String string2, String string3, int n10, int n13, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        viewGroup = (LinearLayout)LayoutInflater.from((Context)viewGroup.getContext()).inflate(R.layout.intercom_image_text_block, viewGroup, false);
        string2 = new NetworkImage(this.style, this.uploadingImageCache, null).addImage(string2, "", string3, n10, n13, BlockAlignment.LEFT, blockMetadata, viewGroup);
        ((LinearLayout.LayoutParams)string2.getLayoutParams()).setMargins(0, 0, 0, 0);
        ((FrameLayout)viewGroup.findViewById(R.id.image_holder)).addView((View)string2);
        string2 = (TextView)viewGroup.findViewById(R.id.title);
        string3 = (TextView)viewGroup.findViewById(R.id.text);
        string2.setText((CharSequence)object);
        string3.setText((CharSequence)spanned);
        FontUtils.setRobotoMediumTypeface((TextView)string2);
        object = blockMetadata.getAppearance().getTextColor();
        if (!TextUtils.isEmpty((CharSequence)object)) {
            n10 = Color.parseColor((String)object);
            string2.setTextColor(n10);
            string3.setTextColor(n10);
        }
        return viewGroup;
    }
}


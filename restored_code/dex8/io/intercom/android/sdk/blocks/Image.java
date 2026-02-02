/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.widget.ImageView
 *  coil.request.i$a
 *  io.intercom.android.sdk.views.ResizableImageView
 */
package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import coil.request.i;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.ResizableImageView;

class Image {
    private final StyleType style;

    Image(StyleType styleType) {
        this.style = styleType;
    }

    private int calculateChatFullPadding(Context context) {
        Resources resources = context.getResources();
        float f11 = resources.getDimension(R.dimen.intercom_chat_overlay_width);
        float f12 = resources.getDimension(R.dimen.intercom_chat_overlay_padding_right);
        float f13 = resources.getDimension(R.dimen.intercom_chat_overlay_text_margin_left);
        float f14 = resources.getDimension(R.dimen.intercom_chat_overlay_text_padding_left);
        float f15 = resources.getDimension(R.dimen.intercom_chat_overlay_text_padding_right);
        return (int)((float)ScreenUtils.getScreenDimensions((Context)context).x - (f11 - (f12 + f13 + f14 + f15)));
    }

    private int getTotalViewPadding(Context context) {
        Resources resources = context.getResources();
        switch (1.$SwitchMap$io$intercom$android$sdk$blocks$StyleType[this.style.ordinal()]) {
            default: {
                return 0;
            }
            case 9: {
                return (int)resources.getDimension(R.dimen.intercom_carousel_padding) * 2;
            }
            case 8: {
                return this.calculateChatFullPadding(context);
            }
            case 7: {
                return (int)(resources.getDimension(R.dimen.intercom_cell_content_padding) + resources.getDimension(R.dimen.intercom_note_cell_padding) + resources.getDimension(R.dimen.intercom_note_layout_margin)) * 2;
            }
            case 5: 
            case 6: {
                return (int)(resources.getDimension(R.dimen.intercom_cell_content_padding) + resources.getDimension(R.dimen.intercom_note_cell_padding) + resources.getDimension(R.dimen.intercom_note_layout_margin)) * 2;
            }
            case 4: {
                return (int)(resources.getDimension(R.dimen.intercom_cell_content_padding) + resources.getDimension(R.dimen.intercom_post_cell_padding)) * 2;
            }
            case 1: 
            case 2: 
            case 3: 
        }
        return (int)(resources.getDimension(R.dimen.intercom_avatar_size) + resources.getDimension(R.dimen.intercom_conversation_row_icon_spacer) + resources.getDimension(R.dimen.intercom_conversation_row_margin) + resources.getDimension(R.dimen.intercom_cell_horizontal_padding) * 3.0f);
    }

    protected StyleType getStyle() {
        return this.style;
    }

    protected void setBackground(ImageView imageView) {
        if (this.style == StyleType.CAROUSEL) {
            imageView.setBackgroundResource(R.drawable.intercom_square_image_preview);
        } else {
            imageView.setBackgroundResource(R.drawable.intercom_rounded_image_preview);
        }
    }

    protected void setImageViewBounds(int n10, int n13, ResizableImageView resizableImageView, i.a a14) {
        resizableImageView.setTotalViewPadding(this.getTotalViewPadding(resizableImageView.getContext()));
        resizableImageView.setDisplayImageDimensions(n10, n13);
        resizableImageView = resizableImageView.getImageDimens();
        n13 = resizableImageView.x;
        if (n13 > 0 && (n10 = resizableImageView.y) > 0) {
            a14.y(n13, n10);
        }
    }
}


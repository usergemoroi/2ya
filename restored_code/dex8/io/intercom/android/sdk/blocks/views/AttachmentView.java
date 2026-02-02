/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.text.TextUtils$TruncateAt
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  androidx.annotation.ColorInt
 *  androidx.core.content.ContextCompat
 */
package io.intercom.android.sdk.blocks.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.utilities.IntentUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

@SuppressLint(value={"ViewConstructor"})
public class AttachmentView
extends LinearLayout
implements View.OnClickListener {
    static final int ATTACHMENT_ICON_WIDTH_DP = 20;
    static final int DIVIDER_MARGIN_DP = 6;
    static final int DIVIDER_WIDTH_DP = 1;
    private final String url;

    public AttachmentView(Context context, StyleType styleType, @ColorInt int n10, BlockAttachment blockAttachment) {
        super(context);
        this.url = blockAttachment.getUrl();
        this.setOrientation(0);
        this.addView((View)this.setupIcon(context, styleType, n10));
        if (this.isUserMessage(styleType)) {
            this.addView(this.setupDivider(context));
        }
        this.addView((View)this.setupName(context, styleType, n10, blockAttachment.getName()));
    }

    private boolean isUserMessage(StyleType styleType) {
        boolean bl2 = StyleType.PREVIEW == styleType || StyleType.USER == styleType;
        return bl2;
    }

    private View setupDivider(Context context) {
        View view = new View(context);
        int n10 = ScreenUtils.dpToPx(1.0f, context);
        int n13 = ScreenUtils.dpToPx(6.0f, context);
        context = new LinearLayout.LayoutParams(n10, -1);
        context.setMargins(n13, 0, n13, 0);
        view.setLayoutParams((ViewGroup.LayoutParams)context);
        view.setBackgroundResource(R.color.intercom_white);
        return view;
    }

    private ImageView setupIcon(Context context, StyleType styleType, int n10) {
        ImageView imageView = new ImageView(context);
        context = new LinearLayout.LayoutParams(ScreenUtils.dpToPx(20.0f, context), -2);
        context.gravity = 8388627;
        imageView.setLayoutParams((ViewGroup.LayoutParams)context);
        imageView.setImageResource(R.drawable.intercom_icn_attachment);
        if (!this.isUserMessage(styleType)) {
            imageView.setColorFilter(n10);
        }
        return imageView;
    }

    private TextView setupName(Context context, StyleType styleType, int n10, String string2) {
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        textView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setBackgroundResource(R.color.intercom_full_transparent_full_black);
        textView.setGravity(8388627);
        textView.setTextSize(15.0f);
        textView.setText((CharSequence)string2);
        textView.setOnClickListener((View.OnClickListener)this);
        if (this.isUserMessage(styleType)) {
            textView.setTextColor(ContextCompat.getColor((Context)context, (int)R.color.intercom_white));
        } else {
            textView.setTextColor(n10);
        }
        return textView;
    }

    public void onClick(View view) {
        view = Uri.parse((String)this.url);
        if (!Uri.EMPTY.equals((Object)view)) {
            view = new Intent("android.intent.action.VIEW", (Uri)view);
            view.setFlags(0x10000000);
            IntentUtils.safelyOpenIntent(this.getContext(), (Intent)view);
        }
    }
}


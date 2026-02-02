/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.graphics.Color
 *  android.text.TextUtils$TruncateAt
 *  android.text.method.MovementMethod
 *  android.view.View
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.TextView
 *  androidx.appcompat.widget.AppCompatTextView
 *  androidx.core.content.ContextCompat
 */
package io.intercom.android.sdk.blocks.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.TrackingLinkMovementMethod;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

@SuppressLint(value={"ViewConstructor"})
public class ParagraphView
extends AppCompatTextView {
    private static final int CAROUSEL_LINE_SPACING_DP = 8;
    private static final int DEFAULT_LINE_SPACING_DP = 2;
    private static final int POST_BOTTOM_MARGIN_DP = 24;
    private static final int POST_LINE_SPACING_DP = 4;
    private final BlockAlignment alignment;
    private final AppConfig appConfig;
    private final BlockMetadata blockMetadata;
    private final Context context;
    private final StyleType style;

    public ParagraphView(Context context, StyleType styleType, BlockAlignment blockAlignment, AppConfig appConfig) {
        this(context, styleType, blockAlignment, appConfig, BlockMetadata.NULL);
    }

    public ParagraphView(Context context, StyleType styleType, BlockAlignment blockAlignment, AppConfig appConfig, BlockMetadata blockMetadata) {
        super(context);
        this.context = context;
        this.style = styleType;
        this.alignment = blockAlignment;
        this.appConfig = appConfig;
        this.blockMetadata = blockMetadata;
        this.applyParagraphStyle();
    }

    private void applyParagraphStyle() {
        BlockUtils.createLayoutParams((View)this, -2, -2);
        BlockUtils.setDefaultMarginBottom((View)this);
        this.setLineSpacing(ScreenUtils.dpToPx(2.0f, this.context), 1.0f);
        this.setTextSize(16.0f);
        this.setTextIsSelectable(false);
        this.setEllipsize(TextUtils.TruncateAt.END);
        this.setScrollContainer(false);
        this.setFocusable(false);
        this.setClickable(false);
        this.setLongClickable(false);
        this.setGravity(this.alignment.getGravity());
        this.setMovementMethod((MovementMethod)new TrackingLinkMovementMethod());
        Object object = (ViewGroup.MarginLayoutParams)this.getLayoutParams();
        int n10 = this.appConfig.getPrimaryColor();
        switch (1.$SwitchMap$io$intercom$android$sdk$blocks$StyleType[this.style.ordinal()]) {
            default: {
                this.setIncludeFontPadding(false);
                ColorUtils.setTextColorWhiteOrDark((TextView)this, this.appConfig.isPrimaryColorRenderDarkText());
                break;
            }
            case 7: {
                this.setTextSize(20.0f);
                this.setLineSpacing(ScreenUtils.dpToPx(8.0f, this.context), 1.0f);
                object = this.blockMetadata.getAppearance().getTextColor();
                if (((String)object).isEmpty()) break;
                n10 = Color.parseColor((String)object);
                this.setTextColor(n10);
                this.setLinkTextColor(n10);
                break;
            }
            case 6: {
                this.setMovementMethod(null);
                this.setTextSize(14.0f);
                this.setTextColor(ContextCompat.getColor((Context)this.context, (int)R.color.intercom_grey_600));
                this.setLinkTextColor(ColorUtils.primaryOrDarkColor(this.context, this.appConfig));
                break;
            }
            case 5: {
                ((ViewGroup.MarginLayoutParams)object).bottomMargin = ScreenUtils.dpToPx(24.0f, this.context);
                this.setLineSpacing(ScreenUtils.dpToPx(4.0f, this.context), 1.0f);
                this.setTextColor(ContextCompat.getColor((Context)this.context, (int)R.color.intercom_white));
                this.setLinkTextColor(ColorUtils.lightenColor(n10));
                break;
            }
            case 3: 
            case 4: {
                this.setTextColor(ContextCompat.getColor((Context)this.context, (int)R.color.intercom_grey_700));
                this.setLinkTextColor(ColorUtils.primaryOrBlackAccessibility(this.context, this.appConfig));
                break;
            }
            case 2: {
                this.setTextColor(ContextCompat.getColor((Context)this.context, (int)R.color.intercom_grey_700));
                this.setLinkTextColor(ColorUtils.primaryOrDarkColor(this.context, this.appConfig));
                break;
            }
            case 1: {
                this.setTextColor(ContextCompat.getColor((Context)this.context, (int)R.color.intercom_grey_800));
                this.setLinkTextColor(ColorUtils.primaryOrBlackAccessibility(this.context, this.appConfig));
            }
        }
    }
}


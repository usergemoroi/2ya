/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.graphics.Color
 *  android.text.Spanned
 *  android.text.method.MovementMethod
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.annotation.ColorInt
 *  androidx.core.content.ContextCompat
 */
package io.intercom.android.sdk.blocks;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.HeadingBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.SubheadingBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.CustomizationColorsModel;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.android.sdk.utilities.TrackingLinkMovementMethod;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

class Heading
implements HeadingBlock,
SubheadingBlock {
    private static final int LARGE_MARGIN_BOTTOM_DP = 32;
    private static final int LARGE_TEXT_SP = 24;
    private static final int MARGIN_BOTTOM_DP = 16;
    private static final int MEDIUM_TEXT_SP = 20;
    private static final int SMALL_TEXT_SP = 15;
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;

    Heading(StyleType styleType, Provider<AppConfig> provider) {
        this.style = styleType;
        this.appConfigProvider = provider;
    }

    @SuppressLint(value={"WrongConstant"})
    private void applyGenericCarouselHeadingStyle(TextView textView, BlockMetadata object) {
        textView.setBreakStrategy(0);
        textView.setTypeface(null, 1);
        BlockUtils.setMarginBottom((View)textView, 16);
        object = ((BlockMetadata)object).getAppearance().getTextColor();
        if (!((String)object).isEmpty()) {
            int n10 = Color.parseColor((String)object);
            textView.setTextColor(n10);
            textView.setLinkTextColor(n10);
        }
    }

    private void styleAnnouncementHeading(TextView textView, @ColorInt int n10, int n13, int n14) {
        textView.setTextSize((float)n13);
        textView.setTextColor(n10);
        textView.setLinkTextColor(n10);
        textView.setMovementMethod((MovementMethod)new TrackingLinkMovementMethod());
        BlockUtils.setLargeLineSpacing(textView);
        BlockUtils.setMarginBottom((View)textView, n14);
    }

    private void styleCarouselHeading1(TextView textView, BlockMetadata blockMetadata) {
        this.applyGenericCarouselHeadingStyle(textView, blockMetadata);
        textView.setTextSize(48.0f);
        textView.setLineSpacing((float)ScreenUtils.dpToPx(8.0f, textView.getContext()), 1.0f);
    }

    private void styleCarouselHeading2(TextView textView, BlockMetadata blockMetadata) {
        this.applyGenericCarouselHeadingStyle(textView, blockMetadata);
        textView.setTextSize(34.0f);
        textView.setLineSpacing((float)ScreenUtils.dpToPx(6.0f, textView.getContext()), 1.0f);
    }

    private void styleChatHeading(TextView textView, int n10) {
        textView.setTextSize(15.0f);
        textView.setTextColor(n10);
        textView.setLinkTextColor(n10);
        BlockUtils.setSmallLineSpacing(textView);
        BlockUtils.setDefaultMarginBottom((View)textView);
    }

    @Override
    public View addHeading(Spanned object, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup object2) {
        int n10;
        Context context = object2.getContext();
        TextView textView = new TextView(context);
        textView.setMovementMethod((MovementMethod)new TrackingLinkMovementMethod());
        BlockUtils.createLayoutParams((View)textView, -2, -2);
        ConfigModules configModules = this.appConfigProvider.get().getConfigModules();
        if (configModules != null) {
            CustomizationColorsModel customizationColorsModel = configModules.getCustomization().getActionContrastWhite();
            object2 = customizationColorsModel;
            if (customizationColorsModel == null) {
                object2 = configModules.getCustomization().getAction();
            }
            n10 = Color.parseColor((String)((CustomizationColorsModel)object2).getBackgroundColor());
        } else {
            n10 = -16777216;
        }
        switch (1.$SwitchMap$io$intercom$android$sdk$blocks$StyleType[this.style.ordinal()]) {
            default: {
                this.styleChatHeading(textView, ContextCompat.getColor((Context)context, (int)R.color.intercom_grey_800));
                textView.setTypeface(null, 1);
                break;
            }
            case 6: {
                this.styleCarouselHeading1(textView, blockMetadata);
                break;
            }
            case 5: {
                this.styleChatHeading(textView, ContextCompat.getColor((Context)context, (int)R.color.intercom_grey_800));
                textView.setTypeface(null, 1);
                break;
            }
            case 4: {
                this.styleAnnouncementHeading(textView, n10, 20, 32);
                break;
            }
            case 3: {
                this.styleAnnouncementHeading(textView, ColorUtils.primaryOrDarkColor(context, this.appConfigProvider.get()), 24, 32);
                break;
            }
            case 2: {
                this.styleAnnouncementHeading(textView, ColorUtils.primaryOrBlackAccessibility(context, this.appConfigProvider.get()), 24, 32);
                break;
            }
            case 1: {
                this.styleAnnouncementHeading(textView, ColorUtils.lightenColor(n10), 24, 32);
                FontUtils.setRobotoLightTypeface(textView);
            }
        }
        textView.setText((CharSequence)object);
        textView.setGravity(blockAlignment.getGravity());
        BlockUtils.setLayoutMarginsAndGravity((View)textView, blockAlignment.getGravity(), blockMetadata.isLastObject());
        object = AccessibilityUtils.INSTANCE;
        ((AccessibilityUtils)object).removeClickAbilityAnnouncement((View)textView);
        ((AccessibilityUtils)object).addHeadingAnnouncement((View)textView);
        return textView;
    }

    @Override
    public View addSubheading(Spanned object, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup object2) {
        int n10;
        Context context = object2.getContext();
        TextView textView = new TextView(context);
        textView.setMovementMethod((MovementMethod)new TrackingLinkMovementMethod());
        BlockUtils.createLayoutParams((View)textView, -2, -2);
        ConfigModules configModules = this.appConfigProvider.get().getConfigModules();
        if (configModules != null) {
            CustomizationColorsModel customizationColorsModel = configModules.getCustomization().getActionContrastWhite();
            object2 = customizationColorsModel;
            if (customizationColorsModel == null) {
                object2 = configModules.getCustomization().getAction();
            }
            n10 = Color.parseColor((String)((CustomizationColorsModel)object2).getBackgroundColor());
        } else {
            n10 = -16777216;
        }
        switch (1.$SwitchMap$io$intercom$android$sdk$blocks$StyleType[this.style.ordinal()]) {
            default: {
                this.styleChatHeading(textView, n10);
                break;
            }
            case 6: {
                this.styleCarouselHeading2(textView, blockMetadata);
                break;
            }
            case 5: {
                this.styleChatHeading(textView, ContextCompat.getColor((Context)context, (int)R.color.intercom_grey_800));
                break;
            }
            case 3: {
                this.styleAnnouncementHeading(textView, ColorUtils.primaryOrDarkColor(context, this.appConfigProvider.get()), 15, 16);
                break;
            }
            case 2: 
            case 4: {
                this.styleAnnouncementHeading(textView, n10, 15, 16);
                break;
            }
            case 1: {
                this.styleAnnouncementHeading(textView, ColorUtils.lightenColor(n10), 15, 16);
                FontUtils.setRobotoLightTypeface(textView);
            }
        }
        textView.setText((CharSequence)object);
        textView.setGravity(blockAlignment.getGravity());
        BlockUtils.setLayoutMarginsAndGravity((View)textView, blockAlignment.getGravity(), blockMetadata.isLastObject());
        object = AccessibilityUtils.INSTANCE;
        ((AccessibilityUtils)object).removeClickAbilityAnnouncement((View)textView);
        ((AccessibilityUtils)object).addHeadingAnnouncement((View)textView);
        return textView;
    }
}


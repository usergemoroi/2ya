/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.Spanned
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  androidx.annotation.DrawableRes
 *  androidx.annotation.Nullable
 *  androidx.core.content.ContextCompat
 *  androidx.core.graphics.drawable.DrawableCompat
 */
package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.ButtonClickListener;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.ButtonBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.FacebookBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.TwitterBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.views.ParagraphView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.android.sdk.utilities.commons.HtmlCompat;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.ButtonSelector;

class Button
implements ButtonBlock,
FacebookBlock,
TwitterBlock {
    private static final int FACEBOOK_LOGO_PADDING_LEFT_DP = 20;
    private static final int TWITTER_LOGO_PADDING_LEFT_DP = 16;
    private final Provider<AppConfig> appConfigProvider;
    @Nullable
    private final ButtonClickListener buttonClickListener;
    private final StyleType style;

    public Button(StyleType styleType, Provider<AppConfig> provider, @Nullable ButtonClickListener buttonClickListener) {
        this.style = styleType;
        this.appConfigProvider = provider;
        this.buttonClickListener = buttonClickListener;
    }

    private View createButtonWithLogo(Context context, String string2, int n10, @DrawableRes int n13) {
        FrameLayout frameLayout = new FrameLayout(context);
        BlockUtils.createLayoutParams((View)frameLayout, -1, ScreenUtils.dpToPx(44.0f, context));
        BlockUtils.setDefaultMarginBottom((View)frameLayout);
        int n14 = this.appConfigProvider.get().getPrimaryColor();
        BackgroundUtils.setBackground((View)frameLayout, (Drawable)new ButtonSelector(context, R.drawable.intercom_border, n14));
        ((LinearLayout.LayoutParams)frameLayout.getLayoutParams()).gravity = 17;
        ImageView imageView = new ImageView(context);
        BlockUtils.createLayoutParams((View)imageView, -2, -1);
        imageView.setImageResource(n13);
        n13 = R.color.intercom_full_transparent_full_black;
        imageView.setBackgroundResource(n13);
        if (ColorUtils.isColorLight(this.appConfigProvider.get().getPrimaryColor())) {
            DrawableCompat.setTint((Drawable)imageView.getDrawable(), (int)ContextCompat.getColor((Context)context, (int)R.color.intercom_accessibility_black));
        }
        imageView.setPadding(n10, 0, 0, 0);
        ((LinearLayout.LayoutParams)imageView.getLayoutParams()).gravity = 8388627;
        TextView textView = new TextView(context);
        BlockUtils.createLayoutParams((View)textView, -1, -1);
        textView.setText((CharSequence)string2);
        textView.setTextSize(16.0f);
        textView.setTextColor(ColorUtils.whiteOrBlackAccessibility(context, this.appConfigProvider.get()));
        textView.setBackgroundResource(n13);
        textView.setGravity(17);
        FontUtils.setRobotoMediumTypeface(textView);
        frameLayout.addView((View)imageView);
        frameLayout.addView((View)textView);
        return frameLayout;
    }

    private TextView createDefaultTextView(Context object, Spanned spanned, BlockAlignment blockAlignment) {
        AppConfig appConfig = this.appConfigProvider.get();
        object = new ParagraphView((Context)object, this.style, blockAlignment, appConfig);
        object.setTextColor(appConfig.getPrimaryColor());
        object.setPaintFlags(object.getPaintFlags() | 8);
        object.setGravity(blockAlignment.getGravity());
        object.setText((CharSequence)spanned);
        return object;
    }

    private android.widget.Button createFullWidthButton(Context context, Spanned spanned) {
        AppConfig appConfig = this.appConfigProvider.get();
        android.widget.Button button = new android.widget.Button(context);
        button.setTextSize(16.0f);
        button.setTextColor(ColorUtils.whiteOrBlackAccessibility(context, appConfig));
        button.setAllCaps(false);
        button.setGravity(17);
        button.setText((CharSequence)spanned);
        BlockUtils.createLayoutParams((View)button, -1, -2);
        BlockUtils.setDefaultMarginBottom((View)button);
        int n10 = appConfig.getPrimaryColor();
        BackgroundUtils.setBackground((View)button, (Drawable)new ButtonSelector(context, R.drawable.intercom_border, n10));
        FontUtils.setRobotoMediumTypeface((TextView)button);
        return button;
    }

    private View setButtonDefaults(View view, String string2, BlockAlignment blockAlignment, boolean bl2) {
        ButtonClickListener buttonClickListener = this.buttonClickListener;
        if (buttonClickListener != null && buttonClickListener.shouldHandleClicks()) {
            view.setOnClickListener(new View.OnClickListener(){
                final Button this$0;
                final String val$url;
                {
                    this.this$0 = button;
                    this.val$url = string2;
                }

                public void onClick(View view) {
                    this.this$0.buttonClickListener.onButtonClicked(view, this.val$url);
                }
            });
        }
        BlockUtils.setLayoutMarginsAndGravity(view, blockAlignment.getGravity(), bl2);
        return view;
    }

    @Override
    public View addButton(Spanned object, String string2, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup object2) {
        Context context = object2.getContext();
        object2 = this.style;
        object = object2 != StyleType.NOTE && object2 != StyleType.ARTICLE && object2 != StyleType.POST && object2 != StyleType.CONTAINER_CARD ? this.createDefaultTextView(context, (Spanned)object, blockAlignment) : this.createFullWidthButton(context, (Spanned)object);
        AccessibilityUtils.INSTANCE.addClickAbilityAnnouncement((View)object);
        return this.setButtonDefaults((View)object, string2, blockAlignment, blockMetadata.isLastObject());
    }

    @Override
    public View addFacebookButton(String string2, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup object) {
        Context context = object.getContext();
        String string3 = context.getString(R.string.intercom_facebook_like);
        object = this.style;
        object = object != StyleType.NOTE && object != StyleType.ARTICLE && object != StyleType.POST && object != StyleType.CONTAINER_CARD ? this.createDefaultTextView(context, HtmlCompat.fromHtml(string3), blockAlignment) : this.createButtonWithLogo(context, string3, ScreenUtils.dpToPx(20.0f, context), R.drawable.intercom_icn_fb);
        AccessibilityUtils.INSTANCE.addClickAbilityAnnouncement((View)object);
        return this.setButtonDefaults((View)object, string2, blockAlignment, blockMetadata.isLastObject());
    }

    @Override
    public View addTwitterButton(String string2, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup object) {
        Context context = object.getContext();
        String string3 = context.getString(R.string.intercom_twitter_follow);
        object = this.style;
        object = object != StyleType.NOTE && object != StyleType.ARTICLE && object != StyleType.POST && object != StyleType.CONTAINER_CARD ? this.createDefaultTextView(context, HtmlCompat.fromHtml(string3), blockAlignment) : this.createButtonWithLogo(context, string3, ScreenUtils.dpToPx(16.0f, context), R.drawable.intercom_icn_twitter);
        AccessibilityUtils.INSTANCE.addClickAbilityAnnouncement((View)object);
        return this.setButtonDefaults((View)object, string2, blockAlignment, blockMetadata.isLastObject());
    }
}


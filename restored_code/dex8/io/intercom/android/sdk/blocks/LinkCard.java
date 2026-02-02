/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.StyleSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.core.content.ContextCompat
 */
package io.intercom.android.sdk.blocks;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.interfaces.LinkBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.lib.models.Link;
import io.intercom.android.sdk.blocks.views.ParagraphView;
import io.intercom.android.sdk.helpcenter.articles.ArticleActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.commons.HtmlCompat;

class LinkCard
implements LinkBlock {
    private final Provider<AppConfig> appConfigProvider;
    private final String conversationId;
    private final StyleType style;

    LinkCard(StyleType styleType, Provider<AppConfig> provider, String string2) {
        this.style = styleType;
        this.appConfigProvider = provider;
        this.conversationId = string2;
    }

    @SuppressLint(value={"SetTextI18n"})
    private void addAuthorDetails(Link link, ImageView imageView, TextView textView, String charSequence) {
        imageView.setVisibility(0);
        textView.setVisibility(0);
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan((Object)new StyleSpan(1), 0, ((String)charSequence).length(), 33);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Written by ");
        ((StringBuilder)charSequence).append(spannableString);
        textView.setText((CharSequence)((StringBuilder)charSequence).toString());
        int n10 = imageView.getResources().getDimensionPixelSize(R.dimen.intercom_avatar_size);
        AvatarUtils.createAvatar(Avatar.create(link.getAuthor().getAvatar(), ""), imageView, n10, this.appConfigProvider.get());
    }

    private View createLinkBlock(Link link, ViewGroup viewGroup, boolean bl2, boolean bl3) {
        Object object = this.appConfigProvider.get();
        Context context = viewGroup.getContext();
        viewGroup = (LinearLayout)LayoutInflater.from((Context)context).inflate(R.layout.intercom_link_block, viewGroup, false);
        TextView textView = (TextView)viewGroup.findViewById(R.id.title);
        ColorUtils.setTextColorPrimaryOrDark(textView, (AppConfig)object);
        textView.setText((CharSequence)link.getTitle());
        this.setUpDescription(link, (TextView)viewGroup.findViewById(R.id.description));
        textView = (ImageView)viewGroup.findViewById(R.id.avatar);
        TextView textView2 = (TextView)viewGroup.findViewById(R.id.author);
        object = link.getAuthor().getFirstName();
        if (TextUtils.isEmpty((CharSequence)object)) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.addAuthorDetails(link, (ImageView)textView, textView2, (String)object);
        }
        if (!bl2) {
            if ("educate.article".equals(link.getLinkType())) {
                viewGroup.setOnClickListener(new View.OnClickListener(){
                    final LinkCard this$0;
                    final Context val$context;
                    final Link val$link;
                    {
                        this.this$0 = linkCard;
                        this.val$context = context;
                        this.val$link = link;
                    }

                    public void onClick(View view) {
                        view = this.val$context;
                        if (view instanceof Activity) {
                            view = ArticleActivity.buildIntent((Context)view, new ArticleActivity.ArticleActivityArguments(this.val$link.getArticleId(), "conversation"));
                            this.val$context.startActivity((Intent)view);
                        }
                    }
                });
            }
            BackgroundUtils.setBackground((View)viewGroup, ContextCompat.getDrawable((Context)context, (int)R.drawable.intercom_conversation_card_background));
            BlockUtils.setMarginBottom((View)viewGroup, 8);
            int n10 = context.getResources().getDimensionPixelSize(R.dimen.intercom_link_padding);
            viewGroup.setPadding(n10, n10, n10, n10);
            BlockUtils.setLayoutMarginsAndGravity((View)viewGroup, 0x800003, bl3);
        }
        return viewGroup;
    }

    private void setUpDescription(Link object, TextView textView) {
        if (TextUtils.isEmpty((CharSequence)(object = ((Link)object).getDescription()))) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText((CharSequence)object);
        }
    }

    private boolean shouldDisplayLink() {
        boolean bl2 = ((Object)((Object)StyleType.ADMIN)).equals((Object)this.style) || ((Object)((Object)StyleType.CHAT_FULL)).equals((Object)this.style);
        return bl2;
    }

    @Override
    public View addLinkBlock(Link link, BlockMetadata object, ViewGroup viewGroup) {
        if (this.shouldDisplayLink()) {
            return this.createLinkBlock(link, viewGroup, object.isSingleObject(), object.isLastObject());
        }
        object = new ParagraphView(viewGroup.getContext(), StyleType.ADMIN, BlockAlignment.LEFT, this.appConfigProvider.get());
        object.setText((CharSequence)HtmlCompat.fromHtml(link.getText()));
        return object;
    }
}


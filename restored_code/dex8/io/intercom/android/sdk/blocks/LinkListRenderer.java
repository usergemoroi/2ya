/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils$TruncateAt
 *  android.util.TypedValue
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.core.content.ContextCompat
 */
package io.intercom.android.sdk.blocks;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.lib.interfaces.LinkListBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.lib.models.Link;
import io.intercom.android.sdk.blocks.lib.models.LinkList;
import io.intercom.android.sdk.helpcenter.articles.ArticleActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.LinkOpener;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import java.util.Collections;
import java.util.Iterator;

class LinkListRenderer
implements LinkListBlock {
    private final Api api;
    private final Provider<AppConfig> appConfigProvider;
    private final String conversationId;

    LinkListRenderer(Api api, Provider<AppConfig> provider, String string2) {
        this.api = api;
        this.appConfigProvider = provider;
        this.conversationId = string2;
    }

    private void addLinkToLayout(LinearLayout linearLayout, Link link, int n10, Context context, boolean bl2) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        if (bl2) {
            layoutParams.gravity = 17;
        }
        textView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        textView.setTextColor(n10);
        textView.setTextSize(16.0f);
        textView.setText((CharSequence)link.getTitle());
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(ScreenUtils.dpToPx(24.0f, context), ScreenUtils.dpToPx(16.0f, context), ScreenUtils.dpToPx(16.0f, context), ScreenUtils.dpToPx(16.0f, context));
        if ("educate.help_center".equals(link.getLinkType())) {
            layoutParams = ContextCompat.getDrawable((Context)context, (int)R.drawable.intercom_open_help_center);
            layoutParams.setColorFilter(n10, PorterDuff.Mode.SRC_IN);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable)layoutParams, null, null, null);
            textView.setCompoundDrawablePadding(ScreenUtils.dpToPx(8.0f, context));
        }
        frameLayout.addView((View)textView);
        frameLayout.setOnClickListener(new View.OnClickListener(){
            final LinkListRenderer this$0;
            final Context val$context;
            final Link val$link;
            {
                this.this$0 = linkListRenderer;
                this.val$link = link;
                this.val$context = context;
            }

            public void onClick(View view) {
                if (("educate.article".equals(this.val$link.getLinkType()) || "educate.suggestion".equals(this.val$link.getLinkType())) && (view = this.val$context) instanceof Activity) {
                    view = ArticleActivity.buildIntent((Context)view, new ArticleActivity.ArticleActivityArguments(this.val$link.getArticleId(), "conversation"));
                    this.val$context.startActivity((Intent)view);
                } else if ("educate.help_center".equals(this.val$link.getLinkType()) && (view = this.val$context) instanceof Activity) {
                    IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections((Context)view, Collections.<String>emptyList(), "conversation");
                } else {
                    LinkOpener.handleUrl(this.val$link.getUrl(), this.val$context, this.this$0.api);
                }
            }
        });
        link = new TypedValue();
        context.getTheme().resolveAttribute(16843534, (TypedValue)link, true);
        frameLayout.setBackgroundResource(((TypedValue)link).resourceId);
        linearLayout.addView((View)frameLayout);
    }

    @Override
    public View addLinkListBlock(LinkList object, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        blockMetadata = viewGroup.getContext();
        viewGroup = (FrameLayout)LayoutInflater.from((Context)blockMetadata).inflate(R.layout.intercom_card_list_block, viewGroup, false);
        int n10 = ColorUtils.primaryOrDarkColor((Context)blockMetadata, this.appConfigProvider.get());
        LinearLayout linearLayout = (LinearLayout)viewGroup.findViewById(R.id.card_links);
        linearLayout.setShowDividers(2);
        linearLayout.setDividerDrawable((Drawable)new ColorDrawable(ContextCompat.getColor((Context)blockMetadata, (int)R.color.intercom_container_border)));
        linearLayout.setOrientation(1);
        Iterator<Link> iterator = ((LinkList)object).getLinks().iterator();
        while (iterator.hasNext()) {
            this.addLinkToLayout(linearLayout, iterator.next(), n10, (Context)blockMetadata, false);
        }
        if (!((Link)(object = ((LinkList)object).getFooterLink())).getText().isEmpty()) {
            this.addLinkToLayout(linearLayout, (Link)object, n10, (Context)blockMetadata, true);
        }
        return viewGroup;
    }
}


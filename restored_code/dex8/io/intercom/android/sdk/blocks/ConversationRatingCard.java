/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.OvershootInterpolator
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  androidx.appcompat.app.AlertDialog
 *  androidx.appcompat.app.AlertDialog$Builder
 *  coil.request.i
 *  coil.request.i$a
 */
package io.intercom.android.sdk.blocks;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AlertDialog;
import coil.request.i;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.a;
import io.intercom.android.sdk.blocks.lib.interfaces.ConversationRatingBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.lib.models.ConversationRating;
import io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButton;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.k0;

public class ConversationRatingCard
implements ConversationRatingBlock {
    private static final long ANIMATION_DURATION_MS = 200L;
    private static final float DESELECTED_RATING_SCALE = 1.0f;
    private static final float DIALOG_HORIZONTAL_MARGIN = 16.0f;
    private static final float RATING_HORIZONTAL_PADDING = 17.0f;
    private static final float RATING_VERTICAL_PADDING = 14.0f;
    private static final float SELECTED_RATING_SCALE = 1.2f;
    private final Api api;
    private final Provider<AppConfig> appConfigProvider;
    private final String conversationId;
    private ConversationRating conversationRating;
    private final ColorFilter deselectedFilter;
    private final View.OnClickListener ratingClickListener = new View.OnClickListener(this){
        final ConversationRatingCard this$0;
        {
            this.this$0 = conversationRatingCard;
        }

        public void onClick(View object) {
            int n10 = this.this$0.ratingViews.indexOf(object);
            if (n10 != -1 && this.this$0.ratingViews.size() == this.this$0.conversationRating.getOptions().size()) {
                object = this.this$0;
                ((ConversationRatingCard)object).rateConversation(((ConversationRatingCard)object).conversationRating, this.this$0.conversationRating.getOptions().get(n10));
                this.this$0.updateSelectedRating();
            }
        }
    };
    private final List<ImageView> ratingViews;
    private LinearLayout rootLayout;

    ConversationRatingCard(Api api, String string2, Provider<AppConfig> provider) {
        this.api = api;
        this.conversationId = string2;
        this.appConfigProvider = provider;
        this.ratingViews = new ArrayList<ImageView>();
        this.deselectedFilter = ColorUtils.newGreyscaleFilter();
    }

    public static /* synthetic */ k0 a(ConversationRatingCard conversationRatingCard, Context context) {
        return conversationRatingCard.lambda$createConversationRatingBlock$0(context);
    }

    private View createConversationRatingBlock(ConversationRating object, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.ratingViews.clear();
        this.conversationRating = object;
        this.rootLayout = (LinearLayout)LayoutInflater.from((Context)context).inflate(R.layout.intercom_conversation_rating_block, viewGroup, false);
        this.updateViewVisibility();
        object = (IntercomPrimaryButton)this.rootLayout.findViewById(R.id.intercom_rating_tell_us_more_button);
        ((IntercomPrimaryButton)((Object)object)).setText(context.getString(R.string.intercom_tell_us_more));
        ((IntercomPrimaryButton)((Object)object)).setOnClick(new a(this, context));
        this.setupRatingsLayout();
        this.updateSelectedRating();
        return this.rootLayout;
    }

    private void deselectView(ImageView imageView) {
        imageView.animate().setInterpolator((TimeInterpolator)new OvershootInterpolator(0.6f)).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
        imageView.setColorFilter(this.deselectedFilter);
    }

    @Nullable
    private ConversationRatingOption findSelectedOption() {
        for (ConversationRatingOption conversationRatingOption : this.conversationRating.getOptions()) {
            if (!conversationRatingOption.getIndex().equals(this.conversationRating.getRatingIndex())) continue;
            return conversationRatingOption;
        }
        return null;
    }

    private static String imageUrlForUnicode(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://js.intercomcdn.com/images/stickers/");
        stringBuilder.append(string2);
        stringBuilder.append(".png");
        return stringBuilder.toString();
    }

    private /* synthetic */ k0 lambda$createConversationRatingBlock$0(Context context) {
        this.showRemarkDialog(context);
        return null;
    }

    private void selectView(float f11, ImageView imageView) {
        imageView.animate().setInterpolator((TimeInterpolator)new OvershootInterpolator(2.0f)).scaleX(f11).scaleY(f11).setDuration(200L).start();
        imageView.clearColorFilter();
    }

    private void setupRatingsLayout() {
        LinearLayout linearLayout = (LinearLayout)this.rootLayout.findViewById(R.id.intercom_rating_options_layout);
        Context context = this.rootLayout.getContext();
        int n10 = ScreenUtils.dpToPx(14.0f, context);
        int n13 = ScreenUtils.dpToPx(17.0f, context);
        for (int i14 = 0; i14 < this.conversationRating.getOptions().size(); ++i14) {
            Object object = this.conversationRating.getOptions().get(i14);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(0, -1, 1.0f));
            ImageView imageView = new ImageView(context);
            int n14 = context.getResources().getDimensionPixelSize(R.dimen.intercom_conversation_rating_size);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n14, n14, 17);
            layoutParams.setMargins(n13, n10, n13, n10);
            imageView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            imageView.setLongClickable(false);
            object = ConversationRatingCard.imageUrlForUnicode(((ConversationRatingOption)object).getUnicode());
            IntercomCoilKt.loadIntercomImage(context, new i.a(context).d(object).B(imageView).a());
            imageView.setOnClickListener(this.ratingClickListener);
            frameLayout.addView((View)imageView);
            linearLayout.addView((View)frameLayout);
            this.ratingViews.add(imageView);
        }
    }

    private void showRemarkDialog(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.intercom_tell_us_more);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int n10 = ScreenUtils.dpToPx(16.0f, context);
        layoutParams.setMargins(n10, 0, n10, 0);
        context = new EditText(context);
        context.getBackground().mutate().setColorFilter(this.appConfigProvider.get().getPrimaryColor(), PorterDuff.Mode.SRC_ATOP);
        context.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        linearLayout.addView((View)context);
        builder.setView((View)linearLayout);
        builder.setPositiveButton(17039370, new DialogInterface.OnClickListener(){
            final ConversationRatingCard this$0;
            final EditText val$input;
            {
                this.this$0 = conversationRatingCard;
                this.val$input = editText;
            }

            public void onClick(DialogInterface object, int n10) {
                String string2 = this.val$input.getText().toString();
                object = this.this$0;
                ((ConversationRatingCard)object).addRemarkToConversation(((ConversationRatingCard)object).conversationRating, string2);
            }
        });
        builder.setNegativeButton(0x1040000, new DialogInterface.OnClickListener(this){
            final ConversationRatingCard this$0;
            {
                this.this$0 = conversationRatingCard;
            }

            public void onClick(DialogInterface dialogInterface, int n10) {
                dialogInterface.cancel();
            }
        });
        layoutParams = builder.create();
        layoutParams.show();
        context.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            final ConversationRatingCard this$0;
            final AlertDialog val$alert;
            {
                this.this$0 = conversationRatingCard;
                this.val$alert = alertDialog;
            }

            public void onFocusChange(View view, boolean bl2) {
                if (bl2 && this.val$alert.getWindow() != null) {
                    this.val$alert.getWindow().setSoftInputMode(5);
                }
            }
        });
        layoutParams.getButton(-1).setTextColor(this.appConfigProvider.get().getPrimaryColor());
        layoutParams.getButton(-2).setTextColor(this.appConfigProvider.get().getPrimaryColor());
    }

    private void updateSelectedRating() {
        if (this.conversationRating.getOptions().size() != this.ratingViews.size()) {
            return;
        }
        for (int i14 = 0; i14 < this.conversationRating.getOptions().size(); ++i14) {
            ConversationRatingOption conversationRatingOption = this.conversationRating.getOptions().get(i14);
            ImageView imageView = this.ratingViews.get(i14);
            if (this.conversationRating.getRatingIndex() == -1) {
                this.selectView(1.0f, imageView);
                continue;
            }
            if (this.conversationRating.getRatingIndex().equals(conversationRatingOption.getIndex())) {
                this.selectView(1.2f, imageView);
                continue;
            }
            this.deselectView(imageView);
        }
    }

    private void updateViewVisibility() {
        if (this.rootLayout == null) {
            return;
        }
        int n10 = this.conversationRating.getRatingIndex();
        int n13 = 0;
        n10 = n10 != -1 ? 1 : 0;
        boolean bl2 = TextUtils.isEmpty((CharSequence)this.conversationRating.getRemark()) ^ true;
        Object object = (TextView)this.rootLayout.findViewById(R.id.rate_your_conversation_text_view);
        int n14 = bl2 ? 8 : 0;
        object.setVisibility(n14);
        object = (LinearLayout)this.rootLayout.findViewById(R.id.intercom_rating_options_layout);
        n14 = bl2 ? 8 : 0;
        object.setVisibility(n14);
        object = (IntercomPrimaryButton)this.rootLayout.findViewById(R.id.intercom_rating_tell_us_more_button);
        n10 = n10 != 0 && !bl2 ? 0 : 8;
        object.setVisibility(n10);
        object = (LinearLayout)this.rootLayout.findViewById(R.id.intercom_you_rated_layout);
        n10 = bl2 ? n13 : 8;
        object.setVisibility(n10);
        Object object2 = this.findSelectedOption();
        if (object2 != null) {
            object = (ImageView)this.rootLayout.findViewById(R.id.intercom_you_rated_image_view);
            object2 = ConversationRatingCard.imageUrlForUnicode(((ConversationRatingOption)object2).getUnicode());
            object2 = new i.a(object.getContext()).d(object2).B((ImageView)object).a();
            IntercomCoilKt.loadIntercomImage(object.getContext(), (i)object2);
        }
    }

    @Override
    public View addConversationRatingBlock(ConversationRating conversationRating, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        return this.createConversationRatingBlock(conversationRating, viewGroup);
    }

    @VisibleForTesting
    void addRemarkToConversation(ConversationRating conversationRating, String string2) {
        if (!TextUtils.isEmpty((CharSequence)conversationRating.getRemark())) {
            return;
        }
        conversationRating.setRemark(string2);
        this.api.addConversationRatingRemark(this.conversationId, string2);
        this.updateViewVisibility();
    }

    @VisibleForTesting
    void rateConversation(ConversationRating conversationRating, ConversationRatingOption conversationRatingOption) {
        if (conversationRating.getRatingIndex().equals(conversationRatingOption.getIndex())) {
            return;
        }
        conversationRating.setRatingIndex(conversationRatingOption.getIndex());
        this.api.rateConversation(this.conversationId, conversationRatingOption.getIndex());
        this.updateViewVisibility();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.TimeInterpolator
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Color
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.animation.OvershootInterpolator
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.core.content.ContextCompat
 *  io.intercom.android.sdk.views.IntercomToolbar
 */
package io.intercom.android.sdk.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.activities.ConversationReactionListener;
import io.intercom.android.sdk.activities.FullScreenInAppPresenter;
import io.intercom.android.sdk.activities.InAppToolbarListener;
import io.intercom.android.sdk.activities.IntercomBaseActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.LightboxOpeningImageClickListener;
import io.intercom.android.sdk.blocks.LinkOpeningButtonClickListener;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.ViewHolderGenerator;
import io.intercom.android.sdk.blocks.lib.BlocksViewHolder;
import io.intercom.android.sdk.blocks.views.AttachmentView;
import io.intercom.android.sdk.blocks.views.ParagraphView;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.conversation.ReactionListener;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.post.PostActivityV2;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.ActiveStatePresenter;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import io.intercom.android.sdk.views.IntercomToolbar;

public class IntercomPostActivity
extends IntercomBaseActivity
implements View.OnClickListener {
    private static final String COMPOSER_IS_VISIBLE = "composer_is_visible";
    private static final String LAST_PARTICIPANT = "last_participant";
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    private static final String PARCEL_PART = "parcel_part";
    private static final String POST_PREVIEW = "is_post_preview";
    private boolean composerIsVisible = true;
    View composerLayout;
    String conversationId;
    private boolean isPreview = false;
    private LastParticipatingAdmin lastParticipatingAdmin;
    MetricTracker metricTracker;
    Part part;
    private FrameLayout postContainer;
    ContentAwareScrollView postView;
    private final FullScreenInAppPresenter presenter = new FullScreenInAppPresenter();
    ReactionInputView reactionComposer;
    private EditText textComposer;

    private void applyAccessibilityFullScreenPostStyling(EditText editText) {
        int n10 = this.getResources().getColor(R.color.intercom_white);
        editText.setHintTextColor(n10);
        editText.setTextColor(n10);
    }

    public static Intent buildPostIntent(Context context, Part part, String string2, LastParticipatingAdmin lastParticipatingAdmin, boolean bl2, boolean bl3) {
        Class clazz = !Injector.isNotInitialised() && Injector.get().getAppConfigProvider().get().hasFeature("new-post-rendering-enabled") ? PostActivityV2.class : IntercomPostActivity.class;
        context = new Intent(context, clazz).putExtra(PARCEL_PART, (Parcelable)part).putExtra(LAST_PARTICIPANT, (Parcelable)lastParticipatingAdmin).putExtra(COMPOSER_IS_VISIBLE, bl2).putExtra(POST_PREVIEW, bl3);
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            context.putExtra(PARCEL_CONVERSATION_ID, string2);
        }
        context.setExtrasClassLoader(Part.class.getClassLoader());
        return context;
    }

    private void ensureButtonCorrectness(Button button, Provider<AppConfig> provider) {
        if (ColorUtils.isColorLight(provider.get().getPrimaryColor())) {
            button.setTextColor(ContextCompat.getColor((Context)this.getApplicationContext(), (int)R.color.intercom_accessibility_black));
        } else {
            button.setTextColor(ContextCompat.getColor((Context)this.getApplicationContext(), (int)R.color.intercom_white));
        }
    }

    private void ensureColorConformanceForViews(LinearLayout linearLayout) {
        Provider<AppConfig> provider = Injector.get().getAppConfigProvider();
        for (int i14 = 0; i14 < linearLayout.getChildCount(); ++i14) {
            View view = linearLayout.getChildAt(i14);
            if (view instanceof Button) {
                this.ensureButtonCorrectness((Button)view, provider);
                continue;
            }
            if (view instanceof ParagraphView) {
                this.ensureTextViewCorrectness((TextView)view);
                continue;
            }
            if (view instanceof TextView) {
                this.ensureTextViewCorrectness((TextView)view);
                continue;
            }
            if (view instanceof AttachmentView) {
                this.ensureWhiteAttachmentView((AttachmentView)view);
                continue;
            }
            if (!(view instanceof LinearLayout)) continue;
            this.ensureColorConformanceForViews((LinearLayout)view);
        }
    }

    private void ensureTextViewCorrectness(TextView textView) {
        Context context = this.getApplicationContext();
        int n10 = R.color.intercom_white;
        textView.setTextColor(ContextCompat.getColor((Context)context, (int)n10));
        textView.setLinkTextColor(this.getResources().getColor(n10));
    }

    private void ensureWhiteAttachmentView(AttachmentView attachmentView) {
        for (int i14 = 0; i14 < attachmentView.getChildCount(); ++i14) {
            View view = attachmentView.getChildAt(i14);
            if (view instanceof TextView) {
                ((TextView)view).setTextColor(ContextCompat.getColor((Context)this.getApplicationContext(), (int)R.color.intercom_white));
                continue;
            }
            if (!(view instanceof ImageView)) continue;
            ((ImageView)view).setColorFilter(ContextCompat.getColor((Context)this.getApplicationContext(), (int)R.color.intercom_white));
        }
    }

    void animateComposer() {
        View view = this.composerLayout;
        view.setY(view.getY() + (float)ScreenUtils.dpToPx(156.0f, (Context)this));
        this.composerLayout.setVisibility(0);
        this.textComposer.setVisibility(0);
        this.composerLayout.animate().setInterpolator((TimeInterpolator)new OvershootInterpolator(0.6f)).translationY(0.0f).setDuration(300L).start();
    }

    void animateContent() {
        FrameLayout frameLayout = this.postContainer;
        frameLayout.setY(frameLayout.getY() + (float)ScreenUtils.dpToPx(400.0f, (Context)this));
        this.postContainer.setVisibility(0);
        this.postContainer.animate().setInterpolator((TimeInterpolator)new OvershootInterpolator(0.6f)).translationY(0.0f).setDuration(300L).start();
    }

    void animateToolbar(IntercomToolbar intercomToolbar) {
        intercomToolbar.setY(intercomToolbar.getY() + (float)ScreenUtils.dpToPx(200.0f, (Context)this));
        intercomToolbar.setVisibility(0);
        intercomToolbar.animate().setInterpolator((TimeInterpolator)new OvershootInterpolator(0.6f)).translationY(0.0f).setDuration(300L).start();
    }

    public void onBackPressed() {
        this.presenter.closeWindow((Activity)this);
        if (this.isPreview) {
            this.metricTracker.closedInAppFromFull(this.conversationId, this.part.getId());
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.post_touch_target) {
            this.presenter.closeWindow((Activity)this);
            if (this.isPreview) {
                this.metricTracker.openedConversationFromFull(this.conversationId, this.part.getId());
                this.startActivity(ConversationScreenOpenerKt.getConversationIntent((Context)this, this.conversationId, this.lastParticipatingAdmin));
            }
        }
    }

    @Override
    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        this.setContentView(R.layout.intercom_activity_post);
        Injector injector2 = Injector.get();
        Object object2 = injector2.getApi();
        this.metricTracker = injector2.getMetricTracker();
        Object object3 = injector2.getAppConfigProvider();
        IntercomToolbar intercomToolbar = (IntercomToolbar)this.findViewById(R.id.intercom_toolbar);
        intercomToolbar.setListener((IntercomToolbar.Listener)new InAppToolbarListener((Activity)this));
        this.part = new Part();
        this.lastParticipatingAdmin = LastParticipatingAdmin.NULL;
        TimeFormatter timeFormatter2 = new TimeFormatter((Context)this, injector2.getTimeProvider());
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null) {
            bundle.setClassLoader(Part.class.getClassLoader());
            if (bundle.containsKey(PARCEL_PART)) {
                object = (Part)bundle.getParcelable(PARCEL_PART);
                this.part = object;
                object = object != null && ((Part)object).getParticipant() != null ? this.part.getParticipant().getForename() : "";
                String string2 = object3.get().getName();
                intercomToolbar.setTitle(Phrase.from((Context)this, R.string.intercom_teammate_from_company).put("name", (CharSequence)object).put("company", string2).format());
            }
            if (bundle.containsKey(PARCEL_CONVERSATION_ID)) {
                this.conversationId = bundle.getString(PARCEL_CONVERSATION_ID, "");
                injector2.getStore().dispatch(Actions.conversationMarkedAsRead(this.conversationId));
                object2.markConversationAsRead(this.conversationId);
            }
            if (bundle.containsKey(COMPOSER_IS_VISIBLE)) {
                this.composerIsVisible = bundle.getBoolean(COMPOSER_IS_VISIBLE, true);
            }
            if (bundle.containsKey(POST_PREVIEW)) {
                this.isPreview = bundle.getBoolean(POST_PREVIEW, false);
            }
            if (bundle.containsKey(LAST_PARTICIPANT)) {
                this.lastParticipatingAdmin = object = (LastParticipatingAdmin)bundle.getParcelable(LAST_PARTICIPANT);
                if (!LastParticipatingAdmin.isNull((LastParticipatingAdmin)object)) {
                    intercomToolbar.setSubtitle(timeFormatter2.getAdminActiveStatus(this.lastParticipatingAdmin, (Provider<AppConfig>)object3));
                }
            }
        }
        intercomToolbar.setVisibility(8);
        intercomToolbar.setUpPostToolbar(this.part.getParticipant(), this.lastParticipatingAdmin.isActive(), new ActiveStatePresenter(), object3.get());
        int n10 = object3.get().getPrimaryColor();
        object = this.getWindow().getDecorView();
        object.setBackgroundColor(Color.argb((int)153, (int)Color.red((int)n10), (int)Color.green((int)n10), (int)Color.blue((int)n10)));
        object3 = new ViewHolderGenerator(new UploadingImageCache(), (Api)object2, (Provider<AppConfig>)object3, this.conversationId, new LightboxOpeningImageClickListener((Api)object2), new LinkOpeningButtonClickListener((Api)object2), injector2.getGson(), this.metricTracker).getPostHolder();
        this.postContainer = (FrameLayout)this.findViewById(R.id.post_container);
        this.composerLayout = this.findViewById(R.id.conversation_coordinator);
        object2 = (EditText)this.findViewById(R.id.composer_input_view);
        this.textComposer = object2;
        this.applyAccessibilityFullScreenPostStyling((EditText)object2);
        this.reactionComposer = (ReactionInputView)this.findViewById(R.id.reaction_input_view);
        this.postView = (ContentAwareScrollView)this.findViewById(R.id.post_view);
        object3 = ViewHolderGenerator.createPartsLayout((BlocksViewHolder)object3, this.part, (Context)this);
        this.ensureColorConformanceForViews((LinearLayout)object3);
        object2 = this.postView;
        object2.addView(BlockUtils.getBlockView((ViewGroup)object2, (LinearLayout)object3, (Context)this));
        if (this.isPreview && !ReactionReply.isNull(this.part.getReactionReply())) {
            object3 = new ConversationReactionListener(MetricTracker.ReactionLocation.IN_APP, this.part.getId(), this.conversationId, Injector.get().getApi(), this.metricTracker);
            this.postView.setListener(new ContentAwareScrollView.Listener(){
                final IntercomPostActivity this$0;
                final ReactionListener val$reactionListener;
                {
                    this.this$0 = intercomPostActivity;
                    this.val$reactionListener = reactionListener;
                }

                @Override
                public void onBottomReached() {
                    this.this$0.postView.setListener(null);
                    if (this.this$0.composerLayout.getVisibility() != 0) {
                        this.this$0.composerLayout.setVisibility(0);
                        IntercomPostActivity intercomPostActivity = this.this$0;
                        intercomPostActivity.reactionComposer.setUpReactions(intercomPostActivity.part.getReactionReply(), true, this.val$reactionListener);
                    }
                }

                @Override
                public void onScrollChanged(int n10) {
                }
            });
            this.reactionComposer.preloadReactionImages(this.part.getReactionReply());
        }
        if (this.openedFromConversation()) {
            this.metricTracker.viewedInAppFromMessenger(this.part.getMessageStyle(), this.conversationId, this.part.getId());
        }
        object.setAlpha(0.0f);
        object.animate().alpha(1.0f).setDuration(200L).setListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, intercomToolbar){
            final IntercomPostActivity this$0;
            final IntercomToolbar val$intercomToolbar;
            {
                this.this$0 = intercomPostActivity;
                this.val$intercomToolbar = intercomToolbar;
            }

            public void onAnimationEnd(Animator animator) {
                this.this$0.animateToolbar(this.val$intercomToolbar);
                this.this$0.animateContent();
                if (this.this$0.openedFromConversation()) {
                    this.this$0.composerLayout.setVisibility(8);
                } else if (this.this$0.composerIsVisible && ReactionReply.isNull(this.this$0.part.getReactionReply())) {
                    this.this$0.findViewById(R.id.post_touch_target).setOnClickListener((View.OnClickListener)this.this$0);
                    this.this$0.animateComposer();
                }
            }
        }).start();
    }

    boolean openedFromConversation() {
        return this.isPreview ^ true;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  io.intercom.android.sdk.views.IntercomToolbar
 */
package io.intercom.android.sdk.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.activities.FullScreenInAppPresenter;
import io.intercom.android.sdk.activities.InAppToolbarListener;
import io.intercom.android.sdk.activities.IntercomBaseActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.LightboxOpeningImageClickListener;
import io.intercom.android.sdk.blocks.LinkOpeningButtonClickListener;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.ViewHolderGenerator;
import io.intercom.android.sdk.blocks.lib.BlocksViewHolder;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.conversation.ReactionListener;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.intercom.android.sdk.views.ActiveStatePresenter;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import io.intercom.android.sdk.views.IntercomToolbar;

public class IntercomNoteActivity
extends IntercomBaseActivity
implements View.OnClickListener {
    private static final String COMPOSER_IS_VISIBLE = "composer_is_visible";
    private static final String LAST_PARTICIPANT = "last_participant";
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    private static final String PARCEL_PART = "parcel_part";
    private boolean composerIsVisible = true;
    View composerLayout;
    String conversationId;
    private LastParticipatingAdmin lastParticipatingAdmin;
    MetricTracker metricTracker;
    private LinearLayout noteLayout;
    Part part;
    private final FullScreenInAppPresenter presenter = new FullScreenInAppPresenter();
    ReactionInputView reactionComposer;

    private void applyAccessibilityStyling(EditText editText) {
        int n10 = this.getResources().getColor(R.color.intercom_accessibility_grey);
        editText.setTextColor(n10);
        editText.setHintTextColor(n10);
    }

    public static Intent buildNoteIntent(Context context, Part part, String string2, LastParticipatingAdmin lastParticipatingAdmin, boolean bl2) {
        context = new Intent(context, IntercomNoteActivity.class).putExtra(PARCEL_PART, (Parcelable)part).putExtra(LAST_PARTICIPANT, (Parcelable)lastParticipatingAdmin).putExtra(COMPOSER_IS_VISIBLE, bl2);
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            context.putExtra(PARCEL_CONVERSATION_ID, string2);
        }
        context.setExtrasClassLoader(Part.class.getClassLoader());
        return context;
    }

    void animateContent() {
        this.noteLayout.setScaleX(0.9f);
        this.noteLayout.setScaleY(0.9f);
        this.noteLayout.setAlpha(0.0f);
        this.noteLayout.setVisibility(0);
        this.noteLayout.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200L).start();
    }

    public void onBackPressed() {
        this.presenter.closeWindow((Activity)this);
        this.metricTracker.closedInAppFromFull(this.conversationId, this.part.getId());
    }

    public void onClick(View view) {
        if (view.getId() == R.id.note_touch_target) {
            this.presenter.closeWindow((Activity)this);
            this.metricTracker.closedInAppFromFull(this.conversationId, this.part.getId());
            this.startActivity(ConversationScreenOpenerKt.getConversationIntent((Context)this, this.conversationId, this.lastParticipatingAdmin));
        }
    }

    @Override
    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        this.setContentView(R.layout.intercom_activity_note);
        object = (LinearLayout)this.findViewById(R.id.note_layout);
        this.noteLayout = object;
        object.setVisibility(4);
        this.reactionComposer = (ReactionInputView)this.findViewById(R.id.reaction_input_view);
        IntercomToolbar intercomToolbar = (IntercomToolbar)this.findViewById(R.id.intercom_toolbar);
        intercomToolbar.setListener((IntercomToolbar.Listener)new InAppToolbarListener((Activity)this));
        this.part = new Part();
        this.lastParticipatingAdmin = LastParticipatingAdmin.NULL;
        Injector injector2 = Injector.get();
        Api api = injector2.getApi();
        this.metricTracker = injector2.getMetricTracker();
        Provider<AppConfig> provider = injector2.getAppConfigProvider();
        TimeFormatter timeFormatter2 = new TimeFormatter((Context)this, injector2.getTimeProvider());
        Object object2 = this.getIntent().getExtras();
        if (object2 != null) {
            object2.setClassLoader(Part.class.getClassLoader());
            if (object2.containsKey(PARCEL_PART)) {
                object = (Part)object2.getParcelable(PARCEL_PART);
                this.part = object;
                object = object != null && ((Part)object).getParticipant() != null ? this.part.getParticipant().getForename() : "";
                String string2 = provider.get().getName();
                intercomToolbar.setTitle(Phrase.from((Context)this, R.string.intercom_teammate_from_company).put("name", (CharSequence)object).put("company", string2).format());
            }
            if (object2.containsKey(PARCEL_CONVERSATION_ID)) {
                this.conversationId = object2.getString(PARCEL_CONVERSATION_ID);
                injector2.getStore().dispatch(Actions.conversationMarkedAsRead(this.conversationId));
                api.markConversationAsRead(this.conversationId);
            }
            if (object2.containsKey(LAST_PARTICIPANT)) {
                this.lastParticipatingAdmin = object = (LastParticipatingAdmin)object2.getParcelable(LAST_PARTICIPANT);
                if (!LastParticipatingAdmin.isNull((LastParticipatingAdmin)object)) {
                    intercomToolbar.setSubtitle(timeFormatter2.getAdminActiveStatus(this.lastParticipatingAdmin, provider));
                }
            }
            if (object2.containsKey(COMPOSER_IS_VISIBLE)) {
                this.composerIsVisible = object2.getBoolean(COMPOSER_IS_VISIBLE, true);
            }
        }
        intercomToolbar.setUpNoteToolbar(this.part.getParticipant(), this.lastParticipatingAdmin.isActive(), new ActiveStatePresenter(), provider.get());
        object2 = new ViewHolderGenerator(new UploadingImageCache(), api, provider, this.conversationId, new LightboxOpeningImageClickListener(api), new LinkOpeningButtonClickListener(api), injector2.getGson(), this.metricTracker).getNoteHolder();
        this.composerLayout = this.findViewById(R.id.note_composer_container);
        object = (ContentAwareScrollView)this.findViewById(R.id.note_view);
        object.addView(BlockUtils.getBlockView((ViewGroup)object, ViewHolderGenerator.createPartsLayout((BlocksViewHolder)object2, this.part, (Context)this), (Context)this));
        if (!ReactionReply.isNull(this.part.getReactionReply())) {
            ((ContentAwareScrollView)((Object)object)).setListener(new ContentAwareScrollView.Listener(){
                final IntercomNoteActivity this$0;
                final ContentAwareScrollView val$noteView;
                final ReactionListener val$reactionListener;
                {
                    this.this$0 = intercomNoteActivity;
                    this.val$noteView = contentAwareScrollView;
                    this.val$reactionListener = reactionListener;
                }

                @Override
                public void onBottomReached() {
                    this.val$noteView.setListener(null);
                    this.this$0.composerLayout.setVisibility(0);
                    IntercomNoteActivity intercomNoteActivity = this.this$0;
                    intercomNoteActivity.reactionComposer.setUpReactions(intercomNoteActivity.part.getReactionReply(), true, this.val$reactionListener);
                }

                @Override
                public void onScrollChanged(int n10) {
                }
            });
            this.reactionComposer.preloadReactionImages(this.part.getReactionReply());
        }
        object = this.getWindow().getDecorView();
        object.setAlpha(0.0f);
        object.animate().alpha(1.0f).setDuration(200L).setListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final IntercomNoteActivity this$0;
            {
                this.this$0 = intercomNoteActivity;
            }

            public void onAnimationEnd(Animator animator) {
                this.this$0.animateContent();
                if (this.this$0.composerIsVisible && ReactionReply.isNull(this.this$0.part.getReactionReply())) {
                    this.this$0.composerLayout.setVisibility(0);
                    animator = (EditText)this.this$0.findViewById(R.id.composer_input_view);
                    this.this$0.findViewById(R.id.note_touch_target).setOnClickListener((View.OnClickListener)this.this$0);
                    this.this$0.applyAccessibilityStyling((EditText)animator);
                    animator.setVisibility(0);
                }
            }
        }).start();
    }
}


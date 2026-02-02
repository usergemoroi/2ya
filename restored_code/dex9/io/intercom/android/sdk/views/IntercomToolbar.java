/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.AnimationUtils
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.annotation.Nullable
 *  androidx.appcompat.widget.Toolbar
 *  androidx.core.content.ContextCompat
 *  io.intercom.android.sdk.R$anim
 *  io.intercom.android.sdk.R$color
 *  io.intercom.android.sdk.R$dimen
 *  io.intercom.android.sdk.R$id
 *  io.intercom.android.sdk.R$layout
 *  io.intercom.android.sdk.identity.AppConfig
 *  io.intercom.android.sdk.imageloader.WallpaperLoader
 *  io.intercom.android.sdk.models.Avatar
 *  io.intercom.android.sdk.models.Participant
 *  io.intercom.android.sdk.utilities.AvatarUtils
 *  io.intercom.android.sdk.utilities.ColorUtils
 *  io.intercom.android.sdk.utilities.WindowUtils
 *  io.intercom.android.sdk.views.ActiveStatePresenter
 *  io.intercom.android.sdk.views.BackButtonCountDrawable
 *  io.intercom.android.sdk.views.IntercomToolbar$1
 *  io.intercom.android.sdk.views.IntercomToolbar$Listener
 */
package io.intercom.android.sdk.views;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.imageloader.WallpaperLoader;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.WindowUtils;
import io.intercom.android.sdk.views.ActiveStatePresenter;
import io.intercom.android.sdk.views.BackButtonCountDrawable;
import io.intercom.android.sdk.views.IntercomToolbar;
import java.io.IOException;

public class IntercomToolbar
extends Toolbar
implements View.OnTouchListener,
View.OnClickListener {
    private static final int TITLE_FADE_DURATION_MS = 150;
    private final View activeStateView;
    private final ImageView avatar;
    private final ImageButton backButton;
    private final BackButtonCountDrawable backButtonCountDrawable;
    private final ImageView backgroundImage;
    private final ImageButton close;
    @Nullable
    private Listener listener;
    private final TextView subtitle;
    final TextView title;

    public IntercomToolbar(Context context) {
        this(context, null);
    }

    public IntercomToolbar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        View view = View.inflate((Context)context, (int)R.layout.intercom_toolbar, (ViewGroup)this);
        view.setOnTouchListener((View.OnTouchListener)this);
        this.title = (TextView)view.findViewById(R.id.intercom_toolbar_title);
        this.subtitle = (TextView)view.findViewById(R.id.intercom_toolbar_subtitle);
        context = (ImageButton)view.findViewById(R.id.intercom_toolbar_close);
        this.close = context;
        attributeSet = (ImageButton)view.findViewById(R.id.intercom_toolbar_inbox);
        this.backButton = attributeSet;
        this.avatar = (ImageView)view.findViewById(R.id.intercom_toolbar_avatar);
        this.activeStateView = view.findViewById(R.id.intercom_toolbar_avatar_active_state);
        this.backgroundImage = (ImageView)view.findViewById(R.id.wallpaper_image);
        view = new BackButtonCountDrawable(this.getContext(), null);
        this.backButtonCountDrawable = view;
        attributeSet.setImageDrawable((Drawable)view);
        attributeSet.setOnClickListener((View.OnClickListener)this);
        context.setOnClickListener((View.OnClickListener)this);
    }

    public void animateBackButton() {
        ImageButton imageButton = this.backButton;
        imageButton.startAnimation(AnimationUtils.loadAnimation((Context)imageButton.getContext(), (int)R.anim.intercom_profile_slide_in));
    }

    public void closeWallpaperLoader(WallpaperLoader wallpaperLoader) {
        try {
            wallpaperLoader.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void fadeOutTitle(int n4) {
        this.title.animate().alpha(0.0f).setDuration((long)n4).setListener((Animator.AnimatorListener)new 1(this)).start();
    }

    public void loadWallpaper(WallpaperLoader wallpaperLoader) {
        wallpaperLoader.loadWallpaperInto(this.backgroundImage);
    }

    public void onClick(View view) {
        if (this.listener == null) {
            return;
        }
        int n4 = view.getId();
        if (n4 == R.id.intercom_toolbar_close) {
            this.listener.onCloseClicked();
        } else if (n4 == R.id.intercom_toolbar_inbox) {
            this.listener.onInboxClicked();
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.listener == null) {
            return false;
        }
        if (motionEvent.getAction() == 1 && view.getId() == R.id.intercom_toolbar) {
            this.listener.onToolbarClicked();
        }
        return false;
    }

    public void setCloseButtonVisibility(int n4) {
        this.close.setVisibility(n4);
    }

    public void setLeftNavigationIcon(@Nullable Drawable drawable) {
        this.backButton.setImageDrawable(drawable);
    }

    public void setLeftNavigationItemVisibility(int n4) {
        this.backButton.setVisibility(n4);
    }

    public void setListener(@Nullable Listener listener) {
        this.listener = listener;
    }

    public void setSubtitle(@Nullable CharSequence charSequence) {
        this.subtitle.setText(charSequence);
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            this.subtitle.setAlpha(1.0f);
        }
    }

    public void setSubtitleVisibility(int n4) {
        this.subtitle.setVisibility(n4);
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty((CharSequence)charSequence)) {
            this.fadeOutTitle(150);
        } else {
            this.title.setAlpha(1.0f);
            this.title.setText(charSequence);
        }
    }

    public void setUnreadCount(Integer object) {
        BackButtonCountDrawable backButtonCountDrawable = this.backButtonCountDrawable;
        object = (Integer)object > 0 ? Integer.toString((Integer)object) : null;
        backButtonCountDrawable.setText((String)object);
    }

    public void setUpHelpCenterToolbar(AppConfig appConfig) {
        boolean bl = appConfig.isHelpCenterColorRenderDarkText();
        ColorUtils.setTextColorWhiteOrBlack((TextView)this.title, (boolean)bl);
        ColorUtils.setTextColorWhiteOrBlack((TextView)this.subtitle, (boolean)bl);
        ColorUtils.setImageColorWhiteOrBlack((ImageView)this.close, (boolean)bl);
        ColorUtils.setImageColorWhiteOrBlack((ImageView)this.backButton, (boolean)bl);
    }

    public void setUpNoteToolbar(Participant participant, boolean bl, ActiveStatePresenter activeStatePresenter, AppConfig appConfig) {
        this.title.setTextColor(ContextCompat.getColor((Context)this.getContext(), (int)R.color.intercom_accessibility_black));
        TextView textView = this.subtitle;
        Context context = this.getContext();
        int n4 = R.color.intercom_accessibility_grey;
        textView.setTextColor(ContextCompat.getColor((Context)context, (int)n4));
        this.close.setColorFilter(ContextCompat.getColor((Context)this.getContext(), (int)n4));
        this.backButton.setVisibility(8);
        this.avatar.setVisibility(0);
        this.activeStateView.setVisibility(0);
        this.title.setTextSize(14.0f);
        this.subtitle.setAlpha(1.0f);
        textView = this.findViewById(R.id.intercom_toolbar_divider);
        textView.setVisibility(0);
        textView.setBackgroundColor(-16777216);
        AvatarUtils.loadAvatarIntoView((Avatar)participant.getAvatar(), (ImageView)this.avatar, (AppConfig)appConfig);
        activeStatePresenter.presentStateDot(bl, this.activeStateView, appConfig);
    }

    public void setUpPostToolbar(Participant participant, boolean bl, ActiveStatePresenter activeStatePresenter, AppConfig appConfig) {
        this.setBackgroundColor(0);
        this.subtitle.setTextColor(-1);
        this.title.setTextColor(-1);
        this.close.setColorFilter(-1);
        this.backButton.setVisibility(8);
        this.avatar.setVisibility(0);
        this.activeStateView.setVisibility(0);
        this.title.setTextSize(14.0f);
        this.findViewById(R.id.intercom_toolbar_divider).setVisibility(0);
        AvatarUtils.loadAvatarIntoView((Avatar)participant.getAvatar(), (ImageView)this.avatar, (AppConfig)appConfig);
        activeStatePresenter.presentStateDot(bl, this.activeStateView, appConfig);
    }

    public void updateToolbarColors(AppConfig appConfig) {
        boolean bl = appConfig.isSecondaryColorRenderDarkText();
        ColorUtils.setTextColorWhiteOrBlack((TextView)this.title, (boolean)bl);
        ColorUtils.setTextColorWhiteOrBlack((TextView)this.subtitle, (boolean)bl);
        ColorUtils.setImageColorWhiteOrBlack((ImageView)this.close, (boolean)bl);
        ColorUtils.setImageColorWhiteOrBlack((ImageView)this.backButton, (boolean)bl);
    }

    public void updateToolbarSize() {
        int n4 = WindowUtils.getStatusBarHeight((Resources)this.getResources());
        int n5 = this.getResources().getDimensionPixelSize(R.dimen.intercom_toolbar_height);
        View view = this.findViewById(R.id.toolbar_content_container);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin + n4, layoutParams.rightMargin, layoutParams.bottomMargin);
        view.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        this.getLayoutParams().height = n5 + n4;
        this.requestLayout();
    }
}


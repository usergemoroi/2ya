/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.graphics.ColorFilter
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Vibrator
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.OvershootInterpolator
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  coil.request.i
 *  coil.request.i$a
 *  coil.target.d
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk.conversation;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import coil.request.i;
import coil.target.d;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.conversation.ReactionListener;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.models.Reaction;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ReactionInputView
extends LinearLayout {
    private static final float REACTION_SCALE = 2.5f;
    private static final int VIBRATION_DURATION_MS = 10;
    private final ColorFilter deselectedFilter;
    Integer highlightedViewIndex = null;
    private ReactionListener listener;
    private ReactionReply reactionReply;
    private final List<ImageView> reactionViews;
    int reactionsLoaded = 0;
    private final View.OnTouchListener touchListener;
    private final Twig twig = LumberMill.getLogger();
    private final Vibrator vibrator;

    public ReactionInputView(Context context) {
        this(context, null, 0);
    }

    public ReactionInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReactionInputView(Context context, AttributeSet attributeSet, int n10) {
        super(context, attributeSet, n10);
        this.touchListener = new View.OnTouchListener(this){
            final ReactionInputView this$0;
            private final Rect touchRect;
            {
                this.this$0 = reactionInputView;
                this.touchRect = new Rect();
            }

            private void handleTouchMove(MotionEvent object) {
                this.this$0.getHitRect(this.touchRect);
                if (this.touchRect.contains((int)object.getX(), (int)object.getY())) {
                    for (int i14 = 0; i14 < this.this$0.getChildCount(); ++i14) {
                        this.this$0.getChildAt(i14).getHitRect(this.touchRect);
                        if (!this.touchRect.contains((int)object.getX(), (int)object.getY())) continue;
                        Object object2 = this.this$0.highlightedViewIndex;
                        if (object2 == null || (Integer)object2 != i14) {
                            this.this$0.vibrateForSelection();
                            this.this$0.selectViewAtIndex(2.5f, i14);
                        }
                        ReactionInputView reactionInputView = this.this$0;
                        object2 = reactionInputView.highlightedViewIndex;
                        if (object2 == null) {
                            object2 = reactionInputView.getCurrentSelectedIndex();
                            if (object2 != null && (Integer)object2 != i14) {
                                this.this$0.deselectViewAtIndex((Integer)object2);
                            }
                        } else if ((Integer)object2 != i14) {
                            object2 = this.this$0;
                            ((ReactionInputView)((Object)object2)).deselectViewAtIndex(((ReactionInputView)((Object)object2)).highlightedViewIndex);
                        }
                        this.this$0.highlightedViewIndex = i14;
                    }
                } else {
                    object = this.this$0;
                    if (((ReactionInputView)((Object)object)).highlightedViewIndex != null) {
                        ((ReactionInputView)((Object)object)).highlightSelectedReaction();
                    }
                    this.this$0.highlightedViewIndex = null;
                }
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                block2: {
                    block0: {
                        block1: {
                            int n10 = motionEvent.getActionMasked();
                            if (n10 == 0) break block0;
                            if (n10 == 1) break block1;
                            if (n10 == 2) break block0;
                            break block2;
                        }
                        this.this$0.handleTouchUp();
                        break block2;
                    }
                    this.handleTouchMove(motionEvent);
                }
                return true;
            }
        };
        this.reactionViews = new ArrayList<ImageView>();
        this.setVisibility(8);
        this.vibrator = this.isInEditMode() ? null : (Vibrator)context.getSystemService("vibrator");
        this.deselectedFilter = ColorUtils.newGreyscaleFilter();
    }

    private void resetView() {
        this.removeAllViews();
        this.reactionViews.clear();
    }

    void deselectViewAtIndex(int n10) {
        ImageView imageView = this.reactionViews.get(n10);
        imageView.animate().setInterpolator((TimeInterpolator)new OvershootInterpolator(0.6f)).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
        imageView.setColorFilter(this.deselectedFilter);
    }

    Integer getCurrentSelectedIndex() {
        for (int i14 = 0; i14 < this.getChildCount(); ++i14) {
            Integer n10 = this.reactionReply.getReactionIndex();
            Reaction reaction = this.reactionReply.getReactionSet().get(i14);
            if (n10 != null && !n10.equals(reaction.getIndex())) {
                continue;
            }
            return i14;
        }
        return null;
    }

    void handleTouchUp() {
        Object object = this.highlightedViewIndex;
        if (object != null && (Integer)object >= 0 && this.highlightedViewIndex < this.reactionReply.getReactionSet().size() && (object = this.reactionReply.getReactionSet().get(this.highlightedViewIndex)) != null && (this.reactionReply.getReactionIndex() == null || ((Reaction)object).getIndex() != this.reactionReply.getReactionIndex().intValue())) {
            this.reactionReply.setReactionIndex(((Reaction)object).getIndex());
            ReactionListener reactionListener = this.listener;
            if (reactionListener != null) {
                reactionListener.onReactionSelected((Reaction)object);
            }
        }
        this.highlightSelectedReaction();
        this.highlightedViewIndex = null;
    }

    void highlightSelectedReaction() {
        for (int i14 = 0; i14 < this.getChildCount(); ++i14) {
            Integer n10 = this.reactionReply.getReactionIndex();
            Reaction reaction = this.reactionReply.getReactionSet().get(i14);
            if (n10 != null && !n10.equals(reaction.getIndex())) {
                this.deselectViewAtIndex(i14);
                continue;
            }
            this.selectViewAtIndex(1.0f, i14);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.setOnTouchListener(this.touchListener);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setOnTouchListener(null);
    }

    public void preloadReactionImages(ReactionReply object) {
        for (Reaction reaction : ((ReactionReply)object).getReactionSet()) {
            reaction = new i.a(this.getContext()).d((Object)reaction.getImageUrl()).a();
            IntercomCoilKt.loadIntercomImage(this.getContext(), (i)reaction);
        }
    }

    void selectViewAtIndex(float f11, int n10) {
        ImageView imageView = this.reactionViews.get(n10);
        imageView.animate().setInterpolator((TimeInterpolator)new OvershootInterpolator(2.0f)).scaleX(f11).scaleY(f11).setDuration(200L).start();
        imageView.clearColorFilter();
    }

    public void setUpReactions(ReactionReply reactionReply, boolean bl2, ReactionListener object) {
        Context context = this.getContext();
        this.reactionReply = reactionReply;
        this.listener = object;
        this.resetView();
        List<Reaction> list = reactionReply.getReactionSet();
        int n10 = list.size();
        for (int i14 = 0; i14 < list.size(); ++i14) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(0, -1, 1.0f));
            Object object2 = new ImageView(context);
            int n13 = this.getResources().getDimensionPixelSize(R.dimen.intercom_reaction_size);
            object2.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(n13, n13, 17));
            object2.setPivotY((float)this.getResources().getDimensionPixelSize(R.dimen.intercom_reaction_offset));
            object2.setPivotX((float)(n13 / 2));
            this.reactionViews.add((ImageView)object2);
            frameLayout.addView((View)object2);
            object = list.get(i14);
            IntercomCoilKt.loadIntercomImage(context, new i.a(context).C(new d(){
                final ReactionInputView this$0;
                final boolean val$animated;
                final Context val$context;
                final int val$reactionCount;
                final ImageView val$reactionImageView;
                {
                    this.this$0 = reactionInputView;
                    this.val$reactionImageView = imageView;
                    this.val$reactionCount = n10;
                    this.val$animated = bl2;
                    this.val$context = context;
                }

                public void onError(@Nullable Drawable drawable2) {
                }

                public void onStart(@Nullable Drawable drawable2) {
                }

                public void onSuccess(@NotNull Drawable object) {
                    int n10;
                    this.val$reactionImageView.setImageDrawable(object);
                    object = this.this$0;
                    object.reactionsLoaded = n10 = object.reactionsLoaded + 1;
                    if (n10 == this.val$reactionCount) {
                        if (this.val$animated) {
                            object.setVisibility(0);
                            object = this.this$0;
                            object.setY((float)(object.getHeight() + ScreenUtils.dpToPx(60.0f, this.val$context)));
                            this.this$0.animate().setInterpolator((TimeInterpolator)new OvershootInterpolator(0.6f)).translationY(0.0f).setDuration(300L).start();
                        } else {
                            object.setVisibility(0);
                        }
                    }
                }
            }).d((Object)((Reaction)object).getImageUrl()).a());
            object2 = reactionReply.getReactionIndex();
            if (object2 != null && !((Integer)object2).equals(((Reaction)object).getIndex())) {
                this.deselectViewAtIndex(i14);
            }
            this.addView((View)frameLayout);
        }
    }

    @SuppressLint(value={"MissingPermission"})
    void vibrateForSelection() {
        if (DeviceUtils.hasPermission(this.getContext(), "android.permission.VIBRATE")) {
            this.vibrator.vibrate(10L);
        }
    }
}


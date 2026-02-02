/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ArgbEvaluator
 *  android.animation.TypeEvaluator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.transition.Transition
 *  android.transition.Transition$TransitionListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  androidx.annotation.Nullable
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.core.content.ContextCompat
 *  coil.request.i
 *  coil.request.i$a
 */
package io.intercom.android.sdk.lightbox;

import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Transition;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import coil.request.i;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.lightbox.LightBoxImageView;
import io.intercom.android.sdk.lightbox.LightBoxListener;
import io.intercom.android.sdk.utilities.IntercomCoilKt;

public class LightBoxActivity
extends AppCompatActivity
implements LightBoxListener {
    private static final int ANIMATION_TIME_MS = 300;
    private static final String EXTRA_ACTIVITY_FULLSCREEN = "extra_activity_fullscreen";
    private static final String EXTRA_IMAGE_URL = "extra_image_url";
    public static final String TRANSITION_KEY = "lightbox_image";
    private String imageUrl = "";
    ViewGroup rootView;

    private void fadeIn() {
        int n10 = ContextCompat.getColor((Context)this, (int)R.color.intercom_full_transparent_full_black);
        int n13 = ContextCompat.getColor((Context)this, (int)R.color.intercom_transparent_black_lightbox);
        ValueAnimator valueAnimator = ValueAnimator.ofObject((TypeEvaluator)new ArgbEvaluator(), (Object[])new Object[]{n10, n13});
        valueAnimator.setDuration(300L);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this){
            final LightBoxActivity this$0;
            {
                this.this$0 = lightBoxActivity;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.rootView.setBackgroundColor(((Integer)valueAnimator.getAnimatedValue()).intValue());
            }
        });
        valueAnimator.start();
    }

    private void fadeOut() {
        int n10 = ContextCompat.getColor((Context)this, (int)R.color.intercom_transparent_black_lightbox);
        int n13 = ContextCompat.getColor((Context)this, (int)R.color.intercom_full_transparent_full_black);
        ValueAnimator valueAnimator = ValueAnimator.ofObject((TypeEvaluator)new ArgbEvaluator(), (Object[])new Object[]{n10, n13});
        valueAnimator.setDuration(300L);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this){
            final LightBoxActivity this$0;
            {
                this.this$0 = lightBoxActivity;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.rootView.setBackgroundColor(((Integer)valueAnimator.getAnimatedValue()).intValue());
            }
        });
        valueAnimator.start();
    }

    public static Intent imageIntent(Context context, String string2, boolean bl2) {
        return new Intent(context, LightBoxActivity.class).putExtra(EXTRA_IMAGE_URL, string2).putExtra(EXTRA_ACTIVITY_FULLSCREEN, bl2);
    }

    private void loadImage(ImageView imageView) {
        i i14 = new i.a(imageView.getContext()).d((Object)this.imageUrl).c(true).h(R.drawable.intercom_image_load_failed).B(imageView).a();
        IntercomCoilKt.loadIntercomImage(imageView.getContext(), i14);
    }

    private void reloadAfterTransition(LightBoxImageView lightBoxImageView) {
        this.getWindow().getSharedElementEnterTransition().addListener(new Transition.TransitionListener(){
            final LightBoxActivity this$0;
            final LightBoxImageView val$fullImage;
            {
                this.this$0 = lightBoxActivity;
                this.val$fullImage = lightBoxImageView;
            }

            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
                new Handler().postDelayed(new Runnable(this){
                    final 1 this$1;
                    {
                        this.this$1 = var1_1;
                    }

                    @Override
                    public void run() {
                        1 var1_1 = this.this$1;
                        var1_1.this$0.loadImage((ImageView)var1_1.val$fullImage);
                    }
                }, 10L);
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition transition) {
            }
        });
    }

    @Override
    public void closeLightBox() {
        this.fadeOut();
        this.supportFinishAfterTransition();
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.closeLightBox();
    }

    protected void onCreate(@Nullable Bundle object) {
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null) {
            this.imageUrl = bundle.getString(EXTRA_IMAGE_URL, "");
            if (bundle.getBoolean(EXTRA_ACTIVITY_FULLSCREEN, false)) {
                this.requestWindowFeature(1);
                this.getWindow().setFlags(1024, 1024);
            }
        }
        super.onCreate((Bundle)object);
        this.setContentView(R.layout.intercom_activity_lightbox);
        this.rootView = (ViewGroup)this.findViewById(R.id.root_view);
        object = (LightBoxImageView)this.findViewById(R.id.full_image);
        object.setTransitionName(TRANSITION_KEY);
        this.loadImage((ImageView)object);
        this.reloadAfterTransition((LightBoxImageView)((Object)object));
        ((LightBoxImageView)((Object)object)).setLightBoxListener(this);
        this.fadeIn();
    }
}


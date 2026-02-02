/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.graphics.drawable.GradientDrawable$Orientation
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.annotation.ColorInt
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.core.graphics.ColorUtils
 *  androidx.fragment.app.Fragment
 */
package io.intercom.android.sdk.carousel;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.CarouselImageClickListener;
import io.intercom.android.sdk.blocks.ContentLayoutManager;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.ViewHolderGenerator;
import io.intercom.android.sdk.carousel.ActionOnClickListener;
import io.intercom.android.sdk.carousel.CarouselListener;
import io.intercom.android.sdk.carousel.PermissionManager;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.carousel.CarouselScreen;
import io.intercom.android.sdk.models.carousel.ScreenAction;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import java.util.Iterator;

public class CarouselScreenFragment
extends Fragment {
    public static final int CAROUSEL_ANIMATION_DELAY_MS = 300;
    public static final int CAROUSEL_ANIMATION_MS = 400;
    private static final String KEY_CAROUSEL_SCREEN = "carousel_screen";
    private LinearLayout actionLayout;
    private CarouselScreen carouselScreen = CarouselScreen.NULL;
    private CarouselListener listener;
    private PermissionManager permissionManager;
    private boolean tickShouldAnimate = true;

    private void animateTickIcon(ImageView imageView) {
        imageView.clearAnimation();
        imageView.setAlpha(0.0f);
        imageView.setScaleX(0.0f);
        imageView.setScaleY(0.0f);
        imageView.setRotation(-360.0f);
        imageView.animate().alpha(1.0f).rotationBy(360.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(300L).setDuration(400L).start();
        this.tickShouldAnimate = false;
    }

    private void applyBottomGradient(View view, ContentAwareScrollView contentAwareScrollView, @ColorInt int n10) {
        int n13 = ColorUtils.setAlphaComponent((int)n10, (int)0);
        view.setBackground((Drawable)new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{n10, n13}));
        contentAwareScrollView.setListener(new ContentAwareScrollView.Listener(){
            final CarouselScreenFragment this$0;
            final ContentAwareScrollView val$contentAwareScrollView;
            final View val$gradientView;
            {
                this.this$0 = carouselScreenFragment;
                this.val$gradientView = view;
                this.val$contentAwareScrollView = contentAwareScrollView;
            }

            @Override
            public void onBottomReached() {
                this.val$gradientView.setVisibility(8);
            }

            @Override
            public void onScrollChanged(int n10) {
                if (!this.val$contentAwareScrollView.isAtBottom()) {
                    this.val$gradientView.setVisibility(0);
                }
            }
        });
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(){
            final CarouselScreenFragment this$0;
            final ContentAwareScrollView val$contentAwareScrollView;
            final View val$gradientView;
            {
                this.this$0 = carouselScreenFragment;
                this.val$contentAwareScrollView = contentAwareScrollView;
                this.val$gradientView = view;
            }

            public void onGlobalLayout() {
                if (this.val$contentAwareScrollView.isAtBottom()) {
                    this.val$gradientView.setVisibility(8);
                }
            }
        });
    }

    private FrameLayout buttonWithTickIcon(TextView textView, @ColorInt int n10) {
        textView.setText((CharSequence)"");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.getContext());
        FrameLayout frameLayout = new FrameLayout(textView.getContext());
        frameLayout.setLayoutParams(textView.getLayoutParams());
        layoutInflater = (ImageView)layoutInflater.inflate(R.layout.intercom_carousel_action_button_tick, (ViewGroup)frameLayout, false);
        layoutInflater.getDrawable().setColorFilter(n10, PorterDuff.Mode.SRC_IN);
        frameLayout.addView((View)textView);
        frameLayout.addView((View)layoutInflater);
        if (this.tickShouldAnimate) {
            this.animateTickIcon((ImageView)layoutInflater);
        }
        return frameLayout;
    }

    private TextView createButton(ScreenAction screenAction) {
        TextView textView = (TextView)LayoutInflater.from((Context)this.getContext()).inflate(R.layout.intercom_carousel_action_button, (ViewGroup)this.actionLayout, false);
        FontUtils.setRobotoMediumTypeface(textView);
        textView.setText((CharSequence)screenAction.getTitle());
        textView.getBackground().setColorFilter(Color.parseColor((String)screenAction.getBackgroundColor()), PorterDuff.Mode.SRC_IN);
        textView.setTextColor(Color.parseColor((String)screenAction.getTextColor()));
        textView.setOnClickListener((View.OnClickListener)new ActionOnClickListener(screenAction, this.listener));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(screenAction.getTitle());
        stringBuilder.append(", button");
        textView.setContentDescription((CharSequence)stringBuilder.toString());
        return textView;
    }

    private void displayScreenActions() {
        this.actionLayout.removeAllViews();
        Object object = this.carouselScreen.getActions();
        ScreenAction screenAction = this.carouselScreen.getPermissionAction();
        Iterator<ScreenAction> iterator = object.iterator();
        while (iterator.hasNext()) {
            PermissionManager permissionManager;
            object = iterator.next();
            TextView textView = this.createButton((ScreenAction)object);
            if (!ScreenAction.NULL.equals(screenAction) && (permissionManager = this.permissionManager).permissionsGranted(screenAction.getValidPermissions(permissionManager))) {
                if ("skip".equals(((ScreenAction)object).getType())) {
                    this.actionLayout.addView((View)this.buttonWithTickIcon(textView, Color.parseColor((String)((ScreenAction)object).getTextColor())));
                    continue;
                }
                ((ScreenAction)object).isPermissionAction();
                continue;
            }
            this.actionLayout.addView((View)textView);
        }
    }

    public static CarouselScreenFragment newInstance(CarouselScreen carouselScreen) {
        CarouselScreenFragment carouselScreenFragment = new CarouselScreenFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY_CAROUSEL_SCREEN, (Parcelable)carouselScreen);
        carouselScreenFragment.setArguments(bundle);
        return carouselScreenFragment;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.listener = (CarouselListener)context;
            return;
        }
        catch (ClassCastException classCastException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(context);
            stringBuilder.append(" must implement CarouselListener");
            throw new ClassCastException(stringBuilder.toString());
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup object, @Nullable Bundle object2) {
        object2 = this.getArguments();
        if (object2 != null) {
            this.carouselScreen = (CarouselScreen)object2.getParcelable(KEY_CAROUSEL_SCREEN);
        }
        Injector injector2 = Injector.get();
        object2 = injector2.getApi();
        LinearLayout linearLayout = injector2.getAppConfigProvider();
        object2 = new ViewHolderGenerator(new UploadingImageCache(), (Api)object2, (Provider<AppConfig>)linearLayout, "", new CarouselImageClickListener((Api)object2), null, injector2.getGson(), injector2.getMetricTracker());
        object2 = new ContentLayoutManager(this.getContext(), ((ViewHolderGenerator)object2).getCarouselHolder());
        this.permissionManager = new PermissionManager((Activity)this.getActivity());
        layoutInflater = layoutInflater.inflate(R.layout.intercom_fragment_carousel_screen, object, false);
        linearLayout = (LinearLayout)layoutInflater.findViewById(R.id.intercom_carousel_fragment_root);
        this.actionLayout = (LinearLayout)layoutInflater.findViewById(R.id.intercom_carousel_action_layout);
        injector2 = (FrameLayout)layoutInflater.findViewById(R.id.intercom_carousel_content_container);
        View view = layoutInflater.findViewById(R.id.intercom_carousel_gradient);
        object = (ContentAwareScrollView)layoutInflater.findViewById(R.id.intercom_carousel_scroll_view);
        int n10 = Color.parseColor((String)this.carouselScreen.getBackgroundColor());
        this.applyBottomGradient(view, (ContentAwareScrollView)((Object)object), n10);
        linearLayout.setBackgroundColor(n10);
        this.displayScreenActions();
        ((ContentLayoutManager)object2).renderCarouselScreen(this.carouselScreen, (FrameLayout)injector2);
        return layoutInflater;
    }

    public void onResume() {
        super.onResume();
        this.displayScreenActions();
    }
}


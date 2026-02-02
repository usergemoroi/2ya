/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.annotation.ColorRes
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  androidx.annotation.StringRes
 *  androidx.annotation.VisibleForTesting
 *  androidx.appcompat.app.AlertDialog$Builder
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  androidx.core.content.ContextCompat
 *  androidx.viewpager.widget.PagerAdapter
 *  androidx.viewpager.widget.ViewPager
 *  androidx.viewpager.widget.ViewPager$OnPageChangeListener
 *  com.facebook.shimmer.ShimmerFrameLayout
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk.activities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.IntercomBaseActivity;
import io.intercom.android.sdk.activities.a;
import io.intercom.android.sdk.carousel.CarouselListener;
import io.intercom.android.sdk.carousel.CarouselPresenter;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.carousel.CarouselScreenPagerAdapter;
import io.intercom.android.sdk.carousel.CarouselView;
import io.intercom.android.sdk.carousel.PermissionManager;
import io.intercom.android.sdk.carousel.permission.PermissionRequest;
import io.intercom.android.sdk.carousel.permission.PermissionRequestFactory;
import io.intercom.android.sdk.carousel.permission.PermissionResultListener;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.models.carousel.CarouselScreen;
import io.intercom.android.sdk.models.carousel.ScreenAction;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.android.sdk.utilities.LinkOpener;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.IntercomShimmerLayout;
import java.util.ArrayList;
import java.util.List;

public class IntercomCarouselActivity
extends IntercomBaseActivity
implements ViewPager.OnPageChangeListener,
View.OnClickListener,
CarouselListener,
PermissionResultListener,
CarouselView {
    private static final String PARCEL_CAROUSEL_ID = "parcel_carousel_id";
    private static final int PERMISSION_REQUEST_CODE = 12306;
    @VisibleForTesting
    CarouselScreenPagerAdapter adapter;
    @VisibleForTesting
    Provider<AppConfig> appConfigProvider;
    @VisibleForTesting
    CarouselPresenter carouselPresenter;
    private View closeBackground;
    private ImageButton closeButton;
    private ConstraintLayout closeButtonContainer;
    @VisibleForTesting
    ScreenAction currentPermissionAction;
    @VisibleForTesting
    String currentScreenId = "";
    @VisibleForTesting
    boolean isLastScreenViewed = false;
    @VisibleForTesting
    MetricTracker metricTracker;
    @VisibleForTesting
    LinearLayout navigationDotsLayout;
    @VisibleForTesting
    int numberOfScreensSeen = 0;
    @VisibleForTesting
    PermissionManager permissionManager;
    @VisibleForTesting
    PermissionRequest permissionRequest;
    @VisibleForTesting
    boolean sentToSettings = false;
    private FrameLayout stateContainer;
    private final Twig twig = LumberMill.getLogger();
    @VisibleForTesting
    ViewPager viewPager;

    public IntercomCarouselActivity() {
        this.currentPermissionAction = ScreenAction.NULL;
    }

    private FrameLayout.LayoutParams buildContentLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int n10 = this.getResources().getDimensionPixelSize(R.dimen.intercom_carousel_padding);
        layoutParams.setMarginStart(n10);
        layoutParams.setMarginEnd(n10);
        return layoutParams;
    }

    private View buildErrorMessage(@StringRes int n10) {
        TextView textView = new TextView((Context)this);
        textView.setLayoutParams((ViewGroup.LayoutParams)this.buildContentLayoutParams());
        BlockUtils.setMarginBottom((View)textView, 16);
        this.styleErrorMessage(textView);
        textView.setText(n10);
        return textView;
    }

    public static Intent buildIntent(Context context, String string2) {
        context = new Intent(context, IntercomCarouselActivity.class);
        context.putExtra(PARCEL_CAROUSEL_ID, string2);
        context.setFlags(0x10000000);
        return context;
    }

    private ShimmerFrameLayout buildLoadingContainer() {
        IntercomShimmerLayout intercomShimmerLayout = new IntercomShimmerLayout((Context)this);
        intercomShimmerLayout.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
        intercomShimmerLayout.setClickable(true);
        intercomShimmerLayout.setFocusable(true);
        return intercomShimmerLayout;
    }

    private View buildLoadingContent() {
        ImageView imageView = new ImageView((Context)this);
        imageView.setLayoutParams((ViewGroup.LayoutParams)this.buildContentLayoutParams());
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setBackgroundResource(R.drawable.intercom_content_loading);
        return imageView;
    }

    private View buildLoadingState() {
        ShimmerFrameLayout shimmerFrameLayout = this.buildLoadingContainer();
        shimmerFrameLayout.addView(this.buildLoadingContent());
        return shimmerFrameLayout;
    }

    private View buildRetryButton() {
        TextView textView = (TextView)LayoutInflater.from((Context)this).inflate(R.layout.intercom_carousel_action_button, (ViewGroup)this.stateContainer, false);
        FontUtils.setRobotoMediumTypeface(textView);
        textView.setText(R.string.intercom_retry);
        BackgroundUtils.setButtonColor(textView, this.appConfigProvider.get().getPrimaryColor());
        textView.setLayoutParams((ViewGroup.LayoutParams)this.buildRetryButtonLayoutParams());
        textView.setOnClickListener((View.OnClickListener)new a(this));
        return textView;
    }

    private FrameLayout.LayoutParams buildRetryButtonLayoutParams() {
        FrameLayout.LayoutParams layoutParams = this.buildContentLayoutParams();
        layoutParams.height = this.getResources().getDimensionPixelSize(R.dimen.intercom_office_hours_height);
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, this.getResources().getDimensionPixelSize(R.dimen.intercom_carousel_action_button_bottom_padding));
        layoutParams.gravity = 80;
        return layoutParams;
    }

    public static /* synthetic */ void k(IntercomCarouselActivity intercomCarouselActivity, View view) {
        intercomCarouselActivity.lambda$buildRetryButton$0(view);
    }

    private /* synthetic */ void lambda$buildRetryButton$0(View view) {
        this.carouselPresenter.retryFetch(this.getIntent().getStringExtra(PARCEL_CAROUSEL_ID));
    }

    private void setCloseButtonColor(@ColorRes int n10) {
        n10 = ContextCompat.getColor((Context)this, (int)n10);
        this.closeBackground.getBackground().setTint(n10);
        this.closeButton.getDrawable().setTint(n10);
    }

    private void setupViewPagerWithScreens(List<CarouselScreen> object) {
        ArrayList<CarouselScreenFragment> arrayList = new ArrayList<CarouselScreenFragment>(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(CarouselScreenFragment.newInstance((CarouselScreen)object.next()));
        }
        object = new CarouselScreenPagerAdapter(this.getSupportFragmentManager(), arrayList);
        this.adapter = object;
        this.viewPager.setAdapter((PagerAdapter)object);
        this.viewPager.addOnPageChangeListener((ViewPager.OnPageChangeListener)this);
        this.onPageSelected(0);
    }

    private void showRationaleDialog(@StringRes int n10, @StringRes int n13, @NonNull DialogInterface.OnClickListener onClickListener) {
        onClickListener = new AlertDialog.Builder((Context)this).setTitle(n10).setMessage(n13).setPositiveButton(R.string.intercom_app_settings, onClickListener).setNegativeButton(R.string.intercom_not_now, new DialogInterface.OnClickListener(this){
            final IntercomCarouselActivity this$0;
            {
                this.this$0 = intercomCarouselActivity;
            }

            public void onClick(DialogInterface dialogInterface, int n10) {
                this.this$0.skipPermissionScreen();
            }
        }).setCancelable(false).show();
        n10 = ColorUtils.primaryOrDarkColor((Context)this, this.appConfigProvider.get());
        onClickListener.getButton(-2).setTextColor(n10);
        onClickListener.getButton(-1).setTextColor(n10);
    }

    private void showState(View view) {
        this.setCloseButtonColor(R.color.intercom_carousel_grey);
        this.stateContainer.removeAllViews();
        this.stateContainer.addView(view);
        this.stateContainer.setVisibility(0);
    }

    @SuppressLint(value={"WrongConstant"})
    private void styleErrorMessage(TextView textView) {
        textView.setBreakStrategy(0);
        textView.setTextColor(ContextCompat.getColor((Context)this, (int)R.color.intercom_black));
        textView.setTextSize(34.0f);
        textView.setTypeface(null, 1);
        textView.setLineSpacing((float)ScreenUtils.dpToPx(6.0f, textView.getContext()), 1.0f);
        textView.setGravity(1);
    }

    private void updateCloseButtonColor(boolean bl2) {
        int n10 = bl2 ? R.color.intercom_carousel_grey : R.color.intercom_white;
        this.setCloseButtonColor(n10);
    }

    @VisibleForTesting
    void closeCarouselAndResetPersistedData() {
        this.carouselPresenter.resetPersistedCarousel();
        this.finish();
    }

    @Override
    public void dismissCarousel(String string2) {
        if (!Carousel.NULL.equals(this.carouselPresenter.getCarousel())) {
            this.carouselPresenter.recordDismissedOrCompletedStats(this.isLastScreenViewed);
            this.carouselPresenter.recordDismissedOrCompletedMetric(string2, this.isLastScreenViewed, this.numberOfScreensSeen);
        }
        this.closeCarouselAndResetPersistedData();
    }

    @VisibleForTesting
    void goToSettings() {
        this.sentToSettings = true;
        this.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts((String)"package", (String)this.getPackageName(), null)));
    }

    @Override
    public void logEmptyCarouselError() {
        this.twig.e("Could not open carousel without id", new Object[0]);
    }

    @Override
    public void logUserNotRegisteredError() {
        this.twig.e("The app config has not been retrieved, please call registerUnidentifiedUser() or registerIdentifiedUser(Registration) before calling displayCarousel(carouselId).", new Object[0]);
    }

    public void onBackPressed() {
        if (this.carouselPresenter.getCarousel().isDismissible()) {
            this.dismissCarousel("from_android_back_button");
        }
    }

    public void onClick(View view) {
        this.dismissCarousel("from_close_button");
    }

    @Override
    protected void onCreate(@Nullable Bundle object) {
        super.onCreate((Bundle)object);
        this.setContentView(R.layout.intercom_activity_carousel);
        this.viewPager = (ViewPager)this.findViewById(R.id.intercom_view_pager);
        this.closeBackground = this.findViewById(R.id.intercom_close_background);
        this.closeButton = (ImageButton)this.findViewById(R.id.intercom_close);
        this.closeButtonContainer = (ConstraintLayout)this.findViewById(R.id.intercom_carousel_close_container);
        this.navigationDotsLayout = (LinearLayout)this.findViewById(R.id.intercom_page_navigation_layout);
        object = (FrameLayout)this.findViewById(R.id.intercom_state_container);
        this.stateContainer = object;
        object.setVisibility(8);
        this.closeButton.setOnClickListener((View.OnClickListener)this);
        this.closeButtonContainer.setOnClickListener((View.OnClickListener)this);
        object = Injector.get();
        this.appConfigProvider = ((Injector)object).getAppConfigProvider();
        Object object2 = new PermissionManager((Activity)this);
        this.permissionManager = object2;
        this.permissionRequest = object2 = PermissionRequestFactory.create((PermissionManager)object2);
        object2.attach(this);
        this.metricTracker = ((Injector)object).getMetricTracker();
        this.carouselPresenter = object = new CarouselPresenter(((Injector)object).getStore(), ((Injector)object).getApi(), ((Injector)object).getUserIdentity(), this.metricTracker, this.permissionManager, ((Injector)object).getDataLayer());
        ((CarouselPresenter)object).attachView(this);
        this.carouselPresenter.fetchCarousel(this.getIntent().getStringExtra(PARCEL_CAROUSEL_ID));
    }

    @Override
    protected void onDestroy() {
        this.permissionRequest.detach();
        super.onDestroy();
    }

    public void onPageScrollStateChanged(int n10) {
    }

    public void onPageScrolled(int n10, float f11, int n13) {
    }

    public void onPageSelected(int n10) {
        List<CarouselScreen> list = this.carouselPresenter.getCarousel().getScreens();
        int n13 = list.size();
        if (n13 > n10) {
            list = list.get(n10);
            this.currentPermissionAction = ((CarouselScreen)((Object)list)).getPermissionAction();
            this.currentScreenId = ((CarouselScreen)((Object)list)).getId();
            boolean bl2 = ColorUtils.isColorLight(((CarouselScreen)((Object)list)).getBackgroundColor());
            this.renderNavigationDots(this.adapter.getCount(), bl2, n10);
            this.updateCloseButtonColor(bl2);
            if (n10 >= this.numberOfScreensSeen) {
                this.carouselPresenter.recordScreenSeenStats(((CarouselScreen)((Object)list)).getId());
                this.numberOfScreensSeen = n10 + 1;
            }
            if (n10 + 1 == n13) {
                this.isLastScreenViewed = true;
            }
        }
    }

    public void onRequestPermissionsResult(int n10, @NonNull String[] stringArray, @NonNull int[] nArray) {
        super.onRequestPermissionsResult(n10, stringArray, nArray);
        if (n10 == 12306) {
            this.carouselPresenter.recordPermissionRequestedMetric(this.currentPermissionAction.getType(), nArray, this.currentScreenId);
            this.permissionRequest.handleResult(stringArray, nArray);
        }
    }

    protected void onResume() {
        super.onResume();
        if (this.sentToSettings) {
            this.sentToSettings = false;
            this.carouselPresenter.recordSentToPermissionSettingsMetric(this.currentPermissionAction, this.currentScreenId);
        }
    }

    @Override
    public void openLink(String string2) {
        this.dismissCarousel("from_cta");
        LinkOpener.handleUrl(string2, (Context)this, Injector.get().getApi());
    }

    @VisibleForTesting
    void renderNavigationDots(int n10, boolean bl2, int n13) {
        this.navigationDotsLayout.removeAllViews();
        int n14 = bl2 ? R.drawable.intercom_tab_dot_selector_dark : R.drawable.intercom_tab_dot_selector_light;
        for (int i14 = 0; i14 < n10; ++i14) {
            View view = new View((Context)this);
            int n15 = ScreenUtils.dpToPx(16.0f, (Context)this);
            view.setLayoutParams(new ViewGroup.LayoutParams(n15, n15));
            view.setBackgroundResource(n14);
            this.navigationDotsLayout.addView(view);
            if (i14 != n13) continue;
            view.setSelected(true);
        }
    }

    @Override
    @RequiresApi(api=30)
    public void requestBackgroundLocationPermission() {
        this.showRationaleDialog(R.string.intercom_access_background_location_title, R.string.intercom_access_background_location_message, new DialogInterface.OnClickListener(this){
            final IntercomCarouselActivity this$0;
            {
                this.this$0 = intercomCarouselActivity;
            }

            public void onClick(DialogInterface dialogInterface, int n10) {
                this.this$0.permissionManager.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 12306);
            }
        });
    }

    @Override
    public void requestPermissions(ScreenAction screenAction) {
        this.permissionRequest.request(screenAction, 12306);
    }

    @Override
    public void selectNextScreen(String string2) {
        int n10 = this.viewPager.getCurrentItem() + 1;
        if (n10 < this.adapter.getCount()) {
            this.viewPager.setCurrentItem(n10);
        } else {
            this.dismissCarousel(string2);
        }
    }

    @VisibleForTesting
    void selectNextScreenWithDelay() {
        new Handler().postDelayed(new Runnable(this){
            final IntercomCarouselActivity this$0;
            {
                this.this$0 = intercomCarouselActivity;
            }

            @Override
            public void run() {
                this.this$0.selectNextScreen("from_permission");
            }
        }, 1000L);
    }

    @Override
    public void showDeniedPermanently() {
        this.showGoToSettingsDialog();
    }

    @Override
    public void showDeniedTemporarily() {
        this.selectNextScreen("from_permission");
    }

    @Override
    public void showGenericError() {
        this.showState(this.buildErrorMessage(R.string.intercom_something_went_wrong_try_again));
        this.stateContainer.addView(this.buildRetryButton());
    }

    @VisibleForTesting
    void showGoToSettingsDialog() {
        this.showRationaleDialog(R.string.intercom_permission_denied, R.string.intercom_go_to_device_settings, new DialogInterface.OnClickListener(this){
            final IntercomCarouselActivity this$0;
            {
                this.this$0 = intercomCarouselActivity;
            }

            public void onClick(DialogInterface dialogInterface, int n10) {
                this.this$0.goToSettings();
            }
        });
    }

    @Override
    public void showGranted() {
        this.selectNextScreenWithDelay();
    }

    @Override
    public void showLoading() {
        this.showState(this.buildLoadingState());
    }

    @Override
    public void showNotFoundError() {
        this.showState(this.buildErrorMessage(R.string.intercom_page_not_found));
    }

    @VisibleForTesting
    void showOrHideNavigationDots(List<CarouselScreen> list) {
        LinearLayout linearLayout = this.navigationDotsLayout;
        int n10 = list.size() > 1 ? 0 : 8;
        linearLayout.setVisibility(n10);
    }

    @Override
    public void showSuccess(Carousel carousel) {
        Object object = this.stateContainer;
        int n10 = 8;
        object.setVisibility(8);
        object = carousel.getScreens();
        if (object.isEmpty()) {
            this.closeCarouselAndResetPersistedData();
        } else {
            this.carouselPresenter.recordOpenMetric();
        }
        ConstraintLayout constraintLayout = this.closeButtonContainer;
        if (carousel.isDismissible()) {
            n10 = 0;
        }
        constraintLayout.setVisibility(n10);
        this.showOrHideNavigationDots((List<CarouselScreen>)object);
        this.setupViewPagerWithScreens((List<CarouselScreen>)object);
    }

    @Override
    public void skipPermissionScreen() {
        this.metricTracker.skippedPermission(this.currentPermissionAction.getType(), this.carouselPresenter.getCarousel().getInstanceId(), this.carouselPresenter.getCarouselSource());
        this.selectNextScreen("from_permission_skipped");
    }

    @Override
    public void startChat() {
        this.dismissCarousel("from_cta");
        if (this.appConfigProvider.get().isInboundMessages()) {
            this.startActivity(ConversationScreenOpenerKt.getComposerIntent((Context)this, "", false, null, null, IntercomRootActivity.class));
        }
    }

    @Override
    public void trackActionButtonTappedStats() {
        this.carouselPresenter.recordActionButtonTappedStats(this.currentScreenId);
    }
}


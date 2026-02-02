/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.res.Resources$NotFoundException
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.graphics.drawable.ScaleDrawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.AccelerateInterpolator
 *  android.view.inputmethod.InputMethodManager
 *  android.webkit.ValueCallback
 *  android.webkit.WebChromeClient
 *  android.webkit.WebChromeClient$FileChooserParams
 *  android.webkit.WebView
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ProgressBar
 *  androidx.activity.result.ActivityResult
 *  androidx.activity.result.ActivityResultLauncher
 *  androidx.activity.result.contract.ActivityResultContract
 *  androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
 *  androidx.annotation.ColorInt
 *  androidx.appcompat.app.AlertDialog$Builder
 *  androidx.core.content.ContextCompat
 *  androidx.lifecycle.LifecycleOwner
 *  androidx.lifecycle.LifecycleOwnerKt
 *  io.intercom.android.sdk.views.IntercomToolbar
 */
package io.intercom.android.sdk.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.IntercomBaseActivity;
import io.intercom.android.sdk.activities.b;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.conversation.JavascriptRunner;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.imageloader.WallpaperLoader;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Sheet;
import io.intercom.android.sdk.sheets.SheetListener;
import io.intercom.android.sdk.sheets.SheetWebViewPresenter;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.views.IntercomErrorView;
import io.intercom.android.sdk.views.IntercomToolbar;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.q0;
import retrofit2.d;
import retrofit2.z;

public class IntercomSheetActivity
extends IntercomBaseActivity
implements IntercomToolbar.Listener,
SheetListener {
    private static final int ENTRANCE_ANIMATION_TIME_MS = 250;
    private static final int EXIT_ANIMATION_TIME_MS = 200;
    private static final String PARCEL_CARD_URI = "parcel_card_uri";
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    private static final String PARCEL_IS_HOME_SCREEN = "parcel_is_home_screen";
    private static final String PARCEL_PARAMS = "parcel_params";
    private static final String PARCEL_SHEET_URL = "parcel_sheet_url";
    private static final int WEBVIEW_FADE_IN_TIME_MS = 300;
    private Provider<AppConfig> appConfigProvider;
    private String cardUri;
    private View containerView;
    private String conversationId = "";
    private IntercomErrorView intercomErrorView;
    private IntercomToolbar intercomToolbar;
    private boolean isHomeScreen;
    private JavascriptRunner jsRunner;
    ProgressBar loadingBar;
    private MetricTracker metricTracker;
    private HashMap params = new HashMap();
    private ActivityResultLauncher<Intent> pickFile;
    private SheetWebViewPresenter presenter;
    @ColorInt
    private int secondaryColor;
    private String sheetUrl = "";
    public ValueCallback<Uri[]> valueCallback;
    private WallpaperLoader wallpaperLoader;
    WebView webView;

    private void animateWindowIn() {
        this.containerView.setVisibility(0);
        this.containerView.setY((float)this.findViewById(0x1020002).getMeasuredHeight());
        this.containerView.animate().y(0.0f).setInterpolator((TimeInterpolator)new AccelerateInterpolator()).setDuration(250L).start();
    }

    private void animateWindowOut() {
        this.containerView.animate().y((float)this.getWindow().getDecorView().getHeight()).setDuration(200L).setListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final IntercomSheetActivity this$0;
            {
                this.this$0 = intercomSheetActivity;
            }

            public void onAnimationEnd(Animator animator) {
                this.this$0.finish();
                this.this$0.overridePendingTransition(0, 0);
            }
        }).start();
    }

    public static Intent buildIntent(Context context, String string2, Map<String, Object> map2, String string3, String string4) {
        context = new Intent(context, IntercomSheetActivity.class);
        context.putExtra(PARCEL_SHEET_URL, string2);
        context.putExtra(PARCEL_PARAMS, new HashMap<String, Object>(map2));
        context.putExtra(PARCEL_CARD_URI, string3);
        context.putExtra(PARCEL_CONVERSATION_ID, string4);
        return context;
    }

    private void cardUpdated() {
        Injector.get().getDataLayer().emitEvent((q0)LifecycleOwnerKt.getLifecycleScope((LifecycleOwner)this), IntercomEvent.CardUpdated.INSTANCE);
    }

    private void hideKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            ((InputMethodManager)this.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private void insertWebView() {
        try {
            WebView webView;
            this.webView = webView = new WebView((Context)this);
        }
        catch (Resources.NotFoundException notFoundException) {
            this.webView = new WebView(this.getApplicationContext());
        }
        this.webView.setAlpha(0.0f);
        this.webView.setId(R.id.intercom_sheet_webview);
        this.webView.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
        ((FrameLayout)this.findViewById(R.id.sheet_view)).addView((View)this.webView, 0);
        this.webView.setWebChromeClient(new WebChromeClient(this){
            final IntercomSheetActivity this$0;
            {
                this.this$0 = intercomSheetActivity;
            }

            public void onProgressChanged(WebView webView, int n10) {
                this.this$0.loadingBar.setProgress(n10);
            }

            public boolean onShowFileChooser(WebView object, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                object = this.this$0;
                object.valueCallback = valueCallback;
                ((IntercomSheetActivity)object).pickFile.launch((Object)fileChooserParams.createIntent());
                return true;
            }
        });
    }

    public static /* synthetic */ void k(IntercomSheetActivity intercomSheetActivity, ActivityResult activityResult) {
        intercomSheetActivity.lambda$onCreate$0(activityResult);
    }

    private /* synthetic */ void lambda$onCreate$0(ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1 && activityResult.getData() != null) {
            this.valueCallback.onReceiveValue((Object)new Uri[]{activityResult.getData().getData()});
        } else {
            this.valueCallback.onReceiveValue(null);
        }
    }

    private void loadSheet(Api api) {
        this.loadingBar.setVisibility(0);
        this.intercomErrorView.setVisibility(8);
        api.fetchSheet(this.params, new d<Sheet.Builder>(this){
            final IntercomSheetActivity this$0;
            {
                this.this$0 = intercomSheetActivity;
            }

            @Override
            public void onFailure(retrofit2.b<Sheet.Builder> b11, Throwable throwable) {
                this.this$0.showErrorView();
            }

            @Override
            public void onResponse(retrofit2.b<Sheet.Builder> object, z<Sheet.Builder> z13) {
                if (z13.e() && z13.a() != null) {
                    this.this$0.intercomErrorView.setVisibility(8);
                    object = z13.a().build();
                    this.this$0.presenter.loadBundle(((Sheet)object).getBody());
                    this.this$0.metricTracker.viewedMessengerSheet(this.this$0.conversationId, this.this$0.sheetUrl, this.this$0.isHomeScreen);
                } else {
                    this.this$0.showErrorView();
                }
            }
        });
    }

    private void setUpToolbar(Provider<AppConfig> object) {
        IntercomToolbar intercomToolbar;
        AppConfig appConfig = object.get();
        this.intercomToolbar = intercomToolbar = (IntercomToolbar)this.findViewById(R.id.intercom_toolbar);
        intercomToolbar.updateToolbarColors(appConfig);
        this.intercomToolbar.setListener((IntercomToolbar.Listener)this);
        this.intercomToolbar.setSubtitleVisibility(8);
        this.intercomToolbar.setBackgroundColor(this.secondaryColor);
        this.intercomToolbar.setLeftNavigationItemVisibility(0);
        this.intercomToolbar.setCloseButtonVisibility(8);
        this.intercomToolbar.setLeftNavigationIcon(ContextCompat.getDrawable((Context)this, (int)R.drawable.intercom_close));
        this.intercomToolbar.updateToolbarSize();
        this.wallpaperLoader = object = WallpaperLoader.create((Context)this, object);
        this.intercomToolbar.loadWallpaper((WallpaperLoader)object);
        object = (ProgressBar)this.intercomToolbar.findViewById(R.id.toolbar_progress_bar);
        this.loadingBar = object;
        object.setProgressDrawable((Drawable)new LayerDrawable(new Drawable[]{new ColorDrawable(appConfig.getSecondaryColorDark()), new ScaleDrawable((Drawable)new ColorDrawable(-1), 0x800003, 1.0f, -1.0f)}));
    }

    private void showErrorView() {
        this.loadingBar.setVisibility(8);
        this.intercomErrorView.setVisibility(0);
    }

    private void showSubmitActionError(Map<String, Object> alertDialog) {
        alertDialog = new AlertDialog.Builder((Context)this).setTitle(R.string.intercom_couldnt_load_content).setMessage(R.string.intercom_give_it_another_try).setPositiveButton(R.string.intercom_reload, new DialogInterface.OnClickListener(){
            final IntercomSheetActivity this$0;
            final Map val$payload;
            {
                this.this$0 = intercomSheetActivity;
                this.val$payload = map2;
            }

            public void onClick(DialogInterface dialogInterface, int n10) {
                this.this$0.onSubmitSheetAction(this.val$payload);
            }
        }).create();
        alertDialog.show();
        alertDialog.getButton(-1).setTextColor(ColorUtils.primaryOrDarkColor((Context)this, this.appConfigProvider.get()));
    }

    void closeSheet() {
        this.metricTracker.closedMessengerSheet(this.conversationId, this.sheetUrl, this.isHomeScreen);
        this.hideKeyboard();
        this.animateWindowOut();
    }

    public void onBackPressed() {
        if (this.webView.canGoBack()) {
            this.webView.goBack();
        } else {
            this.closeSheet();
        }
    }

    @Override
    public void onCloseClicked() {
    }

    @Override
    public void onCloseSheetAction() {
        this.closeSheet();
    }

    @Override
    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = Injector.get();
        this.metricTracker = ((Injector)object).getMetricTracker();
        Object object2 = ((Injector)object).getAppConfigProvider();
        this.appConfigProvider = object2;
        this.secondaryColor = object2.get().getSecondaryColor();
        object2 = this.getIntent().getExtras();
        if (object2 != null) {
            this.sheetUrl = object2.getString(PARCEL_SHEET_URL, "");
            this.conversationId = object2.getString(PARCEL_CONVERSATION_ID, "");
            this.params = (HashMap)object2.getSerializable(PARCEL_PARAMS);
            this.cardUri = object2.getString(PARCEL_CARD_URI);
            this.isHomeScreen = object2.getBoolean(PARCEL_IS_HOME_SCREEN, false);
        }
        this.setContentView(R.layout.intercom_activity_sheet);
        this.setUpToolbar(this.appConfigProvider);
        this.containerView = this.findViewById(R.id.sheet_root);
        if (TextUtils.isEmpty((CharSequence)this.sheetUrl) || this.params == null) {
            this.closeSheet();
        }
        this.containerView.setVisibility(8);
        this.containerView.post(new Runnable(this){
            final IntercomSheetActivity this$0;
            {
                this.this$0 = intercomSheetActivity;
            }

            @Override
            public void run() {
                this.this$0.animateWindowIn();
            }
        });
        this.insertWebView();
        object2 = new JavascriptRunner(this.webView);
        this.jsRunner = object2;
        object2 = new SheetWebViewPresenter(this.webView, (JavascriptRunner)object2, this.sheetUrl, this, (Injector)object);
        this.presenter = object2;
        ((SheetWebViewPresenter)object2).setUpWebView();
        object2 = (IntercomErrorView)this.containerView.findViewById(R.id.error_layout_sheet);
        this.intercomErrorView = object2;
        ((IntercomErrorView)((Object)object2)).setActionButtonTextColor(ColorUtils.primaryOrDarkColor((Context)this, this.appConfigProvider.get()));
        this.intercomErrorView.setActionButtonClickListener(new View.OnClickListener(this){
            final IntercomSheetActivity this$0;
            {
                this.this$0 = intercomSheetActivity;
            }

            public void onClick(View view) {
                this.this$0.loadSheet(Injector.get().getApi());
            }
        });
        this.pickFile = this.registerForActivityResult((ActivityResultContract)new ActivityResultContracts.StartActivityForResult(), new b(this));
        this.loadSheet(((Injector)object).getApi());
    }

    @Override
    protected void onDestroy() {
        this.intercomToolbar.closeWallpaperLoader(this.wallpaperLoader);
        super.onDestroy();
    }

    @Override
    public void onInboxClicked() {
        this.closeSheet();
    }

    @Override
    public void onSheetTitleAction(String string2) {
        this.intercomToolbar.setTitle((CharSequence)string2);
    }

    @Override
    public void onSubmitSheetAction(Map<String, Object> map2) {
        Injector.get().getApi().submitSheet(this.cardUri, map2, new d<Void>(){
            final IntercomSheetActivity this$0;
            final Map val$payload;
            {
                this.this$0 = intercomSheetActivity;
                this.val$payload = map2;
            }

            @Override
            public void onFailure(retrofit2.b<Void> b11, Throwable throwable) {
                this.this$0.showSubmitActionError(this.val$payload);
            }

            @Override
            public void onResponse(retrofit2.b<Void> b11, z<Void> z13) {
                if (z13.e()) {
                    this.this$0.cardUpdated();
                    this.this$0.closeSheet();
                } else {
                    this.this$0.showSubmitActionError(this.val$payload);
                }
            }
        });
    }

    @Override
    public void onToolbarClicked() {
    }

    @Override
    public void onWebViewFinishedLoad() {
        this.jsRunner.runPendingScripts();
        this.webView.animate().alpha(1.0f).setDuration(300L).start();
        this.loadingBar.setVisibility(8);
    }
}


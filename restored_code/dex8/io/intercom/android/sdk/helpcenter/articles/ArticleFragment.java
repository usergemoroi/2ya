/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Intent
 *  android.content.res.ColorStateList
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.webkit.CookieManager
 *  android.webkit.ValueCallback
 *  android.webkit.WebViewClient
 *  androidx.constraintlayout.motion.widget.MotionLayout
 *  androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentActivity
 *  androidx.lifecycle.LifecycleOwner
 *  androidx.lifecycle.LifecycleOwnerKt
 *  androidx.lifecycle.ViewModelStoreOwner
 *  kotlin.collections.s0
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.functions.p
 *  kotlin.n
 *  kotlin.text.p
 *  kotlinx.coroutines.flow.q0
 */
package io.intercom.android.sdk.helpcenter.articles;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebViewClient;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.articles.ArticleWebViewClient;
import io.intercom.android.sdk.databinding.IntercomFragmentHelpCenterArticleBinding;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleActivity;
import io.intercom.android.sdk.helpcenter.articles.ArticleFragment;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewModel;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.articles.a;
import io.intercom.android.sdk.helpcenter.articles.b;
import io.intercom.android.sdk.helpcenter.articles.c;
import io.intercom.android.sdk.helpcenter.articles.d;
import io.intercom.android.sdk.helpcenter.articles.e;
import io.intercom.android.sdk.helpcenter.articles.f;
import io.intercom.android.sdk.helpcenter.articles.g;
import io.intercom.android.sdk.helpcenter.webview.HelpCenterWebViewInterface;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.extensions.ViewExtensionsKt;
import io.intercom.android.sdk.views.IntercomShimmerLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.j;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.m;
import kotlin.n;
import kotlin.t;
import kotlin.text.p;
import kotlin.v;
import kotlin.z;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b'\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0004J!\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010%\u00a8\u0006("}, d2={"Lio/intercom/android/sdk/helpcenter/articles/ArticleFragment;", "Landroidx/fragment/app/Fragment;", "Lkotlin/k0;", "requestData", "()V", "subscribeToStates", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Error;", "error", "renderErrors", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Error;)V", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Content;", "content", "renderContent", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Content;)V", "setCookies", "initViews", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lio/intercom/android/sdk/databinding/IntercomFragmentHelpCenterArticleBinding;", "_binding", "Lio/intercom/android/sdk/databinding/IntercomFragmentHelpCenterArticleBinding;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleActivity$ArticleActivityArguments;", "arguments$delegate", "Lkotlin/m;", "getArguments", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleActivity$ArticleActivityArguments;", "arguments", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "viewModel$delegate", "getViewModel", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "viewModel", "getBinding", "()Lio/intercom/android/sdk/databinding/IntercomFragmentHelpCenterArticleBinding;", "binding", "<init>", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class ArticleFragment
extends Fragment {
    @Nullable
    private IntercomFragmentHelpCenterArticleBinding _binding;
    @NotNull
    private final m arguments$delegate = n.b((kotlin.jvm.functions.a)new kotlin.jvm.functions.a<ArticleActivity.ArticleActivityArguments>(this){
        final ArticleFragment this$0;
        {
            this.this$0 = articleFragment;
            super(0);
        }

        @NotNull
        public final ArticleActivity.ArticleActivityArguments invoke() {
            ArticleActivity.Companion companion = ArticleActivity.Companion;
            Intent intent = this.this$0.requireActivity().getIntent();
            y.i(intent, "requireActivity().intent");
            return companion.getArguments(intent);
        }
    });
    @NotNull
    private final m viewModel$delegate = n.b((kotlin.jvm.functions.a)new kotlin.jvm.functions.a<ArticleViewModel>(this){
        final ArticleFragment this$0;
        {
            this.this$0 = articleFragment;
            super(0);
        }

        @NotNull
        public final ArticleViewModel invoke() {
            ArticleViewModel.Companion companion = ArticleViewModel.Companion;
            FragmentActivity fragmentActivity = this.this$0.requireActivity();
            y.i(fragmentActivity, "requireActivity()");
            HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
            y.i(helpCenterApi, "get().helpCenterApi");
            return companion.create((ViewModelStoreOwner)fragmentActivity, helpCenterApi, Injector.get().getAppConfigProvider().get().getHelpCenterUrl(), ArticleFragment.access$getArguments(this.this$0).getMetricPlace(), ArticleFragment.access$getArguments(this.this$0).isFromSearchBrowse(), ArticleFragment.access$getArguments(this.this$0).getShouldHideReactions(), (l<? super Integer, k0>)new l<Integer, k0>(this.this$0){
                final ArticleFragment this$0;
                {
                    this.this$0 = articleFragment;
                    super(1);
                }

                public final void invoke(int n10) {
                    ArticleFragment.access$getBinding((ArticleFragment)this.this$0).articleScrollview.scrollTo(0, n10);
                }
            });
        }
    });

    public ArticleFragment() {
        super(R.layout.intercom_fragment_help_center_article);
    }

    public static final /* synthetic */ ArticleActivity.ArticleActivityArguments access$getArguments(ArticleFragment articleFragment) {
        return articleFragment.getArguments();
    }

    public static final /* synthetic */ IntercomFragmentHelpCenterArticleBinding access$getBinding(ArticleFragment articleFragment) {
        return articleFragment.getBinding();
    }

    public static final /* synthetic */ ArticleViewModel access$getViewModel(ArticleFragment articleFragment) {
        return articleFragment.getViewModel();
    }

    public static final /* synthetic */ void access$renderContent(ArticleFragment articleFragment, ArticleViewState.Content content) {
        articleFragment.renderContent(content);
    }

    public static final /* synthetic */ void access$renderErrors(ArticleFragment articleFragment, ArticleViewState.Error error) {
        articleFragment.renderErrors(error);
    }

    public static /* synthetic */ void c(ArticleFragment articleFragment, View view) {
        ArticleFragment.initViews$lambda$10$lambda$8(articleFragment, view);
    }

    public static /* synthetic */ void d(ArticleFragment articleFragment, View view) {
        ArticleFragment.initViews$lambda$10$lambda$7(articleFragment, view);
    }

    public static /* synthetic */ void e(ArticleFragment articleFragment, String string2) {
        ArticleFragment.renderContent$lambda$4$lambda$3(articleFragment, string2);
    }

    public static /* synthetic */ void f(ArticleFragment articleFragment, View view) {
        ArticleFragment.initViews$lambda$10$lambda$9(articleFragment, view);
    }

    public static /* synthetic */ void g(ArticleFragment articleFragment, View view) {
        ArticleFragment.initViews$lambda$10$lambda$6(articleFragment, view);
    }

    private final ArticleActivity.ArticleActivityArguments getArguments() {
        return (ArticleActivity.ArticleActivityArguments)this.arguments$delegate.getValue();
    }

    private final IntercomFragmentHelpCenterArticleBinding getBinding() {
        IntercomFragmentHelpCenterArticleBinding intercomFragmentHelpCenterArticleBinding = this._binding;
        if (intercomFragmentHelpCenterArticleBinding != null) {
            return intercomFragmentHelpCenterArticleBinding;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final ArticleViewModel getViewModel() {
        return (ArticleViewModel)this.viewModel$delegate.getValue();
    }

    public static /* synthetic */ void h(ArticleFragment articleFragment, View view) {
        ArticleFragment.renderErrors$lambda$2$lambda$1$lambda$0(articleFragment, view);
    }

    @SuppressLint(value={"SetJavaScriptEnabled"})
    private final void initViews() {
        this._binding = IntercomFragmentHelpCenterArticleBinding.bind(this.requireView());
        IntercomFragmentHelpCenterArticleBinding intercomFragmentHelpCenterArticleBinding = this.getBinding();
        intercomFragmentHelpCenterArticleBinding.articleToolbar.setNavigationOnClickListener((View.OnClickListener)new b(this));
        intercomFragmentHelpCenterArticleBinding.articleWebView.getSettings().setJavaScriptEnabled(true);
        HelpCenterWebViewInterface helpCenterWebViewInterface = new HelpCenterWebViewInterface(intercomFragmentHelpCenterArticleBinding.articleWebView, Injector.get().getGson(), Injector.get().getMetricTracker(), Injector.get().getApiProvider().get(), this.getArguments().isFromSearchBrowse());
        intercomFragmentHelpCenterArticleBinding.articleWebView.addJavascriptInterface((Object)helpCenterWebViewInterface, "AndroidHost");
        intercomFragmentHelpCenterArticleBinding.articleReactions.intercomReactionHappy.setOnClickListener(new c(this));
        intercomFragmentHelpCenterArticleBinding.articleReactions.intercomReactionNeutral.setOnClickListener(new d(this));
        intercomFragmentHelpCenterArticleBinding.articleReactions.intercomReactionSad.setOnClickListener(new e(this));
    }

    private static final void initViews$lambda$10$lambda$6(ArticleFragment articleFragment, View view) {
        y.j((Object)articleFragment, "this$0");
        articleFragment = articleFragment.getActivity();
        if (articleFragment != null) {
            articleFragment.onBackPressed();
        }
    }

    private static final void initViews$lambda$10$lambda$7(ArticleFragment articleFragment, View view) {
        y.j((Object)articleFragment, "this$0");
        articleFragment.getViewModel().happyReactionTapped();
    }

    private static final void initViews$lambda$10$lambda$8(ArticleFragment articleFragment, View view) {
        y.j((Object)articleFragment, "this$0");
        articleFragment.getViewModel().neutralReactionTapped();
    }

    private static final void initViews$lambda$10$lambda$9(ArticleFragment articleFragment, View view) {
        y.j((Object)articleFragment, "this$0");
        articleFragment.getViewModel().sadReactionTapped();
    }

    private final void renderContent(ArticleViewState.Content content) {
        IntercomFragmentHelpCenterArticleBinding intercomFragmentHelpCenterArticleBinding = this.getBinding();
        Object object = intercomFragmentHelpCenterArticleBinding.articleErrorViews;
        y.i(object, "articleErrorViews");
        ViewExtensionsKt.hide((View)object);
        intercomFragmentHelpCenterArticleBinding.articleReactions.getRoot().setVisibility(content.getReactionState().getReactionComponentVisibility());
        intercomFragmentHelpCenterArticleBinding.articleTeamHelp.setVisibility(content.getReactionState().getReactionComponentVisibility());
        intercomFragmentHelpCenterArticleBinding.articleReactionsDivider.setVisibility(content.getReactionState().getReactionComponentVisibility());
        object = content.getWebViewStatus();
        int n10 = WhenMappings.$EnumSwitchMapping$0[object.ordinal()];
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 == 3) {
                    object = intercomFragmentHelpCenterArticleBinding.articleLoadingView;
                    y.i(object, "articleLoadingView");
                    ViewExtensionsKt.hide((View)object);
                    object = intercomFragmentHelpCenterArticleBinding.articleContents;
                    y.i(object, "articleContents");
                    ViewExtensionsKt.show((View)object);
                    intercomFragmentHelpCenterArticleBinding.articleWebView.evaluateJavascript("window.alexandriaArticleContentId", (ValueCallback)new f(this));
                }
            } else {
                object = intercomFragmentHelpCenterArticleBinding.articleLoadingView;
                y.i(object, "articleLoadingView");
                ViewExtensionsKt.show((View)object);
                object = intercomFragmentHelpCenterArticleBinding.articleContents;
                y.i(object, "articleContents");
                ViewExtensionsKt.hide((View)object);
            }
        } else {
            object = intercomFragmentHelpCenterArticleBinding.articleLoadingView;
            y.i(object, "articleLoadingView");
            ViewExtensionsKt.show((View)object);
            object = intercomFragmentHelpCenterArticleBinding.articleContents;
            y.i(object, "articleContents");
            ViewExtensionsKt.hide((View)object);
            intercomFragmentHelpCenterArticleBinding.articleWebView.setWebViewClient((WebViewClient)new ArticleWebViewClient(content.getArticleUrl(), this.getViewModel(), Injector.get().getAppConfigProvider().get().getHelpCenterUrls()));
            this.setCookies();
            object = s0.m((t[])new t[]{z.a("MobileClientDisplayType", "AndroidIntercomHeaderless"), z.a("MobileClient", "AndroidIntercomWebView"), z.a("MobileClientReactionsHidden", "true")});
            intercomFragmentHelpCenterArticleBinding.articleWebView.loadUrl(content.getArticleUrl(), (Map)object);
        }
        intercomFragmentHelpCenterArticleBinding.articleTeamHelp.setVisibility(content.getReactionState().getTeamHelpVisibility());
        intercomFragmentHelpCenterArticleBinding.articleTeamHelp.setNeedsChatBubble(true);
        intercomFragmentHelpCenterArticleBinding.articleTeamHelp.setTeamPresenceState(content.getTeamPresenceState());
        if (content.getReactionState().getShouldScrollToBottom()) {
            intercomFragmentHelpCenterArticleBinding.articleReactions.motionLayout.setTransitionListener(new MotionLayout.TransitionListener(intercomFragmentHelpCenterArticleBinding){
                final IntercomFragmentHelpCenterArticleBinding $this_with;
                {
                    this.$this_with = intercomFragmentHelpCenterArticleBinding;
                }

                public static /* synthetic */ void a(IntercomFragmentHelpCenterArticleBinding intercomFragmentHelpCenterArticleBinding, renderContent.1.2 var1_1) {
                    renderContent.1.2.onTransitionCompleted$lambda$0(intercomFragmentHelpCenterArticleBinding, var1_1);
                }

                private static final void onTransitionCompleted$lambda$0(IntercomFragmentHelpCenterArticleBinding intercomFragmentHelpCenterArticleBinding, renderContent.1.2 var1_1) {
                    y.j(intercomFragmentHelpCenterArticleBinding, "$this_with");
                    y.j(var1_1, "this$0");
                    intercomFragmentHelpCenterArticleBinding.articleScrollview.smoothScrollTo(0, intercomFragmentHelpCenterArticleBinding.articleTeamHelp.getBottom());
                    intercomFragmentHelpCenterArticleBinding.articleReactions.motionLayout.removeTransitionListener((MotionLayout.TransitionListener)var1_1);
                }

                public void onTransitionChange(@Nullable MotionLayout motionLayout, int n10, int n13, float f11) {
                }

                public void onTransitionCompleted(@Nullable MotionLayout object, int n10) {
                    object = this.$this_with;
                    object.articleScrollview.post((Runnable)new g((IntercomFragmentHelpCenterArticleBinding)object, this));
                }

                public void onTransitionStarted(@Nullable MotionLayout motionLayout, int n10, int n13) {
                }

                public void onTransitionTrigger(@Nullable MotionLayout motionLayout, int n10, boolean bl2, float f11) {
                }
            });
        }
        intercomFragmentHelpCenterArticleBinding.articleReactions.motionLayout.transitionToState(content.getReactionState().getTransitionState());
    }

    private static final void renderContent$lambda$4$lambda$3(ArticleFragment object, String string2) {
        y.j(object, "this$0");
        object = ((ArticleFragment)((Object)object)).getViewModel();
        y.i(string2, "value");
        ((ArticleViewModel)object).articleContentIdFetched(p.y0((String)string2, (CharSequence)"\""));
    }

    private final void renderErrors(ArticleViewState.Error error) {
        IntercomFragmentHelpCenterArticleBinding intercomFragmentHelpCenterArticleBinding = this.getBinding();
        IntercomShimmerLayout intercomShimmerLayout = intercomFragmentHelpCenterArticleBinding.articleLoadingView;
        y.i((Object)intercomShimmerLayout, "articleLoadingView");
        ViewExtensionsKt.hide((View)intercomShimmerLayout);
        intercomShimmerLayout = intercomFragmentHelpCenterArticleBinding.articleContents;
        y.i((Object)intercomShimmerLayout, "articleContents");
        ViewExtensionsKt.hide((View)intercomShimmerLayout);
        intercomShimmerLayout = intercomFragmentHelpCenterArticleBinding.articleErrorTextView;
        y.i((Object)intercomShimmerLayout, "articleErrorTextView");
        ViewExtensionsKt.show((View)intercomShimmerLayout);
        intercomFragmentHelpCenterArticleBinding.articleErrorTextView.setText(error.getMessage());
        intercomFragmentHelpCenterArticleBinding = intercomFragmentHelpCenterArticleBinding.articleRetryButton;
        intercomFragmentHelpCenterArticleBinding.setVisibility(error.getRetryButtonVisibility());
        intercomFragmentHelpCenterArticleBinding.setOnClickListener(new a(this));
        intercomFragmentHelpCenterArticleBinding.setBackgroundTintList(ColorStateList.valueOf((int)ColorUtils.buttonBackgroundColorVariant(error.getRetryButtonPrimaryColor())));
        intercomFragmentHelpCenterArticleBinding.setTextColor(error.getRetryButtonPrimaryColor());
    }

    private static final void renderErrors$lambda$2$lambda$1$lambda$0(ArticleFragment articleFragment, View view) {
        y.j((Object)articleFragment, "this$0");
        articleFragment.requestData();
    }

    private final void requestData() {
        this.getViewModel().fragmentLoaded(this.getArguments().getArticleId());
    }

    private final void setCookies() {
        Object object = Injector.get();
        CharSequence charSequence = new StringBuilder();
        charSequence.append("intercom-session-");
        charSequence.append(((Injector)object).getAppIdentity().appId());
        charSequence = charSequence.toString();
        String string2 = ((Injector)object).getUserIdentity().getEncryptedUserId();
        y.i(string2, "userIdentity.encryptedUserId");
        CookieManager cookieManager = CookieManager.getInstance();
        String string3 = ((Injector)object).getAppConfigProvider().get().getHelpCenterUrl();
        object = new StringBuilder();
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append('=');
        ((StringBuilder)object).append(string2);
        cookieManager.setCookie(string3, ((StringBuilder)object).toString());
    }

    private final void subscribeToStates() {
        LifecycleOwnerKt.getLifecycleScope((LifecycleOwner)this).launchWhenStarted((kotlin.jvm.functions.p)new kotlin.jvm.functions.p<q0, kotlin.coroutines.d<? super k0>, Object>(this, null){
            int label;
            final ArticleFragment this$0;
            {
                this.this$0 = articleFragment;
                super(2, d14);
            }

            @NotNull
            public final kotlin.coroutines.d<k0> create(@Nullable Object object, @NotNull kotlin.coroutines.d<?> d14) {
                return new /* invalid duplicate definition of identical inner class */;
            }

            @Nullable
            public final Object invoke(@NotNull q0 q02, @Nullable kotlin.coroutines.d<? super k0> d14) {
                return ((Object)this.create(q02, d14)).invokeSuspend(k0.a);
            }

            @Nullable
            public final Object invokeSuspend(@NotNull Object object) {
                Object object2 = kotlin.coroutines.intrinsics.b.f();
                int n10 = this.label;
                if (n10 != 0) {
                    if (n10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(object);
                } else {
                    v.b(object);
                    kotlinx.coroutines.flow.q0<ArticleViewState> q02 = ArticleFragment.access$getViewModel(this.this$0).getState();
                    object = new i<ArticleViewState>(this.this$0){
                        final ArticleFragment this$0;
                        {
                            this.this$0 = articleFragment;
                        }

                        @Nullable
                        public final Object emit(@NotNull ArticleViewState articleViewState, @NotNull kotlin.coroutines.d<? super k0> d14) {
                            if (!y.e(articleViewState, ArticleViewState.Initial.INSTANCE)) {
                                if (articleViewState instanceof ArticleViewState.Content) {
                                    ArticleFragment.access$renderContent(this.this$0, (ArticleViewState.Content)articleViewState);
                                } else if (articleViewState instanceof ArticleViewState.Error) {
                                    ArticleFragment.access$renderErrors(this.this$0, (ArticleViewState.Error)articleViewState);
                                }
                            }
                            return k0.a;
                        }
                    };
                    this.label = 1;
                    if (q02.collect((i)object, (kotlin.coroutines.d)((Object)this)) == object2) {
                        return object2;
                    }
                }
                throw new j();
            }
        });
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        y.j(view, "view");
        super.onViewCreated(view, bundle);
        this.initViews();
        this.subscribeToStates();
        this.requestData();
    }

    @Metadata(k=3, mv={1, 8, 0}, xi=48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        static {
            int[] nArray = new int[ArticleViewState.WebViewStatus.values().length];
            try {
                nArray[ArticleViewState.WebViewStatus.Idle.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[ArticleViewState.WebViewStatus.Loading.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[ArticleViewState.WebViewStatus.Ready.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            $EnumSwitchMapping$0 = nArray;
        }
    }
}


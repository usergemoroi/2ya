/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.Editable
 *  android.text.SpannableString
 *  android.text.TextWatcher
 *  android.text.style.StyleSpan
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 *  androidx.lifecycle.LifecycleOwner
 *  androidx.lifecycle.LifecycleOwnerKt
 *  androidx.lifecycle.ViewModelStoreOwner
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ItemDecoration
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.functions.p
 *  kotlin.n
 *  kotlin.text.p
 *  kotlinx.coroutines.flow.c0
 *  kotlinx.coroutines.flow.q0
 */
package io.intercom.android.sdk.helpcenter.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.databinding.IntercomActivityArticleSearchBinding;
import io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleActivity;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchState;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel;
import io.intercom.android.sdk.helpcenter.search.SearchResultAdapter;
import io.intercom.android.sdk.helpcenter.search.a;
import io.intercom.android.sdk.helpcenter.search.b;
import io.intercom.android.sdk.helpcenter.search.c;
import io.intercom.android.sdk.helpcenter.utils.PaddedDividerItemDecoration;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.utilities.extensions.ViewExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.m;
import kotlin.n;
import kotlin.v;
import kotlinx.coroutines.flow.c0;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.s0;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 82\u00020\u0001:\u000298B\u0007\u00a2\u0006\u0004\b7\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0004J\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0016*\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014\u00a2\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\"\u0010\u0004R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020#8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b4\u00105\u00a8\u0006:"}, d2={"Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity;", "Lio/intercom/android/sdk/helpcenter/IntercomHelpCenterBaseActivity;", "Lkotlin/k0;", "subscribeToStates", "()V", "displayLoading", "", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "results", "displaySearchResults", "(Ljava/util/List;)V", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "teamPresenceState", "", "searchTerm", "displayNoResults", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;Ljava/lang/String;)V", "displayNoResultsWithoutTeamHelp", "(Ljava/lang/String;)V", "displayError", "displayInitialState", "Landroid/widget/EditText;", "Lkotlinx/coroutines/flow/q0;", "textChanged", "(Landroid/widget/EditText;)Lkotlinx/coroutines/flow/q0;", "Landroid/content/Context;", "context", "Landroid/text/SpannableString;", "getNoResultsMessage", "(Landroid/content/Context;Ljava/lang/String;)Landroid/text/SpannableString;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Lio/intercom/android/sdk/databinding/IntercomActivityArticleSearchBinding;", "_binding", "Lio/intercom/android/sdk/databinding/IntercomActivityArticleSearchBinding;", "Lio/intercom/android/sdk/helpcenter/search/SearchResultAdapter;", "adapter", "Lio/intercom/android/sdk/helpcenter/search/SearchResultAdapter;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel;", "viewModel$delegate", "Lkotlin/m;", "getViewModel", "()Lio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel;", "viewModel", "Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity$ArticleSearchArgs;", "args$delegate", "getArgs", "()Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity$ArticleSearchArgs;", "args", "getBinding", "()Lio/intercom/android/sdk/databinding/IntercomActivityArticleSearchBinding;", "binding", "<init>", "Companion", "ArticleSearchArgs", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class IntercomArticleSearchActivity
extends IntercomHelpCenterBaseActivity {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String IS_FROM_SEARCH_BROWSE = "IS_SEARCH_BROWSE";
    @Nullable
    private IntercomActivityArticleSearchBinding _binding;
    @NotNull
    private final SearchResultAdapter adapter = new SearchResultAdapter((l<? super String, k0>)new l<String, k0>(this){
        final IntercomArticleSearchActivity this$0;
        {
            this.this$0 = intercomArticleSearchActivity;
            super(1);
        }

        public final void invoke(@NotNull String string2) {
            y.j(string2, "it");
            IntercomArticleSearchActivity.access$getViewModel(this.this$0).addTeammateHelpRow();
            IntercomArticleSearchActivity.access$getViewModel(this.this$0).sendClickOnSearchResultMetric();
            string2 = ArticleActivity.Companion.buildIntent((Context)this.this$0, new ArticleActivity.ArticleActivityArguments(string2, "search_results", false, false, 12, null));
            this.this$0.startActivity((Intent)string2);
        }
    });
    @NotNull
    private final m args$delegate;
    @NotNull
    private final m viewModel$delegate = n.b((kotlin.jvm.functions.a)new kotlin.jvm.functions.a<ArticleSearchViewModel>(this){
        final IntercomArticleSearchActivity this$0;
        {
            this.this$0 = intercomArticleSearchActivity;
            super(0);
        }

        @NotNull
        public final ArticleSearchViewModel invoke() {
            ArticleSearchViewModel.Companion companion = ArticleSearchViewModel.Companion;
            IntercomArticleSearchActivity intercomArticleSearchActivity = this.this$0;
            HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
            y.i(helpCenterApi, "get().helpCenterApi");
            return companion.create((ViewModelStoreOwner)intercomArticleSearchActivity, helpCenterApi, IntercomArticleSearchActivity.access$getArgs(this.this$0).isFromSearchBrowse());
        }
    });

    public IntercomArticleSearchActivity() {
        this.args$delegate = n.b((kotlin.jvm.functions.a)new kotlin.jvm.functions.a<ArticleSearchArgs>(this){
            final IntercomArticleSearchActivity this$0;
            {
                this.this$0 = intercomArticleSearchActivity;
                super(0);
            }

            @NotNull
            public final ArticleSearchArgs invoke() {
                Companion companion = IntercomArticleSearchActivity.Companion;
                Intent intent = this.this$0.getIntent();
                y.i(intent, "intent");
                return companion.getArguments(intent);
            }
        });
    }

    public static final /* synthetic */ void access$displayError(IntercomArticleSearchActivity intercomArticleSearchActivity) {
        intercomArticleSearchActivity.displayError();
    }

    public static final /* synthetic */ void access$displayInitialState(IntercomArticleSearchActivity intercomArticleSearchActivity) {
        intercomArticleSearchActivity.displayInitialState();
    }

    public static final /* synthetic */ void access$displayLoading(IntercomArticleSearchActivity intercomArticleSearchActivity) {
        intercomArticleSearchActivity.displayLoading();
    }

    public static final /* synthetic */ void access$displayNoResults(IntercomArticleSearchActivity intercomArticleSearchActivity, ArticleViewState.TeamPresenceState teamPresenceState, String string2) {
        intercomArticleSearchActivity.displayNoResults(teamPresenceState, string2);
    }

    public static final /* synthetic */ void access$displayNoResultsWithoutTeamHelp(IntercomArticleSearchActivity intercomArticleSearchActivity, String string2) {
        intercomArticleSearchActivity.displayNoResultsWithoutTeamHelp(string2);
    }

    public static final /* synthetic */ void access$displaySearchResults(IntercomArticleSearchActivity intercomArticleSearchActivity, List list) {
        intercomArticleSearchActivity.displaySearchResults(list);
    }

    public static final /* synthetic */ ArticleSearchArgs access$getArgs(IntercomArticleSearchActivity intercomArticleSearchActivity) {
        return intercomArticleSearchActivity.getArgs();
    }

    public static final /* synthetic */ ArticleSearchViewModel access$getViewModel(IntercomArticleSearchActivity intercomArticleSearchActivity) {
        return intercomArticleSearchActivity.getViewModel();
    }

    @JvmStatic
    @NotNull
    public static final Intent buildIntent(@NotNull Context context, boolean bl2) {
        return Companion.buildIntent(context, bl2);
    }

    private final void displayError() {
        IntercomActivityArticleSearchBinding intercomActivityArticleSearchBinding = this.getBinding();
        Object object = intercomActivityArticleSearchBinding.searchResultRecyclerView;
        y.i(object, "searchResultRecyclerView");
        ViewExtensionsKt.hide((View)object);
        object = intercomActivityArticleSearchBinding.searchLoading;
        y.i(object, "searchLoading");
        ViewExtensionsKt.hide((View)object);
        object = intercomActivityArticleSearchBinding.searchError;
        y.i(object, "searchError");
        ViewExtensionsKt.show((View)object);
        object = intercomActivityArticleSearchBinding.searchErrorTeamHelp;
        y.i(object, "searchErrorTeamHelp");
        ViewExtensionsKt.hide((View)object);
        intercomActivityArticleSearchBinding.searchError.setText(R.string.intercom_something_went_wrong_try_again);
    }

    private final void displayInitialState() {
        IntercomActivityArticleSearchBinding intercomActivityArticleSearchBinding = this.getBinding();
        Object object = intercomActivityArticleSearchBinding.clearSearch;
        y.i(object, "clearSearch");
        ViewExtensionsKt.hide((View)object);
        object = intercomActivityArticleSearchBinding.searchLoading;
        y.i(object, "searchLoading");
        ViewExtensionsKt.hide((View)object);
        object = intercomActivityArticleSearchBinding.searchErrors;
        y.i(object, "searchErrors");
        ViewExtensionsKt.hide((View)object);
        intercomActivityArticleSearchBinding = intercomActivityArticleSearchBinding.searchResultRecyclerView;
        y.i(intercomActivityArticleSearchBinding, "searchResultRecyclerView");
        ViewExtensionsKt.show((View)intercomActivityArticleSearchBinding);
        this.adapter.clearData();
    }

    private final void displayLoading() {
        Object object = this.getBinding();
        Object object2 = object.searchResultRecyclerView;
        y.i(object2, "searchResultRecyclerView");
        ViewExtensionsKt.hide((View)object2);
        object2 = object.searchErrors;
        y.i(object2, "searchErrors");
        ViewExtensionsKt.hide((View)object2);
        object2 = object.searchErrorTeamHelp;
        y.i(object2, "searchErrorTeamHelp");
        ViewExtensionsKt.hide((View)object2);
        object = object.searchLoading;
        y.i(object, "searchLoading");
        ViewExtensionsKt.show((View)object);
    }

    private final void displayNoResults(ArticleViewState.TeamPresenceState object, String string2) {
        IntercomActivityArticleSearchBinding intercomActivityArticleSearchBinding = this.getBinding();
        Object object2 = intercomActivityArticleSearchBinding.searchResultRecyclerView;
        y.i(object2, "searchResultRecyclerView");
        ViewExtensionsKt.hide((View)object2);
        object2 = intercomActivityArticleSearchBinding.searchLoading;
        y.i(object2, "searchLoading");
        ViewExtensionsKt.hide((View)object2);
        intercomActivityArticleSearchBinding.searchErrorTeamHelp.setTeamPresenceState((ArticleViewState.TeamPresenceState)object);
        object = intercomActivityArticleSearchBinding.searchErrorTeamHelp;
        y.i(object, "searchErrorTeamHelp");
        ViewExtensionsKt.show((View)object);
        object = intercomActivityArticleSearchBinding.searchErrors;
        y.i(object, "searchErrors");
        ViewExtensionsKt.show((View)object);
        intercomActivityArticleSearchBinding.searchError.setText((CharSequence)this.getNoResultsMessage((Context)this, string2));
    }

    private final void displayNoResultsWithoutTeamHelp(String string2) {
        IntercomActivityArticleSearchBinding intercomActivityArticleSearchBinding = this.getBinding();
        Object object = intercomActivityArticleSearchBinding.searchResultRecyclerView;
        y.i(object, "searchResultRecyclerView");
        ViewExtensionsKt.hide((View)object);
        object = intercomActivityArticleSearchBinding.searchLoading;
        y.i(object, "searchLoading");
        ViewExtensionsKt.hide((View)object);
        object = intercomActivityArticleSearchBinding.searchErrorTeamHelp;
        y.i(object, "searchErrorTeamHelp");
        ViewExtensionsKt.hide((View)object);
        object = intercomActivityArticleSearchBinding.searchErrors;
        y.i(object, "searchErrors");
        ViewExtensionsKt.show((View)object);
        intercomActivityArticleSearchBinding.searchError.setText((CharSequence)this.getNoResultsMessage((Context)this, string2));
    }

    private final void displaySearchResults(List<? extends ArticleSearchResultRow> list) {
        Object object = this.getBinding();
        RecyclerView recyclerView = object.searchResultRecyclerView;
        y.i(recyclerView, "searchResultRecyclerView");
        ViewExtensionsKt.show((View)recyclerView);
        recyclerView = object.searchErrors;
        y.i(recyclerView, "searchErrors");
        ViewExtensionsKt.hide((View)recyclerView);
        object = object.searchLoading;
        y.i(object, "searchLoading");
        ViewExtensionsKt.hide((View)object);
        this.adapter.updateResults(list);
    }

    private final ArticleSearchArgs getArgs() {
        return (ArticleSearchArgs)this.args$delegate.getValue();
    }

    private final IntercomActivityArticleSearchBinding getBinding() {
        IntercomActivityArticleSearchBinding intercomActivityArticleSearchBinding = this._binding;
        if (intercomActivityArticleSearchBinding != null) {
            return intercomActivityArticleSearchBinding;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final SpannableString getNoResultsMessage(Context context, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\'');
        stringBuilder.append(string2);
        stringBuilder.append('\'');
        string2 = stringBuilder.toString();
        context = new SpannableString((CharSequence)((Object)Phrase.from(context, R.string.intercom_no_results_for_searchterm).put("searchTerm", string2).format()).toString());
        int n10 = kotlin.text.p.e0((CharSequence)context, (String)string2, (int)0, (boolean)false, (int)6, null);
        context.setSpan((Object)new StyleSpan(1), n10, string2.length() + n10, 0);
        return context;
    }

    private final ArticleSearchViewModel getViewModel() {
        return (ArticleSearchViewModel)((Object)this.viewModel$delegate.getValue());
    }

    public static /* synthetic */ boolean k(IntercomActivityArticleSearchBinding intercomActivityArticleSearchBinding, TextView textView, int n10, KeyEvent keyEvent) {
        return IntercomArticleSearchActivity.onCreate$lambda$3$lambda$1(intercomActivityArticleSearchBinding, textView, n10, keyEvent);
    }

    public static /* synthetic */ void l(IntercomArticleSearchActivity intercomArticleSearchActivity, View view) {
        IntercomArticleSearchActivity.onCreate$lambda$3$lambda$0(intercomArticleSearchActivity, view);
    }

    public static /* synthetic */ void m(IntercomActivityArticleSearchBinding intercomActivityArticleSearchBinding, View view) {
        IntercomArticleSearchActivity.onCreate$lambda$3$lambda$2(intercomActivityArticleSearchBinding, view);
    }

    private static final void onCreate$lambda$3$lambda$0(IntercomArticleSearchActivity intercomArticleSearchActivity, View view) {
        y.j((Object)intercomArticleSearchActivity, "this$0");
        intercomArticleSearchActivity.onBackPressed();
    }

    private static final boolean onCreate$lambda$3$lambda$1(IntercomActivityArticleSearchBinding object, TextView textView, int n10, KeyEvent keyEvent) {
        y.j(object, "$this_with");
        object = ((IntercomActivityArticleSearchBinding)object).searchBar.getText().toString();
        if (n10 == 3 && object.length() > 0) {
            j.G(object);
        }
        return true;
    }

    private static final void onCreate$lambda$3$lambda$2(IntercomActivityArticleSearchBinding intercomActivityArticleSearchBinding, View view) {
        y.j(intercomActivityArticleSearchBinding, "$this_with");
        intercomActivityArticleSearchBinding.searchBar.getText().clear();
    }

    private final void subscribeToStates() {
        LifecycleOwnerKt.getLifecycleScope((LifecycleOwner)this).launchWhenStarted((kotlin.jvm.functions.p)new kotlin.jvm.functions.p<q0, d<? super k0>, Object>(this, null){
            int label;
            final IntercomArticleSearchActivity this$0;
            {
                this.this$0 = intercomArticleSearchActivity;
                super(2, d14);
            }

            @NotNull
            public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
                return new /* invalid duplicate definition of identical inner class */;
            }

            @Nullable
            public final Object invoke(@NotNull q0 q02, @Nullable d<? super k0> d14) {
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
                    kotlinx.coroutines.flow.q0<ArticleSearchState> q02 = IntercomArticleSearchActivity.access$getViewModel(this.this$0).getState();
                    object = new i<ArticleSearchState>(this.this$0){
                        final IntercomArticleSearchActivity this$0;
                        {
                            this.this$0 = intercomArticleSearchActivity;
                        }

                        @Nullable
                        public final Object emit(@NotNull ArticleSearchState articleSearchState, @NotNull d<? super k0> object) {
                            if (articleSearchState instanceof ArticleSearchState.Content) {
                                IntercomArticleSearchActivity.access$displaySearchResults(this.this$0, ((ArticleSearchState.Content)articleSearchState).getSearchResults());
                            } else if (articleSearchState instanceof ArticleSearchState.NoResults) {
                                object = this.this$0;
                                articleSearchState = (ArticleSearchState.NoResults)articleSearchState;
                                IntercomArticleSearchActivity.access$displayNoResults(object, ((ArticleSearchState.NoResults)articleSearchState).getTeamPresenceState(), ((ArticleSearchState.NoResults)articleSearchState).getSearchTerm());
                            } else if (y.e(articleSearchState, ArticleSearchState.Error.INSTANCE)) {
                                IntercomArticleSearchActivity.access$displayError(this.this$0);
                            } else if (y.e(articleSearchState, ArticleSearchState.Initial.INSTANCE)) {
                                IntercomArticleSearchActivity.access$displayInitialState(this.this$0);
                            } else if (articleSearchState instanceof ArticleSearchState.NoResultsNoTeamHelp) {
                                IntercomArticleSearchActivity.access$displayNoResultsWithoutTeamHelp(this.this$0, ((ArticleSearchState.NoResultsNoTeamHelp)articleSearchState).getSearchTerm());
                            } else if (y.e(articleSearchState, ArticleSearchState.Loading.INSTANCE)) {
                                IntercomArticleSearchActivity.access$displayLoading(this.this$0);
                            }
                            return k0.a;
                        }
                    };
                    this.label = 1;
                    if (q02.collect((i)object, (d)((Object)this)) == object2) {
                        return object2;
                    }
                }
                throw new kotlin.j();
            }
        });
    }

    private final kotlinx.coroutines.flow.q0<String> textChanged(EditText editText) {
        c0<String> c04 = s0.a("");
        editText.addTextChangedListener(new TextWatcher(c04){
            final c0<String> $query;
            {
                this.$query = c04;
            }

            public void afterTextChanged(@Nullable Editable editable) {
            }

            public void beforeTextChanged(@Nullable CharSequence charSequence, int n10, int n13, int n14) {
            }

            public void onTextChanged(@Nullable CharSequence charSequence, int n10, int n13, int n14) {
                this.$query.setValue((Object)String.valueOf(charSequence));
            }
        });
        return c04;
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.overridePendingTransition(R.anim.intercom_donothing, R.anim.intercom_fade_out);
    }

    @Override
    protected void onCreate(@Nullable Bundle object) {
        super.onCreate((Bundle)object);
        this._binding = IntercomActivityArticleSearchBinding.inflate(this.getLayoutInflater());
        this.setContentView((View)this.getBinding().getRoot());
        object = this.getBinding();
        object.toolbar.setNavigationOnClickListener((View.OnClickListener)new a(this));
        object.searchBar.setOnEditorActionListener((TextView.OnEditorActionListener)new b((IntercomActivityArticleSearchBinding)object));
        object.searchBar.addTextChangedListener(new TextWatcher((IntercomActivityArticleSearchBinding)object){
            final IntercomActivityArticleSearchBinding $this_with;
            {
                this.$this_with = intercomActivityArticleSearchBinding;
            }

            public void afterTextChanged(@Nullable Editable editable) {
            }

            public void beforeTextChanged(@Nullable CharSequence charSequence, int n10, int n13, int n14) {
            }

            public void onTextChanged(@Nullable CharSequence charSequence, int n10, int n13, int n14) {
                if (String.valueOf(charSequence).length() == 0) {
                    charSequence = this.$this_with.clearSearch;
                    y.i(charSequence, "clearSearch");
                    ViewExtensionsKt.hide((View)charSequence);
                } else {
                    charSequence = this.$this_with.clearSearch;
                    y.i(charSequence, "clearSearch");
                    ViewExtensionsKt.show((View)charSequence);
                }
            }
        });
        object.searchBar.requestFocus();
        ArticleSearchViewModel articleSearchViewModel = this.getViewModel();
        EditText editText = object.searchBar;
        y.i(editText, "searchBar");
        articleSearchViewModel.searchForArticles((h<String>)this.textChanged(editText));
        object.clearSearch.setOnClickListener((View.OnClickListener)new c((IntercomActivityArticleSearchBinding)object));
        articleSearchViewModel = object.searchResultRecyclerView.getContext();
        object.searchResultRecyclerView.setLayoutManager((RecyclerView.LayoutManager)new LinearLayoutManager((Context)articleSearchViewModel));
        object.searchResultRecyclerView.setAdapter((RecyclerView.Adapter)this.adapter);
        object = object.searchResultRecyclerView;
        y.i((Object)articleSearchViewModel, "context");
        object.addItemDecoration((RecyclerView.ItemDecoration)new PaddedDividerItemDecoration((Context)articleSearchViewModel));
        this.subscribeToStates();
        this.overridePendingTransition(R.anim.intercom_fade_in, R.anim.intercom_donothing);
    }

    @Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\f\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000e"}, d2={"Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity$ArticleSearchArgs;", "", "isFromSearchBrowse", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class ArticleSearchArgs {
        private final boolean isFromSearchBrowse;

        public ArticleSearchArgs() {
            this(false, 1, null);
        }

        public ArticleSearchArgs(boolean bl2) {
            this.isFromSearchBrowse = bl2;
        }

        public /* synthetic */ ArticleSearchArgs(boolean bl2, int n10, p p14) {
            if ((n10 & 1) != 0) {
                bl2 = false;
            }
            this(bl2);
        }

        public static /* synthetic */ ArticleSearchArgs copy$default(ArticleSearchArgs articleSearchArgs, boolean bl2, int n10, Object object) {
            if ((n10 & 1) != 0) {
                bl2 = articleSearchArgs.isFromSearchBrowse;
            }
            return articleSearchArgs.copy(bl2);
        }

        public final boolean component1() {
            return this.isFromSearchBrowse;
        }

        @NotNull
        public final ArticleSearchArgs copy(boolean bl2) {
            return new ArticleSearchArgs(bl2);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof ArticleSearchArgs)) {
                return false;
            }
            object = (ArticleSearchArgs)object;
            return this.isFromSearchBrowse == ((ArticleSearchArgs)object).isFromSearchBrowse;
        }

        public int hashCode() {
            int n10;
            int n13 = n10 = this.isFromSearchBrowse;
            if (n10 != 0) {
                n13 = 1;
            }
            return n13;
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ArticleSearchArgs(isFromSearchBrowse=");
            stringBuilder.append(this.isFromSearchBrowse);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2={"Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity$Companion;", "", "()V", "IS_FROM_SEARCH_BROWSE", "", "buildIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "isFromSearchBrowse", "", "getArguments", "Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity$ArticleSearchArgs;", "intent", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Intent buildIntent(@NotNull Context context, boolean bl2) {
            y.j(context, "context");
            context = new Intent(context, IntercomArticleSearchActivity.class);
            context.setFlags(0x10000000);
            context.putExtra(IntercomArticleSearchActivity.IS_FROM_SEARCH_BROWSE, bl2);
            return context;
        }

        @NotNull
        public final ArticleSearchArgs getArguments(@NotNull Intent intent) {
            y.j(intent, "intent");
            return new ArticleSearchArgs(intent.getBooleanExtra(IntercomArticleSearchActivity.IS_FROM_SEARCH_BROWSE, false));
        }
    }
}


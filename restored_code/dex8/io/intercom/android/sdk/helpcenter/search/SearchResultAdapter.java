/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.internal.ComposableLambdaKt
 *  androidx.compose.ui.platform.ComposeView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.helpcenter.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.databinding.IntercomRowComposeViewBinding;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import io.intercom.android.sdk.m5.helpcenter.components.ArticleResultRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u0000 $2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004$%&'B\u001b\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00060\u0019\u00a2\u0006\u0004\b\"\u0010#J\u001b\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00062\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00060\u00198\u0006\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b \u0010!\u00a8\u0006("}, d2={"Lio/intercom/android/sdk/helpcenter/search/SearchResultAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lio/intercom/android/sdk/helpcenter/search/SearchResultAdapter$SearchResultBaseViewHolder;", "", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "results", "Lkotlin/k0;", "updateResults", "(Ljava/util/List;)V", "clearData", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/intercom/android/sdk/helpcenter/search/SearchResultAdapter$SearchResultBaseViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lio/intercom/android/sdk/helpcenter/search/SearchResultAdapter$SearchResultBaseViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/Function1;", "", "onClick", "Lkotlin/jvm/functions/l;", "getOnClick", "()Lkotlin/jvm/functions/l;", "", "searchResults", "Ljava/util/List;", "<init>", "(Lkotlin/jvm/functions/l;)V", "Companion", "SearchResultBaseViewHolder", "SearchResultViewHolder", "TeammateHelpViewHolder", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class SearchResultAdapter
extends RecyclerView.Adapter<SearchResultBaseViewHolder> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int SEARCH_RESULT = 1;
    public static final int TEAMMATE_HELP = 2;
    @NotNull
    private final l<String, k0> onClick;
    @NotNull
    private final List<ArticleSearchResultRow> searchResults;

    public SearchResultAdapter(@NotNull l<? super String, k0> l10) {
        y.j(l10, "onClick");
        this.onClick = l10;
        this.searchResults = new ArrayList<ArticleSearchResultRow>();
    }

    public final void clearData() {
        this.searchResults.clear();
        this.notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.searchResults.size();
    }

    public int getItemViewType(int n10) {
        block4: {
            block3: {
                ArticleSearchResultRow articleSearchResultRow;
                block2: {
                    articleSearchResultRow = this.searchResults.get(n10);
                    if (!(articleSearchResultRow instanceof ArticleSearchResultRow.ArticleResultRow)) break block2;
                    n10 = 1;
                    break block3;
                }
                if (!(articleSearchResultRow instanceof ArticleSearchResultRow.TeammateHelpRow)) break block4;
                n10 = 2;
            }
            return n10;
        }
        throw new r();
    }

    @NotNull
    public final l<String, k0> getOnClick() {
        return this.onClick;
    }

    public void onBindViewHolder(@NotNull SearchResultBaseViewHolder searchResultBaseViewHolder, int n10) {
        y.j((Object)searchResultBaseViewHolder, "holder");
        searchResultBaseViewHolder.bind(this.searchResults.get(n10));
    }

    @NotNull
    public SearchResultBaseViewHolder onCreateViewHolder(@NotNull ViewGroup object, int n10) {
        y.j(object, "parent");
        if (n10 == 2) {
            object = IntercomRowComposeViewBinding.inflate(LayoutInflater.from((Context)object.getContext()), object, false);
            y.i(object, "inflate(LayoutInflater.f\u2026.context), parent, false)");
            object = new TeammateHelpViewHolder(this, (IntercomRowComposeViewBinding)object);
        } else {
            object = IntercomRowComposeViewBinding.inflate(LayoutInflater.from((Context)object.getContext()), object, false);
            y.i(object, "inflate(LayoutInflater.f\u2026.context), parent, false)");
            object = new SearchResultViewHolder(this, (IntercomRowComposeViewBinding)object);
        }
        return object;
    }

    public final void updateResults(@NotNull List<? extends ArticleSearchResultRow> list) {
        y.j(list, "results");
        this.searchResults.clear();
        this.searchResults.addAll((Collection<ArticleSearchResultRow>)list);
        this.notifyDataSetChanged();
    }

    @Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2={"Lio/intercom/android/sdk/helpcenter/search/SearchResultAdapter$Companion;", "", "()V", "SEARCH_RESULT", "", "TEAMMATE_HELP", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }
    }

    @Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00a6\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2={"Lio/intercom/android/sdk/helpcenter/search/SearchResultAdapter$SearchResultBaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "articleSearchResultRow", "Lkotlin/k0;", "bind", "(Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;)V", "Landroid/view/View;", "itemView", "<init>", "(Lio/intercom/android/sdk/helpcenter/search/SearchResultAdapter;Landroid/view/View;)V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
    public abstract class SearchResultBaseViewHolder
    extends RecyclerView.ViewHolder {
        final SearchResultAdapter this$0;

        public SearchResultBaseViewHolder(@NotNull SearchResultAdapter searchResultAdapter, View view) {
            y.j(view, "itemView");
            this.this$0 = searchResultAdapter;
            super(view);
        }

        public abstract void bind(@NotNull ArticleSearchResultRow var1);
    }

    @Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2={"Lio/intercom/android/sdk/helpcenter/search/SearchResultAdapter$SearchResultViewHolder;", "Lio/intercom/android/sdk/helpcenter/search/SearchResultAdapter$SearchResultBaseViewHolder;", "Lio/intercom/android/sdk/helpcenter/search/SearchResultAdapter;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "articleSearchResultRow", "Lkotlin/k0;", "bind", "(Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;)V", "Lio/intercom/android/sdk/databinding/IntercomRowComposeViewBinding;", "binding", "Lio/intercom/android/sdk/databinding/IntercomRowComposeViewBinding;", "getBinding", "()Lio/intercom/android/sdk/databinding/IntercomRowComposeViewBinding;", "<init>", "(Lio/intercom/android/sdk/helpcenter/search/SearchResultAdapter;Lio/intercom/android/sdk/databinding/IntercomRowComposeViewBinding;)V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
    public final class SearchResultViewHolder
    extends SearchResultBaseViewHolder {
        @NotNull
        private final IntercomRowComposeViewBinding binding;
        final SearchResultAdapter this$0;

        public SearchResultViewHolder(@NotNull SearchResultAdapter searchResultAdapter, IntercomRowComposeViewBinding intercomRowComposeViewBinding) {
            y.j(intercomRowComposeViewBinding, "binding");
            this.this$0 = searchResultAdapter;
            ComposeView composeView = intercomRowComposeViewBinding.getRoot();
            y.i(composeView, "binding.root");
            super(searchResultAdapter, (View)composeView);
            this.binding = intercomRowComposeViewBinding;
        }

        @Override
        public void bind(@NotNull ArticleSearchResultRow articleSearchResultRow) {
            y.j(articleSearchResultRow, "articleSearchResultRow");
            articleSearchResultRow = (ArticleSearchResultRow.ArticleResultRow)articleSearchResultRow;
            SearchResultAdapter searchResultAdapter = this.this$0;
            this.binding.composeView.setContent((kotlin.jvm.functions.p)ComposableLambdaKt.composableLambdaInstance((int)184851526, (boolean)true, (Object)new kotlin.jvm.functions.p<Composer, Integer, k0>((ArticleSearchResultRow.ArticleResultRow)articleSearchResultRow, searchResultAdapter){
                final ArticleSearchResultRow.ArticleResultRow $this_with;
                final SearchResultAdapter this$0;
                {
                    this.$this_with = articleResultRow;
                    this.this$0 = searchResultAdapter;
                    super(2);
                }

                @Composable
                @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                public final void invoke(@Nullable Composer composer, int n10) {
                    if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart((int)184851526, (int)n10, (int)-1, (String)"io.intercom.android.sdk.helpcenter.search.SearchResultAdapter.SearchResultViewHolder.bind.<anonymous>.<anonymous>.<anonymous> (SearchResultAdapter.kt:44)");
                        }
                        IntercomThemeKt.IntercomTheme(null, null, null, (kotlin.jvm.functions.p<? super Composer, ? super Integer, k0>)ComposableLambdaKt.composableLambda((Composer)composer, (int)-1463402000, (boolean)true, (Object)new kotlin.jvm.functions.p<Composer, Integer, k0>(this.$this_with, this.this$0){
                            final ArticleSearchResultRow.ArticleResultRow $this_with;
                            final SearchResultAdapter this$0;
                            {
                                this.$this_with = articleResultRow;
                                this.this$0 = searchResultAdapter;
                                super(2);
                            }

                            @Composable
                            @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                            public final void invoke(@Nullable Composer composer, int n10) {
                                if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                } else {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart((int)-1463402000, (int)n10, (int)-1, (String)"io.intercom.android.sdk.helpcenter.search.SearchResultAdapter.SearchResultViewHolder.bind.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchResultAdapter.kt:45)");
                                    }
                                    ArticleResultRowComponentKt.ArticleResultRowComponent(this.$this_with, this.this$0.getOnClick(), null, composer, 0, 4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }
                        }), composer, 3072, 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }));
        }

        @NotNull
        public final IntercomRowComposeViewBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2={"Lio/intercom/android/sdk/helpcenter/search/SearchResultAdapter$TeammateHelpViewHolder;", "Lio/intercom/android/sdk/helpcenter/search/SearchResultAdapter$SearchResultBaseViewHolder;", "Lio/intercom/android/sdk/helpcenter/search/SearchResultAdapter;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "articleSearchResultRow", "Lkotlin/k0;", "bind", "(Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;)V", "Lio/intercom/android/sdk/databinding/IntercomRowComposeViewBinding;", "binding", "Lio/intercom/android/sdk/databinding/IntercomRowComposeViewBinding;", "getBinding", "()Lio/intercom/android/sdk/databinding/IntercomRowComposeViewBinding;", "<init>", "(Lio/intercom/android/sdk/helpcenter/search/SearchResultAdapter;Lio/intercom/android/sdk/databinding/IntercomRowComposeViewBinding;)V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
    public final class TeammateHelpViewHolder
    extends SearchResultBaseViewHolder {
        @NotNull
        private final IntercomRowComposeViewBinding binding;
        final SearchResultAdapter this$0;

        public TeammateHelpViewHolder(@NotNull SearchResultAdapter searchResultAdapter, IntercomRowComposeViewBinding intercomRowComposeViewBinding) {
            y.j(intercomRowComposeViewBinding, "binding");
            this.this$0 = searchResultAdapter;
            ComposeView composeView = intercomRowComposeViewBinding.getRoot();
            y.i(composeView, "binding.root");
            super(searchResultAdapter, (View)composeView);
            this.binding = intercomRowComposeViewBinding;
        }

        @Override
        public void bind(@NotNull ArticleSearchResultRow articleSearchResultRow) {
            y.j(articleSearchResultRow, "articleSearchResultRow");
            articleSearchResultRow = (ArticleSearchResultRow.TeammateHelpRow)articleSearchResultRow;
            this.binding.composeView.setContent((kotlin.jvm.functions.p)ComposableLambdaKt.composableLambdaInstance((int)133601252, (boolean)true, (Object)new kotlin.jvm.functions.p<Composer, Integer, k0>((ArticleSearchResultRow.TeammateHelpRow)articleSearchResultRow){
                final ArticleSearchResultRow.TeammateHelpRow $this_with;
                {
                    this.$this_with = teammateHelpRow;
                    super(2);
                }

                @Composable
                @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                public final void invoke(@Nullable Composer composer, int n10) {
                    if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart((int)133601252, (int)n10, (int)-1, (String)"io.intercom.android.sdk.helpcenter.search.SearchResultAdapter.TeammateHelpViewHolder.bind.<anonymous>.<anonymous>.<anonymous> (SearchResultAdapter.kt:29)");
                        }
                        IntercomThemeKt.IntercomTheme(null, null, null, (kotlin.jvm.functions.p<? super Composer, ? super Integer, k0>)ComposableLambdaKt.composableLambda((Composer)composer, (int)-1443588870, (boolean)true, (Object)new kotlin.jvm.functions.p<Composer, Integer, k0>(this.$this_with){
                            final ArticleSearchResultRow.TeammateHelpRow $this_with;
                            {
                                this.$this_with = teammateHelpRow;
                                super(2);
                            }

                            @Composable
                            @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                            public final void invoke(@Nullable Composer composer, int n10) {
                                if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                } else {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart((int)-1443588870, (int)n10, (int)-1, (String)"io.intercom.android.sdk.helpcenter.search.SearchResultAdapter.TeammateHelpViewHolder.bind.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchResultAdapter.kt:30)");
                                    }
                                    TeamPresenceComponentKt.TeamPresenceComponent(this.$this_with.getTeamPresenceState(), false, null, composer, 56, 4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }
                        }), composer, 3072, 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }));
        }

        @NotNull
        public final IntercomRowComposeViewBinding getBinding() {
            return this.binding;
        }
    }
}


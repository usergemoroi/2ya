/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.lifecycle.ViewModel
 *  androidx.lifecycle.ViewModelKt
 *  androidx.lifecycle.ViewModelProvider
 *  androidx.lifecycle.ViewModelProvider$Factory
 *  androidx.lifecycle.ViewModelStoreOwner
 *  androidx.lifecycle.n
 *  androidx.lifecycle.viewmodel.CreationExtras
 *  kotlin.collections.t
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.d
 *  kotlin.jvm.functions.p
 *  kotlin.jvm.functions.q
 *  kotlin.reflect.KClass
 *  kotlinx.coroutines.flow.b0
 *  kotlinx.coroutines.flow.c0
 *  kotlinx.coroutines.flow.q0
 *  kotlinx.coroutines.m0
 */
package io.intercom.android.sdk.helpcenter.search;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.component.TeammateHelpKt;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchState;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2$invokeSuspend$;
import io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.r;
import kotlin.reflect.KClass;
import kotlin.v;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.flow.b0;
import kotlinx.coroutines.flow.c0;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.i0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.s0;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 A2\u00020\u0001:\u0001ABC\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010%\u001a\u00020\u0012\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010.\u001a\u00020-\u00a2\u0006\u0004\b?\u0010@J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007\u00a2\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0002\u00a2\u0006\u0004\b\u001a\u0010\u0004J\r\u0010\u001b\u001a\u00020\u0002\u00a2\u0006\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b2\u00103R\u001d\u00105\u001a\b\u0012\u0004\u0012\u000201048\u0006\u00a2\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00160;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b>\u0010&\u00a8\u0006B"}, d2={"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlin/k0;", "updateTeammateHelpRow", "()V", "", "errorCode", "sendFailedSearchMetric", "(Ljava/lang/Integer;)V", "", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;", "searchResponses", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "transformToUiModel", "(Ljava/util/List;)Ljava/util/List;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow$TeammateHelpRow;", "teammateHelpRow", "()Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow$TeammateHelpRow;", "", "shouldAddSendMessageRow", "()Z", "Lkotlinx/coroutines/flow/h;", "", "textChanged", "searchForArticles", "(Lkotlinx/coroutines/flow/h;)V", "addTeammateHelpRow", "sendClickOnSearchResultMetric", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "helpCenterApi", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricTracker", "Lio/intercom/android/sdk/metrics/MetricTracker;", "isFromSearchBrowse", "Z", "Lkotlinx/coroutines/m0;", "dispatcher", "Lkotlinx/coroutines/m0;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "commonRepository", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "Lkotlinx/coroutines/flow/c0;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "_state", "Lkotlinx/coroutines/flow/c0;", "Lkotlinx/coroutines/flow/q0;", "state", "Lkotlinx/coroutines/flow/q0;", "getState", "()Lkotlinx/coroutines/flow/q0;", "lastSearchedInput", "Ljava/lang/String;", "Lkotlinx/coroutines/flow/b0;", "searchInput", "Lkotlinx/coroutines/flow/b0;", "hasClickedAtLeastOneArticle", "<init>", "(Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Lio/intercom/android/sdk/identity/AppConfig;Lio/intercom/android/sdk/metrics/MetricTracker;ZLkotlinx/coroutines/m0;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/m5/data/CommonRepository;)V", "Companion", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nArticleSearchViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticleSearchViewModel.kt\nio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,275:1\n2624#2,3:276\n819#2:279\n847#2,2:280\n1549#2:282\n1620#2,2:283\n1622#2:286\n1#3:285\n*S KotlinDebug\n*F\n+ 1 ArticleSearchViewModel.kt\nio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel\n*L\n150#1:276,3\n158#1:279\n158#1:280,2\n214#1:282\n214#1:283,2\n214#1:286\n*E\n"})
public final class ArticleSearchViewModel
extends ViewModel {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final c0<ArticleSearchState> _state;
    @NotNull
    private final AppConfig appConfig;
    @NotNull
    private final CommonRepository commonRepository;
    @NotNull
    private final m0 dispatcher;
    private boolean hasClickedAtLeastOneArticle;
    @NotNull
    private final HelpCenterApi helpCenterApi;
    @NotNull
    private final IntercomDataLayer intercomDataLayer;
    private final boolean isFromSearchBrowse;
    @NotNull
    private String lastSearchedInput;
    @NotNull
    private final MetricTracker metricTracker;
    @NotNull
    private final b0<String> searchInput;
    @NotNull
    private final kotlinx.coroutines.flow.q0<ArticleSearchState> state;

    public ArticleSearchViewModel(@NotNull HelpCenterApi c04, @NotNull AppConfig appConfig, @NotNull MetricTracker metricTracker, boolean bl2, @NotNull m0 m02, @NotNull IntercomDataLayer intercomDataLayer, @NotNull CommonRepository commonRepository) {
        y.j(c04, "helpCenterApi");
        y.j(appConfig, "appConfig");
        y.j(metricTracker, "metricTracker");
        y.j(m02, "dispatcher");
        y.j(intercomDataLayer, "intercomDataLayer");
        y.j(commonRepository, "commonRepository");
        this.helpCenterApi = c04;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.isFromSearchBrowse = bl2;
        this.dispatcher = m02;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        c04 = s0.a(ArticleSearchState.Initial.INSTANCE);
        this._state = c04;
        this.state = j.c(c04);
        this.lastSearchedInput = "";
        this.searchInput = i0.b(0, 0, null, 7, null);
        kotlinx.coroutines.i.d(ViewModelKt.getViewModelScope((ViewModel)this), (g)m02, null, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<q0, d<? super k0>, Object>(this, null){
            int label;
            final ArticleSearchViewModel this$0;
            {
                this.this$0 = articleSearchViewModel;
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

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Nullable
            public final Object invokeSuspend(@NotNull Object object) {
                Object object2 = b.f();
                int n10 = this.label;
                if (n10 != 0) {
                    if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    v.b(object);
                    return k0.a;
                } else {
                    v.b(object);
                    h<ArticleSearchState> h14 = new h<ArticleSearchState>((h)new h<NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>>(j.Z(this.this$0.searchInput, new q<i<? super kotlin.t<? extends NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>, ? extends String>>, String, d<? super k0>, Object>(null, this.this$0){
                        private Object L$0;
                        Object L$1;
                        int label;
                        final ArticleSearchViewModel this$0;
                        {
                            this.this$0 = articleSearchViewModel;
                            super(3, d14);
                        }

                        /*
                         * Ignored method signature, as it can't be verified against descriptor
                         */
                        @Nullable
                        public final Object invoke(@NotNull i i14, Object object, @Nullable d object2) {
                            object2 = new /* invalid duplicate definition of identical inner class */;
                            object2.L$0 = i14;
                            object2.L$1 = object;
                            return object2.invokeSuspend(k0.a);
                        }

                        @Nullable
                        public final Object invokeSuspend(@NotNull Object object) {
                            block5: {
                                i i14;
                                String string2;
                                Object object2;
                                block6: {
                                    block2: {
                                        block3: {
                                            block4: {
                                                object2 = b.f();
                                                int n10 = this.label;
                                                if (n10 == 0) break block2;
                                                if (n10 == 1) break block3;
                                                if (n10 != 2) break block4;
                                                v.b(object);
                                                break block5;
                                            }
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        string2 = (String)this.L$1;
                                        i14 = (i)this.L$0;
                                        v.b(object);
                                        break block6;
                                    }
                                    v.b(object);
                                    i14 = (i)this.L$0;
                                    string2 = (String)this.L$1;
                                    HelpCenterApi helpCenterApi = ArticleSearchViewModel.access$getHelpCenterApi$p(this.this$0);
                                    object = ArticleSearchViewModel.access$isFromSearchBrowse$p(this.this$0) ? "search_browse" : null;
                                    this.L$0 = i14;
                                    this.L$1 = string2;
                                    this.label = 1;
                                    object = HelpCenterApi.DefaultImpls.searchForArticles$default(helpCenterApi, string2, object, null, (d)((Object)this), 4, null);
                                    if (object == object2) {
                                        return object2;
                                    }
                                }
                                object = j.G(new kotlin.t<Object, String>(object, string2));
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 2;
                                if (j.w(i14, object, (d<? super k0>)((Object)this)) == object2) {
                                    return object2;
                                }
                            }
                            return k0.a;
                        }
                    }), this.this$0){
                        final h $this_unsafeTransform$inlined;
                        final ArticleSearchViewModel this$0;
                        {
                            this.$this_unsafeTransform$inlined = h14;
                            this.this$0 = articleSearchViewModel;
                        }

                        @Nullable
                        public Object collect(@NotNull i object, @NotNull d d14) {
                            if ((object = this.$this_unsafeTransform$inlined.collect(new i((i)object, this.this$0){
                                final i $this_unsafeFlow;
                                final ArticleSearchViewModel this$0;
                                {
                                    this.$this_unsafeFlow = i14;
                                    this.this$0 = articleSearchViewModel;
                                }

                                /*
                                 * Unable to fully structure code
                                 * Could not resolve type clashes
                                 */
                                @Nullable
                                public final Object emit(Object var1_1, @NotNull d var2_2) {
                                    if (!(var2_2 /* !! */  instanceof 1$invokeSuspend$$inlined$map$1$2$1)) ** GOTO lbl-1000
                                    var4_3 /* !! */  = var2_2 /* !! */ ;
                                    var3_4 = var4_3 /* !! */ .label;
                                    if ((var3_4 & -2147483648) != 0) {
                                        var4_3 /* !! */ .label = var3_4 + -2147483648;
                                        var2_2 /* !! */  = var4_3 /* !! */ ;
                                    } else // 2 sources

                                    {
                                        var2_2 /* !! */  = new kotlin.coroutines.jvm.internal.d(this, var2_2 /* !! */ ){
                                            Object L$0;
                                            int label;
                                            Object result;
                                            final 1$invokeSuspend$$inlined$map$1$2 this$0;
                                            {
                                                this.this$0 = var1_1;
                                                super(d14);
                                            }

                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object object) {
                                                this.result = object;
                                                this.label |= Integer.MIN_VALUE;
                                                return this.this$0.emit((Object)null, (d)((Object)this));
                                            }
                                        };
                                    }
                                    var5_5 = var2_2 /* !! */ .result;
                                    var4_3 /* !! */  = b.f();
                                    var3_4 = var2_2 /* !! */ .label;
                                    if (var3_4 == 0) ** GOTO lbl17
                                    if (var3_4 == 1) {
                                        v.b(var5_5);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl17:

                                        v.b(var5_5);
                                        var5_5 = this.$this_unsafeFlow;
                                        var1_1 = (kotlin.t)var1_1;
                                        ArticleSearchViewModel.access$setLastSearchedInput$p(this.this$0, (String)var1_1.d());
                                        var1_1 = var1_1.c();
                                        var2_2 /* !! */ .label = 1;
                                        if (var5_5.emit(var1_1, var2_2 /* !! */ ) == var4_3 /* !! */ ) {
                                            return var4_3 /* !! */ ;
                                        }
                                    }
                                    return k0.a;
                                }
                            }, d14)) == b.f()) {
                                return object;
                            }
                            return k0.a;
                        }
                    }, this.this$0){
                        final h $this_unsafeTransform$inlined;
                        final ArticleSearchViewModel this$0;
                        {
                            this.$this_unsafeTransform$inlined = h14;
                            this.this$0 = articleSearchViewModel;
                        }

                        @Nullable
                        public Object collect(@NotNull i object, @NotNull d d14) {
                            if ((object = this.$this_unsafeTransform$inlined.collect(new i((i)object, this.this$0){
                                final i $this_unsafeFlow;
                                final ArticleSearchViewModel this$0;
                                {
                                    this.$this_unsafeFlow = i14;
                                    this.this$0 = articleSearchViewModel;
                                }

                                /*
                                 * Unable to fully structure code
                                 */
                                @Nullable
                                public final Object emit(Object var1_1, @NotNull d var2_2) {
                                    block18: {
                                        block14: {
                                            block16: {
                                                block17: {
                                                    block15: {
                                                        block11: {
                                                            block12: {
                                                                block13: {
                                                                    if (!(var2_2 instanceof 1$invokeSuspend$$inlined$map$2$2$1)) ** GOTO lbl-1000
                                                                    var5_3 = var2_2;
                                                                    var3_4 = var5_3.label;
                                                                    if ((var3_4 & -2147483648) != 0) {
                                                                        var5_3.label = var3_4 + -2147483648;
                                                                    } else // 2 sources

                                                                    {
                                                                        var5_3 = new kotlin.coroutines.jvm.internal.d(this, (d)var2_2){
                                                                            Object L$0;
                                                                            Object L$1;
                                                                            Object L$2;
                                                                            int label;
                                                                            Object result;
                                                                            final 1$invokeSuspend$$inlined$map$2$2 this$0;
                                                                            {
                                                                                this.this$0 = var1_1;
                                                                                super(d14);
                                                                            }

                                                                            @Nullable
                                                                            public final Object invokeSuspend(@NotNull Object object) {
                                                                                this.result = object;
                                                                                this.label |= Integer.MIN_VALUE;
                                                                                return this.this$0.emit((Object)null, (d)((Object)this));
                                                                            }
                                                                        };
                                                                    }
                                                                    var7_5 = var5_3.result;
                                                                    var9_6 = b.f();
                                                                    var3_4 = var5_3.label;
                                                                    if (var3_4 == 0) break block11;
                                                                    if (var3_4 == 1) break block12;
                                                                    if (var3_4 != 2) break block13;
                                                                    v.b(var7_5);
                                                                    break block14;
                                                                }
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            var2_2 = (ArticleViewState.TeamPresenceState)var5_3.L$2;
                                                            var1_1 = (i)var5_3.L$1;
                                                            var6_7 = var5_3.L$0;
                                                            v.b(var7_5);

                                                        }
                                                        v.b(var7_5);
                                                        var2_2 = this.$this_unsafeFlow;
                                                        var1_1 = (NetworkResponse)var1_1;
                                                        if (!(var1_1 instanceof NetworkResponse.ServerError)) break block15;
                                                        ArticleSearchViewModel.access$sendFailedSearchMetric(this.this$0, kotlin.coroutines.jvm.internal.b.d(((NetworkResponse.ServerError)var1_1).getCode()));
                                                        var1_1 = ArticleSearchState.Error.INSTANCE;
                                                        break block16;
                                                    }
                                                    if (!(var1_1 instanceof NetworkResponse.ClientError) && !(var1_1 instanceof NetworkResponse.NetworkError)) break block17;
                                                    ArticleSearchViewModel.sendFailedSearchMetric$default(this.this$0, null, 1, null);
                                                    var1_1 = ArticleSearchState.Error.INSTANCE;
                                                    break block16;
                                                }
                                                if (!(var1_1 instanceof NetworkResponse.Success)) break block18;
                                                if (((Collection)(var1_1 = (List)((NetworkResponse.Success)var1_1).getBody())).isEmpty() ^ true) {
                                                    var1_1 = new ArticleSearchState.Content(ArticleSearchViewModel.access$transformToUiModel(this.this$0, (List)var1_1));
                                                } else if (ArticleSearchViewModel.access$shouldAddSendMessageRow(this.this$0)) {
                                                    var6_7 = ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState();
                                                    var1_1 = ArticleSearchViewModel.access$getAppConfig$p(this.this$0);
                                                    var4_8 = ArticleSearchViewModel.access$isFromSearchBrowse$p(this.this$0);
                                                    var8_9 = TeammateHelpKt.computeViewState("", (ArticleViewState.TeamPresenceState)var6_7, (TeamPresence)ArticleSearchViewModel.access$getIntercomDataLayer$p(this.this$0).getTeamPresence().getValue(), (AppConfig)var1_1, "search_results", var4_8);
                                                    var1_1 = ArticleSearchViewModel.access$getCommonRepository$p(this.this$0);
                                                    var5_3.L$0 = this;
                                                    var5_3.L$1 = var2_2;
                                                    var5_3.L$2 = var8_9;
                                                    var5_3.label = 1;
                                                    var7_5 = var1_1.openMessenger((d<? super OpenMessengerResponse>)var5_3);
                                                    if (var7_5 == var9_6) {
                                                        return var9_6;
                                                    }
                                                    var6_7 = this;
                                                    var1_1 = var2_2;
                                                    var2_2 = var8_9;
lbl58:

                                                    var10_10 = (OpenMessengerResponse)var7_5;
                                                    var7_5 = var10_10 != null ? var10_10.getNewConversationData() : null;
                                                    var8_9 = var2_2;
                                                    if (var7_5 != null) {
                                                        var8_9 = ArticleViewState.TeamPresenceState.copy$default((ArticleViewState.TeamPresenceState)var2_2, null, null, null, 0, 0, 0, null, null, false, var10_10.getNewConversationData().getCta(), 511, null);
                                                    }
                                                    var6_7 = new ArticleSearchState.NoResults((ArticleViewState.TeamPresenceState)var8_9, ArticleSearchViewModel.access$getLastSearchedInput$p(var6_7.this$0));
                                                    var2_2 = var1_1;
                                                    var1_1 = var6_7;
                                                } else {
                                                    var1_1 = new ArticleSearchState.NoResultsNoTeamHelp(ArticleSearchViewModel.access$getLastSearchedInput$p(this.this$0));
                                                }
                                            }
                                            var5_3.L$0 = null;
                                            var5_3.L$1 = null;
                                            var5_3.L$2 = null;
                                            var5_3.label = 2;
                                            if (var2_2.emit(var1_1, (d<? super k0>)var5_3) == var9_6) {
                                                return var9_6;
                                            }
                                        }
                                        return k0.a;
                                    }
                                    throw new r();
                                }
                            }, d14)) == b.f()) {
                                return object;
                            }
                            return k0.a;
                        }
                    };
                    object = new i<ArticleSearchState>(this.this$0){
                        final ArticleSearchViewModel this$0;
                        {
                            this.this$0 = articleSearchViewModel;
                        }

                        @Override
                        @Nullable
                        public final Object emit(@NotNull ArticleSearchState articleSearchState, @NotNull d<? super k0> d14) {
                            this.this$0._state.setValue((Object)articleSearchState);
                            return k0.a;
                        }
                    };
                    this.label = 1;
                    if (h14.collect((i<ArticleSearchState>)object, (d<k0>)((Object)this)) != object2) return k0.a;
                    return object2;
                }
            }
        }, 2, null);
        kotlinx.coroutines.i.d(ViewModelKt.getViewModelScope((ViewModel)this), (g)m02, null, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<q0, d<? super k0>, Object>(this, null){
            int label;
            final ArticleSearchViewModel this$0;
            {
                this.this$0 = articleSearchViewModel;
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

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Nullable
            public final Object invokeSuspend(@NotNull Object object) {
                Object object2 = b.f();
                int n10 = this.label;
                if (n10 != 0) {
                    if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    v.b(object);
                    return k0.a;
                } else {
                    v.b(object);
                    object = new h<Object>(this.this$0.intercomDataLayer.getEvent()){
                        final h $this_unsafeTransform$inlined;
                        {
                            this.$this_unsafeTransform$inlined = h14;
                        }

                        @Nullable
                        public Object collect(@NotNull i object, @NotNull d d14) {
                            if ((object = this.$this_unsafeTransform$inlined.collect(new i((i)object){
                                final i $this_unsafeFlow;
                                {
                                    this.$this_unsafeFlow = i14;
                                }

                                /*
                                 * Unable to fully structure code
                                 * Could not resolve type clashes
                                 */
                                @Nullable
                                public final Object emit(Object var1_1, @NotNull d var2_2) {
                                    if (!(var2_2 /* !! */  instanceof 2$invokeSuspend$$inlined$filterIsInstance$1$2$1)) ** GOTO lbl-1000
                                    var4_3 /* !! */  = var2_2 /* !! */ ;
                                    var3_4 = var4_3 /* !! */ .label;
                                    if ((var3_4 & -2147483648) != 0) {
                                        var4_3 /* !! */ .label = var3_4 + -2147483648;
                                        var2_2 /* !! */  = var4_3 /* !! */ ;
                                    } else // 2 sources

                                    {
                                        var2_2 /* !! */  = new kotlin.coroutines.jvm.internal.d(this, var2_2 /* !! */ ){
                                            Object L$0;
                                            Object L$1;
                                            int label;
                                            Object result;
                                            final 2$invokeSuspend$$inlined$filterIsInstance$1$2 this$0;
                                            {
                                                this.this$0 = var1_1;
                                                super(d14);
                                            }

                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object object) {
                                                this.result = object;
                                                this.label |= Integer.MIN_VALUE;
                                                return this.this$0.emit((Object)null, (d)((Object)this));
                                            }
                                        };
                                    }
                                    var5_5 = var2_2 /* !! */ .result;
                                    var4_3 /* !! */  = b.f();
                                    var3_4 = var2_2 /* !! */ .label;
                                    if (var3_4 == 0) ** GOTO lbl17
                                    if (var3_4 == 1) {
                                        v.b(var5_5);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl17:

                                        v.b(var5_5);
                                        var5_5 = this.$this_unsafeFlow;
                                        if (var1_1 instanceof IntercomEvent.NewConversation) {
                                            var2_2 /* !! */ .label = 1;
                                            if (var5_5.emit(var1_1, var2_2 /* !! */ ) == var4_3 /* !! */ ) {
                                                return var4_3 /* !! */ ;
                                            }
                                        }
                                    }
                                    return k0.a;
                                }
                            }, d14)) == b.f()) {
                                return object;
                            }
                            return k0.a;
                        }
                    };
                    i<IntercomEvent.NewConversation> i14 = new i<IntercomEvent.NewConversation>(this.this$0){
                        final ArticleSearchViewModel this$0;
                        {
                            this.this$0 = articleSearchViewModel;
                        }

                        @Override
                        @Nullable
                        public final Object emit(@NotNull IntercomEvent.NewConversation newConversation, @NotNull d<? super k0> d14) {
                            this.this$0.updateTeammateHelpRow();
                            return k0.a;
                        }
                    };
                    this.label = 1;
                    if (object.collect(i14, (d<? super k0>)((Object)this)) != object2) return k0.a;
                    return object2;
                }
            }
        }, 2, null);
    }

    public /* synthetic */ ArticleSearchViewModel(HelpCenterApi helpCenterApi, AppConfig appConfig, MetricTracker metricTracker, boolean bl2, m0 m02, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, int n10, p p14) {
        if ((n10 & 8) != 0) {
            bl2 = false;
        }
        if ((n10 & 0x10) != 0) {
            m02 = g1.b();
        }
        this(helpCenterApi, appConfig, metricTracker, bl2, m02, intercomDataLayer, commonRepository);
    }

    public static final /* synthetic */ AppConfig access$getAppConfig$p(ArticleSearchViewModel articleSearchViewModel) {
        return articleSearchViewModel.appConfig;
    }

    public static final /* synthetic */ CommonRepository access$getCommonRepository$p(ArticleSearchViewModel articleSearchViewModel) {
        return articleSearchViewModel.commonRepository;
    }

    public static final /* synthetic */ HelpCenterApi access$getHelpCenterApi$p(ArticleSearchViewModel articleSearchViewModel) {
        return articleSearchViewModel.helpCenterApi;
    }

    public static final /* synthetic */ String access$getLastSearchedInput$p(ArticleSearchViewModel articleSearchViewModel) {
        return articleSearchViewModel.lastSearchedInput;
    }

    public static final /* synthetic */ MetricTracker access$getMetricTracker$p(ArticleSearchViewModel articleSearchViewModel) {
        return articleSearchViewModel.metricTracker;
    }

    public static final /* synthetic */ boolean access$isFromSearchBrowse$p(ArticleSearchViewModel articleSearchViewModel) {
        return articleSearchViewModel.isFromSearchBrowse;
    }

    public static final /* synthetic */ void access$sendFailedSearchMetric(ArticleSearchViewModel articleSearchViewModel, Integer n10) {
        articleSearchViewModel.sendFailedSearchMetric(n10);
    }

    public static final /* synthetic */ void access$setHasClickedAtLeastOneArticle$p(ArticleSearchViewModel articleSearchViewModel, boolean bl2) {
        articleSearchViewModel.hasClickedAtLeastOneArticle = bl2;
    }

    public static final /* synthetic */ void access$setLastSearchedInput$p(ArticleSearchViewModel articleSearchViewModel, String string2) {
        articleSearchViewModel.lastSearchedInput = string2;
    }

    public static final /* synthetic */ boolean access$shouldAddSendMessageRow(ArticleSearchViewModel articleSearchViewModel) {
        return articleSearchViewModel.shouldAddSendMessageRow();
    }

    public static final /* synthetic */ ArticleSearchResultRow.TeammateHelpRow access$teammateHelpRow(ArticleSearchViewModel articleSearchViewModel) {
        return articleSearchViewModel.teammateHelpRow();
    }

    public static final /* synthetic */ List access$transformToUiModel(ArticleSearchViewModel articleSearchViewModel, List list) {
        return articleSearchViewModel.transformToUiModel(list);
    }

    private final void sendFailedSearchMetric(Integer object) {
        MetricTracker metricTracker = this.metricTracker;
        object = object != null ? ((Integer)object).toString() : null;
        metricTracker.failedHelpCenter("help_center", "search_results", (String)object, this.isFromSearchBrowse);
    }

    static /* synthetic */ void sendFailedSearchMetric$default(ArticleSearchViewModel articleSearchViewModel, Integer n10, int n13, Object object) {
        if ((n13 & 1) != 0) {
            n10 = null;
        }
        articleSearchViewModel.sendFailedSearchMetric(n10);
    }

    private final boolean shouldAddSendMessageRow() {
        return AppConfigExtensionsKt.canStartNewConversation(this.appConfig);
    }

    private final ArticleSearchResultRow.TeammateHelpRow teammateHelpRow() {
        ArticleViewState.TeamPresenceState teamPresenceState = ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState();
        AppConfig appConfig = this.appConfig;
        boolean bl2 = this.isFromSearchBrowse;
        return new ArticleSearchResultRow.TeammateHelpRow(TeammateHelpKt.computeViewState("", teamPresenceState, (TeamPresence)this.intercomDataLayer.getTeamPresence().getValue(), appConfig, "search_results", bl2));
    }

    private final List<ArticleSearchResultRow> transformToUiModel(List<HelpCenterArticleSearchResponse> object) {
        object = (Iterable)object;
        ArrayList<ArticleSearchResultRow.ArticleResultRow> arrayList = new ArrayList<ArticleSearchResultRow.ArticleResultRow>(t.x(object, (int)10));
        Iterator<HelpCenterArticleSearchResponse> iterator = object.iterator();
        while (iterator.hasNext()) {
            HelpCenterArticleSearchResponse helpCenterArticleSearchResponse = iterator.next();
            HelpCenterArticleSearchResponse.Highlight highlight = helpCenterArticleSearchResponse.getHighlight();
            String string2 = helpCenterArticleSearchResponse.getArticleId();
            String string3 = highlight.getTitle();
            object = string3;
            if (string3.length() == 0) {
                object = helpCenterArticleSearchResponse.getTitle();
            }
            string3 = highlight.getSummary();
            int n10 = highlight.getSummary().length() == 0 ? 8 : 0;
            arrayList.add(new ArticleSearchResultRow.ArticleResultRow(string2, (String)object, string3, n10));
        }
        object = t.h1(arrayList);
        if (this.shouldAddSendMessageRow() && this.hasClickedAtLeastOneArticle) {
            ((Collection)object).add(this.teammateHelpRow());
        }
        return object;
    }

    private final void updateTeammateHelpRow() {
        Object object = (ArticleSearchState)this._state.getValue();
        if (this.shouldAddSendMessageRow()) {
            if (object instanceof ArticleSearchState.Content) {
                ArticleSearchState.Content content = (ArticleSearchState.Content)object;
                if (!((object = (Iterable)content.getSearchResults()) instanceof Collection) || !((Collection)object).isEmpty()) {
                    object = object.iterator();
                    while (object.hasNext()) {
                        if (!((ArticleSearchResultRow)object.next() instanceof ArticleSearchResultRow.TeammateHelpRow)) continue;
                        break;
                    }
                } else {
                    this._state.setValue((Object)content.copy(t.N0((Collection)content.getSearchResults(), (Object)this.teammateHelpRow())));
                }
            }
        } else {
            ArticleSearchState articleSearchState;
            c0<ArticleSearchState> c04 = this._state;
            if (object instanceof ArticleSearchState.Content) {
                articleSearchState = (ArticleSearchState.Content)object;
                Iterable iterable2 = ((ArticleSearchState.Content)articleSearchState).getSearchResults();
                object = new ArrayList();
                for (Iterable iterable2 : iterable2) {
                    if ((ArticleSearchResultRow)((Object)iterable2) instanceof ArticleSearchResultRow.TeammateHelpRow) continue;
                    object.add(iterable2);
                }
                articleSearchState = ((ArticleSearchState.Content)articleSearchState).copy((List<? extends ArticleSearchResultRow>)object);
            } else {
                articleSearchState = object;
                if (object instanceof ArticleSearchState.NoResults) {
                    articleSearchState = new ArticleSearchState.NoResultsNoTeamHelp(((ArticleSearchState.NoResults)object).getSearchTerm());
                }
            }
            c04.setValue((Object)articleSearchState);
        }
    }

    public final void addTeammateHelpRow() {
        kotlinx.coroutines.i.d(ViewModelKt.getViewModelScope((ViewModel)this), (g)this.dispatcher, null, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<q0, d<? super k0>, Object>(this, null){
            Object L$0;
            int label;
            final ArticleSearchViewModel this$0;
            {
                this.this$0 = articleSearchViewModel;
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

            /*
             * Enabled aggressive block sorting
             */
            @Nullable
            public final Object invokeSuspend(@NotNull Object object) {
                Object object2 = b.f();
                int n10 = this.label;
                if (n10 != 0) {
                    if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    object2 = (ArticleSearchState)this.L$0;
                    v.b(object);
                    object = object2;
                } else {
                    v.b(object);
                    ArticleSearchViewModel.access$setHasClickedAtLeastOneArticle$p(this.this$0, true);
                    if (!ArticleSearchViewModel.access$shouldAddSendMessageRow(this.this$0)) return k0.a;
                    object = (ArticleSearchState)ArticleSearchViewModel.access$get_state$p(this.this$0).getValue();
                    if (!(object instanceof ArticleSearchState.Content)) return k0.a;
                    Object object3 = ((ArticleSearchState.Content)object).getSearchResults();
                    if (!(object3 instanceof Collection) || !((Collection)object3).isEmpty()) {
                        object3 = object3.iterator();
                        while (object3.hasNext()) {
                            if (!((ArticleSearchResultRow)object3.next() instanceof ArticleSearchResultRow.TeammateHelpRow)) continue;
                            return k0.a;
                        }
                    }
                    this.L$0 = object;
                    this.label = 1;
                    if (a1.b(2000L, (d<? super k0>)((Object)this)) == object2) {
                        return object2;
                    }
                }
                object2 = ArticleSearchViewModel.access$get_state$p(this.this$0);
                object = (ArticleSearchState.Content)object;
                object2.setValue((Object)((ArticleSearchState.Content)object).copy(t.N0((Collection)((ArticleSearchState.Content)object).getSearchResults(), (Object)ArticleSearchViewModel.access$teammateHelpRow(this.this$0))));
                return k0.a;
            }
        }, 2, null);
    }

    @NotNull
    public final kotlinx.coroutines.flow.q0<ArticleSearchState> getState() {
        return this.state;
    }

    @FlowPreview
    public final void searchForArticles(@NotNull h<String> h14) {
        y.j(h14, "textChanged");
        kotlinx.coroutines.i.d(ViewModelKt.getViewModelScope((ViewModel)this), (g)this.dispatcher, null, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<q0, d<? super k0>, Object>(h14, this, null){
            final h<String> $textChanged;
            int label;
            final ArticleSearchViewModel this$0;
            {
                this.$textChanged = h14;
                this.this$0 = articleSearchViewModel;
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

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Nullable
            public final Object invokeSuspend(@NotNull Object h14) {
                Object object = b.f();
                int n10 = this.label;
                if (n10 != 0) {
                    if (n10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    v.b(h14);
                    return k0.a;
                } else {
                    v.b(h14);
                    h14 = j.P(j.p(this.$textChanged, 400L), new kotlin.jvm.functions.p<i<? super String>, d<? super k0>, Object>(this.this$0, null){
                        int label;
                        final ArticleSearchViewModel this$0;
                        {
                            this.this$0 = articleSearchViewModel;
                            super(2, d14);
                        }

                        @NotNull
                        public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
                            return new /* invalid duplicate definition of identical inner class */;
                        }

                        @Nullable
                        public final Object invoke(@NotNull i<? super String> i14, @Nullable d<? super k0> d14) {
                            return ((Object)this.create(i14, d14)).invokeSuspend(k0.a);
                        }

                        @Nullable
                        public final Object invokeSuspend(@NotNull Object object) {
                            b.f();
                            if (this.label == 0) {
                                v.b(object);
                                ArticleSearchViewModel.access$getMetricTracker$p(this.this$0).searchedNativeHelpCenter(ArticleSearchViewModel.access$isFromSearchBrowse$p(this.this$0));
                                return k0.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    });
                    i<String> i14 = new i<String>(this.this$0){
                        final ArticleSearchViewModel this$0;
                        {
                            this.this$0 = articleSearchViewModel;
                        }

                        @Nullable
                        public final Object emit(@NotNull String object, @NotNull d<? super k0> d14) {
                            if (object.length() == 0) {
                                ArticleSearchViewModel.access$get_state$p(this.this$0).setValue((Object)ArticleSearchState.Initial.INSTANCE);
                                return k0.a;
                            }
                            ArticleSearchViewModel.access$get_state$p(this.this$0).setValue((Object)ArticleSearchState.Loading.INSTANCE);
                            object = ArticleSearchViewModel.access$getSearchInput$p(this.this$0).emit(object, d14);
                            if (object == b.f()) {
                                return object;
                            }
                            return k0.a;
                        }
                    };
                    this.label = 1;
                    if (h14.collect((i<? super String>)i14, (d<k0>)((Object)this)) != object) return k0.a;
                    return object;
                }
            }
        }, 2, null);
    }

    public final void sendClickOnSearchResultMetric() {
        kotlinx.coroutines.i.d(ViewModelKt.getViewModelScope((ViewModel)this), (g)this.dispatcher, null, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<q0, d<? super k0>, Object>(this, null){
            int label;
            final ArticleSearchViewModel this$0;
            {
                this.this$0 = articleSearchViewModel;
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
                b.f();
                if (this.label == 0) {
                    v.b(object);
                    if (ArticleSearchViewModel.access$get_state$p(this.this$0).getValue() instanceof ArticleSearchState.Content) {
                        ArticleSearchViewModel.access$getMetricTracker$p(this.this$0).openedNativeHelpCenterSearchResult(ArticleSearchViewModel.access$isFromSearchBrowse$p(this.this$0), ArticleSearchViewModel.access$getLastSearchedInput$p(this.this$0));
                    }
                    return k0.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, 2, null);
    }

    @Metadata(d1={"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003*\u0001\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2={"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel$Companion;", "", "()V", "create", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "helpCenterApi", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "isFromSearchBrowse", "", "factory", "io/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel$Companion$factory$1", "(Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Z)Lio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel$Companion$factory$1;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        private final factory.1 factory(HelpCenterApi helpCenterApi, boolean bl2) {
            return new ViewModelProvider.Factory(helpCenterApi, bl2){
                final HelpCenterApi $helpCenterApi;
                final boolean $isFromSearchBrowse;
                {
                    this.$helpCenterApi = helpCenterApi;
                    this.$isFromSearchBrowse = bl2;
                }

                @NotNull
                public <T extends ViewModel> T create(@NotNull Class<T> object) {
                    y.j(object, "modelClass");
                    IntercomDataLayer intercomDataLayer = Injector.get().getDataLayer();
                    object = this.$helpCenterApi;
                    AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                    y.i(appConfig, "get().appConfigProvider.get()");
                    MetricTracker metricTracker = Injector.get().getMetricTracker();
                    y.i(metricTracker, "get().metricTracker");
                    boolean bl2 = this.$isFromSearchBrowse;
                    y.i(intercomDataLayer, "intercomDataLayer");
                    MessengerApi messengerApi = Injector.get().getMessengerApi();
                    y.i(messengerApi, "get().messengerApi");
                    return (T)((Object)new ArticleSearchViewModel((HelpCenterApi)object, appConfig, metricTracker, bl2, null, intercomDataLayer, new CommonRepository(messengerApi, intercomDataLayer), 16, null));
                }

                public /* synthetic */ ViewModel create(Class clazz, CreationExtras creationExtras) {
                    return n.b((ViewModelProvider.Factory)this, (Class)clazz, (CreationExtras)creationExtras);
                }

                public /* synthetic */ ViewModel create(KClass kClass, CreationExtras creationExtras) {
                    return n.c((ViewModelProvider.Factory)this, (KClass)kClass, (CreationExtras)creationExtras);
                }
            };
        }

        @NotNull
        public final ArticleSearchViewModel create(@NotNull ViewModelStoreOwner viewModelStoreOwner, @NotNull HelpCenterApi helpCenterApi, boolean bl2) {
            y.j(viewModelStoreOwner, "owner");
            y.j(helpCenterApi, "helpCenterApi");
            return (ArticleSearchViewModel)new ViewModelProvider(viewModelStoreOwner, (ViewModelProvider.Factory)this.factory(helpCenterApi, bl2)).get(ArticleSearchViewModel.class);
        }
    }
}


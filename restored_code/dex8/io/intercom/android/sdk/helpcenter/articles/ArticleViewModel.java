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
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.d
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.functions.p
 *  kotlin.reflect.KClass
 *  kotlinx.coroutines.flow.c0
 *  kotlinx.coroutines.flow.q0
 *  kotlinx.coroutines.m0
 */
package io.intercom.android.sdk.helpcenter.articles;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.articles.ArticleWebViewListener;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewModel;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1$invokeSuspend$;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.component.TeammateHelpKt;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.r;
import kotlin.reflect.KClass;
import kotlin.v;
import kotlinx.coroutines.flow.c0;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.s0;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001JBq\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010G\u001a\u00020\u0003\u0012\b\b\u0002\u0010/\u001a\u00020\u000e\u0012\b\b\u0002\u00101\u001a\u00020\u000e\u0012\b\b\u0002\u00103\u001a\u000202\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00109\u001a\u000208\u0012\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0;\u00a2\u0006\u0004\bH\u0010IJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\b\u00a2\u0006\u0004\b\u001f\u0010\u0018J\r\u0010 \u001a\u00020\b\u00a2\u0006\u0004\b \u0010\u0018J\r\u0010!\u001a\u00020\b\u00a2\u0006\u0004\b!\u0010\u0018J\u0017\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b#\u0010\u0016R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b1\u00100R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b9\u0010:R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b@\u0010AR\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020?0B8\u0006\u00a2\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010\u0005\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0005\u0010(R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0004\u0010(\u00a8\u0006K"}, d2={"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/intercom/android/sdk/articles/ArticleWebViewListener;", "", "articleId", "articleContentId", "", "reactionIndex", "Lkotlin/k0;", "sendReactionToServer", "(Ljava/lang/String;Ljava/lang/String;I)V", "errorCode", "sendFailedMetric", "(Ljava/lang/Integer;)V", "", "shouldAddSendMessageRow", "()Z", "Lio/intercom/android/sdk/models/Conversation;", "conversation", "updateTeamPresence", "(Lio/intercom/android/sdk/models/Conversation;)V", "fragmentLoaded", "(Ljava/lang/String;)V", "onArticleFinishedLoading", "()V", "onArticleLoadingError", "articleNotFound", "onArticleStartedLoading", "y", "scrollArticleViewTo", "(I)V", "sadReactionTapped", "happyReactionTapped", "neutralReactionTapped", "value", "articleContentIdFetched", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "helpCenterApi", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "baseUrl", "Ljava/lang/String;", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricTracker", "Lio/intercom/android/sdk/metrics/MetricTracker;", "isFromSearchBrowse", "Z", "shouldHideReactions", "Lkotlinx/coroutines/m0;", "dispatcher", "Lkotlinx/coroutines/m0;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "commonRepository", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "Lkotlin/Function1;", "scrollTo", "Lkotlin/jvm/functions/l;", "Lkotlinx/coroutines/flow/c0;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "_state", "Lkotlinx/coroutines/flow/c0;", "Lkotlinx/coroutines/flow/q0;", "state", "Lkotlinx/coroutines/flow/q0;", "getState", "()Lkotlinx/coroutines/flow/q0;", "metricPlace", "<init>", "(Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Ljava/lang/String;Lio/intercom/android/sdk/identity/AppConfig;Lio/intercom/android/sdk/metrics/MetricTracker;Ljava/lang/String;ZZLkotlinx/coroutines/m0;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/m5/data/CommonRepository;Lkotlin/jvm/functions/l;)V", "Companion", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class ArticleViewModel
extends ViewModel
implements ArticleWebViewListener {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int HAPPY_SERVER_INDEX = 0;
    public static final int NEUTRAL_SERVER_INDEX = 1;
    public static final int SAD_SERVER_INDEX = 2;
    @NotNull
    private final c0<ArticleViewState> _state;
    @NotNull
    private final AppConfig appConfig;
    @NotNull
    private String articleContentId;
    @NotNull
    private String articleId;
    @NotNull
    private final String baseUrl;
    @NotNull
    private final CommonRepository commonRepository;
    @NotNull
    private final m0 dispatcher;
    @NotNull
    private final HelpCenterApi helpCenterApi;
    @NotNull
    private final IntercomDataLayer intercomDataLayer;
    private final boolean isFromSearchBrowse;
    @NotNull
    private final MetricTracker metricTracker;
    @NotNull
    private final l<Integer, k0> scrollTo;
    private final boolean shouldHideReactions;
    @NotNull
    private final kotlinx.coroutines.flow.q0<ArticleViewState> state;

    public ArticleViewModel(@NotNull HelpCenterApi object, @NotNull String string2, @NotNull AppConfig appConfig, @NotNull MetricTracker metricTracker, @NotNull String string3, boolean bl2, boolean bl3, @NotNull m0 m02, @NotNull IntercomDataLayer intercomDataLayer, @NotNull CommonRepository commonRepository, @NotNull l<? super Integer, k0> l10) {
        y.j(object, "helpCenterApi");
        y.j(string2, "baseUrl");
        y.j(appConfig, "appConfig");
        y.j(metricTracker, "metricTracker");
        y.j(string3, "metricPlace");
        y.j(m02, "dispatcher");
        y.j(intercomDataLayer, "intercomDataLayer");
        y.j(commonRepository, "commonRepository");
        y.j(l10, "scrollTo");
        this.helpCenterApi = object;
        this.baseUrl = string2;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.isFromSearchBrowse = bl2;
        this.shouldHideReactions = bl3;
        this.dispatcher = m02;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        this.scrollTo = l10;
        object = s0.a(ArticleViewState.Initial.INSTANCE);
        this._state = object;
        this.state = j.c(object);
        this.articleContentId = "";
        this.articleId = "";
        if (!y.e(string3, "collection_list")) {
            object = "article";
            if (!y.e(string3, "article")) {
                if (!y.e(string3, "api")) {
                    object = "no_context";
                }
                metricTracker.openedNativeHelpCenter(string3, (String)object);
            }
        }
        kotlinx.coroutines.i.d(ViewModelKt.getViewModelScope((ViewModel)this), (g)m02, null, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<q0, d<? super k0>, Object>(this, null){
            int label;
            final ArticleViewModel this$0;
            {
                this.this$0 = articleViewModel;
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
                                    if (!(var2_2 /* !! */  instanceof 1$invokeSuspend$$inlined$filterIsInstance$1$2$1)) ** GOTO lbl-1000
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
                                            final 1$invokeSuspend$$inlined$filterIsInstance$1$2 this$0;
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
                        final ArticleViewModel this$0;
                        {
                            this.this$0 = articleViewModel;
                        }

                        @Override
                        @Nullable
                        public final Object emit(@NotNull IntercomEvent.NewConversation newConversation, @NotNull d<? super k0> d14) {
                            this.this$0.updateTeamPresence(newConversation.getConversation());
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

    public /* synthetic */ ArticleViewModel(HelpCenterApi helpCenterApi, String string2, AppConfig appConfig, MetricTracker metricTracker, String string3, boolean bl2, boolean bl3, m0 m02, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, l l10, int n10, p p14) {
        if ((n10 & 0x20) != 0) {
            bl2 = false;
        }
        if ((n10 & 0x40) != 0) {
            bl3 = false;
        }
        if ((n10 & 0x80) != 0) {
            m02 = g1.b();
        }
        this(helpCenterApi, string2, appConfig, metricTracker, string3, bl2, bl3, m02, intercomDataLayer, commonRepository, (l<? super Integer, k0>)l10);
    }

    public static final /* synthetic */ AppConfig access$getAppConfig$p(ArticleViewModel articleViewModel) {
        return articleViewModel.appConfig;
    }

    public static final /* synthetic */ String access$getArticleContentId$p(ArticleViewModel articleViewModel) {
        return articleViewModel.articleContentId;
    }

    public static final /* synthetic */ CommonRepository access$getCommonRepository$p(ArticleViewModel articleViewModel) {
        return articleViewModel.commonRepository;
    }

    public static final /* synthetic */ HelpCenterApi access$getHelpCenterApi$p(ArticleViewModel articleViewModel) {
        return articleViewModel.helpCenterApi;
    }

    public static final /* synthetic */ MetricTracker access$getMetricTracker$p(ArticleViewModel articleViewModel) {
        return articleViewModel.metricTracker;
    }

    public static final /* synthetic */ c0 access$get_state$p(ArticleViewModel articleViewModel) {
        return articleViewModel._state;
    }

    public static final /* synthetic */ boolean access$isFromSearchBrowse$p(ArticleViewModel articleViewModel) {
        return articleViewModel.isFromSearchBrowse;
    }

    public static final /* synthetic */ void access$sendReactionToServer(ArticleViewModel articleViewModel, String string2, String string3, int n10) {
        articleViewModel.sendReactionToServer(string2, string3, n10);
    }

    public static final /* synthetic */ boolean access$shouldAddSendMessageRow(ArticleViewModel articleViewModel) {
        return articleViewModel.shouldAddSendMessageRow();
    }

    private final void sendFailedMetric(Integer object) {
        MetricTracker metricTracker = this.metricTracker;
        object = object != null ? ((Integer)object).toString() : null;
        metricTracker.failedHelpCenter("help_center", "article", (String)object, this.isFromSearchBrowse);
    }

    static /* synthetic */ void sendFailedMetric$default(ArticleViewModel articleViewModel, Integer n10, int n13, Object object) {
        if ((n13 & 1) != 0) {
            n10 = null;
        }
        articleViewModel.sendFailedMetric(n10);
    }

    private final void sendReactionToServer(String string2, String string3, int n10) {
        kotlinx.coroutines.i.d(ViewModelKt.getViewModelScope((ViewModel)this), (g)this.dispatcher, null, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<q0, d<? super k0>, Object>(this, string2, n10, string3, null){
            final String $articleContentId;
            final String $articleId;
            final int $reactionIndex;
            int label;
            final ArticleViewModel this$0;
            {
                this.this$0 = articleViewModel;
                this.$articleId = string2;
                this.$reactionIndex = n10;
                this.$articleContentId = string3;
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
                    HelpCenterApi helpCenterApi = ArticleViewModel.access$getHelpCenterApi$p(this.this$0);
                    String string2 = this.$articleId;
                    n10 = this.$reactionIndex;
                    String string3 = this.$articleContentId;
                    object = ArticleViewModel.access$isFromSearchBrowse$p(this.this$0) ? "search_browse" : null;
                    this.label = 1;
                    if (HelpCenterApi.DefaultImpls.reactToArticle$default(helpCenterApi, string2, n10, string3, false, (String)object, null, (d)((Object)this), 40, null) != object2) return k0.a;
                    return object2;
                }
            }
        }, 2, null);
    }

    private final boolean shouldAddSendMessageRow() {
        boolean bl2 = AppConfigExtensionsKt.canStartNewConversation(this.appConfig) && this.appConfig.getArticleAutoReactionEnabled();
        return bl2;
    }

    private final void updateTeamPresence(Conversation object) {
        ArticleViewState.Content content;
        Object object2 = (ArticleViewState)this._state.getValue();
        if (object2 instanceof ArticleViewState.Content && (content = (ArticleViewState.Content)object2).getReactionState().getTransitionState() == R.id.sad_end) {
            c0<ArticleViewState> c04 = this._state;
            object2 = content.getTeamPresenceState();
            int n10 = R.string.intercom_continue_the_conversation;
            String string2 = ((Conversation)object).getId();
            y.i(string2, "conversation.id");
            object = ((Conversation)object).getLastParticipatingAdmin();
            y.i(object, "conversation.lastParticipatingAdmin");
            c04.setValue((Object)ArticleViewState.Content.copy$default(content, null, null, null, null, ArticleViewState.TeamPresenceState.copy$default((ArticleViewState.TeamPresenceState)object2, null, new ArticleViewState.ConversationState(string2, (LastParticipatingAdmin)object), null, n10, 0, 0, null, null, false, null, 1013, null), 15, null));
        }
    }

    public final void articleContentIdFetched(@Nullable String c04) {
        if (c04 != null) {
            this.articleContentId = c04;
            Object object = (ArticleViewState)this._state.getValue();
            if (object instanceof ArticleViewState.Content) {
                c04 = this._state;
                ArticleViewState.Content content = (ArticleViewState.Content)object;
                object = content.getReactionState();
                int n10 = this.shouldHideReactions ? 8 : 0;
                c04.setValue((Object)ArticleViewState.Content.copy$default(content, null, null, null, ArticleViewState.ReactionState.copy$default((ArticleViewState.ReactionState)object, n10, 0, 0, false, 14, null), null, 23, null));
            } else if (!y.e(object, ArticleViewState.Initial.INSTANCE)) {
                boolean bl2 = object instanceof ArticleViewState.Error;
            }
        }
    }

    @Override
    public void articleNotFound() {
        this.sendFailedMetric(404);
        this._state.setValue((Object)new ArticleViewState.Error(R.string.intercom_page_not_found, 8, this.appConfig.getPrimaryColor()));
    }

    public final void fragmentLoaded(@NotNull String string2) {
        y.j(string2, "articleId");
        this.articleId = string2;
        CharSequence charSequence = new StringBuilder();
        charSequence.append(this.baseUrl);
        charSequence.append("/articles/");
        charSequence.append(string2);
        charSequence = charSequence.toString();
        this._state.setValue((Object)new ArticleViewState.Content((String)charSequence, string2, ArticleViewState.WebViewStatus.Idle, ArticleViewState.ReactionState.Companion.getDefaultReactionState(), ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState()));
    }

    @NotNull
    public final kotlinx.coroutines.flow.q0<ArticleViewState> getState() {
        return this.state;
    }

    public final void happyReactionTapped() {
        block4: {
            block3: {
                ArticleViewState articleViewState;
                block2: {
                    articleViewState = (ArticleViewState)this._state.getValue();
                    if (!(articleViewState instanceof ArticleViewState.Content)) break block2;
                    c0<ArticleViewState> c04 = this._state;
                    articleViewState = (ArticleViewState.Content)articleViewState;
                    this.metricTracker.sentArticleReaction("reaction_happy", null, this.isFromSearchBrowse);
                    this.sendReactionToServer(((ArticleViewState.Content)articleViewState).getArticleId(), this.articleContentId, 0);
                    c04.setValue((Object)ArticleViewState.Content.copy$default((ArticleViewState.Content)articleViewState, null, null, null, ArticleViewState.ReactionState.copy$default(((ArticleViewState.Content)articleViewState).getReactionState(), 0, R.id.happy_end, 8, false, 1, null), null, 23, null));
                    break block3;
                }
                if (!y.e(articleViewState, ArticleViewState.Initial.INSTANCE) && !(articleViewState instanceof ArticleViewState.Error)) break block4;
            }
            return;
        }
        throw new r();
    }

    public final void neutralReactionTapped() {
        block4: {
            block3: {
                ArticleViewState articleViewState;
                block2: {
                    articleViewState = (ArticleViewState)this._state.getValue();
                    if (!(articleViewState instanceof ArticleViewState.Content)) break block2;
                    c0<ArticleViewState> c04 = this._state;
                    articleViewState = (ArticleViewState.Content)articleViewState;
                    this.metricTracker.sentArticleReaction("reaction_neutral", null, this.isFromSearchBrowse);
                    this.sendReactionToServer(((ArticleViewState.Content)articleViewState).getArticleId(), this.articleContentId, 1);
                    c04.setValue((Object)ArticleViewState.Content.copy$default((ArticleViewState.Content)articleViewState, null, null, null, ArticleViewState.ReactionState.copy$default(((ArticleViewState.Content)articleViewState).getReactionState(), 0, R.id.neutral_end, 8, false, 1, null), null, 23, null));
                    break block3;
                }
                if (!y.e(articleViewState, ArticleViewState.Initial.INSTANCE) && !(articleViewState instanceof ArticleViewState.Error)) break block4;
            }
            return;
        }
        throw new r();
    }

    @Override
    public void onArticleFinishedLoading() {
        this.metricTracker.viewedNativeHelpCenter("article", null, this.isFromSearchBrowse);
        ArticleViewState articleViewState = (ArticleViewState)this._state.getValue();
        if (articleViewState instanceof ArticleViewState.Content) {
            this._state.setValue((Object)ArticleViewState.Content.copy$default((ArticleViewState.Content)articleViewState, null, null, ArticleViewState.WebViewStatus.Ready, null, null, 27, null));
        } else if (!y.e(articleViewState, ArticleViewState.Initial.INSTANCE)) {
            boolean bl2 = articleViewState instanceof ArticleViewState.Error;
        }
    }

    @Override
    public void onArticleLoadingError() {
        ArticleViewModel.sendFailedMetric$default(this, null, 1, null);
        this._state.setValue((Object)new ArticleViewState.Error(R.string.intercom_something_went_wrong_try_again, 0, this.appConfig.getPrimaryColor()));
    }

    @Override
    public void onArticleStartedLoading() {
        block4: {
            block3: {
                ArticleViewState articleViewState;
                block2: {
                    articleViewState = (ArticleViewState)this._state.getValue();
                    if (!(articleViewState instanceof ArticleViewState.Content)) break block2;
                    this._state.setValue((Object)ArticleViewState.Content.copy$default((ArticleViewState.Content)articleViewState, null, null, ArticleViewState.WebViewStatus.Loading, null, null, 27, null));
                    break block3;
                }
                if (!y.e(articleViewState, ArticleViewState.Initial.INSTANCE) && !(articleViewState instanceof ArticleViewState.Error)) break block4;
            }
            return;
        }
        throw new r();
    }

    public final void sadReactionTapped() {
        kotlinx.coroutines.i.d(ViewModelKt.getViewModelScope((ViewModel)this), (g)this.dispatcher, null, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<q0, d<? super k0>, Object>(this, null){
            int I$0;
            int I$1;
            int I$2;
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final ArticleViewModel this$0;
            {
                this.this$0 = articleViewModel;
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
             * Unable to fully structure code
             */
            @Nullable
            public final Object invokeSuspend(@NotNull Object var1_1) {
                block8: {
                    block7: {
                        block6: {
                            block4: {
                                block5: {
                                    var8_2 = b.f();
                                    var2_3 = this.label;
                                    if (var2_3 == 0) break block4;
                                    if (var2_3 != 1) break block5;
                                    var3_4 = this.I$2;
                                    var2_3 = this.I$1;
                                    var4_5 = this.I$0;
                                    var7_6 = (c0)this.L$2;
                                    var6_7 = (ArticleViewState.TeamPresenceState)this.L$1;
                                    var8_2 = (ArticleViewState.Content)this.L$0;
                                    v.b(var1_1);
                                    var9_8 = var1_1;
                                    var1_1 = var6_7;
                                    var6_7 = var8_2;
                                    break block6;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v.b(var1_1);
                            var1_1 = (ArticleViewState)ArticleViewModel.access$get_state$p(this.this$0).getValue();
                            if (var1_1 instanceof ArticleViewState.Content) {
                                var7_6 = ArticleViewModel.access$get_state$p(this.this$0);
                                var9_8 = this.this$0;
                                var6_7 = (ArticleViewState.Content)var1_1;
                                ArticleViewModel.access$getMetricTracker$p((ArticleViewModel)var9_8).sentArticleReaction("reaction_sad", kotlin.coroutines.jvm.internal.b.a(ArticleViewModel.access$getAppConfig$p((ArticleViewModel)var9_8).isInboundMessages()), ArticleViewModel.access$isFromSearchBrowse$p((ArticleViewModel)var9_8));
                                ArticleViewModel.access$sendReactionToServer((ArticleViewModel)var9_8, var6_7.getArticleId(), ArticleViewModel.access$getArticleContentId$p((ArticleViewModel)var9_8), 2);
                                var4_5 = R.id.sad_end;
                                var3_4 = (int)ArticleViewModel.access$shouldAddSendMessageRow((ArticleViewModel)var9_8);
                                var2_3 = var3_4 != 0 ? 0 : 8;
                                var10_9 = var6_7.getArticleId();
                                var11_10 = var6_7.getTeamPresenceState();
                                var1_1 = ArticleViewModel.access$getAppConfig$p((ArticleViewModel)var9_8);
                                var5_11 = ArticleViewModel.access$isFromSearchBrowse$p((ArticleViewModel)var9_8);
                                var1_1 = TeammateHelpKt.computeViewState((String)var10_9, var11_10, (TeamPresence)ArticleViewModel.access$getIntercomDataLayer$p((ArticleViewModel)var9_8).getTeamPresence().getValue(), (AppConfig)var1_1, "article", var5_11);
                                var9_8 = ArticleViewModel.access$getCommonRepository$p((ArticleViewModel)var9_8);
                                this.L$0 = var6_7;
                                this.L$1 = var1_1;
                                this.L$2 = var7_6;
                                this.I$0 = var4_5;
                                this.I$1 = var2_3;
                                this.I$2 = var3_4;
                                this.label = 1;
                                var9_8 = var9_8.openMessenger((d<? super OpenMessengerResponse>)this);
                                if (var9_8 == var8_2) {
                                    return var8_2;
                                } else {

                                }
                            }
                            break block7;
                        }
                        var10_9 = (OpenMessengerResponse)var9_8;
                        var9_8 = var10_9 != null ? var10_9.getNewConversationData() : null;
                        var8_2 = var1_1;
                        if (var9_8 != null) {
                            var8_2 = ArticleViewState.TeamPresenceState.copy$default((ArticleViewState.TeamPresenceState)var1_1, null, null, null, 0, 0, 0, null, null, false, var10_9.getNewConversationData().getCta(), 511, null);
                        }
                        var1_1 = var6_7.getReactionState();
                        var5_11 = var3_4 != 0;
                        var7_6.setValue((Object)ArticleViewState.Content.copy$default((ArticleViewState.Content)var6_7, null, null, null, ArticleViewState.ReactionState.copy$default((ArticleViewState.ReactionState)var1_1, 0, var4_5, var2_3, var5_11, 1, null), (ArticleViewState.TeamPresenceState)var8_2, 7, null));
                        break block8;
                    }
                    if (!y.e(var1_1, ArticleViewState.Initial.INSTANCE)) {
                        var5_12 = var1_1 instanceof ArticleViewState.Error;
                    }
                }
                return k0.a;
            }
        }, 2, null);
    }

    @Override
    public void scrollArticleViewTo(int n10) {
        this.scrollTo.invoke((Object)n10);
    }

    @Metadata(d1={"\u0000A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010JQ\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u000b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u000b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u000b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u0017\u00a8\u0006\u001c"}, d2={"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel$Companion;", "", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "helpCenterApi", "", "baseUrl", "metricPlace", "", "isFromSearchBrowse", "shouldHideReactions", "Lkotlin/Function1;", "", "Lkotlin/k0;", "scrollTo", "io/intercom/android/sdk/helpcenter/articles/ArticleViewModel$Companion$factory$1", "factory", "(Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/l;)Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel$Companion$factory$1;", "Landroidx/lifecycle/ViewModelStoreOwner;", "owner", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "create", "(Landroidx/lifecycle/ViewModelStoreOwner;Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/l;)Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "HAPPY_SERVER_INDEX", "I", "NEUTRAL_SERVER_INDEX", "SAD_SERVER_INDEX", "<init>", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        private final factory.1 factory(HelpCenterApi helpCenterApi, String string2, String string3, boolean bl2, boolean bl3, l<? super Integer, k0> l10) {
            return new ViewModelProvider.Factory(helpCenterApi, string2, string3, bl2, bl3, l10){
                final String $baseUrl;
                final HelpCenterApi $helpCenterApi;
                final boolean $isFromSearchBrowse;
                final String $metricPlace;
                final l<Integer, k0> $scrollTo;
                final boolean $shouldHideReactions;
                {
                    this.$helpCenterApi = helpCenterApi;
                    this.$baseUrl = string2;
                    this.$metricPlace = string3;
                    this.$isFromSearchBrowse = bl2;
                    this.$shouldHideReactions = bl3;
                    this.$scrollTo = l10;
                }

                @NotNull
                public <T extends ViewModel> T create(@NotNull Class<T> object) {
                    y.j(object, "modelClass");
                    object = Injector.get().getDataLayer();
                    HelpCenterApi helpCenterApi = this.$helpCenterApi;
                    String string2 = this.$baseUrl;
                    Object object2 = Injector.get().getAppConfigProvider().get();
                    y.i(object2, "get().appConfigProvider.get()");
                    AppConfig appConfig = object2;
                    MetricTracker metricTracker = Injector.get().getMetricTracker();
                    y.i(metricTracker, "get().metricTracker");
                    String string3 = this.$metricPlace;
                    boolean bl2 = this.$isFromSearchBrowse;
                    boolean bl3 = this.$shouldHideReactions;
                    y.i(object, "intercomDataLayer");
                    object2 = Injector.get().getMessengerApi();
                    y.i(object2, "get().messengerApi");
                    return (T)new ArticleViewModel(helpCenterApi, string2, appConfig, metricTracker, string3, bl2, bl3, null, (IntercomDataLayer)object, new CommonRepository((MessengerApi)object2, (IntercomDataLayer)object), this.$scrollTo, 128, null);
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
        public final ArticleViewModel create(@NotNull ViewModelStoreOwner viewModelStoreOwner, @NotNull HelpCenterApi helpCenterApi, @NotNull String string2, @NotNull String string3, boolean bl2, boolean bl3, @NotNull l<? super Integer, k0> l10) {
            y.j(viewModelStoreOwner, "owner");
            y.j(helpCenterApi, "helpCenterApi");
            y.j(string2, "baseUrl");
            y.j(string3, "metricPlace");
            y.j(l10, "scrollTo");
            return (ArticleViewModel)new ViewModelProvider(viewModelStoreOwner, (ViewModelProvider.Factory)this.factory(helpCenterApi, string2, string3, bl2, bl3, l10)).get(ArticleViewModel.class);
        }
    }
}


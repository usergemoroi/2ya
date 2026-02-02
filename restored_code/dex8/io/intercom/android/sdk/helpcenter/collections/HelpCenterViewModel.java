/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  androidx.lifecycle.ViewModel
 *  androidx.lifecycle.ViewModelKt
 *  androidx.lifecycle.ViewModelProvider
 *  androidx.lifecycle.ViewModelProvider$Factory
 *  androidx.lifecycle.ViewModelStoreOwner
 *  androidx.lifecycle.n
 *  androidx.lifecycle.viewmodel.CreationExtras
 *  kotlin.collections.b1
 *  kotlin.collections.t
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.coroutines.jvm.internal.d
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.p
 *  kotlin.n
 *  kotlin.reflect.KClass
 *  kotlinx.coroutines.flow.b0
 *  kotlinx.coroutines.flow.c0
 *  kotlinx.coroutines.flow.g0
 *  kotlinx.coroutines.flow.q0
 *  kotlinx.coroutines.m0
 */
package io.intercom.android.sdk.helpcenter.collections;

import android.content.Context;
import android.content.res.Configuration;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.collections.ArticleSectionRow;
import io.intercom.android.sdk.helpcenter.collections.CollectionListRow;
import io.intercom.android.sdk.helpcenter.collections.CollectionViewState;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterEffects;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterViewModel;
import io.intercom.android.sdk.helpcenter.component.TeammateHelpKt;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterArticle;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.HelpCenterEligibilityChecker;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.collections.t;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.m;
import kotlin.r;
import kotlin.reflect.KClass;
import kotlin.v;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.flow.b0;
import kotlinx.coroutines.flow.c0;
import kotlinx.coroutines.flow.g0;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.flow.s0;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 c2\u00020\u0001:\u0001cBK\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u00020$\u0012\b\b\u0002\u00109\u001a\u000208\u0012\b\b\u0002\u0010<\u001a\u00020;\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010B\u001a\u00020A\u00a2\u0006\u0004\ba\u0010bJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002\u00a2\u0006\u0004\b\u0015\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00180\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u0014J\u0013\u0010\u001e\u001a\u00020\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001e\u0010\u001bJ\u0015\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f\u00a2\u0006\u0004\b!\u0010\"J\u001d\u0010&\u001a\u00020\u00032\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#\u00a2\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u00032\u0006\u0010(\u001a\u00020$\u00a2\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u00032\u0006\u0010+\u001a\u00020$\u00a2\u0006\u0004\b,\u0010*R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bF\u0010GR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020E0H8\u0006\u00a2\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bO\u0010PR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020N0Q8\u0006\u00a2\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bX\u0010WR\u0014\u0010Y\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b[\u0010ZR\u001b\u0010`\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006d"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/HelpCenterViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlin/Function0;", "Lkotlin/k0;", "onClick", "Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Error;", "errorWithRetry", "(Lkotlin/jvm/functions/a;)Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Error;", "", "errorCode", "sendFailedCollectionListMetric", "(Ljava/lang/Integer;)V", "", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "body", "Lio/intercom/android/sdk/helpcenter/collections/CollectionListRow$CollectionRow;", "transformToUiModel", "(Ljava/util/List;)Ljava/util/List;", "", "shouldAddSendMessageRow", "()Z", "sendFailedSingleCollectionMetric", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "networkResponse", "Lio/intercom/android/sdk/helpcenter/collections/ArticleSectionRow;", "(Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;)Ljava/util/List;", "onNewConfig", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "isFromSearchBrowse", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "getCtaData", "Landroid/content/Context;", "context", "localizedContext", "(Landroid/content/Context;)Landroid/content/Context;", "", "", "collectionIds", "fetchCollections", "(Ljava/util/Set;)V", "collectionId", "fetchSingleCollection", "(Ljava/lang/String;)V", "articleId", "onArticleClicked", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "helpCenterApi", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricTracker", "Lio/intercom/android/sdk/metrics/MetricTracker;", "place", "Ljava/lang/String;", "Lio/intercom/android/sdk/helpcenter/utils/HelpCenterEligibilityChecker;", "helpCenterEligibilityChecker", "Lio/intercom/android/sdk/helpcenter/utils/HelpCenterEligibilityChecker;", "Lkotlinx/coroutines/m0;", "dispatcher", "Lkotlinx/coroutines/m0;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "commonRepository", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "Lkotlinx/coroutines/flow/c0;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState;", "_state", "Lkotlinx/coroutines/flow/c0;", "Lkotlinx/coroutines/flow/q0;", "state", "Lkotlinx/coroutines/flow/q0;", "getState", "()Lkotlinx/coroutines/flow/q0;", "Lkotlinx/coroutines/flow/b0;", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterEffects;", "_effect", "Lkotlinx/coroutines/flow/b0;", "Lkotlinx/coroutines/flow/g0;", "effect", "Lkotlinx/coroutines/flow/g0;", "getEffect", "()Lkotlinx/coroutines/flow/g0;", "isPartialHelpCenterLoaded", "Z", "hasClickedAtLeastOneArticle", "genericError", "Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Error;", "notFoundError", "searchBrowseTeamPresenceState$delegate", "Lkotlin/m;", "getSearchBrowseTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "searchBrowseTeamPresenceState", "<init>", "(Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Lio/intercom/android/sdk/identity/AppConfig;Lio/intercom/android/sdk/metrics/MetricTracker;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/utils/HelpCenterEligibilityChecker;Lkotlinx/coroutines/m0;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/m5/data/CommonRepository;)V", "Companion", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nHelpCenterViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterViewModel.kt\nio/intercom/android/sdk/helpcenter/collections/HelpCenterViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,393:1\n1549#2:394\n1620#2,3:395\n1549#2:398\n1620#2,3:399\n1549#2:402\n1620#2,3:403\n*S KotlinDebug\n*F\n+ 1 HelpCenterViewModel.kt\nio/intercom/android/sdk/helpcenter/collections/HelpCenterViewModel\n*L\n212#1:394\n212#1:395,3\n311#1:398\n311#1:399,3\n320#1:402\n320#1:403,3\n*E\n"})
public final class HelpCenterViewModel
extends ViewModel {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final b0<HelpCenterEffects> _effect;
    @NotNull
    private final c0<CollectionViewState> _state;
    @NotNull
    private final AppConfig appConfig;
    @NotNull
    private final CommonRepository commonRepository;
    @NotNull
    private final m0 dispatcher;
    @NotNull
    private final g0<HelpCenterEffects> effect;
    @NotNull
    private final CollectionViewState.Error genericError;
    private boolean hasClickedAtLeastOneArticle;
    @NotNull
    private final HelpCenterApi helpCenterApi;
    @NotNull
    private final HelpCenterEligibilityChecker helpCenterEligibilityChecker;
    @NotNull
    private final IntercomDataLayer intercomDataLayer;
    private boolean isPartialHelpCenterLoaded;
    @NotNull
    private final MetricTracker metricTracker;
    @NotNull
    private final CollectionViewState.Error notFoundError;
    @NotNull
    private final String place;
    @NotNull
    private final m searchBrowseTeamPresenceState$delegate;
    @NotNull
    private final q0<CollectionViewState> state;

    public HelpCenterViewModel(@NotNull HelpCenterApi b04, @NotNull AppConfig appConfig, @NotNull MetricTracker metricTracker, @NotNull String string2, @NotNull HelpCenterEligibilityChecker helpCenterEligibilityChecker, @NotNull m0 m02, @NotNull IntercomDataLayer intercomDataLayer, @NotNull CommonRepository commonRepository) {
        y.j(b04, "helpCenterApi");
        y.j(appConfig, "appConfig");
        y.j(metricTracker, "metricTracker");
        y.j(string2, "place");
        y.j(helpCenterEligibilityChecker, "helpCenterEligibilityChecker");
        y.j(m02, "dispatcher");
        y.j(intercomDataLayer, "intercomDataLayer");
        y.j(commonRepository, "commonRepository");
        this.helpCenterApi = b04;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.place = string2;
        this.helpCenterEligibilityChecker = helpCenterEligibilityChecker;
        this.dispatcher = m02;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        b04 = s0.a(CollectionViewState.Initial.INSTANCE);
        this._state = b04;
        this.state = j.c(b04);
        this._effect = b04 = i0.b(0, 0, null, 7, null);
        this.effect = j.U((h)b04, ViewModelKt.getViewModelScope((ViewModel)this), kotlinx.coroutines.flow.m0.a.c(), 0, 4, null);
        this.genericError = new CollectionViewState.Error(new ErrorState.WithoutCTA(0, 0, null, 7, null));
        this.notFoundError = new CollectionViewState.Error(new ErrorState.WithoutCTA(0, R.string.intercom_page_not_found, null, 5, null));
        this.searchBrowseTeamPresenceState$delegate = kotlin.n.b((a)new a<ArticleViewState.TeamPresenceState>(this){
            final HelpCenterViewModel this$0;
            {
                this.this$0 = helpCenterViewModel;
                super(0);
            }

            @NotNull
            public final ArticleViewState.TeamPresenceState invoke() {
                ArticleViewState.TeamPresenceState teamPresenceState = ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState();
                AppConfig appConfig = HelpCenterViewModel.access$getAppConfig$p(this.this$0);
                String string2 = HelpCenterViewModel.access$getPlace$p(this.this$0);
                return TeammateHelpKt.computeViewState("", teamPresenceState, (TeamPresence)HelpCenterViewModel.access$getIntercomDataLayer$p(this.this$0).getTeamPresence().getValue(), appConfig, string2, true);
            }
        });
        if (string2.length() > 0) {
            metricTracker.openedNativeHelpCenter(string2, null);
        }
        i.d(ViewModelKt.getViewModelScope((ViewModel)this), null, null, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<kotlinx.coroutines.q0, d<? super k0>, Object>(this, null){
            int label;
            final HelpCenterViewModel this$0;
            {
                this.this$0 = helpCenterViewModel;
                super(2, d14);
            }

            @NotNull
            public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
                return new /* invalid duplicate definition of identical inner class */;
            }

            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.q0 q02, @Nullable d<? super k0> d14) {
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
                    q0<AppConfig> q02 = this.this$0.intercomDataLayer.getConfig();
                    kotlin.jvm.functions.p<AppConfig, d<? super k0>, Object> p14 = new kotlin.jvm.functions.p<AppConfig, d<? super k0>, Object>(this.this$0, null){
                        int label;
                        final HelpCenterViewModel this$0;
                        {
                            this.this$0 = helpCenterViewModel;
                            super(2, d14);
                        }

                        @NotNull
                        public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
                            return new /* invalid duplicate definition of identical inner class */;
                        }

                        @Nullable
                        public final Object invoke(@NotNull AppConfig appConfig, @Nullable d<? super k0> d14) {
                            return ((Object)this.create(appConfig, d14)).invokeSuspend(k0.a);
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
                                HelpCenterViewModel helpCenterViewModel = this.this$0;
                                this.label = 1;
                                if (helpCenterViewModel.onNewConfig((d)((Object)this)) != object2) return k0.a;
                                return object2;
                            }
                        }
                    };
                    this.label = 1;
                    if (j.l(q02, p14, (d<? super k0>)((Object)this)) != object2) return k0.a;
                    return object2;
                }
            }
        }, 3, null);
    }

    public /* synthetic */ HelpCenterViewModel(HelpCenterApi helpCenterApi, AppConfig appConfig, MetricTracker metricTracker, String string2, HelpCenterEligibilityChecker helpCenterEligibilityChecker, m0 m02, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, int n10, p p14) {
        if ((n10 & 0x10) != 0) {
            helpCenterEligibilityChecker = HelpCenterEligibilityChecker.INSTANCE;
        }
        if ((n10 & 0x20) != 0) {
            m02 = g1.b();
        }
        this(helpCenterApi, appConfig, metricTracker, string2, helpCenterEligibilityChecker, m02, intercomDataLayer, commonRepository);
    }

    public static final /* synthetic */ CollectionViewState.Error access$errorWithRetry(HelpCenterViewModel helpCenterViewModel, a a14) {
        return helpCenterViewModel.errorWithRetry((a<k0>)a14);
    }

    public static final /* synthetic */ AppConfig access$getAppConfig$p(HelpCenterViewModel helpCenterViewModel) {
        return helpCenterViewModel.appConfig;
    }

    public static final /* synthetic */ Object access$getCtaData(HelpCenterViewModel helpCenterViewModel, d d14) {
        return helpCenterViewModel.getCtaData(d14);
    }

    public static final /* synthetic */ CollectionViewState.Error access$getGenericError$p(HelpCenterViewModel helpCenterViewModel) {
        return helpCenterViewModel.genericError;
    }

    public static final /* synthetic */ HelpCenterApi access$getHelpCenterApi$p(HelpCenterViewModel helpCenterViewModel) {
        return helpCenterViewModel.helpCenterApi;
    }

    public static final /* synthetic */ MetricTracker access$getMetricTracker$p(HelpCenterViewModel helpCenterViewModel) {
        return helpCenterViewModel.metricTracker;
    }

    public static final /* synthetic */ CollectionViewState.Error access$getNotFoundError$p(HelpCenterViewModel helpCenterViewModel) {
        return helpCenterViewModel.notFoundError;
    }

    public static final /* synthetic */ String access$getPlace$p(HelpCenterViewModel helpCenterViewModel) {
        return helpCenterViewModel.place;
    }

    public static final /* synthetic */ b0 access$get_effect$p(HelpCenterViewModel helpCenterViewModel) {
        return helpCenterViewModel._effect;
    }

    public static final /* synthetic */ c0 access$get_state$p(HelpCenterViewModel helpCenterViewModel) {
        return helpCenterViewModel._state;
    }

    public static final /* synthetic */ boolean access$isFromSearchBrowse(HelpCenterViewModel helpCenterViewModel) {
        return helpCenterViewModel.isFromSearchBrowse();
    }

    public static final /* synthetic */ boolean access$isPartialHelpCenterLoaded$p(HelpCenterViewModel helpCenterViewModel) {
        return helpCenterViewModel.isPartialHelpCenterLoaded;
    }

    public static final /* synthetic */ void access$sendFailedCollectionListMetric(HelpCenterViewModel helpCenterViewModel, Integer n10) {
        helpCenterViewModel.sendFailedCollectionListMetric(n10);
    }

    public static final /* synthetic */ void access$sendFailedSingleCollectionMetric(HelpCenterViewModel helpCenterViewModel, Integer n10) {
        helpCenterViewModel.sendFailedSingleCollectionMetric(n10);
    }

    public static final /* synthetic */ void access$setHasClickedAtLeastOneArticle$p(HelpCenterViewModel helpCenterViewModel, boolean bl2) {
        helpCenterViewModel.hasClickedAtLeastOneArticle = bl2;
    }

    public static final /* synthetic */ void access$setPartialHelpCenterLoaded$p(HelpCenterViewModel helpCenterViewModel, boolean bl2) {
        helpCenterViewModel.isPartialHelpCenterLoaded = bl2;
    }

    public static final /* synthetic */ boolean access$shouldAddSendMessageRow(HelpCenterViewModel helpCenterViewModel) {
        return helpCenterViewModel.shouldAddSendMessageRow();
    }

    public static final /* synthetic */ List access$transformToUiModel(HelpCenterViewModel helpCenterViewModel, HelpCenterCollectionContent helpCenterCollectionContent) {
        return helpCenterViewModel.transformToUiModel(helpCenterCollectionContent);
    }

    public static final /* synthetic */ List access$transformToUiModel(HelpCenterViewModel helpCenterViewModel, List list) {
        return helpCenterViewModel.transformToUiModel(list);
    }

    private final CollectionViewState.Error errorWithRetry(a<k0> a14) {
        return new CollectionViewState.Error(new ErrorState.WithCTA(0, 0, null, 0, a14, 15, null));
    }

    public static /* synthetic */ void fetchCollections$default(HelpCenterViewModel helpCenterViewModel, Set set, int n10, Object object) {
        if ((n10 & 1) != 0) {
            set = b1.f();
        }
        helpCenterViewModel.fetchCollections(set);
    }

    /*
     * Unable to fully structure code
     */
    private final Object getCtaData(d<? super ArticleViewState.TeamPresenceState> var1_1) {
        if (!(var1_1 instanceof getCtaData.1)) ** GOTO lbl-1000
        var3_2 = var1_1;
        var2_3 = var3_2.label;
        if ((var2_3 & -2147483648) != 0) {
            var3_2.label = var2_3 + -2147483648;
            var1_1 = var3_2;
        } else // 2 sources

        {
            var1_1 = new kotlin.coroutines.jvm.internal.d(this, (d<? super getCtaData.1>)var1_1){
                Object L$0;
                int label;
                Object result;
                final HelpCenterViewModel this$0;
                {
                    this.this$0 = helpCenterViewModel;
                    super(d14);
                }

                @Nullable
                public final Object invokeSuspend(@NotNull Object object) {
                    this.result = object;
                    this.label |= Integer.MIN_VALUE;
                    return HelpCenterViewModel.access$getCtaData(this.this$0, (d)((Object)this));
                }
            };
        }
        var3_2 = var1_1.result;
        var4_4 = b.f();
        var2_3 = var1_1.label;
        if (var2_3 == 0) ** GOTO lbl18
        if (var2_3 == 1) {
            var1_1 = (HelpCenterViewModel)var1_1.L$0;
            v.b(var3_2);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl18:

            v.b(var3_2);
            var3_2 = this.commonRepository;
            var1_1.L$0 = this;
            var1_1.label = 1;
            var3_2 = var3_2.openMessenger((d<? super OpenMessengerResponse>)var1_1);
            if (var3_2 == var4_4) {
                return var4_4;
            }
            var1_1 = this;
        }
        var3_2 = (OpenMessengerResponse)var3_2;
        if (var3_2 == null) {
            return super.getSearchBrowseTeamPresenceState();
        }
        if ((var3_2 = var3_2.getNewConversationData()) == null) {
            return super.getSearchBrowseTeamPresenceState();
        }
        return ArticleViewState.TeamPresenceState.copy$default(super.getSearchBrowseTeamPresenceState(), null, null, null, 0, 0, 0, null, null, false, var3_2.getCta(), 511, null);
    }

    private final ArticleViewState.TeamPresenceState getSearchBrowseTeamPresenceState() {
        return (ArticleViewState.TeamPresenceState)this.searchBrowseTeamPresenceState$delegate.getValue();
    }

    private final boolean isFromSearchBrowse() {
        return y.e(this.place, "search_browse");
    }

    /*
     * Unable to fully structure code
     */
    private final Object onNewConfig(d<? super k0> var1_1) {
        block10: {
            block8: {
                block9: {
                    if (!(var1_1 instanceof onNewConfig.1)) ** GOTO lbl-1000
                    var3_2 = var1_1;
                    var2_3 = var3_2.label;
                    if ((var2_3 & -2147483648) != 0) {
                        var3_2.label = var2_3 + -2147483648;
                    } else // 2 sources

                    {
                        var3_2 = new kotlin.coroutines.jvm.internal.d(this, (d<? super onNewConfig.1>)var1_1){
                            Object L$0;
                            Object L$1;
                            int label;
                            Object result;
                            final HelpCenterViewModel this$0;
                            {
                                this.this$0 = helpCenterViewModel;
                                super(d14);
                            }

                            @Nullable
                            public final Object invokeSuspend(@NotNull Object object) {
                                this.result = object;
                                this.label |= Integer.MIN_VALUE;
                                return HelpCenterViewModel.access$onNewConfig(this.this$0, (d)((Object)this));
                            }
                        };
                    }
                    var4_4 = var3_2.result;
                    var6_5 = b.f();
                    var2_3 = var3_2.label;
                    if (var2_3 == 0) break block8;
                    if (var2_3 != 1) break block9;
                    var5_6 = (CollectionViewState.Content)var3_2.L$1;
                    var1_1 = (c0<CollectionViewState>)var3_2.L$0;
                    v.b(var4_4);
                    var3_2 = var5_6;

                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(var4_4);
            var4_4 = (CollectionViewState)this._state.getValue();
            if (!(var4_4 instanceof CollectionViewState.Content)) break block10;
            var1_1 = this._state;
            if (this.shouldAddSendMessageRow()) {
                var5_7 = (CollectionViewState.Content)var4_4;
                var3_2.L$0 = var1_1;
                var3_2.L$1 = var5_7;
                var3_2.label = 1;
                var4_4 = this.getCtaData((d<? super ArticleViewState.TeamPresenceState>)var3_2);
                if (var4_4 == var6_5) {
                    return var6_5;
                }
                var3_2 = var5_7;
lbl34:

                var3_2 = var3_2.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState)var4_4);
            } else {
                var3_2 = ((CollectionViewState.Content)var4_4).copyWithoutSendMessageRow();
            }
            var1_1.setValue(var3_2);
        }
        return k0.a;
    }

    private final void sendFailedCollectionListMetric(Integer object) {
        MetricTracker metricTracker = this.metricTracker;
        object = object != null ? ((Integer)object).toString() : null;
        metricTracker.failedHelpCenter("help_center", "collection_list", (String)object, this.isFromSearchBrowse());
    }

    static /* synthetic */ void sendFailedCollectionListMetric$default(HelpCenterViewModel helpCenterViewModel, Integer n10, int n13, Object object) {
        if ((n13 & 1) != 0) {
            n10 = null;
        }
        helpCenterViewModel.sendFailedCollectionListMetric(n10);
    }

    private final void sendFailedSingleCollectionMetric(Integer object) {
        MetricTracker metricTracker = this.metricTracker;
        object = object != null ? ((Integer)object).toString() : null;
        metricTracker.failedHelpCenter("help_center", "article_list", (String)object, this.isFromSearchBrowse());
    }

    static /* synthetic */ void sendFailedSingleCollectionMetric$default(HelpCenterViewModel helpCenterViewModel, Integer n10, int n13, Object object) {
        if ((n13 & 1) != 0) {
            n10 = null;
        }
        helpCenterViewModel.sendFailedSingleCollectionMetric(n10);
    }

    private final boolean shouldAddSendMessageRow() {
        boolean bl2 = AppConfigExtensionsKt.canStartNewConversation(this.appConfig) && this.hasClickedAtLeastOneArticle;
        return bl2;
    }

    private final List<ArticleSectionRow> transformToUiModel(HelpCenterCollectionContent object) {
        Object object2;
        ArrayList<ArticleSectionRow> arrayList = new ArrayList<ArticleSectionRow>();
        Object object3 = ((HelpCenterCollectionContent)object).getHelpCenterArticles();
        Object object4 = new ArrayList<ArticleSectionRow.ArticleRow>(t.x((Iterable)object3, (int)10));
        Object object5 = object3.iterator();
        while (object5.hasNext()) {
            object3 = (HelpCenterArticle)object5.next();
            object2 = ((HelpCenterArticle)object3).getTitle();
            object4.add(new ArticleSectionRow.ArticleRow(((HelpCenterArticle)object3).getArticleId(), (String)object2));
        }
        arrayList.addAll((Collection<ArticleSectionRow>)object4);
        object4 = ((HelpCenterCollectionContent)object).getSubCollections();
        object = new ArrayList(t.x(object4, (int)10));
        object2 = object4.iterator();
        while (object2.hasNext()) {
            object5 = (HelpCenterCollection)object2.next();
            object4 = ((HelpCenterCollection)object5).getId();
            object3 = ((HelpCenterCollection)object5).getTitle();
            int n10 = ((HelpCenterCollection)object5).getSummary().length() == 0 ? 8 : 0;
            object.add(new ArticleSectionRow.CollectionRow(new CollectionViewState.CollectionRowData((String)object4, (String)object3, n10, ((HelpCenterCollection)object5).getSummary(), ((HelpCenterCollection)object5).getArticlesCount(), ((HelpCenterCollection)object5).getCollectionsCount())));
        }
        arrayList.addAll((Collection<ArticleSectionRow>)object);
        return arrayList;
    }

    private final List<CollectionListRow.CollectionRow> transformToUiModel(List<HelpCenterCollection> list) {
        Object object = list;
        list = new ArrayList<HelpCenterCollection>(t.x((Iterable)object, (int)10));
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            HelpCenterCollection helpCenterCollection = (HelpCenterCollection)iterator.next();
            String string2 = helpCenterCollection.getId();
            object = helpCenterCollection.getTitle();
            int n10 = helpCenterCollection.getSummary().length() == 0 ? 8 : 0;
            list.add((HelpCenterCollection)((Object)new CollectionListRow.CollectionRow(new CollectionViewState.CollectionRowData(string2, (String)object, n10, helpCenterCollection.getSummary(), helpCenterCollection.getArticlesCount(), helpCenterCollection.getCollectionsCount()))));
        }
        return list;
    }

    public final void fetchCollections(@NotNull Set<String> set) {
        y.j(set, "collectionIds");
        if (!this.helpCenterEligibilityChecker.isEligibleUser()) {
            this._state.setValue((Object)this.genericError);
            return;
        }
        i.d(ViewModelKt.getViewModelScope((ViewModel)this), (g)this.dispatcher, null, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<kotlinx.coroutines.q0, d<? super k0>, Object>(this, set, null){
            final Set<String> $collectionIds;
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final HelpCenterViewModel this$0;
            {
                this.this$0 = helpCenterViewModel;
                this.$collectionIds = set;
                super(2, d14);
            }

            @NotNull
            public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
                return new /* invalid duplicate definition of identical inner class */;
            }

            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.q0 q02, @Nullable d<? super k0> d14) {
                return ((Object)this.create(q02, d14)).invokeSuspend(k0.a);
            }

            /*
             * WARNING - void declaration
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Nullable
            public final Object invokeSuspend(@NotNull Object object) {
                void var1_25;
                void var4_35;
                block23: {
                    block26: {
                        void var1_22;
                        Object object2;
                        Object object3;
                        block27: {
                            void var4_33;
                            Object object4;
                            block20: {
                                Object object5;
                                void var1_16;
                                c0 c04;
                                NetworkResponse networkResponse;
                                block25: {
                                    block24: {
                                        block22: {
                                            void var1_4;
                                            block21: {
                                                Object object6;
                                                block16: {
                                                    block17: {
                                                        block18: {
                                                            block19: {
                                                                object4 = b.f();
                                                                int n10 = this.label;
                                                                if (n10 == 0) break block16;
                                                                if (n10 == 1) break block17;
                                                                if (n10 == 2) break block18;
                                                                if (n10 == 3) break block19;
                                                                if (n10 != 4) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                object4 = (List)this.L$2;
                                                                c0 c05 = (c0)this.L$1;
                                                                object3 = (ArrayList<E>)this.L$0;
                                                                v.b(object);
                                                                object2 = object;
                                                                break block20;
                                                            }
                                                            c0 c06 = (c0)this.L$0;
                                                            v.b(object);
                                                            return k0.a;
                                                        }
                                                        c0 c07 = (c0)this.L$0;
                                                        v.b(object);
                                                        return k0.a;
                                                    }
                                                    v.b(object);
                                                    break block21;
                                                }
                                                v.b(object);
                                                if (this.this$0.getState().getValue() instanceof CollectionViewState.Content.CollectionListContent) {
                                                    return k0.a;
                                                }
                                                HelpCenterViewModel.access$get_state$p(this.this$0).setValue((Object)CollectionViewState.Loading.INSTANCE);
                                                HelpCenterApi helpCenterApi = HelpCenterViewModel.access$getHelpCenterApi$p(this.this$0);
                                                this.label = 1;
                                                Object object7 = object6 = HelpCenterApi.DefaultImpls.fetchCollectionList$default(helpCenterApi, null, (d)((Object)this), 1, null);
                                                if (object6 == object4) {
                                                    return object4;
                                                }
                                            }
                                            networkResponse = (NetworkResponse)var1_4;
                                            c04 = HelpCenterViewModel.access$get_state$p(this.this$0);
                                            if (!(networkResponse instanceof NetworkResponse.ServerError)) break block22;
                                            HelpCenterViewModel helpCenterViewModel = this.this$0;
                                            NetworkResponse.ServerError serverError = (NetworkResponse.ServerError)networkResponse;
                                            HelpCenterViewModel.access$sendFailedCollectionListMetric(helpCenterViewModel, kotlin.coroutines.jvm.internal.b.d(serverError.getCode()));
                                            if (serverError.getCode() == 404) {
                                                CollectionViewState.Error error = HelpCenterViewModel.access$getNotFoundError$p(this.this$0);
                                            } else {
                                                CollectionViewState.Error error = HelpCenterViewModel.access$getGenericError$p(this.this$0);
                                            }
                                            break block23;
                                        }
                                        if (!(networkResponse instanceof NetworkResponse.ClientError)) break block24;
                                        HelpCenterViewModel.sendFailedCollectionListMetric$default(this.this$0, null, 1, null);
                                        CollectionViewState.Error error = HelpCenterViewModel.access$getGenericError$p(this.this$0);
                                        break block23;
                                    }
                                    if (!(networkResponse instanceof NetworkResponse.NetworkError)) break block25;
                                    HelpCenterViewModel.sendFailedCollectionListMetric$default(this.this$0, null, 1, null);
                                    HelpCenterViewModel helpCenterViewModel = this.this$0;
                                    CollectionViewState.Error error = HelpCenterViewModel.access$errorWithRetry(helpCenterViewModel, (a)new a<k0>(helpCenterViewModel, this.$collectionIds){
                                        final Set<String> $collectionIds;
                                        final HelpCenterViewModel this$0;
                                        {
                                            this.this$0 = helpCenterViewModel;
                                            this.$collectionIds = set;
                                            super(0);
                                        }

                                        public final void invoke() {
                                            this.this$0.fetchCollections(this.$collectionIds);
                                        }
                                    });
                                    break block23;
                                }
                                if (!(networkResponse instanceof NetworkResponse.Success)) throw new r();
                                List list = (List)((NetworkResponse.Success)networkResponse).getBody();
                                Object object8 = list;
                                object2 = this.$collectionIds;
                                object3 = new ArrayList<E>();
                                object8 = object8.iterator();
                                while (object8.hasNext()) {
                                    E e11 = object8.next();
                                    if (!object2.contains(((HelpCenterCollection)e11).getId())) continue;
                                    object3.add(e11);
                                }
                                object2 = this.this$0;
                                boolean bl2 = object3.size() < list.size() && object3.isEmpty() ^ true;
                                HelpCenterViewModel.access$setPartialHelpCenterLoaded$p((HelpCenterViewModel)((Object)object2), bl2);
                                HelpCenterViewModel.access$getMetricTracker$p(this.this$0).viewedNativeHelpCenter("collection_list", kotlin.coroutines.jvm.internal.b.a(HelpCenterViewModel.access$isPartialHelpCenterLoaded$p(this.this$0)), HelpCenterViewModel.access$isFromSearchBrowse(this.this$0));
                                if (object3.size() == 1) {
                                    b0 b04 = HelpCenterViewModel.access$get_effect$p(this.this$0);
                                    object3 = new HelpCenterEffects.NavigateToCollectionContent(((HelpCenterCollection)t.r0((List)object3)).getId());
                                    this.L$0 = c04;
                                    this.label = 2;
                                    if (b04.emit(object3, (d)((Object)this)) != object4) return k0.a;
                                    return object4;
                                }
                                if (list.size() == 1) {
                                    object3 = HelpCenterViewModel.access$get_effect$p(this.this$0);
                                    HelpCenterEffects.NavigateToCollectionContent navigateToCollectionContent = new HelpCenterEffects.NavigateToCollectionContent(((HelpCenterCollection)t.r0((List)list)).getId());
                                    this.L$0 = c04;
                                    this.label = 3;
                                    if (object3.emit((Object)navigateToCollectionContent, (d)((Object)this)) != object4) return k0.a;
                                    return object4;
                                }
                                bl2 = object3.isEmpty();
                                if (!object3.isEmpty()) {
                                    Object object9 = object3;
                                }
                                if (!(((Collection)var1_16).isEmpty() ^ true)) break block26;
                                object3 = t.h1((Collection)HelpCenterViewModel.access$transformToUiModel(this.this$0, (List)var1_16));
                                if (bl2 ^ true) {
                                    object3.add(CollectionListRow.BrowseAllHelpTopicsAsListItem.INSTANCE);
                                } else if (HelpCenterViewModel.access$isPartialHelpCenterLoaded$p(this.this$0)) {
                                    object3.add(CollectionListRow.FullHelpCenterRow.INSTANCE);
                                }
                                c0 c08 = c04;
                                object2 = object3;
                                if (!HelpCenterViewModel.access$shouldAddSendMessageRow(this.this$0)) break block27;
                                HelpCenterViewModel helpCenterViewModel = this.this$0;
                                this.L$0 = object3;
                                this.L$1 = c04;
                                this.L$2 = object3;
                                this.label = 4;
                                object2 = HelpCenterViewModel.access$getCtaData(helpCenterViewModel, (d)((Object)this));
                                if (object2 == object4) {
                                    return object4;
                                }
                                object3 = object5 = object3;
                                object4 = object5;
                            }
                            object4.add(new CollectionListRow.SendMessageRow((ArticleViewState.TeamPresenceState)object2));
                            object2 = object3;
                            void var1_21 = var4_33;
                        }
                        object3 = new CollectionViewState.Content.CollectionListContent((List<? extends CollectionListRow>)object2);
                        void var4_34 = var1_22;
                        Object object10 = object3;
                        break block23;
                    }
                    CollectionViewState.Error error = HelpCenterViewModel.access$getGenericError$p(this.this$0);
                }
                var4_35.setValue((Object)var1_25);
                return k0.a;
            }
        }, 2, null);
    }

    public final void fetchSingleCollection(@NotNull String string2) {
        y.j(string2, "collectionId");
        i.d(ViewModelKt.getViewModelScope((ViewModel)this), (g)this.dispatcher, null, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<kotlinx.coroutines.q0, d<? super k0>, Object>(this, string2, null){
            final String $collectionId;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            final HelpCenterViewModel this$0;
            {
                this.this$0 = helpCenterViewModel;
                this.$collectionId = string2;
                super(2, d14);
            }

            @NotNull
            public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
                return new /* invalid duplicate definition of identical inner class */;
            }

            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.q0 q02, @Nullable d<? super k0> d14) {
                return ((Object)this.create(q02, d14)).invokeSuspend(k0.a);
            }

            /*
             * Unable to fully structure code
             * Could not resolve type clashes
             */
            @Nullable
            public final Object invokeSuspend(@NotNull Object var1_1) {
                block19: {
                    block16: {
                        block18: {
                            block17: {
                                block15: {
                                    block14: {
                                        block11: {
                                            block12: {
                                                block13: {
                                                    var5_2 = b.f();
                                                    var2_3 = this.label;
                                                    if (var2_3 == 0) break block11;
                                                    if (var2_3 == 1) break block12;
                                                    if (var2_3 != 2) break block13;
                                                    var4_4 = (List)this.L$3;
                                                    var5_2 = (c0)this.L$2;
                                                    var6_5 /* !! */  = (List)this.L$1;
                                                    var3_6 = (HelpCenterCollectionContent)this.L$0;
                                                    v.b(var1_1 /* !! */ );
                                                    var7_7 = var1_1 /* !! */ ;

                                                }
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            v.b(var1_1 /* !! */ );
                                            break block14;
                                        }
                                        v.b(var1_1 /* !! */ );
                                        var1_1 /* !! */  = (CollectionViewState)this.this$0.getState().getValue();
                                        if (var1_1 /* !! */  instanceof CollectionViewState.Content.CollectionContent && y.e(((CollectionViewState.Content.CollectionContent)var1_1 /* !! */ ).getId(), this.$collectionId)) {
                                            return k0.a;
                                        }
                                        HelpCenterViewModel.access$get_state$p(this.this$0).setValue((Object)CollectionViewState.Loading.INSTANCE);
                                        var1_1 /* !! */  = HelpCenterViewModel.access$getHelpCenterApi$p(this.this$0);
                                        var3_6 = this.$collectionId;
                                        this.label = 1;
                                        var1_1 /* !! */  = var3_6 = HelpCenterApi.DefaultImpls.fetchSectionsList$default((HelpCenterApi)var1_1 /* !! */ , (String)var3_6, null, (d)this, 2, null);
                                        if (var3_6 == var5_2) {
                                            return var5_2;
                                        }
                                    }
                                    var4_4 = (NetworkResponse)var1_1 /* !! */ ;
                                    var1_1 /* !! */  = HelpCenterViewModel.access$get_state$p(this.this$0);
                                    if (!(var4_4 instanceof NetworkResponse.ServerError)) break block15;
                                    var3_6 = this.this$0;
                                    var4_4 = (NetworkResponse.ServerError)var4_4;
                                    HelpCenterViewModel.access$sendFailedSingleCollectionMetric((HelpCenterViewModel)var3_6, kotlin.coroutines.jvm.internal.b.d(var4_4.getCode()));
                                    if (var4_4.getCode() == 404) {
                                        var3_6 = HelpCenterViewModel.access$getNotFoundError$p(this.this$0);
                                        var5_2 = var1_1 /* !! */ ;
                                        var1_1 /* !! */  = var3_6;
                                    } else {
                                        var3_6 = HelpCenterViewModel.access$getGenericError$p(this.this$0);
                                        var5_2 = var1_1 /* !! */ ;
                                        var1_1 /* !! */  = var3_6;
                                    }
                                    break block16;
                                }
                                if (!(var4_4 instanceof NetworkResponse.ClientError)) break block17;
                                HelpCenterViewModel.sendFailedSingleCollectionMetric$default(this.this$0, null, 1, null);
                                var3_6 = HelpCenterViewModel.access$getGenericError$p(this.this$0);
                                var5_2 = var1_1 /* !! */ ;
                                var1_1 /* !! */  = var3_6;
                                break block16;
                            }
                            if (!(var4_4 instanceof NetworkResponse.NetworkError)) break block18;
                            HelpCenterViewModel.sendFailedSingleCollectionMetric$default(this.this$0, null, 1, null);
                            var3_6 = this.this$0;
                            var3_6 = HelpCenterViewModel.access$errorWithRetry((HelpCenterViewModel)var3_6, (a)new a<k0>((HelpCenterViewModel)var3_6, this.$collectionId){
                                final String $collectionId;
                                final HelpCenterViewModel this$0;
                                {
                                    this.this$0 = helpCenterViewModel;
                                    this.$collectionId = string2;
                                    super(0);
                                }

                                public final void invoke() {
                                    this.this$0.fetchSingleCollection(this.$collectionId);
                                }
                            });
                            var5_2 = var1_1 /* !! */ ;
                            var1_1 /* !! */  = var3_6;
                            break block16;
                        }
                        if (!(var4_4 instanceof NetworkResponse.Success)) break block19;
                        var3_6 = (HelpCenterCollectionContent)((NetworkResponse.Success)var4_4).getBody();
                        var4_4 = t.h1((Collection)HelpCenterViewModel.access$transformToUiModel(this.this$0, (HelpCenterCollectionContent)var3_6));
                        if (HelpCenterViewModel.access$isPartialHelpCenterLoaded$p(this.this$0)) {
                            var4_4.add(ArticleSectionRow.FullHelpCenterRow.INSTANCE);
                        }
                        HelpCenterViewModel.access$getMetricTracker$p(this.this$0).viewedNativeHelpCenter("article_list", kotlin.coroutines.jvm.internal.b.a(HelpCenterViewModel.access$isPartialHelpCenterLoaded$p(this.this$0)), HelpCenterViewModel.access$isFromSearchBrowse(this.this$0));
                        if (HelpCenterViewModel.access$shouldAddSendMessageRow(this.this$0)) {
                            var6_5 /* !! */  = this.this$0;
                            this.L$0 = var3_6;
                            this.L$1 = var4_4;
                            this.L$2 = var1_1 /* !! */ ;
                            this.L$3 = var4_4;
                            this.label = 2;
                            var7_7 = HelpCenterViewModel.access$getCtaData((HelpCenterViewModel)var6_5 /* !! */ , (d)this);
                            if (var7_7 == var5_2) {
                                return var5_2;
                            }
                            var6_5 /* !! */  = var4_4;
                            var5_2 = var1_1 /* !! */ ;
lbl81:

                            var4_4.add(new ArticleSectionRow.SendMessageRow((ArticleViewState.TeamPresenceState)var7_7));
                        } else {
                            var6_5 /* !! */  = var4_4;
                            var5_2 = var1_1 /* !! */ ;
                        }
                        var1_1 /* !! */  = new CollectionViewState.Content.CollectionContent(var3_6.getCollectionId(), var3_6.getTitle(), var3_6.getSummary(), var3_6.getArticlesCount(), var3_6.getAuthors(), (List<? extends ArticleSectionRow>)var6_5 /* !! */ );
                    }
                    var5_2.setValue(var1_1 /* !! */ );
                    return k0.a;
                }
                throw new r();
            }
        }, 2, null);
    }

    @NotNull
    public final g0<HelpCenterEffects> getEffect() {
        return this.effect;
    }

    @NotNull
    public final q0<CollectionViewState> getState() {
        return this.state;
    }

    @NotNull
    public final Context localizedContext(@NotNull Context context) {
        y.j(context, "context");
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(ContextLocaliser.convertToLocale(this.appConfig.getHelpCenterLocale()));
        context = context.createConfigurationContext(configuration);
        y.i(context, "context.createConfigurat\u2026t(localisedConfiguration)");
        return context;
    }

    public final void onArticleClicked(@NotNull String string2) {
        y.j(string2, "articleId");
        i.d(ViewModelKt.getViewModelScope((ViewModel)this), (g)this.dispatcher, null, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<kotlinx.coroutines.q0, d<? super k0>, Object>(this, string2, null){
            final String $articleId;
            Object L$0;
            Object L$1;
            int label;
            final HelpCenterViewModel this$0;
            {
                this.this$0 = helpCenterViewModel;
                this.$articleId = string2;
                super(2, d14);
            }

            @NotNull
            public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
                return new /* invalid duplicate definition of identical inner class */;
            }

            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.q0 q02, @Nullable d<? super k0> d14) {
                return ((Object)this.create(q02, d14)).invokeSuspend(k0.a);
            }

            /*
             * WARNING - void declaration
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Nullable
            public final Object invokeSuspend(@NotNull Object object) {
                void var4_8;
                Object object2;
                Object object3;
                block6: {
                    block7: {
                        block8: {
                            block3: {
                                block4: {
                                    block5: {
                                        object3 = b.f();
                                        int n10 = this.label;
                                        if (n10 == 0) break block3;
                                        if (n10 == 1) break block4;
                                        if (n10 == 2) break block5;
                                        if (n10 != 3) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        object2 = (CollectionViewState.Content.CollectionContent)this.L$1;
                                        object3 = (c0)this.L$0;
                                        v.b(object);
                                        Object object4 = object;
                                        break block6;
                                    }
                                    object2 = (CollectionViewState)this.L$0;
                                    v.b(object);
                                    object = object2;
                                    break block7;
                                }
                                v.b(object);
                                break block8;
                            }
                            v.b(object);
                            HelpCenterViewModel.access$setHasClickedAtLeastOneArticle$p(this.this$0, true);
                            object = HelpCenterViewModel.access$get_effect$p(this.this$0);
                            object2 = new HelpCenterEffects.NavigateToArticle(this.$articleId);
                            this.label = 1;
                            if (object.emit(object2, (d)((Object)this)) == object3) {
                                return object3;
                            }
                        }
                        if (!HelpCenterViewModel.access$shouldAddSendMessageRow(this.this$0) || !((object = (CollectionViewState)HelpCenterViewModel.access$get_state$p(this.this$0).getValue()) instanceof CollectionViewState.Content.CollectionContent) || ((CollectionViewState.Content.CollectionContent)object).hasSendMessageRow()) return k0.a;
                        this.L$0 = object;
                        this.label = 2;
                        if (a1.b(2000L, (d<? super k0>)((Object)this)) == object3) {
                            return object3;
                        }
                    }
                    object2 = HelpCenterViewModel.access$get_state$p(this.this$0);
                    object = (CollectionViewState.Content.CollectionContent)object;
                    HelpCenterViewModel helpCenterViewModel = this.this$0;
                    this.L$0 = object2;
                    this.L$1 = object;
                    this.label = 3;
                    Object object5 = HelpCenterViewModel.access$getCtaData(helpCenterViewModel, (d)((Object)this));
                    if (object5 == object3) {
                        return object3;
                    }
                    object3 = object2;
                    object2 = object;
                }
                object3.setValue((Object)((CollectionViewState.Content.CollectionContent)object2).copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState)var4_8));
                return k0.a;
            }
        }, 2, null);
    }

    @Metadata(d1={"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0004*\u0001\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/HelpCenterViewModel$Companion;", "", "()V", "create", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterViewModel;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "helpCenterApi", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "place", "", "factory", "io/intercom/android/sdk/helpcenter/collections/HelpCenterViewModel$Companion$factory$1", "metricContext", "(Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Ljava/lang/String;)Lio/intercom/android/sdk/helpcenter/collections/HelpCenterViewModel$Companion$factory$1;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        private final factory.1 factory(HelpCenterApi helpCenterApi, String string2) {
            return new ViewModelProvider.Factory(helpCenterApi, string2){
                final HelpCenterApi $helpCenterApi;
                final String $metricContext;
                {
                    this.$helpCenterApi = helpCenterApi;
                    this.$metricContext = string2;
                }

                @NotNull
                public <T extends ViewModel> T create(@NotNull Class<T> object) {
                    y.j(object, "modelClass");
                    IntercomDataLayer intercomDataLayer = Injector.get().getDataLayer();
                    object = this.$helpCenterApi;
                    Object object2 = Injector.get().getAppConfigProvider().get();
                    y.i(object2, "get().appConfigProvider.get()");
                    AppConfig appConfig = object2;
                    MetricTracker metricTracker = Injector.get().getMetricTracker();
                    y.i(metricTracker, "get().metricTracker");
                    String string2 = this.$metricContext;
                    y.i(intercomDataLayer, "intercomDataLayer");
                    object2 = Injector.get().getMessengerApi();
                    y.i(object2, "get().messengerApi");
                    return (T)((Object)new HelpCenterViewModel((HelpCenterApi)object, appConfig, metricTracker, string2, null, null, intercomDataLayer, new CommonRepository((MessengerApi)object2, intercomDataLayer), 48, null));
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
        public final HelpCenterViewModel create(@NotNull ViewModelStoreOwner viewModelStoreOwner, @NotNull HelpCenterApi helpCenterApi, @NotNull String string2) {
            y.j(viewModelStoreOwner, "owner");
            y.j(helpCenterApi, "helpCenterApi");
            y.j(string2, "place");
            return (HelpCenterViewModel)new ViewModelProvider(viewModelStoreOwner, (ViewModelProvider.Factory)this.factory(helpCenterApi, string2)).get(HelpCenterViewModel.class);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.jvm.functions.p
 *  kotlin.text.p
 *  kotlinx.coroutines.w1
 */
package io.intercom.android.sdk.helpcenter.api;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.api.CollectionContentRequestCallback;
import io.intercom.android.sdk.helpcenter.api.CollectionRequestCallback;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.api.HelpCenterArticleSearchResult;
import io.intercom.android.sdk.helpcenter.api.SearchRequestCallback;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.text.p;
import kotlin.v;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001e"}, d2={"Lio/intercom/android/sdk/helpcenter/api/HelpCenterApiWrapper;", "", "", "removeHighlightTags", "(Ljava/lang/String;)Ljava/lang/String;", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricTracker", "Lio/intercom/android/sdk/helpcenter/api/CollectionRequestCallback;", "collectionRequestCallback", "Lkotlin/k0;", "fetchHelpCenterCollections", "(Lio/intercom/android/sdk/metrics/MetricTracker;Lio/intercom/android/sdk/helpcenter/api/CollectionRequestCallback;)V", "searchTerm", "Lio/intercom/android/sdk/helpcenter/api/SearchRequestCallback;", "searchRequestCallback", "fetchHelpCenterResultsForSearchTerm", "(Lio/intercom/android/sdk/metrics/MetricTracker;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/api/SearchRequestCallback;)V", "collectionId", "Lio/intercom/android/sdk/helpcenter/api/CollectionContentRequestCallback;", "collectionContentRequestCallback", "fetchHelpCenterCollection", "(Lio/intercom/android/sdk/metrics/MetricTracker;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/api/CollectionContentRequestCallback;)V", "", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;", "response", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterArticleSearchResult;", "transformSearchResponse", "(Ljava/util/List;)Ljava/util/List;", "<init>", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nHelpCenterApiWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterApiWrapper.kt\nio/intercom/android/sdk/helpcenter/api/HelpCenterApiWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n1549#2:148\n1620#2,3:149\n*S KotlinDebug\n*F\n+ 1 HelpCenterApiWrapper.kt\nio/intercom/android/sdk/helpcenter/api/HelpCenterApiWrapper\n*L\n128#1:148\n128#1:149,3\n*E\n"})
public final class HelpCenterApiWrapper {
    @NotNull
    public static final HelpCenterApiWrapper INSTANCE = new HelpCenterApiWrapper();

    private HelpCenterApiWrapper() {
    }

    private final String removeHighlightTags(String string2) {
        return p.I((String)p.I((String)string2, (String)"<highlight>", (String)"", (boolean)false, (int)4, null), (String)"</highlight>", (String)"", (boolean)false, (int)4, null);
    }

    public final void fetchHelpCenterCollection(@NotNull MetricTracker metricTracker, @NotNull String string2, @NotNull CollectionContentRequestCallback collectionContentRequestCallback) {
        y.j(metricTracker, "metricTracker");
        y.j(string2, "collectionId");
        y.j(collectionContentRequestCallback, "collectionContentRequestCallback");
        i.d((q0)w1.c, (g)g1.b(), null, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<q0, d<? super k0>, Object>(metricTracker, string2, collectionContentRequestCallback, null){
            final CollectionContentRequestCallback $collectionContentRequestCallback;
            final String $collectionId;
            final MetricTracker $metricTracker;
            int label;
            {
                this.$metricTracker = metricTracker;
                this.$collectionId = string2;
                this.$collectionContentRequestCallback = collectionContentRequestCallback;
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
                block5: {
                    Object object2;
                    Object object3;
                    block6: {
                        block2: {
                            block3: {
                                block4: {
                                    object3 = b.f();
                                    int n10 = this.label;
                                    if (n10 == 0) break block2;
                                    if (n10 == 1) break block3;
                                    if (n10 != 2) break block4;
                                    v.b(object);
                                    break block5;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v.b(object);
                            break block6;
                        }
                        v.b(object);
                        this.$metricTracker.requestedHelpCenterData("article_list");
                        object2 = Injector.get().getHelpCenterApi();
                        y.i(object2, "get().helpCenterApi");
                        object = this.$collectionId;
                        this.label = 1;
                        object = object2 = HelpCenterApi.DefaultImpls.fetchSectionsList$default((HelpCenterApi)object2, (String)object, null, (d)((Object)this), 2, null);
                        if (object2 == object3) {
                            return object3;
                        }
                    }
                    object2 = (NetworkResponse)object;
                    object = g1.c();
                    object2 = new kotlin.jvm.functions.p<q0, d<? super k0>, Object>((NetworkResponse<HelpCenterCollectionContent>)object2, this.$metricTracker, this.$collectionContentRequestCallback, null){
                        final CollectionContentRequestCallback $collectionContentRequestCallback;
                        final NetworkResponse<HelpCenterCollectionContent> $fetchSectionsListResponse;
                        final MetricTracker $metricTracker;
                        int label;
                        {
                            this.$fetchSectionsListResponse = networkResponse;
                            this.$metricTracker = metricTracker;
                            this.$collectionContentRequestCallback = collectionContentRequestCallback;
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
                        public final Object invokeSuspend(@NotNull Object networkResponse) {
                            b.f();
                            if (this.label == 0) {
                                v.b(networkResponse);
                                networkResponse = this.$fetchSectionsListResponse;
                                if (networkResponse instanceof NetworkResponse.ServerError) {
                                    this.$metricTracker.failedHelpCenter("help_center_data", "article_list", String.valueOf(((NetworkResponse.ServerError)networkResponse).getCode()), false);
                                    this.$collectionContentRequestCallback.onError(((NetworkResponse.ServerError)this.$fetchSectionsListResponse).getCode());
                                } else if (networkResponse instanceof NetworkResponse.ClientError || networkResponse instanceof NetworkResponse.NetworkError) {
                                    this.$metricTracker.failedHelpCenter("help_center_data", "article_list", null, false);
                                    this.$collectionContentRequestCallback.onFailure();
                                } else if (networkResponse instanceof NetworkResponse.Success) {
                                    this.$collectionContentRequestCallback.onComplete((HelpCenterCollectionContent)((NetworkResponse.Success)networkResponse).getBody());
                                }
                                return k0.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    };
                    this.label = 2;
                    if (i.g((g)object, object2, this) == object3) {
                        return object3;
                    }
                }
                return k0.a;
            }
        }, 2, null);
    }

    public final void fetchHelpCenterCollections(@NotNull MetricTracker metricTracker, @NotNull CollectionRequestCallback collectionRequestCallback) {
        y.j(metricTracker, "metricTracker");
        y.j(collectionRequestCallback, "collectionRequestCallback");
        i.d((q0)w1.c, (g)g1.b(), null, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<q0, d<? super k0>, Object>(metricTracker, collectionRequestCallback, null){
            final CollectionRequestCallback $collectionRequestCallback;
            final MetricTracker $metricTracker;
            int label;
            {
                this.$metricTracker = metricTracker;
                this.$collectionRequestCallback = collectionRequestCallback;
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
                block5: {
                    Object object2;
                    Object object3;
                    block6: {
                        block2: {
                            block3: {
                                block4: {
                                    object3 = b.f();
                                    int n10 = this.label;
                                    if (n10 == 0) break block2;
                                    if (n10 == 1) break block3;
                                    if (n10 != 2) break block4;
                                    v.b(object);
                                    break block5;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v.b(object);
                            break block6;
                        }
                        v.b(object);
                        this.$metricTracker.requestedHelpCenterData("collection_list");
                        object = Injector.get().getHelpCenterApi();
                        y.i(object, "get().helpCenterApi");
                        this.label = 1;
                        object2 = HelpCenterApi.DefaultImpls.fetchCollectionList$default((HelpCenterApi)object, null, (d)((Object)this), 1, null);
                        object = object2;
                        if (object2 == object3) {
                            return object3;
                        }
                    }
                    object2 = (NetworkResponse)object;
                    object = g1.c();
                    object2 = new kotlin.jvm.functions.p<q0, d<? super k0>, Object>((NetworkResponse<? extends List<HelpCenterCollection>>)object2, this.$metricTracker, this.$collectionRequestCallback, null){
                        final CollectionRequestCallback $collectionRequestCallback;
                        final NetworkResponse<List<HelpCenterCollection>> $fetchCollectionListResponse;
                        final MetricTracker $metricTracker;
                        int label;
                        {
                            this.$fetchCollectionListResponse = networkResponse;
                            this.$metricTracker = metricTracker;
                            this.$collectionRequestCallback = collectionRequestCallback;
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
                        public final Object invokeSuspend(@NotNull Object networkResponse) {
                            b.f();
                            if (this.label == 0) {
                                v.b(networkResponse);
                                networkResponse = this.$fetchCollectionListResponse;
                                if (networkResponse instanceof NetworkResponse.ServerError) {
                                    this.$metricTracker.failedHelpCenter("help_center_data", "collection_list", String.valueOf(((NetworkResponse.ServerError)networkResponse).getCode()), false);
                                    this.$collectionRequestCallback.onError(((NetworkResponse.ServerError)this.$fetchCollectionListResponse).getCode());
                                } else if (networkResponse instanceof NetworkResponse.ClientError || networkResponse instanceof NetworkResponse.NetworkError) {
                                    this.$metricTracker.failedHelpCenter("help_center_data", "collection_list", null, false);
                                    this.$collectionRequestCallback.onFailure();
                                } else if (networkResponse instanceof NetworkResponse.Success) {
                                    this.$collectionRequestCallback.onComplete((List)((NetworkResponse.Success)networkResponse).getBody());
                                }
                                return k0.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    };
                    this.label = 2;
                    if (i.g((g)object, object2, this) == object3) {
                        return object3;
                    }
                }
                return k0.a;
            }
        }, 2, null);
    }

    public final void fetchHelpCenterResultsForSearchTerm(@NotNull MetricTracker metricTracker, @NotNull String string2, @NotNull SearchRequestCallback searchRequestCallback) {
        y.j(metricTracker, "metricTracker");
        y.j(string2, "searchTerm");
        y.j(searchRequestCallback, "searchRequestCallback");
        i.d((q0)w1.c, (g)g1.b(), null, (kotlin.jvm.functions.p)new kotlin.jvm.functions.p<q0, d<? super k0>, Object>(metricTracker, string2, searchRequestCallback, null){
            final MetricTracker $metricTracker;
            final SearchRequestCallback $searchRequestCallback;
            final String $searchTerm;
            int label;
            {
                this.$metricTracker = metricTracker;
                this.$searchTerm = string2;
                this.$searchRequestCallback = searchRequestCallback;
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
                block5: {
                    Object object2;
                    Object object3;
                    block6: {
                        block2: {
                            block3: {
                                block4: {
                                    object3 = b.f();
                                    int n10 = this.label;
                                    if (n10 == 0) break block2;
                                    if (n10 == 1) break block3;
                                    if (n10 != 2) break block4;
                                    v.b(object);
                                    break block5;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v.b(object);
                            break block6;
                        }
                        v.b(object);
                        this.$metricTracker.requestedHelpCenterData("search_results");
                        object = Injector.get().getHelpCenterApi();
                        y.i(object, "get().helpCenterApi");
                        object2 = this.$searchTerm;
                        this.label = 1;
                        object = object2 = HelpCenterApi.DefaultImpls.searchForArticles$default((HelpCenterApi)object, (String)object2, null, null, (d)((Object)this), 6, null);
                        if (object2 == object3) {
                            return object3;
                        }
                    }
                    object2 = (NetworkResponse)object;
                    object = g1.c();
                    object2 = new kotlin.jvm.functions.p<q0, d<? super k0>, Object>((NetworkResponse<? extends List<HelpCenterArticleSearchResponse>>)object2, this.$metricTracker, this.$searchRequestCallback, null){
                        final MetricTracker $metricTracker;
                        final NetworkResponse<List<HelpCenterArticleSearchResponse>> $searchForArticlesResponse;
                        final SearchRequestCallback $searchRequestCallback;
                        int label;
                        {
                            this.$searchForArticlesResponse = networkResponse;
                            this.$metricTracker = metricTracker;
                            this.$searchRequestCallback = searchRequestCallback;
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
                        public final Object invokeSuspend(@NotNull Object networkResponse) {
                            b.f();
                            if (this.label == 0) {
                                v.b(networkResponse);
                                networkResponse = this.$searchForArticlesResponse;
                                if (networkResponse instanceof NetworkResponse.ServerError) {
                                    this.$metricTracker.failedHelpCenter("help_center_data", "search_results", String.valueOf(((NetworkResponse.ServerError)networkResponse).getCode()), false);
                                    this.$searchRequestCallback.onError(((NetworkResponse.ServerError)this.$searchForArticlesResponse).getCode());
                                } else if (networkResponse instanceof NetworkResponse.ClientError || networkResponse instanceof NetworkResponse.NetworkError) {
                                    this.$metricTracker.failedHelpCenter("help_center_data", "search_results", null, false);
                                    this.$searchRequestCallback.onFailure();
                                } else if (networkResponse instanceof NetworkResponse.Success) {
                                    this.$searchRequestCallback.onComplete(HelpCenterApiWrapper.INSTANCE.transformSearchResponse((List)((NetworkResponse.Success)networkResponse).getBody()));
                                }
                                return k0.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    };
                    this.label = 2;
                    if (i.g((g)object, object2, this) == object3) {
                        return object3;
                    }
                }
                return k0.a;
            }
        }, 2, null);
    }

    @NotNull
    public final List<HelpCenterArticleSearchResult> transformSearchResponse(@NotNull List<HelpCenterArticleSearchResponse> object) {
        y.j(object, "response");
        object = (Iterable)object;
        ArrayList<HelpCenterArticleSearchResult> arrayList = new ArrayList<HelpCenterArticleSearchResult>(t.x(object, (int)10));
        Iterator<HelpCenterArticleSearchResponse> iterator = object.iterator();
        while (iterator.hasNext()) {
            HelpCenterArticleSearchResponse helpCenterArticleSearchResponse = iterator.next();
            object = helpCenterArticleSearchResponse.getHighlight().getTitle();
            String string2 = object != null && object.length() != 0 ? helpCenterArticleSearchResponse.getHighlight().getTitle() : helpCenterArticleSearchResponse.getTitle();
            Object object2 = helpCenterArticleSearchResponse.getHighlight().getSummary();
            String string3 = "";
            object = object2;
            if (object2 == null) {
                object = "";
            }
            String string4 = helpCenterArticleSearchResponse.getArticleId();
            object2 = INSTANCE;
            String string5 = super.removeHighlightTags(string2);
            string2 = helpCenterArticleSearchResponse.getSummary();
            if (string2 == null) {
                string2 = string3;
            }
            arrayList.add(new HelpCenterArticleSearchResult(string4, string5, string2, super.removeHighlightTags((String)object)));
        }
        return arrayList;
    }
}


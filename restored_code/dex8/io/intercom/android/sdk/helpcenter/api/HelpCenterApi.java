/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.helpcenter.api;

import io.intercom.android.sdk.helpcenter.api.HelpCenterApiHelper;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\b\u0010\tJ9\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\n\u001a\u00020\u00032\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\f\u0010\rJK\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0011\u0010\u0012Jc\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u00032\b\b\u0003\u0010\u0018\u001a\u00020\u00172\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2={"Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "", "", "", "options", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "fetchCollectionList", "(Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "id", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "fetchSectionsList", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "searchPhrase", "articleSource", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;", "searchForArticles", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "articleId", "", "reactionIndex", "articleContentId", "", "allowAutoResponses", "Lkotlin/k0;", "reactToArticle", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public interface HelpCenterApi {
    @POST(value="help_center/collections")
    @Nullable
    public Object fetchCollectionList(@Body @NotNull Map<String, String> var1, @NotNull d<? super NetworkResponse<? extends List<HelpCenterCollection>>> var2);

    @POST(value="help_center/collections/{id}")
    @Nullable
    public Object fetchSectionsList(@Path(value="id") @NotNull String var1, @Body @NotNull Map<String, String> var2, @NotNull d<? super NetworkResponse<HelpCenterCollectionContent>> var3);

    @POST(value="articles/{articleId}/react")
    @Nullable
    public Object reactToArticle(@Path(value="articleId") @NotNull String var1, @Query(value="reaction_index") int var2, @Query(value="article_content_id") @NotNull String var3, @Query(value="allow_auto_responses") boolean var4, @Query(value="article_source") @Nullable String var5, @Body @NotNull Map<String, String> var6, @NotNull d<? super NetworkResponse<k0>> var7);

    @POST(value="help_center/search")
    @Nullable
    public Object searchForArticles(@Query(value="phrase") @NotNull String var1, @Query(value="article_source") @Nullable String var2, @Body @NotNull Map<String, String> var3, @NotNull d<? super NetworkResponse<? extends List<HelpCenterArticleSearchResponse>>> var4);

    @Metadata(k=3, mv={1, 8, 0}, xi=48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object fetchCollectionList$default(HelpCenterApi helpCenterApi, Map map2, d d14, int n10, Object object) {
            if (object == null) {
                if ((n10 & 1) != 0) {
                    map2 = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
                }
                return helpCenterApi.fetchCollectionList(map2, d14);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCollectionList");
        }

        public static /* synthetic */ Object fetchSectionsList$default(HelpCenterApi helpCenterApi, String string2, Map map2, d d14, int n10, Object object) {
            if (object == null) {
                if ((n10 & 2) != 0) {
                    map2 = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
                }
                return helpCenterApi.fetchSectionsList(string2, map2, d14);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchSectionsList");
        }

        public static /* synthetic */ Object reactToArticle$default(HelpCenterApi helpCenterApi, String string2, int n10, String string3, boolean bl2, String string4, Map map2, d d14, int n13, Object object) {
            if (object == null) {
                if ((n13 & 8) != 0) {
                    bl2 = false;
                }
                if ((n13 & 0x10) != 0) {
                    string4 = null;
                }
                if ((n13 & 0x20) != 0) {
                    map2 = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
                }
                return helpCenterApi.reactToArticle(string2, n10, string3, bl2, string4, map2, d14);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reactToArticle");
        }

        public static /* synthetic */ Object searchForArticles$default(HelpCenterApi helpCenterApi, String string2, String string3, Map map2, d d14, int n10, Object object) {
            if (object == null) {
                if ((n10 & 2) != 0) {
                    string3 = null;
                }
                if ((n10 & 4) != 0) {
                    map2 = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
                }
                return helpCenterApi.searchForArticles(string2, string3, map2, d14);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchForArticles");
        }
    }
}


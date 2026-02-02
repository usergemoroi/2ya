/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.api;

import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationResponse;
import io.intercom.android.sdk.models.ConversationsResponse;
import io.intercom.android.sdk.models.GifResponse;
import io.intercom.android.sdk.models.LinkResponse;
import io.intercom.android.sdk.models.LogEventResponse;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Sheet;
import io.intercom.android.sdk.models.UpdateUserResponse;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.models.carousel.CarouselResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import kotlin.Metadata;
import kotlin.coroutines.d;
import okhttp3.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.b;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

@Metadata(d1={"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b\f\u0010\rJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0012\u0010\u0010J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b\u0013\u0010\rJ-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0010J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b\u0017\u0010\rJ\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b\u0019\u0010\u0016J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001a\u0010\u0007J\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b\u001c\u0010\u0016J#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001d\u0010\u0007J-\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001e\u0010\u0010J\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b \u0010\u0016J#\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b!\u0010\u0007J)\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b\"\u0010\rJ)\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b#\u0010\rJ-\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b$\u0010\u0010J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b&\u0010\u0016J\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b(\u0010\u0016J#\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b*\u0010\u0007J\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b+\u0010\u0016J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b,\u0010\u0016J\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b-\u0010\u0016J)\u00100\u001a\b\u0012\u0004\u0012\u00020/0\n2\b\b\u0001\u0010.\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b0\u0010\rJ)\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010.\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b1\u0010\rJ#\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b3\u0010\u0007J\u001f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b4\u0010\u0016J\u001f\u00106\u001a\b\u0012\u0004\u0012\u0002050\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b6\u0010\u0016J\u001f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b7\u0010\u0016J#\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b9\u0010\u0007J#\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b:\u0010\u0007J\u001f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b;\u0010\u0016J\u001f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b<\u0010\u0016J\u001f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b=\u0010\u0016J\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b>\u0010\u0016J\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b?\u0010\u0016J\u001f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b@\u0010\u0016J)\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\n2\b\b\u0001\u0010A\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\bC\u0010\rJ\u001f\u0010D\u001a\b\u0012\u0004\u0012\u00020B0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\bD\u0010\u0016J\u001f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\bF\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006G"}, d2={"Lio/intercom/android/sdk/api/MessengerApi;", "", "Lokhttp3/c0;", "options", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/models/ConversationResponse$Builder;", "startNewConversationSuspend", "(Lokhttp3/c0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "conversationId", "Lretrofit2/b;", "Ljava/lang/Void;", "reactToConversation", "(Ljava/lang/String;Lokhttp3/c0;)Lretrofit2/b;", "Lio/intercom/android/sdk/models/Conversation$Builder;", "submitFormSuspend", "(Ljava/lang/String;Lokhttp3/c0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/models/Part$Builder;", "replyToConversationSuspend", "markAsRead", "markAsReadSuspend", "markAsDismissed", "(Lokhttp3/c0;)Lretrofit2/b;", "recordInteractions", "Lio/intercom/android/sdk/models/ConversationsResponse$Builder;", "getConversations", "getConversationsSuspend", "Lio/intercom/android/sdk/models/UsersResponse$Builder;", "getUnreadConversations", "getUnreadConversationsSuspended", "getConversationSuspend", "Lio/intercom/android/sdk/models/OpenMessengerResponse;", "openMessenger", "openMessengerSuspended", "rateConversation", "addConversationRatingRemark", "addConversationQuickReplySuspend", "Lio/intercom/android/sdk/models/UpdateUserResponse$Builder;", "updateUser", "Lio/intercom/android/sdk/models/LogEventResponse$Builder;", "logEvent", "Lio/intercom/android/sdk/models/Upload$Builder;", "getUploadFileUrlSuspended", "setDeviceToken", "deleteDeviceToken", "sendMetrics", "articleId", "Lio/intercom/android/sdk/models/LinkResponse$Builder;", "getLink", "reactToLink", "Lio/intercom/android/sdk/models/GifResponse;", "getGifsSuspended", "reportError", "Lio/intercom/android/sdk/models/Sheet$Builder;", "getSheet", "submitSheet", "Lio/intercom/android/sdk/m5/home/data/HomeV2Response;", "getHomeCardsV2Suspend", "triggerInboundConversationSuspend", "markPushAsOpened", "markCarouselAsDismissed", "markCarouselAsCompleted", "markCarouselScreenViewed", "markPermissionGranted", "markCarouselActionButtonTapped", "carouselId", "Lio/intercom/android/sdk/models/carousel/CarouselResponse$Builder;", "getProgrammaticCarousel", "getCarousel", "Lio/intercom/android/sdk/survey/model/FetchSurveyRequest;", "getSurvey", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public interface MessengerApi {
    @POST(value="conversations/{conversationId}/quick_reply")
    @Nullable
    public Object addConversationQuickReplySuspend(@Path(value="conversationId") @NotNull String var1, @Body @NotNull c0 var2, @NotNull d<? super NetworkResponse<Part.Builder>> var3);

    @POST(value="conversations/{conversationId}/remark")
    @NotNull
    public b<Void> addConversationRatingRemark(@Path(value="conversationId") @NotNull String var1, @Body @NotNull c0 var2);

    @PUT(value="device_tokens")
    @NotNull
    public b<Void> deleteDeviceToken(@Body @NotNull c0 var1);

    @POST(value="content/fetch_carousel")
    @NotNull
    public b<CarouselResponse.Builder> getCarousel(@Body @NotNull c0 var1);

    @POST(value="conversations/{conversationId}")
    @Nullable
    public Object getConversationSuspend(@Path(value="conversationId") @NotNull String var1, @Body @NotNull c0 var2, @NotNull d<? super NetworkResponse<Conversation.Builder>> var3);

    @POST(value="conversations/inbox")
    @NotNull
    public b<ConversationsResponse.Builder> getConversations(@Body @NotNull c0 var1);

    @POST(value="conversations/inbox")
    @Nullable
    public Object getConversationsSuspend(@Body @NotNull c0 var1, @NotNull d<? super NetworkResponse<ConversationsResponse.Builder>> var2);

    @POST(value="gifs")
    @Nullable
    public Object getGifsSuspended(@Body @NotNull c0 var1, @NotNull d<? super NetworkResponse<? extends GifResponse>> var2);

    @POST(value="home")
    @Nullable
    public Object getHomeCardsV2Suspend(@Body @NotNull c0 var1, @NotNull d<? super NetworkResponse<HomeV2Response>> var2);

    @POST(value="articles/{articleId}")
    @NotNull
    public b<LinkResponse.Builder> getLink(@Path(value="articleId") @NotNull String var1, @Body @NotNull c0 var2);

    @POST(value="carousels/{carouselId}/fetch")
    @NotNull
    public b<CarouselResponse.Builder> getProgrammaticCarousel(@Path(value="carouselId") @NotNull String var1, @Body @NotNull c0 var2);

    @POST(value="sheets/open")
    @NotNull
    public b<Sheet.Builder> getSheet(@Body @NotNull c0 var1);

    @POST(value="content/fetch_survey")
    @NotNull
    public b<FetchSurveyRequest> getSurvey(@Body @NotNull c0 var1);

    @POST(value="conversations/unread")
    @NotNull
    public b<UsersResponse.Builder> getUnreadConversations(@Body @NotNull c0 var1);

    @POST(value="conversations/unread")
    @Nullable
    public Object getUnreadConversationsSuspended(@Body @NotNull c0 var1, @NotNull d<? super NetworkResponse<? extends UsersResponse.Builder>> var2);

    @POST(value="uploads")
    @Nullable
    public Object getUploadFileUrlSuspended(@Body @NotNull c0 var1, @NotNull d<? super NetworkResponse<Upload.Builder>> var2);

    @POST(value="events")
    @NotNull
    public b<LogEventResponse.Builder> logEvent(@Body @NotNull c0 var1);

    @POST(value="conversations/dismiss")
    @NotNull
    public b<Void> markAsDismissed(@Body @NotNull c0 var1);

    @POST(value="conversations/{conversationId}/read")
    @NotNull
    public b<Void> markAsRead(@Path(value="conversationId") @NotNull String var1, @Body @NotNull c0 var2);

    @POST(value="conversations/{conversationId}/read")
    @Nullable
    public Object markAsReadSuspend(@Path(value="conversationId") @NotNull String var1, @Body @NotNull c0 var2, @NotNull d<? super NetworkResponse<Void>> var3);

    @POST(value="stats_system/carousel_button_action_tapped")
    @NotNull
    public b<Void> markCarouselActionButtonTapped(@Body @NotNull c0 var1);

    @POST(value="stats_system/carousel_completed")
    @NotNull
    public b<Void> markCarouselAsCompleted(@Body @NotNull c0 var1);

    @POST(value="stats_system/carousel_dismissed")
    @NotNull
    public b<Void> markCarouselAsDismissed(@Body @NotNull c0 var1);

    @POST(value="stats_system/carousel_screen_viewed")
    @NotNull
    public b<Void> markCarouselScreenViewed(@Body @NotNull c0 var1);

    @POST(value="stats_system/carousel_permission_granted")
    @NotNull
    public b<Void> markPermissionGranted(@Body @NotNull c0 var1);

    @POST(value="stats_system/push_opened")
    @NotNull
    public b<Void> markPushAsOpened(@Body @NotNull c0 var1);

    @POST(value="open")
    @NotNull
    public b<OpenMessengerResponse> openMessenger(@Body @NotNull c0 var1);

    @POST(value="open")
    @Nullable
    public Object openMessengerSuspended(@Body @NotNull c0 var1, @NotNull d<? super NetworkResponse<OpenMessengerResponse>> var2);

    @POST(value="conversations/{conversationId}/rate")
    @NotNull
    public b<Void> rateConversation(@Path(value="conversationId") @NotNull String var1, @Body @NotNull c0 var2);

    @POST(value="conversations/{conversationId}/react")
    @NotNull
    public b<Void> reactToConversation(@Path(value="conversationId") @NotNull String var1, @Body @NotNull c0 var2);

    @POST(value="articles/{articleId}/react")
    @NotNull
    public b<Void> reactToLink(@Path(value="articleId") @NotNull String var1, @Body @NotNull c0 var2);

    @POST(value="conversations/{conversationId}/record_interactions")
    @NotNull
    public b<Void> recordInteractions(@Path(value="conversationId") @NotNull String var1, @Body @NotNull c0 var2);

    @POST(value="conversations/{conversationId}/reply")
    @Nullable
    public Object replyToConversationSuspend(@Path(value="conversationId") @NotNull String var1, @Body @NotNull c0 var2, @NotNull d<? super NetworkResponse<Part.Builder>> var3);

    @POST(value="error_reports")
    @NotNull
    public b<Void> reportError(@Body @NotNull c0 var1);

    @POST(value="metrics")
    @NotNull
    public b<Void> sendMetrics(@Body @NotNull c0 var1);

    @POST(value="device_tokens")
    @NotNull
    public b<Void> setDeviceToken(@Body @NotNull c0 var1);

    @POST(value="conversations")
    @Nullable
    public Object startNewConversationSuspend(@Body @NotNull c0 var1, @NotNull d<? super NetworkResponse<ConversationResponse.Builder>> var2);

    @POST(value="conversations/{conversationId}/form")
    @Nullable
    public Object submitFormSuspend(@Path(value="conversationId") @NotNull String var1, @Body @NotNull c0 var2, @NotNull d<? super NetworkResponse<Conversation.Builder>> var3);

    @POST(value="sheets/submit")
    @NotNull
    public b<Void> submitSheet(@Body @NotNull c0 var1);

    @POST(value="custom_bots/trigger_inbound_conversation")
    @Nullable
    public Object triggerInboundConversationSuspend(@Body @NotNull c0 var1, @NotNull d<? super NetworkResponse<Conversation.Builder>> var2);

    @POST(value="users")
    @NotNull
    public b<UpdateUserResponse.Builder> updateUser(@Body @NotNull c0 var1);

    @Metadata(k=3, mv={1, 8, 0}, xi=48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getConversationSuspend$default(MessengerApi messengerApi, String string2, c0 c04, d d14, int n10, Object object) {
            if (object == null) {
                if ((n10 & 2) != 0) {
                    c04 = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
                }
                return messengerApi.getConversationSuspend(string2, c04, d14);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationSuspend");
        }

        public static /* synthetic */ Object getConversationsSuspend$default(MessengerApi messengerApi, c0 c04, d d14, int n10, Object object) {
            if (object == null) {
                if ((n10 & 1) != 0) {
                    c04 = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
                }
                return messengerApi.getConversationsSuspend(c04, d14);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationsSuspend");
        }

        public static /* synthetic */ Object getHomeCardsV2Suspend$default(MessengerApi messengerApi, c0 c04, d d14, int n10, Object object) {
            if (object == null) {
                if ((n10 & 1) != 0) {
                    c04 = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
                }
                return messengerApi.getHomeCardsV2Suspend(c04, d14);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHomeCardsV2Suspend");
        }

        public static /* synthetic */ Object getUnreadConversationsSuspended$default(MessengerApi messengerApi, c0 c04, d d14, int n10, Object object) {
            if (object == null) {
                if ((n10 & 1) != 0) {
                    c04 = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
                }
                return messengerApi.getUnreadConversationsSuspended(c04, d14);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUnreadConversationsSuspended");
        }

        public static /* synthetic */ Object openMessengerSuspended$default(MessengerApi messengerApi, c0 c04, d d14, int n10, Object object) {
            if (object == null) {
                if ((n10 & 1) != 0) {
                    c04 = MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null);
                }
                return messengerApi.openMessengerSuspended(c04, d14);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openMessengerSuspended");
        }
    }
}


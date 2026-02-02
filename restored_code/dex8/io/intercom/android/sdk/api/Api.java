/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.intercom.twig.Twig
 *  okhttp3.z
 *  org.json.JSONObject
 */
package io.intercom.android.sdk.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomStatusCallback;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.BaseCallback;
import io.intercom.android.sdk.api.CallbackHolder;
import io.intercom.android.sdk.api.DeviceIdentifierHolderKt;
import io.intercom.android.sdk.api.ErrorObject;
import io.intercom.android.sdk.api.ErrorStringExtractorKt;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.api.RateLimiter;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.api.a;
import io.intercom.android.sdk.api.b;
import io.intercom.android.sdk.errorreporting.ErrorReport;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricObject;
import io.intercom.android.sdk.metrics.ops.OpsMetricObject;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.LinkResponse;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.OverlayState;
import io.intercom.android.sdk.models.Sheet;
import io.intercom.android.sdk.models.UpdateUserResponse;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.models.carousel.CarouselResponse;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.user.DeviceData;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.f;
import okhttp3.p;
import org.json.JSONObject;
import retrofit2.d;
import retrofit2.z;

public class Api {
    private static final String CAROUSEL_AUTOMATIC = "shown_automatically";
    private static final String CAROUSEL_CREATED_VIA = "created_via";
    private static final String CAROUSEL_PROGRAMMATIC = "triggered_from_code";
    private static final String CAROUSEL_VISIBLE = "carousel_visible";
    private static final String DEVICE_DATA = "device_data";
    private static final String DEVICE_TOKEN = "device_token";
    private static final String HMAC = "hmac";
    private static final String INSTANCE_ID = "instance_id";
    private static final String NEW_SESSION = "new_session";
    private static final String SCREEN_ID = "screen_id";
    private static final String SENT_FROM_BACKGROUND = "sent_from_background";
    private static final Twig TWIG = LumberMill.getLogger();
    private static final String USER = "user";
    private static final String USER_ATTRIBUTES = "user_attributes";
    private final okhttp3.z apiHttpClient;
    private final Provider<AppConfig> appConfigProvider;
    private final AppIdentity appIdentity;
    final CallbackHolder callbacks;
    private final Context context;
    private final IntercomDataLayer dataLayer;
    private final int defaultOkHttpMaxRequests;
    private final d<Void> emptyCallback;
    final okhttp3.z httpClient = new okhttp3.z();
    private final MessengerApi messengerApi;
    private OpsMetricTracker opsMetricTracker;
    private final RateLimiter rateLimiter;
    private final Store<State> store;
    final UserIdentity userIdentity;

    public Api(Context context, AppIdentity appIdentity, UserIdentity userIdentity, okhttp3.z z13, MessengerApi messengerApi, CallbackHolder callbackHolder, RateLimiter rateLimiter, Store<State> store, Provider<AppConfig> provider, OpsMetricTracker opsMetricTracker, IntercomDataLayer intercomDataLayer) {
        this.emptyCallback = new d<Void>(this){
            final Api this$0;
            {
                this.this$0 = api;
            }

            @Override
            public void onFailure(retrofit2.b<Void> b11, Throwable throwable) {
            }

            @Override
            public void onResponse(retrofit2.b<Void> b11, z<Void> z13) {
            }
        };
        this.context = context;
        this.appIdentity = appIdentity;
        this.userIdentity = userIdentity;
        this.messengerApi = messengerApi;
        this.callbacks = callbackHolder;
        this.rateLimiter = rateLimiter;
        this.store = store;
        this.appConfigProvider = provider;
        this.opsMetricTracker = opsMetricTracker;
        this.dataLayer = intercomDataLayer;
        this.apiHttpClient = z13;
        this.defaultOkHttpMaxRequests = z13.o().h();
        this.updateMaxRequests();
    }

    private void addCarouselCreatedViaParam(Map<String, Object> map2, boolean bl2) {
        String string2 = bl2 ? CAROUSEL_PROGRAMMATIC : CAROUSEL_AUTOMATIC;
        map2.put(CAROUSEL_CREATED_VIA, string2);
    }

    private Map<String, Object> generateUpdateUserParams(UserUpdateRequest userUpdateRequest) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put(USER, this.userIdentity.toMap());
        hashMap.put(DEVICE_DATA, DeviceData.generateDeviceData(this.context));
        hashMap.put(NEW_SESSION, userUpdateRequest.isNewSession());
        hashMap.put(SENT_FROM_BACKGROUND, userUpdateRequest.isSentFromBackground());
        hashMap.put(USER_ATTRIBUTES, userUpdateRequest.getAttributes());
        hashMap.put(CAROUSEL_VISIBLE, this.isCarouselVisible());
        this.addSecureHash(hashMap);
        return hashMap;
    }

    private boolean isCarouselVisible() {
        Carousel carousel = ((OverlayState)this.dataLayer.getOverlayState().getValue()).getCarousel();
        return Carousel.NULL.equals(carousel) ^ true;
    }

    protected static boolean isUserNotFound(ErrorObject errorObject, Map map2) {
        if (errorObject.hasErrorBody() && errorObject.getStatusCode() == 404 && map2 != null && map2.get("intercom_id") != null && map2.size() > 1) {
            try {
                map2 = new JSONObject(errorObject.getErrorBody());
                boolean bl2 = map2.getJSONArray("errors").getJSONObject(0).getString("code").equals("not_found");
                if (bl2) {
                    return true;
                }
            }
            catch (Exception exception) {
                TWIG.internal("Could not parse error response");
            }
        }
        return false;
    }

    private void logBackgroundDisabledError() {
        TWIG.e("Your request was not sent because the app is in the background. Please contact Intercom to enable background requests.", new Object[0]);
    }

    private void retriableUpdateUser(Map<String, Object> map2, String string2, IntercomStatusCallback intercomStatusCallback) {
        this.messengerApi.updateUser(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map2)).enqueue((d<UpdateUserResponse.Builder>)new BaseCallback<UpdateUserResponse.Builder>(this, intercomStatusCallback, string2, map2){
            final Api this$0;
            final String val$fingerprint;
            final IntercomStatusCallback val$intercomStatusCallback;
            final Map val$params;
            {
                this.this$0 = api;
                this.val$intercomStatusCallback = intercomStatusCallback;
                this.val$fingerprint = string2;
                this.val$params = map2;
            }

            public static /* synthetic */ void a(IntercomStatusCallback intercomStatusCallback, ErrorObject errorObject, String string2) {
                1.lambda$onError$0(intercomStatusCallback, errorObject, string2);
            }

            private static /* synthetic */ void lambda$onError$0(IntercomStatusCallback intercomStatusCallback, ErrorObject errorObject, String string2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ERROR - [HTTP ");
                stringBuilder.append(errorObject.getStatusCode());
                stringBuilder.append("] - ");
                stringBuilder.append(string2);
                intercomStatusCallback.onFailure(new IntercomError(1001, stringBuilder.toString()));
            }

            @Override
            void logFailure(String string2, ErrorObject errorObject) {
                super.logFailure("Failed to register or update user", errorObject);
            }

            @Override
            public void onError(ErrorObject errorObject) {
                Object object = (Map)this.val$params.get(Api.USER);
                if (Api.isUserNotFound(errorObject, (Map)object)) {
                    object.remove("intercom_id");
                    this.val$params.put(Api.USER, object);
                    this.this$0.retriableUpdateUser(this.val$params, this.val$fingerprint, this.val$intercomStatusCallback);
                } else {
                    object = ErrorStringExtractorKt.extractErrorString(errorObject);
                    new Handler(Looper.getMainLooper()).post((Runnable)new b(this.val$intercomStatusCallback, errorObject, (String)object));
                }
            }

            @Override
            public void onSuccess(UpdateUserResponse.Builder object) {
                Handler handler = new Handler(Looper.getMainLooper());
                IntercomStatusCallback intercomStatusCallback = this.val$intercomStatusCallback;
                Objects.requireNonNull(intercomStatusCallback);
                handler.post((Runnable)new a(intercomStatusCallback));
                if (this.val$fingerprint.equals(this.this$0.userIdentity.getFingerprint())) {
                    TWIG.i("Successfully registered or updated user", new Object[0]);
                    this.this$0.callbacks.unreadCallback().onSuccess((UsersResponse.Builder)object);
                    object = ((UpdateUserResponse.Builder)object).build();
                    this.this$0.dataLayer.updateTeamPresence(((UpdateUserResponse)object).getTeamPresence());
                    this.this$0.dataLayer.updateComposerSuggestions(((UpdateUserResponse)object).getComposerSuggestions());
                    this.this$0.dataLayer.updateCarousel(((UpdateUserResponse)object).getCarousel());
                    this.this$0.dataLayer.updateBotIntro(((UpdateUserResponse)object).getBotIntro());
                    this.this$0.dataLayer.updateSurveyData(((UpdateUserResponse)object).getSurveyData());
                    this.this$0.dataLayer.updateBotBehaviourId(((UpdateUserResponse)object).getBotBehaviourId());
                    this.this$0.opsMetricTracker.trackEvent("finish", "time-to-complete-ping-ms");
                }
            }
        });
    }

    private boolean shouldStopBackgroundRequest(boolean bl2) {
        bl2 = bl2 && this.appConfigProvider.get().isBackgroundRequestsDisabled();
        return bl2;
    }

    private Map<String, Object> statsSystemParams(String string2) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put(INSTANCE_ID, string2);
        hashMap.put(USER, this.userIdentity.toMap());
        this.addSecureHash(hashMap);
        return hashMap;
    }

    private Map<String, Object> statsSystemParams(String object, String string2) {
        object = this.statsSystemParams((String)object);
        object.put(SCREEN_ID, string2);
        return object;
    }

    public void addConversationRatingRemark(String string2, String string3) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put(USER, this.userIdentity.toMap());
        hashMap.put("remark", string3);
        this.addSecureHash(hashMap);
        this.messengerApi.addConversationRatingRemark(string2, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.callbacks.loggingCallback("adding remark to conversation"));
    }

    public void addSecureHash(Map<String, Object> map2) {
        map2.put("device_identifier", DeviceIdentifierHolderKt.getDeviceIdentifier(this.context));
        String string2 = this.userIdentity.getHmac();
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            map2.put(HMAC, string2);
        }
    }

    public Map<String, Object> baseNewConversationParams() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("app_id", this.appIdentity.appId());
        hashMap.put(USER, this.userIdentity.toMap());
        this.addSecureHash(hashMap);
        return hashMap;
    }

    public Map<String, Object> createBaseReplyParams() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("app_id", this.appIdentity.appId());
        hashMap.put("type", USER);
        hashMap.put("message_type", "comment");
        hashMap.put(USER, this.userIdentity.toMap());
        this.addSecureHash(hashMap);
        return hashMap;
    }

    public void fetchCarouselByEntityId(String string2) {
        Map<String, Object> map2 = this.userIdentity.toMap();
        map2.put("entity_id", string2);
        map2.put("entity_type", 44);
        this.addSecureHash(map2);
        this.messengerApi.getCarousel(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map2)).enqueue((d<CarouselResponse.Builder>)new BaseCallback<CarouselResponse.Builder>(this){
            final Api this$0;
            {
                this.this$0 = api;
            }

            @Override
            protected void onSuccess(CarouselResponse.Builder builder) {
                this.this$0.dataLayer.updateCarousel(builder.build().carousel().build());
            }
        });
    }

    public void fetchProgrammaticCarousel(String string2) {
        Map<String, Object> map2 = this.userIdentity.toMap();
        this.addSecureHash(map2);
        this.messengerApi.getProgrammaticCarousel(string2, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map2)).enqueue(this.callbacks.getCarouselCallback(string2));
    }

    public void fetchSheet(HashMap<String, Object> hashMap, d<Sheet.Builder> d14) {
        HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
        hashMap2.put(USER, this.userIdentity.toMap());
        this.addSecureHash(hashMap2);
        hashMap2.putAll(hashMap);
        this.messengerApi.getSheet(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap2)).enqueue(d14);
    }

    public void fetchSurveyByEntityId(String string2) {
        Map<String, Object> map2 = this.userIdentity.toMap();
        map2.put("entity_id", string2);
        map2.put("entity_type", 85);
        this.addSecureHash(map2);
        this.messengerApi.getSurvey(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map2)).enqueue((d<FetchSurveyRequest>)new BaseCallback<FetchSurveyRequest>(this){
            final Api this$0;
            {
                this.this$0 = api;
            }

            @Override
            protected void onSuccess(FetchSurveyRequest fetchSurveyRequest) {
                this.this$0.dataLayer.updateSurveyData(fetchSurveyRequest.getSurvey());
            }
        });
    }

    public void getLink(String string2, d<LinkResponse.Builder> d14) {
        Map<String, Object> map2 = this.userIdentity.toMap();
        this.addSecureHash(map2);
        this.messengerApi.getLink(string2, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map2)).enqueue(d14);
    }

    public void getUnreadConversations() {
        Map<String, Object> map2 = this.userIdentity.toMap();
        map2.put("per_page", "20");
        this.addSecureHash(map2);
        this.messengerApi.getUnreadConversations(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map2)).enqueue(this.callbacks.unreadCallback());
    }

    public void getVideo(String string2, f f11) {
        this.httpClient.a(new b0.a().k(string2).b()).enqueue(f11);
    }

    public void hitTrackingUrl(String string2) {
        this.httpClient.a(new b0.a().k(string2).b()).enqueue(new f(this){
            final Api this$0;
            {
                this.this$0 = api;
            }

            @Override
            public void onFailure(e e11, IOException iOException) {
                TWIG.internal("Tracking Url", "Failed tracking url request");
            }

            @Override
            public void onResponse(e e11, d0 d03) {
                TWIG.internal("Tracking Url", "success");
                d03.d().close();
            }
        });
    }

    @VisibleForTesting
    public boolean isIdle() {
        boolean bl2 = this.apiHttpClient.o().j() == 0;
        return bl2;
    }

    @VisibleForTesting
    boolean isSynchronous() {
        int n10 = this.apiHttpClient.o().h();
        boolean bl2 = true;
        if (n10 != 1) {
            bl2 = false;
        }
        return bl2;
    }

    public void logEvent(String object, Map<String, ?> map2) {
        if (this.rateLimiter.isLimited()) {
            this.rateLimiter.logError();
            return;
        }
        Boolean bl2 = this.store.select(Selectors.APP_IS_BACKGROUNDED);
        if (this.shouldStopBackgroundRequest(bl2)) {
            this.logBackgroundDisabledError();
            return;
        }
        this.rateLimiter.recordRequest();
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("event_name", object);
        if (!map2.isEmpty()) {
            hashMap.put("metadata", map2);
        }
        object = new HashMap();
        object.put("event", hashMap);
        object.put(SENT_FROM_BACKGROUND, bl2);
        object.put(USER, this.userIdentity.toMap());
        object.put(CAROUSEL_VISIBLE, this.isCarouselVisible());
        this.addSecureHash((Map<String, Object>)object);
        this.messengerApi.logEvent(MessengerApiHelper.INSTANCE.optionsMapToRequestBody((Map<String, ? extends Object>)object)).enqueue(this.callbacks.logEventCallback());
    }

    public void markCarouselActionButtonTapped(String object, String string2, boolean bl2) {
        object = this.statsSystemParams((String)object, string2);
        this.addCarouselCreatedViaParam((Map<String, Object>)object, bl2);
        this.messengerApi.markCarouselActionButtonTapped(MessengerApiHelper.INSTANCE.optionsMapToRequestBody((Map<String, ? extends Object>)object)).enqueue(this.emptyCallback);
    }

    public void markCarouselAsCompleted(String object, boolean bl2) {
        object = this.statsSystemParams((String)object);
        this.addCarouselCreatedViaParam((Map<String, Object>)object, bl2);
        this.messengerApi.markCarouselAsCompleted(MessengerApiHelper.INSTANCE.optionsMapToRequestBody((Map<String, ? extends Object>)object)).enqueue(this.emptyCallback);
    }

    public void markCarouselAsDismissed(String object, boolean bl2) {
        object = this.statsSystemParams((String)object);
        this.addCarouselCreatedViaParam((Map<String, Object>)object, bl2);
        this.messengerApi.markCarouselAsDismissed(MessengerApiHelper.INSTANCE.optionsMapToRequestBody((Map<String, ? extends Object>)object)).enqueue(this.emptyCallback);
    }

    public void markCarouselScreenViewed(String object, String string2, boolean bl2) {
        object = this.statsSystemParams((String)object, string2);
        this.addCarouselCreatedViaParam((Map<String, Object>)object, bl2);
        this.messengerApi.markCarouselScreenViewed(MessengerApiHelper.INSTANCE.optionsMapToRequestBody((Map<String, ? extends Object>)object)).enqueue(this.emptyCallback);
    }

    public void markConversationAsDismissed(String string2) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put(USER, this.userIdentity.toMap());
        hashMap.put("conversation_ids", new String[]{string2});
        this.addSecureHash(hashMap);
        this.messengerApi.markAsDismissed(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.emptyCallback);
    }

    public void markConversationAsRead(String string2) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("app_id", this.appIdentity.appId());
        hashMap.put(USER, this.userIdentity.toMap());
        this.addSecureHash(hashMap);
        this.messengerApi.markAsRead(string2, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.emptyCallback);
    }

    public void markPermissionGranted(String object, String string2, boolean bl2) {
        object = this.statsSystemParams((String)object, string2);
        this.addCarouselCreatedViaParam((Map<String, Object>)object, bl2);
        this.messengerApi.markPermissionGranted(MessengerApiHelper.INSTANCE.optionsMapToRequestBody((Map<String, ? extends Object>)object)).enqueue(this.emptyCallback);
    }

    public void markPushAsOpened(String object) {
        object = this.statsSystemParams((String)object);
        this.messengerApi.markPushAsOpened(MessengerApiHelper.INSTANCE.optionsMapToRequestBody((Map<String, ? extends Object>)object)).enqueue(this.emptyCallback);
    }

    public void openMessenger() {
        Map<String, Object> map2 = this.userIdentity.toMap();
        this.addSecureHash(map2);
        this.messengerApi.openMessenger(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(map2)).enqueue((d<OpenMessengerResponse>)new BaseCallback<OpenMessengerResponse>(this){
            final Api this$0;
            {
                this.this$0 = api;
            }

            @Override
            protected void onError(ErrorObject errorObject) {
                super.onError(errorObject);
            }

            @Override
            protected void onSuccess(OpenMessengerResponse object) {
                object = ((OpenMessengerResponse)object).getComposerSuggestions();
                this.this$0.dataLayer.updateComposerSuggestions((ComposerSuggestions)object);
            }
        });
    }

    public void rateConversation(String string2, int n10) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put(USER, this.userIdentity.toMap());
        hashMap.put("rating_index", n10);
        this.addSecureHash(hashMap);
        this.messengerApi.rateConversation(string2, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.callbacks.loggingCallback("conversation rating"));
    }

    public void reactToConversation(String string2, int n10) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put(USER, this.userIdentity.toMap());
        hashMap.put("reaction_index", n10);
        this.addSecureHash(hashMap);
        this.messengerApi.reactToConversation(string2, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.callbacks.loggingCallback("add reaction to conversation"));
    }

    public void reactToLink(String string2, @Nullable String string3, int n10, boolean bl2) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put(USER, this.userIdentity.toMap());
        hashMap.put("article_content_id", string3);
        hashMap.put("reaction_index", n10);
        hashMap.put("allow_auto_responses", bl2);
        this.addSecureHash(hashMap);
        this.messengerApi.reactToLink(string2, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.callbacks.loggingCallback("add reaction to link"));
    }

    public void recordInteractions(String string2, String[] stringArray) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put(USER, this.userIdentity.toMap());
        hashMap.put("interactions", stringArray);
        this.addSecureHash(hashMap);
        this.messengerApi.recordInteractions(string2, MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.emptyCallback);
    }

    public void removeDeviceToken(String string2, UserIdentity userIdentity) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        if (userIdentity.isSoftReset()) {
            hashMap.put(USER, userIdentity.softUserIdentityToMap());
        } else {
            hashMap.put(USER, userIdentity.toMap());
        }
        hashMap.put(DEVICE_TOKEN, string2);
        this.addSecureHash(hashMap);
        this.messengerApi.deleteDeviceToken(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.emptyCallback);
    }

    @VisibleForTesting
    void retriableUpdateUser(Map<String, Object> map2, IntercomStatusCallback intercomStatusCallback) {
        this.retriableUpdateUser(map2, this.userIdentity.getFingerprint(), intercomStatusCallback);
    }

    public void sendErrorReport(ErrorReport errorReport) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put(USER, this.userIdentity.toMap());
        hashMap.put("error_report", errorReport);
        this.addSecureHash(hashMap);
        this.messengerApi.reportError(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(this.callbacks.loggingCallback("report error"));
    }

    public void sendMetrics(List<MetricObject> list, List<OpsMetricObject> list2, d<Void> d14) {
        HashMap<String, List<Object>> hashMap = new HashMap<String, List<Object>>();
        hashMap.put("metrics", list);
        hashMap.put("op_metrics", list2);
        this.messengerApi.sendMetrics(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(d14);
    }

    public void setDeviceToken(String object) {
        Map<String, Object> map2 = DeviceData.generateDeviceData(this.context);
        map2.put(DEVICE_TOKEN, object);
        object = new HashMap();
        object.put(USER, this.userIdentity.toMap());
        object.put(DEVICE_DATA, map2);
        this.addSecureHash((Map<String, Object>)object);
        this.messengerApi.setDeviceToken(MessengerApiHelper.INSTANCE.optionsMapToRequestBody((Map<String, ? extends Object>)object)).enqueue(this.emptyCallback);
    }

    @VisibleForTesting
    public void setIdleCallback(Runnable runnable) {
        this.apiHttpClient.o().k(runnable);
    }

    public void submitSheet(String string2, Map<String, Object> map2, d<Void> d14) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put(USER, this.userIdentity.toMap());
        this.addSecureHash(hashMap);
        hashMap.put("uri", string2);
        hashMap.put("sheet_values", map2);
        this.messengerApi.submitSheet(MessengerApiHelper.INSTANCE.optionsMapToRequestBody(hashMap)).enqueue(d14);
    }

    public void updateMaxRequests() {
        int n10 = this.userIdentity.hasIntercomId() ? this.defaultOkHttpMaxRequests : 1;
        p p14 = this.apiHttpClient.o();
        if (p14.h() != n10) {
            p14.l(n10);
        }
    }

    public void updateUser(UserUpdateRequest userUpdateRequest, IntercomStatusCallback intercomStatusCallback) {
        if (userUpdateRequest.isInternalUpdate() ^ true) {
            if (this.rateLimiter.isLimited()) {
                this.rateLimiter.logError();
                intercomStatusCallback.onFailure(new IntercomError(1005, "rate limit reached"));
                return;
            }
            if (this.shouldStopBackgroundRequest(userUpdateRequest.isSentFromBackground())) {
                this.logBackgroundDisabledError();
                intercomStatusCallback.onFailure(new IntercomError(1006, "Background requests are disabled"));
                return;
            }
            this.rateLimiter.recordRequest();
        }
        this.retriableUpdateUser(this.generateUpdateUserParams(userUpdateRequest), intercomStatusCallback);
    }
}


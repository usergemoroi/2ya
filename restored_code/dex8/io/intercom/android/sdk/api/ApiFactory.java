/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  androidx.annotation.Nullable
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  okhttp3.z
 *  retrofit2.converter.gson.a
 */
package io.intercom.android.sdk.api;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.CallbackHolder;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.HeaderInterceptor;
import io.intercom.android.sdk.api.KotlinXConvertorFactory;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.RateLimiter;
import io.intercom.android.sdk.api.RetryInterceptor;
import io.intercom.android.sdk.api.ShutdownInterceptor;
import io.intercom.android.sdk.api.ShutdownState;
import io.intercom.android.sdk.api.SurveyApi;
import io.intercom.android.sdk.api.TaggingSocketFactory;
import io.intercom.android.sdk.api.UserIdentityInterceptor;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseAdapterFactory;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.models.TicketAttributeType;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.tickets.create.data.TicketApi;
import io.intercom.android.sdk.utilities.UtilsKt;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import io.intercom.android.sdk.utilities.gson.RuntimeTypeAdapterFactory;
import java.io.File;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import okhttp3.c;
import okhttp3.z;
import retrofit2.a0;
import retrofit2.converter.gson.a;
import retrofit2.h;

public class ApiFactory {
    private static final String CACHE_NAME = "Intercom_SDK/HttpCache";
    private static final int CACHE_SIZE = 0xA00000;
    private static final String ENDPOINT = "/messenger/mobile/";
    private static final int INTERCOM_TRAFFIC_TAG = 46837266;
    private static final int MAX_DNS_SEGMENT_SIZE = 63;
    private static final String PARTIAL_HOSTNAME_AUS = ".mobile-messenger.au.intercom.io";
    private static final String PARTIAL_HOSTNAME_EU = ".mobile-messenger.eu.intercom.io";
    private static final String PARTIAL_HOSTNAME_US = ".mobile-messenger.intercom.com";
    private static final String PROTOCOL = "https://";
    @Nullable
    private static a0 kotlinxRetrofit;
    @Nullable
    private static a0 legacyRetrofit;
    @Nullable
    public static MessengerApi messengerApi;
    @Nullable
    private static z okHttpClient;
    @Nullable
    private static z okHttpClientWithoutHeaders;
    @Nullable
    private static a0 retrofitWithoutHeaders;
    @Nullable
    public static ExternalUploadApi uploadApi;

    static String convertHostnameToUrl(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PROTOCOL);
        stringBuilder.append(string2);
        stringBuilder.append(ENDPOINT);
        return stringBuilder.toString();
    }

    public static Api create(Context context, AppIdentity appIdentity, UserIdentity userIdentity, Store<State> store, String string2, Provider<AppConfig> provider, OpsMetricTracker opsMetricTracker, IntercomDataLayer intercomDataLayer) {
        return ApiFactory.createWithNetworkClient(context, appIdentity, userIdentity, ApiFactory.createConfigurableHttpClient(context, appIdentity, userIdentity), store, string2, provider, opsMetricTracker, intercomDataLayer);
    }

    public static z createConfigurableHttpClient(Context object, AppIdentity object2, UserIdentity userIdentity) {
        if (okHttpClient == null) {
            z.a a14 = new z.a();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            object2 = a14.P(2L, timeUnit).f(2L, timeUnit).S(2L, timeUnit).Q(new TaggingSocketFactory(SocketFactory.getDefault(), 46837266)).a(new UserIdentityInterceptor(userIdentity)).a(new RetryInterceptor(new RetryInterceptor.Sleeper())).a(new ShutdownInterceptor(new ShutdownState((Context)object, (AppIdentity)object2, TimeProvider.SYSTEM))).b(HeaderInterceptor.create((Context)object, (AppIdentity)object2));
            if ((object = object.getCacheDir()) != null) {
                ((z.a)object2).d(new c(new File(((File)object).getAbsolutePath(), CACHE_NAME), 0xA00000L));
            }
            okHttpClient = ((z.a)object2).c();
        }
        if (okHttpClientWithoutHeaders == null) {
            okHttpClientWithoutHeaders = new z.a().c();
        }
        return okHttpClient;
    }

    public static HelpCenterApi createHelpCenterApi(Context context, AppIdentity appIdentity, UserIdentity userIdentity, String string2, Gson gson) {
        ApiFactory.createRetrofit(string2, ApiFactory.createConfigurableHttpClient(context, appIdentity, userIdentity), gson);
        return kotlinxRetrofit.b(HelpCenterApi.class);
    }

    private static MessengerApi createMessengerApi(z z13, String string2) {
        RuntimeTypeAdapterFactory<HomeCards.UnSupported> runtimeTypeAdapterFactory = RuntimeTypeAdapterFactory.of(HomeCards.class, "type").registerSubtype(HomeCards.HomeSpacesData.class, HomeCardType.SPACES.name().toLowerCase()).registerSubtype(HomeCards.HomeNewConversationData.class, HomeCardType.NEW_CONVERSATION.name().toLowerCase()).registerSubtype(HomeCards.HomeRecentConversationData.class, HomeCardType.RECENT_CONVERSATION.name().toLowerCase()).registerSubtype(HomeCards.HomeHelpCenterData.class, HomeCardType.HELP_CENTER.name().toLowerCase()).registerSubtype(HomeCards.HomeExternalLinkData.class, HomeCardType.EXTERNAL_LINKS.name().toLowerCase()).registerSubtype(HomeCards.HomeMessengerAppData.class, HomeCardType.MESSENGER_APP.name().toLowerCase()).registerSubtype(HomeCards.HomeRecentTicketsData.class, HomeCardType.RECENT_TICKETS.name().toLowerCase()).registerSubtype(HomeCards.HomeTicketLinksData.class, HomeCardType.TICKET_LINKS.name().toLowerCase()).registerIgnoredSubtype(HomeCards.UnSupported.class, "UnSupported");
        ApiFactory.createRetrofit(string2, z13, new GsonBuilder().registerTypeAdapterFactory(runtimeTypeAdapterFactory).registerTypeAdapterFactory(ApiFactory.getTicketTypeAdapterFactory()).create());
        return legacyRetrofit.b(MessengerApi.class);
    }

    private static void createRetrofit(String string2, z object, Gson gson) {
        if (legacyRetrofit == null) {
            legacyRetrofit = new a0.b().c(string2).a(new NetworkResponseAdapterFactory()).g((z)object).b((h.a)a.f((Gson)gson)).e();
        }
        if (kotlinxRetrofit == null) {
            kotlinxRetrofit = new a0.b().c(string2).a(new NetworkResponseAdapterFactory()).g((z)object).b(KotlinXConvertorFactory.INSTANCE.getConvertorFactory()).e();
        }
        if (retrofitWithoutHeaders == null) {
            object = new a0.b().c(string2).a(new NetworkResponseAdapterFactory()).b((h.a)a.f((Gson)gson));
            string2 = okHttpClientWithoutHeaders;
            if (string2 != null) {
                ((a0.b)object).g((z)string2);
            }
            retrofitWithoutHeaders = ((a0.b)object).e();
        }
    }

    public static SurveyApi createSurveyApi(Context context, AppIdentity appIdentity, UserIdentity userIdentity, String string2, Gson gson) {
        ApiFactory.createRetrofit(string2, ApiFactory.createConfigurableHttpClient(context, appIdentity, userIdentity), gson);
        return legacyRetrofit.b(SurveyApi.class);
    }

    public static TicketApi createTicketApi(Context context, AppIdentity appIdentity, UserIdentity userIdentity, String string2) {
        ApiFactory.createRetrofit(string2, ApiFactory.createConfigurableHttpClient(context, appIdentity, userIdentity), new GsonBuilder().registerTypeAdapterFactory(ApiFactory.getTicketTypeAdapterFactory()).create());
        return legacyRetrofit.b(TicketApi.class);
    }

    static String createUniqueIdentifier(String charSequence) {
        CharSequence charSequence2 = new StringBuilder();
        ((StringBuilder)charSequence2).append(ApiFactory.removeInvalidCharacters(charSequence));
        ((StringBuilder)charSequence2).append("-android");
        charSequence2 = ((StringBuilder)charSequence2).toString();
        int n10 = ((String)charSequence2).length();
        int n13 = 63;
        charSequence = charSequence2;
        if (n10 > 63) {
            if (((String)charSequence2).charAt(62) == '-') {
                n13 = 62;
            }
            charSequence = ((String)charSequence2).substring(0, n13);
        }
        return charSequence;
    }

    public static Api createWithNetworkClient(Context context, AppIdentity appIdentity, UserIdentity userIdentity, z z13, Store<State> store, String object, Provider<AppConfig> provider, OpsMetricTracker opsMetricTracker, IntercomDataLayer intercomDataLayer) {
        if (messengerApi == null) {
            messengerApi = ApiFactory.createMessengerApi(z13, (String)object);
        }
        if (uploadApi == null) {
            uploadApi = retrofitWithoutHeaders.b(ExternalUploadApi.class);
        }
        CallbackHolder callbackHolder = new CallbackHolder(store, intercomDataLayer);
        object = new RateLimiter(provider.get());
        return new Api(context, appIdentity, userIdentity, z13, messengerApi, callbackHolder, (RateLimiter)object, store, provider, opsMetricTracker, intercomDataLayer);
    }

    private static String getCorrectServerHostname(int n10, Context context) {
        if (n10 == UtilsKt.getRegionCode(context, R.integer.intercom_server_region_aus)) {
            return PARTIAL_HOSTNAME_AUS;
        }
        if (n10 == UtilsKt.getRegionCode(context, R.integer.intercom_server_region_eu)) {
            return PARTIAL_HOSTNAME_EU;
        }
        if (n10 != UtilsKt.getRegionCode(context, R.integer.intercom_server_region_us) && n10 != 0) {
            LumberMill.getLogger().e("Incorrect value for region is provided in AndroidManifest.xml file. Please use one of the available regions values from provided list. For more info on regions, please visit Intercom Android SDK documentation", new Object[0]);
            return "";
        }
        LumberMill.getLogger().i("Defaulting to US region, since no explicit region was mentioned. For more info on regions, please visit Intercom Android SDK documentation", new Object[0]);
        return PARTIAL_HOSTNAME_US;
    }

    static String getFullHostname(String string2, Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ApiFactory.createUniqueIdentifier(string2));
        stringBuilder.append(ApiFactory.getCorrectServerHostname(UtilsKt.getServerRegionFromManifest(context), context));
        return stringBuilder.toString();
    }

    public static String getServerUrl(AppIdentity object, Context object2) {
        String string2 = UtilsKt.readHostFromManifest((Context)object2);
        if (TextUtils.isEmpty((CharSequence)string2)) {
            object = ApiFactory.getFullHostname(((AppIdentity)object).appId(), (Context)object2);
        } else {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(ApiFactory.createUniqueIdentifier(((AppIdentity)object).appId()));
            ((StringBuilder)object2).append(string2);
            object = ((StringBuilder)object2).toString();
        }
        return ApiFactory.convertHostnameToUrl((String)object);
    }

    private static RuntimeTypeAdapterFactory<Ticket.TicketAttribute> getTicketTypeAdapterFactory() {
        return RuntimeTypeAdapterFactory.of(Ticket.TicketAttribute.class, "type").registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, TicketAttributeType.STRING.name().toLowerCase()).registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, TicketAttributeType.INTEGER.name().toLowerCase()).registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, TicketAttributeType.FLOAT.name().toLowerCase()).registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, TicketAttributeType.BOOLEAN.name().toLowerCase()).registerSubtype(Ticket.TicketAttribute.ListAttribute.class, TicketAttributeType.LIST.name().toLowerCase()).registerSubtype(Ticket.TicketAttribute.DateTimeAttribute.class, TicketAttributeType.DATETIME.name().toLowerCase()).registerSubtype(Ticket.TicketAttribute.FilesAttribute.class, TicketAttributeType.FILES.name().toLowerCase()).registerIgnoredSubtype(Ticket.TicketAttribute.UnSupported.class, "UnSupported");
    }

    public static String removeInvalidCharacters(String string2) {
        return string2.replaceAll("[^A-Za-z0-9\\-$]", "");
    }
}


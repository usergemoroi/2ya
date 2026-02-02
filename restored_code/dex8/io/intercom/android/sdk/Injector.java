/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.content.SharedPreferences
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.google.gson.Gson
 *  com.intercom.twig.Twig
 *  okhttp3.z
 */
package io.intercom.android.sdk;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.gson.Gson;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.LifecycleTracker;
import io.intercom.android.sdk.NexusWrapper;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.ResetManager;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.ApiFactory;
import io.intercom.android.sdk.api.DeDuper;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.SurveyApi;
import io.intercom.android.sdk.api.TaggingSocketFactory;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.errorreporting.ErrorReporter;
import io.intercom.android.sdk.exceptions.IntercomIntegrationException;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.metrics.MetricsStore;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.push.SystemNotificationManager;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.store.StoreFactory;
import io.intercom.android.sdk.tickets.create.data.TicketApi;
import io.intercom.android.sdk.utilities.ActivityFinisher;
import io.intercom.android.sdk.utilities.SystemSettings;
import io.intercom.android.sdk.utilities.UuidStringProvider;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import okhttp3.z;

public class Injector {
    private static final int NEXUS_TRAFFIC_TAG = 63987;
    private static final Twig TWIG = LumberMill.getLogger();
    @SuppressLint(value={"StaticFieldLeak"})
    @Nullable
    private static Injector instance;
    private final ActivityFinisher activityFinisher = new ActivityFinisher();
    @Nullable
    private Api api;
    private final Provider<Api> apiProvider;
    private final Provider<AppConfig> appConfigProvider = new Provider<AppConfig>(this){
        final Injector this$0;
        {
            this.this$0 = injector2;
        }

        @Override
        public AppConfig get() {
            return (AppConfig)this.this$0.dataLayer.getConfig().getValue();
        }
    };
    private final AppIdentity appIdentity;
    private final Application application;
    @Nullable
    private IntercomDataLayer dataLayer;
    @Nullable
    private ErrorReporter errorReporter;
    @Nullable
    private ExternalUploadApi externalUploadApi;
    @Nullable
    private Gson gson;
    @Nullable
    private HelpCenterApi helpCenterApi;
    @Nullable
    private LifecycleTracker lifecycleTracker;
    @Nullable
    private MessengerApi messengerApi;
    @Nullable
    private MetricTracker metricTracker;
    private final Provider<MetricTracker> metricTrackerProvider;
    @Nullable
    private MetricsStore metricsStore;
    @Nullable
    private NexusWrapper nexusClient;
    private final Provider<NexusClient> nexusClientProvider = new Provider<NexusClient>(this){
        final Injector this$0;
        {
            this.this$0 = injector2;
        }

        @Override
        public NexusClient get() {
            return this.this$0.getNexusClient();
        }
    };
    @Nullable
    private OpsMetricTracker opsMetricTracker;
    private final Provider<OverlayPresenter> overlayManagerProvider;
    @Nullable
    private OverlayPresenter overlayPresenter;
    @Nullable
    private ResetManager resetManager;
    @Nullable
    private Store<State> store;
    @Nullable
    private DeDuper superDeDuper;
    @Nullable
    private SurveyApi surveyApi;
    @Nullable
    private SystemNotificationManager systemNotificationManager;
    @Nullable
    private TicketApi ticketApi;
    private final UserIdentity userIdentity;
    private final Provider<UserIdentity> userIdentityProvider;
    @Nullable
    private UserUpdater userUpdater;
    private final Provider<UserUpdater> userUpdaterProvider = new Provider<UserUpdater>(this){
        final Injector this$0;
        {
            this.this$0 = injector2;
        }

        @Override
        public UserUpdater get() {
            return this.this$0.getUserUpdater();
        }
    };

    protected Injector(Application application, AppIdentity appIdentity, UserIdentity userIdentity) {
        this.apiProvider = new Provider<Api>(this){
            final Injector this$0;
            {
                this.this$0 = injector2;
            }

            @Override
            public Api get() {
                return this.this$0.getApi();
            }
        };
        this.overlayManagerProvider = new Provider<OverlayPresenter>(this){
            final Injector this$0;
            {
                this.this$0 = injector2;
            }

            @Override
            public OverlayPresenter get() {
                return this.this$0.getOverlayPresenter();
            }
        };
        this.userIdentityProvider = new Provider<UserIdentity>(this){
            final Injector this$0;
            {
                this.this$0 = injector2;
            }

            @Override
            public UserIdentity get() {
                return this.this$0.getUserIdentity();
            }
        };
        this.metricTrackerProvider = new Provider<MetricTracker>(this){
            final Injector this$0;
            {
                this.this$0 = injector2;
            }

            @Override
            public MetricTracker get() {
                return this.this$0.getMetricTracker();
            }
        };
        this.application = application;
        this.appIdentity = appIdentity;
        this.userIdentity = userIdentity;
    }

    public static Injector get() {
        synchronized (Injector.class) {
            Object object;
            block4: {
                object = instance;
                if (object == null) break block4;
                return object;
            }
            object = new IntercomIntegrationException("Intercom was not initialized correctly, Intercom.initialize() needs to be called in onCreate() in your Application class.");
            throw object;
        }
    }

    public static void initIfCachedCredentials(Application application) {
        synchronized (Injector.class) {
            Throwable throwable2;
            block6: {
                block5: {
                    Object object;
                    block4: {
                        try {
                            object = instance;
                            if (object == null) break block4;
                        }
                        catch (Throwable throwable2) {}
                        return;
                    }
                    Object object2 = AppIdentity.loadFromDevice((Context)application);
                    object = ((AppIdentity)object2).apiKey();
                    object2 = ((AppIdentity)object2).appId();
                    if (((String)object2).isEmpty() || ((String)object).isEmpty()) break block5;
                    Injector.initWithAppCredentials(application, (String)object, (String)object2);
                    break block6;
                }
                return;
            }
            throw throwable2;
        }
    }

    public static void initWithAppCredentials(Application application, String object, String object2) {
        synchronized (Injector.class) {
            Injector injector2;
            block5: {
                injector2 = instance;
                if (injector2 == null) break block5;
                return;
            }
            TWIG.internal("Injector", "Initializing");
            object2 = AppIdentity.create((String)object, (String)object2);
            ((AppIdentity)object2).persist((Context)application);
            object = new UserIdentity((Context)application);
            instance = injector2 = new Injector(application, (AppIdentity)object2, (UserIdentity)object);
            application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)injector2.getLifecycleTracker());
            return;
        }
    }

    public static boolean isNotInitialised() {
        synchronized (Injector.class) {
            Injector injector2 = instance;
            boolean bl2 = injector2 == null;
            return bl2;
        }
    }

    @VisibleForTesting
    static void setSharedInstance(Injector injector2) {
        instance = injector2;
    }

    public ActivityFinisher getActivityFinisher() {
        return this.activityFinisher;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Api getApi() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.api != null) break block3;
                        String string2 = ApiFactory.getServerUrl(this.appIdentity, (Context)this.application);
                        this.api = ApiFactory.create((Context)this.getApplication(), this.appIdentity, this.userIdentity, this.getStore(), string2, this.appConfigProvider, this.getOpsMetricTracker(), this.getDataLayer());
                        this.messengerApi = ApiFactory.messengerApi;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.api.updateMaxRequests();
                return this.api;
            }
            throw throwable2;
        }
    }

    public Provider<Api> getApiProvider() {
        return this.apiProvider;
    }

    public Provider<AppConfig> getAppConfigProvider() {
        return this.appConfigProvider;
    }

    public AppIdentity getAppIdentity() {
        return this.appIdentity;
    }

    public Application getApplication() {
        return this.application;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public IntercomDataLayer getDataLayer() {
        synchronized (this) {
            try {
                IntercomDataLayer intercomDataLayer;
                if (this.dataLayer != null) return this.dataLayer;
                this.dataLayer = intercomDataLayer = new IntercomDataLayer((Context)this.application);
                return this.dataLayer;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public DeDuper getDeDuper() {
        synchronized (this) {
            try {
                DeDuper deDuper;
                if (this.superDeDuper != null) return this.superDeDuper;
                SharedPreferences sharedPreferences = this.application.getSharedPreferences("INTERCOM_DEDUPER_PREFS", 0);
                this.superDeDuper = deDuper = new DeDuper(this.appConfigProvider, sharedPreferences);
                deDuper.readPersistedCachedAttributes();
                return this.superDeDuper;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ErrorReporter getErrorReporter() {
        synchronized (this) {
            try {
                if (this.errorReporter != null) return this.errorReporter;
                this.errorReporter = ErrorReporter.create((Context)this.application, this.getGson(), this.apiProvider);
                return this.errorReporter;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public ExternalUploadApi getExternalUploadApi() {
        if (this.externalUploadApi == null) {
            this.externalUploadApi = ApiFactory.uploadApi;
        }
        return this.externalUploadApi;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Gson getGson() {
        synchronized (this) {
            try {
                Gson gson;
                if (this.gson != null) return this.gson;
                this.gson = gson = new Gson();
                return this.gson;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public HelpCenterApi getHelpCenterApi() {
        synchronized (this) {
            try {
                if (this.helpCenterApi != null) return this.helpCenterApi;
                String string2 = ApiFactory.getServerUrl(this.appIdentity, (Context)this.application);
                this.helpCenterApi = ApiFactory.createHelpCenterApi((Context)this.getApplication(), this.appIdentity, this.userIdentity, string2, this.getGson());
                return this.helpCenterApi;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public LifecycleTracker getLifecycleTracker() {
        synchronized (this) {
            try {
                if (this.lifecycleTracker != null) return this.lifecycleTracker;
                this.lifecycleTracker = LifecycleTracker.create(this.getSystemNotificationManager(), this.getMetricsStore(), this.getErrorReporter(), this.getDeDuper(), this.getTimeProvider(), this.getUserUpdater(), this.getStore(), this.getResetManager(), SystemSettings.getTransitionScale((Context)this.application), this.getApiProvider());
                return this.lifecycleTracker;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public MessengerApi getMessengerApi() {
        if (this.messengerApi == null) {
            this.messengerApi = ApiFactory.messengerApi;
        }
        return this.messengerApi;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public MetricTracker getMetricTracker() {
        synchronized (this) {
            try {
                MetricTracker metricTracker;
                if (this.metricTracker != null) return this.metricTracker;
                this.metricTracker = metricTracker = new MetricTracker(this.userIdentity, this.getMetricsStore(), (Context)this.getApplication());
                return this.metricTracker;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public MetricsStore getMetricsStore() {
        synchronized (this) {
            try {
                MetricsStore metricsStore;
                if (this.metricsStore != null) return this.metricsStore;
                this.metricsStore = metricsStore = new MetricsStore((Context)this.getApplication(), this.getApiProvider(), this.appConfigProvider);
                return this.metricsStore;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public NexusClient getNexusClient() {
        synchronized (this) {
            try {
                if (this.nexusClient != null) return this.nexusClient;
                Object object = NexusClient.defaultOkHttpClientBuilder();
                Object object2 = new TaggingSocketFactory(SocketFactory.getDefault(), 63987);
                object = ((z.a)object).Q((SocketFactory)object2).c();
                this.nexusClient = object2 = new NexusWrapper(LumberMill.getNexusTwig(), (z)object, this.getStore(), this.getApi(), this.getNexusDebouncePeriod());
                return this.nexusClient;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    protected long getNexusDebouncePeriod() {
        return TimeUnit.SECONDS.toMillis(1L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public OpsMetricTracker getOpsMetricTracker() {
        synchronized (this) {
            try {
                OpsMetricTracker opsMetricTracker;
                if (this.opsMetricTracker != null) return this.opsMetricTracker;
                this.opsMetricTracker = opsMetricTracker = new OpsMetricTracker(this.getMetricsStore(), this.getTimeProvider(), UuidStringProvider.SYSTEM);
                return this.opsMetricTracker;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public OverlayPresenter getOverlayPresenter() {
        synchronized (this) {
            try {
                OverlayPresenter overlayPresenter;
                if (this.overlayPresenter != null) return this.overlayPresenter;
                this.overlayPresenter = overlayPresenter = new OverlayPresenter(this.getApplication(), this.getStore(), this.appConfigProvider, this.getMetricTracker(), this.userIdentity, this.getDataLayer());
                return this.overlayPresenter;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ResetManager getResetManager() {
        synchronized (this) {
            try {
                ResetManager resetManager;
                if (this.resetManager != null) return this.resetManager;
                this.resetManager = resetManager = new ResetManager(this.getApiProvider(), this.getUserIdentity(), this.getOverlayPresenter(), this.appConfigProvider, this.getStore(), this.getUserUpdater(), (Context)this.application, this.activityFinisher, this.getDataLayer());
                return this.resetManager;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Store<State> getStore() {
        synchronized (this) {
            try {
                if (this.store != null) return this.store;
                this.store = StoreFactory.createStore(this.apiProvider, this.appConfigProvider, this.nexusClientProvider, this.overlayManagerProvider, this.userUpdaterProvider, this.userIdentityProvider, (Context)this.application, LumberMill.getLogger(), this.metricTrackerProvider, this.getDataLayer());
                return this.store;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public SurveyApi getSurveyApi() {
        synchronized (this) {
            try {
                if (this.surveyApi != null) return this.surveyApi;
                String string2 = ApiFactory.getServerUrl(this.appIdentity, (Context)this.application);
                this.surveyApi = ApiFactory.createSurveyApi((Context)this.getApplication(), this.appIdentity, this.userIdentity, string2, this.getGson());
                return this.surveyApi;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public SystemNotificationManager getSystemNotificationManager() {
        synchronized (this) {
            try {
                SystemNotificationManager systemNotificationManager;
                if (this.systemNotificationManager != null) return this.systemNotificationManager;
                SystemNotificationManager systemNotificationManager2 = (NotificationManager)this.application.getSystemService("notification");
                this.systemNotificationManager = systemNotificationManager = new SystemNotificationManager((NotificationManager)systemNotificationManager2);
                return this.systemNotificationManager;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public TicketApi getTicketApi() {
        synchronized (this) {
            try {
                if (this.ticketApi != null) return this.ticketApi;
                String string2 = ApiFactory.getServerUrl(this.appIdentity, (Context)this.application);
                this.ticketApi = ApiFactory.createTicketApi((Context)this.getApplication(), this.appIdentity, this.userIdentity, string2);
                return this.ticketApi;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public TimeProvider getTimeProvider() {
        return TimeProvider.SYSTEM;
    }

    public UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public UserUpdater getUserUpdater() {
        synchronized (this) {
            try {
                UserUpdater userUpdater;
                if (this.userUpdater != null) return this.userUpdater;
                this.userUpdater = userUpdater = new UserUpdater(this.getApiProvider(), this.getStore(), this.getOpsMetricTracker());
                return this.userUpdater;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Provider<UserUpdater> getUserUpdaterProvider() {
        return this.userUpdaterProvider;
    }
}


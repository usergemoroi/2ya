/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.location.Location
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.unity3d.player.UnityPlayer
 *  org.json.JSONException
 */
package io.appmetrica.analytics.plugin.unity;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.player.UnityPlayer;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.plugin.unity.AdRevenueSerializer;
import io.appmetrica.analytics.plugin.unity.AppMetricaConfigSerializer;
import io.appmetrica.analytics.plugin.unity.AppMetricaUnityLogger;
import io.appmetrica.analytics.plugin.unity.DeferredDeeplinkListenerProxy;
import io.appmetrica.analytics.plugin.unity.DeferredDeeplinkParametersListenerProxy;
import io.appmetrica.analytics.plugin.unity.ECommerceEventSerializer;
import io.appmetrica.analytics.plugin.unity.ExceptionSerializer;
import io.appmetrica.analytics.plugin.unity.ExternalAttributionSerializer;
import io.appmetrica.analytics.plugin.unity.LocationSerializer;
import io.appmetrica.analytics.plugin.unity.ReporterConfigSerializer;
import io.appmetrica.analytics.plugin.unity.RevenueSerializer;
import io.appmetrica.analytics.plugin.unity.StartupParamsCallbackProxy;
import io.appmetrica.analytics.plugin.unity.UserProfileSerializer;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;

public final class AppMetricaProxy {
    private static final Set<Object> callbacks = new HashSet<Object>();

    private AppMetricaProxy() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void activate(@NonNull String object) {
        JSONException jSONException2;
        block3: {
            block2: {
                try {
                    object = AppMetricaConfigSerializer.fromJsonString((String)object);
                    AppMetrica.activate((Context)AppMetricaProxy.getActivity(), (AppMetricaConfig)object);
                    object = ((AppMetricaConfig)object).sessionsAutoTrackingEnabled;
                    if (object == null) break block2;
                    if (!((Boolean)object).booleanValue()) return;
                }
                catch (JSONException jSONException2) {
                    break block3;
                }
            }
            AppMetrica.resumeSession(UnityPlayer.currentActivity);
            return;
        }
        AppMetricaUnityLogger.e("Failed to activate AppMetrica. Config was parsed with error.", jSONException2);
    }

    public static void activateReporter(@NonNull String string2) {
        try {
            AppMetrica.activateReporter((Context)AppMetricaProxy.getActivity(), ReporterConfigSerializer.fromJsonString(string2));
        }
        catch (JSONException jSONException) {
            AppMetricaUnityLogger.e("Failed to activate Reporter. Config was parsed with error.", jSONException);
        }
    }

    public static void clearAppEnvironment() {
        AppMetrica.clearAppEnvironment();
    }

    @NonNull
    private static Activity getActivity() {
        return UnityPlayer.currentActivity;
    }

    @Nullable
    public static String getDeviceId() {
        return AppMetrica.getDeviceId((Context)AppMetricaProxy.getActivity());
    }

    @NonNull
    public static String getLibraryVersion() {
        return AppMetrica.getLibraryVersion();
    }

    @Nullable
    public static String getUuid() {
        return AppMetrica.getUuid((Context)AppMetricaProxy.getActivity());
    }

    public static boolean isActivated() {
        return ModulesFacade.isActivatedForApp();
    }

    public static void pauseSession() {
        AppMetrica.pauseSession(UnityPlayer.currentActivity);
    }

    public static void putAppEnvironmentValue(@NonNull String string2, @Nullable String string3) {
        AppMetrica.putAppEnvironmentValue(string2, string3);
    }

    public static void putErrorEnvironmentValue(@NonNull String string2, @Nullable String string3) {
        AppMetrica.putErrorEnvironmentValue(string2, string3);
    }

    public static void reportAdRevenue(@NonNull String string2, boolean bl2) {
        try {
            ModulesFacade.reportAdRevenue(AdRevenueSerializer.fromJsonString(string2), bl2);
        }
        catch (JSONException jSONException) {
            AppMetricaUnityLogger.e("Failed to report AdRevenue. Data was parsed with error", jSONException);
        }
    }

    public static void reportAppOpen(@NonNull String string2) {
        AppMetrica.reportAppOpen(string2);
    }

    public static void reportECommerce(@NonNull String string2) {
        try {
            AppMetrica.reportECommerce(ECommerceEventSerializer.fromJsonString(string2));
        }
        catch (JSONException jSONException) {
            AppMetricaUnityLogger.e("Failed to report ECommerce. Data was parsed with error", jSONException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void reportError(@NonNull String string2, @Nullable String string3, @Nullable String object) {
        JSONException jSONException2;
        block4: {
            block3: {
                if (object != null) {
                    try {
                        object = ExceptionSerializer.fromJsonString((String)object);
                        break block3;
                    }
                    catch (JSONException jSONException2) {
                        break block4;
                    }
                }
                object = null;
            }
            AppMetrica.getPluginExtension().reportError(string2, string3, (PluginErrorDetails)object);
            return;
        }
        AppMetricaUnityLogger.e("Failed to report error. Data was parsed with error", jSONException2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void reportErrorWithoutIdentifier(@NonNull String string2, @NonNull String object) {
        JSONException jSONException2;
        block3: {
            try {
                object = ExceptionSerializer.fromJsonString((String)object);
                if (((PluginErrorDetails)object).getStacktrace().isEmpty()) {
                    AppMetrica.getPluginExtension().reportError("Errors without stacktrace", string2, (PluginErrorDetails)object);
                    return;
                }
            }
            catch (JSONException jSONException2) {
                break block3;
            }
            AppMetrica.getPluginExtension().reportError((PluginErrorDetails)object, string2);
            return;
        }
        AppMetricaUnityLogger.e("Failed to report error. Data was parsed with error", jSONException2);
    }

    public static void reportEvent(@NonNull String string2, @Nullable String string3) {
        AppMetrica.reportEvent(string2, string3);
    }

    public static void reportExternalAttribution(@NonNull String string2, @NonNull String string3) {
        ModulesFacade.reportExternalAttribution(ExternalAttributionSerializer.getSourceId(string2), string3);
    }

    public static void reportRevenue(@NonNull String string2) {
        try {
            AppMetrica.reportRevenue(RevenueSerializer.fromJsonString(string2));
        }
        catch (JSONException jSONException) {
            AppMetricaUnityLogger.e("Failed to report Revenue. Data was parsed with error", jSONException);
        }
    }

    public static void reportUnhandledException(@NonNull String string2) {
        try {
            AppMetrica.getPluginExtension().reportUnhandledException(ExceptionSerializer.fromJsonString(string2));
        }
        catch (JSONException jSONException) {
            AppMetricaUnityLogger.e("Failed to report unhandled exception. Data was parsed with error", jSONException);
        }
    }

    public static void reportUserProfile(@NonNull String string2) {
        try {
            AppMetrica.reportUserProfile(UserProfileSerializer.fromJsonString(string2));
        }
        catch (JSONException jSONException) {
            AppMetricaUnityLogger.e("Failed to report UserProfile. Data was parsed with error", jSONException);
        }
    }

    public static void requestDeferredDeeplink(@NonNull DeferredDeeplinkListenerProxy deferredDeeplinkListenerProxy) {
        AppMetrica.requestDeferredDeeplink(new DeferredDeeplinkListenerProxy.Delegate(deferredDeeplinkListenerProxy));
    }

    public static void requestDeferredDeeplinkParameters(@NonNull DeferredDeeplinkParametersListenerProxy deferredDeeplinkParametersListenerProxy) {
        AppMetrica.requestDeferredDeeplinkParameters(new DeferredDeeplinkParametersListenerProxy.Delegate(deferredDeeplinkParametersListenerProxy));
    }

    public static void requestStartupParams(@NonNull StartupParamsCallbackProxy object, @NonNull String[] stringArray) {
        object = new StartupParamsCallbackProxy.Delegate((StartupParamsCallbackProxy)object){

            @Override
            public void onReceive(@Nullable StartupParamsCallback.Result result2) {
                super.onReceive(result2);
                callbacks.remove(this);
            }

            @Override
            public void onRequestError(@NonNull StartupParamsCallback.Reason reason, @Nullable StartupParamsCallback.Result result2) {
                super.onRequestError(reason, result2);
                callbacks.remove(this);
            }
        };
        callbacks.add(object);
        AppMetrica.requestStartupParams((Context)AppMetricaProxy.getActivity(), (StartupParamsCallback)object, Arrays.asList(stringArray));
    }

    public static void resumeSession() {
        AppMetrica.resumeSession(UnityPlayer.currentActivity);
    }

    public static void sendEventsBuffer() {
        AppMetrica.sendEventsBuffer();
    }

    public static void setDataSendingEnabled(boolean bl2) {
        AppMetrica.setDataSendingEnabled(bl2);
    }

    /*
     * Unable to fully structure code
     */
    public static void setLocation(@Nullable String var0) {
        block2: {
            if (var0 != null) break block2;
            var0 = null;
            ** GOTO lbl7
        }
        try {
            var0 = LocationSerializer.fromJsonString(var0);
lbl7:
            // 2 sources

            AppMetrica.setLocation((Location)var0);
        }
        catch (JSONException var0_1) {
            AppMetricaUnityLogger.e("Failed to set custom location. Data was parsed with error", var0_1);
        }
    }

    public static void setLocationTracking(boolean bl2) {
        AppMetrica.setLocationTracking(bl2);
    }

    public static void setUserProfileID(@Nullable String string2) {
        AppMetrica.setUserProfileID(string2);
    }

    public static void touchReporter(@NonNull String string2) {
        AppMetrica.getReporter((Context)AppMetricaProxy.getActivity(), string2);
    }
}


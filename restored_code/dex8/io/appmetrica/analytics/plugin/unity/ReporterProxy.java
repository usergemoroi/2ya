/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.unity3d.player.UnityPlayer
 *  org.json.JSONException
 */
package io.appmetrica.analytics.plugin.unity;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.player.UnityPlayer;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.plugin.unity.AdRevenueSerializer;
import io.appmetrica.analytics.plugin.unity.AppMetricaUnityLogger;
import io.appmetrica.analytics.plugin.unity.ECommerceEventSerializer;
import io.appmetrica.analytics.plugin.unity.ExceptionSerializer;
import io.appmetrica.analytics.plugin.unity.RevenueSerializer;
import io.appmetrica.analytics.plugin.unity.UserProfileSerializer;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import org.json.JSONException;

public final class ReporterProxy {
    private ReporterProxy() {
    }

    public static void clearAppEnvironment(@NonNull String string2) {
        ReporterProxy.getReporter(string2).clearAppEnvironment();
    }

    @NonNull
    private static IReporter getReporter(@NonNull String string2) {
        return AppMetrica.getReporter((Context)UnityPlayer.currentActivity, string2);
    }

    public static void pauseSession(@NonNull String string2) {
        ReporterProxy.getReporter(string2).pauseSession();
    }

    public static void putAppEnvironmentValue(@NonNull String string2, @NonNull String string3, @Nullable String string4) {
        ReporterProxy.getReporter(string2).putAppEnvironmentValue(string3, string4);
    }

    public static void reportAdRevenue(@NonNull String string2, @NonNull String string3) {
        try {
            ReporterProxy.getReporter(string2).reportAdRevenue(AdRevenueSerializer.fromJsonString(string3));
        }
        catch (JSONException jSONException) {
            AppMetricaUnityLogger.e("Failed to report AdRevenue. Data was parsed with error", jSONException);
        }
    }

    public static void reportECommerce(@NonNull String string2, @NonNull String string3) {
        try {
            ReporterProxy.getReporter(string2).reportECommerce(ECommerceEventSerializer.fromJsonString(string3));
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
    public static void reportError(@NonNull String string2, @NonNull String string3, @Nullable String string4, @Nullable String object) {
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
            ReporterProxy.getReporter(string2).getPluginExtension().reportError(string3, string4, (PluginErrorDetails)object);
            return;
        }
        AppMetricaUnityLogger.e("Failed to report error. Data was parsed with error", jSONException2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void reportErrorWithoutIdentifier(@NonNull String string2, @NonNull String string3, @NonNull String object) {
        JSONException jSONException2;
        block3: {
            try {
                object = ExceptionSerializer.fromJsonString((String)object);
                if (((PluginErrorDetails)object).getStacktrace().isEmpty()) {
                    ReporterProxy.getReporter(string2).getPluginExtension().reportError("Errors without stacktrace", string3, (PluginErrorDetails)object);
                    return;
                }
            }
            catch (JSONException jSONException2) {
                break block3;
            }
            ReporterProxy.getReporter(string2).getPluginExtension().reportError((PluginErrorDetails)object, string3);
            return;
        }
        AppMetricaUnityLogger.e("Failed to report error. Data was parsed with error", jSONException2);
    }

    public static void reportEvent(@NonNull String string2, @NonNull String string3, @Nullable String string4) {
        ReporterProxy.getReporter(string2).reportEvent(string3, string4);
    }

    public static void reportRevenue(@NonNull String string2, @NonNull String string3) {
        try {
            ReporterProxy.getReporter(string2).reportRevenue(RevenueSerializer.fromJsonString(string3));
        }
        catch (JSONException jSONException) {
            AppMetricaUnityLogger.e("Failed to report Revenue. Data was parsed with error", jSONException);
        }
    }

    public static void reportUnhandledException(@NonNull String string2, @NonNull String string3) {
        try {
            ReporterProxy.getReporter(string2).getPluginExtension().reportUnhandledException(ExceptionSerializer.fromJsonString(string3));
        }
        catch (JSONException jSONException) {
            AppMetricaUnityLogger.e("Failed to report unhandled exception. Data was parsed with error", jSONException);
        }
    }

    public static void reportUserProfile(@NonNull String string2, @NonNull String string3) {
        try {
            ReporterProxy.getReporter(string2).reportUserProfile(UserProfileSerializer.fromJsonString(string3));
        }
        catch (JSONException jSONException) {
            AppMetricaUnityLogger.e("Failed to report UserProfile. Data was parsed with error", jSONException);
        }
    }

    public static void resumeSession(@NonNull String string2) {
        ReporterProxy.getReporter(string2).resumeSession();
    }

    public static void sendEventsBuffer(@NonNull String string2) {
        ReporterProxy.getReporter(string2).sendEventsBuffer();
    }

    public static void setDataSendingEnabled(@NonNull String string2, boolean bl2) {
        ReporterProxy.getReporter(string2).setDataSendingEnabled(bl2);
    }

    public static void setUserProfileID(@NonNull String string2, @Nullable String string3) {
        ReporterProxy.getReporter(string2).setUserProfileID(string3);
    }
}


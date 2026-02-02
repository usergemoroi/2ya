/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  androidx.annotation.Nullable
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Nullable;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.lang.reflect.InvocationTargetException;

public class IntercomPushManager {
    public static final String HOST_APP_INTENT = "host_app_intent";
    public static final String INTERCOM_PUSH_KEY = "intercom_push_key";
    public static final String INTERCOM_PUSH_PATH = "intercom_push_notification_path";
    public static final String MULTIPLE_NOTIFICATIONS = "multiple_notifications";
    private static final String PREFS_SENDER_ID = "intercom_sender_id";
    public static final String PUSH_ONLY_CONVO_ID = "push_only_convo_id";
    public static final String PUSH_ONLY_INSTANCE_ID = "push_only_instance_id";
    private static final Twig TWIG = LumberMill.getLogger();

    public static void cacheSenderId(Context context, String string2) {
        context.getSharedPreferences("INTERCOM_SDK_PREFS", 0).edit().putString(PREFS_SENDER_ID, string2).apply();
    }

    private static boolean fcmModuleInstalled() {
        boolean bl2 = IntercomPushManager.getFcmServiceClass() != null;
        return bl2;
    }

    @Nullable
    private static Class getFcmServiceClass() {
        try {
            Class<?> clazz = Class.forName("io.intercom.android.sdk.fcm.IntercomFcmMessengerService");
            return clazz;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    public static IntercomPushIntegrationType getInstalledModuleType() {
        IntercomPushIntegrationType intercomPushIntegrationType = IntercomPushIntegrationType.NONE;
        if (IntercomPushManager.fcmModuleInstalled()) {
            TWIG.internal("FCM is installed");
            intercomPushIntegrationType = IntercomPushIntegrationType.FCM;
        }
        return intercomPushIntegrationType;
    }

    public static void initializeFcmService(Application application) {
        Class clazz = IntercomPushManager.getFcmServiceClass();
        if (clazz != null) {
            try {
                clazz.getDeclaredMethod("initialize", Application.class).invoke(null, application);
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
                TWIG.internal("FCM is installed but initialize method was not found");
            }
        }
    }

    public static enum IntercomPushIntegrationType {
        FCM,
        NONE;

    }
}


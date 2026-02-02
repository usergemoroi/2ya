/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.coreutils.internal.logger;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

public abstract class LoggerStorage {
    private static HashMap a = new HashMap();
    private static final Object b = new Object();
    private static volatile PublicLogger c = PublicLogger.getAnonymousInstance();

    @NonNull
    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return c;
    }

    @NonNull
    public static PublicLogger getOrCreateMainPublicLogger(@NonNull String string2) {
        c = LoggerStorage.getOrCreatePublicLogger(string2);
        return c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public static PublicLogger getOrCreatePublicLogger(@Nullable String string2) {
        PublicLogger publicLogger;
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger2 = publicLogger = (PublicLogger)a.get(string2);
        if (publicLogger != null) return publicLogger2;
        Object object = b;
        synchronized (object) {
            try {
                publicLogger2 = publicLogger = (PublicLogger)a.get(string2);
                if (publicLogger != null) return publicLogger2;
                publicLogger2 = new PublicLogger(ApiKeyUtils.createPartialApiKey(string2));
                a.put(string2, publicLogger2);
                return publicLogger2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @VisibleForTesting(otherwise=5)
    public static void unsetPublicLoggers() {
        a = new HashMap();
        c = PublicLogger.getAnonymousInstance();
    }
}


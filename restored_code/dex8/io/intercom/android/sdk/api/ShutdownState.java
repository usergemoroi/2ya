/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  androidx.annotation.VisibleForTesting
 */
package io.intercom.android.sdk.api;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import io.intercom.android.sdk.utilities.commons.TimeProvider;

public class ShutdownState {
    private static final String PREFS_SHUTDOWN_EXPIRY = "ShutdownExpiry";
    private static final String PREFS_SHUTDOWN_FINGERPRINT = "ShutdownFingerprint";
    private static final String PREFS_SHUTDOWN_REASON = "ShutdownReason";
    private final AppIdentity appIdentity;
    private final Context context;
    private final SharedPreferences prefs;
    @VisibleForTesting
    long shutdownExpiry;
    @VisibleForTesting
    String shutdownFingerprint;
    private String shutdownReason;
    private final TimeProvider timeProvider;

    public ShutdownState(Context context, AppIdentity appIdentity, TimeProvider timeProvider) {
        SharedPreferences sharedPreferences;
        this.context = context;
        this.appIdentity = appIdentity;
        this.prefs = sharedPreferences = context.getSharedPreferences("INTERCOM_SHUTDOWN_PREFS", 0);
        this.timeProvider = timeProvider;
        this.shutdownExpiry = sharedPreferences.getLong(PREFS_SHUTDOWN_EXPIRY, timeProvider.currentTimeMillis());
        this.shutdownReason = sharedPreferences.getString(PREFS_SHUTDOWN_REASON, "");
        this.shutdownFingerprint = sharedPreferences.getString(PREFS_SHUTDOWN_FINGERPRINT, ShutdownState.generateAppFingerprint(context, appIdentity));
    }

    private static String generateAppFingerprint(Context context, AppIdentity appIdentity) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        stringBuilder.append("-");
        stringBuilder.append(DeviceUtils.getAppVersion(context));
        stringBuilder.append("-");
        stringBuilder.append(appIdentity.appId());
        stringBuilder.append("-");
        stringBuilder.append("15.6.3");
        return stringBuilder.toString();
    }

    private void persistCachedAttributes() {
        this.prefs.edit().putString(PREFS_SHUTDOWN_FINGERPRINT, this.shutdownFingerprint).putString(PREFS_SHUTDOWN_REASON, this.shutdownReason).putLong(PREFS_SHUTDOWN_EXPIRY, this.shutdownExpiry).apply();
    }

    public boolean canSendNetworkRequests() {
        long l10 = this.shutdownExpiry;
        long l11 = this.timeProvider.currentTimeMillis();
        boolean bl2 = false;
        boolean bl3 = l10 <= l11;
        boolean bl4 = this.shutdownFingerprint.equals(ShutdownState.generateAppFingerprint(this.context, this.appIdentity));
        if (bl3 || !bl4) {
            bl2 = true;
        }
        return bl2;
    }

    public String getShutdownReason() {
        return this.shutdownReason;
    }

    public void updateShutdownState(long l10, String string2) {
        this.shutdownExpiry = this.timeProvider.currentTimeMillis() + l10;
        this.shutdownReason = string2;
        this.shutdownFingerprint = ShutdownState.generateAppFingerprint(this.context, this.appIdentity);
        this.persistCachedAttributes();
    }
}


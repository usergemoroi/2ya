/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.location.Location
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.internal;

import android.content.ContentValues;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.LocationUtils;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.internal.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CounterConfiguration
implements Parcelable {
    public static final Parcelable.Creator<CounterConfiguration> CREATOR = new b();
    private final ContentValues a;

    public CounterConfiguration() {
        this.a = new ContentValues();
    }

    private CounterConfiguration(ContentValues contentValues) {
        this.a = contentValues;
    }

    /* synthetic */ CounterConfiguration(ContentValues contentValues, int n10) {
        this(contentValues);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CounterConfiguration(AppMetricaConfig appMetricaConfig, @NonNull CounterConfigurationReporterType counterConfigurationReporterType) {
        this();
        synchronized (this) {
            this.applyFromConfig(appMetricaConfig);
            this.setReporterType(counterConfigurationReporterType);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CounterConfiguration(@NonNull ReporterConfig reporterConfig) {
        this();
        synchronized (this) {
            this.a(reporterConfig.apiKey);
            this.d(reporterConfig.sessionTimeout);
            this.a(reporterConfig.dispatchPeriodSeconds);
            this.b(reporterConfig.maxReportsCount);
            this.b(reporterConfig.logs);
            this.a(reporterConfig.dataSendingEnabled);
            this.c(reporterConfig.maxReportsInDatabaseCount);
            this.b(reporterConfig.apiKey);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CounterConfiguration(@NonNull CounterConfiguration counterConfiguration) {
        synchronized (counterConfiguration) {
            ContentValues contentValues;
            this.a = contentValues = new ContentValues(counterConfiguration.a);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CounterConfiguration(@NonNull CounterConfigurationReporterType counterConfigurationReporterType) {
        this();
        synchronized (this) {
            this.setReporterType(counterConfigurationReporterType);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CounterConfiguration(@NonNull String string2) {
        this();
        synchronized (this) {
            this.setApiKey(string2);
            return;
        }
    }

    private void a(Boolean bl2) {
        if (ro.a(bl2)) {
            this.setDataSendingEnabled(bl2);
        }
    }

    private void a(Integer n10) {
        if (ro.a(n10)) {
            this.setDispatchPeriod(n10);
        }
    }

    private void a(String string2) {
        if (ro.a(string2)) {
            this.setApiKey(string2);
        }
    }

    private void b(Boolean bl2) {
        if (ro.a(bl2)) {
            this.setLogEnabled(bl2);
        }
    }

    private void b(Integer n10) {
        if (ro.a(n10)) {
            this.setMaxReportsCount(n10);
        }
    }

    private void b(String string2) {
        if ("20799a27-fa80-4b36-b2db-0f8141f24180".equals(string2)) {
            this.setReporterType(CounterConfigurationReporterType.SELF_SDK);
        } else {
            this.setReporterType(CounterConfigurationReporterType.MANUAL);
        }
    }

    private void c(Integer n10) {
        if (ro.a(n10)) {
            this.a.put("MAX_REPORTS_IN_DB_COUNT", n10);
        }
    }

    private void d(Integer n10) {
        if (ro.a(n10)) {
            this.setSessionTimeout(n10);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static CounterConfiguration fromBundle(Bundle bundle) {
        CounterConfiguration counterConfiguration;
        CounterConfiguration counterConfiguration2 = counterConfiguration = null;
        if (bundle == null) return counterConfiguration2;
        try {
            return (CounterConfiguration)bundle.getParcelable("COUNTER_CFG_OBJ");
        }
        catch (Throwable throwable) {
            return counterConfiguration;
        }
    }

    public final void addAutoCollectedDataSubscriber(@NonNull String string2) {
        synchronized (this) {
            this.addAutoCollectedDataSubscribers(Collections.singletonList(string2));
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void addAutoCollectedDataSubscribers(@NonNull List<String> list) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block6: {
                    Parcel parcel;
                    ContentValues contentValues;
                    try {
                        this.getAutoCollectedDataSubscribers().addAll(list);
                        contentValues = this.a;
                        if (list == null) break block6;
                        parcel = Parcel.obtain();
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    try {
                        parcel.writeStringList(list);
                        contentValues.put("CFG_AUTO_COLLECTED_DATA_SUBSCRIBERS", parcel.marshall());
                    }
                    catch (Throwable throwable3) {}
                    parcel.recycle();
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void applyFromConfig(@NonNull AppMetricaConfig appMetricaConfig) {
        synchronized (this) {
            Throwable throwable2;
            block12: {
                block11: {
                    try {
                        this.a(appMetricaConfig.apiKey);
                        this.d(appMetricaConfig.sessionTimeout);
                        if (!ro.a(appMetricaConfig.location)) break block11;
                        this.setManualLocation(appMetricaConfig.location);
                    }
                    catch (Throwable throwable2) {
                        break block12;
                    }
                }
                if (ro.a(appMetricaConfig.locationTracking)) {
                    this.setLocationTracking(appMetricaConfig.locationTracking);
                }
                if (ro.a(appMetricaConfig.advIdentifiersTracking)) {
                    this.setAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking);
                }
                if (ro.a(appMetricaConfig.deviceType)) {
                    this.setDeviceType(appMetricaConfig.deviceType);
                }
                this.a(appMetricaConfig.dispatchPeriodSeconds);
                this.b(appMetricaConfig.maxReportsCount);
                this.b(appMetricaConfig.logs);
                if (!TextUtils.isEmpty((CharSequence)appMetricaConfig.appVersion)) {
                    this.setCustomAppVersion(appMetricaConfig.appVersion);
                }
                if (ro.a(appMetricaConfig.appBuildNumber)) {
                    this.setAppBuildNumber(appMetricaConfig.appBuildNumber);
                }
                if (ro.a(appMetricaConfig.firstActivationAsUpdate)) {
                    this.setFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate);
                }
                this.a(appMetricaConfig.dataSendingEnabled);
                this.c(appMetricaConfig.maxReportsInDatabaseCount);
                Boolean bl2 = appMetricaConfig.nativeCrashReporting;
                if (ro.a(bl2)) {
                    this.a.put("CFG_NATIVE_CRASHES_ENABLED", bl2);
                }
                if (ro.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
                    this.setRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled);
                }
                return;
            }
            throw throwable2;
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getApiKey() {
        return this.a.getAsString("CFG_API_KEY");
    }

    public String getAppBuildNumber() {
        return this.a.getAsString("CFG_APP_VERSION_CODE");
    }

    public String getAppVersion() {
        return this.a.getAsString("CFG_APP_VERSION");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public List<String> getAutoCollectedDataSubscribers() {
        ContentValues contentValues = this.a;
        ArrayList<String> arrayList = new ArrayList<String>();
        byte[] byArray = contentValues.getAsByteArray("CFG_AUTO_COLLECTED_DATA_SUBSCRIBERS");
        if (byArray != null) {
            contentValues = Parcel.obtain();
            try {
                contentValues.unmarshall(byArray, 0, byArray.length);
                contentValues.setDataPosition(0);
                contentValues.readStringList(arrayList);
            }
            catch (Throwable throwable) {}
            contentValues.recycle();
        }
        return arrayList;
    }

    public Boolean getDataSendingEnabled() {
        return this.a.getAsBoolean("CFG_DATA_SENDING_ENABLED");
    }

    @Nullable
    public String getDeviceType() {
        return this.a.getAsString("CFG_DEVICE_SIZE_TYPE");
    }

    @Nullable
    public Integer getDispatchPeriod() {
        return this.a.getAsInteger("CFG_DISPATCH_PERIOD");
    }

    public Location getManualLocation() {
        Location location = this.a.containsKey("CFG_MANUAL_LOCATION") ? LocationUtils.bytesToLocation(this.a.getAsByteArray("CFG_MANUAL_LOCATION")) : null;
        return location;
    }

    @Nullable
    public Integer getMaxReportsCount() {
        return this.a.getAsInteger("CFG_MAX_REPORTS_COUNT");
    }

    @Nullable
    public Integer getMaxReportsInDbCount() {
        return this.a.getAsInteger("MAX_REPORTS_IN_DB_COUNT");
    }

    @Nullable
    public Boolean getReportNativeCrashesEnabled() {
        return this.a.getAsBoolean("CFG_NATIVE_CRASHES_ENABLED");
    }

    @NonNull
    public CounterConfigurationReporterType getReporterType() {
        return CounterConfigurationReporterType.fromStringValue(this.a.getAsString("CFG_REPORTER_TYPE"));
    }

    @Nullable
    public Integer getSessionTimeout() {
        return this.a.getAsInteger("CFG_SESSION_TIMEOUT");
    }

    public String getUuid() {
        return this.a.getAsString("CFG_UUID");
    }

    @Nullable
    public Boolean isAdvIdentifiersTrackingEnabled() {
        return this.a.getAsBoolean("CFG_ADV_IDENTIFIERS_TRACKING_ENABLED");
    }

    @Nullable
    public Boolean isFirstActivationAsUpdate() {
        return this.a.getAsBoolean("CFG_IS_FIRST_ACTIVATION_AS_UPDATE");
    }

    @Nullable
    public Boolean isLocationTrackingEnabled() {
        return this.a.getAsBoolean("CFG_LOCATION_TRACKING");
    }

    @Nullable
    public Boolean isLogEnabled() {
        return this.a.getAsBoolean("CFG_IS_LOG_ENABLED");
    }

    @Nullable
    public Boolean isRevenueAutoTrackingEnabled() {
        synchronized (this) {
            Boolean bl2 = this.a.getAsBoolean("CFG_REVENUE_AUTO_TRACKING_ENABLED");
            return bl2;
        }
    }

    public void setAdvIdentifiersTracking(boolean bl2) {
        synchronized (this) {
            this.a.put("CFG_ADV_IDENTIFIERS_TRACKING_ENABLED", Boolean.valueOf(bl2));
            return;
        }
    }

    @VisibleForTesting
    public void setApiKey(String string2) {
        synchronized (this) {
            this.a.put("CFG_API_KEY", string2);
            return;
        }
    }

    public void setAppBuildNumber(int n10) {
        synchronized (this) {
            this.a.put("CFG_APP_VERSION_CODE", String.valueOf(n10));
            return;
        }
    }

    public final void setCustomAppVersion(String string2) {
        synchronized (this) {
            this.a.put("CFG_APP_VERSION", string2);
            return;
        }
    }

    public final void setDataSendingEnabled(boolean bl2) {
        synchronized (this) {
            this.a.put("CFG_DATA_SENDING_ENABLED", Boolean.valueOf(bl2));
            return;
        }
    }

    public final void setDeviceType(@Nullable String string2) {
        synchronized (this) {
            String string3;
            ContentValues contentValues;
            block5: {
                contentValues = this.a;
                string3 = string2;
                if (!TextUtils.isEmpty((CharSequence)string2)) break block5;
                string3 = null;
            }
            contentValues.put("CFG_DEVICE_SIZE_TYPE", string3);
            return;
        }
    }

    @VisibleForTesting
    public void setDispatchPeriod(int n10) {
        synchronized (this) {
            this.a.put("CFG_DISPATCH_PERIOD", Integer.valueOf(n10));
            return;
        }
    }

    public final void setFirstActivationAsUpdate(boolean bl2) {
        synchronized (this) {
            this.a.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(bl2));
            return;
        }
    }

    public void setLocationTracking(boolean bl2) {
        synchronized (this) {
            this.a.put("CFG_LOCATION_TRACKING", Boolean.valueOf(bl2));
            return;
        }
    }

    public void setLogEnabled(boolean bl2) {
        synchronized (this) {
            this.a.put("CFG_IS_LOG_ENABLED", Boolean.valueOf(bl2));
            return;
        }
    }

    public final void setManualLocation(@Nullable Location location) {
        synchronized (this) {
            this.a.put("CFG_MANUAL_LOCATION", LocationUtils.locationToBytes(location));
            return;
        }
    }

    @VisibleForTesting
    public void setMaxReportsCount(int n10) {
        synchronized (this) {
            int n13;
            ContentValues contentValues;
            block4: {
                contentValues = this.a;
                n13 = n10;
                if (n10 > 0) break block4;
                n13 = Integer.MAX_VALUE;
            }
            contentValues.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(n13));
            return;
        }
    }

    @VisibleForTesting
    public void setMaxReportsInDbCount(int n10) {
        this.a.put("MAX_REPORTS_IN_DB_COUNT", Integer.valueOf(n10));
    }

    public void setReporterType(@NonNull CounterConfigurationReporterType counterConfigurationReporterType) {
        synchronized (this) {
            this.a.put("CFG_REPORTER_TYPE", counterConfigurationReporterType.getStringValue());
            return;
        }
    }

    public void setRevenueAutoTrackingEnabled(boolean bl2) {
        synchronized (this) {
            this.a.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(bl2));
            return;
        }
    }

    @VisibleForTesting
    public void setSessionTimeout(int n10) {
        synchronized (this) {
            this.a.put("CFG_SESSION_TIMEOUT", Integer.valueOf(n10));
            return;
        }
    }

    public void setUuid(String string2) {
        synchronized (this) {
            this.a.put("CFG_UUID", string2);
            return;
        }
    }

    public void toBundle(Bundle bundle) {
        synchronized (this) {
            bundle.putParcelable("COUNTER_CFG_OBJ", (Parcelable)this);
            return;
        }
    }

    public String toString() {
        synchronized (this) {
            CharSequence charSequence = new StringBuilder("CounterConfiguration{mParamsMapping=");
            charSequence.append(this.a);
            charSequence.append('}');
            charSequence = charSequence.toString();
            return charSequence;
        }
    }

    public void writeToParcel(Parcel parcel, int n10) {
        synchronized (this) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.data", (Parcelable)this.a);
            parcel.writeBundle(bundle);
            return;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.networktasks.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;

public class BaseRequestConfig {
    private String a;
    private SdkEnvironment b;
    private SdkIdentifiers c;
    private AppSetId d;
    private RetryPolicyConfig e;

    protected BaseRequestConfig() {
    }

    public String getAnalyticsSdkBuildNumber() {
        Object object = this.b;
        object = object == null ? "" : ((SdkEnvironment)object).getSdkInfo().getSdkBuildNumber();
        return object;
    }

    @NonNull
    public String getAnalyticsSdkBuildType() {
        Object object = this.b;
        object = object == null ? "" : ((SdkEnvironment)object).getSdkInfo().getSdkBuildType();
        return object;
    }

    public String getAnalyticsSdkVersionName() {
        Object object = this.b;
        object = object == null ? "" : ((SdkEnvironment)object).getSdkInfo().getSdkVersionName();
        return object;
    }

    public String getAppBuildNumber() {
        Object object = this.b;
        object = object == null ? "" : ((SdkEnvironment)object).getAppVersionInfo().getAppBuildNumber();
        return object;
    }

    @NonNull
    public String getAppFramework() {
        Object object = this.b;
        object = object == null ? "" : ((SdkEnvironment)object).getAppFramework();
        return object;
    }

    public String getAppPlatform() {
        return "android";
    }

    @NonNull
    public String getAppSetId() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object;
                block5: {
                    block4: {
                        try {
                            object = this.d;
                            if (object == null) break block4;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        if (((AppSetId)object).getId() == null) break block4;
                        object = this.d.getId();
                        break block5;
                    }
                    object = "";
                }
                return object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public String getAppSetIdScope() {
        synchronized (this) {
            try {
                AppSetId appSetId = this.d;
                if (appSetId != null) return appSetId.getScope().getValue();
                return "";
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public String getAppVersion() {
        Object object = this.b;
        object = object == null ? "" : ((SdkEnvironment)object).getAppVersionInfo().getAppVersionName();
        return object;
    }

    @NonNull
    public String getDeviceIDHash() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                String string2;
                block4: {
                    SdkIdentifiers sdkIdentifiers;
                    String string3 = "";
                    try {
                        sdkIdentifiers = this.c;
                        string2 = string3;
                        if (sdkIdentifiers == null) break block4;
                        string2 = string3;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    if (sdkIdentifiers.getDeviceIdHash() == null) break block4;
                    string2 = this.c.getDeviceIdHash();
                }
                return string2;
            }
            throw throwable2;
        }
    }

    @NonNull
    public String getDeviceId() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                String string2;
                block4: {
                    SdkIdentifiers sdkIdentifiers;
                    String string3 = "";
                    try {
                        sdkIdentifiers = this.c;
                        string2 = string3;
                        if (sdkIdentifiers == null) break block4;
                        string2 = string3;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    if (sdkIdentifiers.getDeviceId() == null) break block4;
                    string2 = this.c.getDeviceId();
                }
                return string2;
            }
            throw throwable2;
        }
    }

    @NonNull
    public String getDeviceRootStatus() {
        return ConstantDeviceInfo.DEVICE_ROOT_STATUS;
    }

    @NonNull
    public String getDeviceType() {
        Object object = this.b;
        object = object != null ? ((SdkEnvironment)object).getDeviceType() : "phone";
        return object;
    }

    @NonNull
    public String getLocale() {
        Object object = this.b;
        if (object == null || (object = CollectionUtils.getFirstOrNull(((SdkEnvironment)object).getLocales())) == null) {
            object = "";
        }
        return object;
    }

    @NonNull
    public String getManufacturer() {
        return WrapUtils.getOrDefault(ConstantDeviceInfo.MANUFACTURER, "");
    }

    @NonNull
    public String getModel() {
        return ConstantDeviceInfo.MODEL;
    }

    public int getOsApiLevel() {
        return ConstantDeviceInfo.OS_API_LEVEL;
    }

    @NonNull
    public String getOsVersion() {
        return ConstantDeviceInfo.OS_VERSION;
    }

    public String getPackageName() {
        return this.a;
    }

    public String getProtocolVersion() {
        return "2";
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.e;
    }

    public float getScaleFactor() {
        SdkEnvironment sdkEnvironment = this.b;
        float f11 = sdkEnvironment == null ? 0.0f : sdkEnvironment.getScreenInfo().getScaleFactor();
        return f11;
    }

    public int getScreenDpi() {
        SdkEnvironment sdkEnvironment = this.b;
        int n10 = sdkEnvironment == null ? 0 : sdkEnvironment.getScreenInfo().getDpi();
        return n10;
    }

    public int getScreenHeight() {
        SdkEnvironment sdkEnvironment = this.b;
        int n10 = sdkEnvironment == null ? 0 : sdkEnvironment.getScreenInfo().getHeight();
        return n10;
    }

    public int getScreenWidth() {
        SdkEnvironment sdkEnvironment = this.b;
        int n10 = sdkEnvironment == null ? 0 : sdkEnvironment.getScreenInfo().getWidth();
        return n10;
    }

    @NonNull
    public String getUuid() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                String string2;
                block4: {
                    SdkIdentifiers sdkIdentifiers;
                    String string3 = "";
                    try {
                        sdkIdentifiers = this.c;
                        string2 = string3;
                        if (sdkIdentifiers == null) break block4;
                        string2 = string3;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    if (sdkIdentifiers.getUuid() == null) break block4;
                    string2 = this.c.getUuid();
                }
                return string2;
            }
            throw throwable2;
        }
    }

    public boolean isIdentifiersValid() {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                boolean bl2;
                block8: {
                    block7: {
                        Object object;
                        try {
                            object = this.c;
                            if (object == null) break block7;
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                        String string2 = ((SdkIdentifiers)object).getUuid();
                        if (string2 == null) break block7;
                        if (string2.length() == 0 || (string2 = ((SdkIdentifiers)object).getDeviceId()) == null) break block7;
                        if (string2.length() == 0 || (object = ((SdkIdentifiers)object).getDeviceIdHash()) == null) break block7;
                        int n10 = ((String)object).length();
                        if (n10 == 0) break block7;
                        bl2 = true;
                        break block8;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            throw throwable2;
        }
    }

    protected void setAppSetId(@NonNull AppSetId appSetId) {
        this.d = appSetId;
    }

    protected void setPackageName(String string2) {
        this.a = string2;
    }

    protected void setRetryPolicyConfig(RetryPolicyConfig retryPolicyConfig) {
        this.e = retryPolicyConfig;
    }

    protected void setSdkEnvironment(@NonNull SdkEnvironment sdkEnvironment) {
        this.b = sdkEnvironment;
    }

    protected void setSdkIdentifiers(@Nullable SdkIdentifiers sdkIdentifiers) {
        this.c = sdkIdentifiers;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BaseRequestConfig{mPackageName='");
        stringBuilder.append(this.a);
        stringBuilder.append("', sdkEnvironment=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mProtocolVersion='2', sdkIdentifiers=");
        stringBuilder.append(this.c);
        stringBuilder.append(", retryPolicyConfig=");
        stringBuilder.append(this.e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static abstract class BaseRequestArguments<I, O>
    implements ArgumentsMerger<I, O> {
    }

    public static abstract class ComponentLoader<T extends BaseRequestConfig, A extends BaseRequestArguments, D extends DataSource<A>>
    implements RequestConfigLoader<T, D> {
        final Context a;
        final String b;

        protected ComponentLoader(@NonNull Context context, @NonNull String string2) {
            this.a = context;
            this.b = string2;
        }

        @NonNull
        protected abstract T createBlankConfig();

        @NonNull
        public Context getContext() {
            return this.a;
        }

        @NonNull
        public String getPackageName() {
            return this.b;
        }

        @Override
        @NonNull
        public T load(@NonNull D d14) {
            T t13 = this.createBlankConfig();
            ((BaseRequestConfig)t13).setSdkIdentifiers(((DataSource)d14).sdkIdentifiers);
            ((BaseRequestConfig)t13).setSdkEnvironment(((DataSource)d14).sdkEnvironmentProvider.getSdkEnvironment());
            ((BaseRequestConfig)t13).setAppSetId(((DataSource)d14).platformIdentifiers.getAppSetIdProvider().getAppSetId());
            ((BaseRequestConfig)t13).setPackageName(this.b);
            return t13;
        }
    }

    public static class DataSource<A> {
        @NonNull
        public final A componentArguments;
        @NonNull
        public final PlatformIdentifiers platformIdentifiers;
        @NonNull
        public final SdkEnvironmentProvider sdkEnvironmentProvider;
        @NonNull
        public final SdkIdentifiers sdkIdentifiers;

        public DataSource(@NonNull SdkIdentifiers sdkIdentifiers, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, @NonNull A a14) {
            this.sdkIdentifiers = sdkIdentifiers;
            this.componentArguments = a14;
            this.sdkEnvironmentProvider = sdkEnvironmentProvider;
            this.platformIdentifiers = platformIdentifiers;
        }
    }

    public static interface RequestConfigLoader<T extends BaseRequestConfig, D> {
        @NonNull
        public T load(D var1);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.StartupParamsItem;
import java.util.Map;

public interface StartupParamsCallback {
    public static final String APPMETRICA_DEVICE_ID = "appmetrica_device_id";
    public static final String APPMETRICA_DEVICE_ID_HASH = "appmetrica_device_id_hash";
    public static final String APPMETRICA_UUID = "appmetrica_uuid";

    public void onReceive(@Nullable Result var1);

    public void onRequestError(@NonNull Reason var1, @Nullable Result var2);

    public static final class Reason {
        public static Reason INVALID_RESPONSE;
        public static Reason NETWORK;
        public static Reason UNKNOWN;
        @NonNull
        public final String value;

        static {
            UNKNOWN = new Reason("UNKNOWN");
            NETWORK = new Reason("NETWORK");
            INVALID_RESPONSE = new Reason("INVALID_RESPONSE");
        }

        public Reason(@NonNull String string2) {
            this.value = string2;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && Reason.class == object.getClass()) {
                object = (Reason)object;
                return this.value.equals(((Reason)object).value);
            }
            return false;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Reason{value='");
            stringBuilder.append(this.value);
            stringBuilder.append("'}");
            return stringBuilder.toString();
        }
    }

    public static final class Result {
        @Nullable
        public final String deviceId;
        @Nullable
        public final String deviceIdHash;
        @NonNull
        public final Map<String, StartupParamsItem> parameters;
        @Nullable
        public final String uuid;

        public Result(@NonNull Map<String, StartupParamsItem> map2) {
            this.parameters = map2;
            this.uuid = this.parameterForKey(StartupParamsCallback.APPMETRICA_UUID);
            this.deviceId = this.parameterForKey(StartupParamsCallback.APPMETRICA_DEVICE_ID);
            this.deviceIdHash = this.parameterForKey(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);
        }

        @Nullable
        public String parameterForKey(@NonNull String object) {
            if ((object = this.parameters.get(object)) != null) {
                return ((StartupParamsItem)object).getId();
            }
            return null;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics;

public final class StartupParamsItemStatus
extends Enum<StartupParamsItemStatus> {
    public static final /* enum */ StartupParamsItemStatus FEATURE_DISABLED;
    public static final /* enum */ StartupParamsItemStatus FORBIDDEN_BY_CLIENT_CONFIG;
    public static final /* enum */ StartupParamsItemStatus INVALID_VALUE_FROM_PROVIDER;
    public static final /* enum */ StartupParamsItemStatus NETWORK_ERROR;
    public static final /* enum */ StartupParamsItemStatus OK;
    public static final /* enum */ StartupParamsItemStatus PROVIDER_UNAVAILABLE;
    public static final /* enum */ StartupParamsItemStatus UNKNOWN_ERROR;
    private static final StartupParamsItemStatus[] a;

    static {
        StartupParamsItemStatus startupParamsItemStatus;
        StartupParamsItemStatus startupParamsItemStatus2;
        StartupParamsItemStatus startupParamsItemStatus3;
        StartupParamsItemStatus startupParamsItemStatus4;
        StartupParamsItemStatus startupParamsItemStatus5;
        StartupParamsItemStatus startupParamsItemStatus6;
        StartupParamsItemStatus startupParamsItemStatus7;
        OK = startupParamsItemStatus7 = new StartupParamsItemStatus();
        PROVIDER_UNAVAILABLE = startupParamsItemStatus6 = new StartupParamsItemStatus();
        INVALID_VALUE_FROM_PROVIDER = startupParamsItemStatus5 = new StartupParamsItemStatus();
        NETWORK_ERROR = startupParamsItemStatus4 = new StartupParamsItemStatus();
        FEATURE_DISABLED = startupParamsItemStatus3 = new StartupParamsItemStatus();
        UNKNOWN_ERROR = startupParamsItemStatus2 = new StartupParamsItemStatus();
        FORBIDDEN_BY_CLIENT_CONFIG = startupParamsItemStatus = new StartupParamsItemStatus();
        a = new StartupParamsItemStatus[]{startupParamsItemStatus7, startupParamsItemStatus6, startupParamsItemStatus5, startupParamsItemStatus4, startupParamsItemStatus3, startupParamsItemStatus2, startupParamsItemStatus};
    }

    public static StartupParamsItemStatus valueOf(String string2) {
        return Enum.valueOf(StartupParamsItemStatus.class, string2);
    }

    public static StartupParamsItemStatus[] values() {
        return (StartupParamsItemStatus[])a.clone();
    }
}


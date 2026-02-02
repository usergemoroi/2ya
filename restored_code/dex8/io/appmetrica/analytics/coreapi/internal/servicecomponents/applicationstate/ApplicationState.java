/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class ApplicationState
extends Enum<ApplicationState> {
    public static final /* enum */ ApplicationState BACKGROUND;
    public static final /* enum */ ApplicationState UNKNOWN;
    public static final /* enum */ ApplicationState VISIBLE;
    private static final ApplicationState[] b;
    private final String a;

    static {
        ApplicationState applicationState;
        ApplicationState applicationState2;
        ApplicationState applicationState3;
        UNKNOWN = applicationState3 = new ApplicationState("unknown");
        BACKGROUND = applicationState2 = new ApplicationState("background");
        VISIBLE = applicationState = new ApplicationState("visible");
        b = new ApplicationState[]{applicationState3, applicationState2, applicationState};
    }

    private ApplicationState(String string3) {
        this.a = string3;
    }

    @NonNull
    public static ApplicationState fromString(@Nullable String string2) {
        ApplicationState applicationState;
        ApplicationState applicationState2 = UNKNOWN;
        ApplicationState[] applicationStateArray = ApplicationState.values();
        int n10 = applicationStateArray.length;
        int n13 = 0;
        while (true) {
            applicationState = applicationState2;
            if (n13 >= n10) break;
            applicationState = applicationStateArray[n13];
            if (applicationState.a.equals(string2)) break;
            ++n13;
        }
        return applicationState;
    }

    public static ApplicationState valueOf(String string2) {
        return Enum.valueOf(ApplicationState.class, string2);
    }

    public static ApplicationState[] values() {
        return (ApplicationState[])b.clone();
    }

    @NonNull
    public String getStringValue() {
        return this.a;
    }
}


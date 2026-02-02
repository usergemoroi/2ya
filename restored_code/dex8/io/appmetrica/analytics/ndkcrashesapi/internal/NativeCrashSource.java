/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.Metadata;

@Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003\u00a8\u0006\u0004"}, d2={"Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashSource;", "", "UNKNOWN", "CRASHPAD", "ndkcrashes-api_release"}, k=1, mv={1, 6, 0})
public final class NativeCrashSource
extends Enum<NativeCrashSource> {
    public static final /* enum */ NativeCrashSource CRASHPAD;
    public static final /* enum */ NativeCrashSource UNKNOWN;
    private static final NativeCrashSource[] a;

    static {
        NativeCrashSource nativeCrashSource;
        NativeCrashSource nativeCrashSource2;
        UNKNOWN = nativeCrashSource2 = new NativeCrashSource();
        CRASHPAD = nativeCrashSource = new NativeCrashSource();
        a = new NativeCrashSource[]{nativeCrashSource2, nativeCrashSource};
    }

    public static NativeCrashSource valueOf(String string2) {
        return Enum.valueOf(NativeCrashSource.class, string2);
    }

    public static NativeCrashSource[] values() {
        return (NativeCrashSource[])a.clone();
    }
}


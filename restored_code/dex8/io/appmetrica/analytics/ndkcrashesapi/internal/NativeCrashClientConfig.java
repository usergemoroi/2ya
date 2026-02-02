/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u00a8\u0006\r"}, d2={"Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashClientConfig;", "", "", "a", "Ljava/lang/String;", "getNativeCrashFolder", "()Ljava/lang/String;", "nativeCrashFolder", "b", "getNativeCrashMetadata", "nativeCrashMetadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ndkcrashes-api_release"}, k=1, mv={1, 6, 0})
public final class NativeCrashClientConfig {
    private final String a;
    private final String b;

    public NativeCrashClientConfig(@NotNull String string2, @NotNull String string3) {
        this.a = string2;
        this.b = string3;
    }

    @NotNull
    public final String getNativeCrashFolder() {
        return this.a;
    }

    @NotNull
    public final String getNativeCrashMetadata() {
        return this.b;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007\u00a8\u0006\u0005"}, d2={"Lio/appmetrica/analytics/coreutils/internal/ApiKeyUtils;", "", "", "fullApiKey", "createPartialApiKey", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class ApiKeyUtils {
    @NotNull
    public static final ApiKeyUtils INSTANCE = new ApiKeyUtils();

    private ApiKeyUtils() {
    }

    @JvmStatic
    @NotNull
    public static final String createPartialApiKey(@Nullable String string2) {
        if (string2 != null && string2.length() == 36) {
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.replace(8, string2.length() - 4, "-xxxx-xxxx-xxxx-xxxxxxxx");
            return stringBuilder.toString();
        }
        return "undefined";
    }
}


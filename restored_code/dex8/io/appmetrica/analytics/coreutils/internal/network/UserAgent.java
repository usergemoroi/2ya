/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  kotlin.text.p
 */
package io.appmetrica.analytics.coreutils.internal.network;

import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007\u00a8\u0006\u0007"}, d2={"Lio/appmetrica/analytics/coreutils/internal/network/UserAgent;", "", "", "sdkName", "versionName", "buildNumber", "getFor", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class UserAgent {
    @NotNull
    public static final UserAgent INSTANCE = new UserAgent();

    private UserAgent() {
    }

    @JvmStatic
    @NotNull
    public static final String getFor(@NotNull String string2, @NotNull String charSequence, @NotNull String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append('/');
        stringBuilder.append((String)charSequence);
        stringBuilder.append('.');
        stringBuilder.append(string3);
        stringBuilder.append(" (");
        INSTANCE.getClass();
        string2 = Build.MODEL;
        string3 = Build.MANUFACTURER;
        if (!p.M((String)string2, (String)string3, (boolean)false, (int)2, null)) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string3);
            ((StringBuilder)charSequence).append(' ');
            ((StringBuilder)charSequence).append(string2);
            string2 = ((StringBuilder)charSequence).toString();
        }
        stringBuilder.append(StringExtensionsKt.replaceFirstCharWithTitleCase(string2));
        stringBuilder.append("; Android ");
        stringBuilder.append(Build.VERSION.RELEASE);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}


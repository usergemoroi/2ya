/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.os.Build$VERSION
 */
package io.appmetrica.analytics.coreutils.internal;

import android.annotation.SuppressLint;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a8\u0006\u0006"}, d2={"Lio/appmetrica/analytics/coreutils/internal/AndroidUtils;", "", "", "levelOfApi", "", "isApiAchieved", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class AndroidUtils {
    @NotNull
    public static final AndroidUtils INSTANCE = new AndroidUtils();

    private AndroidUtils() {
    }

    @JvmStatic
    @SuppressLint(value={"AnnotateVersionCheck"})
    public static final boolean isApiAchieved(int n10) {
        boolean bl2 = Build.VERSION.SDK_INT >= n10;
        return bl2;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.os.Build
 *  android.os.Build$VERSION
 */
package io.appmetrica.analytics.coreutils.internal.system;

import android.annotation.SuppressLint;
import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.system.RootChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\u0004\u00a8\u0006\f"}, d2={"Lio/appmetrica/analytics/coreutils/internal/system/ConstantDeviceInfo;", "", "", "APP_PLATFORM", "Ljava/lang/String;", "MANUFACTURER", "MODEL", "OS_VERSION", "", "OS_API_LEVEL", "I", "DEVICE_ROOT_STATUS", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class ConstantDeviceInfo {
    @NotNull
    public static final String APP_PLATFORM = "android";
    @JvmField
    @NotNull
    public static final String DEVICE_ROOT_STATUS;
    @NotNull
    public static final ConstantDeviceInfo INSTANCE;
    @JvmField
    @NotNull
    public static final String MANUFACTURER;
    @JvmField
    @NotNull
    public static final String MODEL;
    @SuppressLint(value={"AnnotateVersionCheck"})
    @JvmField
    public static final int OS_API_LEVEL;
    @JvmField
    @NotNull
    public static final String OS_VERSION;

    static {
        INSTANCE = new ConstantDeviceInfo();
        MANUFACTURER = Build.MANUFACTURER;
        MODEL = Build.MODEL;
        OS_VERSION = Build.VERSION.RELEASE;
        OS_API_LEVEL = Build.VERSION.SDK_INT;
        DEVICE_ROOT_STATUS = String.valueOf(RootChecker.isRootedPhone());
    }

    private ConstantDeviceInfo() {
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.telephony.TelephonyManager
 *  androidx.annotation.RequiresPermission
 *  com.applovin.impl.sdk.y0
 */
package io.appmetrica.analytics.coreutils.internal.services.telephony;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.annotation.RequiresPermission;
import com.applovin.impl.sdk.y0;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeConverter;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0003\f\u0005\rB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2={"Lio/appmetrica/analytics/coreutils/internal/services/telephony/CellularNetworkTypeExtractor;", "", "", "getNetworkType", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "b", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class CellularNetworkTypeExtractor {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String UNKNOWN_NETWORK_TYPE_VALUE = "unknown";
    private final Context a;
    private final FunctionWithThrowable b;

    public CellularNetworkTypeExtractor(@NotNull Context object) {
        this.a = object;
        object = AndroidUtils.isApiAchieved(24) ? new a() : new b();
        this.b = object;
    }

    @NotNull
    public final Context getContext() {
        return this.a;
    }

    @RequiresPermission(value="android.permission.READ_PHONE_STATE")
    @NotNull
    public final String getNetworkType() {
        return CellularNetworkTypeConverter.convert((Integer)SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "phone", "Extracting cellular networkType", "TelephonyManager", this.b));
    }

    @Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2={"Lio/appmetrica/analytics/coreutils/internal/services/telephony/CellularNetworkTypeExtractor$Companion;", "", "", "UNKNOWN_NETWORK_TYPE_VALUE", "Ljava/lang/String;", "core-utils_release"}, k=1, mv={1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }
    }

    @Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2={"Lio/appmetrica/analytics/coreutils/internal/services/telephony/CellularNetworkTypeExtractor$a;", "Lio/appmetrica/analytics/coreapi/internal/backport/FunctionWithThrowable;", "Landroid/telephony/TelephonyManager;", "", "input", "a", "(Landroid/telephony/TelephonyManager;)Ljava/lang/Integer;", "<init>", "()V", "core-utils_release"}, k=1, mv={1, 6, 0})
    @TargetApi(value=24)
    @DoNotInline
    public static final class a
    implements FunctionWithThrowable<TelephonyManager, Integer> {
        @RequiresPermission(value="android.permission.READ_PHONE_STATE")
        @NotNull
        public Integer a(@NotNull TelephonyManager telephonyManager) {
            return y0.a((TelephonyManager)telephonyManager);
        }
    }

    @Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2={"Lio/appmetrica/analytics/coreutils/internal/services/telephony/CellularNetworkTypeExtractor$b;", "Lio/appmetrica/analytics/coreapi/internal/backport/FunctionWithThrowable;", "Landroid/telephony/TelephonyManager;", "", "input", "a", "(Landroid/telephony/TelephonyManager;)Ljava/lang/Integer;", "<init>", "()V", "core-utils_release"}, k=1, mv={1, 6, 0})
    @DoNotInline
    public static final class b
    implements FunctionWithThrowable<TelephonyManager, Integer> {
        @RequiresPermission(value="android.permission.READ_PHONE_STATE")
        @NotNull
        public Integer a(@NotNull TelephonyManager telephonyManager) {
            return telephonyManager.getNetworkType();
        }
    }
}


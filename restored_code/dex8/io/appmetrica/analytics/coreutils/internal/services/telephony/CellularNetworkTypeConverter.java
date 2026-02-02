/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package io.appmetrica.analytics.coreutils.internal.services.telephony;

import android.util.SparseArray;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c0\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lio/appmetrica/analytics/coreutils/internal/services/telephony/CellularNetworkTypeConverter;", "", "", "systemValue", "", "convert", "(Ljava/lang/Integer;)Ljava/lang/String;", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class CellularNetworkTypeConverter {
    @NotNull
    public static final CellularNetworkTypeConverter INSTANCE = new CellularNetworkTypeConverter();
    private static final SparseArray a;

    static {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, (Object)"unknown");
        sparseArray.put(7, (Object)"1xRTT");
        sparseArray.put(4, (Object)"CDMA");
        sparseArray.put(2, (Object)"EDGE");
        sparseArray.put(14, (Object)"eHRPD");
        sparseArray.put(5, (Object)"EVDO rev.0");
        sparseArray.put(6, (Object)"EVDO rev.A");
        sparseArray.put(1, (Object)"GPRS");
        sparseArray.put(8, (Object)"HSDPA");
        sparseArray.put(10, (Object)"HSPA");
        sparseArray.put(15, (Object)"HSPA+");
        sparseArray.put(9, (Object)"HSUPA");
        sparseArray.put(11, (Object)"iDen");
        sparseArray.put(3, (Object)"UMTS");
        sparseArray.put(13, (Object)"LTE");
        sparseArray.put(16, (Object)"GSM");
        sparseArray.put(17, (Object)"TD_SCDMA");
        sparseArray.put(18, (Object)"IWLAN");
        if (AndroidUtils.isApiAchieved(29)) {
            sparseArray.put(20, (Object)"NR");
        }
        a = sparseArray;
    }

    private CellularNetworkTypeConverter() {
    }

    @JvmStatic
    @NotNull
    public static final String convert(@Nullable Integer object) {
        block3: {
            block2: {
                if (object == null) break block2;
                String string2 = (String)a.get(((Integer)object).intValue());
                object = string2;
                if (string2 != null) break block3;
            }
            object = "unknown";
        }
        return object;
    }
}


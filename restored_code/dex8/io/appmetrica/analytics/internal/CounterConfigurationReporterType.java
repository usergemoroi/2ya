/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0010"}, d2={"Lio/appmetrica/analytics/internal/CounterConfigurationReporterType;", "", "", "a", "Ljava/lang/String;", "getStringValue", "()Ljava/lang/String;", "stringValue", "Companion", "MAIN", "MANUAL", "SELF_SDK", "COMMUTATION", "SELF_DIAGNOSTIC_MAIN", "SELF_DIAGNOSTIC_MANUAL", "CRASH", "analytics_binaryProdRelease"}, k=1, mv={1, 6, 0})
public final class CounterConfigurationReporterType
extends Enum<CounterConfigurationReporterType> {
    public static final /* enum */ CounterConfigurationReporterType COMMUTATION;
    public static final /* enum */ CounterConfigurationReporterType CRASH;
    @NotNull
    public static final Companion Companion;
    public static final /* enum */ CounterConfigurationReporterType MAIN;
    public static final /* enum */ CounterConfigurationReporterType MANUAL;
    public static final /* enum */ CounterConfigurationReporterType SELF_DIAGNOSTIC_MAIN;
    public static final /* enum */ CounterConfigurationReporterType SELF_DIAGNOSTIC_MANUAL;
    public static final /* enum */ CounterConfigurationReporterType SELF_SDK;
    private static final CounterConfigurationReporterType[] b;
    private final String a;

    static {
        CounterConfigurationReporterType counterConfigurationReporterType;
        CounterConfigurationReporterType counterConfigurationReporterType2;
        CounterConfigurationReporterType counterConfigurationReporterType3;
        CounterConfigurationReporterType counterConfigurationReporterType4;
        CounterConfigurationReporterType counterConfigurationReporterType5;
        CounterConfigurationReporterType counterConfigurationReporterType6;
        CounterConfigurationReporterType counterConfigurationReporterType7;
        MAIN = counterConfigurationReporterType7 = new CounterConfigurationReporterType("main");
        MANUAL = counterConfigurationReporterType6 = new CounterConfigurationReporterType("manual");
        SELF_SDK = counterConfigurationReporterType5 = new CounterConfigurationReporterType("self_sdk");
        COMMUTATION = counterConfigurationReporterType4 = new CounterConfigurationReporterType("commutation");
        SELF_DIAGNOSTIC_MAIN = counterConfigurationReporterType3 = new CounterConfigurationReporterType("self_diagnostic_main");
        SELF_DIAGNOSTIC_MANUAL = counterConfigurationReporterType2 = new CounterConfigurationReporterType("self_diagnostic_manual");
        CRASH = counterConfigurationReporterType = new CounterConfigurationReporterType("crash");
        b = new CounterConfigurationReporterType[]{counterConfigurationReporterType7, counterConfigurationReporterType6, counterConfigurationReporterType5, counterConfigurationReporterType4, counterConfigurationReporterType3, counterConfigurationReporterType2, counterConfigurationReporterType};
        Companion = new Companion(null);
    }

    private CounterConfigurationReporterType(String string3) {
        this.a = string3;
    }

    @JvmStatic
    @NotNull
    public static final CounterConfigurationReporterType fromStringValue(@Nullable String string2) {
        return Companion.fromStringValue(string2);
    }

    public static CounterConfigurationReporterType valueOf(String string2) {
        return Enum.valueOf(CounterConfigurationReporterType.class, string2);
    }

    public static CounterConfigurationReporterType[] values() {
        return (CounterConfigurationReporterType[])b.clone();
    }

    @NotNull
    public final String getStringValue() {
        return this.a;
    }

    @Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007\u00a8\u0006\u0006"}, d2={"Lio/appmetrica/analytics/internal/CounterConfigurationReporterType$Companion;", "", "", "value", "Lio/appmetrica/analytics/internal/CounterConfigurationReporterType;", "fromStringValue", "analytics_binaryProdRelease"}, k=1, mv={1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CounterConfigurationReporterType fromStringValue(@Nullable String object) {
            Object object22;
            block2: {
                for (Object object22 : CounterConfigurationReporterType.values()) {
                    if (!y.e(object22.getStringValue(), object)) continue;
                    object = object22;
                    break block2;
                }
                object = null;
            }
            object22 = object;
            if (object == null) {
                object22 = MAIN;
            }
            return object22;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0010"}, d2={"Lio/appmetrica/analytics/coreapi/internal/identifiers/IdentifierStatus;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "Companion", "OK", "IDENTIFIER_PROVIDER_UNAVAILABLE", "INVALID_ADV_ID", "NO_STARTUP", "FORBIDDEN_BY_CLIENT_CONFIG", "FEATURE_DISABLED", "UNKNOWN", "core-api_release"}, k=1, mv={1, 6, 0})
public final class IdentifierStatus
extends Enum<IdentifierStatus> {
    @NotNull
    public static final Companion Companion;
    public static final /* enum */ IdentifierStatus FEATURE_DISABLED;
    public static final /* enum */ IdentifierStatus FORBIDDEN_BY_CLIENT_CONFIG;
    public static final /* enum */ IdentifierStatus IDENTIFIER_PROVIDER_UNAVAILABLE;
    public static final /* enum */ IdentifierStatus INVALID_ADV_ID;
    @Deprecated(message="Will be removed in future version")
    public static final /* enum */ IdentifierStatus NO_STARTUP;
    public static final /* enum */ IdentifierStatus OK;
    public static final /* enum */ IdentifierStatus UNKNOWN;
    private static final IdentifierStatus[] b;
    private final String a;

    static {
        IdentifierStatus identifierStatus;
        IdentifierStatus identifierStatus2;
        IdentifierStatus identifierStatus3;
        IdentifierStatus identifierStatus4;
        IdentifierStatus identifierStatus5;
        IdentifierStatus identifierStatus6;
        IdentifierStatus identifierStatus7;
        OK = identifierStatus7 = new IdentifierStatus("OK");
        IDENTIFIER_PROVIDER_UNAVAILABLE = identifierStatus6 = new IdentifierStatus("IDENTIFIER_PROVIDER_UNAVAILABLE");
        INVALID_ADV_ID = identifierStatus5 = new IdentifierStatus("INVALID_ADV_ID");
        NO_STARTUP = identifierStatus4 = new IdentifierStatus("NO_STARTUP");
        FORBIDDEN_BY_CLIENT_CONFIG = identifierStatus3 = new IdentifierStatus("FORBIDDEN_BY_CLIENT_CONFIG");
        FEATURE_DISABLED = identifierStatus2 = new IdentifierStatus("FEATURE_DISABLED");
        UNKNOWN = identifierStatus = new IdentifierStatus("UNKNOWN");
        b = new IdentifierStatus[]{identifierStatus7, identifierStatus6, identifierStatus5, identifierStatus4, identifierStatus3, identifierStatus2, identifierStatus};
        Companion = new Companion(null);
    }

    private IdentifierStatus(String string3) {
        this.a = string3;
    }

    @JvmStatic
    @NotNull
    public static final IdentifierStatus from(@Nullable String string2) {
        return Companion.from(string2);
    }

    public static IdentifierStatus valueOf(String string2) {
        return Enum.valueOf(IdentifierStatus.class, string2);
    }

    public static IdentifierStatus[] values() {
        return (IdentifierStatus[])b.clone();
    }

    @NotNull
    public final String getValue() {
        return this.a;
    }

    @Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007\u00a8\u0006\u0006"}, d2={"Lio/appmetrica/analytics/coreapi/internal/identifiers/IdentifierStatus$Companion;", "", "", "stringValue", "Lio/appmetrica/analytics/coreapi/internal/identifiers/IdentifierStatus;", "from", "core-api_release"}, k=1, mv={1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        @JvmStatic
        @NotNull
        public final IdentifierStatus from(@Nullable String object) {
            Object object22;
            block2: {
                for (Object object22 : IdentifierStatus.values()) {
                    if (!y.e(object22.getValue(), object)) continue;
                    object = object22;
                    break block2;
                }
                object = null;
            }
            object22 = object;
            if (object == null) {
                object22 = UNKNOWN;
            }
            return object22;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\n\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\u00a8\u0006\u001a"}, d2={"Lio/appmetrica/analytics/coreapi/internal/identifiers/SdkIdentifiers;", "", "", "component1", "component2", "component3", "uuid", "deviceId", "deviceIdHash", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUuid", "()Ljava/lang/String;", "b", "getDeviceId", "c", "getDeviceIdHash", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "core-api_release"}, k=1, mv={1, 6, 0})
public final class SdkIdentifiers {
    private final String a;
    private final String b;
    private final String c;

    public SdkIdentifiers(@Nullable String string2, @Nullable String string3, @Nullable String string4) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
    }

    public static /* synthetic */ SdkIdentifiers copy$default(SdkIdentifiers sdkIdentifiers, String string2, String string3, String string4, int n10, Object object) {
        if ((n10 & 1) != 0) {
            string2 = sdkIdentifiers.a;
        }
        if ((n10 & 2) != 0) {
            string3 = sdkIdentifiers.b;
        }
        if ((n10 & 4) != 0) {
            string4 = sdkIdentifiers.c;
        }
        return sdkIdentifiers.copy(string2, string3, string4);
    }

    @Nullable
    public final String component1() {
        return this.a;
    }

    @Nullable
    public final String component2() {
        return this.b;
    }

    @Nullable
    public final String component3() {
        return this.c;
    }

    @NotNull
    public final SdkIdentifiers copy(@Nullable String string2, @Nullable String string3, @Nullable String string4) {
        return new SdkIdentifiers(string2, string3, string4);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof SdkIdentifiers)) {
            return false;
        }
        object = (SdkIdentifiers)object;
        if (!y.e(this.a, ((SdkIdentifiers)object).a)) {
            return false;
        }
        if (!y.e(this.b, ((SdkIdentifiers)object).b)) {
            return false;
        }
        return y.e(this.c, ((SdkIdentifiers)object).c);
    }

    @Nullable
    public final String getDeviceId() {
        return this.b;
    }

    @Nullable
    public final String getDeviceIdHash() {
        return this.c;
    }

    @Nullable
    public final String getUuid() {
        return this.a;
    }

    public int hashCode() {
        String string2 = this.a;
        int n10 = 0;
        int n13 = string2 == null ? 0 : string2.hashCode();
        string2 = this.b;
        int n14 = string2 == null ? 0 : string2.hashCode();
        string2 = this.c;
        if (string2 != null) {
            n10 = string2.hashCode();
        }
        return (n13 * 31 + n14) * 31 + n10;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SdkIdentifiers(uuid=");
        stringBuilder.append(this.a);
        stringBuilder.append(", deviceId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", deviceIdHash=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}


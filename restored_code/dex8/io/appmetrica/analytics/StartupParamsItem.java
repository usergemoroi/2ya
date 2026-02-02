/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.StartupParamsItemStatus;
import java.util.Objects;

public final class StartupParamsItem {
    private final String a;
    private final StartupParamsItemStatus b;
    private final String c;

    public StartupParamsItem(@Nullable String string2, @NonNull StartupParamsItemStatus startupParamsItemStatus, @Nullable String string3) {
        this.a = string2;
        this.b = startupParamsItemStatus;
        this.c = string3;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && StartupParamsItem.class == object.getClass()) {
            object = (StartupParamsItem)object;
            if (!Objects.equals(this.a, ((StartupParamsItem)object).a) || this.b != ((StartupParamsItem)object).b || !Objects.equals(this.c, ((StartupParamsItem)object).c)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Nullable
    public String getErrorDetails() {
        return this.c;
    }

    @Nullable
    public String getId() {
        return this.a;
    }

    @NonNull
    public StartupParamsItemStatus getStatus() {
        return this.b;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("StartupParamsItem{id='");
        stringBuilder.append(this.a);
        stringBuilder.append("', status=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", errorDetails='");
        stringBuilder.append(this.c);
        stringBuilder.append("'}");
        return stringBuilder.toString();
    }
}


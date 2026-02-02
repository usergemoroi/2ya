/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.coreapi.internal.permission;

import androidx.annotation.NonNull;

public class PermissionState {
    public final boolean granted;
    @NonNull
    public final String name;

    public PermissionState(@NonNull String string2, boolean bl2) {
        this.name = string2;
        this.granted = bl2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (PermissionState)object;
            if (this.granted != ((PermissionState)object).granted) {
                return false;
            }
            return this.name.equals(((PermissionState)object).name);
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode() * 31 + this.granted;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PermissionState{name='");
        stringBuilder.append(this.name);
        stringBuilder.append("', granted=");
        stringBuilder.append(this.granted);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}


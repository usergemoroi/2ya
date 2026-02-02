/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

public class o5 {
    public final String a;
    public final String b;

    public o5(String string2, String string3) {
        this.a = string2;
        this.b = string3;
    }

    @NonNull
    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.b);
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("_");
        stringBuilder.append(ApiKeyUtils.createPartialApiKey(this.b));
        return stringBuilder.toString();
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Object object2 = (o5)object;
            object = this.a;
            if (object != null ? !((String)object).equals(((o5)object2).a) : ((o5)object2).a != null) {
                return false;
            }
            object = this.b;
            object2 = ((o5)object2).b;
            if (object != null) {
                bl2 = ((String)object).equals(object2);
            } else if (object2 != null) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.a;
        int n10 = 0;
        int n13 = string2 != null ? string2.hashCode() : 0;
        string2 = this.b;
        if (string2 != null) {
            n10 = string2.hashCode();
        }
        return n13 * 31 + n10;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("_");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}


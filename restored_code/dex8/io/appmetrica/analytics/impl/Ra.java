/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import org.json.JSONObject;

public final class ra {
    public final String a;
    public final int b;
    public final boolean c;

    public ra(String string2, int n10, boolean bl2) {
        this.a = string2;
        this.b = n10;
        this.c = bl2;
    }

    public ra(JSONObject jSONObject) {
        this.a = jSONObject.getString("name");
        this.c = jSONObject.getBoolean("required");
        this.b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && ra.class == object.getClass()) {
            Object object2 = (ra)object;
            if (this.b != ((ra)object2).b) {
                return false;
            }
            if (this.c != ((ra)object2).c) {
                return false;
            }
            object = this.a;
            object2 = ((ra)object2).a;
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
        int n10 = string2 != null ? string2.hashCode() : 0;
        return (n10 * 31 + this.b) * 31 + this.c;
    }
}


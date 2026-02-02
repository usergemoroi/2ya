/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  org.json.JSONArray
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.hb;
import io.appmetrica.analytics.impl.sf;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

public abstract class rf {
    public static final String c = "rf";
    public final hb a;
    public final String b;

    public rf(hb hb4, String string2) {
        this.a = hb4;
        this.b = string2;
    }

    public final int a(@NonNull String string2, int n10) {
        return this.a.getInt(string2, n10);
    }

    public final long a(String string2, long l10) {
        return this.a.getLong(string2, l10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final <T extends rf> T a(String string2, float f11) {
        synchronized (this) {
            this.a.a(string2, f11);
            return (T)this;
        }
    }

    public final <T extends rf> T a(String string2, List<String> list) {
        return this.a(string2, list.toArray(new String[list.size()]));
    }

    public final <T extends rf> T a(String string2, String[] object) {
        JSONArray jSONArray = new JSONArray();
        int n10 = ((String[])object).length;
        for (int i14 = 0; i14 < n10; ++i14) {
            jSONArray.put((Object)object[i14]);
            continue;
        }
        try {
            object = jSONArray.toString();
        }
        catch (Throwable throwable) {
            object = null;
        }
        this.a.a(string2, (String)object);
        return (T)this;
    }

    @Nullable
    public final String a(@NonNull String string2, @Nullable String string3) {
        return this.a.getString(string2, string3);
    }

    public final boolean a(String string2, boolean bl2) {
        return this.a.getBoolean(string2, bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public final <T extends rf> T b(String string2, int n10) {
        synchronized (this) {
            this.a.a(n10, string2);
            return (T)this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final <T extends rf> T b(String string2, long l10) {
        synchronized (this) {
            this.a.a(string2, l10);
            return (T)this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final <T extends rf> T b(String string2, String string3) {
        synchronized (this) {
            this.a.a(string2, string3);
            return (T)this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final <T extends rf> T b(String string2, boolean bl2) {
        synchronized (this) {
            this.a.a(string2, bl2);
            return (T)this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            this.a.b();
            return;
        }
    }

    public final boolean b(@NonNull String string2) {
        return this.a.a(string2);
    }

    public final sf c(String string2) {
        return new sf(string2, this.b);
    }

    @NonNull
    public Set<String> c() {
        return this.a.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final <T extends rf> T d(String string2) {
        synchronized (this) {
            this.a.remove(string2);
            return (T)this;
        }
    }
}


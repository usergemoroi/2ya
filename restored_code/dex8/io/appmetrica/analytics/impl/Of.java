/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.rd;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class of
implements rd {
    public final Context a;
    public final String b;
    public final String c;

    public of(@NotNull Context context, @NotNull String string2, @NotNull String string3) {
        this.a = context;
        this.b = string2;
        this.c = string3;
    }

    public static of a(of of2, Context context, String string2, String string3, int n10, Object object) {
        if ((n10 & 1) != 0) {
            context = of2.a;
        }
        if ((n10 & 2) != 0) {
            string2 = of2.b;
        }
        if ((n10 & 4) != 0) {
            string3 = of2.c;
        }
        of2.getClass();
        return new of(context, string2, string3);
    }

    @NotNull
    public final of a(@NotNull Context context, @NotNull String string2, @NotNull String string3) {
        return new of(context, string2, string3);
    }

    @Override
    @NotNull
    public final String a() {
        Object object = this.a.getSharedPreferences(this.b, 0);
        String string2 = this.c;
        String string3 = "";
        if ((object = object.getString(string2, "")) != null) {
            string3 = object;
        }
        return string3;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof of)) {
            return false;
        }
        object = (of)object;
        if (!y.e(this.a, ((of)object).a)) {
            return false;
        }
        if (!y.e(this.b, ((of)object).b)) {
            return false;
        }
        return y.e(this.c, ((of)object).c);
    }

    public final int hashCode() {
        int n10 = this.a.hashCode();
        int n13 = this.b.hashCode();
        return this.c.hashCode() + (n13 + n10 * 31) * 31;
    }

    @NotNull
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PreferencesBasedModuleEntryPoint(context=");
        stringBuilder.append(this.a);
        stringBuilder.append(", prefName=");
        stringBuilder.append(this.b);
        stringBuilder.append(", prefValueName=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}


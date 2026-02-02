/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.logger.common;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;

public abstract class BaseImportantLogger {
    private final c a;

    public BaseImportantLogger(@NonNull String string2) {
        this.a = new c(new d(string2), new a(), new b());
    }

    public void info(@NonNull String string2, @Nullable String string32, Object ... object) {
        c c11 = this.a;
        c11.b.getClass();
        string2 = io.appmetrica.analytics.logger.common.impl.a.a(string2, string32, (Object[])object);
        for (String string32 : c11.c.a(string2)) {
            String string4 = c11.a.a;
            string2 = string32;
            if (string32 == null) {
                string2 = "";
            }
            Log.println((int)4, (String)string4, (String)string2);
        }
    }
}


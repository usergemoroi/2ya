/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.logger.common;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;

public abstract class BaseReleaseLogger {
    private static volatile String d = "";
    private final String a;
    private volatile boolean b = false;
    private final c c;

    public BaseReleaseLogger(@NonNull String string2, @NonNull String string3) {
        this.c = new c(new d(string2), new a(), new b());
        this.a = string3;
    }

    public static void init(@NonNull Context context) {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(context.getPackageName());
        stringBuilder.append("] : ");
        d = stringBuilder.toString();
    }

    public void error(@Nullable String object, Object ... object22) {
        if (this.b) {
            c c11 = this.c;
            String string2 = this.getPrefix();
            c11.b.getClass();
            object = io.appmetrica.analytics.logger.common.impl.a.a(string2, (String)object, object22);
            for (Object object22 : c11.c.a((String)object)) {
                String string3 = c11.a.a;
                object = object22;
                if (object22 == null) {
                    object = "";
                }
                Log.println((int)6, (String)string3, (String)object);
            }
        }
    }

    public void error(@Nullable Throwable object, @Nullable String string22, Object ... object2) {
        if (this.b) {
            c c11 = this.c;
            String string3 = this.getPrefix();
            c11.b.getClass();
            StringBuilder stringBuilder = new StringBuilder();
            String string4 = string22;
            if (string22 == null) {
                string4 = "";
            }
            stringBuilder.append(string4);
            stringBuilder.append("\n");
            stringBuilder.append(Log.getStackTraceString((Throwable)object));
            object = io.appmetrica.analytics.logger.common.impl.a.a(string3, stringBuilder.toString(), (Object[])object2);
            for (String string22 : c11.c.a((String)object)) {
                string4 = c11.a.a;
                object = string22;
                if (string22 == null) {
                    object = "";
                }
                Log.println((int)6, (String)string4, (String)object);
            }
        }
    }

    @NonNull
    public String getPrefix() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d);
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }

    public void info(@Nullable String object, Object ... object22) {
        if (this.b) {
            c c11 = this.c;
            String string2 = this.getPrefix();
            c11.b.getClass();
            object = io.appmetrica.analytics.logger.common.impl.a.a(string2, (String)object, object22);
            for (Object object22 : c11.c.a((String)object)) {
                String string3 = c11.a.a;
                object = object22;
                if (object22 == null) {
                    object = "";
                }
                Log.println((int)4, (String)string3, (String)object);
            }
        }
    }

    public void setEnabled(boolean bl2) {
        this.b = bl2;
    }

    public void warning(@Nullable String object, Object ... object22) {
        if (this.b) {
            c c11 = this.c;
            String string2 = this.getPrefix();
            c11.b.getClass();
            object = io.appmetrica.analytics.logger.common.impl.a.a(string2, (String)object, object22);
            for (Object object22 : c11.c.a((String)object)) {
                string2 = c11.a.a;
                object = object22;
                if (object22 == null) {
                    object = "";
                }
                Log.println((int)5, (String)string2, (String)object);
            }
        }
    }
}


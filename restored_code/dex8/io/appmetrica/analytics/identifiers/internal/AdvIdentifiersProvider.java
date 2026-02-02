/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.annotation.Keep
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.identifiers.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.identifiers.impl.a;
import io.appmetrica.analytics.identifiers.impl.b;
import io.appmetrica.analytics.identifiers.impl.c;
import io.appmetrica.analytics.identifiers.impl.d;

@Keep
public class AdvIdentifiersProvider {
    public static final int a = 0;
    private static final d retriever = new d();

    public static Bundle requestIdentifiers(@NonNull Context context, @NonNull Bundle object) {
        c c11;
        object = object.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER");
        if ((object = (b)AdvIdentifiersProvider.retriever.a.get(object)) != null && (c11 = object.a(context)) != null) {
            context = new Bundle();
            Object object2 = c11.b;
            if (object2 != null) {
                object = new Bundle();
                object.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", ((a)object2).a);
                object.putString("io.appmetrica.analytics.identifiers.extra.ID", ((a)object2).b);
                object2 = ((a)object2).c;
                if (object2 != null) {
                    object.putBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED", ((Boolean)object2).booleanValue());
                }
                context.putBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO", (Bundle)object);
            }
            context.putString("io.appmetrica.analytics.identifiers.extra.STATUS", c11.a.getValue());
            context.putString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE", c11.c);
        } else {
            context = null;
        }
        return context;
    }
}


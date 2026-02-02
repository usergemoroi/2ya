/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package io.appmetrica.analytics.networktasks.impl;

import android.net.Uri;
import kotlin.jvm.internal.y;

public final class c {
    public final String a;

    public c(String string2) {
        this.a = c.a(string2);
    }

    public static String a(String string2) {
        String string3 = string2;
        if (string2 != null) {
            if (string2.length() == 0) {
                string3 = string2;
            } else {
                Uri uri = Uri.parse((String)string2);
                string3 = string2;
                if (y.e("http", uri.getScheme())) {
                    string3 = uri.buildUpon().scheme("https").build().toString();
                }
            }
        }
        return string3;
    }
}


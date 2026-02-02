/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 *  android.os.LocaleList
 *  androidx.appcompat.app.c
 *  androidx.compose.material3.r0
 *  androidx.compose.ui.text.intl.b
 */
package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.appcompat.app.c;
import androidx.compose.material3.r0;
import androidx.compose.ui.text.intl.b;
import io.appmetrica.analytics.impl.af;
import java.util.ArrayList;
import java.util.Locale;

public abstract class jc {
    public static final ArrayList a(Configuration configuration) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if ((configuration = c.a((Configuration)configuration)) == null) {
            return arrayList;
        }
        int n10 = b.a((LocaleList)configuration);
        for (int i14 = 0; i14 < n10; ++i14) {
            Locale locale = r0.a((LocaleList)configuration, (int)i14);
            if (locale == null) continue;
            arrayList.add(af.a(locale));
        }
        return arrayList;
    }
}


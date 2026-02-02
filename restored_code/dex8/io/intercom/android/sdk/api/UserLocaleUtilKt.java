/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Build$VERSION
 *  android.os.LocaleList
 *  androidx.appcompat.app.c
 *  androidx.compose.material3.r0
 *  androidx.compose.ui.text.intl.b
 *  kotlin.collections.t
 */
package io.intercom.android.sdk.api;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.appcompat.app.c;
import androidx.compose.material3.r0;
import androidx.compose.ui.text.intl.b;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u00a8\u0006\u0004"}, d2={"getUserLocaleString", "", "context", "Landroid/content/Context;", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0}, xi=48)
public final class UserLocaleUtilKt {
    @NotNull
    public static final String getUserLocaleString(@NotNull Context object) {
        y.j(object, "context");
        if (Build.VERSION.SDK_INT >= 24) {
            object = c.a((Configuration)object.getResources().getConfiguration());
            y.i(object, "context.resources.configuration.locales");
            ArrayList<String> arrayList = new ArrayList<String>();
            int n10 = b.a((LocaleList)object);
            for (int i14 = 0; i14 < n10; ++i14) {
                Locale locale = r0.a((LocaleList)object, (int)i14);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(locale.getLanguage());
                stringBuilder.append('-');
                stringBuilder.append(locale.getCountry());
                arrayList.add(stringBuilder.toString());
            }
            object = t.B0(arrayList, (CharSequence)",", null, null, (int)0, null, null, (int)62, null);
        } else {
            object = object.getResources().getConfiguration().locale;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(((Locale)object).getLanguage());
            stringBuilder.append('-');
            stringBuilder.append(((Locale)object).getCountry());
            object = stringBuilder.toString();
        }
        return object;
    }
}


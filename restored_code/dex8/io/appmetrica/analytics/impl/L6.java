/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.impl.k6;
import io.appmetrica.analytics.impl.m6;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

public abstract class l6
extends BaseRequestConfig.ComponentLoader {
    public final SafePackageManager a;

    public l6(@NonNull Context context, @NonNull String string2) {
        this(context, string2, new SafePackageManager());
    }

    public l6(@NonNull Context context, @NonNull String string2, @NonNull SafePackageManager safePackageManager) {
        super(context, string2);
        this.a = safePackageManager;
    }

    @NonNull
    public m6 a(@NonNull k6 object) {
        m6 m63 = (m6)super.load(object);
        String string2 = this.getContext().getPackageName();
        ApplicationInfo applicationInfo = this.a.getApplicationInfo(this.getContext(), this.getPackageName(), 0);
        String string3 = "1";
        if (applicationInfo != null) {
            int n10 = applicationInfo.flags;
            string2 = (n10 & 2) != 0 ? "1" : "0";
            m63.a = string2;
            if ((n10 & 1) == 0) {
                string3 = "0";
            }
            m63.b = string3;
        } else if (TextUtils.equals((CharSequence)string2, (CharSequence)this.getPackageName())) {
            string2 = (this.getContext().getApplicationInfo().flags & 2) != 0 ? "1" : "0";
            m63.a = string2;
            if ((this.getContext().getApplicationInfo().flags & 1) == 0) {
                string3 = "0";
            }
            m63.b = string3;
        } else {
            m63.a = "0";
            m63.b = "0";
        }
        m63.c = object = ((k6)object).a;
        m6.a(m63, ((om)object).t);
        return m63;
    }
}


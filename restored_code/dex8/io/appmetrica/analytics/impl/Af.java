/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 *  android.net.Network
 *  android.net.NetworkCapabilities
 *  android.text.TextUtils
 */
package io.appmetrica.analytics.impl;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.impl.Ve;
import io.appmetrica.analytics.impl.We;
import io.appmetrica.analytics.impl.Xe;
import io.appmetrica.analytics.impl.Ze;
import java.util.Locale;

public abstract class af {
    public static final Ve a = new Ve();
    public static final We b = new We();
    public static final Xe c = new Xe(2);

    public static Ze a(ConnectivityManager object) {
        block4: {
            NetworkCapabilities networkCapabilities;
            Ze ze3 = Ze.n;
            Object object2 = object.getActiveNetwork();
            if (AndroidUtils.isApiAchieved(29) ? object2 == null : object2 == null || (networkCapabilities = object.getNetworkInfo((Network)object2)) != null && !networkCapabilities.isConnected()) {
                object = Ze.m;
            } else {
                networkCapabilities = object.getNetworkCapabilities((Network)object2);
                object = ze3;
                if (networkCapabilities != null) {
                    object2 = af.b.a.keySet().iterator();
                    do {
                        object = ze3;
                        if (!object2.hasNext()) break block4;
                    } while (!networkCapabilities.hasTransport((object = (Integer)object2.next()).intValue()));
                    object = (Ze)((Object)b.a(object));
                }
            }
        }
        return object;
    }

    public static String a(Locale object) {
        CharSequence charSequence = ((Locale)object).getLanguage();
        String string2 = ((Locale)object).getCountry();
        charSequence = new StringBuilder((String)charSequence);
        if (!TextUtils.isEmpty((CharSequence)(object = ((Locale)object).getScript()))) {
            ((StringBuilder)charSequence).append('-');
            ((StringBuilder)charSequence).append((String)object);
        }
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            ((StringBuilder)charSequence).append('_');
            ((StringBuilder)charSequence).append(string2);
        }
        return ((StringBuilder)charSequence).toString();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.impl.af;
import io.appmetrica.analytics.impl.jc;
import java.util.List;
import kotlin.collections.t;

public final class ic {
    public static List a(Configuration object) {
        object = AndroidUtils.isApiAchieved(24) ? jc.a(object) : t.e((Object)af.a(object.locale));
        return object;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.wo;
import io.appmetrica.analytics.impl.yo;
import java.util.LinkedList;
import java.util.List;

public final class xo
implements yo {
    public final wo a(@Nullable List<wo> object) {
        LinkedList<String> linkedList = new LinkedList<String>();
        object = object.iterator();
        boolean bl2 = true;
        while (object.hasNext()) {
            wo wo3 = (wo)object.next();
            if (wo3.a) continue;
            linkedList.add(wo3.b);
            bl2 = false;
        }
        object = bl2 ? new wo(this, true, "") : new wo(this, false, TextUtils.join((CharSequence)", ", linkedList));
        return object;
    }
}


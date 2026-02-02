/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Base64
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.l9;
import io.appmetrica.analytics.impl.rg;
import io.appmetrica.analytics.impl.zo;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

public final class jg
implements zo {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final byte[] a(l9 object, Gh object2) {
        if (TextUtils.isEmpty((CharSequence)((l9)object).b)) return new byte[0];
        try {
            object = Base64.decode((String)((l9)object).b, (int)0);
            object = object != null && ((Object)object).length != 0 ? new Jg((byte[])object) : null;
            rg rg3 = new rg();
            object2 = ((Jg)object).a;
            object2 = object2 == null ? (Object)new byte[0] : (Object)((String)object2).getBytes();
            rg3.a = (byte[])object2;
            rg3.c = ((Jg)object).b;
            rg3.b = ((Jg)object).c;
            int n10 = ((Jg)object).d.ordinal();
            int n13 = 1;
            if (n10 != 1) {
                n13 = 2;
                if (n10 != 2) {
                    n13 = 0;
                }
            }
            rg3.d = n13;
            return MessageNano.toByteArray(rg3);
        }
        catch (Throwable throwable) {
            return new byte[0];
        }
    }
}


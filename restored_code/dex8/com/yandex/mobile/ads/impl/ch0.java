/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.mv
 *  com.yandex.mobile.ads.impl.sf
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bh0;
import com.yandex.mobile.ads.impl.mv;
import com.yandex.mobile.ads.impl.sf;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class ch0
extends mv {
    public final int d;

    public ch0(int n10) {
        super(ch0.a(n10, 1));
        this.d = 1;
    }

    public ch0(IOException iOException, int n10, int n12) {
        super((Throwable)iOException, ch0.a(n10, n12));
        this.d = n12;
    }

    public ch0(String string2, int n10) {
        super(ch0.a(n10, 1), string2);
        this.d = 1;
    }

    public ch0(String string2, @Nullable IOException iOException, int n10) {
        super(ch0.a(n10, 1), string2, (Throwable)iOException);
        this.d = 1;
    }

    private static int a(int n10, int n12) {
        int n13 = n10;
        if (n10 == 2000) {
            n13 = n10;
            if (n12 == 1) {
                n13 = 2001;
            }
        }
        return n13;
    }

    public static ch0 a(IOException object, int n10) {
        String string2 = object.getMessage();
        int n12 = object instanceof SocketTimeoutException ? 2002 : (object instanceof InterruptedIOException ? 1004 : (string2 != null && sf.b((String)string2).matches("cleartext.*not permitted.*") ? 2007 : 2001));
        object = n12 == 2007 ? new bh0((IOException)object) : new ch0((IOException)object, n12, n10);
        return object;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$CodecException
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  com.yandex.mobile.ads.impl.gv0
 *  com.yandex.mobile.ads.impl.iy
 *  com.yandex.mobile.ads.impl.m92
 */
package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.gv0;
import com.yandex.mobile.ads.impl.iy;
import com.yandex.mobile.ads.impl.m92;

public class fv0
extends iy {
    @Nullable
    public final String b;

    public fv0(IllegalStateException illegalStateException, @Nullable gv0 object) {
        StringBuilder stringBuilder = new StringBuilder("Decoder failed: ");
        Object var3_4 = null;
        object = object == null ? null : object.a;
        stringBuilder.append((String)object);
        super(stringBuilder.toString(), (Throwable)illegalStateException);
        object = var3_4;
        if (m92.a >= 21) {
            object = fv0.a(illegalStateException);
        }
        this.b = object;
    }

    @Nullable
    @RequiresApi(value=21)
    private static String a(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException)illegalStateException).getDiagnosticInfo();
        }
        return null;
    }
}


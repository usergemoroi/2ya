/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.k01$b
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.n01;
import com.yandex.mobile.ads.impl.s50;
import com.yandex.mobile.ads.impl.uy1;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class t50
extends uy1 {
    @Override
    protected final k01 a(n01 object, ByteBuffer object2) {
        object = ((ByteBuffer)object2).array();
        object = new bg1(((Buffer)object2).limit(), (byte[])object);
        String string2 = object.q();
        string2.getClass();
        object2 = object.q();
        object2.getClass();
        return new k01(new k01.b[]{new s50(string2, (String)object2, object.p(), object.p(), Arrays.copyOfRange(object.c(), object.d(), object.e()))});
    }
}


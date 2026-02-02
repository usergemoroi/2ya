/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.q32
 *  com.yandex.mobile.ads.impl.qk2
 *  com.yandex.mobile.ads.impl.qk2$d
 *  com.yandex.mobile.ads.impl.wu$a
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.e21;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.qk2;
import com.yandex.mobile.ads.impl.s32;
import com.yandex.mobile.ads.impl.wu;
import com.yandex.mobile.ads.impl.wy1;
import java.util.ArrayList;
import java.util.Collections;

public final class d21
extends wy1 {
    private final bg1 m = new bg1();

    @Override
    protected final q32 a(byte[] object, int n10, boolean bl2) throws s32 {
        this.m.a(n10, object);
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        while (this.m.a() > 0) {
            if (this.m.a() >= 8) {
                n10 = this.m.h();
                if (this.m.h() == 1987343459) {
                    Object object2 = this.m;
                    n10 -= 8;
                    object = null;
                    wu.a a12 = null;
                    while (n10 > 0) {
                        if (n10 >= 8) {
                            int n12 = object2.h();
                            int n13 = object2.h();
                            String string2 = m92.a((byte[])object2.c(), (int)object2.d(), (int)(n12 -= 8));
                            object2.f(n12);
                            n12 = n10 - 8 - n12;
                            if (n13 == 1937011815) {
                                a12 = qk2.a((String)string2);
                                n10 = n12;
                                continue;
                            }
                            n10 = n12;
                            if (n13 != 1885436268) continue;
                            object = qk2.a(null, (String)string2.trim(), Collections.emptyList());
                            n10 = n12;
                            continue;
                        }
                        throw new s32("Incomplete vtt cue box header found.");
                    }
                    object2 = object;
                    if (object == null) {
                        object2 = "";
                    }
                    if (a12 != null) {
                        object = a12.a((CharSequence)object2).a();
                    } else {
                        object = qk2.a;
                        object = new qk2.d();
                        object.c = object2;
                        object = object.a().a();
                    }
                    arrayList.add((byte[])object);
                    continue;
                }
                this.m.f(n10 - 8);
                continue;
            }
            throw new s32("Incomplete Mp4Webvtt Top Level box header found.");
        }
        return new e21(arrayList);
    }
}


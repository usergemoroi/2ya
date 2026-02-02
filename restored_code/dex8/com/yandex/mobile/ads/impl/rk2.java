/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.nk2
 *  com.yandex.mobile.ads.impl.q32
 *  com.yandex.mobile.ads.impl.qk2
 *  com.yandex.mobile.ads.impl.sk2
 */
package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.nk2;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.qk2;
import com.yandex.mobile.ads.impl.s32;
import com.yandex.mobile.ads.impl.sk2;
import com.yandex.mobile.ads.impl.tk2;
import com.yandex.mobile.ads.impl.wy1;
import java.util.ArrayList;

public final class rk2
extends wy1 {
    private final bg1 m = new bg1();
    private final nk2 n = new nk2();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final q32 a(byte[] object, int n10, boolean bl2) throws s32 {
        String string2;
        Object object2;
        block13: {
            block12: {
                this.m.a(n10, (byte[])object);
                object = new ArrayList();
                object2 = this.m;
                n10 = sk2.a;
                n10 = object2.d();
                string2 = object2.j();
                if (string2 == null || !(bl2 = string2.startsWith("WEBVTT"))) break block12;
                while (!TextUtils.isEmpty((CharSequence)this.m.j())) {
                }
                break block13;
            }
            try {
                object2.e(n10);
                object = new StringBuilder("Expected WEBVTT. Got ");
                ((StringBuilder)object).append(object2.j());
                throw fg1.a((String)((StringBuilder)object).toString(), null);
            }
            catch (fg1 fg12) {
                throw new s32(fg12);
            }
        }
        object2 = new ArrayList();
        block4: while (true) {
            string2 = this.m;
            int n13 = 0;
            n10 = -1;
            while (n10 == -1) {
                n13 = string2.d();
                String string3 = string2.j();
                if (string3 == null) {
                    n10 = 0;
                    continue;
                }
                if ("STYLE".equals(string3)) {
                    n10 = 2;
                    continue;
                }
                if (string3.startsWith("NOTE")) {
                    n10 = 1;
                    continue;
                }
                n10 = 3;
            }
            string2.e(n13);
            if (n10 == 0) return new tk2((ArrayList)object2);
            if (n10 == 1) {
                string2 = this.m;
                while (true) {
                    if (TextUtils.isEmpty((CharSequence)string2.j())) continue block4;
                }
            }
            if (n10 == 2) {
                if (!((ArrayList)object2).isEmpty()) throw new s32("A style block was found after the first cue.");
                this.m.j();
                ((ArrayList)object).addAll(this.n.a(this.m));
                continue;
            }
            if (n10 != 3 || (string2 = qk2.a((bg1)this.m, (ArrayList)object)) == null) continue;
            ((ArrayList)object2).add(string2);
        }
    }
}


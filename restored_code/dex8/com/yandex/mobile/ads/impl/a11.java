/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.div.core.DivKit
 *  com.yandex.mobile.ads.impl.i11
 *  com.yandex.mobile.ads.impl.tb2
 *  com.yandex.mobile.ads.impl.v0
 *  com.yandex.mobile.ads.impl.xo0
 *  kotlin.jvm.functions.l
 */
package com.yandex.mobile.ads.impl;

import com.yandex.div.core.DivKit;
import com.yandex.mobile.ads.impl.i11;
import com.yandex.mobile.ads.impl.tb2;
import com.yandex.mobile.ads.impl.v0;
import com.yandex.mobile.ads.impl.xo0;
import kotlin.jvm.functions.l;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class a11
extends i11 {
    private final boolean a;
    @NotNull
    private final tb2 b;

    public a11(@NotNull tb2 tb22) {
        this.a = false;
        this.b = tb22;
    }

    protected final void a(@NotNull l<? super xo0, k0> l10) {
        Object object;
        Object object2;
        try {
            object2 = this.b;
            object = DivKit.Companion.getVersionName();
            object2.getClass();
            object2 = tb2.a((String)object);
            this.b.getClass();
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            String string2 = v0.a((Object[])new Object[0], (int)0, (String)"DivKit is unavailable. Please check your buildscripts for exclusion rules for 'com.yandex.div:div'", (String)"format(...)");
            l10.invoke((Object)new xo0(string2, string2));
            throw null;
        }
        object = tb2.a((String)"32.11.0");
        object = object != null ? Integer.valueOf(object.a()) : null;
        if (object != null) {
            int n10 = (Integer)object;
            if (object2 != null && (this.a || object2.a() == n10)) {
                return;
            }
            object2 = object2 != null ? Integer.valueOf(object2.a()) : null;
            object = v0.a((Object[])new Object[]{object, object2}, (int)2, (String)"Unsupported DivKit major version. Expected: %s. Actual: %s", (String)"format(...)");
            l10.invoke((Object)new xo0((String)object, (String)object));
            throw null;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.oq0
 *  com.yandex.mobile.ads.impl.v0
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.oq0;
import com.yandex.mobile.ads.impl.v0;
import kotlin.enums.b;
import kotlin.jvm.internal.z0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public final class di2
extends Enum<di2>
implements oq0 {
    public static final /* enum */ di2 c;
    public static final /* enum */ di2 d;
    public static final /* enum */ di2 e;
    private static final di2[] f;
    @NotNull
    private final String b;

    static {
        di2 di22;
        di2 di23;
        di2 di24;
        c = di24 = new di2("default");
        d = di23 = new di2("loading");
        e = di22 = new di2("hidden");
        Enum[] enumArray = new di2[]{di24, di23, di22};
        f = enumArray;
        kotlin.enums.b.a((Enum[])enumArray);
    }

    private di2(String string3) {
        this.b = string3;
    }

    public static di2 valueOf(String string2) {
        return Enum.valueOf(di2.class, string2);
    }

    public static di2[] values() {
        return (di2[])f.clone();
    }

    @NotNull
    public final String a() {
        String string2 = JSONObject.quote((String)this.b);
        z0 z02 = z0.a;
        return v0.a((Object[])new Object[]{string2}, (int)1, (String)"state: %s", (String)"format(...)");
    }
}


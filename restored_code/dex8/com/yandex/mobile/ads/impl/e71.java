/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.gj2
 *  com.yandex.mobile.ads.impl.hj
 *  com.yandex.mobile.ads.impl.j91
 *  com.yandex.mobile.ads.impl.lr1
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.tc1
 *  com.yandex.mobile.ads.impl.uc1
 *  com.yandex.mobile.ads.impl.w61
 *  kotlin.collections.s0
 *  org.json.JSONException
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.gj;
import com.yandex.mobile.ads.impl.gj2;
import com.yandex.mobile.ads.impl.hj;
import com.yandex.mobile.ads.impl.j91;
import com.yandex.mobile.ads.impl.lr1;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.tc1;
import com.yandex.mobile.ads.impl.uc1;
import com.yandex.mobile.ads.impl.w61;
import com.yandex.mobile.ads.impl.wp1;
import java.util.Map;
import kotlin.collections.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

public final class e71
implements lr1<a71> {
    @NotNull
    private final gj2 a;
    @NotNull
    private final j91 b;

    public /* synthetic */ e71(Context context, wp1 wp12) {
        this(tc1.a(), new j91(context, wp12));
    }

    public e71(@NotNull gj2 gj22, @NotNull j91 j912) {
        this.a = gj22;
        this.b = j912;
    }

    @Nullable
    public final a71 a(@NotNull String string2, @NotNull hj hj3) {
        try {
            string2 = this.b.a(string2, hj3);
            return string2;
        }
        catch (w61 w612) {
            int n10 = op0.b;
        }
        catch (JSONException jSONException) {
            int n12 = op0.b;
        }
        return null;
    }

    public final Object a(uc1 object) {
        String string2 = this.a.a(object);
        if (string2 != null && string2.length() != 0) {
            Map map2 = object.c;
            object = map2;
            if (map2 == null) {
                object = s0.j();
            }
            object = this.a(string2, new gj((Map)object));
        } else {
            object = null;
        }
        return object;
    }
}


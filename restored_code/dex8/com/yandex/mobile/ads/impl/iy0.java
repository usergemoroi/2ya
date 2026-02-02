/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.kx1
 *  com.yandex.mobile.ads.impl.kz0
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.y70
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.kx1;
import com.yandex.mobile.ads.impl.kz0;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.y70;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class iy0
implements y70 {
    @NotNull
    private final x2 a;
    @NotNull
    private final kx1 b;

    public /* synthetic */ iy0(x2 x22) {
        this(x22, new kx1());
    }

    public iy0(@NotNull x2 x22, @NotNull kx1 kx12) {
        this.a = x22;
        this.b = kx12;
    }

    @NotNull
    protected final x2 a() {
        return this.a;
    }

    @NotNull
    public Map<String, Object> a(@NotNull Context object) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        Object object2 = this.a.a();
        if (object2 != null) {
            Object object3 = object2.h();
            if (object3 != null) {
                linkedHashMap.putAll((Map<String, Object>)object3);
            }
            if ((object3 = object2.b()) != null) {
                linkedHashMap.put("age", object3);
            }
            if ((object3 = object2.d()) != null) {
                linkedHashMap.put("context_tags", object3);
            }
            if ((object2 = object2.e()) != null) {
                linkedHashMap.put("gender", object2);
            }
            int n10 = pw1.l;
            object2 = pw1.a.a().e();
            if (object2 != null) {
                linkedHashMap.put("age_restricted_user", object2);
            }
            if ((object2 = (object2 = pw1.a.a().a(object)) != null ? object2.t0() : null) != null) {
                linkedHashMap.put("user_consent", object2);
            }
        }
        object2 = this.a.e().a();
        boolean bl2 = this.b.b(object);
        if (object2 != null) {
            boolean bl3 = object2.b();
            object = object2.a();
            if (!bl2 && !bl3 && object != null) {
                linkedHashMap.put("google_aid", object);
            }
        }
        linkedHashMap.put("gms_available", this.a.j().c());
        linkedHashMap.put("sdk_version", "7.15.2");
        return linkedHashMap;
    }

    @NotNull
    public final Map<String, String> a(@NotNull kz0 kz02) {
        return kz02.i();
    }
}


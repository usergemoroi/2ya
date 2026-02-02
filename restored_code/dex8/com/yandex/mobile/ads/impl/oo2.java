/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.gp2
 *  com.yandex.mobile.ads.impl.nc0
 *  com.yandex.mobile.ads.impl.o8
 *  com.yandex.mobile.ads.impl.p8
 *  com.yandex.mobile.ads.impl.po2
 *  com.yandex.mobile.ads.impl.q8
 *  com.yandex.mobile.ads.impl.r8
 *  com.yandex.mobile.ads.impl.so2
 *  com.yandex.mobile.ads.impl.t8
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.gp2;
import com.yandex.mobile.ads.impl.nc0;
import com.yandex.mobile.ads.impl.o8;
import com.yandex.mobile.ads.impl.p8;
import com.yandex.mobile.ads.impl.po2;
import com.yandex.mobile.ads.impl.q8;
import com.yandex.mobile.ads.impl.r8;
import com.yandex.mobile.ads.impl.so2;
import com.yandex.mobile.ads.impl.t8;
import com.yandex.mobile.ads.impl.to2;
import com.yandex.mobile.ads.impl.vp2;
import com.yandex.mobile.ads.impl.xo2;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class oo2
extends o8 {
    private static final Pattern k = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final q8 a;
    private final p8 b;
    private final ArrayList c = new ArrayList();
    private so2 d;
    private t8 e;
    private boolean f = false;
    private boolean g = false;
    private final String h;
    private boolean i;
    private boolean j;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    oo2(p8 p84, q8 object) {
        void var2_4;
        this.b = p84;
        this.a = object;
        this.h = UUID.randomUUID().toString();
        this.d();
        if (object.a() != r8.c && object.a() != r8.e) {
            Map map2 = object.d();
            xo2 xo22 = new xo2(object.e(), map2);
        } else {
            to2 to22 = new to2(object.h());
        }
        this.e = var2_4;
        this.e.a();
        po2.a().a(this);
        this.e.a(p84);
    }

    private void d() {
        this.d = new so2(null);
    }

    public final void a() {
        if (this.g) {
            return;
        }
        this.d.clear();
        if (!this.g) {
            this.c.clear();
        }
        this.g = true;
        this.e.e();
        po2.a().c(this);
        this.e.b();
        this.e = null;
    }

    public final void a(View view) {
        if (this.g) {
            return;
        }
        if ((View)this.d.get() == view) {
            return;
        }
        this.d = new so2(view);
        this.e.g();
        Object object = po2.a().b();
        if (object != null && !object.isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                oo2 oo22 = (oo2)((Object)object.next());
                if (oo22 == this || (View)oo22.d.get() != view) continue;
                oo22.d.clear();
            }
        }
    }

    public final void a(View view, nc0 nc02, @Nullable String string2) {
        gp2 gp222;
        block7: {
            if (this.g) {
                return;
            }
            if (string2 != null) {
                if (string2.length() <= 50) {
                    if (!k.matcher(string2).matches()) {
                        throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
                    }
                } else {
                    throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
                }
            }
            for (gp2 gp222 : this.c) {
                if (gp222.a().get() != view) continue;
                break block7;
            }
            gp222 = null;
        }
        if (gp222 == null) {
            this.c.add(new gp2(view, nc02, string2));
        }
    }

    final void a(@NonNull JSONObject jSONObject) {
        if (!this.j) {
            this.e.a(jSONObject);
            this.j = true;
            return;
        }
        throw new IllegalStateException("Loaded event can only be sent once");
    }

    public final void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        po2.a().b(this);
        float f11 = vp2.a().d();
        this.e.a(f11);
        this.e.a(this, this.a);
    }

    public final ArrayList c() {
        return this.c;
    }

    final void e() {
        if (!this.i) {
            this.e.f();
            this.i = true;
            return;
        }
        throw new IllegalStateException("Impression event can only be sent once");
    }

    public final View f() {
        return (View)this.d.get();
    }

    public final boolean g() {
        boolean bl2 = this.f && !this.g;
        return bl2;
    }

    public final boolean h() {
        return this.f;
    }

    public final String i() {
        return this.h;
    }

    public final t8 j() {
        return this.e;
    }

    public final boolean k() {
        return this.g;
    }

    public final boolean l() {
        return this.b.b();
    }

    public final boolean m() {
        return this.b.c();
    }
}


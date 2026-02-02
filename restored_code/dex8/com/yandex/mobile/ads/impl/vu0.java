/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  com.monetization.ads.nativeads.CustomizableMediaView
 *  com.yandex.mobile.ads.impl.cx0$a
 *  com.yandex.mobile.ads.impl.gh2
 *  com.yandex.mobile.ads.impl.gi2
 *  com.yandex.mobile.ads.impl.jh2
 *  com.yandex.mobile.ads.impl.jj0
 *  com.yandex.mobile.ads.impl.q00
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.vh2
 *  com.yandex.mobile.ads.impl.wf
 *  com.yandex.mobile.ads.impl.zw0
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.cx0;
import com.yandex.mobile.ads.impl.gh2;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.jh2;
import com.yandex.mobile.ads.impl.jj0;
import com.yandex.mobile.ads.impl.q00;
import com.yandex.mobile.ads.impl.rj0;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.vh2;
import com.yandex.mobile.ads.impl.wf;
import com.yandex.mobile.ads.impl.zw0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class vu0
implements wf<zw0>,
q00<zw0> {
    @Nullable
    private final rj0 a;
    @Nullable
    private final cx0 b;

    public vu0(@Nullable rj0 rj02, @Nullable cx0 cx02) {
        this.a = rj02;
        this.b = cx02;
    }

    private static View a(gh2 object) {
        object = object != null ? object.b() : null;
        return object;
    }

    private static jj0 a(List list) {
        list = list != null && !list.isEmpty() ? (jj0)list.get(0) : null;
        return list;
    }

    public final void a() {
        gh2 gh22;
        ImageView imageView = (ImageView)vu0.a(this.a);
        if (imageView != null && (gh22 = this.a) != null) {
            gh22.a(imageView);
        }
        if ((imageView = (CustomizableMediaView)vu0.a(this.b)) != null && (gh22 = this.b) != null) {
            gh22.a((View)imageView);
        }
    }

    public final void a(@NotNull vf<zw0> vf3, @NotNull jh2 jh22) {
        zw0 zw02 = (zw0)vf3.d();
        gh2 gh22 = this.a;
        if (gh22 != null) {
            gh22.a(vf3, jh22, (Object)vu0.a(zw02.a()));
        }
        if ((gh22 = this.b) != null) {
            gh22.a(vf3, jh22, (Object)zw02);
        }
    }

    public final boolean a(Object object) {
        object = (zw0)object;
        rj0 rj02 = this.a;
        Object object2 = vu0.a(object.a());
        View view = vu0.a(rj02);
        boolean bl2 = false;
        boolean bl3 = view != null && object2 != null && rj02 != null && rj02.a(view, object2);
        object2 = this.b;
        rj02 = vu0.a((gh2)object2);
        boolean bl4 = rj02 != null && object2 != null && object2.a((View)rj02, object);
        if (bl3 || bl4) {
            bl2 = true;
        }
        return bl2;
    }

    public final void b(Object object) {
        object = (zw0)object;
        Object object2 = vu0.a(object.a());
        ImageView imageView = (ImageView)vu0.a(this.a);
        if (imageView != null && object2 != null) {
            rj0 rj02 = this.a;
            if (rj02 != null) {
                rj02.a((jj0)object2);
            }
            imageView.setVisibility(0);
        }
        if ((imageView = (CustomizableMediaView)vu0.a(this.b)) != null) {
            object2 = this.b;
            if (object2 != null) {
                object2.a((zw0)object);
            }
            imageView.setVisibility(0);
        }
    }

    public final boolean b() {
        gh2 gh22 = this.b;
        boolean bl2 = gh22 != null && gh22.b() != null || (gh22 = this.a) != null && gh22.b() != null;
        return bl2;
    }

    @Nullable
    public final vh2 c() {
        Object object = (CustomizableMediaView)vu0.a(this.b);
        ImageView imageView = (ImageView)vu0.a(this.a);
        object = object != null ? new vh2(object.getWidth(), object.getHeight()) : (imageView != null ? new vh2(imageView.getWidth(), imageView.getHeight()) : null);
        return object;
    }

    public final void c(Object object) {
        object = (zw0)object;
        Object object2 = vu0.a(object.a());
        ImageView imageView = (ImageView)vu0.a(this.a);
        if (imageView != null && object2 != null) {
            rj0 rj02 = this.a;
            if (rj02 != null) {
                rj02.a((jj0)object2);
            }
            imageView.setVisibility(0);
        }
        if ((imageView = (CustomizableMediaView)vu0.a(this.b)) != null) {
            object2 = this.b;
            if (object2 != null) {
                object2.a((CustomizableMediaView)imageView, (zw0)object);
            }
            imageView.setVisibility(0);
        }
    }

    public final boolean d() {
        gh2 gh22 = this.b;
        boolean bl2 = false;
        boolean bl3 = gh22 != null && gi2.a((View)gh22.b(), (int)100);
        gh22 = this.a;
        boolean bl4 = gh22 != null && gi2.a((View)gh22.b(), (int)100);
        if (bl3 || bl4) {
            bl2 = true;
        }
        return bl2;
    }

    public final void destroy() {
        cx0 cx02 = this.b;
        if (cx02 != null) {
            cx02.a();
        }
    }

    public final boolean e() {
        gh2 gh22 = this.b;
        boolean bl2 = true;
        if (!(gh22 != null && gh22.c() || (gh22 = this.a) != null && gh22.c())) {
            bl2 = false;
        }
        return bl2;
    }

    @Nullable
    public final cx0.a f() {
        cx0 cx02;
        block3: {
            block2: {
                cx02 = this.b;
                if (cx02 == null) break block2;
                cx0.a a14 = cx02.d();
                cx02 = a14;
                if (a14 != null) break block3;
            }
            cx02 = this.a != null ? cx0.a.f : null;
        }
        return cx02;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.a72
 *  com.yandex.mobile.ads.impl.b92
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.ed1
 *  com.yandex.mobile.ads.impl.f72
 *  com.yandex.mobile.ads.impl.kq1
 *  com.yandex.mobile.ads.impl.kq1$a
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.sp1$b
 *  com.yandex.mobile.ads.impl.uc1
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.yp1
 *  com.yandex.mobile.ads.impl.z82
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.a72;
import com.yandex.mobile.ads.impl.ak;
import com.yandex.mobile.ads.impl.b92;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.ed1;
import com.yandex.mobile.ads.impl.f72;
import com.yandex.mobile.ads.impl.kh1;
import com.yandex.mobile.ads.impl.kq1;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.uc1;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.yp1;
import com.yandex.mobile.ads.impl.z82;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.jvm.internal.y;
import kotlin.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lh1
implements b92 {
    @NotNull
    private final f72 a;
    @NotNull
    private final a72 b;
    @NotNull
    private final kq1 c;
    @NotNull
    private final z82 d;
    @NotNull
    private final Context e;

    public lh1(@NotNull Context context, @NotNull f72 f722, @NotNull a72 a722, @NotNull kq1 kq12, @NotNull z82 z822) {
        this.a = f722;
        this.b = a722;
        this.c = kq12;
        this.d = z822;
        this.e = context.getApplicationContext();
    }

    public /* synthetic */ lh1(Context context, x2 x22, f72 f722) {
        x22 = new a72(context, x22);
        int n10 = kq1.c;
        this(context, f722, (a72)x22, kq1.a.a(), new z82(context));
    }

    public final void a(@NotNull String string2) {
        String string3 = this.d.a(string2);
        int n10 = pw1.l;
        Object object = pw1.a.a().a(this.e);
        object = new kh1(this.e, string3, (ak.a<uc1>)new a(string2, (ou1)object, this.b, this.a));
        string2 = this.c;
        string3 = this.e;
        synchronized (string2) {
            ed1.a((Context)string3).a((yp1)object);
            return;
        }
    }

    private static final class a
    implements ak.a<uc1> {
        @Nullable
        private final ou1 a;
        @NotNull
        private final a72 b;
        @NotNull
        private final f72 c;

        public a(@NotNull String string2, @Nullable ou1 ou12, @NotNull a72 a722, @NotNull f72 f722) {
            this.a = ou12;
            this.b = a722;
            this.c = f722;
        }

        public final void a(@NotNull dj2 object) {
            object.getClass();
            int n10 = op0.b;
            a72 a722 = z.a("tracking_result", "failure");
            Object object2 = this.c.name().toLowerCase(Locale.ROOT);
            y.i(object2, "toLowerCase(...)");
            t<String, String> t13 = z.a("tracking_url_type", object2);
            object2 = object.getMessage();
            object = object2;
            if (object2 == null) {
                object = "Unknown Volley error";
            }
            object2 = s0.o((t[])new t[]{a722, t13, z.a("error_message", object)});
            a722 = this.b;
            object = sp1.b.c;
            a722.a((Map)object2, this.a);
        }

        public final void a(Object object) {
            int n10 = ((uc1)object).a;
            int n13 = op0.b;
            a72 a722 = z.a("tracking_result", "success");
            object = this.c.name().toLowerCase(Locale.ROOT);
            y.i(object, "toLowerCase(...)");
            Map map2 = s0.o((t[])new t[]{a722, z.a("tracking_url_type", object), z.a("code", n10)});
            a722 = this.b;
            object = sp1.b.c;
            a722.a(map2, this.a);
        }
    }
}


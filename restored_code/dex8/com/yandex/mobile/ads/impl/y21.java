/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.og0
 *  com.yandex.mobile.ads.impl.v21
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n21;
import com.yandex.mobile.ads.impl.og0;
import com.yandex.mobile.ads.impl.s21;
import com.yandex.mobile.ads.impl.v21;
import com.yandex.mobile.ads.impl.vj;
import com.yandex.mobile.ads.impl.zf1;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public class y21
extends vj {
    @NotNull
    private final n21 b;

    @JvmOverloads
    public y21(@NotNull zf1 zf12, @NotNull a a14, @NotNull n21 n212) {
        super(zf12);
        this.b = n212;
        n212.a(a14);
    }

    @Override
    public final void a(@NotNull og0 og02) {
        super.a(new s21(this.b, og02));
    }

    @Override
    public final void a(@NotNull String string2) {
        this.b.a(string2);
    }

    @NotNull
    public final n21 b() {
        return this.b;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.b.a();
    }

    public static final class a
    implements v21 {
        @NotNull
        private final WeakReference<og0> a;

        public /* synthetic */ a(og0 og02) {
            this(new WeakReference<og0>(og02));
        }

        @JvmOverloads
        public a(@NotNull WeakReference weakReference) {
            this.a = weakReference;
        }

        public final void a() {
            og0 og02 = (og0)this.a.get();
            if (og02 != null) {
                og02.a();
            }
        }

        public final void a(@NotNull zf1 zf12, @NotNull Map map2) {
            og0 og02 = (og0)this.a.get();
            if (og02 != null) {
                og02.a(zf12, map2);
            }
        }

        public final void a(@NotNull String string2) {
            og0 og02 = (og0)this.a.get();
            if (og02 != null) {
                og02.a(string2);
            }
        }
    }
}


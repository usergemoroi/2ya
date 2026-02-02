/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.CheckBox
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  com.yandex.mobile.ads.impl.bv
 *  com.yandex.mobile.ads.impl.g81
 *  com.yandex.mobile.ads.impl.m71$a
 *  com.yandex.mobile.ads.impl.ng
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.bv;
import com.yandex.mobile.ads.impl.g81;
import com.yandex.mobile.ads.impl.m71;
import com.yandex.mobile.ads.impl.ng;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class m71
implements ng {
    @Nullable
    private final CheckBox a;
    @Nullable
    private final ProgressBar b;
    @NotNull
    private final View c;
    @NotNull
    private final Map<String, View> d;
    @NotNull
    private final g81 e;
    @NotNull
    private List<bv> f;
    @Nullable
    private final ImageView g;

    public m71(@NotNull a a13) {
        this.a = a13.d();
        this.b = a13.g();
        this.c = a13.e();
        this.d = a13.a();
        this.e = a13.f();
        this.f = a13.b();
        this.g = a13.c();
    }

    @NotNull
    public final List<bv> a() {
        return this.f;
    }

    @Deprecated(message="")
    @Nullable
    public final ImageView b() {
        return this.g;
    }

    @Nullable
    public final CheckBox c() {
        return this.a;
    }

    @NotNull
    public final View d() {
        return this.c;
    }

    @NotNull
    public final g81 e() {
        return this.e;
    }

    @Nullable
    public final ProgressBar f() {
        return this.b;
    }

    @Nullable
    public final View getAssetView(@NotNull String string2) {
        return this.d.get("close_button");
    }

    @NotNull
    public final Map<String, View> getAssetViews() {
        return this.d;
    }
}


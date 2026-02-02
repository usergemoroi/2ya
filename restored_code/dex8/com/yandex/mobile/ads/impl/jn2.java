/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.gt
 *  com.yandex.mobile.ads.impl.jt
 *  com.yandex.mobile.ads.impl.nt
 *  com.yandex.mobile.ads.nativeads.NativeAdAssets
 *  com.yandex.mobile.ads.nativeads.NativeAdImage
 *  com.yandex.mobile.ads.nativeads.NativeAdMedia
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gt;
import com.yandex.mobile.ads.impl.jt;
import com.yandex.mobile.ads.impl.ln2;
import com.yandex.mobile.ads.impl.nt;
import com.yandex.mobile.ads.impl.on2;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class jn2
implements NativeAdAssets {
    @NotNull
    private final gt a;

    public jn2(@NotNull gt gt3) {
        this.a = gt3;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof jn2)) {
            return false;
        }
        object = (jn2)object;
        return y.e(this.a, ((jn2)object).a);
    }

    @Nullable
    public final String getAge() {
        return this.a.a();
    }

    @Nullable
    public final String getBody() {
        return this.a.b();
    }

    @Nullable
    public final String getCallToAction() {
        return this.a.c();
    }

    @Nullable
    public final String getDomain() {
        return this.a.d();
    }

    @Nullable
    public final NativeAdImage getFavicon() {
        Object object = this.a.e();
        object = object != null ? new ln2((jt)object) : null;
        return object;
    }

    @Nullable
    public final NativeAdImage getIcon() {
        Object object = this.a.g();
        object = object != null ? new ln2((jt)object) : null;
        return object;
    }

    @Nullable
    public final NativeAdImage getImage() {
        Object object = this.a.h();
        object = object != null ? new ln2((jt)object) : null;
        return object;
    }

    @Nullable
    public final NativeAdMedia getMedia() {
        Object object = this.a.i();
        object = object != null ? new on2((nt)object) : null;
        return object;
    }

    @Nullable
    public final String getPrice() {
        return this.a.j();
    }

    @Nullable
    public final Float getRating() {
        return this.a.k();
    }

    @Nullable
    public final String getReviewCount() {
        return this.a.l();
    }

    @Nullable
    public final String getSponsored() {
        return this.a.m();
    }

    @Nullable
    public final String getTitle() {
        return this.a.n();
    }

    @Nullable
    public final String getWarning() {
        return this.a.o();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean isFeedbackAvailable() {
        return this.a.f();
    }

    @NotNull
    public final String toString() {
        gt gt3 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("YandexNativeAdAssetsAdapter(assets=");
        stringBuilder.append(gt3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}


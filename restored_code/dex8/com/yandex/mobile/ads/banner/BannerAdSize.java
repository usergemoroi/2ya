/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.banner.BannerAdSize$a
 *  com.yandex.mobile.ads.impl.il1
 *  com.yandex.mobile.ads.impl.iz1
 */
package com.yandex.mobile.ads.banner;

import android.content.Context;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.impl.il1;
import com.yandex.mobile.ads.impl.iz1;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\t\u0010\u0006J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0010\u00a8\u0006\u001b"}, d2={"Lcom/yandex/mobile/ads/banner/BannerAdSize;", "Lcom/yandex/mobile/ads/impl/il1;", "Landroid/content/Context;", "context", "", "getHeightInPixels", "(Landroid/content/Context;)I", "getWidthInPixels", "getHeight", "getWidth", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "height", "width", "Lcom/yandex/mobile/ads/impl/iz1;", "sizeInfo", "<init>", "(Lcom/yandex/mobile/ads/impl/iz1;)V", "a", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
public final class BannerAdSize
extends il1 {
    @NotNull
    public static final a a = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private final iz1 b;

    public BannerAdSize(@NotNull iz1 iz12) {
        this.b = iz12;
    }

    @JvmStatic
    @NotNull
    public static final BannerAdSize fixedSize(@NotNull Context context, int n10, int n12) {
        return a.fixedSize(context, n10, n12);
    }

    @JvmStatic
    @NotNull
    public static final BannerAdSize inlineSize(@NotNull Context context, int n10, int n12) {
        return a.inlineSize(context, n10, n12);
    }

    @JvmStatic
    @NotNull
    public static final BannerAdSize stickySize(@NotNull Context context, int n10) {
        return a.stickySize(context, n10);
    }

    @NotNull
    protected final iz1 a() {
        return this.b;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && y.e(BannerAdSize.class, object.getClass())) {
            object = (BannerAdSize)((Object)object);
            return y.e(this.b, ((BannerAdSize)((Object)object)).b);
        }
        return false;
    }

    public final int getHeight() {
        return this.b.getHeight();
    }

    public final int getHeight(@NotNull Context context) {
        return this.b.a(context);
    }

    public final int getHeightInPixels(@NotNull Context context) {
        return this.b.b(context);
    }

    public final int getWidth() {
        return this.b.getWidth();
    }

    public final int getWidth(@NotNull Context context) {
        return this.b.c(context);
    }

    public final int getWidthInPixels(@NotNull Context context) {
        return this.b.d(context);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    @NotNull
    public String toString() {
        return this.b.toString();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.yandex.mobile.ads.impl.fa1
 *  com.yandex.mobile.ads.impl.ha1
 *  com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance$a
 */
package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.fa1;
import com.yandex.mobile.ads.impl.ha1;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001(J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u00d6\u0001\u00a2\u0006\u0004\b\u000b\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u00d6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u001a\u0010!\u001a\u00020\b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\nR\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\u00a8\u0006)"}, d2={"Lcom/yandex/mobile/ads/nativeads/template/appearance/BannerAppearance;", "Landroid/os/Parcelable;", "Lcom/yandex/mobile/ads/impl/fa1;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/k0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yandex/mobile/ads/nativeads/template/HorizontalOffset;", "b", "Lcom/yandex/mobile/ads/nativeads/template/HorizontalOffset;", "getContentPadding", "()Lcom/yandex/mobile/ads/nativeads/template/HorizontalOffset;", "contentPadding", "c", "getImageMargins", "imageMargins", "d", "I", "getBackgroundColor", "backgroundColor", "e", "getBorderColor", "borderColor", "", "f", "F", "getBorderWidth", "()F", "borderWidth", "Builder", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
@Parcelize
public final class BannerAppearance
implements Parcelable,
fa1 {
    @NotNull
    public static final Parcelable.Creator<BannerAppearance> CREATOR = new a();
    @Nullable
    private final HorizontalOffset b;
    @Nullable
    private final HorizontalOffset c;
    private final int d;
    private final int e;
    private final float f;

    private BannerAppearance(HorizontalOffset horizontalOffset, HorizontalOffset horizontalOffset2, int n10, int n13, float f11) {
        this.b = horizontalOffset;
        this.c = horizontalOffset2;
        this.d = n10;
        this.e = n13;
        this.f = f11;
    }

    public /* synthetic */ BannerAppearance(HorizontalOffset horizontalOffset, HorizontalOffset horizontalOffset2, int n10, int n13, float f11, p p14) {
        this(horizontalOffset, horizontalOffset2, n10, n13, f11);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        Class<?> clazz = object != null ? object.getClass() : null;
        if (!y.e(BannerAppearance.class, clazz)) {
            return false;
        }
        y.h(object, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance");
        object = (BannerAppearance)object;
        if (!y.e(this.getContentPadding(), ((BannerAppearance)object).getContentPadding())) {
            return false;
        }
        if (!y.e(this.getImageMargins(), ((BannerAppearance)object).getImageMargins())) {
            return false;
        }
        if (this.getBackgroundColor() != ((BannerAppearance)object).getBackgroundColor()) {
            return false;
        }
        if (this.getBorderColor() != ((BannerAppearance)object).getBorderColor()) {
            return false;
        }
        if (this.getBorderWidth() != ((BannerAppearance)object).getBorderWidth()) {
            bl2 = false;
        }
        return bl2;
    }

    public int getBackgroundColor() {
        return this.d;
    }

    public int getBorderColor() {
        return this.e;
    }

    public float getBorderWidth() {
        return this.f;
    }

    @Nullable
    public HorizontalOffset getContentPadding() {
        return this.b;
    }

    @Nullable
    public HorizontalOffset getImageMargins() {
        return this.c;
    }

    public int hashCode() {
        ha1 ha12 = this.getContentPadding();
        int n10 = 0;
        int n13 = ha12 != null ? ha12.hashCode() : 0;
        ha12 = this.getImageMargins();
        if (ha12 != null) {
            n10 = ha12.hashCode();
        }
        int n14 = this.getBackgroundColor();
        int n15 = this.getBorderColor();
        return Float.floatToIntBits(this.getBorderWidth()) + (n15 + (n14 + (n13 * 31 + n10) * 31) * 31) * 31;
    }

    public void writeToParcel(@NotNull Parcel parcel, int n10) {
        HorizontalOffset horizontalOffset = this.b;
        if (horizontalOffset == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            horizontalOffset.writeToParcel(parcel, n10);
        }
        horizontalOffset = this.c;
        if (horizontalOffset == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            horizontalOffset.writeToParcel(parcel, n10);
        }
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f);
    }
}


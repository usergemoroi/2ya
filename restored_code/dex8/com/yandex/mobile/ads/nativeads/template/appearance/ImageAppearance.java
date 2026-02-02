/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.yandex.mobile.ads.impl.ia1
 *  com.yandex.mobile.ads.impl.ka1
 *  com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance$a
 */
package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.ia1;
import com.yandex.mobile.ads.impl.ka1;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u00d6\u0001\u00a2\u0006\u0004\b\u000b\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u00d6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0019"}, d2={"Lcom/yandex/mobile/ads/nativeads/template/appearance/ImageAppearance;", "Landroid/os/Parcelable;", "Lcom/yandex/mobile/ads/impl/ia1;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/k0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yandex/mobile/ads/nativeads/template/SizeConstraint;", "b", "Lcom/yandex/mobile/ads/nativeads/template/SizeConstraint;", "getWidthConstraint", "()Lcom/yandex/mobile/ads/nativeads/template/SizeConstraint;", "widthConstraint", "Builder", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
@Parcelize
public final class ImageAppearance
implements Parcelable,
ia1 {
    @NotNull
    public static final Parcelable.Creator<ImageAppearance> CREATOR = new a();
    @Nullable
    private final SizeConstraint b;

    private ImageAppearance(SizeConstraint sizeConstraint) {
        this.b = sizeConstraint;
    }

    public /* synthetic */ ImageAppearance(SizeConstraint sizeConstraint, p p14) {
        this(sizeConstraint);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        Class<?> clazz = object != null ? object.getClass() : null;
        if (!y.e(ImageAppearance.class, clazz)) {
            return false;
        }
        y.h(object, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance");
        object = (ImageAppearance)object;
        return y.e(this.getWidthConstraint(), ((ImageAppearance)object).getWidthConstraint());
    }

    @Nullable
    public SizeConstraint getWidthConstraint() {
        return this.b;
    }

    public int hashCode() {
        ka1 ka12 = this.getWidthConstraint();
        int n10 = ka12 != null ? ka12.hashCode() : 0;
        return n10;
    }

    public void writeToParcel(@NotNull Parcel parcel, int n10) {
        SizeConstraint sizeConstraint = this.b;
        if (sizeConstraint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sizeConstraint.writeToParcel(parcel, n10);
        }
    }
}


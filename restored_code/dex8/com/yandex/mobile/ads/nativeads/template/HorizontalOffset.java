/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.yandex.mobile.ads.impl.ha1
 *  com.yandex.mobile.ads.nativeads.template.HorizontalOffset$a
 */
package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.ha1;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u0015\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bH\u00d6\u0001\u00a2\u0006\u0004\b\u000e\u0010\nJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u00d6\u0001\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00158\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\u00a8\u0006 "}, d2={"Lcom/yandex/mobile/ads/nativeads/template/HorizontalOffset;", "Lcom/yandex/mobile/ads/impl/ha1;", "Landroid/os/Parcelable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/k0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "b", "F", "getLeft", "()F", "left", "c", "getRight", "right", "<init>", "(FF)V", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
@Parcelize
public final class HorizontalOffset
implements ha1,
Parcelable {
    @NotNull
    public static final Parcelable.Creator<HorizontalOffset> CREATOR = new a();
    private final float b;
    private final float c;

    public HorizontalOffset(float f11, float f12) {
        this.b = f11;
        this.c = f12;
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
        if (!y.e(HorizontalOffset.class, clazz)) {
            return false;
        }
        y.h(object, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.HorizontalOffset");
        object = (HorizontalOffset)object;
        if (this.getLeft() == ((HorizontalOffset)object).getLeft()) {
            if (this.getRight() != ((HorizontalOffset)object).getRight()) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public float getLeft() {
        return this.b;
    }

    public float getRight() {
        return this.c;
    }

    public int hashCode() {
        int n10 = Float.floatToIntBits(this.getLeft());
        return Float.floatToIntBits(this.getRight()) + n10 * 31;
    }

    @NotNull
    public String toString() {
        float f11 = this.getLeft();
        float f12 = this.getRight();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f11);
        stringBuilder.append(", ");
        stringBuilder.append(f12);
        return stringBuilder.toString();
    }

    public void writeToParcel(@NotNull Parcel parcel, int n10) {
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
    }
}


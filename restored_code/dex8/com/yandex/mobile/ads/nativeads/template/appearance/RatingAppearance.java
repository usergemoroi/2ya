/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.yandex.mobile.ads.impl.ja1
 *  com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance$a
 */
package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.ja1;
import com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u00d6\u0001\u00a2\u0006\u0004\b\u000b\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u00d6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001a\u0010\u0018\u001a\u00020\b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\n\u00a8\u0006\u001a"}, d2={"Lcom/yandex/mobile/ads/nativeads/template/appearance/RatingAppearance;", "Landroid/os/Parcelable;", "Lcom/yandex/mobile/ads/impl/ja1;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/k0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "I", "getBackgroundStarColor", "backgroundStarColor", "c", "getProgressStarColor", "progressStarColor", "Builder", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
@Parcelize
public final class RatingAppearance
implements Parcelable,
ja1 {
    @NotNull
    public static final Parcelable.Creator<RatingAppearance> CREATOR = new a();
    private final int b;
    private final int c;

    private RatingAppearance(int n10, int n13) {
        this.b = n10;
        this.c = n13;
    }

    public /* synthetic */ RatingAppearance(int n10, int n13, p p14) {
        this(n10, n13);
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
        if (!y.e(RatingAppearance.class, clazz)) {
            return false;
        }
        y.h(object, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance");
        object = (RatingAppearance)object;
        if (this.getBackgroundStarColor() != ((RatingAppearance)object).getBackgroundStarColor()) {
            return false;
        }
        if (this.getProgressStarColor() != ((RatingAppearance)object).getProgressStarColor()) {
            bl2 = false;
        }
        return bl2;
    }

    public int getBackgroundStarColor() {
        return this.b;
    }

    public int getProgressStarColor() {
        return this.c;
    }

    public int hashCode() {
        int n10 = this.getBackgroundStarColor();
        return this.getProgressStarColor() + n10 * 31;
    }

    public void writeToParcel(@NotNull Parcel parcel, int n10) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}


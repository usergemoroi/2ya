/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.yandex.mobile.ads.impl.la1
 *  com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance$a
 */
package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.la1;
import com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001%J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u00d6\u0001\u00a2\u0006\u0004\b\u000b\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u00d6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\nR\u001c\u0010$\u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\u00a8\u0006&"}, d2={"Lcom/yandex/mobile/ads/nativeads/template/appearance/TextAppearance;", "Landroid/os/Parcelable;", "Lcom/yandex/mobile/ads/impl/la1;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/k0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "I", "getTextColor", "textColor", "", "c", "F", "getTextSize", "()F", "textSize", "d", "getFontStyle", "fontStyle", "", "e", "Ljava/lang/String;", "getFontFamilyName", "()Ljava/lang/String;", "fontFamilyName", "Builder", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
@Parcelize
public final class TextAppearance
implements Parcelable,
la1 {
    @NotNull
    public static final Parcelable.Creator<TextAppearance> CREATOR = new a();
    private final int b;
    private final float c;
    private final int d;
    @Nullable
    private final String e;

    private TextAppearance(int n10, float f11, int n13, String string2) {
        this.b = n10;
        this.c = f11;
        this.d = n13;
        this.e = string2;
    }

    public /* synthetic */ TextAppearance(int n10, float f11, int n13, String string2, p p14) {
        this(n10, f11, n13, string2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        Class<?> clazz = object != null ? object.getClass() : null;
        if (!y.e(TextAppearance.class, clazz)) {
            return false;
        }
        y.h(object, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance");
        object = (TextAppearance)object;
        if (this.getTextColor() != ((TextAppearance)object).getTextColor()) {
            return false;
        }
        if (this.getTextSize() == ((TextAppearance)object).getTextSize()) {
            if (this.getFontStyle() != ((TextAppearance)object).getFontStyle()) {
                return false;
            }
            return y.e(this.getFontFamilyName(), ((TextAppearance)object).getFontFamilyName());
        }
        return false;
    }

    @Nullable
    public String getFontFamilyName() {
        return this.e;
    }

    public int getFontStyle() {
        return this.d;
    }

    public int getTextColor() {
        return this.b;
    }

    public float getTextSize() {
        return this.c;
    }

    public int hashCode() {
        int n10 = this.getTextColor();
        int n13 = Float.floatToIntBits(this.getTextSize());
        int n14 = this.getFontStyle();
        String string2 = this.getFontFamilyName();
        int n15 = string2 != null ? string2.hashCode() : 0;
        return (n14 + (n13 + n10 * 31) * 31) * 31 + n15;
    }

    public void writeToParcel(@NotNull Parcel parcel, int n10) {
        parcel.writeInt(this.b);
        parcel.writeFloat(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
    }
}


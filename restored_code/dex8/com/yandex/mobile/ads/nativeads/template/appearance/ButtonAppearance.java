/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.yandex.mobile.ads.impl.ga1
 *  com.yandex.mobile.ads.impl.la1
 *  com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance$a
 */
package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.ga1;
import com.yandex.mobile.ads.impl.la1;
import com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001(J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u00d6\u0001\u00a2\u0006\u0004\b\u000b\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u00d6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\u00020\b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\nR\u001a\u0010'\u001a\u00020\b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\n\u00a8\u0006)"}, d2={"Lcom/yandex/mobile/ads/nativeads/template/appearance/ButtonAppearance;", "Landroid/os/Parcelable;", "Lcom/yandex/mobile/ads/impl/ga1;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/k0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yandex/mobile/ads/nativeads/template/appearance/TextAppearance;", "b", "Lcom/yandex/mobile/ads/nativeads/template/appearance/TextAppearance;", "getTextAppearance", "()Lcom/yandex/mobile/ads/nativeads/template/appearance/TextAppearance;", "textAppearance", "c", "I", "getBorderColor", "borderColor", "", "d", "F", "getBorderWidth", "()F", "borderWidth", "e", "getNormalColor", "normalColor", "f", "getPressedColor", "pressedColor", "Builder", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
@Parcelize
public final class ButtonAppearance
implements Parcelable,
ga1 {
    @NotNull
    public static final Parcelable.Creator<ButtonAppearance> CREATOR = new a();
    @Nullable
    private final TextAppearance b;
    private final int c;
    private final float d;
    private final int e;
    private final int f;

    private ButtonAppearance(TextAppearance textAppearance, int n10, float f11, int n13, int n14) {
        this.b = textAppearance;
        this.c = n10;
        this.d = f11;
        this.e = n13;
        this.f = n14;
    }

    public /* synthetic */ ButtonAppearance(TextAppearance textAppearance, int n10, float f11, int n13, int n14, p p14) {
        this(textAppearance, n10, f11, n13, n14);
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
        if (!y.e(ButtonAppearance.class, clazz)) {
            return false;
        }
        y.h(object, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance");
        object = (ButtonAppearance)object;
        if (!y.e(this.getTextAppearance(), ((ButtonAppearance)object).getTextAppearance())) {
            return false;
        }
        if (this.getBorderColor() != ((ButtonAppearance)object).getBorderColor()) {
            return false;
        }
        if (this.getBorderWidth() == ((ButtonAppearance)object).getBorderWidth()) {
            if (this.getNormalColor() != ((ButtonAppearance)object).getNormalColor()) {
                return false;
            }
            if (this.getPressedColor() != ((ButtonAppearance)object).getPressedColor()) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public int getBorderColor() {
        return this.c;
    }

    public float getBorderWidth() {
        return this.d;
    }

    public int getNormalColor() {
        return this.e;
    }

    public int getPressedColor() {
        return this.f;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.b;
    }

    public int hashCode() {
        la1 la12 = this.getTextAppearance();
        int n10 = la12 != null ? la12.hashCode() : 0;
        int n13 = this.getBorderColor();
        int n14 = Float.floatToIntBits(this.getBorderWidth());
        int n15 = this.getNormalColor();
        return this.getPressedColor() + (n15 + (n14 + (n13 + n10 * 31) * 31) * 31) * 31;
    }

    public void writeToParcel(@NotNull Parcel parcel, int n10) {
        TextAppearance textAppearance = this.b;
        if (textAppearance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textAppearance.writeToParcel(parcel, n10);
        }
        parcel.writeInt(this.c);
        parcel.writeFloat(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }
}


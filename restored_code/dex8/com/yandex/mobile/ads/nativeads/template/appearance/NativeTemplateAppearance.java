/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.yandex.mobile.ads.impl.vt
 *  com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance$a
 */
package com.yandex.mobile.ads.nativeads.template.appearance;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.vt;
import com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001EJ\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u00d6\u0001\u00a2\u0006\u0004\b\u000b\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u00d6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\u00020\u00188\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010#\u001a\u00020\u00188\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001a\u0010&\u001a\u00020\u00188\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u001a\u0010)\u001a\u00020\u00188\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001cR\u001a\u0010,\u001a\u00020\u00188\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010\u001cR\u001a\u0010/\u001a\u00020\u00188\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010\u001cR\u001a\u00105\u001a\u0002008\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00108\u001a\u0002008\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R\u001a\u0010>\u001a\u0002098\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010D\u001a\u00020?8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\u00a8\u0006F"}, d2={"Lcom/yandex/mobile/ads/nativeads/template/appearance/NativeTemplateAppearance;", "Landroid/os/Parcelable;", "Lcom/yandex/mobile/ads/impl/vt;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/k0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yandex/mobile/ads/nativeads/template/appearance/BannerAppearance;", "b", "Lcom/yandex/mobile/ads/nativeads/template/appearance/BannerAppearance;", "getBannerAppearance", "()Lcom/yandex/mobile/ads/nativeads/template/appearance/BannerAppearance;", "bannerAppearance", "Lcom/yandex/mobile/ads/nativeads/template/appearance/TextAppearance;", "c", "Lcom/yandex/mobile/ads/nativeads/template/appearance/TextAppearance;", "getAgeAppearance", "()Lcom/yandex/mobile/ads/nativeads/template/appearance/TextAppearance;", "ageAppearance", "d", "getBodyAppearance", "bodyAppearance", "e", "getDomainAppearance", "domainAppearance", "f", "getReviewCountAppearance", "reviewCountAppearance", "g", "getSponsoredAppearance", "sponsoredAppearance", "h", "getTitleAppearance", "titleAppearance", "i", "getWarningAppearance", "warningAppearance", "Lcom/yandex/mobile/ads/nativeads/template/appearance/ImageAppearance;", "j", "Lcom/yandex/mobile/ads/nativeads/template/appearance/ImageAppearance;", "getFaviconAppearance", "()Lcom/yandex/mobile/ads/nativeads/template/appearance/ImageAppearance;", "faviconAppearance", "k", "getImageAppearance", "imageAppearance", "Lcom/yandex/mobile/ads/nativeads/template/appearance/ButtonAppearance;", "l", "Lcom/yandex/mobile/ads/nativeads/template/appearance/ButtonAppearance;", "getCallToActionAppearance", "()Lcom/yandex/mobile/ads/nativeads/template/appearance/ButtonAppearance;", "callToActionAppearance", "Lcom/yandex/mobile/ads/nativeads/template/appearance/RatingAppearance;", "m", "Lcom/yandex/mobile/ads/nativeads/template/appearance/RatingAppearance;", "getRatingAppearance", "()Lcom/yandex/mobile/ads/nativeads/template/appearance/RatingAppearance;", "ratingAppearance", "Builder", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
@Parcelize
public final class NativeTemplateAppearance
implements Parcelable,
vt {
    @NotNull
    public static final Parcelable.Creator<NativeTemplateAppearance> CREATOR = new a();
    private static final int n = Color.parseColor((String)"#7f7f7f");
    private static final int o = Color.parseColor((String)"#ffd200");
    private static final int p = Color.parseColor((String)"#ffd200");
    private static final int q = Color.parseColor((String)"#f4c900");
    @NotNull
    private final BannerAppearance b;
    @NotNull
    private final TextAppearance c;
    @NotNull
    private final TextAppearance d;
    @NotNull
    private final TextAppearance e;
    @NotNull
    private final TextAppearance f;
    @NotNull
    private final TextAppearance g;
    @NotNull
    private final TextAppearance h;
    @NotNull
    private final TextAppearance i;
    @NotNull
    private final ImageAppearance j;
    @NotNull
    private final ImageAppearance k;
    @NotNull
    private final ButtonAppearance l;
    @NotNull
    private final RatingAppearance m;

    private NativeTemplateAppearance(BannerAppearance bannerAppearance, TextAppearance textAppearance, TextAppearance textAppearance2, TextAppearance textAppearance3, TextAppearance textAppearance4, TextAppearance textAppearance5, TextAppearance textAppearance6, TextAppearance textAppearance7, ImageAppearance imageAppearance, ImageAppearance imageAppearance2, ButtonAppearance buttonAppearance, RatingAppearance ratingAppearance) {
        this.b = bannerAppearance;
        this.c = textAppearance;
        this.d = textAppearance2;
        this.e = textAppearance3;
        this.f = textAppearance4;
        this.g = textAppearance5;
        this.h = textAppearance6;
        this.i = textAppearance7;
        this.j = imageAppearance;
        this.k = imageAppearance2;
        this.l = buttonAppearance;
        this.m = ratingAppearance;
    }

    public /* synthetic */ NativeTemplateAppearance(BannerAppearance bannerAppearance, TextAppearance textAppearance, TextAppearance textAppearance2, TextAppearance textAppearance3, TextAppearance textAppearance4, TextAppearance textAppearance5, TextAppearance textAppearance6, TextAppearance textAppearance7, ImageAppearance imageAppearance, ImageAppearance imageAppearance2, ButtonAppearance buttonAppearance, RatingAppearance ratingAppearance, p p14) {
        this(bannerAppearance, textAppearance, textAppearance2, textAppearance3, textAppearance4, textAppearance5, textAppearance6, textAppearance7, imageAppearance, imageAppearance2, buttonAppearance, ratingAppearance);
    }

    public static final /* synthetic */ int access$getCOLOR_GRAY$cp() {
        return n;
    }

    public static final /* synthetic */ int access$getDEFAULT_BUTTON_BORDER_COLOR$cp() {
        return o;
    }

    public static final /* synthetic */ int access$getDEFAULT_BUTTON_COLOR_PRESSED$cp() {
        return p;
    }

    public static final /* synthetic */ int access$getDEFAULT_RATING_COLOR_PROGRESS$cp() {
        return q;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        Class<?> clazz = object != null ? object.getClass() : null;
        if (!y.e(NativeTemplateAppearance.class, clazz)) {
            return false;
        }
        y.h(object, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance");
        object = (NativeTemplateAppearance)object;
        if (!y.e(this.getBannerAppearance(), ((NativeTemplateAppearance)object).getBannerAppearance())) {
            return false;
        }
        if (!y.e(this.getAgeAppearance(), ((NativeTemplateAppearance)object).getAgeAppearance())) {
            return false;
        }
        if (!y.e(this.getBodyAppearance(), ((NativeTemplateAppearance)object).getBodyAppearance())) {
            return false;
        }
        if (!y.e(this.getDomainAppearance(), ((NativeTemplateAppearance)object).getDomainAppearance())) {
            return false;
        }
        if (!y.e(this.getReviewCountAppearance(), ((NativeTemplateAppearance)object).getReviewCountAppearance())) {
            return false;
        }
        if (!y.e(this.getSponsoredAppearance(), ((NativeTemplateAppearance)object).getSponsoredAppearance())) {
            return false;
        }
        if (!y.e(this.getTitleAppearance(), ((NativeTemplateAppearance)object).getTitleAppearance())) {
            return false;
        }
        if (!y.e(this.getWarningAppearance(), ((NativeTemplateAppearance)object).getWarningAppearance())) {
            return false;
        }
        if (!y.e(this.getFaviconAppearance(), ((NativeTemplateAppearance)object).getFaviconAppearance())) {
            return false;
        }
        if (!y.e(this.getImageAppearance(), ((NativeTemplateAppearance)object).getImageAppearance())) {
            return false;
        }
        if (!y.e(this.getCallToActionAppearance(), ((NativeTemplateAppearance)object).getCallToActionAppearance())) {
            return false;
        }
        return y.e(this.getRatingAppearance(), ((NativeTemplateAppearance)object).getRatingAppearance());
    }

    @NotNull
    public TextAppearance getAgeAppearance() {
        return this.c;
    }

    @NotNull
    public BannerAppearance getBannerAppearance() {
        return this.b;
    }

    @NotNull
    public TextAppearance getBodyAppearance() {
        return this.d;
    }

    @NotNull
    public ButtonAppearance getCallToActionAppearance() {
        return this.l;
    }

    @NotNull
    public TextAppearance getDomainAppearance() {
        return this.e;
    }

    @NotNull
    public ImageAppearance getFaviconAppearance() {
        return this.j;
    }

    @NotNull
    public ImageAppearance getImageAppearance() {
        return this.k;
    }

    @NotNull
    public RatingAppearance getRatingAppearance() {
        return this.m;
    }

    @NotNull
    public TextAppearance getReviewCountAppearance() {
        return this.f;
    }

    @NotNull
    public TextAppearance getSponsoredAppearance() {
        return this.g;
    }

    @NotNull
    public TextAppearance getTitleAppearance() {
        return this.h;
    }

    @NotNull
    public TextAppearance getWarningAppearance() {
        return this.i;
    }

    public int hashCode() {
        int n10 = this.getBannerAppearance().hashCode();
        int n13 = this.getAgeAppearance().hashCode();
        int n14 = this.getBodyAppearance().hashCode();
        int n15 = this.getDomainAppearance().hashCode();
        int n16 = this.getReviewCountAppearance().hashCode();
        int n17 = this.getSponsoredAppearance().hashCode();
        int n18 = this.getTitleAppearance().hashCode();
        int n19 = this.getWarningAppearance().hashCode();
        int n23 = this.getFaviconAppearance().hashCode();
        int n24 = this.getImageAppearance().hashCode();
        int n25 = this.getCallToActionAppearance().hashCode();
        return this.getRatingAppearance().hashCode() + (n25 + (n24 + (n23 + (n19 + (n18 + (n17 + (n16 + (n15 + (n14 + (n13 + n10 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31;
    }

    public void writeToParcel(@NotNull Parcel parcel, int n10) {
        this.b.writeToParcel(parcel, n10);
        this.c.writeToParcel(parcel, n10);
        this.d.writeToParcel(parcel, n10);
        this.e.writeToParcel(parcel, n10);
        this.f.writeToParcel(parcel, n10);
        this.g.writeToParcel(parcel, n10);
        this.h.writeToParcel(parcel, n10);
        this.i.writeToParcel(parcel, n10);
        this.j.writeToParcel(parcel, n10);
        this.k.writeToParcel(parcel, n10);
        this.l.writeToParcel(parcel, n10);
        this.m.writeToParcel(parcel, n10);
    }
}


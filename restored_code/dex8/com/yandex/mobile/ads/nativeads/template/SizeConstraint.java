/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.yandex.mobile.ads.impl.ka1
 *  com.yandex.mobile.ads.impl.ka1$a
 *  com.yandex.mobile.ads.impl.ka1$b
 *  com.yandex.mobile.ads.nativeads.template.SizeConstraint$a
 */
package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.ka1;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.y;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001 B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u00d6\u0001\u00a2\u0006\u0004\b\u000b\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u00d6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006!"}, d2={"Lcom/yandex/mobile/ads/nativeads/template/SizeConstraint;", "Landroid/os/Parcelable;", "Lcom/yandex/mobile/ads/impl/ka1;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/k0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yandex/mobile/ads/nativeads/template/SizeConstraint$SizeConstraintType;", "b", "Lcom/yandex/mobile/ads/nativeads/template/SizeConstraint$SizeConstraintType;", "getSizeConstraintType", "()Lcom/yandex/mobile/ads/nativeads/template/SizeConstraint$SizeConstraintType;", "sizeConstraintType", "", "c", "F", "getValue", "()F", "value", "<init>", "(Lcom/yandex/mobile/ads/nativeads/template/SizeConstraint$SizeConstraintType;F)V", "SizeConstraintType", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
@Parcelize
public final class SizeConstraint
implements Parcelable,
ka1 {
    @NotNull
    public static final Parcelable.Creator<SizeConstraint> CREATOR = new a();
    @NotNull
    private final SizeConstraintType b;
    private final float c;

    public SizeConstraint(@NotNull SizeConstraintType sizeConstraintType, float f11) {
        this.b = sizeConstraintType;
        this.c = f11;
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
        if (!y.e(SizeConstraint.class, clazz)) {
            return false;
        }
        y.h(object, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.SizeConstraint");
        object = (SizeConstraint)object;
        if (this.getSizeConstraintType() != ((SizeConstraint)object).getSizeConstraintType()) {
            return false;
        }
        if (this.getValue() != ((SizeConstraint)object).getValue()) {
            bl2 = false;
        }
        return bl2;
    }

    @NotNull
    public SizeConstraintType getSizeConstraintType() {
        return this.b;
    }

    public float getValue() {
        return this.c;
    }

    public int hashCode() {
        int n10 = this.getSizeConstraintType().hashCode();
        return Float.floatToIntBits(this.getValue()) + n10 * 31;
    }

    public void writeToParcel(@NotNull Parcel parcel, int n10) {
        parcel.writeString(this.b.name());
        parcel.writeFloat(this.c);
    }

    @Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/yandex/mobile/ads/nativeads/template/SizeConstraint$SizeConstraintType;", "", "Lcom/yandex/mobile/ads/impl/ka1$b;", "FIXED", "FIXED_RATIO", "PREFERRED_RATIO", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
    public static final class SizeConstraintType
    extends Enum<SizeConstraintType>
    implements ka1.b {
        public static final /* enum */ SizeConstraintType FIXED;
        public static final /* enum */ SizeConstraintType FIXED_RATIO;
        public static final /* enum */ SizeConstraintType PREFERRED_RATIO;
        private static final SizeConstraintType[] c;
        @NotNull
        private final ka1.a b;

        static {
            SizeConstraintType sizeConstraintType;
            SizeConstraintType sizeConstraintType2;
            SizeConstraintType sizeConstraintType3;
            FIXED = sizeConstraintType3 = new SizeConstraintType(ka1.a.b);
            FIXED_RATIO = sizeConstraintType2 = new SizeConstraintType(ka1.a.c);
            PREFERRED_RATIO = sizeConstraintType = new SizeConstraintType(ka1.a.d);
            Enum[] enumArray = new SizeConstraintType[]{sizeConstraintType3, sizeConstraintType2, sizeConstraintType};
            c = enumArray;
            kotlin.enums.b.a((Enum[])enumArray);
        }

        private SizeConstraintType(ka1.a a14) {
            this.b = a14;
        }

        public static SizeConstraintType valueOf(String string2) {
            return Enum.valueOf(SizeConstraintType.class, string2);
        }

        public static SizeConstraintType[] values() {
            return (SizeConstraintType[])c.clone();
        }

        @NotNull
        public final ka1.a getType() {
            return this.b;
        }
    }
}


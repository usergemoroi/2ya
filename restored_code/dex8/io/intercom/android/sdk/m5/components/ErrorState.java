/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.DrawableRes
 *  androidx.annotation.StringRes
 *  androidx.compose.runtime.internal.StabilityInferred
 *  kotlin.jvm.functions.a
 */
package io.intercom.android.sdk.m5.components;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.R;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\f\rB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0082\u0001\u0002\u000e\u000f\u00a8\u0006\u0010"}, d2={"Lio/intercom/android/sdk/m5/components/ErrorState;", "", "()V", "additionalMessageResId", "", "getAdditionalMessageResId", "()Ljava/lang/Integer;", "iconId", "getIconId", "()I", "messageResId", "getMessageResId", "WithCTA", "WithoutCTA", "Lio/intercom/android/sdk/m5/components/ErrorState$WithCTA;", "Lio/intercom/android/sdk/m5/components/ErrorState$WithoutCTA;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
public abstract class ErrorState {
    private ErrorState() {
    }

    public /* synthetic */ ErrorState(p p14) {
        this();
    }

    @Nullable
    public abstract Integer getAdditionalMessageResId();

    public abstract int getIconId();

    public abstract int getMessageResId();

    @Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\b%\u0010&J\u0010\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\u0004J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJJ\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\r\u001a\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0010\u001a\u00020\u00022\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0004J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003\u00a2\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\u0007R\u0017\u0010\u0010\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\"\u0010\u0004R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010\f\u00a8\u0006'"}, d2={"Lio/intercom/android/sdk/m5/components/ErrorState$WithCTA;", "Lio/intercom/android/sdk/m5/components/ErrorState;", "", "component1", "()I", "component2", "component3", "()Ljava/lang/Integer;", "component4", "Lkotlin/Function0;", "Lkotlin/k0;", "component5", "()Lkotlin/jvm/functions/a;", "iconId", "messageResId", "additionalMessageResId", "ctaResId", "onCtaClick", "copy", "(IILjava/lang/Integer;ILkotlin/jvm/functions/a;)Lio/intercom/android/sdk/m5/components/ErrorState$WithCTA;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getIconId", "getMessageResId", "Ljava/lang/Integer;", "getAdditionalMessageResId", "getCtaResId", "Lkotlin/jvm/functions/a;", "getOnCtaClick", "<init>", "(IILjava/lang/Integer;ILkotlin/jvm/functions/a;)V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
    @StabilityInferred(parameters=0)
    public static final class WithCTA
    extends ErrorState {
        public static final int $stable = 0;
        @Nullable
        private final Integer additionalMessageResId;
        private final int ctaResId;
        private final int iconId;
        private final int messageResId;
        @NotNull
        private final a<k0> onCtaClick;

        public WithCTA(@DrawableRes int n10, @StringRes int n13, @StringRes @Nullable Integer n14, @StringRes int n15, @NotNull a<k0> a14) {
            y.j(a14, "onCtaClick");
            super(null);
            this.iconId = n10;
            this.messageResId = n13;
            this.additionalMessageResId = n14;
            this.ctaResId = n15;
            this.onCtaClick = a14;
        }

        public /* synthetic */ WithCTA(int n10, int n13, Integer n14, int n15, a a14, int n16, p p14) {
            if ((n16 & 1) != 0) {
                n10 = R.drawable.intercom_ic_warning;
            }
            if ((n16 & 2) != 0) {
                n13 = R.string.intercom_spaces_error_title;
            }
            if ((n16 & 4) != 0) {
                n14 = R.string.intercom_spaces_error_description;
            }
            if ((n16 & 8) != 0) {
                n15 = R.string.intercom_reload;
            }
            this(n10, n13, n14, n15, (a<k0>)a14);
        }

        public static /* synthetic */ WithCTA copy$default(WithCTA withCTA, int n10, int n13, Integer n14, int n15, a a14, int n16, Object object) {
            if ((n16 & 1) != 0) {
                n10 = withCTA.iconId;
            }
            if ((n16 & 2) != 0) {
                n13 = withCTA.messageResId;
            }
            if ((n16 & 4) != 0) {
                n14 = withCTA.additionalMessageResId;
            }
            if ((n16 & 8) != 0) {
                n15 = withCTA.ctaResId;
            }
            if ((n16 & 0x10) != 0) {
                a14 = withCTA.onCtaClick;
            }
            return withCTA.copy(n10, n13, n14, n15, a14);
        }

        public final int component1() {
            return this.iconId;
        }

        public final int component2() {
            return this.messageResId;
        }

        @Nullable
        public final Integer component3() {
            return this.additionalMessageResId;
        }

        public final int component4() {
            return this.ctaResId;
        }

        @NotNull
        public final a<k0> component5() {
            return this.onCtaClick;
        }

        @NotNull
        public final WithCTA copy(@DrawableRes int n10, @StringRes int n13, @StringRes @Nullable Integer n14, @StringRes int n15, @NotNull a<k0> a14) {
            y.j(a14, "onCtaClick");
            return new WithCTA(n10, n13, n14, n15, a14);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof WithCTA)) {
                return false;
            }
            object = (WithCTA)object;
            if (this.iconId != ((WithCTA)object).iconId) {
                return false;
            }
            if (this.messageResId != ((WithCTA)object).messageResId) {
                return false;
            }
            if (!y.e(this.additionalMessageResId, ((WithCTA)object).additionalMessageResId)) {
                return false;
            }
            if (this.ctaResId != ((WithCTA)object).ctaResId) {
                return false;
            }
            return y.e(this.onCtaClick, ((WithCTA)object).onCtaClick);
        }

        @Override
        @Nullable
        public Integer getAdditionalMessageResId() {
            return this.additionalMessageResId;
        }

        public final int getCtaResId() {
            return this.ctaResId;
        }

        @Override
        public int getIconId() {
            return this.iconId;
        }

        @Override
        public int getMessageResId() {
            return this.messageResId;
        }

        @NotNull
        public final a<k0> getOnCtaClick() {
            return this.onCtaClick;
        }

        public int hashCode() {
            int n10 = this.iconId;
            int n13 = this.messageResId;
            Integer n14 = this.additionalMessageResId;
            int n15 = n14 == null ? 0 : ((Object)n14).hashCode();
            return (((n10 * 31 + n13) * 31 + n15) * 31 + this.ctaResId) * 31 + this.onCtaClick.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("WithCTA(iconId=");
            stringBuilder.append(this.iconId);
            stringBuilder.append(", messageResId=");
            stringBuilder.append(this.messageResId);
            stringBuilder.append(", additionalMessageResId=");
            stringBuilder.append(this.additionalMessageResId);
            stringBuilder.append(", ctaResId=");
            stringBuilder.append(this.ctaResId);
            stringBuilder.append(", onCtaClick=");
            stringBuilder.append(this.onCtaClick);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0019"}, d2={"Lio/intercom/android/sdk/m5/components/ErrorState$WithoutCTA;", "Lio/intercom/android/sdk/m5/components/ErrorState;", "iconId", "", "messageResId", "additionalMessageResId", "(IILjava/lang/Integer;)V", "getAdditionalMessageResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIconId", "()I", "getMessageResId", "component1", "component2", "component3", "copy", "(IILjava/lang/Integer;)Lio/intercom/android/sdk/m5/components/ErrorState$WithoutCTA;", "equals", "", "other", "", "hashCode", "toString", "", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class WithoutCTA
    extends ErrorState {
        public static final int $stable = 0;
        @Nullable
        private final Integer additionalMessageResId;
        private final int iconId;
        private final int messageResId;

        public WithoutCTA() {
            this(0, 0, null, 7, null);
        }

        public WithoutCTA(@DrawableRes int n10, @StringRes int n13, @StringRes @Nullable Integer n14) {
            super(null);
            this.iconId = n10;
            this.messageResId = n13;
            this.additionalMessageResId = n14;
        }

        public /* synthetic */ WithoutCTA(int n10, int n13, Integer n14, int n15, p p14) {
            if ((n15 & 1) != 0) {
                n10 = R.drawable.intercom_ic_warning;
            }
            if ((n15 & 2) != 0) {
                n13 = R.string.intercom_spaces_error_title;
            }
            if ((n15 & 4) != 0) {
                n14 = R.string.intercom_spaces_error_description;
            }
            this(n10, n13, n14);
        }

        public static /* synthetic */ WithoutCTA copy$default(WithoutCTA withoutCTA, int n10, int n13, Integer n14, int n15, Object object) {
            if ((n15 & 1) != 0) {
                n10 = withoutCTA.iconId;
            }
            if ((n15 & 2) != 0) {
                n13 = withoutCTA.messageResId;
            }
            if ((n15 & 4) != 0) {
                n14 = withoutCTA.additionalMessageResId;
            }
            return withoutCTA.copy(n10, n13, n14);
        }

        public final int component1() {
            return this.iconId;
        }

        public final int component2() {
            return this.messageResId;
        }

        @Nullable
        public final Integer component3() {
            return this.additionalMessageResId;
        }

        @NotNull
        public final WithoutCTA copy(@DrawableRes int n10, @StringRes int n13, @StringRes @Nullable Integer n14) {
            return new WithoutCTA(n10, n13, n14);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof WithoutCTA)) {
                return false;
            }
            object = (WithoutCTA)object;
            if (this.iconId != ((WithoutCTA)object).iconId) {
                return false;
            }
            if (this.messageResId != ((WithoutCTA)object).messageResId) {
                return false;
            }
            return y.e(this.additionalMessageResId, ((WithoutCTA)object).additionalMessageResId);
        }

        @Override
        @Nullable
        public Integer getAdditionalMessageResId() {
            return this.additionalMessageResId;
        }

        @Override
        public int getIconId() {
            return this.iconId;
        }

        @Override
        public int getMessageResId() {
            return this.messageResId;
        }

        public int hashCode() {
            int n10 = this.iconId;
            int n13 = this.messageResId;
            Integer n14 = this.additionalMessageResId;
            int n15 = n14 == null ? 0 : ((Object)n14).hashCode();
            return (n10 * 31 + n13) * 31 + n15;
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("WithoutCTA(iconId=");
            stringBuilder.append(this.iconId);
            stringBuilder.append(", messageResId=");
            stringBuilder.append(this.messageResId);
            stringBuilder.append(", additionalMessageResId=");
            stringBuilder.append(this.additionalMessageResId);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }
}


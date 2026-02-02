/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.runtime.internal.StabilityInferred
 *  kotlinx.serialization.KSerializer
 */
package io.intercom.android.sdk.helpcenter.sections;

import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.helpcenter.sections.Avatar$;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.e;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.r2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\b \u0010!B3\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u00a2\u0006\u0004\b \u0010%J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u0018\u0010\u0019R \u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\fR \u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u0012\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001e\u0010\f\u00a8\u0006("}, d2={"Lio/intercom/android/sdk/helpcenter/sections/Avatar;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/k0;", "write$Self", "(Lio/intercom/android/sdk/helpcenter/sections/Avatar;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "component1", "()Ljava/lang/String;", "component2", "initials", "imageUrl", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/helpcenter/sections/Avatar;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInitials", "getInitials$annotations", "()V", "getImageUrl", "getImageUrl$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/r2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/r2;)V", "Companion", "$serializer", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@Serializable
@StabilityInferred(parameters=0)
public final class Avatar {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String imageUrl;
    @NotNull
    private final String initials;

    public Avatar() {
        this(null, null, 3, null);
    }

    @Deprecated(level=e.e, message="This synthesized declaration should not be used directly", replaceWith=@ReplaceWith(expression="", imports={}))
    public /* synthetic */ Avatar(int n10, @SerialName(value="initials") String string2, @SerialName(value="image_url") String string3, r2 r24) {
        this.initials = (n10 & 1) == 0 ? "" : string2;
        this.imageUrl = (n10 & 2) == 0 ? "" : string3;
    }

    public Avatar(@NotNull String string2, @NotNull String string3) {
        y.j(string2, "initials");
        y.j(string3, "imageUrl");
        this.initials = string2;
        this.imageUrl = string3;
    }

    public /* synthetic */ Avatar(String string2, String string3, int n10, p p14) {
        if ((n10 & 1) != 0) {
            string2 = "";
        }
        if ((n10 & 2) != 0) {
            string3 = "";
        }
        this(string2, string3);
    }

    public static /* synthetic */ Avatar copy$default(Avatar avatar, String string2, String string3, int n10, Object object) {
        if ((n10 & 1) != 0) {
            string2 = avatar.initials;
        }
        if ((n10 & 2) != 0) {
            string3 = avatar.imageUrl;
        }
        return avatar.copy(string2, string3);
    }

    @SerialName(value="image_url")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @SerialName(value="initials")
    public static /* synthetic */ void getInitials$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(Avatar avatar, d d14, SerialDescriptor serialDescriptor) {
        if (d14.q(serialDescriptor, 0) || !y.e(avatar.initials, "")) {
            d14.p(serialDescriptor, 0, avatar.initials);
        }
        if (d14.q(serialDescriptor, 1) || !y.e(avatar.imageUrl, "")) {
            d14.p(serialDescriptor, 1, avatar.imageUrl);
        }
    }

    @NotNull
    public final String component1() {
        return this.initials;
    }

    @NotNull
    public final String component2() {
        return this.imageUrl;
    }

    @NotNull
    public final Avatar copy(@NotNull String string2, @NotNull String string3) {
        y.j(string2, "initials");
        y.j(string3, "imageUrl");
        return new Avatar(string2, string3);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Avatar)) {
            return false;
        }
        object = (Avatar)object;
        if (!y.e(this.initials, ((Avatar)object).initials)) {
            return false;
        }
        return y.e(this.imageUrl, ((Avatar)object).imageUrl);
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getInitials() {
        return this.initials;
    }

    public int hashCode() {
        return this.initials.hashCode() * 31 + this.imageUrl.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Avatar(initials=");
        stringBuilder.append(this.initials);
        stringBuilder.append(", imageUrl=");
        stringBuilder.append(this.imageUrl);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2={"Lio/intercom/android/sdk/helpcenter/sections/Avatar$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/sections/Avatar;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        @NotNull
        public final KSerializer<Avatar> serializer() {
            return $serializer.INSTANCE;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.runtime.internal.StabilityInferred
 *  kotlinx.serialization.KSerializer
 */
package io.intercom.android.sdk.helpcenter.sections;

import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.helpcenter.sections.Author$;
import io.intercom.android.sdk.helpcenter.sections.Avatar;
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
import kotlinx.serialization.internal.c2;
import kotlinx.serialization.internal.r2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B#\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\u0004\b'\u0010(B?\b\u0017\u0012\u0006\u0010)\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u00a2\u0006\u0004\b'\u0010,J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u00c6\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\b\u0016\u0010\fJ\u0010\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0011\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\fR \u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\fR \u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0013\u0010$\u0012\u0004\b&\u0010!\u001a\u0004\b%\u0010\u0010\u00a8\u0006/"}, d2={"Lio/intercom/android/sdk/helpcenter/sections/Author;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/k0;", "write$Self", "(Lio/intercom/android/sdk/helpcenter/sections/Author;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "component1", "()Ljava/lang/String;", "component2", "Lio/intercom/android/sdk/helpcenter/sections/Avatar;", "component3", "()Lio/intercom/android/sdk/helpcenter/sections/Avatar;", "id", "name", "avatar", "copy", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/sections/Avatar;)Lio/intercom/android/sdk/helpcenter/sections/Author;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getName", "getName$annotations", "Lio/intercom/android/sdk/helpcenter/sections/Avatar;", "getAvatar", "getAvatar$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/sections/Avatar;)V", "seen1", "Lkotlinx/serialization/internal/r2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/sections/Avatar;Lkotlinx/serialization/internal/r2;)V", "Companion", "$serializer", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@Serializable
@StabilityInferred(parameters=0)
public final class Author {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final Avatar avatar;
    @NotNull
    private final String id;
    @NotNull
    private final String name;

    @Deprecated(level=e.e, message="This synthesized declaration should not be used directly", replaceWith=@ReplaceWith(expression="", imports={}))
    public /* synthetic */ Author(int n10, @SerialName(value="id") String string2, @SerialName(value="display_name") String string3, @SerialName(value="avatar") Avatar avatar, r2 r24) {
        if (1 != (n10 & 1)) {
            c2.a(n10, 1, $serializer.INSTANCE.getDescriptor());
        }
        this.id = string2;
        this.name = (n10 & 2) == 0 ? "" : string3;
        this.avatar = (n10 & 4) == 0 ? new Avatar(null, null, 3, null) : avatar;
    }

    public Author(@NotNull String string2, @NotNull String string3, @NotNull Avatar avatar) {
        y.j(string2, "id");
        y.j(string3, "name");
        y.j(avatar, "avatar");
        this.id = string2;
        this.name = string3;
        this.avatar = avatar;
    }

    public /* synthetic */ Author(String string2, String string3, Avatar avatar, int n10, p p14) {
        if ((n10 & 2) != 0) {
            string3 = "";
        }
        if ((n10 & 4) != 0) {
            avatar = new Avatar(null, null, 3, null);
        }
        this(string2, string3, avatar);
    }

    public static /* synthetic */ Author copy$default(Author author, String string2, String string3, Avatar avatar, int n10, Object object) {
        if ((n10 & 1) != 0) {
            string2 = author.id;
        }
        if ((n10 & 2) != 0) {
            string3 = author.name;
        }
        if ((n10 & 4) != 0) {
            avatar = author.avatar;
        }
        return author.copy(string2, string3, avatar);
    }

    @SerialName(value="avatar")
    public static /* synthetic */ void getAvatar$annotations() {
    }

    @SerialName(value="id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName(value="display_name")
    public static /* synthetic */ void getName$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(Author author, d d14, SerialDescriptor serialDescriptor) {
        d14.p(serialDescriptor, 0, author.id);
        if (d14.q(serialDescriptor, 1) || !y.e(author.name, "")) {
            d14.p(serialDescriptor, 1, author.name);
        }
        if (d14.q(serialDescriptor, 2) || !y.e(author.avatar, new Avatar(null, null, 3, null))) {
            d14.F(serialDescriptor, 2, Avatar$.serializer.INSTANCE, author.avatar);
        }
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final Avatar component3() {
        return this.avatar;
    }

    @NotNull
    public final Author copy(@NotNull String string2, @NotNull String string3, @NotNull Avatar avatar) {
        y.j(string2, "id");
        y.j(string3, "name");
        y.j(avatar, "avatar");
        return new Author(string2, string3, avatar);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Author)) {
            return false;
        }
        object = (Author)object;
        if (!y.e(this.id, ((Author)object).id)) {
            return false;
        }
        if (!y.e(this.name, ((Author)object).name)) {
            return false;
        }
        return y.e(this.avatar, ((Author)object).avatar);
    }

    @NotNull
    public final Avatar getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31 + this.name.hashCode()) * 31 + this.avatar.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Author(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", avatar=");
        stringBuilder.append(this.avatar);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2={"Lio/intercom/android/sdk/helpcenter/sections/Author$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/sections/Author;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        @NotNull
        public final KSerializer<Author> serializer() {
            return $serializer.INSTANCE;
        }
    }
}


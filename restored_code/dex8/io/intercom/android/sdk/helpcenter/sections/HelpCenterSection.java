/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.runtime.internal.StabilityInferred
 *  kotlin.collections.t
 *  kotlinx.serialization.KSerializer
 *  kotlinx.serialization.internal.f
 */
package io.intercom.android.sdk.helpcenter.sections;

import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterArticle;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterArticle$;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterSection$;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.t;
import kotlin.e;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.f;
import kotlinx.serialization.internal.r2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B!\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u00a2\u0006\u0004\b$\u0010%B9\b\u0017\u0012\u0006\u0010&\u001a\u00020\u0016\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u00a2\u0006\u0004\b$\u0010)J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u00c6\u0001\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u001b\u0010\u001cR&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\rR \u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0012\u0010!\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u0010\u00a8\u0006,"}, d2={"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/k0;", "write$Self", "(Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterArticle;", "component1", "()Ljava/util/List;", "", "component2", "()Ljava/lang/String;", "helpCenterArticles", "title", "copy", "(Ljava/util/List;Ljava/lang/String;)Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getHelpCenterArticles", "getHelpCenterArticles$annotations", "()V", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/r2;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/r2;)V", "Companion", "$serializer", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@Serializable
@StabilityInferred(parameters=0)
public final class HelpCenterSection {
    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers;
    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final List<HelpCenterArticle> helpCenterArticles;
    @NotNull
    private final String title;

    static {
        Companion = new Companion(null);
        $stable = 8;
        $childSerializers = new KSerializer[]{new f((KSerializer)HelpCenterArticle$.serializer.INSTANCE), null};
    }

    public HelpCenterSection() {
        this(null, null, 3, null);
    }

    @Deprecated(level=e.e, message="This synthesized declaration should not be used directly", replaceWith=@ReplaceWith(expression="", imports={}))
    public /* synthetic */ HelpCenterSection(int n10, @SerialName(value="articles") List list, @SerialName(value="name") String string2, r2 r24) {
        if ((n10 & 1) == 0) {
            list = t.m();
        }
        this.helpCenterArticles = list;
        this.title = (n10 & 2) == 0 ? "" : string2;
    }

    public HelpCenterSection(@NotNull List<HelpCenterArticle> list, @NotNull String string2) {
        y.j(list, "helpCenterArticles");
        y.j(string2, "title");
        this.helpCenterArticles = list;
        this.title = string2;
    }

    public /* synthetic */ HelpCenterSection(List list, String string2, int n10, p p14) {
        if ((n10 & 1) != 0) {
            list = t.m();
        }
        if ((n10 & 2) != 0) {
            string2 = "";
        }
        this(list, string2);
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ HelpCenterSection copy$default(HelpCenterSection helpCenterSection, List list, String string2, int n10, Object object) {
        if ((n10 & 1) != 0) {
            list = helpCenterSection.helpCenterArticles;
        }
        if ((n10 & 2) != 0) {
            string2 = helpCenterSection.title;
        }
        return helpCenterSection.copy(list, string2);
    }

    @SerialName(value="articles")
    public static /* synthetic */ void getHelpCenterArticles$annotations() {
    }

    @SerialName(value="name")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(HelpCenterSection helpCenterSection, d d14, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArray = $childSerializers;
        if (d14.q(serialDescriptor, 0) || !y.e(helpCenterSection.helpCenterArticles, t.m())) {
            d14.F(serialDescriptor, 0, kSerializerArray[0], helpCenterSection.helpCenterArticles);
        }
        if (d14.q(serialDescriptor, 1) || !y.e(helpCenterSection.title, "")) {
            d14.p(serialDescriptor, 1, helpCenterSection.title);
        }
    }

    @NotNull
    public final List<HelpCenterArticle> component1() {
        return this.helpCenterArticles;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final HelpCenterSection copy(@NotNull List<HelpCenterArticle> list, @NotNull String string2) {
        y.j(list, "helpCenterArticles");
        y.j(string2, "title");
        return new HelpCenterSection(list, string2);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof HelpCenterSection)) {
            return false;
        }
        object = (HelpCenterSection)object;
        if (!y.e(this.helpCenterArticles, ((HelpCenterSection)object).helpCenterArticles)) {
            return false;
        }
        return y.e(this.title, ((HelpCenterSection)object).title);
    }

    @NotNull
    public final List<HelpCenterArticle> getHelpCenterArticles() {
        return this.helpCenterArticles;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((Object)this.helpCenterArticles).hashCode() * 31 + this.title.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HelpCenterSection(helpCenterArticles=");
        stringBuilder.append(this.helpCenterArticles);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2={"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        @NotNull
        public final KSerializer<HelpCenterSection> serializer() {
            return $serializer.INSTANCE;
        }
    }
}


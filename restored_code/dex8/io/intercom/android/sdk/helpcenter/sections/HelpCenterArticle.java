/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.runtime.internal.StabilityInferred
 *  kotlinx.serialization.KSerializer
 */
package io.intercom.android.sdk.helpcenter.sections;

import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterArticle$;
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

@Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\b \u0010!B3\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u00a2\u0006\u0004\b \u0010%J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u0018\u0010\u0019R \u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\fR \u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u0012\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001e\u0010\f\u00a8\u0006("}, d2={"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterArticle;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/k0;", "write$Self", "(Lio/intercom/android/sdk/helpcenter/sections/HelpCenterArticle;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "component1", "()Ljava/lang/String;", "component2", "articleId", "title", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/helpcenter/sections/HelpCenterArticle;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getArticleId", "getArticleId$annotations", "()V", "getTitle", "getTitle$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/r2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/r2;)V", "Companion", "$serializer", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@Serializable
@StabilityInferred(parameters=0)
public final class HelpCenterArticle {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String articleId;
    @NotNull
    private final String title;

    @Deprecated(level=e.e, message="This synthesized declaration should not be used directly", replaceWith=@ReplaceWith(expression="", imports={}))
    public /* synthetic */ HelpCenterArticle(int n10, @SerialName(value="id") String string2, @SerialName(value="title") String string3, r2 r24) {
        if (1 != (n10 & 1)) {
            c2.a(n10, 1, $serializer.INSTANCE.getDescriptor());
        }
        this.articleId = string2;
        this.title = (n10 & 2) == 0 ? "" : string3;
    }

    public HelpCenterArticle(@NotNull String string2, @NotNull String string3) {
        y.j(string2, "articleId");
        y.j(string3, "title");
        this.articleId = string2;
        this.title = string3;
    }

    public /* synthetic */ HelpCenterArticle(String string2, String string3, int n10, p p14) {
        if ((n10 & 2) != 0) {
            string3 = "";
        }
        this(string2, string3);
    }

    public static /* synthetic */ HelpCenterArticle copy$default(HelpCenterArticle helpCenterArticle, String string2, String string3, int n10, Object object) {
        if ((n10 & 1) != 0) {
            string2 = helpCenterArticle.articleId;
        }
        if ((n10 & 2) != 0) {
            string3 = helpCenterArticle.title;
        }
        return helpCenterArticle.copy(string2, string3);
    }

    @SerialName(value="id")
    public static /* synthetic */ void getArticleId$annotations() {
    }

    @SerialName(value="title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(HelpCenterArticle helpCenterArticle, d d14, SerialDescriptor serialDescriptor) {
        d14.p(serialDescriptor, 0, helpCenterArticle.articleId);
        if (d14.q(serialDescriptor, 1) || !y.e(helpCenterArticle.title, "")) {
            d14.p(serialDescriptor, 1, helpCenterArticle.title);
        }
    }

    @NotNull
    public final String component1() {
        return this.articleId;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final HelpCenterArticle copy(@NotNull String string2, @NotNull String string3) {
        y.j(string2, "articleId");
        y.j(string3, "title");
        return new HelpCenterArticle(string2, string3);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof HelpCenterArticle)) {
            return false;
        }
        object = (HelpCenterArticle)object;
        if (!y.e(this.articleId, ((HelpCenterArticle)object).articleId)) {
            return false;
        }
        return y.e(this.title, ((HelpCenterArticle)object).title);
    }

    @NotNull
    public final String getArticleId() {
        return this.articleId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.articleId.hashCode() * 31 + this.title.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HelpCenterArticle(articleId=");
        stringBuilder.append(this.articleId);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2={"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterArticle$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterArticle;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        @NotNull
        public final KSerializer<HelpCenterArticle> serializer() {
            return $serializer.INSTANCE;
        }
    }
}


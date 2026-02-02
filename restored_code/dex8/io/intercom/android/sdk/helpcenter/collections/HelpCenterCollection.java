/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.runtime.internal.StabilityInferred
 *  kotlinx.serialization.KSerializer
 */
package io.intercom.android.sdk.helpcenter.collections;

import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection$;
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

@Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B7\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u00a2\u0006\u0004\b-\u0010.BS\b\u0017\u0012\u0006\u0010/\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u000f\u0012\b\u00101\u001a\u0004\u0018\u000100\u00a2\u0006\u0004\b-\u00102J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0011JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000fH\u00c6\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\b\u001a\u0010\fJ\u0010\u0010\u001b\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\b\u001b\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0013\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\fR \u0010\u0014\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0014\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\fR \u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0015\u0010 \u0012\u0004\b'\u0010#\u001a\u0004\b&\u0010\fR \u0010\u0016\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0016\u0010(\u0012\u0004\b*\u0010#\u001a\u0004\b)\u0010\u0011R \u0010\u0017\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0017\u0010(\u0012\u0004\b,\u0010#\u001a\u0004\b+\u0010\u0011\u00a8\u00065"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/k0;", "write$Self", "(Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "component1", "()Ljava/lang/String;", "component2", "component3", "", "component4", "()I", "component5", "summary", "id", "title", "articlesCount", "collectionsCount", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSummary", "getSummary$annotations", "()V", "getId", "getId$annotations", "getTitle", "getTitle$annotations", "I", "getArticlesCount", "getArticlesCount$annotations", "getCollectionsCount", "getCollectionsCount$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "seen1", "Lkotlinx/serialization/internal/r2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlinx/serialization/internal/r2;)V", "Companion", "$serializer", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@Serializable
@StabilityInferred(parameters=0)
public final class HelpCenterCollection {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int articlesCount;
    private final int collectionsCount;
    @NotNull
    private final String id;
    @NotNull
    private final String summary;
    @NotNull
    private final String title;

    @Deprecated(level=e.e, message="This synthesized declaration should not be used directly", replaceWith=@ReplaceWith(expression="", imports={}))
    public /* synthetic */ HelpCenterCollection(int n10, @SerialName(value="description") String string2, @SerialName(value="id") String string3, @SerialName(value="name") String string4, @SerialName(value="article_count") int n13, @SerialName(value="collection_count") int n14, r2 r24) {
        if (2 != (n10 & 2)) {
            c2.a(n10, 2, $serializer.INSTANCE.getDescriptor());
        }
        this.summary = (n10 & 1) == 0 ? "" : string2;
        this.id = string3;
        this.title = (n10 & 4) == 0 ? "" : string4;
        this.articlesCount = (n10 & 8) == 0 ? 0 : n13;
        this.collectionsCount = (n10 & 0x10) == 0 ? 0 : n14;
    }

    public HelpCenterCollection(@NotNull String string2, @NotNull String string3, @NotNull String string4, int n10, int n13) {
        y.j(string2, "summary");
        y.j(string3, "id");
        y.j(string4, "title");
        this.summary = string2;
        this.id = string3;
        this.title = string4;
        this.articlesCount = n10;
        this.collectionsCount = n13;
    }

    public /* synthetic */ HelpCenterCollection(String string2, String string3, String string4, int n10, int n13, int n14, p p14) {
        if ((n14 & 1) != 0) {
            string2 = "";
        }
        if ((n14 & 4) != 0) {
            string4 = "";
        }
        if ((n14 & 8) != 0) {
            n10 = 0;
        }
        if ((n14 & 0x10) != 0) {
            n13 = 0;
        }
        this(string2, string3, string4, n10, n13);
    }

    public static /* synthetic */ HelpCenterCollection copy$default(HelpCenterCollection helpCenterCollection, String string2, String string3, String string4, int n10, int n13, int n14, Object object) {
        if ((n14 & 1) != 0) {
            string2 = helpCenterCollection.summary;
        }
        if ((n14 & 2) != 0) {
            string3 = helpCenterCollection.id;
        }
        if ((n14 & 4) != 0) {
            string4 = helpCenterCollection.title;
        }
        if ((n14 & 8) != 0) {
            n10 = helpCenterCollection.articlesCount;
        }
        if ((n14 & 0x10) != 0) {
            n13 = helpCenterCollection.collectionsCount;
        }
        return helpCenterCollection.copy(string2, string3, string4, n10, n13);
    }

    @SerialName(value="article_count")
    public static /* synthetic */ void getArticlesCount$annotations() {
    }

    @SerialName(value="collection_count")
    public static /* synthetic */ void getCollectionsCount$annotations() {
    }

    @SerialName(value="id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName(value="description")
    public static /* synthetic */ void getSummary$annotations() {
    }

    @SerialName(value="name")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(HelpCenterCollection helpCenterCollection, d d14, SerialDescriptor serialDescriptor) {
        if (d14.q(serialDescriptor, 0) || !y.e(helpCenterCollection.summary, "")) {
            d14.p(serialDescriptor, 0, helpCenterCollection.summary);
        }
        d14.p(serialDescriptor, 1, helpCenterCollection.id);
        if (d14.q(serialDescriptor, 2) || !y.e(helpCenterCollection.title, "")) {
            d14.p(serialDescriptor, 2, helpCenterCollection.title);
        }
        if (d14.q(serialDescriptor, 3) || helpCenterCollection.articlesCount != 0) {
            d14.n(serialDescriptor, 3, helpCenterCollection.articlesCount);
        }
        if (d14.q(serialDescriptor, 4) || helpCenterCollection.collectionsCount != 0) {
            d14.n(serialDescriptor, 4, helpCenterCollection.collectionsCount);
        }
    }

    @NotNull
    public final String component1() {
        return this.summary;
    }

    @NotNull
    public final String component2() {
        return this.id;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    public final int component4() {
        return this.articlesCount;
    }

    public final int component5() {
        return this.collectionsCount;
    }

    @NotNull
    public final HelpCenterCollection copy(@NotNull String string2, @NotNull String string3, @NotNull String string4, int n10, int n13) {
        y.j(string2, "summary");
        y.j(string3, "id");
        y.j(string4, "title");
        return new HelpCenterCollection(string2, string3, string4, n10, n13);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof HelpCenterCollection)) {
            return false;
        }
        object = (HelpCenterCollection)object;
        if (!y.e(this.summary, ((HelpCenterCollection)object).summary)) {
            return false;
        }
        if (!y.e(this.id, ((HelpCenterCollection)object).id)) {
            return false;
        }
        if (!y.e(this.title, ((HelpCenterCollection)object).title)) {
            return false;
        }
        if (this.articlesCount != ((HelpCenterCollection)object).articlesCount) {
            return false;
        }
        return this.collectionsCount == ((HelpCenterCollection)object).collectionsCount;
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final int getCollectionsCount() {
        return this.collectionsCount;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getSummary() {
        return this.summary;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.summary.hashCode() * 31 + this.id.hashCode()) * 31 + this.title.hashCode()) * 31 + this.articlesCount) * 31 + this.collectionsCount;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HelpCenterCollection(summary=");
        stringBuilder.append(this.summary);
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", articlesCount=");
        stringBuilder.append(this.articlesCount);
        stringBuilder.append(", collectionsCount=");
        stringBuilder.append(this.collectionsCount);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        @NotNull
        public final KSerializer<HelpCenterCollection> serializer() {
            return $serializer.INSTANCE;
        }
    }
}


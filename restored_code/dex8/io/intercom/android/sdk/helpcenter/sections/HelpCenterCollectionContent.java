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
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection$;
import io.intercom.android.sdk.helpcenter.sections.Author;
import io.intercom.android.sdk.helpcenter.sections.Author$;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterArticle;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterArticle$;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent$;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterSection;
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
import kotlinx.serialization.internal.c2;
import kotlinx.serialization.internal.f;
import kotlinx.serialization.internal.r2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFBk\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\n\u0012\b\b\u0002\u0010\u001e\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u000f\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f\u0012\u0006\u0010\"\u001a\u00020\u0017\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f\u00a2\u0006\u0004\b@\u0010AB\u0091\u0001\b\u0017\u0012\u0006\u0010B\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f\u0012\b\b\u0001\u0010\"\u001a\u00020\u0017\u0012\u0010\b\u0001\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000f\u0012\b\u0010D\u001a\u0004\u0018\u00010C\u00a2\u0006\u0004\b@\u0010EJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u00c6\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0012J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fH\u00c6\u0003\u00a2\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0017H\u00c6\u0003\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000fH\u00c6\u0003\u00a2\u0006\u0004\b\u001b\u0010\u0012Jx\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\n2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u000f2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f2\b\b\u0002\u0010\"\u001a\u00020\u00172\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000fH\u00c6\u0001\u00a2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\b&\u0010\fJ\u0010\u0010'\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\b'\u0010\u0019J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b*\u0010+R \u0010\u001c\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001c\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\fR \u0010\u001d\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001d\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\fR \u0010\u001e\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001e\u0010,\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010\fR&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001f\u00104\u0012\u0004\b6\u0010/\u001a\u0004\b5\u0010\u0012R&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b \u00104\u0012\u0004\b8\u0010/\u001a\u0004\b7\u0010\u0012R&\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b!\u00104\u0012\u0004\b:\u0010/\u001a\u0004\b9\u0010\u0012R \u0010\"\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\"\u0010;\u0012\u0004\b=\u0010/\u001a\u0004\b<\u0010\u0019R&\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b#\u00104\u0012\u0004\b?\u0010/\u001a\u0004\b>\u0010\u0012\u00a8\u0006H"}, d2={"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/k0;", "write$Self", "(Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "component1", "()Ljava/lang/String;", "component2", "component3", "", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterArticle;", "component4", "()Ljava/util/List;", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection;", "component5", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "component6", "", "component7", "()I", "Lio/intercom/android/sdk/helpcenter/sections/Author;", "component8", "collectionId", "title", "summary", "helpCenterArticles", "helpCenterSections", "subCollections", "articlesCount", "authors", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/util/List;)Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCollectionId", "getCollectionId$annotations", "()V", "getTitle", "getTitle$annotations", "getSummary", "getSummary$annotations", "Ljava/util/List;", "getHelpCenterArticles", "getHelpCenterArticles$annotations", "getHelpCenterSections", "getHelpCenterSections$annotations", "getSubCollections", "getSubCollections$annotations", "I", "getArticlesCount", "getArticlesCount$annotations", "getAuthors", "getAuthors$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/r2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/util/List;Lkotlinx/serialization/internal/r2;)V", "Companion", "$serializer", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@Serializable
@StabilityInferred(parameters=0)
public final class HelpCenterCollectionContent {
    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers;
    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    private final int articlesCount;
    @NotNull
    private final List<Author> authors;
    @NotNull
    private final String collectionId;
    @NotNull
    private final List<HelpCenterArticle> helpCenterArticles;
    @NotNull
    private final List<HelpCenterSection> helpCenterSections;
    @NotNull
    private final List<HelpCenterCollection> subCollections;
    @NotNull
    private final String summary;
    @NotNull
    private final String title;

    static {
        Companion = new Companion(null);
        $stable = 8;
        $childSerializers = new KSerializer[]{null, null, null, new f((KSerializer)HelpCenterArticle$.serializer.INSTANCE), new f((KSerializer)HelpCenterSection$.serializer.INSTANCE), new f((KSerializer)HelpCenterCollection$.serializer.INSTANCE), null, new f((KSerializer)Author$.serializer.INSTANCE)};
    }

    @Deprecated(level=e.e, message="This synthesized declaration should not be used directly", replaceWith=@ReplaceWith(expression="", imports={}))
    public /* synthetic */ HelpCenterCollectionContent(int n10, @SerialName(value="id") String string2, @SerialName(value="name") String string3, @SerialName(value="description") String string4, @SerialName(value="articles") List list, @Deprecated(level=e.c, message="sections is deprecated and will be removed in a future release. Use collections instead", replaceWith=@ReplaceWith(expression="collections", imports={})) @SerialName(value="sections") List list2, @SerialName(value="collections") List list3, @SerialName(value="article_count") int n13, @SerialName(value="authors") List list4, r2 r24) {
        if (65 != (n10 & 0x41)) {
            c2.a(n10, 65, $serializer.INSTANCE.getDescriptor());
        }
        this.collectionId = string2;
        this.title = (n10 & 2) == 0 ? "" : string3;
        this.summary = (n10 & 4) == 0 ? "" : string4;
        this.helpCenterArticles = (n10 & 8) == 0 ? t.m() : list;
        this.helpCenterSections = (n10 & 0x10) == 0 ? t.m() : list2;
        this.subCollections = (n10 & 0x20) == 0 ? t.m() : list3;
        this.articlesCount = n13;
        this.authors = (n10 & 0x80) == 0 ? t.m() : list4;
    }

    public HelpCenterCollectionContent(@NotNull String string2, @NotNull String string3, @NotNull String string4, @NotNull List<HelpCenterArticle> list, @NotNull List<HelpCenterSection> list2, @NotNull List<HelpCenterCollection> list3, int n10, @NotNull List<Author> list4) {
        y.j(string2, "collectionId");
        y.j(string3, "title");
        y.j(string4, "summary");
        y.j(list, "helpCenterArticles");
        y.j(list2, "helpCenterSections");
        y.j(list3, "subCollections");
        y.j(list4, "authors");
        this.collectionId = string2;
        this.title = string3;
        this.summary = string4;
        this.helpCenterArticles = list;
        this.helpCenterSections = list2;
        this.subCollections = list3;
        this.articlesCount = n10;
        this.authors = list4;
    }

    public /* synthetic */ HelpCenterCollectionContent(String string2, String string3, String string4, List list, List list2, List list3, int n10, List list4, int n13, p p14) {
        if ((n13 & 2) != 0) {
            string3 = "";
        }
        if ((n13 & 4) != 0) {
            string4 = "";
        }
        if ((n13 & 8) != 0) {
            list = t.m();
        }
        if ((n13 & 0x10) != 0) {
            list2 = t.m();
        }
        if ((n13 & 0x20) != 0) {
            list3 = t.m();
        }
        if ((n13 & 0x80) != 0) {
            list4 = t.m();
        }
        this(string2, string3, string4, list, list2, list3, n10, list4);
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ HelpCenterCollectionContent copy$default(HelpCenterCollectionContent helpCenterCollectionContent, String string2, String string3, String string4, List list, List list2, List list3, int n10, List list4, int n13, Object object) {
        block7: {
            if ((n13 & 1) != 0) {
                string2 = helpCenterCollectionContent.collectionId;
            }
            if ((n13 & 2) != 0) {
                string3 = helpCenterCollectionContent.title;
            }
            if ((n13 & 4) != 0) {
                string4 = helpCenterCollectionContent.summary;
            }
            if ((n13 & 8) != 0) {
                list = helpCenterCollectionContent.helpCenterArticles;
            }
            if ((n13 & 0x10) != 0) {
                list2 = helpCenterCollectionContent.helpCenterSections;
            }
            if ((n13 & 0x20) != 0) {
                list3 = helpCenterCollectionContent.subCollections;
            }
            if ((n13 & 0x40) != 0) {
                n10 = helpCenterCollectionContent.articlesCount;
            }
            if ((n13 & 0x80) == 0) break block7;
            list4 = helpCenterCollectionContent.authors;
        }
        return helpCenterCollectionContent.copy(string2, string3, string4, list, list2, list3, n10, list4);
    }

    @SerialName(value="article_count")
    public static /* synthetic */ void getArticlesCount$annotations() {
    }

    @SerialName(value="authors")
    public static /* synthetic */ void getAuthors$annotations() {
    }

    @SerialName(value="id")
    public static /* synthetic */ void getCollectionId$annotations() {
    }

    @SerialName(value="articles")
    public static /* synthetic */ void getHelpCenterArticles$annotations() {
    }

    @Deprecated(level=e.c, message="sections is deprecated and will be removed in a future release. Use collections instead", replaceWith=@ReplaceWith(expression="collections", imports={}))
    @SerialName(value="sections")
    public static /* synthetic */ void getHelpCenterSections$annotations() {
    }

    @SerialName(value="collections")
    public static /* synthetic */ void getSubCollections$annotations() {
    }

    @SerialName(value="description")
    public static /* synthetic */ void getSummary$annotations() {
    }

    @SerialName(value="name")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(HelpCenterCollectionContent helpCenterCollectionContent, d d14, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArray = $childSerializers;
        d14.p(serialDescriptor, 0, helpCenterCollectionContent.collectionId);
        if (d14.q(serialDescriptor, 1) || !y.e(helpCenterCollectionContent.title, "")) {
            d14.p(serialDescriptor, 1, helpCenterCollectionContent.title);
        }
        if (d14.q(serialDescriptor, 2) || !y.e(helpCenterCollectionContent.summary, "")) {
            d14.p(serialDescriptor, 2, helpCenterCollectionContent.summary);
        }
        if (d14.q(serialDescriptor, 3) || !y.e(helpCenterCollectionContent.helpCenterArticles, t.m())) {
            d14.F(serialDescriptor, 3, kSerializerArray[3], helpCenterCollectionContent.helpCenterArticles);
        }
        if (d14.q(serialDescriptor, 4) || !y.e(helpCenterCollectionContent.helpCenterSections, t.m())) {
            d14.F(serialDescriptor, 4, kSerializerArray[4], helpCenterCollectionContent.helpCenterSections);
        }
        if (d14.q(serialDescriptor, 5) || !y.e(helpCenterCollectionContent.subCollections, t.m())) {
            d14.F(serialDescriptor, 5, kSerializerArray[5], helpCenterCollectionContent.subCollections);
        }
        d14.n(serialDescriptor, 6, helpCenterCollectionContent.articlesCount);
        if (d14.q(serialDescriptor, 7) || !y.e(helpCenterCollectionContent.authors, t.m())) {
            d14.F(serialDescriptor, 7, kSerializerArray[7], helpCenterCollectionContent.authors);
        }
    }

    @NotNull
    public final String component1() {
        return this.collectionId;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final String component3() {
        return this.summary;
    }

    @NotNull
    public final List<HelpCenterArticle> component4() {
        return this.helpCenterArticles;
    }

    @NotNull
    public final List<HelpCenterSection> component5() {
        return this.helpCenterSections;
    }

    @NotNull
    public final List<HelpCenterCollection> component6() {
        return this.subCollections;
    }

    public final int component7() {
        return this.articlesCount;
    }

    @NotNull
    public final List<Author> component8() {
        return this.authors;
    }

    @NotNull
    public final HelpCenterCollectionContent copy(@NotNull String string2, @NotNull String string3, @NotNull String string4, @NotNull List<HelpCenterArticle> list, @NotNull List<HelpCenterSection> list2, @NotNull List<HelpCenterCollection> list3, int n10, @NotNull List<Author> list4) {
        y.j(string2, "collectionId");
        y.j(string3, "title");
        y.j(string4, "summary");
        y.j(list, "helpCenterArticles");
        y.j(list2, "helpCenterSections");
        y.j(list3, "subCollections");
        y.j(list4, "authors");
        return new HelpCenterCollectionContent(string2, string3, string4, list, list2, list3, n10, list4);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof HelpCenterCollectionContent)) {
            return false;
        }
        object = (HelpCenterCollectionContent)object;
        if (!y.e(this.collectionId, ((HelpCenterCollectionContent)object).collectionId)) {
            return false;
        }
        if (!y.e(this.title, ((HelpCenterCollectionContent)object).title)) {
            return false;
        }
        if (!y.e(this.summary, ((HelpCenterCollectionContent)object).summary)) {
            return false;
        }
        if (!y.e(this.helpCenterArticles, ((HelpCenterCollectionContent)object).helpCenterArticles)) {
            return false;
        }
        if (!y.e(this.helpCenterSections, ((HelpCenterCollectionContent)object).helpCenterSections)) {
            return false;
        }
        if (!y.e(this.subCollections, ((HelpCenterCollectionContent)object).subCollections)) {
            return false;
        }
        if (this.articlesCount != ((HelpCenterCollectionContent)object).articlesCount) {
            return false;
        }
        return y.e(this.authors, ((HelpCenterCollectionContent)object).authors);
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    @NotNull
    public final List<Author> getAuthors() {
        return this.authors;
    }

    @NotNull
    public final String getCollectionId() {
        return this.collectionId;
    }

    @NotNull
    public final List<HelpCenterArticle> getHelpCenterArticles() {
        return this.helpCenterArticles;
    }

    @NotNull
    public final List<HelpCenterSection> getHelpCenterSections() {
        return this.helpCenterSections;
    }

    @NotNull
    public final List<HelpCenterCollection> getSubCollections() {
        return this.subCollections;
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
        return ((((((this.collectionId.hashCode() * 31 + this.title.hashCode()) * 31 + this.summary.hashCode()) * 31 + ((Object)this.helpCenterArticles).hashCode()) * 31 + ((Object)this.helpCenterSections).hashCode()) * 31 + ((Object)this.subCollections).hashCode()) * 31 + this.articlesCount) * 31 + ((Object)this.authors).hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HelpCenterCollectionContent(collectionId=");
        stringBuilder.append(this.collectionId);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", summary=");
        stringBuilder.append(this.summary);
        stringBuilder.append(", helpCenterArticles=");
        stringBuilder.append(this.helpCenterArticles);
        stringBuilder.append(", helpCenterSections=");
        stringBuilder.append(this.helpCenterSections);
        stringBuilder.append(", subCollections=");
        stringBuilder.append(this.subCollections);
        stringBuilder.append(", articlesCount=");
        stringBuilder.append(this.articlesCount);
        stringBuilder.append(", authors=");
        stringBuilder.append(this.authors);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2={"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        @NotNull
        public final KSerializer<HelpCenterCollectionContent> serializer() {
            return $serializer.INSTANCE;
        }
    }
}


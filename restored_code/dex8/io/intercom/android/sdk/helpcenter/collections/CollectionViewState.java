/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.runtime.internal.StabilityInferred
 *  kotlin.collections.t
 */
package io.intercom.android.sdk.helpcenter.collections;

import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.collections.ArticleSectionRow;
import io.intercom.android.sdk.helpcenter.collections.CollectionListRow;
import io.intercom.android.sdk.helpcenter.sections.Author;
import io.intercom.android.sdk.m5.components.ErrorState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\b\t\n\u000b\u00a8\u0006\f"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState;", "", "()V", "CollectionRowData", "Content", "Error", "Initial", "Loading", "Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Content;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Error;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Initial;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Loading;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
public abstract class CollectionViewState {
    private CollectionViewState() {
    }

    public /* synthetic */ CollectionViewState(p p14) {
        this();
    }

    @Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006\u001f"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$CollectionRowData;", "", "id", "", "titleText", "descriptionVisibility", "", "descriptionText", "articlesCount", "collectionsCount", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V", "getArticlesCount", "()I", "getCollectionsCount", "getDescriptionText", "()Ljava/lang/String;", "getDescriptionVisibility", "getId", "getTitleText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class CollectionRowData {
        public static final int $stable = 0;
        private final int articlesCount;
        private final int collectionsCount;
        @NotNull
        private final String descriptionText;
        private final int descriptionVisibility;
        @NotNull
        private final String id;
        @NotNull
        private final String titleText;

        public CollectionRowData(@NotNull String string2, @NotNull String string3, int n10, @NotNull String string4, int n13, int n14) {
            y.j(string2, "id");
            y.j(string3, "titleText");
            y.j(string4, "descriptionText");
            this.id = string2;
            this.titleText = string3;
            this.descriptionVisibility = n10;
            this.descriptionText = string4;
            this.articlesCount = n13;
            this.collectionsCount = n14;
        }

        public /* synthetic */ CollectionRowData(String string2, String string3, int n10, String string4, int n13, int n14, int n15, p p14) {
            if ((n15 & 0x10) != 0) {
                n13 = 0;
            }
            if ((n15 & 0x20) != 0) {
                n14 = 0;
            }
            this(string2, string3, n10, string4, n13, n14);
        }

        public static /* synthetic */ CollectionRowData copy$default(CollectionRowData collectionRowData, String string2, String string3, int n10, String string4, int n13, int n14, int n15, Object object) {
            if ((n15 & 1) != 0) {
                string2 = collectionRowData.id;
            }
            if ((n15 & 2) != 0) {
                string3 = collectionRowData.titleText;
            }
            if ((n15 & 4) != 0) {
                n10 = collectionRowData.descriptionVisibility;
            }
            if ((n15 & 8) != 0) {
                string4 = collectionRowData.descriptionText;
            }
            if ((n15 & 0x10) != 0) {
                n13 = collectionRowData.articlesCount;
            }
            if ((n15 & 0x20) != 0) {
                n14 = collectionRowData.collectionsCount;
            }
            return collectionRowData.copy(string2, string3, n10, string4, n13, n14);
        }

        @NotNull
        public final String component1() {
            return this.id;
        }

        @NotNull
        public final String component2() {
            return this.titleText;
        }

        public final int component3() {
            return this.descriptionVisibility;
        }

        @NotNull
        public final String component4() {
            return this.descriptionText;
        }

        public final int component5() {
            return this.articlesCount;
        }

        public final int component6() {
            return this.collectionsCount;
        }

        @NotNull
        public final CollectionRowData copy(@NotNull String string2, @NotNull String string3, int n10, @NotNull String string4, int n13, int n14) {
            y.j(string2, "id");
            y.j(string3, "titleText");
            y.j(string4, "descriptionText");
            return new CollectionRowData(string2, string3, n10, string4, n13, n14);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof CollectionRowData)) {
                return false;
            }
            object = (CollectionRowData)object;
            if (!y.e(this.id, ((CollectionRowData)object).id)) {
                return false;
            }
            if (!y.e(this.titleText, ((CollectionRowData)object).titleText)) {
                return false;
            }
            if (this.descriptionVisibility != ((CollectionRowData)object).descriptionVisibility) {
                return false;
            }
            if (!y.e(this.descriptionText, ((CollectionRowData)object).descriptionText)) {
                return false;
            }
            if (this.articlesCount != ((CollectionRowData)object).articlesCount) {
                return false;
            }
            return this.collectionsCount == ((CollectionRowData)object).collectionsCount;
        }

        public final int getArticlesCount() {
            return this.articlesCount;
        }

        public final int getCollectionsCount() {
            return this.collectionsCount;
        }

        @NotNull
        public final String getDescriptionText() {
            return this.descriptionText;
        }

        public final int getDescriptionVisibility() {
            return this.descriptionVisibility;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getTitleText() {
            return this.titleText;
        }

        public int hashCode() {
            return ((((this.id.hashCode() * 31 + this.titleText.hashCode()) * 31 + this.descriptionVisibility) * 31 + this.descriptionText.hashCode()) * 31 + this.articlesCount) * 31 + this.collectionsCount;
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CollectionRowData(id=");
            stringBuilder.append(this.id);
            stringBuilder.append(", titleText=");
            stringBuilder.append(this.titleText);
            stringBuilder.append(", descriptionVisibility=");
            stringBuilder.append(this.descriptionVisibility);
            stringBuilder.append(", descriptionText=");
            stringBuilder.append(this.descriptionText);
            stringBuilder.append(", articlesCount=");
            stringBuilder.append(this.articlesCount);
            stringBuilder.append(", collectionsCount=");
            stringBuilder.append(this.collectionsCount);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0000H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&\u0082\u0001\u0002\f\r\u00a8\u0006\u000e"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Content;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState;", "()V", "copyWithSingleSendMessageRow", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "copyWithoutSendMessageRow", "hasSendMessageRow", "", "hasSubCollections", "CollectionContent", "CollectionListContent", "Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Content$CollectionContent;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Content$CollectionListContent;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static abstract class Content
    extends CollectionViewState {
        public static final int $stable = 0;

        private Content() {
            super(null);
        }

        public /* synthetic */ Content(p p14) {
            this();
        }

        @NotNull
        public abstract Content copyWithSingleSendMessageRow(@NotNull ArticleViewState.TeamPresenceState var1);

        @NotNull
        public abstract Content copyWithoutSendMessageRow();

        public abstract boolean hasSendMessageRow();

        public abstract boolean hasSubCollections();

        @Metadata(d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u00c6\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u00c6\u0001J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0000H\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\b\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020#H\u0016J\t\u0010(\u001a\u00020\u0007H\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013\u00a8\u0006*"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Content$CollectionContent;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Content;", "id", "", "title", "summary", "articlesCount", "", "authors", "", "Lio/intercom/android/sdk/helpcenter/sections/Author;", "sectionsUiModel", "Lio/intercom/android/sdk/helpcenter/collections/ArticleSectionRow;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V", "getArticlesCount", "()I", "getAuthors", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getSectionsUiModel", "getSummary", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "copyWithSingleSendMessageRow", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "copyWithoutSendMessageRow", "equals", "", "other", "", "hasSendMessageRow", "hasSubCollections", "hashCode", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
        @StabilityInferred(parameters=0)
        @SourceDebugExtension(value={"SMAP\nCollectionViewState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionViewState.kt\nio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Content$CollectionContent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n1747#2,3:122\n819#2:125\n847#2,2:126\n819#2:128\n847#2,2:129\n1747#2,3:131\n*S KotlinDebug\n*F\n+ 1 CollectionViewState.kt\nio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Content$CollectionContent\n*L\n52#1:122,3\n57#1:125\n57#1:126,2\n72#1:128\n72#1:129,2\n75#1:131,3\n*E\n"})
        public static final class CollectionContent
        extends Content {
            public static final int $stable = 8;
            private final int articlesCount;
            @NotNull
            private final List<Author> authors;
            @NotNull
            private final String id;
            @NotNull
            private final List<ArticleSectionRow> sectionsUiModel;
            @NotNull
            private final String summary;
            @NotNull
            private final String title;

            public CollectionContent(@NotNull String string2, @NotNull String string3, @NotNull String string4, int n10, @NotNull List<Author> list, @NotNull List<? extends ArticleSectionRow> list2) {
                y.j(string2, "id");
                y.j(string3, "title");
                y.j(string4, "summary");
                y.j(list, "authors");
                y.j(list2, "sectionsUiModel");
                super(null);
                this.id = string2;
                this.title = string3;
                this.summary = string4;
                this.articlesCount = n10;
                this.authors = list;
                this.sectionsUiModel = list2;
            }

            public static /* synthetic */ CollectionContent copy$default(CollectionContent collectionContent, String string2, String string3, String string4, int n10, List list, List list2, int n13, Object object) {
                if ((n13 & 1) != 0) {
                    string2 = collectionContent.id;
                }
                if ((n13 & 2) != 0) {
                    string3 = collectionContent.title;
                }
                if ((n13 & 4) != 0) {
                    string4 = collectionContent.summary;
                }
                if ((n13 & 8) != 0) {
                    n10 = collectionContent.articlesCount;
                }
                if ((n13 & 0x10) != 0) {
                    list = collectionContent.authors;
                }
                if ((n13 & 0x20) != 0) {
                    list2 = collectionContent.sectionsUiModel;
                }
                return collectionContent.copy(string2, string3, string4, n10, list, list2);
            }

            @NotNull
            public final String component1() {
                return this.id;
            }

            @NotNull
            public final String component2() {
                return this.title;
            }

            @NotNull
            public final String component3() {
                return this.summary;
            }

            public final int component4() {
                return this.articlesCount;
            }

            @NotNull
            public final List<Author> component5() {
                return this.authors;
            }

            @NotNull
            public final List<ArticleSectionRow> component6() {
                return this.sectionsUiModel;
            }

            @NotNull
            public final CollectionContent copy(@NotNull String string2, @NotNull String string3, @NotNull String string4, int n10, @NotNull List<Author> list, @NotNull List<? extends ArticleSectionRow> list2) {
                y.j(string2, "id");
                y.j(string3, "title");
                y.j(string4, "summary");
                y.j(list, "authors");
                y.j(list2, "sectionsUiModel");
                return new CollectionContent(string2, string3, string4, n10, list, list2);
            }

            @Override
            @NotNull
            public CollectionContent copyWithSingleSendMessageRow(@NotNull ArticleViewState.TeamPresenceState object) {
                y.j(object, "teamPresenceState");
                if (this.hasSendMessageRow()) {
                    Iterable iterable2 = this.sectionsUiModel;
                    ArrayList<Iterable> arrayList = new ArrayList<Iterable>();
                    for (Iterable iterable2 : iterable2) {
                        if ((ArticleSectionRow)((Object)iterable2) instanceof ArticleSectionRow.SendMessageRow) continue;
                        arrayList.add(iterable2);
                    }
                    object = CollectionContent.copy$default(this, null, null, null, 0, null, t.N0(arrayList, (Object)new ArticleSectionRow.SendMessageRow((ArticleViewState.TeamPresenceState)object)), 31, null);
                } else {
                    object = CollectionContent.copy$default(this, null, null, null, 0, null, t.N0((Collection)this.sectionsUiModel, (Object)new ArticleSectionRow.SendMessageRow((ArticleViewState.TeamPresenceState)object)), 31, null);
                }
                return object;
            }

            @Override
            @NotNull
            public CollectionContent copyWithoutSendMessageRow() {
                Object object = this.sectionsUiModel;
                ArrayList arrayList = new ArrayList();
                object = object.iterator();
                while (object.hasNext()) {
                    Object e11 = object.next();
                    if ((ArticleSectionRow)e11 instanceof ArticleSectionRow.SendMessageRow) continue;
                    arrayList.add(e11);
                }
                return CollectionContent.copy$default(this, null, null, null, 0, null, arrayList, 31, null);
            }

            public boolean equals(@Nullable Object object) {
                if (this == object) {
                    return true;
                }
                if (!(object instanceof CollectionContent)) {
                    return false;
                }
                object = (CollectionContent)object;
                if (!y.e(this.id, ((CollectionContent)object).id)) {
                    return false;
                }
                if (!y.e(this.title, ((CollectionContent)object).title)) {
                    return false;
                }
                if (!y.e(this.summary, ((CollectionContent)object).summary)) {
                    return false;
                }
                if (this.articlesCount != ((CollectionContent)object).articlesCount) {
                    return false;
                }
                if (!y.e(this.authors, ((CollectionContent)object).authors)) {
                    return false;
                }
                return y.e(this.sectionsUiModel, ((CollectionContent)object).sectionsUiModel);
            }

            public final int getArticlesCount() {
                return this.articlesCount;
            }

            @NotNull
            public final List<Author> getAuthors() {
                return this.authors;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final List<ArticleSectionRow> getSectionsUiModel() {
                return this.sectionsUiModel;
            }

            @NotNull
            public final String getSummary() {
                return this.summary;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @Override
            public boolean hasSendMessageRow() {
                boolean bl2;
                block3: {
                    Object object = this.sectionsUiModel;
                    bl2 = object instanceof Collection;
                    boolean bl3 = false;
                    if (bl2 && ((Collection)object).isEmpty()) {
                        bl2 = bl3;
                    } else {
                        object = object.iterator();
                        do {
                            bl2 = bl3;
                            if (!object.hasNext()) break block3;
                        } while (!((ArticleSectionRow)object.next() instanceof ArticleSectionRow.SendMessageRow));
                        bl2 = true;
                    }
                }
                return bl2;
            }

            @Override
            public boolean hasSubCollections() {
                boolean bl2;
                block3: {
                    Object object = this.sectionsUiModel;
                    bl2 = object instanceof Collection;
                    boolean bl3 = false;
                    if (bl2 && ((Collection)object).isEmpty()) {
                        bl2 = bl3;
                    } else {
                        object = object.iterator();
                        do {
                            bl2 = bl3;
                            if (!object.hasNext()) break block3;
                        } while (!((ArticleSectionRow)object.next() instanceof ArticleSectionRow.CollectionRow));
                        bl2 = true;
                    }
                }
                return bl2;
            }

            public int hashCode() {
                return ((((this.id.hashCode() * 31 + this.title.hashCode()) * 31 + this.summary.hashCode()) * 31 + this.articlesCount) * 31 + ((Object)this.authors).hashCode()) * 31 + ((Object)this.sectionsUiModel).hashCode();
            }

            @NotNull
            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("CollectionContent(id=");
                stringBuilder.append(this.id);
                stringBuilder.append(", title=");
                stringBuilder.append(this.title);
                stringBuilder.append(", summary=");
                stringBuilder.append(this.summary);
                stringBuilder.append(", articlesCount=");
                stringBuilder.append(this.articlesCount);
                stringBuilder.append(", authors=");
                stringBuilder.append(this.authors);
                stringBuilder.append(", sectionsUiModel=");
                stringBuilder.append(this.sectionsUiModel);
                stringBuilder.append(')');
                return stringBuilder.toString();
            }
        }

        @Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0018"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Content$CollectionListContent;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Content;", "collections", "", "Lio/intercom/android/sdk/helpcenter/collections/CollectionListRow;", "(Ljava/util/List;)V", "getCollections", "()Ljava/util/List;", "component1", "copy", "copyWithSingleSendMessageRow", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "copyWithoutSendMessageRow", "equals", "", "other", "", "hasSendMessageRow", "hasSubCollections", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
        @StabilityInferred(parameters=0)
        @SourceDebugExtension(value={"SMAP\nCollectionViewState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionViewState.kt\nio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Content$CollectionListContent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n1747#2,3:122\n819#2:125\n847#2,2:126\n819#2:128\n847#2,2:129\n1747#2,3:131\n*S KotlinDebug\n*F\n+ 1 CollectionViewState.kt\nio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Content$CollectionListContent\n*L\n17#1:122,3\n22#1:125\n22#1:126,2\n37#1:128\n37#1:129,2\n40#1:131,3\n*E\n"})
        public static final class CollectionListContent
        extends Content {
            public static final int $stable = 8;
            @NotNull
            private final List<CollectionListRow> collections;

            public CollectionListContent(@NotNull List<? extends CollectionListRow> list) {
                y.j(list, "collections");
                super(null);
                this.collections = list;
            }

            public static /* synthetic */ CollectionListContent copy$default(CollectionListContent collectionListContent, List list, int n10, Object object) {
                if ((n10 & 1) != 0) {
                    list = collectionListContent.collections;
                }
                return collectionListContent.copy(list);
            }

            @NotNull
            public final List<CollectionListRow> component1() {
                return this.collections;
            }

            @NotNull
            public final CollectionListContent copy(@NotNull List<? extends CollectionListRow> list) {
                y.j(list, "collections");
                return new CollectionListContent(list);
            }

            @Override
            @NotNull
            public CollectionListContent copyWithSingleSendMessageRow(@NotNull ArticleViewState.TeamPresenceState object) {
                y.j(object, "teamPresenceState");
                if (this.hasSendMessageRow()) {
                    Iterable iterable2 = this.collections;
                    ArrayList<Iterable> arrayList = new ArrayList<Iterable>();
                    for (Iterable iterable2 : iterable2) {
                        if ((CollectionListRow)((Object)iterable2) instanceof CollectionListRow.SendMessageRow) continue;
                        arrayList.add(iterable2);
                    }
                    object = this.copy(t.N0(arrayList, (Object)new CollectionListRow.SendMessageRow((ArticleViewState.TeamPresenceState)object)));
                } else {
                    object = this.copy(t.N0((Collection)this.collections, (Object)new CollectionListRow.SendMessageRow((ArticleViewState.TeamPresenceState)object)));
                }
                return object;
            }

            @Override
            @NotNull
            public CollectionListContent copyWithoutSendMessageRow() {
                Iterable iterable2 = this.collections;
                ArrayList<Iterable> arrayList = new ArrayList<Iterable>();
                for (Iterable iterable2 : iterable2) {
                    if ((CollectionListRow)((Object)iterable2) instanceof CollectionListRow.SendMessageRow) continue;
                    arrayList.add(iterable2);
                }
                return this.copy(arrayList);
            }

            public boolean equals(@Nullable Object object) {
                if (this == object) {
                    return true;
                }
                if (!(object instanceof CollectionListContent)) {
                    return false;
                }
                object = (CollectionListContent)object;
                return y.e(this.collections, ((CollectionListContent)object).collections);
            }

            @NotNull
            public final List<CollectionListRow> getCollections() {
                return this.collections;
            }

            @Override
            public boolean hasSendMessageRow() {
                boolean bl2;
                block3: {
                    Object object = this.collections;
                    bl2 = object instanceof Collection;
                    boolean bl3 = false;
                    if (bl2 && ((Collection)object).isEmpty()) {
                        bl2 = bl3;
                    } else {
                        object = object.iterator();
                        do {
                            bl2 = bl3;
                            if (!object.hasNext()) break block3;
                        } while (!((CollectionListRow)object.next() instanceof CollectionListRow.SendMessageRow));
                        bl2 = true;
                    }
                }
                return bl2;
            }

            @Override
            public boolean hasSubCollections() {
                boolean bl2;
                block3: {
                    Object object = this.collections;
                    bl2 = object instanceof Collection;
                    boolean bl3 = false;
                    if (bl2 && ((Collection)object).isEmpty()) {
                        bl2 = bl3;
                    } else {
                        object = object.iterator();
                        do {
                            bl2 = bl3;
                            if (!object.hasNext()) break block3;
                        } while (!((CollectionListRow)object.next() instanceof CollectionListRow.CollectionRow));
                        bl2 = true;
                    }
                }
                return bl2;
            }

            public int hashCode() {
                return ((Object)this.collections).hashCode();
            }

            @NotNull
            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("CollectionListContent(collections=");
                stringBuilder.append(this.collections);
                stringBuilder.append(')');
                return stringBuilder.toString();
            }
        }
    }

    @Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Error;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState;", "errorState", "Lio/intercom/android/sdk/m5/components/ErrorState;", "(Lio/intercom/android/sdk/m5/components/ErrorState;)V", "getErrorState", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class Error
    extends CollectionViewState {
        public static final int $stable = 0;
        @NotNull
        private final ErrorState errorState;

        public Error(@NotNull ErrorState errorState) {
            y.j(errorState, "errorState");
            super(null);
            this.errorState = errorState;
        }

        public static /* synthetic */ Error copy$default(Error error, ErrorState errorState, int n10, Object object) {
            if ((n10 & 1) != 0) {
                errorState = error.errorState;
            }
            return error.copy(errorState);
        }

        @NotNull
        public final ErrorState component1() {
            return this.errorState;
        }

        @NotNull
        public final Error copy(@NotNull ErrorState errorState) {
            y.j(errorState, "errorState");
            return new Error(errorState);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Error)) {
                return false;
            }
            object = (Error)object;
            return y.e(this.errorState, ((Error)object).errorState);
        }

        @NotNull
        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public int hashCode() {
            return this.errorState.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error(errorState=");
            stringBuilder.append(this.errorState);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Initial;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState;", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class Initial
    extends CollectionViewState {
        public static final int $stable = 0;
        @NotNull
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$Loading;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState;", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class Loading
    extends CollectionViewState {
        public static final int $stable = 0;
        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }
}


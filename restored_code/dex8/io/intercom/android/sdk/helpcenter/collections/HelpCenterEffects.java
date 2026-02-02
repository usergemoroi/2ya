/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.runtime.internal.StabilityInferred
 */
package io.intercom.android.sdk.helpcenter.collections;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/HelpCenterEffects;", "", "()V", "NavigateToArticle", "NavigateToCollectionContent", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterEffects$NavigateToArticle;", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterEffects$NavigateToCollectionContent;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
public abstract class HelpCenterEffects {
    private HelpCenterEffects() {
    }

    public /* synthetic */ HelpCenterEffects(p p14) {
        this();
    }

    @Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/HelpCenterEffects$NavigateToArticle;", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterEffects;", "articleId", "", "(Ljava/lang/String;)V", "getArticleId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class NavigateToArticle
    extends HelpCenterEffects {
        public static final int $stable = 0;
        @NotNull
        private final String articleId;

        public NavigateToArticle(@NotNull String string2) {
            y.j(string2, "articleId");
            super(null);
            this.articleId = string2;
        }

        public static /* synthetic */ NavigateToArticle copy$default(NavigateToArticle navigateToArticle, String string2, int n10, Object object) {
            if ((n10 & 1) != 0) {
                string2 = navigateToArticle.articleId;
            }
            return navigateToArticle.copy(string2);
        }

        @NotNull
        public final String component1() {
            return this.articleId;
        }

        @NotNull
        public final NavigateToArticle copy(@NotNull String string2) {
            y.j(string2, "articleId");
            return new NavigateToArticle(string2);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof NavigateToArticle)) {
                return false;
            }
            object = (NavigateToArticle)object;
            return y.e(this.articleId, ((NavigateToArticle)object).articleId);
        }

        @NotNull
        public final String getArticleId() {
            return this.articleId;
        }

        public int hashCode() {
            return this.articleId.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("NavigateToArticle(articleId=");
            stringBuilder.append(this.articleId);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/HelpCenterEffects$NavigateToCollectionContent;", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterEffects;", "collectionId", "", "(Ljava/lang/String;)V", "getCollectionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class NavigateToCollectionContent
    extends HelpCenterEffects {
        public static final int $stable = 0;
        @NotNull
        private final String collectionId;

        public NavigateToCollectionContent(@NotNull String string2) {
            y.j(string2, "collectionId");
            super(null);
            this.collectionId = string2;
        }

        public static /* synthetic */ NavigateToCollectionContent copy$default(NavigateToCollectionContent navigateToCollectionContent, String string2, int n10, Object object) {
            if ((n10 & 1) != 0) {
                string2 = navigateToCollectionContent.collectionId;
            }
            return navigateToCollectionContent.copy(string2);
        }

        @NotNull
        public final String component1() {
            return this.collectionId;
        }

        @NotNull
        public final NavigateToCollectionContent copy(@NotNull String string2) {
            y.j(string2, "collectionId");
            return new NavigateToCollectionContent(string2);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof NavigateToCollectionContent)) {
                return false;
            }
            object = (NavigateToCollectionContent)object;
            return y.e(this.collectionId, ((NavigateToCollectionContent)object).collectionId);
        }

        @NotNull
        public final String getCollectionId() {
            return this.collectionId;
        }

        public int hashCode() {
            return this.collectionId.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("NavigateToCollectionContent(collectionId=");
            stringBuilder.append(this.collectionId);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }
}


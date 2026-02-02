/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.runtime.internal.StabilityInferred
 */
package io.intercom.android.sdk.helpcenter.api;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2={"Lio/intercom/android/sdk/helpcenter/api/HelpCenterArticleSearchResult;", "", "articleId", "", "title", "summary", "matchingSnippet", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArticleId", "()Ljava/lang/String;", "getMatchingSnippet", "getSummary", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
@StabilityInferred(parameters=0)
public final class HelpCenterArticleSearchResult {
    public static final int $stable = 0;
    @NotNull
    private final String articleId;
    @NotNull
    private final String matchingSnippet;
    @NotNull
    private final String summary;
    @NotNull
    private final String title;

    public HelpCenterArticleSearchResult(@NotNull String string2, @NotNull String string3, @NotNull String string4, @NotNull String string5) {
        y.j(string2, "articleId");
        y.j(string3, "title");
        y.j(string4, "summary");
        y.j(string5, "matchingSnippet");
        this.articleId = string2;
        this.title = string3;
        this.summary = string4;
        this.matchingSnippet = string5;
    }

    public /* synthetic */ HelpCenterArticleSearchResult(String string2, String string3, String string4, String string5, int n10, p p14) {
        if ((n10 & 2) != 0) {
            string3 = "";
        }
        if ((n10 & 4) != 0) {
            string4 = "";
        }
        if ((n10 & 8) != 0) {
            string5 = "";
        }
        this(string2, string3, string4, string5);
    }

    public static /* synthetic */ HelpCenterArticleSearchResult copy$default(HelpCenterArticleSearchResult helpCenterArticleSearchResult, String string2, String string3, String string4, String string5, int n10, Object object) {
        if ((n10 & 1) != 0) {
            string2 = helpCenterArticleSearchResult.articleId;
        }
        if ((n10 & 2) != 0) {
            string3 = helpCenterArticleSearchResult.title;
        }
        if ((n10 & 4) != 0) {
            string4 = helpCenterArticleSearchResult.summary;
        }
        if ((n10 & 8) != 0) {
            string5 = helpCenterArticleSearchResult.matchingSnippet;
        }
        return helpCenterArticleSearchResult.copy(string2, string3, string4, string5);
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
    public final String component3() {
        return this.summary;
    }

    @NotNull
    public final String component4() {
        return this.matchingSnippet;
    }

    @NotNull
    public final HelpCenterArticleSearchResult copy(@NotNull String string2, @NotNull String string3, @NotNull String string4, @NotNull String string5) {
        y.j(string2, "articleId");
        y.j(string3, "title");
        y.j(string4, "summary");
        y.j(string5, "matchingSnippet");
        return new HelpCenterArticleSearchResult(string2, string3, string4, string5);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof HelpCenterArticleSearchResult)) {
            return false;
        }
        object = (HelpCenterArticleSearchResult)object;
        if (!y.e(this.articleId, ((HelpCenterArticleSearchResult)object).articleId)) {
            return false;
        }
        if (!y.e(this.title, ((HelpCenterArticleSearchResult)object).title)) {
            return false;
        }
        if (!y.e(this.summary, ((HelpCenterArticleSearchResult)object).summary)) {
            return false;
        }
        return y.e(this.matchingSnippet, ((HelpCenterArticleSearchResult)object).matchingSnippet);
    }

    @NotNull
    public final String getArticleId() {
        return this.articleId;
    }

    @NotNull
    public final String getMatchingSnippet() {
        return this.matchingSnippet;
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
        return ((this.articleId.hashCode() * 31 + this.title.hashCode()) * 31 + this.summary.hashCode()) * 31 + this.matchingSnippet.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HelpCenterArticleSearchResult(articleId=");
        stringBuilder.append(this.articleId);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", summary=");
        stringBuilder.append(this.summary);
        stringBuilder.append(", matchingSnippet=");
        stringBuilder.append(this.matchingSnippet);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}


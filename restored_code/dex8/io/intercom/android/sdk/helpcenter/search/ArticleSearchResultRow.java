/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.runtime.internal.StabilityInferred
 */
package io.intercom.android.sdk.helpcenter.search;

import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2={"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "", "()V", "ArticleResultRow", "TeammateHelpRow", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow$ArticleResultRow;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow$TeammateHelpRow;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
public abstract class ArticleSearchResultRow {
    private ArticleSearchResultRow() {
    }

    public /* synthetic */ ArticleSearchResultRow(p p14) {
        this();
    }

    @Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001a"}, d2={"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow$ArticleResultRow;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "id", "", "titleText", "summaryText", "summaryVisibility", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getSummaryText", "getSummaryVisibility", "()I", "getTitleText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class ArticleResultRow
    extends ArticleSearchResultRow {
        public static final int $stable = 0;
        @NotNull
        private final String id;
        @NotNull
        private final String summaryText;
        private final int summaryVisibility;
        @NotNull
        private final String titleText;

        public ArticleResultRow(@NotNull String string2, @NotNull String string3, @NotNull String string4, int n10) {
            y.j(string2, "id");
            y.j(string3, "titleText");
            y.j(string4, "summaryText");
            super(null);
            this.id = string2;
            this.titleText = string3;
            this.summaryText = string4;
            this.summaryVisibility = n10;
        }

        public /* synthetic */ ArticleResultRow(String string2, String string3, String string4, int n10, int n13, p p14) {
            if ((n13 & 4) != 0) {
                string4 = "";
            }
            if ((n13 & 8) != 0) {
                n10 = 8;
            }
            this(string2, string3, string4, n10);
        }

        public static /* synthetic */ ArticleResultRow copy$default(ArticleResultRow articleResultRow, String string2, String string3, String string4, int n10, int n13, Object object) {
            if ((n13 & 1) != 0) {
                string2 = articleResultRow.id;
            }
            if ((n13 & 2) != 0) {
                string3 = articleResultRow.titleText;
            }
            if ((n13 & 4) != 0) {
                string4 = articleResultRow.summaryText;
            }
            if ((n13 & 8) != 0) {
                n10 = articleResultRow.summaryVisibility;
            }
            return articleResultRow.copy(string2, string3, string4, n10);
        }

        @NotNull
        public final String component1() {
            return this.id;
        }

        @NotNull
        public final String component2() {
            return this.titleText;
        }

        @NotNull
        public final String component3() {
            return this.summaryText;
        }

        public final int component4() {
            return this.summaryVisibility;
        }

        @NotNull
        public final ArticleResultRow copy(@NotNull String string2, @NotNull String string3, @NotNull String string4, int n10) {
            y.j(string2, "id");
            y.j(string3, "titleText");
            y.j(string4, "summaryText");
            return new ArticleResultRow(string2, string3, string4, n10);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof ArticleResultRow)) {
                return false;
            }
            object = (ArticleResultRow)object;
            if (!y.e(this.id, ((ArticleResultRow)object).id)) {
                return false;
            }
            if (!y.e(this.titleText, ((ArticleResultRow)object).titleText)) {
                return false;
            }
            if (!y.e(this.summaryText, ((ArticleResultRow)object).summaryText)) {
                return false;
            }
            return this.summaryVisibility == ((ArticleResultRow)object).summaryVisibility;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getSummaryText() {
            return this.summaryText;
        }

        public final int getSummaryVisibility() {
            return this.summaryVisibility;
        }

        @NotNull
        public final String getTitleText() {
            return this.titleText;
        }

        public int hashCode() {
            return ((this.id.hashCode() * 31 + this.titleText.hashCode()) * 31 + this.summaryText.hashCode()) * 31 + this.summaryVisibility;
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ArticleResultRow(id=");
            stringBuilder.append(this.id);
            stringBuilder.append(", titleText=");
            stringBuilder.append(this.titleText);
            stringBuilder.append(", summaryText=");
            stringBuilder.append(this.summaryText);
            stringBuilder.append(", summaryVisibility=");
            stringBuilder.append(this.summaryVisibility);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2={"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow$TeammateHelpRow;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;)V", "getTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class TeammateHelpRow
    extends ArticleSearchResultRow {
        public static final int $stable = 8;
        @NotNull
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        public TeammateHelpRow(@NotNull ArticleViewState.TeamPresenceState teamPresenceState) {
            y.j(teamPresenceState, "teamPresenceState");
            super(null);
            this.teamPresenceState = teamPresenceState;
        }

        public static /* synthetic */ TeammateHelpRow copy$default(TeammateHelpRow teammateHelpRow, ArticleViewState.TeamPresenceState teamPresenceState, int n10, Object object) {
            if ((n10 & 1) != 0) {
                teamPresenceState = teammateHelpRow.teamPresenceState;
            }
            return teammateHelpRow.copy(teamPresenceState);
        }

        @NotNull
        public final ArticleViewState.TeamPresenceState component1() {
            return this.teamPresenceState;
        }

        @NotNull
        public final TeammateHelpRow copy(@NotNull ArticleViewState.TeamPresenceState teamPresenceState) {
            y.j(teamPresenceState, "teamPresenceState");
            return new TeammateHelpRow(teamPresenceState);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof TeammateHelpRow)) {
                return false;
            }
            object = (TeammateHelpRow)object;
            return y.e(this.teamPresenceState, ((TeammateHelpRow)object).teamPresenceState);
        }

        @NotNull
        public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public int hashCode() {
            return this.teamPresenceState.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TeammateHelpRow(teamPresenceState=");
            stringBuilder.append(this.teamPresenceState);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }
}


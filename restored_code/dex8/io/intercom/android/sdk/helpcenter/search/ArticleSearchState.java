/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.runtime.internal.StabilityInferred
 */
package io.intercom.android.sdk.helpcenter.search;

import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2={"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "", "()V", "Content", "Error", "Initial", "Loading", "NoResults", "NoResultsNoTeamHelp", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$Content;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$Error;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$Initial;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$Loading;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$NoResults;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$NoResultsNoTeamHelp;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
public abstract class ArticleSearchState {
    private ArticleSearchState() {
    }

    public /* synthetic */ ArticleSearchState(p p14) {
        this();
    }

    @Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2={"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$Content;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "searchResults", "", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "(Ljava/util/List;)V", "getSearchResults", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class Content
    extends ArticleSearchState {
        public static final int $stable = 8;
        @NotNull
        private final List<ArticleSearchResultRow> searchResults;

        public Content(@NotNull List<? extends ArticleSearchResultRow> list) {
            y.j(list, "searchResults");
            super(null);
            this.searchResults = list;
        }

        public static /* synthetic */ Content copy$default(Content content, List list, int n10, Object object) {
            if ((n10 & 1) != 0) {
                list = content.searchResults;
            }
            return content.copy(list);
        }

        @NotNull
        public final List<ArticleSearchResultRow> component1() {
            return this.searchResults;
        }

        @NotNull
        public final Content copy(@NotNull List<? extends ArticleSearchResultRow> list) {
            y.j(list, "searchResults");
            return new Content(list);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Content)) {
                return false;
            }
            object = (Content)object;
            return y.e(this.searchResults, ((Content)object).searchResults);
        }

        @NotNull
        public final List<ArticleSearchResultRow> getSearchResults() {
            return this.searchResults;
        }

        public int hashCode() {
            return ((Object)this.searchResults).hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Content(searchResults=");
            stringBuilder.append(this.searchResults);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$Error;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class Error
    extends ArticleSearchState {
        public static final int $stable = 0;
        @NotNull
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$Initial;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class Initial
    extends ArticleSearchState {
        public static final int $stable = 0;
        @NotNull
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$Loading;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class Loading
    extends ArticleSearchState {
        public static final int $stable = 0;
        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    @Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2={"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$NoResults;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "searchTerm", "", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;Ljava/lang/String;)V", "getSearchTerm", "()Ljava/lang/String;", "getTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class NoResults
    extends ArticleSearchState {
        public static final int $stable = 8;
        @NotNull
        private final String searchTerm;
        @NotNull
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        public NoResults(@NotNull ArticleViewState.TeamPresenceState teamPresenceState, @NotNull String string2) {
            y.j(teamPresenceState, "teamPresenceState");
            y.j(string2, "searchTerm");
            super(null);
            this.teamPresenceState = teamPresenceState;
            this.searchTerm = string2;
        }

        public static /* synthetic */ NoResults copy$default(NoResults noResults, ArticleViewState.TeamPresenceState teamPresenceState, String string2, int n10, Object object) {
            if ((n10 & 1) != 0) {
                teamPresenceState = noResults.teamPresenceState;
            }
            if ((n10 & 2) != 0) {
                string2 = noResults.searchTerm;
            }
            return noResults.copy(teamPresenceState, string2);
        }

        @NotNull
        public final ArticleViewState.TeamPresenceState component1() {
            return this.teamPresenceState;
        }

        @NotNull
        public final String component2() {
            return this.searchTerm;
        }

        @NotNull
        public final NoResults copy(@NotNull ArticleViewState.TeamPresenceState teamPresenceState, @NotNull String string2) {
            y.j(teamPresenceState, "teamPresenceState");
            y.j(string2, "searchTerm");
            return new NoResults(teamPresenceState, string2);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof NoResults)) {
                return false;
            }
            object = (NoResults)object;
            if (!y.e(this.teamPresenceState, ((NoResults)object).teamPresenceState)) {
                return false;
            }
            return y.e(this.searchTerm, ((NoResults)object).searchTerm);
        }

        @NotNull
        public final String getSearchTerm() {
            return this.searchTerm;
        }

        @NotNull
        public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public int hashCode() {
            return this.teamPresenceState.hashCode() * 31 + this.searchTerm.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("NoResults(teamPresenceState=");
            stringBuilder.append(this.teamPresenceState);
            stringBuilder.append(", searchTerm=");
            stringBuilder.append(this.searchTerm);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2={"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState$NoResultsNoTeamHelp;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "searchTerm", "", "(Ljava/lang/String;)V", "getSearchTerm", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class NoResultsNoTeamHelp
    extends ArticleSearchState {
        public static final int $stable = 0;
        @NotNull
        private final String searchTerm;

        public NoResultsNoTeamHelp(@NotNull String string2) {
            y.j(string2, "searchTerm");
            super(null);
            this.searchTerm = string2;
        }

        public static /* synthetic */ NoResultsNoTeamHelp copy$default(NoResultsNoTeamHelp noResultsNoTeamHelp, String string2, int n10, Object object) {
            if ((n10 & 1) != 0) {
                string2 = noResultsNoTeamHelp.searchTerm;
            }
            return noResultsNoTeamHelp.copy(string2);
        }

        @NotNull
        public final String component1() {
            return this.searchTerm;
        }

        @NotNull
        public final NoResultsNoTeamHelp copy(@NotNull String string2) {
            y.j(string2, "searchTerm");
            return new NoResultsNoTeamHelp(string2);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof NoResultsNoTeamHelp)) {
                return false;
            }
            object = (NoResultsNoTeamHelp)object;
            return y.e(this.searchTerm, ((NoResultsNoTeamHelp)object).searchTerm);
        }

        @NotNull
        public final String getSearchTerm() {
            return this.searchTerm;
        }

        public int hashCode() {
            return this.searchTerm.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("NoResultsNoTeamHelp(searchTerm=");
            stringBuilder.append(this.searchTerm);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.runtime.internal.StabilityInferred
 */
package io.intercom.android.sdk.helpcenter.collections;

import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.collections.CollectionViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/CollectionListRow;", "", "()V", "BrowseAllHelpTopicsAsListItem", "CollectionRow", "FullHelpCenterRow", "SendMessageRow", "Lio/intercom/android/sdk/helpcenter/collections/CollectionListRow$BrowseAllHelpTopicsAsListItem;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionListRow$CollectionRow;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionListRow$FullHelpCenterRow;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionListRow$SendMessageRow;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
public abstract class CollectionListRow {
    private CollectionListRow() {
    }

    public /* synthetic */ CollectionListRow(p p14) {
        this();
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/CollectionListRow$BrowseAllHelpTopicsAsListItem;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionListRow;", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class BrowseAllHelpTopicsAsListItem
    extends CollectionListRow {
        public static final int $stable = 0;
        @NotNull
        public static final BrowseAllHelpTopicsAsListItem INSTANCE = new BrowseAllHelpTopicsAsListItem();

        private BrowseAllHelpTopicsAsListItem() {
            super(null);
        }
    }

    @Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/CollectionListRow$CollectionRow;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionListRow;", "rowData", "Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$CollectionRowData;", "(Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$CollectionRowData;)V", "getRowData", "()Lio/intercom/android/sdk/helpcenter/collections/CollectionViewState$CollectionRowData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class CollectionRow
    extends CollectionListRow {
        public static final int $stable = 0;
        @NotNull
        private final CollectionViewState.CollectionRowData rowData;

        public CollectionRow(@NotNull CollectionViewState.CollectionRowData collectionRowData) {
            y.j(collectionRowData, "rowData");
            super(null);
            this.rowData = collectionRowData;
        }

        public static /* synthetic */ CollectionRow copy$default(CollectionRow collectionRow, CollectionViewState.CollectionRowData collectionRowData, int n10, Object object) {
            if ((n10 & 1) != 0) {
                collectionRowData = collectionRow.rowData;
            }
            return collectionRow.copy(collectionRowData);
        }

        @NotNull
        public final CollectionViewState.CollectionRowData component1() {
            return this.rowData;
        }

        @NotNull
        public final CollectionRow copy(@NotNull CollectionViewState.CollectionRowData collectionRowData) {
            y.j(collectionRowData, "rowData");
            return new CollectionRow(collectionRowData);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof CollectionRow)) {
                return false;
            }
            object = (CollectionRow)object;
            return y.e(this.rowData, ((CollectionRow)object).rowData);
        }

        @NotNull
        public final CollectionViewState.CollectionRowData getRowData() {
            return this.rowData;
        }

        public int hashCode() {
            return this.rowData.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CollectionRow(rowData=");
            stringBuilder.append(this.rowData);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/CollectionListRow$FullHelpCenterRow;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionListRow;", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class FullHelpCenterRow
    extends CollectionListRow {
        public static final int $stable = 0;
        @NotNull
        public static final FullHelpCenterRow INSTANCE = new FullHelpCenterRow();

        private FullHelpCenterRow() {
            super(null);
        }
    }

    @Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2={"Lio/intercom/android/sdk/helpcenter/collections/CollectionListRow$SendMessageRow;", "Lio/intercom/android/sdk/helpcenter/collections/CollectionListRow;", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;)V", "getTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class SendMessageRow
    extends CollectionListRow {
        public static final int $stable = 8;
        @NotNull
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        public SendMessageRow(@NotNull ArticleViewState.TeamPresenceState teamPresenceState) {
            y.j(teamPresenceState, "teamPresenceState");
            super(null);
            this.teamPresenceState = teamPresenceState;
        }

        public static /* synthetic */ SendMessageRow copy$default(SendMessageRow sendMessageRow, ArticleViewState.TeamPresenceState teamPresenceState, int n10, Object object) {
            if ((n10 & 1) != 0) {
                teamPresenceState = sendMessageRow.teamPresenceState;
            }
            return sendMessageRow.copy(teamPresenceState);
        }

        @NotNull
        public final ArticleViewState.TeamPresenceState component1() {
            return this.teamPresenceState;
        }

        @NotNull
        public final SendMessageRow copy(@NotNull ArticleViewState.TeamPresenceState teamPresenceState) {
            y.j(teamPresenceState, "teamPresenceState");
            return new SendMessageRow(teamPresenceState);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof SendMessageRow)) {
                return false;
            }
            object = (SendMessageRow)object;
            return y.e(this.teamPresenceState, ((SendMessageRow)object).teamPresenceState);
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
            stringBuilder.append("SendMessageRow(teamPresenceState=");
            stringBuilder.append(this.teamPresenceState);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }
}


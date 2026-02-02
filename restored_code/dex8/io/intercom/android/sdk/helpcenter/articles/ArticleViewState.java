/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.ColorInt
 *  androidx.annotation.DrawableRes
 *  androidx.annotation.IdRes
 *  androidx.annotation.StringRes
 *  androidx.compose.runtime.internal.StabilityInferred
 */
package io.intercom.android.sdk.helpcenter.articles;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2={"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "", "()V", "Content", "ConversationState", "Error", "Initial", "ReactionState", "TeamPresenceState", "WebViewStatus", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Content;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Error;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Initial;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
public abstract class ArticleViewState {
    private ArticleViewState() {
    }

    public /* synthetic */ ArticleViewState(p p14) {
        this();
    }

    @Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2={"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Content;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "articleUrl", "", "articleId", "webViewStatus", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$WebViewStatus;", "reactionState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$WebViewStatus;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;)V", "getArticleId", "()Ljava/lang/String;", "getArticleUrl", "getReactionState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "getTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "getWebViewStatus", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$WebViewStatus;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class Content
    extends ArticleViewState {
        public static final int $stable = 8;
        @NotNull
        private final String articleId;
        @NotNull
        private final String articleUrl;
        @NotNull
        private final ReactionState reactionState;
        @NotNull
        private final TeamPresenceState teamPresenceState;
        @NotNull
        private final WebViewStatus webViewStatus;

        public Content(@NotNull String string2, @NotNull String string3, @NotNull WebViewStatus webViewStatus, @NotNull ReactionState reactionState, @NotNull TeamPresenceState teamPresenceState) {
            y.j(string2, "articleUrl");
            y.j(string3, "articleId");
            y.j((Object)webViewStatus, "webViewStatus");
            y.j(reactionState, "reactionState");
            y.j(teamPresenceState, "teamPresenceState");
            super(null);
            this.articleUrl = string2;
            this.articleId = string3;
            this.webViewStatus = webViewStatus;
            this.reactionState = reactionState;
            this.teamPresenceState = teamPresenceState;
        }

        public static /* synthetic */ Content copy$default(Content content, String string2, String string3, WebViewStatus webViewStatus, ReactionState reactionState, TeamPresenceState teamPresenceState, int n10, Object object) {
            if ((n10 & 1) != 0) {
                string2 = content.articleUrl;
            }
            if ((n10 & 2) != 0) {
                string3 = content.articleId;
            }
            if ((n10 & 4) != 0) {
                webViewStatus = content.webViewStatus;
            }
            if ((n10 & 8) != 0) {
                reactionState = content.reactionState;
            }
            if ((n10 & 0x10) != 0) {
                teamPresenceState = content.teamPresenceState;
            }
            return content.copy(string2, string3, webViewStatus, reactionState, teamPresenceState);
        }

        @NotNull
        public final String component1() {
            return this.articleUrl;
        }

        @NotNull
        public final String component2() {
            return this.articleId;
        }

        @NotNull
        public final WebViewStatus component3() {
            return this.webViewStatus;
        }

        @NotNull
        public final ReactionState component4() {
            return this.reactionState;
        }

        @NotNull
        public final TeamPresenceState component5() {
            return this.teamPresenceState;
        }

        @NotNull
        public final Content copy(@NotNull String string2, @NotNull String string3, @NotNull WebViewStatus webViewStatus, @NotNull ReactionState reactionState, @NotNull TeamPresenceState teamPresenceState) {
            y.j(string2, "articleUrl");
            y.j(string3, "articleId");
            y.j((Object)webViewStatus, "webViewStatus");
            y.j(reactionState, "reactionState");
            y.j(teamPresenceState, "teamPresenceState");
            return new Content(string2, string3, webViewStatus, reactionState, teamPresenceState);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Content)) {
                return false;
            }
            object = (Content)object;
            if (!y.e(this.articleUrl, ((Content)object).articleUrl)) {
                return false;
            }
            if (!y.e(this.articleId, ((Content)object).articleId)) {
                return false;
            }
            if (this.webViewStatus != ((Content)object).webViewStatus) {
                return false;
            }
            if (!y.e(this.reactionState, ((Content)object).reactionState)) {
                return false;
            }
            return y.e(this.teamPresenceState, ((Content)object).teamPresenceState);
        }

        @NotNull
        public final String getArticleId() {
            return this.articleId;
        }

        @NotNull
        public final String getArticleUrl() {
            return this.articleUrl;
        }

        @NotNull
        public final ReactionState getReactionState() {
            return this.reactionState;
        }

        @NotNull
        public final TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        @NotNull
        public final WebViewStatus getWebViewStatus() {
            return this.webViewStatus;
        }

        public int hashCode() {
            return (((this.articleUrl.hashCode() * 31 + this.articleId.hashCode()) * 31 + ((Object)((Object)this.webViewStatus)).hashCode()) * 31 + this.reactionState.hashCode()) * 31 + this.teamPresenceState.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Content(articleUrl=");
            stringBuilder.append(this.articleUrl);
            stringBuilder.append(", articleId=");
            stringBuilder.append(this.articleId);
            stringBuilder.append(", webViewStatus=");
            stringBuilder.append((Object)this.webViewStatus);
            stringBuilder.append(", reactionState=");
            stringBuilder.append(this.reactionState);
            stringBuilder.append(", teamPresenceState=");
            stringBuilder.append(this.teamPresenceState);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2={"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;", "", "conversationId", "", "lastParticipatingAdmin", "Lio/intercom/android/sdk/models/LastParticipatingAdmin;", "(Ljava/lang/String;Lio/intercom/android/sdk/models/LastParticipatingAdmin;)V", "getConversationId", "()Ljava/lang/String;", "getLastParticipatingAdmin", "()Lio/intercom/android/sdk/models/LastParticipatingAdmin;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class ConversationState {
        public static final int $stable = 8;
        @NotNull
        private final String conversationId;
        @NotNull
        private final LastParticipatingAdmin lastParticipatingAdmin;

        public ConversationState(@NotNull String string2, @NotNull LastParticipatingAdmin lastParticipatingAdmin) {
            y.j(string2, "conversationId");
            y.j(lastParticipatingAdmin, "lastParticipatingAdmin");
            this.conversationId = string2;
            this.lastParticipatingAdmin = lastParticipatingAdmin;
        }

        public static /* synthetic */ ConversationState copy$default(ConversationState conversationState, String string2, LastParticipatingAdmin lastParticipatingAdmin, int n10, Object object) {
            if ((n10 & 1) != 0) {
                string2 = conversationState.conversationId;
            }
            if ((n10 & 2) != 0) {
                lastParticipatingAdmin = conversationState.lastParticipatingAdmin;
            }
            return conversationState.copy(string2, lastParticipatingAdmin);
        }

        @NotNull
        public final String component1() {
            return this.conversationId;
        }

        @NotNull
        public final LastParticipatingAdmin component2() {
            return this.lastParticipatingAdmin;
        }

        @NotNull
        public final ConversationState copy(@NotNull String string2, @NotNull LastParticipatingAdmin lastParticipatingAdmin) {
            y.j(string2, "conversationId");
            y.j(lastParticipatingAdmin, "lastParticipatingAdmin");
            return new ConversationState(string2, lastParticipatingAdmin);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof ConversationState)) {
                return false;
            }
            object = (ConversationState)object;
            if (!y.e(this.conversationId, ((ConversationState)object).conversationId)) {
                return false;
            }
            return y.e(this.lastParticipatingAdmin, ((ConversationState)object).lastParticipatingAdmin);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final LastParticipatingAdmin getLastParticipatingAdmin() {
            return this.lastParticipatingAdmin;
        }

        public int hashCode() {
            return this.conversationId.hashCode() * 31 + this.lastParticipatingAdmin.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ConversationState(conversationId=");
            stringBuilder.append(this.conversationId);
            stringBuilder.append(", lastParticipatingAdmin=");
            stringBuilder.append(this.lastParticipatingAdmin);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0016"}, d2={"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Error;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "message", "", "retryButtonVisibility", "retryButtonPrimaryColor", "(III)V", "getMessage", "()I", "getRetryButtonPrimaryColor", "getRetryButtonVisibility", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class Error
    extends ArticleViewState {
        public static final int $stable = 0;
        private final int message;
        private final int retryButtonPrimaryColor;
        private final int retryButtonVisibility;

        public Error(@StringRes int n10, int n13, int n14) {
            super(null);
            this.message = n10;
            this.retryButtonVisibility = n13;
            this.retryButtonPrimaryColor = n14;
        }

        public static /* synthetic */ Error copy$default(Error error, int n10, int n13, int n14, int n15, Object object) {
            if ((n15 & 1) != 0) {
                n10 = error.message;
            }
            if ((n15 & 2) != 0) {
                n13 = error.retryButtonVisibility;
            }
            if ((n15 & 4) != 0) {
                n14 = error.retryButtonPrimaryColor;
            }
            return error.copy(n10, n13, n14);
        }

        public final int component1() {
            return this.message;
        }

        public final int component2() {
            return this.retryButtonVisibility;
        }

        public final int component3() {
            return this.retryButtonPrimaryColor;
        }

        @NotNull
        public final Error copy(@StringRes int n10, int n13, int n14) {
            return new Error(n10, n13, n14);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Error)) {
                return false;
            }
            object = (Error)object;
            if (this.message != ((Error)object).message) {
                return false;
            }
            if (this.retryButtonVisibility != ((Error)object).retryButtonVisibility) {
                return false;
            }
            return this.retryButtonPrimaryColor == ((Error)object).retryButtonPrimaryColor;
        }

        public final int getMessage() {
            return this.message;
        }

        public final int getRetryButtonPrimaryColor() {
            return this.retryButtonPrimaryColor;
        }

        public final int getRetryButtonVisibility() {
            return this.retryButtonVisibility;
        }

        public int hashCode() {
            return (this.message * 31 + this.retryButtonVisibility) * 31 + this.retryButtonPrimaryColor;
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error(message=");
            stringBuilder.append(this.message);
            stringBuilder.append(", retryButtonVisibility=");
            stringBuilder.append(this.retryButtonVisibility);
            stringBuilder.append(", retryButtonPrimaryColor=");
            stringBuilder.append(this.retryButtonPrimaryColor);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Initial;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class Initial
    extends ArticleViewState {
        public static final int $stable = 0;
        @NotNull
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    @Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001a"}, d2={"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "", "reactionComponentVisibility", "", "transitionState", "teamHelpVisibility", "shouldScrollToBottom", "", "(IIIZ)V", "getReactionComponentVisibility", "()I", "getShouldScrollToBottom", "()Z", "getTeamHelpVisibility", "getTransitionState", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class ReactionState {
        public static final int $stable = 0;
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private static final ReactionState defaultReactionState = new ReactionState(8, R.id.start, 8, false);
        private final int reactionComponentVisibility;
        private final boolean shouldScrollToBottom;
        private final int teamHelpVisibility;
        private final int transitionState;

        public ReactionState(int n10, @IdRes int n13, int n14, boolean bl2) {
            this.reactionComponentVisibility = n10;
            this.transitionState = n13;
            this.teamHelpVisibility = n14;
            this.shouldScrollToBottom = bl2;
        }

        public static /* synthetic */ ReactionState copy$default(ReactionState reactionState, int n10, int n13, int n14, boolean bl2, int n15, Object object) {
            if ((n15 & 1) != 0) {
                n10 = reactionState.reactionComponentVisibility;
            }
            if ((n15 & 2) != 0) {
                n13 = reactionState.transitionState;
            }
            if ((n15 & 4) != 0) {
                n14 = reactionState.teamHelpVisibility;
            }
            if ((n15 & 8) != 0) {
                bl2 = reactionState.shouldScrollToBottom;
            }
            return reactionState.copy(n10, n13, n14, bl2);
        }

        public final int component1() {
            return this.reactionComponentVisibility;
        }

        public final int component2() {
            return this.transitionState;
        }

        public final int component3() {
            return this.teamHelpVisibility;
        }

        public final boolean component4() {
            return this.shouldScrollToBottom;
        }

        @NotNull
        public final ReactionState copy(int n10, @IdRes int n13, int n14, boolean bl2) {
            return new ReactionState(n10, n13, n14, bl2);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof ReactionState)) {
                return false;
            }
            object = (ReactionState)object;
            if (this.reactionComponentVisibility != ((ReactionState)object).reactionComponentVisibility) {
                return false;
            }
            if (this.transitionState != ((ReactionState)object).transitionState) {
                return false;
            }
            if (this.teamHelpVisibility != ((ReactionState)object).teamHelpVisibility) {
                return false;
            }
            return this.shouldScrollToBottom == ((ReactionState)object).shouldScrollToBottom;
        }

        public final int getReactionComponentVisibility() {
            return this.reactionComponentVisibility;
        }

        public final boolean getShouldScrollToBottom() {
            return this.shouldScrollToBottom;
        }

        public final int getTeamHelpVisibility() {
            return this.teamHelpVisibility;
        }

        public final int getTransitionState() {
            return this.transitionState;
        }

        public int hashCode() {
            int n10;
            int n13 = this.reactionComponentVisibility;
            int n14 = this.transitionState;
            int n15 = this.teamHelpVisibility;
            int n16 = n10 = this.shouldScrollToBottom;
            if (n10 != 0) {
                n16 = 1;
            }
            return ((n13 * 31 + n14) * 31 + n15) * 31 + n16;
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ReactionState(reactionComponentVisibility=");
            stringBuilder.append(this.reactionComponentVisibility);
            stringBuilder.append(", transitionState=");
            stringBuilder.append(this.transitionState);
            stringBuilder.append(", teamHelpVisibility=");
            stringBuilder.append(this.teamHelpVisibility);
            stringBuilder.append(", shouldScrollToBottom=");
            stringBuilder.append(this.shouldScrollToBottom);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }

        @Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState$Companion;", "", "()V", "defaultReactionState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "getDefaultReactionState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(p p14) {
                this();
            }

            @NotNull
            public final ReactionState getDefaultReactionState() {
                return defaultReactionState;
            }
        }
    }

    @Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010'\u001a\u00020\u0007H\u00c6\u0003J\t\u0010(\u001a\u00020\u0007H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u000eH\u00c6\u0003Jx\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00100\u001a\u00020\u0007H\u00d6\u0001J\t\u00101\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 \u00a8\u00063"}, d2={"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "", "articleId", "", "conversationState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;", "subtitleText", "", "messageButtonText", "messageButtonIcon", "messageButtonColor", "metricPlace", "metricContext", "isFromSearchBrowse", "", "ctaData", "Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;", "(Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;Ljava/lang/Integer;IIILjava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;)V", "getArticleId", "()Ljava/lang/String;", "getConversationState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;", "getCtaData", "()Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;", "()Z", "getMessageButtonColor", "()I", "getMessageButtonIcon", "getMessageButtonText", "getMetricContext", "getMetricPlace", "getSubtitleText", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ConversationState;Ljava/lang/Integer;IIILjava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;)Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "equals", "other", "hashCode", "toString", "Companion", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class TeamPresenceState {
        public static final int $stable;
        @NotNull
        public static final Companion Companion;
        @NotNull
        private static final TeamPresenceState defaultTeamPresenceState;
        @NotNull
        private final String articleId;
        @Nullable
        private final ConversationState conversationState;
        @Nullable
        private final OpenMessengerResponse.NewConversationData.Cta ctaData;
        private final boolean isFromSearchBrowse;
        private final int messageButtonColor;
        private final int messageButtonIcon;
        private final int messageButtonText;
        @NotNull
        private final String metricContext;
        @NotNull
        private final String metricPlace;
        @Nullable
        private final Integer subtitleText;

        static {
            Companion = new Companion(null);
            $stable = 8;
            defaultTeamPresenceState = new TeamPresenceState("", null, R.string.intercom_the_team_can_help_if_needed, R.string.intercom_send_us_a_message, R.drawable.intercom_new_conversation_send_button, -16777216, "article", "style_human", false, null, 512, null);
        }

        public TeamPresenceState(@NotNull String string2, @Nullable ConversationState conversationState, @StringRes @Nullable Integer n10, @StringRes int n13, @DrawableRes int n14, @ColorInt int n15, @NotNull String string3, @NotNull String string4, boolean bl2, @Nullable OpenMessengerResponse.NewConversationData.Cta cta) {
            y.j(string2, "articleId");
            y.j(string3, "metricPlace");
            y.j(string4, "metricContext");
            this.articleId = string2;
            this.conversationState = conversationState;
            this.subtitleText = n10;
            this.messageButtonText = n13;
            this.messageButtonIcon = n14;
            this.messageButtonColor = n15;
            this.metricPlace = string3;
            this.metricContext = string4;
            this.isFromSearchBrowse = bl2;
            this.ctaData = cta;
        }

        public /* synthetic */ TeamPresenceState(String string2, ConversationState conversationState, Integer n10, int n13, int n14, int n15, String string3, String string4, boolean bl2, OpenMessengerResponse.NewConversationData.Cta cta, int n16, p p14) {
            if ((n16 & 0x100) != 0) {
                bl2 = false;
            }
            if ((n16 & 0x200) != 0) {
                cta = null;
            }
            this(string2, conversationState, n10, n13, n14, n15, string3, string4, bl2, cta);
        }

        public static /* synthetic */ TeamPresenceState copy$default(TeamPresenceState teamPresenceState, String string2, ConversationState conversationState, Integer n10, int n13, int n14, int n15, String string3, String string4, boolean bl2, OpenMessengerResponse.NewConversationData.Cta cta, int n16, Object object) {
            block9: {
                if ((n16 & 1) != 0) {
                    string2 = teamPresenceState.articleId;
                }
                if ((n16 & 2) != 0) {
                    conversationState = teamPresenceState.conversationState;
                }
                if ((n16 & 4) != 0) {
                    n10 = teamPresenceState.subtitleText;
                }
                if ((n16 & 8) != 0) {
                    n13 = teamPresenceState.messageButtonText;
                }
                if ((n16 & 0x10) != 0) {
                    n14 = teamPresenceState.messageButtonIcon;
                }
                if ((n16 & 0x20) != 0) {
                    n15 = teamPresenceState.messageButtonColor;
                }
                if ((n16 & 0x40) != 0) {
                    string3 = teamPresenceState.metricPlace;
                }
                if ((n16 & 0x80) != 0) {
                    string4 = teamPresenceState.metricContext;
                }
                if ((n16 & 0x100) != 0) {
                    bl2 = teamPresenceState.isFromSearchBrowse;
                }
                if ((n16 & 0x200) == 0) break block9;
                cta = teamPresenceState.ctaData;
            }
            return teamPresenceState.copy(string2, conversationState, n10, n13, n14, n15, string3, string4, bl2, cta);
        }

        @NotNull
        public final String component1() {
            return this.articleId;
        }

        @Nullable
        public final OpenMessengerResponse.NewConversationData.Cta component10() {
            return this.ctaData;
        }

        @Nullable
        public final ConversationState component2() {
            return this.conversationState;
        }

        @Nullable
        public final Integer component3() {
            return this.subtitleText;
        }

        public final int component4() {
            return this.messageButtonText;
        }

        public final int component5() {
            return this.messageButtonIcon;
        }

        public final int component6() {
            return this.messageButtonColor;
        }

        @NotNull
        public final String component7() {
            return this.metricPlace;
        }

        @NotNull
        public final String component8() {
            return this.metricContext;
        }

        public final boolean component9() {
            return this.isFromSearchBrowse;
        }

        @NotNull
        public final TeamPresenceState copy(@NotNull String string2, @Nullable ConversationState conversationState, @StringRes @Nullable Integer n10, @StringRes int n13, @DrawableRes int n14, @ColorInt int n15, @NotNull String string3, @NotNull String string4, boolean bl2, @Nullable OpenMessengerResponse.NewConversationData.Cta cta) {
            y.j(string2, "articleId");
            y.j(string3, "metricPlace");
            y.j(string4, "metricContext");
            return new TeamPresenceState(string2, conversationState, n10, n13, n14, n15, string3, string4, bl2, cta);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof TeamPresenceState)) {
                return false;
            }
            object = (TeamPresenceState)object;
            if (!y.e(this.articleId, ((TeamPresenceState)object).articleId)) {
                return false;
            }
            if (!y.e(this.conversationState, ((TeamPresenceState)object).conversationState)) {
                return false;
            }
            if (!y.e(this.subtitleText, ((TeamPresenceState)object).subtitleText)) {
                return false;
            }
            if (this.messageButtonText != ((TeamPresenceState)object).messageButtonText) {
                return false;
            }
            if (this.messageButtonIcon != ((TeamPresenceState)object).messageButtonIcon) {
                return false;
            }
            if (this.messageButtonColor != ((TeamPresenceState)object).messageButtonColor) {
                return false;
            }
            if (!y.e(this.metricPlace, ((TeamPresenceState)object).metricPlace)) {
                return false;
            }
            if (!y.e(this.metricContext, ((TeamPresenceState)object).metricContext)) {
                return false;
            }
            if (this.isFromSearchBrowse != ((TeamPresenceState)object).isFromSearchBrowse) {
                return false;
            }
            return y.e(this.ctaData, ((TeamPresenceState)object).ctaData);
        }

        @NotNull
        public final String getArticleId() {
            return this.articleId;
        }

        @Nullable
        public final ConversationState getConversationState() {
            return this.conversationState;
        }

        @Nullable
        public final OpenMessengerResponse.NewConversationData.Cta getCtaData() {
            return this.ctaData;
        }

        public final int getMessageButtonColor() {
            return this.messageButtonColor;
        }

        public final int getMessageButtonIcon() {
            return this.messageButtonIcon;
        }

        public final int getMessageButtonText() {
            return this.messageButtonText;
        }

        @NotNull
        public final String getMetricContext() {
            return this.metricContext;
        }

        @NotNull
        public final String getMetricPlace() {
            return this.metricPlace;
        }

        @Nullable
        public final Integer getSubtitleText() {
            return this.subtitleText;
        }

        public int hashCode() {
            int n10;
            int n13 = this.articleId.hashCode();
            Object object = this.conversationState;
            int n14 = 0;
            int n15 = object == null ? 0 : ((ConversationState)object).hashCode();
            object = this.subtitleText;
            int n16 = object == null ? 0 : object.hashCode();
            int n17 = this.messageButtonText;
            int n18 = this.messageButtonIcon;
            int n19 = this.messageButtonColor;
            int n23 = this.metricPlace.hashCode();
            int n24 = this.metricContext.hashCode();
            int n25 = n10 = this.isFromSearchBrowse;
            if (n10 != 0) {
                n25 = 1;
            }
            if ((object = this.ctaData) != null) {
                n14 = ((OpenMessengerResponse.NewConversationData.Cta)object).hashCode();
            }
            return ((((((((n13 * 31 + n15) * 31 + n16) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n23) * 31 + n24) * 31 + n25) * 31 + n14;
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TeamPresenceState(articleId=");
            stringBuilder.append(this.articleId);
            stringBuilder.append(", conversationState=");
            stringBuilder.append(this.conversationState);
            stringBuilder.append(", subtitleText=");
            stringBuilder.append(this.subtitleText);
            stringBuilder.append(", messageButtonText=");
            stringBuilder.append(this.messageButtonText);
            stringBuilder.append(", messageButtonIcon=");
            stringBuilder.append(this.messageButtonIcon);
            stringBuilder.append(", messageButtonColor=");
            stringBuilder.append(this.messageButtonColor);
            stringBuilder.append(", metricPlace=");
            stringBuilder.append(this.metricPlace);
            stringBuilder.append(", metricContext=");
            stringBuilder.append(this.metricContext);
            stringBuilder.append(", isFromSearchBrowse=");
            stringBuilder.append(this.isFromSearchBrowse);
            stringBuilder.append(", ctaData=");
            stringBuilder.append(this.ctaData);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }

        @Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState$Companion;", "", "()V", "defaultTeamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "getDefaultTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(p p14) {
                this();
            }

            @NotNull
            public final TeamPresenceState getDefaultTeamPresenceState() {
                return defaultTeamPresenceState;
            }
        }
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$WebViewStatus;", "", "(Ljava/lang/String;I)V", "Idle", "Loading", "Ready", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static enum WebViewStatus {
        Idle,
        Loading,
        Ready;

    }
}


/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.helpcenter.component;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.ActiveBot;
import io.intercom.android.sdk.models.TeamPresence;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0000\u00a8\u0006\f"}, d2={"computeViewState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "articleId", "", "currentState", "teamPresence", "Lio/intercom/android/sdk/models/TeamPresence;", "appConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "metricPlace", "isFromSearchBrowse", "", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0}, xi=48)
public final class TeammateHelpKt {
    @NotNull
    public static final ArticleViewState.TeamPresenceState computeViewState(@NotNull String string2, @NotNull ArticleViewState.TeamPresenceState teamPresenceState, @NotNull TeamPresence object, @NotNull AppConfig appConfig, @NotNull String string3, boolean bl2) {
        y.j(string2, "articleId");
        y.j(teamPresenceState, "currentState");
        y.j(object, "teamPresence");
        y.j(appConfig, "appConfig");
        y.j(string3, "metricPlace");
        int n10 = teamPresenceState.getMessageButtonText();
        int n13 = teamPresenceState.getMessageButtonIcon();
        Object object2 = teamPresenceState.getSubtitleText();
        object = ((TeamPresence)object).getActiveBot();
        if (object != null && ((ActiveBot)object).getUseBotUx()) {
            n10 = R.string.intercom_ask_a_question;
            n13 = R.drawable.intercom_conversation_card_question;
            object = appConfig.isAccessToTeammateEnabled() ? Integer.valueOf(R.string.intercom_the_team_can_help_if_needed) : null;
            object2 = "style_bot";
        } else {
            String string4 = "style_human";
            object = object2;
            object2 = string4;
        }
        return ArticleViewState.TeamPresenceState.copy$default(teamPresenceState, string2, null, (Integer)object, n10, n13, appConfig.getPrimaryColor(), string3, (String)object2, bl2, null, 514, null);
    }
}


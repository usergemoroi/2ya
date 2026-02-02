/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package io.intercom.android.sdk.actions;

import android.app.Activity;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.models.events.failure.FetchCarouselFailedEvent;

public class Actions {
    private static final Object NONE = "No Value";

    public static Action<Activity> activityPaused(Activity activity) {
        return new Action<Activity>(Action.Type.ACTIVITY_PAUSED, activity);
    }

    public static Action<Activity> activityReadyForViewAttachment(Activity activity) {
        return new Action<Activity>(Action.Type.ACTIVITY_READY_FOR_VIEW_ATTACHMENT, activity);
    }

    public static Action<Activity> activityStopped(Activity activity) {
        return new Action<Activity>(Action.Type.ACTIVITY_STOPPED, activity);
    }

    public static Action<Long> appEnteredBackground(long l10) {
        return new Action<Long>(Action.Type.APP_ENTERED_BACKGROUND, l10);
    }

    public static Action<Long> appEnteredForeground(long l10) {
        return new Action<Long>(Action.Type.APP_ENTERED_FOREGROUND, l10);
    }

    public static Action<BaseResponse> baseResponseReceived(BaseResponse baseResponse) {
        return new Action<BaseResponse>(Action.Type.BASE_RESPONSE_RECEIVED, baseResponse);
    }

    public static Action<?> carouselDismissed() {
        return Actions.noValueAction(Action.Type.CAROUSEL_DISMISSED);
    }

    public static Action<Conversation> conversationMarkedAsDismissed(Conversation conversation) {
        return new Action<Conversation>(Action.Type.CONVERSATION_MARKED_AS_DISMISSED, conversation);
    }

    public static Action<String> conversationMarkedAsRead(String string2) {
        return new Action<String>(Action.Type.CONVERSATION_MARKED_AS_READ, string2);
    }

    public static Action<Conversation> fetchConversationSuccess(Conversation conversation) {
        return new Action<Conversation>(Action.Type.FETCH_CONVERSATION_SUCCESS, conversation);
    }

    public static Action<?> hardReset() {
        return Actions.noValueAction(Action.Type.HARD_RESET);
    }

    public static Action<String> newCommentEventReceived(String string2) {
        return new Action<String>(Action.Type.NEW_COMMENT_EVENT_RECEIVED, string2);
    }

    private static Action<?> noValueAction(Action.Type type) {
        return new Action<Object>(type, NONE);
    }

    public static Action<?> openProgrammaticCarousel(String string2) {
        return new Action<String>(Action.Type.OPEN_PROGRAMMATIC_CAROUSEL, string2);
    }

    public static Action<?> programmaticCarouselError(FetchCarouselFailedEvent fetchCarouselFailedEvent) {
        return new Action<FetchCarouselFailedEvent>(Action.Type.PROGRAMMATIC_CAROUSEL_ERROR, fetchCarouselFailedEvent);
    }

    public static Action<?> programmaticCarouselLoading(String string2) {
        return new Action<String>(Action.Type.PROGRAMMATIC_CAROUSEL_LOADING, string2);
    }

    public static Action<?> programmaticCarouselSuccess(Carousel carousel) {
        return new Action<Carousel>(Action.Type.PROGRAMMATIC_CAROUSEL_SUCCESS, carousel);
    }

    public static Action<?> sessionStarted() {
        return Actions.noValueAction(Action.Type.SESSION_STARTED);
    }

    public static Action<Integer> setBottomPadding(int n10) {
        return new Action<Integer>(Action.Type.SET_BOTTOM_PADDING, n10);
    }

    public static Action<Intercom.Visibility> setInAppNotificationVisibility(Intercom.Visibility visibility) {
        return new Action<Intercom.Visibility>(Action.Type.SET_IN_APP_NOTIFICATION_VISIBILITY, visibility);
    }

    public static Action<Intercom.Visibility> setLauncherVisibility(Intercom.Visibility visibility) {
        return new Action<Intercom.Visibility>(Action.Type.SET_LAUNCHER_VISIBILITY, visibility);
    }

    public static Action<?> softReset() {
        return Actions.noValueAction(Action.Type.SOFT_RESET);
    }

    public static Action<UsersResponse> unreadConversationsSuccess(UsersResponse usersResponse) {
        return new Action<UsersResponse>(Action.Type.UNREAD_CONVERSATIONS_SUCCESS, usersResponse);
    }
}


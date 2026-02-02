/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.actions;

public final class Action<V> {
    private final Type type;
    private final V value;

    Action(Type type, V v14) {
        this.type = type;
        this.value = v14;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && Action.class == object.getClass()) {
            object = (Action)object;
            if (this.type != ((Action)object).type) {
                return false;
            }
            return this.value.equals(((Action)object).value);
        }
        return false;
    }

    public int hashCode() {
        return ((Object)((Object)this.type)).hashCode() * 31 + this.value.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((Object)((Object)this.type)).toString());
        stringBuilder.append(": ");
        stringBuilder.append(this.value.toString());
        return stringBuilder.toString();
    }

    public Type type() {
        return this.type;
    }

    public V value() {
        return this.value;
    }

    public static enum Type {
        ACTIVITY_PAUSED,
        ACTIVITY_READY_FOR_VIEW_ATTACHMENT,
        ACTIVITY_STOPPED,
        APP_ENTERED_BACKGROUND,
        APP_ENTERED_FOREGROUND,
        BASE_RESPONSE_RECEIVED,
        CONVERSATION_MARKED_AS_DISMISSED,
        CONVERSATION_MARKED_AS_READ,
        FETCH_CONVERSATION_SUCCESS,
        HARD_RESET,
        NEW_COMMENT_EVENT_RECEIVED,
        SESSION_STARTED,
        SET_LAUNCHER_VISIBILITY,
        SET_IN_APP_NOTIFICATION_VISIBILITY,
        SET_BOTTOM_PADDING,
        SOFT_RESET,
        UNREAD_CONVERSATIONS_SUCCESS,
        CAROUSEL_DISMISSED,
        OPEN_PROGRAMMATIC_CAROUSEL,
        PROGRAMMATIC_CAROUSEL_LOADING,
        PROGRAMMATIC_CAROUSEL_SUCCESS,
        PROGRAMMATIC_CAROUSEL_ERROR;

    }
}


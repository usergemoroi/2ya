/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.Nullable
 *  org.json.JSONObject
 */
package io.intercom.android.nexus;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.intercom.android.nexus.EventData;
import io.intercom.android.nexus.NexusEventType;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

public class NexusEvent {
    static final String ADMIN_AVATAR = "adminAvatar";
    static final String ADMIN_ID = "adminId";
    static final String ADMIN_NAME = "adminName";
    static final String ADMIN_TIMESTAMP = "adminTimestamp";
    static final String ASSIGNEE_ID = "assigneeId";
    static final String CONVERSATION_ID = "conversationId";
    static final String EVENT_DATA = "eventData";
    static final String EVENT_GUID = "eventGuid";
    static final String EVENT_NAME = "eventName";
    static final String NX_FROM_USER = "nx.FromUser";
    static final String NX_TOPICS = "nx.Topics";
    static final String NX_TO_USER = "nx.ToUser";
    static final String TOPIC_PREFIX_CONVERSATION = "conversation/";
    private final EventData eventData;
    private final NexusEventType eventType;
    private final String guid;
    private final List<String> topics;
    private final String userId;

    public NexusEvent(Builder object) {
        this.eventType = ((Builder)object).eventName;
        this.eventData = new EventData();
        Object object2 = ((Builder)object).eventData;
        if (object2 != null) {
            for (Object object3 : ((AbstractMap)object2).keySet()) {
                object2 = ((AbstractMap)((Builder)object).eventData).get(object3);
                if (object2 == null) continue;
                ((AbstractMap)this.eventData).put(object3, object2);
            }
        }
        this.topics = new ArrayList<String>();
        object2 = ((Builder)object).topics;
        if (object2 != null) {
            Object object3;
            object3 = object2.iterator();
            while (object3.hasNext()) {
                object2 = (String)object3.next();
                if (TextUtils.isEmpty((CharSequence)object2)) continue;
                this.topics.add((String)object2);
            }
        }
        this.guid = UUID.randomUUID().toString();
        object = ((Builder)object).userId;
        if (object == null) {
            object = "";
        }
        this.userId = object;
    }

    public NexusEvent(JSONObject jSONObject) {
        String string2;
        Iterator iterator;
        this.eventType = NexusEventType.safeValueOf(jSONObject.optString(EVENT_NAME));
        JSONObject jSONObject2 = jSONObject.optJSONObject(EVENT_DATA);
        if (jSONObject2 != null && jSONObject2.length() > 0) {
            this.eventData = new EventData(jSONObject2.length());
            iterator = jSONObject2.keys();
            while (iterator.hasNext()) {
                string2 = (String)iterator.next();
                Object object = jSONObject2.opt(string2);
                if (object == null) continue;
                ((AbstractMap)this.eventData).put(string2, object);
            }
        } else {
            this.eventData = new EventData();
        }
        this.topics = new ArrayList<String>();
        iterator = jSONObject.optJSONArray(NX_TOPICS);
        if (iterator != null) {
            for (int i14 = 0; i14 < iterator.length(); ++i14) {
                string2 = iterator.optString(i14);
                if (TextUtils.isEmpty((CharSequence)string2)) continue;
                this.topics.add(string2);
            }
        }
        this.guid = jSONObject.optString(EVENT_GUID);
        this.userId = jSONObject.has(NX_TO_USER) ? jSONObject.optString(NX_TO_USER) : jSONObject.optString(NX_FROM_USER);
    }

    private static List<String> conversationTopics(String charSequence) {
        String string2 = charSequence;
        if (TextUtils.isEmpty((CharSequence)charSequence)) {
            string2 = "new";
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(TOPIC_PREFIX_CONVERSATION);
        ((StringBuilder)charSequence).append(string2);
        return Collections.singletonList(((StringBuilder)charSequence).toString());
    }

    public static NexusEvent getAdminIsTypingEvent(String string2, String string3, String string4, String string5, String string6) {
        EventData eventData = new EventData(4);
        ((AbstractMap)eventData).put(CONVERSATION_ID, string2);
        ((AbstractMap)eventData).put(ADMIN_ID, string3);
        ((AbstractMap)eventData).put(ADMIN_NAME, string4);
        ((AbstractMap)eventData).put(ADMIN_AVATAR, string5);
        return new Builder(NexusEventType.AdminIsTyping).withEventData(eventData).withUserId(string6).withTopics(NexusEvent.conversationTopics(string2)).build();
    }

    public static NexusEvent getAdminIsTypingNoteEvent(String string2, String string3, String string4, String string5, String string6) {
        EventData eventData = new EventData(4);
        ((AbstractMap)eventData).put(ADMIN_ID, string3);
        ((AbstractMap)eventData).put(CONVERSATION_ID, string2);
        ((AbstractMap)eventData).put(ADMIN_NAME, string4);
        ((AbstractMap)eventData).put(ADMIN_AVATAR, string5);
        return new Builder(NexusEventType.AdminIsTypingANote).withEventData(eventData).withTopics(NexusEvent.conversationTopics(string2)).withUserId(string6).build();
    }

    public static NexusEvent getConversationAssignedEvent(String string2, String string3, String string4) {
        EventData eventData = new EventData(3);
        ((AbstractMap)eventData).put(ADMIN_ID, string3);
        ((AbstractMap)eventData).put(CONVERSATION_ID, string2);
        ((AbstractMap)eventData).put(ASSIGNEE_ID, string4);
        return new Builder(NexusEventType.ConversationAssigned).withEventData(eventData).build();
    }

    public static NexusEvent getConversationClosedEvent(String string2, String string3) {
        EventData eventData = new EventData(2);
        ((AbstractMap)eventData).put(ADMIN_ID, string3);
        ((AbstractMap)eventData).put(CONVERSATION_ID, string2);
        return new Builder(NexusEventType.ConversationClosed).withEventData(eventData).build();
    }

    public static NexusEvent getConversationPartTokenEvent(String string2, String string3) {
        EventData eventData = new EventData(1);
        ((AbstractMap)eventData).put(CONVERSATION_ID, string2);
        return new Builder(NexusEventType.ConversationPartToken).withEventData(eventData).withTopics(NexusEvent.conversationTopics(string2)).withUserId(string3).build();
    }

    public static NexusEvent getConversationReopenedEvent(String string2, String string3) {
        EventData eventData = new EventData(2);
        ((AbstractMap)eventData).put(ADMIN_ID, string3);
        ((AbstractMap)eventData).put(CONVERSATION_ID, string2);
        return new Builder(NexusEventType.ConversationReopened).withEventData(eventData).build();
    }

    public static NexusEvent getConversationSeenAdminEvent(String string2, String string3) {
        EventData eventData = new EventData(1);
        ((AbstractMap)eventData).put(CONVERSATION_ID, string2);
        return new Builder(NexusEventType.UserContentSeenByAdmin).withEventData(eventData).withTopics(NexusEvent.conversationTopics(string2)).withUserId(string3).build();
    }

    public static NexusEvent getConversationSeenEvent(String string2, String string3) {
        EventData eventData = new EventData(1);
        ((AbstractMap)eventData).put(CONVERSATION_ID, string2);
        return new Builder(NexusEventType.ConversationSeen).withEventData(eventData).withTopics(NexusEvent.conversationTopics(string2)).withUserId(string3).build();
    }

    public static NexusEvent getNewCommentEvent(String string2, String string3) {
        EventData eventData = new EventData(1);
        ((AbstractMap)eventData).put(CONVERSATION_ID, string2);
        return new Builder(NexusEventType.NewComment).withEventData(eventData).withTopics(NexusEvent.conversationTopics(string2)).withUserId(string3).build();
    }

    public static NexusEvent getNewContentEvent(String string2, long l10) {
        EventData eventData = new EventData(2);
        ((AbstractMap)eventData).put("entity_type", l10);
        ((AbstractMap)eventData).put("entity_id", string2);
        return new Builder(NexusEventType.NewContent).withEventData(eventData).build();
    }

    public static NexusEvent getNewNoteEvent(String string2, String string3) {
        EventData eventData = new EventData(2);
        ((AbstractMap)eventData).put(ADMIN_ID, string3);
        ((AbstractMap)eventData).put(CONVERSATION_ID, string2);
        return new Builder(NexusEventType.NewNote).withEventData(eventData).build();
    }

    public static NexusEvent getPingEvent() {
        return new Builder(NexusEventType.Ping).build();
    }

    public static NexusEvent getSubscribeEvent(List<String> list) {
        return new Builder(NexusEventType.Subscribe).withTopics(list).build();
    }

    public static NexusEvent getUnsubscribeEvent(List<String> list) {
        return new Builder(NexusEventType.Unsubscribe).withTopics(list).build();
    }

    public static NexusEvent getUserIsTypingEvent(String string2, String string3) {
        EventData eventData = new EventData(1);
        ((AbstractMap)eventData).put(CONVERSATION_ID, string2);
        return new Builder(NexusEventType.UserIsTyping).withEventData(eventData).withTopics(NexusEvent.conversationTopics(string2)).withUserId(string3).build();
    }

    public static NexusEvent getUserPresenceEvent() {
        return new Builder(NexusEventType.UserPresence).build();
    }

    public EventData getEventData() {
        return this.eventData;
    }

    public NexusEventType getEventType() {
        return this.eventType;
    }

    public String getGuid() {
        return this.guid;
    }

    public List<String> getTopics() {
        return this.topics;
    }

    public String getUserId() {
        return this.userId;
    }

    public String toStringEncodedJsonObject() {
        return this.eventType.toStringEncodedJsonObject(this);
    }

    public static class Builder {
        @Nullable
        EventData eventData;
        final NexusEventType eventName;
        @Nullable
        List<String> topics;
        @Nullable
        String userId;

        Builder(NexusEventType nexusEventType) {
            this.eventName = nexusEventType;
        }

        public NexusEvent build() {
            return new NexusEvent(this);
        }

        public Builder withEventData(EventData eventData) {
            this.eventData = eventData;
            return this;
        }

        public Builder withTopics(List<String> list) {
            this.topics = list;
            return this;
        }

        public Builder withUserId(String string2) {
            this.userId = string2;
            return this;
        }
    }
}


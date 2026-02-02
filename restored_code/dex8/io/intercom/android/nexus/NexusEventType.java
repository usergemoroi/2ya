/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.intercom.android.nexus;

import io.intercom.android.nexus.NexusEvent;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NexusEventType
extends Enum<NexusEventType> {
    private static final NexusEventType[] $VALUES;
    public static final /* enum */ NexusEventType AdminIsTyping;
    public static final /* enum */ NexusEventType AdminIsTypingANote;
    public static final /* enum */ NexusEventType ConversationAssigned;
    public static final /* enum */ NexusEventType ConversationClosed;
    public static final /* enum */ NexusEventType ConversationPartToken;
    public static final /* enum */ NexusEventType ConversationReopened;
    public static final /* enum */ NexusEventType ConversationSeen;
    public static final /* enum */ NexusEventType NewComment;
    public static final /* enum */ NexusEventType NewContent;
    public static final /* enum */ NexusEventType NewNote;
    public static final /* enum */ NexusEventType Ping;
    public static final /* enum */ NexusEventType Subscribe;
    public static final /* enum */ NexusEventType ThreadAssigned;
    public static final /* enum */ NexusEventType ThreadClosed;
    public static final /* enum */ NexusEventType ThreadCreated;
    public static final /* enum */ NexusEventType ThreadReopened;
    public static final /* enum */ NexusEventType ThreadUpdated;
    public static final /* enum */ NexusEventType UNKNOWN;
    public static final /* enum */ NexusEventType Unsubscribe;
    public static final /* enum */ NexusEventType UserContentSeenByAdmin;
    public static final /* enum */ NexusEventType UserIsTyping;
    public static final /* enum */ NexusEventType UserPresence;

    static {
        NexusEventType nexusEventType;
        NexusEventType nexusEventType2;
        NexusEventType nexusEventType3;
        NexusEventType nexusEventType4;
        NexusEventType nexusEventType5;
        NexusEventType nexusEventType6;
        NexusEventType nexusEventType7;
        NexusEventType nexusEventType8;
        NexusEventType nexusEventType9;
        NexusEventType nexusEventType10;
        NexusEventType nexusEventType11;
        NexusEventType nexusEventType12;
        NexusEventType nexusEventType13;
        NexusEventType nexusEventType14;
        NexusEventType nexusEventType15;
        NexusEventType nexusEventType16;
        NexusEventType nexusEventType17;
        NexusEventType nexusEventType18;
        NexusEventType nexusEventType19;
        NexusEventType nexusEventType20;
        NexusEventType nexusEventType21;
        NexusEventType nexusEventType22;
        NewComment = nexusEventType22 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = super.toJsonObject(nexusEvent);
                jSONObject.put("nx.ToUser", (Object)nexusEvent.getUserId());
                return jSONObject;
            }
        };
        NewContent = nexusEventType21 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = super.toJsonObject(nexusEvent);
                jSONObject.put("nx.ToUser", (Object)nexusEvent.getUserId());
                return jSONObject;
            }
        };
        ConversationSeen = nexusEventType20 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = super.toJsonObject(nexusEvent);
                jSONObject.put("nx.FromUser", (Object)nexusEvent.getUserId());
                return jSONObject;
            }
        };
        UserIsTyping = nexusEventType19 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = super.toJsonObject(nexusEvent);
                jSONObject.put("nx.FromUser", (Object)nexusEvent.getUserId());
                return jSONObject;
            }
        };
        AdminIsTyping = nexusEventType18 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = super.toJsonObject(nexusEvent);
                JSONObject jSONObject2 = jSONObject.optJSONObject("eventData");
                jSONObject2.put("adminName", (Object)nexusEvent.getEventData().optString("adminName"));
                jSONObject2.put("adminId", (Object)nexusEvent.getEventData().optString("adminId"));
                jSONObject2.put("adminAvatar", (Object)nexusEvent.getEventData().optString("adminAvatar"));
                jSONObject.put("nx.ToUser", (Object)nexusEvent.getUserId());
                return jSONObject;
            }
        };
        AdminIsTypingANote = nexusEventType17 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = super.toJsonObject(nexusEvent);
                JSONObject jSONObject2 = jSONObject.optJSONObject("eventData");
                jSONObject2.put("adminName", (Object)nexusEvent.getEventData().optString("adminName"));
                jSONObject2.put("adminId", (Object)nexusEvent.getEventData().optString("adminId"));
                jSONObject2.put("adminAvatar", (Object)nexusEvent.getEventData().optString("adminAvatar"));
                jSONObject.put("nx.ToUser", (Object)nexusEvent.getUserId());
                return jSONObject;
            }
        };
        NewNote = nexusEventType16 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = super.toJsonObject(nexusEvent);
                jSONObject.optJSONObject("eventData").put("adminId", (Object)nexusEvent.getEventData().optString("adminId"));
                return jSONObject;
            }
        };
        ConversationAssigned = nexusEventType15 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = super.toJsonObject(nexusEvent);
                JSONObject jSONObject2 = jSONObject.optJSONObject("eventData");
                jSONObject2.put("adminId", (Object)nexusEvent.getEventData().optString("adminId"));
                jSONObject2.put("assigneeId", (Object)nexusEvent.getEventData().optString("assigneeId"));
                return jSONObject;
            }
        };
        ConversationClosed = nexusEventType14 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = super.toJsonObject(nexusEvent);
                jSONObject.optJSONObject("eventData").put("adminId", (Object)nexusEvent.getEventData().optString("adminId"));
                return jSONObject;
            }
        };
        ConversationReopened = nexusEventType13 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = super.toJsonObject(nexusEvent);
                jSONObject.getJSONObject("eventData").put("adminId", (Object)nexusEvent.getEventData().optString("adminId"));
                return jSONObject;
            }
        };
        UserPresence = nexusEventType12 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                nexusEvent = new JSONObject();
                jSONObject.put("eventGuid", (Object)UUID.randomUUID().toString());
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("nx.");
                stringBuilder.append(this.name());
                jSONObject.put("eventName", (Object)stringBuilder.toString());
                jSONObject.put("eventData", (Object)nexusEvent);
                return jSONObject;
            }
        };
        Ping = nexusEventType11 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                nexusEvent = new JSONObject();
                JSONObject jSONObject = new JSONObject();
                nexusEvent.put("eventGuid", UUID.randomUUID().toString());
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("nx.");
                stringBuilder.append(this.name());
                nexusEvent.put("eventName", stringBuilder.toString());
                nexusEvent.put("eventData", jSONObject);
                return nexusEvent;
            }
        };
        UserContentSeenByAdmin = nexusEventType10 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = super.toJsonObject(nexusEvent);
                jSONObject.put("nx.ToUser", (Object)nexusEvent.getUserId());
                return jSONObject;
            }
        };
        Subscribe = nexusEventType9 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                nexusEvent = super.toJsonObject(nexusEvent);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("nx.");
                stringBuilder.append(this.name());
                nexusEvent.put("eventName", stringBuilder.toString());
                return nexusEvent;
            }
        };
        Unsubscribe = nexusEventType8 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent object) throws JSONException {
                JSONObject jSONObject = super.toJsonObject((NexusEvent)object);
                object = new StringBuilder();
                ((StringBuilder)object).append("nx.");
                ((StringBuilder)object).append(this.name());
                jSONObject.put("eventName", (Object)((StringBuilder)object).toString());
                return jSONObject;
            }
        };
        ThreadAssigned = nexusEventType7 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = super.toJsonObject(nexusEvent);
                JSONObject jSONObject2 = jSONObject.optJSONObject("eventData");
                jSONObject2.put("adminId", (Object)nexusEvent.getEventData().optString("adminId"));
                jSONObject2.put("assigneeId", (Object)nexusEvent.getEventData().optString("assigneeId"));
                return jSONObject;
            }
        };
        ThreadClosed = nexusEventType6 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = super.toJsonObject(nexusEvent);
                jSONObject.optJSONObject("eventData").put("adminId", (Object)nexusEvent.getEventData().optString("adminId"));
                return jSONObject;
            }
        };
        ThreadReopened = nexusEventType5 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = super.toJsonObject(nexusEvent);
                jSONObject.getJSONObject("eventData").put("adminId", (Object)nexusEvent.getEventData().optString("adminId"));
                return jSONObject;
            }
        };
        ThreadUpdated = nexusEventType4 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = super.toJsonObject(nexusEvent);
                jSONObject.getJSONObject("eventData").put("adminId", (Object)nexusEvent.getEventData().optString("adminId"));
                return jSONObject;
            }
        };
        ThreadCreated = nexusEventType3 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = super.toJsonObject(nexusEvent);
                jSONObject.put("nx.ToUser", (Object)nexusEvent.getUserId());
                return jSONObject;
            }
        };
        ConversationPartToken = nexusEventType2 = new NexusEventType(){

            @Override
            protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
                JSONObject jSONObject = super.toJsonObject(nexusEvent);
                JSONObject jSONObject2 = jSONObject.getJSONObject("eventData");
                jSONObject2.put("blocks", ((AbstractMap)nexusEvent.getEventData()).get("blocks"));
                jSONObject2.put("partType", (Object)nexusEvent.getEventData().optString("partType"));
                jSONObject2.put("clientAssignedUuid", (Object)nexusEvent.getEventData().optString("clientAssignedUuid"));
                jSONObject2.put("tokenSequenceIndex", (Object)nexusEvent.getEventData().optString("tokenSequenceIndex"));
                return jSONObject;
            }
        };
        UNKNOWN = nexusEventType = new NexusEventType(){

            @Override
            protected String toStringEncodedJsonObject(NexusEvent nexusEvent) {
                return "";
            }
        };
        $VALUES = new NexusEventType[]{nexusEventType22, nexusEventType21, nexusEventType20, nexusEventType19, nexusEventType18, nexusEventType17, nexusEventType16, nexusEventType15, nexusEventType14, nexusEventType13, nexusEventType12, nexusEventType11, nexusEventType10, nexusEventType9, nexusEventType8, nexusEventType7, nexusEventType6, nexusEventType5, nexusEventType4, nexusEventType3, nexusEventType2, nexusEventType};
    }

    public static NexusEventType safeValueOf(String object) {
        try {
            object = NexusEventType.valueOf(object);
            return object;
        }
        catch (Exception exception) {
            return UNKNOWN;
        }
    }

    public static NexusEventType valueOf(String string2) {
        return Enum.valueOf(NexusEventType.class, string2);
    }

    public static NexusEventType[] values() {
        return (NexusEventType[])$VALUES.clone();
    }

    protected JSONObject toJsonObject(NexusEvent object) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("conversationId", (Object)((NexusEvent)object).getEventData().optString("conversationId"));
        jSONObject.put("eventGuid", (Object)((NexusEvent)object).getGuid());
        jSONObject.put("eventName", (Object)this.name());
        jSONObject.put("eventData", (Object)jSONObject2);
        object = ((NexusEvent)object).getTopics();
        if (!object.isEmpty()) {
            jSONObject.put("nx.Topics", (Object)new JSONArray((Collection)object));
        }
        return jSONObject;
    }

    protected String toStringEncodedJsonObject(NexusEvent object) {
        try {
            object = this.toJsonObject((NexusEvent)object).toString();
            return object;
        }
        catch (JSONException jSONException) {
            return "";
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.activities;

import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.conversation.ReactionListener;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Reaction;

public class ConversationReactionListener
implements ReactionListener {
    private final Api api;
    private final String conversationId;
    private final MetricTracker.ReactionLocation location;
    private final MetricTracker metricTracker;
    private final String partId;

    public ConversationReactionListener(MetricTracker.ReactionLocation reactionLocation, String string2, String string3, Api api, MetricTracker metricTracker) {
        this.conversationId = string3;
        this.partId = string2;
        this.location = reactionLocation;
        this.api = api;
        this.metricTracker = metricTracker;
    }

    @Override
    public void onReactionSelected(Reaction reaction) {
        this.api.reactToConversation(this.conversationId, reaction.getIndex());
        this.metricTracker.sentReaction(this.conversationId, this.partId, reaction.getIndex(), this.location);
    }
}


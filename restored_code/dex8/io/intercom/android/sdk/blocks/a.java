/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.jvm.functions.a
 */
package io.intercom.android.sdk.blocks;

import android.content.Context;
import io.intercom.android.sdk.blocks.ConversationRatingCard;

public final class a
implements kotlin.jvm.functions.a {
    public final ConversationRatingCard c;
    public final Context d;

    public /* synthetic */ a(ConversationRatingCard conversationRatingCard, Context context) {
        this.c = conversationRatingCard;
        this.d = context;
    }

    public final Object invoke() {
        return ConversationRatingCard.a(this.c, this.d);
    }
}


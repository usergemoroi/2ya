/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.l
 */
package io.intercom.android.sdk.blocks.messengercard;

import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import kotlin.jvm.functions.l;

public final class a
implements l {
    public final CardWebView c;

    public /* synthetic */ a(CardWebView cardWebView) {
        this.c = cardWebView;
    }

    public final Object invoke(Object object) {
        return CardWebView.a(this.c, (IntercomEvent)object);
    }
}


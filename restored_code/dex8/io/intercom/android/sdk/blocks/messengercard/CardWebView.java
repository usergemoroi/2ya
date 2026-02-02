/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.webkit.WebView
 */
package io.intercom.android.sdk.blocks.messengercard;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.messengercard.a;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import kotlin.k0;
import kotlinx.coroutines.r0;

public class CardWebView
extends WebView {
    public CardWebView(Context context) {
        super(context);
    }

    public CardWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardWebView(Context context, AttributeSet attributeSet, int n10) {
        super(context, attributeSet, n10);
    }

    public static /* synthetic */ k0 a(CardWebView cardWebView, IntercomEvent intercomEvent) {
        return cardWebView.lambda$setUp$0(intercomEvent);
    }

    private /* synthetic */ k0 lambda$setUp$0(IntercomEvent intercomEvent) {
        if (intercomEvent == IntercomEvent.CardUpdated.INSTANCE) {
            this.reload();
        }
        return k0.a;
    }

    public void setUp() {
        Injector.get().getDataLayer().listenToEvents(r0.b(), new a(this));
    }
}


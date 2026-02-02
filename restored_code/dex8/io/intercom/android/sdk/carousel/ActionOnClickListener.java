/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package io.intercom.android.sdk.carousel;

import android.view.View;
import io.intercom.android.sdk.carousel.CarouselListener;
import io.intercom.android.sdk.models.carousel.ScreenAction;

class ActionOnClickListener
implements View.OnClickListener {
    private final CarouselListener listener;
    private final ScreenAction screenAction;

    ActionOnClickListener(ScreenAction screenAction, CarouselListener carouselListener) {
        this.screenAction = screenAction;
        this.listener = carouselListener;
    }

    public void onClick(View object) {
        int n10;
        block16: {
            if (this.screenAction.isPermissionAction()) {
                this.listener.requestPermissions(this.screenAction);
                return;
            }
            object = this.screenAction.getType();
            switch (((String)object).hashCode()) {
                default: {
                    break;
                }
                case 1671672458: {
                    if (!((String)object).equals("dismiss")) break;
                    n10 = 0;
                    break block16;
                }
                case 3532159: {
                    if (!((String)object).equals("skip")) break;
                    n10 = 3;
                    break block16;
                }
                case 3321850: {
                    if (!((String)object).equals("link")) break;
                    n10 = 1;
                    break block16;
                }
                case -567202649: {
                    if (!((String)object).equals("continue")) break;
                    n10 = 4;
                    break block16;
                }
                case -1573653227: {
                    if (!((String)object).equals("start_chat")) break;
                    n10 = 2;
                    break block16;
                }
            }
            n10 = -1;
        }
        if (n10 != 0) {
            if (n10 != 1) {
                if (n10 != 2) {
                    if (n10 != 3) {
                        this.listener.selectNextScreen("from_cta");
                    } else {
                        this.listener.skipPermissionScreen();
                    }
                } else {
                    this.listener.trackActionButtonTappedStats();
                    this.listener.startChat();
                }
            } else {
                this.listener.trackActionButtonTappedStats();
                this.listener.openLink(this.screenAction.getUri());
            }
        } else {
            this.listener.trackActionButtonTappedStats();
            this.listener.dismissCarousel("from_cta");
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.carousel;

import io.intercom.android.sdk.carousel.CarouselPresenter;
import io.intercom.android.sdk.state.ProgrammaticCarouselState;
import io.intercom.android.sdk.store.Store;

public final class a
implements Store.Subscriber {
    public final CarouselPresenter a;
    public final String b;

    public /* synthetic */ a(CarouselPresenter carouselPresenter, String string2) {
        this.a = carouselPresenter;
        this.b = string2;
    }

    public final void onStateChange(Object object) {
        CarouselPresenter.a(this.a, this.b, (ProgrammaticCarouselState)object);
    }
}


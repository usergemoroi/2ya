/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.carousel;

import io.intercom.android.sdk.models.carousel.Carousel;

public interface CarouselView {
    public void logEmptyCarouselError();

    public void logUserNotRegisteredError();

    public void showGenericError();

    public void showLoading();

    public void showNotFoundError();

    public void showSuccess(Carousel var1);
}


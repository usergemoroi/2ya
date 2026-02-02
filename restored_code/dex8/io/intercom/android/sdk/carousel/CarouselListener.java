/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.carousel;

import io.intercom.android.sdk.models.carousel.ScreenAction;

public interface CarouselListener {
    public void dismissCarousel(String var1);

    public void openLink(String var1);

    public void requestPermissions(ScreenAction var1);

    public void selectNextScreen(String var1);

    public void skipPermissionScreen();

    public void startChat();

    public void trackActionButtonTappedStats();
}


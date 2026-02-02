/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.blocks.lib;

import java.util.Locale;

public enum VideoProvider {
    YOUTUBE,
    VIMEO,
    WISTIA,
    LOOM,
    VIDYARD,
    BRIGHTCOVE,
    JWPLAYER,
    MICROSOFTSTREAM,
    SYNTHESIA,
    GUIDDE,
    DESCRIPT,
    UNKNOWN;

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static VideoProvider videoValueOf(String object) {
        void var0_2;
        VideoProvider videoProvider = UNKNOWN;
        try {
            VideoProvider videoProvider2 = VideoProvider.valueOf(((String)object).toUpperCase(Locale.ENGLISH));
            return var0_2;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            VideoProvider videoProvider3 = videoProvider;
            return var0_2;
        }
    }
}


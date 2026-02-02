/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 *  kotlin.text.p
 */
package io.intercom.android.sdk.blocks;

import io.intercom.android.sdk.blocks.lib.VideoProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import kotlin.r;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2={"ID_SEPARATOR", "", "getEmbedUrl", "provider", "Lio/intercom/android/sdk/blocks/lib/VideoProvider;", "joinedIds", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0}, xi=48)
public final class VideoUrlUtilKt {
    @NotNull
    private static final String ID_SEPARATOR = "|";

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NotNull
    public static final String getEmbedUrl(@NotNull VideoProvider object, @NotNull String string2) {
        y.j(object, "provider");
        y.j(string2, "joinedIds");
        List list = p.G0((CharSequence)string2, (String[])new String[]{ID_SEPARATOR}, (boolean)false, (int)0, (int)6, null);
        string2 = (String)t.r0((List)list);
        list = t.k0((Iterable)list, (int)1);
        switch (WhenMappings.$EnumSwitchMapping$0[((Enum)object).ordinal()]) {
            default: {
                throw new r();
            }
            case 12: {
                return "";
            }
            case 11: {
                object = new StringBuilder();
                ((StringBuilder)object).append("https://share.descript.com/embed/");
                ((StringBuilder)object).append(string2);
                return ((StringBuilder)object).toString();
            }
            case 10: {
                object = new StringBuilder();
                ((StringBuilder)object).append("https://embed.app.guidde.com/playbooks/");
                ((StringBuilder)object).append(string2);
                return ((StringBuilder)object).toString();
            }
            case 9: {
                object = new StringBuilder();
                ((StringBuilder)object).append("https://share.synthesia.io/embeds/videos/");
                ((StringBuilder)object).append(string2);
                return ((StringBuilder)object).toString();
            }
            case 8: {
                if (list.isEmpty()) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("https://web.microsoftstream.com/embed/video/");
                    ((StringBuilder)object).append(string2);
                    return ((StringBuilder)object).toString();
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("https://");
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append(".sharepoint.com/:v:/");
                ((StringBuilder)object).append((String)list.get(0));
                return ((StringBuilder)object).toString();
            }
            case 7: {
                object = new StringBuilder();
                ((StringBuilder)object).append("https://content.jwplatform.com/players/");
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append(".html");
                return ((StringBuilder)object).toString();
            }
            case 6: {
                object = new StringBuilder();
                ((StringBuilder)object).append("https://players.brightcove.net/");
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append("/default_default/index.html?videoId=");
                ((StringBuilder)object).append((String)list.get(0));
                return ((StringBuilder)object).toString();
            }
            case 5: {
                object = new StringBuilder();
                ((StringBuilder)object).append("https://play.vidyard.com/");
                ((StringBuilder)object).append(string2);
                return ((StringBuilder)object).toString();
            }
            case 4: {
                object = new StringBuilder();
                ((StringBuilder)object).append("https://www.loom.com/embed/");
                ((StringBuilder)object).append(string2);
                return ((StringBuilder)object).toString();
            }
            case 3: {
                object = new StringBuilder();
                ((StringBuilder)object).append("https://fast.wistia.net/embed/iframe/");
                ((StringBuilder)object).append(string2);
                return ((StringBuilder)object).toString();
            }
            case 2: {
                if (list.isEmpty()) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("https://player.vimeo.com/video/");
                    ((StringBuilder)object).append(string2);
                    return ((StringBuilder)object).toString();
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("https://player.vimeo.com/video/");
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append("?h=");
                ((StringBuilder)object).append((String)list.get(0));
                return ((StringBuilder)object).toString();
            }
            case 1: {
                object = new StringBuilder();
                ((StringBuilder)object).append("https://www.youtube.com/embed/");
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append("?rel=0");
                return ((StringBuilder)object).toString();
            }
        }
    }

    @Metadata(k=3, mv={1, 8, 0}, xi=48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        static {
            int[] nArray = new int[VideoProvider.values().length];
            try {
                nArray[VideoProvider.YOUTUBE.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[VideoProvider.VIMEO.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[VideoProvider.WISTIA.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[VideoProvider.LOOM.ordinal()] = 4;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[VideoProvider.VIDYARD.ordinal()] = 5;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[VideoProvider.BRIGHTCOVE.ordinal()] = 6;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[VideoProvider.JWPLAYER.ordinal()] = 7;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[VideoProvider.MICROSOFTSTREAM.ordinal()] = 8;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[VideoProvider.SYNTHESIA.ordinal()] = 9;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[VideoProvider.GUIDDE.ordinal()] = 10;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[VideoProvider.DESCRIPT.ordinal()] = 11;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[VideoProvider.UNKNOWN.ordinal()] = 12;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            $EnumSwitchMapping$0 = nArray;
        }
    }
}


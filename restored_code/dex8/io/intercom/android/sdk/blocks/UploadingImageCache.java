/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package io.intercom.android.sdk.blocks;

import android.net.Uri;
import io.intercom.android.sdk.GalleryImage;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class UploadingImageCache {
    private final Map<String, Uri> localImageUris;

    public UploadingImageCache() {
        this(new HashMap<String, Uri>());
    }

    UploadingImageCache(Map<String, Uri> map2) {
        this.localImageUris = map2;
    }

    @Nullable
    Uri getLocalImageUriForRemoteUrl(String string2) {
        return this.localImageUris.get(string2);
    }

    public void put(String string2, GalleryImage galleryImage) {
        this.localImageUris.put(string2, galleryImage.getUri());
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.identity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value=RetentionPolicy.SOURCE)
public @interface FeatureFlag {
    public static final String BLOCK_RENDERING_FALLBACK = "new-block-rendering-killswitch";
    public static final String DISABLE_ERROR_REPORTING = "disable-error-reporting";
    public static final String IMAGE_ANNOTATION = "image-annotation";
    public static final String POST_V2_RENDERING_ENABLED = "new-post-rendering-enabled";
}


/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value=RetentionPolicy.SOURCE)
public @interface SeenState {
    public static final String HIDE = "hide";
    public static final String SEEN = "seen";
    public static final String UNSEEN = "unseen";
}


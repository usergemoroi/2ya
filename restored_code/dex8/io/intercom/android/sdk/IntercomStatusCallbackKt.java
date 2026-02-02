/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk;

import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomStatusCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2={"noStatusCallback", "Lio/intercom/android/sdk/IntercomStatusCallback;", "getNoStatusCallback", "()Lio/intercom/android/sdk/IntercomStatusCallback;", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0}, xi=48)
public final class IntercomStatusCallbackKt {
    @NotNull
    private static final IntercomStatusCallback noStatusCallback = new IntercomStatusCallback(){

        public void onFailure(@NotNull IntercomError intercomError) {
            y.j(intercomError, "intercomError");
        }

        public void onSuccess() {
        }
    };

    @NotNull
    public static final IntercomStatusCallback getNoStatusCallback() {
        return noStatusCallback;
    }
}


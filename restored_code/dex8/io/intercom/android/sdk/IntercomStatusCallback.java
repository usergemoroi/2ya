/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk;

import io.intercom.android.sdk.IntercomError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2={"Lio/intercom/android/sdk/IntercomStatusCallback;", "", "Lkotlin/k0;", "onSuccess", "()V", "Lio/intercom/android/sdk/IntercomError;", "intercomError", "onFailure", "(Lio/intercom/android/sdk/IntercomError;)V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public interface IntercomStatusCallback {
    public void onFailure(@NotNull IntercomError var1);

    public void onSuccess();
}


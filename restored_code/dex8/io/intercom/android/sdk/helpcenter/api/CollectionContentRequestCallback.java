/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.helpcenter.api;

import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2={"Lio/intercom/android/sdk/helpcenter/api/CollectionContentRequestCallback;", "", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "response", "Lkotlin/k0;", "onComplete", "(Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;)V", "", "errorCode", "onError", "(I)V", "onFailure", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public interface CollectionContentRequestCallback {
    public void onComplete(@NotNull HelpCenterCollectionContent var1);

    public void onError(int var1);

    public void onFailure();
}


/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.helpcenter.api;

import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H&\u00a2\u0006\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2={"Lio/intercom/android/sdk/helpcenter/api/CollectionRequestCallback;", "", "", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "response", "Lkotlin/k0;", "onComplete", "(Ljava/util/List;)V", "", "errorCode", "onError", "(I)V", "onFailure", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public interface CollectionRequestCallback {
    public void onComplete(@NotNull List<HelpCenterCollection> var1);

    public void onError(int var1);

    public void onFailure();
}


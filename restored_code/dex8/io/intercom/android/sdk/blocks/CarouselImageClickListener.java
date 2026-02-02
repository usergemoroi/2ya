/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 */
package io.intercom.android.sdk.blocks;

import android.text.TextUtils;
import android.view.View;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.ImageClickListener;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2={"Lio/intercom/android/sdk/blocks/CarouselImageClickListener;", "Lio/intercom/android/sdk/blocks/ImageClickListener;", "", "imageUrl", "linkUrl", "Landroid/view/View;", "imageView", "", "width", "height", "Lkotlin/k0;", "onImageClicked", "(Ljava/lang/String;Ljava/lang/String;Landroid/view/View;II)V", "Lio/intercom/android/sdk/api/Api;", "api", "Lio/intercom/android/sdk/api/Api;", "<init>", "(Lio/intercom/android/sdk/api/Api;)V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class CarouselImageClickListener
implements ImageClickListener {
    @NotNull
    private final Api api;

    public CarouselImageClickListener(@NotNull Api api) {
        y.j(api, "api");
        this.api = api;
    }

    @Override
    public void onImageClicked(@NotNull String string2, @NotNull String string3, @NotNull View view, int n10, int n13) {
        y.j(string2, "imageUrl");
        y.j(string3, "linkUrl");
        y.j(view, "imageView");
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            LinkOpener.handleUrl(string3, view.getContext(), this.api);
        }
    }
}


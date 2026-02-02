/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.api;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.k0;
import okhttp3.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Url;

@Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001Ju\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2={"Lio/intercom/android/sdk/api/ExternalUploadApi;", "", "", "url", "Lokhttp3/y$c;", "key", "acl", "contentType", "accessKey", "policy", "signature", "successActionStatus", "filePart", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lkotlin/k0;", "uploadFileSuspended", "(Ljava/lang/String;Lokhttp3/y$c;Lokhttp3/y$c;Lokhttp3/y$c;Lokhttp3/y$c;Lokhttp3/y$c;Lokhttp3/y$c;Lokhttp3/y$c;Lokhttp3/y$c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public interface ExternalUploadApi {
    @Multipart
    @POST
    @Nullable
    public Object uploadFileSuspended(@Url @Nullable String var1, @Part @NotNull y.c var2, @Part @NotNull y.c var3, @Part @NotNull y.c var4, @Part @NotNull y.c var5, @Part @NotNull y.c var6, @Part @NotNull y.c var7, @Part @NotNull y.c var8, @Part @NotNull y.c var9, @NotNull d<? super NetworkResponse<k0>> var10);
}


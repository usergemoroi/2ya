/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.compose.runtime.internal.StabilityInferred
 */
package io.intercom.android.sdk.api;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import okhttp3.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\t\u0010\b\u00a8\u0006\f"}, d2={"Lio/intercom/android/sdk/api/IntercomFlipperClient;", "", "Lokhttp3/z$a;", "builder", "Landroid/content/Context;", "context", "Lkotlin/k0;", "addInterceptor", "(Lokhttp3/z$a;Landroid/content/Context;)V", "addDefaultFlipperInterceptor", "<init>", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@StabilityInferred(parameters=0)
public final class IntercomFlipperClient {
    public static final int $stable = 0;
    @NotNull
    public static final IntercomFlipperClient INSTANCE = new IntercomFlipperClient();

    private IntercomFlipperClient() {
    }

    public final void addDefaultFlipperInterceptor(@NotNull z.a a14, @NotNull Context context) {
        y.j(a14, "builder");
        y.j(context, "context");
    }

    public final void addInterceptor(@NotNull z.a a14, @NotNull Context context) {
        y.j(a14, "builder");
        y.j(context, "context");
    }
}


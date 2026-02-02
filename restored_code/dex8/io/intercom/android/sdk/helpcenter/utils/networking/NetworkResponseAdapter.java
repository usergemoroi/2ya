/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.helpcenter.utils.networking;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseCall;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import retrofit2.b;
import retrofit2.c;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00040\u0003B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0006\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ)\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2={"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponseAdapter;", "", "S", "Lretrofit2/c;", "Lretrofit2/b;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Ljava/lang/reflect/Type;", "responseType", "()Ljava/lang/reflect/Type;", "call", "adapt", "(Lretrofit2/b;)Lretrofit2/b;", "successType", "Ljava/lang/reflect/Type;", "<init>", "(Ljava/lang/reflect/Type;)V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class NetworkResponseAdapter<S>
implements c<S, b<NetworkResponse<? extends S>>> {
    @NotNull
    private final Type successType;

    public NetworkResponseAdapter(@NotNull Type type) {
        y.j(type, "successType");
        this.successType = type;
    }

    @Override
    @NotNull
    public b<NetworkResponse<S>> adapt(@NotNull b<S> b11) {
        y.j(b11, "call");
        return new NetworkResponseCall<S>(b11);
    }

    @Override
    @NotNull
    public Type responseType() {
        return this.successType;
    }
}


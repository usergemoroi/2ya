/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.helpcenter.utils.networking;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import okhttp3.b0;
import okio.m0;
import org.jetbrains.annotations.NotNull;
import retrofit2.b;
import retrofit2.d;
import retrofit2.z;

@Metadata(d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0005H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00018\u00008\u00000\u0000H\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0013H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u00a8\u0006 "}, d2={"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponseCall;", "", "S", "Lretrofit2/b;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lretrofit2/d;", "callback", "Lkotlin/k0;", "enqueue", "(Lretrofit2/d;)V", "", "isExecuted", "()Z", "kotlin.jvm.PlatformType", "clone", "()Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponseCall;", "isCanceled", "cancel", "()V", "Lretrofit2/z;", "execute", "()Lretrofit2/z;", "Lokhttp3/b0;", "request", "()Lokhttp3/b0;", "Lokio/m0;", "timeout", "()Lokio/m0;", "delegate", "Lretrofit2/b;", "<init>", "(Lretrofit2/b;)V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class NetworkResponseCall<S>
implements b<NetworkResponse<? extends S>> {
    @NotNull
    private final b<S> delegate;

    public NetworkResponseCall(@NotNull b<S> b11) {
        y.j(b11, "delegate");
        this.delegate = b11;
    }

    @Override
    public void cancel() {
        this.delegate.cancel();
    }

    @Override
    @NotNull
    public NetworkResponseCall<S> clone() {
        b<S> b11 = this.delegate.clone();
        y.i(b11, "delegate.clone()");
        return new NetworkResponseCall<S>(b11);
    }

    @Override
    public void enqueue(@NotNull d<NetworkResponse<S>> d14) {
        y.j(d14, "callback");
        this.delegate.enqueue(new d<S>(d14, this){
            final d<NetworkResponse<S>> $callback;
            final NetworkResponseCall<S> this$0;
            {
                this.$callback = d14;
                this.this$0 = networkResponseCall;
            }

            public void onFailure(@NotNull b<S> object, @NotNull Throwable throwable) {
                y.j(object, "call");
                y.j(throwable, "throwable");
                object = throwable instanceof IOException ? new NetworkResponse.NetworkError((IOException)throwable) : new NetworkResponse.ClientError(throwable);
                this.$callback.onResponse(this.this$0, z.g(object));
            }

            public void onResponse(@NotNull b<S> b11, @NotNull z<S> z13) {
                y.j(b11, "call");
                y.j(z13, "response");
                b11 = z13.a();
                int n10 = z13.b();
                if (z13.e()) {
                    if (b11 != null) {
                        this.$callback.onResponse(this.this$0, z.g(new NetworkResponse.Success<b<S>>(b11)));
                    } else {
                        this.$callback.onResponse(this.this$0, z.g(new NetworkResponse.ClientError(new Throwable())));
                    }
                } else {
                    this.$callback.onResponse(this.this$0, z.g(new NetworkResponse.ServerError(n10)));
                }
            }
        });
    }

    @NotNull
    public z<NetworkResponse<S>> execute() {
        throw new UnsupportedOperationException("NetworkResponseCall doesn't support execute");
    }

    @Override
    public boolean isCanceled() {
        return this.delegate.isCanceled();
    }

    @Override
    public boolean isExecuted() {
        return this.delegate.isExecuted();
    }

    @Override
    @NotNull
    public b0 request() {
        b0 b04 = this.delegate.request();
        y.i(b04, "delegate.request()");
        return b04;
    }

    @Override
    @NotNull
    public m0 timeout() {
        m0 m02 = this.delegate.timeout();
        y.i(m02, "delegate.timeout()");
        return m02;
    }
}


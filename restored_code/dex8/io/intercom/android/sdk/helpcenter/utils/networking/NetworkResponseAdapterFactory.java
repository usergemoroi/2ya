/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.helpcenter.utils.networking;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.a0;
import retrofit2.b;
import retrofit2.c;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\f\u0010\rJ8\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2={"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponseAdapterFactory;", "Lretrofit2/c$a;", "Ljava/lang/reflect/Type;", "returnType", "", "", "annotations", "Lretrofit2/a0;", "retrofit", "Lretrofit2/c;", "get", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/a0;)Lretrofit2/c;", "<init>", "()V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class NetworkResponseAdapterFactory
extends c.a {
    @Override
    @Nullable
    public c<?, ?> get(@NotNull Type type, @NotNull Annotation[] annotationArray, @NotNull a0 a04) {
        y.j(type, "returnType");
        y.j(annotationArray, "annotations");
        y.j(a04, "retrofit");
        if (!y.e(b.class, c.a.getRawType(type))) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            if (!y.e(c.a.getRawType(type = c.a.getParameterUpperBound(0, (ParameterizedType)type)), NetworkResponse.class)) {
                return null;
            }
            if (type instanceof ParameterizedType) {
                type = c.a.getParameterUpperBound(0, (ParameterizedType)type);
                y.i(type, "successBodyType");
                return new NetworkResponseAdapter(type);
            }
            throw new IllegalStateException("Response must be parameterized as NetworkResponse<Foo> or NetworkResponse<out Foo>".toString());
        }
        throw new IllegalStateException("return type must be parameterized as Call<NetworkResponse<<Foo>>".toString());
    }
}


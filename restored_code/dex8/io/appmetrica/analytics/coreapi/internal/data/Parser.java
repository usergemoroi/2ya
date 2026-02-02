/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.data;

import kotlin.Metadata;
import kotlin.u;
import kotlin.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00032\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\b"}, d2={"Lio/appmetrica/analytics/coreapi/internal/data/Parser;", "IN", "OUT", "", "parse", "rawData", "(Ljava/lang/Object;)Ljava/lang/Object;", "parseOrNull", "core-api_release"}, k=1, mv={1, 6, 0}, xi=48)
public interface Parser<IN, OUT> {
    @NotNull
    public OUT parse(IN var1);

    @Nullable
    public OUT parseOrNull(IN var1);

    @Metadata(k=3, mv={1, 6, 0}, xi=48)
    public static final class DefaultImpls {
        @Nullable
        public static <IN, OUT> OUT parseOrNull(@NotNull Parser<? super IN, ? extends OUT> object, IN object2) {
            try {
                u.a a14 = u.d;
                object = u.b(object.parse(object2));
            }
            catch (Throwable throwable) {
                object2 = u.d;
                object = u.b(v.a(throwable));
            }
            object2 = object;
            if (u.g(object)) {
                object2 = null;
            }
            return (OUT)object2;
        }
    }
}


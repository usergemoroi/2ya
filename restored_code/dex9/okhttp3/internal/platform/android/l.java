/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  okhttp3.internal.platform.android.l$a
 *  org.jetbrains.annotations.NotNull
 */
package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import okhttp3.internal.platform.android.f;
import okhttp3.internal.platform.android.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB3\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0000\u0012\u00020\t0\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002\u00a2\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0005\u00a8\u0006\u000f"}, d2={"Lokhttp3/internal/platform/android/l;", "Lokhttp3/internal/platform/android/f;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocketFactory;", "h", "Ljava/lang/Class;", "sslSocketFactoryClass", "i", "paramClass", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "j", "a", "okhttp"}, k=1, mv={1, 8, 0})
public final class l
extends f {
    @NotNull
    public static final a j = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private final Class<? super SSLSocketFactory> h;
    @NotNull
    private final Class<?> i;

    public l(@NotNull Class<? super SSLSocket> clazz, @NotNull Class<? super SSLSocketFactory> clazz2, @NotNull Class<?> clazz3) {
        y.j(clazz, (String)"sslSocketClass");
        y.j(clazz2, (String)"sslSocketFactoryClass");
        y.j(clazz3, (String)"paramClass");
        super(clazz);
        this.h = clazz2;
        this.i = clazz3;
    }
}


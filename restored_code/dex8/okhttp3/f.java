/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.d0;
import okhttp3.e;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2={"Lokhttp3/f;", "", "Lokhttp3/e;", "call", "Ljava/io/IOException;", "e", "Lkotlin/k0;", "onFailure", "(Lokhttp3/e;Ljava/io/IOException;)V", "Lokhttp3/d0;", "response", "onResponse", "(Lokhttp3/e;Lokhttp3/d0;)V", "okhttp"}, k=1, mv={1, 8, 0})
public interface f {
    public void onFailure(@NotNull e var1, @NotNull IOException var2);

    public void onResponse(@NotNull e var1, @NotNull d0 var2) throws IOException;
}


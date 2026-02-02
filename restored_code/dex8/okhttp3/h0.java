/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H&\u00a2\u0006\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2={"Lokhttp3/h0;", "", "", "text", "", "send", "(Ljava/lang/String;)Z", "", "code", "reason", "close", "(ILjava/lang/String;)Z", "okhttp"}, k=1, mv={1, 8, 0})
public interface h0 {
    public boolean close(int var1, @Nullable String var2);

    public boolean send(@NotNull String var1);
}


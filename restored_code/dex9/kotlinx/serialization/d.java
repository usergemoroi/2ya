/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.ExperimentalSerializationApi
 *  kotlinx.serialization.n
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\f\u0010\rB\u001f\b\u0016\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0004\b\f\u0010\u000fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, d2={"Lkotlinx/serialization/d;", "Lkotlinx/serialization/n;", "", "", "c", "Ljava/util/List;", "a", "()Ljava/util/List;", "missingFields", "message", "", "cause", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V", "serialName", "(Ljava/util/List;Ljava/lang/String;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@ExperimentalSerializationApi
public final class d
extends n {
    @NotNull
    private final List<String> c;

    public d(@NotNull List<String> list, @NotNull String string) {
        y.j(list, (String)"missingFields");
        y.j((Object)string, (String)"serialName");
        if (list.size() == 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Field '");
            stringBuilder.append(list.get(0));
            stringBuilder.append("' is required for type with serial name '");
            stringBuilder.append(string);
            stringBuilder.append("', but it was missing");
            string = stringBuilder.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fields ");
            stringBuilder.append(list);
            stringBuilder.append(" are required for type with serial name '");
            stringBuilder.append(string);
            stringBuilder.append("', but they were missing");
            string = stringBuilder.toString();
        }
        this(list, string, null);
    }

    public d(@NotNull List<String> list, @Nullable String string, @Nullable Throwable throwable) {
        y.j(list, (String)"missingFields");
        super(string, throwable);
        this.c = list;
    }

    @NotNull
    public final List<String> a() {
        return this.c;
    }
}


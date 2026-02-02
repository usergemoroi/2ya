/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlinx.serialization.n
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlinx.serialization.n;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0004\u0010\b\u00a8\u0006\t"}, d2={"Lkotlinx/serialization/b0;", "Lkotlinx/serialization/n;", "", "message", "<init>", "(Ljava/lang/String;)V", "", "index", "(I)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class b0
extends n {
    public b0(int n4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("An unknown field for index ");
        stringBuilder.append(n4);
        this(stringBuilder.toString());
    }

    public b0(@Nullable String string) {
        super(string);
    }
}


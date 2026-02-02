/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlinx.coroutines.y1
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.o2;
import kotlinx.coroutines.y1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2={"Lkotlinx/coroutines/l1;", "Lkotlinx/coroutines/y1;", "", "toString", "()Ljava/lang/String;", "", "c", "Z", "isActive", "()Z", "Lkotlinx/coroutines/o2;", "a", "()Lkotlinx/coroutines/o2;", "list", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
final class l1
implements y1 {
    private final boolean c;

    public l1(boolean bl) {
        this.c = bl;
    }

    @Nullable
    public o2 a() {
        return null;
    }

    public boolean isActive() {
        return this.c;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Empty{");
        String string = this.isActive() ? "Active" : "New";
        stringBuilder.append(string);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}


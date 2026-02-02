/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.io.h
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.io;

import java.io.File;
import kotlin.Metadata;
import kotlin.io.g;
import kotlin.io.h;
import kotlin.io.k;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0003*\u00020\u0000\u00a2\u0006\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2={"Ljava/io/File;", "Lkotlin/io/h;", "direction", "Lkotlin/io/g;", "o", "(Ljava/io/File;Lkotlin/io/h;)Lkotlin/io/g;", "r", "(Ljava/io/File;)Lkotlin/io/g;", "q", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/io/FilesKt")
class l
extends k {
    @NotNull
    public static final g o(@NotNull File file, @NotNull h h4) {
        y.j((Object)file, (String)"<this>");
        y.j((Object)h4, (String)"direction");
        return new g(file, h4);
    }

    public static /* synthetic */ g p(File file, h h4, int n4, Object object) {
        if ((n4 & 1) != 0) {
            h4 = h.c;
        }
        return l.o(file, h4);
    }

    @NotNull
    public static final g q(@NotNull File file) {
        y.j((Object)file, (String)"<this>");
        return l.o(file, h.d);
    }

    @NotNull
    public static g r(@NotNull File file) {
        y.j((Object)file, (String)"<this>");
        return l.o(file, h.c);
    }
}


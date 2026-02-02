/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.comparisons.c
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.comparisons;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.comparisons.c;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000 \n\u0002\u0010\u000f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\b\u0004\u001a/\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\b\u001a\u00020\u0007\"\u00020\u0006H\u0007\u00a2\u0006\u0004\b\t\u0010\n\u001a#\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\f\"\u00020\u000bH\u0007\u00a2\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\f\"\u00020\u000bH\u0007\u00a2\u0006\u0004\b\u000f\u0010\u000e\u00a8\u0006\u0010"}, d2={"", "T", "a", "b", "j", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "other", "i", "(I[I)I", "", "", "h", "(F[F)F", "k", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/comparisons/ComparisonsKt")
class d
extends c {
    @SinceKotlin(version="1.4")
    public static float h(float f4, float ... fArray) {
        y.j((Object)fArray, (String)"other");
        int n4 = fArray.length;
        for (int i4 = 0; i4 < n4; ++i4) {
            f4 = Math.max(f4, fArray[i4]);
        }
        return f4;
    }

    @SinceKotlin(version="1.4")
    public static int i(int n4, int ... nArray) {
        y.j((Object)nArray, (String)"other");
        int n5 = nArray.length;
        int n6 = 0;
        int n7 = n4;
        for (n4 = n6; n4 < n5; ++n4) {
            n7 = Math.max(n7, nArray[n4]);
        }
        return n7;
    }

    @SinceKotlin(version="1.1")
    @NotNull
    public static <T extends Comparable<? super T>> T j(@NotNull T t3, @NotNull T t4) {
        y.j(t3, (String)"a");
        y.j(t4, (String)"b");
        if (t3.compareTo(t4) < 0) {
            t3 = t4;
        }
        return t3;
    }

    @SinceKotlin(version="1.4")
    public static float k(float f4, float ... fArray) {
        y.j((Object)fArray, (String)"other");
        int n4 = fArray.length;
        for (int i4 = 0; i4 < n4; ++i4) {
            f4 = Math.min(f4, fArray[i4]);
        }
        return f4;
    }
}


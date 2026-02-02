/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.SinceKotlin
 *  kotlin.collections.m
 *  kotlin.collections.q
 *  kotlin.jvm.JvmName
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.l;
import kotlin.collections.m;
import kotlin.collections.n;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000x\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0010\u0018\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\b\u000b\u0010\f\u001aS\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\bH\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001a9\u0010\u0014\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\bH\u0007\u00a2\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0017\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\r\u001a\u00020\u00162\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\bH\u0007\u00a2\u0006\u0004\b\u0017\u0010\u0018\u001a9\u0010\u001a\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\r\u001a\u00020\u00192\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\bH\u0007\u00a2\u0006\u0004\b\u001a\u0010\u001b\u001a9\u0010\u001c\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\bH\u0007\u00a2\u0006\u0004\b\u001c\u0010\u001d\u001a9\u0010\u001f\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\r\u001a\u00020\u001e2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\bH\u0007\u00a2\u0006\u0004\b\u001f\u0010 \u001a5\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0001\u00a2\u0006\u0004\b!\u0010\"\u001a#\u0010#\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0001\u00a2\u0006\u0004\b#\u0010$\u001a9\u0010&\u001a\u00020%\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00028\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\b&\u0010'\u001a-\u0010(\u001a\u00020%*\u00020\u00162\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\b(\u0010)\u001a-\u0010+\u001a\u00020%*\u00020\u00192\u0006\u0010\u0007\u001a\u00020*2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\b+\u0010,\u001a-\u0010-\u001a\u00020%*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\b-\u0010.\u001a.\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\b/\u00100\u001a\u001c\u00101\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002\u00a2\u0006\u0004\b1\u00102\u001a4\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003H\u0086\u0002\u00a2\u0006\u0004\b5\u00106\u001a6\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0086\u0002\u00a2\u0006\u0004\b7\u00108\u001a\u001c\u00109\u001a\u00020\u0013*\u00020\u00132\u0006\u00104\u001a\u00020\u0013H\u0086\u0002\u00a2\u0006\u0004\b9\u0010:\u001a\u001c\u0010;\u001a\u00020\u0016*\u00020\u00162\u0006\u00104\u001a\u00020\u0016H\u0086\u0002\u00a2\u0006\u0004\b;\u0010<\u001a\u001c\u0010=\u001a\u00020\u0019*\u00020\u00192\u0006\u00104\u001a\u00020\u0019H\u0086\u0002\u00a2\u0006\u0004\b=\u0010>\u001a\u001c\u0010?\u001a\u00020\u0005*\u00020\u00052\u0006\u00104\u001a\u00020\u0005H\u0086\u0002\u00a2\u0006\u0004\b?\u0010@\u001a\u001c\u0010B\u001a\u00020A*\u00020A2\u0006\u00104\u001a\u00020AH\u0086\u0002\u00a2\u0006\u0004\bB\u0010C\u001a\u001f\u0010D\u001a\u00020%\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\u00a2\u0006\u0004\bD\u0010E\u001a%\u0010F\u001a\u00020%*\u00020\u00162\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\bF\u0010G\u001a%\u0010H\u001a\u00020%*\u00020\u00192\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\bH\u0010I\u001a%\u0010J\u001a\u00020%*\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\bJ\u0010K\u001a;\u0010O\u001a\u00020%\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010N\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Lj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`M\u00a2\u0006\u0004\bO\u0010P\u001aO\u0010Q\u001a\u00020%\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010N\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Lj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`M2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\bQ\u0010R\u001a/\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000T\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000S*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\u00a2\u0006\u0004\bU\u0010V\u00a8\u0006W"}, d2={"T", "", "", "e", "([Ljava/lang/Object;)Ljava/util/List;", "", "", "element", "", "fromIndex", "toIndex", "f", "([FFII)I", "destination", "destinationOffset", "startIndex", "endIndex", "m", "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;", "", "h", "([B[BIII)[B", "", "k", "([I[IIII)[I", "", "l", "([J[JIII)[J", "j", "([F[FIII)[F", "", "i", "([C[CIII)[C", "t", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "s", "([BII)[B", "Lkotlin/k0;", "x", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "v", "([IIII)V", "", "w", "([JJII)V", "u", "([FFII)V", "H", "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "E", "([II)[I", "", "elements", "I", "([Ljava/lang/Object;Ljava/util/Collection;)[Ljava/lang/Object;", "J", "([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;", "C", "([B[B)[B", "F", "([I[I)[I", "G", "([J[J)[J", "D", "([F[F)[F", "", "K", "([Z[Z)[Z", "O", "([Ljava/lang/Object;)V", "M", "([III)V", "N", "([JII)V", "L", "([FII)V", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "P", "([Ljava/lang/Object;Ljava/util/Comparator;)V", "Q", "([Ljava/lang/Object;Ljava/util/Comparator;II)V", "", "Ljava/util/SortedSet;", "R", "([Ljava/lang/Comparable;)Ljava/util/SortedSet;", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/collections/ArraysKt")
@SourceDebugExtension(value={"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3105:1\n13996#2,14:3106\n14019#2,14:3120\n14042#2,14:3134\n14065#2,14:3148\n14088#2,14:3162\n14111#2,14:3176\n14134#2,14:3190\n14157#2,14:3204\n14180#2,14:3218\n16582#2,14:3232\n16605#2,14:3246\n16628#2,14:3260\n16651#2,14:3274\n16674#2,14:3288\n16697#2,14:3302\n16720#2,14:3316\n16743#2,14:3330\n16766#2,14:3344\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n*L\n2497#1:3106,14\n2504#1:3120,14\n2511#1:3134,14\n2518#1:3148,14\n2525#1:3162,14\n2532#1:3176,14\n2539#1:3190,14\n2546#1:3204,14\n2553#1:3218,14\n2695#1:3232,14\n2702#1:3246,14\n2709#1:3260,14\n2716#1:3274,14\n2723#1:3288,14\n2730#1:3302,14\n2737#1:3316,14\n2744#1:3330,14\n2751#1:3344,14\n*E\n"})
class o
extends n {
    public static /* synthetic */ void A(long[] lArray, long l4, int n4, int n5, int n6, Object object) {
        if ((n6 & 2) != 0) {
            n4 = 0;
        }
        if ((n6 & 4) != 0) {
            n5 = lArray.length;
        }
        o.w(lArray, l4, n4, n5);
    }

    public static /* synthetic */ void B(Object[] objectArray, Object object, int n4, int n5, int n6, Object object2) {
        if ((n6 & 2) != 0) {
            n4 = 0;
        }
        if ((n6 & 4) != 0) {
            n5 = objectArray.length;
        }
        l.x(objectArray, object, n4, n5);
    }

    @NotNull
    public static byte[] C(@NotNull byte[] byArray, @NotNull byte[] byArray2) {
        y.j((Object)byArray, (String)"<this>");
        y.j((Object)byArray2, (String)"elements");
        int n4 = byArray.length;
        int n5 = byArray2.length;
        byArray = Arrays.copyOf(byArray, n4 + n5);
        System.arraycopy(byArray2, 0, byArray, n4, n5);
        y.g((Object)byArray);
        return byArray;
    }

    @NotNull
    public static float[] D(@NotNull float[] fArray, @NotNull float[] fArray2) {
        y.j((Object)fArray, (String)"<this>");
        y.j((Object)fArray2, (String)"elements");
        int n4 = fArray.length;
        int n5 = fArray2.length;
        fArray = Arrays.copyOf(fArray, n4 + n5);
        System.arraycopy(fArray2, 0, fArray, n4, n5);
        y.g((Object)fArray);
        return fArray;
    }

    @NotNull
    public static int[] E(@NotNull int[] nArray, int n4) {
        y.j((Object)nArray, (String)"<this>");
        int n5 = nArray.length;
        nArray = Arrays.copyOf(nArray, n5 + 1);
        nArray[n5] = n4;
        y.g((Object)nArray);
        return nArray;
    }

    @NotNull
    public static int[] F(@NotNull int[] nArray, @NotNull int[] nArray2) {
        y.j((Object)nArray, (String)"<this>");
        y.j((Object)nArray2, (String)"elements");
        int n4 = nArray.length;
        int n5 = nArray2.length;
        nArray = Arrays.copyOf(nArray, n4 + n5);
        System.arraycopy(nArray2, 0, nArray, n4, n5);
        y.g((Object)nArray);
        return nArray;
    }

    @NotNull
    public static long[] G(@NotNull long[] lArray, @NotNull long[] lArray2) {
        y.j((Object)lArray, (String)"<this>");
        y.j((Object)lArray2, (String)"elements");
        int n4 = lArray.length;
        int n5 = lArray2.length;
        lArray = Arrays.copyOf(lArray, n4 + n5);
        System.arraycopy(lArray2, 0, lArray, n4, n5);
        y.g((Object)lArray);
        return lArray;
    }

    @NotNull
    public static <T> T[] H(@NotNull T[] TArray, T t3) {
        y.j(TArray, (String)"<this>");
        int n4 = TArray.length;
        TArray = Arrays.copyOf(TArray, n4 + 1);
        TArray[n4] = t3;
        y.g(TArray);
        return TArray;
    }

    @NotNull
    public static <T> T[] I(@NotNull T[] TArray, @NotNull Collection<? extends T> object) {
        y.j(TArray, (String)"<this>");
        y.j(object, (String)"elements");
        int n4 = TArray.length;
        TArray = Arrays.copyOf(TArray, object.size() + n4);
        object = object.iterator();
        while (object.hasNext()) {
            TArray[n4] = object.next();
            ++n4;
        }
        y.g(TArray);
        return TArray;
    }

    @NotNull
    public static <T> T[] J(@NotNull T[] TArray, @NotNull T[] TArray2) {
        y.j(TArray, (String)"<this>");
        y.j(TArray2, (String)"elements");
        int n4 = TArray.length;
        int n5 = TArray2.length;
        TArray = Arrays.copyOf(TArray, n4 + n5);
        System.arraycopy(TArray2, 0, TArray, n4, n5);
        y.g(TArray);
        return TArray;
    }

    @NotNull
    public static boolean[] K(@NotNull boolean[] blArray, @NotNull boolean[] blArray2) {
        y.j((Object)blArray, (String)"<this>");
        y.j((Object)blArray2, (String)"elements");
        int n4 = blArray.length;
        int n5 = blArray2.length;
        blArray = Arrays.copyOf(blArray, n4 + n5);
        System.arraycopy(blArray2, 0, blArray, n4, n5);
        y.g((Object)blArray);
        return blArray;
    }

    public static void L(@NotNull float[] fArray, int n4, int n5) {
        y.j((Object)fArray, (String)"<this>");
        Arrays.sort(fArray, n4, n5);
    }

    public static void M(@NotNull int[] nArray, int n4, int n5) {
        y.j((Object)nArray, (String)"<this>");
        Arrays.sort(nArray, n4, n5);
    }

    public static void N(@NotNull long[] lArray, int n4, int n5) {
        y.j((Object)lArray, (String)"<this>");
        Arrays.sort(lArray, n4, n5);
    }

    public static <T> void O(@NotNull T[] TArray) {
        y.j(TArray, (String)"<this>");
        if (TArray.length > 1) {
            Arrays.sort(TArray);
        }
    }

    public static final <T> void P(@NotNull T[] TArray, @NotNull Comparator<? super T> comparator) {
        y.j(TArray, (String)"<this>");
        y.j(comparator, (String)"comparator");
        if (TArray.length > 1) {
            Arrays.sort(TArray, comparator);
        }
    }

    public static <T> void Q(@NotNull T[] TArray, @NotNull Comparator<? super T> comparator, int n4, int n5) {
        y.j(TArray, (String)"<this>");
        y.j(comparator, (String)"comparator");
        Arrays.sort(TArray, n4, n5, comparator);
    }

    @NotNull
    public static <T extends Comparable<? super T>> SortedSet<T> R(@NotNull T[] TArray) {
        y.j(TArray, (String)"<this>");
        return p.e1(TArray, new TreeSet());
    }

    @NotNull
    public static <T> List<T> e(@NotNull T[] object) {
        y.j(object, (String)"<this>");
        object = q.a((Object[])object);
        y.i(object, (String)"asList(...)");
        return object;
    }

    public static final int f(@NotNull float[] fArray, float f4, int n4, int n5) {
        y.j((Object)fArray, (String)"<this>");
        return Arrays.binarySearch(fArray, n4, n5, f4);
    }

    public static /* synthetic */ int g(float[] fArray, float f4, int n4, int n5, int n6, Object object) {
        if ((n6 & 2) != 0) {
            n4 = 0;
        }
        if ((n6 & 4) != 0) {
            n5 = fArray.length;
        }
        return o.f(fArray, f4, n4, n5);
    }

    @SinceKotlin(version="1.3")
    @NotNull
    public static byte[] h(@NotNull byte[] byArray, @NotNull byte[] byArray2, int n4, int n5, int n6) {
        y.j((Object)byArray, (String)"<this>");
        y.j((Object)byArray2, (String)"destination");
        System.arraycopy(byArray, n5, byArray2, n4, n6 - n5);
        return byArray2;
    }

    @SinceKotlin(version="1.3")
    @NotNull
    public static char[] i(@NotNull char[] cArray, @NotNull char[] cArray2, int n4, int n5, int n6) {
        y.j((Object)cArray, (String)"<this>");
        y.j((Object)cArray2, (String)"destination");
        System.arraycopy(cArray, n5, cArray2, n4, n6 - n5);
        return cArray2;
    }

    @SinceKotlin(version="1.3")
    @NotNull
    public static float[] j(@NotNull float[] fArray, @NotNull float[] fArray2, int n4, int n5, int n6) {
        y.j((Object)fArray, (String)"<this>");
        y.j((Object)fArray2, (String)"destination");
        System.arraycopy(fArray, n5, fArray2, n4, n6 - n5);
        return fArray2;
    }

    @SinceKotlin(version="1.3")
    @NotNull
    public static int[] k(@NotNull int[] nArray, @NotNull int[] nArray2, int n4, int n5, int n6) {
        y.j((Object)nArray, (String)"<this>");
        y.j((Object)nArray2, (String)"destination");
        System.arraycopy(nArray, n5, nArray2, n4, n6 - n5);
        return nArray2;
    }

    @SinceKotlin(version="1.3")
    @NotNull
    public static long[] l(@NotNull long[] lArray, @NotNull long[] lArray2, int n4, int n5, int n6) {
        y.j((Object)lArray, (String)"<this>");
        y.j((Object)lArray2, (String)"destination");
        System.arraycopy(lArray, n5, lArray2, n4, n6 - n5);
        return lArray2;
    }

    @SinceKotlin(version="1.3")
    @NotNull
    public static <T> T[] m(@NotNull T[] TArray, @NotNull T[] TArray2, int n4, int n5, int n6) {
        y.j(TArray, (String)"<this>");
        y.j(TArray2, (String)"destination");
        System.arraycopy(TArray, n5, TArray2, n4, n6 - n5);
        return TArray2;
    }

    public static /* synthetic */ byte[] n(byte[] byArray, byte[] byArray2, int n4, int n5, int n6, int n7, Object object) {
        if ((n7 & 2) != 0) {
            n4 = 0;
        }
        if ((n7 & 4) != 0) {
            n5 = 0;
        }
        if ((n7 & 8) != 0) {
            n6 = byArray.length;
        }
        return l.h(byArray, byArray2, n4, n5, n6);
    }

    public static /* synthetic */ float[] o(float[] fArray, float[] fArray2, int n4, int n5, int n6, int n7, Object object) {
        if ((n7 & 2) != 0) {
            n4 = 0;
        }
        if ((n7 & 4) != 0) {
            n5 = 0;
        }
        if ((n7 & 8) != 0) {
            n6 = fArray.length;
        }
        return l.j(fArray, fArray2, n4, n5, n6);
    }

    public static /* synthetic */ int[] p(int[] nArray, int[] nArray2, int n4, int n5, int n6, int n7, Object object) {
        if ((n7 & 2) != 0) {
            n4 = 0;
        }
        if ((n7 & 4) != 0) {
            n5 = 0;
        }
        if ((n7 & 8) != 0) {
            n6 = nArray.length;
        }
        return l.k(nArray, nArray2, n4, n5, n6);
    }

    public static /* synthetic */ long[] q(long[] lArray, long[] lArray2, int n4, int n5, int n6, int n7, Object object) {
        if ((n7 & 2) != 0) {
            n4 = 0;
        }
        if ((n7 & 4) != 0) {
            n5 = 0;
        }
        if ((n7 & 8) != 0) {
            n6 = lArray.length;
        }
        return l.l(lArray, lArray2, n4, n5, n6);
    }

    public static /* synthetic */ Object[] r(Object[] objectArray, Object[] objectArray2, int n4, int n5, int n6, int n7, Object object) {
        if ((n7 & 2) != 0) {
            n4 = 0;
        }
        if ((n7 & 4) != 0) {
            n5 = 0;
        }
        if ((n7 & 8) != 0) {
            n6 = objectArray.length;
        }
        return l.m(objectArray, objectArray2, n4, n5, n6);
    }

    @PublishedApi
    @SinceKotlin(version="1.3")
    @JvmName(name="copyOfRange")
    @NotNull
    public static byte[] s(@NotNull byte[] byArray, int n4, int n5) {
        y.j((Object)byArray, (String)"<this>");
        m.b((int)n5, (int)byArray.length);
        byArray = Arrays.copyOfRange(byArray, n4, n5);
        y.i((Object)byArray, (String)"copyOfRange(...)");
        return byArray;
    }

    @PublishedApi
    @SinceKotlin(version="1.3")
    @JvmName(name="copyOfRange")
    @NotNull
    public static <T> T[] t(@NotNull T[] TArray, int n4, int n5) {
        y.j(TArray, (String)"<this>");
        m.b((int)n5, (int)TArray.length);
        TArray = Arrays.copyOfRange(TArray, n4, n5);
        y.i(TArray, (String)"copyOfRange(...)");
        return TArray;
    }

    public static final void u(@NotNull float[] fArray, float f4, int n4, int n5) {
        y.j((Object)fArray, (String)"<this>");
        Arrays.fill(fArray, n4, n5, f4);
    }

    public static void v(@NotNull int[] nArray, int n4, int n5, int n6) {
        y.j((Object)nArray, (String)"<this>");
        Arrays.fill(nArray, n5, n6, n4);
    }

    public static final void w(@NotNull long[] lArray, long l4, int n4, int n5) {
        y.j((Object)lArray, (String)"<this>");
        Arrays.fill(lArray, n4, n5, l4);
    }

    public static <T> void x(@NotNull T[] TArray, T t3, int n4, int n5) {
        y.j(TArray, (String)"<this>");
        Arrays.fill(TArray, n4, n5, t3);
    }

    public static /* synthetic */ void y(float[] fArray, float f4, int n4, int n5, int n6, Object object) {
        if ((n6 & 2) != 0) {
            n4 = 0;
        }
        if ((n6 & 4) != 0) {
            n5 = fArray.length;
        }
        o.u(fArray, f4, n4, n5);
    }

    public static /* synthetic */ void z(int[] nArray, int n4, int n5, int n6, int n7, Object object) {
        if ((n7 & 2) != 0) {
            n5 = 0;
        }
        if ((n7 & 4) != 0) {
            n6 = nArray.length;
        }
        l.v(nArray, n4, n5, n6);
    }
}


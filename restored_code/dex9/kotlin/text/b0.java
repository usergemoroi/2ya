/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.text;

import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.ranges.j;
import kotlin.text.a0;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000 \n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u001f\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u00a2\u0006\u0004\b\u0007\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\b\b\u0010\u0003\u001a\u0019\u0010\f\u001a\u00020\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\u000e\u0010\r\u001a\u0019\u0010\u000f\u001a\u00020\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\u000f\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u0000*\u00020\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0015\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0013*\n\u0012\u0006\b\u0000\u0012\u00020\u00010\u0012*\u00020\u00002\u0006\u0010\u0014\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2={"", "", "n1", "(Ljava/lang/CharSequence;)C", "o1", "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "p1", "q1", "s1", "", "", "n", "l1", "(Ljava/lang/String;I)Ljava/lang/String;", "m1", "t1", "r1", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "C", "destination", "u1", "(Ljava/lang/CharSequence;Ljava/util/Collection;)Ljava/util/Collection;", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/text/StringsKt")
@SourceDebugExtension(value={"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2487:1\n130#1,2:2488\n221#1,5:2490\n507#1,5:2496\n507#1,5:2501\n467#1:2506\n1188#1,2:2507\n468#1,2:2509\n1190#1:2511\n470#1:2512\n467#1:2513\n1188#1,2:2514\n468#1,2:2516\n1190#1:2518\n470#1:2519\n1188#1,3:2520\n497#1,2:2523\n497#1,2:2525\n755#1,4:2527\n724#1,4:2531\n740#1,4:2535\n787#1,4:2539\n887#1,5:2543\n928#1,3:2548\n931#1,3:2558\n946#1,3:2561\n949#1,3:2571\n1046#1,3:2588\n1016#1,4:2591\n1005#1:2595\n1188#1,2:2596\n1190#1:2599\n1006#1:2600\n1188#1,3:2601\n1037#1:2604\n1179#1:2605\n1180#1:2607\n1038#1:2608\n1179#1,2:2609\n1188#1,3:2611\n1985#1,2:2614\n1987#1,6:2617\n2009#1,2:2623\n2011#1,6:2626\n2432#1,6:2632\n2462#1,7:2638\n1#2:2495\n1#2:2598\n1#2:2606\n1#2:2616\n1#2:2625\n381#3,7:2551\n381#3,7:2564\n381#3,7:2574\n381#3,7:2581\n*S KotlinDebug\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n56#1:2488,2\n66#1:2490,5\n425#1:2496,5\n434#1:2501,5\n445#1:2506\n445#1:2507,2\n445#1:2509,2\n445#1:2511\n445#1:2512\n456#1:2513\n456#1:2514,2\n456#1:2516,2\n456#1:2518\n456#1:2519\n467#1:2520,3\n479#1:2523,2\n488#1:2525,2\n682#1:2527,4\n697#1:2531,4\n711#1:2535,4\n774#1:2539,4\n847#1:2543,5\n903#1:2548,3\n903#1:2558,3\n916#1:2561,3\n916#1:2571,3\n975#1:2588,3\n985#1:2591,4\n995#1:2595\n995#1:2596,2\n995#1:2599\n995#1:2600\n1005#1:2601,3\n1029#1:2604\n1029#1:2605\n1029#1:2607\n1029#1:2608\n1037#1:2609,2\n1791#1:2611,3\n2079#1:2614,2\n2079#1:2617,6\n2096#1:2623,2\n2096#1:2626,6\n2421#1:2632,6\n2449#1:2638,7\n995#1:2598\n1029#1:2606\n2079#1:2616\n2096#1:2625\n903#1:2551,7\n916#1:2564,7\n930#1:2574,7\n948#1:2581,7\n*E\n"})
class b0
extends a0 {
    @NotNull
    public static String l1(@NotNull String charSequence, int n4) {
        y.j((Object)charSequence, (String)"<this>");
        if (n4 >= 0) {
            charSequence = ((String)charSequence).substring(j.i(n4, ((String)charSequence).length()));
            y.i((Object)charSequence, (String)"substring(...)");
            return charSequence;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Requested character count ");
        ((StringBuilder)charSequence).append(n4);
        ((StringBuilder)charSequence).append(" is less than zero.");
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
    }

    @NotNull
    public static String m1(@NotNull String charSequence, int n4) {
        y.j((Object)charSequence, (String)"<this>");
        if (n4 >= 0) {
            return p.t1((String)charSequence, j.e(((String)charSequence).length() - n4, 0));
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Requested character count ");
        ((StringBuilder)charSequence).append(n4);
        ((StringBuilder)charSequence).append(" is less than zero.");
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
    }

    public static char n1(@NotNull CharSequence charSequence) {
        y.j((Object)charSequence, (String)"<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @Nullable
    public static Character o1(@NotNull CharSequence object) {
        y.j((Object)object, (String)"<this>");
        object = object.length() == 0 ? null : Character.valueOf(object.charAt(0));
        return object;
    }

    public static char p1(@NotNull CharSequence charSequence) {
        y.j((Object)charSequence, (String)"<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(p.Y(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @Nullable
    public static Character q1(@NotNull CharSequence object) {
        y.j((Object)object, (String)"<this>");
        object = object.length() == 0 ? null : Character.valueOf(object.charAt(object.length() - 1));
        return object;
    }

    @NotNull
    public static CharSequence r1(@NotNull CharSequence charSequence) {
        y.j((Object)charSequence, (String)"<this>");
        charSequence = new StringBuilder(charSequence).reverse();
        y.i((Object)charSequence, (String)"reverse(...)");
        return charSequence;
    }

    public static char s1(@NotNull CharSequence charSequence) {
        y.j((Object)charSequence, (String)"<this>");
        int n4 = charSequence.length();
        if (n4 != 0) {
            if (n4 == 1) {
                return charSequence.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @NotNull
    public static String t1(@NotNull String charSequence, int n4) {
        y.j((Object)charSequence, (String)"<this>");
        if (n4 >= 0) {
            charSequence = ((String)charSequence).substring(0, j.i(n4, ((String)charSequence).length()));
            y.i((Object)charSequence, (String)"substring(...)");
            return charSequence;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Requested character count ");
        ((StringBuilder)charSequence).append(n4);
        ((StringBuilder)charSequence).append(" is less than zero.");
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
    }

    @NotNull
    public static <C extends Collection<? super Character>> C u1(@NotNull CharSequence charSequence, @NotNull C c4) {
        y.j((Object)charSequence, (String)"<this>");
        y.j(c4, (String)"destination");
        for (int i4 = 0; i4 < charSequence.length(); ++i4) {
            c4.add((Character)Character.valueOf(charSequence.charAt(i4)));
        }
        return c4;
    }
}


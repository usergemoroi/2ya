/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.sequences.i
 *  kotlin.t
 *  kotlin.z
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.g;
import kotlin.ranges.j;
import kotlin.sequences.i;
import kotlin.t;
import kotlin.text.a;
import kotlin.text.c;
import kotlin.text.e;
import kotlin.text.p;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000^\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0012\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0007*\u00020\u0007\u00a2\u0006\u0004\b\n\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\u0007*\u00020\u0007\u00a2\u0006\u0004\b\u000b\u0010\t\u001a#\u0010\u000f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0007\u00a2\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0000*\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0000\u00a2\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000\u00a2\u0006\u0004\b \u0010!\u001a#\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0000\u00a2\u0006\u0004\b\"\u0010\u001f\u001a#\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000\u00a2\u0006\u0004\b#\u0010!\u001a#\u0010$\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0000\u00a2\u0006\u0004\b$\u0010\u001f\u001a#\u0010%\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000\u00a2\u0006\u0004\b%\u0010!\u001a#\u0010&\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0000\u00a2\u0006\u0004\b&\u0010\u001f\u001a#\u0010'\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000\u00a2\u0006\u0004\b'\u0010!\u001a)\u0010+\u001a\u00020\u0007*\u00020\u00072\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0007\u00a2\u0006\u0004\b+\u0010,\u001a\u0019\u0010.\u001a\u00020\u0000*\u00020\u00002\u0006\u0010-\u001a\u00020\u0007\u00a2\u0006\u0004\b.\u0010/\u001a\u0019\u00101\u001a\u00020\u0000*\u00020\u00002\u0006\u00100\u001a\u00020\u0007\u00a2\u0006\u0004\b1\u0010/\u001a!\u00102\u001a\u00020\u0000*\u00020\u00002\u0006\u0010-\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0007\u00a2\u0006\u0004\b2\u00103\u001a\u0019\u00104\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0007\u00a2\u0006\u0004\b4\u0010/\u001a;\u00109\u001a\u00020\u0013*\u00020\u00072\u0006\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u00108\u001a\u00020\u0013H\u0000\u00a2\u0006\u0004\b9\u0010:\u001a#\u0010<\u001a\u00020\u0013*\u00020\u00072\u0006\u0010;\u001a\u00020\u00022\b\b\u0002\u00108\u001a\u00020\u0013\u00a2\u0006\u0004\b<\u0010=\u001a#\u0010>\u001a\u00020\u0013*\u00020\u00072\u0006\u0010;\u001a\u00020\u00022\b\b\u0002\u00108\u001a\u00020\u0013\u00a2\u0006\u0004\b>\u0010=\u001a#\u0010?\u001a\u00020\u0013*\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\b\b\u0002\u00108\u001a\u00020\u0013\u00a2\u0006\u0004\b?\u0010@\u001a#\u0010A\u001a\u00020\u0013*\u00020\u00072\u0006\u00100\u001a\u00020\u00072\b\b\u0002\u00108\u001a\u00020\u0013\u00a2\u0006\u0004\bA\u0010@\u001a-\u0010B\u001a\u00020\f*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020\f2\b\b\u0002\u00108\u001a\u00020\u0013\u00a2\u0006\u0004\bB\u0010C\u001a-\u0010D\u001a\u00020\f*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020\f2\b\b\u0002\u00108\u001a\u00020\u0013\u00a2\u0006\u0004\bD\u0010C\u001a=\u0010F\u001a\u00020\f*\u00020\u00072\u0006\u00106\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\u0006\u00108\u001a\u00020\u00132\b\b\u0002\u0010E\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\bF\u0010G\u001aG\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0000\u0018\u00010J*\u00020\u00072\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00000H2\u0006\u0010(\u001a\u00020\f2\u0006\u00108\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\bK\u0010L\u001a-\u0010M\u001a\u00020\f*\u00020\u00072\u0006\u0010;\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\f2\b\b\u0002\u00108\u001a\u00020\u0013\u00a2\u0006\u0004\bM\u0010N\u001a-\u0010P\u001a\u00020\f*\u00020\u00072\u0006\u0010O\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\f2\b\b\u0002\u00108\u001a\u00020\u0013\u00a2\u0006\u0004\bP\u0010Q\u001a-\u0010R\u001a\u00020\f*\u00020\u00072\u0006\u0010;\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\f2\b\b\u0002\u00108\u001a\u00020\u0013\u00a2\u0006\u0004\bR\u0010N\u001a-\u0010S\u001a\u00020\f*\u00020\u00072\u0006\u0010O\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\f2\b\b\u0002\u00108\u001a\u00020\u0013\u00a2\u0006\u0004\bS\u0010Q\u001a&\u0010T\u001a\u00020\u0013*\u00020\u00072\u0006\u00106\u001a\u00020\u00072\b\b\u0002\u00108\u001a\u00020\u0013H\u0086\u0002\u00a2\u0006\u0004\bT\u0010@\u001a&\u0010U\u001a\u00020\u0013*\u00020\u00072\u0006\u0010;\u001a\u00020\u00022\b\b\u0002\u00108\u001a\u00020\u0013H\u0086\u0002\u00a2\u0006\u0004\bU\u0010=\u001a?\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00160X*\u00020\u00072\u0006\u0010V\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020\f2\b\b\u0002\u00108\u001a\u00020\u00132\b\b\u0002\u0010W\u001a\u00020\fH\u0002\u00a2\u0006\u0004\bY\u0010Z\u001aG\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00160X*\u00020\u00072\u000e\u0010V\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000[2\b\b\u0002\u0010(\u001a\u00020\f2\b\b\u0002\u00108\u001a\u00020\u00132\b\b\u0002\u0010W\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\\\u0010]\u001a\u0017\u0010_\u001a\u00020^2\u0006\u0010W\u001a\u00020\fH\u0000\u00a2\u0006\u0004\b_\u0010`\u001a?\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00000X*\u00020\u00072\u0012\u0010V\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000[\"\u00020\u00002\b\b\u0002\u00108\u001a\u00020\u00132\b\b\u0002\u0010W\u001a\u00020\f\u00a2\u0006\u0004\ba\u0010b\u001a?\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00000c*\u00020\u00072\u0012\u0010V\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000[\"\u00020\u00002\b\b\u0002\u00108\u001a\u00020\u00132\b\b\u0002\u0010W\u001a\u00020\f\u00a2\u0006\u0004\bd\u0010e\u001a7\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00000c*\u00020\u00072\n\u0010V\u001a\u00020\u0001\"\u00020\u00022\b\b\u0002\u00108\u001a\u00020\u00132\b\b\u0002\u0010W\u001a\u00020\f\u00a2\u0006\u0004\bf\u0010g\u001a1\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00000c*\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00132\u0006\u0010W\u001a\u00020\fH\u0002\u00a2\u0006\u0004\bh\u0010i\u001a\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00000X*\u00020\u0007\u00a2\u0006\u0004\bj\u0010k\u001a\u0017\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00000c*\u00020\u0007\u00a2\u0006\u0004\bl\u0010m\u001a\u001f\u0010n\u001a\u00020\u0013*\u0004\u0018\u00010\u00072\b\u00106\u001a\u0004\u0018\u00010\u0007H\u0000\u00a2\u0006\u0004\bn\u0010o\u001a\u0015\u0010p\u001a\u0004\u0018\u00010\u0013*\u00020\u0000H\u0007\u00a2\u0006\u0004\bp\u0010q\"\u0015\u0010t\u001a\u00020\f*\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\br\u0010s\u00a8\u0006u"}, d2={"", "", "", "chars", "h1", "(Ljava/lang/String;[C)Ljava/lang/String;", "j1", "", "g1", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "k1", "i1", "", "length", "padChar", "p0", "(Ljava/lang/CharSequence;IC)Ljava/lang/CharSequence;", "q0", "(Ljava/lang/String;IC)Ljava/lang/String;", "", "h0", "(Ljava/lang/CharSequence;)Z", "Lkotlin/ranges/i;", "range", "O0", "(Ljava/lang/String;Lkotlin/ranges/i;)Ljava/lang/String;", "N0", "(Ljava/lang/CharSequence;Lkotlin/ranges/i;)Ljava/lang/String;", "delimiter", "missingDelimiterValue", "X0", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "Y0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "P0", "Q0", "b1", "c1", "T0", "U0", "startIndex", "endIndex", "replacement", "A0", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "prefix", "w0", "(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "suffix", "x0", "z0", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "y0", "thisOffset", "other", "otherOffset", "ignoreCase", "v0", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "char", "J0", "(Ljava/lang/CharSequence;CZ)Z", "T", "K0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "U", "f0", "(Ljava/lang/CharSequence;[CIZ)I", "m0", "last", "b0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Lkotlin/t;", "X", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/t;", "Z", "(Ljava/lang/CharSequence;CIZ)I", "string", "a0", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "i0", "j0", "P", "O", "delimiters", "limit", "Lkotlin/sequences/i;", "r0", "(Ljava/lang/CharSequence;[CIZI)Lkotlin/sequences/i;", "", "s0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/i;", "Lkotlin/k0;", "B0", "(I)V", "H0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/i;", "", "D0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "C0", "(Ljava/lang/CharSequence;[CZI)Ljava/util/List;", "E0", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "n0", "(Ljava/lang/CharSequence;)Lkotlin/sequences/i;", "o0", "(Ljava/lang/CharSequence;)Ljava/util/List;", "S", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "f1", "(Ljava/lang/String;)Ljava/lang/Boolean;", "Y", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/text/StringsKt")
@SourceDebugExtension(value={"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1499:1\n80#1,22:1500\n114#1,5:1522\n131#1,5:1527\n80#1,22:1532\n108#1:1554\n80#1,22:1555\n114#1,5:1577\n125#1:1582\n114#1,5:1583\n131#1,5:1588\n142#1:1593\n131#1,5:1594\n80#1,22:1599\n114#1,5:1621\n131#1,5:1626\n1069#2,2:1631\n12654#3,2:1633\n12654#3,2:1635\n295#4,2:1637\n295#4,2:1639\n1557#4:1642\n1628#4,3:1643\n1557#4:1646\n1628#4,3:1647\n1#5:1641\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n108#1:1500,22\n125#1:1522,5\n142#1:1527,5\n147#1:1532,22\n152#1:1554\n152#1:1555,22\n157#1:1577,5\n162#1:1582\n162#1:1583,5\n167#1:1588,5\n172#1:1593\n172#1:1594,5\n177#1:1599,22\n188#1:1621,5\n199#1:1626,5\n312#1:1631,2\n952#1:1633,2\n976#1:1635,2\n1015#1:1637,2\n1021#1:1639,2\n1321#1:1642\n1321#1:1643,3\n1346#1:1646\n1346#1:1647,3\n*E\n"})
class z
extends y {
    @NotNull
    public static CharSequence A0(@NotNull CharSequence charSequence, int n4, int n5, @NotNull CharSequence charSequence2) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)charSequence2, (String)"replacement");
        if (n5 >= n4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(charSequence, 0, n4);
            kotlin.jvm.internal.y.i((Object)stringBuilder, (String)"append(...)");
            stringBuilder.append(charSequence2);
            stringBuilder.append(charSequence, n5, charSequence.length());
            kotlin.jvm.internal.y.i((Object)stringBuilder, (String)"append(...)");
            return stringBuilder;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("End index (");
        ((StringBuilder)charSequence).append(n5);
        ((StringBuilder)charSequence).append(") is less than start index (");
        ((StringBuilder)charSequence).append(n4);
        ((StringBuilder)charSequence).append(").");
        throw new IndexOutOfBoundsException(((StringBuilder)charSequence).toString());
    }

    public static final void B0(int n4) {
        if (n4 >= 0) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Limit must be non-negative, but was ");
        stringBuilder.append(n4);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    @NotNull
    public static final List<String> C0(@NotNull CharSequence charSequence, @NotNull char[] object, boolean bl, int n4) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)object, (String)"delimiters");
        if (((char[])object).length == 1) {
            return z.E0(charSequence, String.valueOf(object[0]), bl, n4);
        }
        Object object2 = kotlin.sequences.l.k(z.t0(charSequence, (char[])object, 0, bl, n4, 2, null));
        object = new ArrayList(kotlin.collections.t.x((Iterable)object2, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            object.add(z.N0(charSequence, (kotlin.ranges.i)object2.next()));
        }
        return object;
    }

    @NotNull
    public static final List<String> D0(@NotNull CharSequence charSequence, @NotNull String[] object, boolean bl, int n4) {
        Iterator iterator;
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)object, (String)"delimiters");
        if (((String[])object).length == 1 && (iterator = object[0]).length() != 0) {
            return z.E0(charSequence, (String)((Object)iterator), bl, n4);
        }
        iterator = kotlin.sequences.l.k(z.u0(charSequence, (String[])object, 0, bl, n4, 2, null));
        object = new ArrayList(kotlin.collections.t.x((Iterable)((Object)iterator), 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object.add(z.N0(charSequence, (kotlin.ranges.i)iterator.next()));
        }
        return object;
    }

    private static final List<String> E0(CharSequence charSequence, String string, boolean bl, int n4) {
        z.B0(n4);
        int n5 = 0;
        int n6 = z.a0(charSequence, string, 0, bl);
        if (n6 != -1 && n4 != 1) {
            int n7;
            boolean bl2 = n4 > 0;
            int n8 = 10;
            if (bl2) {
                n8 = j.i(n4, 10);
            }
            ArrayList<String> arrayList = new ArrayList<String>(n8);
            n8 = n6;
            do {
                arrayList.add(((Object)charSequence.subSequence(n5, n8)).toString());
                n7 = string.length() + n8;
                if (bl2 && arrayList.size() == n4 - 1) break;
                n6 = z.a0(charSequence, string, n7, bl);
                n5 = n7;
                n8 = n6;
            } while (n6 != -1);
            arrayList.add(((Object)charSequence.subSequence(n7, charSequence.length())).toString());
            return arrayList;
        }
        return kotlin.collections.t.e(((Object)charSequence).toString());
    }

    public static /* synthetic */ List F0(CharSequence charSequence, char[] cArray, boolean bl, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            bl = false;
        }
        if ((n5 & 4) != 0) {
            n4 = 0;
        }
        return z.C0(charSequence, cArray, bl, n4);
    }

    public static /* synthetic */ List G0(CharSequence charSequence, String[] stringArray, boolean bl, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            bl = false;
        }
        if ((n5 & 4) != 0) {
            n4 = 0;
        }
        return z.D0(charSequence, stringArray, bl, n4);
    }

    @NotNull
    public static final i<String> H0(@NotNull CharSequence charSequence, @NotNull String[] stringArray, boolean bl, int n4) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)stringArray, (String)"delimiters");
        return kotlin.sequences.l.y(z.u0(charSequence, stringArray, 0, bl, n4, 2, null), new l<kotlin.ranges.i, String>(charSequence){
            final CharSequence g;
            {
                this.g = charSequence;
                super(1);
            }

            public final String a(kotlin.ranges.i i4) {
                kotlin.jvm.internal.y.j((Object)i4, (String)"it");
                return z.N0(this.g, i4);
            }
        });
    }

    public static /* synthetic */ i I0(CharSequence charSequence, String[] stringArray, boolean bl, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            bl = false;
        }
        if ((n5 & 4) != 0) {
            n4 = 0;
        }
        return z.H0(charSequence, stringArray, bl, n4);
    }

    public static final boolean J0(@NotNull CharSequence charSequence, char c4, boolean bl) {
        boolean bl2;
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        int n4 = charSequence.length();
        boolean bl3 = bl2 = false;
        if (n4 > 0) {
            bl3 = bl2;
            if (c.h(charSequence.charAt(0), c4, bl)) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public static final boolean K0(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean bl) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)charSequence2, (String)"prefix");
        if (!bl && charSequence instanceof String && charSequence2 instanceof String) {
            return p.M((String)charSequence, (String)charSequence2, false, 2, null);
        }
        return z.v0(charSequence, 0, charSequence2, 0, charSequence2.length(), bl);
    }

    public static /* synthetic */ boolean L0(CharSequence charSequence, char c4, boolean bl, int n4, Object object) {
        if ((n4 & 2) != 0) {
            bl = false;
        }
        return z.J0(charSequence, c4, bl);
    }

    public static /* synthetic */ boolean M0(CharSequence charSequence, CharSequence charSequence2, boolean bl, int n4, Object object) {
        if ((n4 & 2) != 0) {
            bl = false;
        }
        return z.K0(charSequence, charSequence2, bl);
    }

    @NotNull
    public static final String N0(@NotNull CharSequence charSequence, @NotNull kotlin.ranges.i i4) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)i4, (String)"range");
        return ((Object)charSequence.subSequence(i4.l(), i4.k() + 1)).toString();
    }

    public static final boolean O(@NotNull CharSequence charSequence, char c4, boolean bl) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        bl = p.d0(charSequence, c4, 0, bl, 2, null) >= 0;
        return bl;
    }

    @NotNull
    public static String O0(@NotNull String string, @NotNull kotlin.ranges.i i4) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)i4, (String)"range");
        string = string.substring(i4.l(), i4.k() + 1);
        kotlin.jvm.internal.y.i((Object)string, (String)"substring(...)");
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean P(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean bl) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)charSequence2, (String)"other");
        boolean bl2 = charSequence2 instanceof String;
        boolean bl3 = false;
        if (bl2) {
            if (p.e0(charSequence, (String)charSequence2, 0, bl, 2, null) < 0) return bl3;
            return true;
        }
        if (z.c0(charSequence, charSequence2, 0, charSequence.length(), bl, false, 16, null) < 0) return bl3;
        return true;
    }

    @NotNull
    public static String P0(@NotNull String string, char c4, @NotNull String string2) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)string2, (String)"missingDelimiterValue");
        int n4 = p.d0(string, c4, 0, false, 6, null);
        if (n4 != -1) {
            string2 = string.substring(n4 + 1, string.length());
            kotlin.jvm.internal.y.i((Object)string2, (String)"substring(...)");
        }
        return string2;
    }

    public static /* synthetic */ boolean Q(CharSequence charSequence, char c4, boolean bl, int n4, Object object) {
        if ((n4 & 2) != 0) {
            bl = false;
        }
        return z.O(charSequence, c4, bl);
    }

    @NotNull
    public static String Q0(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)string2, (String)"delimiter");
        kotlin.jvm.internal.y.j((Object)string3, (String)"missingDelimiterValue");
        int n4 = p.e0(string, string2, 0, false, 6, null);
        if (n4 != -1) {
            string3 = string.substring(n4 + string2.length(), string.length());
            kotlin.jvm.internal.y.i((Object)string3, (String)"substring(...)");
        }
        return string3;
    }

    public static /* synthetic */ boolean R(CharSequence charSequence, CharSequence charSequence2, boolean bl, int n4, Object object) {
        if ((n4 & 2) != 0) {
            bl = false;
        }
        return p.P(charSequence, charSequence2, bl);
    }

    public static /* synthetic */ String R0(String string, char c4, String string2, int n4, Object object) {
        if ((n4 & 2) != 0) {
            string2 = string;
        }
        return p.P0(string, c4, string2);
    }

    public static final boolean S(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if (charSequence instanceof String && charSequence2 instanceof String) {
            return kotlin.jvm.internal.y.e((Object)charSequence, (Object)charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
            int n4 = charSequence.length();
            for (int i4 = 0; i4 < n4; ++i4) {
                if (charSequence.charAt(i4) == charSequence2.charAt(i4)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static /* synthetic */ String S0(String string, String string2, String string3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            string3 = string;
        }
        return p.Q0(string, string2, string3);
    }

    public static final boolean T(@NotNull CharSequence charSequence, char c4, boolean bl) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        bl = charSequence.length() > 0 && c.h(charSequence.charAt(p.Y(charSequence)), c4, bl);
        return bl;
    }

    @NotNull
    public static String T0(@NotNull String string, char c4, @NotNull String string2) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)string2, (String)"missingDelimiterValue");
        int n4 = p.k0(string, c4, 0, false, 6, null);
        if (n4 != -1) {
            string2 = string.substring(n4 + 1, string.length());
            kotlin.jvm.internal.y.i((Object)string2, (String)"substring(...)");
        }
        return string2;
    }

    public static final boolean U(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean bl) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)charSequence2, (String)"suffix");
        if (!bl && charSequence instanceof String && charSequence2 instanceof String) {
            return p.y((String)charSequence, (String)charSequence2, false, 2, null);
        }
        return z.v0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), bl);
    }

    @NotNull
    public static final String U0(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)string2, (String)"delimiter");
        kotlin.jvm.internal.y.j((Object)string3, (String)"missingDelimiterValue");
        int n4 = p.l0(string, string2, 0, false, 6, null);
        if (n4 != -1) {
            string3 = string.substring(n4 + string2.length(), string.length());
            kotlin.jvm.internal.y.i((Object)string3, (String)"substring(...)");
        }
        return string3;
    }

    public static /* synthetic */ boolean V(CharSequence charSequence, char c4, boolean bl, int n4, Object object) {
        if ((n4 & 2) != 0) {
            bl = false;
        }
        return z.T(charSequence, c4, bl);
    }

    public static /* synthetic */ String V0(String string, char c4, String string2, int n4, Object object) {
        if ((n4 & 2) != 0) {
            string2 = string;
        }
        return p.T0(string, c4, string2);
    }

    public static /* synthetic */ boolean W(CharSequence charSequence, CharSequence charSequence2, boolean bl, int n4, Object object) {
        if ((n4 & 2) != 0) {
            bl = false;
        }
        return z.U(charSequence, charSequence2, bl);
    }

    public static /* synthetic */ String W0(String string, String string2, String string3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            string3 = string;
        }
        return z.U0(string, string2, string3);
    }

    private static final t<Integer, String> X(CharSequence object, Collection<String> object2, int n4, boolean bl, boolean bl2) {
        block12: {
            int n5;
            int n6;
            Object object32;
            block18: {
                int n7;
                block17: {
                    block14: {
                        int n8;
                        int n9;
                        block16: {
                            int n10;
                            block15: {
                                object32 = null;
                                if (!bl && object2.size() == 1) {
                                    object2 = (String)kotlin.collections.t.Q0((Iterable)object2);
                                    n4 = !bl2 ? p.e0((CharSequence)object, (String)object2, n4, false, 4, null) : p.l0((CharSequence)object, (String)object2, n4, false, 4, null);
                                    object = n4 < 0 ? object32 : kotlin.z.a((Object)n4, (Object)object2);
                                    return object;
                                }
                                object32 = !bl2 ? new kotlin.ranges.i(j.e(n4, 0), object.length()) : j.r(j.i(n4, p.Y((CharSequence)object)), 0);
                                if (!(object instanceof String)) break block14;
                                n10 = ((g)object32).d();
                                n9 = ((g)object32).e();
                                n8 = ((g)object32).f();
                                if (n8 <= 0) break block15;
                                n4 = n10;
                                if (n10 <= n9) break block16;
                            }
                            if (n8 >= 0 || n9 > n10) break block12;
                            n4 = n10;
                        }
                        while (true) {
                            block11: {
                                for (Object object32 : (Iterable)object2) {
                                    String string = (String)object32;
                                    if (!p.C(string, 0, (String)object, n4, string.length(), bl)) continue;
                                    break block11;
                                }
                                object32 = null;
                            }
                            object32 = (String)object32;
                            if (object32 != null) {
                                return kotlin.z.a((Object)n4, (Object)object32);
                            }
                            if (n4 != n9) {
                                n4 += n8;
                                continue;
                            }
                            break block12;
                            break;
                        }
                    }
                    n7 = ((g)object32).d();
                    n6 = ((g)object32).e();
                    n5 = ((g)object32).f();
                    if (n5 <= 0) break block17;
                    n4 = n7;
                    if (n7 <= n6) break block18;
                }
                if (n5 >= 0 || n6 > n7) break block12;
                n4 = n7;
            }
            while (true) {
                block13: {
                    for (Object object32 : (Iterable)object2) {
                        String string = (String)object32;
                        if (!z.v0(string, 0, (CharSequence)object, n4, string.length(), bl)) continue;
                        break block13;
                    }
                    object32 = null;
                }
                object32 = (String)object32;
                if (object32 != null) {
                    return kotlin.z.a((Object)n4, (Object)object32);
                }
                if (n4 == n6) break;
                n4 += n5;
            }
        }
        return null;
    }

    @NotNull
    public static final String X0(@NotNull String string, char c4, @NotNull String string2) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)string2, (String)"missingDelimiterValue");
        int n4 = p.d0(string, c4, 0, false, 6, null);
        if (n4 != -1) {
            string2 = string.substring(0, n4);
            kotlin.jvm.internal.y.i((Object)string2, (String)"substring(...)");
        }
        return string2;
    }

    public static int Y(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        return charSequence.length() - 1;
    }

    @NotNull
    public static final String Y0(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)string2, (String)"delimiter");
        kotlin.jvm.internal.y.j((Object)string3, (String)"missingDelimiterValue");
        int n4 = p.e0(string, string2, 0, false, 6, null);
        if (n4 != -1) {
            string3 = string.substring(0, n4);
            kotlin.jvm.internal.y.i((Object)string3, (String)"substring(...)");
        }
        return string3;
    }

    public static final int Z(@NotNull CharSequence charSequence, char c4, int n4, boolean bl) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        n4 = !bl && charSequence instanceof String ? ((String)charSequence).indexOf(c4, n4) : z.f0(charSequence, new char[]{c4}, n4, bl);
        return n4;
    }

    public static /* synthetic */ String Z0(String string, char c4, String string2, int n4, Object object) {
        if ((n4 & 2) != 0) {
            string2 = string;
        }
        return z.X0(string, c4, string2);
    }

    public static final int a0(@NotNull CharSequence charSequence, @NotNull String string, int n4, boolean bl) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)string, (String)"string");
        n4 = !bl && charSequence instanceof String ? ((String)charSequence).indexOf(string, n4) : z.c0(charSequence, string, n4, charSequence.length(), bl, false, 16, null);
        return n4;
    }

    public static /* synthetic */ String a1(String string, String string2, String string3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            string3 = string;
        }
        return z.Y0(string, string2, string3);
    }

    private static final int b0(CharSequence charSequence, CharSequence charSequence2, int n4, int n5, boolean bl, boolean bl2) {
        block12: {
            int n6;
            int n7;
            block17: {
                block16: {
                    g g4;
                    block13: {
                        int n8;
                        int n9;
                        block15: {
                            block14: {
                                g4 = !bl2 ? new kotlin.ranges.i(j.e(n4, 0), j.i(n5, charSequence.length())) : j.r(j.i(n4, p.Y(charSequence)), j.e(n5, 0));
                                if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) break block13;
                                n5 = g4.d();
                                n9 = g4.e();
                                n8 = g4.f();
                                if (n8 <= 0) break block14;
                                n4 = n5;
                                if (n5 <= n9) break block15;
                            }
                            if (n8 >= 0 || n9 > n5) break block12;
                            n4 = n5;
                        }
                        while (true) {
                            if (p.C((String)charSequence2, 0, (String)charSequence, n4, charSequence2.length(), bl)) {
                                return n4;
                            }
                            if (n4 != n9) {
                                n4 += n8;
                                continue;
                            }
                            break block12;
                            break;
                        }
                    }
                    n5 = g4.d();
                    n7 = g4.e();
                    n6 = g4.f();
                    if (n6 <= 0) break block16;
                    n4 = n5;
                    if (n5 <= n7) break block17;
                }
                if (n6 >= 0 || n7 > n5) break block12;
                n4 = n5;
            }
            while (true) {
                if (z.v0(charSequence2, 0, charSequence, n4, charSequence2.length(), bl)) {
                    return n4;
                }
                if (n4 == n7) break;
                n4 += n6;
            }
        }
        return -1;
    }

    @NotNull
    public static final String b1(@NotNull String string, char c4, @NotNull String string2) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)string2, (String)"missingDelimiterValue");
        int n4 = p.k0(string, c4, 0, false, 6, null);
        if (n4 != -1) {
            string2 = string.substring(0, n4);
            kotlin.jvm.internal.y.i((Object)string2, (String)"substring(...)");
        }
        return string2;
    }

    static /* synthetic */ int c0(CharSequence charSequence, CharSequence charSequence2, int n4, int n5, boolean bl, boolean bl2, int n6, Object object) {
        if ((n6 & 0x10) != 0) {
            bl2 = false;
        }
        return z.b0(charSequence, charSequence2, n4, n5, bl, bl2);
    }

    @NotNull
    public static final String c1(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)string2, (String)"delimiter");
        kotlin.jvm.internal.y.j((Object)string3, (String)"missingDelimiterValue");
        int n4 = p.l0(string, string2, 0, false, 6, null);
        if (n4 != -1) {
            string3 = string.substring(0, n4);
            kotlin.jvm.internal.y.i((Object)string3, (String)"substring(...)");
        }
        return string3;
    }

    public static /* synthetic */ int d0(CharSequence charSequence, char c4, int n4, boolean bl, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n4 = 0;
        }
        if ((n5 & 4) != 0) {
            bl = false;
        }
        return z.Z(charSequence, c4, n4, bl);
    }

    public static /* synthetic */ String d1(String string, char c4, String string2, int n4, Object object) {
        if ((n4 & 2) != 0) {
            string2 = string;
        }
        return z.b1(string, c4, string2);
    }

    public static /* synthetic */ int e0(CharSequence charSequence, String string, int n4, boolean bl, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n4 = 0;
        }
        if ((n5 & 4) != 0) {
            bl = false;
        }
        return z.a0(charSequence, string, n4, bl);
    }

    public static /* synthetic */ String e1(String string, String string2, String string3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            string3 = string;
        }
        return z.c1(string, string2, string3);
    }

    public static final int f0(@NotNull CharSequence charSequence, @NotNull char[] cArray, int n4, boolean bl) {
        int n5;
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)cArray, (String)"chars");
        if (!bl && cArray.length == 1 && charSequence instanceof String) {
            char c4 = kotlin.collections.l.T0(cArray);
            return ((String)charSequence).indexOf(c4, n4);
        }
        if ((n4 = j.e(n4, 0)) <= (n5 = p.Y(charSequence))) {
            while (true) {
                char c5 = charSequence.charAt(n4);
                int n6 = cArray.length;
                for (int i4 = 0; i4 < n6; ++i4) {
                    if (!c.h(cArray[i4], c5, bl)) continue;
                    return n4;
                }
                if (n4 == n5) break;
                ++n4;
            }
        }
        return -1;
    }

    @SinceKotlin(version="1.5")
    @Nullable
    public static Boolean f1(@NotNull String object) {
        kotlin.jvm.internal.y.j((Object)object, (String)"<this>");
        object = kotlin.jvm.internal.y.e((Object)object, (Object)"true") ? Boolean.TRUE : (kotlin.jvm.internal.y.e((Object)object, (Object)"false") ? Boolean.FALSE : null);
        return object;
    }

    public static /* synthetic */ int g0(CharSequence charSequence, char[] cArray, int n4, boolean bl, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n4 = 0;
        }
        if ((n5 & 4) != 0) {
            bl = false;
        }
        return z.f0(charSequence, cArray, n4, bl);
    }

    @NotNull
    public static CharSequence g1(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        int n4 = charSequence.length() - 1;
        int n5 = 0;
        boolean bl = false;
        while (n5 <= n4) {
            int n6 = !bl ? n5 : n4;
            boolean bl2 = a.c(charSequence.charAt(n6));
            if (!bl) {
                if (!bl2) {
                    bl = true;
                    continue;
                }
                ++n5;
                continue;
            }
            if (!bl2) break;
            --n4;
        }
        return charSequence.subSequence(n5, n4 + 1);
    }

    public static boolean h0(@NotNull CharSequence charSequence) {
        boolean bl;
        block2: {
            kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
            bl = false;
            for (int i4 = 0; i4 < charSequence.length(); ++i4) {
                if (a.c(charSequence.charAt(i4))) {
                    continue;
                }
                break block2;
            }
            bl = true;
        }
        return bl;
    }

    @NotNull
    public static String h1(@NotNull String string, char ... cArray) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)cArray, (String)"chars");
        int n4 = string.length() - 1;
        int n5 = 0;
        boolean bl = false;
        while (n5 <= n4) {
            int n6 = !bl ? n5 : n4;
            boolean bl2 = kotlin.collections.l.Z(cArray, string.charAt(n6));
            if (!bl) {
                if (!bl2) {
                    bl = true;
                    continue;
                }
                ++n5;
                continue;
            }
            if (!bl2) break;
            --n4;
        }
        return ((Object)string.subSequence(n5, n4 + 1)).toString();
    }

    public static final int i0(@NotNull CharSequence charSequence, char c4, int n4, boolean bl) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        n4 = !bl && charSequence instanceof String ? ((String)charSequence).lastIndexOf(c4, n4) : z.m0(charSequence, new char[]{c4}, n4, bl);
        return n4;
    }

    @NotNull
    public static CharSequence i1(@NotNull CharSequence charSequence) {
        block3: {
            kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
            int n4 = charSequence.length() - 1;
            if (n4 >= 0) {
                while (true) {
                    int n5 = n4 - 1;
                    if (!a.c(charSequence.charAt(n4))) {
                        charSequence = charSequence.subSequence(0, n4 + 1);
                        break block3;
                    }
                    if (n5 < 0) break;
                    n4 = n5;
                }
            }
            charSequence = "";
        }
        return charSequence;
    }

    public static final int j0(@NotNull CharSequence charSequence, @NotNull String string, int n4, boolean bl) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)string, (String)"string");
        n4 = !bl && charSequence instanceof String ? ((String)charSequence).lastIndexOf(string, n4) : z.b0(charSequence, string, n4, 0, bl, true);
        return n4;
    }

    @NotNull
    public static String j1(@NotNull String charSequence, char ... cArray) {
        block3: {
            kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
            kotlin.jvm.internal.y.j((Object)cArray, (String)"chars");
            int n4 = charSequence.length() - 1;
            if (n4 >= 0) {
                while (true) {
                    int n5 = n4 - 1;
                    if (!kotlin.collections.l.Z(cArray, charSequence.charAt(n4))) {
                        charSequence = charSequence.subSequence(0, n4 + 1);
                        break block3;
                    }
                    if (n5 < 0) break;
                    n4 = n5;
                }
            }
            charSequence = "";
        }
        return charSequence.toString();
    }

    public static /* synthetic */ int k0(CharSequence charSequence, char c4, int n4, boolean bl, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n4 = p.Y(charSequence);
        }
        if ((n5 & 4) != 0) {
            bl = false;
        }
        return z.i0(charSequence, c4, n4, bl);
    }

    @NotNull
    public static CharSequence k1(@NotNull CharSequence charSequence) {
        block1: {
            kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
            int n4 = charSequence.length();
            for (int i4 = 0; i4 < n4; ++i4) {
                if (a.c(charSequence.charAt(i4))) continue;
                charSequence = charSequence.subSequence(i4, charSequence.length());
                break block1;
            }
            charSequence = "";
        }
        return charSequence;
    }

    public static /* synthetic */ int l0(CharSequence charSequence, String string, int n4, boolean bl, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n4 = p.Y(charSequence);
        }
        if ((n5 & 4) != 0) {
            bl = false;
        }
        return z.j0(charSequence, string, n4, bl);
    }

    public static final int m0(@NotNull CharSequence charSequence, @NotNull char[] cArray, int n4, boolean bl) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)cArray, (String)"chars");
        if (!bl && cArray.length == 1 && charSequence instanceof String) {
            char c4 = kotlin.collections.l.T0(cArray);
            return ((String)charSequence).lastIndexOf(c4, n4);
        }
        for (n4 = j.i(n4, p.Y(charSequence)); -1 < n4; --n4) {
            char c5 = charSequence.charAt(n4);
            int n5 = cArray.length;
            for (int i4 = 0; i4 < n5; ++i4) {
                if (!c.h(cArray[i4], c5, bl)) continue;
                return n4;
            }
        }
        return -1;
    }

    @NotNull
    public static i<String> n0(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        return z.I0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    @NotNull
    public static final List<String> o0(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        return kotlin.sequences.l.H(p.n0(charSequence));
    }

    @NotNull
    public static final CharSequence p0(@NotNull CharSequence charSequence, int n4, char c4) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        if (n4 >= 0) {
            if (n4 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder stringBuilder = new StringBuilder(n4);
            int n5 = n4 - charSequence.length();
            n4 = 1;
            if (1 <= n5) {
                while (true) {
                    stringBuilder.append(c4);
                    if (n4 == n5) break;
                    ++n4;
                }
            }
            stringBuilder.append(charSequence);
            return stringBuilder;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Desired length ");
        ((StringBuilder)charSequence).append(n4);
        ((StringBuilder)charSequence).append(" is less than zero.");
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
    }

    @NotNull
    public static String q0(@NotNull String string, int n4, char c4) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        return ((Object)z.p0(string, n4, c4)).toString();
    }

    private static final i<kotlin.ranges.i> r0(CharSequence charSequence, char[] cArray, int n4, boolean bl, int n5) {
        z.B0(n5);
        return new e(charSequence, n4, n5, (kotlin.jvm.functions.p<? super CharSequence, ? super Integer, t<Integer, Integer>>)new kotlin.jvm.functions.p<CharSequence, Integer, t<? extends Integer, ? extends Integer>>(cArray, bl){
            final char[] g;
            final boolean h;
            {
                this.g = cArray;
                this.h = bl;
                super(2);
            }

            public final t<Integer, Integer> a(CharSequence charSequence, int n4) {
                kotlin.jvm.internal.y.j((Object)charSequence, (String)"$this$$receiver");
                n4 = z.f0(charSequence, this.g, n4, this.h);
                charSequence = n4 < 0 ? null : kotlin.z.a((Object)n4, (Object)1);
                return charSequence;
            }
        });
    }

    private static final i<kotlin.ranges.i> s0(CharSequence charSequence, String[] stringArray, int n4, boolean bl, int n5) {
        z.B0(n5);
        return new e(charSequence, n4, n5, (kotlin.jvm.functions.p<? super CharSequence, ? super Integer, t<Integer, Integer>>)new kotlin.jvm.functions.p<CharSequence, Integer, t<? extends Integer, ? extends Integer>>((List<String>)kotlin.collections.l.e(stringArray), bl){
            final List<String> g;
            final boolean h;
            {
                this.g = list;
                this.h = bl;
                super(2);
            }

            public final t<Integer, Integer> a(CharSequence charSequence, int n4) {
                kotlin.jvm.internal.y.j((Object)charSequence, (String)"$this$$receiver");
                charSequence = z.X(charSequence, this.g, n4, this.h, false);
                charSequence = charSequence != null ? kotlin.z.a((Object)charSequence.c(), (Object)((String)charSequence.d()).length()) : null;
                return charSequence;
            }
        });
    }

    static /* synthetic */ i t0(CharSequence charSequence, char[] cArray, int n4, boolean bl, int n5, int n6, Object object) {
        if ((n6 & 2) != 0) {
            n4 = 0;
        }
        if ((n6 & 4) != 0) {
            bl = false;
        }
        if ((n6 & 8) != 0) {
            n5 = 0;
        }
        return z.r0(charSequence, cArray, n4, bl, n5);
    }

    static /* synthetic */ i u0(CharSequence charSequence, String[] stringArray, int n4, boolean bl, int n5, int n6, Object object) {
        if ((n6 & 2) != 0) {
            n4 = 0;
        }
        if ((n6 & 4) != 0) {
            bl = false;
        }
        if ((n6 & 8) != 0) {
            n5 = 0;
        }
        return z.s0(charSequence, stringArray, n4, bl, n5);
    }

    public static final boolean v0(@NotNull CharSequence charSequence, int n4, @NotNull CharSequence charSequence2, int n5, int n6, boolean bl) {
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)charSequence2, (String)"other");
        if (n5 >= 0 && n4 >= 0 && n4 <= charSequence.length() - n6 && n5 <= charSequence2.length() - n6) {
            for (int i4 = 0; i4 < n6; ++i4) {
                if (c.h(charSequence.charAt(n4 + i4), charSequence2.charAt(n5 + i4), bl)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    @NotNull
    public static String w0(@NotNull String string, @NotNull CharSequence charSequence) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"prefix");
        String string2 = string;
        if (z.M0(string, charSequence, false, 2, null)) {
            string2 = string.substring(charSequence.length());
            kotlin.jvm.internal.y.i((Object)string2, (String)"substring(...)");
        }
        return string2;
    }

    @NotNull
    public static String x0(@NotNull String string, @NotNull CharSequence charSequence) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"suffix");
        String string2 = string;
        if (p.W(string, charSequence, false, 2, null)) {
            string2 = string.substring(0, string.length() - charSequence.length());
            kotlin.jvm.internal.y.i((Object)string2, (String)"substring(...)");
        }
        return string2;
    }

    @NotNull
    public static String y0(@NotNull String string, @NotNull CharSequence charSequence) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"delimiter");
        return z.z0(string, charSequence, charSequence);
    }

    @NotNull
    public static final String z0(@NotNull String string, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)charSequence, (String)"prefix");
        kotlin.jvm.internal.y.j((Object)charSequence2, (String)"suffix");
        String string2 = string;
        if (string.length() >= charSequence.length() + charSequence2.length()) {
            string2 = string;
            if (z.M0(string, charSequence, false, 2, null)) {
                string2 = string;
                if (p.W(string, charSequence2, false, 2, null)) {
                    string2 = string.substring(charSequence.length(), string.length() - charSequence2.length());
                    kotlin.jvm.internal.y.i((Object)string2, (String)"substring(...)");
                }
            }
        }
        return string2;
    }
}


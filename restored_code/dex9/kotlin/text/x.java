/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.jvm.internal.y
 *  kotlin.text.b
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.text;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.y;
import kotlin.text.a;
import kotlin.text.b;
import kotlin.text.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"", "", "m", "(Ljava/lang/String;)Ljava/lang/Integer;", "radix", "n", "(Ljava/lang/String;I)Ljava/lang/Integer;", "", "o", "(Ljava/lang/String;)Ljava/lang/Long;", "p", "(Ljava/lang/String;I)Ljava/lang/Long;", "input", "", "l", "(Ljava/lang/String;)Ljava/lang/Void;", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/text/StringsKt")
class x
extends w {
    @NotNull
    public static final Void l(@NotNull String string) {
        y.j((Object)string, (String)"input");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid number format: '");
        stringBuilder.append(string);
        stringBuilder.append('\'');
        throw new NumberFormatException(stringBuilder.toString());
    }

    @SinceKotlin(version="1.1")
    @Nullable
    public static Integer m(@NotNull String string) {
        y.j((Object)string, (String)"<this>");
        return x.n(string, 10);
    }

    @SinceKotlin(version="1.1")
    @Nullable
    public static final Integer n(@NotNull String object, int n4) {
        y.j((Object)object, (String)"<this>");
        a.a(n4);
        int n5 = ((String)object).length();
        if (n5 == 0) {
            return null;
        }
        int n6 = 0;
        char c4 = ((String)object).charAt(0);
        int n7 = y.l((int)c4, (int)48);
        int n8 = -2147483647;
        if (n7 < 0) {
            n7 = 1;
            if (n5 == 1) {
                return null;
            }
            if (c4 != '+') {
                if (c4 != '-') {
                    return null;
                }
                n8 = Integer.MIN_VALUE;
                c4 = '\u0001';
            } else {
                c4 = '\u0000';
            }
        } else {
            c4 = '\u0000';
            n7 = 0;
        }
        int n9 = -59652323;
        while (n7 < n5) {
            int n10;
            int n11;
            block13: {
                block14: {
                    n11 = b.b((char)((String)object).charAt(n7), (int)n4);
                    if (n11 < 0) {
                        return null;
                    }
                    n10 = n9;
                    if (n6 >= n9) break block13;
                    if (n9 != -59652323) break block14;
                    n10 = n9 = n8 / n4;
                    if (n6 >= n9) break block13;
                }
                return null;
            }
            if ((n6 *= n4) < n8 + n11) {
                return null;
            }
            n6 -= n11;
            ++n7;
            n9 = n10;
        }
        object = c4 != '\u0000' ? Integer.valueOf(n6) : Integer.valueOf(-n6);
        return object;
    }

    @SinceKotlin(version="1.1")
    @Nullable
    public static Long o(@NotNull String string) {
        y.j((Object)string, (String)"<this>");
        return x.p(string, 10);
    }

    @SinceKotlin(version="1.1")
    @Nullable
    public static final Long p(@NotNull String object, int n4) {
        y.j((Object)object, (String)"<this>");
        a.a(n4);
        int n5 = ((String)object).length();
        if (n5 == 0) {
            return null;
        }
        int n6 = 0;
        int n7 = ((String)object).charAt(0);
        int n8 = y.l((int)n7, (int)48);
        long l4 = -9223372036854775807L;
        if (n8 < 0) {
            n8 = 1;
            if (n5 == 1) {
                return null;
            }
            if (n7 != 43) {
                if (n7 != 45) {
                    return null;
                }
                l4 = Long.MIN_VALUE;
                n6 = 1;
            } else {
                n8 = 0;
                n6 = 1;
            }
        } else {
            n8 = 0;
        }
        long l5 = 0L;
        long l6 = -256204778801521550L;
        while (n6 < n5) {
            long l7;
            block13: {
                block14: {
                    n7 = b.b((char)((String)object).charAt(n6), (int)n4);
                    if (n7 < 0) {
                        return null;
                    }
                    l7 = l6;
                    if (l5 >= l6) break block13;
                    if (l6 != -256204778801521550L) break block14;
                    l7 = l6 = l4 / (long)n4;
                    if (l5 >= l6) break block13;
                }
                return null;
            }
            if ((l6 = l5 * (long)n4) < l4 + (l5 = (long)n7)) {
                return null;
            }
            l5 = l6 - l5;
            ++n6;
            l6 = l7;
        }
        object = n8 != 0 ? Long.valueOf(l5) : Long.valueOf(-l5);
        return object;
    }
}


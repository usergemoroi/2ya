/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Deprecated
 *  kotlin.DeprecatedSinceKotlin
 *  kotlin.Metadata
 *  kotlin.ReplaceWith
 *  kotlin.SinceKotlin
 *  kotlin.internal.LowPriorityInOverloadResolution
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.jvm.internal.z0
 *  kotlin.text.d
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.text;

import java.util.Comparator;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.z0;
import kotlin.ranges.j;
import kotlin.text.c;
import kotlin.text.d;
import kotlin.text.p;
import kotlin.text.x;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000N\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\t\u0010\n\u001a+\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u0000*\u00020\u000fH\u0007\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0015\u001a\u00020\u0000*\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012H\u0007\u00a2\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0000*\u00020\u0017H\u0007\u00a2\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0017*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001d\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u001d\u0010\u0005\u001a+\u0010\u001e\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010!\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b!\u0010\u0005\u001a \u0010#\u001a\u00020\u0002*\u0004\u0018\u00010\"2\b\u0010\u0001\u001a\u0004\u0018\u00010\"H\u0087\u0004\u00a2\u0006\u0004\b#\u0010$\u001a;\u0010(\u001a\u00020\u0002*\u00020\u00002\u0006\u0010%\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b(\u0010)\u001a\u0013\u0010*\u001a\u00020\u0000*\u00020\u0000H\u0007\u00a2\u0006\u0004\b*\u0010+\u001a\u001b\u0010.\u001a\u00020\u0000*\u00020\u00002\u0006\u0010-\u001a\u00020,H\u0007\u00a2\u0006\u0004\b.\u0010/\u001a\u0019\u00101\u001a\u00020\u0000*\u00020\"2\u0006\u00100\u001a\u00020\u0012\u00a2\u0006\u0004\b1\u00102\"%\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u000004j\b\u0012\u0004\u0012\u00020\u0000`5*\u0002038F\u00a2\u0006\u0006\u001a\u0004\b6\u00107\u00a8\u00069"}, d2={"", "other", "", "ignoreCase", "z", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "", "oldChar", "newChar", "F", "(Ljava/lang/String;CCZ)Ljava/lang/String;", "oldValue", "newValue", "G", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "", "s", "([C)Ljava/lang/String;", "", "startIndex", "endIndex", "t", "([CII)Ljava/lang/String;", "", "v", "([B)Ljava/lang/String;", "w", "(Ljava/lang/String;)[B", "prefix", "K", "J", "(Ljava/lang/String;Ljava/lang/String;IZ)Z", "suffix", "x", "", "u", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "thisOffset", "otherOffset", "length", "C", "(Ljava/lang/String;ILjava/lang/String;IIZ)Z", "q", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Locale;", "locale", "r", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "n", "E", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "Lkotlin/String$Companion;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "B", "(Lkotlin/jvm/internal/z0;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/text/StringsKt")
@SourceDebugExtension(value={"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,818:1\n1179#2,2:819\n1#3:821\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:819,2\n*E\n"})
class y
extends x {
    public static /* synthetic */ boolean A(String string, String string2, boolean bl, int n4, Object object) {
        if ((n4 & 2) != 0) {
            bl = false;
        }
        return p.z(string, string2, bl);
    }

    @NotNull
    public static Comparator<String> B(@NotNull z0 object) {
        kotlin.jvm.internal.y.j((Object)object, (String)"<this>");
        object = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.y.i((Object)object, (String)"CASE_INSENSITIVE_ORDER");
        return object;
    }

    public static boolean C(@NotNull String string, int n4, @NotNull String string2, int n5, int n6, boolean bl) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)string2, (String)"other");
        bl = !bl ? string.regionMatches(n4, string2, n5, n6) : string.regionMatches(bl, n4, string2, n5, n6);
        return bl;
    }

    public static /* synthetic */ boolean D(String string, int n4, String string2, int n5, int n6, boolean bl, int n7, Object object) {
        if ((n7 & 0x10) != 0) {
            bl = false;
        }
        return p.C(string, n4, string2, n5, n6, bl);
    }

    @NotNull
    public static String E(@NotNull CharSequence object, int n4) {
        kotlin.jvm.internal.y.j((Object)object, (String)"<this>");
        if (n4 >= 0) {
            String string = "";
            CharSequence charSequence = string;
            if (n4 != 0) {
                int n5 = 1;
                if (n4 != 1) {
                    int n6 = object.length();
                    charSequence = string;
                    if (n6 != 0) {
                        if (n6 != 1) {
                            charSequence = new StringBuilder(object.length() * n4);
                            if (1 <= n4) {
                                while (true) {
                                    ((StringBuilder)charSequence).append((CharSequence)object);
                                    if (n5 == n4) break;
                                    ++n5;
                                }
                            }
                            charSequence = ((StringBuilder)charSequence).toString();
                            kotlin.jvm.internal.y.g((Object)charSequence);
                        } else {
                            char c4 = object.charAt(0);
                            object = new char[n4];
                            for (n5 = 0; n5 < n4; ++n5) {
                                object[n5] = c4;
                            }
                            charSequence = new String((char[])object);
                        }
                    }
                } else {
                    charSequence = object.toString();
                }
            }
            return charSequence;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Count 'n' must be non-negative, but was ");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append('.');
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @NotNull
    public static final String F(@NotNull String string, char c4, char c5, boolean bl) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        if (!bl) {
            string = string.replace(c4, c5);
            kotlin.jvm.internal.y.i((Object)string, (String)"replace(...)");
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(string.length());
        for (int i4 = 0; i4 < string.length(); ++i4) {
            char c6;
            char c7 = c6 = string.charAt(i4);
            if (c.h(c6, c4, bl)) {
                c7 = c5;
            }
            stringBuilder.append(c7);
        }
        string = stringBuilder.toString();
        kotlin.jvm.internal.y.i((Object)string, (String)"toString(...)");
        return string;
    }

    @NotNull
    public static String G(@NotNull String string, @NotNull String string2, @NotNull String string3, boolean bl) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)string2, (String)"oldValue");
        kotlin.jvm.internal.y.j((Object)string3, (String)"newValue");
        int n4 = 0;
        int n5 = z.a0(string, string2, 0, bl);
        if (n5 < 0) {
            return string;
        }
        int n6 = string2.length();
        int n7 = j.e(n6, 1);
        int n8 = string.length() - n6 + string3.length();
        if (n8 >= 0) {
            int n9;
            StringBuilder stringBuilder = new StringBuilder(n8);
            do {
                stringBuilder.append(string, n4, n5);
                stringBuilder.append(string3);
                n9 = n5 + n6;
                if (n5 >= string.length()) break;
                n8 = z.a0(string, string2, n5 + n7, bl);
                n4 = n9;
                n5 = n8;
            } while (n8 > 0);
            stringBuilder.append(string, n9, string.length());
            string = stringBuilder.toString();
            kotlin.jvm.internal.y.i((Object)string, (String)"toString(...)");
            return string;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String H(String string, char c4, char c5, boolean bl, int n4, Object object) {
        if ((n4 & 4) != 0) {
            bl = false;
        }
        return y.F(string, c4, c5, bl);
    }

    public static /* synthetic */ String I(String string, String string2, String string3, boolean bl, int n4, Object object) {
        if ((n4 & 4) != 0) {
            bl = false;
        }
        return p.G(string, string2, string3, bl);
    }

    public static boolean J(@NotNull String string, @NotNull String string2, int n4, boolean bl) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)string2, (String)"prefix");
        if (!bl) {
            return string.startsWith(string2, n4);
        }
        return p.C(string, n4, string2, 0, string2.length(), bl);
    }

    public static boolean K(@NotNull String string, @NotNull String string2, boolean bl) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)string2, (String)"prefix");
        if (!bl) {
            return string.startsWith(string2);
        }
        return p.C(string, 0, string2, 0, string2.length(), bl);
    }

    public static /* synthetic */ boolean L(String string, String string2, int n4, boolean bl, int n5, Object object) {
        if ((n5 & 4) != 0) {
            bl = false;
        }
        return p.J(string, string2, n4, bl);
    }

    public static /* synthetic */ boolean M(String string, String string2, boolean bl, int n4, Object object) {
        if ((n4 & 2) != 0) {
            bl = false;
        }
        return p.K(string, string2, bl);
    }

    @Deprecated(message="Use replaceFirstChar instead.", replaceWith=@ReplaceWith(expression="replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports={"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince="1.5")
    @NotNull
    public static String q(@NotNull String string) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.y.i((Object)locale, (String)"getDefault(...)");
        return y.r(string, locale);
    }

    @Deprecated(message="Use replaceFirstChar instead.", replaceWith=@ReplaceWith(expression="replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.5")
    @SinceKotlin(version="1.4")
    @LowPriorityInOverloadResolution
    @NotNull
    public static final String r(@NotNull String string, @NotNull Locale object) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)object, (String)"locale");
        CharSequence charSequence = string;
        if (string.length() > 0) {
            char c4 = string.charAt(0);
            charSequence = string;
            if (Character.isLowerCase(c4)) {
                charSequence = new StringBuilder();
                char c5 = Character.toTitleCase(c4);
                if (c5 != Character.toUpperCase(c4)) {
                    ((StringBuilder)charSequence).append(c5);
                } else {
                    String string2 = string.substring(0, 1);
                    kotlin.jvm.internal.y.i((Object)string2, (String)"substring(...)");
                    kotlin.jvm.internal.y.h((Object)string2, (String)"null cannot be cast to non-null type java.lang.String");
                    object = string2.toUpperCase((Locale)object);
                    kotlin.jvm.internal.y.i((Object)object, (String)"toUpperCase(...)");
                    ((StringBuilder)charSequence).append((String)object);
                }
                string = string.substring(1);
                kotlin.jvm.internal.y.i((Object)string, (String)"substring(...)");
                ((StringBuilder)charSequence).append(string);
                charSequence = ((StringBuilder)charSequence).toString();
                kotlin.jvm.internal.y.i((Object)charSequence, (String)"toString(...)");
            }
        }
        return charSequence;
    }

    @SinceKotlin(version="1.4")
    @NotNull
    public static String s(@NotNull char[] cArray) {
        kotlin.jvm.internal.y.j((Object)cArray, (String)"<this>");
        return new String(cArray);
    }

    @SinceKotlin(version="1.4")
    @NotNull
    public static String t(@NotNull char[] cArray, int n4, int n5) {
        kotlin.jvm.internal.y.j((Object)cArray, (String)"<this>");
        kotlin.collections.c.Companion.a(n4, n5, cArray.length);
        return new String(cArray, n4, n5 - n4);
    }

    @SinceKotlin(version="1.5")
    public static boolean u(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        boolean bl = charSequence instanceof String && charSequence2 != null ? ((String)charSequence).contentEquals(charSequence2) : z.S(charSequence, charSequence2);
        return bl;
    }

    @SinceKotlin(version="1.4")
    @NotNull
    public static String v(@NotNull byte[] byArray) {
        kotlin.jvm.internal.y.j((Object)byArray, (String)"<this>");
        return new String(byArray, d.b);
    }

    @SinceKotlin(version="1.4")
    @NotNull
    public static byte[] w(@NotNull String object) {
        kotlin.jvm.internal.y.j((Object)object, (String)"<this>");
        object = ((String)object).getBytes(d.b);
        kotlin.jvm.internal.y.i((Object)object, (String)"getBytes(...)");
        return object;
    }

    public static boolean x(@NotNull String string, @NotNull String string2, boolean bl) {
        kotlin.jvm.internal.y.j((Object)string, (String)"<this>");
        kotlin.jvm.internal.y.j((Object)string2, (String)"suffix");
        if (!bl) {
            return string.endsWith(string2);
        }
        return p.C(string, string.length() - string2.length(), string2, 0, string2.length(), true);
    }

    public static /* synthetic */ boolean y(String string, String string2, boolean bl, int n4, Object object) {
        if ((n4 & 2) != 0) {
            bl = false;
        }
        return p.x(string, string2, bl);
    }

    public static boolean z(@Nullable String string, @Nullable String string2, boolean bl) {
        if (string == null) {
            bl = string2 == null;
            return bl;
        }
        bl = !bl ? string.equals(string2) : string.equalsIgnoreCase(string2);
        return bl;
    }
}


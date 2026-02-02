/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.internal.IntrinsicConstEvaluation
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.text.q
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import kotlin.text.q;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000\u00a2\u0006\u0004\b\t\u0010\u0003\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0002\u00a2\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000e2\u0006\u0010\r\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2={"", "marginPrefix", "g", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "newIndent", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "f", "(Ljava/lang/String;)Ljava/lang/String;", "d", "", "c", "(Ljava/lang/String;)I", "indent", "Lkotlin/Function1;", "b", "(Ljava/lang/String;)Lkotlin/jvm/functions/l;", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/text/StringsKt")
@SourceDebugExtension(value={"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,129:1\n119#1,2:131\n121#1,4:146\n126#1,2:159\n119#1,2:168\n121#1,4:183\n126#1,2:190\n1#2:130\n1#2:156\n1#2:187\n1#2:211\n1577#3,11:133\n1872#3,2:144\n1874#3:157\n1588#3:158\n774#3:161\n865#3,2:162\n1557#3:164\n1628#3,3:165\n1577#3,11:170\n1872#3,2:181\n1874#3:188\n1588#3:189\n1577#3,11:198\n1872#3,2:209\n1874#3:212\n1588#3:213\n158#4,6:150\n158#4,6:192\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n42#1:131,2\n42#1:146,4\n42#1:159,2\n83#1:168,2\n83#1:183,4\n83#1:190,2\n42#1:156\n83#1:187\n120#1:211\n42#1:133,11\n42#1:144,2\n42#1:157\n42#1:158\n79#1:161\n79#1:162,2\n80#1:164\n80#1:165,3\n83#1:170,11\n83#1:181,2\n83#1:188\n83#1:189\n120#1:198,11\n120#1:209,2\n120#1:212\n120#1:213\n43#1:150,6\n107#1:192,6\n*E\n"})
class r
extends q {
    private static final l<String, String> b(String l4) {
        l4 = l4.length() == 0 ? a.g : new l<String, String>((String)((Object)l4)){
            final String g;
            {
                this.g = string;
                super(1);
            }

            public final String b(String string) {
                y.j((Object)string, (String)"line");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.g);
                stringBuilder.append(string);
                return stringBuilder.toString();
            }
        };
        return l4;
    }

    private static final int c(String string) {
        int n4;
        int n5;
        block3: {
            n5 = string.length();
            for (n4 = 0; n4 < n5; ++n4) {
                if (!(kotlin.text.a.c(string.charAt(n4)) ^ true)) {
                    continue;
                }
                break block3;
            }
            n4 = -1;
        }
        n5 = n4;
        if (n4 == -1) {
            n5 = string.length();
        }
        return n5;
    }

    @NotNull
    public static final String d(@NotNull String object, @NotNull String string) {
        Object object2;
        y.j((Object)object, (String)"<this>");
        y.j((Object)string, (String)"newIndent");
        List<String> list = z.o0((CharSequence)object);
        Object object3 = list;
        l<String, String> l4 = new ArrayList();
        object3 = object3.iterator();
        while (object3.hasNext()) {
            object2 = object3.next();
            if (!(p.h0((String)object2) ^ true)) continue;
            l4.add(object2);
        }
        object3 = new ArrayList<Integer>(t.x(l4, 10));
        l4 = l4.iterator();
        while (l4.hasNext()) {
            object3.add(r.c((String)l4.next()));
        }
        l4 = (Integer)t.H0(object3);
        int n4 = 0;
        int n5 = l4 != null ? (Integer)((Object)l4) : 0;
        int n6 = ((String)object).length();
        int n7 = string.length();
        int n8 = list.size();
        l4 = r.b(string);
        int n9 = t.o(list);
        object = list;
        list = new ArrayList<String>();
        object3 = object.iterator();
        while (object3.hasNext()) {
            object = object3.next();
            if (n4 < 0) {
                t.w();
            }
            string = (String)object;
            if ((n4 == 0 || n4 == n9) && p.h0(string)) {
                object = null;
            } else {
                object2 = p.l1(string, n5);
                object = string;
                if (object2 != null && (object = l4.invoke((String)object2)) == null) {
                    object = string;
                }
            }
            if (object != null) {
                list.add((String)object);
            }
            ++n4;
        }
        object = ((StringBuilder)t.z0(list, new StringBuilder(n6 + n7 * n8), "\n", null, null, 0, null, null, 124, null)).toString();
        y.i((Object)object, (String)"toString(...)");
        return object;
    }

    @NotNull
    public static final String e(@NotNull String object, @NotNull String string, @NotNull String string2) {
        y.j((Object)object, (String)"<this>");
        y.j((Object)string, (String)"newIndent");
        y.j((Object)string2, (String)"marginPrefix");
        if (p.h0(string2) ^ true) {
            Object object2 = z.o0((CharSequence)object);
            int n4 = ((String)object).length();
            int n5 = string.length();
            int n6 = object2.size();
            l<String, String> l4 = r.b(string);
            int n7 = t.o(object2);
            object = (Iterable)object2;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            Iterator iterator = object.iterator();
            int n8 = 0;
            while (iterator.hasNext()) {
                object = iterator.next();
                if (n8 < 0) {
                    t.w();
                }
                object2 = (String)object;
                string = null;
                if ((n8 == 0 || n8 == n7) && p.h0((CharSequence)object2)) {
                    object = null;
                } else {
                    int n9;
                    int n10;
                    block10: {
                        n10 = object2.length();
                        for (n9 = 0; n9 < n10; ++n9) {
                            if (!(kotlin.text.a.c(object2.charAt(n9)) ^ true)) {
                                continue;
                            }
                            break block10;
                        }
                        n9 = -1;
                    }
                    if (n9 != -1 && p.L((String)object2, string2, n9, false, 4, null)) {
                        n10 = string2.length();
                        y.h((Object)object2, (String)"null cannot be cast to non-null type java.lang.String");
                        string = ((String)object2).substring(n9 + n10);
                        y.i((Object)string, (String)"substring(...)");
                    }
                    object = object2;
                    if (string != null && (object = l4.invoke(string)) == null) {
                        object = object2;
                    }
                }
                if (object != null) {
                    arrayList.add(object);
                }
                ++n8;
            }
            object = ((StringBuilder)t.z0(arrayList, new StringBuilder(n4 + n5 * n6), "\n", null, null, 0, null, null, 124, null)).toString();
            y.i((Object)object, (String)"toString(...)");
            return object;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    @IntrinsicConstEvaluation
    @NotNull
    public static String f(@NotNull String string) {
        y.j((Object)string, (String)"<this>");
        return r.d(string, "");
    }

    @IntrinsicConstEvaluation
    @NotNull
    public static final String g(@NotNull String string, @NotNull String string2) {
        y.j((Object)string, (String)"<this>");
        y.j((Object)string2, (String)"marginPrefix");
        return r.e(string, "", string2);
    }

    public static /* synthetic */ String h(String string, String string2, int n4, Object object) {
        if ((n4 & 1) != 0) {
            string2 = "|";
        }
        return r.g(string, string2);
    }
}


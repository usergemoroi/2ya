/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmName
 *  kotlin.jvm.JvmStatic
 *  kotlin.jvm.internal.f
 *  kotlin.jvm.internal.markers.a
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  kotlin.jvm.internal.z0
 *  kotlin.t
 *  kotlin.z
 *  okhttp3.internal.d
 *  okhttp3.internal.http.c
 *  okhttp3.u$a
 *  okhttp3.u$b
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z0;
import kotlin.text.p;
import kotlin.z;
import okhttp3.internal.d;
import okhttp3.internal.http.c;
import okhttp3.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Exception performing whole class analysis ignored.
 */
@Metadata(d1={"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000 \f2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u0005\bB\u0017\b\u0002\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030$\u00a2\u0006\u0004\b)\u0010*J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0012H\u0096\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f0!\u00a2\u0006\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020\n8G\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u001e\u00a8\u0006+"}, d2={"Lokhttp3/u;", "", "Lkotlin/t;", "", "name", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Date;", "b", "(Ljava/lang/String;)Ljava/util/Date;", "", "index", "d", "(I)Ljava/lang/String;", "h", "", "i", "(Ljava/lang/String;)Ljava/util/List;", "", "iterator", "()Ljava/util/Iterator;", "Lokhttp3/u$a;", "e", "()Lokhttp3/u$a;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "", "g", "()Ljava/util/Map;", "", "c", "[Ljava/lang/String;", "namesAndValues", "size", "<init>", "([Ljava/lang/String;)V", "okhttp"}, k=1, mv={1, 8, 0})
public final class u
implements Iterable<kotlin.t<? extends String, ? extends String>>,
kotlin.jvm.internal.markers.a {
    @NotNull
    public static final b d = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private final String[] c;

    private u(String[] stringArray) {
        this.c = stringArray;
    }

    public /* synthetic */ u(String[] stringArray, kotlin.jvm.internal.p p4) {
        this(stringArray);
    }

    @JvmStatic
    @JvmName(name="of")
    @NotNull
    public static final u f(String ... stringArray) {
        return d.h(stringArray);
    }

    @Nullable
    public final String a(@NotNull String string) {
        y.j((Object)string, (String)"name");
        return b.c(d, (String[])this.c, (String)string);
    }

    @Nullable
    public final Date b(@NotNull String object) {
        y.j((Object)object, (String)"name");
        object = this.a((String)object);
        object = object != null ? okhttp3.internal.http.c.a((String)object) : null;
        return object;
    }

    @NotNull
    public final String d(int n4) {
        return this.c[n4 * 2];
    }

    @NotNull
    public final a e() {
        a a4 = new /* Unavailable Anonymous Inner Class!! */;
        t.G((Collection)a4.h(), this.c);
        return a4;
    }

    public boolean equals(@Nullable Object object) {
        boolean bl = object instanceof u && Arrays.equals(this.c, ((u)object).c);
        return bl;
    }

    @NotNull
    public final Map<String, List<String>> g() {
        TreeMap<String, List<String>> treeMap = new TreeMap<String, List<String>>(p.B(z0.a));
        int n4 = this.size();
        for (int i4 = 0; i4 < n4; ++i4) {
            Object object = this.d(i4);
            ArrayList<String> arrayList = Locale.US;
            y.i((Object)arrayList, (String)"US");
            String string = ((String)object).toLowerCase((Locale)((Object)arrayList));
            y.i((Object)string, (String)"this as java.lang.String).toLowerCase(locale)");
            object = treeMap.get(string);
            arrayList = object;
            if (object == null) {
                arrayList = new ArrayList<String>(2);
                treeMap.put(string, arrayList);
            }
            arrayList.add(this.h(i4));
        }
        return treeMap;
    }

    @NotNull
    public final String h(int n4) {
        return this.c[n4 * 2 + 1];
    }

    public int hashCode() {
        return Arrays.hashCode(this.c);
    }

    @NotNull
    public final List<String> i(@NotNull String list) {
        y.j((Object)list, (String)"name");
        int n4 = this.size();
        ArrayList<String> arrayList = null;
        for (int i4 = 0; i4 < n4; ++i4) {
            ArrayList<String> arrayList2 = arrayList;
            if (p.z((String)((Object)list), this.d(i4), true)) {
                arrayList2 = arrayList;
                if (arrayList == null) {
                    arrayList2 = new ArrayList<String>(2);
                }
                arrayList2.add(this.h(i4));
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            y.i(list, (String)"{\n      Collections.unmodifiableList(result)\n    }");
        } else {
            list = t.m();
        }
        return list;
    }

    @Override
    @NotNull
    public Iterator<kotlin.t<String, String>> iterator() {
        int n4 = this.size();
        Object[] objectArray = new kotlin.t[n4];
        for (int i4 = 0; i4 < n4; ++i4) {
            objectArray[i4] = z.a((Object)this.d(i4), (Object)this.h(i4));
        }
        return f.a((Object[])objectArray);
    }

    @JvmName(name="size")
    public final int size() {
        return this.c.length / 2;
    }

    @NotNull
    public String toString() {
        String string;
        StringBuilder stringBuilder = new StringBuilder();
        int n4 = this.size();
        for (int i4 = 0; i4 < n4; ++i4) {
            String string2 = this.d(i4);
            string = this.h(i4);
            stringBuilder.append(string2);
            stringBuilder.append(": ");
            if (okhttp3.internal.d.H((String)string2)) {
                string = "\u2588\u2588";
            }
            stringBuilder.append(string);
            stringBuilder.append("\n");
        }
        string = stringBuilder.toString();
        y.i((Object)string, (String)"StringBuilder().apply(builderAction).toString()");
        return string;
    }
}


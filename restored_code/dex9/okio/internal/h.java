/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  kotlin.m
 *  kotlin.t
 *  kotlin.z
 *  okio.c0
 *  okio.c0$a
 *  okio.internal.h$a
 *  okio.internal.j
 *  okio.j
 *  okio.j0
 *  okio.k
 *  okio.l
 *  okio.l0
 *  okio.x
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okio.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.m;
import kotlin.n;
import kotlin.text.p;
import kotlin.z;
import okio.c0;
import okio.internal.h;
import okio.internal.j;
import okio.j0;
import okio.k;
import okio.l;
import okio.l0;
import okio.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Exception performing whole class analysis ignored.
 */
@Metadata(d1={"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001>B#\b\u0000\u0012\u0006\u00102\u001a\u00020\t\u0012\u0006\u0010:\u001a\u00020\u0019\u0012\b\b\u0002\u00105\u001a\u00020\u0001\u00a2\u0006\u0004\b;\u0010<J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u000b0\n*\u00020\tH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b*\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b*\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\b'\u0010&J\u001f\u0010)\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020(2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\b/\u0010*R\u0014\u00102\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00104R-\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u000b0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u00106\u001a\u0004\b7\u00108\u00a8\u0006?"}, d2={"Lokio/internal/h;", "Lokio/l;", "Lokio/c0;", "path", "x", "(Lokio/c0;)Lokio/c0;", "", "C", "(Lokio/c0;)Ljava/lang/String;", "Ljava/lang/ClassLoader;", "", "Lkotlin/t;", "z", "(Ljava/lang/ClassLoader;)Ljava/util/List;", "Ljava/net/URL;", "A", "(Ljava/net/URL;)Lkotlin/t;", "B", "dir", "k", "(Lokio/c0;)Ljava/util/List;", "file", "Lokio/j;", "n", "(Lokio/c0;)Lokio/j;", "", "mustCreate", "mustExist", "p", "(Lokio/c0;ZZ)Lokio/j;", "Lokio/k;", "m", "(Lokio/c0;)Lokio/k;", "Lokio/l0;", "s", "(Lokio/c0;)Lokio/l0;", "Lokio/j0;", "r", "(Lokio/c0;Z)Lokio/j0;", "b", "Lkotlin/k0;", "g", "(Lokio/c0;Z)V", "source", "target", "c", "(Lokio/c0;Lokio/c0;)V", "i", "e", "Ljava/lang/ClassLoader;", "classLoader", "f", "Lokio/l;", "systemFileSystem", "Lkotlin/m;", "y", "()Ljava/util/List;", "roots", "indexEagerly", "<init>", "(Ljava/lang/ClassLoader;ZLokio/l;)V", "h", "a", "okio"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nResourceFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n766#2:211\n857#2,2:212\n1549#2:214\n1620#2,3:215\n766#2:218\n857#2,2:219\n1549#2:221\n1620#2,3:222\n1603#2,9:225\n1855#2:234\n1856#2:236\n1612#2:237\n1603#2,9:238\n1855#2:247\n1856#2:249\n1612#2:250\n1#3:235\n1#3:248\n*S KotlinDebug\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n*L\n74#1:211\n74#1:212,2\n75#1:214\n75#1:215,3\n90#1:218\n90#1:219,2\n91#1:221\n91#1:222,3\n173#1:225,9\n173#1:234\n173#1:236\n173#1:237\n174#1:238,9\n174#1:247\n174#1:249\n174#1:250\n173#1:235\n174#1:248\n*E\n"})
public final class h
extends l {
    @NotNull
    private static final a h = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final c0 i = c0.a.e((c0.a)c0.d, (String)"/", (boolean)false, (int)1, null);
    @NotNull
    private final ClassLoader e;
    @NotNull
    private final l f;
    @NotNull
    private final m g;

    public h(@NotNull ClassLoader classLoader, boolean bl, @NotNull l l4) {
        y.j((Object)classLoader, (String)"classLoader");
        y.j((Object)l4, (String)"systemFileSystem");
        this.e = classLoader;
        this.f = l4;
        this.g = n.b(new kotlin.jvm.functions.a<List<? extends kotlin.t<? extends l, ? extends c0>>>(this){
            final h g;
            {
                this.g = h4;
                super(0);
            }

            @Override
            @NotNull
            public final List<kotlin.t<l, c0>> invoke() {
                h h4 = this.g;
                return h4.z(h4.e);
            }
        });
        if (bl) {
            this.y().size();
        }
    }

    public /* synthetic */ h(ClassLoader classLoader, boolean bl, l l4, int n4, kotlin.jvm.internal.p p4) {
        if ((n4 & 4) != 0) {
            l4 = l.b;
        }
        this(classLoader, bl, l4);
    }

    private final kotlin.t<l, c0> A(URL uRL) {
        if (!y.e((Object)uRL.getProtocol(), (Object)"file")) {
            return null;
        }
        return z.a((Object)this.f, (Object)c0.a.d((c0.a)c0.d, (File)new File(uRL.toURI()), (boolean)false, (int)1, null));
    }

    private final kotlin.t<l, c0> B(URL uRL) {
        String string = uRL.toString();
        y.i((Object)string, (String)"toString(...)");
        if (!p.M(string, "jar:file:", false, 2, null)) {
            return null;
        }
        int n4 = p.l0(string, "!", 0, false, 6, null);
        if (n4 == -1) {
            return null;
        }
        uRL = c0.d;
        string = string.substring(4, n4);
        y.i((Object)string, (String)"this as java.lang.String\u2026ing(startIndex, endIndex)");
        return z.a((Object)((Object)j.d((c0)c0.a.d((c0.a)uRL, (File)new File(URI.create(string)), (boolean)false, (int)1, null), (l)this.f, (kotlin.jvm.functions.l)c.g)), (Object)i);
    }

    private final String C(c0 c02) {
        return this.x(c02).k(i).toString();
    }

    public static final /* synthetic */ c0 v() {
        return i;
    }

    private final c0 x(c0 c02) {
        return i.m(c02, true);
    }

    private final List<kotlin.t<l, c0>> y() {
        return (List)this.g.getValue();
    }

    private final List<kotlin.t<l, c0>> z(ClassLoader arrayList) {
        Object object;
        Object object2 = ((ClassLoader)((Object)arrayList)).getResources("");
        y.i(object2, (String)"getResources(...)");
        Object object3 = Collections.list(object2);
        y.i(object3, (String)"list(this)");
        object2 = new ArrayList();
        object3 = object3.iterator();
        while (object3.hasNext()) {
            object = (kotlin.t<l, c0>)object3.next();
            y.g((Object)object);
            if ((object = this.A((URL)object)) == null) continue;
            object2.add(object);
        }
        arrayList = ((ClassLoader)((Object)arrayList)).getResources("META-INF/MANIFEST.MF");
        y.i((Object)arrayList, (String)"getResources(...)");
        object3 = Collections.list(arrayList);
        y.i(object3, (String)"list(this)");
        arrayList = new ArrayList<kotlin.t<l, c0>>();
        object3 = object3.iterator();
        while (object3.hasNext()) {
            object = (URL)object3.next();
            y.g(object);
            if ((object = this.B((URL)object)) == null) continue;
            arrayList.add((kotlin.t<l, c0>)object);
        }
        return t.M0((Collection)object2, arrayList);
    }

    @NotNull
    public j0 b(@NotNull c0 object, boolean bl) {
        y.j((Object)object, (String)"file");
        object = new StringBuilder();
        ((StringBuilder)object).append((Object)this);
        ((StringBuilder)object).append(" is read-only");
        throw new IOException(((StringBuilder)object).toString());
    }

    public void c(@NotNull c0 object, @NotNull c0 c02) {
        y.j((Object)object, (String)"source");
        y.j((Object)c02, (String)"target");
        object = new StringBuilder();
        ((StringBuilder)object).append((Object)this);
        ((StringBuilder)object).append(" is read-only");
        throw new IOException(((StringBuilder)object).toString());
    }

    public void g(@NotNull c0 object, boolean bl) {
        y.j((Object)object, (String)"dir");
        object = new StringBuilder();
        ((StringBuilder)object).append((Object)this);
        ((StringBuilder)object).append(" is read-only");
        throw new IOException(((StringBuilder)object).toString());
    }

    public void i(@NotNull c0 object, boolean bl) {
        y.j((Object)object, (String)"path");
        object = new StringBuilder();
        ((StringBuilder)object).append((Object)this);
        ((StringBuilder)object).append(" is read-only");
        throw new IOException(((StringBuilder)object).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NotNull
    public List<c0> k(@NotNull c0 c02) {
        y.j((Object)c02, (String)"dir");
        String string = this.C(c02);
        Serializable serializable = new LinkedHashSet();
        Iterator<kotlin.t<l, c0>> iterator = this.y().iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            c0 c03 = iterator.next();
            Object object = (l)c03.a();
            c03 = (c0)c03.b();
            try {
                c0 c04 = (c0)object.k(c03.l(string));
                object = new ArrayList();
                for (Object t3 : c04) {
                    c04 = (c0)t3;
                    if (!a.a(h, c04)) continue;
                    object.add(t3);
                }
                c04 = new c0(t.x((Iterable)object, 10));
                Iterator iterator2 = object.iterator();
                while (iterator2.hasNext()) {
                    object = (c0)iterator2.next();
                    c04.add(h.d((c0)object, c03));
                }
                t.E((Collection)((Object)serializable), c04);
                bl = true;
            }
            catch (IOException iOException) {}
        }
        if (bl) {
            return t.e1(serializable);
        }
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("file not found: ");
        ((StringBuilder)serializable).append(c02);
        throw new FileNotFoundException(((StringBuilder)serializable).toString());
    }

    @Nullable
    public k m(@NotNull c0 object) {
        y.j((Object)object, (String)"path");
        if (!a.a(h, (c0)object)) {
            return null;
        }
        String string = this.C((c0)object);
        for (kotlin.t t3 : this.y()) {
            k t32 = ((l)t3.a()).m(((c0)t3.b()).l(string));
            if (t32 == null) continue;
            return t32;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NotNull
    public okio.j n(@NotNull c0 c02) {
        y.j((Object)c02, (String)"file");
        if (!a.a(h, (c0)c02)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("file not found: ");
            stringBuilder.append(c02);
            throw new FileNotFoundException(stringBuilder.toString());
        }
        CharSequence charSequence = this.C(c02);
        Iterator<kotlin.t<l, c0>> iterator = this.y().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("file not found: ");
                ((StringBuilder)charSequence).append(c02);
                throw new FileNotFoundException(((StringBuilder)charSequence).toString());
            }
            c0 c03 = iterator.next();
            l l4 = (l)c03.a();
            c03 = (c0)c03.b();
            try {
                return l4.n(c03.l((String)charSequence));
            }
            catch (FileNotFoundException fileNotFoundException) {
                continue;
            }
            break;
        }
    }

    @NotNull
    public okio.j p(@NotNull c0 c02, boolean bl, boolean bl2) {
        y.j((Object)c02, (String)"file");
        throw new IOException("resources are not writable");
    }

    @NotNull
    public j0 r(@NotNull c0 object, boolean bl) {
        y.j((Object)object, (String)"file");
        object = new StringBuilder();
        ((StringBuilder)object).append((Object)this);
        ((StringBuilder)object).append(" is read-only");
        throw new IOException(((StringBuilder)object).toString());
    }

    @NotNull
    public l0 s(@NotNull c0 c02) {
        y.j((Object)c02, (String)"file");
        if (a.a(h, (c0)c02)) {
            Object object = i;
            object = c0.n((c0)object, (c0)c02, (boolean)false, (int)2, null).k((c0)object);
            if ((object = this.e.getResourceAsStream(object.toString())) != null && (object = x.k((InputStream)object)) != null) {
                return object;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("file not found: ");
            ((StringBuilder)object).append(c02);
            throw new FileNotFoundException(((StringBuilder)object).toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("file not found: ");
        stringBuilder.append(c02);
        throw new FileNotFoundException(stringBuilder.toString());
    }
}


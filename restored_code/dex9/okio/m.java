/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.v0
 *  kotlin.jvm.internal.y
 *  okio.c0
 *  okio.j
 *  okio.j0
 *  okio.k
 *  okio.l
 *  okio.l0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import okio.c0;
import okio.j;
import okio.j0;
import okio.k;
import okio.l;
import okio.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010.\u001a\u00020\u0001\u00a2\u0006\u0004\b0\u00101J'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b!\u0010 J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b)\u0010$J\u000f\u0010*\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b*\u0010+R\u0017\u0010.\u001a\u00020\u00018\u0007\u00a2\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\u00a8\u00062"}, d2={"Lokio/m;", "Lokio/l;", "Lokio/c0;", "path", "", "functionName", "parameterName", "t", "(Lokio/c0;Ljava/lang/String;Ljava/lang/String;)Lokio/c0;", "u", "(Lokio/c0;Ljava/lang/String;)Lokio/c0;", "Lokio/k;", "m", "(Lokio/c0;)Lokio/k;", "dir", "", "k", "(Lokio/c0;)Ljava/util/List;", "file", "Lokio/j;", "n", "(Lokio/c0;)Lokio/j;", "", "mustCreate", "mustExist", "p", "(Lokio/c0;ZZ)Lokio/j;", "Lokio/l0;", "s", "(Lokio/c0;)Lokio/l0;", "Lokio/j0;", "r", "(Lokio/c0;Z)Lokio/j0;", "b", "Lkotlin/k0;", "g", "(Lokio/c0;Z)V", "source", "target", "c", "(Lokio/c0;Lokio/c0;)V", "i", "toString", "()Ljava/lang/String;", "e", "Lokio/l;", "delegate", "()Lokio/l;", "<init>", "(Lokio/l;)V", "okio"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nForwardingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n1620#2,3:244\n1620#2,3:247\n*S KotlinDebug\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n*L\n166#1:244,3\n174#1:247,3\n*E\n"})
public abstract class m
extends l {
    @NotNull
    private final l e;

    public m(@NotNull l l4) {
        y.j((Object)l4, (String)"delegate");
        this.e = l4;
    }

    @NotNull
    public j0 b(@NotNull c0 c02, boolean bl) throws IOException {
        y.j((Object)c02, (String)"file");
        c02 = this.t(c02, "appendingSink", "file");
        return this.e.b(c02, bl);
    }

    public void c(@NotNull c0 c02, @NotNull c0 c03) throws IOException {
        y.j((Object)c02, (String)"source");
        y.j((Object)c03, (String)"target");
        c02 = this.t(c02, "atomicMove", "source");
        c03 = this.t(c03, "atomicMove", "target");
        this.e.c(c02, c03);
    }

    public void g(@NotNull c0 c02, boolean bl) throws IOException {
        y.j((Object)c02, (String)"dir");
        c02 = this.t(c02, "createDirectory", "dir");
        this.e.g(c02, bl);
    }

    public void i(@NotNull c0 c02, boolean bl) throws IOException {
        y.j((Object)c02, (String)"path");
        c02 = this.t(c02, "delete", "path");
        this.e.i(c02, bl);
    }

    @NotNull
    public List<c0> k(@NotNull c0 object) throws IOException {
        y.j((Object)object, (String)"dir");
        object = this.t((c0)object, "list", "dir");
        Object object2 = this.e.k((c0)object);
        object = new ArrayList();
        object2 = object2.iterator();
        while (object2.hasNext()) {
            object.add(this.u((c0)object2.next(), "list"));
        }
        t.C((List)object);
        return object;
    }

    @Nullable
    public k m(@NotNull c0 c02) throws IOException {
        y.j((Object)c02, (String)"path");
        c02 = this.t(c02, "metadataOrNull", "path");
        c02 = this.e.m(c02);
        if (c02 == null) {
            return null;
        }
        if (c02.e() == null) {
            return c02;
        }
        return k.b((k)c02, (boolean)false, (boolean)false, (c0)this.u(c02.e(), "metadataOrNull"), null, null, null, null, null, (int)251, null);
    }

    @NotNull
    public j n(@NotNull c0 c02) throws IOException {
        y.j((Object)c02, (String)"file");
        c02 = this.t(c02, "openReadOnly", "file");
        return this.e.n(c02);
    }

    @NotNull
    public j p(@NotNull c0 c02, boolean bl, boolean bl2) throws IOException {
        y.j((Object)c02, (String)"file");
        c02 = this.t(c02, "openReadWrite", "file");
        return this.e.p(c02, bl, bl2);
    }

    @NotNull
    public j0 r(@NotNull c0 c02, boolean bl) throws IOException {
        y.j((Object)c02, (String)"file");
        c02 = this.t(c02, "sink", "file");
        return this.e.r(c02, bl);
    }

    @NotNull
    public l0 s(@NotNull c0 c02) throws IOException {
        y.j((Object)c02, (String)"file");
        c02 = this.t(c02, "source", "file");
        return this.e.s(c02);
    }

    @NotNull
    public c0 t(@NotNull c0 c02, @NotNull String string, @NotNull String string2) {
        y.j((Object)c02, (String)"path");
        y.j((Object)string, (String)"functionName");
        y.j((Object)string2, (String)"parameterName");
        return c02;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(v0.b(((Object)((Object)this)).getClass()).getSimpleName());
        stringBuilder.append('(');
        stringBuilder.append(this.e);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @NotNull
    public c0 u(@NotNull c0 c02, @NotNull String string) {
        y.j((Object)c02, (String)"path");
        y.j((Object)string, (String)"functionName");
        return c02;
    }
}


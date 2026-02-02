/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.http.c$b
 *  io.ktor.http.h
 *  io.ktor.http.i
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.http;

import io.ktor.http.c;
import io.ktor.http.h;
import io.ktor.http.i;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00062\u00020\u0001:\u0003\u001f !B1\b\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0004\b\u001c\u0010\u001dB)\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0004\b\u001c\u0010\u001eJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014\u00a8\u0006\""}, d2={"Lio/ktor/http/c;", "Lio/ktor/http/i;", "", "name", "value", "", "f", "(Ljava/lang/String;Ljava/lang/String;)Z", "g", "(Ljava/lang/String;Ljava/lang/String;)Lio/ktor/http/c;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "contentType", "getContentSubtype", "contentSubtype", "existingContent", "", "Lio/ktor/http/h;", "parameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "b", "c", "ktor-http"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nContentTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentTypes.kt\nio/ktor/http/ContentType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,318:1\n1#2:319\n1747#3,3:320\n1747#3,3:323\n*S KotlinDebug\n*F\n+ 1 ContentTypes.kt\nio/ktor/http/ContentType\n*L\n44#1:320,3\n72#1:323,3\n*E\n"})
public final class c
extends i {
    @NotNull
    public static final b f = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final c g = new c("*", "*", null, 4, null);
    @NotNull
    private final String d;
    @NotNull
    private final String e;

    private c(String string, String string2, String string3, List<h> list) {
        super(string3, list);
        this.d = string;
        this.e = string2;
    }

    public c(@NotNull String string, @NotNull String string2, @NotNull List<h> list) {
        y.j((Object)string, (String)"contentType");
        y.j((Object)string2, (String)"contentSubtype");
        y.j(list, (String)"parameters");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append('/');
        stringBuilder.append(string2);
        this(string, string2, stringBuilder.toString(), list);
    }

    public /* synthetic */ c(String string, String string2, List list, int n4, p p4) {
        if ((n4 & 4) != 0) {
            list = t.m();
        }
        this(string, string2, list);
    }

    public static final /* synthetic */ c d() {
        return g;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean f(String string, String string2) {
        boolean bl;
        int n4 = this.b().size();
        boolean bl2 = bl = false;
        if (n4 == 0) return bl2;
        if (n4 != 1) {
            h h4;
            Object object = this.b();
            if (object instanceof Collection && ((Collection)object).isEmpty()) {
                return bl;
            }
            object = object.iterator();
            do {
                bl2 = bl;
                if (!object.hasNext()) return bl2;
            } while (!kotlin.text.p.z((h4 = (h)object.next()).a(), string, true) || !kotlin.text.p.z(h4.b(), string2, true));
            return true;
        }
        h h5 = (h)this.b().get(0);
        bl2 = bl;
        if (!kotlin.text.p.z(h5.a(), string, true)) return bl2;
        bl2 = bl;
        if (!kotlin.text.p.z(h5.b(), string2, true)) return bl2;
        return true;
    }

    @NotNull
    public final String e() {
        return this.d;
    }

    public boolean equals(@Nullable Object object) {
        boolean bl;
        block3: {
            block2: {
                if (!(object instanceof c)) break block2;
                String string = this.d;
                c c4 = (c)((Object)object);
                object = c4.d;
                bl = true;
                if (kotlin.text.p.z(string, (String)object, true) && kotlin.text.p.z(this.e, c4.e, true) && y.e((Object)this.b(), (Object)c4.b())) break block3;
            }
            bl = false;
        }
        return bl;
    }

    @NotNull
    public final c g(@NotNull String string, @NotNull String string2) {
        y.j((Object)string, (String)"name");
        y.j((Object)string2, (String)"value");
        if (this.f(string, string2)) {
            return this;
        }
        return new c(this.d, this.e, this.a(), t.N0((Collection)this.b(), new h(string, string2)));
    }

    public int hashCode() {
        String string = this.d;
        Object object = Locale.ROOT;
        string = string.toLowerCase((Locale)object);
        y.i((Object)string, (String)"this as java.lang.String).toLowerCase(Locale.ROOT)");
        int n4 = string.hashCode();
        object = this.e.toLowerCase((Locale)object);
        y.i((Object)object, (String)"this as java.lang.String).toLowerCase(Locale.ROOT)");
        return n4 + (n4 * 31 + ((String)object).hashCode()) + ((Object)this.b()).hashCode() * 31;
    }
}


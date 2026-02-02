/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.c
 *  kotlinx.serialization.json.JsonElement
 *  kotlinx.serialization.json.f
 *  kotlinx.serialization.json.internal.a
 *  kotlinx.serialization.json.internal.e0
 *  kotlinx.serialization.json.internal.g0
 *  kotlinx.serialization.json.internal.m1
 *  kotlinx.serialization.json.internal.p1
 *  kotlinx.serialization.json.internal.s1
 *  kotlinx.serialization.json.internal.t0
 *  kotlinx.serialization.modules.c
 *  kotlinx.serialization.modules.d
 *  kotlinx.serialization.o
 *  org.intellij.lang.annotations.Language
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.serialization.a0;
import kotlinx.serialization.c;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.f;
import kotlinx.serialization.json.internal.e0;
import kotlinx.serialization.json.internal.g0;
import kotlinx.serialization.json.internal.i1;
import kotlinx.serialization.json.internal.m1;
import kotlinx.serialization.json.internal.p1;
import kotlinx.serialization.json.internal.s1;
import kotlinx.serialization.json.internal.t0;
import kotlinx.serialization.json.internal.v0;
import kotlinx.serialization.modules.d;
import kotlinx.serialization.o;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00102\u00020\u0001:\u0001\u0013B\u0019\b\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u00a2\u0006\u0004\b#\u0010$J)\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\b\b\u0001\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0006\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00188\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0013\u0010\u001aR \u0010\"\u001a\u00020\u001c8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\b\f\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\u0082\u0001\u0002%&\u00a8\u0006'"}, d2={"Lkotlinx/serialization/json/b;", "Lkotlinx/serialization/a0;", "T", "Lkotlinx/serialization/o;", "serializer", "value", "", "b", "(Lkotlinx/serialization/o;Ljava/lang/Object;)Ljava/lang/String;", "Lkotlinx/serialization/c;", "deserializer", "string", "c", "(Lkotlinx/serialization/c;Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "element", "d", "(Lkotlinx/serialization/c;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "Lkotlinx/serialization/json/f;", "a", "Lkotlinx/serialization/json/f;", "e", "()Lkotlinx/serialization/json/f;", "configuration", "Lkotlinx/serialization/modules/c;", "Lkotlinx/serialization/modules/c;", "()Lkotlinx/serialization/modules/c;", "serializersModule", "Lkotlinx/serialization/json/internal/e0;", "Lkotlinx/serialization/json/internal/e0;", "f", "()Lkotlinx/serialization/json/internal/e0;", "get_schemaCache$kotlinx_serialization_json$annotations", "()V", "_schemaCache", "<init>", "(Lkotlinx/serialization/json/f;Lkotlinx/serialization/modules/c;)V", "Lkotlinx/serialization/json/b$a;", "Lkotlinx/serialization/json/s;", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
public abstract class b
implements a0 {
    @NotNull
    public static final a d = new a(null);
    @NotNull
    private final f a;
    @NotNull
    private final kotlinx.serialization.modules.c b;
    @NotNull
    private final e0 c;

    private b(f f4, kotlinx.serialization.modules.c c4) {
        this.a = f4;
        this.b = c4;
        this.c = new e0();
    }

    public /* synthetic */ b(f f4, kotlinx.serialization.modules.c c4, p p4) {
        this(f4, c4);
    }

    @NotNull
    public kotlinx.serialization.modules.c a() {
        return this.b;
    }

    @Override
    @NotNull
    public final <T> String b(@NotNull o<? super T> object, T t3) {
        y.j(object, (String)"serializer");
        v0 v02 = new v0();
        try {
            t0.b((b)this, (g0)v02, object, t3);
            object = v02.toString();
            return object;
        }
        finally {
            v02.g();
        }
    }

    @Override
    public final <T> T c(@NotNull c<? extends T> object, @Language(prefix="", suffix="", value="json") @NotNull String object2) {
        y.j(object, (String)"deserializer");
        y.j((Object)object2, (String)"string");
        object2 = m1.a((b)this, (String)object2);
        object = new i1(this, s1.e, (kotlinx.serialization.json.internal.a)object2, object.getDescriptor(), null).G(object);
        object2.v();
        return (T)object;
    }

    public final <T> T d(@NotNull c<? extends T> c4, @NotNull JsonElement jsonElement) {
        y.j(c4, (String)"deserializer");
        y.j((Object)jsonElement, (String)"element");
        return (T)p1.a((b)this, (JsonElement)jsonElement, c4);
    }

    @NotNull
    public final f e() {
        return this.a;
    }

    @NotNull
    public final e0 f() {
        return this.c;
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2={"Lkotlinx/serialization/json/b$a;", "Lkotlinx/serialization/json/b;", "<init>", "()V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
    public static final class a
    extends b {
        private a() {
            super(new f(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), kotlinx.serialization.modules.d.a(), null);
        }

        public /* synthetic */ a(p p4) {
            this();
        }
    }
}


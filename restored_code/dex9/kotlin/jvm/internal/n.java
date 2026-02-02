/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.h
 *  kotlin.j
 *  kotlin.jvm.a
 *  kotlin.jvm.b
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.n$a
 *  kotlin.jvm.internal.y
 *  kotlin.reflect.KVisibility
 *  kotlin.t
 *  kotlin.z
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.s0;
import kotlin.h;
import kotlin.j;
import kotlin.jvm.b;
import kotlin.jvm.functions.c;
import kotlin.jvm.functions.d;
import kotlin.jvm.functions.e;
import kotlin.jvm.functions.f;
import kotlin.jvm.functions.g;
import kotlin.jvm.functions.i;
import kotlin.jvm.functions.k;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.o;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.r;
import kotlin.jvm.functions.s;
import kotlin.jvm.functions.u;
import kotlin.jvm.functions.v;
import kotlin.jvm.functions.w;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.y;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.t;
import kotlin.text.p;
import kotlin.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 U2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0016B\u0013\u0012\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0013\u00a2\u0006\u0004\bS\u0010TJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0017\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002\u00a2\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00138\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u000fR\u001e\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\"0\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010 R\u001e\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010 R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010-R \u00103\u001a\b\u0012\u0004\u0012\u00020/0'8VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010*R \u00107\u001a\b\u0012\u0004\u0012\u0002040'8VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b6\u00102\u001a\u0004\b5\u0010*R(\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010'8VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b9\u00102\u001a\u0004\b8\u0010*R\u001c\u0010?\u001a\u0004\u0018\u00010;8VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b>\u00102\u001a\u0004\b<\u0010=R\u001a\u0010@\u001a\u00020\u00058VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\bB\u00102\u001a\u0004\b@\u0010AR\u001a\u0010C\u001a\u00020\u00058VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\bD\u00102\u001a\u0004\bC\u0010AR\u001a\u0010E\u001a\u00020\u00058VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\bF\u00102\u001a\u0004\bE\u0010AR\u001a\u0010G\u001a\u00020\u00058VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\bH\u00102\u001a\u0004\bG\u0010AR\u001a\u0010I\u001a\u00020\u00058VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\bJ\u00102\u001a\u0004\bI\u0010AR\u001a\u0010K\u001a\u00020\u00058VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\bL\u00102\u001a\u0004\bK\u0010AR\u001a\u0010M\u001a\u00020\u00058VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\bN\u00102\u001a\u0004\bM\u0010AR\u001a\u0010O\u001a\u00020\u00058VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\bP\u00102\u001a\u0004\bO\u0010AR\u001a\u0010Q\u001a\u00020\u00058VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\bR\u00102\u001a\u0004\bQ\u0010A\u00a8\u0006V"}, d2={"Lkotlin/jvm/internal/n;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/m;", "value", "", "isInstance", "(Ljava/lang/Object;)Z", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "f", "()Ljava/lang/Void;", "Ljava/lang/Class;", "c", "Ljava/lang/Class;", "a", "()Ljava/lang/Class;", "jClass", "getSimpleName", "simpleName", "getQualifiedName", "qualifiedName", "", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/KFunction;", "getConstructors", "constructors", "getNestedClasses", "nestedClasses", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "getTypeParameters$annotations", "()V", "typeParameters", "Lkotlin/reflect/KType;", "getSupertypes", "getSupertypes$annotations", "supertypes", "getSealedSubclasses", "getSealedSubclasses$annotations", "sealedSubclasses", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "getVisibility$annotations", "visibility", "isFinal", "()Z", "isFinal$annotations", "isOpen", "isOpen$annotations", "isAbstract", "isAbstract$annotations", "isSealed", "isSealed$annotations", "isData", "isData$annotations", "isInner", "isInner$annotations", "isCompanion", "isCompanion$annotations", "isFun", "isFun$annotations", "isValue", "isValue$annotations", "<init>", "(Ljava/lang/Class;)V", "d", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1567#2:206\n1598#2,4:207\n1261#2,4:211\n1246#2,4:217\n462#3:215\n412#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
public final class n
implements KClass<Object>,
m {
    @NotNull
    public static final a d;
    @NotNull
    private static final Map<Class<? extends h<?>>, Integer> e;
    @NotNull
    private static final HashMap<String, String> f;
    @NotNull
    private static final HashMap<String, String> g;
    @NotNull
    private static final HashMap<String, String> h;
    @NotNull
    private static final Map<String, String> i;
    @NotNull
    private final Class<?> c;

    static {
        Serializable serializable;
        d = new /* Unavailable Anonymous Inner Class!! */;
        int n4 = 0;
        Object object = kotlin.collections.t.p(new Class[]{kotlin.jvm.functions.a.class, l.class, kotlin.jvm.functions.p.class, q.class, r.class, s.class, kotlin.jvm.functions.t.class, u.class, v.class, w.class, kotlin.jvm.functions.b.class, c.class, d.class, e.class, f.class, g.class, kotlin.jvm.functions.h.class, i.class, kotlin.jvm.functions.j.class, k.class, kotlin.jvm.functions.m.class, kotlin.jvm.functions.n.class, o.class});
        Object object222 = new ArrayList<t>(kotlin.collections.t.x((Iterable)object, 10));
        Iterator object32 = object.iterator();
        while (object32.hasNext()) {
            object = object32.next();
            if (n4 < 0) {
                kotlin.collections.t.w();
            }
            object222.add(z.a((Object)((Class)object), (Object)n4));
            ++n4;
        }
        e = s0.v(object222);
        object = new HashMap();
        ((HashMap)object).put("boolean", "kotlin.Boolean");
        ((HashMap)object).put("char", "kotlin.Char");
        ((HashMap)object).put("byte", "kotlin.Byte");
        ((HashMap)object).put("short", "kotlin.Short");
        ((HashMap)object).put("int", "kotlin.Int");
        ((HashMap)object).put("float", "kotlin.Float");
        ((HashMap)object).put("long", "kotlin.Long");
        ((HashMap)object).put("double", "kotlin.Double");
        f = object;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap.put("java.lang.Character", "kotlin.Char");
        hashMap.put("java.lang.Byte", "kotlin.Byte");
        hashMap.put("java.lang.Short", "kotlin.Short");
        hashMap.put("java.lang.Integer", "kotlin.Int");
        hashMap.put("java.lang.Float", "kotlin.Float");
        hashMap.put("java.lang.Long", "kotlin.Long");
        hashMap.put("java.lang.Double", "kotlin.Double");
        g = hashMap;
        object222 = new HashMap();
        ((HashMap)object222).put("java.lang.Object", "kotlin.Any");
        ((HashMap)object222).put("java.lang.String", "kotlin.String");
        ((HashMap)object222).put("java.lang.CharSequence", "kotlin.CharSequence");
        ((HashMap)object222).put("java.lang.Throwable", "kotlin.Throwable");
        ((HashMap)object222).put("java.lang.Cloneable", "kotlin.Cloneable");
        ((HashMap)object222).put("java.lang.Number", "kotlin.Number");
        ((HashMap)object222).put("java.lang.Comparable", "kotlin.Comparable");
        ((HashMap)object222).put("java.lang.Enum", "kotlin.Enum");
        ((HashMap)object222).put("java.lang.annotation.Annotation", "kotlin.Annotation");
        ((HashMap)object222).put("java.lang.Iterable", "kotlin.collections.Iterable");
        ((HashMap)object222).put("java.util.Iterator", "kotlin.collections.Iterator");
        ((HashMap)object222).put("java.util.Collection", "kotlin.collections.Collection");
        ((HashMap)object222).put("java.util.List", "kotlin.collections.List");
        ((HashMap)object222).put("java.util.Set", "kotlin.collections.Set");
        ((HashMap)object222).put("java.util.ListIterator", "kotlin.collections.ListIterator");
        ((HashMap)object222).put("java.util.Map", "kotlin.collections.Map");
        ((HashMap)object222).put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        ((HashMap)object222).put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        ((HashMap)object222).put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        ((HashMap)object222).putAll(object);
        ((HashMap)object222).putAll(hashMap);
        object = ((HashMap)object).values();
        y.i(object, (String)"<get-values>(...)");
        for (String string : (Iterable)object) {
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("kotlin.jvm.internal.");
            y.g((Object)string);
            ((StringBuilder)serializable).append(p.V0(string, '.', null, 2, null));
            ((StringBuilder)serializable).append("CompanionObject");
            String string2 = ((StringBuilder)serializable).toString();
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append(string);
            ((StringBuilder)serializable).append(".Companion");
            t t3 = z.a((Object)string2, (Object)((StringBuilder)serializable).toString());
            object222.put(t3.c(), t3.d());
        }
        for (Map.Entry<Class<h<?>>, Integer> entry : e.entrySet()) {
            serializable = entry.getKey();
            n4 = ((Number)entry.getValue()).intValue();
            String string = ((Class)serializable).getName();
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("kotlin.Function");
            ((StringBuilder)serializable).append(n4);
            ((HashMap)object222).put(string, ((StringBuilder)serializable).toString());
        }
        h = object222;
        object = new LinkedHashMap(s0.f(object222.size()));
        for (Object object222 : (Iterable)object222.entrySet()) {
            object.put(object222.getKey(), p.V0((String)object222.getValue(), '.', null, 2, null));
        }
        i = object;
    }

    public n(@NotNull Class<?> clazz) {
        y.j(clazz, (String)"jClass");
        this.c = clazz;
    }

    public static final /* synthetic */ HashMap c() {
        return h;
    }

    public static final /* synthetic */ Map d() {
        return e;
    }

    public static final /* synthetic */ Map e() {
        return i;
    }

    private final Void f() {
        throw new b();
    }

    @Override
    @NotNull
    public Class<?> a() {
        return this.c;
    }

    @Override
    public boolean equals(@Nullable Object object) {
        boolean bl = object instanceof n && y.e((Object)kotlin.jvm.a.b((KClass)this), (Object)kotlin.jvm.a.b((KClass)((KClass)object)));
        return bl;
    }

    @NotNull
    public List<Annotation> getAnnotations() {
        this.f();
        throw new j();
    }

    @Override
    @NotNull
    public Collection<KFunction<Object>> getConstructors() {
        this.f();
        throw new j();
    }

    @Override
    @NotNull
    public Collection<KCallable<?>> getMembers() {
        this.f();
        throw new j();
    }

    @Override
    @NotNull
    public Collection<KClass<?>> getNestedClasses() {
        this.f();
        throw new j();
    }

    @Override
    @Nullable
    public Object getObjectInstance() {
        this.f();
        throw new j();
    }

    @Override
    @Nullable
    public String getQualifiedName() {
        return d.a(this.a());
    }

    @Override
    @NotNull
    public List<KClass<? extends Object>> getSealedSubclasses() {
        this.f();
        throw new j();
    }

    @Override
    @Nullable
    public String getSimpleName() {
        return d.b(this.a());
    }

    @Override
    @NotNull
    public List<KType> getSupertypes() {
        this.f();
        throw new j();
    }

    @Override
    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        this.f();
        throw new j();
    }

    @Override
    @Nullable
    public KVisibility getVisibility() {
        this.f();
        throw new j();
    }

    @Override
    public int hashCode() {
        return kotlin.jvm.a.b((KClass)this).hashCode();
    }

    @Override
    public boolean isAbstract() {
        this.f();
        throw new j();
    }

    @Override
    public boolean isCompanion() {
        this.f();
        throw new j();
    }

    @Override
    public boolean isData() {
        this.f();
        throw new j();
    }

    @Override
    public boolean isFinal() {
        this.f();
        throw new j();
    }

    @Override
    public boolean isFun() {
        this.f();
        throw new j();
    }

    @Override
    public boolean isInner() {
        this.f();
        throw new j();
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isInstance(@Nullable Object object) {
        return d.c(object, this.a());
    }

    @Override
    public boolean isOpen() {
        this.f();
        throw new j();
    }

    @Override
    public boolean isSealed() {
        this.f();
        throw new j();
    }

    @Override
    public boolean isValue() {
        this.f();
        throw new j();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a().toString());
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}


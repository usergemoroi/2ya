/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.jvm.a
 *  kotlin.jvm.internal.b1$a
 *  kotlin.jvm.internal.b1$b
 *  kotlin.jvm.internal.y
 *  kotlin.r
 *  kotlin.reflect.KClassifier
 *  kotlin.reflect.KTypeProjection
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.t;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.y;
import kotlin.r;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\t\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u00013B1\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010'\u001a\u00020\u000e\u00a2\u0006\u0004\b0\u00101B'\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018\u0012\u0006\u0010.\u001a\u00020\u0002\u00a2\u0006\u0004\b0\u00102J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u0004\u0018\u00010\u00018\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R \u0010'\u001a\u00020\u000e8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010\u0010R\u001c\u0010*\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030(8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u001bR\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010/\u00a8\u00064"}, d2={"Lkotlin/jvm/internal/b1;", "Lkotlin/reflect/KType;", "", "convertPrimitiveToWrapper", "", "d", "(Z)Ljava/lang/String;", "Lkotlin/reflect/KTypeProjection;", "c", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/KClassifier;", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier", "", "Ljava/util/List;", "getArguments", "()Ljava/util/List;", "arguments", "e", "Lkotlin/reflect/KType;", "g", "()Lkotlin/reflect/KType;", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "()V", "platformTypeUpperBound", "f", "I", "getFlags$kotlin_stdlib$annotations", "flags", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/String;", "arrayClassName", "", "getAnnotations", "annotations", "isMarkedNullable", "()Z", "<init>", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Lkotlin/reflect/KType;I)V", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "a", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SinceKotlin(version="1.4")
public final class b1
implements KType {
    @NotNull
    public static final a g = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private final KClassifier c;
    @NotNull
    private final List<KTypeProjection> d;
    @Nullable
    private final KType e;
    private final int f;

    @SinceKotlin(version="1.6")
    public b1(@NotNull KClassifier kClassifier, @NotNull List<KTypeProjection> list, @Nullable KType kType, int n4) {
        y.j((Object)kClassifier, (String)"classifier");
        y.j(list, (String)"arguments");
        this.c = kClassifier;
        this.d = list;
        this.e = kType;
        this.f = n4;
    }

    public b1(@NotNull KClassifier kClassifier, @NotNull List<KTypeProjection> list, boolean bl) {
        y.j((Object)kClassifier, (String)"classifier");
        y.j(list, (String)"arguments");
        this(kClassifier, list, null, bl ? 1 : 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final String c(KTypeProjection object) {
        Object object2;
        block6: {
            block5: {
                if (object.getVariance() == null) {
                    return "*";
                }
                object2 = object.getType();
                object2 = object2 instanceof b1 ? (b1)object2 : null;
                if (object2 == null) break block5;
                String string = super.d(true);
                object2 = string;
                if (string != null) break block6;
            }
            object2 = String.valueOf(object.getType());
        }
        object = object.getVariance();
        int n4 = b.a[((Enum)object).ordinal()];
        object = object2;
        if (n4 == 1) return object;
        if (n4 != 2) {
            if (n4 != 3) throw new r();
            object = new StringBuilder();
            ((StringBuilder)object).append("out ");
            ((StringBuilder)object).append((String)object2);
            return ((StringBuilder)object).toString();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("in ");
        ((StringBuilder)object).append((String)object2);
        return ((StringBuilder)object).toString();
    }

    private final String d(boolean bl) {
        Object object = this.getClassifier();
        boolean bl2 = object instanceof KClass;
        Object object2 = null;
        object = bl2 ? (KClass)object : null;
        if (object != null) {
            object2 = kotlin.jvm.a.a((KClass)object);
        }
        if (object2 == null) {
            object = this.getClassifier().toString();
        } else if ((this.f & 4) != 0) {
            object = "kotlin.Nothing";
        } else if (((Class)object2).isArray()) {
            object = this.e((Class<?>)object2);
        } else if (bl && ((Class)object2).isPrimitive()) {
            object = this.getClassifier();
            y.h((Object)object, (String)"null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            object = kotlin.jvm.a.b((KClass)((KClass)object)).getName();
        } else {
            object = ((Class)object2).getName();
        }
        bl = this.getArguments().isEmpty();
        Object object3 = "";
        object2 = bl ? "" : t.B0(this.getArguments(), ", ", "<", ">", 0, null, new l<KTypeProjection, CharSequence>(this){
            final b1 g;
            {
                this.g = b12;
                super(1);
            }

            public final CharSequence a(KTypeProjection kTypeProjection) {
                y.j((Object)kTypeProjection, (String)"it");
                return this.g.c(kTypeProjection);
            }
        }, 24, null);
        if (this.isMarkedNullable()) {
            object3 = "?";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append((String)object2);
        stringBuilder.append((String)object3);
        object2 = stringBuilder.toString();
        object3 = this.e;
        object = object2;
        if (object3 instanceof b1) {
            object = ((b1)object3).d(true);
            if (y.e((Object)object, (Object)object2)) {
                object = object2;
            } else {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append('?');
                if (y.e((Object)object, (Object)((StringBuilder)object3).toString())) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)object2);
                    ((StringBuilder)object).append('!');
                    object = ((StringBuilder)object).toString();
                } else {
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append('(');
                    ((StringBuilder)object3).append((String)object2);
                    ((StringBuilder)object3).append("..");
                    ((StringBuilder)object3).append((String)object);
                    ((StringBuilder)object3).append(')');
                    object = ((StringBuilder)object3).toString();
                }
            }
        }
        return object;
    }

    private final String e(Class<?> object) {
        object = y.e(object, boolean[].class) ? "kotlin.BooleanArray" : (y.e(object, char[].class) ? "kotlin.CharArray" : (y.e((Object)object, byte[].class) ? "kotlin.ByteArray" : (y.e((Object)object, short[].class) ? "kotlin.ShortArray" : (y.e((Object)object, int[].class) ? "kotlin.IntArray" : (y.e((Object)object, float[].class) ? "kotlin.FloatArray" : (y.e((Object)object, long[].class) ? "kotlin.LongArray" : (y.e((Object)object, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array")))))));
        return object;
    }

    public boolean equals(@Nullable Object object) {
        KClassifier kClassifier;
        boolean bl = object instanceof b1 && y.e((Object)(kClassifier = this.getClassifier()), (Object)((b1)(object = (b1)object)).getClassifier()) && y.e(this.getArguments(), ((b1)object).getArguments()) && y.e((Object)this.e, (Object)((b1)object).e) && this.f == ((b1)object).f;
        return bl;
    }

    public final int f() {
        return this.f;
    }

    @Nullable
    public final KType g() {
        return this.e;
    }

    @NotNull
    public List<Annotation> getAnnotations() {
        return t.m();
    }

    @Override
    @NotNull
    public List<KTypeProjection> getArguments() {
        return this.d;
    }

    @Override
    @NotNull
    public KClassifier getClassifier() {
        return this.c;
    }

    public int hashCode() {
        return (this.getClassifier().hashCode() * 31 + ((Object)this.getArguments()).hashCode()) * 31 + this.f;
    }

    @Override
    public boolean isMarkedNullable() {
        int n4 = this.f;
        boolean bl = true;
        if ((n4 & 1) == 0) {
            bl = false;
        }
        return bl;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.d(false));
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}


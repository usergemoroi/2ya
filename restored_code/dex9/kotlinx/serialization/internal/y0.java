/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.a
 *  kotlin.jvm.internal.y
 *  kotlin.reflect.KClassifier
 *  kotlin.reflect.KTypeProjection
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.a;
import kotlin.jvm.internal.y;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006 "}, d2={"Lkotlinx/serialization/internal/y0;", "Lkotlin/reflect/KType;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "Lkotlin/reflect/KType;", "origin", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Lkotlin/reflect/KTypeProjection;", "getArguments", "arguments", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier", "isMarkedNullable", "()Z", "<init>", "(Lkotlin/reflect/KType;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
final class y0
implements KType {
    @NotNull
    private final KType c;

    public y0(@NotNull KType kType) {
        y.j((Object)kType, (String)"origin");
        this.c = kType;
    }

    public boolean equals(@Nullable Object object) {
        if (object == null) {
            return false;
        }
        KType kType = this.c;
        boolean bl = object instanceof y0;
        Object var4_4 = null;
        KType kType2 = bl ? (y0)object : null;
        if (!y.e((Object)kType, (Object)(kType2 = kType2 != null ? kType2.c : null))) {
            return false;
        }
        kType = this.getClassifier();
        if (kType instanceof KClass) {
            object = object instanceof KType ? (KType)object : null;
            kType2 = var4_4;
            if (object != null) {
                kType2 = object.getClassifier();
            }
            if (kType2 != null && kType2 instanceof KClass) {
                return y.e((Object)a.a((KClass)((KClass)((Object)kType))), (Object)a.a((KClass)((KClass)((Object)kType2))));
            }
        }
        return false;
    }

    @NotNull
    public List<Annotation> getAnnotations() {
        return this.c.getAnnotations();
    }

    @Override
    @NotNull
    public List<KTypeProjection> getArguments() {
        return this.c.getArguments();
    }

    @Override
    @Nullable
    public KClassifier getClassifier() {
        return this.c.getClassifier();
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    @Override
    public boolean isMarkedNullable() {
        return this.c.isMarkedNullable();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KTypeWrapper: ");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}


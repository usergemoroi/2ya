/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.ExperimentalStdlibApi
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlin.reflect.TypeImpl
 *  kotlin.reflect.TypesJVMKt
 *  kotlin.reflect.WildcardTypeImpl$Companion
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlin.reflect.TypeImpl;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.WildcardTypeImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2={"Lkotlin/reflect/WildcardTypeImpl;", "Ljava/lang/reflect/WildcardType;", "Lkotlin/reflect/TypeImpl;", "upperBound", "Ljava/lang/reflect/Type;", "lowerBound", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "equals", "", "other", "", "getLowerBounds", "", "()[Ljava/lang/reflect/Type;", "getTypeName", "", "getUpperBounds", "hashCode", "", "toString", "Companion", "kotlin-stdlib"}, k=1, mv={1, 9, 0}, xi=48)
@ExperimentalStdlibApi
final class WildcardTypeImpl
implements WildcardType,
TypeImpl {
    @NotNull
    public static final Companion Companion = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final WildcardTypeImpl STAR = new WildcardTypeImpl(null, null);
    @Nullable
    private final Type lowerBound;
    @Nullable
    private final Type upperBound;

    public WildcardTypeImpl(@Nullable Type type, @Nullable Type type2) {
        this.upperBound = type;
        this.lowerBound = type2;
    }

    public static final /* synthetic */ WildcardTypeImpl access$getSTAR$cp() {
        return STAR;
    }

    public boolean equals(@Nullable Object object) {
        Object[] objectArray;
        boolean bl = object instanceof WildcardType && Arrays.equals(objectArray = this.getUpperBounds(), (object = (WildcardType)object).getUpperBounds()) && Arrays.equals(this.getLowerBounds(), object.getLowerBounds());
        return bl;
    }

    @Override
    @NotNull
    public Type[] getLowerBounds() {
        Type[] typeArray = this.lowerBound;
        typeArray = typeArray == null ? new Type[]{} : new Type[]{typeArray};
        return typeArray;
    }

    @Override
    @NotNull
    public String getTypeName() {
        Object object;
        if (this.lowerBound != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append("? super ");
            ((StringBuilder)object).append(TypesJVMKt.access$typeToString((Type)this.lowerBound));
            object = ((StringBuilder)object).toString();
        } else {
            object = this.upperBound;
            if (object != null && !y.e((Object)object, Object.class)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("? extends ");
                ((StringBuilder)object).append(TypesJVMKt.access$typeToString((Type)this.upperBound));
                object = ((StringBuilder)object).toString();
            } else {
                object = "?";
            }
        }
        return object;
    }

    @Override
    @NotNull
    public Type[] getUpperBounds() {
        Type type = this.upperBound;
        Object object = type;
        if (type == null) {
            object = Object.class;
        }
        return new Type[]{object};
    }

    public int hashCode() {
        return Arrays.hashCode(this.getUpperBounds()) ^ Arrays.hashCode(this.getLowerBounds());
    }

    @NotNull
    public String toString() {
        return this.getTypeName();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  retrofit2.SkipCallbackExecutor
 *  retrofit2.d0
 */
package retrofit2;

import java.lang.annotation.Annotation;
import retrofit2.SkipCallbackExecutor;
import retrofit2.d0;

final class c0
implements SkipCallbackExecutor {
    private static final SkipCallbackExecutor a = new c0();

    c0() {
    }

    static Annotation[] a(Annotation[] annotationArray) {
        if (d0.l((Annotation[])annotationArray, SkipCallbackExecutor.class)) {
            return annotationArray;
        }
        Annotation[] annotationArray2 = new Annotation[annotationArray.length + 1];
        annotationArray2[0] = a;
        System.arraycopy(annotationArray, 0, annotationArray2, 1, annotationArray.length);
        return annotationArray2;
    }

    public Class<? extends Annotation> annotationType() {
        return SkipCallbackExecutor.class;
    }

    public boolean equals(Object object) {
        return object instanceof SkipCallbackExecutor;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("@");
        stringBuilder.append(SkipCallbackExecutor.class.getName());
        stringBuilder.append("()");
        return stringBuilder.toString();
    }
}


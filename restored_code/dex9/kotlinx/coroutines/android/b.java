/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  kotlin.Metadata
 *  kotlin.coroutines.g
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.android;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.coroutines.a;
import kotlin.coroutines.g;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2={"Lkotlinx/coroutines/android/b;", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/n0;", "Ljava/lang/reflect/Method;", "H", "()Ljava/lang/reflect/Method;", "Lkotlin/coroutines/g;", "context", "", "exception", "Lkotlin/k0;", "handleException", "(Lkotlin/coroutines/g;Ljava/lang/Throwable;)V", "", "_preHandler", "Ljava/lang/Object;", "<init>", "()V", "kotlinx-coroutines-android"}, k=1, mv={2, 0, 0})
public final class b
extends a
implements n0 {
    @Nullable
    private volatile Object _preHandler = this;

    public b() {
        super(n0.B8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Method H() {
        Object object;
        block4: {
            object = this._preHandler;
            if (object != this) {
                return (Method)object;
            }
            Object var3_3 = null;
            try {
                Method method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
                object = var3_3;
                if (!Modifier.isPublic(method.getModifiers())) break block4;
                boolean bl = Modifier.isStatic(method.getModifiers());
                object = var3_3;
                if (bl) {
                    object = method;
                }
            }
            catch (Throwable throwable) {
                object = var3_3;
            }
        }
        this._preHandler = object;
        return object;
    }

    @Override
    public void handleException(@NotNull g object, @NotNull Throwable throwable) {
        int n4 = Build.VERSION.SDK_INT;
        if (26 <= n4 && n4 < 28) {
            object = this.H();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if ((object = object != null ? ((Method)object).invoke(null, new Object[0]) : null) instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler)object;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), throwable);
            }
        }
    }
}


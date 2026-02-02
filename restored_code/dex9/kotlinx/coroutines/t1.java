/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.ExperimentalStdlibApi
 *  kotlin.Metadata
 *  kotlin.jvm.internal.p
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.coroutines.b;
import kotlin.coroutines.g;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.s1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u000b2\u00020\u00012\u00020\u00022\u00060\u0003j\u0002`\u0004:\u0001\fB\u0007\u00a2\u0006\u0004\b\t\u0010\nR\u0014\u0010\b\u001a\u00020\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\r"}, d2={"Lkotlinx/coroutines/t1;", "Lkotlinx/coroutines/m0;", "Ljava/io/Closeable;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Ljava/util/concurrent/Executor;", "H", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "()V", "c", "a", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
public abstract class t1
extends m0
implements Closeable,
AutoCloseable {
    @NotNull
    public static final a c = new a(null);

    @NotNull
    public abstract Executor H();

    @Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2={"Lkotlinx/coroutines/t1$a;", "Lkotlin/coroutines/b;", "Lkotlinx/coroutines/m0;", "Lkotlinx/coroutines/t1;", "<init>", "()V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    @ExperimentalStdlibApi
    public static final class a
    extends b<m0, t1> {
        private a() {
            super(m0.Key, new s1());
        }

        public /* synthetic */ a(p p4) {
            this();
        }

        public static /* synthetic */ t1 c(g.b b4) {
            return a.d(b4);
        }

        private static final t1 d(g.b b4) {
            b4 = b4 instanceof t1 ? (t1)b4 : null;
            return b4;
        }
    }
}


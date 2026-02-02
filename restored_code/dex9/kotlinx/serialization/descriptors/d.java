/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.p
 *  kotlinx.serialization.ExperimentalSerializationApi
 *  kotlinx.serialization.descriptors.l
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2={"Lkotlinx/serialization/descriptors/d;", "Lkotlinx/serialization/descriptors/l;", "<init>", "()V", "b", "a", "Lkotlinx/serialization/descriptors/d$a;", "Lkotlinx/serialization/descriptors/d$b;", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@ExperimentalSerializationApi
public abstract class d
extends l {
    private d() {
        super(null);
    }

    public /* synthetic */ d(p p4) {
        this();
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2={"Lkotlinx/serialization/descriptors/d$a;", "Lkotlinx/serialization/descriptors/d;", "<init>", "()V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
    public static final class a
    extends d {
        @NotNull
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2={"Lkotlinx/serialization/descriptors/d$b;", "Lkotlinx/serialization/descriptors/d;", "<init>", "()V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
    public static final class b
    extends d {
        @NotNull
        public static final b a = new b();

        private b() {
            super(null);
        }
    }
}


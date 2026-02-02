/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.collection.a
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.WasExperimental
 *  kotlin.jvm.JvmInline
 *  kotlin.jvm.internal.y
 *  kotlin.time.ExperimentalTime
 *  kotlin.time.a$a
 *  kotlin.time.l
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.y;
import kotlin.time.ExperimentalTime;
import kotlin.time.a;
import kotlin.time.i;
import kotlin.time.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0003\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006\u000b"}, d2={"Lkotlin/time/k;", "Lkotlin/time/l;", "Lkotlin/time/k$a;", "b", "()J", "", "toString", "()Ljava/lang/String;", "<init>", "()V", "a", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public final class k
implements l {
    @NotNull
    public static final k a = new k();

    private k() {
    }

    public long b() {
        return i.a.d();
    }

    @NotNull
    public String toString() {
        return i.a.toString();
    }

    @Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0018\u001a\u00060\u0014j\u0002`\u0015\u00a2\u0006\u0004\b\u0019\u0010\u0004J\u0012\u0010\u0003\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001H\u0096\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0086\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158\u0000X\u0080\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0088\u0001\u0018\u0092\u0001\u00060\u0014j\u0002`\u0015\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006\u001a"}, d2={"Lkotlin/time/k$a;", "Lkotlin/time/a;", "Lkotlin/time/b;", "f", "(J)J", "other", "j", "(JLkotlin/time/a;)J", "i", "(JJ)J", "", "k", "(J)Ljava/lang/String;", "", "h", "(J)I", "", "", "g", "(JLjava/lang/Object;)Z", "", "Lkotlin/time/ValueTimeMarkReading;", "c", "J", "reading", "e", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
    @JvmInline
    @SinceKotlin(version="1.9")
    @WasExperimental(markerClass={ExperimentalTime.class})
    public static final class a
    implements kotlin.time.a {
        private final long c;

        private /* synthetic */ a(long l4) {
            this.c = l4;
        }

        public static final /* synthetic */ a c(long l4) {
            return new a(l4);
        }

        public static long e(long l4) {
            return l4;
        }

        public static long f(long l4) {
            return i.a.c(l4);
        }

        public static boolean g(long l4, Object object) {
            if (!(object instanceof a)) {
                return false;
            }
            return l4 == ((a)object).l();
        }

        public static int h(long l4) {
            return androidx.collection.a.a((long)l4);
        }

        public static final long i(long l4, long l5) {
            return i.a.b(l4, l5);
        }

        public static long j(long l4, @NotNull kotlin.time.a a4) {
            y.j((Object)a4, (String)"other");
            if (a4 instanceof a) {
                return kotlin.time.k$a.i(l4, ((a)a4).l());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Subtracting or comparing time marks from different time sources is not possible: ");
            stringBuilder.append((Object)kotlin.time.k$a.k(l4));
            stringBuilder.append(" and ");
            stringBuilder.append(a4);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public static String k(long l4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ValueTimeMark(reading=");
            stringBuilder.append(l4);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }

        public long a() {
            return kotlin.time.k$a.f(this.c);
        }

        @Override
        public long b(@NotNull kotlin.time.a a4) {
            y.j((Object)a4, (String)"other");
            return kotlin.time.k$a.j(this.c, a4);
        }

        public int d(@NotNull kotlin.time.a a4) {
            return a.a.a((kotlin.time.a)this, (kotlin.time.a)a4);
        }

        public boolean equals(Object object) {
            return kotlin.time.k$a.g(this.c, object);
        }

        public int hashCode() {
            return kotlin.time.k$a.h(this.c);
        }

        public final /* synthetic */ long l() {
            return this.c;
        }

        public String toString() {
            return kotlin.time.k$a.k(this.c);
        }
    }
}


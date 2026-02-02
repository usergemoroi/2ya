/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.concurrent.futures.a
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.jvm.internal.g
 *  kotlin.jvm.JvmName
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.v
 *  kotlinx.coroutines.i1
 *  kotlinx.coroutines.k3
 *  kotlinx.coroutines.r
 *  kotlinx.coroutines.selects.c
 *  kotlinx.coroutines.selects.k$a
 *  kotlinx.coroutines.selects.l
 *  kotlinx.coroutines.selects.m
 *  kotlinx.coroutines.selects.n
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.selects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.t;
import kotlin.coroutines.g;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.k3;
import kotlinx.coroutines.p;
import kotlinx.coroutines.r;
import kotlinx.coroutines.selects.c;
import kotlinx.coroutines.selects.d;
import kotlinx.coroutines.selects.f;
import kotlinx.coroutines.selects.k;
import kotlinx.coroutines.selects.l;
import kotlinx.coroutines.selects.m;
import kotlinx.coroutines.selects.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\fB\u000f\u0012\u0006\u0010@\u001a\u00020<\u00a2\u0006\u0004\bM\u0010NJ\u0010\u0010\u0005\u001a\u00028\u0000H\u0091@\u00a2\u0006\u0004\b\u0005\u0010\u0006J2\u0010\f\u001a\u00020\u000b*\u00020\u00072\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0096\u0002\u00a2\u0006\u0004\b\f\u0010\rJD\u0010\u0011\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00010\u000f2\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0010H\u0096\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u000b*\f0\u0013R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ#\u0010 \u001a\u00020\u000b2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\b#\u0010$J!\u0010'\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020)2\u0006\u0010%\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016\u00a2\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00028\u0000H\u0082@\u00a2\u0006\u0004\b0\u0010\u0006J\u0017\u00101\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b1\u0010$J\u0010\u00102\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0004\b2\u0010\u0006J\u0017\u00103\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b3\u0010$J!\u00104\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\b4\u00105J#\u00106\u001a\u000e\u0018\u00010\u0013R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010%\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00028\u0000H\u0082@\u00a2\u0006\u0004\b8\u0010\u0006J!\u0010:\u001a\u00020\u000b2\u0010\u00109\u001a\f0\u0013R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002\u00a2\u0006\u0004\b:\u0010;R\u001a\u0010@\u001a\u00020<8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b \u0010=\u001a\u0004\b>\u0010?R(\u0010C\u001a\u0014\u0012\u000e\u0012\f0\u0013R\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010A8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b#\u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001a\u0010DR\u0016\u0010G\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b'\u0010FR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0011\u0010DR\u0014\u0010J\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040K8\u0002X\u0082\u0004\u00a8\u0006O"}, d2={"Lkotlinx/coroutines/selects/k;", "R", "Lkotlinx/coroutines/m;", "Lkotlinx/coroutines/selects/c;", "", "o", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/d;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "block", "Lkotlin/k0;", "a", "(Lkotlinx/coroutines/selects/d;Lkotlin/jvm/functions/l;)V", "Q", "Lkotlinx/coroutines/selects/f;", "Lkotlin/Function2;", "g", "(Lkotlinx/coroutines/selects/f;Lkotlin/jvm/functions/p;)V", "Lkotlinx/coroutines/selects/k$a;", "", "reregister", "u", "(Lkotlinx/coroutines/selects/k$a;Z)V", "Lkotlinx/coroutines/i1;", "disposableHandle", "e", "(Lkotlinx/coroutines/i1;)V", "Lkotlinx/coroutines/internal/a0;", "segment", "", "index", "c", "(Lkotlinx/coroutines/internal/a0;I)V", "internalResult", "d", "(Ljava/lang/Object;)V", "clauseObject", "result", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/selects/n;", "x", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/coroutines/selects/n;", "", "cause", "b", "(Ljava/lang/Throwable;)V", "q", "l", "z", "w", "y", "(Ljava/lang/Object;Ljava/lang/Object;)I", "r", "(Ljava/lang/Object;)Lkotlinx/coroutines/selects/k$a;", "n", "selectedClause", "m", "(Lkotlinx/coroutines/selects/k$a;)V", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "", "Ljava/util/List;", "clauses", "Ljava/lang/Object;", "disposableHandleOrSegment", "I", "indexInSegment", "t", "()Z", "isSelected", "Lkotlinx/atomicfu/AtomicRef;", "state", "<init>", "(Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@PublishedApi
@SourceDebugExtension(value={"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,904:1\n1#2:905\n2632#3,3:906\n1863#3,2:918\n1863#3,2:926\n1863#3,2:928\n351#4,9:909\n360#4,2:920\n149#5,4:922\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n*L\n529#1:906,3\n593#1:918,2\n749#1:926,2\n774#1:928,2\n569#1:909,9\n569#1:920,2\n734#1:922,4\n*E\n"})
public class k<R>
implements kotlinx.coroutines.m,
c<R>,
l,
k3 {
    private static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "state$volatile");
    @NotNull
    private final g c;
    @Nullable
    private List<a> d;
    @Nullable
    private Object e;
    private int f;
    @Nullable
    private Object g;
    private volatile Object state$volatile;

    public k(@NotNull g g4) {
        this.c = g4;
        this.state$volatile = m.g();
        this.d = new ArrayList<a>(2);
        this.f = -1;
        this.g = m.d();
    }

    public static final /* synthetic */ Object i(k k4) {
        return k4.g;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater j() {
        return k.h;
    }

    public static final /* synthetic */ void k(k k4, Object object) {
        k4.w(object);
    }

    private final void l(Object object) {
        Object object2 = this.d;
        y.g(object2);
        object2 = (Iterable)object2;
        if (!(object2 instanceof Collection) || !((Collection)object2).isEmpty()) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                if ((object2.next()).a != object) continue;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Cannot use select clauses on the same object: ");
                ((StringBuilder)object2).append(object);
                throw new IllegalStateException(((StringBuilder)object2).toString().toString());
            }
        }
    }

    private final void m(a a4) {
        List<a> list = this.d;
        if (list == null) {
            return;
        }
        for (a a5 : (Iterable)list) {
            if (a5 == a4) continue;
            a5.b();
        }
        k.h.set(this, m.f());
        this.g = m.d();
        this.d = null;
    }

    private final Object n(kotlin.coroutines.d<? super R> d4) {
        Object object = k.h.get(this);
        y.h(object, (String)"null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        a a4 = object;
        object = this.g;
        this.m(a4);
        return a4.c(a4.d(object), d4);
    }

    @PublishedApi
    static /* synthetic */ <R> Object p(k<R> k4, kotlin.coroutines.d<? super R> d4) {
        if (super.t()) {
            return super.n(d4);
        }
        return super.q(d4);
    }

    /*
     * Unable to fully structure code
     */
    private final Object q(kotlin.coroutines.d<? super R> var1_1) {
        block7: {
            block8: {
                block4: {
                    block5: {
                        block6: {
                            if (!(var1_1 instanceof b)) ** GOTO lbl-1000
                            var3_2 = var1_1;
                            var2_3 = var3_2.o;
                            if ((var2_3 & -2147483648) != 0) {
                                var3_2.o = var2_3 + -2147483648;
                                var1_1 = var3_2;
                            } else // 2 sources

                            {
                                var1_1 = new kotlin.coroutines.jvm.internal.d(this, (kotlin.coroutines.d<? super b>)var1_1){
                                    Object l;
                                    Object m;
                                    final k<R> n;
                                    int o;
                                    {
                                        this.n = k4;
                                        super(d4);
                                    }

                                    @Override
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object) {
                                        this.m = object;
                                        this.o |= Integer.MIN_VALUE;
                                        return this.n.q(this);
                                    }
                                };
                            }
                            var4_4 = var1_1.m;
                            var5_5 = kotlin.coroutines.intrinsics.b.f();
                            var2_3 = var1_1.o;
                            if (var2_3 == 0) break block4;
                            if (var2_3 == 1) break block5;
                            if (var2_3 != 2) break block6;
                            v.b((Object)var4_4);
                            var1_1 = var4_4;
                            break block7;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    var3_2 = (k)var1_1.l;
                    v.b((Object)var4_4);
                    break block8;
                }
                v.b((Object)var4_4);
                var1_1.l = this;
                var1_1.o = 1;
                if (this.z((kotlin.coroutines.d<k0>)var1_1) == var5_5) {
                    return var5_5;
                }
                var3_2 = this;
            }
            var1_1.l = null;
            var1_1.o = 2;
            var1_1 = var3_2 = super.n((kotlin.coroutines.d<? super R>)var1_1);
            if (var3_2 == var5_5) {
                return var5_5;
            }
        }
        return var1_1;
    }

    private final a r(Object object) {
        Object object2 = this.d;
        Object var3_3 = null;
        if (object2 == null) {
            return null;
        }
        Iterator iterator = ((Iterable)object2).iterator();
        do {
            object2 = var3_3;
            if (!iterator.hasNext()) break;
            object2 = iterator.next();
        } while (object2.a != object);
        if ((object2 = object2) != null) {
            return object2;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Clause with object ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(" is not found");
        throw new IllegalStateException(((StringBuilder)object2).toString().toString());
    }

    private final boolean t() {
        return k.h.get(this) instanceof a;
    }

    public static /* synthetic */ void v(k k4, a a4, boolean bl, int n4, Object object) {
        if (object == null) {
            if ((n4 & 1) != 0) {
                bl = false;
            }
            k4.u(a4, bl);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
    }

    private final void w(Object object) {
        object = this.r(object);
        y.g((Object)object);
        object.g = null;
        object.h = -1;
        this.u(object, true);
    }

    private final int y(Object object, Object object2) {
        block5: {
            Object v3;
            block6: {
                while (true) {
                    if ((v3 = k.h.get(this)) instanceof kotlinx.coroutines.n) {
                        a a4 = this.r(object);
                        if (a4 == null) continue;
                        q q4 = a4.a((l)this, object2);
                        if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)k.h, (Object)this, v3, (Object)a4)) continue;
                        object = (kotlinx.coroutines.n)v3;
                        this.g = object2;
                        if (m.h((kotlinx.coroutines.n)object, (q)q4)) {
                            return 0;
                        }
                        this.g = m.d();
                        return 2;
                    }
                    if (y.e(v3, (Object)m.f()) || v3 instanceof a) break block5;
                    if (y.e(v3, (Object)m.e())) {
                        return 2;
                    }
                    if (y.e(v3, (Object)m.g())) {
                        if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)k.h, (Object)this, v3, (Object)t.e(object))) continue;
                        return 1;
                    }
                    if (!(v3 instanceof List)) break block6;
                    if (androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)k.h, (Object)this, v3, (Object)t.N0((Collection)v3, object))) break;
                }
                return 1;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unexpected state: ");
            ((StringBuilder)object).append(v3);
            throw new IllegalStateException(((StringBuilder)object).toString().toString());
        }
        return 3;
    }

    /*
     * Unable to fully structure code
     */
    private final Object z(kotlin.coroutines.d<? super k0> var1_1) {
        block10: {
            block9: {
                var2_2 = new p<T>(kotlin.coroutines.intrinsics.b.c(var1_1), 1);
                var2_2.H();
                var3_3 = k.j();
                block0: while (true) {
                    if ((var4_4 = var3_3.get(this)) == m.g()) {
                        if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)k.j(), (Object)this, var4_4, var2_2)) continue;
                        r.c(var2_2, (kotlinx.coroutines.m)this);
                        break block9;
                    }
                    if (!(var4_4 instanceof List)) break;
                    if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)k.j(), (Object)this, var4_4, (Object)m.g())) continue;
                    var5_5 = (List)var4_4;
                    var4_4 = ((Iterable)var4_4).iterator();
                    while (true) {
                        if (var4_4.hasNext()) ** break;
                        continue block0;
                        k.k(this, var4_4.next());
                    }
                    break;
                }
                if (!(var4_4 instanceof a)) break block10;
                var2_2.p(k0.a, (var4_4).a((l)this, k.i(this)));
            }
            var2_2 = var2_2.z();
            if (var2_2 == kotlin.coroutines.intrinsics.b.f()) {
                kotlin.coroutines.jvm.internal.g.c((kotlin.coroutines.d)var1_1);
            }
            if (var2_2 == kotlin.coroutines.intrinsics.b.f()) {
                return var2_2;
            }
            return k0.a;
        }
        var1_1 = new StringBuilder();
        var1_1.append("unexpected state: ");
        var1_1.append(var4_4);
        throw new IllegalStateException(var1_1.toString().toString());
    }

    public void a(@NotNull d d4, @NotNull kotlin.jvm.functions.l<? super kotlin.coroutines.d<? super R>, ? extends Object> l4) {
        k.v(this, new /* Unavailable Anonymous Inner Class!! */, false, 1, null);
    }

    @Override
    public void b(@Nullable Throwable list) {
        Object v3;
        list = k.h;
        do {
            if ((v3 = ((AtomicReferenceFieldUpdater)((Object)list)).get(this)) != m.f()) continue;
            return;
        } while (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)((Object)list), (Object)this, v3, (Object)m.e()));
        list = this.d;
        if (list == null) {
            return;
        }
        list = ((Iterable)list).iterator();
        while (list.hasNext()) {
            (list.next()).b();
        }
        this.g = m.d();
        this.d = null;
    }

    public void c(@NotNull a0<?> a02, int n4) {
        this.e = a02;
        this.f = n4;
    }

    public void d(@Nullable Object object) {
        this.g = object;
    }

    public void e(@NotNull i1 i12) {
        this.e = i12;
    }

    public boolean f(@NotNull Object object, @Nullable Object object2) {
        boolean bl = this.y(object, object2) == 0;
        return bl;
    }

    public <Q> void g(@NotNull f<? extends Q> f4, @NotNull kotlin.jvm.functions.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> p4) {
        k.v(this, new /* Unavailable Anonymous Inner Class!! */, false, 1, null);
    }

    @NotNull
    public g getContext() {
        return this.c;
    }

    @PublishedApi
    @Nullable
    public Object o(@NotNull kotlin.coroutines.d<? super R> d4) {
        return k.p(this, d4);
    }

    @JvmName(name="register")
    public final void u(@NotNull a a4, boolean bl) {
        if (k.h.get(this) instanceof a) {
            return;
        }
        if (!bl) {
            this.l(a4.a);
        }
        if (a4.e(this)) {
            if (!bl) {
                List<a> list = this.d;
                y.g(list);
                ((Collection)list).add(a4);
            }
            a4.g = this.e;
            a4.h = this.f;
            this.e = null;
            this.f = -1;
        } else {
            k.h.set(this, a4);
        }
    }

    @NotNull
    public final n x(@NotNull Object object, @Nullable Object object2) {
        return m.b((int)this.y(object, object2));
    }
}


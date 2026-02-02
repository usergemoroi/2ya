/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.collection.a
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.jvm.internal.b
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.k0
 *  kotlin.v
 *  kotlinx.coroutines.a1
 *  kotlinx.coroutines.flow.h
 *  kotlinx.coroutines.flow.i
 *  kotlinx.coroutines.flow.j
 *  kotlinx.coroutines.flow.k0
 *  kotlinx.coroutines.flow.m0
 *  org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow;

import androidx.collection.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.q0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0017\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0015\u00a8\u0006\u001b"}, d2={"Lkotlinx/coroutines/flow/p0;", "Lkotlinx/coroutines/flow/m0;", "Lkotlinx/coroutines/flow/q0;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/h;", "Lkotlinx/coroutines/flow/k0;", "a", "(Lkotlinx/coroutines/flow/q0;)Lkotlinx/coroutines/flow/h;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "b", "J", "stopTimeout", "c", "replayExpiration", "<init>", "(JJ)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nSharingStarted.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharingStarted.kt\nkotlinx/coroutines/flow/StartedWhileSubscribed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
final class p0
implements m0 {
    private final long b;
    private final long c;

    public p0(long l4, long l5) {
        this.b = l4;
        this.c = l5;
        if (l4 >= 0L) {
            if (l5 >= 0L) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("replayExpiration(");
            stringBuilder.append(l5);
            stringBuilder.append(" ms) cannot be negative");
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("stopTimeout(");
        stringBuilder.append(l4);
        stringBuilder.append(" ms) cannot be negative");
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public static final /* synthetic */ long b(p0 p02) {
        return p02.c;
    }

    public static final /* synthetic */ long c(p0 p02) {
        return p02.b;
    }

    @NotNull
    public h<kotlinx.coroutines.flow.k0> a(@NotNull q0<Integer> q02) {
        return j.q((h)j.u((h)j.Z(q02, (q)new q<i<? super kotlinx.coroutines.flow.k0>, Integer, d<? super k0>, Object>(this, null){
            int l;
            private Object m;
            int n;
            final p0 o;
            {
                this.o = p02;
                super(3, d4);
            }

            public final Object a(i<? super kotlinx.coroutines.flow.k0> i4, int n4, d<? super k0> q4) {
                q4 = new /* invalid duplicate definition of identical inner class */;
                q4.m = i4;
                q4.n = n4;
                return q4.invokeSuspend(k0.a);
            }

            /*
             * Unable to fully structure code
             * Could not resolve type clashes
             */
            @Override
            public final Object invokeSuspend(Object var1_1) {
                block15: {
                    block12: {
                        block13: {
                            block14: {
                                block16: {
                                    block7: {
                                        block8: {
                                            block9: {
                                                block10: {
                                                    block11: {
                                                        var6_2 = kotlin.coroutines.intrinsics.b.f();
                                                        var2_3 = this.l;
                                                        if (var2_3 == 0) break block7;
                                                        if (var2_3 == 1) break block8;
                                                        if (var2_3 == 2) break block9;
                                                        if (var2_3 == 3) break block10;
                                                        if (var2_3 == 4) break block11;
                                                        if (var2_3 != 5) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        break block8;
                                                    }
                                                    var5_4 /* !! */  = (i)this.m;
                                                    v.b((Object)var1_1);
                                                    break block12;
                                                }
                                                var5_4 /* !! */  = (i)this.m;
                                                v.b((Object)var1_1);
                                                break block13;
                                            }
                                            var5_4 /* !! */  = (i)this.m;
                                            v.b((Object)var1_1);
                                            var1_1 = var5_4 /* !! */ ;
                                            break block14;
                                        }
                                        v.b((Object)var1_1);
                                        break block15;
                                    }
                                    v.b((Object)var1_1);
                                    var1_1 = (i)this.m;
                                    if (this.n <= 0) break block16;
                                    var5_5 = kotlinx.coroutines.flow.k0.c;
                                    this.l = 1;
                                    if (var1_1.emit((Object)var5_5, (d)this) == var6_2) {
                                        return var6_2;
                                    }
                                    break block15;
                                }
                                var3_6 = p0.c(this.o);
                                this.m = var1_1;
                                this.l = 2;
                                if (a1.b((long)var3_6, (d)this) == var6_2) {
                                    return var6_2;
                                }
                            }
                            var5_4 /* !! */  = var1_1;
                            if (p0.b(this.o) > 0L) {
                                var7_7 = kotlinx.coroutines.flow.k0.d;
                                this.m = var1_1;
                                this.l = 3;
                                var5_4 /* !! */  = var1_1;
                                if (var1_1.emit((Object)var7_7, (d)this) == var6_2) {
                                    return var6_2;
                                } else {
                                    ** GOTO lbl52
                                }
                            }
                            break block12;
                        }
                        var3_6 = p0.b(this.o);
                        this.m = var5_4 /* !! */ ;
                        this.l = 4;
                        if (a1.b((long)var3_6, (d)this) == var6_2) {
                            return var6_2;
                        }
                    }
                    var1_1 = kotlinx.coroutines.flow.k0.e;
                    this.m = null;
                    this.l = 5;
                    if (var5_4 /* !! */ .emit(var1_1, (d)this) == var6_2) {
                        return var6_2;
                    }
                }
                return k0.a;
            }
        }), (p)new p<kotlinx.coroutines.flow.k0, d<? super Boolean>, Object>(null){
            int l;
            Object m;

            public final Object a(kotlinx.coroutines.flow.k0 k02, d<? super Boolean> d4) {
                return (this.create(k02, d4)).invokeSuspend(k0.a);
            }

            @Override
            public final d<k0> create(Object object, d<?> p4) {
                p4 = new /* invalid duplicate definition of identical inner class */;
                p4.m = object;
                return p4;
            }

            @Override
            public final Object invokeSuspend(Object object) {
                kotlin.coroutines.intrinsics.b.f();
                if (this.l == 0) {
                    v.b((Object)object);
                    boolean bl = (kotlinx.coroutines.flow.k0)this.m != kotlinx.coroutines.flow.k0.c;
                    return kotlin.coroutines.jvm.internal.b.a((boolean)bl);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@Nullable Object object) {
        if (!(object instanceof p0)) return false;
        long l4 = this.b;
        object = (p0)object;
        if (l4 != ((p0)object).b) return false;
        if (this.c != ((p0)object).c) return false;
        return true;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return a.a((long)this.b) * 31 + a.a((long)this.c);
    }

    @NotNull
    public String toString() {
        Object object;
        Object object2 = t.d(2);
        if (this.b > 0L) {
            object = new StringBuilder();
            ((StringBuilder)object).append("stopTimeout=");
            ((StringBuilder)object).append(this.b);
            ((StringBuilder)object).append("ms");
            object2.add(((StringBuilder)object).toString());
        }
        if (this.c < Long.MAX_VALUE) {
            object = new StringBuilder();
            ((StringBuilder)object).append("replayExpiration=");
            ((StringBuilder)object).append(this.c);
            ((StringBuilder)object).append("ms");
            object2.add(((StringBuilder)object).toString());
        }
        object = t.a((List)object2);
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("SharingStarted.WhileSubscribed(");
        ((StringBuilder)object2).append(t.B0((Iterable)object, null, null, null, 0, null, null, 63, null));
        ((StringBuilder)object2).append(')');
        return ((StringBuilder)object2).toString();
    }
}


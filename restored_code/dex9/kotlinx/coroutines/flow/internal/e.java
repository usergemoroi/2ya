/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.v
 *  kotlinx.coroutines.InternalCoroutinesApi
 *  kotlinx.coroutines.channels.a
 *  kotlinx.coroutines.channels.t
 *  kotlinx.coroutines.channels.x
 *  kotlinx.coroutines.flow.h
 *  kotlinx.coroutines.flow.i
 *  kotlinx.coroutines.flow.j
 *  kotlinx.coroutines.q0
 *  kotlinx.coroutines.r0
 *  kotlinx.coroutines.s0
 *  kotlinx.coroutines.u0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.channels.x;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.internal.q;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b0\u00101J\u0017\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016\u00a2\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH$\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u00a4@\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0011\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096@\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010&R6\u0010,\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120(\u0012\u0006\u0012\u0004\u0018\u00010)0'8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b-\u0010.\u00a8\u00062"}, d2={"Lkotlinx/coroutines/flow/internal/e;", "T", "Lkotlinx/coroutines/flow/internal/q;", "Lkotlinx/coroutines/flow/h;", "k", "()Lkotlinx/coroutines/flow/h;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/a;", "onBufferOverflow", "b", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)Lkotlinx/coroutines/flow/h;", "j", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)Lkotlinx/coroutines/flow/internal/e;", "Lkotlinx/coroutines/channels/v;", "scope", "Lkotlin/k0;", "i", "(Lkotlinx/coroutines/channels/v;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/channels/x;", "n", "(Lkotlinx/coroutines/q0;)Lkotlinx/coroutines/channels/x;", "Lkotlinx/coroutines/flow/i;", "collector", "collect", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "g", "()Ljava/lang/String;", "toString", "c", "Lkotlin/coroutines/g;", "d", "I", "e", "Lkotlinx/coroutines/channels/a;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "l", "()Lkotlin/jvm/functions/p;", "collectToFun", "m", "()I", "produceCapacity", "<init>", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/a;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1#2:242\n*E\n"})
@InternalCoroutinesApi
public abstract class e<T>
implements q<T> {
    @JvmField
    @NotNull
    public final g c;
    @JvmField
    public final int d;
    @JvmField
    @NotNull
    public final a e;

    public e(@NotNull g g4, int n4, @NotNull a a4) {
        this.c = g4;
        this.d = n4;
        this.e = a4;
    }

    static /* synthetic */ <T> Object h(e<T> object, i<? super T> i4, d<? super k0> d4) {
        if ((object = r0.g((p)new p<q0, d<? super k0>, Object>(i4, object, null){
            int l;
            private Object m;
            final i<T> n;
            final e<T> o;
            {
                this.n = i4;
                this.o = e4;
                super(2, d4);
            }

            @Override
            public final d<k0> create(Object object, d<?> p4) {
                p4 = new /* invalid duplicate definition of identical inner class */;
                p4.m = object;
                return p4;
            }

            @Override
            public final Object invoke(q0 q02, d<? super k0> d4) {
                return (this.create(q02, d4)).invokeSuspend(k0.a);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final Object invokeSuspend(Object i4) {
                Object object = b.f();
                int n4 = this.l;
                if (n4 != 0) {
                    if (n4 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    v.b(i4);
                    return k0.a;
                } else {
                    v.b(i4);
                    x x3 = (x)this.m;
                    i4 = this.n;
                    x3 = this.o.n((q0)x3);
                    this.l = 1;
                    if (j.v(i4, x3, (d)this) != object) return k0.a;
                    return object;
                }
            }
        }, d4)) == b.f()) {
            return object;
        }
        return k0.a;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    @NotNull
    public h<T> b(@NotNull g var1_1, int var2_2, @NotNull a var3_3) {
        var1_1 = var1_1.plus(this.c);
        if (var3_3 == a.c) {
            var4_4 = this.d;
            if (var4_4 != -3) {
                if (var2_2 == -3) {
                    while (true) {
                        var2_2 = var4_4;
                        break;
                    }
                } else if (var4_4 != -2) {
                    if (var2_2 == -2) ** continue;
                    if ((var2_2 += var4_4) < 0) {
                        var2_2 = 0x7FFFFFFF;
                    }
                }
            }
            var3_3 = this.e;
        }
        if (y.e((Object)var1_1, (Object)this.c) && var2_2 == this.d && var3_3 == this.e) {
            return this;
        }
        return this.j(var1_1, var2_2, var3_3);
    }

    @Nullable
    public Object collect(@NotNull i<? super T> i4, @NotNull d<? super k0> d4) {
        return kotlinx.coroutines.flow.internal.e.h(this, i4, d4);
    }

    @Nullable
    protected String g() {
        return null;
    }

    @Nullable
    protected abstract Object i(@NotNull kotlinx.coroutines.channels.v<? super T> var1, @NotNull d<? super k0> var2);

    @NotNull
    protected abstract e<T> j(@NotNull g var1, int var2, @NotNull a var3);

    @Nullable
    public h<T> k() {
        return null;
    }

    @NotNull
    public final p<kotlinx.coroutines.channels.v<? super T>, d<? super k0>, Object> l() {
        return new p<kotlinx.coroutines.channels.v<? super T>, d<? super k0>, Object>(this, null){
            int l;
            Object m;
            final e<T> n;
            {
                this.n = e4;
                super(2, d4);
            }

            @Override
            public final d<k0> create(Object object, d<?> p4) {
                p4 = new /* invalid duplicate definition of identical inner class */;
                p4.m = object;
                return p4;
            }

            @Override
            public final Object invoke(kotlinx.coroutines.channels.v<? super T> v3, d<? super k0> d4) {
                return (this.create(v3, d4)).invokeSuspend(k0.a);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final Object invokeSuspend(Object object) {
                Object object2 = b.f();
                int n4 = this.l;
                if (n4 != 0) {
                    if (n4 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    v.b((Object)object);
                    return k0.a;
                } else {
                    v.b((Object)object);
                    object = (kotlinx.coroutines.channels.v)this.m;
                    e e4 = this.n;
                    this.l = 1;
                    if (e4.i((kotlinx.coroutines.channels.v)object, this) != object2) return k0.a;
                    return object2;
                }
            }
        };
    }

    public final int m() {
        int n4;
        int n5 = n4 = this.d;
        if (n4 == -3) {
            n5 = -2;
        }
        return n5;
    }

    @NotNull
    public x<T> n(@NotNull q0 q02) {
        return kotlinx.coroutines.channels.t.h((q0)q02, (g)this.c, (int)this.m(), (a)this.e, (s0)s0.e, null, this.l(), (int)16, null);
    }

    @NotNull
    public String toString() {
        ArrayList<String> arrayList = new ArrayList<String>(4);
        CharSequence charSequence = this.g();
        if (charSequence != null) {
            arrayList.add((String)charSequence);
        }
        if (this.c != kotlin.coroutines.h.c) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("context=");
            ((StringBuilder)charSequence).append(this.c);
            arrayList.add(((StringBuilder)charSequence).toString());
        }
        if (this.d != -3) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("capacity=");
            ((StringBuilder)charSequence).append(this.d);
            arrayList.add(((StringBuilder)charSequence).toString());
        }
        if (this.e != a.c) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("onBufferOverflow=");
            ((StringBuilder)charSequence).append(this.e);
            arrayList.add(((StringBuilder)charSequence).toString());
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(u0.a((Object)this));
        ((StringBuilder)charSequence).append('[');
        ((StringBuilder)charSequence).append(t.B0(arrayList, ", ", null, null, 0, null, null, 62, null));
        ((StringBuilder)charSequence).append(']');
        return ((StringBuilder)charSequence).toString();
    }
}


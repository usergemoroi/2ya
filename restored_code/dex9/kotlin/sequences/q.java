/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.OverloadResolutionByLambdaReturnType
 *  kotlin.SinceKotlin
 *  kotlin.coroutines.d
 *  kotlin.jvm.JvmName
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.sequences.i
 *  kotlin.sequences.k
 *  kotlin.t
 *  kotlin.v
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.sequences;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.SinceKotlin;
import kotlin.collections.b1;
import kotlin.coroutines.d;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.sequences.e;
import kotlin.sequences.h;
import kotlin.sequences.i;
import kotlin.sequences.k;
import kotlin.sequences.l;
import kotlin.sequences.o;
import kotlin.sequences.p;
import kotlin.sequences.s;
import kotlin.sequences.u;
import kotlin.t;
import kotlin.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a-\u0010\u0005\u001a\u00020\u0004\"\t\b\u0000\u0010\u0001\u00a2\u0006\u0002\b\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\u0007\u0010\b\u001a*\u0010\n\u001a\u00020\t\"\t\b\u0000\u0010\u0001\u00a2\u0006\u0002\b\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\f\u0010\b\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\t\u00a2\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f\u00a2\u0006\u0004\b\u0013\u0010\u0012\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0014*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\t\u00a2\u0006\u0004\b\u0017\u0010\u000e\u001a7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f\u00a2\u0006\u0004\b\u0018\u0010\u0012\u001a?\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010\u001b\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0019j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u001a\u00a2\u0006\u0004\b\u001c\u0010\u001d\u001a7\u0010!\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u0010\b\u0001\u0010\u001f*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001e*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010 \u001a\u00028\u0001\u00a2\u0006\u0004\b!\u0010\"\u001a#\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b$\u0010%\u001a#\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b'\u0010%\u001a#\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b)\u0010*\u001aE\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010+*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010,0\u000fH\u0007\u00a2\u0006\u0004\b.\u0010\u0012\u001a=\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010+*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\u00a2\u0006\u0004\b/\u0010\u0012\u001aC\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0001\"\b\b\u0001\u0010+*\u00020\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000f\u00a2\u0006\u0004\b0\u0010\u0012\u001a\u001d\u00101\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b1\u00102\u001a=\u00103\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010\u001b\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0019j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u001aH\u0007\u00a2\u0006\u0004\b3\u00104\u001a\\\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010+*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00105\u001a\u00028\u00012'\u0010:\u001a#\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000106H\u0007\u00a2\u0006\u0004\b\u001f\u0010;\u001a4\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002\u00a2\u0006\u0004\b=\u0010>\u001aF\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010@0\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010+*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\u0004\u00a2\u0006\u0004\bA\u0010>\u001a}\u0010K\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\f\b\u0001\u00103*\u00060Bj\u0002`C*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010D\u001a\u00028\u00012\b\b\u0002\u0010F\u001a\u00020E2\b\b\u0002\u0010G\u001a\u00020E2\b\b\u0002\u0010H\u001a\u00020E2\b\b\u0002\u0010I\u001a\u00020\t2\b\b\u0002\u0010J\u001a\u00020E2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020E\u0018\u00010\u000f\u00a2\u0006\u0004\bK\u0010L\u001ag\u0010N\u001a\u00020M\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010F\u001a\u00020E2\b\b\u0002\u0010G\u001a\u00020E2\b\b\u0002\u0010H\u001a\u00020E2\b\b\u0002\u0010I\u001a\u00020\t2\b\b\u0002\u0010J\u001a\u00020E2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020E\u0018\u00010\u000f\u00a2\u0006\u0004\bN\u0010O\u001a#\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000,\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\bP\u0010Q\u00a8\u0006R"}, d2={"Lkotlin/internal/OnlyInputTypes;", "T", "Lkotlin/sequences/i;", "element", "", "l", "(Lkotlin/sequences/i;Ljava/lang/Object;)Z", "r", "(Lkotlin/sequences/i;)Ljava/lang/Object;", "", "t", "(Lkotlin/sequences/i;Ljava/lang/Object;)I", "x", "n", "(Lkotlin/sequences/i;I)Lkotlin/sequences/i;", "Lkotlin/Function1;", "predicate", "o", "(Lkotlin/sequences/i;Lkotlin/jvm/functions/l;)Lkotlin/sequences/i;", "p", "", "q", "(Lkotlin/sequences/i;)Lkotlin/sequences/i;", "E", "F", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "D", "(Lkotlin/sequences/i;Ljava/util/Comparator;)Lkotlin/sequences/i;", "", "C", "destination", "G", "(Lkotlin/sequences/i;Ljava/util/Collection;)Ljava/util/Collection;", "", "H", "(Lkotlin/sequences/i;)Ljava/util/List;", "", "I", "", "J", "(Lkotlin/sequences/i;)Ljava/util/Set;", "R", "", "transform", "s", "y", "z", "m", "(Lkotlin/sequences/i;)I", "A", "(Lkotlin/sequences/i;Ljava/util/Comparator;)Ljava/lang/Object;", "initial", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "operation", "(Lkotlin/sequences/i;Ljava/lang/Object;Lkotlin/jvm/functions/p;)Lkotlin/sequences/i;", "elements", "B", "(Lkotlin/sequences/i;Lkotlin/sequences/i;)Lkotlin/sequences/i;", "other", "Lkotlin/t;", "K", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "u", "(Lkotlin/sequences/i;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/l;)Ljava/lang/Appendable;", "", "v", "(Lkotlin/sequences/i;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/l;)Ljava/lang/String;", "k", "(Lkotlin/sequences/i;)Ljava/lang/Iterable;", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/sequences/SequencesKt")
@SourceDebugExtension(value={"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,3112:1\n183#1,2:3113\n320#1,7:3115\n1328#1,3:3123\n743#1,4:3126\n708#1,4:3130\n726#1,4:3134\n779#1,4:3138\n1021#1,3:3142\n1024#1,3:3152\n1041#1,3:3155\n1044#1,3:3165\n1328#1,3:3182\n1317#1,2:3185\n1#2:3122\n381#3,7:3145\n381#3,7:3158\n381#3,7:3168\n381#3,7:3175\n*S KotlinDebug\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n91#1:3113,2\n103#1:3115,7\n462#1:3123,3\n662#1:3126,4\n678#1:3130,4\n693#1:3134,4\n764#1:3138,4\n992#1:3142,3\n992#1:3152,3\n1007#1:3155,3\n1007#1:3165,3\n1110#1:3182,3\n1148#1:3185,2\n992#1:3145,7\n1007#1:3158,7\n1023#1:3168,7\n1043#1:3175,7\n*E\n"})
class q
extends p {
    @SinceKotlin(version="1.4")
    @Nullable
    public static <T> T A(@NotNull i<? extends T> object, @NotNull Comparator<? super T> comparator) {
        y.j(object, (String)"<this>");
        y.j(comparator, (String)"comparator");
        Iterator iterator = object.iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        object = iterator.next();
        while (iterator.hasNext()) {
            Object e4 = iterator.next();
            if (comparator.compare((i<? extends T>)object, (i<? extends T>)e4) <= 0) continue;
            object = e4;
        }
        return (T)object;
    }

    @NotNull
    public static <T> i<T> B(@NotNull i<? extends T> i4, @NotNull i<? extends T> i5) {
        y.j(i4, (String)"<this>");
        y.j(i5, (String)"elements");
        return o.f(l.j(new i[]{i4, i5}));
    }

    @SinceKotlin(version="1.4")
    @NotNull
    public static <T, R> i<R> C(@NotNull i<? extends T> i4, R r2, @NotNull kotlin.jvm.functions.p<? super R, ? super T, ? extends R> p4) {
        y.j(i4, (String)"<this>");
        y.j(p4, (String)"operation");
        return l.b(new kotlin.jvm.functions.p<k<? super R>, d<? super k0>, Object>(r2, i4, p4, null){
            Object l;
            Object m;
            int n;
            private Object o;
            final R p;
            final i<T> q;
            final kotlin.jvm.functions.p<R, T, R> r;
            {
                this.p = r2;
                this.q = i4;
                this.r = p4;
                super(2, d4);
            }

            @Override
            public final d<k0> create(Object object, d<?> p4) {
                p4 = new /* invalid duplicate definition of identical inner class */;
                p4.o = object;
                return p4;
            }

            @Override
            public final Object invoke(k<? super R> k2, d<? super k0> d4) {
                return (this.create(k2, d4)).invokeSuspend(k0.a);
            }

            /*
             * Unable to fully structure code
             * Could not resolve type clashes
             */
            @Override
            public final Object invokeSuspend(Object var1_1) {
                block7: {
                    var7_2 = kotlin.coroutines.intrinsics.b.f();
                    var2_3 = this.n;
                    if (var2_3 != 0) {
                        if (var2_3 != 1) {
                            if (var2_3 == 2) {
                                var5_4 = (Iterator)this.m;
                                var3_5 /* !! */  = this.l;
                                var4_6 /* !! */  = (k)this.o;
                                v.b((Object)var1_1);
                                var1_1 = var3_5 /* !! */ ;
                                while (true) {
                                    var6_7 = var1_1;
                                    var1_1 = var5_4;
                                    var3_5 /* !! */  = var4_6 /* !! */ ;
                                    var4_6 /* !! */  = var6_7;
                                    break block7;
                                    break;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        var3_5 /* !! */  = (k)this.o;
                        v.b((Object)var1_1);
                        var1_1 = var3_5 /* !! */ ;
                    } else {
                        v.b((Object)var1_1);
                        var3_5 /* !! */  = (k)this.o;
                        var4_6 /* !! */  = this.p;
                        this.o = var3_5 /* !! */ ;
                        this.n = 1;
                        var1_1 = var3_5 /* !! */ ;
                        if (var3_5 /* !! */ .a(var4_6 /* !! */ , (d)this) == var7_2) {
                            return var7_2;
                        }
                    }
                    var4_6 /* !! */  = this.p;
                    var5_4 = this.q.iterator();
                    var3_5 /* !! */  = var1_1;
                    var1_1 = var5_4;
                }
                if (var1_1.hasNext()) {
                    var5_4 = var1_1.next();
                    var6_7 = this.r.invoke(var4_6 /* !! */ , var5_4);
                    this.o = var3_5 /* !! */ ;
                    this.l = var6_7;
                    this.m = var1_1;
                    this.n = 2;
                    var5_4 = var1_1;
                    var1_1 = var6_7;
                    var4_6 /* !! */  = var3_5 /* !! */ ;
                    if (var3_5 /* !! */ .a(var6_7, (d)this) != var7_2) ** continue;
                    return var7_2;
                }
                return k0.a;
            }
        });
    }

    @NotNull
    public static <T> i<T> D(@NotNull i<? extends T> i4, @NotNull Comparator<? super T> comparator) {
        y.j(i4, (String)"<this>");
        y.j(comparator, (String)"comparator");
        return new i<T>(i4, comparator){
            final i<T> a;
            final Comparator<? super T> b;
            {
                this.a = i4;
                this.b = comparator;
            }

            public Iterator<T> iterator() {
                List list = q.I(this.a);
                kotlin.collections.t.D(list, this.b);
                return list.iterator();
            }
        };
    }

    @NotNull
    public static <T> i<T> E(@NotNull i<? extends T> object, int n4) {
        y.j(object, (String)"<this>");
        if (n4 >= 0) {
            object = n4 == 0 ? l.e() : (object instanceof kotlin.sequences.c ? ((kotlin.sequences.c)object).b(n4) : new s(object, n4));
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Requested element count ");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(" is less than zero.");
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @NotNull
    public static <T> i<T> F(@NotNull i<? extends T> i4, @NotNull kotlin.jvm.functions.l<? super T, Boolean> l4) {
        y.j(i4, (String)"<this>");
        y.j(l4, (String)"predicate");
        return new kotlin.sequences.t<T>(i4, l4);
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C G(@NotNull i<? extends T> object, @NotNull C c4) {
        y.j(object, (String)"<this>");
        y.j(c4, (String)"destination");
        object = object.iterator();
        while (object.hasNext()) {
            c4.add(object.next());
        }
        return c4;
    }

    @NotNull
    public static <T> List<T> H(@NotNull i<? extends T> object) {
        y.j(object, (String)"<this>");
        object = object.iterator();
        if (!object.hasNext()) {
            return kotlin.collections.t.m();
        }
        Object e4 = object.next();
        if (!object.hasNext()) {
            return kotlin.collections.t.e(e4);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(e4);
        while (object.hasNext()) {
            arrayList.add(object.next());
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> I(@NotNull i<? extends T> i4) {
        y.j(i4, (String)"<this>");
        return q.G(i4, new ArrayList());
    }

    @NotNull
    public static <T> Set<T> J(@NotNull i<? extends T> object) {
        y.j(object, (String)"<this>");
        Iterator iterator = object.iterator();
        if (!iterator.hasNext()) {
            return b1.f();
        }
        object = iterator.next();
        if (!iterator.hasNext()) {
            return b1.d(object);
        }
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<Object>();
        ((AbstractCollection)linkedHashSet).add(object);
        while (iterator.hasNext()) {
            ((AbstractCollection)linkedHashSet).add(iterator.next());
        }
        return linkedHashSet;
    }

    @NotNull
    public static <T, R> i<t<T, R>> K(@NotNull i<? extends T> i4, @NotNull i<? extends R> i5) {
        y.j(i4, (String)"<this>");
        y.j(i5, (String)"other");
        return new h(i4, i5, f.g);
    }

    @NotNull
    public static <T> Iterable<T> k(@NotNull i<? extends T> i4) {
        y.j(i4, (String)"<this>");
        return new Iterable<T>(i4){
            final i c;
            {
                this.c = i4;
            }

            @Override
            public Iterator<T> iterator() {
                return this.c.iterator();
            }
        };
    }

    public static <T> boolean l(@NotNull i<? extends T> i4, T t3) {
        y.j(i4, (String)"<this>");
        boolean bl = q.t(i4, t3) >= 0;
        return bl;
    }

    public static <T> int m(@NotNull i<? extends T> object) {
        y.j(object, (String)"<this>");
        object = object.iterator();
        int n4 = 0;
        while (object.hasNext()) {
            int n5;
            object.next();
            n4 = n5 = n4 + 1;
            if (n5 >= 0) continue;
            kotlin.collections.t.v();
            n4 = n5;
        }
        return n4;
    }

    @NotNull
    public static <T> i<T> n(@NotNull i<? extends T> object, int n4) {
        y.j(object, (String)"<this>");
        if (n4 >= 0) {
            if (n4 != 0) {
                object = object instanceof kotlin.sequences.c ? ((kotlin.sequences.c)object).a(n4) : new kotlin.sequences.b(object, n4);
            }
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Requested element count ");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(" is less than zero.");
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @NotNull
    public static <T> i<T> o(@NotNull i<? extends T> i4, @NotNull kotlin.jvm.functions.l<? super T, Boolean> l4) {
        y.j(i4, (String)"<this>");
        y.j(l4, (String)"predicate");
        return new e<T>(i4, true, l4);
    }

    @NotNull
    public static final <T> i<T> p(@NotNull i<? extends T> i4, @NotNull kotlin.jvm.functions.l<? super T, Boolean> l4) {
        y.j(i4, (String)"<this>");
        y.j(l4, (String)"predicate");
        return new e<T>(i4, false, l4);
    }

    @NotNull
    public static <T> i<T> q(@NotNull i<? extends T> i4) {
        y.j(i4, (String)"<this>");
        i4 = q.p(i4, b.g);
        y.h(i4, (String)"null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return i4;
    }

    @Nullable
    public static <T> T r(@NotNull i<? extends T> object) {
        y.j(object, (String)"<this>");
        object = object.iterator();
        if (!object.hasNext()) {
            return null;
        }
        return (T)object.next();
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version="1.4")
    @JvmName(name="flatMapIterable")
    @NotNull
    public static <T, R> i<R> s(@NotNull i<? extends T> i4, @NotNull kotlin.jvm.functions.l<? super T, ? extends Iterable<? extends R>> l4) {
        y.j(i4, (String)"<this>");
        y.j(l4, (String)"transform");
        return new kotlin.sequences.f(i4, l4, c.c);
    }

    public static final <T> int t(@NotNull i<? extends T> object, T t3) {
        y.j(object, (String)"<this>");
        object = object.iterator();
        int n4 = 0;
        while (object.hasNext()) {
            Object e4 = object.next();
            if (n4 < 0) {
                kotlin.collections.t.w();
            }
            if (y.e(t3, e4)) {
                return n4;
            }
            ++n4;
        }
        return -1;
    }

    @NotNull
    public static final <T, A extends Appendable> A u(@NotNull i<? extends T> object, @NotNull A a4, @NotNull CharSequence charSequence, @NotNull CharSequence object2, @NotNull CharSequence charSequence2, int n4, @NotNull CharSequence charSequence3, @Nullable kotlin.jvm.functions.l<? super T, ? extends CharSequence> l4) {
        int n5;
        y.j(object, (String)"<this>");
        y.j(a4, (String)"buffer");
        y.j((Object)charSequence, (String)"separator");
        y.j((Object)object2, (String)"prefix");
        y.j((Object)charSequence2, (String)"postfix");
        y.j((Object)charSequence3, (String)"truncated");
        a4.append((CharSequence)object2);
        object2 = object.iterator();
        int n6 = 0;
        while (true) {
            n5 = n6++;
            if (!object2.hasNext()) break;
            object = object2.next();
            if (n6 > 1) {
                a4.append(charSequence);
            }
            if (n4 >= 0) {
                n5 = n6;
                if (n6 > n4) break;
            }
            kotlin.text.p.a(a4, object, l4);
        }
        if (n4 >= 0 && n5 > n4) {
            a4.append(charSequence3);
        }
        a4.append(charSequence2);
        return a4;
    }

    @NotNull
    public static final <T> String v(@NotNull i<? extends T> object, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int n4, @NotNull CharSequence charSequence4, @Nullable kotlin.jvm.functions.l<? super T, ? extends CharSequence> l4) {
        y.j(object, (String)"<this>");
        y.j((Object)charSequence, (String)"separator");
        y.j((Object)charSequence2, (String)"prefix");
        y.j((Object)charSequence3, (String)"postfix");
        y.j((Object)charSequence4, (String)"truncated");
        object = q.u(object, new StringBuilder(), charSequence, charSequence2, charSequence3, n4, charSequence4, l4).toString();
        y.i(object, (String)"toString(...)");
        return object;
    }

    public static /* synthetic */ String w(i i4, CharSequence charSequence, CharSequence charSequence2, CharSequence object, int n4, CharSequence charSequence3, kotlin.jvm.functions.l l4, int n5, Object object2) {
        if ((n5 & 1) != 0) {
            charSequence = ", ";
        }
        object2 = "";
        if ((n5 & 2) != 0) {
            charSequence2 = "";
        }
        if ((n5 & 4) != 0) {
            object = object2;
        }
        if ((n5 & 8) != 0) {
            n4 = -1;
        }
        if ((n5 & 0x10) != 0) {
            charSequence3 = "...";
        }
        if ((n5 & 0x20) != 0) {
            l4 = null;
        }
        return q.v(i4, charSequence, charSequence2, (CharSequence)object, n4, charSequence3, l4);
    }

    public static <T> T x(@NotNull i<? extends T> object) {
        y.j(object, (String)"<this>");
        Iterator iterator = object.iterator();
        if (iterator.hasNext()) {
            object = iterator.next();
            while (iterator.hasNext()) {
                object = iterator.next();
            }
            return (T)object;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @NotNull
    public static <T, R> i<R> y(@NotNull i<? extends T> i4, @NotNull kotlin.jvm.functions.l<? super T, ? extends R> l4) {
        y.j(i4, (String)"<this>");
        y.j(l4, (String)"transform");
        return new u<T, R>(i4, l4);
    }

    @NotNull
    public static <T, R> i<R> z(@NotNull i<? extends T> i4, @NotNull kotlin.jvm.functions.l<? super T, ? extends R> l4) {
        y.j(i4, (String)"<this>");
        y.j(l4, (String)"transform");
        return l.q(new u<T, R>(i4, l4));
    }
}


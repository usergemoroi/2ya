/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.concurrent.futures.a
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$c
 *  kotlin.coroutines.jvm.internal.e
 *  kotlin.j
 *  kotlin.jvm.JvmName
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlinx.coroutines.b0
 *  kotlinx.coroutines.c0
 *  kotlinx.coroutines.d0
 *  kotlinx.coroutines.e0
 *  kotlinx.coroutines.e1
 *  kotlinx.coroutines.g2
 *  kotlinx.coroutines.i1
 *  kotlinx.coroutines.internal.d0
 *  kotlinx.coroutines.k3
 *  kotlinx.coroutines.o0
 *  kotlinx.coroutines.q
 *  kotlinx.coroutines.r
 *  kotlinx.coroutines.r2
 *  kotlinx.coroutines.u0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import androidx.concurrent.futures.a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.j;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.d;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.k3;
import kotlinx.coroutines.m;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.n;
import kotlinx.coroutines.o;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.q;
import kotlinx.coroutines.q2;
import kotlinx.coroutines.r;
import kotlinx.coroutines.r2;
import kotlinx.coroutines.s;
import kotlinx.coroutines.t;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001f\u0012\f\u0010w\u001a\b\u0012\u0004\u0012\u00028\u00000s\u0012\u0006\u0010&\u001a\u00020\u001f\u00a2\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u000f\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\u0013\u0010\tJ\u000f\u0010\u0014\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\u0014\u0010\tJ\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b!\u0010\"J\u0088\u0001\u0010/\u001a\u0004\u0018\u00010\u0018\"\u0004\b\u0001\u0010#2\u0006\u0010\u001c\u001a\u00020$2\u0006\u0010%\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u001f2M\u0010-\u001aI\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110+\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0010\u0018\u00010'2\b\u0010.\u001a\u0004\u0018\u00010\u0018H\u0002\u00a2\u0006\u0004\b/\u00100Jx\u00102\u001a\u0004\u0018\u000101\"\u0004\b\u0001\u0010#2\u0006\u0010%\u001a\u00028\u00012\b\u0010.\u001a\u0004\u0018\u00010\u00182M\u0010-\u001aI\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110+\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0010\u0018\u00010'H\u0002\u00a2\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u0002042\b\u0010%\u001a\u0004\u0018\u00010\u0018H\u0002\u00a2\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\b:\u0010\tJ\u0011\u0010;\u001a\u0004\u0018\u00010\u0018H\u0010\u00a2\u0006\u0004\b;\u0010<J!\u0010>\u001a\u00020\u00102\b\u0010=\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0010\u00a2\u0006\u0004\b>\u0010?J\u0019\u0010@\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\b@\u0010\rJ\u0017\u0010A\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0000\u00a2\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020C2\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\bD\u0010EJp\u0010F\u001a\u00020\u0010\"\u0004\b\u0001\u0010#2K\u0010-\u001aG\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110+\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00100'2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010*\u001a\u00028\u0001\u00a2\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020HH\u0016\u00a2\u0006\u0004\bJ\u0010KJ\u0011\u0010L\u001a\u0004\u0018\u00010\u0018H\u0001\u00a2\u0006\u0004\bL\u0010<J\u000f\u0010M\u001a\u00020\u0010H\u0000\u00a2\u0006\u0004\bM\u00108J\u001d\u0010P\u001a\u00020\u00102\f\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000NH\u0016\u00a2\u0006\u0004\bP\u0010\u001bJ<\u0010R\u001a\u00020\u00102\u0006\u0010*\u001a\u00028\u00002#\u0010-\u001a\u001f\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010QH\u0016\u00a2\u0006\u0004\bR\u0010SJp\u0010T\u001a\u00020\u0010\"\b\b\u0001\u0010#*\u00028\u00002\u0006\u0010*\u001a\u00028\u00012M\u0010-\u001aI\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110+\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0010\u0018\u00010'H\u0016\u00a2\u0006\u0004\bT\u0010UJ#\u0010W\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010V\u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\bW\u0010XJ8\u0010Z\u001a\u00020\u00102'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\n\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00100Qj\u0002`YH\u0016\u00a2\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020CH\u0000\u00a2\u0006\u0004\b\\\u0010]Jv\u0010^\u001a\u00020\u0010\"\u0004\b\u0001\u0010#2\u0006\u0010%\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u001f2O\b\u0002\u0010-\u001aI\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110+\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0010\u0018\u00010'H\u0000\u00a2\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u0010H\u0000\u00a2\u0006\u0004\b`\u00108J|\u0010a\u001a\u0004\u0018\u00010\u0018\"\b\b\u0001\u0010#*\u00028\u00002\u0006\u0010*\u001a\u00028\u00012\b\u0010.\u001a\u0004\u0018\u00010\u00182M\u0010-\u001aI\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110+\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0010\u0018\u00010'H\u0016\u00a2\u0006\u0004\ba\u0010bJ\u0019\u0010d\u001a\u0004\u0018\u00010\u00182\u0006\u0010c\u001a\u00020\nH\u0016\u00a2\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020\u00102\u0006\u0010f\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\bg\u0010\u001bJ\u001b\u0010i\u001a\u00020\u0010*\u00020h2\u0006\u0010*\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\bi\u0010jJ\u001f\u0010k\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018H\u0010\u00a2\u0006\u0004\bk\u0010lJ\u001b\u0010m\u001a\u0004\u0018\u00010\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018H\u0010\u00a2\u0006\u0004\bm\u0010nJ\u000f\u0010p\u001a\u00020oH\u0016\u00a2\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020oH\u0014\u00a2\u0006\u0004\br\u0010qR \u0010w\u001a\b\u0012\u0004\u0012\u00028\u00000s8\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\bk\u0010t\u001a\u0004\bu\u0010vR\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u0016\u0010}\u001a\u0004\u0018\u00010\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b|\u0010\u0017R\u0014\u0010\u007f\u001a\u00020o8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b~\u0010qR\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00188@X\u0080\u0004\u00a2\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010<R\u0016\u0010\u0081\u0001\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\tR\u0016\u0010\u0083\u0001\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\tR\u001f\u0010\u0086\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004\u00a2\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\r\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004R\u0015\u0010\u008a\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0089\u00018\u0002X\u0082\u0004R\u0015\u0010\u008b\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0089\u00018\u0002X\u0082\u0004\u00a8\u0006\u008e\u0001"}, d2={"Lkotlinx/coroutines/p;", "T", "Lkotlinx/coroutines/d1;", "Lkotlinx/coroutines/n;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/k3;", "", "L", "()Z", "", "cause", "q", "(Ljava/lang/Throwable;)Z", "Lkotlinx/coroutines/internal/a0;", "segment", "Lkotlin/k0;", "o", "(Lkotlinx/coroutines/internal/a0;Ljava/lang/Throwable;)V", "X", "V", "Lkotlinx/coroutines/i1;", "I", "()Lkotlinx/coroutines/i1;", "", "handler", "J", "(Ljava/lang/Object;)V", "state", "M", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "mode", "v", "(I)V", "R", "Lkotlinx/coroutines/r2;", "proposedUpdate", "resumeMode", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/g;", "context", "onCancellation", "idempotent", "U", "(Lkotlinx/coroutines/r2;Ljava/lang/Object;ILkotlin/jvm/functions/q;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/d0;", "W", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/q;)Lkotlinx/coroutines/internal/d0;", "", "l", "(Ljava/lang/Object;)Ljava/lang/Void;", "s", "()V", "H", "Q", "j", "()Ljava/lang/Object;", "takenState", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "b", "O", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/m;", "m", "(Lkotlinx/coroutines/m;Ljava/lang/Throwable;)V", "n", "(Lkotlin/jvm/functions/q;Ljava/lang/Throwable;Ljava/lang/Object;)V", "Lkotlinx/coroutines/d2;", "parent", "w", "(Lkotlinx/coroutines/d2;)Ljava/lang/Throwable;", "z", "P", "Lkotlin/u;", "result", "resumeWith", "Lkotlin/Function1;", "i", "(Ljava/lang/Object;Lkotlin/jvm/functions/l;)V", "p", "(Ljava/lang/Object;Lkotlin/jvm/functions/q;)V", "index", "c", "(Lkotlinx/coroutines/internal/a0;I)V", "Lkotlinx/coroutines/CompletionHandler;", "u", "(Lkotlin/jvm/functions/l;)V", "K", "(Lkotlinx/coroutines/m;)V", "S", "(Ljava/lang/Object;ILkotlin/jvm/functions/q;)V", "r", "G", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/q;)Ljava/lang/Object;", "exception", "x", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "t", "Lkotlinx/coroutines/m0;", "E", "(Lkotlinx/coroutines/m0;Ljava/lang/Object;)V", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "N", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/d;", "d", "()Lkotlin/coroutines/d;", "delegate", "g", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "y", "parentHandle", "B", "stateDebugRepresentation", "A", "isActive", "h", "isCompleted", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "_state", "_parentHandle", "<init>", "(Lkotlin/coroutines/d;I)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@PublishedApi
@SourceDebugExtension(value={"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,701:1\n227#1,10:705\n227#1,10:716\n1#2:702\n20#3:703\n20#3:704\n18#3:715\n17#3:726\n18#3,3:727\n17#3:730\n18#3,3:731\n18#3:738\n17#3,4:739\n57#4,2:734\n57#4,2:736\n57#4,2:743\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n239#1:705,10\n244#1:716,10\n69#1:703\n155#1:704\n242#1:715\n271#1:726\n272#1:727,3\n281#1:730\n282#1:731,3\n387#1:738\n390#1:739,4\n323#1:734,2\n333#1:736,2\n614#1:743,2\n*E\n"})
public class p<T>
extends d1<T>
implements n<T>,
e,
k3 {
    private static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(p.class, "_decisionAndIndex$volatile");
    private static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state$volatile");
    private static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_parentHandle$volatile");
    private volatile int _decisionAndIndex$volatile;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;
    @NotNull
    private final kotlin.coroutines.d<T> f;
    @NotNull
    private final g g;

    public p(@NotNull kotlin.coroutines.d<? super T> d4, int n4) {
        super(n4);
        this.f = d4;
        this.g = d4.getContext();
        this._decisionAndIndex$volatile = 0x1FFFFFFF;
        this._state$volatile = d.c;
    }

    private final String B() {
        Object object = this.A();
        object = object instanceof r2 ? "Active" : (object instanceof s ? "Cancelled" : "Completed");
        return object;
    }

    private final i1 I() {
        d2 d22 = (d2)this.getContext().get((g.c)d2.C8);
        if (d22 == null) {
            return null;
        }
        d22 = g2.o((d2)d22, (boolean)false, (i2)new t(this), (int)1, null);
        a.a((AtomicReferenceFieldUpdater)p.j, (Object)this, null, (Object)d22);
        return d22;
    }

    private final void J(Object object) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p.i;
        while (true) {
            Object object2;
            if ((object2 = atomicReferenceFieldUpdater.get(this)) instanceof d) {
                if (!a.a((AtomicReferenceFieldUpdater)p.i, (Object)this, object2, (Object)object)) continue;
                return;
            }
            if (!(object2 instanceof m) && !(object2 instanceof a0)) {
                b0 b02;
                boolean bl = object2 instanceof c0;
                if (bl) {
                    atomicReferenceFieldUpdater = (c0)object2;
                    if (!atomicReferenceFieldUpdater.c()) {
                        this.M(object, object2);
                    }
                    if (object2 instanceof s) {
                        object2 = null;
                        if (!bl) {
                            atomicReferenceFieldUpdater = null;
                        }
                        if (atomicReferenceFieldUpdater != null) {
                            object2 = ((c0)atomicReferenceFieldUpdater).a;
                        }
                        if (object instanceof m) {
                            this.m((m)object, (Throwable)object2);
                        } else {
                            y.h((Object)object, (String)"null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            this.o((a0)((Object)object), (Throwable)object2);
                        }
                    }
                    return;
                }
                if (object2 instanceof b0) {
                    b02 = (b0)object2;
                    if (b02.b != null) {
                        this.M(object, object2);
                    }
                    if (object instanceof a0) {
                        return;
                    }
                    y.h((Object)object, (String)"null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    m m4 = (m)object;
                    if (b02.c()) {
                        this.m(m4, b02.e);
                        return;
                    }
                    b02 = b0.b((b0)b02, null, (m)m4, null, null, null, (int)29, null);
                    if (!a.a((AtomicReferenceFieldUpdater)p.i, (Object)this, object2, (Object)b02)) continue;
                    return;
                }
                if (object instanceof a0) {
                    return;
                }
                y.h((Object)object, (String)"null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                b02 = new b0(object2, (m)object, null, null, null, 28, null);
                if (!a.a((AtomicReferenceFieldUpdater)p.i, (Object)this, object2, (Object)b02)) continue;
                return;
            }
            this.M(object, object2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean L() {
        if (!e1.c((int)this.e)) return false;
        kotlin.coroutines.d<T> d4 = this.f;
        y.h(d4, (String)"null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        if (!((h)d4).q()) return false;
        return true;
    }

    private final void M(Object object, Object object2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("It's prohibited to register multiple handlers, tried to register ");
        stringBuilder.append(object);
        stringBuilder.append(", already has ");
        stringBuilder.append(object2);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private static final k0 R(l l4, Throwable throwable, Object object, g g4) {
        l4.invoke(throwable);
        return k0.a;
    }

    public static /* synthetic */ void T(p p4, Object object, int n4, kotlin.jvm.functions.q q4, int n5, Object object2) {
        if (object2 == null) {
            if ((n5 & 4) != 0) {
                q4 = null;
            }
            p4.S(object, n4, q4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final <R> Object U(r2 r22, R r4, int n4, kotlin.jvm.functions.q<? super Throwable, ? super R, ? super g, k0> q4, Object object) {
        Object object2;
        block4: {
            block6: {
                block5: {
                    block3: {
                        if (!(r4 instanceof c0)) break block3;
                        object2 = r4;
                        break block4;
                    }
                    if (e1.b((int)n4) || object != null) break block5;
                    object2 = r4;
                    break block4;
                }
                if (q4 != null || r22 instanceof m) break block6;
                object2 = r4;
                if (object == null) break block4;
            }
            r22 = r22 instanceof m ? (m)r22 : null;
            object2 = new b0(r4, (m)r22, q4, object, null, 16, null);
        }
        return object2;
    }

    private final boolean V() {
        int n4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = p.h;
        do {
            int n5;
            if ((n5 = (n4 = atomicIntegerFieldUpdater.get(this)) >> 29) == 0) continue;
            if (n5 == 1) {
                return false;
            }
            throw new IllegalStateException("Already resumed".toString());
        } while (!p.h.compareAndSet(this, n4, 0x40000000 + (0x1FFFFFFF & n4)));
        return true;
    }

    private final <R> kotlinx.coroutines.internal.d0 W(R object, Object object2, kotlin.jvm.functions.q<? super Throwable, ? super R, ? super g, k0> q4) {
        Object v3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p.i;
        while ((v3 = atomicReferenceFieldUpdater.get(this)) instanceof r2) {
            Object object3 = this.U((r2)v3, object, this.e, q4, object2);
            if (!a.a((AtomicReferenceFieldUpdater)p.i, (Object)this, v3, (Object)object3)) continue;
            this.s();
            return q.a;
        }
        boolean bl = v3 instanceof b0;
        q4 = null;
        object = q4;
        if (bl) {
            object = q4;
            if (object2 != null) {
                object = q4;
                if (((b0)v3).d == object2) {
                    object = q.a;
                }
            }
        }
        return object;
    }

    private final boolean X() {
        int n4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = p.h;
        do {
            int n5;
            if ((n5 = (n4 = atomicIntegerFieldUpdater.get(this)) >> 29) == 0) continue;
            if (n5 == 2) {
                return false;
            }
            throw new IllegalStateException("Already suspended".toString());
        } while (!p.h.compareAndSet(this, n4, 0x20000000 + (0x1FFFFFFF & n4)));
        return true;
    }

    public static /* synthetic */ k0 k(l l4, Throwable throwable, Object object, g g4) {
        return p.R(l4, throwable, object, g4);
    }

    private final Void l(Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Already resumed, but proposed with update ");
        stringBuilder.append(object);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private final void o(a0<?> a02, Throwable serializable) {
        int n4 = p.h.get(this) & 0x1FFFFFFF;
        if (n4 != 0x1FFFFFFF) {
            try {
                a02.s(n4, (Throwable)serializable, this.getContext());
            }
            catch (Throwable throwable) {
                g g4 = this.getContext();
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append("Exception in invokeOnCancellation handler for ");
                ((StringBuilder)serializable).append(this);
                o0.a((g)g4, (Throwable)new d0(((StringBuilder)serializable).toString(), throwable));
            }
            return;
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    private final boolean q(Throwable throwable) {
        if (!this.L()) {
            return false;
        }
        kotlin.coroutines.d<T> d4 = this.f;
        y.h(d4, (String)"null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((h)d4).r(throwable);
    }

    private final void s() {
        if (!this.L()) {
            this.r();
        }
    }

    private final void v(int n4) {
        if (this.V()) {
            return;
        }
        e1.a((d1)this, (int)n4);
    }

    private final i1 y() {
        return (i1)p.j.get(this);
    }

    @Nullable
    public final Object A() {
        return p.i.get(this);
    }

    @Override
    public void E(@NotNull m0 m02, T t3) {
        h h4 = this.f;
        boolean bl = h4 instanceof h;
        m0 m03 = null;
        h4 = bl ? (h)h4 : null;
        if (h4 != null) {
            m03 = h4.f;
        }
        int n4 = m03 == m02 ? 4 : this.e;
        p.T(this, t3, n4, null, 4, null);
    }

    @Override
    @Nullable
    public <R extends T> Object G(R r4, @Nullable Object object, @Nullable kotlin.jvm.functions.q<? super Throwable, ? super R, ? super g, k0> q4) {
        return this.W(r4, object, q4);
    }

    public void H() {
        i1 i12 = this.I();
        if (i12 == null) {
            return;
        }
        if (this.h()) {
            i12.dispose();
            p.j.set(this, q2.c);
        }
    }

    public final void K(@NotNull m m4) {
        this.J(m4);
    }

    @NotNull
    protected String N() {
        return "CancellableContinuation";
    }

    public final void O(@NotNull Throwable throwable) {
        if (this.q(throwable)) {
            return;
        }
        this.b(throwable);
        this.s();
    }

    public final void P() {
        Object object = this.f;
        object = object instanceof h ? (h)((Object)object) : null;
        if (object != null && (object = object.v(this)) != null) {
            this.r();
            this.b((Throwable)object);
        }
    }

    @JvmName(name="resetStateReusable")
    public final boolean Q() {
        Object v3 = p.i.get(this);
        if (v3 instanceof b0 && ((b0)v3).d != null) {
            this.r();
            return false;
        }
        p.h.set(this, 0x1FFFFFFF);
        p.i.set(this, d.c);
        return true;
    }

    public final <R> void S(R r4, int n4, @Nullable kotlin.jvm.functions.q<? super Throwable, ? super R, ? super g, k0> q4) {
        Object object;
        Object v3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p.i;
        while ((v3 = atomicReferenceFieldUpdater.get(this)) instanceof r2) {
            object = this.U((r2)v3, r4, n4, q4, null);
            if (!a.a((AtomicReferenceFieldUpdater)p.i, (Object)this, v3, (Object)object)) continue;
            this.s();
            this.v(n4);
            return;
        }
        if (v3 instanceof s && (object = (s)((Object)v3)).e()) {
            if (q4 != null) {
                this.n(q4, object.a, r4);
            }
            return;
        }
        this.l(r4);
        throw new j();
    }

    @Override
    public void a(@Nullable Object object, @NotNull Throwable throwable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p.i;
        while (!((object = atomicReferenceFieldUpdater.get(this)) instanceof r2)) {
            if (object instanceof c0) {
                return;
            }
            if (object instanceof b0) {
                b0 b02 = (b0)object;
                if (b02.c() ^ true) {
                    b0 b03 = b0.b((b0)b02, null, null, null, null, (Throwable)throwable, (int)15, null);
                    if (!a.a((AtomicReferenceFieldUpdater)p.i, (Object)this, (Object)object, (Object)b03)) continue;
                    b02.d(this, throwable);
                    return;
                }
                throw new IllegalStateException("Must be called at most once".toString());
            }
            if (!a.a((AtomicReferenceFieldUpdater)p.i, (Object)this, (Object)object, (Object)new b0(object, null, null, null, throwable, 14, null))) continue;
            return;
        }
        throw new IllegalStateException("Not completed".toString());
    }

    @Override
    public boolean b(@Nullable Throwable throwable) {
        s s3;
        Object v3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p.i;
        do {
            v3 = atomicReferenceFieldUpdater.get(this);
            boolean bl = v3 instanceof r2;
            boolean bl2 = false;
            if (!bl) {
                return false;
            }
            if (v3 instanceof m || v3 instanceof a0) {
                bl2 = true;
            }
            s3 = new s(this, throwable, bl2);
        } while (!a.a((AtomicReferenceFieldUpdater)p.i, (Object)this, v3, (Object)((Object)s3)));
        s3 = (r2)v3;
        if (s3 instanceof m) {
            this.m((m)v3, throwable);
        } else if (s3 instanceof a0) {
            this.o((a0)((Object)v3), throwable);
        }
        this.s();
        this.v(this.e);
        return true;
    }

    public void c(@NotNull a0<?> a02, int n4) {
        int n5;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = p.h;
        while (((n5 = atomicIntegerFieldUpdater.get(this)) & 0x1FFFFFFF) == 0x1FFFFFFF) {
            if (!atomicIntegerFieldUpdater.compareAndSet(this, n5, (n5 >> 29 << 29) + n4)) continue;
            this.J(a02);
            return;
        }
        throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
    }

    @Override
    @NotNull
    public final kotlin.coroutines.d<T> d() {
        return this.f;
    }

    @Override
    @Nullable
    public Throwable e(@Nullable Object object) {
        if ((object = super.e(object)) == null) {
            object = null;
        }
        return object;
    }

    @Override
    public <T> T f(@Nullable Object object) {
        Object object2 = object;
        if (object instanceof b0) {
            object2 = ((b0)object).a;
        }
        return (T)object2;
    }

    @Nullable
    public e getCallerFrame() {
        Object object = this.f;
        object = object instanceof e ? (e)object : null;
        return object;
    }

    @NotNull
    public g getContext() {
        return this.g;
    }

    @Override
    public boolean h() {
        return this.A() instanceof r2 ^ true;
    }

    @Override
    public void i(T t3, @Nullable l<? super Throwable, k0> object) {
        int n4 = this.e;
        object = object != null ? new o((l)object) : null;
        this.S((Object)t3, n4, (kotlin.jvm.functions.q)object);
    }

    @Override
    public boolean isActive() {
        return this.A() instanceof r2;
    }

    @Override
    @Nullable
    public Object j() {
        return this.A();
    }

    public final void m(@NotNull m object, @Nullable Throwable throwable) {
        try {
            object.b(throwable);
        }
        catch (Throwable throwable2) {
            g g4 = this.getContext();
            object = new StringBuilder();
            ((StringBuilder)object).append("Exception in invokeOnCancellation handler for ");
            ((StringBuilder)object).append(this);
            o0.a((g)g4, (Throwable)new d0(((StringBuilder)object).toString(), throwable2));
        }
    }

    public final <R> void n(@NotNull kotlin.jvm.functions.q<? super Throwable, ? super R, ? super g, k0> g4, @NotNull Throwable serializable, R r4) {
        try {
            g4.invoke(serializable, r4, this.getContext());
        }
        catch (Throwable throwable) {
            g4 = this.getContext();
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("Exception in resume onCancellation handler for ");
            ((StringBuilder)serializable).append(this);
            o0.a((g)g4, (Throwable)new d0(((StringBuilder)serializable).toString(), throwable));
        }
    }

    @Override
    public <R extends T> void p(R r4, @Nullable kotlin.jvm.functions.q<? super Throwable, ? super R, ? super g, k0> q4) {
        this.S(r4, this.e, q4);
    }

    public final void r() {
        i1 i12 = this.y();
        if (i12 == null) {
            return;
        }
        i12.dispose();
        p.j.set(this, q2.c);
    }

    public void resumeWith(@NotNull Object object) {
        p.T(this, e0.c((Object)object, (n)this), this.e, null, 4, null);
    }

    @Override
    public void t(@NotNull Object object) {
        this.v(this.e);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.N());
        stringBuilder.append('(');
        stringBuilder.append(u0.c(this.f));
        stringBuilder.append("){");
        stringBuilder.append(this.B());
        stringBuilder.append("}@");
        stringBuilder.append(u0.b((Object)this));
        return stringBuilder.toString();
    }

    @Override
    public void u(@NotNull l<? super Throwable, k0> l4) {
        r.c((n)this, (m)new m.a(l4));
    }

    @NotNull
    public Throwable w(@NotNull d2 d22) {
        return d22.y();
    }

    @Override
    @Nullable
    public Object x(@NotNull Throwable throwable) {
        return this.W(new c0(throwable, false, 2, null), null, null);
    }

    @PublishedApi
    @Nullable
    public final Object z() {
        Object object;
        boolean bl = this.L();
        if (this.X()) {
            if (this.y() == null) {
                this.I();
            }
            if (bl) {
                this.P();
            }
            return b.f();
        }
        if (bl) {
            this.P();
        }
        if (!((object = this.A()) instanceof c0)) {
            Object object2;
            if (e1.b((int)this.e) && (object2 = (d2)this.getContext().get((g.c)d2.C8)) != null && !object2.isActive()) {
                object2 = object2.y();
                this.a(object, (Throwable)object2);
                throw object2;
            }
            return this.f(object);
        }
        throw ((c0)object).a;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.concurrent.futures.a
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$c
 *  kotlin.coroutines.jvm.internal.g
 *  kotlin.e
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.a1
 *  kotlin.jvm.internal.u0
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.sequences.i
 *  kotlin.sequences.k
 *  kotlin.v
 *  kotlinx.coroutines.InternalCoroutinesApi
 *  kotlinx.coroutines.c0
 *  kotlinx.coroutines.d0
 *  kotlinx.coroutines.d2$a
 *  kotlinx.coroutines.g2
 *  kotlinx.coroutines.i1
 *  kotlinx.coroutines.internal.d0
 *  kotlinx.coroutines.internal.o
 *  kotlinx.coroutines.k2
 *  kotlinx.coroutines.r
 *  kotlinx.coroutines.selects.l
 *  kotlinx.coroutines.u0
 *  kotlinx.coroutines.y1
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.a1;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.sequences.k;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.e3;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.internal.n;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.o2;
import kotlinx.coroutines.p;
import kotlinx.coroutines.q2;
import kotlinx.coroutines.r;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.selects.f;
import kotlinx.coroutines.selects.l;
import kotlinx.coroutines.t2;
import kotlinx.coroutines.u;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.u2;
import kotlinx.coroutines.v;
import kotlinx.coroutines.w;
import kotlinx.coroutines.x1;
import kotlinx.coroutines.y1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(level=kotlin.e.d, message="This is internal API and may be removed in the future releases")
@Metadata(d1={"\u0000\u00d4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\tw\u00bd\u0001\u00be\u0001\u00bf\u0001\u00ab\u0001B\u0012\u0012\u0007\u0010\u00ba\u0001\u001a\u00020\u0015\u00a2\u0006\u0006\b\u00bb\u0001\u0010\u00bc\u0001J#\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u0010*\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\b!\u0010\u001eJ\u0019\u0010#\u001a\u00020\"2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020%H\u0002\u00a2\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020(H\u0002\u00a2\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\b-\u0010.J%\u00102\u001a\u00020\u00102\n\u00100\u001a\u0006\u0012\u0002\b\u00030/2\b\u00101\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b4\u00105J\u0019\u00106\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b6\u00107J\u001b\u00108\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b8\u00105J\u0019\u00109\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b;\u0010<J%\u0010=\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b=\u0010>J#\u0010?\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b?\u0010@J*\u0010C\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010B\u001a\u00020A2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082\u0010\u00a2\u0006\u0004\bC\u0010DJ)\u0010F\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010E\u001a\u00020A2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u0004\u0018\u00010A*\u00020HH\u0002\u00a2\u0006\u0004\bI\u0010JJ\u0019\u0010L\u001a\u00020K2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0006H\u0082@\u00a2\u0006\u0004\bN\u0010.J%\u0010O\u001a\u00020\u00102\n\u00100\u001a\u0006\u0012\u0002\b\u00030/2\b\u00101\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\bO\u00103J%\u0010Q\u001a\u0004\u0018\u00010\u00062\b\u00101\u001a\u0004\u0018\u00010\u00062\b\u0010P\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\bQ\u0010>J\u0019\u0010S\u001a\u00020\u00102\b\u0010R\u001a\u0004\u0018\u00010\u0001H\u0004\u00a2\u0006\u0004\bS\u0010TJ\r\u0010U\u001a\u00020\u0015\u00a2\u0006\u0004\bU\u0010,J\u000f\u0010V\u001a\u00020\u0010H\u0014\u00a2\u0006\u0004\bV\u0010WJ\u0011\u0010Z\u001a\u00060Xj\u0002`Y\u00a2\u0006\u0004\bZ\u0010[J#\u0010]\u001a\u00060Xj\u0002`Y*\u00020\u000b2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010KH\u0004\u00a2\u0006\u0004\b]\u0010^J6\u0010e\u001a\u00020d2'\u0010c\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b\u00a2\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00100_j\u0002`b\u00a2\u0006\u0004\be\u0010fJF\u0010i\u001a\u00020d2\u0006\u0010g\u001a\u00020\u00152\u0006\u0010h\u001a\u00020\u00152'\u0010c\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b\u00a2\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00100_j\u0002`b\u00a2\u0006\u0004\bi\u0010jJ\u001f\u0010l\u001a\u00020d2\u0006\u0010h\u001a\u00020\u00152\u0006\u0010k\u001a\u00020(H\u0000\u00a2\u0006\u0004\bl\u0010mJ\u0010\u0010n\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0004\bn\u0010.J\u0017\u0010o\u001a\u00020\u00102\u0006\u0010k\u001a\u00020(H\u0000\u00a2\u0006\u0004\bo\u0010*J\u001f\u0010p\u001a\u00020\u00102\u000e\u0010\u001c\u001a\n\u0018\u00010Xj\u0004\u0018\u0001`YH\u0016\u00a2\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020KH\u0014\u00a2\u0006\u0004\br\u0010sJ\u0017\u0010t\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\bt\u0010uJ\u0015\u0010w\u001a\u00020\u00102\u0006\u0010v\u001a\u00020\u0003\u00a2\u0006\u0004\bw\u0010xJ\u0017\u0010y\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\by\u0010 J\u0017\u0010z\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\bz\u0010 J\u0019\u0010{\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0004\b{\u0010|J\u0013\u0010}\u001a\u00060Xj\u0002`YH\u0016\u00a2\u0006\u0004\b}\u0010[J\u0019\u0010~\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0004\b~\u0010|J\u001b\u0010\u007f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0004\b\u007f\u00105J\u0019\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0006\u0010B\u001a\u00020\u0002\u00a2\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001a\u0010\u0084\u0001\u001a\u00020\u00102\u0007\u0010\u0083\u0001\u001a\u00020\u000bH\u0010\u00a2\u0006\u0005\b\u0084\u0001\u0010uJ\u001b\u0010\u0085\u0001\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0014\u00a2\u0006\u0005\b\u0085\u0001\u0010uJ\u001a\u0010\u0086\u0001\u001a\u00020\u00152\u0007\u0010\u0083\u0001\u001a\u00020\u000bH\u0014\u00a2\u0006\u0005\b\u0086\u0001\u0010 J\u001c\u0010\u0087\u0001\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a2\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001c\u0010\u0089\u0001\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a2\u0006\u0006\b\u0089\u0001\u0010\u0088\u0001J\u0011\u0010\u008a\u0001\u001a\u00020KH\u0016\u00a2\u0006\u0005\b\u008a\u0001\u0010sJ\u0011\u0010\u008b\u0001\u001a\u00020KH\u0007\u00a2\u0006\u0005\b\u008b\u0001\u0010sJ\u0011\u0010\u008c\u0001\u001a\u00020KH\u0010\u00a2\u0006\u0005\b\u008c\u0001\u0010sJ\u0014\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0014\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0006H\u0084@\u00a2\u0006\u0005\b\u008f\u0001\u0010.R\u001e\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u00068BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\b\u0090\u0001\u00107R\u0019\u0010\u0095\u0001\u001a\u0007\u0012\u0002\b\u00030\u0092\u00018F\u00a2\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R0\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0080\u00012\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0080\u00018@@@X\u0080\u000e\u00a2\u0006\u0010\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010R\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004\u00a2\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068@X\u0080\u0004\u00a2\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u008e\u0001R\u0016\u0010\u009f\u0001\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010,R\u0013\u0010\u00a1\u0001\u001a\u00020\u00158F\u00a2\u0006\u0007\u001a\u0005\b\u00a0\u0001\u0010,R\u0013\u0010\u00a2\u0001\u001a\u00020\u00158F\u00a2\u0006\u0007\u001a\u0005\b\u00a2\u0001\u0010,R\u001c\u0010\u00a7\u0001\u001a\u00030\u00a3\u00018F\u00a2\u0006\u000f\u0012\u0005\b\u00a6\u0001\u0010W\u001a\u0006\b\u00a4\u0001\u0010\u00a5\u0001R\u0016\u0010\u00a9\u0001\u001a\u00020\u00158PX\u0090\u0004\u00a2\u0006\u0007\u001a\u0005\b\u00a8\u0001\u0010,R\u001b\u0010\u00ad\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010\u00aa\u00018F\u00a2\u0006\b\u001a\u0006\b\u00ab\u0001\u0010\u00ac\u0001R\u0016\u0010\u00af\u0001\u001a\u00020\u00158TX\u0094\u0004\u00a2\u0006\u0007\u001a\u0005\b\u00ae\u0001\u0010,R\u0016\u0010\u00b1\u0001\u001a\u00020\u00158PX\u0090\u0004\u00a2\u0006\u0007\u001a\u0005\b\u00b0\u0001\u0010,R#\u0010\u00b6\u0001\u001a\u0007\u0012\u0002\b\u00030\u00b2\u00018DX\u0084\u0004\u00a2\u0006\u000f\u0012\u0005\b\u00b5\u0001\u0010W\u001a\u0006\b\u00b3\u0001\u0010\u00b4\u0001R\u0015\u0010\u00b8\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00b7\u00018\u0002X\u0082\u0004R\u0016\u0010\u00b9\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u00010\u00b7\u00018\u0002X\u0082\u0004\u00a8\u0006\u00c0\u0001"}, d2={"Lkotlinx/coroutines/j2;", "Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/w;", "Lkotlinx/coroutines/s2;", "Lkotlinx/coroutines/j2$c;", "state", "", "proposedUpdate", "d0", "(Lkotlinx/coroutines/j2$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "g0", "(Lkotlinx/coroutines/j2$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "Lkotlin/k0;", "O", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lkotlinx/coroutines/y1;", "update", "", "T0", "(Lkotlinx/coroutines/y1;Ljava/lang/Object;)Z", "a0", "(Lkotlinx/coroutines/y1;Ljava/lang/Object;)V", "Lkotlinx/coroutines/o2;", "list", "cause", "C0", "(Lkotlinx/coroutines/o2;Ljava/lang/Throwable;)V", "X", "(Ljava/lang/Throwable;)Z", "D0", "", "O0", "(Ljava/lang/Object;)I", "Lkotlinx/coroutines/l1;", "J0", "(Lkotlinx/coroutines/l1;)V", "Lkotlinx/coroutines/i2;", "K0", "(Lkotlinx/coroutines/i2;)V", "v0", "()Z", "w0", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/l;", "select", "ignoredParam", "L0", "(Lkotlinx/coroutines/selects/l;Ljava/lang/Object;)V", "W", "(Ljava/lang/Object;)Ljava/lang/Object;", "c0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "x0", "k0", "(Lkotlinx/coroutines/y1;)Lkotlinx/coroutines/o2;", "U0", "(Lkotlinx/coroutines/y1;Ljava/lang/Throwable;)Z", "V0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "W0", "(Lkotlinx/coroutines/y1;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/v;", "child", "X0", "(Lkotlinx/coroutines/j2$c;Lkotlinx/coroutines/v;Ljava/lang/Object;)Z", "lastChild", "b0", "(Lkotlinx/coroutines/j2$c;Lkotlinx/coroutines/v;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/o;", "B0", "(Lkotlinx/coroutines/internal/o;)Lkotlinx/coroutines/v;", "", "P0", "(Ljava/lang/Object;)Ljava/lang/String;", "S", "F0", "result", "E0", "parent", "s0", "(Lkotlinx/coroutines/d2;)V", "start", "I0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "y", "()Ljava/util/concurrent/CancellationException;", "message", "Q0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/i1;", "f", "(Lkotlin/jvm/functions/l;)Lkotlinx/coroutines/i1;", "onCancelling", "invokeImmediately", "w", "(ZZLkotlin/jvm/functions/l;)Lkotlinx/coroutines/i1;", "node", "t0", "(ZLkotlinx/coroutines/i2;)Lkotlinx/coroutines/i1;", "C", "M0", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "Y", "()Ljava/lang/String;", "V", "(Ljava/lang/Throwable;)V", "parentJob", "e", "(Lkotlinx/coroutines/s2;)V", "Z", "T", "U", "(Ljava/lang/Object;)Z", "z", "y0", "z0", "Lkotlinx/coroutines/u;", "s", "(Lkotlinx/coroutines/w;)Lkotlinx/coroutines/u;", "exception", "r0", "G0", "q0", "H0", "(Ljava/lang/Object;)V", "P", "toString", "S0", "A0", "e0", "()Ljava/lang/Object;", "R", "f0", "exceptionOrNull", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "key", "value", "m0", "()Lkotlinx/coroutines/u;", "N0", "(Lkotlinx/coroutines/u;)V", "parentHandle", "l0", "()Lkotlinx/coroutines/d2;", "n0", "isActive", "h", "isCompleted", "isCancelled", "Lkotlinx/coroutines/selects/d;", "r", "()Lkotlinx/coroutines/selects/d;", "getOnJoin$annotations", "onJoin", "j0", "onCancelComplete", "Lkotlin/sequences/i;", "d", "()Lkotlin/sequences/i;", "children", "u0", "isScopedCoroutine", "h0", "handlesException", "Lkotlinx/coroutines/selects/f;", "i0", "()Lkotlinx/coroutines/selects/f;", "getOnAwaitInternal$annotations", "onAwaitInternal", "Lkotlinx/atomicfu/AtomicRef;", "_state", "_parentHandle", "active", "<init>", "(Z)V", "c", "b", "a", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 7 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 8 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 9 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1583:1\n732#1,3:1587\n361#1,2:1597\n363#1,5:1602\n368#1,5:1608\n373#1,2:1616\n361#1,2:1618\n363#1,5:1623\n368#1,5:1629\n373#1,2:1637\n169#1,2:1645\n734#1:1647\n536#1:1648\n169#1,2:1649\n537#1,15:1651\n169#1,2:1666\n169#1,2:1668\n169#1,2:1681\n732#1,3:1683\n732#1,3:1686\n169#1,2:1689\n732#1,3:1691\n169#1,2:1694\n169#1,2:1698\n169#1,2:1700\n536#1:1704\n169#1,2:1705\n537#1,15:1707\n1#2:1584\n1#2:1607\n1#2:1628\n27#3:1585\n27#3:1696\n27#3:1702\n16#4:1586\n16#4:1697\n16#4:1703\n295#5,2:1590\n295#5,2:1592\n22#6:1594\n159#7:1595\n159#7:1596\n149#7,4:1722\n275#8,3:1599\n278#8,3:1613\n275#8,3:1620\n278#8,3:1634\n275#8,6:1639\n351#9,11:1670\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n241#1:1587,3\n324#1:1597,2\n324#1:1602,5\n324#1:1608,5\n324#1:1616,2\n357#1:1618,2\n357#1:1623,5\n357#1:1629,5\n357#1:1637,2\n377#1:1645,2\n422#1:1647\n468#1:1648\n468#1:1649,2\n468#1:1651,15\n536#1:1666,2\n579#1:1668,2\n621#1:1681,2\n648#1:1683,3\n657#1:1686,3\n721#1:1689,2\n750#1:1691,3\n763#1:1694,2\n836#1:1698,2\n858#1:1700,2\n1023#1:1704\n1023#1:1705,2\n1023#1:1707,15\n324#1:1607\n357#1:1628\n204#1:1585\n766#1:1696\n911#1:1702\n204#1:1586\n766#1:1697\n911#1:1703\n252#1:1590,2\n256#1:1592,2\n264#1:1594\n270#1:1595\n272#1:1596\n1327#1:1722,4\n324#1:1599,3\n324#1:1613,3\n357#1:1620,3\n357#1:1634,3\n362#1:1639,6\n585#1:1670,11\n*E\n"})
public class j2
implements d2,
w,
s2 {
    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(j2.class, Object.class, "_state$volatile");
    private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(j2.class, Object.class, "_parentHandle$volatile");
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;

    public j2(boolean bl) {
        l1 l12 = bl ? k2.c() : k2.d();
        this._state$volatile = l12;
    }

    private final v B0(o o4) {
        o o5;
        while (true) {
            o5 = o4;
            if (!o4.p()) break;
            o4 = o4.l();
        }
        while (true) {
            o5 = o4 = o5.k();
            if (o4.p()) continue;
            if (o4 instanceof v) {
                return (v)o4;
            }
            o5 = o4;
            if (o4 instanceof o2) break;
        }
        return null;
    }

    private final void C0(o2 o22, Throwable throwable) {
        this.G0(throwable);
        o22.f(4);
        Object object = o22.j();
        y.h((Object)object, (String)"null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        object = (o)object;
        StringBuilder stringBuilder = null;
        while (!y.e((Object)object, (Object)((Object)o22))) {
            StringBuilder stringBuilder2 = stringBuilder;
            if (object instanceof i2) {
                stringBuilder2 = stringBuilder;
                if (((i2)((Object)object)).u()) {
                    try {
                        ((i2)((Object)object)).v(throwable);
                        stringBuilder2 = stringBuilder;
                    }
                    catch (Throwable throwable2) {
                        if (stringBuilder != null) {
                            kotlin.f.a(stringBuilder, throwable2);
                            stringBuilder2 = stringBuilder;
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Exception in completion handler ");
                        stringBuilder.append(object);
                        stringBuilder.append(" for ");
                        stringBuilder.append(this);
                        stringBuilder2 = new d0(stringBuilder.toString(), throwable2);
                        stringBuilder = k0.a;
                    }
                }
            }
            object = object.k();
            stringBuilder = stringBuilder2;
        }
        if (stringBuilder != null) {
            this.r0((Throwable)((Object)stringBuilder));
        }
        this.X(throwable);
    }

    private final void D0(o2 o22, Throwable throwable) {
        o22.f(1);
        Object object = o22.j();
        y.h((Object)object, (String)"null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        object = (o)object;
        Object object2 = null;
        while (!y.e((Object)object, (Object)((Object)o22))) {
            i2 i22 = object2;
            if (object instanceof i2) {
                i22 = (i2)((Object)object);
                try {
                    ((i2)((Object)object)).v(throwable);
                    i22 = object2;
                }
                catch (Throwable throwable2) {
                    if (object2 != null) {
                        kotlin.f.a((Throwable)object2, throwable2);
                        i22 = object2;
                    }
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Exception in completion handler ");
                    ((StringBuilder)object2).append(object);
                    ((StringBuilder)object2).append(" for ");
                    ((StringBuilder)object2).append(this);
                    i22 = new d0(((StringBuilder)object2).toString(), throwable2);
                    object2 = k0.a;
                }
            }
            object = object.k();
            object2 = i22;
        }
        if (object2 != null) {
            this.r0((Throwable)object2);
        }
    }

    private final Object E0(Object object, Object object2) {
        if (!(object2 instanceof c0)) {
            return object2;
        }
        throw ((c0)object2).a;
    }

    private final void F0(l<?> l4, Object object) {
        do {
            if ((object = this.n0()) instanceof y1) continue;
            if (!(object instanceof c0)) {
                object = k2.h((Object)object);
            }
            l4.d(object);
            return;
        } while (this.O0(object) < 0);
        l4.e(g2.o((d2)this, (boolean)false, (i2)new d(this, l4), (int)1, null));
    }

    private final void J0(l1 l12) {
        y1 y12 = new o2();
        if (!l12.isActive()) {
            y12 = new x1((o2)y12);
        }
        androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)j2.c, (Object)this, (Object)l12, (Object)y12);
    }

    private final void K0(i2 i22) {
        i22.e(new o2());
        o o4 = i22.k();
        androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)j2.c, (Object)this, (Object)((Object)i22), (Object)o4);
    }

    private final void L0(l<?> l4, Object object) {
        if (!this.v0()) {
            l4.d((Object)k0.a);
            return;
        }
        l4.e(g2.o((d2)this, (boolean)false, (i2)new e(this, l4), (int)1, null));
    }

    private final void O(Throwable throwable, List<? extends Throwable> object) {
        if (object.size() <= 1) {
            return;
        }
        Set set = Collections.newSetFromMap(new IdentityHashMap(object.size()));
        Iterator<? extends Throwable> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (object == throwable || object == throwable || object instanceof CancellationException || !set.add(object)) continue;
            kotlin.f.a(throwable, (Throwable)object);
        }
    }

    private final int O0(Object object) {
        if (object instanceof l1) {
            if (((l1)object).isActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)j2.c, (Object)this, (Object)object, (Object)k2.c())) {
                return -1;
            }
            this.I0();
            return 1;
        }
        if (object instanceof x1) {
            if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)j2.c, (Object)this, (Object)object, (Object)((Object)((x1)object).a()))) {
                return -1;
            }
            this.I0();
            return 1;
        }
        return 0;
    }

    private final String P0(Object object) {
        boolean bl = object instanceof c;
        String string = "Active";
        if (bl) {
            c c4 = (c)object;
            if (c4.i()) {
                object = "Cancelling";
            } else {
                object = string;
                if (c4.j()) {
                    object = "Completing";
                }
            }
        } else {
            object = object instanceof y1 ? (((y1)object).isActive() ? string : "New") : (object instanceof c0 ? "Cancelled" : "Completed");
        }
        return object;
    }

    public static /* synthetic */ CancellationException R0(j2 j22, Throwable throwable, String string, int n4, Object object) {
        if (object == null) {
            if ((n4 & 1) != 0) {
                string = null;
            }
            return j22.Q0(throwable, string);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final Object S(kotlin.coroutines.d<Object> d4) {
        Object object = new a(kotlin.coroutines.intrinsics.b.c(d4), this);
        ((p)object).H();
        r.a(object, (i1)g2.o((d2)this, (boolean)false, new t2(object), (int)1, null));
        object = ((p)object).z();
        if (object == kotlin.coroutines.intrinsics.b.f()) {
            kotlin.coroutines.jvm.internal.g.c(d4);
        }
        return object;
    }

    private final boolean T0(y1 y12, Object object) {
        if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)j2.c, (Object)this, (Object)y12, (Object)k2.g((Object)object))) {
            return false;
        }
        this.G0(null);
        this.H0(object);
        this.a0(y12, object);
        return true;
    }

    private final boolean U0(y1 y12, Throwable throwable) {
        o2 o22 = this.k0(y12);
        if (o22 == null) {
            return false;
        }
        c c4 = new c(o22, false, throwable);
        if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)j2.c, (Object)this, (Object)y12, (Object)c4)) {
            return false;
        }
        this.C0(o22, throwable);
        return true;
    }

    private final Object V0(Object object, Object object2) {
        if (!(object instanceof y1)) {
            return k2.a();
        }
        if ((object instanceof l1 || object instanceof i2) && !(object instanceof v) && !(object2 instanceof c0)) {
            if (this.T0((y1)object, object2)) {
                return object2;
            }
            return k2.b();
        }
        return this.W0((y1)object, object2);
    }

    private final Object W(Object object) {
        Object object2;
        while (!(!((object2 = this.n0()) instanceof y1) || object2 instanceof c && ((c)object2).j())) {
            if ((object2 = this.V0(object2, new c0(this.c0(object), false, 2, null))) == k2.b()) continue;
            return object2;
        }
        return k2.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final Object W0(y1 object, Object object2) {
        o2 o22 = this.k0((y1)object);
        if (o22 == null) {
            return k2.b();
        }
        boolean bl = object instanceof c;
        Object var6_6 = null;
        Object object3 = bl ? (c)object : null;
        c c4 = object3;
        if (object3 == null) {
            c4 = new c(o22, false, null);
        }
        kotlin.jvm.internal.u0 u02 = new kotlin.jvm.internal.u0();
        // MONITORENTER : c4
        if (c4.j()) {
            object = k2.a();
            // MONITOREXIT : c4
            return object;
        }
        c4.m(true);
        if (c4 != object && !androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)j2.c, (Object)this, (Object)object, (Object)c4)) {
            object = k2.b();
            // MONITOREXIT : c4
            return object;
        }
        bl = c4.i();
        object = object2 instanceof c0 ? (c0)object2 : null;
        if (object != null) {
            c4.b(((c0)object).a);
        }
        object3 = c4.e();
        object = var6_6;
        if (bl ^ true) {
            object = object3;
        }
        u02.c = object;
        object3 = k0.a;
        // MONITOREXIT : c4
        if (object != null) {
            this.C0(o22, (Throwable)object);
        }
        if ((object = this.B0(o22)) != null && this.X0(c4, (v)object, object2)) {
            return k2.b;
        }
        o22.f(2);
        object = this.B0(o22);
        if (object == null) return this.d0(c4, object2);
        if (!this.X0(c4, (v)object, object2)) return this.d0(c4, object2);
        return k2.b;
    }

    private final boolean X(Throwable throwable) {
        boolean bl = this.u0();
        boolean bl2 = true;
        if (bl) {
            return true;
        }
        boolean bl3 = throwable instanceof CancellationException;
        u u3 = this.m0();
        if (u3 != null && u3 != q2.c) {
            bl = bl2;
            if (!u3.c(throwable)) {
                bl = bl3 ? bl2 : false;
            }
            return bl;
        }
        return bl3;
    }

    private final boolean X0(c c4, v v3, Object object) {
        v v4;
        do {
            if (g2.n((d2)v3.g, (boolean)false, (i2)new b(this, c4, v3, object)) != q2.c) {
                return true;
            }
            v3 = v4 = this.B0(v3);
        } while (v4 != null);
        return false;
    }

    private final void a0(y1 y12, Object object) {
        Object object2 = this.m0();
        if (object2 != null) {
            object2.dispose();
            this.N0(q2.c);
        }
        boolean bl = object instanceof c0;
        Object var5_6 = null;
        object2 = bl ? (c0)object : null;
        object = var5_6;
        if (object2 != null) {
            object = ((c0)object2).a;
        }
        if (y12 instanceof i2) {
            try {
                ((i2)y12).v((Throwable)object);
            }
            catch (Throwable throwable) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Exception in completion handler ");
                ((StringBuilder)object2).append(y12);
                ((StringBuilder)object2).append(" for ");
                ((StringBuilder)object2).append(this);
                this.r0((Throwable)new d0(((StringBuilder)object2).toString(), throwable));
            }
        } else if ((y12 = y12.a()) != null) {
            this.D0((o2)y12, (Throwable)object);
        }
    }

    private final void b0(c c4, v v3, Object object) {
        v v4 = this.B0(v3);
        if (v4 != null && this.X0(c4, v4, object)) {
            return;
        }
        c4.a().f(2);
        v3 = this.B0(v3);
        if (v3 != null && this.X0(c4, v3, object)) {
            return;
        }
        this.P(this.d0(c4, object));
    }

    private final Throwable c0(Object object) {
        if (object == null || object instanceof Throwable) {
            Throwable throwable = (Throwable)object;
            object = throwable;
            if (throwable == null) {
                object = new e2(this.Y(), null, this);
            }
        } else {
            y.h((Object)object, (String)"null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
            object = ((s2)object).z();
        }
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final Object d0(c c4, Object object) {
        void var4_9;
        void var4_6;
        if (object instanceof c0) {
            c0 c02 = (c0)object;
        } else {
            Object var4_5 = null;
        }
        if (var4_6 != null) {
            Throwable throwable = var4_6.a;
        } else {
            Object var4_8 = null;
        }
        // MONITORENTER : c4
        boolean bl = c4.i();
        List<Throwable> list = c4.l((Throwable)var4_9);
        Throwable throwable = this.g0(c4, list);
        if (throwable != null) {
            this.O(throwable, list);
        }
        if (throwable != null && throwable != var4_9) {
            object = new c0(throwable, false, 2, null);
        }
        if (throwable != null && (this.X(throwable) || this.q0(throwable))) {
            y.h((Object)object, (String)"null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((c0)object).c();
        }
        if (!bl) {
            this.G0(throwable);
        }
        this.H0(object);
        androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)j2.c, (Object)this, (Object)c4, (Object)k2.g((Object)object));
        this.a0(c4, object);
        return object;
    }

    private final Throwable f0(Object object) {
        boolean bl = object instanceof c0;
        Throwable throwable = null;
        object = bl ? (c0)object : null;
        if (object != null) {
            throwable = ((c0)object).a;
        }
        return throwable;
    }

    private final Throwable g0(c object, List<? extends Throwable> object2) {
        Object object3;
        Object object4;
        Object var4_4;
        block7: {
            boolean bl = object2.isEmpty();
            var4_4 = null;
            if (bl) {
                if (((c)object).i()) {
                    return new e2(this.Y(), null, this);
                }
                return null;
            }
            object4 = (Iterable)object2;
            object3 = object4.iterator();
            while (object3.hasNext()) {
                object = object3.next();
                if (!((Throwable)object instanceof CancellationException ^ true)) continue;
                break block7;
            }
            object = null;
        }
        object = (Throwable)object;
        if (object != null) {
            return object;
        }
        if ((object2 = object2.get(0)) instanceof e3) {
            object4 = object4.iterator();
            do {
                object = var4_4;
            } while (object4.hasNext() && ((object3 = (Throwable)(object = object4.next())) == object2 || !(object3 instanceof e3)));
            if ((object = (Throwable)object) != null) {
                return object;
            }
        }
        return object2;
    }

    private final o2 k0(y1 y12) {
        o2 o22 = y12.a();
        Object object = o22;
        if (o22 == null) {
            if (y12 instanceof l1) {
                object = new o2();
            } else if (y12 instanceof i2) {
                this.K0((i2)y12);
                object = null;
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append("State should have list: ");
                ((StringBuilder)object).append(y12);
                throw new IllegalStateException(((StringBuilder)object).toString().toString());
            }
        }
        return object;
    }

    private final boolean v0() {
        Object object;
        do {
            if ((object = this.n0()) instanceof y1) continue;
            return false;
        } while (this.O0(object) < 0);
        return true;
    }

    private final Object w0(kotlin.coroutines.d<? super k0> d4) {
        Object object = new p(kotlin.coroutines.intrinsics.b.c(d4), 1);
        ((p)object).H();
        r.a(object, (i1)g2.o((d2)this, (boolean)false, (i2)new u2((kotlin.coroutines.d<? super k0>)object), (int)1, null));
        object = ((p)object).z();
        if (object == kotlin.coroutines.intrinsics.b.f()) {
            kotlin.coroutines.jvm.internal.g.c(d4);
        }
        if (object == kotlin.coroutines.intrinsics.b.f()) {
            return object;
        }
        return k0.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final Object x0(Object object) {
        Object var5_3 = null;
        Throwable throwable = null;
        while (true) {
            Object object2;
            Throwable throwable2;
            Object object3;
            if ((object3 = this.n0()) instanceof c) {
                // MONITORENTER : object3
                if (((c)object3).k()) {
                    object = k2.f();
                    // MONITOREXIT : object3
                    return object;
                }
                boolean bl = ((c)object3).i();
                if (object != null || !bl) {
                    throwable2 = throwable;
                    if (throwable == null) {
                        throwable2 = this.c0(object);
                    }
                    ((c)object3).b(throwable2);
                }
                throwable = ((c)object3).e();
                object = var5_3;
                if (bl ^ true) {
                    object = throwable;
                }
                // MONITOREXIT : object3
                if (object == null) return k2.a();
                this.C0(((c)object3).a(), (Throwable)object);
                return k2.a();
            }
            if (!(object3 instanceof y1)) return k2.f();
            throwable2 = throwable;
            if (throwable == null) {
                throwable2 = this.c0(object);
            }
            if ((object2 = (y1)object3).isActive()) {
                throwable = throwable2;
                if (!this.U0((y1)object2, throwable2)) continue;
                return k2.a();
            }
            object2 = this.V0(object3, new c0(throwable2, false, 2, null));
            if (object2 == k2.a()) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Cannot happen in ");
                ((StringBuilder)object).append(object3);
                throw new IllegalStateException(((StringBuilder)object).toString().toString());
            }
            throwable = throwable2;
            if (object2 != k2.b()) return object2;
        }
    }

    @NotNull
    public String A0() {
        return u0.a((Object)this);
    }

    @Override
    @Nullable
    public final Object C(@NotNull kotlin.coroutines.d<? super k0> object) {
        if (!this.v0()) {
            g2.k((kotlin.coroutines.g)object.getContext());
            return k0.a;
        }
        if ((object = this.w0((kotlin.coroutines.d<? super k0>)object)) == kotlin.coroutines.intrinsics.b.f()) {
            return object;
        }
        return k0.a;
    }

    protected void G0(@Nullable Throwable throwable) {
    }

    protected void H0(@Nullable Object object) {
    }

    protected void I0() {
    }

    public final void M0(@NotNull i2 i22) {
        Object object;
        while ((object = this.n0()) instanceof i2) {
            if (object != i22) {
                return;
            }
            if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)j2.c, (Object)this, (Object)object, (Object)k2.c())) continue;
            return;
        }
        if (object instanceof y1 && ((y1)object).a() != null) {
            i22.q();
        }
    }

    public final void N0(@Nullable u u3) {
        j2.d.set(this, u3);
    }

    protected void P(@Nullable Object object) {
    }

    @NotNull
    protected final CancellationException Q0(@NotNull Throwable throwable, @Nullable String string) {
        Object object = throwable instanceof CancellationException ? (CancellationException)throwable : null;
        CancellationException cancellationException = object;
        if (object == null) {
            object = string;
            if (string == null) {
                object = this.Y();
            }
            cancellationException = new e2((String)object, throwable, this);
        }
        return cancellationException;
    }

    @Nullable
    protected final Object R(@NotNull kotlin.coroutines.d<Object> d4) {
        Object object;
        do {
            if ((object = this.n0()) instanceof y1) continue;
            if (!(object instanceof c0)) {
                return k2.h((Object)object);
            }
            throw ((c0)object).a;
        } while (this.O0(object) < 0);
        return this.S(d4);
    }

    @InternalCoroutinesApi
    @NotNull
    public final String S0() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.A0());
        stringBuilder.append('{');
        stringBuilder.append(this.P0(this.n0()));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final boolean T(@Nullable Throwable throwable) {
        return this.U(throwable);
    }

    public final boolean U(@Nullable Object object) {
        Object object2;
        kotlinx.coroutines.internal.d0 d02 = k2.a();
        boolean bl = this.j0();
        boolean bl2 = true;
        if (bl) {
            d02 = object2 = this.W(object);
            if (object2 == k2.b) {
                return true;
            }
        }
        object2 = d02;
        if (d02 == k2.a()) {
            object2 = this.x0(object);
        }
        if (object2 != k2.a() && object2 != k2.b) {
            if (object2 == k2.f()) {
                bl2 = false;
            } else {
                this.P(object2);
            }
        }
        return bl2;
    }

    public void V(@NotNull Throwable throwable) {
        this.U(throwable);
    }

    @NotNull
    protected String Y() {
        return "Job was cancelled";
    }

    public boolean Z(@NotNull Throwable throwable) {
        boolean bl = throwable instanceof CancellationException;
        boolean bl2 = true;
        if (bl) {
            return true;
        }
        if (!this.U(throwable) || !this.h0()) {
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void cancel(@Nullable CancellationException cancellationException) {
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException == null) {
            cancellationException2 = new e2(this.Y(), null, this);
        }
        this.V(cancellationException2);
    }

    @Override
    @NotNull
    public final kotlin.sequences.i<d2> d() {
        return kotlin.sequences.l.b(new kotlin.jvm.functions.p<k<? super d2>, kotlin.coroutines.d<? super k0>, Object>(this, null){
            Object l;
            Object m;
            int n;
            private Object o;
            final j2 p;
            {
                this.p = j22;
                super(2, d4);
            }

            @Override
            public final kotlin.coroutines.d<k0> create(Object object, kotlin.coroutines.d<?> p4) {
                p4 = new /* invalid duplicate definition of identical inner class */;
                p4.o = object;
                return p4;
            }

            @Override
            public final Object invoke(k<? super d2> k4, kotlin.coroutines.d<? super k0> d4) {
                return (this.create(k4, d4)).invokeSuspend(k0.a);
            }

            /*
             * Handled impossible loop by duplicating code
             * WARNING - void declaration
             * Enabled aggressive block sorting
             */
            @Override
            public final Object invokeSuspend(Object object) {
                void var7_12;
                k k4;
                n n4;
                void var5_5;
                k k5;
                n n5;
                Object object2 = kotlin.coroutines.intrinsics.b.f();
                int n6 = this.n;
                if (n6 != 0) {
                    if (n6 == 1) {
                        kotlin.v.b((Object)object);
                        return k0.a;
                    }
                    if (n6 != 2) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    o o4 = (o)this.m;
                    n5 = (n)((Object)this.l);
                    k5 = (k)this.o;
                    kotlin.v.b((Object)object);
                    object = var5_5.k();
                    n4 = n5;
                    k4 = k5;
                } else {
                    kotlin.v.b((Object)object);
                    k4 = (k)this.o;
                    object = this.p.n0();
                    if (object instanceof v) {
                        object = ((v)object).g;
                        this.n = 1;
                        if (k4.a(object, (kotlin.coroutines.d)this) != object2) return k0.a;
                        return object2;
                    }
                    if (!(object instanceof y1)) return k0.a;
                    o2 o22 = ((y1)object).a();
                    if (o22 == null) return k0.a;
                    object = o22.j();
                    y.h((Object)object, (String)"null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    object = (o)object;
                }
                while (!y.e((Object)object, (Object)var7_12)) {
                    Object object3 = object;
                    n5 = var7_12;
                    k5 = k4;
                    if (object instanceof v) {
                        w w3 = ((v)object).g;
                        this.o = k4;
                        this.l = var7_12;
                        this.m = object;
                        this.n = 2;
                        Object object4 = object;
                        n5 = var7_12;
                        k5 = k4;
                        if (k4.a((Object)w3, (kotlin.coroutines.d)this) == object2) {
                            return object2;
                        }
                    }
                    object = var5_5.k();
                    n4 = n5;
                    k4 = k5;
                }
                return k0.a;
            }
        });
    }

    @Override
    public final void e(@NotNull s2 s22) {
        this.U(s22);
    }

    @Nullable
    public final Object e0() {
        Object object = this.n0();
        if (object instanceof y1 ^ true) {
            if (!(object instanceof c0)) {
                return k2.h((Object)object);
            }
            throw ((c0)object).a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override
    @NotNull
    public final i1 f(@NotNull kotlin.jvm.functions.l<? super Throwable, k0> l4) {
        return this.t0(true, new c2(l4));
    }

    @Override
    public <R> R fold(R r4, @NotNull kotlin.jvm.functions.p<? super R, ? super g.b, ? extends R> p4) {
        return (R)d2.a.b((d2)this, r4, p4);
    }

    @Override
    @Nullable
    public <E extends g.b> E get(@NotNull g.c<E> c4) {
        return (E)d2.a.c((d2)this, c4);
    }

    @Override
    @NotNull
    public final g.c<?> getKey() {
        return d2.C8;
    }

    @Override
    public final boolean h() {
        return this.n0() instanceof y1 ^ true;
    }

    public boolean h0() {
        return true;
    }

    @NotNull
    protected final f<?> i0() {
        kotlin.jvm.internal.v v3 = g.c;
        y.h((Object)v3, (String)"null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        q q4 = (q)a1.e((Object)v3, (int)3);
        v3 = h.c;
        y.h((Object)v3, (String)"null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.g(this, q4, (q)a1.e((Object)v3, (int)3), null, 8, null);
    }

    @Override
    public boolean isActive() {
        Object object = this.n0();
        boolean bl = object instanceof y1 && ((y1)object).isActive();
        return bl;
    }

    @Override
    public final boolean isCancelled() {
        Object object = this.n0();
        boolean bl = object instanceof c0 || object instanceof c && ((c)object).i();
        return bl;
    }

    public boolean j0() {
        return false;
    }

    @Nullable
    public d2 l0() {
        Object object = this.m0();
        object = object != null ? object.getParent() : null;
        return object;
    }

    @Nullable
    public final u m0() {
        return (u)j2.d.get(this);
    }

    @Override
    @NotNull
    public kotlin.coroutines.g minusKey(@NotNull g.c<?> c4) {
        return d2.a.e((d2)this, c4);
    }

    @Nullable
    public final Object n0() {
        return j2.c.get(this);
    }

    @NotNull
    public kotlin.coroutines.g plus(@NotNull kotlin.coroutines.g g4) {
        return d2.a.f((d2)this, (kotlin.coroutines.g)g4);
    }

    protected boolean q0(@NotNull Throwable throwable) {
        return false;
    }

    @Override
    @NotNull
    public final kotlinx.coroutines.selects.d r() {
        i i4 = i.c;
        y.h((Object)i4, (String)"null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new kotlinx.coroutines.selects.e(this, (q)a1.e((Object)i4, (int)3), null, 4, null);
    }

    public void r0(@NotNull Throwable throwable) {
        throw throwable;
    }

    @Override
    @NotNull
    public final u s(@NotNull w object) {
        Object object2;
        v v3;
        block12: {
            block13: {
                block11: {
                    boolean bl;
                    v3 = new v((w)object);
                    v3.w(this);
                    while (true) {
                        Object object3;
                        if ((object3 = this.n0()) instanceof l1) {
                            object = (l1)object3;
                            if (((l1)object).isActive()) {
                                if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)j2.c, (Object)this, (Object)object3, (Object)v3)) continue;
                                break block11;
                            }
                            this.J0((l1)object);
                            continue;
                        }
                        bl = object3 instanceof y1;
                        object2 = null;
                        object = null;
                        if (!bl) break block12;
                        object2 = ((y1)object3).a();
                        if (object2 != null) break;
                        y.h((Object)object3, (String)"null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        this.K0((i2)((Object)object3));
                    }
                    if (object2.b(v3, 7)) break block11;
                    bl = object2.b(v3, 3);
                    object2 = this.n0();
                    if (object2 instanceof c) {
                        object = ((c)object2).e();
                    } else if ((object2 = object2 instanceof c0 ? (c0)object2 : null) != null) {
                        object = ((c0)object2).a;
                    }
                    v3.v((Throwable)object);
                    if (!bl) break block13;
                }
                return v3;
            }
            return q2.c;
        }
        object = this.n0();
        object = object instanceof c0 ? (c0)object : null;
        if (object != null) {
            object2 = ((c0)object).a;
        }
        v3.v((Throwable)object2);
        return q2.c;
    }

    protected final void s0(@Nullable d2 object) {
        if (object == null) {
            this.N0(q2.c);
            return;
        }
        object.start();
        object = object.s(this);
        this.N0((u)object);
        if (this.h()) {
            object.dispose();
            this.N0(q2.c);
        }
    }

    @Override
    public final boolean start() {
        int n4;
        while ((n4 = this.O0(this.n0())) != 0) {
            if (n4 != 1) continue;
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @NotNull
    public final i1 t0(boolean bl, @NotNull i2 i22) {
        void var5_12;
        o2 o22;
        Object object;
        block9: {
            i22.w(this);
            while (true) {
                if ((object = this.n0()) instanceof l1) {
                    l1 l12 = (l1)object;
                    if (l12.isActive()) {
                        if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)j2.c, (Object)this, (Object)object, (Object)((Object)i22))) continue;
                        return i22;
                    }
                    this.J0(l12);
                    continue;
                }
                boolean bl2 = object instanceof y1;
                o22 = null;
                Object var5_7 = null;
                if (!bl2) break block9;
                y1 y12 = (y1)object;
                o22 = y12.a();
                if (o22 == null) {
                    y.h((Object)object, (String)"null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    this.K0((i2)((Object)object));
                    continue;
                }
                if (i22.u()) {
                    void var5_9;
                    object = y12 instanceof c ? (c)y12 : null;
                    if (object != null) {
                        Throwable throwable = ((c)object).e();
                    }
                    if (var5_9 != null) {
                        if (!bl) return q2.c;
                        i22.v((Throwable)var5_9);
                        return q2.c;
                    }
                    bl2 = o22.b(i22, 5);
                } else {
                    bl2 = o22.b(i22, 1);
                }
                if (bl2) break;
            }
            return i22;
        }
        if (!bl) return q2.c;
        object = this.n0();
        object = object instanceof c0 ? (c0)object : null;
        o2 o23 = o22;
        if (object != null) {
            Throwable throwable = ((c0)object).a;
        }
        i22.v((Throwable)var5_12);
        return q2.c;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.S0());
        stringBuilder.append('@');
        stringBuilder.append(u0.b((Object)this));
        return stringBuilder.toString();
    }

    protected boolean u0() {
        return false;
    }

    @Override
    @NotNull
    public final i1 w(boolean bl, boolean bl2, @NotNull kotlin.jvm.functions.l<? super Throwable, k0> object) {
        object = bl ? new b2((kotlin.jvm.functions.l<? super Throwable, k0>)object) : new c2((kotlin.jvm.functions.l<? super Throwable, k0>)object);
        return this.t0(bl2, (i2)((Object)object));
    }

    @Override
    @NotNull
    public final CancellationException y() {
        Object object;
        block11: {
            block10: {
                block8: {
                    block9: {
                        object = this.n0();
                        if (!(object instanceof c)) break block8;
                        Throwable throwable = ((c)object).e();
                        if (throwable == null) break block9;
                        object = new StringBuilder();
                        ((StringBuilder)object).append(u0.a((Object)this));
                        ((StringBuilder)object).append(" is cancelling");
                        object = this.Q0(throwable, ((StringBuilder)object).toString());
                        if (object != null) break block10;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Job is still new or active: ");
                    ((StringBuilder)object).append(this);
                    throw new IllegalStateException(((StringBuilder)object).toString().toString());
                }
                if (object instanceof y1) break block11;
                if (object instanceof c0) {
                    object = j2.R0(this, ((c0)object).a, null, 1, null);
                } else {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(u0.a((Object)this));
                    ((StringBuilder)object).append(" has completed normally");
                    object = new e2(((StringBuilder)object).toString(), null, this);
                }
            }
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Job is still new or active: ");
        ((StringBuilder)object).append(this);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    public final boolean y0(@Nullable Object object) {
        Object object2;
        do {
            if ((object2 = this.V0(this.n0(), object)) == k2.a()) {
                return false;
            }
            if (object2 != k2.b) continue;
            return true;
        } while (object2 == k2.b());
        this.P(object2);
        return true;
    }

    @Override
    @NotNull
    public CancellationException z() {
        Object object;
        block8: {
            Throwable throwable;
            Serializable serializable;
            block6: {
                block7: {
                    block5: {
                        object = this.n0();
                        boolean bl = object instanceof c;
                        serializable = null;
                        if (!bl) break block5;
                        throwable = ((c)object).e();
                        break block6;
                    }
                    if (!(object instanceof c0)) break block7;
                    throwable = ((c0)object).a;
                    break block6;
                }
                if (object instanceof y1) break block8;
                throwable = null;
            }
            if (throwable instanceof CancellationException) {
                serializable = (CancellationException)throwable;
            }
            CancellationException cancellationException = serializable;
            if (serializable == null) {
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append("Parent job is ");
                ((StringBuilder)serializable).append(this.P0(object));
                cancellationException = new e2(((StringBuilder)serializable).toString(), throwable, this);
            }
            return cancellationException;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot be cancelling child in this state: ");
        stringBuilder.append(object);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    @Nullable
    public final Object z0(@Nullable Object object) {
        Object object2;
        while ((object2 = this.V0(this.n0(), object)) != k2.a()) {
            if (object2 == k2.b()) continue;
            return object2;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Job ");
        ((StringBuilder)object2).append(this);
        ((StringBuilder)object2).append(" is already complete or completing, but is being completed with ");
        ((StringBuilder)object2).append(object);
        throw new IllegalStateException(((StringBuilder)object2).toString(), this.f0(object));
    }

    @Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014\u00a2\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2={"Lkotlinx/coroutines/j2$a;", "T", "Lkotlinx/coroutines/p;", "Lkotlinx/coroutines/d2;", "parent", "", "w", "(Lkotlinx/coroutines/d2;)Ljava/lang/Throwable;", "", "N", "()Ljava/lang/String;", "Lkotlinx/coroutines/j2;", "k", "Lkotlinx/coroutines/j2;", "job", "Lkotlin/coroutines/d;", "delegate", "<init>", "(Lkotlin/coroutines/d;Lkotlinx/coroutines/j2;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    @SourceDebugExtension(value={"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$AwaitContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
    private static final class a<T>
    extends p<T> {
        @NotNull
        private final j2 k;

        public a(@NotNull kotlin.coroutines.d<? super T> d4, @NotNull j2 j22) {
            super(d4, 1);
            this.k = j22;
        }

        @Override
        @NotNull
        protected String N() {
            return "AwaitContinuation";
        }

        @Override
        @NotNull
        public Throwable w(@NotNull d2 d22) {
            Throwable throwable;
            Object object = this.k.n0();
            if (object instanceof c && (throwable = ((c)object).e()) != null) {
                return throwable;
            }
            if (object instanceof c0) {
                return ((c0)object).a;
            }
            return d22.y();
        }
    }

    @Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001d"}, d2={"Lkotlinx/coroutines/j2$b;", "Lkotlinx/coroutines/i2;", "", "cause", "Lkotlin/k0;", "v", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/j2;", "g", "Lkotlinx/coroutines/j2;", "parent", "Lkotlinx/coroutines/j2$c;", "h", "Lkotlinx/coroutines/j2$c;", "state", "Lkotlinx/coroutines/v;", "i", "Lkotlinx/coroutines/v;", "child", "", "j", "Ljava/lang/Object;", "proposedUpdate", "", "u", "()Z", "onCancelling", "<init>", "(Lkotlinx/coroutines/j2;Lkotlinx/coroutines/j2$c;Lkotlinx/coroutines/v;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    private static final class b
    extends i2 {
        @NotNull
        private final j2 g;
        @NotNull
        private final c h;
        @NotNull
        private final v i;
        @Nullable
        private final Object j;

        public b(@NotNull j2 j22, @NotNull c c4, @NotNull v v3, @Nullable Object object) {
            this.g = j22;
            this.h = c4;
            this.i = v3;
            this.j = object;
        }

        @Override
        public boolean u() {
            return false;
        }

        @Override
        public void v(@Nullable Throwable throwable) {
            this.g.b0(this.h, this.i, this.j);
        }
    }

    @Metadata(d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b2\u00103J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u001d\u001a\u0004\u0018\u00010\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u001e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010'\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u000fR\u0011\u0010)\u001a\u00020\u001e8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010 R\u0011\u0010+\u001a\u00020\u001e8F\u00a2\u0006\u0006\u001a\u0004\b*\u0010 R\u0014\u0010,\u001a\u00020\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010 R\u000b\u0010.\u001a\u00020-8\u0002X\u0082\u0004R\u0013\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050/8\u0002X\u0082\u0004R\u0013\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010/8\u0002X\u0082\u0004\u00a8\u00064"}, d2={"Lkotlinx/coroutines/j2$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/y1;", "Ljava/util/ArrayList;", "", "c", "()Ljava/util/ArrayList;", "proposedException", "", "l", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "Lkotlin/k0;", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/o2;", "Lkotlinx/coroutines/o2;", "a", "()Lkotlinx/coroutines/o2;", "list", "value", "d", "()Ljava/lang/Object;", "n", "(Ljava/lang/Object;)V", "exceptionsHolder", "", "j", "()Z", "m", "(Z)V", "isCompleting", "e", "()Ljava/lang/Throwable;", "o", "rootCause", "k", "isSealed", "i", "isCancelling", "isActive", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleting", "Lkotlinx/atomicfu/AtomicRef;", "_rootCause", "_exceptionsHolder", "<init>", "(Lkotlinx/coroutines/o2;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    @SourceDebugExtension(value={"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$Finishing\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
    private static final class c
    implements y1 {
        private static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");
        private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");
        private static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile Object _exceptionsHolder$volatile;
        private volatile int _isCompleting$volatile;
        private volatile Object _rootCause$volatile;
        @NotNull
        private final o2 c;

        public c(@NotNull o2 o22, boolean bl, @Nullable Throwable throwable) {
            this.c = o22;
            this._isCompleting$volatile = bl ? 1 : 0;
            this._rootCause$volatile = throwable;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<Throwable>(4);
        }

        private final Object d() {
            return kotlinx.coroutines.j2$c.f.get(this);
        }

        private final void n(Object object) {
            kotlinx.coroutines.j2$c.f.set(this, object);
        }

        @NotNull
        public o2 a() {
            return this.c;
        }

        public final void b(@NotNull Throwable serializable) {
            Object object;
            block9: {
                block7: {
                    block8: {
                        block6: {
                            object = this.e();
                            if (object == null) {
                                this.o((Throwable)serializable);
                                return;
                            }
                            if (serializable == object) {
                                return;
                            }
                            object = this.d();
                            if (object != null) break block6;
                            this.n(serializable);
                            break block7;
                        }
                        if (!(object instanceof Throwable)) break block8;
                        if (serializable == object) {
                            return;
                        }
                        ArrayList<Throwable> arrayList = this.c();
                        arrayList.add((Throwable)object);
                        arrayList.add((Throwable)serializable);
                        this.n(arrayList);
                        break block7;
                    }
                    if (!(object instanceof ArrayList)) break block9;
                    ((ArrayList)object).add(serializable);
                }
                return;
            }
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("State is ");
            ((StringBuilder)serializable).append(object);
            throw new IllegalStateException(((StringBuilder)serializable).toString().toString());
        }

        @Nullable
        public final Throwable e() {
            return (Throwable)kotlinx.coroutines.j2$c.e.get(this);
        }

        public final boolean i() {
            boolean bl = this.e() != null;
            return bl;
        }

        public boolean isActive() {
            boolean bl = this.e() == null;
            return bl;
        }

        public final boolean j() {
            boolean bl = kotlinx.coroutines.j2$c.d.get(this) != 0;
            return bl;
        }

        public final boolean k() {
            boolean bl = this.d() == k2.e();
            return bl;
        }

        @NotNull
        public final List<Throwable> l(@Nullable Throwable serializable) {
            Object object;
            block8: {
                ArrayList arrayList;
                block6: {
                    block7: {
                        block5: {
                            object = this.d();
                            if (object != null) break block5;
                            arrayList = this.c();
                            break block6;
                        }
                        if (!(object instanceof Throwable)) break block7;
                        arrayList = this.c();
                        arrayList.add((Throwable)object);
                        break block6;
                    }
                    if (!(object instanceof ArrayList)) break block8;
                    arrayList = (ArrayList)object;
                }
                object = this.e();
                if (object != null) {
                    arrayList.add(0, object);
                }
                if (serializable != null && !y.e((Object)serializable, (Object)object)) {
                    arrayList.add(serializable);
                }
                this.n(k2.e());
                return arrayList;
            }
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("State is ");
            ((StringBuilder)serializable).append(object);
            throw new IllegalStateException(((StringBuilder)serializable).toString().toString());
        }

        public final void m(boolean bl) {
            kotlinx.coroutines.j2$c.d.set(this, bl ? 1 : 0);
        }

        public final void o(@Nullable Throwable throwable) {
            kotlinx.coroutines.j2$c.e.set(this, throwable);
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Finishing[cancelling=");
            stringBuilder.append(this.i());
            stringBuilder.append(", completing=");
            stringBuilder.append(this.j());
            stringBuilder.append(", rootCause=");
            stringBuilder.append(this.e());
            stringBuilder.append(", exceptions=");
            stringBuilder.append(this.d());
            stringBuilder.append(", list=");
            stringBuilder.append((Object)this.a());
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2={"Lkotlinx/coroutines/j2$d;", "Lkotlinx/coroutines/i2;", "", "cause", "Lkotlin/k0;", "v", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/selects/l;", "g", "Lkotlinx/coroutines/selects/l;", "select", "", "u", "()Z", "onCancelling", "<init>", "(Lkotlinx/coroutines/j2;Lkotlinx/coroutines/selects/l;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    private final class d
    extends i2 {
        @NotNull
        private final l<?> g;
        final j2 h;

        public d(@NotNull j2 j22, l<?> l4) {
            this.h = j22;
            this.g = l4;
        }

        @Override
        public boolean u() {
            return false;
        }

        @Override
        public void v(@Nullable Throwable object) {
            object = this.h.n0();
            if (!(object instanceof c0)) {
                object = k2.h((Object)object);
            }
            this.g.f((Object)this.h, object);
        }
    }

    @Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2={"Lkotlinx/coroutines/j2$e;", "Lkotlinx/coroutines/i2;", "", "cause", "Lkotlin/k0;", "v", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/selects/l;", "g", "Lkotlinx/coroutines/selects/l;", "select", "", "u", "()Z", "onCancelling", "<init>", "(Lkotlinx/coroutines/j2;Lkotlinx/coroutines/selects/l;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    private final class e
    extends i2 {
        @NotNull
        private final l<?> g;
        final j2 h;

        public e(@NotNull j2 j22, l<?> l4) {
            this.h = j22;
            this.g = l4;
        }

        @Override
        public boolean u() {
            return false;
        }

        @Override
        public void v(@Nullable Throwable throwable) {
            this.g.f((Object)this.h, (Object)k0.a);
        }
    }
}


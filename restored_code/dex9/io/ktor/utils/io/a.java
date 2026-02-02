/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.concurrent.futures.a
 *  io.ktor.utils.io.a$a
 *  io.ktor.utils.io.b
 *  io.ktor.utils.io.core.a
 *  io.ktor.utils.io.core.e
 *  io.ktor.utils.io.core.g
 *  io.ktor.utils.io.core.internal.g
 *  io.ktor.utils.io.core.p
 *  io.ktor.utils.io.g
 *  io.ktor.utils.io.internal.c
 *  io.ktor.utils.io.internal.d
 *  io.ktor.utils.io.internal.e
 *  io.ktor.utils.io.internal.f
 *  io.ktor.utils.io.internal.g
 *  io.ktor.utils.io.internal.i
 *  io.ktor.utils.io.internal.l
 *  io.ktor.utils.io.j
 *  io.ktor.utils.io.k
 *  io.ktor.utils.io.p
 *  io.ktor.utils.io.pool.g
 *  io.ktor.utils.io.s
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.coroutines.d
 *  kotlin.coroutines.jvm.internal.b
 *  kotlin.coroutines.jvm.internal.g
 *  kotlin.j
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.s0
 *  kotlin.jvm.internal.t0
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.u
 *  kotlin.u$a
 *  kotlin.v
 *  kotlinx.coroutines.d2$a
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.utils.io;

import io.ktor.utils.io.a;
import io.ktor.utils.io.b;
import io.ktor.utils.io.core.p;
import io.ktor.utils.io.g;
import io.ktor.utils.io.internal.g;
import io.ktor.utils.io.s;
import java.io.EOFException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.u;
import kotlin.v;
import kotlinx.coroutines.d2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u00c6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0010\u0018\u0000 }2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00042\u00020\u0004:\u0001|B/\u0012\u0007\u0010\u008b\u0001\u001a\u00020\u0015\u0012\u0010\b\u0002\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020d0\u008c\u0001\u0012\t\b\u0002\u0010\u0092\u0001\u001a\u00020\u0005\u00a2\u0006\u0006\b\u00c8\u0001\u0010\u00c9\u0001B\u0014\b\u0016\u0012\u0007\u0010\u00ca\u0001\u001a\u00020\n\u00a2\u0006\u0006\b\u00c8\u0001\u0010\u00cb\u0001J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u0005*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\"\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\"\u0010#J'\u0010'\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b'\u0010(J+\u0010)\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020+H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\b,\u0010-J#\u00101\u001a\u00020\u0007*\u00020\n2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b1\u00102J#\u00103\u001a\u00020\u0007*\u00020\n2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b3\u00102J!\u00106\u001a\u0004\u0018\u00010\u00002\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b6\u00107J\u001b\u00109\u001a\u00020\u00072\u0006\u00108\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00052\u0006\u00108\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\bA\u0010BJ'\u0010C\u001a\u00020\u00052\u0006\u00108\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\bC\u0010(J+\u0010D\u001a\u00020\u00072\u0006\u00108\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\bD\u0010*J+\u0010E\u001a\u00020\u00052\u0006\u00108\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\bE\u0010*J/\u0010I\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u00052\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070GH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\bI\u0010JJ\u0017\u0010N\u001a\u00020M2\u0006\u0010L\u001a\u00020KH\u0002\u00a2\u0006\u0004\bN\u0010OJ\u001b\u0010P\u001a\u00020M2\u0006\u0010L\u001a\u00020KH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\bR\u0010\u0012J\u000f\u0010S\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\bS\u0010\u0012J\u0019\u0010V\u001a\u00020\u00072\b\u0010U\u001a\u0004\u0018\u00010TH\u0002\u00a2\u0006\u0004\bV\u0010WJ\u001b\u0010Y\u001a\u00020\u00152\u0006\u0010X\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\bY\u0010ZJ\u001b\u0010[\u001a\u00020\u00152\u0006\u0010X\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\b[\u0010ZJ%\u0010^\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u00052\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00150\\H\u0002\u00a2\u0006\u0004\b^\u0010ZJ\u001b\u0010_\u001a\u00020\u00152\u0006\u0010X\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\b_\u0010ZJ\u000f\u0010`\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\u00152\u0006\u0010X\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\bb\u0010cJ\u000f\u0010e\u001a\u00020dH\u0002\u00a2\u0006\u0004\be\u0010fJ\u0017\u0010h\u001a\u00020\u00072\u0006\u0010g\u001a\u00020dH\u0002\u00a2\u0006\u0004\bh\u0010iJ\u000f\u0010k\u001a\u00020jH\u0000\u00a2\u0006\u0004\bk\u0010lJ\u0017\u0010o\u001a\u00020\u00072\u0006\u0010n\u001a\u00020mH\u0017\u00a2\u0006\u0004\bo\u0010pJ\u0019\u0010q\u001a\u00020\u00152\b\u0010U\u001a\u0004\u0018\u00010TH\u0016\u00a2\u0006\u0004\bq\u0010rJ\u0019\u0010s\u001a\u00020\u00152\b\u0010U\u001a\u0004\u0018\u00010TH\u0016\u00a2\u0006\u0004\bs\u0010rJ\u000f\u0010t\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\bt\u0010\u0012J\u0011\u0010u\u001a\u0004\u0018\u00010\nH\u0000\u00a2\u0006\u0004\bu\u0010\u0010J\u000f\u0010v\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\bv\u0010\u0012J\u000f\u0010w\u001a\u00020\u0015H\u0000\u00a2\u0006\u0004\bw\u0010aJ+\u0010x\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\bx\u0010*J\u001b\u0010y\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020+H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\by\u0010-J\u000f\u0010z\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\bz\u0010{J\u001b\u0010|\u001a\u00020\u00072\u0006\u00108\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\b|\u0010:J\u001b\u0010}\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\b}\u0010<J-\u0010~\u001a\u00020K2\u0006\u00108\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\b~\u0010\u007fJ-\u0010\u0080\u0001\u001a\u00020\u00072\u0006\u00108\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0005\b\u0080\u0001\u0010*J-\u0010\u0081\u0001\u001a\u00020\u00052\u0006\u00108\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0005\b\u0081\u0001\u0010*J2\u0010\u0083\u0001\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u00052\u0013\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070GH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0005\b\u0083\u0001\u0010JJ\u001d\u0010\u0084\u0001\u001a\u00020M2\u0006\u0010L\u001a\u00020KH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0005\b\u0084\u0001\u0010QJ\u001d\u0010\u0085\u0001\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u0005H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0005\b\u0085\u0001\u0010ZJ\u0013\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0016\u00a2\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001d\u0010\u008b\u0001\u001a\u00020\u00158\u0016X\u0096\u0004\u00a2\u0006\u000e\n\u0005\bs\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010aR\u001e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020d0\u008c\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001d\u0010\u0092\u0001\u001a\u00020\u00058\u0000X\u0080\u0004\u00a2\u0006\u000e\n\u0004\by\u0010~\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u00105\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b5\u0010\u0093\u0001R\u0018\u0010\u0094\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u008a\u0001\u0010~R\u0018\u0010\u0095\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0084\u0001\u0010~R\u001b\u0010\u0096\u0001\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R1\u0010\u0099\u0001\u001a\u00020K2\u0007\u0010\u0098\u0001\u001a\u00020K8\u0016@PX\u0096\u000e\u00a2\u0006\u0017\n\u0005\b\u0099\u0001\u0010k\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R1\u0010\u009e\u0001\u001a\u00020K2\u0007\u0010\u0098\u0001\u001a\u00020K8\u0016@PX\u0096\u000e\u00a2\u0006\u0017\n\u0005\b\u009e\u0001\u0010k\u001a\u0006\b\u009f\u0001\u0010\u009b\u0001\"\u0006\b\u00a0\u0001\u0010\u009d\u0001R\u001f\u0010\u00a5\u0001\u001a\u00030\u00a1\u00018\u0002X\u0082\u0004\u00a2\u0006\u000f\n\u0006\b\u00a2\u0001\u0010\u00a3\u0001\u0012\u0005\b\u00a4\u0001\u0010\u0012R\u0017\u0010\u00a8\u0001\u001a\u00030\u00a6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\bx\u0010\u00a7\u0001R\u001e\u0010\u00ab\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150\u00a9\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0080\u0001\u0010\u00aa\u0001R\u001d\u0010\u00ac\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u00a9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\bo\u0010\u00aa\u0001R\u0018\u0010\u00ad\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u00ad\u0001\u0010~R)\u0010\u00af\u0001\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\\\u0012\u0004\u0012\u00020\u00040G8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0083\u0001\u0010\u00ae\u0001R\u0016\u0010\u00b1\u0001\u001a\u00020j8BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\b\u00b0\u0001\u0010lR0\u0010\u00b8\u0001\u001a\u0005\u0018\u00010\u00b2\u00012\n\u0010\u00b3\u0001\u001a\u0005\u0018\u00010\u00b2\u00018B@BX\u0082\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00b4\u0001\u0010\u00b5\u0001\"\u0006\b\u00b6\u0001\u0010\u00b7\u0001R:\u0010\u00bd\u0001\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\\2\u000f\u0010\u00b3\u0001\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\\8B@BX\u0082\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00b9\u0001\u0010\u00ba\u0001\"\u0006\b\u00bb\u0001\u0010\u00bc\u0001R:\u0010\u00c0\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\\2\u000f\u0010\u00b3\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\\8B@BX\u0082\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00be\u0001\u0010\u00ba\u0001\"\u0006\b\u00bf\u0001\u0010\u00bc\u0001R\u0017\u0010\u00c1\u0001\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u0091\u0001R\u0016\u0010\u00c3\u0001\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\b\u00c2\u0001\u0010aR\u0016\u0010\u00c5\u0001\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\b\u00c4\u0001\u0010aR\u0019\u0010\u00c7\u0001\u001a\u0004\u0018\u00010T8VX\u0096\u0004\u00a2\u0006\b\u001a\u0006\b\u00a2\u0001\u0010\u00c6\u0001\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u00cc\u0001"}, d2={"Lio/ktor/utils/io/a;", "Lio/ktor/utils/io/c;", "Lio/ktor/utils/io/g;", "Lio/ktor/utils/io/j;", "", "", "minWriteSize", "Lkotlin/k0;", "L", "(I)V", "Ljava/nio/ByteBuffer;", "position", "available", "U", "(Ljava/nio/ByteBuffer;II)V", "v0", "()Ljava/nio/ByteBuffer;", "n0", "()V", "Lio/ktor/utils/io/internal/d;", "joined", "", "z0", "(Lio/ktor/utils/io/internal/d;)Z", "forceTermination", "A0", "(Z)Z", "idx", "H", "(Ljava/nio/ByteBuffer;I)I", "Lio/ktor/utils/io/core/a;", "dst", "consumed", "max", "W", "(Lio/ktor/utils/io/core/a;II)I", "", "offset", "length", "X", "([BII)I", "c0", "([BIILkotlin/coroutines/d;)Ljava/lang/Object;", "Lio/ktor/utils/io/core/internal/a;", "b0", "(Lio/ktor/utils/io/core/internal/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lio/ktor/utils/io/internal/i;", "capacity", "count", "G", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/i;I)V", "F", "current", "joining", "m0", "(Lio/ktor/utils/io/a;Lio/ktor/utils/io/internal/d;)Lio/ktor/utils/io/a;", "src", "M0", "(Ljava/nio/ByteBuffer;Lkotlin/coroutines/d;)Ljava/lang/Object;", "L0", "(Lio/ktor/utils/io/core/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "K", "(Lio/ktor/utils/io/internal/d;)V", "E0", "(Ljava/nio/ByteBuffer;)I", "D0", "(Lio/ktor/utils/io/core/a;)I", "F0", "N0", "O0", "min", "Lkotlin/Function1;", "block", "d0", "(ILkotlin/jvm/functions/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "limit", "Lio/ktor/utils/io/core/j;", "k0", "(J)Lio/ktor/utils/io/core/j;", "f0", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "q0", "r0", "", "cause", "p0", "(Ljava/lang/Throwable;)V", "size", "g0", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "i0", "Lkotlin/coroutines/d;", "continuation", "y0", "h0", "x0", "()Z", "P0", "(I)Z", "Lio/ktor/utils/io/internal/g$c;", "T", "()Lio/ktor/utils/io/internal/g$c;", "buffer", "j0", "(Lio/ktor/utils/io/internal/g$c;)V", "Lio/ktor/utils/io/internal/g;", "J", "()Lio/ktor/utils/io/internal/g;", "Lkotlinx/coroutines/d2;", "job", "j", "(Lkotlinx/coroutines/d2;)V", "close", "(Ljava/lang/Throwable;)Z", "b", "flush", "w0", "o0", "B0", "h", "d", "l0", "()Lio/ktor/utils/io/a;", "a", "l", "I", "(Lio/ktor/utils/io/a;JLio/ktor/utils/io/internal/d;Lkotlin/coroutines/d;)Ljava/lang/Object;", "i", "G0", "consumer", "k", "f", "C0", "", "toString", "()Ljava/lang/String;", "Z", "e", "autoFlush", "Lio/ktor/utils/io/pool/g;", "c", "Lio/ktor/utils/io/pool/g;", "pool", "getReservedSize$ktor_io", "()I", "reservedSize", "Lio/ktor/utils/io/internal/d;", "readPosition", "writePosition", "attachedJob", "Lkotlinx/coroutines/d2;", "<set-?>", "totalBytesRead", "P", "()J", "t0", "(J)V", "totalBytesWritten", "Q", "u0", "Lio/ktor/utils/io/internal/f;", "g", "Lio/ktor/utils/io/internal/f;", "getReadSession$annotations", "readSession", "Lio/ktor/utils/io/internal/l;", "Lio/ktor/utils/io/internal/l;", "writeSession", "Lio/ktor/utils/io/internal/b;", "Lio/ktor/utils/io/internal/b;", "readSuspendContinuationCache", "writeSuspendContinuationCache", "writeSuspensionSize", "Lkotlin/jvm/functions/l;", "writeSuspension", "O", "state", "Lio/ktor/utils/io/internal/c;", "value", "M", "()Lio/ktor/utils/io/internal/c;", "setClosed", "(Lio/ktor/utils/io/internal/c;)V", "closed", "N", "()Lkotlin/coroutines/d;", "s0", "(Lkotlin/coroutines/d;)V", "readOp", "R", "setWriteOp", "writeOp", "availableForRead", "m", "isClosedForRead", "S", "isClosedForWrite", "()Ljava/lang/Throwable;", "closedCause", "<init>", "(ZLio/ktor/utils/io/pool/g;I)V", "content", "(Ljava/nio/ByteBuffer;)V", "ktor-io"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nByteBufferChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteBufferChannel.kt\nio/ktor/utils/io/ByteBufferChannel\n+ 2 RingBufferCapacity.kt\nio/ktor/utils/io/internal/RingBufferCapacity\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n+ 5 Buffer.kt\nio/ktor/utils/io/core/Buffer\n+ 6 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n+ 7 Packet.kt\nio/ktor/utils/io/core/PacketKt\n+ 8 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 9 Output.kt\nio/ktor/utils/io/core/OutputKt\n+ 10 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,2411:1\n2110#1,2:2436\n459#1,4:2443\n466#1,2:2448\n464#1:2450\n459#1,4:2451\n466#1,2:2456\n464#1:2458\n459#1,4:2463\n466#1,2:2468\n464#1:2470\n459#1,4:2472\n466#1,2:2477\n464#1:2479\n849#1,4:2481\n459#1,4:2485\n466#1,2:2490\n464#1:2492\n853#1,15:2493\n849#1,4:2508\n459#1,4:2512\n466#1,2:2517\n464#1:2519\n853#1,15:2520\n849#1,4:2535\n459#1,4:2539\n466#1,2:2544\n464#1:2546\n853#1,15:2547\n849#1,4:2562\n459#1,4:2566\n466#1,2:2571\n464#1:2573\n853#1,15:2574\n849#1,4:2589\n459#1,4:2593\n466#1,2:2598\n464#1:2600\n853#1,15:2601\n849#1,4:2616\n459#1,4:2620\n466#1,2:2625\n464#1:2627\n853#1,15:2628\n459#1,4:2643\n466#1,2:2648\n464#1:2650\n964#1:2651\n966#1:2653\n1036#1,7:2654\n929#1,2:2661\n1043#1,2:2663\n931#1:2665\n1045#1:2666\n967#1,76:2667\n929#1,2:2743\n1043#1,2:2745\n931#1:2747\n1045#1:2748\n1030#1,3:2749\n979#1,32:2752\n1033#1:2784\n972#1:2785\n964#1:2786\n966#1:2788\n1036#1,7:2789\n929#1,2:2796\n1043#1,2:2798\n931#1:2800\n1045#1:2801\n967#1,76:2802\n929#1,2:2878\n1043#1,2:2880\n931#1:2882\n1045#1:2883\n1030#1,3:2884\n979#1,32:2887\n1033#1:2919\n972#1:2920\n964#1:2921\n966#1:2923\n1036#1,7:2924\n929#1,2:2931\n1043#1,2:2933\n931#1:2935\n1045#1:2936\n967#1,76:2937\n929#1,2:3013\n1043#1,2:3015\n931#1:3017\n1045#1:3018\n1030#1,3:3019\n979#1,32:3022\n1033#1:3054\n972#1:3055\n964#1:3056\n966#1:3058\n1036#1,7:3059\n929#1,2:3066\n1043#1,2:3068\n931#1:3070\n1045#1:3071\n967#1,76:3072\n929#1,2:3148\n1043#1,2:3150\n931#1:3152\n1045#1:3153\n1030#1,3:3154\n979#1,32:3157\n1033#1:3189\n972#1:3190\n1036#1,7:3191\n929#1,2:3198\n1043#1,2:3200\n931#1:3202\n1045#1:3203\n979#1,32:3204\n1019#1,24:3236\n929#1,2:3260\n1043#1,2:3262\n931#1:3264\n1045#1:3265\n1030#1,3:3266\n979#1,32:3269\n1033#1:3301\n993#1,18:3302\n1036#1,7:3320\n929#1,2:3327\n1043#1,2:3329\n931#1:3331\n1045#1:3332\n979#1,32:3333\n929#1,3:3365\n440#1:3370\n441#1,7:3372\n459#1,4:3381\n466#1,2:3386\n464#1:3388\n449#1,8:3389\n440#1:3397\n441#1,7:3399\n449#1,8:3407\n440#1:3415\n441#1,7:3417\n449#1,8:3426\n440#1:3434\n441#1,7:3436\n449#1,8:3444\n440#1:3452\n441#1,16:3454\n440#1:3470\n441#1,16:3472\n440#1:3488\n441#1,16:3490\n459#1,4:3506\n466#1,2:3511\n464#1:3513\n459#1,4:3515\n466#1,2:3520\n464#1:3522\n459#1,4:3523\n466#1,2:3528\n464#1:3530\n440#1:3533\n441#1,16:3535\n459#1,4:3551\n466#1,2:3556\n464#1:3558\n459#1,4:3559\n466#1,2:3564\n464#1:3566\n459#1,4:3569\n466#1,2:3574\n464#1:3576\n2197#1,3:3628\n2201#1,3:3632\n2341#1,3:3636\n2345#1:3640\n2197#1,3:3641\n2201#1,3:3645\n2346#1,5:3648\n2197#1,7:3653\n2197#1,3:3660\n2201#1,3:3664\n2341#1,3:3679\n2345#1,6:3683\n12#2:2412\n18#2:2413\n18#2:2415\n12#2:2416\n18#2:2421\n12#2:2429\n12#2:2431\n12#2:2442\n12#2:2447\n12#2:2455\n12#2:2461\n12#2:2467\n12#2:2476\n12#2:2489\n12#2:2516\n12#2:2543\n12#2:2570\n12#2:2597\n12#2:2624\n12#2:2647\n18#2:3379\n18#2:3380\n12#2:3385\n18#2:3406\n18#2:3425\n18#2:3443\n12#2:3510\n12#2:3514\n12#2:3519\n12#2:3527\n12#2:3555\n12#2:3563\n12#2:3567\n12#2:3568\n12#2:3573\n12#2:3577\n12#2:3622\n12#2:3623\n12#2:3624\n12#2:3625\n12#2:3626\n12#2:3627\n12#2:3631\n12#2:3635\n12#2:3644\n12#2:3663\n18#2:3667\n1#3:2414\n1#3:2652\n1#3:2787\n1#3:2922\n1#3:3057\n1#3:3371\n1#3:3398\n1#3:3416\n1#3:3435\n1#3:3453\n1#3:3471\n1#3:3489\n1#3:3534\n1#3:3639\n1#3:3682\n186#4,4:2417\n186#4,4:2422\n186#4,3:2426\n189#4:2430\n186#4,4:2432\n164#4,4:2438\n74#5:2459\n74#5:2462\n69#5:3424\n74#5:3589\n74#5:3611\n361#6:2460\n361#6:2471\n361#6:2480\n355#6:3368\n355#6:3369\n43#7:3531\n43#7:3532\n12#8,7:3578\n19#8,4:3596\n12#8,7:3600\n19#8,4:3618\n488#9,4:3585\n492#9,6:3590\n488#9,4:3607\n492#9,6:3612\n314#10,11:3668\n*S KotlinDebug\n*F\n+ 1 ByteBufferChannel.kt\nio/ktor/utils/io/ByteBufferChannel\n*L\n377#1:2436,2\n474#1:2443,4\n474#1:2448,2\n474#1:2450\n512#1:2451,4\n512#1:2456,2\n512#1:2458\n539#1:2463,4\n539#1:2468,2\n539#1:2470\n637#1:2472,4\n637#1:2477,2\n637#1:2479\n822#1:2481,4\n822#1:2485,4\n822#1:2490,2\n822#1:2492\n822#1:2493,15\n826#1:2508,4\n826#1:2512,4\n826#1:2517,2\n826#1:2519\n826#1:2520,15\n830#1:2535,4\n830#1:2539,4\n830#1:2544,2\n830#1:2546\n830#1:2547,15\n834#1:2562,4\n834#1:2566,4\n834#1:2571,2\n834#1:2573\n834#1:2574,15\n838#1:2589,4\n838#1:2593,4\n838#1:2598,2\n838#1:2600\n838#1:2601,15\n842#1:2616,4\n842#1:2620,4\n842#1:2625,2\n842#1:2627\n842#1:2628,15\n852#1:2643,4\n852#1:2648,2\n852#1:2650\n936#1:2651\n936#1:2653\n936#1:2654,7\n936#1:2661,2\n936#1:2663,2\n936#1:2665\n936#1:2666\n936#1:2667,76\n936#1:2743,2\n936#1:2745,2\n936#1:2747\n936#1:2748\n936#1:2749,3\n936#1:2752,32\n936#1:2784\n936#1:2785\n940#1:2786\n940#1:2788\n940#1:2789,7\n940#1:2796,2\n940#1:2798,2\n940#1:2800\n940#1:2801\n940#1:2802,76\n940#1:2878,2\n940#1:2880,2\n940#1:2882\n940#1:2883\n940#1:2884,3\n940#1:2887,32\n940#1:2919\n940#1:2920\n944#1:2921\n944#1:2923\n944#1:2924,7\n944#1:2931,2\n944#1:2933,2\n944#1:2935\n944#1:2936\n944#1:2937,76\n944#1:3013,2\n944#1:3015,2\n944#1:3017\n944#1:3018\n944#1:3019,3\n944#1:3022,32\n944#1:3054\n944#1:3055\n948#1:3056\n948#1:3058\n948#1:3059,7\n948#1:3066,2\n948#1:3068,2\n948#1:3070\n948#1:3071\n948#1:3072,76\n948#1:3148,2\n948#1:3150,2\n948#1:3152\n948#1:3153\n948#1:3154,3\n948#1:3157,32\n948#1:3189\n948#1:3190\n966#1:3191,7\n966#1:3198,2\n966#1:3200,2\n966#1:3202\n966#1:3203\n969#1:3204,32\n970#1:3236,24\n970#1:3260,2\n970#1:3262,2\n970#1:3264\n970#1:3265\n970#1:3266,3\n970#1:3269,32\n970#1:3301\n983#1:3302,18\n1029#1:3320,7\n1029#1:3327,2\n1029#1:3329,2\n1029#1:3331\n1029#1:3332\n1032#1:3333,32\n1042#1:3365,3\n1196#1:3370\n1196#1:3372,7\n1209#1:3381,4\n1209#1:3386,2\n1209#1:3388\n1196#1:3389,8\n1322#1:3397\n1322#1:3399,7\n1322#1:3407,8\n1352#1:3415\n1352#1:3417,7\n1352#1:3426,8\n1376#1:3434\n1376#1:3436,7\n1376#1:3444,8\n1455#1:3452\n1455#1:3454,16\n1525#1:3470\n1525#1:3472,16\n1535#1:3488\n1535#1:3490,16\n1640#1:3506,4\n1640#1:3511,2\n1640#1:3513\n1675#1:3515,4\n1675#1:3520,2\n1675#1:3522\n1693#1:3523,4\n1693#1:3528,2\n1693#1:3530\n1754#1:3533\n1754#1:3535,16\n1775#1:3551,4\n1775#1:3556,2\n1775#1:3558\n1796#1:3559,4\n1796#1:3564,2\n1796#1:3566\n1902#1:3569,4\n1902#1:3574,2\n1902#1:3576\n2209#1:3628,3\n2209#1:3632,3\n2225#1:3636,3\n2225#1:3640\n2225#1:3641,3\n2225#1:3645,3\n2225#1:3648,5\n2225#1:3653,7\n2231#1:3660,3\n2231#1:3664,3\n2326#1:3679,3\n2326#1:3683,6\n95#1:2412\n98#1:2413\n181#1:2415\n182#1:2416\n269#1:2421\n302#1:2429\n309#1:2431\n462#1:2442\n474#1:2447\n512#1:2455\n531#1:2461\n539#1:2467\n637#1:2476\n822#1:2489\n826#1:2516\n830#1:2543\n834#1:2570\n838#1:2597\n842#1:2624\n852#1:2647\n1198#1:3379\n1202#1:3380\n1209#1:3385\n1338#1:3406\n1364#1:3425\n1387#1:3443\n1640#1:3510\n1641#1:3514\n1675#1:3519\n1693#1:3527\n1775#1:3555\n1796#1:3563\n1858#1:3567\n1880#1:3568\n1902#1:3573\n1930#1:3577\n2139#1:3622\n2158#1:3623\n2164#1:3624\n2179#1:3625\n2184#1:3626\n2199#1:3627\n2209#1:3631\n2221#1:3635\n2225#1:3644\n2231#1:3663\n2258#1:3667\n936#1:2652\n940#1:2787\n944#1:2922\n948#1:3057\n1196#1:3371\n1322#1:3398\n1352#1:3416\n1376#1:3435\n1455#1:3453\n1525#1:3471\n1535#1:3489\n1754#1:3534\n2225#1:3639\n2326#1:3682\n224#1:2417,4\n276#1:2422,4\n292#1:2426,3\n292#1:2430\n316#1:2432,4\n398#1:2438,4\n513#1:2459\n505#1:2462\n1356#1:3424\n2072#1:3589\n2087#1:3611\n531#1:2460\n607#1:2471\n723#1:2480\n1099#1:3368\n1122#1:3369\n1725#1:3531\n1741#1:3532\n2069#1:3578,7\n2069#1:3596,4\n2084#1:3600,7\n2084#1:3618,4\n2071#1:3585,4\n2071#1:3590,6\n2086#1:3607,4\n2086#1:3612,6\n2311#1:3668,11\n*E\n"})
public class a
implements io.ktor.utils.io.c,
g,
io.ktor.utils.io.j {
    @NotNull
    public static final a l = new /* Unavailable Anonymous Inner Class!! */;
    private static final AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_state");
    private static final AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_closed");
    private static final AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_readOp");
    static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_writeOp");
    @NotNull
    private volatile Object _closed;
    @NotNull
    private volatile Object _readOp;
    @NotNull
    private volatile Object _state;
    @NotNull
    volatile Object _writeOp;
    @Nullable
    private volatile d2 attachedJob;
    private final boolean b;
    @NotNull
    private final io.ktor.utils.io.pool.g<g.c> c;
    private final int d;
    private int e;
    private int f;
    @NotNull
    private final io.ktor.utils.io.internal.f g;
    @NotNull
    private final io.ktor.utils.io.internal.l h;
    @NotNull
    private final io.ktor.utils.io.internal.b<Boolean> i;
    @NotNull
    private final io.ktor.utils.io.internal.b<k0> j;
    @Nullable
    private volatile io.ktor.utils.io.internal.d joining;
    @NotNull
    private final kotlin.jvm.functions.l<kotlin.coroutines.d<? super k0>, Object> k;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    private volatile int writeSuspensionSize;

    public a(@NotNull ByteBuffer object) {
        y.j((Object)object, (String)"content");
        this(false, (io.ktor.utils.io.pool.g<g.c>)io.ktor.utils.io.internal.e.b(), 0);
        object = ((ByteBuffer)object).slice();
        y.i((Object)object, (String)"content.slice()");
        object = new g.c((ByteBuffer)object, 0);
        ((io.ktor.utils.io.internal.g)object).b.i();
        this._state = ((g.c)((Object)object)).l();
        this.o0();
        io.ktor.utils.io.k.a((io.ktor.utils.io.j)this);
        this.B0();
    }

    public a(boolean bl, @NotNull io.ktor.utils.io.pool.g<g.c> g4, int n4) {
        y.j(g4, (String)"pool");
        this.b = bl;
        this.c = g4;
        this.d = n4;
        this._state = g.a.c;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        this.g = new io.ktor.utils.io.internal.f(this);
        this.h = new io.ktor.utils.io.internal.l(this);
        this.i = new io.ktor.utils.io.internal.b();
        this.j = new io.ktor.utils.io.internal.b();
        this.k = new kotlin.jvm.functions.l<kotlin.coroutines.d<? super k0>, Object>(this){
            final a g;
            {
                this.g = a4;
                super(1);
            }

            /*
             * Enabled aggressive block sorting
             */
            @NotNull
            public final Object a(@NotNull kotlin.coroutines.d<? super k0> d4) {
                y.j(d4, (String)"ucont");
                int n4 = this.g.writeSuspensionSize;
                block0: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
                    Object object;
                    if ((object = this.g.M()) != null && (object = object.c()) != null) {
                        io.ktor.utils.io.b.a((Throwable)object);
                        throw new kotlin.j();
                    }
                    if (!this.g.P0(n4)) {
                        object = u.d;
                        d4.resumeWith(u.b((Object)k0.a));
                        break;
                    }
                    object = this.g;
                    kotlin.coroutines.d d5 = kotlin.coroutines.intrinsics.b.c(d4);
                    a a4 = this.g;
                    do {
                        if (((a)object).R() != null) {
                            throw new IllegalStateException("Operation is already in progress".toString());
                        }
                        if (!a4.P0(n4)) continue block0;
                    } while (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)(atomicReferenceFieldUpdater = p), (Object)object, null, (Object)d5));
                    if (a4.P0(n4) || !androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)atomicReferenceFieldUpdater, (Object)object, (Object)d5, null)) break;
                }
                this.g.L(n4);
                if (this.g.x0()) {
                    this.g.q0();
                }
                return kotlin.coroutines.intrinsics.b.f();
            }
        };
    }

    public /* synthetic */ a(boolean bl, io.ktor.utils.io.pool.g g4, int n4, int n5, kotlin.jvm.internal.p p4) {
        if ((n5 & 2) != 0) {
            g4 = io.ktor.utils.io.internal.e.c();
        }
        if ((n5 & 4) != 0) {
            n4 = 8;
        }
        this(bl, (io.ktor.utils.io.pool.g<g.c>)g4, n4);
    }

    private final boolean A0(boolean bl) {
        block9: {
            Object object;
            g.f f4;
            Object object2;
            Throwable throwable = null;
            do {
                object2 = this._state;
                io.ktor.utils.io.internal.g g4 = (io.ktor.utils.io.internal.g)object2;
                io.ktor.utils.io.internal.c c4 = this.M();
                object = throwable;
                if (throwable != null) {
                    object = c4 != null ? c4.b() : null;
                    if (object == null) {
                        ((io.ktor.utils.io.internal.g)throwable).b.j();
                    }
                    this.r0();
                    object = null;
                }
                if (g4 == (f4 = g.f.c)) {
                    return true;
                }
                if (g4 != g.a.c) {
                    if (c4 != null && g4 instanceof g.b && (g4.b.k() || c4.b() != null)) {
                        if (c4.b() != null) {
                            g4.b.f();
                        }
                        object = ((g.b)g4).g();
                    } else {
                        if (!bl || !(g4 instanceof g.b) || !g4.b.k()) break block9;
                        object = ((g.b)g4).g();
                    }
                }
                throwable = object;
            } while (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)m, (Object)this, (Object)object2, (Object)((Object)f4)));
            if (object != null && this.O() == f4) {
                this.j0((g.c)((Object)object));
            }
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final int D0(io.ktor.utils.io.core.a a4) {
        Throwable throwable2;
        io.ktor.utils.io.internal.c c4;
        long l4;
        a a5;
        Object object;
        block12: {
            block14: {
                block13: {
                    object = this.joining;
                    if (object == null) break block13;
                    a5 = this.m0(this, (io.ktor.utils.io.internal.d)object);
                    object = a5;
                    if (a5 != null) break block14;
                }
                object = this;
            }
            ByteBuffer byteBuffer = ((a)object).w0();
            int n4 = 0;
            if (byteBuffer == null) {
                return 0;
            }
            a5 = super.O().b;
            l4 = ((a)object).Q();
            try {
                int n5;
                c4 = super.M();
                if (c4 != null) break block12;
                while ((n5 = a5.n(Math.min(a4.j() - a4.h(), byteBuffer.remaining()))) != 0) {
                    io.ktor.utils.io.core.g.a((io.ktor.utils.io.core.a)a4, (ByteBuffer)byteBuffer, (int)n5);
                    super.U(byteBuffer, super.H(byteBuffer, ((a)object).f + (n4 += n5)), ((io.ktor.utils.io.internal.i)a5)._availableForWrite$internal);
                }
                super.G(byteBuffer, (io.ktor.utils.io.internal.i)a5, n4);
            }
            catch (Throwable throwable2) {}
            if (a5.h() || ((a)object).e()) {
                ((a)object).flush();
            }
            if (object != this) {
                this.u0(this.Q() + (((a)object).Q() - l4));
            }
            ((a)object).o0();
            ((a)object).B0();
            return n4;
        }
        io.ktor.utils.io.b.a((Throwable)c4.c());
        a4 = new kotlin.j();
        throw a4;
        if (a5.h() || ((a)object).e()) {
            ((a)object).flush();
        }
        if (object != this) {
            this.u0(this.Q() + (((a)object).Q() - l4));
        }
        ((a)object).o0();
        ((a)object).B0();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final int E0(ByteBuffer object) {
        Throwable throwable2;
        io.ktor.utils.io.internal.c c4;
        long l4;
        a a4;
        Object object2;
        block13: {
            block15: {
                block14: {
                    object2 = this.joining;
                    if (object2 == null) break block14;
                    a4 = this.m0(this, (io.ktor.utils.io.internal.d)object2);
                    object2 = a4;
                    if (a4 != null) break block15;
                }
                object2 = this;
            }
            ByteBuffer byteBuffer = ((a)object2).w0();
            int n4 = 0;
            if (byteBuffer == null) {
                return 0;
            }
            a4 = super.O().b;
            l4 = ((a)object2).Q();
            try {
                int n5;
                c4 = super.M();
                if (c4 != null) break block13;
                int n6 = ((Buffer)object).limit();
                while ((n5 = n6 - ((Buffer)object).position()) != 0 && (n5 = a4.n(Math.min(n5, byteBuffer.remaining()))) != 0) {
                    if (n5 <= 0) {
                        object = new IllegalArgumentException("Failed requirement.".toString());
                        throw object;
                    }
                    ((ByteBuffer)object).limit(((Buffer)object).position() + n5);
                    byteBuffer.put((ByteBuffer)object);
                    super.U(byteBuffer, super.H(byteBuffer, ((a)object2).f + (n4 += n5)), ((io.ktor.utils.io.internal.i)a4)._availableForWrite$internal);
                }
                ((ByteBuffer)object).limit(n6);
                super.G(byteBuffer, (io.ktor.utils.io.internal.i)a4, n4);
            }
            catch (Throwable throwable2) {}
            if (a4.h() || ((a)object2).e()) {
                ((a)object2).flush();
            }
            if (object2 != this) {
                this.u0(this.Q() + (((a)object2).Q() - l4));
            }
            ((a)object2).o0();
            ((a)object2).B0();
            return n4;
        }
        io.ktor.utils.io.b.a((Throwable)c4.c());
        object = new kotlin.j();
        throw object;
        if (a4.h() || ((a)object2).e()) {
            ((a)object2).flush();
        }
        if (object2 != this) {
            this.u0(this.Q() + (((a)object2).Q() - l4));
        }
        ((a)object2).o0();
        ((a)object2).B0();
        throw throwable2;
    }

    private final void F(ByteBuffer byteBuffer, io.ktor.utils.io.internal.i i4, int n4) {
        if (n4 >= 0) {
            this.e = this.H(byteBuffer, this.e + n4);
            i4.a(n4);
            this.t0(this.P() + (long)n4);
            this.r0();
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final int F0(byte[] object, int n4, int n5) {
        Throwable throwable2;
        io.ktor.utils.io.internal.c c4;
        long l4;
        a a4;
        Object object2;
        block13: {
            block15: {
                block14: {
                    object2 = this.joining;
                    if (object2 == null) break block14;
                    a4 = this.m0(this, (io.ktor.utils.io.internal.d)object2);
                    object2 = a4;
                    if (a4 != null) break block15;
                }
                object2 = this;
            }
            ByteBuffer byteBuffer = ((a)object2).w0();
            int n6 = 0;
            if (byteBuffer == null) {
                return 0;
            }
            a4 = super.O().b;
            l4 = ((a)object2).Q();
            try {
                int n7;
                c4 = super.M();
                if (c4 != null) break block13;
                while ((n7 = a4.n(Math.min(n5 - n6, byteBuffer.remaining()))) != 0) {
                    if (n7 <= 0) {
                        object = new IllegalArgumentException;
                        object("Failed requirement.".toString());
                        throw object;
                    }
                    byteBuffer.put((byte[])object, n4 + n6, n7);
                    super.U(byteBuffer, super.H(byteBuffer, ((a)object2).f + (n6 += n7)), ((io.ktor.utils.io.internal.i)a4)._availableForWrite$internal);
                }
                super.G(byteBuffer, (io.ktor.utils.io.internal.i)a4, n6);
            }
            catch (Throwable throwable2) {}
            if (a4.h() || ((a)object2).e()) {
                ((a)object2).flush();
            }
            if (object2 != this) {
                this.u0(this.Q() + (((a)object2).Q() - l4));
            }
            ((a)object2).o0();
            ((a)object2).B0();
            return n6;
        }
        io.ktor.utils.io.b.a((Throwable)c4.c());
        object = new kotlin.j;
        object();
        throw object;
        if (a4.h() || ((a)object2).e()) {
            ((a)object2).flush();
        }
        if (object2 != this) {
            this.u0(this.Q() + (((a)object2).Q() - l4));
        }
        ((a)object2).o0();
        ((a)object2).B0();
        throw throwable2;
    }

    private final void G(ByteBuffer byteBuffer, io.ktor.utils.io.internal.i i4, int n4) {
        if (n4 >= 0) {
            this.f = this.H(byteBuffer, this.f + n4);
            i4.c(n4);
            this.u0(this.Q() + (long)n4);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final int H(ByteBuffer byteBuffer, int n4) {
        int n5 = n4;
        if (n4 >= byteBuffer.capacity() - this.d) {
            n5 = n4 - (byteBuffer.capacity() - this.d);
        }
        return n5;
    }

    static /* synthetic */ Object H0(a a4, byte[] byArray, int n4, int n5, kotlin.coroutines.d<? super Integer> d4) {
        Object object = a4.joining;
        if (object != null && (object = a4.m0(a4, (io.ktor.utils.io.internal.d)object)) != null) {
            return ((a)object).G0(byArray, n4, n5, d4);
        }
        int n6 = a4.F0(byArray, n4, n5);
        if (n6 > 0) {
            return kotlin.coroutines.jvm.internal.b.d((int)n6);
        }
        return a4.O0(byArray, n4, n5, d4);
    }

    static /* synthetic */ Object I0(a object, io.ktor.utils.io.core.a a4, kotlin.coroutines.d<? super k0> d4) {
        ((a)object).D0(a4);
        if (a4.j() > a4.h()) {
            if ((object = ((a)object).L0(a4, d4)) == kotlin.coroutines.intrinsics.b.f()) {
                return object;
            }
            return k0.a;
        }
        return k0.a;
    }

    static /* synthetic */ Object J0(a object, ByteBuffer byteBuffer, kotlin.coroutines.d<? super k0> d4) {
        Object object2 = ((a)object).joining;
        if (object2 != null && (object2 = ((a)object).m0((a)object, (io.ktor.utils.io.internal.d)object2)) != null) {
            object = ((a)object2).a(byteBuffer, d4);
            if (object == kotlin.coroutines.intrinsics.b.f()) {
                return object;
            }
            return k0.a;
        }
        ((a)object).E0(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return k0.a;
        }
        if ((object = ((a)object).M0(byteBuffer, d4)) == kotlin.coroutines.intrinsics.b.f()) {
            return object;
        }
        return k0.a;
    }

    private final void K(io.ktor.utils.io.internal.d d4) {
        io.ktor.utils.io.internal.c c4 = this.M();
        if (c4 == null) {
            return;
        }
        this.joining = null;
        if (!d4.b()) {
            d4.c().flush();
            d4.a();
            return;
        }
        io.ktor.utils.io.internal.g g4 = d4.c().O();
        boolean bl = g4 instanceof g.g || g4 instanceof g.e;
        if (c4.b() == null && bl) {
            d4.c().flush();
        } else {
            d4.c().close(c4.b());
        }
        d4.a();
    }

    static /* synthetic */ Object K0(a object, byte[] byArray, int n4, int n5, kotlin.coroutines.d<? super k0> d4) {
        Object object2 = ((a)object).joining;
        int n6 = n4;
        int n7 = n5;
        if (object2 != null) {
            object2 = ((a)object).m0((a)object, (io.ktor.utils.io.internal.d)object2);
            n6 = n4;
            n7 = n5;
            if (object2 != null) {
                object = ((a)object2).i(byArray, n4, n5, d4);
                if (object == kotlin.coroutines.intrinsics.b.f()) {
                    return object;
                }
                return k0.a;
            }
        }
        while (n7 > 0 && (n4 = ((a)object).F0(byArray, n6, n7)) != 0) {
            n6 += n4;
            n7 -= n4;
        }
        if (n7 == 0) {
            return k0.a;
        }
        if ((object = ((a)object).N0(byArray, n6, n7, d4)) == kotlin.coroutines.intrinsics.b.f()) {
            return object;
        }
        return k0.a;
    }

    private final void L(int n4) {
        io.ktor.utils.io.internal.g g4;
        Object object = this.joining;
        if (object != null && (object = object.c()) != null) {
            ((a)object).flush();
        }
        do {
            if ((g4 = this.O()) == (object = g.f.c)) {
                return;
            }
            g4.b.e();
        } while (g4 != this.O());
        int n5 = g4.b._availableForWrite$internal;
        if (g4.b._availableForRead$internal >= 1) {
            this.q0();
        }
        g4 = this.joining;
        if (n5 >= n4 && (g4 == null || this.O() == object)) {
            this.r0();
        }
    }

    /*
     * Unable to fully structure code
     */
    private final Object L0(io.ktor.utils.io.core.a var1_1, kotlin.coroutines.d<? super k0> var2_2) {
        block6: {
            block7: {
                block8: {
                    if (!(var2_2 instanceof k)) ** GOTO lbl-1000
                    var4_3 = var2_2;
                    var3_4 = var4_3.p;
                    if ((var3_4 & -2147483648) != 0) {
                        var4_3.p = var3_4 + -2147483648;
                        var2_2 = var4_3;
                    } else // 2 sources

                    {
                        var2_2 = new kotlin.coroutines.jvm.internal.d(this, var2_2){
                            Object l;
                            Object m;
                            Object n;
                            final a o;
                            int p;
                            {
                                this.o = a4;
                                super(d4);
                            }

                            @Override
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object object) {
                                this.n = object;
                                this.p |= Integer.MIN_VALUE;
                                return this.o.L0(null, (kotlin.coroutines.d<? super k0>)this);
                            }
                        };
                    }
                    var5_5 = var2_2.n;
                    var7_6 = kotlin.coroutines.intrinsics.b.f();
                    var3_4 = var2_2.p;
                    if (var3_4 == 0) break block6;
                    if (var3_4 == 1) break block7;
                    if (var3_4 != 2) break block8;
                    v.b((Object)var5_5);

                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            var4_3 = (io.ktor.utils.io.core.a)var2_2.m;
            var1_1 = (a)var2_2.l;
            v.b((Object)var5_5);

        }
        v.b((Object)var5_5);
        var5_5 = this;
        var4_3 = var1_1;
        var6_7 = var2_2;
        while (var4_3.j() > var4_3.h()) {
            block9: {
                var6_7.l = var5_5;
                var6_7.m = var4_3;
                var6_7.p = 1;
                var2_2 = var6_7;
                var1_1 = var5_5;
                if (var5_5.C0(1, var6_7) == var7_6) {
                    return var7_6;
                }
lbl37:

                var5_5 = var1_1.joining;
                if (var5_5 != null && (var5_5 = super.m0((a)var1_1, (io.ktor.utils.io.internal.d)var5_5)) != null) {
                    var2_2.l = null;
                    var2_2.m = null;
                    var2_2.p = 2;
                    if (var5_5.l((io.ktor.utils.io.core.a)var4_3, var2_2) == var7_6) {
                        return var7_6;
                    } else {

                    }
                }
                break block9;
lbl45:

                return k0.a;
            }
            super.D0((io.ktor.utils.io.core.a)var4_3);
            var6_7 = var2_2;
            var5_5 = var1_1;
        }
        return k0.a;
    }

    private final io.ktor.utils.io.internal.c M() {
        return (io.ktor.utils.io.internal.c)this._closed;
    }

    /*
     * Unable to fully structure code
     */
    private final Object M0(ByteBuffer var1_1, kotlin.coroutines.d<? super k0> var2_2) {
        block6: {
            block7: {
                block8: {
                    if (!(var2_2 instanceof j)) ** GOTO lbl-1000
                    var4_3 = var2_2;
                    var3_4 = var4_3.p;
                    if ((var3_4 & -2147483648) != 0) {
                        var4_3.p = var3_4 + -2147483648;
                        var2_2 = var4_3;
                    } else // 2 sources

                    {
                        var2_2 = new kotlin.coroutines.jvm.internal.d(this, var2_2){
                            Object l;
                            Object m;
                            Object n;
                            final a o;
                            int p;
                            {
                                this.o = a4;
                                super(d4);
                            }

                            @Override
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object object) {
                                this.n = object;
                                this.p |= Integer.MIN_VALUE;
                                return this.o.M0(null, (kotlin.coroutines.d<? super k0>)this);
                            }
                        };
                    }
                    var5_5 = var2_2.n;
                    var7_6 = kotlin.coroutines.intrinsics.b.f();
                    var3_4 = var2_2.p;
                    if (var3_4 == 0) break block6;
                    if (var3_4 == 1) break block7;
                    if (var3_4 != 2) break block8;
                    v.b((Object)var5_5);

                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            var4_3 = (ByteBuffer)var2_2.m;
            var1_1 = (a)var2_2.l;
            v.b((Object)var5_5);

        }
        v.b((Object)var5_5);
        var5_5 = this;
        var4_3 = var1_1;
        var6_7 = var2_2;
        while (var4_3.hasRemaining()) {
            block9: {
                var6_7.l = var5_5;
                var6_7.m = var4_3;
                var6_7.p = 1;
                var2_2 = var6_7;
                var1_1 = var5_5;
                if (var5_5.C0(1, var6_7) == var7_6) {
                    return var7_6;
                }
lbl37:

                var5_5 = var1_1.joining;
                if (var5_5 != null && (var5_5 = super.m0((a)var1_1, (io.ktor.utils.io.internal.d)var5_5)) != null) {
                    var2_2.l = null;
                    var2_2.m = null;
                    var2_2.p = 2;
                    if (var5_5.a((ByteBuffer)var4_3, var2_2) == var7_6) {
                        return var7_6;
                    } else {

                    }
                }
                break block9;
lbl45:

                return k0.a;
            }
            super.E0((ByteBuffer)var4_3);
            var6_7 = var2_2;
            var5_5 = var1_1;
        }
        return k0.a;
    }

    private final kotlin.coroutines.d<Boolean> N() {
        return (kotlin.coroutines.d)this._readOp;
    }

    /*
     * Unable to fully structure code
     */
    private final Object N0(byte[] var1_1, int var2_2, int var3_3, kotlin.coroutines.d<? super k0> var4_4) {
        block4: {
            block5: {
                if (!(var4_4 instanceof l)) ** GOTO lbl-1000
                var6_5 = var4_4;
                var5_6 = var6_5.r;
                if ((var5_6 & -2147483648) != 0) {
                    var6_5.r = var5_6 + -2147483648;
                    var4_4 = var6_5;
                } else // 2 sources

                {
                    var4_4 = new kotlin.coroutines.jvm.internal.d(this, var4_4){
                        Object l;
                        Object m;
                        int n;
                        int o;
                        Object p;
                        final a q;
                        int r;
                        {
                            this.q = a4;
                            super(d4);
                        }

                        @Override
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object object) {
                            this.p = object;
                            this.r |= Integer.MIN_VALUE;
                            return this.q.N0(null, 0, 0, (kotlin.coroutines.d<? super k0>)this);
                        }
                    };
                }
                var7_7 = var4_4.p;
                var8_8 = kotlin.coroutines.intrinsics.b.f();
                var5_6 = var4_4.r;
                if (var5_6 == 0) break block4;
                if (var5_6 != 1) break block5;
                var2_2 = var4_4.o;
                var3_3 = var4_4.n;
                var1_1 = (byte[])var4_4.m;
                var6_5 = (a)var4_4.l;
                v.b((Object)var7_7);

            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v.b((Object)var7_7);
        var6_5 = this;
        while (var3_3 > 0) {
            var4_4.l = var6_5;
            var4_4.m = var1_1;
            var4_4.n = var2_2;
            var4_4.o = var3_3;
            var4_4.r = 1;
            var7_7 = var6_5.G0(var1_1, var2_2, var3_3, var4_4);
            if (var7_7 == var8_8) {
                return var8_8;
            }
            var5_6 = var3_3;
            var3_3 = var2_2;
            var2_2 = var5_6;
lbl37:

            var5_6 = ((Number)var7_7).intValue();
            var3_3 += var5_6;
            var5_6 = var2_2 - var5_6;
            var2_2 = var3_3;
            var3_3 = var5_6;
        }
        return k0.a;
    }

    private final io.ktor.utils.io.internal.g O() {
        return (io.ktor.utils.io.internal.g)this._state;
    }

    /*
     * Unable to fully structure code
     */
    private final Object O0(byte[] var1_1, int var2_2, int var3_3, kotlin.coroutines.d<? super Integer> var4_4) {
        block6: {
            block7: {
                block8: {
                    if (!(var4_4 instanceof m)) ** GOTO lbl-1000
                    var6_5 = var4_4;
                    var5_6 = var6_5.r;
                    if ((var5_6 & -2147483648) != 0) {
                        var6_5.r = var5_6 + -2147483648;
                        var4_4 = var6_5;
                    } else // 2 sources

                    {
                        var4_4 = new kotlin.coroutines.jvm.internal.d(this, (kotlin.coroutines.d<? super m>)var4_4){
                            Object l;
                            Object m;
                            int n;
                            int o;
                            Object p;
                            final a q;
                            int r;
                            {
                                this.q = a4;
                                super(d4);
                            }

                            @Override
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object object) {
                                this.p = object;
                                this.r |= Integer.MIN_VALUE;
                                return this.q.O0(null, 0, 0, (kotlin.coroutines.d<? super Integer>)this);
                            }
                        };
                    }
                    var6_5 = var4_4.p;
                    var9_7 = kotlin.coroutines.intrinsics.b.f();
                    var5_6 = var4_4.r;
                    if (var5_6 == 0) break block6;
                    if (var5_6 == 1) break block7;
                    if (var5_6 != 2) break block8;
                    v.b((Object)var6_5);
                    var1_1 = var6_5;

                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            var3_3 = var4_4.o;
            var2_2 = var4_4.n;
            var7_8 = (byte[])var4_4.m;
            var1_1 = (a)var4_4.l;
            v.b((Object)var6_5);
            var6_5 = var7_8;

        }
        v.b((Object)var6_5);
        var7_8 = this;
        var6_5 = var1_1;
        var8_9 = var4_4;
        do {
            block9: {
                var8_9.l = var7_8;
                var8_9.m = var6_5;
                var8_9.n = var2_2;
                var8_9.o = var3_3;
                var8_9.r = 1;
                var4_4 = var8_9;
                var1_1 = var7_8;
                if (var7_8.C0(1, (kotlin.coroutines.d<? super k0>)var8_9) == var9_7) {
                    return var9_7;
                }
lbl43:

                var7_8 = var1_1.joining;
                if (var7_8 != null && (var7_8 = super.m0((a)var1_1, (io.ktor.utils.io.internal.d)var7_8)) != null) {
                    var4_4.l = null;
                    var4_4.m = null;
                    var4_4.r = 2;
                    var1_1 = var4_4 = super.O0((byte[])var6_5, var2_2, var3_3, (kotlin.coroutines.d<? super Integer>)var4_4);
                    if (var4_4 == var9_7) {
                        return var9_7;
                    } else {

                    }
                }
                break block9;
lbl52:

                return var1_1;
            }
            var5_6 = super.F0((byte[])var6_5, var2_2, var3_3);
            var8_9 = var4_4;
            var7_8 = var1_1;
        } while (var5_6 <= 0);
        return kotlin.coroutines.jvm.internal.b.d((int)var5_6);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean P0(int n4) {
        boolean bl;
        io.ktor.utils.io.internal.d d4 = this.joining;
        io.ktor.utils.io.internal.g g4 = this.O();
        io.ktor.utils.io.internal.c c4 = this.M();
        boolean bl2 = false;
        if (c4 != null) {
            return bl2;
        }
        if (d4 == null) {
            bl = bl2;
            if (g4.b._availableForWrite$internal >= n4) return bl;
            bl = bl2;
            if (g4 == g.a.c) return bl;
            return true;
        }
        bl = bl2;
        if (g4 == g.f.c) return bl;
        bl = bl2;
        if (g4 instanceof g.g) return bl;
        bl = bl2;
        if (g4 instanceof g.e) return bl;
        return true;
    }

    private final kotlin.coroutines.d<k0> R() {
        return (kotlin.coroutines.d)this._writeOp;
    }

    private final g.c T() {
        g.c c4 = (g.c)((Object)this.c.O());
        c4.b.j();
        return c4;
    }

    private final void U(ByteBuffer byteBuffer, int n4, int n5) {
        if (n4 >= 0) {
            if (n5 >= 0) {
                byteBuffer.limit(kotlin.ranges.j.i(n5 + n4, byteBuffer.capacity() - this.d));
                byteBuffer.position(n4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static /* synthetic */ Object V(a object, int n4, kotlin.jvm.functions.l<? super ByteBuffer, k0> object2, kotlin.coroutines.d<? super k0> d4) {
        Throwable throwable2;
        block15: {
            block14: {
                if (n4 < 0) {
                    throw new IllegalArgumentException("min should be positive or zero".toString());
                }
                ByteBuffer byteBuffer = ((a)object).v0();
                if (byteBuffer != null) {
                    int n5;
                    io.ktor.utils.io.internal.i i4;
                    block13: {
                        i4 = ((a)object).O().b;
                        try {
                            n5 = i4._availableForRead$internal;
                            if (n5 != 0) break block13;
                            super.n0();
                            ((a)object).B0();
                            break block14;
                        }
                        catch (Throwable throwable2) {
                            break block15;
                        }
                    }
                    n5 = i4._availableForRead$internal;
                    if (n5 > 0 && n5 >= n4) {
                        int n6 = byteBuffer.position();
                        n5 = byteBuffer.limit();
                        object2.invoke((ByteBuffer)byteBuffer);
                        if (n5 != byteBuffer.limit()) {
                            object2 = new IllegalStateException("Buffer limit modified.".toString());
                            throw object2;
                        }
                        n5 = byteBuffer.position() - n6;
                        if (n5 < 0) {
                            object2 = new IllegalStateException("Position has been moved backward: pushback is not supported.".toString());
                            throw object2;
                        }
                        if (!i4.m(n5)) {
                            object2 = new IllegalStateException("Check failed.".toString());
                            throw object2;
                        }
                        super.F(byteBuffer, i4, n5);
                        n5 = 1;
                    } else {
                        n5 = 0;
                    }
                    super.n0();
                    ((a)object).B0();
                    if (n5 != 0) {
                        return k0.a;
                    }
                }
            }
            if (((a)object).m() && n4 > 0) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Got EOF but at least ");
                ((StringBuilder)object).append(n4);
                ((StringBuilder)object).append(" bytes were expected");
                throw new EOFException(((StringBuilder)object).toString());
            }
            if ((object = ((a)object).d0(n4, (kotlin.jvm.functions.l<? super ByteBuffer, k0>)object2, d4)) == kotlin.coroutines.intrinsics.b.f()) {
                return object;
            }
            return k0.a;
        }
        ((a)object).n0();
        ((a)object).B0();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final int W(io.ktor.utils.io.core.a a4, int n4, int n5) {
        Throwable throwable2;
        block8: {
            int n6;
            int n7 = n4;
            do {
                int n8;
                block9: {
                    io.ktor.utils.io.internal.i i4;
                    ByteBuffer byteBuffer;
                    block7: {
                        byteBuffer = this.v0();
                        n8 = 0;
                        n4 = 0;
                        if (byteBuffer != null) {
                            i4 = this.O().b;
                            try {
                                n6 = i4._availableForRead$internal;
                                if (n6 != 0) break block7;
                                this.n0();
                                this.B0();
                            }
                            catch (Throwable throwable2) {
                                break block8;
                            }
                        }
                        n6 = 0;
                        n4 = n8;
                        n8 = n6;
                        break block9;
                    }
                    n6 = a4.f() - a4.j();
                    n8 = i4.l(Math.min(byteBuffer.remaining(), Math.min(n6, n5)));
                    if (n8 > 0) {
                        if (n6 < byteBuffer.remaining()) {
                            byteBuffer.limit(byteBuffer.position() + n6);
                        }
                        io.ktor.utils.io.core.e.a((io.ktor.utils.io.core.a)a4, (ByteBuffer)byteBuffer);
                        this.F(byteBuffer, i4, n8);
                        n4 = 1;
                    }
                    this.n0();
                    this.B0();
                }
                n6 = n7 + n8;
                n5 -= n8;
                if (n4 == 0 || a4.f() <= a4.j()) break;
                n7 = n6;
            } while (this.O().b._availableForRead$internal > 0);
            return n6;
        }
        this.n0();
        this.B0();
        throw throwable2;
    }

    private final int X(byte[] byArray, int n4, int n5) {
        Throwable throwable2;
        block8: {
            ByteBuffer byteBuffer = this.v0();
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            if (byteBuffer == null) {
                n6 = n7;
            } else {
                block7: {
                    int n9;
                    int n10;
                    int n11;
                    io.ktor.utils.io.internal.i i4 = this.O().b;
                    try {
                        if (i4._availableForRead$internal == 0) break block7;
                        n11 = byteBuffer.capacity();
                        n7 = this.d;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    while (true) {
                        n10 = n5 - n8;
                        n6 = n8;
                        if (n10 == 0) break block7;
                        n9 = this.e;
                        n10 = i4.l(Math.min(n11 - n7 - n9, n10));
                        n6 = n8;
                        if (n10 == 0) break block7;
                        break;
                    }
                    {
                        byteBuffer.limit(n9 + n10);
                        byteBuffer.position(n9);
                        byteBuffer.get(byArray, n4 + n8, n10);
                        this.F(byteBuffer, i4, n10);
                        n8 += n10;
                        continue;
                    }
                }
                this.n0();
                this.B0();
            }
            return n6;
        }
        this.n0();
        this.B0();
        throw throwable2;
    }

    static /* synthetic */ int Y(a a4, io.ktor.utils.io.core.a a5, int n4, int n5, int n6, Object object) {
        if (object == null) {
            if ((n6 & 2) != 0) {
                n4 = 0;
            }
            if ((n6 & 4) != 0) {
                n5 = a5.f() - a5.j();
            }
            return a4.W(a5, n4, n5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAsMuchAsPossible");
    }

    static /* synthetic */ Object Z(a a4, io.ktor.utils.io.core.internal.a a5, kotlin.coroutines.d<? super Integer> d4) {
        int n4;
        int n5 = a.Y(a4, a5, 0, 0, 6, null);
        if (n5 == 0 && a4.M() != null) {
            n4 = a4.O().b.e() ? a.Y(a4, a5, 0, 0, 6, null) : -1;
        } else {
            n4 = n5;
            if (n5 <= 0) {
                n4 = n5;
                if (a5.f() > a5.j()) {
                    return a4.b0(a5, d4);
                }
            }
        }
        return kotlin.coroutines.jvm.internal.b.d((int)n4);
    }

    static /* synthetic */ Object a0(a a4, byte[] byArray, int n4, int n5, kotlin.coroutines.d<? super Integer> d4) {
        int n6;
        int n7 = a4.X(byArray, n4, n5);
        if (n7 == 0 && a4.M() != null) {
            n6 = a4.O().b.e() ? a4.X(byArray, n4, n5) : -1;
        } else {
            n6 = n7;
            if (n7 <= 0) {
                if (n5 == 0) {
                    n6 = n7;
                } else {
                    return a4.c0(byArray, n4, n5, d4);
                }
            }
        }
        return kotlin.coroutines.jvm.internal.b.d((int)n6);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final Object b0(io.ktor.utils.io.core.internal.a var1_1, kotlin.coroutines.d<? super Integer> var2_2) {
        block8: {
            block9: {
                block5: {
                    block6: {
                        block7: {
                            if (!(var2_2 instanceof e)) ** GOTO lbl-1000
                            var4_3 /* !! */  = var2_2;
                            var3_4 = var4_3 /* !! */ .p;
                            if ((var3_4 & -2147483648) != 0) {
                                var4_3 /* !! */ .p = var3_4 + -2147483648;
                                var2_2 = var4_3 /* !! */ ;
                            } else // 2 sources

                            {
                                var2_2 = new kotlin.coroutines.jvm.internal.d(this, (kotlin.coroutines.d<? super e>)var2_2){
                                    Object l;
                                    Object m;
                                    Object n;
                                    final a o;
                                    int p;
                                    {
                                        this.o = a4;
                                        super(d4);
                                    }

                                    @Override
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object) {
                                        this.n = object;
                                        this.p |= Integer.MIN_VALUE;
                                        return this.o.b0(null, (kotlin.coroutines.d<? super Integer>)this);
                                    }
                                };
                            }
                            var4_3 /* !! */  = var2_2.n;
                            var7_5 = kotlin.coroutines.intrinsics.b.f();
                            var3_4 = var2_2.p;
                            if (var3_4 == 0) break block5;
                            if (var3_4 == 1) break block6;
                            if (var3_4 != 2) break block7;
                            v.b((Object)var4_3 /* !! */ );
                            break block8;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    var1_1 /* !! */  = (io.ktor.utils.io.core.internal.a)var2_2.m;
                    var6_6 = (a)var2_2.l;
                    v.b((Object)var4_3 /* !! */ );
                    var5_7 = var4_3 /* !! */ ;
                    break block9;
                }
                v.b((Object)var4_3 /* !! */ );
                var2_2.l = this;
                var2_2.m = var1_1 /* !! */ ;
                var2_2.p = 1;
                var5_7 = this.g0(1, (kotlin.coroutines.d<? super Boolean>)var2_2);
                if (var5_7 == var7_5) {
                    return var7_5;
                }
                var6_6 = var4_3 /* !! */  = this;
            }
            if (!((Boolean)var5_7).booleanValue()) {
                return kotlin.coroutines.jvm.internal.b.d((int)-1);
            }
            var2_2.l = null;
            var2_2.m = null;
            var2_2.p = 2;
            var1_1 /* !! */  = var6_6.d(var1_1 /* !! */ , (kotlin.coroutines.d<? super Integer>)var2_2);
            var4_3 /* !! */  = var1_1 /* !! */ ;
            if (var1_1 /* !! */  == var7_5) {
                return var7_5;
            }
        }
        return var4_3 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     */
    private final Object c0(byte[] var1_1, int var2_2, int var3_3, kotlin.coroutines.d<? super Integer> var4_4) {
        block8: {
            block9: {
                block5: {
                    block6: {
                        block7: {
                            if (!(var4_4 instanceof d)) ** GOTO lbl-1000
                            var6_5 = var4_4;
                            var5_6 = var6_5.r;
                            if ((var5_6 & -2147483648) != 0) {
                                var6_5.r = var5_6 + -2147483648;
                                var4_4 = var6_5;
                            } else // 2 sources

                            {
                                var4_4 = new kotlin.coroutines.jvm.internal.d(this, (kotlin.coroutines.d<? super d>)var4_4){
                                    Object l;
                                    Object m;
                                    int n;
                                    int o;
                                    Object p;
                                    final a q;
                                    int r;
                                    {
                                        this.q = a4;
                                        super(d4);
                                    }

                                    @Override
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object) {
                                        this.p = object;
                                        this.r |= Integer.MIN_VALUE;
                                        return this.q.c0(null, 0, 0, (kotlin.coroutines.d<? super Integer>)this);
                                    }
                                };
                            }
                            var6_5 = var4_4.p;
                            var9_7 = kotlin.coroutines.intrinsics.b.f();
                            var5_6 = var4_4.r;
                            if (var5_6 == 0) break block5;
                            if (var5_6 == 1) break block6;
                            if (var5_6 != 2) break block7;
                            v.b((Object)var6_5);
                            break block8;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    var3_3 = var4_4.o;
                    var2_2 = var4_4.n;
                    var8_8 = (byte[])var4_4.m;
                    var1_1 = (a)var4_4.l;
                    v.b((Object)var6_5);
                    var7_9 = var6_5;
                    break block9;
                }
                v.b((Object)var6_5);
                var4_4.l = this;
                var4_4.m = var1_1;
                var4_4.n = var2_2;
                var4_4.o = var3_3;
                var4_4.r = 1;
                var7_9 = this.g0(1, (kotlin.coroutines.d<? super Boolean>)var4_4);
                if (var7_9 == var9_7) {
                    return var9_7;
                }
                var6_5 = this;
                var8_8 = var1_1;
                var1_1 = var6_5;
            }
            if (!((Boolean)var7_9).booleanValue()) {
                return kotlin.coroutines.jvm.internal.b.d((int)-1);
            }
            var4_4.l = null;
            var4_4.m = null;
            var4_4.r = 2;
            var6_5 = var1_1 = var1_1.h(var8_8, var2_2, var3_3, (kotlin.coroutines.d<? super Integer>)var4_4);
            if (var1_1 == var9_7) {
                return var9_7;
            }
        }
        return var6_5;
    }

    /*
     * Unable to fully structure code
     */
    private final Object d0(int var1_1, kotlin.jvm.functions.l<? super ByteBuffer, k0> var2_2, kotlin.coroutines.d<? super k0> var3_3) {
        block9: {
            block10: {
                block6: {
                    block7: {
                        block8: {
                            if (!(var3_3 instanceof f)) ** GOTO lbl-1000
                            var5_4 = var3_3;
                            var4_5 = var5_4.q;
                            if ((var4_5 & -2147483648) != 0) {
                                var5_4.q = var4_5 + -2147483648;
                                var3_3 = var5_4;
                            } else // 2 sources

                            {
                                var3_3 = new kotlin.coroutines.jvm.internal.d(this, (kotlin.coroutines.d<? super f>)var3_3){
                                    Object l;
                                    Object m;
                                    int n;
                                    Object o;
                                    final a p;
                                    int q;
                                    {
                                        this.p = a4;
                                        super(d4);
                                    }

                                    @Override
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object) {
                                        this.o = object;
                                        this.q |= Integer.MIN_VALUE;
                                        return this.p.d0(0, null, (kotlin.coroutines.d<? super k0>)this);
                                    }
                                };
                            }
                            var5_4 = var3_3.o;
                            var7_6 = kotlin.coroutines.intrinsics.b.f();
                            var4_5 = var3_3.q;
                            if (var4_5 == 0) break block6;
                            if (var4_5 == 1) break block7;
                            if (var4_5 != 2) break block8;
                            v.b((Object)var5_4);
                            break block9;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    var1_1 = var3_3.n;
                    var2_2 = (kotlin.jvm.functions.l)var3_3.m;
                    var6_7 = (a)var3_3.l;
                    v.b((Object)var5_4);
                    break block10;
                }
                v.b((Object)var5_4);
                var4_5 = kotlin.ranges.j.e(var1_1, 1);
                var3_3.l = this;
                var3_3.m = var2_2;
                var3_3.n = var1_1;
                var3_3.q = 1;
                var5_4 = this.g0(var4_5, (kotlin.coroutines.d<? super Boolean>)var3_3);
                if (var5_4 == var7_6) {
                    return var7_6;
                }
                var6_7 = this;
            }
            if (!((Boolean)var5_4).booleanValue()) {
                if (var1_1 <= 0) {
                    return k0.a;
                }
                var2_2 = new StringBuilder();
                var2_2.append("Got EOF but at least ");
                var2_2.append(var1_1);
                var2_2.append(" bytes were expected");
                throw new EOFException(var2_2.toString());
            }
            var3_3.l = null;
            var3_3.m = null;
            var3_3.q = 2;
            if (var6_7.k(var1_1, (kotlin.jvm.functions.l<? super ByteBuffer, k0>)var2_2, (kotlin.coroutines.d<? super k0>)var3_3) == var7_6) {
                return var7_6;
            }
        }
        return k0.a;
    }

    static /* synthetic */ Object e0(a a4, long l4, kotlin.coroutines.d<? super io.ktor.utils.io.core.j> object) {
        if (a4.S()) {
            object = a4.g();
            if (object == null) {
                return a4.k0(l4);
            }
            io.ktor.utils.io.b.a(object);
            throw new kotlin.j();
        }
        return a4.f0(l4, (kotlin.coroutines.d<? super io.ktor.utils.io.core.j>)object);
    }

    /*
     * Exception decompiling
     */
    private final Object f0(long var1_1, kotlin.coroutines.d<? super io.ktor.utils.io.core.j> var3_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 221->235)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private final Object g0(int n4, kotlin.coroutines.d<? super Boolean> object) {
        int n5 = this.O().b._availableForRead$internal;
        boolean bl = true;
        if (n5 >= n4) {
            return kotlin.coroutines.jvm.internal.b.a((boolean)true);
        }
        io.ktor.utils.io.internal.c c4 = this.M();
        if (c4 != null) {
            object = c4.b();
            if (object == null) {
                object = this.O().b;
                if (!object.e() || object._availableForRead$internal < n4) {
                    bl = false;
                }
                if (this.N() == null) {
                    return kotlin.coroutines.jvm.internal.b.a((boolean)bl);
                }
                throw new IllegalStateException("Read operation is already in progress");
            }
            io.ktor.utils.io.b.a(object);
            throw new kotlin.j();
        }
        if (n4 == 1) {
            return this.h0(1, (kotlin.coroutines.d<? super Boolean>)object);
        }
        return this.i0(n4, (kotlin.coroutines.d<? super Boolean>)object);
    }

    /*
     * Unable to fully structure code
     */
    private final Object h0(int var1_1, kotlin.coroutines.d<? super Boolean> var2_2) {
        block13: {
            block11: {
                block10: {
                    if (!(var2_2 instanceof h)) ** GOTO lbl-1000
                    var4_3 = var2_2;
                    var3_7 = var4_3.p;
                    if ((var3_7 & -2147483648) != 0) {
                        var4_3.p = var3_7 + -2147483648;
                        var2_2 = var4_3;
                    } else // 2 sources

                    {
                        var2_2 = new kotlin.coroutines.jvm.internal.d(this, (kotlin.coroutines.d<? super h>)var2_2){
                            Object l;
                            int m;
                            Object n;
                            final a o;
                            int p;
                            {
                                this.o = a4;
                                super(d4);
                            }

                            @Override
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object object) {
                                this.n = object;
                                this.p |= Integer.MIN_VALUE;
                                return this.o.h0(0, (kotlin.coroutines.d<? super Boolean>)this);
                            }
                        };
                    }
                    var4_3 = var2_2.n;
                    var5_8 = kotlin.coroutines.intrinsics.b.f();
                    var3_7 = var2_2.p;
                    if (var3_7 != 0) {
                        if (var3_7 == 1) {
                            var2_2 = (a)var2_2.l;
                            try {
                                v.b((Object)var4_3);
                                var2_2 = var4_3;
                                break block10;
                            }
                            catch (Throwable var4_4) {
                                break block11;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b((Object)var4_3);
                    var4_3 = this.O();
                    if (var4_3.b._availableForRead$internal < var1_1 && (this.joining == null || this.R() == null || var4_3 != g.a.c && !(var4_3 instanceof g.b))) {
                        block12: {
                            try {
                                var2_2.l = this;
                                var2_2.m = var1_1;
                                var2_2.p = 1;
                                var4_3 = this.i;
                                this.y0(var1_1, (kotlin.coroutines.d<? super Boolean>)var4_3);
                                var4_3 = var4_3.f((kotlin.coroutines.d<Boolean>)kotlin.coroutines.intrinsics.b.c((kotlin.coroutines.d)var2_2));
                                if (var4_3 != kotlin.coroutines.intrinsics.b.f()) break block12;
                                kotlin.coroutines.jvm.internal.g.c((kotlin.coroutines.d)var2_2);
                            }
                            catch (Throwable var4_5) {
                                var2_2 = this;
                                break block11;
                            }
                        }
                        var2_2 = var4_3;
                        if (var4_3 == var5_8) {
                            return var5_8;
                        } else {

                        }
                    }
                    break block13;
                }
                return var2_2;
            }
            super.s0(null);
            throw var4_6;
        }
        return kotlin.coroutines.jvm.internal.b.a((boolean)true);
    }

    /*
     * Unable to fully structure code
     */
    private final Object i0(int var1_1, kotlin.coroutines.d<? super Boolean> var2_2) {
        block9: {
            block10: {
                if (!(var2_2 instanceof i)) ** GOTO lbl-1000
                var6_3 = var2_2;
                var3_4 = var6_3.p;
                if ((var3_4 & -2147483648) != 0) {
                    var6_3.p = var3_4 + -2147483648;
                    var2_2 = var6_3;
                } else // 2 sources

                {
                    var2_2 = new kotlin.coroutines.jvm.internal.d(this, var2_2){
                        Object l;
                        int m;
                        Object n;
                        final a o;
                        int p;
                        {
                            this.o = a4;
                            super(d4);
                        }

                        @Override
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object object) {
                            this.n = object;
                            this.p |= Integer.MIN_VALUE;
                            return this.o.i0(0, (kotlin.coroutines.d<? super Boolean>)this);
                        }
                    };
                }
                var7_5 = var2_2.n;
                var9_6 = kotlin.coroutines.intrinsics.b.f();
                var3_4 = var2_2.p;
                var5_7 = false;
                if (var3_4 == 0) break block9;
                if (var3_4 != 1) break block10;
                var1_1 = var2_2.m;
                var6_3 = (a)var2_2.l;
                v.b((Object)var7_5);

            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v.b((Object)var7_5);
        var6_3 = this;
        do {
            if (super.O().b._availableForRead$internal >= var1_1) {
                return kotlin.coroutines.jvm.internal.b.a((boolean)true);
            }
            var7_5 = super.M();
            if (var7_5 != null) {
                if (var7_5.b() == null) {
                    var2_2 = super.O().b;
                    var4_9 = var5_7;
                    if (var2_2.e()) {
                        var4_9 = var5_7;
                        if (var2_2._availableForRead$internal >= var1_1) {
                            var4_9 = true;
                        }
                    }
                    if (super.N() == null) {
                        return kotlin.coroutines.jvm.internal.b.a((boolean)var4_9);
                    }
                    throw new IllegalStateException("Read operation is already in progress");
                }
                io.ktor.utils.io.b.a((Throwable)var7_5.b());
                throw new kotlin.j();
            }
            var2_2.l = var6_3;
            var2_2.m = var1_1;
            var2_2.p = 1;
            var7_5 = var8_8 = super.h0(var1_1, var2_2);
            if (var8_8 != var9_6) continue;
            return var9_6;
lbl48:

        } while (((Boolean)var7_5).booleanValue());
        return kotlin.coroutines.jvm.internal.b.a((boolean)false);
    }

    private final void j0(g.c c4) {
        this.c.o((Object)c4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final io.ktor.utils.io.core.j k0(long var1_1) {
        block7: {
            block9: {
                var4_2 = new io.ktor.utils.io.core.i(null, 1, null);
                try {
                    var3_3 = io.ktor.utils.io.core.internal.g.d((p)var4_2, (int)1, null);
                }
                catch (Throwable var3_5) {
                    break block7;
                }
                try // 2 sources

                {
                    while (true) {
                        if ((long)(var3_3.f() - var3_3.j()) <= var1_1) break;
                        var3_3.s((int)var1_1);
                        break;
                    }
                }
                catch (Throwable var3_4) {
                    break block9;
                }
                if ((var1_1 -= (long)a.Y(this, var3_3, 0, 0, 6, null)) > 0L && !this.m()) {
                    var3_3 = io.ktor.utils.io.core.internal.g.d((p)var4_2, (int)1, (io.ktor.utils.io.core.internal.a)var3_3);

                }
                var4_2.h();
                return var4_2.c0();
            }
            var4_2.h();
            throw var3_4;
        }
        var4_2.release();
        throw var3_5;
    }

    private final a m0(a a4, io.ktor.utils.io.internal.d d4) {
        a a5;
        io.ktor.utils.io.internal.d d5;
        do {
            if (a4.O() != g.f.c) {
                return null;
            }
            a5 = d4.c();
            d5 = a5.joining;
            a4 = a5;
            d4 = d5;
        } while (d5 != null);
        return a5;
    }

    private final void n0() {
        g.b b4;
        io.ktor.utils.io.internal.g g4;
        Object object;
        Object object2;
        io.ktor.utils.io.internal.g g5 = null;
        do {
            object = this._state;
            io.ktor.utils.io.internal.g g6 = (io.ktor.utils.io.internal.g)object;
            b4 = (g.b)g5;
            if (b4 != null) {
                b4.b.j();
                this.r0();
                g5 = null;
            }
            object2 = g6.e();
            b4 = g5;
            g4 = object2;
            if (object2 instanceof g.b) {
                b4 = g5;
                g4 = object2;
                if (this.O() == g6) {
                    b4 = g5;
                    g4 = object2;
                    if (object2.b.k()) {
                        g4 = g.a.c;
                        b4 = object2;
                    }
                }
            }
            object2 = m;
            g5 = b4;
        } while (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)object2, (Object)this, (Object)object, (Object)g4));
        g5 = g.a.c;
        if (g4 == g5) {
            if (b4 != null) {
                this.j0(b4.g());
            }
            this.r0();
            return;
        }
        if (g4 instanceof g.b && g4.b.g() && g4.b.k() && androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)object2, (Object)this, (Object)g4, (Object)g5)) {
            g4.b.j();
            this.j0(((g.b)g4).g());
            this.r0();
        }
    }

    private final void p0(Throwable throwable) {
        Object object;
        kotlin.coroutines.d d4 = o.getAndSet(this, null);
        if (d4 != null) {
            if (throwable != null) {
                object = u.d;
                d4.resumeWith(u.b((Object)v.a((Throwable)throwable)));
            } else {
                boolean bl = this.O().b._availableForRead$internal > 0;
                d4.resumeWith(u.b((Object)bl));
            }
        }
        if ((d4 = (kotlin.coroutines.d)p.getAndSet(this, null)) != null) {
            object = u.d;
            object = throwable;
            if (throwable == null) {
                object = new io.ktor.utils.io.p("Byte channel was closed");
            }
            d4.resumeWith(u.b((Object)v.a((Throwable)object)));
        }
    }

    private final void q0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
        Throwable throwable = null;
        if ((atomicReferenceFieldUpdater = (kotlin.coroutines.d)atomicReferenceFieldUpdater.getAndSet(this, null)) != null) {
            io.ktor.utils.io.internal.c c4 = this.M();
            if (c4 != null) {
                throwable = c4.b();
            }
            if (throwable != null) {
                c4 = u.d;
                atomicReferenceFieldUpdater.resumeWith(u.b((Object)v.a((Throwable)throwable)));
            } else {
                throwable = u.d;
                atomicReferenceFieldUpdater.resumeWith(u.b((Object)Boolean.TRUE));
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private final void r0() {
        void var1_4;
        io.ktor.utils.io.internal.g g4;
        io.ktor.utils.io.internal.c c4;
        kotlin.coroutines.d<k0> d4;
        do {
            if ((d4 = this.R()) == null) {
                return;
            }
            c4 = this.M();
            if (c4 != null || this.joining == null || (g4 = this.O()) instanceof g.g || g4 instanceof g.e || g4 == g.f.c) continue;
            return;
        } while (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)p, (Object)this, d4, null));
        if (c4 == null) {
            u.a a4 = u.d;
            k0 k02 = k0.a;
        } else {
            g4 = u.d;
            Object object = v.a((Throwable)c4.c());
        }
        d4.resumeWith(u.b((Object)var1_4));
    }

    private final void s0(kotlin.coroutines.d<? super Boolean> d4) {
        this._readOp = d4;
    }

    private final ByteBuffer v0() {
        io.ktor.utils.io.internal.g g4;
        Object object;
        do {
            if (y.e((Object)(g4 = (io.ktor.utils.io.internal.g)(object = this._state)), (Object)((Object)g.f.c)) || y.e((Object)g4, (Object)((Object)g.a.c))) {
                object = this.M();
                if (object != null && (object = object.b()) != null) {
                    io.ktor.utils.io.b.a((Throwable)object);
                    throw new kotlin.j();
                }
                return null;
            }
            Object object2 = this.M();
            if (object2 != null && (object2 = object2.b()) != null) {
                io.ktor.utils.io.b.a((Throwable)object2);
                throw new kotlin.j();
            }
            if (g4.b._availableForRead$internal != 0) continue;
            return null;
        } while (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)m, (Object)this, (Object)object, (Object)(g4 = g4.c())));
        object = g4.a();
        this.U((ByteBuffer)object, this.e, g4.b._availableForRead$internal);
        return object;
    }

    private final boolean x0() {
        boolean bl = this.joining != null && (this.O() == g.a.c || this.O() instanceof g.b);
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final Object y0(int n4, kotlin.coroutines.d<? super Boolean> d4) {
        Object object;
        block7: {
            block0: while (true) {
                u.a a4;
                object = this.O();
                if (object.b._availableForRead$internal >= n4 || this.joining != null && this.R() != null && (object == g.a.c || object instanceof g.b)) break block7;
                object = this.M();
                if (object != null) {
                    if (object.b() != null) {
                        a4 = u.d;
                        d4.resumeWith(u.b((Object)v.a((Throwable)object.b())));
                        return kotlin.coroutines.intrinsics.b.f();
                    }
                    boolean bl = this.O().b.e();
                    int n5 = this.O().b._availableForRead$internal;
                    boolean bl2 = false;
                    n4 = n5 >= n4 ? 1 : 0;
                    object = u.d;
                    boolean bl3 = bl2;
                    if (bl) {
                        bl3 = bl2;
                        if (n4 != 0) {
                            bl3 = true;
                        }
                    }
                    d4.resumeWith(u.b((Object)bl3));
                    return kotlin.coroutines.intrinsics.b.f();
                }
                while (this.N() == null) {
                    if (this.M() != null) continue block0;
                    object = this.O();
                    if (object.b._availableForRead$internal >= n4 || this.joining != null && this.R() != null && (object == g.a.c || object instanceof g.b)) continue block0;
                    object = o;
                    if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)object, (Object)this, null, d4)) continue;
                    if (this.M() == null) {
                        a4 = this.O();
                        if (a4.b._availableForRead$internal < n4 && (this.joining == null || this.R() == null || a4 != g.a.c && !(a4 instanceof g.b))) return kotlin.coroutines.intrinsics.b.f();
                    }
                    if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)object, (Object)this, d4, null)) return kotlin.coroutines.intrinsics.b.f();
                    continue block0;
                }
                break;
            }
            throw new IllegalStateException("Operation is already in progress".toString());
        }
        object = u.d;
        d4.resumeWith(u.b((Object)Boolean.TRUE));
        return kotlin.coroutines.intrinsics.b.f();
    }

    private final boolean z0(io.ktor.utils.io.internal.d d4) {
        if (!this.A0(true)) {
            return false;
        }
        this.K(d4);
        d4 = o.getAndSet(this, null);
        if (d4 != null) {
            u.a a4 = u.d;
            d4.resumeWith(u.b((Object)v.a((Throwable)new IllegalStateException("Joining is in progress"))));
        }
        this.r0();
        return true;
    }

    public final boolean B0() {
        if (this.M() != null && this.A0(false)) {
            io.ktor.utils.io.internal.d d4 = this.joining;
            if (d4 != null) {
                this.K(d4);
            }
            this.q0();
            this.r0();
            return true;
        }
        return false;
    }

    @Nullable
    public final Object C0(int n4, @NotNull kotlin.coroutines.d<? super k0> object) {
        if (!this.P0(n4)) {
            object = this.M();
            if (object != null && (object = object.c()) != null) {
                io.ktor.utils.io.b.a((Throwable)object);
                throw new kotlin.j();
            }
            return k0.a;
        }
        this.writeSuspensionSize = n4;
        if (this.attachedJob != null) {
            Object object2 = this.k.invoke((kotlin.coroutines.d<? super k0>)object);
            if (object2 == kotlin.coroutines.intrinsics.b.f()) {
                kotlin.coroutines.jvm.internal.g.c((kotlin.coroutines.d)object);
            }
            if (object2 == kotlin.coroutines.intrinsics.b.f()) {
                return object2;
            }
            return k0.a;
        }
        Object object3 = this.j;
        this.k.invoke((kotlin.coroutines.d<? super k0>)object3);
        object3 = ((io.ktor.utils.io.internal.b)object3).f((kotlin.coroutines.d<k0>)kotlin.coroutines.intrinsics.b.c((kotlin.coroutines.d)object));
        if (object3 == kotlin.coroutines.intrinsics.b.f()) {
            kotlin.coroutines.jvm.internal.g.c((kotlin.coroutines.d)object);
        }
        if (object3 == kotlin.coroutines.intrinsics.b.f()) {
            return object3;
        }
        return k0.a;
    }

    @Nullable
    public Object G0(@NotNull byte[] byArray, int n4, int n5, @NotNull kotlin.coroutines.d<? super Integer> d4) {
        return a.H0(this, byArray, n4, n5, d4);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final Object I(@NotNull a var1_1, long var2_6, @Nullable io.ktor.utils.io.internal.d var4_7, @NotNull kotlin.coroutines.d<? super Long> var5_8) {
        block67: {
            block79: {
                block76: {
                    block77: {
                        block78: {
                            var18_11 = var1_1;
                            if (!(var5_8 instanceof c)) ** GOTO lbl-1000
                            var16_16 = var5_8;
                            var6_17 = var16_16.A;
                            if ((var6_17 & -2147483648) != 0) {
                                var16_16.A = var6_17 + -2147483648;
                                var5_8 = var16_16;
                            } else // 2 sources

                            {
                                var5_8 = new kotlin.coroutines.jvm.internal.d(this, (kotlin.coroutines.d<? super c>)var5_8){
                                    int A;
                                    Object l;
                                    Object m;
                                    Object n;
                                    Object o;
                                    Object p;
                                    Object q;
                                    Object r;
                                    Object s;
                                    Object t;
                                    Object u;
                                    long v;
                                    long w;
                                    boolean x;
                                    Object y;
                                    final a z;
                                    {
                                        this.z = a4;
                                        super(d4);
                                    }

                                    @Override
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object) {
                                        this.y = object;
                                        this.A |= Integer.MIN_VALUE;
                                        return this.z.I(null, 0L, null, this);
                                    }
                                };
                            }
                            var19_18 = var5_8.y;
                            var17_19 = kotlin.coroutines.intrinsics.b.f();
                            var6_17 = var5_8.A;
                            if (var6_17 == 0) break block76;
                            if (var6_17 == 1) break block77;
                            if (var6_17 == 2) break block78;
                            if (var6_17 != 3) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            var14_26 = var5_8.x;
                            var8_27 = var5_8.v;
                            var1_1 = (t0)var5_8.o;
                            var16_16 = (io.ktor.utils.io.internal.d)var5_8.n;
                            var24_28 = (a)var5_8.m;
                            var4_7 = var20_29 = (a)var5_8.l;
                            try {
                                v.b((Object)var19_18);
                                var23_30 = var17_19;
                                var19_18 = var5_8;
                                var5_8 = var1_1;

                            }
                            catch (Throwable var1_2) {
                                break block67;
                            }
                        }
                        var14_26 = var5_8.x;
                        var2_6 = var5_8.v;
                        var18_11 = (t0)var5_8.o;
                        var16_16 = (io.ktor.utils.io.internal.d)var5_8.n;
                        var22_31 = (a)var5_8.m;
                        var4_7 = var1_1 = (a)var5_8.l;
                        v.b((Object)var19_18);

                    }
                    var2_6 = var5_8.w;
                    var14_26 = var5_8.x;
                    var8_27 = var5_8.v;
                    var22_31 = (a)var5_8.u;
                    var24_28 = (ByteBuffer)var5_8.t;
                    var26_32 /* !! */  = (io.ktor.utils.io.internal.i)var5_8.s;
                    var16_16 = (io.ktor.utils.io.internal.i)var5_8.r;
                    var1_1 = (a)var5_8.q;
                    var18_11 = (a)var5_8.p;
                    var21_33 = (t0)var5_8.o;
                    var20_29 = (io.ktor.utils.io.internal.d)var5_8.n;
                    var25_34 = (a)var5_8.m;
                    var4_7 = (a)var5_8.l;
                    try {
                        v.b((Object)var19_18);
                        var19_18 = var20_29;
                        var23_30 = var18_11;
                        var18_11 = var19_18;
                        var19_18 = var5_8;
                        var20_29 = var17_19;
                        var5_8 = var23_30;
                        var23_30 = var26_32 /* !! */ ;
                        var17_19 = var25_34;
                        if (true) ** GOTO lbl178
                    }
                    catch (Throwable var5_9) {
                        var17_19 = var1_1;
                        var1_1 = var4_7;
                    }
                    break block79;
                }
                v.b((Object)var19_18);
                if (var1_1.m()) {
                    if (var4_7 != null) {
                        if (super.z0((io.ktor.utils.io.internal.d)var4_7) == false) throw new IllegalStateException("Check failed.".toString());
                    }
                    if (var1_1.g() == null) return kotlin.coroutines.jvm.internal.b.e((long)0L);
                    this.close(var1_1.g());
                    return kotlin.coroutines.jvm.internal.b.e((long)0L);
                }
                if (var4_7 != null && super.z0((io.ktor.utils.io.internal.d)var4_7)) {
                    return kotlin.coroutines.jvm.internal.b.e((long)0L);
                }
                var14_26 = this.e();
                try {
                    var16_16 = new t0();
                    return var16_16;
                }
                finally {
                    var1_1 = this;
                }
                block43: while (true) {
                    block75: {
                        block68: {
                            block74: {
                                block70: {
                                    block69: {
                                        block73: {
                                            var4_7 = var1_1;
                                            var15_38 = var14_26;
                                            var22_31 = var5_8;
                                            var21_33 = var1_1;
                                            {
                                                block81: {
                                                    block80: {
                                                        if (var5_8.c >= var2_6) ** GOTO lbl511
                                                        var4_7 = var1_1;
                                                        var20_29 = var1_1.joining;
                                                        if (var20_29 == null) break block80;
                                                        var4_7 = var1_1;
                                                        var20_29 = var21_33 = super.m0((a)var1_1, (io.ktor.utils.io.internal.d)var20_29);
                                                        if (var21_33 != null) break block81;
                                                    }
                                                    var20_29 = var1_1;
                                                }
                                                var4_7 = var1_1;
                                                var24_28 = var20_29.w0();
                                                if (var24_28 == null) {
                                                    var20_29 = var19_18;
                                                    break block68;
                                                }
                                                var4_7 = var1_1;
                                                var21_33 = super.O().b;
                                                var4_7 = var1_1;
                                                var8_27 = var20_29.Q();
                                            }
                                            try {
                                                var4_7 = super.M();
                                                if (var4_7 != null) {
                                                    io.ktor.utils.io.b.a((Throwable)var4_7.c());
                                                    var4_7 = new kotlin.j();
                                                    throw var4_7;
                                                }
                                                var4_7 = var17_19;
                                                var22_31 = var21_33;
                                                var10_36 = var2_6;
                                                var23_30 = var20_29;
                                                var25_34 = var1_1;
                                                var26_32 /* !! */  = var5_8;
                                                var17_19 = var23_30;
                                                var2_6 = var8_27;
                                                var20_29 = var4_7;
                                                var4_7 = var1_1;
                                                var8_27 = var10_36;
                                                var5_8 = var21_33;
                                                var21_33 = var26_32 /* !! */ ;
                                                var1_1 = var17_19;
                                                var17_19 = var19_18;
                                                var19_18 = var16_16;
                                                var16_16 = var25_34;
                                            }
        // Removed invalid catch block
                                                var16_16 = var21_33;
                                                var2_6 = var8_27;
                                                var18_11 = var1_1;
                                                break;
                                            }
                                            while (true) {
                                                block72: {
                                                    block71: {
                                                        if (var21_33.c >= var8_27) break block69;
                                                        var6_17 = var22_31._availableForWrite$internal;
                                                        if (var6_17 != 0) ** GOTO lbl207
                                                        var17_19.l = var16_16;
                                                        var17_19.m = var18_11;
                                                        var17_19.n = var19_18;
                                                        var17_19.o = var21_33;
                                                        var17_19.p = var4_7;
                                                        var17_19.q = var1_1;
                                                        var17_19.r = var5_8;
                                                        var17_19.s = var22_31;
                                                        var17_19.t = var24_28;
                                                        var17_19.u = var23_30;
                                                        var17_19.v = var8_27;
                                                        var17_19.x = var14_26;
                                                        {
        // Removed invalid catch block
                                                        var17_19.w = var2_6;
                                                        var17_19.A = 1;
                                                        var26_32 /* !! */  = var18_11;
                                                        var18_11 = var23_30.C0(1, (kotlin.coroutines.d<? super k0>)var17_19);
                                                        if (var18_11 == var20_29) {
                                                            return var20_29;
                                                        }
                                                        var18_11 = var19_18;
                                                        var25_34 = var23_30;
                                                        var19_18 = var17_19;
                                                        var27_39 = var5_8;
                                                        var17_19 = var26_32 /* !! */ ;
                                                        var23_30 = var22_31;
                                                        var5_8 = var4_7;
                                                        var4_7 = var16_16;
                                                        var16_16 = var27_39;
                                                        var22_31 = var25_34;
                                                        {
        // Removed invalid catch block
lbl178:

                                                        try {
                                                            if (var22_31.joining != null) ** GOTO lbl192
                                                            var6_17 = var23_30._availableForWrite$internal;
                                                            var25_34 = var5_8;
                                                            var5_8 = var16_16;
                                                            var26_32 /* !! */  = var18_11;
                                                            var18_11 = var20_29;
                                                            var16_16 = var25_34;
                                                            var20_29 = var26_32 /* !! */ ;

                                                        }
                                                        catch (Throwable var17_20) {
                                                            block82: {
                                                                var18_11 = var5_8;
                                                                var5_8 = var17_20;
                                                                break block82;
lbl192:

                                                                var22_31 = var20_29;
                                                                var20_29 = var16_16;
                                                                var16_16 = var19_18;
                                                                var19_18 = var22_31;
                                                                var22_31 = var5_8;
                                                                break block70;
                                                                {
                                                                    var19_18 = var5_8;
                                                                    var18_11 = var4_7;
                                                                    var4_7 = var16_16;
                                                                    var5_8 = var17_19;
                                                                    var16_16 = var19_18;
                                                                    var17_19 = var1_1;
                                                                    var1_1 = var4_7;
                                                                    break block43;
                                                                }
lbl207:

                                                                var25_34 = var20_29;
                                                                var26_32 /* !! */  = var22_31;
                                                                var27_39 = var16_16;
                                                                var22_31 = var23_30;
                                                                var20_29 = var19_18;
                                                                var16_16 = var4_7;
                                                                var4_7 = var27_39;
                                                                var19_18 = var17_19;
                                                                var17_19 = var18_11;
                                                                var23_30 = var26_32 /* !! */ ;
                                                                var18_11 = var25_34;
lbl219:

                                                                super.U((ByteBuffer)var24_28, var22_31.f, var6_17);
                                                                var25_34 = new s0();
                                                                var27_39 = super.v0();
                                                                if (var27_39 == null) ** GOTO lbl264
                                                                var26_32 /* !! */  = super.O().b;
                                                                var7_35 = var26_32 /* !! */ ._availableForRead$internal;
                                                                if (var7_35 != 0) break block71;
                                                                try {
                                                                    super.n0();
                                                                    var17_19.B0();

                                                                }
                                                                catch (Throwable var17_23) {
                                                                    var19_18 = var5_8;
                                                                    var18_11 = var16_16;
                                                                    var5_8 = var17_23;
                                                                    var16_16 = var19_18;
                                                                }
                                                            }
                                                            var17_19 = var1_1;
                                                            var1_1 = var4_7;
                                                            break block43;
                                                        }
                                                    }
                                                    var7_35 = var27_39.remaining();
                                                    var12_37 = var7_35;
                                                    var7_35 = var24_28.remaining();
                                                    var10_36 = var7_35;
                                                    var7_35 = var23_30.n((int)Math.min(var12_37, Math.min(var10_36, var8_27 - var21_33.c)));
                                                    if (var7_35 <= 0) break block72;
                                                    if (!var26_32 /* !! */ .m(var7_35)) break;
                                                    var27_39.limit(var27_39.position() + var7_35);
                                                    var24_28.put((ByteBuffer)var27_39);
                                                    var25_34.c = var7_35;
                                                    super.F((ByteBuffer)var27_39, var26_32 /* !! */ , var7_35);
                                                }
                                                super.n0();
                                                var17_19.B0();
lbl264:

                                                var7_35 = var25_34.c;
                                                if (var7_35 <= 0) {
                                                    var23_30 = var20_29;
                                                    var20_29 = var19_18;
                                                    var22_31 = var16_16;
                                                    var19_18 = var18_11;
                                                    var18_11 = var23_30;
                                                    var16_16 = var20_29;
                                                    var20_29 = var5_8;
                                                    break block70;
                                                }
                                                super.G((ByteBuffer)var24_28, (io.ktor.utils.io.internal.i)var23_30, var7_35);
                                                var10_36 = var21_33.c;
                                                var7_35 = var25_34.c;
                                                var21_33.c = var10_36 + (long)var7_35;
                                                if (var6_17 - var7_35 == 0 || var14_26) {
                                                    var22_31.flush();
                                                }
                                                var28_40 = var20_29;
                                                var27_39 = var19_18;
                                                var25_34 = var16_16;
                                                var20_29 = var18_11;
                                                var26_32 /* !! */  = var23_30;
                                                var18_11 = var17_19;
                                                var23_30 = var22_31;
                                                var16_16 = var4_7;
                                                var19_18 = var28_40;
                                                var17_19 = var27_39;
                                                var4_7 = var25_34;
                                                var22_31 = var26_32 /* !! */ ;
                                                continue;
                                                break;
                                            }
                                            try {
                                                var18_11 = new AssertionError();
                                                throw var18_11;
                                            }
                                            catch (Throwable var18_13) {}
                                            break block73;
                                            catch (Throwable var18_14) {
                                                break block73;
                                            }
                                            catch (Throwable var18_15) {}
                                        }
                                        try {
                                            super.n0();
                                            var17_19.B0();
                                            throw var18_11;
                                        }
                                        catch (Throwable var18_12) {
                                            block83: {
                                                var17_19 = var1_1;
                                                var1_1 = var4_7;
                                                var4_7 = var18_12;
                                                break block83;
                                                catch (Throwable var17_24) {}

                                                catch (Throwable var17_25) {}

                                                {
                                                    var18_11 = var4_7;
                                                    var4_7 = var17_19;
                                                    var17_19 = var1_1;
                                                    var1_1 = var18_11;
                                                }
                                            }
                                            var18_11 = var16_16;
                                            var16_16 = var5_8;
                                            var5_8 = var4_7;
                                            break;
                                        }
                                    }
                                    var23_30 = var20_29;
                                    var25_34 = var18_11;
                                    var24_28 = var16_16;
                                    var18_11 = var19_18;
                                    var22_31 = var4_7;
                                    var20_29 = var5_8;
                                    var16_16 = var17_19;
                                    var17_19 = var25_34;
                                    var4_7 = var24_28;
                                    var19_18 = var23_30;
                                }
                                try {
                                    if (var20_29.h() || var1_1.e()) {
                                        var1_1.flush();
                                    }
                                    if (var1_1 == var22_31) break block74;
                                    var22_31.u0(var22_31.Q() + (var1_1.Q() - var2_6));
                                }
                                catch (Throwable var1_3) {
                                    break block67;
                                }
                            }
                            var1_1.o0();
                            var1_1.B0();
                            var1_1 = var4_7;
                            var4_7 = var18_11;
                            var5_8 = var21_33;
                            var2_6 = var8_27;
                            var20_29 = var16_16;
                            var18_11 = var17_19;
                            var16_16 = var4_7;
                            var17_19 = var19_18;
                        }
                        if (var16_16 == null) ** GOTO lbl371
                        var4_7 = var1_1;
                        {
                            block84: {
                                if (!super.z0((io.ktor.utils.io.internal.d)var16_16)) break block84;
                                var15_38 = var14_26;
                                var22_31 = var5_8;
                                var21_33 = var1_1;

                            }
                            var4_7 = var1_1;
                            if (super.O().b.e()) {
                                var4_7 = var1_1;
                                super.r0();
                                var19_18 = var20_29;
                                continue;
                            }
lbl371:

                            var4_7 = var1_1;
                            var15_38 = var14_26;
                            var22_31 = var5_8;
                            var21_33 = var1_1;
                            if (var5_8.c >= var2_6) ** GOTO lbl511
                            var4_7 = var1_1;
                            var1_1.flush();
                            var4_7 = var1_1;
                            if (var18_11.c() != 0) ** GOTO lbl432
                            var4_7 = var1_1;
                            var20_29.l = var1_1;
                            var4_7 = var1_1;
                            var20_29.m = var18_11;
                            var4_7 = var1_1;
                            var20_29.n = var16_16;
                            var4_7 = var1_1;
                            var20_29.o = var5_8;
                            var4_7 = var1_1;
                            var20_29.p = null;
                            var4_7 = var1_1;
                            var20_29.q = null;
                            var4_7 = var1_1;
                            var20_29.r = null;
                            var4_7 = var1_1;
                            var20_29.s = null;
                            var4_7 = var1_1;
                            var20_29.t = null;
                            var4_7 = var1_1;
                            var20_29.u = null;
                            var4_7 = var1_1;
                            var20_29.v = var2_6;
                            var4_7 = var1_1;
                            var20_29.x = var14_26;
                            var4_7 = var1_1;
                            var20_29.A = 2;
                            var4_7 = var1_1;
                            var19_18 = super.h0(1, (kotlin.coroutines.d<? super Boolean>)var20_29);
                            if (var19_18 == var17_19) {
                                return var17_19;
                            }
                            var22_31 = var18_11;
                            var18_11 = var5_8;
                            var5_8 = var20_29;
                        }
lbl413:

                        var4_7 = var1_1;
                        {
                            block88: {
                                block87: {
                                    block86: {
                                        block85: {
                                            if (!((Boolean)var19_18).booleanValue()) break block85;
                                            if (var16_16 == null) break block86;
                                            var4_7 = var1_1;
                                            if (!super.z0((io.ktor.utils.io.internal.d)var16_16)) break block86;
                                            break block87;
                                        }
                                        if (var16_16 == null) break block87;
                                        var4_7 = var1_1;
                                        if (super.z0((io.ktor.utils.io.internal.d)var16_16)) break block87;
                                    }
                                    var21_33 = var5_8;
                                    var15_38 = var14_26;
                                    break block88;
                                }
                                var15_38 = var14_26;
                                var22_31 = var18_11;
                                var21_33 = var1_1;

lbl432:

                                var22_31 = var18_11;
                                var15_38 = var14_26;
                                var21_33 = var20_29;
                                var18_11 = var5_8;
                            }
                            var25_34 = var16_16;
                            var4_7 = var1_1;
                            var23_30 = var17_19;
                            var8_27 = var2_6;
                            var16_16 = var25_34;
                            var14_26 = var15_38;
                            var19_18 = var21_33;
                            var5_8 = var18_11;
                            var24_28 = var22_31;
                            var20_29 = var1_1;
                            if (var1_1.joining == null) break block75;
                            var4_7 = var1_1;
                            var21_33.l = var1_1;
                            var4_7 = var1_1;
                            var21_33.m = var22_31;
                            var4_7 = var1_1;
                            var21_33.n = var25_34;
                            var4_7 = var1_1;
                            var21_33.o = var18_11;
                            var4_7 = var1_1;
                            var21_33.p = null;
                            var4_7 = var1_1;
                            var21_33.q = null;
                            var4_7 = var1_1;
                            var21_33.r = null;
                            var4_7 = var1_1;
                            var21_33.s = null;
                            var4_7 = var1_1;
                            var21_33.t = null;
                            var4_7 = var1_1;
                            var21_33.u = null;
                            var4_7 = var1_1;
                            var21_33.v = var2_6;
                            var4_7 = var1_1;
                            var21_33.x = var15_38;
                            var4_7 = var1_1;
                            var21_33.A = 3;
                            var4_7 = var1_1;
                            var26_32 /* !! */  = var1_1.C0(1, (kotlin.coroutines.d<? super k0>)var21_33);
                            var23_30 = var17_19;
                            var8_27 = var2_6;
                            var16_16 = var25_34;
                            var14_26 = var15_38;
                            var19_18 = var21_33;
                            var5_8 = var18_11;
                            var24_28 = var22_31;
                            var20_29 = var1_1;
                            if (var26_32 /* !! */  != var17_19) break block75;
                            return var17_19;
                        }
                    }
                    var17_19 = var23_30;
                    var18_11 = var24_28;
                    var2_6 = var8_27;
                    var1_1 = var20_29;
                }
            }
            var4_7 = var1_1;
            {
                block90: {
                    block89: {
                        if (var16_16.h()) break block89;
                        var4_7 = var1_1;
                        if (!var17_19.e()) break block90;
                    }
                    var4_7 = var1_1;
                    var17_19.flush();
                }
                if (var17_19 == var18_11) ** GOTO lbl504
                var4_7 = var1_1;
            }
            {
                var18_11.u0(var18_11.Q() + (var17_19.Q() - var2_6));
lbl504:

                var4_7 = var1_1;
                var17_19.o0();
                var4_7 = var1_1;
                var17_19.B0();
                var4_7 = var1_1;
                throw var5_8;
lbl511:

                if (var15_38) {
                    var4_7 = var21_33;
                    var21_33.flush();
                }
                var4_7 = var21_33;
                return kotlin.coroutines.jvm.internal.b.e((long)var22_31.c);
            }
        }
        var4_7.close((Throwable)var1_5);
        throw var1_5;
    }

    @NotNull
    public final io.ktor.utils.io.internal.g J() {
        return this.O();
    }

    public long P() {
        return this.totalBytesRead;
    }

    public long Q() {
        return this.totalBytesWritten;
    }

    public boolean S() {
        boolean bl = this.M() != null;
        return bl;
    }

    @Nullable
    public Object a(@NotNull ByteBuffer byteBuffer, @NotNull kotlin.coroutines.d<? super k0> d4) {
        return a.J0(this, byteBuffer, d4);
    }

    public boolean b(@Nullable Throwable throwable) {
        Throwable throwable2 = throwable;
        if (throwable == null) {
            throwable2 = new CancellationException("Channel has been cancelled");
        }
        return this.close(throwable2);
    }

    public int c() {
        return this.O().b._availableForRead$internal;
    }

    public boolean close(@Nullable Throwable throwable) {
        if (this.M() != null) {
            return false;
        }
        Object object = throwable == null ? io.ktor.utils.io.internal.c.b.a() : new io.ktor.utils.io.internal.c(throwable);
        this.O().b.e();
        if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)n, (Object)this, null, (Object)object)) {
            return false;
        }
        this.O().b.e();
        if (this.O().b.g() || throwable != null) {
            this.B0();
        }
        this.p0(throwable);
        if (this.O() == g.f.c && (object = this.joining) != null) {
            this.K((io.ktor.utils.io.internal.d)object);
        }
        if (throwable != null) {
            object = this.attachedJob;
            if (object != null) {
                d2.a.a((d2)object, null, (int)1, null);
            }
            this.i.e(throwable);
            this.j.e(throwable);
            return true;
        }
        this.j.e((Throwable)new io.ktor.utils.io.p("Byte channel was closed"));
        this.i.d(this.O().b.e());
        return true;
    }

    @Nullable
    public Object d(@NotNull io.ktor.utils.io.core.internal.a a4, @NotNull kotlin.coroutines.d<? super Integer> d4) {
        return a.Z(this, a4, d4);
    }

    public boolean e() {
        return this.b;
    }

    @Nullable
    public Object f(long l4, @NotNull kotlin.coroutines.d<? super io.ktor.utils.io.core.j> d4) {
        return a.e0(this, l4, d4);
    }

    public void flush() {
        this.L(1);
    }

    @Nullable
    public Throwable g() {
        Object object = this.M();
        object = object != null ? object.b() : null;
        return object;
    }

    @Nullable
    public Object h(@NotNull byte[] byArray, int n4, int n5, @NotNull kotlin.coroutines.d<? super Integer> d4) {
        return a.a0(this, byArray, n4, n5, d4);
    }

    @Nullable
    public Object i(@NotNull byte[] byArray, int n4, int n5, @NotNull kotlin.coroutines.d<? super k0> d4) {
        return a.K0(this, byArray, n4, n5, d4);
    }

    @Override
    @Deprecated(message="\n    We're migrating to the new kotlinx-io library.\n    This declaration is deprecated and will be removed in Ktor 4.0.0\n    If you have any problems with migration, please contact us in \n    https://youtrack.jetbrains.com/issue/KTOR-6030/Migrate-to-new-kotlinx.io-library\n    ")
    public void j(@NotNull d2 d22) {
        y.j((Object)d22, (String)"job");
        d2 d23 = this.attachedJob;
        if (d23 != null) {
            d2.a.a((d2)d23, null, (int)1, null);
        }
        this.attachedJob = d22;
        d2.a.d((d2)d22, (boolean)true, (boolean)false, (kotlin.jvm.functions.l)new kotlin.jvm.functions.l<Throwable, k0>(this){
            final a g;
            {
                this.g = a4;
                super(1);
            }

            @Override
            public final void invoke(@Nullable Throwable throwable) {
                this.g.attachedJob = null;
                if (throwable == null) {
                    return;
                }
                this.g.b(s.a((Throwable)throwable));
            }
        }, (int)2, null);
    }

    @Nullable
    public Object k(int n4, @NotNull kotlin.jvm.functions.l<? super ByteBuffer, k0> l4, @NotNull kotlin.coroutines.d<? super k0> d4) {
        return a.V(this, n4, l4, d4);
    }

    @Nullable
    public Object l(@NotNull io.ktor.utils.io.core.a a4, @NotNull kotlin.coroutines.d<? super k0> d4) {
        return a.I0(this, a4, d4);
    }

    @NotNull
    public final a l0() {
        Object object;
        block3: {
            block2: {
                object = this.joining;
                if (object == null) break block2;
                a a4 = this.m0(this, (io.ktor.utils.io.internal.d)object);
                object = a4;
                if (a4 != null) break block3;
            }
            object = this;
        }
        return object;
    }

    public boolean m() {
        boolean bl = this.O() == g.f.c && this.M() != null;
        return bl;
    }

    public final void o0() {
        io.ktor.utils.io.internal.g g4;
        io.ktor.utils.io.internal.g g5;
        io.ktor.utils.io.internal.g g6;
        Object object;
        io.ktor.utils.io.internal.g g7 = null;
        do {
            object = this._state;
            g5 = ((io.ktor.utils.io.internal.g)object).f();
            g4 = g7;
            g6 = g5;
            if (g5 instanceof g.b) {
                g4 = g7;
                g6 = g5;
                if (g5.b.g()) {
                    g6 = g.a.c;
                    g4 = g5;
                }
            }
            g7 = g4;
        } while (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)m, (Object)this, (Object)object, (Object)g6));
        if (g6 == g.a.c && (g5 = (g.b)g4) != null) {
            this.j0(g5.g());
        }
    }

    public void t0(long l4) {
        this.totalBytesRead = l4;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ByteBufferChannel(");
        stringBuilder.append(this.hashCode());
        stringBuilder.append(", ");
        stringBuilder.append(this.O());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public void u0(long l4) {
        this.totalBytesWritten = l4;
    }

    @Nullable
    public final ByteBuffer w0() {
        Object object = this.R();
        if (object == null) {
            g.a a4;
            io.ktor.utils.io.internal.g g4;
            io.ktor.utils.io.internal.g g5;
            Object object2;
            Object var4_2 = null;
            io.ktor.utils.io.internal.c c4 = null;
            do {
                object2 = this._state;
                g4 = (io.ktor.utils.io.internal.g)object2;
                if (this.joining != null) {
                    if (c4 != null) {
                        this.j0((g.c)c4);
                    }
                    return null;
                }
                if (this.M() != null) {
                    if (c4 != null) {
                        this.j0((g.c)c4);
                    }
                    c4 = this.M();
                    y.g((Object)c4);
                    io.ktor.utils.io.b.a((Throwable)c4.c());
                    throw new kotlin.j();
                }
                a4 = g.a.c;
                if (g4 == a4) {
                    object = c4;
                    if (c4 == null) {
                        object = this.T();
                    }
                    g5 = object.l();
                } else {
                    if (g4 == g.f.c) {
                        if (c4 != null) {
                            this.j0((g.c)c4);
                        }
                        if (this.joining != null) {
                            return null;
                        }
                        c4 = this.M();
                        y.g((Object)c4);
                        io.ktor.utils.io.b.a((Throwable)c4.c());
                        throw new kotlin.j();
                    }
                    g5 = g4.d();
                    object = c4;
                }
                c4 = object;
            } while (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)m, (Object)this, (Object)object2, (Object)g5));
            if (this.M() == null) {
                object2 = g5.b();
                if (object != null) {
                    if (g4 == null) {
                        y.B((String)"old");
                        c4 = var4_2;
                    } else {
                        c4 = g4;
                    }
                    if (c4 != a4) {
                        this.j0((g.c)((Object)object));
                    }
                }
                this.U((ByteBuffer)object2, this.f, g5.b._availableForWrite$internal);
                return object2;
            }
            this.o0();
            this.B0();
            c4 = this.M();
            y.g((Object)c4);
            io.ktor.utils.io.b.a((Throwable)c4.c());
            throw new kotlin.j();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Write operation is already in progress: ");
        stringBuilder.append(object);
        throw new IllegalStateException(stringBuilder.toString());
    }
}


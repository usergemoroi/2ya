/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.concurrent.futures.a
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.ReplaceWith
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.coroutines.jvm.internal.b
 *  kotlin.coroutines.jvm.internal.g
 *  kotlin.e
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.a1
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.u
 *  kotlin.u$a
 *  kotlin.v
 *  kotlinx.coroutines.channels.f
 *  kotlinx.coroutines.channels.g$a
 *  kotlinx.coroutines.channels.i
 *  kotlinx.coroutines.channels.k
 *  kotlinx.coroutines.channels.p
 *  kotlinx.coroutines.channels.q
 *  kotlinx.coroutines.channels.z
 *  kotlinx.coroutines.internal.a
 *  kotlinx.coroutines.internal.b
 *  kotlinx.coroutines.internal.b0
 *  kotlinx.coroutines.internal.c0
 *  kotlinx.coroutines.internal.d0
 *  kotlinx.coroutines.internal.j
 *  kotlinx.coroutines.internal.r0
 *  kotlinx.coroutines.internal.w
 *  kotlinx.coroutines.k3
 *  kotlinx.coroutines.r
 *  kotlinx.coroutines.selects.l
 *  kotlinx.coroutines.selects.n
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.t;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.a1;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.reflect.KFunction;
import kotlin.u;
import kotlin.v;
import kotlinx.coroutines.channels.c;
import kotlinx.coroutines.channels.d;
import kotlinx.coroutines.channels.g;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.channels.q;
import kotlinx.coroutines.channels.w;
import kotlinx.coroutines.channels.z;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.c0;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.k3;
import kotlinx.coroutines.n;
import kotlinx.coroutines.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(d1={"\u0000\u00c2\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u00036\u00eb\u0001B7\u0012\u0007\u0010\u00ad\u0001\u001a\u00020\t\u0012#\b\u0002\u0010\u00b0\u0001\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010wj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`x\u00a2\u0006\u0006\b\u00e9\u0001\u0010\u00ea\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0082@\u00a2\u0006\u0004\b\u0005\u0010\u0006J6\u0010\r\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\u0004*\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015JG\u0010\u001a\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001c\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b!\u0010\u001fJ\u001b\u0010\"\u001a\u00020\u0018*\u00020\u00162\u0006\u0010\u0003\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\b\"\u0010#J=\u0010'\u001a\u00118\u0000\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0004\b'\u0010(J)\u0010)\u001a\u00020\u0004*\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b)\u0010\u0011J\u001d\u0010*\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0002\u00a2\u0006\u0004\b*\u0010+J4\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0004\b-\u0010(J#\u0010.\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0\u0012H\u0002\u00a2\u0006\u0004\b.\u0010+J9\u0010/\u001a\u0004\u0018\u00010\u00162\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002\u00a2\u0006\u0004\b/\u00100J9\u00101\u001a\u0004\u0018\u00010\u00162\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002\u00a2\u0006\u0004\b1\u00100J)\u00102\u001a\u00020\u0018*\u00020\u00162\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b4\u00105J-\u00107\u001a\u00020\u00182\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u00106\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b7\u00108J-\u00109\u001a\u00020\u00182\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u00106\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b9\u00108J\u0019\u0010;\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b;\u0010<J#\u0010?\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=H\u0002\u00a2\u0006\u0004\b?\u0010@J%\u0010C\u001a\u0004\u0018\u00010\u00162\b\u0010A\u001a\u0004\u0018\u00010\u00162\b\u0010B\u001a\u0004\u0018\u00010\u0016H\u0002\u00a2\u0006\u0004\bC\u0010DJ%\u0010E\u001a\u00020\u00042\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=2\b\u0010A\u001a\u0004\u0018\u00010\u0016H\u0002\u00a2\u0006\u0004\bE\u0010FJ\u001b\u0010G\u001a\u00020\u00042\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=H\u0002\u00a2\u0006\u0004\bG\u0010HJ%\u0010I\u001a\u0004\u0018\u00010\u00162\b\u0010A\u001a\u0004\u0018\u00010\u00162\b\u0010B\u001a\u0004\u0018\u00010\u0016H\u0002\u00a2\u0006\u0004\bI\u0010DJ%\u0010J\u001a\u0004\u0018\u00010\u00162\b\u0010A\u001a\u0004\u0018\u00010\u00162\b\u0010B\u001a\u0004\u0018\u00010\u0016H\u0002\u00a2\u0006\u0004\bJ\u0010DJ\u000f\u0010K\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bK\u00105J\u000f\u0010L\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bL\u00105J\u000f\u0010M\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bM\u00105J\u000f\u0010N\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bN\u00105J\u000f\u0010O\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bO\u00105J\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010P\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\bS\u0010<J\u0015\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002\u00a2\u0006\u0004\bT\u0010UJ\u001d\u0010W\u001a\u00020\u000b2\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002\u00a2\u0006\u0004\bW\u0010XJ\u001d\u0010Y\u001a\u00020\u00042\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002\u00a2\u0006\u0004\bY\u0010ZJ%\u0010\\\u001a\u00020\u00042\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010[\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\\\u0010]J\u0013\u0010^\u001a\u00020\u0004*\u00020\u000fH\u0002\u00a2\u0006\u0004\b^\u0010_J\u0013\u0010`\u001a\u00020\u0004*\u00020\u000fH\u0002\u00a2\u0006\u0004\b`\u0010_J\u001b\u0010b\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010a\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\bb\u0010cJ\u001f\u0010f\u001a\u00020\u00182\u0006\u0010d\u001a\u00020\u000b2\u0006\u0010e\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\bf\u0010gJ-\u0010i\u001a\u00020\u00182\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010h\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\bi\u00108J-\u0010l\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0006\u0010j\u001a\u00020\u000b2\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002\u00a2\u0006\u0004\bl\u0010mJ-\u0010n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0006\u0010j\u001a\u00020\u000b2\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002\u00a2\u0006\u0004\bn\u0010mJ5\u0010p\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0006\u0010j\u001a\u00020\u000b2\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010o\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\bp\u0010qJ%\u0010r\u001a\u00020\u00042\u0006\u0010j\u001a\u00020\u000b2\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002\u00a2\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\u00020\u00042\u0006\u0010t\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\bu\u0010<J\u0017\u0010v\u001a\u00020\u00042\u0006\u0010t\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\bv\u0010<JG\u0010|\u001a \u0012\u0004\u0012\u00020z\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u00040y*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040wj\b\u0012\u0004\u0012\u00028\u0000`xH\u0002\u00a2\u0006\u0004\b|\u0010}J0\u0010\u0080\u0001\u001a\u00020\u00042\u0006\u0010~\u001a\u00020z2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0006\u0010\u007f\u001a\u00020{H\u0002\u00a2\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001JO\u0010\u0083\u0001\u001a\u001d\u0012\u0004\u0012\u00020z\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u00040\u0082\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040wj\b\u0012\u0004\u0012\u00028\u0000`x2\u0006\u0010\u0003\u001a\u00028\u0000H\u0002\u00a2\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001JC\u0010\u0085\u0001\u001a\u001a\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u00040y*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040wj\b\u0012\u0004\u0012\u00028\u0000`xH\u0002\u00a2\u0006\u0005\b\u0085\u0001\u0010}J*\u0010\u0086\u0001\u001a\u00020\u00042\u0006\u0010~\u001a\u00020z2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u007f\u001a\u00020{H\u0002\u00a2\u0006\u0006\b\u0086\u0001\u0010\u0081\u0001J\u001a\u0010\u0087\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@\u00a2\u0006\u0005\b\u0087\u0001\u0010\u0006J \u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040,2\u0006\u0010\u0003\u001a\u00028\u0000H\u0016\u00a2\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J \u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040,2\u0006\u0010\u0003\u001a\u00028\u0000H\u0004\u00a2\u0006\u0006\b\u008b\u0001\u0010\u0089\u0001J\u0011\u0010\u008c\u0001\u001a\u00020\u0004H\u0014\u00a2\u0006\u0005\b\u008c\u0001\u00105J\u0011\u0010\u008d\u0001\u001a\u00020\u0004H\u0014\u00a2\u0006\u0005\b\u008d\u0001\u00105J\u0013\u0010\u008e\u0001\u001a\u00028\u0000H\u0096@\u00a2\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0019\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0096@\u00a2\u0006\u0006\b\u0090\u0001\u0010\u008f\u0001J\u0018\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016\u00a2\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001a\u0010\u0094\u0001\u001a\u00020\u00042\u0007\u0010\u0093\u0001\u001a\u00020\u000bH\u0004\u00a2\u0006\u0005\b\u0094\u0001\u0010<J\u0019\u0010\u0095\u0001\u001a\u00020\u00042\u0006\u0010h\u001a\u00020\u000bH\u0000\u00a2\u0006\u0005\b\u0095\u0001\u0010<J'\u0010\u0096\u0001\u001a\u00020\u00042\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016H\u0014\u00a2\u0006\u0005\b\u0096\u0001\u0010FJ\u001a\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0097\u0001H\u0096\u0002\u00a2\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0011\u0010\u009a\u0001\u001a\u00020\u0004H\u0014\u00a2\u0006\u0005\b\u009a\u0001\u00105J\u001c\u0010\u009b\u0001\u001a\u00020\u00182\b\u0010~\u001a\u0004\u0018\u00010zH\u0016\u00a2\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\"\u0010\u009f\u0001\u001a\u00020\u00042\u0010\u0010~\u001a\f\u0018\u00010\u009d\u0001j\u0005\u0018\u0001`\u009e\u0001\u00a2\u0006\u0006\b\u009f\u0001\u0010\u00a0\u0001J\u001c\u0010\u00a1\u0001\u001a\u00020\u00182\b\u0010~\u001a\u0004\u0018\u00010zH\u0010\u00a2\u0006\u0006\b\u00a1\u0001\u0010\u009c\u0001J%\u0010\u00a2\u0001\u001a\u00020\u00182\b\u0010~\u001a\u0004\u0018\u00010z2\u0007\u0010\u009f\u0001\u001a\u00020\u0018H\u0014\u00a2\u0006\u0006\b\u00a2\u0001\u0010\u00a3\u0001J8\u0010\u00a5\u0001\u001a\u00020\u00042$\u0010\u00a4\u0001\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010z\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(~\u0012\u0004\u0012\u00020\u00040wH\u0016\u00a2\u0006\u0006\b\u00a5\u0001\u0010\u00a6\u0001J\u0012\u0010\u00a7\u0001\u001a\u00020\u0018H\u0000\u00a2\u0006\u0006\b\u00a7\u0001\u0010\u00a8\u0001J\u0013\u0010\u00aa\u0001\u001a\u00030\u00a9\u0001H\u0016\u00a2\u0006\u0006\b\u00aa\u0001\u0010\u00ab\u0001R\u0017\u0010\u00ad\u0001\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00ac\u0001\u0010\u0085\u0001R1\u0010\u00b0\u0001\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010wj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`x8\u0000X\u0081\u0004\u00a2\u0006\b\n\u0006\b\u00ae\u0001\u0010\u00af\u0001R\u0092\u0001\u0010\u00b7\u0001\u001av\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030=\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(>\u0012\u0016\u0012\u0014\u0018\u00010\u0016\u00a2\u0006\r\b%\u0012\t\b&\u0012\u0005\b\b(\u00b1\u0001\u0012\u0016\u0012\u0014\u0018\u00010\u0016\u00a2\u0006\r\b%\u0012\t\b&\u0012\u0005\b\b(\u00b2\u0001\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020z\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u00040\u0082\u0001\u0018\u00010\u0082\u0001j\u0005\u0018\u0001`\u00b3\u00018\u0002X\u0082\u0004\u00a2\u0006\u000f\n\u0006\b\u00b4\u0001\u0010\u00b5\u0001\u0012\u0005\b\u00b6\u0001\u00105R\u0017\u0010\u00ba\u0001\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\b\u001a\u0006\b\u00b8\u0001\u0010\u00b9\u0001R\u0017\u0010\u00bc\u0001\u001a\u00020\u00188BX\u0082\u0004\u00a2\u0006\b\u001a\u0006\b\u00bb\u0001\u0010\u00a8\u0001R\u0017\u0010\u00bf\u0001\u001a\u00020z8BX\u0082\u0004\u00a2\u0006\b\u001a\u0006\b\u00bd\u0001\u0010\u00be\u0001R\u001a\u0010\u00c1\u0001\u001a\u00020\u0018*\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\b\u00c0\u0001\u0010\u001fR\u001a\u0010\u00c3\u0001\u001a\u00020\u0018*\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\b\u00c2\u0001\u0010\u001fR\u0016\u0010[\u001a\u00020\u000b8@X\u0080\u0004\u00a2\u0006\b\u001a\u0006\b\u00c4\u0001\u0010\u00b9\u0001R\u0017\u0010\u00c6\u0001\u001a\u00020\u000b8@X\u0080\u0004\u00a2\u0006\b\u001a\u0006\b\u00c5\u0001\u0010\u00b9\u0001R1\u0010\u00cb\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u00c7\u00018VX\u0096\u0004\u00a2\u0006\u000f\u0012\u0005\b\u00ca\u0001\u00105\u001a\u0006\b\u00c8\u0001\u0010\u00c9\u0001R%\u0010\u00d0\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00cc\u00018VX\u0096\u0004\u00a2\u0006\u000f\u0012\u0005\b\u00cf\u0001\u00105\u001a\u0006\b\u00cd\u0001\u0010\u00ce\u0001R+\u0010\u00d3\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0\u00cc\u00018VX\u0096\u0004\u00a2\u0006\u000f\u0012\u0005\b\u00d2\u0001\u00105\u001a\u0006\b\u00d1\u0001\u0010\u00ce\u0001R\u0019\u0010\u00d5\u0001\u001a\u0004\u0018\u00010z8DX\u0084\u0004\u00a2\u0006\b\u001a\u0006\b\u00d4\u0001\u0010\u00be\u0001R\u0017\u0010\u00d7\u0001\u001a\u00020z8DX\u0084\u0004\u00a2\u0006\b\u001a\u0006\b\u00d6\u0001\u0010\u00be\u0001R\u0017\u0010\u00d9\u0001\u001a\u00020\u00188TX\u0094\u0004\u00a2\u0006\b\u001a\u0006\b\u00d8\u0001\u0010\u00a8\u0001R\u001e\u0010\u00da\u0001\u001a\u00020\u00188VX\u0097\u0004\u00a2\u0006\u000f\u0012\u0005\b\u00db\u0001\u00105\u001a\u0006\b\u00da\u0001\u0010\u00a8\u0001R\u001d\u0010e\u001a\u00020\u00188VX\u0097\u0004\u00a2\u0006\u000f\u0012\u0005\b\u00dd\u0001\u00105\u001a\u0006\b\u00dc\u0001\u0010\u00a8\u0001R\r\u0010\u00df\u0001\u001a\u00030\u00de\u00018\u0002X\u0082\u0004R\r\u0010\u00e0\u0001\u001a\u00030\u00de\u00018\u0002X\u0082\u0004R\r\u0010\u00e1\u0001\u001a\u00030\u00de\u00018\u0002X\u0082\u0004R\r\u0010\u00e2\u0001\u001a\u00030\u00de\u00018\u0002X\u0082\u0004R\u0019\u0010\u00e4\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00e3\u00018\u0002X\u0082\u0004R\u0019\u0010\u00e5\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00e3\u00018\u0002X\u0082\u0004R\u0019\u0010\u00e6\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00e3\u00018\u0002X\u0082\u0004R\u0015\u0010\u00e7\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00e3\u00018\u0002X\u0082\u0004R\u0015\u0010\u00e8\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00e3\u00018\u0002X\u0082\u0004\u00a8\u0006\u00ec\u0001"}, d2={"Lkotlinx/coroutines/channels/e;", "E", "Lkotlinx/coroutines/channels/g;", "element", "Lkotlin/k0;", "K0", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/l;", "segment", "", "index", "", "s", "g1", "(Lkotlinx/coroutines/channels/l;ILjava/lang/Object;JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/k3;", "R0", "(Lkotlinx/coroutines/k3;Lkotlinx/coroutines/channels/l;I)V", "Lkotlinx/coroutines/n;", "cont", "L0", "(Ljava/lang/Object;Lkotlinx/coroutines/n;)V", "", "waiter", "", "closed", "p1", "(Lkotlinx/coroutines/channels/l;ILjava/lang/Object;JLjava/lang/Object;Z)I", "q1", "curSendersAndCloseStatus", "h1", "(J)Z", "curSenders", "L", "i1", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "r", "Lkotlin/ParameterName;", "name", "Y0", "(Lkotlinx/coroutines/channels/l;IJLkotlin/coroutines/d;)Ljava/lang/Object;", "Q0", "H0", "(Lkotlinx/coroutines/n;)V", "Lkotlinx/coroutines/channels/k;", "X0", "G0", "n1", "(Lkotlinx/coroutines/channels/l;IJLjava/lang/Object;)Ljava/lang/Object;", "o1", "j1", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/l;I)Z", "U", "()V", "b", "l1", "(Lkotlinx/coroutines/channels/l;IJ)Z", "m1", "nAttempts", "o0", "(J)V", "Lkotlinx/coroutines/selects/l;", "select", "J0", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/l;)V", "ignoredParam", "selectResult", "U0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Z0", "(Lkotlinx/coroutines/selects/l;Ljava/lang/Object;)V", "I0", "(Lkotlinx/coroutines/selects/l;)V", "S0", "T0", "q0", "B0", "A0", "z0", "S", "sendersCur", "R", "(J)Lkotlinx/coroutines/channels/l;", "Q", "O", "()Lkotlinx/coroutines/channels/l;", "lastSegment", "y0", "(Lkotlinx/coroutines/channels/l;)J", "b1", "(Lkotlinx/coroutines/channels/l;)V", "sendersCounter", "N", "(Lkotlinx/coroutines/channels/l;J)V", "c1", "(Lkotlinx/coroutines/k3;)V", "d1", "receiver", "e1", "(Lkotlinx/coroutines/k3;Z)V", "sendersAndCloseStatusCur", "isClosedForReceive", "s0", "(JZ)Z", "globalIndex", "r0", "id", "startFrom", "X", "(JLkotlinx/coroutines/channels/l;)Lkotlinx/coroutines/channels/l;", "W", "currentBufferEndCounter", "V", "(JLkotlinx/coroutines/channels/l;J)Lkotlinx/coroutines/channels/l;", "C0", "(JLkotlinx/coroutines/channels/l;)V", "value", "s1", "r1", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "Lkotlin/reflect/KFunction3;", "", "Lkotlin/coroutines/g;", "K", "(Lkotlin/jvm/functions/l;)Lkotlin/reflect/KFunction;", "cause", "context", "D0", "(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/g;)V", "Lkotlin/Function3;", "H", "(Lkotlin/jvm/functions/l;Ljava/lang/Object;)Lkotlin/jvm/functions/q;", "I", "E0", "send", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "k1", "N0", "M0", "F", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "o", "n", "()Ljava/lang/Object;", "globalCellIndex", "T", "t1", "a1", "Lkotlinx/coroutines/channels/i;", "iterator", "()Lkotlinx/coroutines/channels/i;", "F0", "close", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "M", "P", "(Ljava/lang/Throwable;Z)Z", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/l;)V", "n0", "()Z", "", "toString", "()Ljava/lang/String;", "c", "capacity", "d", "Lkotlin/jvm/functions/l;", "onUndeliveredElement", "param", "internalResult", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "e", "Lkotlin/jvm/functions/q;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "onUndeliveredElementReceiveCancellationConstructor", "Z", "()J", "bufferEndCounter", "x0", "isRendezvousOrUnlimited", "e0", "()Ljava/lang/Throwable;", "receiveException", "v0", "isClosedForSend0", "u0", "isClosedForReceive0", "l0", "h0", "receiversCounter", "Lkotlinx/coroutines/selects/h;", "getOnSend", "()Lkotlinx/coroutines/selects/h;", "getOnSend$annotations", "onSend", "Lkotlinx/coroutines/selects/f;", "D", "()Lkotlinx/coroutines/selects/f;", "getOnReceive$annotations", "onReceive", "j", "getOnReceiveCatching$annotations", "onReceiveCatching", "b0", "closeCause", "i0", "sendException", "w0", "isConflatedDropOldest", "isClosedForSend", "isClosedForSend$annotations", "t0", "isClosedForReceive$annotations", "Lkotlinx/atomicfu/AtomicLong;", "sendersAndCloseStatus", "receivers", "bufferEnd", "completedExpandBuffersAndPauseFlag", "Lkotlinx/atomicfu/AtomicRef;", "sendSegment", "receiveSegment", "bufferEndSegment", "_closeCause", "closeHandler", "<init>", "(ILkotlin/jvm/functions/l;)V", "a", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 7 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n+ 8 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 9 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 10 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3116:1\n270#1,6:3119\n277#1,68:3126\n394#1,18:3217\n241#1:3235\n266#1,10:3236\n277#1,48:3247\n415#1:3295\n331#1,14:3296\n419#1,3:3311\n241#1:3324\n266#1,10:3325\n277#1,68:3336\n241#1:3414\n266#1,10:3415\n277#1,68:3426\n241#1:3498\n266#1,10:3499\n277#1,68:3510\n241#1:3579\n266#1,10:3580\n277#1,68:3591\n906#1,52:3661\n984#1,8:3717\n878#1:3725\n902#1,33:3726\n994#1:3759\n936#1,14:3760\n955#1,3:3775\n999#1,6:3778\n906#1,52:3792\n984#1,8:3848\n878#1:3856\n902#1,33:3857\n994#1:3890\n936#1,14:3891\n955#1,3:3906\n999#1,6:3909\n878#1:3924\n902#1,48:3925\n955#1,3:3974\n878#1:3977\n902#1,48:3978\n955#1,3:4027\n241#1:4039\n266#1,10:4040\n277#1,68:4051\n878#1:4120\n902#1,48:4121\n955#1,3:4170\n1#2:3117\n3099#3:3118\n3099#3:3125\n3099#3:3246\n3099#3:3335\n3099#3:3425\n3099#3:3497\n3099#3:3509\n3099#3:3590\n3099#3:3660\n3099#3:3923\n3099#3:4030\n3099#3:4031\n3113#3:4032\n3113#3:4033\n3112#3:4034\n3112#3:4035\n3112#3:4036\n3113#3:4037\n3112#3:4038\n3099#3:4050\n3100#3:4173\n3099#3:4174\n3099#3:4175\n3099#3:4176\n3100#3:4177\n3099#3:4178\n3100#3:4201\n3099#3:4202\n3099#3:4203\n3100#3:4204\n3099#3:4254\n3100#3:4255\n3100#3:4256\n3100#3:4274\n3100#3:4275\n351#4,9:3194\n360#4,2:3211\n369#4,4:3213\n373#4,8:3314\n351#4,9:3405\n360#4,2:3495\n369#4,4:3713\n373#4,8:3784\n369#4,4:3844\n373#4,8:3915\n206#5:3203\n207#5:3206\n206#5:3207\n207#5:3210\n57#6,2:3204\n57#6,2:3208\n57#6,2:3322\n266#7:3310\n266#7:3404\n266#7:3494\n266#7:3578\n266#7:3659\n266#7:4119\n902#8:3774\n902#8:3905\n902#8:3973\n902#8:4026\n902#8:4169\n33#9,11:4179\n33#9,11:4190\n68#10,3:4205\n42#10,8:4208\n68#10,3:4216\n42#10,8:4219\n42#10,8:4227\n68#10,3:4235\n42#10,8:4238\n42#10,8:4246\n774#11:4257\n865#11,2:4258\n2318#11,14:4260\n774#11:4276\n865#11,2:4277\n2318#11,14:4279\n774#11:4293\n865#11,2:4294\n2318#11,14:4296\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n*L\n110#1:3119,6\n110#1:3126,68\n151#1:3217,18\n151#1:3235\n151#1:3236,10\n151#1:3247,48\n151#1:3295\n151#1:3296,14\n151#1:3311,3\n191#1:3324\n191#1:3325,10\n191#1:3336,68\n222#1:3414\n222#1:3415,10\n222#1:3426,68\n353#1:3498\n353#1:3499,10\n353#1:3510,68\n411#1:3579\n411#1:3580,10\n411#1:3591,68\n687#1:3661,52\n716#1:3717,8\n716#1:3725\n716#1:3726,33\n716#1:3759\n716#1:3760,14\n716#1:3775,3\n716#1:3778,6\n752#1:3792,52\n768#1:3848,8\n768#1:3856\n768#1:3857,33\n768#1:3890\n768#1:3891,14\n768#1:3906,3\n768#1:3909,6\n801#1:3924\n801#1:3925,48\n801#1:3974,3\n991#1:3977\n991#1:3978,48\n991#1:4027,3\n1484#1:4039\n1484#1:4040,10\n1484#1:4051,68\n1532#1:4120\n1532#1:4121,48\n1532#1:4170,3\n67#1:3118\n110#1:3125\n151#1:3246\n191#1:3335\n222#1:3425\n275#1:3497\n353#1:3509\n411#1:3590\n626#1:3660\n791#1:3923\n1027#1:4030\n1076#1:4031\n1394#1:4032\n1396#1:4033\n1426#1:4034\n1436#1:4035\n1445#1:4036\n1446#1:4037\n1453#1:4038\n1484#1:4050\n1898#1:4173\n1900#1:4174\n1902#1:4175\n1915#1:4176\n1926#1:4177\n1927#1:4178\n2229#1:4201\n2242#1:4202\n2252#1:4203\n2255#1:4204\n2572#1:4254\n2574#1:4255\n2599#1:4256\n2661#1:4274\n2662#1:4275\n131#1:3194,9\n131#1:3211,2\n150#1:3213,4\n150#1:3314,8\n218#1:3405,9\n218#1:3495,2\n715#1:3713,4\n715#1:3784,8\n766#1:3844,4\n766#1:3915,8\n135#1:3203\n135#1:3206\n138#1:3207\n138#1:3210\n135#1:3204,2\n138#1:3208,2\n180#1:3322,2\n151#1:3310\n191#1:3404\n222#1:3494\n353#1:3578\n411#1:3659\n1484#1:4119\n716#1:3774\n768#1:3905\n801#1:3973\n991#1:4026\n1532#1:4169\n2131#1:4179,11\n2186#1:4190,11\n2394#1:4205,3\n2394#1:4208,8\n2449#1:4216,3\n2449#1:4219,8\n2468#1:4227,8\n2498#1:4235,3\n2498#1:4238,8\n2559#1:4246,8\n2608#1:4257\n2608#1:4258,2\n2609#1:4260,14\n2673#1:4276\n2673#1:4277,2\n2674#1:4279,14\n2714#1:4293\n2714#1:4294,2\n2715#1:4296,14\n*E\n"})
public class e<E>
implements kotlinx.coroutines.channels.g<E> {
    private static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");
    private static final AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");
    private static final AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");
    private static final AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");
    private static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");
    private static final AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");
    private static final AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");
    private static final AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");
    private static final AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile Object _closeCause$volatile;
    private volatile long bufferEnd$volatile;
    private volatile Object bufferEndSegment$volatile;
    private final int c;
    private volatile Object closeHandler$volatile;
    private volatile long completedExpandBuffersAndPauseFlag$volatile;
    @JvmField
    @Nullable
    public final kotlin.jvm.functions.l<E, k0> d;
    @Nullable
    private final kotlin.jvm.functions.q<kotlinx.coroutines.selects.l<?>, Object, Object, kotlin.jvm.functions.q<Throwable, Object, kotlin.coroutines.g, k0>> e;
    private volatile Object receiveSegment$volatile;
    private volatile long receivers$volatile;
    private volatile Object sendSegment$volatile;
    private volatile long sendersAndCloseStatus$volatile;

    public e(int n4, @Nullable kotlin.jvm.functions.l<? super E, k0> object) {
        this.c = n4;
        this.d = object;
        if (n4 >= 0) {
            this.bufferEnd$volatile = kotlinx.coroutines.channels.f.t((int)n4);
            this.completedExpandBuffersAndPauseFlag$volatile = this.Z();
            kotlinx.coroutines.channels.l l4 = new kotlinx.coroutines.channels.l(0L, null, this, 3);
            this.sendSegment$volatile = l4;
            this.receiveSegment$volatile = l4;
            if (this.x0()) {
                l4 = kotlinx.coroutines.channels.f.n();
                y.h((Object)((Object)l4), (String)"null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = l4;
            object = object != null ? new kotlinx.coroutines.channels.b(this) : null;
            this.e = object;
            this._closeCause$volatile = kotlinx.coroutines.channels.f.l();
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Invalid channel capacity: ");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(", should be >=0");
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    private final void A0() {
        long l4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = kotlinx.coroutines.channels.e.f;
        while (!atomicLongFieldUpdater.compareAndSet(this, l4 = atomicLongFieldUpdater.get(this), kotlinx.coroutines.channels.f.b((long)(0xFFFFFFFFFFFFFFFL & l4), (int)3))) {
        }
    }

    private final void B0() {
        long l4;
        long l5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = kotlinx.coroutines.channels.e.f;
        do {
            int n4;
            if ((n4 = (int)((l5 = atomicLongFieldUpdater.get(this)) >> 60)) != 0) {
                if (n4 != 1) {
                    return;
                }
                l4 = kotlinx.coroutines.channels.f.b((long)(l5 & 0xFFFFFFFFFFFFFFFL), (int)3);
                continue;
            }
            l4 = kotlinx.coroutines.channels.f.b((long)(l5 & 0xFFFFFFFFFFFFFFFL), (int)2);
        } while (!atomicLongFieldUpdater.compareAndSet(this, l5, l4));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void C0(long var1_1, kotlinx.coroutines.channels.l<E> var3_2) {
        while (true) {
            var4_3 /* !! */  = var3_2;
            if (var3_2.e >= var1_1) break;
            var4_3 /* !! */  = (kotlinx.coroutines.channels.l)var3_2.f();
            if (var4_3 /* !! */  == null) {
                var4_3 /* !! */  = var3_2;
                break;
            }
            var3_2 = var4_3 /* !! */ ;
        }
        block1: while (true) {
            if (var4_3 /* !! */ .k() && (var3_2 = (kotlinx.coroutines.channels.l)var4_3 /* !! */ .f()) != null) {
                var4_3 /* !! */  = var3_2;
                continue;
            }
            var3_2 = kotlinx.coroutines.channels.e.a0();
            while (true) {
                block10: {
                    block9: {
                        var5_4 = (a0)var3_2.get(this);
                        if (var5_4.e >= var4_3 /* !! */ .e) break block9;
                        if (var4_3 /* !! */ .u()) ** break;
                        continue block1;
                        if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)var3_2, (Object)this, (Object)var5_4, (Object)var4_3 /* !! */ )) break block10;
                        if (var5_4.p()) {
                            var5_4.n();
                        }
                    }
                    return;
                }
                if (!var4_3 /* !! */ .p()) continue;
                var4_3 /* !! */ .n();
            }
            break;
        }
    }

    private final void D0(Throwable object, Object object2, kotlin.coroutines.g g4) {
        object = this.d;
        y.g((Object)object);
        object2 = kotlinx.coroutines.channels.k.f((Object)object2);
        y.g((Object)object2);
        kotlinx.coroutines.internal.w.a((kotlin.jvm.functions.l)object, (Object)object2, (kotlin.coroutines.g)g4);
    }

    private final void E0(Throwable object, E e4, kotlin.coroutines.g g4) {
        object = this.d;
        y.g((Object)object);
        kotlinx.coroutines.internal.w.a((kotlin.jvm.functions.l)object, e4, (kotlin.coroutines.g)g4);
    }

    private final void G0(n<? super kotlinx.coroutines.channels.k<? extends E>> n4) {
        u.a a4 = u.d;
        n4.resumeWith(u.b((Object)kotlinx.coroutines.channels.k.b((Object)kotlinx.coroutines.channels.k.b.a(this.b0()))));
    }

    private final kotlin.jvm.functions.q<Throwable, Object, kotlin.coroutines.g, k0> H(kotlin.jvm.functions.l<? super E, k0> l4, E e4) {
        return new c(l4, e4);
    }

    private final void H0(n<? super E> n4) {
        u.a a4 = u.d;
        n4.resumeWith(u.b((Object)v.a((Throwable)this.e0())));
    }

    private final KFunction<k0> I(kotlin.jvm.functions.l<? super E, k0> l4) {
        return new kotlin.jvm.functions.q<Throwable, E, kotlin.coroutines.g, k0>(this){

            public final void a(Throwable throwable, E e4, kotlin.coroutines.g g4) {
                ((e)this.receiver).E0(throwable, e4, g4);
            }
        };
    }

    private final void I0(kotlinx.coroutines.selects.l<?> l4) {
        l4.d((Object)kotlinx.coroutines.channels.f.z());
    }

    private static final k0 J(kotlin.jvm.functions.l l4, Object object, Throwable throwable, Object object2, kotlin.coroutines.g g4) {
        kotlinx.coroutines.internal.w.a((kotlin.jvm.functions.l)l4, (Object)object, (kotlin.coroutines.g)g4);
        return k0.a;
    }

    private final void J0(E e4, kotlinx.coroutines.selects.l<?> l4) {
        kotlin.jvm.functions.l<E, k0> l5 = this.d;
        if (l5 != null) {
            kotlinx.coroutines.internal.w.a(l5, e4, (kotlin.coroutines.g)l4.getContext());
        }
        l4.d((Object)kotlinx.coroutines.channels.f.z());
    }

    private final KFunction<k0> K(kotlin.jvm.functions.l<? super E, k0> l4) {
        return new kotlin.jvm.functions.q<Throwable, kotlinx.coroutines.channels.k<? extends E>, kotlin.coroutines.g, k0>(this){

            public final void a(Throwable throwable, Object object, kotlin.coroutines.g g4) {
                ((e)this.receiver).D0(throwable, object, g4);
            }
        };
    }

    private final Object K0(E object, kotlin.coroutines.d<? super k0> d4) {
        kotlinx.coroutines.p p4 = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.c(d4), 1);
        p4.H();
        Object object2 = this.d;
        if (object2 != null && (object2 = kotlinx.coroutines.internal.w.c(object2, object, null, (int)2, null)) != null) {
            kotlin.f.a((Throwable)object2, this.i0());
            object = u.d;
            p4.resumeWith(u.b((Object)v.a((Throwable)object2)));
        } else {
            object2 = this.i0();
            object = u.d;
            p4.resumeWith(u.b((Object)v.a((Throwable)object2)));
        }
        object = p4.z();
        if (object == kotlin.coroutines.intrinsics.b.f()) {
            kotlin.coroutines.jvm.internal.g.c(d4);
        }
        if (object == kotlin.coroutines.intrinsics.b.f()) {
            return object;
        }
        return k0.a;
    }

    private final boolean L(long l4) {
        boolean bl = l4 < this.Z() || l4 < this.h0() + (long)this.c;
        return bl;
    }

    private final void L0(E object, n<? super k0> n4) {
        u.a a4 = this.d;
        if (a4 != null) {
            kotlinx.coroutines.internal.w.a(a4, object, (kotlin.coroutines.g)n4.getContext());
        }
        object = this.i0();
        a4 = u.d;
        n4.resumeWith(u.b((Object)v.a(object)));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void N(kotlinx.coroutines.channels.l<E> var1_1, long var2_2) {
        var5_3 /* !! */  = kotlinx.coroutines.internal.j.b(null, (int)1, null);
        var6_4 = var1_1;
        var1_1 = var5_3 /* !! */ ;
        block0: while (true) {
            var5_3 /* !! */  = var1_1;
            if (var6_4 == null) break;
            for (var4_5 = kotlinx.coroutines.channels.f.b - 1; -1 < var4_5; --var4_5) {
                block7: {
                    var5_3 /* !! */  = var1_1;
                    if (var6_4.e * (long)kotlinx.coroutines.channels.f.b + (long)var4_5 < var2_2) break block0;
                    do lbl-1000:
                    // 4 sources

                    {
                        block8: {
                            if ((var7_6 = var6_4.B(var4_5)) == null || var7_6 == kotlinx.coroutines.channels.f.k()) continue;
                            if (!(var7_6 instanceof z)) break block8;
                            if (!var6_4.v(var4_5, var7_6, kotlinx.coroutines.channels.f.z())) ** GOTO lbl-1000
                            var5_3 /* !! */  = kotlinx.coroutines.internal.j.c((Object)var1_1, (Object)((z)var7_6).a);
                            var6_4.C(var4_5, true);
                            break block7;
                        }
                        var5_3 /* !! */  = var1_1;
                        if (!(var7_6 instanceof k3)) break block7;
                        if (!var6_4.v(var4_5, var7_6, kotlinx.coroutines.channels.f.z())) ** GOTO lbl-1000
                        var5_3 /* !! */  = kotlinx.coroutines.internal.j.c((Object)var1_1, (Object)var7_6);
                        var6_4.C(var4_5, true);
                        break block7;
                    } while (!var6_4.v(var4_5, var7_6, kotlinx.coroutines.channels.f.z()));
                    var6_4.t();
                    var5_3 /* !! */  = var1_1;
                }
                var1_1 = var5_3 /* !! */ ;
            }
            var6_4 = (kotlinx.coroutines.channels.l)var6_4.h();
        }
        if (var5_3 /* !! */  != null) {
            if (!(var5_3 /* !! */  instanceof ArrayList)) {
                this.c1((k3)var5_3 /* !! */ );
            } else {
                y.h((Object)var5_3 /* !! */ , (String)"null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                var1_1 = (ArrayList)var5_3 /* !! */ ;
                for (var4_5 = var1_1.size() - 1; -1 < var4_5; --var4_5) {
                    this.c1((k3)var1_1.get(var4_5));
                }
            }
        }
    }

    private final kotlinx.coroutines.channels.l<E> O() {
        Object object = kotlinx.coroutines.channels.e.l.get(this);
        kotlinx.coroutines.channels.l<Object> l4 = (kotlinx.coroutines.channels.l)((Object)kotlinx.coroutines.channels.e.j.get(this));
        Object object2 = object;
        if (l4.e > ((kotlinx.coroutines.channels.l)((Object)object)).e) {
            object2 = l4;
        }
        object = (kotlinx.coroutines.channels.l)((Object)kotlinx.coroutines.channels.e.k.get(this));
        l4 = object2;
        if (((a0)((Object)object)).e > ((kotlinx.coroutines.channels.l)((Object)object2)).e) {
            l4 = object;
        }
        return (kotlinx.coroutines.channels.l)kotlinx.coroutines.internal.a.b((kotlinx.coroutines.internal.b)l4);
    }

    private static final kotlin.jvm.functions.q O0(e e4, kotlinx.coroutines.selects.l l4, Object object, Object object2) {
        return new d(object2, e4, l4);
    }

    private static final k0 P0(Object object, e e4, kotlinx.coroutines.selects.l l4, Throwable throwable, Object object2, kotlin.coroutines.g g4) {
        if (object != kotlinx.coroutines.channels.f.z()) {
            kotlinx.coroutines.internal.w.a(e4.d, (Object)object, (kotlin.coroutines.g)l4.getContext());
        }
        return k0.a;
    }

    private final void Q(long l4) {
        this.b1(this.R(l4));
    }

    private final void Q0(k3 k32, kotlinx.coroutines.channels.l<E> l4, int n4) {
        this.N0();
        k32.c(l4, n4);
    }

    private final kotlinx.coroutines.channels.l<E> R(long l4) {
        long l5;
        kotlinx.coroutines.channels.l<E> l6 = this.O();
        if (this.w0() && (l5 = this.y0(l6)) != -1L) {
            this.T(l5);
        }
        this.N(l6, l4);
        return l6;
    }

    private final void R0(k3 k32, kotlinx.coroutines.channels.l<E> l4, int n4) {
        k32.c(l4, n4 + kotlinx.coroutines.channels.f.b);
    }

    private final void S() {
        this.isClosedForSend();
    }

    private final Object S0(Object object, Object object2) {
        if (object2 != kotlinx.coroutines.channels.f.z()) {
            return object2;
        }
        throw this.e0();
    }

    private final Object T0(Object object, Object object2) {
        object = object2 == kotlinx.coroutines.channels.f.z() ? kotlinx.coroutines.channels.k.b.a(this.b0()) : kotlinx.coroutines.channels.k.b.c(object2);
        return kotlinx.coroutines.channels.k.b((Object)object);
    }

    private final void U() {
        if (this.x0()) {
            return;
        }
        kotlinx.coroutines.channels.l<E> l4 = (kotlinx.coroutines.channels.l<E>)((Object)kotlinx.coroutines.channels.e.l.get(this));
        while (true) {
            long l5 = kotlinx.coroutines.channels.e.h.getAndIncrement(this);
            int n4 = kotlinx.coroutines.channels.f.b;
            long l6 = l5 / (long)n4;
            if (this.l0() <= l5) {
                if (l4.e < l6 && l4.f() != null) {
                    this.C0(l6, l4);
                }
                kotlinx.coroutines.channels.e.p0(this, 0L, 1, null);
                return;
            }
            kotlinx.coroutines.channels.l<E> l7 = l4;
            if (l4.e != l6 && (l7 = this.V(l6, l4, l5)) == null) continue;
            if (this.l1(l7, (int)(l5 % (long)n4), l5)) {
                kotlinx.coroutines.channels.e.p0(this, 0L, 1, null);
                return;
            }
            kotlinx.coroutines.channels.e.p0(this, 0L, 1, null);
            l4 = l7;
        }
    }

    private final Object U0(Object object, Object object2) {
        if (object2 != kotlinx.coroutines.channels.f.z()) {
            return this;
        }
        throw this.i0();
    }

    private final kotlinx.coroutines.channels.l<E> V(long l4, kotlinx.coroutines.channels.l<E> object, long l5) {
        block6: {
            int n4;
            Object object2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            block5: {
                atomicReferenceFieldUpdater = kotlinx.coroutines.channels.e.l;
                kotlin.jvm.functions.p p4 = (kotlin.jvm.functions.p)((Object)kotlinx.coroutines.channels.f.y());
                block0: while (!b0.c((Object)(object2 = kotlinx.coroutines.internal.a.c(object, (long)l4, (kotlin.jvm.functions.p)p4)))) {
                    a0 a02 = b0.b((Object)object2);
                    while (true) {
                        a0 a03 = (a0)((Object)atomicReferenceFieldUpdater.get(this));
                        if (a03.e >= a02.e) break block0;
                        if (!a02.u()) continue block0;
                        if (androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)atomicReferenceFieldUpdater, (Object)this, (Object)((Object)a03), (Object)((Object)a02))) {
                            if (!a03.p()) break block0;
                            a03.n();
                            break block0;
                        }
                        if (!a02.p()) continue;
                        a02.n();
                    }
                }
                boolean bl = b0.c((Object)object2);
                atomicReferenceFieldUpdater = null;
                if (!bl) break block5;
                this.S();
                this.C0(l4, (kotlinx.coroutines.channels.l<E>)((Object)object));
                kotlinx.coroutines.channels.e.p0(this, 0L, 1, null);
                object = atomicReferenceFieldUpdater;
                break block6;
            }
            object = (kotlinx.coroutines.channels.l)b0.b((Object)object2);
            if (object.e <= l4) break block6;
            object2 = kotlinx.coroutines.channels.e.h;
            if (((AtomicLongFieldUpdater)object2).compareAndSet(this, l5 + 1L, (l4 = object.e) * (long)(n4 = kotlinx.coroutines.channels.f.b))) {
                this.o0(object.e * (long)n4 - l5);
                object = atomicReferenceFieldUpdater;
            } else {
                kotlinx.coroutines.channels.e.p0(this, 0L, 1, null);
                object = atomicReferenceFieldUpdater;
            }
        }
        return object;
    }

    static /* synthetic */ <E> Object V0(e<E> e4, kotlin.coroutines.d<? super E> d4) {
        Object object = (kotlinx.coroutines.channels.l)((Object)kotlinx.coroutines.channels.e.f0().get(e4));
        while (!e4.t0()) {
            long l4 = kotlinx.coroutines.channels.e.g0().getAndIncrement(e4);
            int n4 = kotlinx.coroutines.channels.f.b;
            long l5 = l4 / (long)n4;
            n4 = (int)(l4 % (long)n4);
            kotlinx.coroutines.channels.l l6 = object;
            if (object.e != l5 && (l6 = ((e)e4).W(l5, object)) == null) continue;
            object = ((e)e4).n1(l6, n4, l4, null);
            if (object != kotlinx.coroutines.channels.f.r()) {
                if (object == kotlinx.coroutines.channels.f.h()) {
                    object = l6;
                    if (l4 >= e4.l0()) continue;
                    l6.c();
                    object = l6;
                    continue;
                }
                if (object == kotlinx.coroutines.channels.f.s()) {
                    return super.Y0(l6, n4, l4, d4);
                }
                l6.c();
                return object;
            }
            throw new IllegalStateException("unexpected".toString());
        }
        throw c0.a((Throwable)super.e0());
    }

    private final kotlinx.coroutines.channels.l<E> W(long l4, kotlinx.coroutines.channels.l<E> l5) {
        Object object;
        Object object2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.channels.e.k;
        kotlin.jvm.functions.p p4 = (kotlin.jvm.functions.p)((Object)kotlinx.coroutines.channels.f.y());
        block0: while (!b0.c((Object)(object2 = kotlinx.coroutines.internal.a.c(l5, (long)l4, (kotlin.jvm.functions.p)p4)))) {
            object = b0.b((Object)object2);
            while (true) {
                a0 a02 = (a0)((Object)atomicReferenceFieldUpdater.get(this));
                if (a02.e >= ((a0)((Object)object)).e) break block0;
                if (!((a0)((Object)object)).u()) continue block0;
                if (androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)atomicReferenceFieldUpdater, (Object)this, (Object)((Object)a02), (Object)object)) {
                    if (!a02.p()) break block0;
                    a02.n();
                    break block0;
                }
                if (!((a0)((Object)object)).p()) continue;
                object.n();
            }
        }
        boolean bl = b0.c((Object)object2);
        atomicReferenceFieldUpdater = null;
        if (bl) {
            this.S();
            object2 = atomicReferenceFieldUpdater;
            if (l5.e * (long)kotlinx.coroutines.channels.f.b < this.l0()) {
                l5.c();
                object2 = atomicReferenceFieldUpdater;
            }
        } else {
            long l6;
            l5 = (kotlinx.coroutines.channels.l)b0.b((Object)object2);
            if (!this.x0() && l4 <= this.Z() / (long)kotlinx.coroutines.channels.f.b) {
                object = kotlinx.coroutines.channels.e.l;
                while (true) {
                    object2 = (a0)((Object)((AtomicReferenceFieldUpdater)object).get(this));
                    if (((a0)((Object)object2)).e >= l5.e || !l5.u()) break;
                    if (androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)object, (Object)this, (Object)object2, (Object)((Object)l5))) {
                        if (!((a0)((Object)object2)).p()) break;
                        object2.n();
                        break;
                    }
                    if (!l5.p()) continue;
                    l5.n();
                }
            }
            if ((l6 = l5.e) > l4) {
                int n4 = kotlinx.coroutines.channels.f.b;
                this.r1(l6 * (long)n4);
                object2 = atomicReferenceFieldUpdater;
                if (l5.e * (long)n4 < this.l0()) {
                    l5.c();
                    object2 = atomicReferenceFieldUpdater;
                }
            } else {
                object2 = l5;
            }
        }
        return object2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static /* synthetic */ <E> Object W0(e<E> var0, kotlin.coroutines.d<? super kotlinx.coroutines.channels.k<? extends E>> var1_1) {
        block10: {
            block9: {
                if (!(var1_1 instanceof k)) ** GOTO lbl-1000
                var7_2 /* !! */  = var1_1;
                var2_3 = var7_2 /* !! */ .n;
                if ((var2_3 & -2147483648) != 0) {
                    var7_2 /* !! */ .n = var2_3 + -2147483648;
                    var1_1 = var7_2 /* !! */ ;
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = new kotlin.coroutines.jvm.internal.d(var0, (kotlin.coroutines.d<? super k>)var1_1){
                        Object l;
                        final e<E> m;
                        int n;
                        {
                            this.m = e4;
                            super(d4);
                        }

                        @Override
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object object) {
                            this.l = object;
                            this.n |= Integer.MIN_VALUE;
                            object = kotlinx.coroutines.channels.e.W0(this.m, this);
                            if (object == kotlin.coroutines.intrinsics.b.f()) {
                                return object;
                            }
                            return kotlinx.coroutines.channels.k.b((Object)object);
                        }
                    };
                }
                var7_2 /* !! */  = var1_1.l;
                var9_4 = kotlin.coroutines.intrinsics.b.f();
                var2_3 = var1_1.n;
                if (var2_3 == 0) ** GOTO lbl18
                if (var2_3 == 1) {
                    v.b((Object)var7_2 /* !! */ );
                    var0 = ((kotlinx.coroutines.channels.k)var7_2 /* !! */ ).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl18:
                    // 1 sources

                    v.b((Object)var7_2 /* !! */ );
                    var7_2 /* !! */  = (kotlinx.coroutines.channels.l)kotlinx.coroutines.channels.e.k().get(var0);
                    while (true) {
                        if (var0.t0()) {
                            var0 = kotlinx.coroutines.channels.k.b.a(var0.b0());
                            break block9;
                        }
                        var5_6 = kotlinx.coroutines.channels.e.l().getAndIncrement(var0);
                        var2_3 = kotlinx.coroutines.channels.f.b;
                        var3_5 = var5_6 / (long)var2_3;
                        var2_3 = (int)(var5_6 % (long)var2_3);
                        var8_7 /* !! */  = var7_2 /* !! */ ;
                        if (var7_2 /* !! */ .e != var3_5 && (var8_7 /* !! */  = kotlinx.coroutines.channels.e.g((e)var0, var3_5, (kotlinx.coroutines.channels.l)var7_2 /* !! */ )) == null) continue;
                        var7_2 /* !! */  = kotlinx.coroutines.channels.e.E((e)var0, (kotlinx.coroutines.channels.l)var8_7 /* !! */ , var2_3, var5_6, null);
                        if (var7_2 /* !! */  == kotlinx.coroutines.channels.f.r()) break block10;
                        if (var7_2 /* !! */  != kotlinx.coroutines.channels.f.h()) break;
                        var7_2 /* !! */  = var8_7 /* !! */ ;
                        if (var5_6 >= var0.l0()) continue;
                        var8_7 /* !! */ .c();
                        var7_2 /* !! */  = var8_7 /* !! */ ;
                    }
                    if (var7_2 /* !! */  == kotlinx.coroutines.channels.f.s()) {
                        var1_1.n = 1;
                        var0 = var1_1 = super.X0((kotlinx.coroutines.channels.l<kotlinx.coroutines.channels.k<E>>)var8_7 /* !! */ , var2_3, var5_6, (kotlin.coroutines.d<kotlinx.coroutines.channels.k<kotlinx.coroutines.channels.k<E>>>)var1_1);
                        if (var1_1 == var9_4) {
                            return var9_4;
                        }
                    } else {
                        var8_7 /* !! */ .c();
                        var0 = kotlinx.coroutines.channels.k.b.c(var7_2 /* !! */ );
                    }
                }
            }
            return var0;
        }
        throw new IllegalStateException("unexpected".toString());
    }

    private final kotlinx.coroutines.channels.l<E> X(long l4, kotlinx.coroutines.channels.l<E> l5) {
        a0 a02;
        Object object;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.channels.e.j;
        kotlin.jvm.functions.p p4 = (kotlin.jvm.functions.p)((Object)kotlinx.coroutines.channels.f.y());
        block0: while (!b0.c((Object)(object = kotlinx.coroutines.internal.a.c(l5, (long)l4, (kotlin.jvm.functions.p)p4)))) {
            a02 = b0.b((Object)object);
            while (true) {
                a0 a03 = (a0)((Object)atomicReferenceFieldUpdater.get(this));
                if (a03.e >= a02.e) break block0;
                if (!a02.u()) continue block0;
                if (androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)atomicReferenceFieldUpdater, (Object)this, (Object)((Object)a03), (Object)((Object)a02))) {
                    if (!a03.p()) break block0;
                    a03.n();
                    break block0;
                }
                if (!a02.p()) continue;
                a02.n();
            }
        }
        boolean bl = b0.c((Object)object);
        a02 = null;
        if (bl) {
            this.S();
            object = a02;
            if (l5.e * (long)kotlinx.coroutines.channels.f.b < this.h0()) {
                l5.c();
                object = a02;
            }
        } else {
            l5 = (kotlinx.coroutines.channels.l)b0.b((Object)object);
            long l6 = l5.e;
            if (l6 > l4) {
                int n4 = kotlinx.coroutines.channels.f.b;
                this.s1(l6 * (long)n4);
                object = a02;
                if (l5.e * (long)n4 < this.h0()) {
                    l5.c();
                    object = a02;
                }
            } else {
                object = l5;
            }
        }
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Object X0(kotlinx.coroutines.channels.l<E> var1_1, int var2_3, long var3_4, kotlin.coroutines.d<? super kotlinx.coroutines.channels.k<? extends E>> var5_5) {
        block16: {
            if (!(var5_5 instanceof l)) ** GOTO lbl-1000
            var9_6 /* !! */  = var5_5;
            var6_7 = var9_6 /* !! */ .r;
            if ((var6_7 & -2147483648) != 0) {
                var9_6 /* !! */ .r = var6_7 + -2147483648;
                var5_5 = var9_6 /* !! */ ;
            } else lbl-1000:
            // 2 sources

            {
                var5_5 = new kotlin.coroutines.jvm.internal.d(this, (kotlin.coroutines.d<? super l>)var5_5){
                    Object l;
                    Object m;
                    int n;
                    long o;
                    Object p;
                    final e<E> q;
                    int r;
                    {
                        this.q = e4;
                        super(d4);
                    }

                    @Override
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object object) {
                        this.p = object;
                        this.r |= Integer.MIN_VALUE;
                        object = this.q.X0(null, 0, 0L, this);
                        if (object == kotlin.coroutines.intrinsics.b.f()) {
                            return object;
                        }
                        return kotlinx.coroutines.channels.k.b((Object)object);
                    }
                };
            }
            var9_6 /* !! */  = var5_5.p;
            var11_8 = kotlin.coroutines.intrinsics.b.f();
            var6_7 = var5_5.r;
            if (var6_7 != 0) {
                if (var6_7 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                var1_1 /* !! */  = (kotlinx.coroutines.channels.l)var5_5.m;
                var1_1 /* !! */  = (e)var5_5.l;
                v.b((Object)var9_6 /* !! */ );
                var1_1 /* !! */  = var9_6 /* !! */ ;
                return ((kotlinx.coroutines.channels.k)var1_1 /* !! */ ).k();
            }
            v.b((Object)var9_6 /* !! */ );
            var5_5.l = this;
            var5_5.m = var1_1 /* !! */ ;
            var5_5.n = var2_3;
            var5_5.o = var3_4;
            var5_5.r = 1;
            var12_9 = r.b((kotlin.coroutines.d)kotlin.coroutines.intrinsics.b.c((kotlin.coroutines.d)var5_5));
            y.h((Object)var12_9, (String)"null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$38>>");
            var13_10 = new kotlin.jvm.functions.l<E, k0>(var12_9);
            var14_11 = kotlinx.coroutines.channels.e.E(this, var1_1 /* !! */ , var2_3, var3_4, var13_10);
            if (var14_11 == kotlinx.coroutines.channels.f.r()) {
                kotlinx.coroutines.channels.e.w(this, var13_10, var1_1 /* !! */ , var2_3);
                break block16;
            }
            var15_12 = kotlinx.coroutines.channels.f.h();
            var9_6 /* !! */  = null;
            var10_13 = null;
            if (var14_11 != var15_12) ** GOTO lbl42
            if (var3_4 < this.l0()) {
                var1_1 /* !! */ .c();
            }
            var1_1 /* !! */  = (kotlinx.coroutines.channels.l)kotlinx.coroutines.channels.e.k().get(this);
            ** GOTO lbl53
            {
                block17: {
                    catch (Throwable var1_2) {}
lbl42:
                    // 1 sources

                    var1_1 /* !! */ .c();
                    var10_13 = kotlinx.coroutines.channels.k.b((Object)kotlinx.coroutines.channels.k.b.c(var14_11));
                    var13_10 = this.d;
                    var1_1 /* !! */  = var9_6 /* !! */ ;
                    if (var13_10 != null) {
                        var1_1 /* !! */  = kotlinx.coroutines.channels.e.f(this, var13_10);
                    }
                    var1_1 /* !! */  = (kotlin.jvm.functions.q)var1_1 /* !! */ ;
                    var9_6 /* !! */  = var10_13;
                    break block17;
                    var12_9.P();
                    throw var1_2;
lbl53:
                    // 1 sources

                    while (true) {
                        if (this.t0()) {
                            kotlinx.coroutines.channels.e.t(this, var12_9);
                            break block16;
                        }
                        var7_14 = kotlinx.coroutines.channels.e.l().getAndIncrement(this);
                        var2_3 = kotlinx.coroutines.channels.f.b;
                        var3_4 = var7_14 / (long)var2_3;
                        var2_3 = (int)(var7_14 % (long)var2_3);
                        var9_6 /* !! */  = var1_1 /* !! */ ;
                        if (var1_1 /* !! */ .e != var3_4 && (var9_6 /* !! */  = kotlinx.coroutines.channels.e.g(this, var3_4, var1_1 /* !! */ )) == null) continue;
                        var1_1 /* !! */  = kotlinx.coroutines.channels.e.E(this, (kotlinx.coroutines.channels.l)var9_6 /* !! */ , var2_3, var7_14, var13_10);
                        if (var1_1 /* !! */  == kotlinx.coroutines.channels.f.r()) {
                            kotlinx.coroutines.channels.e.w(this, (k3)var13_10, (kotlinx.coroutines.channels.l)var9_6 /* !! */ , var2_3);
                            break block16;
                        }
                        if (var1_1 /* !! */  != kotlinx.coroutines.channels.f.h()) break;
                        var1_1 /* !! */  = var9_6 /* !! */ ;
                        if (var7_14 >= this.l0()) continue;
                        var9_6 /* !! */ .c();
                        var1_1 /* !! */  = var9_6 /* !! */ ;
                    }
                    if (var1_1 /* !! */  == kotlinx.coroutines.channels.f.s()) {
                        var1_1 /* !! */  = new IllegalStateException("unexpected".toString());
                        throw var1_1 /* !! */ ;
                    }
                    var9_6 /* !! */ .c();
                    var9_6 /* !! */  = kotlinx.coroutines.channels.k.b((Object)kotlinx.coroutines.channels.k.b.c((Object)var1_1 /* !! */ ));
                    var13_10 = this.d;
                    var1_1 /* !! */  = var10_13;
                    if (var13_10 != null) {
                        var1_1 /* !! */  = kotlinx.coroutines.channels.e.f(this, var13_10);
                    }
                    var1_1 /* !! */  = (kotlin.jvm.functions.q)var1_1 /* !! */ ;
                }
                var12_9.p(var9_6 /* !! */ , var1_1 /* !! */ );
            }
        }
        var9_6 /* !! */  = var12_9.z();
        if (var9_6 /* !! */  == kotlin.coroutines.intrinsics.b.f()) {
            kotlin.coroutines.jvm.internal.g.c((kotlin.coroutines.d)var5_5);
        }
        var1_1 /* !! */  = var9_6 /* !! */ ;
        if (var9_6 /* !! */  != var11_8) return ((kotlinx.coroutines.channels.k)var1_1 /* !! */ ).k();
        return var11_8;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Object Y0(kotlinx.coroutines.channels.l<E> var1_1, int var2_3, long var3_4, kotlin.coroutines.d<? super E> var5_5) {
        block15: {
            var9_6 = r.b((kotlin.coroutines.d)kotlin.coroutines.intrinsics.b.c(var5_5));
            var8_7 /* !! */  = kotlinx.coroutines.channels.e.E(this, var1_1 /* !! */ , var2_3, var3_4, var9_6);
            if (var8_7 /* !! */  == kotlinx.coroutines.channels.f.r()) {
                kotlinx.coroutines.channels.e.w(this, var9_6, var1_1 /* !! */ , var2_3);
                break block15;
            }
            var13_8 = kotlinx.coroutines.channels.f.h();
            var10_9 = null;
            var12_10 = null;
            var11_11 = null;
            if (var8_7 /* !! */  != var13_8) ** GOTO lbl17
            if (var3_4 < this.l0()) {
                var1_1 /* !! */ .c();
            }
            var8_7 /* !! */  = (kotlinx.coroutines.channels.l)kotlinx.coroutines.channels.e.k().get(this);
            ** GOTO lbl26
            {
                block16: {
                    catch (Throwable var1_2) {}
lbl17:
                    // 1 sources

                    var1_1 /* !! */ .c();
                    var10_9 = this.d;
                    var1_1 /* !! */  = var12_10;
                    if (var10_9 != null) {
                        var1_1 /* !! */  = kotlinx.coroutines.channels.e.e(this, var10_9);
                    }
                    var1_1 /* !! */  = (kotlin.jvm.functions.q)var1_1 /* !! */ ;
                    break block16;
                    var9_6.P();
                    throw var1_2;
lbl26:
                    // 1 sources

                    while (true) {
                        if (this.t0()) {
                            kotlinx.coroutines.channels.e.u(this, var9_6);
                            break block15;
                        }
                        var6_12 = kotlinx.coroutines.channels.e.l().getAndIncrement(this);
                        var2_3 = kotlinx.coroutines.channels.f.b;
                        var3_4 = var6_12 / (long)var2_3;
                        var2_3 = (int)(var6_12 % (long)var2_3);
                        var1_1 /* !! */  = var8_7 /* !! */ ;
                        if (var8_7 /* !! */ .e != var3_4 && (var1_1 /* !! */  = kotlinx.coroutines.channels.e.g(this, var3_4, (kotlinx.coroutines.channels.l)var8_7 /* !! */ )) == null) continue;
                        var8_7 /* !! */  = kotlinx.coroutines.channels.e.E(this, var1_1 /* !! */ , var2_3, var6_12, var9_6);
                        if (var8_7 /* !! */  == kotlinx.coroutines.channels.f.r()) {
                            var8_7 /* !! */  = var11_11;
                            if (var9_6 instanceof k3) {
                                var8_7 /* !! */  = var9_6;
                            }
                            if (var8_7 /* !! */  != null) {
                                kotlinx.coroutines.channels.e.w(this, (k3)var8_7 /* !! */ , var1_1 /* !! */ , var2_3);
                            }
                            break block15;
                        }
                        if (var8_7 /* !! */  != kotlinx.coroutines.channels.f.h()) break;
                        var8_7 /* !! */  = var1_1 /* !! */ ;
                        if (var6_12 >= this.l0()) continue;
                        var1_1 /* !! */ .c();
                        var8_7 /* !! */  = var1_1 /* !! */ ;
                    }
                    if (var8_7 /* !! */  == kotlinx.coroutines.channels.f.s()) {
                        var1_1 /* !! */  = new IllegalStateException("unexpected".toString());
                        throw var1_1 /* !! */ ;
                    }
                    var1_1 /* !! */ .c();
                    var11_11 = this.d;
                    var1_1 /* !! */  = var10_9;
                    if (var11_11 != null) {
                        var1_1 /* !! */  = kotlinx.coroutines.channels.e.e(this, var11_11);
                    }
                    var1_1 /* !! */  = (kotlin.jvm.functions.q)var1_1 /* !! */ ;
                }
                var9_6.p(var8_7 /* !! */ , var1_1 /* !! */ );
            }
        }
        var1_1 /* !! */  = var9_6.z();
        if (var1_1 /* !! */  == kotlin.coroutines.intrinsics.b.f()) {
            kotlin.coroutines.jvm.internal.g.c(var5_5);
        }
        return var1_1 /* !! */ ;
    }

    private final long Z() {
        return kotlinx.coroutines.channels.e.h.get(this);
    }

    private final void Z0(kotlinx.coroutines.selects.l<?> object, Object object2) {
        block10: {
            block9: {
                Object object3 = (kotlinx.coroutines.channels.l)((Object)kotlinx.coroutines.channels.e.f0().get(this));
                while (true) {
                    if (this.t0()) {
                        this.I0((kotlinx.coroutines.selects.l<?>)object);
                        break block9;
                    }
                    long l4 = kotlinx.coroutines.channels.e.g0().getAndIncrement(this);
                    int n4 = kotlinx.coroutines.channels.f.b;
                    long l5 = l4 / (long)n4;
                    n4 = (int)(l4 % (long)n4);
                    object2 = object3;
                    if (object3.e != l5 && (object2 = this.W(l5, object3)) == null) continue;
                    object3 = this.n1((kotlinx.coroutines.channels.l)((Object)object2), n4, l4, object);
                    if (object3 == kotlinx.coroutines.channels.f.r()) {
                        if ((object = object instanceof k3 ? (k3)object : null) != null) {
                            this.Q0(object, (kotlinx.coroutines.channels.l)((Object)object2), n4);
                        }
                        break block9;
                    }
                    if (object3 != kotlinx.coroutines.channels.f.h()) break;
                    object3 = object2;
                    if (l4 >= this.l0()) continue;
                    object2.c();
                    object3 = object2;
                }
                if (object3 == kotlinx.coroutines.channels.f.s()) break block10;
                object2.c();
                object.d(object3);
            }
            return;
        }
        throw new IllegalStateException("unexpected".toString());
    }

    public static /* synthetic */ k0 a(Object object, e e4, kotlinx.coroutines.selects.l l4, Throwable throwable, Object object2, kotlin.coroutines.g g4) {
        return kotlinx.coroutines.channels.e.P0(object, e4, l4, throwable, object2, g4);
    }

    public static /* synthetic */ kotlin.jvm.functions.q b(e e4, kotlinx.coroutines.selects.l l4, Object object, Object object2) {
        return kotlinx.coroutines.channels.e.O0(e4, l4, object, object2);
    }

    private final void b1(kotlinx.coroutines.channels.l<E> object) {
        int n4;
        Object object2;
        kotlinx.coroutines.channels.l l4;
        kotlin.jvm.functions.l<E, k0> l5 = this.d;
        kotlinx.coroutines.channels.l l6 = null;
        Object object3 = kotlinx.coroutines.internal.j.b(null, (int)1, null);
        kotlinx.coroutines.channels.l l7 = object;
        block0: do {
            object2 = object3;
            object = l6;
            block1: for (n4 = kotlinx.coroutines.channels.f.b - 1; -1 < n4; --n4) {
                long l8 = l7.e * (long)kotlinx.coroutines.channels.f.b + (long)n4;
                while ((object3 = l7.B(n4)) != kotlinx.coroutines.channels.f.f()) {
                    if (object3 == kotlinx.coroutines.channels.f.d) {
                        if (l8 < this.h0()) break block0;
                        if (!l7.v(n4, object3, kotlinx.coroutines.channels.f.z())) continue;
                        object3 = object;
                        if (l5 != null) {
                            object3 = kotlinx.coroutines.internal.w.b(l5, l7.A(n4), (r0)object);
                        }
                        l7.w(n4);
                        l7.t();
                        object = object3;
                        continue block1;
                    }
                    if (object3 != kotlinx.coroutines.channels.f.k() && object3 != null) {
                        if (!(object3 instanceof k3) && !(object3 instanceof z)) {
                            if (object3 == kotlinx.coroutines.channels.f.p() || object3 == kotlinx.coroutines.channels.f.q()) break block0;
                            if (object3 == kotlinx.coroutines.channels.f.p()) continue;
                            continue block1;
                        }
                        if (l8 < this.h0()) break block0;
                        l6 = object3 instanceof z ? ((z)object3).a : (k3)object3;
                        if (!l7.v(n4, object3, kotlinx.coroutines.channels.f.z())) continue;
                        object3 = object;
                        if (l5 != null) {
                            object3 = kotlinx.coroutines.internal.w.b(l5, l7.A(n4), (r0)object);
                        }
                        object2 = kotlinx.coroutines.internal.j.c((Object)object2, (Object)((Object)l6));
                        l7.w(n4);
                        l7.t();
                        object = object3;
                        continue block1;
                    }
                    if (!l7.v(n4, object3, kotlinx.coroutines.channels.f.z())) continue;
                    l7.t();
                    continue block1;
                }
                break block0;
            }
            l4 = (kotlinx.coroutines.channels.l)l7.h();
            l6 = object;
            object3 = object2;
            l7 = l4;
        } while (l4 != null);
        if (object2 != null) {
            if (!(object2 instanceof ArrayList)) {
                this.d1((k3)object2);
            } else {
                y.h((Object)object2, (String)"null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                object3 = (ArrayList)object2;
                for (n4 = ((ArrayList)object3).size() - 1; -1 < n4; --n4) {
                    this.d1((k3)((ArrayList)object3).get(n4));
                }
            }
        }
        if (object == null) {
            return;
        }
        throw object;
    }

    public static /* synthetic */ k0 c(kotlin.jvm.functions.l l4, Object object, Throwable throwable, Object object2, kotlin.coroutines.g g4) {
        return kotlinx.coroutines.channels.e.J(l4, object, throwable, object2, g4);
    }

    private final void c1(k3 k32) {
        this.e1(k32, true);
    }

    private final void d1(k3 k32) {
        this.e1(k32, false);
    }

    public static final /* synthetic */ KFunction e(e e4, kotlin.jvm.functions.l l4) {
        return e4.I(l4);
    }

    private final Throwable e0() {
        Throwable throwable;
        Throwable throwable2 = throwable = this.b0();
        if (throwable == null) {
            throwable2 = new p("Channel was closed");
        }
        return throwable2;
    }

    private final void e1(k3 object, boolean bl) {
        block7: {
            block3: {
                block6: {
                    block5: {
                        block4: {
                            block2: {
                                if (!(object instanceof b)) break block2;
                                object = ((b)object).a();
                                u.a a4 = u.d;
                                object.resumeWith(u.b((Object)Boolean.FALSE));
                                break block3;
                            }
                            if (!(object instanceof n)) break block4;
                            kotlin.coroutines.d d4 = (kotlin.coroutines.d)object;
                            object = u.d;
                            object = bl ? this.e0() : this.i0();
                            d4.resumeWith(u.b((Object)v.a((Throwable)object)));
                            break block3;
                        }
                        if (!(object instanceof w)) break block5;
                        kotlinx.coroutines.p p4 = ((w)object).c;
                        object = u.d;
                        p4.resumeWith(u.b((Object)kotlinx.coroutines.channels.k.b((Object)kotlinx.coroutines.channels.k.b.a(this.b0()))));
                        break block3;
                    }
                    if (!(object instanceof a)) break block6;
                    ((a)object).j();
                    break block3;
                }
                if (!(object instanceof kotlinx.coroutines.selects.l)) break block7;
                ((kotlinx.coroutines.selects.l)object).f((Object)this, (Object)kotlinx.coroutines.channels.f.z());
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected waiter: ");
        stringBuilder.append(object);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public static final /* synthetic */ KFunction f(e e4, kotlin.jvm.functions.l l4) {
        return e4.K(l4);
    }

    static /* synthetic */ <E> Object f1(e<E> object, E e4, kotlin.coroutines.d<? super k0> d4) {
        block9: {
            kotlinx.coroutines.channels.l l4;
            block10: {
                boolean bl;
                block11: {
                    int n4;
                    long l5;
                    block12: {
                        kotlinx.coroutines.channels.l l6 = (kotlinx.coroutines.channels.l)((Object)kotlinx.coroutines.channels.e.j0().get(object));
                        while (true) {
                            long l7 = kotlinx.coroutines.channels.e.k0().getAndIncrement(object);
                            l5 = 0xFFFFFFFFFFFFFFFL & l7;
                            bl = ((e)object).v0(l7);
                            n4 = kotlinx.coroutines.channels.f.b;
                            l7 = l5 / (long)n4;
                            n4 = (int)(l5 % (long)n4);
                            l4 = l6;
                            if (l6.e != l7 && (l4 = ((e)object).X(l7, l6)) == null) {
                                if (!bl) continue;
                                if ((object = super.K0(e4, d4)) == kotlin.coroutines.intrinsics.b.f()) {
                                    return object;
                                }
                                break block9;
                            }
                            int n5 = ((e)object).p1(l4, n4, e4, l5, null, bl);
                            if (n5 == 0) break block10;
                            if (n5 == 1) break block9;
                            if (n5 == 2) break block11;
                            if (n5 == 3) break block12;
                            if (n5 == 4) break;
                            if (n5 != 5) {
                                l6 = l4;
                                continue;
                            }
                            l4.c();
                            l6 = l4;
                        }
                        if (l5 < ((e)object).h0()) {
                            l4.c();
                        }
                        if ((object = super.K0(e4, d4)) == kotlin.coroutines.intrinsics.b.f()) {
                            return object;
                        }
                        break block9;
                    }
                    if ((object = super.g1(l4, n4, e4, l5, d4)) == kotlin.coroutines.intrinsics.b.f()) {
                        return object;
                    }
                    break block9;
                }
                if (bl) {
                    l4.t();
                    object = super.K0(e4, d4);
                    if (object == kotlin.coroutines.intrinsics.b.f()) {
                        return object;
                    }
                }
                break block9;
            }
            l4.c();
        }
        return k0.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Object g1(kotlinx.coroutines.channels.l<E> var1_1, int var2_3, E var3_4, long var4_5, kotlin.coroutines.d<? super k0> var6_6) {
        block16: {
            block17: {
                block11: {
                    block12: {
                        block13: {
                            block14: {
                                block15: {
                                    block20: {
                                        block21: {
                                            block24: {
                                                block22: {
                                                    block23: {
                                                        block18: {
                                                            block19: {
                                                                var11_7 = r.b((kotlin.coroutines.d)kotlin.coroutines.intrinsics.b.c(var6_6));
                                                                try {
                                                                    var7_8 = kotlinx.coroutines.channels.e.G(this, var1_1, var2_3, var3_4 /* !! */ , var4_5, var11_7, false);
                                                                    if (var7_8 == 0) break block11;
                                                                    if (var7_8 == 1) break block12;
                                                                    if (var7_8 == 2) break block13;
                                                                    if (var7_8 == 4) break block14;
                                                                    if (var7_8 != 5) break block15;
                                                                    var1_1.c();
                                                                    var1_1 = (kotlinx.coroutines.channels.l)kotlinx.coroutines.channels.e.m().get(this);
lbl11:
                                                                    // 4 sources

                                                                    while (true) {
                                                                        var8_9 = kotlinx.coroutines.channels.e.p().getAndIncrement(this);
                                                                        var4_5 = var8_9 & 0xFFFFFFFFFFFFFFFL;
                                                                        break;
                                                                    }
                                                                }
                                                                catch (Throwable var1_2) {
                                                                    break block16;
                                                                }
                                                                {
                                                                    var10_10 = kotlinx.coroutines.channels.e.q(this, var8_9);
                                                                    var2_3 = kotlinx.coroutines.channels.f.b;
                                                                    var8_9 = var4_5 / (long)var2_3;
                                                                }
                                                                var7_8 = (int)(var4_5 % (long)var2_3);
                                                                if (var1_1.e == var8_9) break block18;
                                                                var12_11 = kotlinx.coroutines.channels.e.h(this, var8_9, (kotlinx.coroutines.channels.l)var1_1);
                                                                if (var12_11 != null) break block19;
                                                                if (!var10_10) ** GOTO lbl11
lbl25:
                                                                // 6 sources

                                                                while (true) {
                                                                    kotlinx.coroutines.channels.e.v(this, var3_4 /* !! */ , var11_7);
                                                                    break block17;
                                                                    break;
                                                                }
                                                            }
                                                            var1_1 = var12_11;
                                                        }
                                                        if ((var2_3 = kotlinx.coroutines.channels.e.G(this, (kotlinx.coroutines.channels.l)var1_1, var7_8, var3_4 /* !! */ , var4_5, var11_7, var10_10)) == 0) break block20;
                                                        if (var2_3 == 1) break block21;
                                                        if (var2_3 == 2) break block22;
                                                        if (var2_3 == 3) {
                                                            var1_1 = new IllegalStateException("unexpected".toString());
                                                            throw var1_1;
                                                        }
                                                        if (var2_3 == 4) break block23;
                                                        if (var2_3 != 5) ** GOTO lbl11
                                                        var1_1.c();
                                                        ** while (true)
                                                    }
                                                    if (var4_5 >= this.h0()) ** GOTO lbl25
                                                    var1_1.c();
                                                    ** GOTO lbl25
                                                }
                                                if (!var10_10) break block24;
                                                var1_1.t();
                                                ** GOTO lbl25
                                            }
                                            var3_4 /* !! */  = var11_7 instanceof k3 != false ? var11_7 : null;
                                            if (var3_4 /* !! */  != null) {
                                                kotlinx.coroutines.channels.e.x(this, var3_4 /* !! */ , (kotlinx.coroutines.channels.l)var1_1, var7_8);
                                            }
                                            break block17;
                                        }
                                        var1_1 = u.d;
                                        var1_1 = u.b((Object)k0.a);
lbl57:
                                        // 4 sources

                                        while (true) {
                                            var11_7.resumeWith(var1_1);
                                            break block17;
                                            break;
                                        }
                                    }
                                    var1_1.c();
                                    var1_1 = u.d;
                                    var1_1 = u.b((Object)k0.a);
                                    ** GOTO lbl57
                                }
                                var1_1 = new IllegalStateException("unexpected".toString());
                                throw var1_1;
                            }
                            if (var4_5 >= this.h0()) ** GOTO lbl25
                            var1_1.c();
                            ** while (true)
                        }
                        kotlinx.coroutines.channels.e.x(this, var11_7, (kotlinx.coroutines.channels.l)var1_1, var2_3);
                        break block17;
                    }
                    var1_1 = u.d;
                    var1_1 = u.b((Object)k0.a);
                    ** GOTO lbl57
                }
                var1_1.c();
                var1_1 = u.d;
                var1_1 = u.b((Object)k0.a);
                ** while (true)
            }
            var1_1 = var11_7.z();
            if (var1_1 == kotlin.coroutines.intrinsics.b.f()) {
                kotlin.coroutines.jvm.internal.g.c(var6_6);
            }
            if (var1_1 == kotlin.coroutines.intrinsics.b.f()) {
                return var1_1;
            }
            return k0.a;
        }
        var11_7.P();
        throw var1_2;
    }

    private final boolean h1(long l4) {
        if (this.v0(l4)) {
            return false;
        }
        return this.L(l4 & 0xFFFFFFFFFFFFFFFL) ^ true;
    }

    private final boolean i1(Object kFunction, E object) {
        block9: {
            boolean bl;
            block6: {
                n n4;
                kotlinx.coroutines.p p4;
                block8: {
                    block7: {
                        block5: {
                            if (!(kFunction instanceof kotlinx.coroutines.selects.l)) break block5;
                            bl = ((kotlinx.coroutines.selects.l)kFunction).f((Object)this, object);
                            break block6;
                        }
                        bl = kFunction instanceof w;
                        p4 = null;
                        n4 = null;
                        if (!bl) break block7;
                        y.h((Object)kFunction, (String)"null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
                        p4 = ((w)((Object)kFunction)).c;
                        object = kotlinx.coroutines.channels.k.b((Object)kotlinx.coroutines.channels.k.b.c(object));
                        kotlin.jvm.functions.l<E, k0> l4 = this.d;
                        kFunction = n4;
                        if (l4 != null) {
                            kFunction = this.K(l4);
                        }
                        bl = kotlinx.coroutines.channels.f.u(p4, (Object)object, (kotlin.jvm.functions.q)((kotlin.jvm.functions.q)((Object)kFunction)));
                        break block6;
                    }
                    if (!(kFunction instanceof a)) break block8;
                    y.h((Object)kFunction, (String)"null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
                    bl = ((a)((Object)kFunction)).i(object);
                    break block6;
                }
                if (!(kFunction instanceof n)) break block9;
                y.h((Object)kFunction, (String)"null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                n4 = (n)((Object)kFunction);
                kotlin.jvm.functions.l<E, k0> l5 = this.d;
                kFunction = p4;
                if (l5 != null) {
                    kFunction = this.I(l5);
                }
                bl = kotlinx.coroutines.channels.f.u((n)n4, (Object)object, (kotlin.jvm.functions.q)((kotlin.jvm.functions.q)((Object)kFunction)));
            }
            return bl;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unexpected receiver type: ");
        ((StringBuilder)object).append(kFunction);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    private final boolean j1(Object object, kotlinx.coroutines.channels.l<E> object2, int n4) {
        block7: {
            boolean bl;
            block5: {
                block6: {
                    block4: {
                        if (!(object instanceof n)) break block4;
                        y.h((Object)object, (String)"null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                        bl = kotlinx.coroutines.channels.f.C((n)((n)object), (Object)k0.a, null, (int)2, null);
                        break block5;
                    }
                    if (!(object instanceof kotlinx.coroutines.selects.l)) break block6;
                    y.h((Object)object, (String)"null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
                    object = ((kotlinx.coroutines.selects.k)object).x(this, k0.a);
                    if (object == kotlinx.coroutines.selects.n.d) {
                        ((kotlinx.coroutines.channels.l)((Object)object2)).w(n4);
                    }
                    bl = object == kotlinx.coroutines.selects.n.c;
                    break block5;
                }
                if (!(object instanceof b)) break block7;
                bl = kotlinx.coroutines.channels.f.C(((b)object).a(), (Object)Boolean.TRUE, null, (int)2, null);
            }
            return bl;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Unexpected waiter: ");
        ((StringBuilder)object2).append(object);
        throw new IllegalStateException(((StringBuilder)object2).toString().toString());
    }

    private final boolean l1(kotlinx.coroutines.channels.l<E> l4, int n4, long l5) {
        Object object = l4.B(n4);
        if (object instanceof k3 && l5 >= kotlinx.coroutines.channels.e.g.get(this) && l4.v(n4, object, kotlinx.coroutines.channels.f.p())) {
            boolean bl;
            if (this.j1(object, l4, n4)) {
                l4.F(n4, kotlinx.coroutines.channels.f.d);
                bl = true;
            } else {
                l4.F(n4, kotlinx.coroutines.channels.f.j());
                l4.C(n4, false);
                bl = false;
            }
            return bl;
        }
        return this.m1(l4, n4, l5);
    }

    private final boolean m1(kotlinx.coroutines.channels.l<E> object, int n4, long l4) {
        block9: {
            Object object2;
            while (true) {
                object2 = ((kotlinx.coroutines.channels.l)((Object)object)).B(n4);
                boolean bl = object2 instanceof k3;
                boolean bl2 = false;
                if (bl) {
                    if (l4 < kotlinx.coroutines.channels.e.g.get(this)) {
                        if (!((kotlinx.coroutines.channels.l)((Object)object)).v(n4, object2, new z((k3)object2))) continue;
                        return true;
                    }
                    if (!((kotlinx.coroutines.channels.l)((Object)object)).v(n4, object2, kotlinx.coroutines.channels.f.p())) continue;
                    if (this.j1(object2, (kotlinx.coroutines.channels.l<E>)((Object)object), n4)) {
                        ((kotlinx.coroutines.channels.l)((Object)object)).F(n4, kotlinx.coroutines.channels.f.d);
                        bl2 = true;
                    } else {
                        ((kotlinx.coroutines.channels.l)((Object)object)).F(n4, kotlinx.coroutines.channels.f.j());
                        ((kotlinx.coroutines.channels.l)((Object)object)).C(n4, false);
                    }
                    return bl2;
                }
                if (object2 == kotlinx.coroutines.channels.f.j()) {
                    return false;
                }
                if (object2 == null) {
                    if (!((kotlinx.coroutines.channels.l)((Object)object)).v(n4, object2, kotlinx.coroutines.channels.f.k())) continue;
                    return true;
                }
                if (object2 == kotlinx.coroutines.channels.f.d) {
                    return true;
                }
                if (object2 == kotlinx.coroutines.channels.f.o() || object2 == kotlinx.coroutines.channels.f.f() || object2 == kotlinx.coroutines.channels.f.i()) break block9;
                if (object2 == kotlinx.coroutines.channels.f.z()) {
                    return true;
                }
                if (object2 != kotlinx.coroutines.channels.f.q()) break;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unexpected cell state: ");
            ((StringBuilder)object).append(object2);
            throw new IllegalStateException(((StringBuilder)object).toString().toString());
        }
        return true;
    }

    private final Object n1(kotlinx.coroutines.channels.l<E> l4, int n4, long l5, Object object) {
        Object object2 = l4.B(n4);
        if (object2 == null) {
            if (l5 >= (kotlinx.coroutines.channels.e.f.get(this) & 0xFFFFFFFFFFFFFFFL)) {
                if (object == null) {
                    return kotlinx.coroutines.channels.f.s();
                }
                if (l4.v(n4, object2, object)) {
                    this.U();
                    return kotlinx.coroutines.channels.f.r();
                }
            }
        } else if (object2 == kotlinx.coroutines.channels.f.d && l4.v(n4, object2, kotlinx.coroutines.channels.f.f())) {
            this.U();
            return l4.D(n4);
        }
        return this.o1(l4, n4, l5, object);
    }

    private final void o0(long l4) {
        if ((kotlinx.coroutines.channels.e.i.addAndGet(this, l4) & 0x4000000000000000L) != 0L) {
            while ((kotlinx.coroutines.channels.e.i.get(this) & 0x4000000000000000L) != 0L) {
            }
        }
    }

    private final Object o1(kotlinx.coroutines.channels.l<E> d02, int n4, long l4, Object object) {
        while (true) {
            Object object2;
            if ((object2 = d02.B(n4)) != null && object2 != kotlinx.coroutines.channels.f.k()) {
                if (object2 == kotlinx.coroutines.channels.f.d) {
                    if (!d02.v(n4, object2, kotlinx.coroutines.channels.f.f())) continue;
                    this.U();
                    return d02.D(n4);
                }
                if (object2 == kotlinx.coroutines.channels.f.j()) {
                    return kotlinx.coroutines.channels.f.h();
                }
                if (object2 == kotlinx.coroutines.channels.f.o()) {
                    return kotlinx.coroutines.channels.f.h();
                }
                if (object2 == kotlinx.coroutines.channels.f.z()) {
                    this.U();
                    return kotlinx.coroutines.channels.f.h();
                }
                if (object2 == kotlinx.coroutines.channels.f.p() || !d02.v(n4, object2, kotlinx.coroutines.channels.f.q())) continue;
                boolean bl = object2 instanceof z;
                object = object2;
                if (bl) {
                    object = ((z)object2).a;
                }
                if (this.j1(object, (kotlinx.coroutines.channels.l<E>)d02, n4)) {
                    d02.F(n4, kotlinx.coroutines.channels.f.f());
                    this.U();
                    d02 = d02.D(n4);
                } else {
                    d02.F(n4, kotlinx.coroutines.channels.f.j());
                    d02.C(n4, false);
                    if (bl) {
                        this.U();
                    }
                    d02 = kotlinx.coroutines.channels.f.h();
                }
                return d02;
            }
            if (l4 < (kotlinx.coroutines.channels.e.f.get(this) & 0xFFFFFFFFFFFFFFFL)) {
                if (!d02.v(n4, object2, kotlinx.coroutines.channels.f.o())) continue;
                this.U();
                return kotlinx.coroutines.channels.f.h();
            }
            if (object == null) {
                return kotlinx.coroutines.channels.f.s();
            }
            if (d02.v(n4, object2, object)) break;
        }
        this.U();
        return kotlinx.coroutines.channels.f.r();
    }

    static /* synthetic */ void p0(e e4, long l4, int n4, Object object) {
        if (object == null) {
            if ((n4 & 1) != 0) {
                l4 = 1L;
            }
            e4.o0(l4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    private final int p1(kotlinx.coroutines.channels.l<E> l4, int n4, E e4, long l5, Object object, boolean bl) {
        l4.G(n4, e4);
        if (bl) {
            return this.q1(l4, n4, e4, l5, object, bl);
        }
        Object object2 = l4.B(n4);
        if (object2 == null) {
            if (this.L(l5)) {
                if (l4.v(n4, null, kotlinx.coroutines.channels.f.d)) {
                    return 1;
                }
            } else {
                if (object == null) {
                    return 3;
                }
                if (l4.v(n4, null, object)) {
                    return 2;
                }
            }
        } else if (object2 instanceof k3) {
            l4.w(n4);
            if (this.i1(object2, e4)) {
                l4.F(n4, kotlinx.coroutines.channels.f.f());
                this.M0();
                n4 = 0;
            } else {
                if (l4.x(n4, kotlinx.coroutines.channels.f.i()) != kotlinx.coroutines.channels.f.i()) {
                    l4.C(n4, true);
                }
                n4 = 5;
            }
            return n4;
        }
        return this.q1(l4, n4, e4, l5, object, bl);
    }

    private final void q0() {
        Object object;
        Object v3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.channels.e.n;
        while (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)atomicReferenceFieldUpdater, (Object)this, v3, (Object)(object = (v3 = atomicReferenceFieldUpdater.get(this)) == null ? kotlinx.coroutines.channels.f.d() : kotlinx.coroutines.channels.f.e()))) {
        }
        if (v3 == null) {
            return;
        }
        object = (kotlin.jvm.functions.l)a1.e(v3, (int)1);
        ((kotlin.jvm.functions.l)v3).invoke(this.b0());
    }

    private final int q1(kotlinx.coroutines.channels.l<E> l4, int n4, E e4, long l5, Object object, boolean bl) {
        int n5;
        Object object2;
        block12: {
            while (true) {
                object2 = l4.B(n4);
                n5 = 0;
                if (object2 == null) {
                    if (this.L(l5) && !bl) {
                        if (!l4.v(n4, null, kotlinx.coroutines.channels.f.d)) continue;
                        return 1;
                    }
                    if (bl) {
                        if (!l4.v(n4, null, kotlinx.coroutines.channels.f.j())) continue;
                        l4.C(n4, false);
                        return 4;
                    }
                    if (object == null) {
                        return 3;
                    }
                    if (!l4.v(n4, null, object)) continue;
                    return 2;
                }
                if (object2 != kotlinx.coroutines.channels.f.k()) break block12;
                if (l4.v(n4, object2, kotlinx.coroutines.channels.f.d)) break;
            }
            return 1;
        }
        if (object2 == kotlinx.coroutines.channels.f.i()) {
            l4.w(n4);
            return 5;
        }
        if (object2 == kotlinx.coroutines.channels.f.o()) {
            l4.w(n4);
            return 5;
        }
        if (object2 == kotlinx.coroutines.channels.f.z()) {
            l4.w(n4);
            this.S();
            return 4;
        }
        l4.w(n4);
        object = object2;
        if (object2 instanceof z) {
            object = ((z)object2).a;
        }
        if (this.i1(object, e4)) {
            l4.F(n4, kotlinx.coroutines.channels.f.f());
            this.M0();
            n4 = n5;
        } else {
            if (l4.x(n4, kotlinx.coroutines.channels.f.i()) != kotlinx.coroutines.channels.f.i()) {
                l4.C(n4, true);
            }
            n4 = 5;
        }
        return n4;
    }

    private final boolean r0(kotlinx.coroutines.channels.l<E> l4, int n4, long l5) {
        Object object;
        do {
            object = l4.B(n4);
            boolean bl = false;
            if (object == null || object == kotlinx.coroutines.channels.f.k()) continue;
            if (object == kotlinx.coroutines.channels.f.d) {
                return true;
            }
            if (object == kotlinx.coroutines.channels.f.j()) {
                return false;
            }
            if (object == kotlinx.coroutines.channels.f.z()) {
                return false;
            }
            if (object == kotlinx.coroutines.channels.f.f()) {
                return false;
            }
            if (object == kotlinx.coroutines.channels.f.o()) {
                return false;
            }
            if (object == kotlinx.coroutines.channels.f.p()) {
                return true;
            }
            if (object == kotlinx.coroutines.channels.f.q()) {
                return false;
            }
            if (l5 == this.h0()) {
                bl = true;
            }
            return bl;
        } while (!l4.v(n4, object, kotlinx.coroutines.channels.f.o()));
        this.U();
        return false;
    }

    private final void r1(long l4) {
        long l5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = kotlinx.coroutines.channels.e.g;
        do {
            if ((l5 = atomicLongFieldUpdater.get(this)) < l4) continue;
            return;
        } while (!kotlinx.coroutines.channels.e.g.compareAndSet(this, l5, l4));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean s0(long l4, boolean bl) {
        boolean bl2;
        int n4 = (int)(l4 >> 60);
        boolean bl3 = bl2 = false;
        if (n4 == 0) return bl3;
        bl3 = bl2;
        if (n4 == 1) return bl3;
        if (n4 != 2) {
            if (n4 == 3) {
                this.Q(l4 & 0xFFFFFFFFFFFFFFFL);
                return true;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected close status: ");
            stringBuilder.append(n4);
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
        this.R(l4 & 0xFFFFFFFFFFFFFFFL);
        if (!bl) return true;
        bl3 = bl2;
        if (this.n0()) return bl3;
        return true;
    }

    private final void s1(long l4) {
        long l5;
        long l6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = kotlinx.coroutines.channels.e.f;
        do {
            if ((l5 = 0xFFFFFFFFFFFFFFFL & (l6 = atomicLongFieldUpdater.get(this))) >= l4) {
                return;
            }
            l5 = kotlinx.coroutines.channels.f.b((long)l5, (int)((int)(l6 >> 60)));
        } while (!kotlinx.coroutines.channels.e.f.compareAndSet(this, l6, l5));
    }

    public static final /* synthetic */ void t(e e4, n n4) {
        e4.G0(n4);
    }

    public static final /* synthetic */ void u(e e4, n n4) {
        e4.H0(n4);
    }

    private final boolean u0(long l4) {
        return this.s0(l4, true);
    }

    public static final /* synthetic */ void v(e e4, Object object, n n4) {
        e4.L0(object, n4);
    }

    private final boolean v0(long l4) {
        return this.s0(l4, false);
    }

    private final boolean x0() {
        long l4 = this.Z();
        boolean bl = l4 == 0L || l4 == Long.MAX_VALUE;
        return bl;
    }

    private final long y0(kotlinx.coroutines.channels.l<E> l4) {
        Object object;
        do {
            block1: for (int i4 = kotlinx.coroutines.channels.f.b - 1; -1 < i4; --i4) {
                long l5 = l4.e * (long)kotlinx.coroutines.channels.f.b + (long)i4;
                if (l5 < this.h0()) {
                    return -1L;
                }
                do {
                    if ((object = l4.B(i4)) == null || object == kotlinx.coroutines.channels.f.k()) continue;
                    if (object != kotlinx.coroutines.channels.f.d) continue block1;
                    return l5;
                } while (!l4.v(i4, object, kotlinx.coroutines.channels.f.z()));
                l4.t();
            }
            l4 = object = (kotlinx.coroutines.channels.l)l4.h();
        } while (object != null);
        return -1L;
    }

    private final void z0() {
        long l4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = kotlinx.coroutines.channels.e.f;
        while ((int)((l4 = atomicLongFieldUpdater.get(this)) >> 60) == 0 && !atomicLongFieldUpdater.compareAndSet(this, l4, kotlinx.coroutines.channels.f.b((long)(0xFFFFFFFFFFFFFFFL & l4), (int)1))) {
        }
    }

    @NotNull
    public kotlinx.coroutines.selects.f<E> D() {
        kotlin.jvm.internal.v v3 = kotlinx.coroutines.channels.e$e.c;
        y.h((Object)v3, (String)"null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        kotlin.jvm.functions.q q4 = (kotlin.jvm.functions.q)a1.e((Object)v3, (int)3);
        v3 = kotlinx.coroutines.channels.e$f.c;
        y.h((Object)v3, (String)"null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.g(this, q4, (kotlin.jvm.functions.q)a1.e((Object)v3, (int)3), this.e);
    }

    @Nullable
    public Object F(@NotNull kotlin.coroutines.d<? super E> d4) {
        return kotlinx.coroutines.channels.e.V0(this, d4);
    }

    protected void F0() {
    }

    public boolean M(@Nullable Throwable throwable) {
        Throwable throwable2 = throwable;
        if (throwable == null) {
            throwable2 = new CancellationException("Channel was cancelled");
        }
        return this.P(throwable2, true);
    }

    protected void M0() {
    }

    protected void N0() {
    }

    protected boolean P(@Nullable Throwable throwable, boolean bl) {
        if (bl) {
            this.z0();
        }
        boolean bl2 = androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)kotlinx.coroutines.channels.e.m, (Object)this, (Object)kotlinx.coroutines.channels.f.l(), (Object)throwable);
        if (bl) {
            this.A0();
        } else {
            this.B0();
        }
        this.S();
        this.F0();
        if (bl2) {
            this.q0();
        }
        return bl2;
    }

    protected final void T(long l4) {
        r0 r02 = (r0)kotlinx.coroutines.channels.e.k.get(this);
        while (true) {
            long l5;
            if (l4 < Math.max((long)this.c + (l5 = kotlinx.coroutines.channels.e.g.get(this)), this.Z())) {
                return;
            }
            if (!kotlinx.coroutines.channels.e.g.compareAndSet(this, l5, l5 + 1L)) continue;
            int n4 = kotlinx.coroutines.channels.f.b;
            long l6 = l5 / (long)n4;
            n4 = (int)(l5 % (long)n4);
            r0 r03 = r02;
            if (r02.e != l6 && (r03 = this.W(l6, (kotlinx.coroutines.channels.l<E>)r02)) == null) continue;
            Object object = this.n1((kotlinx.coroutines.channels.l<E>)r03, n4, l5, null);
            if (object == kotlinx.coroutines.channels.f.h()) {
                r02 = r03;
                if (l5 >= this.l0()) continue;
                r03.c();
                r02 = r03;
                continue;
            }
            r03.c();
            kotlin.jvm.functions.l<E, k0> l7 = this.d;
            r02 = r03;
            if (l7 == null) continue;
            r02 = kotlinx.coroutines.internal.w.c(l7, (Object)object, null, (int)2, null);
            if (r02 != null) break;
            r02 = r03;
        }
        throw r02;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    protected void a1(@NotNull kotlinx.coroutines.selects.l<?> object, @Nullable Object object2) {
        block13: {
            kotlinx.coroutines.channels.l l4;
            block12: {
                void var1_4;
                int n4;
                block15: {
                    void var2_5;
                    block11: {
                        boolean bl;
                        block14: {
                            long l5;
                            kotlinx.coroutines.channels.l l6 = (kotlinx.coroutines.channels.l)((Object)kotlinx.coroutines.channels.e.j.get(this));
                            while (true) {
                                long l7 = kotlinx.coroutines.channels.e.f.getAndIncrement(this);
                                l5 = 0xFFFFFFFFFFFFFFFL & l7;
                                bl = this.v0(l7);
                                int n5 = kotlinx.coroutines.channels.f.b;
                                l7 = l5 / (long)n5;
                                n4 = (int)(l5 % (long)n5);
                                l4 = l6;
                                if (l6.e != l7 && (l4 = this.X(l7, l6)) == null) {
                                    if (!bl) continue;
                                    break block11;
                                }
                                n5 = this.p1(l4, n4, var2_5, l5, object, bl);
                                if (n5 == 0) break block12;
                                if (n5 == 1) break block13;
                                if (n5 == 2) break block14;
                                if (n5 == 3) throw new IllegalStateException("unexpected".toString());
                                if (n5 == 4) break;
                                if (n5 != 5) {
                                    l6 = l4;
                                    continue;
                                }
                                l4.c();
                                l6 = l4;
                            }
                            if (l5 < this.h0()) {
                                l4.c();
                            }
                            break block11;
                        }
                        if (!bl) break block15;
                        l4.t();
                    }
                    this.J0(var2_5, (kotlinx.coroutines.selects.l<?>)object);
                    return;
                }
                if (object instanceof k3) {
                    Object object3 = object;
                } else {
                    Object var1_3 = null;
                }
                if (var1_4 == null) return;
                this.R0((k3)var1_4, l4, n4);
                return;
            }
            l4.c();
        }
        object.d((Object)k0.a);
    }

    @Nullable
    protected final Throwable b0() {
        return (Throwable)kotlinx.coroutines.channels.e.m.get(this);
    }

    public final void cancel(@Nullable CancellationException cancellationException) {
        this.M(cancellationException);
    }

    public boolean close(@Nullable Throwable throwable) {
        return this.P(throwable, false);
    }

    @NotNull
    public kotlinx.coroutines.selects.h<E, e<E>> getOnSend() {
        kotlin.jvm.functions.q<e<?>, kotlinx.coroutines.selects.l<?>, Object, k0> q4 = kotlinx.coroutines.channels.e$i.c;
        y.h((Object)q4, (String)"null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        q4 = (kotlin.jvm.functions.q)a1.e((Object)q4, (int)3);
        j j4 = kotlinx.coroutines.channels.e$j.c;
        y.h((Object)j4, (String)"null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.i(this, q4, (kotlin.jvm.functions.q)a1.e((Object)j4, (int)3), null, 8, null);
    }

    public final long h0() {
        return kotlinx.coroutines.channels.e.g.get(this);
    }

    @NotNull
    protected final Throwable i0() {
        Throwable throwable;
        Throwable throwable2 = throwable = this.b0();
        if (throwable == null) {
            throwable2 = new q("Channel was closed");
        }
        return throwable2;
    }

    public void invokeOnClose(@NotNull kotlin.jvm.functions.l<? super Throwable, k0> object) {
        Object v3;
        if (androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)kotlinx.coroutines.channels.e.n, (Object)this, null, object)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.channels.e.n;
        while ((v3 = atomicReferenceFieldUpdater.get(this)) == kotlinx.coroutines.channels.f.d()) {
            if (!androidx.concurrent.futures.a.a((AtomicReferenceFieldUpdater)kotlinx.coroutines.channels.e.n, (Object)this, (Object)kotlinx.coroutines.channels.f.d(), (Object)kotlinx.coroutines.channels.f.e())) continue;
            object.invoke((Throwable)this.b0());
            return;
        }
        if (v3 == kotlinx.coroutines.channels.f.e()) {
            throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Another handler is already registered: ");
        ((StringBuilder)object).append(v3);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    public boolean isClosedForSend() {
        return this.v0(kotlinx.coroutines.channels.e.f.get(this));
    }

    @NotNull
    public kotlinx.coroutines.channels.i<E> iterator() {
        return new a(this);
    }

    @NotNull
    public kotlinx.coroutines.selects.f<kotlinx.coroutines.channels.k<E>> j() {
        kotlin.jvm.functions.q<e<?>, kotlinx.coroutines.selects.l<?>, Object, k0> q4 = kotlinx.coroutines.channels.e$g.c;
        y.h((Object)q4, (String)"null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        q4 = (kotlin.jvm.functions.q)a1.e((Object)q4, (int)3);
        h h4 = kotlinx.coroutines.channels.e$h.c;
        y.h((Object)h4, (String)"null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.g<kotlinx.coroutines.channels.k<E>>(this, q4, (kotlin.jvm.functions.q)a1.e((Object)h4, (int)3), this.e);
    }

    @NotNull
    protected final Object k1(E object) {
        kotlinx.coroutines.channels.l l4;
        block6: {
            block7: {
                int n4;
                int n5;
                boolean bl;
                d0 d02;
                block8: {
                    block9: {
                        long l5;
                        d02 = kotlinx.coroutines.channels.f.d;
                        l4 = (kotlinx.coroutines.channels.l)((Object)kotlinx.coroutines.channels.e.j.get(this));
                        while (true) {
                            int n6;
                            long l6 = kotlinx.coroutines.channels.e.f.getAndIncrement(this);
                            l5 = l6 & 0xFFFFFFFFFFFFFFFL;
                            bl = this.v0(l6);
                            n5 = kotlinx.coroutines.channels.f.b;
                            l6 = l5 / (long)n5;
                            n4 = (int)(l5 % (long)n5);
                            if (l4.e != l6) {
                                kotlinx.coroutines.channels.l l7 = this.X(l6, l4);
                                if (l7 == null) {
                                    if (!bl) continue;
                                    return kotlinx.coroutines.channels.k.b.a(this.i0());
                                }
                                l4 = l7;
                            }
                            if ((n6 = this.p1(l4, n4, object, l5, d02, bl)) == 0) break block6;
                            if (n6 == 1) break block7;
                            if (n6 == 2) break block8;
                            if (n6 == 3) break block9;
                            if (n6 == 4) break;
                            if (n6 != 5) continue;
                            l4.c();
                        }
                        if (l5 < this.h0()) {
                            l4.c();
                        }
                        return kotlinx.coroutines.channels.k.b.a(this.i0());
                    }
                    throw new IllegalStateException("unexpected".toString());
                }
                if (bl) {
                    l4.t();
                    return kotlinx.coroutines.channels.k.b.a(this.i0());
                }
                object = d02 instanceof k3 ? (k3)d02 : null;
                if (object != null) {
                    this.R0(object, l4, n4);
                }
                this.T(l4.e * (long)n5 + (long)n4);
                return kotlinx.coroutines.channels.k.b.c((Object)k0.a);
            }
            return kotlinx.coroutines.channels.k.b.c((Object)k0.a);
        }
        l4.c();
        return kotlinx.coroutines.channels.k.b.c((Object)k0.a);
    }

    public final long l0() {
        return kotlinx.coroutines.channels.e.f.get(this) & 0xFFFFFFFFFFFFFFFL;
    }

    @NotNull
    public Object n() {
        block12: {
            Object object;
            block11: {
                Object object2;
                long l4 = kotlinx.coroutines.channels.e.g.get(this);
                long l5 = kotlinx.coroutines.channels.e.f.get(this);
                if (this.u0(l5)) {
                    return kotlinx.coroutines.channels.k.b.a(this.b0());
                }
                if (l4 >= (l5 & 0xFFFFFFFFFFFFFFFL)) {
                    return kotlinx.coroutines.channels.k.b.b();
                }
                d0 d02 = kotlinx.coroutines.channels.f.i();
                object = (kotlinx.coroutines.channels.l)((Object)kotlinx.coroutines.channels.e.k.get(this));
                while (true) {
                    if (this.t0()) {
                        object = kotlinx.coroutines.channels.k.b.a(this.b0());
                        break block11;
                    }
                    l4 = kotlinx.coroutines.channels.e.g.getAndIncrement(this);
                    int n4 = kotlinx.coroutines.channels.f.b;
                    l5 = l4 / (long)n4;
                    n4 = (int)(l4 % (long)n4);
                    if (((a0)((Object)object)).e != l5) {
                        object2 = this.W(l5, (kotlinx.coroutines.channels.l)((Object)object));
                        if (object2 == null) continue;
                        object = object2;
                    }
                    if ((object2 = this.n1((kotlinx.coroutines.channels.l)((Object)object), n4, l4, d02)) == kotlinx.coroutines.channels.f.r()) {
                        object2 = d02 instanceof k3 ? (k3)d02 : null;
                        if (object2 != null) {
                            this.Q0((k3)object2, (kotlinx.coroutines.channels.l)((Object)object), n4);
                        }
                        this.t1(l4);
                        ((a0)((Object)object)).t();
                        object = kotlinx.coroutines.channels.k.b.b();
                        break block11;
                    }
                    if (object2 != kotlinx.coroutines.channels.f.h()) break;
                    if (l4 >= this.l0()) continue;
                    object.c();
                }
                if (object2 == kotlinx.coroutines.channels.f.s()) break block12;
                object.c();
                object = kotlinx.coroutines.channels.k.b.c(object2);
            }
            return object;
        }
        throw new IllegalStateException("unexpected".toString());
    }

    public final boolean n0() {
        while (true) {
            kotlinx.coroutines.channels.l<E> l4 = (kotlinx.coroutines.channels.l<E>)((Object)kotlinx.coroutines.channels.e.k.get(this));
            long l5 = this.h0();
            if (this.l0() <= l5) {
                return false;
            }
            int n4 = kotlinx.coroutines.channels.f.b;
            long l6 = l5 / (long)n4;
            kotlinx.coroutines.channels.l<E> l7 = l4;
            if (l4.e != l6) {
                l7 = l4 = this.W(l6, l4);
                if (l4 == null) {
                    if (((kotlinx.coroutines.channels.l)((Object)kotlinx.coroutines.channels.e.k.get(this))).e >= l6) continue;
                    return false;
                }
            }
            l7.c();
            if (this.r0(l7, (int)(l5 % (long)n4), l5)) {
                return true;
            }
            kotlinx.coroutines.channels.e.g.compareAndSet(this, l5, 1L + l5);
        }
    }

    @Nullable
    public Object o(@NotNull kotlin.coroutines.d<? super kotlinx.coroutines.channels.k<? extends E>> d4) {
        return kotlinx.coroutines.channels.e.W0(this, d4);
    }

    @Deprecated(level=kotlin.e.d, message="Deprecated in the favour of 'trySend' method", replaceWith=@ReplaceWith(expression="trySend(element).isSuccess", imports={}))
    public boolean offer(E e4) {
        return g.a.a((kotlinx.coroutines.channels.g)this, e4);
    }

    @Nullable
    public Object send(E e4, @NotNull kotlin.coroutines.d<? super k0> d4) {
        return kotlinx.coroutines.channels.e.f1(this, e4, d4);
    }

    public boolean t0() {
        return this.u0(kotlinx.coroutines.channels.e.f.get(this));
    }

    public final void t1(long l4) {
        int n4;
        if (this.x0()) {
            return;
        }
        while (this.Z() <= l4) {
        }
        int n5 = kotlinx.coroutines.channels.f.g();
        for (n4 = 0; n4 < n5; ++n4) {
            l4 = this.Z();
            if (l4 != (kotlinx.coroutines.channels.e.i.get(this) & 0x3FFFFFFFFFFFFFFFL) || l4 != this.Z()) continue;
            return;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = kotlinx.coroutines.channels.e.i;
        while (!atomicLongFieldUpdater.compareAndSet(this, l4 = atomicLongFieldUpdater.get(this), kotlinx.coroutines.channels.f.a((long)(l4 & 0x3FFFFFFFFFFFFFFFL), (boolean)true))) {
        }
        while (true) {
            l4 = this.Z();
            long l5 = kotlinx.coroutines.channels.e.i.get(this);
            long l6 = l5 & 0x3FFFFFFFFFFFFFFFL;
            n4 = (0x4000000000000000L & l5) != 0L ? 1 : 0;
            if (l4 == l6 && l4 == this.Z()) {
                atomicLongFieldUpdater = kotlinx.coroutines.channels.e.i;
                while (!atomicLongFieldUpdater.compareAndSet(this, l4 = atomicLongFieldUpdater.get(this), kotlinx.coroutines.channels.f.a((long)(l4 & 0x3FFFFFFFFFFFFFFFL), (boolean)false))) {
                }
                return;
            }
            if (n4 != 0) continue;
            kotlinx.coroutines.channels.e.i.compareAndSet(this, l5, kotlinx.coroutines.channels.f.a((long)l6, (boolean)true));
        }
    }

    @NotNull
    public String toString() {
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        int n4 = (int)(kotlinx.coroutines.channels.e.f.get(this) >> 60);
        if (n4 != 2) {
            if (n4 == 3) {
                stringBuilder.append("cancelled,");
            }
        } else {
            stringBuilder.append("closed,");
        }
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append("capacity=");
        ((StringBuilder)object2).append(this.c);
        ((StringBuilder)object2).append(',');
        stringBuilder.append(((StringBuilder)object2).toString());
        stringBuilder.append("data=[");
        Object object3 = t.p((Object[])new kotlinx.coroutines.channels.l[]{kotlinx.coroutines.channels.e.k.get(this), kotlinx.coroutines.channels.e.j.get(this), kotlinx.coroutines.channels.e.l.get(this)});
        object2 = new ArrayList();
        object3 = object3.iterator();
        while (object3.hasNext()) {
            object = object3.next();
            if ((kotlinx.coroutines.channels.l)((Object)object) == kotlinx.coroutines.channels.f.n()) continue;
            object2.add(object);
        }
        Iterator iterator = object2.iterator();
        if (iterator.hasNext()) {
            long l4;
            long l5;
            long l6;
            object3 = iterator.next();
            if (!iterator.hasNext()) {
                object2 = object3;
            } else {
                l6 = ((kotlinx.coroutines.channels.l)((Object)object3)).e;
                do {
                    object = iterator.next();
                    l5 = ((kotlinx.coroutines.channels.l)((Object)object)).e;
                    object2 = object3;
                    l4 = l6;
                    if (l6 > l5) {
                        object2 = object;
                        l4 = l5;
                    }
                    object3 = object2;
                    l6 = l4;
                } while (iterator.hasNext());
            }
            object3 = (kotlinx.coroutines.channels.l)((Object)object2);
            l6 = this.h0();
            l4 = this.l0();
            block2: do {
                int n5 = kotlinx.coroutines.channels.f.b;
                for (n4 = 0; n4 < n5; ++n4) {
                    long l7;
                    l5 = ((a0)((Object)object3)).e * (long)kotlinx.coroutines.channels.f.b + (long)n4;
                    long l8 = l5 - l4;
                    long l9 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                    if (l9 >= 0 && l5 >= l6) break block2;
                    object2 = ((kotlinx.coroutines.channels.l)((Object)object3)).B(n4);
                    object = ((kotlinx.coroutines.channels.l)((Object)object3)).A(n4);
                    if (object2 instanceof n) {
                        l7 = l5 == l6 ? 0 : (l5 < l6 ? -1 : 1);
                        object2 = l7 < 0 && l9 >= 0 ? "receive" : (l9 < 0 && l7 >= 0 ? "send" : "cont");
                    } else if (object2 instanceof kotlinx.coroutines.selects.l) {
                        l7 = l5 == l6 ? 0 : (l5 < l6 ? -1 : 1);
                        object2 = l7 < 0 && l9 >= 0 ? "onReceive" : (l9 < 0 && l7 >= 0 ? "onSend" : "select");
                    } else if (object2 instanceof w) {
                        object2 = "receiveCatching";
                    } else if (object2 instanceof b) {
                        object2 = "sendBroadcast";
                    } else if (object2 instanceof z) {
                        iterator = new StringBuilder();
                        ((StringBuilder)((Object)iterator)).append("EB(");
                        ((StringBuilder)((Object)iterator)).append(object2);
                        ((StringBuilder)((Object)iterator)).append(')');
                        object2 = ((StringBuilder)((Object)iterator)).toString();
                    } else if (!y.e((Object)object2, (Object)kotlinx.coroutines.channels.f.q()) && !y.e((Object)object2, (Object)kotlinx.coroutines.channels.f.p())) {
                        if (object2 == null || y.e((Object)object2, (Object)kotlinx.coroutines.channels.f.k()) || y.e((Object)object2, (Object)kotlinx.coroutines.channels.f.f()) || y.e((Object)object2, (Object)kotlinx.coroutines.channels.f.o()) || y.e((Object)object2, (Object)kotlinx.coroutines.channels.f.i()) || y.e((Object)object2, (Object)kotlinx.coroutines.channels.f.j()) || y.e((Object)object2, (Object)kotlinx.coroutines.channels.f.z())) continue;
                        object2 = object2.toString();
                    } else {
                        object2 = "resuming_sender";
                    }
                    if (object != null) {
                        iterator = new StringBuilder();
                        ((StringBuilder)((Object)iterator)).append('(');
                        ((StringBuilder)((Object)iterator)).append((String)object2);
                        ((StringBuilder)((Object)iterator)).append(',');
                        ((StringBuilder)((Object)iterator)).append(object);
                        ((StringBuilder)((Object)iterator)).append("),");
                        stringBuilder.append(((StringBuilder)((Object)iterator)).toString());
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)object2);
                    ((StringBuilder)object).append(',');
                    stringBuilder.append(((StringBuilder)object).toString());
                }
            } while ((object3 = (kotlinx.coroutines.channels.l)object3.f()) != null);
            if (kotlin.text.p.p1(stringBuilder) == ',') {
                y.i((Object)stringBuilder.deleteCharAt(stringBuilder.length() - 1), (String)"deleteCharAt(...)");
            }
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        throw new NoSuchElementException();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @NotNull
    public Object trySend-JP2dKIU(E object) {
        void var1_8;
        block15: {
            kotlinx.coroutines.channels.l l4;
            block14: {
                void var1_5;
                int n4;
                d0 d02;
                block17: {
                    block13: {
                        boolean bl;
                        block16: {
                            long l5;
                            if (this.h1(kotlinx.coroutines.channels.e.f.get(this))) {
                                return kotlinx.coroutines.channels.k.b.b();
                            }
                            d02 = kotlinx.coroutines.channels.f.j();
                            l4 = (kotlinx.coroutines.channels.l)((Object)kotlinx.coroutines.channels.e.j.get(this));
                            while (true) {
                                int n5;
                                long l6 = kotlinx.coroutines.channels.e.f.getAndIncrement(this);
                                l5 = l6 & 0xFFFFFFFFFFFFFFFL;
                                bl = this.v0(l6);
                                n4 = kotlinx.coroutines.channels.f.b;
                                l6 = l5 / (long)n4;
                                n4 = (int)(l5 % (long)n4);
                                if (l4.e != l6) {
                                    kotlinx.coroutines.channels.l l7 = this.X(l6, l4);
                                    if (l7 == null) {
                                        if (!bl) continue;
                                        break block13;
                                    }
                                    l4 = l7;
                                }
                                if ((n5 = this.p1(l4, n4, object, l5, d02, bl)) == 0) break block14;
                                if (n5 == 1) break block15;
                                if (n5 == 2) break block16;
                                if (n5 == 3) throw new IllegalStateException("unexpected".toString());
                                if (n5 == 4) break;
                                if (n5 != 5) continue;
                                l4.c();
                            }
                            if (l5 < this.h0()) {
                                l4.c();
                            }
                            break block13;
                        }
                        if (!bl) break block17;
                        l4.t();
                    }
                    Object object2 = kotlinx.coroutines.channels.k.b.a(this.i0());
                    return var1_8;
                }
                if (d02 instanceof k3) {
                    k3 k32 = (k3)d02;
                } else {
                    Object var1_4 = null;
                }
                if (var1_5 != null) {
                    this.R0((k3)var1_5, l4, n4);
                }
                l4.t();
                Object object3 = kotlinx.coroutines.channels.k.b.b();
                return var1_8;
            }
            l4.c();
        }
        Object object4 = kotlinx.coroutines.channels.k.b.c((Object)k0.a);
        return var1_8;
    }

    protected boolean w0() {
        return false;
    }

    @Metadata(d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\b#\u0010$J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J.\u0010\f\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003H\u0096B\u00a2\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\u000e2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000e\u00a2\u0006\u0004\b\u001b\u0010\u0010R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b \u0010!\u00a8\u0006%"}, d2={"Lkotlinx/coroutines/channels/e$a;", "Lkotlinx/coroutines/channels/i;", "Lkotlinx/coroutines/k3;", "", "g", "()Z", "Lkotlinx/coroutines/channels/l;", "segment", "", "index", "", "r", "f", "(Lkotlinx/coroutines/channels/l;IJLkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/k0;", "h", "()V", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/a0;", "c", "(Lkotlinx/coroutines/internal/a0;I)V", "next", "()Ljava/lang/Object;", "element", "i", "(Ljava/lang/Object;)Z", "j", "", "Ljava/lang/Object;", "receiveResult", "Lkotlinx/coroutines/p;", "d", "Lkotlinx/coroutines/p;", "continuation", "<init>", "(Lkotlinx/coroutines/channels/e;)V", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    @SourceDebugExtension(value={"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n+ 2 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3116:1\n906#2,52:3117\n984#2,8:3173\n878#2:3181\n902#2,33:3182\n994#2:3215\n936#2,14:3216\n955#2,3:3231\n999#2,6:3234\n369#3,4:3169\n373#3,8:3240\n902#4:3230\n57#5,2:3248\n57#5,2:3251\n1#6:3250\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n*L\n1619#1:3117,52\n1657#1:3173,8\n1657#1:3181\n1657#1:3182,33\n1657#1:3215\n1657#1:3216,14\n1657#1:3231,3\n1657#1:3234,6\n1655#1:3169,4\n1655#1:3240,8\n1657#1:3230\n1693#1:3248,2\n1741#1:3251,2\n*E\n"})
    private final class a
    implements kotlinx.coroutines.channels.i<E>,
    k3 {
        @Nullable
        private Object c;
        @Nullable
        private kotlinx.coroutines.p<? super Boolean> d;
        final e<E> e;

        public a(e e4) {
            this.e = e4;
            this.c = kotlinx.coroutines.channels.f.m();
        }

        public static final /* synthetic */ void b(a a4) {
            a4.h();
        }

        public static final /* synthetic */ void d(a a4, kotlinx.coroutines.p p4) {
            a4.d = p4;
        }

        public static final /* synthetic */ void e(a a4, Object object) {
            a4.c = object;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private final Object f(kotlinx.coroutines.channels.l<E> var1_1, int var2_3, long var3_4, kotlin.coroutines.d<? super Boolean> var5_5) {
            block13: {
                var12_6 = this.e;
                var11_7 = r.b((kotlin.coroutines.d)kotlin.coroutines.intrinsics.b.c(var5_5));
                a.d(this, var11_7);
                var13_8 = kotlinx.coroutines.channels.e.E(var12_6, var1_1 /* !! */ , var2_3, var3_4, this);
                if (var13_8 == kotlinx.coroutines.channels.f.r()) {
                    kotlinx.coroutines.channels.e.w(var12_6, this, var1_1 /* !! */ , var2_3);
                    break block13;
                }
                var8_9 /* !! */  = kotlinx.coroutines.channels.f.h();
                var9_10 = null;
                if (var13_8 != var8_9 /* !! */ ) ** GOTO lbl17
                if (var3_4 < var12_6.l0()) {
                    var1_1 /* !! */ .c();
                }
                var1_1 /* !! */  = (kotlinx.coroutines.channels.l)kotlinx.coroutines.channels.e.k().get(var12_6);
                ** GOTO lbl30
                {
                    block14: {
                        catch (Throwable var1_2) {}
lbl17:
                        // 1 sources

                        var1_1 /* !! */ .c();
                        a.e(this, var13_8);
                        a.d(this, null);
                        var10_13 = kotlin.coroutines.jvm.internal.b.a((boolean)true);
                        var14_15 = var12_6.d;
                        var1_1 /* !! */  = var9_10;
                        var8_9 /* !! */  = var10_13;
                        if (var14_15 != null) {
                            var1_1 /* !! */  = kotlinx.coroutines.channels.e.d(var12_6, var14_15, var13_8);
                            var8_9 /* !! */  = var10_13;
                        }
                        break block14;
                        var11_7.P();
                        throw var1_2;
lbl30:
                        // 1 sources

                        while (true) {
                            if (var12_6.t0()) {
                                a.b(this);
                                break block13;
                            }
                            var6_11 = kotlinx.coroutines.channels.e.l().getAndIncrement(var12_6);
                            var2_3 = kotlinx.coroutines.channels.f.b;
                            var3_4 = var6_11 / (long)var2_3;
                            var2_3 = (int)(var6_11 % (long)var2_3);
                            var8_9 /* !! */  = var1_1 /* !! */ ;
                            if (var1_1 /* !! */ .e != var3_4 && (var8_9 /* !! */  = kotlinx.coroutines.channels.e.g(var12_6, var3_4, var1_1 /* !! */ )) == null) continue;
                            var13_8 = kotlinx.coroutines.channels.e.E(var12_6, (kotlinx.coroutines.channels.l)var8_9 /* !! */ , var2_3, var6_11, this);
                            if (var13_8 == kotlinx.coroutines.channels.f.r()) {
                                kotlinx.coroutines.channels.e.w(var12_6, this, (kotlinx.coroutines.channels.l)var8_9 /* !! */ , var2_3);
                                break block13;
                            }
                            if (var13_8 != kotlinx.coroutines.channels.f.h()) break;
                            var1_1 /* !! */  = var8_9 /* !! */ ;
                            if (var6_11 >= var12_6.l0()) continue;
                            var8_9 /* !! */ .c();
                            var1_1 /* !! */  = var8_9 /* !! */ ;
                        }
                        if (var13_8 == kotlinx.coroutines.channels.f.s()) {
                            var1_1 /* !! */  = new IllegalStateException("unexpected".toString());
                            throw var1_1 /* !! */ ;
                        }
                        var8_9 /* !! */ .c();
                        a.e(this, var13_8);
                        a.d(this, null);
                        var10_12 = kotlin.coroutines.jvm.internal.b.a((boolean)true);
                        var14_14 = var12_6.d;
                        var1_1 /* !! */  = var9_10;
                        var8_9 /* !! */  = var10_12;
                        if (var14_14 != null) {
                            var1_1 /* !! */  = kotlinx.coroutines.channels.e.d(var12_6, var14_14, var13_8);
                            var8_9 /* !! */  = var10_12;
                        }
                    }
                    var11_7.p(var8_9 /* !! */ , var1_1 /* !! */ );
                }
            }
            var1_1 /* !! */  = var11_7.z();
            if (var1_1 /* !! */  == kotlin.coroutines.intrinsics.b.f()) {
                kotlin.coroutines.jvm.internal.g.c(var5_5);
            }
            return var1_1 /* !! */ ;
        }

        private final boolean g() {
            this.c = kotlinx.coroutines.channels.f.z();
            Throwable throwable = this.e.b0();
            if (throwable == null) {
                return false;
            }
            throw c0.a((Throwable)throwable);
        }

        private final void h() {
            kotlinx.coroutines.p<? super Boolean> p4 = this.d;
            y.g(p4);
            this.d = null;
            this.c = kotlinx.coroutines.channels.f.z();
            Throwable throwable = this.e.b0();
            if (throwable == null) {
                u.a a4 = u.d;
                p4.resumeWith(u.b((Object)Boolean.FALSE));
            } else {
                u.a a5 = u.d;
                p4.resumeWith(u.b((Object)v.a((Throwable)throwable)));
            }
        }

        @Nullable
        public Object a(@NotNull kotlin.coroutines.d<? super Boolean> d4) {
            block5: {
                boolean bl;
                block4: {
                    Object object = this.c;
                    Object object2 = kotlinx.coroutines.channels.f.m();
                    bl = true;
                    if (object == object2 || this.c == kotlinx.coroutines.channels.f.z()) {
                        int n4;
                        long l4;
                        e e4 = this.e;
                        object = (kotlinx.coroutines.channels.l)((Object)kotlinx.coroutines.channels.e.k.get(e4));
                        while (true) {
                            if (e4.t0()) {
                                bl = this.g();
                                break block4;
                            }
                            l4 = kotlinx.coroutines.channels.e.g.getAndIncrement(e4);
                            n4 = kotlinx.coroutines.channels.f.b;
                            long l5 = l4 / (long)n4;
                            n4 = (int)(l4 % (long)n4);
                            object2 = object;
                            if (((a0)((Object)object)).e != l5 && (object2 = e4.W(l5, (kotlinx.coroutines.channels.l)((Object)object))) == null) continue;
                            object = e4.n1((kotlinx.coroutines.channels.l)((Object)object2), n4, l4, null);
                            if (object == kotlinx.coroutines.channels.f.r()) break block5;
                            if (object != kotlinx.coroutines.channels.f.h()) break;
                            object = object2;
                            if (l4 >= e4.l0()) continue;
                            object2.c();
                            object = object2;
                        }
                        if (object == kotlinx.coroutines.channels.f.s()) {
                            return this.f((kotlinx.coroutines.channels.l)((Object)object2), n4, l4, d4);
                        }
                        object2.c();
                        this.c = object;
                    }
                }
                return kotlin.coroutines.jvm.internal.b.a((boolean)bl);
            }
            throw new IllegalStateException("unreachable".toString());
        }

        public void c(@NotNull a0<?> a02, int n4) {
            kotlinx.coroutines.p<? super Boolean> p4 = this.d;
            if (p4 != null) {
                p4.c(a02, n4);
            }
        }

        public final boolean i(E e4) {
            kotlinx.coroutines.p<? super Boolean> p4 = this.d;
            y.g(p4);
            kotlin.jvm.functions.q q4 = null;
            this.d = null;
            this.c = e4;
            Boolean bl = Boolean.TRUE;
            e e5 = this.e;
            kotlin.jvm.functions.l l4 = e5.d;
            if (l4 != null) {
                q4 = e5.H(l4, e4);
            }
            return kotlinx.coroutines.channels.f.u(p4, (Object)bl, q4);
        }

        public final void j() {
            kotlinx.coroutines.p<? super Boolean> p4 = this.d;
            y.g(p4);
            this.d = null;
            this.c = kotlinx.coroutines.channels.f.z();
            Throwable throwable = this.e.b0();
            if (throwable == null) {
                throwable = u.d;
                p4.resumeWith(u.b((Object)Boolean.FALSE));
            } else {
                u.a a4 = u.d;
                p4.resumeWith(u.b((Object)v.a((Throwable)throwable)));
            }
        }

        public E next() {
            Object object = this.c;
            if (object != kotlinx.coroutines.channels.f.m()) {
                this.c = kotlinx.coroutines.channels.f.m();
                if (object != kotlinx.coroutines.channels.f.z()) {
                    return object;
                }
                throw c0.a((Throwable)this.e.e0());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    @Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001\u00a2\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2={"Lkotlinx/coroutines/channels/e$b;", "Lkotlinx/coroutines/k3;", "Lkotlinx/coroutines/internal/a0;", "segment", "", "index", "Lkotlin/k0;", "c", "(Lkotlinx/coroutines/internal/a0;I)V", "Lkotlinx/coroutines/n;", "", "d", "Lkotlinx/coroutines/n;", "a", "()Lkotlinx/coroutines/n;", "cont", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
    private static final class b
    implements k3 {
        private final kotlinx.coroutines.p<Boolean> c;
        @NotNull
        private final n<Boolean> d;

        @NotNull
        public final n<Boolean> a() {
            return this.d;
        }

        public void c(@NotNull a0<?> a02, int n4) {
            this.c.c(a02, n4);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.collections.f1
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.random.c
 *  kotlin.sequences.i
 *  kotlin.t
 *  kotlin.z
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.a0;
import kotlin.collections.b1;
import kotlin.collections.c0;
import kotlin.collections.d1;
import kotlin.collections.f1;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.collections.v;
import kotlin.collections.y0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.random.c;
import kotlin.ranges.j;
import kotlin.sequences.i;
import kotlin.text.p;
import kotlin.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u00d8\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u00020\u0004\"\t\b\u0000\u0010\u0001\u00a2\u0006\u0002\b\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\t\u0010\n\u001aF\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u000b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\u00a2\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011\u00a2\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0010\u001a\u001f\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011\u00a2\u0006\u0004\b\u0015\u0010\u0013\u001a'\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0016\u0010\u0017\u001a*\u0010\u0018\u001a\u00020\u0007\"\t\b\u0000\u0010\u0001\u00a2\u0006\u0002\b\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0018\u0010\u0019\u001a*\u0010\u001a\u001a\u00020\u0007\"\t\b\u0000\u0010\u0001\u00a2\u0006\u0002\b\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b\u001c\u0010\u0010\u001a\u001d\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011\u00a2\u0006\u0004\b\u001d\u0010\u0013\u001a\u001f\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011\u00a2\u0006\u0004\b\u001e\u0010\u0013\u001a'\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010!\u001a\u00020 H\u0007\u00a2\u0006\u0004\b\"\u0010#\u001a\u001d\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b$\u0010\u0010\u001a\u001d\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011\u00a2\u0006\u0004\b%\u0010\u0013\u001a\u001f\u0010&\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011\u00a2\u0006\u0004\b&\u0010\u0013\u001a+\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010'\u001a\u00020\u0007\u00a2\u0006\u0004\b(\u0010)\u001a+\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010'\u001a\u00020\u0007\u00a2\u0006\u0004\b*\u0010+\u001a)\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\b\b\u0000\u0010\u0001*\u00020,*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\u00a2\u0006\u0004\b-\u0010.\u001a=\u00102\u001a\u00028\u0000\"\u0010\b\u0000\u00100*\n\u0012\u0006\b\u0000\u0012\u00028\u00010/\"\b\b\u0001\u0010\u0001*\u00020,*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00022\u0006\u00101\u001a\u00028\u0000\u00a2\u0006\u0004\b2\u00103\u001a+\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u00105\u001a\u000204\u00a2\u0006\u0004\b6\u00107\u001a+\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010'\u001a\u00020\u0007\u00a2\u0006\u0004\b8\u0010)\u001a+\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010'\u001a\u00020\u0007\u00a2\u0006\u0004\b9\u0010+\u001a#\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b:\u0010.\u001a-\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000;*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b<\u0010.\u001a?\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010?\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000=j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`>\u00a2\u0006\u0004\b@\u0010A\u001a\u0017\u0010C\u001a\u00020B*\b\u0012\u0004\u0012\u00020\u00040\u001f\u00a2\u0006\u0004\bC\u0010D\u001a\u0017\u0010G\u001a\u00020F*\b\u0012\u0004\u0012\u00020E0\u001f\u00a2\u0006\u0004\bG\u0010H\u001a\u0017\u0010J\u001a\u00020I*\b\u0012\u0004\u0012\u00020\u00070\u001f\u00a2\u0006\u0004\bJ\u0010K\u001a\u0017\u0010N\u001a\u00020M*\b\u0012\u0004\u0012\u00020L0\u001f\u00a2\u0006\u0004\bN\u0010O\u001a7\u0010P\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u0010\b\u0001\u00100*\n\u0012\u0006\b\u0000\u0012\u00028\u00000/*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00101\u001a\u00028\u0001\u00a2\u0006\u0004\bP\u00103\u001a-\u0010S\u001a\u0012\u0012\u0004\u0012\u00028\u00000Qj\b\u0012\u0004\u0012\u00028\u0000`R\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\bS\u0010T\u001a#\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\bU\u0010.\u001a#\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000V\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\bW\u0010.\u001a#\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000V\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u001f\u00a2\u0006\u0004\bX\u0010Y\u001a#\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000Z\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b[\u0010\\\u001a#\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\b]\u0010.\u001a4\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000Z\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0004\u00a2\u0006\u0004\b_\u0010`\u001a4\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000Z\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0004\u00a2\u0006\u0004\ba\u0010`\u001a#\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\bc\u0010\\\u001a4\u0010d\u001a\b\u0012\u0004\u0012\u00028\u00000Z\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0004\u00a2\u0006\u0004\bd\u0010`\u001a\u001d\u0010e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\be\u0010f\u001a\u001b\u0010g\u001a\u0004\u0018\u00010E*\b\u0012\u0004\u0012\u00020E0\u0002H\u0007\u00a2\u0006\u0004\bg\u0010h\u001a+\u0010i\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000;*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007\u00a2\u0006\u0004\bi\u0010j\u001a\u001b\u0010k\u001a\u0004\u0018\u00010E*\b\u0012\u0004\u0012\u00020E0\u0002H\u0007\u00a2\u0006\u0004\bk\u0010h\u001a+\u0010l\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000;*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007\u00a2\u0006\u0004\bl\u0010j\u001a3\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010m\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\bn\u0010)\u001a.\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\bo\u0010p\u001a4\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002\u00a2\u0006\u0004\br\u0010s\u001a.\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\bt\u0010u\u001a4\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002\u00a2\u0006\u0004\bv\u0010s\u001a4\u0010w\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u001f2\f\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002\u00a2\u0006\u0004\bw\u0010x\u001aG\u0010{\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010m\u001a\u00020\u00072\b\b\u0002\u0010y\u001a\u00020\u00072\b\b\u0002\u0010z\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b{\u0010|\u001ab\u0010\u007f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010}*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010m\u001a\u00020\u00072\b\b\u0002\u0010y\u001a\u00020\u00072\b\b\u0002\u0010z\u001a\u00020\u00042\u0018\u0010~\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0004\u0012\u00028\u00010\u000bH\u0007\u00a2\u0006\u0005\b\u007f\u0010\u0080\u0001\u001aI\u0010\u0082\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0081\u00010\u0011\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010}*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\u0004\u00a2\u0006\u0005\b\u0082\u0001\u0010s\u001a\u008e\u0001\u0010\u008d\u0001\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u000f\b\u0001\u0010\u0085\u0001*\b0\u0083\u0001j\u0003`\u0084\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0007\u0010\u0086\u0001\u001a\u00028\u00012\n\b\u0002\u0010\u0088\u0001\u001a\u00030\u0087\u00012\n\b\u0002\u0010\u0089\u0001\u001a\u00030\u0087\u00012\n\b\u0002\u0010\u008a\u0001\u001a\u00030\u0087\u00012\t\b\u0002\u0010\u008b\u0001\u001a\u00020\u00072\n\b\u0002\u0010\u008c\u0001\u001a\u00030\u0087\u00012\u0017\b\u0002\u0010~\u001a\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u0087\u0001\u0018\u00010\u000b\u00a2\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001\u001au\u0010\u0090\u0001\u001a\u00030\u008f\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0088\u0001\u001a\u00030\u0087\u00012\n\b\u0002\u0010\u0089\u0001\u001a\u00030\u0087\u00012\n\b\u0002\u0010\u008a\u0001\u001a\u00030\u0087\u00012\t\b\u0002\u0010\u008b\u0001\u001a\u00020\u00072\n\b\u0002\u0010\u008c\u0001\u001a\u00030\u0087\u00012\u0017\b\u0002\u0010~\u001a\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u0087\u0001\u0018\u00010\u000b\u00a2\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a'\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0092\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001\u00a8\u0006\u0095\u0001"}, d2={"Lkotlin/internal/OnlyInputTypes;", "T", "", "element", "", "h0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "", "index", "m0", "(Ljava/lang/Iterable;I)Ljava/lang/Object;", "Lkotlin/Function1;", "defaultValue", "n0", "(Ljava/lang/Iterable;ILkotlin/jvm/functions/l;)Ljava/lang/Object;", "q0", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "", "r0", "(Ljava/util/List;)Ljava/lang/Object;", "s0", "t0", "u0", "(Ljava/util/List;I)Ljava/lang/Object;", "v0", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "w0", "(Ljava/util/List;Ljava/lang/Object;)I", "C0", "D0", "E0", "", "Lkotlin/random/c;", "random", "O0", "(Ljava/util/Collection;Lkotlin/random/c;)Ljava/lang/Object;", "Q0", "R0", "S0", "n", "k0", "(Ljava/lang/Iterable;I)Ljava/util/List;", "l0", "(Ljava/util/List;I)Ljava/util/List;", "", "o0", "(Ljava/lang/Iterable;)Ljava/util/List;", "", "C", "destination", "p0", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "Lkotlin/ranges/i;", "indices", "T0", "(Ljava/util/List;Lkotlin/ranges/i;)Ljava/util/List;", "X0", "Y0", "P0", "", "U0", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "V0", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;", "", "Z0", "(Ljava/util/Collection;)[Z", "", "", "b1", "(Ljava/util/Collection;)[F", "", "d1", "(Ljava/util/Collection;)[I", "", "", "f1", "(Ljava/util/Collection;)[J", "a1", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "c1", "(Ljava/lang/Iterable;)Ljava/util/HashSet;", "e1", "", "g1", "h1", "(Ljava/util/Collection;)Ljava/util/List;", "", "j1", "(Ljava/lang/Iterable;)Ljava/util/Set;", "j0", "other", "x0", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;", "W0", "", "i1", "k1", "i0", "(Ljava/lang/Iterable;)I", "G0", "(Ljava/lang/Iterable;)Ljava/lang/Float;", "F0", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "I0", "H0", "size", "g0", "K0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;", "elements", "J0", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;", "N0", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "L0", "M0", "(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;", "step", "partialWindows", "l1", "(Ljava/lang/Iterable;IIZ)Ljava/util/List;", "R", "transform", "m1", "(Ljava/lang/Iterable;IIZLkotlin/jvm/functions/l;)Ljava/util/List;", "Lkotlin/t;", "o1", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "y0", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/l;)Ljava/lang/Appendable;", "", "A0", "(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/l;)Ljava/lang/String;", "Lkotlin/sequences/i;", "f0", "(Ljava/lang/Iterable;)Lkotlin/sequences/i;", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/collections/CollectionsKt")
@SourceDebugExtension(value={"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,3686:1\n295#1,2:3687\n528#1,7:3689\n543#1,6:3696\n865#1,2:3703\n796#1:3705\n1872#1,2:3706\n797#1,2:3708\n1874#1:3710\n799#1:3711\n1872#1,3:3712\n817#1,2:3715\n855#1,2:3717\n1261#1,4:3723\n1230#1,4:3727\n1246#1,4:3731\n1293#1,4:3735\n1454#1,5:3739\n1469#1,5:3744\n1510#1,3:3749\n1513#1,3:3759\n1528#1,3:3762\n1531#1,3:3772\n1628#1,3:3789\n1598#1,4:3792\n1587#1:3796\n1872#1,2:3797\n1874#1:3800\n1588#1:3801\n1872#1,3:3802\n1619#1:3805\n1863#1:3806\n1864#1:3808\n1620#1:3809\n1863#1,2:3810\n1872#1,3:3812\n2853#1,3:3815\n2856#1,6:3819\n2878#1,3:3825\n2881#1,7:3829\n865#1,2:3836\n827#1:3838\n855#1,2:3839\n827#1:3841\n855#1,2:3842\n827#1:3844\n855#1,2:3845\n3408#1,8:3851\n3436#1,7:3859\n3467#1,10:3866\n1#2:3702\n1#2:3799\n1#2:3807\n1#2:3818\n1#2:3828\n37#3,2:3719\n37#3,2:3721\n381#4,7:3752\n381#4,7:3765\n381#4,7:3775\n381#4,7:3782\n32#5,2:3847\n32#5,2:3849\n*S KotlinDebug\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n174#1:3687,2\n184#1:3689,7\n194#1:3696,6\n774#1:3703,2\n785#1:3705\n785#1:3706,2\n785#1:3708,2\n785#1:3710\n785#1:3711\n796#1:3712,3\n808#1:3715,2\n827#1:3717,2\n1188#1:3723,4\n1203#1:3727,4\n1217#1:3731,4\n1280#1:3735,4\n1368#1:3739,5\n1381#1:3744,5\n1485#1:3749,3\n1485#1:3759,3\n1498#1:3762,3\n1498#1:3772,3\n1557#1:3789,3\n1567#1:3792,4\n1577#1:3796\n1577#1:3797,2\n1577#1:3800\n1577#1:3801\n1587#1:3802,3\n1611#1:3805\n1611#1:3806\n1611#1:3808\n1611#1:3809\n1619#1:3810,2\n2653#1:3812,3\n2953#1:3815,3\n2953#1:3819,6\n2970#1:3825,3\n2970#1:3829,7\n3146#1:3836,2\n3154#1:3838\n3154#1:3839,2\n3164#1:3841\n3164#1:3842,2\n3174#1:3844\n3174#1:3845,2\n3397#1:3851,8\n3425#1:3859,7\n3454#1:3866,10\n1577#1:3799\n1611#1:3807\n2953#1:3818\n2970#1:3828\n1040#1:3719,2\n1083#1:3721,2\n1485#1:3752,7\n1498#1:3765,7\n1512#1:3775,7\n1530#1:3782,7\n3342#1:3847,2\n3384#1:3849,2\n*E\n"})
class d0
extends c0 {
    @NotNull
    public static final <T> String A0(@NotNull Iterable<? extends T> object, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int n4, @NotNull CharSequence charSequence4, @Nullable kotlin.jvm.functions.l<? super T, ? extends CharSequence> l4) {
        y.j(object, (String)"<this>");
        y.j((Object)charSequence, (String)"separator");
        y.j((Object)charSequence2, (String)"prefix");
        y.j((Object)charSequence3, (String)"postfix");
        y.j((Object)charSequence4, (String)"truncated");
        object = d0.y0(object, new StringBuilder(), charSequence, charSequence2, charSequence3, n4, charSequence4, l4).toString();
        y.i((Object)object, (String)"toString(...)");
        return object;
    }

    public static /* synthetic */ String B0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence object, int n4, CharSequence charSequence3, kotlin.jvm.functions.l l4, int n5, Object object2) {
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
        return d0.A0(iterable, charSequence, charSequence2, (CharSequence)object, n4, charSequence3, l4);
    }

    public static final <T> T C0(@NotNull Iterable<? extends T> iterable) {
        y.j(iterable, (String)"<this>");
        if (iterable instanceof List) {
            return (T)t.D0((List)iterable);
        }
        Iterator<T> iterator = iterable.iterator();
        if (iterator.hasNext()) {
            iterable = iterator.next();
            while (iterator.hasNext()) {
                iterable = iterator.next();
            }
            return (T)iterable;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T D0(@NotNull List<? extends T> list) {
        y.j(list, (String)"<this>");
        if (!list.isEmpty()) {
            return list.get(t.o(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    @Nullable
    public static <T> T E0(@NotNull List<? extends T> list) {
        y.j(list, (String)"<this>");
        list = list.isEmpty() ? null : list.get(list.size() - 1);
        return (T)list;
    }

    @SinceKotlin(version="1.4")
    @Nullable
    public static <T extends Comparable<? super T>> T F0(@NotNull Iterable<? extends T> object) {
        y.j(object, (String)"<this>");
        Iterator<T> iterator = object.iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        object = (Comparable)iterator.next();
        while (iterator.hasNext()) {
            Comparable comparable = (Comparable)iterator.next();
            if (object.compareTo(comparable) >= 0) continue;
            object = comparable;
        }
        return (T)object;
    }

    @SinceKotlin(version="1.4")
    @Nullable
    public static Float G0(@NotNull Iterable<Float> object) {
        y.j(object, (String)"<this>");
        object = object.iterator();
        if (!object.hasNext()) {
            return null;
        }
        float f4 = ((Number)object.next()).floatValue();
        while (object.hasNext()) {
            f4 = Math.max(f4, ((Number)object.next()).floatValue());
        }
        return Float.valueOf(f4);
    }

    @SinceKotlin(version="1.4")
    @Nullable
    public static <T extends Comparable<? super T>> T H0(@NotNull Iterable<? extends T> object) {
        y.j(object, (String)"<this>");
        Iterator<T> iterator = object.iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        object = (Comparable)iterator.next();
        while (iterator.hasNext()) {
            Comparable comparable = (Comparable)iterator.next();
            if (object.compareTo(comparable) <= 0) continue;
            object = comparable;
        }
        return (T)object;
    }

    @SinceKotlin(version="1.4")
    @Nullable
    public static Float I0(@NotNull Iterable<Float> object) {
        y.j(object, (String)"<this>");
        object = object.iterator();
        if (!object.hasNext()) {
            return null;
        }
        float f4 = ((Number)object.next()).floatValue();
        while (object.hasNext()) {
            f4 = Math.min(f4, ((Number)object.next()).floatValue());
        }
        return Float.valueOf(f4);
    }

    @NotNull
    public static <T> List<T> J0(@NotNull Iterable<? extends T> object, @NotNull Iterable<? extends T> iterable) {
        y.j(object, (String)"<this>");
        y.j(iterable, (String)"elements");
        iterable = a0.H(iterable);
        if (iterable.isEmpty()) {
            return t.e1(object);
        }
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object e4 = object.next();
            if (iterable.contains(e4)) continue;
            arrayList.add(e4);
        }
        return arrayList;
    }

    @NotNull
    public static <T> List<T> K0(@NotNull Iterable<? extends T> object, T t3) {
        y.j(object, (String)"<this>");
        ArrayList arrayList = new ArrayList(t.x(object, 10));
        object = object.iterator();
        boolean bl = false;
        while (object.hasNext()) {
            Object e4 = object.next();
            boolean bl2 = true;
            boolean bl3 = bl;
            boolean bl4 = bl2;
            if (!bl) {
                bl3 = bl;
                bl4 = bl2;
                if (y.e(e4, t3)) {
                    bl3 = true;
                    bl4 = false;
                }
            }
            bl = bl3;
            if (!bl4) continue;
            arrayList.add(e4);
            bl = bl3;
        }
        return arrayList;
    }

    @NotNull
    public static <T> List<T> L0(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        y.j(iterable, (String)"<this>");
        y.j(iterable2, (String)"elements");
        if (iterable instanceof Collection) {
            return t.M0((Collection)iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        t.E(arrayList, iterable);
        t.E(arrayList, iterable2);
        return arrayList;
    }

    @NotNull
    public static <T> List<T> M0(@NotNull Collection<? extends T> collection, @NotNull Iterable<? extends T> collection2) {
        y.j(collection, (String)"<this>");
        y.j(collection2, (String)"elements");
        if (collection2 instanceof Collection) {
            int n4 = collection.size();
            collection2 = collection2;
            ArrayList<T> arrayList = new ArrayList<T>(n4 + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        collection = new ArrayList<T>(collection);
        t.E(collection, (Iterable)collection2);
        return collection;
    }

    @NotNull
    public static <T> List<T> N0(@NotNull Collection<? extends T> collection, T t3) {
        y.j(collection, (String)"<this>");
        ArrayList<T> arrayList = new ArrayList<T>(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t3);
        return arrayList;
    }

    @SinceKotlin(version="1.3")
    public static <T> T O0(@NotNull Collection<? extends T> collection, @NotNull c c4) {
        y.j(collection, (String)"<this>");
        y.j((Object)c4, (String)"random");
        if (!collection.isEmpty()) {
            return d0.m0((Iterable)collection, c4.d(collection.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @NotNull
    public static <T> List<T> P0(@NotNull Iterable<? extends T> iterable) {
        y.j(iterable, (String)"<this>");
        if (iterable instanceof Collection && ((Collection)iterable).size() <= 1) {
            return t.e1(iterable);
        }
        iterable = d0.g1(iterable);
        t.e0(iterable);
        return iterable;
    }

    public static <T> T Q0(@NotNull Iterable<? extends T> object) {
        y.j(object, (String)"<this>");
        if (object instanceof List) {
            return (T)t.R0((List)object);
        }
        if ((object = object.iterator()).hasNext()) {
            Object e4 = object.next();
            if (!object.hasNext()) {
                return (T)e4;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T R0(@NotNull List<? extends T> list) {
        y.j(list, (String)"<this>");
        int n4 = list.size();
        if (n4 != 0) {
            if (n4 == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    @Nullable
    public static <T> T S0(@NotNull List<? extends T> list) {
        y.j(list, (String)"<this>");
        list = list.size() == 1 ? list.get(0) : null;
        return (T)list;
    }

    @NotNull
    public static <T> List<T> T0(@NotNull List<? extends T> list, @NotNull kotlin.ranges.i i4) {
        y.j(list, (String)"<this>");
        y.j((Object)i4, (String)"indices");
        if (i4.isEmpty()) {
            return t.m();
        }
        return t.e1(list.subList(i4.l(), i4.k() + 1));
    }

    @NotNull
    public static <T extends Comparable<? super T>> List<T> U0(@NotNull Iterable<? extends T> objectArray) {
        y.j(objectArray, (String)"<this>");
        if (objectArray instanceof Collection) {
            Collection collection = (Collection)objectArray;
            if (collection.size() <= 1) {
                return t.e1(objectArray);
            }
            objectArray = collection.toArray(new Comparable[0]);
            l.O(objectArray);
            return l.e(objectArray);
        }
        objectArray = d0.g1(objectArray);
        t.C(objectArray);
        return objectArray;
    }

    @NotNull
    public static <T> List<T> V0(@NotNull Iterable<? extends T> objectArray, @NotNull Comparator<? super T> comparator) {
        y.j(objectArray, (String)"<this>");
        y.j(comparator, (String)"comparator");
        if (objectArray instanceof Collection) {
            Collection collection = (Collection)objectArray;
            if (collection.size() <= 1) {
                return t.e1(objectArray);
            }
            objectArray = collection.toArray(new Object[0]);
            o.P(objectArray, comparator);
            return l.e(objectArray);
        }
        objectArray = d0.g1(objectArray);
        t.D(objectArray, comparator);
        return objectArray;
    }

    @NotNull
    public static <T> Set<T> W0(@NotNull Iterable<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        y.j(set, (String)"<this>");
        y.j(iterable, (String)"other");
        set = t.i1(set);
        t.L((Collection)set, iterable);
        return set;
    }

    @NotNull
    public static <T> List<T> X0(@NotNull Iterable<? extends T> iterator, int n4) {
        y.j(iterator, (String)"<this>");
        if (n4 >= 0) {
            if (n4 == 0) {
                return t.m();
            }
            if (iterator instanceof Collection) {
                if (n4 >= ((Collection)((Object)iterator)).size()) {
                    return t.e1((Iterable)((Object)iterator));
                }
                if (n4 == 1) {
                    return t.e(t.q0(iterator));
                }
            }
            ArrayList arrayList = new ArrayList(n4);
            iterator = iterator.iterator();
            int n5 = 0;
            while (iterator.hasNext()) {
                int n6;
                arrayList.add(iterator.next());
                n5 = n6 = n5 + 1;
                if (n6 != n4) continue;
            }
            return v.t(arrayList);
        }
        iterator = new StringBuilder();
        ((StringBuilder)((Object)iterator)).append("Requested element count ");
        ((StringBuilder)((Object)iterator)).append(n4);
        ((StringBuilder)((Object)iterator)).append(" is less than zero.");
        throw new IllegalArgumentException(((StringBuilder)((Object)iterator)).toString().toString());
    }

    @NotNull
    public static <T> List<T> Y0(@NotNull List<? extends T> listIterator, int n4) {
        y.j(listIterator, (String)"<this>");
        if (n4 >= 0) {
            if (n4 == 0) {
                return t.m();
            }
            int n5 = listIterator.size();
            if (n4 >= n5) {
                return t.e1((Iterable)((Object)listIterator));
            }
            if (n4 == 1) {
                return t.e(t.D0((List)((Object)listIterator)));
            }
            ArrayList arrayList = new ArrayList(n4);
            if (listIterator instanceof RandomAccess) {
                for (n4 = n5 - n4; n4 < n5; ++n4) {
                    arrayList.add(listIterator.get(n4));
                }
            } else {
                listIterator = listIterator.listIterator(n5 - n4);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        listIterator = new StringBuilder();
        ((StringBuilder)((Object)listIterator)).append("Requested element count ");
        ((StringBuilder)((Object)listIterator)).append(n4);
        ((StringBuilder)((Object)listIterator)).append(" is less than zero.");
        throw new IllegalArgumentException(((StringBuilder)((Object)listIterator)).toString().toString());
    }

    @NotNull
    public static boolean[] Z0(@NotNull Collection<Boolean> object) {
        y.j(object, (String)"<this>");
        boolean[] blArray = new boolean[object.size()];
        object = object.iterator();
        int n4 = 0;
        while (object.hasNext()) {
            blArray[n4] = (Boolean)object.next();
            ++n4;
        }
        return blArray;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C a1(@NotNull Iterable<? extends T> object, @NotNull C c4) {
        y.j(object, (String)"<this>");
        y.j(c4, (String)"destination");
        object = object.iterator();
        while (object.hasNext()) {
            c4.add(object.next());
        }
        return c4;
    }

    @NotNull
    public static float[] b1(@NotNull Collection<Float> object) {
        y.j(object, (String)"<this>");
        float[] fArray = new float[object.size()];
        object = object.iterator();
        int n4 = 0;
        while (object.hasNext()) {
            fArray[n4] = ((Number)object.next()).floatValue();
            ++n4;
        }
        return fArray;
    }

    @NotNull
    public static <T> HashSet<T> c1(@NotNull Iterable<? extends T> iterable) {
        y.j(iterable, (String)"<this>");
        return d0.a1(iterable, new HashSet(s0.f(t.x(iterable, 12))));
    }

    @NotNull
    public static int[] d1(@NotNull Collection<Integer> object) {
        y.j(object, (String)"<this>");
        int[] nArray = new int[object.size()];
        object = object.iterator();
        int n4 = 0;
        while (object.hasNext()) {
            nArray[n4] = ((Number)object.next()).intValue();
            ++n4;
        }
        return nArray;
    }

    @NotNull
    public static <T> List<T> e1(@NotNull Iterable<? extends T> list) {
        y.j(list, (String)"<this>");
        if (list instanceof Collection) {
            Collection collection = list;
            int n4 = collection.size();
            if (n4 != 0) {
                if (n4 != 1) {
                    list = t.h1(collection);
                } else {
                    list = list instanceof List ? list.get(0) : list.iterator().next();
                    list = t.e(list);
                }
            } else {
                list = t.m();
            }
            return list;
        }
        return v.t(d0.g1(list));
    }

    @NotNull
    public static <T> i<T> f0(@NotNull Iterable<? extends T> iterable) {
        y.j(iterable, (String)"<this>");
        return new i<T>(iterable){
            final Iterable a;
            {
                this.a = iterable;
            }

            public Iterator<T> iterator() {
                return this.a.iterator();
            }
        };
    }

    @NotNull
    public static long[] f1(@NotNull Collection<Long> object) {
        y.j(object, (String)"<this>");
        long[] lArray = new long[object.size()];
        object = object.iterator();
        int n4 = 0;
        while (object.hasNext()) {
            lArray[n4] = ((Number)object.next()).longValue();
            ++n4;
        }
        return lArray;
    }

    @SinceKotlin(version="1.2")
    @NotNull
    public static <T> List<List<T>> g0(@NotNull Iterable<? extends T> iterable, int n4) {
        y.j(iterable, (String)"<this>");
        return d0.l1(iterable, n4, n4, true);
    }

    @NotNull
    public static final <T> List<T> g1(@NotNull Iterable<? extends T> iterable) {
        y.j(iterable, (String)"<this>");
        if (iterable instanceof Collection) {
            return t.h1((Collection)iterable);
        }
        return d0.a1(iterable, new ArrayList());
    }

    public static <T> boolean h0(@NotNull Iterable<? extends T> iterable, T t3) {
        y.j(iterable, (String)"<this>");
        if (iterable instanceof Collection) {
            return ((Collection)iterable).contains(t3);
        }
        boolean bl = t.v0(iterable, t3) >= 0;
        return bl;
    }

    @NotNull
    public static <T> List<T> h1(@NotNull Collection<? extends T> collection) {
        y.j(collection, (String)"<this>");
        return new ArrayList<T>(collection);
    }

    public static <T> int i0(@NotNull Iterable<? extends T> object) {
        y.j(object, (String)"<this>");
        if (object instanceof Collection) {
            return ((Collection)object).size();
        }
        object = object.iterator();
        int n4 = 0;
        while (object.hasNext()) {
            int n5;
            object.next();
            n4 = n5 = n4 + 1;
            if (n5 >= 0) continue;
            t.v();
            n4 = n5;
        }
        return n4;
    }

    @NotNull
    public static <T> Set<T> i1(@NotNull Iterable<? extends T> set) {
        y.j(set, (String)"<this>");
        set = set instanceof Collection ? new LinkedHashSet<T>((Collection)set) : (Set<Object>)d0.a1(set, new LinkedHashSet());
        return set;
    }

    @NotNull
    public static <T> List<T> j0(@NotNull Iterable<? extends T> iterable) {
        y.j(iterable, (String)"<this>");
        return t.e1((Iterable)t.i1(iterable));
    }

    @NotNull
    public static <T> Set<T> j1(@NotNull Iterable<? extends T> set) {
        y.j(set, (String)"<this>");
        if (set instanceof Collection) {
            Collection collection = set;
            int n4 = collection.size();
            if (n4 != 0) {
                if (n4 != 1) {
                    set = d0.a1(set, new LinkedHashSet(s0.f(collection.size())));
                } else {
                    set = set instanceof List ? ((List)((Object)set)).get(0) : set.iterator().next();
                    set = b1.d(set);
                }
            } else {
                set = b1.f();
            }
            return set;
        }
        return d1.i(d0.a1(set, new LinkedHashSet()));
    }

    @NotNull
    public static <T> List<T> k0(@NotNull Iterable<? extends T> listIterator, int n4) {
        y.j(listIterator, (String)"<this>");
        if (n4 >= 0) {
            Object object;
            Object object2;
            int n5;
            if (n4 == 0) {
                return t.e1(listIterator);
            }
            if (listIterator instanceof Collection) {
                Collection collection = (Collection)((Object)listIterator);
                n5 = collection.size() - n4;
                if (n5 <= 0) {
                    return t.m();
                }
                if (n5 == 1) {
                    return t.e(d0.C0(listIterator));
                }
                object = object2 = new ArrayList(n5);
                if (listIterator instanceof List) {
                    if (listIterator instanceof RandomAccess) {
                        n5 = collection.size();
                        while (n4 < n5) {
                            ((ArrayList)object2).add(((List)((Object)listIterator)).get(n4));
                            ++n4;
                        }
                    } else {
                        listIterator = ((List)((Object)listIterator)).listIterator(n4);
                        while (listIterator.hasNext()) {
                            ((ArrayList)object2).add(listIterator.next());
                        }
                    }
                    return object2;
                }
            } else {
                object = new ArrayList();
            }
            object2 = listIterator.iterator();
            n5 = 0;
            while (object2.hasNext()) {
                listIterator = object2.next();
                if (n5 >= n4) {
                    ((ArrayList)object).add(listIterator);
                    continue;
                }
                ++n5;
            }
            return v.t(object);
        }
        listIterator = new StringBuilder();
        ((StringBuilder)((Object)listIterator)).append("Requested element count ");
        ((StringBuilder)((Object)listIterator)).append(n4);
        ((StringBuilder)((Object)listIterator)).append(" is less than zero.");
        throw new IllegalArgumentException(((StringBuilder)((Object)listIterator)).toString().toString());
    }

    @NotNull
    public static <T> Set<T> k1(@NotNull Iterable<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        y.j(set, (String)"<this>");
        y.j(iterable, (String)"other");
        set = t.i1(set);
        t.E((Collection)set, iterable);
        return set;
    }

    @NotNull
    public static <T> List<T> l0(@NotNull List<? extends T> object, int n4) {
        y.j(object, (String)"<this>");
        if (n4 >= 0) {
            return t.X0((Iterable)object, j.e(object.size() - n4, 0));
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Requested element count ");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(" is less than zero.");
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @SinceKotlin(version="1.2")
    @NotNull
    public static final <T> List<List<T>> l1(@NotNull Iterable<? extends T> arrayList, int n4, int n5, boolean bl) {
        y.j(arrayList, (String)"<this>");
        f1.a((int)n4, (int)n5);
        if (arrayList instanceof RandomAccess && arrayList instanceof List) {
            int n6;
            List list = arrayList;
            int n7 = list.size();
            int n8 = n7 / n5;
            int n9 = n7 % n5 == 0 ? 0 : 1;
            ArrayList<List<T>> arrayList2 = new ArrayList<List<T>>(n8 + n9);
            for (n9 = 0; n9 >= 0 && n9 < n7 && ((n6 = j.i(n4, n7 - n9)) >= n4 || bl); n9 += n5) {
                arrayList = new ArrayList(n6);
                for (n8 = 0; n8 < n6; ++n8) {
                    arrayList.add(list.get(n8 + n9));
                }
                arrayList2.add(arrayList);
            }
            return arrayList2;
        }
        ArrayList<List<T>> arrayList3 = new ArrayList<List<T>>();
        arrayList = f1.b(arrayList.iterator(), (int)n4, (int)n5, (boolean)bl, (boolean)false);
        while (arrayList.hasNext()) {
            arrayList3.add((List)arrayList.next());
        }
        return arrayList3;
    }

    public static final <T> T m0(@NotNull Iterable<? extends T> iterable, int n4) {
        y.j(iterable, (String)"<this>");
        if (iterable instanceof List) {
            return (T)((List)iterable).get(n4);
        }
        return d0.n0(iterable, n4, new kotlin.jvm.functions.l<Integer, T>(n4){
            final int g;
            {
                this.g = n4;
                super(1);
            }

            @Override
            public final T invoke(int n4) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Collection doesn't contain element at index ");
                stringBuilder.append(this.g);
                stringBuilder.append('.');
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
        });
    }

    @SinceKotlin(version="1.2")
    @NotNull
    public static final <T, R> List<R> m1(@NotNull Iterable<? extends T> arrayList, int n4, int n5, boolean bl, @NotNull kotlin.jvm.functions.l<? super List<? extends T>, ? extends R> l4) {
        y.j(arrayList, (String)"<this>");
        y.j(l4, (String)"transform");
        f1.a((int)n4, (int)n5);
        boolean bl2 = arrayList instanceof RandomAccess;
        int n6 = 1;
        if (bl2 && arrayList instanceof List) {
            y0 y02 = (y0)((Object)arrayList);
            int n7 = y02.size();
            int n8 = n7 / n5;
            int n9 = 0;
            if (n7 % n5 == 0) {
                n6 = 0;
            }
            arrayList = new ArrayList<R>(n8 + n6);
            y02 = new y0(y02);
            for (n6 = n9; n6 >= 0 && n6 < n7; n6 += n5) {
                n9 = j.i(n4, n7 - n6);
                if (!bl && n9 < n4) break;
                y02.a(n6, n9 + n6);
                arrayList.add(l4.invoke(y02));
            }
            return arrayList;
        }
        ArrayList<R> arrayList2 = new ArrayList<R>();
        arrayList = f1.b(arrayList.iterator(), (int)n4, (int)n5, (boolean)bl, (boolean)true);
        while (arrayList.hasNext()) {
            arrayList2.add(l4.invoke((List)arrayList.next()));
        }
        return arrayList2;
    }

    public static final <T> T n0(@NotNull Iterable<? extends T> object, int n4, @NotNull kotlin.jvm.functions.l<? super Integer, ? extends T> l4) {
        y.j(object, (String)"<this>");
        y.j(l4, (String)"defaultValue");
        if (object instanceof List) {
            object = (List)object;
            object = n4 >= 0 && n4 < object.size() ? object.get(n4) : l4.invoke(n4);
            return (T)object;
        }
        if (n4 < 0) {
            return l4.invoke(n4);
        }
        object = object.iterator();
        int n5 = 0;
        while (object.hasNext()) {
            Object e4 = object.next();
            if (n4 == n5) {
                return (T)e4;
            }
            ++n5;
        }
        return l4.invoke(n4);
    }

    public static /* synthetic */ List n1(Iterable iterable, int n4, int n5, boolean bl, kotlin.jvm.functions.l l4, int n6, Object object) {
        if ((n6 & 2) != 0) {
            n5 = 1;
        }
        if ((n6 & 4) != 0) {
            bl = false;
        }
        return d0.m1(iterable, n4, n5, bl, l4);
    }

    @NotNull
    public static <T> List<T> o0(@NotNull Iterable<? extends T> iterable) {
        y.j(iterable, (String)"<this>");
        return d0.p0(iterable, new ArrayList());
    }

    @NotNull
    public static <T, R> List<kotlin.t<T, R>> o1(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends R> iterable2) {
        y.j(iterable, (String)"<this>");
        y.j(iterable2, (String)"other");
        Iterator<T> iterator = iterable.iterator();
        Iterator<R> iterator2 = iterable2.iterator();
        iterable = new ArrayList<T>(Math.min(t.x(iterable, 10), t.x(iterable2, 10)));
        while (iterator.hasNext() && iterator2.hasNext()) {
            ((ArrayList)iterable).add((kotlin.t)z.a(iterator.next(), iterator2.next()));
        }
        return iterable;
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C p0(@NotNull Iterable<? extends T> iterable2, @NotNull C c4) {
        y.j(iterable2, (String)"<this>");
        y.j(c4, (String)"destination");
        for (Iterable<T> iterable2 : iterable2) {
            if (iterable2 == null) continue;
            c4.add(iterable2);
        }
        return c4;
    }

    public static <T> T q0(@NotNull Iterable<? extends T> object) {
        y.j(object, (String)"<this>");
        if (object instanceof List) {
            return (T)t.r0((List)object);
        }
        if ((object = object.iterator()).hasNext()) {
            return (T)object.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T r0(@NotNull List<? extends T> list) {
        y.j(list, (String)"<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    @Nullable
    public static <T> T s0(@NotNull Iterable<? extends T> object) {
        y.j(object, (String)"<this>");
        if (object instanceof List) {
            if ((object = (List)object).isEmpty()) {
                return null;
            }
            return (T)object.get(0);
        }
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        return (T)object.next();
    }

    @Nullable
    public static <T> T t0(@NotNull List<? extends T> list) {
        y.j(list, (String)"<this>");
        list = list.isEmpty() ? null : list.get(0);
        return (T)list;
    }

    @Nullable
    public static <T> T u0(@NotNull List<? extends T> list, int n4) {
        y.j(list, (String)"<this>");
        list = n4 >= 0 && n4 < list.size() ? list.get(n4) : null;
        return (T)list;
    }

    public static <T> int v0(@NotNull Iterable<? extends T> iterable, T t3) {
        y.j(iterable, (String)"<this>");
        if (iterable instanceof List) {
            return ((List)iterable).indexOf(t3);
        }
        Iterator<T> iterator = iterable.iterator();
        int n4 = 0;
        while (iterator.hasNext()) {
            iterable = iterator.next();
            if (n4 < 0) {
                t.w();
            }
            if (y.e(t3, iterable)) {
                return n4;
            }
            ++n4;
        }
        return -1;
    }

    public static <T> int w0(@NotNull List<? extends T> list, T t3) {
        y.j(list, (String)"<this>");
        return list.indexOf(t3);
    }

    @NotNull
    public static <T> Set<T> x0(@NotNull Iterable<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        y.j(set, (String)"<this>");
        y.j(iterable, (String)"other");
        set = t.i1(set);
        t.U((Collection)set, iterable);
        return set;
    }

    @NotNull
    public static final <T, A extends Appendable> A y0(@NotNull Iterable<? extends T> iterable, @NotNull A a4, @NotNull CharSequence charSequence, @NotNull CharSequence object, @NotNull CharSequence charSequence2, int n4, @NotNull CharSequence charSequence3, @Nullable kotlin.jvm.functions.l<? super T, ? extends CharSequence> l4) {
        int n5;
        y.j(iterable, (String)"<this>");
        y.j(a4, (String)"buffer");
        y.j((Object)charSequence, (String)"separator");
        y.j((Object)object, (String)"prefix");
        y.j((Object)charSequence2, (String)"postfix");
        y.j((Object)charSequence3, (String)"truncated");
        a4.append((CharSequence)object);
        object = iterable.iterator();
        int n6 = 0;
        while (true) {
            n5 = n6++;
            if (!object.hasNext()) break;
            iterable = object.next();
            if (n6 > 1) {
                a4.append(charSequence);
            }
            if (n4 >= 0) {
                n5 = n6;
                if (n6 > n4) break;
            }
            p.a(a4, iterable, l4);
        }
        if (n4 >= 0 && n5 > n4) {
            a4.append(charSequence3);
        }
        a4.append(charSequence2);
        return a4;
    }

    public static /* synthetic */ Appendable z0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence object, int n4, CharSequence charSequence3, kotlin.jvm.functions.l l4, int n5, Object object2) {
        block5: {
            if ((n5 & 2) != 0) {
                charSequence = ", ";
            }
            object2 = "";
            if ((n5 & 4) != 0) {
                charSequence2 = "";
            }
            if ((n5 & 8) != 0) {
                object = object2;
            }
            if ((n5 & 0x10) != 0) {
                n4 = -1;
            }
            if ((n5 & 0x20) != 0) {
                charSequence3 = "...";
            }
            if ((n5 & 0x40) == 0) break block5;
            l4 = null;
        }
        return d0.y0(iterable, appendable, charSequence, charSequence2, (CharSequence)object, n4, charSequence3, l4);
    }
}


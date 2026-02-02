/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.concurrent.futures.a
 *  com.google.errorprone.annotations.CanIgnoreReturnValue
 *  com.google.j2objc.annotations.ReflectionSupport
 *  com.google.j2objc.annotations.ReflectionSupport$a
 *  com.yandex.mobile.ads.impl.e$a
 *  com.yandex.mobile.ads.impl.e$b
 *  com.yandex.mobile.ads.impl.e$c
 *  com.yandex.mobile.ads.impl.e$d
 *  com.yandex.mobile.ads.impl.e$f
 *  com.yandex.mobile.ads.impl.e$i
 *  com.yandex.mobile.ads.impl.js2
 *  com.yandex.mobile.ads.impl.l32
 *  com.yandex.mobile.ads.impl.np0
 */
package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.ReflectionSupport;
import com.yandex.mobile.ads.impl.e;
import com.yandex.mobile.ads.impl.js2;
import com.yandex.mobile.ads.impl.l32;
import com.yandex.mobile.ads.impl.np0;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

@ReflectionSupport(value=ReflectionSupport.a.d)
public abstract class e<V>
extends np0
implements Future {
    private static final boolean e;
    private static final Logger f;
    private static final a g;
    private static final Object h;
    @CheckForNull
    private volatile Object b;
    @CheckForNull
    private volatile d c;
    @CheckForNull
    private volatile i d;

    static {
        a a12;
        boolean bl2;
        try {
            bl2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        }
        catch (SecurityException securityException) {
            bl2 = false;
        }
        e = bl2;
        f = Logger.getLogger(e.class.getName());
        Throwable throwable = null;
        try {
            a12 = new e(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(e.class, i.class, "d"), AtomicReferenceFieldUpdater.newUpdater(e.class, d.class, "c"), AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "b"));
        }
        catch (Throwable throwable2) {
            a12 = new g(null);
        }
        g = a12;
        if (throwable != null) {
            f.log(Level.SEVERE, "SafeAtomicHelper is broken!", throwable);
        }
        h = new Object();
    }

    protected e() {
    }

    private static Object a(Object object) throws ExecutionException {
        if (!(object instanceof b)) {
            if (!(object instanceof c)) {
                Object object2 = object;
                if (object == h) {
                    object2 = null;
                }
                return object2;
            }
            throw new ExecutionException((object).a);
        }
        Throwable throwable = (object).a;
        object = new CancellationException("Task was cancelled.");
        ((Throwable)object).initCause(throwable);
        throw object;
    }

    /*
     * Unable to fully structure code
     */
    private void a(i var1_1) {
        var1_1.a = null;
        block0: while (true) {
            if ((var1_1 = this.d) == i.c) {
                return;
            }
            var2_2 = null;
            while (var1_1 != null) {
                var4_4 = var1_1.b;
                if (var1_1.a != null) {
                    var3_3 = var1_1;
                } else if (var2_2 != null) {
                    var2_2.b = var4_4;
                    var3_3 = var2_2;
                    if (var2_2.a == null) {
                        continue block0;
                    }
                } else {
                    var3_3 = var2_2;
                    if (com.yandex.mobile.ads.impl.e.g.a(this, var1_1, var4_4)) ** break;
                    continue block0;
                }
                var1_1 = var4_4;
                var2_2 = var3_3;
            }
            break;
        }
    }

    private static void a(e<?> object) {
        Thread thread;
        Object object2;
        while (!g.a(object, object2 = ((e)object).d, i.c)) {
        }
        while (object2 != null) {
            thread = object2.a;
            if (thread != null) {
                object2.a = null;
                LockSupport.unpark(thread);
            }
            object2 = object2.b;
        }
        while (!g.a(object, thread = ((e)object).c, com.yandex.mobile.ads.impl.e$d.b)) {
        }
        object2 = null;
        object = thread;
        while (object != null) {
            thread = object.a;
            object.a = object2;
            object2 = object;
            object = thread;
        }
        if (object2 == null) {
            return;
        }
        throw null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(StringBuilder stringBuilder) {
        boolean bl2 = false;
        while (true) {
            ExecutionException executionException222;
            RuntimeException runtimeException222;
            block9: {
                Object v14;
                block8: {
                    v14 = this.get();
                    if (!bl2) break block8;
                    try {
                        Thread.currentThread().interrupt();
                    }
                    catch (RuntimeException runtimeException222) {
                        break block9;
                    }
                    catch (ExecutionException executionException222) {
                    }
                }
                stringBuilder.append("SUCCESS, result=[");
                this.a(stringBuilder, v14);
                stringBuilder.append("]");
                return;
                catch (Throwable throwable) {
                    if (!bl2) throw throwable;
                    Thread.currentThread().interrupt();
                    throw throwable;
                }
            }
            stringBuilder.append("UNKNOWN, cause=[");
            stringBuilder.append(runtimeException222.getClass());
            stringBuilder.append(" thrown from get()]");
            return;
            catch (CancellationException cancellationException) {
                stringBuilder.append("CANCELLED");
                return;
            }
            stringBuilder.append("FAILURE, cause=[");
            stringBuilder.append(executionException222.getCause());
            stringBuilder.append("]");
            return;
            catch (InterruptedException interruptedException) {
                bl2 = true;
                continue;
            }
            break;
        }
    }

    private void a(StringBuilder stringBuilder, @CheckForNull Object object) {
        if (object == null) {
            stringBuilder.append("null");
        } else if (object == this) {
            stringBuilder.append("this future");
        } else {
            stringBuilder.append(object.getClass().getName());
            stringBuilder.append("@");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(object)));
        }
    }

    static /* bridge */ /* synthetic */ boolean h() {
        return e;
    }

    static /* bridge */ /* synthetic */ a i() {
        return g;
    }

    @CheckForNull
    protected final String a() {
        if (this instanceof ScheduledFuture) {
            StringBuilder stringBuilder = new StringBuilder("remaining delay=[");
            stringBuilder.append(((ScheduledFuture)((Object)this)).getDelay(TimeUnit.MILLISECONDS));
            stringBuilder.append(" ms]");
            return stringBuilder.toString();
        }
        return null;
    }

    @CanIgnoreReturnValue
    protected boolean a(Throwable throwable) {
        if (g.a(this, null, (Object)(throwable = new /* Unavailable Anonymous Inner Class!! */))) {
            com.yandex.mobile.ads.impl.e.a(this);
            return true;
        }
        return false;
    }

    @CanIgnoreReturnValue
    protected boolean b(V v14) {
        if (g.a(this, null, v14)) {
            com.yandex.mobile.ads.impl.e.a(this);
            return true;
        }
        return false;
    }

    @Override
    @CanIgnoreReturnValue
    public boolean cancel(boolean bl2) {
        block6: {
            Object object = this.b;
            boolean bl3 = true;
            boolean bl4 = object == null;
            if (bl4 | object instanceof f) {
                Object object2;
                b b10;
                if (e) {
                    b10 = new /* Unavailable Anonymous Inner Class!! */;
                    object2 = object;
                } else {
                    object2 = bl2 ? com.yandex.mobile.ads.impl.e$b.b : com.yandex.mobile.ads.impl.e$b.c;
                    Objects.requireNonNull(object2);
                    b10 = object2;
                    object2 = object;
                }
                do {
                    if (g.a(this, object2, (Object)b10)) {
                        com.yandex.mobile.ads.impl.e.a(this);
                        if (!(object2 instanceof f)) {
                            bl2 = bl3;
                            break block6;
                        }
                        (object2).getClass();
                        throw null;
                    }
                    object = this.b;
                    object2 = object;
                } while (object instanceof f);
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    @CanIgnoreReturnValue
    public V get() throws InterruptedException, ExecutionException {
        if (!Thread.interrupted()) {
            Object object = this.b;
            boolean bl2 = object != null;
            if (bl2 & (object instanceof f ^ true)) {
                return (V)com.yandex.mobile.ads.impl.e.a(object);
            }
            object = this.d;
            if (object != i.c) {
                a a12;
                i i14 = new /* Unavailable Anonymous Inner Class!! */;
                do {
                    a12 = g;
                    a12.a(i14, object);
                    if (a12.a(this, object, i14)) {
                        block6: {
                            do {
                                LockSupport.park(this);
                                if (Thread.interrupted()) break block6;
                            } while (!((bl2 = (object = this.b) != null) & (object instanceof f ^ true)));
                            return (V)com.yandex.mobile.ads.impl.e.a(object);
                        }
                        this.a(i14);
                        throw new InterruptedException();
                    }
                    a12 = this.d;
                    object = a12;
                } while (a12 != i.c);
            }
            object = this.b;
            Objects.requireNonNull(object);
            return (V)com.yandex.mobile.ads.impl.e.a(object);
        }
        throw new InterruptedException();
    }

    @Override
    @CanIgnoreReturnValue
    public V get(long l10, TimeUnit object) throws InterruptedException, TimeoutException, ExecutionException {
        long l11 = ((TimeUnit)((Object)object)).toNanos(l10);
        if (!Thread.interrupted()) {
            CharSequence charSequence;
            String string2;
            long l13;
            long l14;
            boolean bl2;
            Object object2;
            block17: {
                object2 = this.b;
                bl2 = object2 != null;
                if (bl2 & (object2 instanceof f ^ true)) {
                    return (V)com.yandex.mobile.ads.impl.e.a(object2);
                }
                l14 = l11 > 0L ? System.nanoTime() + l11 : 0L;
                l13 = l11;
                if (l11 >= 1000L) {
                    object2 = this.d;
                    if (object2 != i.c) {
                        string2 = new /* Unavailable Anonymous Inner Class!! */;
                        do {
                            charSequence = g;
                            charSequence.a(string2, object2);
                            if (charSequence.a(this, object2, string2)) {
                                block16: {
                                    do {
                                        LockSupport.parkNanos(this, Math.min(l11, 2147483647999999999L));
                                        if (Thread.interrupted()) break block16;
                                        object2 = this.b;
                                        bl2 = object2 != null;
                                        if (bl2 & (object2 instanceof f ^ true)) {
                                            return (V)com.yandex.mobile.ads.impl.e.a(object2);
                                        }
                                        l11 = l13 = l14 - System.nanoTime();
                                    } while (l13 >= 1000L);
                                    this.a(string2);
                                    break block17;
                                }
                                this.a(string2);
                                throw new InterruptedException();
                            }
                            charSequence = this.d;
                            object2 = charSequence;
                        } while (charSequence != i.c);
                    }
                    object = this.b;
                    Objects.requireNonNull(object);
                    return (V)com.yandex.mobile.ads.impl.e.a(object);
                }
            }
            while (l13 > 0L) {
                object2 = this.b;
                bl2 = object2 != null;
                if (bl2 & (object2 instanceof f ^ true)) {
                    return (V)com.yandex.mobile.ads.impl.e.a(object2);
                }
                if (!Thread.interrupted()) {
                    l13 = l14 - System.nanoTime();
                    continue;
                }
                throw new InterruptedException();
            }
            string2 = this.toString();
            charSequence = object.toString();
            object2 = Locale.ROOT;
            String string3 = ((String)charSequence).toLowerCase((Locale)object2);
            charSequence = new StringBuilder("Waited ");
            ((StringBuilder)charSequence).append(l10);
            ((StringBuilder)charSequence).append(" ");
            ((StringBuilder)charSequence).append(object.toString().toLowerCase((Locale)object2));
            charSequence = ((StringBuilder)charSequence).toString();
            object2 = charSequence;
            if (l13 + 1000L < 0L) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)charSequence);
                ((StringBuilder)object2).append(" (plus ");
                object2 = ((StringBuilder)object2).toString();
                l13 = -l13;
                l10 = ((TimeUnit)((Object)object)).convert(l13, TimeUnit.NANOSECONDS);
                long l15 = l10 - 0L;
                long l16 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                bl2 = l16 == false || (l13 -= ((TimeUnit)((Object)object)).toNanos(l10)) > 1000L;
                object = object2;
                if (l16 > 0) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)object2);
                    ((StringBuilder)object).append(l10);
                    ((StringBuilder)object).append(" ");
                    ((StringBuilder)object).append(string3);
                    object = object2 = ((StringBuilder)object).toString();
                    if (bl2) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append((String)object2);
                        ((StringBuilder)object).append(",");
                        object = ((StringBuilder)object).toString();
                    }
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append(" ");
                    object = ((StringBuilder)object2).toString();
                }
                object2 = object;
                if (bl2) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append(l13);
                    ((StringBuilder)object2).append(" nanoseconds ");
                    object2 = ((StringBuilder)object2).toString();
                }
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append("delay)");
                object2 = ((StringBuilder)object).toString();
            }
            if (this.isDone()) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(" but future completed as timeout expired");
                throw new TimeoutException(((StringBuilder)object).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(" for ");
            ((StringBuilder)object).append(string2);
            throw new TimeoutException(((StringBuilder)object).toString());
        }
        throw new InterruptedException();
    }

    @Override
    public boolean isCancelled() {
        return this.b instanceof b;
    }

    @Override
    public boolean isDone() {
        Object object = this.b;
        boolean bl2 = object != null;
        return (object instanceof f ^ true) & bl2;
    }

    /*
     * WARNING - void declaration
     */
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            stringBuilder.append(this.getClass().getSimpleName());
        } else {
            stringBuilder.append(this.getClass().getName());
        }
        stringBuilder.append('@');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append("[status=");
        if (this.isCancelled()) {
            stringBuilder.append("CANCELLED");
        } else if (this.isDone()) {
            this.a(stringBuilder);
        } else {
            int n10 = stringBuilder.length();
            stringBuilder.append("PENDING");
            Object object = this.b;
            if (object instanceof f) {
                block16: {
                    void var2_6;
                    stringBuilder.append(", setFuture=[");
                    (object).getClass();
                    try {
                        stringBuilder.append((Object)null);
                        break block16;
                    }
                    catch (StackOverflowError stackOverflowError) {
                    }
                    catch (RuntimeException runtimeException) {
                        // empty catch block
                    }
                    stringBuilder.append("Exception thrown from implementation: ");
                    stringBuilder.append(var2_6.getClass());
                }
                stringBuilder.append("]");
            } else {
                block17: {
                    try {
                        object = l32.a((String)this.a());
                        break block17;
                    }
                    catch (StackOverflowError stackOverflowError) {
                    }
                    catch (RuntimeException runtimeException) {
                        // empty catch block
                    }
                    StringBuilder stringBuilder2 = new StringBuilder("Exception thrown from implementation: ");
                    stringBuilder2.append(object.getClass());
                    object = stringBuilder2.toString();
                }
                if (object != null) {
                    stringBuilder.append(", info=[");
                    stringBuilder.append((String)object);
                    stringBuilder.append("]");
                }
            }
            if (this.isDone()) {
                stringBuilder.delete(n10, stringBuilder.length());
                this.a(stringBuilder);
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private static final class e
    extends a {
        final AtomicReferenceFieldUpdater<i, Thread> a;
        final AtomicReferenceFieldUpdater<i, i> b;
        final AtomicReferenceFieldUpdater<e, i> c;
        final AtomicReferenceFieldUpdater<e, d> d;
        final AtomicReferenceFieldUpdater<e, Object> e;

        e(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<e, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<e, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<e, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        final void a(i i14, @CheckForNull i i15) {
            this.b.lazySet(i14, i15);
        }

        final void a(i i14, Thread thread) {
            this.a.lazySet(i14, thread);
        }

        final boolean a(e<?> e11, @CheckForNull d d10, d d14) {
            return androidx.concurrent.futures.a.a(this.d, e11, (Object)d10, (Object)d14);
        }

        final boolean a(e<?> e11, @CheckForNull i i14, @CheckForNull i i15) {
            return androidx.concurrent.futures.a.a(this.c, e11, (Object)i14, (Object)i15);
        }

        final boolean a(e<?> e11, @CheckForNull Object object, Object object2) {
            return androidx.concurrent.futures.a.a(this.e, e11, (Object)object, (Object)object2);
        }
    }

    private static final class g
    extends a {
        private g() {
            super(null);
        }

        /* synthetic */ g(js2 js22) {
            this();
        }

        final void a(i i14, @CheckForNull i i15) {
            i14.b = i15;
        }

        final void a(i i14, Thread thread) {
            i14.a = thread;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        final boolean a(e<?> e11, @CheckForNull d d10, d d14) {
            synchronized (e11) {
                Throwable throwable2;
                block4: {
                    try {
                        if (((e)e11).c == d10) {
                            ((e)e11).c = d14;
                            return true;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    return false;
                }
                throw throwable2;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        final boolean a(e<?> e11, @CheckForNull i i14, @CheckForNull i i15) {
            synchronized (e11) {
                Throwable throwable2;
                block4: {
                    try {
                        if (((e)e11).d == i14) {
                            ((e)e11).d = i15;
                            return true;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    return false;
                }
                throw throwable2;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        final boolean a(e<?> e11, @CheckForNull Object object, Object object2) {
            synchronized (e11) {
                Throwable throwable2;
                block4: {
                    try {
                        if (((e)e11).b == object) {
                            ((e)e11).b = object2;
                            return true;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    return false;
                }
                throw throwable2;
            }
        }
    }

    static abstract class h<V>
    extends e<V>
    implements Future {
        h() {
        }

        @Override
        @CanIgnoreReturnValue
        public final boolean cancel(boolean bl2) {
            return super.cancel(bl2);
        }

        @Override
        @CanIgnoreReturnValue
        public V get() throws InterruptedException, ExecutionException {
            return super.get();
        }

        @Override
        @CanIgnoreReturnValue
        public final V get(long l10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return super.get(l10, timeUnit);
        }

        @Override
        public final boolean isCancelled() {
            return ((e)this).b instanceof b;
        }

        @Override
        public final boolean isDone() {
            return super.isDone();
        }
    }
}


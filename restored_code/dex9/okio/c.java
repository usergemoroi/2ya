/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.w
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  okio.b
 *  okio.c$a
 *  okio.g0
 *  okio.j0
 *  okio.l0
 *  okio.m0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.y;
import kotlin.k0;
import okio.b;
import okio.c;
import okio.e;
import okio.g0;
import okio.j0;
import okio.l0;
import okio.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Exception performing whole class analysis ignored.
 */
@Metadata(d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0007\u00a2\u0006\u0004\b#\u0010\bJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\b\f\u0010\bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0001\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014\u00a2\u0006\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006'"}, d2={"Lokio/c;", "Lokio/m0;", "", "now", "remainingNanos", "(J)J", "Lkotlin/k0;", "enter", "()V", "", "exit", "()Z", "timedOut", "Lokio/j0;", "sink", "(Lokio/j0;)Lokio/j0;", "Lokio/l0;", "source", "(Lokio/l0;)Lokio/l0;", "T", "Lkotlin/Function0;", "block", "withTimeout", "(Lkotlin/jvm/functions/a;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "newTimeoutException", "inQueue", "Z", "next", "Lokio/c;", "timeoutAt", "J", "<init>", "Companion", "a", "b", "okio"}, k=1, mv={1, 9, 0})
public class c
extends m0 {
    @NotNull
    public static final a Companion;
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    @NotNull
    private static final Condition condition;
    @Nullable
    private static c head;
    @NotNull
    private static final ReentrantLock lock;
    private boolean inQueue;
    @Nullable
    private c next;
    private long timeoutAt;

    static {
        long l4;
        Companion = new /* Unavailable Anonymous Inner Class!! */;
        Object object = new ReentrantLock();
        lock = object;
        object = ((ReentrantLock)object).newCondition();
        y.i((Object)object, (String)"newCondition(...)");
        condition = object;
        IDLE_TIMEOUT_MILLIS = l4 = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(l4);
    }

    public static final /* synthetic */ Condition access$getCondition$cp() {
        return condition;
    }

    public static final /* synthetic */ c access$getHead$cp() {
        return head;
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_MILLIS$cp() {
        return IDLE_TIMEOUT_MILLIS;
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_NANOS$cp() {
        return IDLE_TIMEOUT_NANOS;
    }

    public static final /* synthetic */ boolean access$getInQueue$p(c c4) {
        return c4.inQueue;
    }

    public static final /* synthetic */ ReentrantLock access$getLock$cp() {
        return lock;
    }

    public static final /* synthetic */ c access$getNext$p(c c4) {
        return c4.next;
    }

    public static final /* synthetic */ long access$remainingNanos(c c4, long l4) {
        return c4.remainingNanos(l4);
    }

    public static final /* synthetic */ void access$setHead$cp(c c4) {
        head = c4;
    }

    public static final /* synthetic */ void access$setInQueue$p(c c4, boolean bl) {
        c4.inQueue = bl;
    }

    public static final /* synthetic */ void access$setNext$p(c c4, c c5) {
        c4.next = c5;
    }

    public static final /* synthetic */ void access$setTimeoutAt$p(c c4, long l4) {
        c4.timeoutAt = l4;
    }

    private final long remainingNanos(long l4) {
        return this.timeoutAt - l4;
    }

    @PublishedApi
    @NotNull
    public final IOException access$newTimeoutException(@Nullable IOException iOException) {
        return this.newTimeoutException(iOException);
    }

    public final void enter() {
        long l4 = this.timeoutNanos();
        boolean bl = this.hasDeadline();
        if (l4 == 0L && !bl) {
            return;
        }
        a.b(Companion, (c)this, (long)l4, (boolean)bl);
    }

    public final boolean exit() {
        return a.a(Companion, (c)this);
    }

    @NotNull
    protected IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @NotNull
    public final j0 sink(@NotNull j0 j02) {
        y.j((Object)j02, (String)"sink");
        return new j0(this, j02){
            final c c;
            final j0 d;
            {
                this.c = c4;
                this.d = j02;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void close() {
                Throwable throwable2222222;
                c c4 = this.c;
                j0 j02 = this.d;
                c4.enter();
                j02.close();
                j02 = k0.a;
                if (c4.exit()) throw c4.access$newTimeoutException(null);
                return;
                {
                    catch (Throwable throwable2222222) {
                    }
                    catch (IOException iOException) {}
                    {
                        IOException iOException;
                        if (!c4.exit()) {
                            throw iOException;
                        }
                        iOException = c4.access$newTimeoutException(iOException);
                        throw iOException;
                    }
                }
                c4.exit();
                throw throwable2222222;
            }

            @NotNull
            public c d() {
                return this.c;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void flush() {
                Throwable throwable2222222;
                c c4 = this.c;
                j0 j02 = this.d;
                c4.enter();
                j02.flush();
                j02 = k0.a;
                if (c4.exit()) throw c4.access$newTimeoutException(null);
                return;
                {
                    catch (Throwable throwable2222222) {
                    }
                    catch (IOException iOException) {}
                    {
                        IOException iOException;
                        if (!c4.exit()) {
                            throw iOException;
                        }
                        iOException = c4.access$newTimeoutException(iOException);
                        throw iOException;
                    }
                }
                c4.exit();
                throw throwable2222222;
            }

            @NotNull
            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("AsyncTimeout.sink(");
                stringBuilder.append(this.d);
                stringBuilder.append(')');
                return stringBuilder.toString();
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void write(@NotNull e e4, long l4) {
                Throwable throwable2222222;
                Object object;
                y.j((Object)e4, (String)"source");
                b.b((long)e4.size(), (long)0L, (long)l4);
                while (true) {
                    long l5;
                    long l6 = 0L;
                    if (l4 <= 0L) return;
                    object = e4.c;
                    y.g((Object)object);
                    while (true) {
                        l5 = l6;
                        if (l6 >= 65536L) break;
                        if ((l6 += (long)(((g0)object).c - ((g0)object).b)) >= l4) {
                            l5 = l4;
                            break;
                        }
                        object = ((g0)object).f;
                        y.g((Object)object);
                    }
                    object = this.c;
                    j0 j02 = this.d;
                    ((c)((Object)object)).enter();
                    j02.write(e4, l5);
                    j02 = k0.a;
                    if (((c)((Object)object)).exit()) throw ((c)((Object)object)).access$newTimeoutException(null);
                    l4 -= l5;
                    continue;
                    {
                        catch (Throwable throwable2222222) {
                            break;
                        }
                        catch (IOException iOException) {}
                        {
                            IOException iOException;
                            if (!((c)((Object)object)).exit()) {
                                throw iOException;
                            }
                            iOException = ((c)((Object)object)).access$newTimeoutException(iOException);
                            throw iOException;
                        }
                    }
                }
                ((c)((Object)object)).exit();
                throw throwable2222222;
            }
        };
    }

    @NotNull
    public final l0 source(@NotNull l0 l02) {
        y.j((Object)l02, (String)"source");
        return new l0(this, l02){
            final c c;
            final l0 d;
            {
                this.c = c4;
                this.d = l02;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void close() {
                Throwable throwable2222222;
                c c4 = this.c;
                l0 l02 = this.d;
                c4.enter();
                l02.close();
                l02 = k0.a;
                if (c4.exit()) throw c4.access$newTimeoutException(null);
                return;
                {
                    catch (Throwable throwable2222222) {
                    }
                    catch (IOException iOException) {}
                    {
                        IOException iOException;
                        if (!c4.exit()) {
                            throw iOException;
                        }
                        iOException = c4.access$newTimeoutException(iOException);
                        throw iOException;
                    }
                }
                c4.exit();
                throw throwable2222222;
            }

            @NotNull
            public c d() {
                return this.c;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public long read(@NotNull e e4, long l4) {
                Throwable throwable2222222;
                y.j((Object)e4, (String)"sink");
                c c4 = this.c;
                l0 l02 = this.d;
                c4.enter();
                l4 = l02.read(e4, l4);
                if (c4.exit()) throw c4.access$newTimeoutException(null);
                return l4;
                {
                    catch (Throwable throwable2222222) {
                    }
                    catch (IOException iOException) {}
                    {
                        IOException iOException;
                        if (!c4.exit()) {
                            throw iOException;
                        }
                        iOException = c4.access$newTimeoutException(iOException);
                        throw iOException;
                    }
                }
                c4.exit();
                throw throwable2222222;
            }

            @NotNull
            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("AsyncTimeout.source(");
                stringBuilder.append(this.d);
                stringBuilder.append(')');
                return stringBuilder.toString();
            }
        };
    }

    protected void timedOut() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final <T> T withTimeout(@NotNull kotlin.jvm.functions.a<? extends T> a4) {
        Throwable throwable2222222;
        block5: {
            y.j(a4, (String)"block");
            this.enter();
            a4 = a4.invoke();
            {
                catch (Throwable throwable2222222) {
                    break block5;
                }
                catch (IOException iOException) {}
                {
                    IOException iOException;
                    if (!this.exit()) {
                        throw iOException;
                    }
                    iOException = this.access$newTimeoutException(iOException);
                    throw iOException;
                }
            }
            w.b((int)1);
            if (this.exit()) throw this.access$newTimeoutException(null);
            w.a((int)1);
            return (T)a4;
        }
        w.b((int)1);
        this.exit();
        w.a((int)1);
        throw throwable2222222;
    }
}


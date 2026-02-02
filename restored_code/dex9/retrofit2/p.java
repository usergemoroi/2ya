/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  javax.annotation.concurrent.GuardedBy
 *  okhttp3.b0
 *  okhttp3.d0
 *  okhttp3.e
 *  okhttp3.e$a
 *  okhttp3.e0
 *  okhttp3.f
 *  okhttp3.x
 *  okio.l0
 *  okio.m0
 *  okio.x
 *  retrofit2.b
 *  retrofit2.d
 *  retrofit2.d0
 *  retrofit2.h
 *  retrofit2.y
 *  retrofit2.z
 */
package retrofit2;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.b0;
import okhttp3.e;
import okhttp3.e0;
import okhttp3.f;
import okio.e;
import okio.g;
import okio.l0;
import okio.m0;
import okio.o;
import okio.x;
import retrofit2.d;
import retrofit2.d0;
import retrofit2.h;
import retrofit2.y;
import retrofit2.z;

final class p<T>
implements retrofit2.b<T> {
    private final y c;
    private final Object[] d;
    private final e.a e;
    private final h<e0, T> f;
    private volatile boolean g;
    @Nullable
    @GuardedBy(value="this")
    private okhttp3.e h;
    @Nullable
    @GuardedBy(value="this")
    private Throwable i;
    @GuardedBy(value="this")
    private boolean j;

    p(y y3, Object[] objectArray, e.a a4, h<e0, T> h4) {
        this.c = y3;
        this.d = objectArray;
        this.e = a4;
        this.f = h4;
    }

    private okhttp3.e b() throws IOException {
        okhttp3.e e4 = this.e.a(this.c.a(this.d));
        if (e4 != null) {
            return e4;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /*
     * WARNING - void declaration
     */
    @GuardedBy(value="this")
    private okhttp3.e c() throws IOException {
        void var1_5;
        Object object = this.h;
        if (object != null) {
            return object;
        }
        object = this.i;
        if (object != null) {
            if (!(object instanceof IOException)) {
                if (object instanceof RuntimeException) {
                    throw (RuntimeException)object;
                }
                throw (Error)object;
            }
            throw (IOException)object;
        }
        try {
            this.h = object = this.b();
            return object;
        }
        catch (IOException iOException) {
        }
        catch (Error error) {
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        d0.s((Throwable)var1_5);
        this.i = var1_5;
        throw var1_5;
    }

    public p<T> a() {
        return new p<T>(this.c, this.d, this.e, this.f);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void cancel() {
        this.g = true;
        // MONITORENTER : this
        okhttp3.e e4 = this.h;
        // MONITOREXIT : this
        if (e4 == null) return;
        e4.cancel();
    }

    z<T> d(okhttp3.d0 object) throws IOException {
        e0 e02 = object.d();
        okhttp3.d0 d02 = object.L().b((e0)new c(e02.contentType(), e02.contentLength())).c();
        int n4 = d02.m();
        if (n4 >= 200 && n4 < 300) {
            if (n4 != 204 && n4 != 205) {
                object = new b(e02);
                try {
                    e02 = z.h((Object)this.f.convert(object), (okhttp3.d0)d02);
                    return e02;
                }
                catch (RuntimeException runtimeException) {
                    ((b)((Object)object)).throwIfCaught();
                    throw runtimeException;
                }
            }
            e02.close();
            return z.h(null, (okhttp3.d0)d02);
        }
        try {
            object = z.c((e0)d0.a((e0)e02), (okhttp3.d0)d02);
            return object;
        }
        finally {
            e02.close();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void enqueue(d<T> var1_1) {
        Objects.requireNonNull(var1_1 /* !! */ , "callback == null");
        synchronized (this) {
            if (this.j) ** GOTO lbl35
            this.j = true;
            var4_3 = this.h;
            var5_4 = this.i;
            var2_5 = var4_3;
            var3_6 = var5_4;
            if (var4_3 != null) ** GOTO lbl25
            var2_5 = var4_3;
            var3_6 = var5_4;
            if (var5_4 != null) ** GOTO lbl25
            {
                catch (Throwable var1_2) {}
            }
            try {
                this.h = var2_5 = this.b();
                var3_6 = var5_4;
                ** GOTO lbl25
            }
            catch (Throwable var3_7) {
                block8: {
                    d0.s((Throwable)var3_7);
                    this.i = var3_7;
                    var2_5 = var4_3;
lbl25:
                    // 4 sources

                    // MONITOREXIT @DISABLED, blocks:[2, 4, 5] lbl24 : MonitorExitStatement: MONITOREXIT : this
                    if (var3_6 == null) break block8;
                    var1_1 /* !! */ .onFailure((retrofit2.b)this, var3_6);
                    return;
                }
                if (this.g) {
                    var2_5.cancel();
                }
                var2_5.enqueue(new f(){
                    final d c;
                    final p d;
                    {
                        this.d = p4;
                        this.c = d4;
                    }

                    private void a(Throwable throwable) {
                        try {
                            this.c.onFailure((retrofit2.b)this.d, throwable);
                        }
                        catch (Throwable throwable2) {
                            d0.s((Throwable)throwable2);
                            throwable2.printStackTrace();
                        }
                    }

                    public void onFailure(okhttp3.e e4, IOException iOException) {
                        this.a(iOException);
                    }

                    public void onResponse(okhttp3.e z3, okhttp3.d0 d02) {
                        try {
                            z3 = this.d.d(d02);
                        }
                        catch (Throwable throwable) {
                            d0.s((Throwable)throwable);
                            this.a(throwable);
                            return;
                        }
                        try {
                            this.c.onResponse((retrofit2.b)this.d, z3);
                        }
                        catch (Throwable throwable) {
                            d0.s((Throwable)throwable);
                            throwable.printStackTrace();
                        }
                    }
                });
                return;
lbl35:
                // 2 sources

                var1_1 /* !! */  = new d<T>("Already executed.");
                throw var1_1 /* !! */ ;
            }
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isCanceled() {
        boolean bl = this.g;
        boolean bl2 = true;
        if (bl) {
            return true;
        }
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    okhttp3.e e4 = this.h;
                    if (e4 == null) return false;
                    if (!e4.isCanceled()) return false;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return bl2;
            }
            throw throwable2;
        }
    }

    public boolean isExecuted() {
        synchronized (this) {
            boolean bl = this.j;
            return bl;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public b0 request() {
        synchronized (this) {
            try {
                try {
                    return this.c().request();
                }
                catch (IOException iOException) {
                    RuntimeException runtimeException = new RuntimeException("Unable to create request.", iOException);
                    throw runtimeException;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public m0 timeout() {
        synchronized (this) {
            try {
                try {
                    return this.c().timeout();
                }
                catch (IOException iOException) {
                    RuntimeException runtimeException = new RuntimeException("Unable to create call.", iOException);
                    throw runtimeException;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    static final class b
    extends e0 {
        private final e0 c;
        private final g d;
        @Nullable
        IOException e;

        b(e0 e02) {
            this.c = e02;
            this.d = x.d((l0)new o(this, e02.source()){
                final b g;
                {
                    this.g = b4;
                    super(l02);
                }

                @Override
                public long read(e e4, long l4) throws IOException {
                    try {
                        l4 = super.read(e4, l4);
                        return l4;
                    }
                    catch (IOException iOException) {
                        this.g.e = iOException;
                        throw iOException;
                    }
                }
            });
        }

        public void close() {
            this.c.close();
        }

        public long contentLength() {
            return this.c.contentLength();
        }

        public okhttp3.x contentType() {
            return this.c.contentType();
        }

        public g source() {
            return this.d;
        }

        void throwIfCaught() throws IOException {
            IOException iOException = this.e;
            if (iOException == null) {
                return;
            }
            throw iOException;
        }
    }

    static final class c
    extends e0 {
        @Nullable
        private final okhttp3.x c;
        private final long d;

        c(@Nullable okhttp3.x x3, long l4) {
            this.c = x3;
            this.d = l4;
        }

        public long contentLength() {
            return this.d;
        }

        public okhttp3.x contentType() {
            return this.c;
        }

        public g source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }
}


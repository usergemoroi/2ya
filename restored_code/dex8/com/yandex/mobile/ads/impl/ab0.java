/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ab0$a
 *  com.yandex.mobile.ads.impl.lv$a
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mv
 *  com.yandex.mobile.ads.impl.pv
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ab0;
import com.yandex.mobile.ads.impl.lv;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mv;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.tj;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * Exception performing whole class analysis ignored.
 */
public final class ab0
extends tj {
    @Nullable
    private RandomAccessFile e;
    @Nullable
    private Uri f;
    private long g;
    private boolean h;

    public ab0() {
        super(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long a(pv pv3) throws c {
        FileNotFoundException fileNotFoundException2;
        int n10;
        Object object;
        block9: {
            long l10;
            Object object2;
            object = pv3.a;
            this.f = object;
            this.b(pv3);
            n10 = 2006;
            try {
                object2 = object.getPath();
                object2.getClass();
                this.e = object2 = new RandomAccessFile((String)object2, "r");
            }
            catch (RuntimeException runtimeException) {
                throw new c(runtimeException, 2000);
            }
            catch (SecurityException securityException) {
                throw new c(securityException, 2006);
            }
            catch (FileNotFoundException fileNotFoundException2) {
                break block9;
            }
            try {
                long l11;
                ((RandomAccessFile)object2).seek(pv3.f);
                l10 = l11 = pv3.g;
                if (l11 == -1L) {
                    l10 = this.e.length() - pv3.f;
                }
            }
            catch (IOException iOException) {
                throw new c(iOException, 2000);
            }
            this.g = l10;
            if (l10 < 0L) throw new c(2008, null, null);
            this.h = true;
            this.c(pv3);
            return this.g;
        }
        if (TextUtils.isEmpty((CharSequence)object.getQuery()) && TextUtils.isEmpty((CharSequence)object.getFragment())) {
            if (m92.a >= 21 && a.b((Throwable)fileNotFoundException2.getCause())) {
                throw new c(fileNotFoundException2, n10);
            }
            n10 = 2005;
            throw new c(fileNotFoundException2, n10);
        }
        String string2 = object.getPath();
        String string3 = object.getQuery();
        String string4 = object.getFragment();
        object = new StringBuilder("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(",query=");
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(",fragment=");
        ((StringBuilder)object).append(string4);
        throw new c(1004, ((StringBuilder)object).toString(), fileNotFoundException2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() throws c {
        Throwable throwable2;
        block7: {
            this.f = null;
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.e = null;
                if (this.h) {
                    this.h = false;
                    this.e();
                }
                return;
            }
            catch (Throwable throwable2) {
                break block7;
            }
            catch (IOException iOException) {}
            {
                c c10 = new c(iOException, 2000);
                throw c10;
            }
        }
        this.e = null;
        if (this.h) {
            this.h = false;
            this.e();
        }
        throw throwable2;
    }

    @Override
    @Nullable
    public final Uri getUri() {
        return this.f;
    }

    public final int read(byte[] byArray, int n10, int n12) throws c {
        block4: {
            if (n12 == 0) {
                return 0;
            }
            long l10 = this.g;
            if (l10 == 0L) {
                return -1;
            }
            try {
                RandomAccessFile randomAccessFile = this.e;
                int n13 = m92.a;
                n10 = randomAccessFile.read(byArray, n10, (int)Math.min(l10, (long)n12));
                if (n10 <= 0) break block4;
            }
            catch (IOException iOException) {
                throw new c(iOException, 2000);
            }
            this.g -= (long)n10;
            this.c(n10);
        }
        return n10;
    }

    public static final class b
    implements lv.a {
        public final lv a() {
            return new ab0();
        }
    }

    public static final class c
    extends mv {
        public c(int n10, @Nullable String string2, @Nullable FileNotFoundException fileNotFoundException) {
            super(n10, string2, (Throwable)fileNotFoundException);
        }

        public c(Exception exception, int n10) {
            super((Throwable)exception, n10);
        }
    }
}


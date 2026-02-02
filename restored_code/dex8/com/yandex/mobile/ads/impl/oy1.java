/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ConditionVariable
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.dm
 *  com.yandex.mobile.ads.impl.dm$a
 *  com.yandex.mobile.ads.impl.dm$b
 *  com.yandex.mobile.ads.impl.fz
 *  com.yandex.mobile.ads.impl.lm
 *  com.yandex.mobile.ads.impl.lv0
 *  com.yandex.mobile.ads.impl.mm
 *  com.yandex.mobile.ads.impl.ny1
 *  com.yandex.mobile.ads.impl.qm
 *  com.yandex.mobile.ads.impl.sr
 *  com.yandex.mobile.ads.impl.um
 *  com.yandex.mobile.ads.impl.vm
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.dm;
import com.yandex.mobile.ads.impl.e60;
import com.yandex.mobile.ads.impl.fz;
import com.yandex.mobile.ads.impl.jr0;
import com.yandex.mobile.ads.impl.km;
import com.yandex.mobile.ads.impl.lm;
import com.yandex.mobile.ads.impl.lv0;
import com.yandex.mobile.ads.impl.mm;
import com.yandex.mobile.ads.impl.ny1;
import com.yandex.mobile.ads.impl.qm;
import com.yandex.mobile.ads.impl.qy1;
import com.yandex.mobile.ads.impl.sr;
import com.yandex.mobile.ads.impl.um;
import com.yandex.mobile.ads.impl.vm;
import com.yandex.mobile.ads.impl.zs0;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public final class oy1
implements dm {
    private static final HashSet<File> j = new HashSet();
    private final File a;
    private final km b;
    private final vm c;
    @Nullable
    private final mm d;
    private final HashMap<String, ArrayList<dm.b>> e;
    private final Random f;
    private final boolean g;
    private long h;
    private dm.a i;

    public oy1(File file, jr0 jr02, @Nullable e60 e602) {
        this(file, jr02, new vm(e602, file), new mm(e602));
    }

    oy1(File file, jr0 object, vm vm3, @Nullable mm mm3) {
        if (oy1.c(file)) {
            this.a = file;
            this.b = object;
            this.c = vm3;
            this.d = mm3;
            this.e = new HashMap();
            this.f = new Random();
            this.g = true;
            this.h = -1L;
            file = new ConditionVariable();
            new ny1(this, (ConditionVariable)file).start();
            file.block();
            return;
        }
        object = new StringBuilder("Another SimpleCache instance uses the folder: ");
        ((StringBuilder)object).append(file);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    static /* bridge */ /* synthetic */ km a(oy1 oy12) {
        return oy12.b;
    }

    private void a(qy1 qy12) {
        this.c.c(qy12.b).a(qy12);
        ArrayList<dm.b> arrayList = this.e.get(qy12.b);
        if (arrayList != null) {
            for (int i14 = arrayList.size() - 1; i14 >= 0; --i14) {
                arrayList.get(i14).a((dm)this, (qm)qy12);
            }
        }
        this.b.a(this, qy12);
    }

    private static void a(File object) throws dm.a {
        if (!((File)object).mkdirs() && !((File)object).isDirectory()) {
            StringBuilder stringBuilder = new StringBuilder("Failed to create cache directory: ");
            stringBuilder.append(object);
            object = stringBuilder.toString();
            zs0.b((String)"SimpleCache", (String)object);
            throw new dm.a((String)object);
        }
    }

    private void a(File object, boolean bl2, @Nullable File[] fileArray, @Nullable HashMap hashMap) {
        if (fileArray != null && fileArray.length != 0) {
            for (File file : fileArray) {
                long l10;
                long l11;
                object = file.getName();
                if (bl2 && ((String)object).indexOf(46) == -1) {
                    this.a(file, false, file.listFiles(), hashMap);
                    continue;
                }
                if (bl2 && (((String)object).startsWith("monetization_cached_content_index.exi") || ((String)object).endsWith(".uid"))) continue;
                object = hashMap != null ? (lm)hashMap.remove(object) : null;
                if (object != null) {
                    l11 = ((lm)object).a;
                    l10 = ((lm)object).b;
                } else {
                    l10 = -9223372036854775807L;
                    l11 = -1L;
                }
                object = qy1.a(file, l11, l10, this.c);
                if (object != null) {
                    this.a((qy1)((Object)object));
                    continue;
                }
                file.delete();
            }
            return;
        }
        if (!bl2) {
            ((File)object).delete();
        }
    }

    private static long b(File comparable) throws IOException {
        long l10 = new SecureRandom().nextLong();
        l10 = l10 == Long.MIN_VALUE ? 0L : Math.abs(l10);
        String string2 = Long.toString(l10, 16);
        Comparable<StringBuilder> comparable2 = new StringBuilder();
        ((StringBuilder)comparable2).append(string2);
        ((StringBuilder)comparable2).append(".uid");
        comparable2 = new File((File)comparable, ((StringBuilder)comparable2).toString());
        if (((File)comparable2).createNewFile()) {
            return l10;
        }
        comparable = new StringBuilder("Failed to create UID file: ");
        ((StringBuilder)comparable).append(comparable2);
        throw new IOException(((StringBuilder)comparable).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b() {
        Throwable throwable2;
        Object object;
        block17: {
            block16: {
                Object object2;
                block15: {
                    long l10;
                    block14: {
                        if (!this.a.exists()) {
                            try {
                                oy1.a(this.a);
                            }
                            catch (dm.a a14) {
                                this.i = a14;
                                return;
                            }
                        }
                        if ((object2 = this.a.listFiles()) == null) {
                            object2 = new StringBuilder("Failed to list cache directory files: ");
                            ((StringBuilder)object2).append(this.a);
                            object2 = ((StringBuilder)object2).toString();
                            zs0.b((String)"SimpleCache", (String)object2);
                            this.i = new dm.a((String)object2);
                            return;
                        }
                        int n10 = ((File[])object2).length;
                        for (int i14 = 0; i14 < n10; ++i14) {
                            object = object2[i14];
                            CharSequence charSequence = ((File)object).getName();
                            if (!((String)charSequence).endsWith(".uid")) continue;
                            try {
                                l10 = Long.parseLong(((String)charSequence).substring(0, ((String)charSequence).indexOf(46)), 16);
                                break block14;
                            }
                            catch (NumberFormatException numberFormatException) {
                                charSequence = new StringBuilder("Malformed UID file: ");
                                ((StringBuilder)charSequence).append(object);
                                zs0.b((String)"SimpleCache", (String)((StringBuilder)charSequence).toString());
                                ((File)object).delete();
                            }
                        }
                        l10 = -1L;
                    }
                    this.h = l10;
                    if (l10 == -1L) {
                        try {
                            this.h = oy1.b(this.a);
                        }
                        catch (IOException iOException) {
                            object = new StringBuilder("Failed to create cache UID: ");
                            ((StringBuilder)object).append(this.a);
                            object = ((StringBuilder)object).toString();
                            zs0.a((String)"SimpleCache", (String)object, (Throwable)iOException);
                            this.i = new dm.a((String)object, (Throwable)iOException);
                            return;
                        }
                    }
                    try {
                        this.c.a(this.h);
                        object = this.d;
                        if (object == null) break block15;
                        object.a(this.h);
                        object = this.d.a();
                        this.a(this.a, true, (File[])object2, (HashMap)object);
                        this.d.a(((HashMap)object).keySet());
                        break block16;
                    }
                    catch (Throwable throwable2) {
                        break block17;
                    }
                }
                this.a(this.a, true, (File[])object2, null);
            }
            this.c.b();
            try {
                this.c.c();
                return;
            }
            catch (Throwable throwable3) {
                zs0.a((String)"SimpleCache", (String)"Storing index file failed", (Throwable)throwable3);
            }
            return;
        }
        object = new StringBuilder("Failed to initialize cache indices: ");
        ((StringBuilder)object).append(this.a);
        object = ((StringBuilder)object).toString();
        zs0.a((String)"SimpleCache", (String)object, (Throwable)throwable2);
        this.i = new dm.a((String)object, throwable2);
    }

    static /* bridge */ /* synthetic */ void b(oy1 oy12) {
        oy12.b();
    }

    private void c() {
        ArrayList<qm> arrayList = new ArrayList<qm>();
        Iterator iterator = this.c.a().iterator();
        while (iterator.hasNext()) {
            for (qm qm3 : ((um)iterator.next()).b()) {
                if (qm3.f.length() == qm3.d) continue;
                arrayList.add(qm3);
            }
        }
        for (int i14 = 0; i14 < arrayList.size(); ++i14) {
            this.c((qm)arrayList.get(i14));
        }
    }

    private void c(qm qm3) {
        Object object = this.c.a(qm3.b);
        if (object != null && object.a(qm3)) {
            if (this.d != null) {
                String string2 = qm3.f.getName();
                try {
                    this.d.a(string2);
                }
                catch (IOException iOException) {
                    lv0.a((String)"Failed to remove file index entry for: ", (String)string2, (String)"SimpleCache");
                }
            }
            this.c.d(((um)object).b);
            object = this.e.get(qm3.b);
            if (object != null) {
                for (int i14 = ((ArrayList)object).size() - 1; i14 >= 0; --i14) {
                    ((dm.b)((ArrayList)object).get(i14)).a(qm3);
                }
            }
            this.b.a(qm3);
        }
    }

    private static boolean c(File file) {
        synchronized (oy1.class) {
            boolean bl2 = j.add(file.getAbsoluteFile());
            return bl2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final File a(String object, long l10, long l11) throws dm.a {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object2;
                block5: {
                    try {
                        this.a();
                        object2 = this.c.a((String)object);
                        object2.getClass();
                        if (!object2.c(l10, l11)) {
                            object = new IllegalStateException();
                            throw object;
                        }
                        if (this.a.exists()) break block5;
                        oy1.a(this.a);
                        this.c();
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                this.b.a(this, l11);
                object = new File(this.a, Integer.toString(this.f.nextInt(10)));
                if (!((File)object).exists()) {
                    oy1.a((File)object);
                }
                l11 = System.currentTimeMillis();
                int n10 = ((um)object2).a;
                int n13 = qy1.k;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(n10);
                ((StringBuilder)object2).append(".");
                ((StringBuilder)object2).append(l10);
                ((StringBuilder)object2).append(".");
                ((StringBuilder)object2).append(l11);
                ((StringBuilder)object2).append(".v3.exo");
                return new File((File)object, ((StringBuilder)object2).toString());
            }
            throw throwable2;
        }
    }

    public final void a() throws dm.a {
        synchronized (this) {
            dm.a a14;
            block4: {
                a14 = this.i;
                if (a14 != null) break block4;
                return;
            }
            throw a14;
        }
    }

    public final void a(qm qm3) {
        synchronized (this) {
            this.c(qm3);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(File var1_1, long var2_4) throws dm.a {
        synchronized (this) {
            block12: {
                block13: {
                    block11: {
                        try {
                            var4_5 = var1_1 /* !! */ .exists();
                            if (var4_5) break block11;
                        }
                        catch (Throwable var1_2) {
                            break block12;
                        }
                        return;
                    }
                    if (var2_4 != 0L) break block13;
                    var1_1 /* !! */ .delete();
                    return;
                }
                var5_6 /* !! */  = qy1.a((File)var1_1 /* !! */ , var2_4, -9223372036854775807L, this.c);
                var5_6 /* !! */ .getClass();
                var6_8 = this.c.a(var5_6 /* !! */ .b);
                var6_8.getClass();
                if (!var6_8.c(var5_6 /* !! */ .c, var5_6 /* !! */ .d)) ** GOTO lbl43
                var2_4 = var6_8.a().b();
                if (var2_4 != -1L && var5_6 /* !! */ .c + var5_6 /* !! */ .d > var2_4) {
                    var1_1 /* !! */  = new IllegalStateException();
                    throw var1_1 /* !! */ ;
                }
                if (this.d != null) {
                    var1_1 /* !! */  = var1_1 /* !! */ .getName();
                    try {
                        this.d.a((String)var1_1 /* !! */ , var5_6 /* !! */ .d, var5_6 /* !! */ .g);
                    }
                    catch (IOException var1_3) {
                        var5_6 /* !! */  = new dm.a((Throwable)var1_3);
                        throw var5_6 /* !! */ ;
                    }
                }
                this.a(var5_6 /* !! */ );
                this.c.c();
                {
                    catch (Throwable var5_7) {
                        var1_1 /* !! */  = new dm.a(var5_7);
                        throw var1_1 /* !! */ ;
                    }
                    this.notifyAll();
                    return;
lbl43:
                    // 1 sources

                    var1_1 /* !! */  = new IllegalStateException();
                    throw var1_1 /* !! */ ;
                }
            }
            throw var1_2;
        }
    }

    public final void a(String object) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    object = this.c((String)object).iterator();
                    while (object.hasNext()) {
                        this.c((qm)object.next());
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string2, sr object) throws dm.a {
        synchronized (this) {
            dm.a a14;
            this.a();
            this.c.a(string2, (sr)a14);
            try {
                this.c.c();
                return;
            }
            catch (Throwable throwable) {
                a14 = new dm.a(throwable);
                throw a14;
            }
        }
    }

    public final long b(String string2, long l10, long l11) {
        synchronized (this) {
            l11 = l11 == -1L ? Long.MAX_VALUE : l10 + l11;
            if (l11 < 0L) {
                l11 = Long.MAX_VALUE;
            }
            long l13 = 0L;
            while (l10 < l11) {
                long l14;
                block5: {
                    l14 = this.d(string2, l10, l11 - l10);
                    if (l14 <= 0L) break block5;
                    l13 += l14;
                }
                l14 = -l14;
                l10 += l14;
            }
            return l13;
        }
    }

    public final fz b(String string2) {
        synchronized (this) {
            string2 = this.c.b(string2);
            return string2;
        }
    }

    public final void b(qm qm3) {
        synchronized (this) {
            um um2 = this.c.a(qm3.b);
            um2.getClass();
            um2.a(qm3.c);
            this.c.d(um2.b);
            this.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final qm c(String object, long l10, long l11) throws dm.a {
        synchronized (this) {
            Throwable throwable2;
            Object object2;
            block14: {
                block15: {
                    try {
                        boolean bl2;
                        this.a();
                        Object object3 = this.c.a(object);
                        if (object3 == null) {
                            object2 = qy1.a(object, l10, l11);
                        } else {
                            while (true) {
                                object2 = object3.b(l10, l11);
                                if (!object2.e || object2.f.length() == object2.d) break;
                                this.c();
                            }
                        }
                        if (!object2.e) break block14;
                        if (!this.g) break block15;
                        object3 = object2.f;
                        object3.getClass();
                        object3 = ((File)object3).getName();
                        l10 = object2.d;
                        l11 = System.currentTimeMillis();
                        mm mm3 = this.d;
                        if (mm3 != null) {
                            try {
                                mm3.a((String)object3, l10, l11);
                            }
                            catch (IOException iOException) {
                                zs0.d((String)"SimpleCache", (String)"Failed to update index with new touch timestamp.");
                            }
                            bl2 = false;
                        } else {
                            bl2 = true;
                        }
                        object = this.c.a(object).a(object2, l11, bl2);
                        object3 = this.e.get(object2.b);
                        if (object3 != null) {
                            for (int i14 = ((ArrayList)object3).size() - 1; i14 >= 0; --i14) {
                                ((dm.b)((ArrayList)object3).get(i14)).a((dm)this, (qm)object2, (qm)object);
                            }
                        }
                        this.b.a(this, (qm)object2, (qm)object);
                        return object;
                    }
                    catch (Throwable throwable2) {}
                }
                return object2;
            }
            boolean bl3 = this.c.c(object).d(l10, object2.d);
            // MONITOREXIT @DISABLED, blocks:[3, 4] lbl43 : MonitorExitStatement: MONITOREXIT : this
            if (!bl3) return null;
            return object2;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final TreeSet c(String treeSet) {
        synchronized (this) {
            try {
                treeSet = this.c.a((String)((Object)treeSet));
                if (treeSet == null) return new TreeSet();
                if (!treeSet.c()) return new TreeSet(treeSet.b());
                return new TreeSet();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final long d(String string2, long l10, long l11) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block6: {
                    long l13;
                    block5: {
                        l13 = l11;
                        if (l11 == -1L) {
                            l13 = Long.MAX_VALUE;
                        }
                        try {
                            string2 = this.c.a(string2);
                            if (string2 == null) break block5;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                        l10 = string2.a(l10, l13);
                        break block6;
                    }
                    l10 = -l13;
                }
                return l10;
            }
            throw throwable2;
        }
    }

    public final qm e(String string2, long l10, long l11) throws InterruptedException, dm.a {
        synchronized (this) {
            qm qm3;
            this.a();
            while (true) {
                if ((qm3 = this.c(string2, l10, l11)) == null) break block5;
                break;
            }
            {
                block5: {
                    return qm3;
                }
                this.wait();
                continue;
            }
        }
    }
}


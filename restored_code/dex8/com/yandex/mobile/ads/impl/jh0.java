/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.cm
 *  com.yandex.mobile.ads.impl.f60$a
 *  com.yandex.mobile.ads.impl.f60$d
 *  com.yandex.mobile.ads.impl.lv$a
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.nv
 *  com.yandex.mobile.ads.impl.pv
 *  com.yandex.mobile.ads.impl.pv$a
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.vv0
 *  com.yandex.mobile.ads.impl.wv0
 *  com.yandex.mobile.ads.impl.yj0
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.cm;
import com.yandex.mobile.ads.impl.eh0;
import com.yandex.mobile.ads.impl.f60;
import com.yandex.mobile.ads.impl.lv;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.nv;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.qz;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.v22;
import com.yandex.mobile.ads.impl.vv0;
import com.yandex.mobile.ads.impl.wv0;
import com.yandex.mobile.ads.impl.yj0;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class jh0
implements vv0 {
    private final lv.a a;
    @Nullable
    private final String b;
    private final boolean c;
    private final HashMap d;

    public jh0(@Nullable String string2, boolean bl2, qz.a a13) {
        boolean bl3 = !bl2 || !TextUtils.isEmpty((CharSequence)string2);
        uf.a((boolean)bl3);
        this.a = a13;
        this.b = string2;
        this.c = bl2;
        this.d = new HashMap();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static byte[] a(lv.a object, String object2, @Nullable byte[] object3, Map<String, String> nv3) throws wv0 {
        Throwable throwable222;
        v22 v222;
        block13: {
            eh0 eh022;
            v222 = new v22(object.a());
            object3 = new pv.a().b((String)object2).a((Map)nv3).b().a(object3).a(1).a();
            int n10 = 0;
            object = object3;
            while (true) {
                nv3 = new nv(v222, (pv)object);
                int n13 = m92.a;
                object2 = new byte[4096];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while ((n13 = nv3.read((byte[])object2)) != -1) {
                    byteArrayOutputStream.write((byte[])object2, 0, n13);
                }
                object2 = byteArrayOutputStream.toByteArray();
                m92.a((Closeable)nv3);
                return object2;
        // Removed invalid catch block
                }
        // Removed invalid catch block
                object2 = (n13 == 307 || n13 == 308) && n10 < 5 && (object2 = eh022.f) != null && (object2 = (List)object2.get("Location")) != null && !object2.isEmpty() ? (String)object2.get(0) : null;
                if (object2 == null) break;
                ++n10;
                {
                    object = object.a().b((String)object2).a();
                }
                m92.a((Closeable)nv3);
                continue;
                break;
            }
            {
                throw eh022;
            }
        }
        try {
            m92.a((Closeable)nv3);
            throw throwable222;
        }
        catch (Exception exception) {}
        object = v222.f();
        object.getClass();
        throw new wv0((pv)object3, (Uri)object, v222.getResponseHeaders(), v222.e(), exception);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string2, String string3) {
        string2.getClass();
        string3.getClass();
        HashMap hashMap = this.d;
        synchronized (hashMap) {
            this.d.put(string2, string3);
            return;
        }
    }

    public final byte[] a(f60.d object) throws wv0 {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object.b());
        stringBuilder.append("&signedRequest=");
        stringBuilder.append(m92.a((byte[])object.a()));
        object = stringBuilder.toString();
        return jh0.a(this.a, (String)object, null, Collections.<String, String>emptyMap());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] a(UUID serializable, f60.a a13) throws wv0 {
        String string2;
        String string3;
        block9: {
            block8: {
                string3 = a13.b();
                if (this.c) break block8;
                string2 = string3;
                if (!TextUtils.isEmpty((CharSequence)string3)) break block9;
            }
            string2 = this.b;
        }
        if (TextUtils.isEmpty((CharSequence)string2)) {
            serializable = new pv.a();
            a13 = Uri.EMPTY;
            throw new wv0(serializable.a((Uri)a13).a(), (Uri)a13, (Map)yj0.g(), 0L, (Exception)new IllegalStateException("No license URL"));
        }
        HashMap<String, String> hashMap = new HashMap<String, String>();
        UUID uUID = cm.e;
        string3 = uUID.equals(serializable) ? "text/xml" : (cm.c.equals(serializable) ? "application/json" : "application/octet-stream");
        hashMap.put("Content-Type", string3);
        if (uUID.equals(serializable)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        serializable = this.d;
        synchronized (serializable) {
            hashMap.putAll(this.d);
            return jh0.a(this.a, string2, a13.a(), hashMap);
        }
    }
}


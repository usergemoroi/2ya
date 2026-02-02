/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.media.DeniedByServerException
 *  android.media.MediaCrypto
 *  android.media.MediaCryptoException
 *  android.media.MediaDrm
 *  android.media.MediaDrm$OnEventListener
 *  android.media.MediaDrm$ProvisionRequest
 *  android.media.MediaDrmException
 *  android.media.NotProvisionedException
 *  android.media.UnsupportedSchemeException
 *  android.text.TextUtils
 *  android.util.Base64
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  com.yandex.mobile.ads.impl.ao
 *  com.yandex.mobile.ads.impl.b03
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.cm
 *  com.yandex.mobile.ads.impl.dn1
 *  com.yandex.mobile.ads.impl.f60
 *  com.yandex.mobile.ads.impl.f60$a
 *  com.yandex.mobile.ads.impl.f60$b
 *  com.yandex.mobile.ads.impl.f60$c
 *  com.yandex.mobile.ads.impl.f60$d
 *  com.yandex.mobile.ads.impl.lc0$a
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mc0
 *  com.yandex.mobile.ads.impl.mi1
 *  com.yandex.mobile.ads.impl.rm1
 *  com.yandex.mobile.ads.impl.s82
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.uu
 *  com.yandex.mobile.ads.impl.vn
 *  com.yandex.mobile.ads.impl.y30$b
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.ao;
import com.yandex.mobile.ads.impl.b03;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.c03;
import com.yandex.mobile.ads.impl.cm;
import com.yandex.mobile.ads.impl.dn1;
import com.yandex.mobile.ads.impl.f60;
import com.yandex.mobile.ads.impl.i40;
import com.yandex.mobile.ads.impl.kc0;
import com.yandex.mobile.ads.impl.kz;
import com.yandex.mobile.ads.impl.lc0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mc0;
import com.yandex.mobile.ads.impl.mi1;
import com.yandex.mobile.ads.impl.rm1;
import com.yandex.mobile.ads.impl.s82;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.uu;
import com.yandex.mobile.ads.impl.vn;
import com.yandex.mobile.ads.impl.y30;
import com.yandex.mobile.ads.impl.zs0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.text.d;

/*
 * Exception performing whole class analysis ignored.
 */
@RequiresApi(value=18)
public final class lc0
implements f60 {
    private static final mc0 d = rm1.b();
    public static final f60.c e = new c03();
    private final UUID a;
    private final MediaDrm b;
    private int c;

    private lc0(UUID uUID) throws UnsupportedSchemeException {
        MediaDrm mediaDrm;
        uf.a((Object)uUID);
        uf.a((String)"Use C.CLEARKEY_UUID instead", (boolean)(cm.b.equals(uUID) ^ true));
        this.a = uUID;
        this.b = mediaDrm = new MediaDrm(lc0.a(uUID));
        this.c = 1;
        if (cm.d.equals(uUID) && lc0.d()) {
            lc0.a(mediaDrm);
        }
    }

    private static UUID a(UUID uUID) {
        UUID uUID2 = uUID;
        if (m92.a < 27) {
            uUID2 = uUID;
            if (cm.c.equals(uUID)) {
                uUID2 = cm.b;
            }
        }
        return uUID2;
    }

    private static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private void a(f60.b b10, MediaDrm mediaDrm, byte[] byArray, int n10, int n13, byte[] byArray2) {
        b10 = ((kz.b)b10).a.y;
        b10.getClass();
        b10.obtainMessage(n10, (Object)byArray).sendToTarget();
    }

    private static /* synthetic */ f60 b(UUID uUID) {
        try {
            lc0 lc02 = lc0.c(uUID);
            return lc02;
        }
        catch (s82 s822) {
            StringBuilder stringBuilder = new StringBuilder("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            stringBuilder.append(uUID);
            stringBuilder.append(".");
            zs0.b((String)"FrameworkMediaDrm", (String)stringBuilder.toString());
            return new i40();
        }
    }

    public static lc0 c(UUID object) throws s82 {
        UnsupportedSchemeException unsupportedSchemeException2;
        block3: {
            try {
                object = new lc0((UUID)object);
                return object;
            }
            catch (Exception exception) {
            }
            catch (UnsupportedSchemeException unsupportedSchemeException2) {
                break block3;
            }
            throw new s82(exception);
        }
        throw new s82((Exception)((Object)unsupportedSchemeException2));
    }

    public static /* synthetic */ f60 d(UUID uUID) {
        return lc0.b(uUID);
    }

    private static boolean d() {
        return d.a().equals(m92.d);
    }

    public static /* synthetic */ void e(lc0 lc02, f60.b b10, MediaDrm mediaDrm, byte[] byArray, int n10, int n13, byte[] byArray2) {
        lc02.a(b10, mediaDrm, byArray, n10, n13, byArray2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @SuppressLint(value={"WrongConstant"})
    public final f60.a a(byte[] object, @Nullable List<y30.b> object2, int n10, @Nullable HashMap<String, String> object3) throws NotProvisionedException {
        void var1_5;
        byte[] byArray;
        Object object4;
        void var3_14;
        Object object5;
        Object object6;
        block34: {
            block37: {
                Comparable<UUID> comparable;
                void var2_11;
                Object object7;
                int n13;
                block36: {
                    block35: {
                        Object object8;
                        int n14;
                        int n15;
                        block31: {
                            void var2_6;
                            block30: {
                                block32: {
                                    block33: {
                                        if (var2_6 == null) break block32;
                                        object6 = this.a;
                                        if (cm.d.equals(object6)) break block33;
                                        y30.b b10 = (y30.b)var2_6.get(0);
                                        break block31;
                                    }
                                    if (m92.a < 28 || var2_6.size() <= 1) break block30;
                                    object6 = (y30.b)var2_6.get(0);
                                    n13 = 0;
                                    for (n15 = 0; n15 < var2_6.size(); n13 += ((Object)object5).length, ++n15) {
                                        object7 = (y30.b)var2_6.get(n15);
                                        object5 = ((y30.b)object7).f;
                                        object5.getClass();
                                        if (m92.a((Object)((y30.b)object7).e, (Object)((y30.b)object6).e) && m92.a((Object)((y30.b)object7).d, (Object)((y30.b)object6).d) && dn1.a((byte[])object5)) {
                                            continue;
                                        }
                                        break block30;
                                    }
                                    object5 = new byte[n13];
                                    n13 = 0;
                                    for (n15 = 0; n15 < var2_6.size(); n13 += n14, ++n15) {
                                        object7 = ((y30.b)var2_6.get((int)n15)).f;
                                        object7.getClass();
                                        n14 = ((Object)object7).length;
                                        System.arraycopy(object7, 0, object5, n13, n14);
                                    }
                                    y30.b b11 = new y30.b(((y30.b)object6).c, ((y30.b)object6).d, ((y30.b)object6).e, (byte[])object5);
                                    break block31;
                                }
                                Object var2_12 = null;
                                object6 = null;
                                object5 = null;
                                break block34;
                            }
                            for (n13 = 0; n13 < var2_6.size(); ++n13) {
                                object6 = (y30.b)var2_6.get(n13);
                                object5 = ((y30.b)object6).f;
                                object5.getClass();
                                n14 = dn1.d((byte[])object5);
                                n15 = m92.a;
                                if ((n15 >= 23 || n14 != 0) && (n15 < 23 || n14 != 1)) continue;
                                Object object9 = object6;
                                break block31;
                            }
                            y30.b b14 = (y30.b)var2_6.get(0);
                        }
                        object7 = this.a;
                        object6 = var2_11.f;
                        object6.getClass();
                        comparable = cm.e;
                        object5 = object6;
                        if (((UUID)comparable).equals(object7)) {
                            object5 = dn1.a((UUID)object7, (byte[])object6);
                            if (object5 != null) {
                                object6 = object5;
                            }
                            object8 = new bg1((byte[])object6);
                            n14 = object8.k();
                            n13 = object8.m();
                            n15 = object8.m();
                            if (n13 == 1 && n15 == 1) {
                                int n16 = object8.m();
                                if (!((String)(object8 = object8.a(n16, (Charset)(object5 = vn.d)))).contains("<LA_URL>")) {
                                    n16 = ((String)object8).indexOf("</DATA>");
                                    if (n16 == -1) {
                                        zs0.d((String)"FrameworkMediaDrm", (String)"Could not find the </DATA> tag. Skipping LA_URL workaround.");
                                    }
                                    object6 = new StringBuilder();
                                    ((StringBuilder)object6).append(((String)object8).substring(0, n16));
                                    ((StringBuilder)object6).append("<LA_URL>https://x</LA_URL>");
                                    ((StringBuilder)object6).append(((String)object8).substring(n16));
                                    object8 = ((StringBuilder)object6).toString();
                                    object6 = ByteBuffer.allocate(n14 += 52);
                                    ((ByteBuffer)object6).order(ByteOrder.LITTLE_ENDIAN);
                                    ((ByteBuffer)object6).putInt(n14);
                                    ((ByteBuffer)object6).putShort((short)n13);
                                    ((ByteBuffer)object6).putShort((short)n15);
                                    ((ByteBuffer)object6).putShort((short)(((String)object8).length() * 2));
                                    ((ByteBuffer)object6).put(((String)object8).getBytes((Charset)object5));
                                    object6 = ((ByteBuffer)object6).array();
                                }
                            } else {
                                zs0.c((String)"FrameworkMediaDrm", (String)"Unexpected record count or type. Skipping LA_URL workaround.");
                            }
                            n13 = object6 != null ? ((Object)object6).length : 0;
                            object5 = ByteBuffer.allocate(n13 += 32);
                            ((ByteBuffer)object5).putInt(n13);
                            ((ByteBuffer)object5).putInt(1886614376);
                            ((ByteBuffer)object5).putInt(0);
                            ((ByteBuffer)object5).putLong(((UUID)comparable).getMostSignificantBits());
                            ((ByteBuffer)object5).putLong(((UUID)comparable).getLeastSignificantBits());
                            if (object6 != null && ((Object)object6).length != 0) {
                                ((ByteBuffer)object5).putInt(((Object)object6).length);
                                ((ByteBuffer)object5).put((byte[])object6);
                            }
                            object5 = ((ByteBuffer)object5).array();
                        }
                        if ((n13 = m92.a) < 23 && cm.d.equals(object7)) break block35;
                        object6 = object5;
                        if (!((UUID)comparable).equals(object7)) break block36;
                        d.getClass();
                        object8 = Base64.decode((String)"QW1hem9u", (int)0);
                        comparable = kotlin.text.d.b;
                        object6 = object5;
                        if (!new String((byte[])object8, (Charset)comparable).equals(m92.c)) break block36;
                        object6 = new String(Base64.decode((String)"QUZUQg==", (int)0), (Charset)comparable);
                        if (((String)object6).equals(object8 = m92.d) || new String(Base64.decode((String)"QUZUUw==", (int)0), (Charset)comparable).equals(object8) || new String(Base64.decode((String)"QUZUTQ==", (int)0), (Charset)comparable).equals(object8)) break block35;
                        object6 = object5;
                        if (!new String(Base64.decode((String)"QUZUVA==", (int)0), (Charset)comparable).equals(object8)) break block36;
                    }
                    object7 = dn1.a((UUID)object7, (byte[])object5);
                    object6 = object5;
                    if (object7 != null) {
                        object6 = object7;
                    }
                }
                comparable = this.a;
                object5 = object7 = var2_11.e;
                if (n13 >= 26) break block34;
                object5 = object7;
                if (!cm.c.equals(comparable)) break block34;
                if ("video/mp4".equals(object7)) break block37;
                object5 = object7;
                if (!"audio/mp4".equals(object7)) break block34;
            }
            object5 = "cenc";
        }
        object5 = this.b.getKeyRequest(object, (byte[])object6, object5, (int)var3_14, (HashMap)object4);
        object6 = this.a;
        object4 = byArray = object5.getData();
        if (cm.c.equals(object6)) {
            if (m92.a >= 27) {
                object4 = byArray;
            } else {
                object4 = vn.c;
                object4 = new String(byArray, (Charset)object4).replace('+', '-').replace('/', '_').getBytes((Charset)object4);
            }
        }
        Object object10 = object6 = object5.getDefaultUrl();
        if ("https://x".equals(object6)) {
            String string2 = "";
        }
        object6 = var1_5;
        if (TextUtils.isEmpty((CharSequence)var1_5)) {
            void var2_13;
            object6 = var1_5;
            if (var2_13 != null) {
                object6 = var1_5;
                if (!TextUtils.isEmpty((CharSequence)var2_13.d)) {
                    object6 = var2_13.d;
                }
            }
        }
        if (m92.a >= 23) {
            object5.getRequestType();
        }
        return new f60.a((String)object6, object4);
    }

    public final f60.d a() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        byte[] byArray = provisionRequest.getData();
        return new f60.d(provisionRequest.getDefaultUrl(), byArray);
    }

    public final Map<String, String> a(byte[] byArray) {
        return this.b.queryKeyStatus(byArray);
    }

    public final void a(@Nullable f60.b b10) {
        this.b.setOnEventListener((MediaDrm.OnEventListener)new b03(this, b10));
    }

    public final void a(byte[] byArray, mi1 mi12) {
        if (m92.a >= 31) {
            try {
                com.yandex.mobile.ads.impl.lc0$a.a((MediaDrm)this.b, (byte[])byArray, (mi1)mi12);
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                zs0.d((String)"FrameworkMediaDrm", (String)"setLogSessionId failed.");
            }
        }
    }

    public final void a(byte[] byArray, byte[] byArray2) {
        this.b.restoreKeys(byArray, byArray2);
    }

    public final boolean a(String string2, byte[] object) {
        if (m92.a >= 31) {
            return com.yandex.mobile.ads.impl.lc0$a.a((MediaDrm)this.b, (String)string2);
        }
        try {
            object = new MediaCrypto(this.a, object);
        }
        catch (MediaCryptoException mediaCryptoException) {
            return true;
        }
        try {
            boolean bl2 = object.requiresSecureDecoderComponent(string2);
            return bl2;
        }
        finally {
            object.release();
        }
    }

    public final int b() {
        return 2;
    }

    public final void b(byte[] byArray) {
        this.b.closeSession(byArray);
    }

    @Nullable
    public final byte[] b(byte[] byArray, byte[] byArray2) throws NotProvisionedException, DeniedByServerException {
        byte[] byArray3 = byArray2;
        if (cm.c.equals(this.a)) {
            byArray3 = ao.a((byte[])byArray2);
        }
        return this.b.provideKeyResponse(byArray, byArray3);
    }

    public final void c(byte[] byArray) throws DeniedByServerException {
        this.b.provideProvisionResponse(byArray);
    }

    public final byte[] c() throws MediaDrmException {
        return this.b.openSession();
    }

    public final uu d(byte[] byArray) throws MediaCryptoException {
        boolean bl2 = m92.a < 21 && cm.d.equals(this.a) && "L3".equals(this.b.getPropertyString("securityLevel"));
        return new kc0(lc0.a(this.a), byArray, bl2);
    }

    public final void release() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        int n10;
                        this.c = n10 = this.c - 1;
                        if (n10 != 0) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.b.release();
                }
                return;
            }
            throw throwable2;
        }
    }
}


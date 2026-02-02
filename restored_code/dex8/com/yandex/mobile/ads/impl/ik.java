/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.r72
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.r72;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ik
implements r72 {
    @NotNull
    private final LinkedHashMap a;

    public ik(X509Certificate ... x509CertificateArray) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArray) {
            Object v14;
            X500Principal x500Principal = x509Certificate.getSubjectX500Principal();
            Object object = v14 = linkedHashMap.get(x500Principal);
            if (v14 == null) {
                object = new LinkedHashSet();
                linkedHashMap.put(x500Principal, object);
            }
            ((Set)object).add(x509Certificate);
        }
        this.a = linkedHashMap;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public final X509Certificate a(@NotNull X509Certificate x509Certificate) {
        Object object = x509Certificate.getIssuerX500Principal();
        object = (Set)this.a.get(object);
        Object var3_4 = null;
        if (object == null) {
            return null;
        }
        Iterator iterator = object.iterator();
        while (true) {
            object = var3_4;
            if (!iterator.hasNext()) return (X509Certificate)object;
            object = iterator.next();
            X509Certificate x509Certificate2 = (X509Certificate)object;
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
            }
            catch (Exception exception) {
                continue;
            }
            return (X509Certificate)object;
        }
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object == this || object instanceof ik && y.e(((ik)object).a, this.a);
        return bl2;
    }

    public final int hashCode() {
        return ((Object)this.a).hashCode();
    }
}


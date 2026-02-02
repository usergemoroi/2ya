/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okhttp3.internal.tls.e
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okhttp3.internal.tls.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0014\"\u00020\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\f\u0010\rR&\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0018"}, d2={"Lokhttp3/internal/tls/b;", "Lokhttp3/internal/tls/e;", "Ljava/security/cert/X509Certificate;", "cert", "findByIssuerAndSignature", "(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "Ljavax/security/auth/x500/X500Principal;", "", "a", "Ljava/util/Map;", "subjectToCaCerts", "", "caCerts", "<init>", "([Ljava/security/cert/X509Certificate;)V", "okhttp"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nBasicTrustRootIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTrustRootIndex.kt\nokhttp3/internal/tls/BasicTrustRootIndex\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n372#2,7:57\n288#3,2:64\n*S KotlinDebug\n*F\n+ 1 BasicTrustRootIndex.kt\nokhttp3/internal/tls/BasicTrustRootIndex\n*L\n28#1:57,7\n37#1:64,2\n*E\n"})
public final class b
implements e {
    @NotNull
    private final Map<X500Principal, Set<X509Certificate>> a;

    public b(X509Certificate ... x509CertificateArray) {
        y.j((Object)x509CertificateArray, (String)"caCerts");
        LinkedHashMap<X500Principal, Set<X509Certificate>> linkedHashMap = new LinkedHashMap<X500Principal, Set<X509Certificate>>();
        for (X509Certificate x509Certificate : x509CertificateArray) {
            Object v3;
            X500Principal x500Principal = x509Certificate.getSubjectX500Principal();
            y.i((Object)x500Principal, (String)"caCert.subjectX500Principal");
            Object object = v3 = linkedHashMap.get(x500Principal);
            if (v3 == null) {
                object = new LinkedHashSet();
                linkedHashMap.put(x500Principal, (Set<X509Certificate>)object);
            }
            ((Set)object).add(x509Certificate);
        }
        this.a = linkedHashMap;
    }

    public boolean equals(@Nullable Object object) {
        boolean bl = object == this || object instanceof b && y.e(((b)object).a, this.a);
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public X509Certificate findByIssuerAndSignature(@NotNull X509Certificate x509Certificate) {
        y.j((Object)x509Certificate, (String)"cert");
        Object object = x509Certificate.getIssuerX500Principal();
        object = this.a.get(object);
        Object var3_4 = null;
        if (object == null) {
            return null;
        }
        Iterator iterator = ((Iterable)object).iterator();
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

    public int hashCode() {
        return ((Object)this.a).hashCode();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  okhttp3.internal.tls.a$a
 *  okhttp3.internal.tls.c
 *  okhttp3.internal.tls.e
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import okhttp3.internal.tls.a;
import okhttp3.internal.tls.c;
import okhttp3.internal.tls.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0017\u00a8\u0006\u001c"}, d2={"Lokhttp3/internal/tls/a;", "Lokhttp3/internal/tls/c;", "Ljava/security/cert/X509Certificate;", "toVerify", "signingCert", "", "b", "(Ljava/security/cert/X509Certificate;Ljava/security/cert/X509Certificate;)Z", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lokhttp3/internal/tls/e;", "Lokhttp3/internal/tls/e;", "trustRootIndex", "<init>", "(Lokhttp3/internal/tls/e;)V", "c", "okhttp"}, k=1, mv={1, 8, 0})
public final class a
extends c {
    @NotNull
    public static final a c = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private final e b;

    public a(@NotNull e e4) {
        y.j((Object)e4, (String)"trustRootIndex");
        this.b = e4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        boolean bl = y.e((Object)x509Certificate.getIssuerDN(), (Object)x509Certificate2.getSubjectDN());
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        }
        catch (GeneralSecurityException generalSecurityException) {
            return bl2;
        }
    }

    @NotNull
    public List<Certificate> a(@NotNull List<? extends Certificate> object, @NotNull String object2) throws SSLPeerUnverifiedException {
        y.j(object, (String)"chain");
        y.j((Object)object2, (String)"hostname");
        object2 = new ArrayDeque((Collection)object);
        object = new ArrayList<Certificate>();
        Object object3 = object2.removeFirst();
        y.i(object3, (String)"queue.removeFirst()");
        object.add(object3);
        boolean bl = false;
        block0: for (int i4 = 0; i4 < 9; ++i4) {
            object3 = object.get(object.size() - 1);
            y.h(object3, (String)"null cannot be cast to non-null type java.security.cert.X509Certificate");
            object3 = (X509Certificate)object3;
            Object object4 = this.b.findByIssuerAndSignature(object3);
            if (object4 != null) {
                if (object.size() > 1 || !y.e(object3, (Object)object4)) {
                    object.add((Certificate)object4);
                }
                if (this.b((X509Certificate)object4, (X509Certificate)object4)) {
                    return object;
                }
                bl = true;
                continue;
            }
            object4 = object2.iterator();
            y.i((Object)object4, (String)"queue.iterator()");
            while (object4.hasNext()) {
                Object object5 = object4.next();
                y.h(object5, (String)"null cannot be cast to non-null type java.security.cert.X509Certificate");
                if (!this.b((X509Certificate)object3, (X509Certificate)(object5 = (X509Certificate)object5))) continue;
                object4.remove();
                object.add(object5);
                continue block0;
            }
            if (bl) {
                return object;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Failed to find a trusted cert that signed ");
            ((StringBuilder)object).append(object3);
            throw new SSLPeerUnverifiedException(((StringBuilder)object).toString());
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Certificate chain too long: ");
        ((StringBuilder)object2).append(object);
        throw new SSLPeerUnverifiedException(((StringBuilder)object2).toString());
    }

    public boolean equals(@Nullable Object object) {
        boolean bl = true;
        if (!(object == this || object instanceof a && y.e((Object)((a)((Object)object)).b, (Object)this.b))) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}


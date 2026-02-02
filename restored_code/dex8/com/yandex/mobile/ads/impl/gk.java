/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.pn
 *  com.yandex.mobile.ads.impl.r72
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.pn;
import com.yandex.mobile.ads.impl.r72;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class gk
extends pn {
    @NotNull
    private final r72 a;

    public gk(@NotNull r72 r722) {
        this.a = r722;
    }

    /*
     * Unable to fully structure code
     */
    @NotNull
    public final List a(@NotNull String var1_1, @NotNull List var2_2) throws SSLPeerUnverifiedException {
        var2_2 = new ArrayDeque<E>(var2_2);
        var1_1 = new ArrayList<E>();
        var1_1.add(var2_2.removeFirst());
        var4_4 = false;
        block4: for (var3_3 = 0; var3_3 < 9; ++var3_3) {
            var5_5 = var1_1.get(var1_1.size() - 1);
            y.h(var5_5, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            var5_5 = (X509Certificate)var5_5;
            var6_7 = this.a.a(var5_5);
            if (var6_7 != null) {
                if (var1_1.size() > 1 || !y.e(var5_5, var6_7)) {
                    var1_1.add(var6_7);
                }
                if (y.e(var6_7.getIssuerDN(), var6_7.getSubjectDN())) {
                    var6_7.verify(var6_7.getPublicKey());
                    return var1_1;
                }
lbl19:
                // 3 sources

                while (true) {
                    var4_4 = true;
                    continue block4;
                    break;
                }
            }
            var6_7 = var2_2.iterator();
lbl23:
            // 2 sources

            while (true) {
                if (var6_7.hasNext()) {
                    var7_8 = var6_7.next();
                    y.h(var7_8, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    var7_8 = (X509Certificate)var7_8;
                    if (!y.e(var5_5.getIssuerDN(), var7_8.getSubjectDN())) continue;
                    var5_5.verify(var7_8.getPublicKey());
                    var6_7.remove();
                    var1_1.add(var7_8);
                    continue block4;
                }
                if (var4_4) {
                    return var1_1;
                }
                var1_1 = new StringBuilder();
                var1_1.append("Failed to find a trusted cert that signed ");
                var1_1.append(var5_5);
                throw new SSLPeerUnverifiedException(var1_1.toString());
            }
        }
        var2_2 = new StringBuilder();
        var2_2.append("Certificate chain too long: ");
        var2_2.append(var1_1);
        throw new SSLPeerUnverifiedException(var2_2.toString());
        catch (GeneralSecurityException var5_6) {
            ** continue;
        }
        catch (GeneralSecurityException var7_9) {
            ** continue;
        }
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object == this || object instanceof gk && y.e(((gk)((Object)object)).a, this.a);
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}


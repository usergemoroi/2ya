/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.impl.dn;
import io.appmetrica.analytics.impl.fn;
import io.appmetrica.analytics.impl.ln;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

public final class kj {
    public final Revenue a;
    public final dn b;
    public final ln c;
    public final ln d;
    public final PublicLogger e;

    public kj(Revenue revenue, PublicLogger publicLogger) {
        this.e = publicLogger;
        this.a = revenue;
        this.b = new dn(30720, "revenue payload", publicLogger);
        this.c = new ln(new dn(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.d = new ln(new fn(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}


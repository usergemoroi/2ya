/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.Hl;
import io.appmetrica.analytics.impl.fn;
import io.appmetrica.analytics.impl.z8;
import io.appmetrica.analytics.profile.StringAttribute;

public class NameAttribute
extends StringAttribute {
    NameAttribute() {
        super("appmetrica_name", new fn(100, "Name attribute"), new z8(), new Hl());
    }
}


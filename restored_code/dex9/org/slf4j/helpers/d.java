/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.a
 *  org.slf4j.b
 */
package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;
import org.slf4j.a;
import org.slf4j.b;

abstract class d
implements a,
Serializable {
    protected String c;

    d() {
    }

    public String getName() {
        return this.c;
    }

    protected Object readResolve() throws ObjectStreamException {
        return b.j((String)this.getName());
    }
}


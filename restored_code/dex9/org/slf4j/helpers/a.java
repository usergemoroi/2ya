/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.a
 */
package org.slf4j.helpers;

import org.slf4j.helpers.d;

public abstract class a
extends d
implements org.slf4j.a {
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append("(");
        stringBuilder.append(this.getName());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}


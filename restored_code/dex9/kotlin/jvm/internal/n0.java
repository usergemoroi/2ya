/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.SinceKotlin
 */
package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.m0;

public class n0
extends m0 {
    @SinceKotlin(version="1.4")
    public n0(Class clazz, String string, String string2, int n4) {
        super(clazz, string, string2, n4);
    }

    public Object get(Object object, Object object2) {
        return this.getGetter().call(object, object2);
    }
}


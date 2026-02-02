/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.SinceKotlin
 *  kotlin.reflect.KDeclarationContainer
 */
package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.m;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

public class j0
extends i0 {
    @SinceKotlin(version="1.4")
    public j0(Class clazz, String string, String string2, int n4) {
        super(k.NO_RECEIVER, clazz, string, string2, n4);
    }

    @SinceKotlin(version="1.4")
    public j0(Object object, Class clazz, String string, String string2, int n4) {
        super(object, clazz, string, string2, n4);
    }

    public j0(KDeclarationContainer kDeclarationContainer, String string, String string2) {
        super(k.NO_RECEIVER, ((m)kDeclarationContainer).a(), string, string2, kDeclarationContainer instanceof KClass ^ 1);
    }

    public Object get() {
        return this.getGetter().call(new Object[0]);
    }
}


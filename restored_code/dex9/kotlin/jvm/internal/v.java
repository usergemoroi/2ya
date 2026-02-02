/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.SinceKotlin
 *  kotlin.reflect.KDeclarationContainer
 */
package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

public class v
extends u {
    @SinceKotlin(version="1.4")
    public v(int n4, Class clazz, String string, String string2, int n5) {
        super(n4, k.NO_RECEIVER, clazz, string, string2, n5);
    }

    @SinceKotlin(version="1.4")
    public v(int n4, Object object, Class clazz, String string, String string2, int n5) {
        super(n4, object, clazz, string, string2, n5);
    }

    public v(int n4, KDeclarationContainer kDeclarationContainer, String string, String string2) {
        super(n4, k.NO_RECEIVER, ((m)kDeclarationContainer).a(), string, string2, kDeclarationContainer instanceof KClass ^ 1);
    }
}


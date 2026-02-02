/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.math.b
 */
package kotlin.math;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.math.a;
import kotlin.math.b;

@Metadata(d1={"\u0000\u001c\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0007H\u0007\u00a2\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0004*\u00020\u0007H\u0007\u00a2\u0006\u0004\b\n\u0010\u000b\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00018FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00048FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0014"}, d2={"", "", "c", "(D)I", "", "e", "(D)J", "", "d", "(F)I", "f", "(F)J", "a", "(I)I", "getSign$annotations", "(I)V", "sign", "b", "(J)I", "(J)V", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/math/MathKt")
class c
extends b {
    public static int a(int n4) {
        return Integer.signum(n4);
    }

    public static int b(long l4) {
        return Long.signum(l4);
    }

    @SinceKotlin(version="1.2")
    public static int c(double d4) {
        if (!Double.isNaN(d4)) {
            int n4 = d4 > 2.147483647E9 ? Integer.MAX_VALUE : (d4 < -2.147483648E9 ? Integer.MIN_VALUE : (int)Math.round(d4));
            return n4;
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    @SinceKotlin(version="1.2")
    public static int d(float f4) {
        if (!Float.isNaN(f4)) {
            return Math.round(f4);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    @SinceKotlin(version="1.2")
    public static long e(double d4) {
        if (!Double.isNaN(d4)) {
            return Math.round(d4);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    @SinceKotlin(version="1.2")
    public static long f(float f4) {
        return a.e(f4);
    }
}


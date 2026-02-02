/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.ExperimentalStdlibApi
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.WasExperimental
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.text.b
 *  kotlin.text.f0
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.b;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0010\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\b*\u00020\u0000\u00a2\u0006\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2={"", "", "g", "(C)I", "", "j", "(C)Ljava/lang/String;", "other", "", "ignoreCase", "h", "(CCZ)Z", "i", "(C)Z", "kotlin-stdlib"}, k=5, mv={1, 9, 0}, xs="kotlin/text/CharsKt")
@SourceDebugExtension(value={"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n1#2:350\n*E\n"})
class c
extends b {
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static int g(char c4) {
        int n4 = b.b((char)c4, (int)10);
        if (n4 >= 0) {
            return n4;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Char ");
        stringBuilder.append(c4);
        stringBuilder.append(" is not a decimal digit");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static final boolean h(char c4, char c5, boolean bl) {
        boolean bl2 = true;
        if (c4 == c5) {
            return true;
        }
        if (!bl) {
            return false;
        }
        c4 = Character.toUpperCase(c4);
        c5 = Character.toUpperCase(c5);
        bl = bl2;
        if (c4 != c5) {
            bl = Character.toLowerCase(c4) == Character.toLowerCase(c5) ? bl2 : false;
        }
        return bl;
    }

    public static boolean i(char c4) {
        boolean bl;
        boolean bl2 = bl = false;
        if ('\ud800' <= c4) {
            bl2 = bl;
            if (c4 < '\ue000') {
                bl2 = true;
            }
        }
        return bl2;
    }

    @SinceKotlin(version="1.5")
    @NotNull
    public static String j(char c4) {
        return f0.a((char)c4);
    }
}


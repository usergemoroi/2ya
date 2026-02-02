/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.json.internal.g0
 *  kotlinx.serialization.json.internal.o1
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlin.ranges.j;
import kotlinx.serialization.json.internal.g0;
import kotlinx.serialization.json.internal.n;
import kotlinx.serialization.json.internal.o1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u000b\n\u0002\u0010\u0019\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b&\u0010\u001eJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001c\u0010$\u00a8\u0006'"}, d2={"Lkotlinx/serialization/json/internal/v0;", "Lkotlinx/serialization/json/internal/g0;", "", "firstEscapedChar", "currentSize", "", "string", "Lkotlin/k0;", "d", "(IILjava/lang/String;)V", "expected", "e", "(I)V", "oldSize", "additional", "f", "(II)I", "", "value", "writeLong", "(J)V", "", "char", "a", "(C)V", "text", "c", "(Ljava/lang/String;)V", "b", "g", "()V", "toString", "()Ljava/lang/String;", "", "[C", "array", "I", "size", "<init>", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
public final class v0
implements g0 {
    @NotNull
    private char[] a = n.c.d();
    private int b;

    private final void d(int n4, int n5, String string) {
        int n6 = string.length();
        int n7 = n5;
        for (n5 = n4; n5 < n6; ++n5) {
            char[] cArray;
            n7 = this.f(n7, 2);
            char c4 = string.charAt(n5);
            if (c4 < o1.a().length) {
                n4 = o1.a()[c4];
                if (n4 == 0) {
                    cArray = this.a;
                    n4 = n7 + 1;
                    cArray[n7] = c4;
                } else if (n4 == 1) {
                    String string2 = o1.b()[c4];
                    y.g((Object)string2);
                    n4 = this.f(n7, string2.length());
                    cArray = this.a;
                    string2.getChars(0, string2.length(), cArray, n4);
                    this.b = n4 += string2.length();
                } else {
                    cArray = this.a;
                    cArray[n7] = 92;
                    cArray[n7 + 1] = (char)n4;
                    this.b = n4 = n7 + 2;
                }
            } else {
                cArray = this.a;
                n4 = n7 + 1;
                cArray[n7] = c4;
            }
            n7 = n4;
        }
        n4 = this.f(n7, 1);
        this.a[n4] = 34;
        this.b = n4 + 1;
    }

    private final void e(int n4) {
        this.f(this.b, n4);
    }

    private final int f(int n4, int n5) {
        char[] cArray = this.a;
        if (cArray.length <= (n5 += n4)) {
            cArray = Arrays.copyOf(cArray, j.e(n5, n4 * 2));
            y.i((Object)cArray, (String)"copyOf(...)");
            this.a = cArray;
        }
        return n4;
    }

    public void a(char c4) {
        this.e(1);
        char[] cArray = this.a;
        int n4 = this.b;
        this.b = n4 + 1;
        cArray[n4] = c4;
    }

    public void b(@NotNull String string) {
        y.j((Object)string, (String)"text");
        this.e(string.length() + 2);
        char[] cArray = this.a;
        int n4 = this.b;
        int n5 = n4 + 1;
        cArray[n4] = 34;
        n4 = string.length();
        string.getChars(0, n4, cArray, n5);
        int n6 = n4 + n5;
        for (n4 = n5; n4 < n6; ++n4) {
            char c4 = cArray[n4];
            if (c4 >= o1.a().length || o1.a()[c4] == 0) continue;
            this.d(n4 - n5, n4, string);
            return;
        }
        cArray[n6] = 34;
        this.b = n6 + 1;
    }

    public void c(@NotNull String string) {
        y.j((Object)string, (String)"text");
        int n4 = string.length();
        if (n4 == 0) {
            return;
        }
        this.e(n4);
        char[] cArray = this.a;
        int n5 = this.b;
        string.getChars(0, string.length(), cArray, n5);
        this.b += n4;
    }

    public void g() {
        n.c.c(this.a);
    }

    @NotNull
    public String toString() {
        return new String(this.a, 0, this.b);
    }

    public void writeLong(long l4) {
        this.c(String.valueOf(l4));
    }
}


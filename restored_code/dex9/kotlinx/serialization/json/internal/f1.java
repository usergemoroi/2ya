/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.j
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.json.internal.a
 *  kotlinx.serialization.json.internal.b
 *  kotlinx.serialization.json.internal.f0
 *  kotlinx.serialization.json.internal.i
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.j;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlinx.serialization.json.internal.a;
import kotlinx.serialization.json.internal.b;
import kotlinx.serialization.json.internal.f0;
import kotlinx.serialization.json.internal.i;
import kotlinx.serialization.json.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010/\u001a\u00020+\u0012\b\b\u0002\u00105\u001a\u000200\u00a2\u0006\u0004\b>\u0010?J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b$\u0010%J!\u0010(\u001a\u0004\u0018\u00010\u00182\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0004\u00a2\u0006\u0004\b*\u0010\u0017R\u0017\u0010/\u001a\u00020+8\u0006\u00a2\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0017\u00105\u001a\u0002008\u0006\u00a2\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u00028\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0006\n\u0004\b6\u0010\u000bR\u001a\u0010=\u001a\u0002088\u0014X\u0094\u0004\u00a2\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\u00a8\u0006@"}, d2={"Lkotlinx/serialization/json/internal/f1;", "Lkotlinx/serialization/json/internal/a;", "", "unprocessedCount", "Lkotlin/k0;", "U", "(I)V", "", "e", "()Z", "position", "I", "(I)I", "", "j", "()B", "", "expected", "l", "(C)V", "K", "()I", "u", "()V", "", "i", "()Ljava/lang/String;", "char", "startPos", "T", "(CI)I", "endPos", "L", "(II)Ljava/lang/String;", "fromIndex", "toIndex", "d", "(II)V", "keyToMatch", "isLenient", "F", "(Ljava/lang/String;Z)Ljava/lang/String;", "V", "Lkotlinx/serialization/json/internal/f0;", "Lkotlinx/serialization/json/internal/f0;", "getReader", "()Lkotlinx/serialization/json/internal/f0;", "reader", "", "f", "[C", "getBuffer", "()[C", "buffer", "g", "threshold", "Lkotlinx/serialization/json/internal/i;", "h", "Lkotlinx/serialization/json/internal/i;", "S", "()Lkotlinx/serialization/json/internal/i;", "source", "<init>", "(Lkotlinx/serialization/json/internal/f0;[C)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nReaderJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReaderJsonLexer.kt\nkotlinx/serialization/json/internal/ReaderJsonLexer\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,221:1\n158#2:222\n158#2:223\n158#2:224\n*S KotlinDebug\n*F\n+ 1 ReaderJsonLexer.kt\nkotlinx/serialization/json/internal/ReaderJsonLexer\n*L\n66#1:222\n133#1:223\n150#1:224\n*E\n"})
public class f1
extends a {
    @NotNull
    private final f0 e;
    @NotNull
    private final char[] f;
    @JvmField
    protected int g;
    @NotNull
    private final i h;

    public f1(@NotNull f0 f02, @NotNull char[] cArray) {
        y.j((Object)f02, (String)"reader");
        y.j((Object)cArray, (String)"buffer");
        this.e = f02;
        this.f = cArray;
        this.g = 128;
        this.h = new i(cArray);
        this.U(0);
    }

    private final void U(int n4) {
        int n5;
        char[] cArray = this.S().b();
        if (n4 != 0) {
            n5 = this.a;
            l.i(cArray, cArray, 0, n5, n5 + n4);
        }
        n5 = this.S().length();
        while (n4 != n5) {
            int n6 = this.e.a(cArray, n4, n5 - n4);
            if (n6 == -1) {
                this.S().f(n4);
                this.g = -1;
                break;
            }
            n4 += n6;
        }
        this.a = 0;
    }

    @Nullable
    public String F(@NotNull String string, boolean bl) {
        y.j((Object)string, (String)"keyToMatch");
        return null;
    }

    public int I(int n4) {
        if (n4 < this.S().length()) {
            return n4;
        }
        this.a = n4;
        this.u();
        if (this.a == 0 && this.S().length() != 0) {
            return 0;
        }
        return -1;
    }

    public int K() {
        char c4;
        int n4 = this.a;
        while ((n4 = this.I(n4)) != -1 && ((c4 = this.S().charAt(n4)) == ' ' || c4 == '\n' || c4 == '\r' || c4 == '\t')) {
            ++n4;
        }
        this.a = n4;
        return n4;
    }

    @NotNull
    public String L(int n4, int n5) {
        return this.S().e(n4, n5);
    }

    @NotNull
    protected i S() {
        return this.h;
    }

    public int T(char c4, int n4) {
        i i4 = this.S();
        int n5 = i4.length();
        while (n4 < n5) {
            if (i4.charAt(n4) == c4) {
                return n4;
            }
            ++n4;
        }
        return -1;
    }

    public final void V() {
        p.c.c(this.f);
    }

    protected void d(int n4, int n5) {
        StringBuilder stringBuilder = this.C();
        stringBuilder.append(this.S().b(), n4, n5 - n4);
        y.i((Object)stringBuilder, (String)"append(...)");
    }

    public boolean e() {
        this.u();
        int n4 = this.a;
        while ((n4 = this.I(n4)) != -1) {
            char c4 = this.S().charAt(n4);
            if (c4 != ' ' && c4 != '\n' && c4 != '\r' && c4 != '\t') {
                this.a = n4;
                return this.E(c4);
            }
            ++n4;
        }
        this.a = n4;
        return false;
    }

    @NotNull
    public String i() {
        this.l('\"');
        int n4 = this.a;
        int n5 = this.T('\"', n4);
        if (n5 == -1) {
            int n6 = this.I(n4);
            if (n6 != -1) {
                return this.p((CharSequence)this.S(), this.a, n6);
            }
            a.z((a)this, (byte)1, (boolean)false, (int)2, null);
            throw new j();
        }
        for (int i4 = n4; i4 < n5; ++i4) {
            if (this.S().charAt(i4) != '\\') continue;
            return this.p((CharSequence)this.S(), this.a, i4);
        }
        this.a = n5 + 1;
        return this.L(n4, n5);
    }

    public byte j() {
        int n4;
        this.u();
        i i4 = this.S();
        int n5 = this.a;
        while ((n4 = this.I(n5)) != -1) {
            n5 = n4 + 1;
            byte by = b.a((char)i4.charAt(n4));
            if (by == 3) continue;
            this.a = n5;
            return by;
        }
        this.a = n4;
        return 10;
    }

    public void l(char c4) {
        int n4;
        this.u();
        i i4 = this.S();
        int n5 = this.a;
        while ((n4 = this.I(n5)) != -1) {
            n5 = n4 + 1;
            if ((n4 = (int)i4.charAt(n4)) == 32 || n4 == 10 || n4 == 13 || n4 == 9) continue;
            this.a = n5;
            if (n4 == c4) {
                return;
            }
            this.Q(c4);
        }
        this.a = n4;
        this.Q(c4);
    }

    public void u() {
        int n4 = this.a;
        n4 = this.S().length() - n4;
        if (n4 > this.g) {
            return;
        }
        this.U(n4);
    }
}


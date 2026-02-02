/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.j
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.t
 *  kotlin.z
 *  kotlinx.serialization.json.internal.a
 *  kotlinx.serialization.json.internal.b
 *  kotlinx.serialization.json.internal.f0
 *  kotlinx.serialization.json.internal.i
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.t;
import kotlin.text.p;
import kotlin.z;
import kotlinx.serialization.json.internal.a;
import kotlinx.serialization.json.internal.b;
import kotlinx.serialization.json.internal.f0;
import kotlinx.serialization.json.internal.f1;
import kotlinx.serialization.json.internal.i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001d"}, d2={"Lkotlinx/serialization/json/internal/h1;", "Lkotlinx/serialization/json/internal/f1;", "", "position", "Lkotlin/t;", "", "W", "(I)Lkotlin/t;", "X", "(I)I", "", "expected", "Lkotlin/k0;", "l", "(C)V", "e", "()Z", "", "j", "()B", "G", "K", "()I", "Lkotlinx/serialization/json/internal/f0;", "reader", "", "buffer", "<init>", "(Lkotlinx/serialization/json/internal/f0;[C)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nCommentLexers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/ReaderJsonLexerWithComments\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,219:1\n158#2:220\n*S KotlinDebug\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/ReaderJsonLexerWithComments\n*L\n204#1:220\n*E\n"})
public final class h1
extends f1 {
    public h1(@NotNull f0 f02, @NotNull char[] cArray) {
        y.j((Object)f02, (String)"reader");
        y.j((Object)cArray, (String)"buffer");
        super(f02, cArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final t<Integer, Boolean> W(int n4) {
        int n5 = n4 + 2;
        char c4 = this.S().charAt(n4 + 1);
        if (c4 != '*') {
            if (c4 != '/') {
                return z.a((Object)n4, (Object)Boolean.FALSE);
            }
            while (true) {
                if (n4 == -1) {
                    return z.a((Object)-1, (Object)Boolean.TRUE);
                }
                n4 = p.d0((CharSequence)this.S(), '\n', n5, false, 4, null);
                if (n4 != -1) {
                    return z.a((Object)(n4 + 1), (Object)Boolean.TRUE);
                }
                n4 = n5 = this.I(this.S().length());
            }
        }
        c4 = '\u0000';
        while (n4 != -1) {
            n4 = p.e0((CharSequence)this.S(), "*/", n5, false, 4, null);
            if (n4 != -1) {
                return z.a((Object)(n4 + 2), (Object)Boolean.TRUE);
            }
            if (this.S().charAt(this.S().length() - 1) != '*') {
                n4 = this.I(this.S().length());
            } else {
                n4 = this.X(this.S().length() - 1);
                if (c4 != '\u0000') break;
                c4 = '\u0001';
            }
            int n6 = n4;
            n5 = n4;
            n4 = n6;
        }
        this.a = this.S().length();
        a.x((a)this, (String)"Expected end of the block comment: \"*/\", but had EOF instead", (int)0, null, (int)6, null);
        throw new j();
    }

    private final int X(int n4) {
        if (this.S().length() - n4 > this.g) {
            return n4;
        }
        this.a = n4;
        this.u();
        if (this.a == 0 && this.S().length() != 0) {
            return 0;
        }
        return -1;
    }

    public byte G() {
        this.u();
        i i4 = this.S();
        int n4 = this.K();
        if (n4 < i4.length() && n4 != -1) {
            this.a = n4;
            return b.a((char)i4.charAt(n4));
        }
        return 10;
    }

    @Override
    public int K() {
        int n4 = this.a;
        while (true) {
            int n5;
            n4 = n5 = this.I(n4);
            if (n5 == -1) break;
            char c4 = this.S().charAt(n5);
            if (c4 != ' ' && c4 != '\n' && c4 != '\r' && c4 != '\t') {
                n4 = n5;
                if (c4 != '/') break;
                n4 = n5;
                if (n5 + 1 >= this.S().length()) break;
                t<Integer, Boolean> t3 = this.W(n5);
                n4 = ((Number)t3.a()).intValue();
                if (((Boolean)t3.b()).booleanValue()) continue;
                break;
            }
            n4 = n5 + 1;
        }
        this.a = n4;
        return n4;
    }

    @Override
    public boolean e() {
        this.u();
        int n4 = this.K();
        if (n4 < this.S().length() && n4 != -1) {
            return this.E(this.S().charAt(n4));
        }
        return false;
    }

    @Override
    public byte j() {
        this.u();
        i i4 = this.S();
        int n4 = this.K();
        if (n4 < i4.length() && n4 != -1) {
            this.a = n4 + 1;
            return b.a((char)i4.charAt(n4));
        }
        return 10;
    }

    @Override
    public void l(char c4) {
        this.u();
        i i4 = this.S();
        int n4 = this.K();
        if (n4 >= i4.length() || n4 == -1) {
            this.a = -1;
            this.Q(c4);
        }
        char c5 = i4.charAt(n4);
        this.a = n4 + 1;
        if (c5 == c4) {
            return;
        }
        this.Q(c4);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.j
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.json.internal.a
 *  kotlinx.serialization.json.internal.b
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import kotlinx.serialization.json.internal.a;
import kotlinx.serialization.json.internal.b;
import kotlinx.serialization.json.internal.l1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2={"Lkotlinx/serialization/json/internal/n1;", "Lkotlinx/serialization/json/internal/l1;", "", "j", "()B", "", "e", "()Z", "", "expected", "Lkotlin/k0;", "l", "(C)V", "G", "", "K", "()I", "", "source", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nCommentLexers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/StringJsonLexerWithComments\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,219:1\n158#2:220\n*S KotlinDebug\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/StringJsonLexerWithComments\n*L\n66#1:220\n*E\n"})
public final class n1
extends l1 {
    public n1(@NotNull String string) {
        y.j((Object)string, (String)"source");
        super(string);
    }

    public byte G() {
        String string = this.S();
        int n4 = this.K();
        if (n4 < string.length() && n4 != -1) {
            this.a = n4;
            return b.a((char)string.charAt(n4));
        }
        return 10;
    }

    @Override
    public int K() {
        int n4 = this.a;
        if (n4 == -1) {
            return n4;
        }
        String string = this.S();
        while (n4 < string.length()) {
            char c4 = string.charAt(n4);
            int n5 = n4;
            if (c4 != ' ') {
                n5 = n4;
                if (c4 != '\n') {
                    n5 = n4;
                    if (c4 != '\r') {
                        if (c4 == '\t') {
                            n5 = n4;
                        } else {
                            if (c4 != '/' || (n5 = n4 + 1) >= string.length()) break;
                            if ((n5 = (int)string.charAt(n5)) != 42) {
                                if (n5 != 47) break;
                                n5 = n4 = p.d0(string, '\n', n4 + 2, false, 4, null);
                                if (n4 == -1) {
                                    n4 = string.length();
                                    continue;
                                }
                            } else {
                                if ((n4 = p.e0(string, "*/", n4 + 2, false, 4, null)) != -1) {
                                    n4 += 2;
                                    continue;
                                }
                                this.a = string.length();
                                a.x((a)this, (String)"Expected end of the block comment: \"*/\", but had EOF instead", (int)0, null, (int)6, null);
                                throw new j();
                            }
                        }
                    }
                }
            }
            n4 = n5 + 1;
        }
        this.a = n4;
        return n4;
    }

    @Override
    public boolean e() {
        int n4 = this.K();
        if (n4 < this.S().length() && n4 != -1) {
            return this.E(this.S().charAt(n4));
        }
        return false;
    }

    @Override
    public byte j() {
        String string = this.S();
        int n4 = this.K();
        if (n4 < string.length() && n4 != -1) {
            this.a = n4 + 1;
            return b.a((char)string.charAt(n4));
        }
        return 10;
    }

    @Override
    public void l(char c4) {
        String string = this.S();
        int n4 = this.K();
        if (n4 >= string.length() || n4 == -1) {
            this.a = -1;
            this.Q(c4);
        }
        char c5 = string.charAt(n4);
        this.a = n4 + 1;
        if (c5 == c4) {
            return;
        }
        this.Q(c4);
    }
}


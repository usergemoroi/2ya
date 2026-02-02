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
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import kotlinx.serialization.json.internal.a;
import kotlinx.serialization.json.internal.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0013\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00138\u0014X\u0094\u0004\u00a2\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015\u00a8\u0006\u001f"}, d2={"Lkotlinx/serialization/json/internal/l1;", "Lkotlinx/serialization/json/internal/a;", "", "position", "I", "(I)I", "", "j", "()B", "", "e", "()Z", "K", "()I", "", "expected", "Lkotlin/k0;", "l", "(C)V", "", "i", "()Ljava/lang/String;", "keyToMatch", "isLenient", "F", "(Ljava/lang/String;Z)Ljava/lang/String;", "Ljava/lang/String;", "S", "source", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nStringJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n158#2:130\n158#2:131\n158#2:132\n158#2:133\n1863#3,2:134\n*S KotlinDebug\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n*L\n23#1:130\n38#1:131\n57#1:132\n73#1:133\n109#1:134,2\n*E\n"})
public class l1
extends a {
    @NotNull
    private final String e;

    public l1(@NotNull String string) {
        y.j((Object)string, (String)"source");
        this.e = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public String F(@NotNull String string, boolean bl) {
        y.j((Object)string, (String)"keyToMatch");
        int n4 = this.a;
        byte by = this.j();
        if (by != 6) {
            return null;
        }
        if (!y.e((Object)this.H(bl), (Object)string)) {
            return null;
        }
        this.t();
        if (this.j() == 5) return this.H(bl);
        return null;
    }

    public int I(int n4) {
        if (n4 >= this.S().length()) {
            n4 = -1;
        }
        return n4;
    }

    public int K() {
        char c4;
        int n4 = this.a;
        if (n4 == -1) {
            return n4;
        }
        String string = this.S();
        while (n4 < string.length() && ((c4 = string.charAt(n4)) == ' ' || c4 == '\n' || c4 == '\r' || c4 == '\t')) {
            ++n4;
        }
        this.a = n4;
        return n4;
    }

    @NotNull
    protected String S() {
        return this.e;
    }

    public boolean e() {
        int n4 = this.a;
        if (n4 == -1) {
            return false;
        }
        String string = this.S();
        while (n4 < string.length()) {
            char c4 = string.charAt(n4);
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
        int n5 = p.d0(this.S(), '\"', n4, false, 4, null);
        if (n5 != -1) {
            for (int i4 = n4; i4 < n5; ++i4) {
                if (this.S().charAt(i4) != '\\') continue;
                return this.p(this.S(), this.a, i4);
            }
            this.a = n5 + 1;
            String string = this.S().substring(n4, n5);
            y.i((Object)string, (String)"substring(...)");
            return string;
        }
        this.q();
        this.y((byte)1, false);
        throw new j();
    }

    public byte j() {
        String string = this.S();
        int n4 = this.a;
        while (n4 != -1 && n4 < string.length()) {
            int n5 = n4 + 1;
            char c4 = string.charAt(n4);
            if (c4 != ' ' && c4 != '\n' && c4 != '\r' && c4 != '\t') {
                this.a = n5;
                return b.a((char)c4);
            }
            n4 = n5;
        }
        this.a = string.length();
        return 10;
    }

    public void l(char c4) {
        if (this.a == -1) {
            this.Q(c4);
        }
        String string = this.S();
        int n4 = this.a;
        while (n4 < string.length()) {
            int n5 = n4 + 1;
            if ((n4 = (int)string.charAt(n4)) != 32 && n4 != 10 && n4 != 13 && n4 != 9) {
                this.a = n5;
                if (n4 == c4) {
                    return;
                }
                this.Q(c4);
            }
            n4 = n5;
        }
        this.a = -1;
        this.Q(c4);
    }
}


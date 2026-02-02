/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.json.internal.g0
 *  kotlinx.serialization.json.internal.o1
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json.internal;

import java.io.OutputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.ranges.j;
import kotlinx.serialization.json.internal.g0;
import kotlinx.serialization.json.internal.l;
import kotlinx.serialization.json.internal.l0;
import kotlinx.serialization.json.internal.n;
import kotlinx.serialization.json.internal.o1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010%\u001a\u00020#\u00a2\u0006\u0004\b-\u0010.J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\"\u0010\u000eR\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010'R\u0016\u0010*\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001f\u0010)R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0007\u0010+\u00a8\u0006/"}, d2={"Lkotlinx/serialization/json/internal/u0;", "Lkotlinx/serialization/json/internal/g0;", "", "currentSize", "", "string", "Lkotlin/k0;", "d", "(ILjava/lang/String;)V", "oldSize", "additional", "e", "(II)I", "f", "()V", "", "count", "h", "([CI)V", "codePoint", "i", "(I)V", "", "value", "writeLong", "(J)V", "", "char", "a", "(C)V", "text", "c", "(Ljava/lang/String;)V", "b", "g", "Ljava/io/OutputStream;", "Ljava/io/OutputStream;", "stream", "", "[B", "buffer", "[C", "charArray", "I", "indexInBuffer", "<init>", "(Ljava/io/OutputStream;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nJvmJsonStreams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmJsonStreams.kt\nkotlinx/serialization/json/internal/JsonToJavaStreamWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n130#1:269\n117#1:271\n130#1:272\n118#1,3:273\n125#1,2:276\n130#1:278\n125#1,2:279\n117#1:281\n130#1:282\n118#1,3:283\n125#1,2:286\n125#1,2:288\n117#1:290\n130#1:291\n118#1,3:292\n125#1,2:295\n125#1,2:297\n125#1,2:299\n117#1:301\n130#1:302\n118#1,3:303\n125#1,2:306\n117#1:308\n130#1:309\n118#1,3:310\n125#1,2:313\n125#1,2:315\n125#1,2:317\n125#1,2:319\n117#1:321\n130#1:322\n118#1,3:323\n125#1,2:326\n117#1:328\n130#1:329\n118#1,3:330\n125#1,2:333\n125#1,2:335\n117#1:337\n130#1:338\n118#1,3:339\n125#1,2:342\n117#1:344\n130#1:345\n118#1,3:346\n125#1,2:349\n125#1,2:351\n125#1,2:353\n117#1:355\n130#1:356\n118#1,3:357\n125#1,2:360\n125#1,2:362\n125#1,2:364\n125#1,2:366\n1#2:270\n*S KotlinDebug\n*F\n+ 1 JvmJsonStreams.kt\nkotlinx/serialization/json/internal/JsonToJavaStreamWriter\n*L\n117#1:269\n148#1:271\n148#1:272\n148#1:273,3\n149#1:276,2\n151#1:278\n158#1:279,2\n165#1:281\n165#1:282\n165#1:283,3\n166#1:286,2\n167#1:288,2\n173#1:290\n173#1:291\n173#1:292,3\n174#1:295,2\n175#1:297,2\n176#1:299,2\n186#1:301\n186#1:302\n186#1:303,3\n187#1:306,2\n196#1:308\n196#1:309\n196#1:310,3\n197#1:313,2\n198#1:315,2\n199#1:317,2\n200#1:319,2\n215#1:321\n215#1:322\n215#1:323,3\n216#1:326,2\n221#1:328\n221#1:329\n221#1:330,3\n222#1:333,2\n223#1:335,2\n228#1:337\n228#1:338\n228#1:339,3\n229#1:342,2\n234#1:344\n234#1:345\n234#1:346,3\n235#1:349,2\n236#1:351,2\n237#1:353,2\n242#1:355\n242#1:356\n242#1:357,3\n243#1:360,2\n244#1:362,2\n245#1:364,2\n246#1:366,2\n*E\n"})
public final class u0
implements g0 {
    @NotNull
    private final OutputStream a;
    @NotNull
    private final byte[] b;
    @NotNull
    private char[] c;
    private int d;

    public u0(@NotNull OutputStream outputStream) {
        y.j((Object)outputStream, (String)"stream");
        this.a = outputStream;
        this.b = l.c.d();
        this.c = n.c.d();
    }

    private final void d(int n4, String object) {
        int n5 = ((String)object).length();
        for (int i4 = n4 - 1; i4 < n5; ++i4) {
            char[] cArray;
            int n6 = this.e(n4, 2);
            char c4 = ((String)object).charAt(i4);
            if (c4 < o1.a().length) {
                n4 = o1.a()[c4];
                if (n4 == 0) {
                    cArray = this.c;
                    n4 = n6 + 1;
                    cArray[n6] = c4;
                    continue;
                }
                if (n4 == 1) {
                    String string = o1.b()[c4];
                    y.g((Object)string);
                    n4 = this.e(n6, string.length());
                    cArray = this.c;
                    string.getChars(0, string.length(), cArray, n4);
                    n4 += string.length();
                    continue;
                }
                cArray = this.c;
                cArray[n6] = 92;
                cArray[n6 + 1] = (char)n4;
                n4 = n6 + 2;
                continue;
            }
            cArray = this.c;
            n4 = n6 + 1;
            cArray[n6] = c4;
        }
        this.e(n4, 1);
        object = this.c;
        object[n4] = 34;
        this.h((char[])object, n4 + 1);
        this.f();
    }

    private final int e(int n4, int n5) {
        char[] cArray = this.c;
        if (cArray.length <= (n5 += n4)) {
            cArray = Arrays.copyOf(cArray, j.e(n5, n4 * 2));
            y.i((Object)cArray, (String)"copyOf(...)");
            this.c = cArray;
        }
        return n4;
    }

    private final void f() {
        this.a.write(this.b, 0, this.d);
        this.d = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void h(char[] cArray, int n4) {
        if (n4 < 0) {
            throw new IllegalArgumentException("count < 0".toString());
        }
        if (n4 > cArray.length) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("count > string.length: ");
            stringBuilder.append(n4);
            stringBuilder.append(" > ");
            stringBuilder.append(cArray.length);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        int n5 = 0;
        block0: while (n5 < n4) {
            int n6;
            int n7;
            byte[] byArray;
            char c4 = cArray[n5];
            if (c4 < '\u0080') {
                if (this.b.length - this.d < 1) {
                    this.f();
                }
                byArray = this.b;
                n7 = this.d;
                this.d = n6 = n7 + 1;
                byArray[n7] = (byte)c4;
                n7 = n5 + 1;
                n6 = Math.min(n4, byArray.length - n6 + n7);
                while (true) {
                    n5 = n7;
                    if (n7 >= n6) continue block0;
                    c4 = cArray[n7];
                    n5 = n7;
                    if (c4 >= '\u0080') continue block0;
                    byArray = this.b;
                    n5 = this.d;
                    this.d = n5 + 1;
                    byArray[n5] = (byte)c4;
                    ++n7;
                }
            }
            if (c4 < '\u0800') {
                if (this.b.length - this.d < 2) {
                    this.f();
                }
                byArray = this.b;
                n7 = this.d;
                byArray[n7] = (byte)(c4 >> 6 | 0xC0);
                this.d = n7 + 2;
                byArray[n7 + 1] = (byte)(c4 & 0x3F | 0x80);
            } else {
                if (c4 >= '\ud800' && c4 <= '\udfff') {
                    n6 = n5 + 1;
                    n7 = n6 < n4 ? cArray[n6] : 0;
                    if (c4 <= '\udbff' && 56320 <= n7 && n7 < 57344) {
                        n7 = ((c4 & 0x3FF) << 10 | n7 & 0x3FF) + 65536;
                        if (this.b.length - this.d < 4) {
                            this.f();
                        }
                        byArray = this.b;
                        n6 = this.d;
                        byArray[n6] = (byte)(n7 >> 18 | 0xF0);
                        byArray[n6 + 1] = (byte)(n7 >> 12 & 0x3F | 0x80);
                        byArray[n6 + 2] = (byte)(n7 >> 6 & 0x3F | 0x80);
                        this.d = n6 + 4;
                        byArray[n6 + 3] = (byte)(n7 & 0x3F | 0x80);
                        n5 += 2;
                        continue;
                    }
                    if (this.b.length - this.d < 1) {
                        this.f();
                    }
                    byArray = this.b;
                    n5 = this.d;
                    this.d = n5 + 1;
                    byArray[n5] = (byte)63;
                    n5 = n6;
                    continue;
                }
                if (this.b.length - this.d < 3) {
                    this.f();
                }
                byArray = this.b;
                n7 = this.d;
                byArray[n7] = (byte)(c4 >> 12 | 0xE0);
                byArray[n7 + 1] = (byte)(c4 >> 6 & 0x3F | 0x80);
                this.d = n7 + 3;
                byArray[n7 + 2] = (byte)(c4 & 0x3F | 0x80);
            }
            ++n5;
        }
        return;
    }

    private final void i(int n4) {
        block13: {
            block9: {
                block12: {
                    block11: {
                        block10: {
                            block8: {
                                if (n4 >= 128) break block8;
                                if (this.b.length - this.d < 1) {
                                    this.f();
                                }
                                byte[] byArray = this.b;
                                int n5 = this.d;
                                this.d = n5 + 1;
                                byArray[n5] = (byte)n4;
                                break block9;
                            }
                            if (n4 >= 2048) break block10;
                            if (this.b.length - this.d < 2) {
                                this.f();
                            }
                            byte[] byArray = this.b;
                            int n6 = this.d;
                            byArray[n6] = (byte)(n4 >> 6 | 0xC0);
                            this.d = n6 + 2;
                            byArray[n6 + 1] = (byte)(n4 & 0x3F | 0x80);
                            break block9;
                        }
                        if (55296 > n4 || n4 >= 57344) break block11;
                        if (this.b.length - this.d < 1) {
                            this.f();
                        }
                        byte[] byArray = this.b;
                        n4 = this.d;
                        this.d = n4 + 1;
                        byArray[n4] = (byte)63;
                        break block9;
                    }
                    if (n4 >= 65536) break block12;
                    if (this.b.length - this.d < 3) {
                        this.f();
                    }
                    byte[] byArray = this.b;
                    int n7 = this.d;
                    byArray[n7] = (byte)(n4 >> 12 | 0xE0);
                    byArray[n7 + 1] = (byte)(n4 >> 6 & 0x3F | 0x80);
                    this.d = n7 + 3;
                    byArray[n7 + 2] = (byte)(n4 & 0x3F | 0x80);
                    break block9;
                }
                if (n4 > 0x10FFFF) break block13;
                if (this.b.length - this.d < 4) {
                    this.f();
                }
                byte[] byArray = this.b;
                int n8 = this.d;
                byArray[n8] = (byte)(n4 >> 18 | 0xF0);
                byArray[n8 + 1] = (byte)(n4 >> 12 & 0x3F | 0x80);
                byArray[n8 + 2] = (byte)(n4 >> 6 & 0x3F | 0x80);
                this.d = n8 + 4;
                byArray[n8 + 3] = (byte)(n4 & 0x3F | 0x80);
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected code point: ");
        stringBuilder.append(n4);
        throw new l0(stringBuilder.toString());
    }

    public void a(char c4) {
        this.i(c4);
    }

    public void b(@NotNull String string) {
        y.j((Object)string, (String)"text");
        this.e(0, string.length() + 2);
        char[] cArray = this.c;
        cArray[0] = 34;
        int n4 = string.length();
        string.getChars(0, n4, cArray, 1);
        int n5 = n4 + 1;
        for (int i4 = 1; i4 < n5; ++i4) {
            char c4 = cArray[i4];
            if (c4 >= o1.a().length || o1.a()[c4] == 0) continue;
            this.d(i4, string);
            return;
        }
        cArray[n5] = 34;
        this.h(cArray, n4 + 2);
        this.f();
    }

    public void c(@NotNull String string) {
        y.j((Object)string, (String)"text");
        int n4 = string.length();
        this.e(0, n4);
        string.getChars(0, n4, this.c, 0);
        this.h(this.c, n4);
    }

    public void g() {
        this.f();
        n.c.c(this.c);
        l.c.c(this.b);
    }

    public void writeLong(long l4) {
        this.c(String.valueOf(l4));
    }
}


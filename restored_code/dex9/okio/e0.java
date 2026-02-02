/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okio.e0$a
 *  okio.h
 *  okio.j0
 *  okio.l0
 *  okio.m0
 *  org.jetbrains.annotations.NotNull
 */
package okio;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okio.e;
import okio.e0;
import okio.f;
import okio.h;
import okio.j0;
import okio.l0;
import okio.m0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010=\u001a\u00020:\u00a2\u0006\u0004\bF\u0010GJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\t\u0010\u0014J'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b\t\u0010\u0017J\u0017\u0010\t\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\t\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b!\u0010\u001fJ\u0017\u0010#\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b#\u0010\u001fJ\u0017\u0010$\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b$\u0010\u001fJ\u0017\u0010&\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u0001H\u0016\u00a2\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0001H\u0016\u00a2\u0006\u0004\b+\u0010*J\u000f\u0010-\u001a\u00020,H\u0016\u00a2\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016\u00a2\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b4\u00100J\u000f\u00106\u001a\u000205H\u0016\u00a2\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b8\u00109R\u0014\u0010=\u001a\u00020:8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010C\u001a\u0002018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010\u0003\u001a\u00020\u00028\u00d6\u0002X\u0096\u0004\u00a2\u0006\f\u0012\u0004\bE\u00100\u001a\u0004\bD\u0010\u0004\u00a8\u0006H"}, d2={"Lokio/e0;", "Lokio/f;", "Lokio/e;", "buffer", "()Lokio/e;", "source", "", "byteCount", "Lkotlin/k0;", "write", "(Lokio/e;J)V", "Lokio/h;", "byteString", "j", "(Lokio/h;)Lokio/f;", "", "string", "writeUtf8", "(Ljava/lang/String;)Lokio/f;", "", "([B)Lokio/f;", "", "offset", "([BII)Lokio/f;", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "Lokio/l0;", "G", "(Lokio/l0;)J", "b", "writeByte", "(I)Lokio/f;", "s", "writeShort", "i", "writeInt", "a", "v", "writeDecimalLong", "(J)Lokio/f;", "writeHexadecimalUnsignedLong", "emitCompleteSegments", "()Lokio/f;", "emit", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "flush", "()V", "", "isOpen", "()Z", "close", "Lokio/m0;", "timeout", "()Lokio/m0;", "toString", "()Ljava/lang/String;", "Lokio/j0;", "c", "Lokio/j0;", "sink", "d", "Lokio/e;", "bufferField", "e", "Z", "closed", "getBuffer", "getBuffer$annotations", "<init>", "(Lokio/j0;)V", "okio"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 2 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n51#1:146\n51#1:152\n51#1:157\n51#1:162\n51#1:167\n51#1:172\n51#1:175\n51#1:176\n51#1:180\n51#1:185\n51#1:188\n51#1:192\n51#1:201\n51#1:210\n51#1:215\n51#1:220\n51#1:225\n51#1:230\n51#1:235\n51#1:240\n51#1:245\n51#1:250\n51#1:255\n51#1:261\n51#1:267\n51#1:279\n34#2:143\n35#2:145\n36#2,2:147\n40#2:149\n41#2:151\n42#2:153\n50#2:154\n51#2:156\n52#2:158\n56#2:159\n57#2:161\n58#2:163\n66#2:164\n67#2:166\n68#2:168\n72#2:169\n73#2:171\n74#2:173\n78#2:177\n79#2:179\n80#2:181\n88#2:182\n89#2:184\n90#2:186\n94#2,3:189\n97#2,5:193\n105#2,3:198\n108#2,5:202\n116#2:207\n117#2:209\n118#2:211\n122#2:212\n123#2:214\n124#2:216\n128#2:217\n129#2:219\n130#2:221\n134#2:222\n135#2:224\n136#2:226\n140#2:227\n141#2:229\n142#2:231\n146#2:232\n147#2:234\n148#2:236\n152#2:237\n153#2:239\n154#2:241\n158#2:242\n159#2:244\n160#2:246\n164#2:247\n165#2:249\n166#2:251\n170#2:252\n171#2:254\n172#2,2:256\n177#2:258\n178#2:260\n179#2,2:262\n184#2:264\n185#2:266\n186#2,4:268\n192#2,7:272\n199#2,16:280\n216#2:296\n218#2:297\n1#3:144\n1#3:150\n1#3:155\n1#3:160\n1#3:165\n1#3:170\n1#3:174\n1#3:178\n1#3:183\n1#3:187\n1#3:208\n1#3:213\n1#3:218\n1#3:223\n1#3:228\n1#3:233\n1#3:238\n1#3:243\n1#3:248\n1#3:253\n1#3:259\n1#3:265\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n55#1:146\n56#1:152\n58#1:157\n59#1:162\n61#1:167\n63#1:172\n67#1:175\n78#1:176\n82#1:180\n84#1:185\n88#1:188\n93#1:192\n94#1:201\n95#1:210\n96#1:215\n97#1:220\n98#1:225\n99#1:230\n100#1:235\n101#1:240\n102#1:245\n103#1:250\n104#1:255\n105#1:261\n134#1:267\n138#1:279\n55#1:143\n55#1:145\n55#1:147,2\n56#1:149\n56#1:151\n56#1:153\n58#1:154\n58#1:156\n58#1:158\n59#1:159\n59#1:161\n59#1:163\n61#1:164\n61#1:166\n61#1:168\n63#1:169\n63#1:171\n63#1:173\n82#1:177\n82#1:179\n82#1:181\n84#1:182\n84#1:184\n84#1:186\n93#1:189,3\n93#1:193,5\n94#1:198,3\n94#1:202,5\n95#1:207\n95#1:209\n95#1:211\n96#1:212\n96#1:214\n96#1:216\n97#1:217\n97#1:219\n97#1:221\n98#1:222\n98#1:224\n98#1:226\n99#1:227\n99#1:229\n99#1:231\n100#1:232\n100#1:234\n100#1:236\n101#1:237\n101#1:239\n101#1:241\n102#1:242\n102#1:244\n102#1:246\n103#1:247\n103#1:249\n103#1:251\n104#1:252\n104#1:254\n104#1:256,2\n105#1:258\n105#1:260\n105#1:262,2\n134#1:264\n134#1:266\n134#1:268,4\n138#1:272,7\n138#1:280,16\n139#1:296\n140#1:297\n55#1:144\n56#1:150\n58#1:155\n59#1:160\n61#1:165\n63#1:170\n82#1:178\n84#1:183\n95#1:208\n96#1:213\n97#1:218\n98#1:223\n99#1:228\n100#1:233\n101#1:238\n102#1:243\n103#1:248\n104#1:253\n105#1:259\n134#1:265\n*E\n"})
public final class e0
implements f {
    @JvmField
    @NotNull
    public final j0 c;
    @JvmField
    @NotNull
    public final e d;
    @JvmField
    public boolean e;

    public e0(@NotNull j0 j02) {
        y.j((Object)j02, (String)"sink");
        this.c = j02;
        this.d = new e();
    }

    @Override
    public long G(@NotNull l0 l02) {
        long l4;
        y.j((Object)l02, (String)"source");
        long l5 = 0L;
        while ((l4 = l02.read(this.d, 8192L)) != -1L) {
            l5 += l4;
            this.emitCompleteSegments();
        }
        return l5;
    }

    @NotNull
    public f a(int n4) {
        if (this.e ^ true) {
            this.d.c0(n4);
            return this.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    @NotNull
    public e buffer() {
        return this.d;
    }

    @Override
    public void close() {
        if (!this.e) {
            Object object;
            block8: {
                e e4;
                block7: {
                    block6: {
                        try {
                            if (this.d.size() <= 0L) break block6;
                            object = this.c;
                            e4 = this.d;
                            object.write(e4, e4.size());
                        }
                        catch (Throwable throwable) {
                            break block7;
                        }
                    }
                    e4 = null;
                }
                try {
                    this.c.close();
                    object = e4;
                }
                catch (Throwable throwable) {
                    object = e4;
                    if (e4 != null) break block8;
                    object = throwable;
                }
            }
            this.e = true;
            if (object != null) {
                throw object;
            }
        }
    }

    @Override
    @NotNull
    public f emit() {
        if (this.e ^ true) {
            long l4 = this.d.size();
            if (l4 > 0L) {
                this.c.write(this.d, l4);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    @NotNull
    public f emitCompleteSegments() {
        if (this.e ^ true) {
            long l4 = this.d.m();
            if (l4 > 0L) {
                this.c.write(this.d, l4);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public void flush() {
        if (this.e ^ true) {
            if (this.d.size() > 0L) {
                j0 j02 = this.c;
                e e4 = this.d;
                j02.write(e4, e4.size());
            }
            this.c.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    @NotNull
    public e getBuffer() {
        return this.d;
    }

    @Override
    public boolean isOpen() {
        return this.e ^ true;
    }

    @Override
    @NotNull
    public f j(@NotNull h h4) {
        y.j((Object)h4, (String)"byteString");
        if (this.e ^ true) {
            this.d.U(h4);
            return this.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    @NotNull
    public OutputStream outputStream() {
        return new a(this);
    }

    @NotNull
    public m0 timeout() {
        return this.c.timeout();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("buffer(");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Override
    public int write(@NotNull ByteBuffer byteBuffer) {
        y.j((Object)byteBuffer, (String)"source");
        if (this.e ^ true) {
            int n4 = this.d.write(byteBuffer);
            this.emitCompleteSegments();
            return n4;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    @NotNull
    public f write(@NotNull byte[] byArray) {
        y.j((Object)byArray, (String)"source");
        if (this.e ^ true) {
            this.d.W(byArray);
            return this.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    @NotNull
    public f write(@NotNull byte[] byArray, int n4, int n5) {
        y.j((Object)byArray, (String)"source");
        if (this.e ^ true) {
            this.d.X(byArray, n4, n5);
            return this.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public void write(@NotNull e e4, long l4) {
        y.j((Object)e4, (String)"source");
        if (this.e ^ true) {
            this.d.write(e4, l4);
            this.emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    @NotNull
    public f writeByte(int n4) {
        if (this.e ^ true) {
            this.d.Y(n4);
            return this.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    @NotNull
    public f writeDecimalLong(long l4) {
        if (this.e ^ true) {
            this.d.Z(l4);
            return this.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    @NotNull
    public f writeHexadecimalUnsignedLong(long l4) {
        if (this.e ^ true) {
            this.d.a0(l4);
            return this.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    @NotNull
    public f writeInt(int n4) {
        if (this.e ^ true) {
            this.d.b0(n4);
            return this.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    @NotNull
    public f writeShort(int n4) {
        if (this.e ^ true) {
            this.d.e0(n4);
            return this.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    @NotNull
    public f writeUtf8(@NotNull String string) {
        y.j((Object)string, (String)"string");
        if (this.e ^ true) {
            this.d.h0(string);
            return this.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okio.f0$a
 *  okio.h
 *  okio.internal.a
 *  okio.j0
 *  okio.l0
 *  okio.m0
 *  okio.x
 *  org.jetbrains.annotations.NotNull
 */
package okio;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okio.a0;
import okio.d0;
import okio.e;
import okio.f0;
import okio.g;
import okio.h;
import okio.j0;
import okio.l0;
import okio.m0;
import okio.x;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010[\u001a\u00020X\u00a2\u0006\u0004\bf\u0010gJ\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\b \u0010!J\u0017\u0010\u0006\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\"H\u0016\u00a2\u0006\u0004\b\u0006\u0010#J\u001f\u0010$\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020&H\u0016\u00a2\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020)2\u0006\u0010-\u001a\u00020,H\u0016\u00a2\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020)H\u0016\u00a2\u0006\u0004\b0\u00101J\u0017\u00100\u001a\u00020)2\u0006\u00102\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b0\u0010+J\u000f\u00104\u001a\u000203H\u0016\u00a2\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000203H\u0016\u00a2\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b=\u0010;J\u000f\u0010>\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b>\u0010;J\u0017\u0010?\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b?\u0010\rJ\u0017\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\bA\u0010BJ'\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00102\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\bA\u0010EJ\u001f\u0010@\u001a\u00020\b2\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b@\u0010HJ/\u0010J\u001a\u00020\b2\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u00132\u0006\u0010I\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0001H\u0016\u00a2\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0016\u00a2\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\bH\u0016\u00a2\u0006\u0004\bQ\u0010\nJ\u000f\u0010R\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\bR\u0010SJ\u000f\u0010U\u001a\u00020TH\u0016\u00a2\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020)H\u0016\u00a2\u0006\u0004\bW\u00101R\u0014\u0010[\u001a\u00020X8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010a\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\b_\u0010`R\u001b\u0010e\u001a\u00020\u00028\u00d6\u0002X\u0096\u0004\u00a2\u0006\f\u0012\u0004\bd\u0010S\u001a\u0004\bb\u0010c\u00a8\u0006h"}, d2={"Lokio/f0;", "Lokio/g;", "Lokio/e;", "sink", "", "byteCount", "read", "(Lokio/e;J)J", "", "exhausted", "()Z", "Lkotlin/k0;", "require", "(J)V", "request", "(J)Z", "", "readByte", "()B", "Lokio/h;", "readByteString", "()Lokio/h;", "(J)Lokio/h;", "Lokio/a0;", "options", "", "R", "(Lokio/a0;)I", "", "readByteArray", "()[B", "(J)[B", "readFully", "([B)V", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "F", "(Lokio/e;J)V", "Lokio/j0;", "n", "(Lokio/j0;)J", "", "readUtf8", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "readUtf8LineStrict", "()Ljava/lang/String;", "limit", "", "readShort", "()S", "readShortLe", "readInt", "()I", "readIntLe", "readLong", "()J", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", "skip", "b", "indexOf", "(B)J", "fromIndex", "toIndex", "(BJJ)J", "offset", "bytes", "(JLokio/h;)Z", "bytesOffset", "a", "(JLokio/h;II)Z", "peek", "()Lokio/g;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "isOpen", "close", "()V", "Lokio/m0;", "timeout", "()Lokio/m0;", "toString", "Lokio/l0;", "c", "Lokio/l0;", "source", "d", "Lokio/e;", "bufferField", "e", "Z", "closed", "getBuffer", "()Lokio/e;", "getBuffer$annotations", "buffer", "<init>", "(Lokio/l0;)V", "okio"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 2 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n62#1:191\n62#1:201\n62#1:208\n62#1:214\n62#1:216\n62#1:220\n62#1:225\n62#1:240\n62#1:244\n62#1:251\n62#1:264\n62#1:272\n62#1:273\n62#1:274\n62#1:280\n62#1:288\n62#1:301\n62#1:305\n62#1:306\n62#1:307\n62#1:308\n62#1:313\n62#1:325\n62#1:341\n62#1:351\n62#1:354\n62#1:357\n62#1:360\n62#1:363\n62#1:366\n62#1:372\n62#1:389\n62#1:409\n62#1:424\n62#1:441\n62#1:454\n62#1:475\n62#1:482\n38#2:186\n39#2,3:188\n42#2,6:192\n51#2:198\n52#2:200\n56#2,2:202\n60#2:204\n61#2,2:206\n63#2,3:209\n69#2,2:212\n74#2:215\n75#2:217\n79#2,2:218\n84#2:221\n86#2,2:223\n88#2,13:226\n107#2:239\n108#2:241\n112#2,2:242\n117#2,6:245\n123#2,9:252\n134#2,3:261\n137#2,5:265\n142#2:271\n146#2,5:275\n151#2,5:281\n158#2,2:286\n160#2,11:289\n174#2:300\n175#2:302\n179#2,2:303\n184#2,4:309\n188#2,6:314\n198#2:320\n199#2,3:322\n202#2,8:326\n210#2,3:335\n217#2,3:338\n220#2,7:342\n230#2,2:349\n235#2,2:352\n240#2,2:355\n245#2,2:358\n250#2,2:361\n255#2,2:364\n260#2,5:367\n265#2,11:373\n279#2,5:384\n284#2,14:390\n301#2,2:404\n303#2,2:407\n305#2,7:410\n314#2,2:417\n316#2,4:420\n320#2,11:425\n334#2,2:436\n337#2,2:439\n339#2,7:442\n350#2,2:449\n353#2,2:452\n355#2,7:455\n371#2:462\n373#2,11:464\n385#2:476\n389#2:477\n393#2,4:478\n397#2:483\n399#2:484\n401#2:485\n1#3:187\n1#3:199\n1#3:205\n1#3:222\n1#3:321\n1#3:406\n1#3:419\n1#3:438\n1#3:451\n1#3:463\n89#4:270\n89#4:334\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n*L\n66#1:191\n67#1:201\n69#1:208\n70#1:214\n71#1:216\n72#1:220\n73#1:225\n74#1:240\n75#1:244\n77#1:251\n79#1:264\n82#1:272\n83#1:273\n87#1:274\n90#1:280\n91#1:288\n92#1:301\n93#1:305\n96#1:306\n97#1:307\n102#1:308\n105#1:313\n107#1:325\n108#1:341\n109#1:351\n110#1:354\n111#1:357\n112#1:360\n113#1:363\n114#1:366\n115#1:372\n116#1:389\n117#1:409\n121#1:424\n124#1:441\n127#1:454\n141#1:475\n181#1:482\n66#1:186\n66#1:188,3\n66#1:192,6\n67#1:198\n67#1:200\n68#1:202,2\n69#1:204\n69#1:206,2\n69#1:209,3\n70#1:212,2\n71#1:215\n71#1:217\n72#1:218,2\n73#1:221\n73#1:223,2\n73#1:226,13\n74#1:239\n74#1:241\n75#1:242,2\n77#1:245,6\n77#1:252,9\n79#1:261,3\n79#1:265,5\n79#1:271\n90#1:275,5\n90#1:281,5\n91#1:286,2\n91#1:289,11\n92#1:300\n92#1:302\n93#1:303,2\n105#1:309,4\n105#1:314,6\n107#1:320\n107#1:322,3\n107#1:326,8\n107#1:335,3\n108#1:338,3\n108#1:342,7\n109#1:349,2\n110#1:352,2\n111#1:355,2\n112#1:358,2\n113#1:361,2\n114#1:364,2\n115#1:367,5\n115#1:373,11\n116#1:384,5\n116#1:390,14\n117#1:404,2\n117#1:407,2\n117#1:410,7\n121#1:417,2\n121#1:420,4\n121#1:425,11\n124#1:436,2\n124#1:439,2\n124#1:442,7\n127#1:449,2\n127#1:452,2\n127#1:455,7\n141#1:462\n141#1:464,11\n141#1:476\n143#1:477\n181#1:478,4\n181#1:483\n182#1:484\n183#1:485\n66#1:187\n67#1:199\n69#1:205\n73#1:222\n107#1:321\n117#1:406\n121#1:419\n124#1:438\n127#1:451\n141#1:463\n79#1:270\n107#1:334\n*E\n"})
public final class f0
implements g {
    @JvmField
    @NotNull
    public final l0 c;
    @JvmField
    @NotNull
    public final e d;
    @JvmField
    public boolean e;

    public f0(@NotNull l0 l02) {
        y.j((Object)l02, (String)"source");
        this.c = l02;
        this.d = new e();
    }

    @Override
    public void F(@NotNull e e4, long l4) {
        y.j((Object)e4, (String)"sink");
        try {
            this.require(l4);
        }
        catch (EOFException eOFException) {
            e4.G(this.d);
            throw eOFException;
        }
        this.d.F(e4, l4);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int R(@NotNull a0 a02) {
        y.j((Object)a02, (String)"options");
        if (!(this.e ^ true)) throw new IllegalStateException("closed".toString());
        do {
            int n4;
            if ((n4 = okio.internal.a.d((e)this.d, (a0)a02, (boolean)true)) == -2) continue;
            if (n4 == -1) return -1;
            int n5 = a02.e()[n4].C();
            this.d.skip(n5);
            return n4;
        } while (this.c.read(this.d, 8192L) != -1L);
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(long l4, @NotNull h h4, int n4, int n5) {
        y.j((Object)h4, (String)"bytes");
        boolean bl = this.e;
        boolean bl2 = true;
        if (!(bl ^ true)) throw new IllegalStateException("closed".toString());
        if (l4 < 0L) return false;
        if (n4 < 0) return false;
        if (n5 < 0) return false;
        if (h4.C() - n4 >= n5) {
            int n6 = 0;
            while (true) {
                bl = bl2;
                if (n6 >= n5) return bl;
                long l5 = (long)n6 + l4;
                if (!this.request(1L + l5)) return false;
                if (this.d.w(l5) != h4.g(n4 + n6)) break;
                ++n6;
            }
        }
        return false;
    }

    @Override
    public boolean b(long l4, @NotNull h h4) {
        y.j((Object)h4, (String)"bytes");
        return this.a(l4, h4, 0, h4.C());
    }

    @Override
    public void close() {
        if (!this.e) {
            this.e = true;
            this.c.close();
            this.d.k();
        }
    }

    @Override
    public boolean exhausted() {
        boolean bl = this.e;
        boolean bl2 = true;
        if (bl ^ true) {
            if (!this.d.exhausted() || this.c.read(this.d, 8192L) != -1L) {
                bl2 = false;
            }
            return bl2;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    @NotNull
    public e getBuffer() {
        return this.d;
    }

    public long indexOf(byte by) {
        return this.indexOf(by, 0L, Long.MAX_VALUE);
    }

    public long indexOf(byte by, long l4, long l5) {
        if (this.e ^ true) {
            if (0L <= l4 && l4 <= l5) {
                long l6;
                while (true) {
                    long l7;
                    l6 = l7 = -1L;
                    if (l4 >= l5 || (l6 = this.d.indexOf(by, l4, l5)) != -1L) break;
                    long l8 = this.d.size();
                    l6 = l7;
                    if (l8 >= l5) break;
                    if (this.c.read(this.d, 8192L) == -1L) {
                        l6 = l7;
                        break;
                    }
                    l4 = Math.max(l4, l8);
                }
                return l6;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fromIndex=");
            stringBuilder.append(l4);
            stringBuilder.append(" toIndex=");
            stringBuilder.append(l5);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    @NotNull
    public InputStream inputStream() {
        return new a(this);
    }

    @Override
    public boolean isOpen() {
        return this.e ^ true;
    }

    @Override
    public long n(@NotNull j0 j02) {
        long l4;
        y.j((Object)j02, (String)"sink");
        long l5 = 0L;
        while (this.c.read(this.d, 8192L) != -1L) {
            l4 = this.d.m();
            if (l4 <= 0L) continue;
            l5 += l4;
            j02.write(this.d, l4);
        }
        l4 = l5;
        if (this.d.size() > 0L) {
            l4 = l5 + this.d.size();
            e e4 = this.d;
            j02.write(e4, e4.size());
        }
        return l4;
    }

    @Override
    @NotNull
    public g peek() {
        return x.d((l0)new d0(this));
    }

    @Override
    public int read(@NotNull ByteBuffer byteBuffer) {
        y.j((Object)byteBuffer, (String)"sink");
        if (this.d.size() == 0L && this.c.read(this.d, 8192L) == -1L) {
            return -1;
        }
        return this.d.read(byteBuffer);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public long read(@NotNull e object, long l4) {
        y.j((Object)object, (String)"sink");
        if (l4 >= 0L) {
            if (!(this.e ^ true)) throw new IllegalStateException("closed".toString());
            if (this.d.size() == 0L) {
                long l5 = this.c.read(this.d, 8192L);
                long l6 = -1L;
                if (l5 == -1L) {
                    return l6;
                }
            }
            l4 = Math.min(l4, this.d.size());
            return this.d.read((e)object, l4);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("byteCount < 0: ");
        ((StringBuilder)object).append(l4);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @Override
    public byte readByte() {
        this.require(1L);
        return this.d.readByte();
    }

    @Override
    @NotNull
    public byte[] readByteArray() {
        this.d.G(this.c);
        return this.d.readByteArray();
    }

    @Override
    @NotNull
    public byte[] readByteArray(long l4) {
        this.require(l4);
        return this.d.readByteArray(l4);
    }

    @Override
    @NotNull
    public h readByteString() {
        this.d.G(this.c);
        return this.d.readByteString();
    }

    @Override
    @NotNull
    public h readByteString(long l4) {
        this.require(l4);
        return this.d.readByteString(l4);
    }

    @Override
    public long readDecimalLong() {
        long l4;
        this.require(1L);
        long l5 = 0L;
        while (this.request(l4 = l5 + 1L)) {
            long l6;
            long l7;
            byte by = this.d.w(l5);
            if (by >= 48 && by <= 57 || (l7 = (l6 = l5 - 0L) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false && by == 45) {
                l5 = l4;
                continue;
            }
            if (l7 != false) break;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected a digit or '-' but was 0x");
            String string = Integer.toString(by, kotlin.text.a.a(kotlin.text.a.a(16)));
            y.i((Object)string, (String)"toString(this, checkRadix(radix))");
            stringBuilder.append(string);
            throw new NumberFormatException(stringBuilder.toString());
        }
        return this.d.readDecimalLong();
    }

    @Override
    public void readFully(@NotNull byte[] byArray) {
        y.j((Object)byArray, (String)"sink");
        try {
            this.require(byArray.length);
        }
        catch (EOFException eOFException) {
            int n4 = 0;
            while (this.d.size() > 0L) {
                e e4 = this.d;
                int n5 = e4.read(byArray, n4, (int)e4.size());
                if (n5 != -1) {
                    n4 += n5;
                    continue;
                }
                throw new AssertionError();
            }
            throw eOFException;
        }
        this.d.readFully(byArray);
    }

    @Override
    public long readHexadecimalUnsignedLong() {
        int n4;
        this.require(1L);
        int n5 = 0;
        while (this.request(n4 = n5 + 1)) {
            byte by = this.d.w(n5);
            if (by >= 48 && by <= 57 || by >= 97 && by <= 102 || by >= 65 && by <= 70) {
                n5 = n4;
                continue;
            }
            if (n5 != 0) break;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(by, kotlin.text.a.a(kotlin.text.a.a(16)));
            y.i((Object)string, (String)"toString(this, checkRadix(radix))");
            stringBuilder.append(string);
            throw new NumberFormatException(stringBuilder.toString());
        }
        return this.d.readHexadecimalUnsignedLong();
    }

    @Override
    public int readInt() {
        this.require(4L);
        return this.d.readInt();
    }

    @Override
    public int readIntLe() {
        this.require(4L);
        return this.d.readIntLe();
    }

    @Override
    public long readLong() {
        this.require(8L);
        return this.d.readLong();
    }

    @Override
    public long readLongLe() {
        this.require(8L);
        return this.d.readLongLe();
    }

    @Override
    public short readShort() {
        this.require(2L);
        return this.d.readShort();
    }

    @Override
    public short readShortLe() {
        this.require(2L);
        return this.d.readShortLe();
    }

    @Override
    @NotNull
    public String readString(@NotNull Charset charset) {
        y.j((Object)charset, (String)"charset");
        this.d.G(this.c);
        return this.d.readString(charset);
    }

    @Override
    @NotNull
    public String readUtf8(long l4) {
        this.require(l4);
        return this.d.readUtf8(l4);
    }

    @Override
    @NotNull
    public String readUtf8LineStrict() {
        return this.readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override
    @NotNull
    public String readUtf8LineStrict(long l4) {
        block2: {
            long l5;
            block5: {
                String string;
                block4: {
                    block3: {
                        if (l4 < 0L) break block2;
                        l5 = l4 == Long.MAX_VALUE ? Long.MAX_VALUE : l4 + 1L;
                        long l6 = this.indexOf((byte)10, 0L, l5);
                        if (l6 == -1L) break block3;
                        string = okio.internal.a.c((e)this.d, (long)l6);
                        break block4;
                    }
                    if (l5 >= Long.MAX_VALUE || !this.request(l5) || this.d.w(l5 - 1L) != 13 || !this.request(1L + l5) || this.d.w(l5) != 10) break block5;
                    string = okio.internal.a.c((e)this.d, (long)l5);
                }
                return string;
            }
            e e4 = new e();
            Object object = this.d;
            l5 = ((e)object).size();
            ((e)object).q(e4, 0L, Math.min((long)32, l5));
            object = new StringBuilder();
            ((StringBuilder)object).append("\\n not found: limit=");
            ((StringBuilder)object).append(Math.min(this.d.size(), l4));
            ((StringBuilder)object).append(" content=");
            ((StringBuilder)object).append(e4.readByteString().l());
            ((StringBuilder)object).append('\u2026');
            throw new EOFException(((StringBuilder)object).toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("limit < 0: ");
        stringBuilder.append(l4);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    @Override
    public boolean request(long l4) {
        if (l4 >= 0L) {
            boolean bl = this.e;
            boolean bl2 = true;
            if (bl ^ true) {
                block3: {
                    do {
                        bl = bl2;
                        if (this.d.size() >= l4) break block3;
                    } while (this.c.read(this.d, 8192L) != -1L);
                    bl = false;
                }
                return bl;
            }
            throw new IllegalStateException("closed".toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("byteCount < 0: ");
        stringBuilder.append(l4);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    @Override
    public void require(long l4) {
        if (this.request(l4)) {
            return;
        }
        throw new EOFException();
    }

    @Override
    public void skip(long l4) {
        if (this.e ^ true) {
            while (l4 > 0L) {
                if (this.d.size() == 0L && this.c.read(this.d, 8192L) == -1L) {
                    throw new EOFException();
                }
                long l5 = Math.min(l4, this.d.size());
                this.d.skip(l5);
                l4 -= l5;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
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
}


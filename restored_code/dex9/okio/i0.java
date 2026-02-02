/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okio.b
 *  okio.g0
 *  okio.h
 *  okio.internal.e
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okio;

import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okio.b;
import okio.g0;
import okio.h;
import okio.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001a05\u0012\u0006\u0010@\u001a\u00020;\u00a2\u0006\u0004\bA\u0010BJ\u000f\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0001H\u0016\u00a2\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0007H\u0010\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0010\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0010\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0010\u00a2\u0006\u0004\b\"\u0010#J/\u0010'\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b'\u0010(J/\u0010)\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\u001aH\u0010\u00a2\u0006\u0004\b/\u0010\u001cJ\u001a\u00101\u001a\u00020&2\b\u0010$\u001a\u0004\u0018\u000100H\u0096\u0002\u00a2\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b3\u0010\u0019J\u000f\u00104\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b4\u0010\tR \u0010:\u001a\b\u0012\u0004\u0012\u00020\u001a058\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010@\u001a\u00020;8\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\u00a8\u0006C"}, d2={"Lokio/i0;", "Lokio/h;", "M", "()Lokio/h;", "Ljava/lang/Object;", "writeReplace", "()Ljava/lang/Object;", "", "a", "()Ljava/lang/String;", "l", "G", "algorithm", "e", "(Ljava/lang/String;)Lokio/h;", "", "beginIndex", "endIndex", "E", "(II)Lokio/h;", "pos", "", "q", "(I)B", "j", "()I", "", "H", "()[B", "Lokio/e;", "buffer", "offset", "byteCount", "Lkotlin/k0;", "J", "(Lokio/e;II)V", "other", "otherOffset", "", "w", "(ILokio/h;II)Z", "x", "(I[BII)Z", "fromIndex", "n", "([BI)I", "s", "p", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "", "h", "[[B", "L", "()[[B", "segments", "", "i", "[I", "K", "()[I", "directory", "<init>", "([[B[I)V", "okio"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n+ 2 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n63#2,12:141\n63#2,12:153\n104#2,2:165\n106#2,26:168\n135#2,5:194\n142#2:199\n145#2,3:200\n63#2,8:203\n148#2,8:211\n71#2,4:219\n156#2:223\n63#2,12:224\n160#2:236\n85#2,10:237\n161#2,9:247\n95#2,4:256\n170#2,2:260\n179#2,4:262\n85#2,10:266\n183#2,3:276\n95#2,4:279\n186#2:283\n195#2,8:284\n85#2,10:292\n203#2,3:302\n95#2,4:305\n206#2:309\n215#2,5:310\n85#2,10:315\n220#2,3:325\n95#2,4:328\n223#2:332\n226#2,4:333\n234#2,6:337\n63#2,8:343\n240#2,7:351\n71#2,4:358\n247#2,2:362\n1#3:167\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n*L\n54#1:141,12\n66#1:153,12\n78#1:165,2\n78#1:168,26\n80#1:194,5\n82#1:199\n84#1:200,3\n84#1:203,8\n84#1:211,8\n84#1:219,4\n84#1:223\n90#1:224,12\n96#1:236\n96#1:237,10\n96#1:247,9\n96#1:256,4\n96#1:260,2\n103#1:262,4\n103#1:266,10\n103#1:276,3\n103#1:279,4\n103#1:283\n110#1:284,8\n110#1:292,10\n110#1:302,3\n110#1:305,4\n110#1:309\n117#1:310,5\n117#1:315,10\n117#1:325,3\n117#1:328,4\n117#1:332\n131#1:333,4\n133#1:337,6\n133#1:343,8\n133#1:351,7\n133#1:358,4\n133#1:362,2\n78#1:167\n*E\n"})
public final class i0
extends h {
    @NotNull
    private final transient byte[][] h;
    @NotNull
    private final transient int[] i;

    public i0(@NotNull byte[][] byArray, @NotNull int[] nArray) {
        y.j((Object)byArray, (String)"segments");
        y.j((Object)nArray, (String)"directory");
        super(okio.h.g.h());
        this.h = byArray;
        this.i = nArray;
    }

    private final h M() {
        return new h(this.H());
    }

    private final Object writeReplace() {
        h h4 = this.M();
        y.h((Object)h4, (String)"null cannot be cast to non-null type java.lang.Object");
        return h4;
    }

    @NotNull
    public h E(int n4, int n5) {
        n5 = b.e((h)this, (int)n5);
        if (n4 >= 0) {
            if (n5 <= this.C()) {
                int n6 = n5 - n4;
                if (n6 >= 0) {
                    Object object;
                    if (n4 == 0 && n5 == this.C()) {
                        object = this;
                    } else if (n4 == n5) {
                        object = okio.h.g;
                    } else {
                        int n7;
                        int n8 = e.b((i0)this, (int)n4);
                        int n9 = e.b((i0)this, (int)(n5 - 1));
                        byte[][] byArray = (byte[][])l.t((Object[])this.L(), n8, n9 + 1);
                        object = new int[byArray.length * 2];
                        int n10 = 0;
                        if (n8 <= n9) {
                            n5 = n8;
                            n7 = 0;
                            while (true) {
                                object[n7] = (h)Math.min(this.K()[n5] - n4, n6);
                                object[n7 + byArray.length] = (h)this.K()[this.L().length + n5];
                                if (n5 == n9) break;
                                ++n5;
                                ++n7;
                            }
                        }
                        n5 = n8 == 0 ? n10 : this.K()[n8 - 1];
                        n7 = byArray.length;
                        object[n7] = object[n7] + (n4 - n5);
                        object = new i0(byArray, (int[])object);
                    }
                    return object;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("endIndex=");
                stringBuilder.append(n5);
                stringBuilder.append(" < beginIndex=");
                stringBuilder.append(n4);
                throw new IllegalArgumentException(stringBuilder.toString().toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("endIndex=");
            stringBuilder.append(n5);
            stringBuilder.append(" > length(");
            stringBuilder.append(this.C());
            stringBuilder.append(')');
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("beginIndex=");
        stringBuilder.append(n4);
        stringBuilder.append(" < 0");
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    @NotNull
    public h G() {
        return this.M().G();
    }

    @NotNull
    public byte[] H() {
        byte[] byArray = new byte[this.C()];
        int n4 = this.L().length;
        int n5 = 0;
        int n6 = 0;
        for (int i4 = 0; i4 < n4; ++i4) {
            int n7 = this.K()[n4 + i4];
            int n8 = this.K()[i4];
            byte[] byArray2 = this.L()[i4];
            n5 = n8 - n5;
            l.h(byArray2, byArray, n6, n7, n7 + n5);
            n6 += n5;
            n5 = n8;
        }
        return byArray;
    }

    public void J(@NotNull okio.e e4, int n4, int n5) {
        y.j((Object)e4, (String)"buffer");
        int n6 = n4 + n5;
        int n7 = e.b((i0)this, (int)n4);
        int n8 = n4;
        n4 = n7;
        while (n8 < n6) {
            n7 = n4 == 0 ? 0 : this.K()[n4 - 1];
            int n9 = this.K()[n4];
            int n10 = this.K()[this.L().length + n4];
            n9 = Math.min(n6, n9 - n7 + n7) - n8;
            n7 = n10 + (n8 - n7);
            g0 g02 = new g0(this.L()[n4], n7, n7 + n9, true, false);
            g0 g03 = e4.c;
            if (g03 == null) {
                g02.g = g02;
                g02.f = g02;
                e4.c = g02;
            } else {
                y.g((Object)g03);
                g03 = g03.g;
                y.g((Object)g03);
                g03.c(g02);
            }
            n8 += n9;
            ++n4;
        }
        e4.L(e4.size() + (long)n5);
    }

    @NotNull
    public final int[] K() {
        return this.i;
    }

    @NotNull
    public final byte[][] L() {
        return this.h;
    }

    @NotNull
    public String a() {
        return this.M().a();
    }

    @NotNull
    public h e(@NotNull String object) {
        y.j((Object)object, (String)"algorithm");
        object = MessageDigest.getInstance((String)object);
        int n4 = this.L().length;
        int n5 = 0;
        for (int i4 = 0; i4 < n4; ++i4) {
            int n6 = this.K()[n4 + i4];
            int n7 = this.K()[i4];
            ((MessageDigest)object).update(this.L()[i4], n6, n7 - n5);
            n5 = n7;
        }
        object = ((MessageDigest)object).digest();
        y.g((Object)object);
        return new h((byte[])object);
    }

    public boolean equals(@Nullable Object object) {
        boolean bl = true;
        if (!(object == this || object instanceof h && (object = (h)object).C() == this.C() && this.w(0, (h)object, 0, this.C()))) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        int n4 = this.i();
        if (n4 == 0) {
            int n5 = this.L().length;
            n4 = 1;
            int n6 = 0;
            for (int i4 = 0; i4 < n5; ++i4) {
                int n7 = this.K()[n5 + i4];
                int n8 = this.K()[i4];
                byte[] byArray = this.L()[i4];
                for (int i5 = n7; i5 < n8 - n6 + n7; ++i5) {
                    n4 = n4 * 31 + byArray[i5];
                }
                n6 = n8;
            }
            this.y(n4);
        }
        return n4;
    }

    public int j() {
        return this.K()[this.L().length - 1];
    }

    @NotNull
    public String l() {
        return this.M().l();
    }

    public int n(@NotNull byte[] byArray, int n4) {
        y.j((Object)byArray, (String)"other");
        return this.M().n(byArray, n4);
    }

    @NotNull
    public byte[] p() {
        return this.H();
    }

    public byte q(int n4) {
        b.b((long)this.K()[this.L().length - 1], (long)n4, (long)1L);
        int n5 = e.b((i0)this, (int)n4);
        int n6 = n5 == 0 ? 0 : this.K()[n5 - 1];
        int n7 = this.K()[this.L().length + n5];
        return this.L()[n5][n4 - n6 + n7];
    }

    public int s(@NotNull byte[] byArray, int n4) {
        y.j((Object)byArray, (String)"other");
        return this.M().s(byArray, n4);
    }

    @NotNull
    public String toString() {
        return this.M().toString();
    }

    public boolean w(int n4, @NotNull h h4, int n5, int n6) {
        boolean bl;
        block5: {
            boolean bl2;
            y.j((Object)h4, (String)"other");
            bl = bl2 = false;
            if (n4 >= 0) {
                if (n4 > this.C() - n6) {
                    bl = bl2;
                } else {
                    int n7 = n6 + n4;
                    int n8 = e.b((i0)this, (int)n4);
                    n6 = n5;
                    n5 = n8;
                    while (n4 < n7) {
                        n8 = n5 == 0 ? 0 : this.K()[n5 - 1];
                        int n9 = this.K()[n5];
                        int n10 = this.K()[this.L().length + n5];
                        n9 = Math.min(n7, n9 - n8 + n8) - n4;
                        if (!h4.x(n6, this.L()[n5], n10 + (n4 - n8), n9)) {
                            bl = bl2;
                            break block5;
                        }
                        n6 += n9;
                        n4 += n9;
                        ++n5;
                    }
                    bl = true;
                }
            }
        }
        return bl;
    }

    public boolean x(int n4, @NotNull byte[] byArray, int n5, int n6) {
        boolean bl;
        block7: {
            boolean bl2;
            y.j((Object)byArray, (String)"other");
            bl = bl2 = false;
            if (n4 >= 0) {
                bl = bl2;
                if (n4 <= this.C() - n6) {
                    bl = bl2;
                    if (n5 >= 0) {
                        if (n5 > byArray.length - n6) {
                            bl = bl2;
                        } else {
                            int n7 = n6 + n4;
                            n6 = e.b((i0)this, (int)n4);
                            while (n4 < n7) {
                                int n8 = n6 == 0 ? 0 : this.K()[n6 - 1];
                                int n9 = this.K()[n6];
                                int n10 = this.K()[this.L().length + n6];
                                n9 = Math.min(n7, n9 - n8 + n8) - n4;
                                if (!b.a((byte[])this.L()[n6], (int)(n10 + (n4 - n8)), (byte[])byArray, (int)n5, (int)n9)) {
                                    bl = bl2;
                                    break block7;
                                }
                                n5 += n9;
                                n4 += n9;
                                ++n6;
                            }
                            bl = true;
                        }
                    }
                }
            }
        }
        return bl;
    }
}


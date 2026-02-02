/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.q6;
import io.appmetrica.analytics.impl.s6;
import io.appmetrica.analytics.impl.t6;
import io.appmetrica.analytics.impl.y6;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public final class u6
extends MessageNano {
    public static final int k = 0;
    public static final int l = 1;
    public static volatile u6[] m;
    public static byte[] n;
    public static volatile boolean o;
    public A6 a;
    public q6 b;
    public String c;
    public int d;
    public y6[] e;
    public int f;
    public t6 g;
    public byte[] h;
    public byte[] i;
    public s6[] j;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public u6() {
        block6: {
            if (!o) {
                Object object = InternalNano.LAZY_INIT_LOCK;
                synchronized (object) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            try {
                                if (o) break block4;
                                n = InternalNano.bytesDefaultValue("JVM");
                                o = true;
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        break block6;
                    }
                    throw throwable2;
                }
            }
        }
        this.a();
    }

    public static u6 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new u6(), byArray);
    }

    public static u6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new u6().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static u6[] b() {
        if (m != null) return m;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (m != null) return m;
                m = new u6[0];
                return m;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final u6 a() {
        this.a = null;
        this.b = null;
        this.c = "";
        this.d = -1;
        this.e = y6.b();
        this.f = 0;
        this.g = null;
        this.h = (byte[])n.clone();
        this.i = WireFormatNano.EMPTY_BYTES;
        this.j = s6.b();
        this.cachedSize = -1;
        return this;
    }

    public final u6 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        block13: while (true) {
            int n10 = codedInputByteBufferNano.readTag();
            switch (n10) {
                default: {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue block13;
                    return this;
                }
                case 82: {
                    int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    Object object = this.j;
                    n10 = object == null ? 0 : ((MessageNano[])object).length;
                    int n14 = n13 + n10;
                    MessageNano[] messageNanoArray = new s6[n14];
                    n13 = n10;
                    if (n10 != 0) {
                        System.arraycopy(object, 0, messageNanoArray, 0, n10);
                        n13 = n10;
                    }
                    while (n13 < n14 - 1) {
                        messageNanoArray[n13] = object = new s6();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n13;
                    }
                    messageNanoArray[n13] = object = new s6();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.j = messageNanoArray;
                    continue block13;
                }
                case 74: {
                    this.i = codedInputByteBufferNano.readBytes();
                    continue block13;
                }
                case 66: {
                    this.h = codedInputByteBufferNano.readBytes();
                    continue block13;
                }
                case 58: {
                    if (this.g == null) {
                        this.g = new t6();
                    }
                    codedInputByteBufferNano.readMessage(this.g);
                    continue block13;
                }
                case 48: {
                    n10 = codedInputByteBufferNano.readInt32();
                    if (n10 != 0 && n10 != 1) continue block13;
                    this.f = n10;
                    continue block13;
                }
                case 42: {
                    int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    Object object = this.e;
                    n10 = object == null ? 0 : ((MessageNano[])object).length;
                    int n14 = n13 + n10;
                    MessageNano[] messageNanoArray = new y6[n14];
                    n13 = n10;
                    if (n10 != 0) {
                        System.arraycopy(object, 0, messageNanoArray, 0, n10);
                        n13 = n10;
                    }
                    while (n13 < n14 - 1) {
                        messageNanoArray[n13] = object = new y6();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n13;
                    }
                    messageNanoArray[n13] = object = new y6();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.e = messageNanoArray;
                    continue block13;
                }
                case 32: {
                    n10 = codedInputByteBufferNano.readInt32();
                    if (n10 != -1 && n10 != 0 && n10 != 1) continue block13;
                    this.d = n10;
                    continue block13;
                }
                case 26: {
                    this.c = codedInputByteBufferNano.readString();
                    continue block13;
                }
                case 18: {
                    if (this.b == null) {
                        this.b = new q6();
                    }
                    codedInputByteBufferNano.readMessage(this.b);
                    continue block13;
                }
                case 10: {
                    if (this.a == null) {
                        this.a = new A6();
                    }
                    codedInputByteBufferNano.readMessage(this.a);
                    continue block13;
                }
                case 0: 
            }
            break;
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        Object object = this.a;
        int n13 = n10;
        if (object != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(1, (MessageNano)object);
        }
        object = this.b;
        int n14 = n13;
        if (object != null) {
            n14 = n13 + CodedOutputByteBufferNano.computeMessageSize(2, (MessageNano)object);
        }
        n10 = n14;
        if (!this.c.equals("")) {
            n10 = n14 + CodedOutputByteBufferNano.computeStringSize(3, this.c);
        }
        n14 = this.d;
        n13 = n10;
        if (n14 != -1) {
            n13 = n10 + CodedOutputByteBufferNano.computeInt32Size(4, n14);
        }
        object = this.e;
        int n15 = 0;
        n10 = n13;
        if (object != null) {
            n10 = n13;
            if (((y6[])object).length > 0) {
                n14 = 0;
                while (true) {
                    object = this.e;
                    n10 = n13;
                    if (n14 >= ((y6[])object).length) break;
                    object = object[n14];
                    n10 = n13;
                    if (object != null) {
                        n10 = CodedOutputByteBufferNano.computeMessageSize(5, (MessageNano)object) + n13;
                    }
                    ++n14;
                    n13 = n10;
                }
            }
        }
        n14 = this.f;
        n13 = n10;
        if (n14 != 0) {
            n13 = n10 + CodedOutputByteBufferNano.computeInt32Size(6, n14);
        }
        object = this.g;
        n14 = n13;
        if (object != null) {
            n14 = n13 + CodedOutputByteBufferNano.computeMessageSize(7, (MessageNano)object);
        }
        n10 = n14;
        if (!Arrays.equals(this.h, n)) {
            n10 = n14 + CodedOutputByteBufferNano.computeBytesSize(8, this.h);
        }
        n13 = n10;
        if (!Arrays.equals(this.i, WireFormatNano.EMPTY_BYTES)) {
            n13 = n10 + CodedOutputByteBufferNano.computeBytesSize(9, this.i);
        }
        object = this.j;
        n14 = n13;
        if (object != null) {
            n14 = n13;
            if (((y6[])object).length > 0) {
                n10 = n15;
                while (true) {
                    object = this.j;
                    n14 = n13;
                    if (n10 >= ((y6[])object).length) break;
                    object = object[n10];
                    n14 = n13;
                    if (object != null) {
                        n14 = CodedOutputByteBufferNano.computeMessageSize(10, (MessageNano)object) + n13;
                    }
                    ++n10;
                    n13 = n14;
                }
            }
        }
        return n14;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10;
        Object object = this.a;
        if (object != null) {
            codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
        }
        if ((object = this.b) != null) {
            codedOutputByteBufferNano.writeMessage(2, (MessageNano)object);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        if ((n10 = this.d) != -1) {
            codedOutputByteBufferNano.writeInt32(4, n10);
        }
        object = this.e;
        int n13 = 0;
        if (object != null && ((y6[])object).length > 0) {
            for (n10 = 0; n10 < ((y6[])(object = this.e)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(5, (MessageNano)object);
            }
        }
        if ((n10 = this.f) != 0) {
            codedOutputByteBufferNano.writeInt32(6, n10);
        }
        if ((object = this.g) != null) {
            codedOutputByteBufferNano.writeMessage(7, (MessageNano)object);
        }
        if (!Arrays.equals(this.h, n)) {
            codedOutputByteBufferNano.writeBytes(8, this.h);
        }
        if (!Arrays.equals(this.i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.i);
        }
        if ((object = this.j) != null && ((y6[])object).length > 0) {
            for (n10 = n13; n10 < ((y6[])(object = this.j)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(10, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}


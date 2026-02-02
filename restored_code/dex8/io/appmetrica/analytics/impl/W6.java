/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.q6;
import io.appmetrica.analytics.impl.s6;
import io.appmetrica.analytics.impl.v6;
import io.appmetrica.analytics.impl.y6;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public final class w6
extends MessageNano {
    public static final int l = 0;
    public static final int m = 1;
    public static volatile w6[] n;
    public static byte[] o;
    public static volatile boolean p;
    public A6 a;
    public q6 b;
    public String c;
    public int d;
    public y6[] e;
    public String f;
    public int g;
    public v6 h;
    public byte[] i;
    public byte[] j;
    public s6[] k;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public w6() {
        block6: {
            if (!p) {
                Object object = InternalNano.LAZY_INIT_LOCK;
                synchronized (object) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            try {
                                if (p) break block4;
                                o = InternalNano.bytesDefaultValue("JVM");
                                p = true;
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

    public static w6 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new w6(), byArray);
    }

    public static w6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new w6().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static w6[] b() {
        if (n != null) return n;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (n != null) return n;
                n = new w6[0];
                return n;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final w6 a() {
        this.a = null;
        this.b = null;
        this.c = "";
        this.d = -1;
        this.e = y6.b();
        this.f = "";
        this.g = 0;
        this.h = null;
        this.i = (byte[])o.clone();
        this.j = WireFormatNano.EMPTY_BYTES;
        this.k = s6.b();
        this.cachedSize = -1;
        return this;
    }

    public final w6 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        block14: while (true) {
            int n10 = codedInputByteBufferNano.readTag();
            switch (n10) {
                default: {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue block14;
                    return this;
                }
                case 90: {
                    int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    Object object = this.k;
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
                    this.k = messageNanoArray;
                    continue block14;
                }
                case 82: {
                    this.j = codedInputByteBufferNano.readBytes();
                    continue block14;
                }
                case 74: {
                    this.i = codedInputByteBufferNano.readBytes();
                    continue block14;
                }
                case 66: {
                    if (this.h == null) {
                        this.h = new v6();
                    }
                    codedInputByteBufferNano.readMessage(this.h);
                    continue block14;
                }
                case 56: {
                    n10 = codedInputByteBufferNano.readInt32();
                    if (n10 != 0 && n10 != 1) continue block14;
                    this.g = n10;
                    continue block14;
                }
                case 50: {
                    this.f = codedInputByteBufferNano.readString();
                    continue block14;
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
                    continue block14;
                }
                case 32: {
                    n10 = codedInputByteBufferNano.readInt32();
                    if (n10 != -1 && n10 != 0 && n10 != 1) continue block14;
                    this.d = n10;
                    continue block14;
                }
                case 26: {
                    this.c = codedInputByteBufferNano.readString();
                    continue block14;
                }
                case 18: {
                    if (this.b == null) {
                        this.b = new q6();
                    }
                    codedInputByteBufferNano.readMessage(this.b);
                    continue block14;
                }
                case 10: {
                    if (this.a == null) {
                        this.a = new A6();
                    }
                    codedInputByteBufferNano.readMessage(this.a);
                    continue block14;
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
        n10 = n13;
        if (object != null) {
            n10 = n13 + CodedOutputByteBufferNano.computeMessageSize(2, (MessageNano)object);
        }
        n13 = n10;
        if (!this.c.equals("")) {
            n13 = n10 + CodedOutputByteBufferNano.computeStringSize(3, this.c);
        }
        int n14 = this.d;
        n10 = n13;
        if (n14 != -1) {
            n10 = n13 + CodedOutputByteBufferNano.computeInt32Size(4, n14);
        }
        object = this.e;
        int n15 = 0;
        n13 = n10;
        if (object != null) {
            n13 = n10;
            if (((y6[])object).length > 0) {
                n14 = 0;
                while (true) {
                    object = this.e;
                    n13 = n10;
                    if (n14 >= ((y6[])object).length) break;
                    object = object[n14];
                    n13 = n10;
                    if (object != null) {
                        n13 = CodedOutputByteBufferNano.computeMessageSize(5, (MessageNano)object) + n10;
                    }
                    ++n14;
                    n10 = n13;
                }
            }
        }
        n10 = n13;
        if (!this.f.equals("")) {
            n10 = n13 + CodedOutputByteBufferNano.computeStringSize(6, this.f);
        }
        n14 = this.g;
        n13 = n10;
        if (n14 != 0) {
            n13 = n10 + CodedOutputByteBufferNano.computeInt32Size(7, n14);
        }
        object = this.h;
        n10 = n13;
        if (object != null) {
            n10 = n13 + CodedOutputByteBufferNano.computeMessageSize(8, (MessageNano)object);
        }
        n13 = n10;
        if (!Arrays.equals(this.i, o)) {
            n13 = n10 + CodedOutputByteBufferNano.computeBytesSize(9, this.i);
        }
        n10 = n13;
        if (!Arrays.equals(this.j, WireFormatNano.EMPTY_BYTES)) {
            n10 = n13 + CodedOutputByteBufferNano.computeBytesSize(10, this.j);
        }
        object = this.k;
        n14 = n10;
        if (object != null) {
            n14 = n10;
            if (((y6[])object).length > 0) {
                n13 = n15;
                while (true) {
                    object = this.k;
                    n14 = n10;
                    if (n13 >= ((y6[])object).length) break;
                    object = object[n13];
                    n14 = n10;
                    if (object != null) {
                        n14 = CodedOutputByteBufferNano.computeMessageSize(11, (MessageNano)object) + n10;
                    }
                    ++n13;
                    n10 = n14;
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
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f);
        }
        if ((n10 = this.g) != 0) {
            codedOutputByteBufferNano.writeInt32(7, n10);
        }
        if ((object = this.h) != null) {
            codedOutputByteBufferNano.writeMessage(8, (MessageNano)object);
        }
        if (!Arrays.equals(this.i, o)) {
            codedOutputByteBufferNano.writeBytes(9, this.i);
        }
        if (!Arrays.equals(this.j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.j);
        }
        if ((object = this.k) != null && ((y6[])object).length > 0) {
            for (n10 = n13; n10 < ((y6[])(object = this.k)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(11, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}


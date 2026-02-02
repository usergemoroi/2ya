/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano
 *  com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano
 *  com.yandex.varioqub.protobuf.nano.InternalNano
 *  com.yandex.varioqub.protobuf.nano.MessageNano
 *  com.yandex.varioqub.protobuf.nano.WireFormatNano
 */
package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.config.impl.q;
import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

public final class r
extends MessageNano {
    public String a;
    public String b;
    public q[] c;
    public String d;

    public r() {
        this.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        block6: {
            this.a = "";
            this.b = "";
            if (q.c == null) {
                Object object = InternalNano.LAZY_INIT_LOCK;
                synchronized (object) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            try {
                                if (q.c != null) break block4;
                                q.c = new q[0];
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
        this.c = q.c;
        this.d = "";
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int n10;
        int n13 = n10 = super.computeSerializedSize();
        if (!this.a.equals("")) {
            n13 = n10 + CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
        }
        n10 = n13;
        if (!this.b.equals("")) {
            n10 = n13 + CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b);
        }
        Object object = this.c;
        n13 = n10;
        if (object != null) {
            n13 = n10;
            if (((q[])object).length > 0) {
                int n14 = 0;
                while (true) {
                    object = this.c;
                    n13 = n10;
                    if (n14 >= ((q[])object).length) break;
                    object = object[n14];
                    n13 = n10;
                    if (object != null) {
                        n13 = CodedOutputByteBufferNano.computeMessageSize((int)3, (MessageNano)object) + n10;
                    }
                    ++n14;
                    n10 = n13;
                }
            }
        }
        n10 = n13;
        if (!this.d.equals("")) {
            n10 = n13 + CodedOutputByteBufferNano.computeStringSize((int)4, (String)this.d);
        }
        return n10;
    }

    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (n10 != 26) {
                        if (n10 != 34) {
                            if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n10)) continue;
                            break;
                        }
                        this.d = codedInputByteBufferNano.readString();
                        continue;
                    }
                    int n13 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)26);
                    Object object = this.c;
                    n10 = object == null ? 0 : ((q[])object).length;
                    int n14 = n13 + n10;
                    q[] qArray = new q[n14];
                    n13 = n10;
                    if (n10 != 0) {
                        System.arraycopy(object, 0, qArray, 0, n10);
                        n13 = n10;
                    }
                    while (n13 < n14 - 1) {
                        qArray[n13] = object = new q();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n13;
                    }
                    qArray[n13] = object = new q();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.c = qArray;
                    continue;
                }
                this.b = codedInputByteBufferNano.readString();
                continue;
            }
            this.a = codedInputByteBufferNano.readString();
        }
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        Object object;
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        if ((object = this.c) != null && ((q[])object).length > 0) {
            for (int i14 = 0; i14 < ((q[])(object = this.c)).length; ++i14) {
                if ((object = object[i14]) == null) continue;
                codedOutputByteBufferNano.writeMessage(3, (MessageNano)object);
            }
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}


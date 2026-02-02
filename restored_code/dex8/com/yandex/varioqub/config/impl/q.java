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

import com.yandex.varioqub.config.impl.s;
import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

public final class q
extends MessageNano {
    public static volatile q[] c;
    public String a;
    public s[] b;

    public q() {
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
            if (s.d == null) {
                Object object = InternalNano.LAZY_INIT_LOCK;
                synchronized (object) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            try {
                                if (s.d != null) break block4;
                                s.d = new s[0];
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
        this.b = s.d;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int n10;
        int n13 = n10 = super.computeSerializedSize();
        if (!this.a.equals("")) {
            n13 = n10 + CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
        }
        Object object = this.b;
        int n14 = n13;
        if (object != null) {
            n14 = n13;
            if (((s[])object).length > 0) {
                n10 = 0;
                while (true) {
                    object = this.b;
                    n14 = n13;
                    if (n10 >= ((s[])object).length) break;
                    object = object[n10];
                    n14 = n13;
                    if (object != null) {
                        n14 = CodedOutputByteBufferNano.computeMessageSize((int)2, (MessageNano)object) + n13;
                    }
                    ++n10;
                    n13 = n14;
                }
            }
        }
        return n14;
    }

    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n10)) continue;
                    break;
                }
                int n13 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)18);
                Object object = this.b;
                n10 = object == null ? 0 : ((s[])object).length;
                int n14 = n13 + n10;
                s[] sArray = new s[n14];
                n13 = n10;
                if (n10 != 0) {
                    System.arraycopy(object, 0, sArray, 0, n10);
                    n13 = n10;
                }
                while (n13 < n14 - 1) {
                    sArray[n13] = object = new s();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    codedInputByteBufferNano.readTag();
                    ++n13;
                }
                sArray[n13] = object = new s();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                this.b = sArray;
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
        if ((object = this.b) != null && ((s[])object).length > 0) {
            for (int i14 = 0; i14 < ((s[])(object = this.b)).length; ++i14) {
                if ((object = object[i14]) == null) continue;
                codedOutputByteBufferNano.writeMessage(2, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}


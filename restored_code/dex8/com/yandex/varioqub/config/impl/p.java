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

import com.yandex.varioqub.config.impl.n;
import com.yandex.varioqub.config.impl.o;
import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

public final class p
extends MessageNano {
    public String a;
    public String b;
    public n[] c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public o[] j;
    public String k;
    public String l;
    public String m;
    public String n;

    public p() {
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
            if (com.yandex.varioqub.config.impl.n.c == null) {
                Object object = InternalNano.LAZY_INIT_LOCK;
                synchronized (object) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            try {
                                if (com.yandex.varioqub.config.impl.n.c != null) break block4;
                                com.yandex.varioqub.config.impl.n.c = new n[0];
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
        this.c = com.yandex.varioqub.config.impl.n.c;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = o.b();
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = "";
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int n10;
        int n13;
        int n14 = n13 = super.computeSerializedSize();
        if (!this.a.equals("")) {
            n14 = n13 + CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
        }
        n13 = n14;
        if (!this.b.equals("")) {
            n13 = n14 + CodedOutputByteBufferNano.computeStringSize((int)2, (String)this.b);
        }
        Object object = this.c;
        int n15 = 0;
        n14 = n13;
        if (object != null) {
            n14 = n13;
            if (((n[])object).length > 0) {
                n10 = 0;
                while (true) {
                    object = this.c;
                    n14 = n13;
                    if (n10 >= ((n[])object).length) break;
                    object = object[n10];
                    n14 = n13;
                    if (object != null) {
                        n14 = CodedOutputByteBufferNano.computeMessageSize((int)3, (MessageNano)object) + n13;
                    }
                    ++n10;
                    n13 = n14;
                }
            }
        }
        n13 = n14;
        if (!this.d.equals("")) {
            n13 = n14 + CodedOutputByteBufferNano.computeStringSize((int)4, (String)this.d);
        }
        n10 = n13;
        if (!this.e.equals("")) {
            n10 = n13 + CodedOutputByteBufferNano.computeStringSize((int)5, (String)this.e);
        }
        n14 = n10;
        if (!this.f.equals("")) {
            n14 = n10 + CodedOutputByteBufferNano.computeStringSize((int)6, (String)this.f);
        }
        n13 = n14;
        if (!this.g.equals("")) {
            n13 = n14 + CodedOutputByteBufferNano.computeStringSize((int)7, (String)this.g);
        }
        n14 = n13;
        if (!this.h.equals("")) {
            n14 = n13 + CodedOutputByteBufferNano.computeStringSize((int)8, (String)this.h);
        }
        n13 = n14;
        if (!this.i.equals("")) {
            n13 = n14 + CodedOutputByteBufferNano.computeStringSize((int)9, (String)this.i);
        }
        object = this.j;
        n14 = n13;
        if (object != null) {
            n14 = n13;
            if (((n[])object).length > 0) {
                n10 = n15;
                while (true) {
                    object = this.j;
                    n14 = n13;
                    if (n10 >= ((n[])object).length) break;
                    object = object[n10];
                    n14 = n13;
                    if (object != null) {
                        n14 = CodedOutputByteBufferNano.computeMessageSize((int)10, (MessageNano)object) + n13;
                    }
                    ++n10;
                    n13 = n14;
                }
            }
        }
        n13 = n14;
        if (!this.k.equals("")) {
            n13 = n14 + CodedOutputByteBufferNano.computeStringSize((int)11, (String)this.k);
        }
        n14 = n13;
        if (!this.l.equals("")) {
            n14 = n13 + CodedOutputByteBufferNano.computeStringSize((int)12, (String)this.l);
        }
        n13 = n14;
        if (!this.m.equals("")) {
            n13 = n14 + CodedOutputByteBufferNano.computeStringSize((int)13, (String)this.m);
        }
        n14 = n13;
        if (!this.n.equals("")) {
            n14 = n13 + CodedOutputByteBufferNano.computeStringSize((int)14, (String)this.n);
        }
        return n14;
    }

    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        block17: while (true) {
            int n10 = codedInputByteBufferNano.readTag();
            switch (n10) {
                default: {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n10)) continue block17;
                    break block17;
                }
                case 114: {
                    this.n = codedInputByteBufferNano.readString();
                    continue block17;
                }
                case 106: {
                    this.m = codedInputByteBufferNano.readString();
                    continue block17;
                }
                case 98: {
                    this.l = codedInputByteBufferNano.readString();
                    continue block17;
                }
                case 90: {
                    this.k = codedInputByteBufferNano.readString();
                    continue block17;
                }
                case 82: {
                    int n13 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)82);
                    Object object = this.j;
                    n10 = object == null ? 0 : ((MessageNano[])object).length;
                    int n14 = n13 + n10;
                    MessageNano[] messageNanoArray = new o[n14];
                    n13 = n10;
                    if (n10 != 0) {
                        System.arraycopy(object, 0, messageNanoArray, 0, n10);
                        n13 = n10;
                    }
                    while (n13 < n14 - 1) {
                        messageNanoArray[n13] = object = new o();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n13;
                    }
                    messageNanoArray[n13] = object = new o();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.j = messageNanoArray;
                    continue block17;
                }
                case 74: {
                    this.i = codedInputByteBufferNano.readString();
                    continue block17;
                }
                case 66: {
                    this.h = codedInputByteBufferNano.readString();
                    continue block17;
                }
                case 58: {
                    this.g = codedInputByteBufferNano.readString();
                    continue block17;
                }
                case 50: {
                    this.f = codedInputByteBufferNano.readString();
                    continue block17;
                }
                case 42: {
                    this.e = codedInputByteBufferNano.readString();
                    continue block17;
                }
                case 34: {
                    this.d = codedInputByteBufferNano.readString();
                    continue block17;
                }
                case 26: {
                    int n13 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)26);
                    Object object = this.c;
                    n10 = object == null ? 0 : ((MessageNano[])object).length;
                    int n14 = n13 + n10;
                    MessageNano[] messageNanoArray = new n[n14];
                    n13 = n10;
                    if (n10 != 0) {
                        System.arraycopy(object, 0, messageNanoArray, 0, n10);
                        n13 = n10;
                    }
                    while (n13 < n14 - 1) {
                        messageNanoArray[n13] = object = new n();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n13;
                    }
                    messageNanoArray[n13] = object = new n();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.c = messageNanoArray;
                    continue block17;
                }
                case 18: {
                    this.b = codedInputByteBufferNano.readString();
                    continue block17;
                }
                case 10: {
                    this.a = codedInputByteBufferNano.readString();
                    continue block17;
                }
                case 0: 
            }
            break;
        }
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int n10;
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        Object object = this.c;
        int n13 = 0;
        if (object != null && ((n[])object).length > 0) {
            for (n10 = 0; n10 < ((n[])(object = this.c)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(3, (MessageNano)object);
            }
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.e);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.g);
        }
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.h);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.i);
        }
        if ((object = this.j) != null && ((n[])object).length > 0) {
            for (n10 = n13; n10 < ((n[])(object = this.j)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(10, (MessageNano)object);
            }
        }
        if (!this.k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.k);
        }
        if (!this.l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.l);
        }
        if (!this.m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.m);
        }
        if (!this.n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.n);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}


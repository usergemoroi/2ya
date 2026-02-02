/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.d2;
import io.appmetrica.analytics.impl.e2;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class f2
extends MessageNano {
    public static volatile f2[] d;
    public e2[] a;
    public d2 b;
    public String[] c;

    public f2() {
        this.a();
    }

    public static f2 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new f2(), byArray);
    }

    public static f2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new f2().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static f2[] b() {
        if (d != null) return d;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (d != null) return d;
                d = new f2[0];
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final f2 a() {
        this.a = e2.b();
        this.b = null;
        this.c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    public final f2 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            Object object;
            int n13;
            Object[] objectArray;
            int n14;
            if (n10 != 10) {
                if (n10 != 18) {
                    if (n10 != 26) {
                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                        return this;
                    }
                    n14 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    objectArray = this.c;
                    n10 = objectArray == null ? 0 : objectArray.length;
                    n13 = n14 + n10;
                    object = new String[n13];
                    n14 = n10;
                    if (n10 != 0) {
                        System.arraycopy(objectArray, 0, object, 0, n10);
                        n14 = n10;
                    }
                    while (n14 < n13 - 1) {
                        object[n14] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        ++n14;
                    }
                    object[n14] = codedInputByteBufferNano.readString();
                    this.c = object;
                    continue;
                }
                if (this.b == null) {
                    this.b = new d2();
                }
                codedInputByteBufferNano.readMessage(this.b);
                continue;
            }
            n14 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
            object = this.a;
            n10 = object == null ? 0 : ((e2[])object).length;
            n13 = n14 + n10;
            objectArray = new e2[n13];
            n14 = n10;
            if (n10 != 0) {
                System.arraycopy(object, 0, objectArray, 0, n10);
                n14 = n10;
            }
            while (n14 < n13 - 1) {
                objectArray[n14] = object = new e2();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                codedInputByteBufferNano.readTag();
                ++n14;
            }
            objectArray[n14] = object = new e2();
            codedInputByteBufferNano.readMessage((MessageNano)object);
            this.a = objectArray;
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10;
        int n13 = super.computeSerializedSize();
        Object object = this.a;
        int n14 = 0;
        int n15 = n13;
        if (object != null) {
            n15 = n13;
            if (((e2[])object).length > 0) {
                n10 = 0;
                while (true) {
                    object = this.a;
                    n15 = n13;
                    if (n10 >= ((e2[])object).length) break;
                    object = object[n10];
                    n15 = n13;
                    if (object != null) {
                        n15 = CodedOutputByteBufferNano.computeMessageSize(1, (MessageNano)object) + n13;
                    }
                    ++n10;
                    n13 = n15;
                }
            }
        }
        object = this.b;
        n13 = n15;
        if (object != null) {
            n13 = n15 + CodedOutputByteBufferNano.computeMessageSize(2, (MessageNano)object);
        }
        object = this.c;
        n15 = n13;
        if (object != null) {
            n15 = n13;
            if (((e2[])object).length > 0) {
                n10 = 0;
                int n16 = 0;
                for (n15 = n14; n15 < ((e2[])(object = this.c)).length; ++n15) {
                    object = object[n15];
                    int n17 = n10;
                    n14 = n16;
                    if (object != null) {
                        n14 = n16 + 1;
                        n17 = CodedOutputByteBufferNano.computeStringSizeNoTag((String)object) + n10;
                    }
                    n10 = n17;
                    n16 = n14;
                }
                n15 = n13 + n10 + n16;
            }
        }
        return n15;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10;
        Object object = this.a;
        int n13 = 0;
        if (object != null && ((e2[])object).length > 0) {
            for (n10 = 0; n10 < ((e2[])(object = this.a)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
            }
        }
        if ((object = this.b) != null) {
            codedOutputByteBufferNano.writeMessage(2, (MessageNano)object);
        }
        if ((object = this.c) != null && ((e2[])object).length > 0) {
            for (n10 = n13; n10 < ((e2[])(object = this.c)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeString(3, (String)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}


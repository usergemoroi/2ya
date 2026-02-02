/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.vm;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class wm
extends MessageNano {
    public static volatile wm[] b;
    public vm[] a;

    public wm() {
        this.a();
    }

    public static wm a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new wm(), byArray);
    }

    public static wm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new wm().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static wm[] b() {
        if (b != null) return b;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (b != null) return b;
                b = new wm[0];
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final wm a() {
        this.a = vm.b();
        this.cachedSize = -1;
        return this;
    }

    public final wm a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                return this;
            }
            int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
            Object object = this.a;
            n10 = object == null ? 0 : ((vm[])object).length;
            int n14 = n13 + n10;
            vm[] vmArray = new vm[n14];
            n13 = n10;
            if (n10 != 0) {
                System.arraycopy(object, 0, vmArray, 0, n10);
                n13 = n10;
            }
            while (n13 < n14 - 1) {
                vmArray[n13] = object = new vm();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                codedInputByteBufferNano.readTag();
                ++n13;
            }
            vmArray[n13] = object = new vm();
            codedInputByteBufferNano.readMessage((MessageNano)object);
            this.a = vmArray;
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        Object object = this.a;
        int n13 = n10;
        if (object != null) {
            n13 = n10;
            if (((vm[])object).length > 0) {
                int n14 = 0;
                while (true) {
                    object = this.a;
                    n13 = n10;
                    if (n14 >= ((vm[])object).length) break;
                    object = object[n14];
                    n13 = n10;
                    if (object != null) {
                        n13 = CodedOutputByteBufferNano.computeMessageSize(1, (MessageNano)object) + n10;
                    }
                    ++n14;
                    n10 = n13;
                }
            }
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Object object = this.a;
        if (object != null && ((vm[])object).length > 0) {
            for (int i14 = 0; i14 < ((vm[])(object = this.a)).length; ++i14) {
                if ((object = object[i14]) == null) continue;
                codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}


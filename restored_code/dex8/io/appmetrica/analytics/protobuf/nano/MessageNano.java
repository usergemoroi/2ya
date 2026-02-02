/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.protobuf.nano;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNanoPrinter;
import java.io.IOException;
import java.util.Arrays;

public abstract class MessageNano {
    protected volatile int cachedSize = -1;

    public static final <T extends MessageNano> T mergeFrom(T t13, byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(t13, byArray, 0, byArray.length);
    }

    public static final <T extends MessageNano> T mergeFrom(T t13, byte[] object, int n10, int n13) throws InvalidProtocolBufferNanoException {
        try {
            object = CodedInputByteBufferNano.newInstance((byte[])object, n10, n13);
            t13.mergeFrom((CodedInputByteBufferNano)object);
            ((CodedInputByteBufferNano)object).checkLastTagWas(0);
        }
        catch (InvalidProtocolBufferNanoException invalidProtocolBufferNanoException) {
        }
        catch (IOException iOException) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return t13;
        throw invalidProtocolBufferNanoException;
    }

    public static final boolean messageNanoEquals(MessageNano messageNano, MessageNano messageNano2) {
        if (messageNano == messageNano2) {
            return true;
        }
        if (messageNano != null && messageNano2 != null) {
            if (messageNano.getClass() != messageNano2.getClass()) {
                return false;
            }
            int n10 = messageNano.getSerializedSize();
            if (messageNano2.getSerializedSize() != n10) {
                return false;
            }
            byte[] byArray = new byte[n10];
            byte[] byArray2 = new byte[n10];
            MessageNano.toByteArray(messageNano, byArray, 0, n10);
            MessageNano.toByteArray(messageNano2, byArray2, 0, n10);
            return Arrays.equals(byArray, byArray2);
        }
        return false;
    }

    public static final void toByteArray(MessageNano messageNano, byte[] object, int n10, int n13) {
        try {
            object = CodedOutputByteBufferNano.newInstance((byte[])object, n10, n13);
            messageNano.writeTo((CodedOutputByteBufferNano)object);
            ((CodedOutputByteBufferNano)object).checkNoSpaceLeft();
            return;
        }
        catch (IOException iOException) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", iOException);
        }
    }

    public static final byte[] toByteArray(MessageNano messageNano) {
        int n10 = messageNano.getSerializedSize();
        byte[] byArray = new byte[n10];
        MessageNano.toByteArray(messageNano, byArray, 0, n10);
        return byArray;
    }

    public MessageNano clone() throws CloneNotSupportedException {
        return (MessageNano)super.clone();
    }

    protected int computeSerializedSize() {
        return 0;
    }

    public int getCachedSize() {
        if (this.cachedSize < 0) {
            this.getSerializedSize();
        }
        return this.cachedSize;
    }

    public int getSerializedSize() {
        int n10;
        this.cachedSize = n10 = this.computeSerializedSize();
        return n10;
    }

    public abstract MessageNano mergeFrom(CodedInputByteBufferNano var1) throws IOException;

    public String toString() {
        return MessageNanoPrinter.print(this);
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
    }
}


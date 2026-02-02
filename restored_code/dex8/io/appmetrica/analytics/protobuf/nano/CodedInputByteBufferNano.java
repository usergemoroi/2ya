/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.protobuf.nano;

import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class CodedInputByteBufferNano {
    private static final int DEFAULT_RECURSION_LIMIT = 64;
    private static final int DEFAULT_SIZE_LIMIT = 0x4000000;
    private final byte[] buffer;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int bufferStart;
    private int currentLimit = Integer.MAX_VALUE;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit = 64;
    private int sizeLimit = 0x4000000;

    private CodedInputByteBufferNano(byte[] byArray, int n10, int n13) {
        this.buffer = byArray;
        this.bufferStart = n10;
        this.bufferSize = n13 + n10;
        this.bufferPos = n10;
    }

    public static int decodeZigZag32(int n10) {
        return -(n10 & 1) ^ n10 >>> 1;
    }

    public static long decodeZigZag64(long l10) {
        return -(l10 & 1L) ^ l10 >>> 1;
    }

    public static CodedInputByteBufferNano newInstance(byte[] byArray) {
        return CodedInputByteBufferNano.newInstance(byArray, 0, byArray.length);
    }

    public static CodedInputByteBufferNano newInstance(byte[] byArray, int n10, int n13) {
        return new CodedInputByteBufferNano(byArray, n10, n13);
    }

    private void recomputeBufferSizeAfterLimit() {
        int n10;
        this.bufferSize = n10 = this.bufferSize + this.bufferSizeAfterLimit;
        int n13 = this.currentLimit;
        if (n10 > n13) {
            this.bufferSizeAfterLimit = n13 = n10 - n13;
            this.bufferSize = n10 - n13;
        } else {
            this.bufferSizeAfterLimit = 0;
        }
    }

    public void checkLastTagWas(int n10) throws InvalidProtocolBufferNanoException {
        if (this.lastTag == n10) {
            return;
        }
        throw InvalidProtocolBufferNanoException.invalidEndTag();
    }

    public int getBytesUntilLimit() {
        int n10 = this.currentLimit;
        if (n10 == Integer.MAX_VALUE) {
            return -1;
        }
        return n10 - this.bufferPos;
    }

    public byte[] getData(int n10, int n13) {
        if (n13 == 0) {
            return WireFormatNano.EMPTY_BYTES;
        }
        byte[] byArray = new byte[n13];
        int n14 = this.bufferStart;
        System.arraycopy(this.buffer, n14 + n10, byArray, 0, n13);
        return byArray;
    }

    public int getPosition() {
        return this.bufferPos - this.bufferStart;
    }

    public boolean isAtEnd() {
        boolean bl2 = this.bufferPos == this.bufferSize;
        return bl2;
    }

    public void popLimit(int n10) {
        this.currentLimit = n10;
        this.recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int n10) throws InvalidProtocolBufferNanoException {
        if (n10 >= 0) {
            int n13 = this.currentLimit;
            if ((n10 += this.bufferPos) <= n13) {
                this.currentLimit = n10;
                this.recomputeBufferSizeAfterLimit();
                return n13;
            }
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        throw InvalidProtocolBufferNanoException.negativeSize();
    }

    public boolean readBool() throws IOException {
        boolean bl2 = this.readRawVarint32() != 0;
        return bl2;
    }

    public byte[] readBytes() throws IOException {
        int n10;
        int n13;
        int n14 = this.readRawVarint32();
        if (n14 <= (n13 = this.bufferSize) - (n10 = this.bufferPos) && n14 > 0) {
            byte[] byArray = new byte[n14];
            System.arraycopy(this.buffer, n10, byArray, 0, n14);
            this.bufferPos += n14;
            return byArray;
        }
        if (n14 == 0) {
            return WireFormatNano.EMPTY_BYTES;
        }
        return this.readRawBytes(n14);
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(this.readRawLittleEndian64());
    }

    public int readEnum() throws IOException {
        return this.readRawVarint32();
    }

    public int readFixed32() throws IOException {
        return this.readRawLittleEndian32();
    }

    public long readFixed64() throws IOException {
        return this.readRawLittleEndian64();
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(this.readRawLittleEndian32());
    }

    public void readGroup(MessageNano messageNano, int n10) throws IOException {
        int n13 = this.recursionDepth;
        if (n13 < this.recursionLimit) {
            this.recursionDepth = n13 + 1;
            messageNano.mergeFrom(this);
            this.checkLastTagWas(WireFormatNano.makeTag(n10, 4));
            --this.recursionDepth;
            return;
        }
        throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
    }

    public int readInt32() throws IOException {
        return this.readRawVarint32();
    }

    public long readInt64() throws IOException {
        return this.readRawVarint64();
    }

    public void readMessage(MessageNano messageNano) throws IOException {
        int n10 = this.readRawVarint32();
        if (this.recursionDepth < this.recursionLimit) {
            n10 = this.pushLimit(n10);
            ++this.recursionDepth;
            messageNano.mergeFrom(this);
            this.checkLastTagWas(0);
            --this.recursionDepth;
            this.popLimit(n10);
            return;
        }
        throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
    }

    Object readPrimitiveField(int n10) throws IOException {
        switch (n10) {
            default: {
                StringBuilder stringBuilder = new StringBuilder("Unknown type ");
                stringBuilder.append(n10);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            case 18: {
                return this.readSInt64();
            }
            case 17: {
                return this.readSInt32();
            }
            case 16: {
                return this.readSFixed64();
            }
            case 15: {
                return this.readSFixed32();
            }
            case 14: {
                return this.readEnum();
            }
            case 13: {
                return this.readUInt32();
            }
            case 12: {
                return this.readBytes();
            }
            case 9: {
                return this.readString();
            }
            case 8: {
                return this.readBool();
            }
            case 7: {
                return this.readFixed32();
            }
            case 6: {
                return this.readFixed64();
            }
            case 5: {
                return this.readInt32();
            }
            case 4: {
                return this.readUInt64();
            }
            case 3: {
                return this.readInt64();
            }
            case 2: {
                return Float.valueOf(this.readFloat());
            }
            case 1: 
        }
        return this.readDouble();
    }

    public byte readRawByte() throws IOException {
        int n10 = this.bufferPos;
        if (n10 != this.bufferSize) {
            byte[] byArray = this.buffer;
            this.bufferPos = n10 + 1;
            return byArray[n10];
        }
        throw InvalidProtocolBufferNanoException.truncatedMessage();
    }

    public byte[] readRawBytes(int n10) throws IOException {
        if (n10 >= 0) {
            int n13 = this.bufferPos;
            int n14 = this.currentLimit;
            if (n13 + n10 <= n14) {
                if (n10 <= this.bufferSize - n13) {
                    byte[] byArray = new byte[n10];
                    System.arraycopy(this.buffer, n13, byArray, 0, n10);
                    this.bufferPos += n10;
                    return byArray;
                }
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            }
            this.skipRawBytes(n14 - n13);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        throw InvalidProtocolBufferNanoException.negativeSize();
    }

    public int readRawLittleEndian32() throws IOException {
        return this.readRawByte() & 0xFF | (this.readRawByte() & 0xFF) << 8 | (this.readRawByte() & 0xFF) << 16 | (this.readRawByte() & 0xFF) << 24;
    }

    public long readRawLittleEndian64() throws IOException {
        byte by = this.readRawByte();
        byte by3 = this.readRawByte();
        byte by4 = this.readRawByte();
        byte by5 = this.readRawByte();
        byte by6 = this.readRawByte();
        byte by7 = this.readRawByte();
        byte by8 = this.readRawByte();
        byte by9 = this.readRawByte();
        long l10 = by;
        return ((long)by3 & 0xFFL) << 8 | l10 & 0xFFL | ((long)by4 & 0xFFL) << 16 | ((long)by5 & 0xFFL) << 24 | ((long)by6 & 0xFFL) << 32 | ((long)by7 & 0xFFL) << 40 | ((long)by8 & 0xFFL) << 48 | ((long)by9 & 0xFFL) << 56;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int readRawVarint32() throws IOException {
        int n10 = this.readRawByte();
        if (n10 >= 0) {
            return n10;
        }
        n10 &= 0x7F;
        int n13 = this.readRawByte();
        if (n13 >= 0) {
            n13 <<= 7;
            return n10 |= n13;
        }
        n10 |= (n13 & 0x7F) << 7;
        n13 = this.readRawByte();
        if (n13 >= 0) {
            n13 <<= 14;
            return n10 |= n13;
        }
        n10 |= (n13 & 0x7F) << 14;
        n13 = this.readRawByte();
        if (n13 >= 0) {
            n13 <<= 21;
            return n10 |= n13;
        }
        byte by = this.readRawByte();
        n10 = n13 = n10 | (n13 & 0x7F) << 21 | by << 28;
        if (by >= 0) return n10;
        n10 = 0;
        while (n10 < 5) {
            if (this.readRawByte() >= 0) {
                return n13;
            }
            ++n10;
        }
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    public long readRawVarint64() throws IOException {
        long l10 = 0L;
        for (int i14 = 0; i14 < 64; i14 += 7) {
            byte by = this.readRawByte();
            l10 |= (long)(by & 0x7F) << i14;
            if ((by & 0x80) != 0) continue;
            return l10;
        }
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    public int readSFixed32() throws IOException {
        return this.readRawLittleEndian32();
    }

    public long readSFixed64() throws IOException {
        return this.readRawLittleEndian64();
    }

    public int readSInt32() throws IOException {
        return CodedInputByteBufferNano.decodeZigZag32(this.readRawVarint32());
    }

    public long readSInt64() throws IOException {
        return CodedInputByteBufferNano.decodeZigZag64(this.readRawVarint64());
    }

    public String readString() throws IOException {
        int n10;
        int n13;
        int n14 = this.readRawVarint32();
        if (n14 <= (n13 = this.bufferSize) - (n10 = this.bufferPos) && n14 > 0) {
            String string2 = new String(this.buffer, n10, n14, InternalNano.UTF_8);
            this.bufferPos += n14;
            return string2;
        }
        return new String(this.readRawBytes(n14), InternalNano.UTF_8);
    }

    public int readTag() throws IOException {
        int n10;
        if (this.isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        this.lastTag = n10 = this.readRawVarint32();
        if (n10 != 0) {
            return n10;
        }
        throw InvalidProtocolBufferNanoException.invalidTag();
    }

    public int readUInt32() throws IOException {
        return this.readRawVarint32();
    }

    public long readUInt64() throws IOException {
        return this.readRawVarint64();
    }

    public void resetSizeCounter() {
    }

    public void rewindToPosition(int n10) {
        int n13 = this.bufferPos;
        int n14 = this.bufferStart;
        if (n10 <= n13 - n14) {
            if (n10 >= 0) {
                this.bufferPos = n14 + n10;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("Bad position ");
            stringBuilder.append(n10);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder("Position ");
        stringBuilder.append(n10);
        stringBuilder.append(" is beyond current ");
        stringBuilder.append(this.bufferPos - this.bufferStart);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public int setRecursionLimit(int n10) {
        if (n10 >= 0) {
            int n13 = this.recursionLimit;
            this.recursionLimit = n10;
            return n13;
        }
        StringBuilder stringBuilder = new StringBuilder("Recursion limit cannot be negative: ");
        stringBuilder.append(n10);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public int setSizeLimit(int n10) {
        if (n10 >= 0) {
            int n13 = this.sizeLimit;
            this.sizeLimit = n10;
            return n13;
        }
        StringBuilder stringBuilder = new StringBuilder("Size limit cannot be negative: ");
        stringBuilder.append(n10);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public boolean skipField(int n10) throws IOException {
        int n13 = WireFormatNano.getTagWireType(n10);
        if (n13 != 0) {
            if (n13 != 1) {
                if (n13 != 2) {
                    if (n13 != 3) {
                        if (n13 != 4) {
                            if (n13 == 5) {
                                this.readRawLittleEndian32();
                                return true;
                            }
                            throw InvalidProtocolBufferNanoException.invalidWireType();
                        }
                        return false;
                    }
                    this.skipMessage();
                    this.checkLastTagWas(WireFormatNano.makeTag(WireFormatNano.getTagFieldNumber(n10), 4));
                    return true;
                }
                this.skipRawBytes(this.readRawVarint32());
                return true;
            }
            this.readRawLittleEndian64();
            return true;
        }
        this.readInt32();
        return true;
    }

    public void skipMessage() throws IOException {
        int n10;
        while ((n10 = this.readTag()) != 0 && this.skipField(n10)) {
        }
    }

    public void skipRawBytes(int n10) throws IOException {
        if (n10 >= 0) {
            int n13 = this.bufferPos;
            int n14 = n13 + n10;
            int n15 = this.currentLimit;
            if (n14 <= n15) {
                if (n10 <= this.bufferSize - n13) {
                    this.bufferPos = n14;
                    return;
                }
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            }
            this.skipRawBytes(n15 - n13);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        throw InvalidProtocolBufferNanoException.negativeSize();
    }
}


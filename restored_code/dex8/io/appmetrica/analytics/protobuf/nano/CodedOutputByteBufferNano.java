/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.protobuf.nano;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class CodedOutputByteBufferNano {
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;
    private static final int MAX_UTF8_EXPANSION = 3;
    private final ByteBuffer buffer;

    private CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    private CodedOutputByteBufferNano(byte[] byArray, int n10, int n13) {
        this(ByteBuffer.wrap(byArray, n10, n13));
    }

    public static int computeBoolSize(int n10, boolean bl2) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeBoolSizeNoTag(bl2) + n10;
    }

    public static int computeBoolSizeNoTag(boolean bl2) {
        return 1;
    }

    public static int computeBytesSize(int n10, byte[] byArray) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeBytesSizeNoTag(byArray) + n10;
    }

    public static int computeBytesSizeNoTag(byte[] byArray) {
        return CodedOutputByteBufferNano.computeRawVarint32Size(byArray.length) + byArray.length;
    }

    public static int computeDoubleSize(int n10, double d14) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeDoubleSizeNoTag(d14) + n10;
    }

    public static int computeDoubleSizeNoTag(double d14) {
        return 8;
    }

    public static int computeEnumSize(int n10, int n13) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeEnumSizeNoTag(n13) + n10;
    }

    public static int computeEnumSizeNoTag(int n10) {
        return CodedOutputByteBufferNano.computeRawVarint32Size(n10);
    }

    static int computeFieldSize(int n10, int n13, Object object) {
        switch (n13) {
            default: {
                object = new StringBuilder("Unknown type: ");
                ((StringBuilder)object).append(n13);
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            case 18: {
                return CodedOutputByteBufferNano.computeSInt64Size(n10, (Long)object);
            }
            case 17: {
                return CodedOutputByteBufferNano.computeSInt32Size(n10, (Integer)object);
            }
            case 16: {
                return CodedOutputByteBufferNano.computeSFixed64Size(n10, (Long)object);
            }
            case 15: {
                return CodedOutputByteBufferNano.computeSFixed32Size(n10, (Integer)object);
            }
            case 14: {
                return CodedOutputByteBufferNano.computeEnumSize(n10, (Integer)object);
            }
            case 13: {
                return CodedOutputByteBufferNano.computeUInt32Size(n10, (Integer)object);
            }
            case 12: {
                return CodedOutputByteBufferNano.computeBytesSize(n10, (byte[])object);
            }
            case 11: {
                return CodedOutputByteBufferNano.computeMessageSize(n10, (MessageNano)object);
            }
            case 10: {
                return CodedOutputByteBufferNano.computeGroupSize(n10, (MessageNano)object);
            }
            case 9: {
                return CodedOutputByteBufferNano.computeStringSize(n10, (String)object);
            }
            case 8: {
                return CodedOutputByteBufferNano.computeBoolSize(n10, (Boolean)object);
            }
            case 7: {
                return CodedOutputByteBufferNano.computeFixed32Size(n10, (Integer)object);
            }
            case 6: {
                return CodedOutputByteBufferNano.computeFixed64Size(n10, (Long)object);
            }
            case 5: {
                return CodedOutputByteBufferNano.computeInt32Size(n10, (Integer)object);
            }
            case 4: {
                return CodedOutputByteBufferNano.computeUInt64Size(n10, (Long)object);
            }
            case 3: {
                return CodedOutputByteBufferNano.computeInt64Size(n10, (Long)object);
            }
            case 2: {
                return CodedOutputByteBufferNano.computeFloatSize(n10, ((Float)object).floatValue());
            }
            case 1: 
        }
        return CodedOutputByteBufferNano.computeDoubleSize(n10, (Double)object);
    }

    public static int computeFixed32Size(int n10, int n13) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeFixed32SizeNoTag(n13) + n10;
    }

    public static int computeFixed32SizeNoTag(int n10) {
        return 4;
    }

    public static int computeFixed64Size(int n10, long l10) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeFixed64SizeNoTag(l10) + n10;
    }

    public static int computeFixed64SizeNoTag(long l10) {
        return 8;
    }

    public static int computeFloatSize(int n10, float f11) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeFloatSizeNoTag(f11) + n10;
    }

    public static int computeFloatSizeNoTag(float f11) {
        return 4;
    }

    public static int computeGroupSize(int n10, MessageNano messageNano) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeGroupSizeNoTag(messageNano) + n10 * 2;
    }

    public static int computeGroupSizeNoTag(MessageNano messageNano) {
        return messageNano.getSerializedSize();
    }

    public static int computeInt32Size(int n10, int n13) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeInt32SizeNoTag(n13) + n10;
    }

    public static int computeInt32SizeNoTag(int n10) {
        if (n10 >= 0) {
            return CodedOutputByteBufferNano.computeRawVarint32Size(n10);
        }
        return 10;
    }

    public static int computeInt64Size(int n10, long l10) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeInt64SizeNoTag(l10) + n10;
    }

    public static int computeInt64SizeNoTag(long l10) {
        return CodedOutputByteBufferNano.computeRawVarint64Size(l10);
    }

    public static int computeMessageSize(int n10, MessageNano messageNano) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeMessageSizeNoTag(messageNano) + n10;
    }

    public static int computeMessageSizeNoTag(MessageNano messageNano) {
        int n10 = messageNano.getSerializedSize();
        return CodedOutputByteBufferNano.computeRawVarint32Size(n10) + n10;
    }

    public static int computeRawVarint32Size(int n10) {
        if ((n10 & 0xFFFFFF80) == 0) {
            return 1;
        }
        if ((n10 & 0xFFFFC000) == 0) {
            return 2;
        }
        if ((0xFFE00000 & n10) == 0) {
            return 3;
        }
        if ((n10 & 0xF0000000) == 0) {
            return 4;
        }
        return 5;
    }

    public static int computeRawVarint64Size(long l10) {
        if ((0xFFFFFFFFFFFFFF80L & l10) == 0L) {
            return 1;
        }
        if ((0xFFFFFFFFFFFFC000L & l10) == 0L) {
            return 2;
        }
        if ((0xFFFFFFFFFFE00000L & l10) == 0L) {
            return 3;
        }
        if ((0xFFFFFFFFF0000000L & l10) == 0L) {
            return 4;
        }
        if ((0xFFFFFFF800000000L & l10) == 0L) {
            return 5;
        }
        if ((0xFFFFFC0000000000L & l10) == 0L) {
            return 6;
        }
        if ((0xFFFE000000000000L & l10) == 0L) {
            return 7;
        }
        if ((0xFF00000000000000L & l10) == 0L) {
            return 8;
        }
        if ((l10 & Long.MIN_VALUE) == 0L) {
            return 9;
        }
        return 10;
    }

    public static int computeSFixed32Size(int n10, int n13) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeSFixed32SizeNoTag(n13) + n10;
    }

    public static int computeSFixed32SizeNoTag(int n10) {
        return 4;
    }

    public static int computeSFixed64Size(int n10, long l10) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeSFixed64SizeNoTag(l10) + n10;
    }

    public static int computeSFixed64SizeNoTag(long l10) {
        return 8;
    }

    public static int computeSInt32Size(int n10, int n13) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeSInt32SizeNoTag(n13) + n10;
    }

    public static int computeSInt32SizeNoTag(int n10) {
        return CodedOutputByteBufferNano.computeRawVarint32Size(CodedOutputByteBufferNano.encodeZigZag32(n10));
    }

    public static int computeSInt64Size(int n10, long l10) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeSInt64SizeNoTag(l10) + n10;
    }

    public static int computeSInt64SizeNoTag(long l10) {
        return CodedOutputByteBufferNano.computeRawVarint64Size(CodedOutputByteBufferNano.encodeZigZag64(l10));
    }

    public static int computeStringSize(int n10, String string2) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeStringSizeNoTag(string2) + n10;
    }

    public static int computeStringSizeNoTag(String string2) {
        int n10 = CodedOutputByteBufferNano.encodedLength(string2);
        return CodedOutputByteBufferNano.computeRawVarint32Size(n10) + n10;
    }

    public static int computeTagSize(int n10) {
        return CodedOutputByteBufferNano.computeRawVarint32Size(WireFormatNano.makeTag(n10, 0));
    }

    public static int computeUInt32Size(int n10, int n13) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeUInt32SizeNoTag(n13) + n10;
    }

    public static int computeUInt32SizeNoTag(int n10) {
        return CodedOutputByteBufferNano.computeRawVarint32Size(n10);
    }

    public static int computeUInt64Size(int n10, long l10) {
        n10 = CodedOutputByteBufferNano.computeTagSize(n10);
        return CodedOutputByteBufferNano.computeUInt64SizeNoTag(l10) + n10;
    }

    public static int computeUInt64SizeNoTag(long l10) {
        return CodedOutputByteBufferNano.computeRawVarint64Size(l10);
    }

    private static int encode(CharSequence charSequence, byte[] byArray, int n10, int n13) {
        int n14;
        int n15;
        int n16 = charSequence.length();
        int n17 = n13 + n10;
        for (n13 = 0; n13 < n16 && (n15 = n13 + n10) < n17 && (n14 = charSequence.charAt(n13)) < 128; ++n13) {
            byArray[n15] = (byte)n14;
        }
        if (n13 == n16) {
            return n10 + n16;
        }
        n10 += n13;
        while (n13 < n16) {
            char c11;
            block10: {
                block11: {
                    block12: {
                        block7: {
                            block9: {
                                block8: {
                                    block6: {
                                        c11 = charSequence.charAt(n13);
                                        if (c11 >= '\u0080' || n10 >= n17) break block6;
                                        byArray[n10] = (byte)c11;
                                        ++n10;
                                        break block7;
                                    }
                                    if (c11 >= '\u0800' || n10 > n17 - 2) break block8;
                                    byArray[n10] = (byte)(c11 >>> 6 | 0x3C0);
                                    n14 = n10 + 2;
                                    byArray[n10 + 1] = (byte)(c11 & 0x3F | 0x80);
                                    n10 = n14;
                                    break block7;
                                }
                                if (c11 >= '\ud800' && '\udfff' >= c11 || n10 > n17 - 3) break block9;
                                byArray[n10] = (byte)(c11 >>> 12 | 0x1E0);
                                byArray[n10 + 1] = (byte)(c11 >>> 6 & 0x3F | 0x80);
                                n14 = n10 + 3;
                                byArray[n10 + 2] = (byte)(c11 & 0x3F | 0x80);
                                n10 = n14;
                                break block7;
                            }
                            if (n10 > n17 - 4) break block10;
                            n14 = n13 + 1;
                            if (n14 == charSequence.length()) break block11;
                            char c13 = charSequence.charAt(n14);
                            if (!Character.isSurrogatePair(c11, c13)) break block12;
                            n13 = Character.toCodePoint(c11, c13);
                            byArray[n10] = (byte)(n13 >>> 18 | 0xF0);
                            byArray[n10 + 1] = (byte)(n13 >>> 12 & 0x3F | 0x80);
                            byArray[n10 + 2] = (byte)(n13 >>> 6 & 0x3F | 0x80);
                            n15 = n10 + 4;
                            byArray[n10 + 3] = (byte)(n13 & 0x3F | 0x80);
                            n13 = n14;
                            n10 = n15;
                        }
                        ++n13;
                        continue;
                    }
                    n13 = n14;
                }
                charSequence = new StringBuilder("Unpaired surrogate at index ");
                ((StringBuilder)charSequence).append(n13 - 1);
                throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
            }
            charSequence = new StringBuilder("Failed writing ");
            ((StringBuilder)charSequence).append(c11);
            ((StringBuilder)charSequence).append(" at index ");
            ((StringBuilder)charSequence).append(n10);
            throw new ArrayIndexOutOfBoundsException(((StringBuilder)charSequence).toString());
        }
        return n10;
    }

    private static void encode(CharSequence object, ByteBuffer byteBuffer) {
        if (!byteBuffer.isReadOnly()) {
            if (byteBuffer.hasArray()) {
                try {
                    byteBuffer.position(CodedOutputByteBufferNano.encode((CharSequence)object, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    object = new BufferOverflowException();
                    ((Throwable)object).initCause(arrayIndexOutOfBoundsException);
                    throw object;
                }
            } else {
                CodedOutputByteBufferNano.encodeDirect((CharSequence)object, byteBuffer);
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }

    private static void encodeDirect(CharSequence charSequence, ByteBuffer byteBuffer) {
        int n10 = charSequence.length();
        for (int i14 = 0; i14 < n10; ++i14) {
            char c11 = charSequence.charAt(i14);
            if (c11 < '\u0080') {
                byteBuffer.put((byte)c11);
                continue;
            }
            if (c11 < '\u0800') {
                byteBuffer.put((byte)(c11 >>> 6 | 0x3C0));
                byteBuffer.put((byte)(c11 & 0x3F | 0x80));
                continue;
            }
            if (c11 >= '\ud800' && '\udfff' >= c11) {
                int n13 = i14 + 1;
                if (n13 != charSequence.length()) {
                    char c13 = charSequence.charAt(n13);
                    if (Character.isSurrogatePair(c11, c13)) {
                        i14 = Character.toCodePoint(c11, c13);
                        byteBuffer.put((byte)(i14 >>> 18 | 0xF0));
                        byteBuffer.put((byte)(i14 >>> 12 & 0x3F | 0x80));
                        byteBuffer.put((byte)(i14 >>> 6 & 0x3F | 0x80));
                        byteBuffer.put((byte)(i14 & 0x3F | 0x80));
                        i14 = n13;
                        continue;
                    }
                    i14 = n13;
                }
                charSequence = new StringBuilder("Unpaired surrogate at index ");
                ((StringBuilder)charSequence).append(i14 - 1);
                throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
            }
            byteBuffer.put((byte)(c11 >>> 12 | 0x1E0));
            byteBuffer.put((byte)(c11 >>> 6 & 0x3F | 0x80));
            byteBuffer.put((byte)(c11 & 0x3F | 0x80));
        }
    }

    public static int encodeZigZag32(int n10) {
        return n10 >> 31 ^ n10 << 1;
    }

    public static long encodeZigZag64(long l10) {
        return l10 >> 63 ^ l10 << 1;
    }

    private static int encodedLength(CharSequence charSequence) {
        int n10;
        int n13;
        block3: {
            int n14;
            n13 = charSequence.length();
            for (n14 = 0; n14 < n13 && charSequence.charAt(n14) < '\u0080'; ++n14) {
            }
            int n15 = n13;
            while (true) {
                n10 = n15;
                if (n14 >= n13) break block3;
                n10 = charSequence.charAt(n14);
                if (n10 >= 2048) break;
                n15 += 127 - n10 >>> 31;
                ++n14;
            }
            n10 = n15 + CodedOutputByteBufferNano.encodedLengthGeneral(charSequence, n14);
        }
        if (n10 >= n13) {
            return n10;
        }
        charSequence = new StringBuilder("UTF-8 length does not fit in int: ");
        ((StringBuilder)charSequence).append((long)n10 + 0x100000000L);
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int n10) {
        int n13 = charSequence.length();
        int n14 = 0;
        while (n10 < n13) {
            int n15;
            char c11 = charSequence.charAt(n10);
            if (c11 < '\u0800') {
                n14 += 127 - c11 >>> 31;
                n15 = n10;
            } else {
                int n16;
                n14 = n16 = n14 + 2;
                n15 = n10;
                if ('\ud800' <= c11) {
                    n14 = n16;
                    n15 = n10;
                    if (c11 <= '\udfff') {
                        if (Character.codePointAt(charSequence, n10) >= 65536) {
                            n15 = n10 + 1;
                            n14 = n16;
                        } else {
                            charSequence = new StringBuilder("Unpaired surrogate at index ");
                            ((StringBuilder)charSequence).append(n10);
                            throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
                        }
                    }
                }
            }
            n10 = n15 + 1;
        }
        return n14;
    }

    public static CodedOutputByteBufferNano newInstance(byte[] byArray) {
        return CodedOutputByteBufferNano.newInstance(byArray, 0, byArray.length);
    }

    public static CodedOutputByteBufferNano newInstance(byte[] byArray, int n10, int n13) {
        return new CodedOutputByteBufferNano(byArray, n10, n13);
    }

    public void checkNoSpaceLeft() {
        if (this.spaceLeft() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public int position() {
        return this.buffer.position();
    }

    public void reset() {
        this.buffer.clear();
    }

    public int spaceLeft() {
        return this.buffer.remaining();
    }

    public void writeBool(int n10, boolean bl2) throws IOException {
        this.writeTag(n10, 0);
        this.writeBoolNoTag(bl2);
    }

    public void writeBoolNoTag(boolean bl2) throws IOException {
        this.writeRawByte(bl2 ? 1 : 0);
    }

    public void writeBytes(int n10, byte[] byArray) throws IOException {
        this.writeTag(n10, 2);
        this.writeBytesNoTag(byArray);
    }

    public void writeBytesNoTag(byte[] byArray) throws IOException {
        this.writeRawVarint32(byArray.length);
        this.writeRawBytes(byArray);
    }

    public void writeDouble(int n10, double d14) throws IOException {
        this.writeTag(n10, 1);
        this.writeDoubleNoTag(d14);
    }

    public void writeDoubleNoTag(double d14) throws IOException {
        this.writeRawLittleEndian64(Double.doubleToLongBits(d14));
    }

    public void writeEnum(int n10, int n13) throws IOException {
        this.writeTag(n10, 0);
        this.writeEnumNoTag(n13);
    }

    public void writeEnumNoTag(int n10) throws IOException {
        this.writeRawVarint32(n10);
    }

    void writeField(int n10, int n13, Object object) throws IOException {
        switch (n13) {
            default: {
                object = new StringBuilder("Unknown type: ");
                ((StringBuilder)object).append(n13);
                throw new IOException(((StringBuilder)object).toString());
            }
            case 18: {
                this.writeSInt64(n10, (Long)object);
                break;
            }
            case 17: {
                this.writeSInt32(n10, (Integer)object);
                break;
            }
            case 16: {
                this.writeSFixed64(n10, (Long)object);
                break;
            }
            case 15: {
                this.writeSFixed32(n10, (Integer)object);
                break;
            }
            case 14: {
                this.writeEnum(n10, (Integer)object);
                break;
            }
            case 13: {
                this.writeUInt32(n10, (Integer)object);
                break;
            }
            case 12: {
                this.writeBytes(n10, (byte[])object);
                break;
            }
            case 11: {
                this.writeMessage(n10, (MessageNano)object);
                break;
            }
            case 10: {
                this.writeGroup(n10, (MessageNano)object);
                break;
            }
            case 9: {
                this.writeString(n10, (String)object);
                break;
            }
            case 8: {
                this.writeBool(n10, (Boolean)object);
                break;
            }
            case 7: {
                this.writeFixed32(n10, (Integer)object);
                break;
            }
            case 6: {
                this.writeFixed64(n10, (Long)object);
                break;
            }
            case 5: {
                this.writeInt32(n10, (Integer)object);
                break;
            }
            case 4: {
                this.writeUInt64(n10, (Long)object);
                break;
            }
            case 3: {
                this.writeInt64(n10, (Long)object);
                break;
            }
            case 2: {
                this.writeFloat(n10, ((Float)object).floatValue());
                break;
            }
            case 1: {
                this.writeDouble(n10, (Double)object);
            }
        }
    }

    public void writeFixed32(int n10, int n13) throws IOException {
        this.writeTag(n10, 5);
        this.writeFixed32NoTag(n13);
    }

    public void writeFixed32NoTag(int n10) throws IOException {
        this.writeRawLittleEndian32(n10);
    }

    public void writeFixed64(int n10, long l10) throws IOException {
        this.writeTag(n10, 1);
        this.writeFixed64NoTag(l10);
    }

    public void writeFixed64NoTag(long l10) throws IOException {
        this.writeRawLittleEndian64(l10);
    }

    public void writeFloat(int n10, float f11) throws IOException {
        this.writeTag(n10, 5);
        this.writeFloatNoTag(f11);
    }

    public void writeFloatNoTag(float f11) throws IOException {
        this.writeRawLittleEndian32(Float.floatToIntBits(f11));
    }

    public void writeGroup(int n10, MessageNano messageNano) throws IOException {
        this.writeTag(n10, 3);
        this.writeGroupNoTag(messageNano);
        this.writeTag(n10, 4);
    }

    public void writeGroupNoTag(MessageNano messageNano) throws IOException {
        messageNano.writeTo(this);
    }

    public void writeInt32(int n10, int n13) throws IOException {
        this.writeTag(n10, 0);
        this.writeInt32NoTag(n13);
    }

    public void writeInt32NoTag(int n10) throws IOException {
        if (n10 >= 0) {
            this.writeRawVarint32(n10);
        } else {
            this.writeRawVarint64(n10);
        }
    }

    public void writeInt64(int n10, long l10) throws IOException {
        this.writeTag(n10, 0);
        this.writeInt64NoTag(l10);
    }

    public void writeInt64NoTag(long l10) throws IOException {
        this.writeRawVarint64(l10);
    }

    public void writeMessage(int n10, MessageNano messageNano) throws IOException {
        this.writeTag(n10, 2);
        this.writeMessageNoTag(messageNano);
    }

    public void writeMessageNoTag(MessageNano messageNano) throws IOException {
        this.writeRawVarint32(messageNano.getCachedSize());
        messageNano.writeTo(this);
    }

    public void writeRawByte(byte by) throws IOException {
        if (this.buffer.hasRemaining()) {
            this.buffer.put(by);
            return;
        }
        throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
    }

    public void writeRawByte(int n10) throws IOException {
        this.writeRawByte((byte)n10);
    }

    public void writeRawBytes(byte[] byArray) throws IOException {
        this.writeRawBytes(byArray, 0, byArray.length);
    }

    public void writeRawBytes(byte[] byArray, int n10, int n13) throws IOException {
        if (this.buffer.remaining() >= n13) {
            this.buffer.put(byArray, n10, n13);
            return;
        }
        throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
    }

    public void writeRawLittleEndian32(int n10) throws IOException {
        if (this.buffer.remaining() >= 4) {
            this.buffer.putInt(n10);
            return;
        }
        throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
    }

    public void writeRawLittleEndian64(long l10) throws IOException {
        if (this.buffer.remaining() >= 8) {
            this.buffer.putLong(l10);
            return;
        }
        throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
    }

    public void writeRawVarint32(int n10) throws IOException {
        while (true) {
            if ((n10 & 0xFFFFFF80) == 0) {
                this.writeRawByte(n10);
                return;
            }
            this.writeRawByte(n10 & 0x7F | 0x80);
            n10 >>>= 7;
        }
    }

    public void writeRawVarint64(long l10) throws IOException {
        while (true) {
            if ((0xFFFFFFFFFFFFFF80L & l10) == 0L) {
                this.writeRawByte((int)l10);
                return;
            }
            this.writeRawByte((int)l10 & 0x7F | 0x80);
            l10 >>>= 7;
        }
    }

    public void writeSFixed32(int n10, int n13) throws IOException {
        this.writeTag(n10, 5);
        this.writeSFixed32NoTag(n13);
    }

    public void writeSFixed32NoTag(int n10) throws IOException {
        this.writeRawLittleEndian32(n10);
    }

    public void writeSFixed64(int n10, long l10) throws IOException {
        this.writeTag(n10, 1);
        this.writeSFixed64NoTag(l10);
    }

    public void writeSFixed64NoTag(long l10) throws IOException {
        this.writeRawLittleEndian64(l10);
    }

    public void writeSInt32(int n10, int n13) throws IOException {
        this.writeTag(n10, 0);
        this.writeSInt32NoTag(n13);
    }

    public void writeSInt32NoTag(int n10) throws IOException {
        this.writeRawVarint32(CodedOutputByteBufferNano.encodeZigZag32(n10));
    }

    public void writeSInt64(int n10, long l10) throws IOException {
        this.writeTag(n10, 0);
        this.writeSInt64NoTag(l10);
    }

    public void writeSInt64NoTag(long l10) throws IOException {
        this.writeRawVarint64(CodedOutputByteBufferNano.encodeZigZag64(l10));
    }

    public void writeString(int n10, String string2) throws IOException {
        this.writeTag(n10, 2);
        this.writeStringNoTag(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void writeStringNoTag(String object) throws IOException {
        BufferOverflowException bufferOverflowException2;
        block4: {
            int n10;
            int n13;
            try {
                n13 = CodedOutputByteBufferNano.computeRawVarint32Size(((String)object).length());
                if (n13 != CodedOutputByteBufferNano.computeRawVarint32Size(((String)object).length() * 3)) {
                    this.writeRawVarint32(CodedOutputByteBufferNano.encodedLength((CharSequence)object));
                    CodedOutputByteBufferNano.encode((CharSequence)object, this.buffer);
                    return;
                }
                n10 = this.buffer.position();
                if (this.buffer.remaining() >= n13) {
                    this.buffer.position(n10 + n13);
                    CodedOutputByteBufferNano.encode((CharSequence)object, this.buffer);
                    int n14 = this.buffer.position();
                    this.buffer.position(n10);
                    this.writeRawVarint32(n14 - n10 - n13);
                    this.buffer.position(n14);
                    return;
                }
            }
            catch (BufferOverflowException bufferOverflowException2) {
                break block4;
            }
            object = new OutOfSpaceException(n10 + n13, this.buffer.limit());
            throw object;
        }
        object = new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        ((Throwable)object).initCause(bufferOverflowException2);
        throw object;
    }

    public void writeTag(int n10, int n13) throws IOException {
        this.writeRawVarint32(WireFormatNano.makeTag(n10, n13));
    }

    public void writeUInt32(int n10, int n13) throws IOException {
        this.writeTag(n10, 0);
        this.writeUInt32NoTag(n13);
    }

    public void writeUInt32NoTag(int n10) throws IOException {
        this.writeRawVarint32(n10);
    }

    public void writeUInt64(int n10, long l10) throws IOException {
        this.writeTag(n10, 0);
        this.writeUInt64NoTag(l10);
    }

    public void writeUInt64NoTag(long l10) throws IOException {
        this.writeRawVarint64(l10);
    }

    public static class OutOfSpaceException
    extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException(int n10, int n13) {
            StringBuilder stringBuilder = new StringBuilder("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
            stringBuilder.append(n10);
            stringBuilder.append(" limit ");
            stringBuilder.append(n13);
            stringBuilder.append(").");
            super(stringBuilder.toString());
        }
    }
}


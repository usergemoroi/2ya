/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.protobuf.nano;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import java.io.IOException;

public final class WireFormatNano {
    public static final boolean[] EMPTY_BOOLEAN_ARRAY;
    public static final byte[] EMPTY_BYTES;
    public static final byte[][] EMPTY_BYTES_ARRAY;
    public static final double[] EMPTY_DOUBLE_ARRAY;
    public static final float[] EMPTY_FLOAT_ARRAY;
    public static final int[] EMPTY_INT_ARRAY;
    public static final long[] EMPTY_LONG_ARRAY;
    public static final String[] EMPTY_STRING_ARRAY;
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    static final int WIRETYPE_END_GROUP = 4;
    static final int WIRETYPE_FIXED32 = 5;
    static final int WIRETYPE_FIXED64 = 1;
    static final int WIRETYPE_LENGTH_DELIMITED = 2;
    static final int WIRETYPE_START_GROUP = 3;
    static final int WIRETYPE_VARINT = 0;

    static {
        EMPTY_INT_ARRAY = new int[0];
        EMPTY_LONG_ARRAY = new long[0];
        EMPTY_FLOAT_ARRAY = new float[0];
        EMPTY_DOUBLE_ARRAY = new double[0];
        EMPTY_BOOLEAN_ARRAY = new boolean[0];
        EMPTY_STRING_ARRAY = new String[0];
        EMPTY_BYTES_ARRAY = new byte[0][];
        EMPTY_BYTES = new byte[0];
    }

    private WireFormatNano() {
    }

    public static final int getRepeatedFieldArrayLength(CodedInputByteBufferNano codedInputByteBufferNano, int n10) throws IOException {
        int n13 = codedInputByteBufferNano.getPosition();
        codedInputByteBufferNano.skipField(n10);
        int n14 = 1;
        while (codedInputByteBufferNano.readTag() == n10) {
            codedInputByteBufferNano.skipField(n10);
            ++n14;
        }
        codedInputByteBufferNano.rewindToPosition(n13);
        return n14;
    }

    public static int getTagFieldNumber(int n10) {
        return n10 >>> 3;
    }

    static int getTagWireType(int n10) {
        return n10 & 7;
    }

    static int makeTag(int n10, int n13) {
        return n10 << 3 | n13;
    }

    public static boolean parseUnknownField(CodedInputByteBufferNano codedInputByteBufferNano, int n10) throws IOException {
        return codedInputByteBufferNano.skipField(n10);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.protobuf.nano;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.ExtendableMessageNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.UnknownFieldData;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Extension<M extends ExtendableMessageNano<M>, T> {
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_UINT64 = 4;
    protected final Class<T> clazz;
    protected final boolean repeated;
    public final int tag;
    protected final int type;

    private Extension(int n10, Class<T> clazz, int n13, boolean bl2) {
        this.type = n10;
        this.clazz = clazz;
        this.tag = n13;
        this.repeated = bl2;
    }

    @Deprecated
    public static <M extends ExtendableMessageNano<M>, T extends MessageNano> Extension<M, T> createMessageTyped(int n10, Class<T> clazz, int n13) {
        return new Extension<M, T>(n10, clazz, n13, false);
    }

    public static <M extends ExtendableMessageNano<M>, T extends MessageNano> Extension<M, T> createMessageTyped(int n10, Class<T> clazz, long l10) {
        return new Extension<M, T>(n10, clazz, (int)l10, false);
    }

    public static <M extends ExtendableMessageNano<M>, T> Extension<M, T> createPrimitiveTyped(int n10, Class<T> clazz, long l10) {
        return new PrimitiveExtension(n10, clazz, (int)l10, false, 0, 0);
    }

    public static <M extends ExtendableMessageNano<M>, T extends MessageNano> Extension<M, T[]> createRepeatedMessageTyped(int n10, Class<T[]> clazz, long l10) {
        return new Extension<M, T[]>(n10, clazz, (int)l10, true);
    }

    public static <M extends ExtendableMessageNano<M>, T> Extension<M, T> createRepeatedPrimitiveTyped(int n10, Class<T> clazz, long l10, long l11, long l13) {
        return new PrimitiveExtension(n10, clazz, (int)l10, true, (int)l11, (int)l13);
    }

    private T getRepeatedValueFrom(List<UnknownFieldData> object) {
        int n10;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n13 = 0;
        for (n10 = 0; n10 < object.size(); ++n10) {
            UnknownFieldData unknownFieldData = object.get(n10);
            if (unknownFieldData.bytes.length == 0) continue;
            this.readDataInto(unknownFieldData, arrayList);
        }
        int n14 = arrayList.size();
        if (n14 == 0) {
            return null;
        }
        object = this.clazz;
        object = ((Class)object).cast(Array.newInstance(((Class)object).getComponentType(), n14));
        for (n10 = n13; n10 < n14; ++n10) {
            Array.set(object, n10, arrayList.get(n10));
        }
        return (T)object;
    }

    private T getSingularValueFrom(List<UnknownFieldData> object) {
        if (object.isEmpty()) {
            return null;
        }
        object = object.get(object.size() - 1);
        return this.clazz.cast(this.readData(CodedInputByteBufferNano.newInstance(((UnknownFieldData)object).bytes)));
    }

    protected int computeRepeatedSerializedSize(Object object) {
        int n10 = Array.getLength(object);
        int n13 = 0;
        for (int i14 = 0; i14 < n10; ++i14) {
            int n14 = n13;
            if (Array.get(object, i14) != null) {
                n14 = n13 + this.computeSingularSerializedSize(Array.get(object, i14));
            }
            n13 = n14;
        }
        return n13;
    }

    int computeSerializedSize(Object object) {
        if (this.repeated) {
            return this.computeRepeatedSerializedSize(object);
        }
        return this.computeSingularSerializedSize(object);
    }

    protected int computeSingularSerializedSize(Object object) {
        int n10 = WireFormatNano.getTagFieldNumber(this.tag);
        int n13 = this.type;
        if (n13 != 10) {
            if (n13 == 11) {
                return CodedOutputByteBufferNano.computeMessageSize(n10, (MessageNano)object);
            }
            object = new StringBuilder("Unknown type ");
            ((StringBuilder)object).append(this.type);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        return CodedOutputByteBufferNano.computeGroupSize(n10, (MessageNano)object);
    }

    final T getValueFrom(List<UnknownFieldData> list) {
        if (list == null) {
            return null;
        }
        list = this.repeated ? this.getRepeatedValueFrom(list) : this.getSingularValueFrom(list);
        return (T)list;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected Object readData(CodedInputByteBufferNano object) {
        InstantiationException instantiationException2;
        Class<Object> clazz;
        block7: {
            IllegalAccessException illegalAccessException2;
            block6: {
                clazz = this.repeated ? this.clazz.getComponentType() : this.clazz;
                try {
                    int n10 = this.type;
                    if (n10 == 10) {
                        MessageNano messageNano = (MessageNano)clazz.newInstance();
                        ((CodedInputByteBufferNano)object).readGroup(messageNano, WireFormatNano.getTagFieldNumber(this.tag));
                        return messageNano;
                    }
                    if (n10 == 11) {
                        MessageNano messageNano = (MessageNano)clazz.newInstance();
                        ((CodedInputByteBufferNano)object).readMessage(messageNano);
                        return messageNano;
                    }
                }
                catch (IOException iOException) {
                    throw new IllegalArgumentException("Error reading extension field", iOException);
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block6;
                }
                catch (InstantiationException instantiationException2) {
                    break block7;
                }
                StringBuilder stringBuilder = new StringBuilder("Unknown type ");
                stringBuilder.append(this.type);
                object = new IllegalArgumentException(stringBuilder.toString());
                throw object;
            }
            StringBuilder stringBuilder = new StringBuilder("Error creating instance of class ");
            stringBuilder.append(clazz);
            throw new IllegalArgumentException(stringBuilder.toString(), illegalAccessException2);
        }
        object = new StringBuilder("Error creating instance of class ");
        ((StringBuilder)object).append(clazz);
        throw new IllegalArgumentException(((StringBuilder)object).toString(), instantiationException2);
    }

    protected void readDataInto(UnknownFieldData unknownFieldData, List<Object> list) {
        list.add(this.readData(CodedInputByteBufferNano.newInstance(unknownFieldData.bytes)));
    }

    protected void writeRepeatedData(Object object, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int n10 = Array.getLength(object);
        for (int i14 = 0; i14 < n10; ++i14) {
            Object object2 = Array.get(object, i14);
            if (object2 == null) continue;
            this.writeSingularData(object2, codedOutputByteBufferNano);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void writeSingularData(Object object, CodedOutputByteBufferNano object2) {
        try {
            ((CodedOutputByteBufferNano)object2).writeRawVarint32(this.tag);
            int n10 = this.type;
            if (n10 == 10) {
                object = (MessageNano)object;
                n10 = WireFormatNano.getTagFieldNumber(this.tag);
                ((CodedOutputByteBufferNano)object2).writeGroupNoTag((MessageNano)object);
                ((CodedOutputByteBufferNano)object2).writeTag(n10, 4);
                return;
            }
            if (n10 == 11) {
                ((CodedOutputByteBufferNano)object2).writeMessageNoTag((MessageNano)object);
                return;
            }
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException);
        }
        object2 = new StringBuilder("Unknown type ");
        ((StringBuilder)object2).append(this.type);
        object = new IllegalArgumentException(((StringBuilder)object2).toString());
        throw object;
    }

    void writeTo(Object object, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.repeated) {
            this.writeRepeatedData(object, codedOutputByteBufferNano);
        } else {
            this.writeSingularData(object, codedOutputByteBufferNano);
        }
    }

    public static class PrimitiveExtension<M extends ExtendableMessageNano<M>, T>
    extends Extension<M, T> {
        private final int nonPackedTag;
        private final int packedTag;

        public PrimitiveExtension(int n10, Class<T> clazz, int n13, boolean bl2, int n14, int n15) {
            super(n10, clazz, n13, bl2);
            this.nonPackedTag = n14;
            this.packedTag = n15;
        }

        private int computePackedDataSize(Object object) {
            int n10 = Array.getLength(object);
            int n13 = this.type;
            int n14 = 0;
            int n15 = 0;
            int n16 = 0;
            int n17 = 0;
            int n18 = 0;
            int n19 = 0;
            int n23 = 0;
            int n24 = n10;
            block0 : switch (n13) {
                default: {
                    object = new StringBuilder("Unexpected non-packable type ");
                    ((StringBuilder)object).append(this.type);
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                case 18: {
                    n24 = 0;
                    n16 = n23;
                    n23 = n24;
                    while (true) {
                        n24 = n23;
                        if (n16 >= n10) break block0;
                        n23 += CodedOutputByteBufferNano.computeSInt64SizeNoTag(Array.getLong(object, n16));
                        ++n16;
                    }
                }
                case 17: {
                    n23 = 0;
                    n16 = n14;
                    while (true) {
                        n24 = n23;
                        if (n16 >= n10) break block0;
                        n23 += CodedOutputByteBufferNano.computeSInt32SizeNoTag(Array.getInt(object, n16));
                        ++n16;
                    }
                }
                case 14: {
                    n23 = 0;
                    n16 = n15;
                    while (true) {
                        n24 = n23;
                        if (n16 >= n10) break block0;
                        n23 += CodedOutputByteBufferNano.computeEnumSizeNoTag(Array.getInt(object, n16));
                        ++n16;
                    }
                }
                case 13: {
                    n23 = 0;
                    while (true) {
                        n24 = n23;
                        if (n16 >= n10) break block0;
                        n23 += CodedOutputByteBufferNano.computeUInt32SizeNoTag(Array.getInt(object, n16));
                        ++n16;
                    }
                }
                case 5: {
                    n23 = 0;
                    n16 = n17;
                    while (true) {
                        n24 = n23;
                        if (n16 >= n10) break block0;
                        n23 += CodedOutputByteBufferNano.computeInt32SizeNoTag(Array.getInt(object, n16));
                        ++n16;
                    }
                }
                case 4: {
                    n23 = 0;
                    n16 = n18;
                    while (true) {
                        n24 = n23;
                        if (n16 >= n10) break block0;
                        n23 += CodedOutputByteBufferNano.computeUInt64SizeNoTag(Array.getLong(object, n16));
                        ++n16;
                    }
                }
                case 3: {
                    n23 = 0;
                    n16 = n19;
                    while (true) {
                        n24 = n23;
                        if (n16 >= n10) break block0;
                        n23 += CodedOutputByteBufferNano.computeInt64SizeNoTag(Array.getLong(object, n16));
                        ++n16;
                    }
                }
                case 2: 
                case 7: 
                case 15: {
                    n24 = n10 * 4;
                    break;
                }
                case 1: 
                case 6: 
                case 16: {
                    n24 = n10 * 8;
                }
                case 8: 
            }
            return n24;
        }

        @Override
        protected int computeRepeatedSerializedSize(Object object) {
            int n10 = this.tag;
            if (n10 == this.nonPackedTag) {
                return super.computeRepeatedSerializedSize(object);
            }
            if (n10 == this.packedTag) {
                int n13 = this.computePackedDataSize(object);
                n10 = CodedOutputByteBufferNano.computeRawVarint32Size(n13);
                return CodedOutputByteBufferNano.computeRawVarint32Size(this.tag) + (n10 + n13);
            }
            object = new StringBuilder("Unexpected repeated extension tag ");
            ((StringBuilder)object).append(this.tag);
            ((StringBuilder)object).append(", unequal to both non-packed variant ");
            ((StringBuilder)object).append(this.nonPackedTag);
            ((StringBuilder)object).append(" and packed variant ");
            ((StringBuilder)object).append(this.packedTag);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        @Override
        protected final int computeSingularSerializedSize(Object object) {
            int n10 = WireFormatNano.getTagFieldNumber(this.tag);
            switch (this.type) {
                default: {
                    object = new StringBuilder("Unknown type ");
                    ((StringBuilder)object).append(this.type);
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

        @Override
        protected Object readData(CodedInputByteBufferNano object) {
            try {
                object = ((CodedInputByteBufferNano)object).readPrimitiveField(this.type);
                return object;
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException("Error reading extension field", iOException);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        protected void readDataInto(UnknownFieldData object, List<Object> list) {
            if (((UnknownFieldData)object).tag == this.nonPackedTag) {
                list.add(this.readData(CodedInputByteBufferNano.newInstance(((UnknownFieldData)object).bytes)));
                return;
            }
            object = CodedInputByteBufferNano.newInstance(((UnknownFieldData)object).bytes);
            try {
                ((CodedInputByteBufferNano)object).pushLimit(((CodedInputByteBufferNano)object).readRawVarint32());
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException("Error reading extension field", iOException);
            }
            while (!((CodedInputByteBufferNano)object).isAtEnd()) {
                list.add(this.readData((CodedInputByteBufferNano)object));
            }
        }

        /*
         * Exception decompiling
         */
        @Override
        protected void writeRepeatedData(Object var1_1, CodedOutputByteBufferNano var2_3) {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 235->244)] java.io.IOException
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        protected final void writeSingularData(Object object, CodedOutputByteBufferNano object2) {
            try {
                ((CodedOutputByteBufferNano)object2).writeRawVarint32(this.tag);
                switch (this.type) {
                    default: {
                        object2 = new StringBuilder("Unknown type ");
                        ((StringBuilder)object2).append(this.type);
                        object = new IllegalArgumentException(((StringBuilder)object2).toString());
                        throw object;
                    }
                    case 18: {
                        ((CodedOutputByteBufferNano)object2).writeSInt64NoTag((Long)object);
                        return;
                    }
                    case 17: {
                        ((CodedOutputByteBufferNano)object2).writeSInt32NoTag((Integer)object);
                        return;
                    }
                    case 16: {
                        ((CodedOutputByteBufferNano)object2).writeSFixed64NoTag((Long)object);
                        return;
                    }
                    case 15: {
                        ((CodedOutputByteBufferNano)object2).writeSFixed32NoTag((Integer)object);
                        return;
                    }
                    case 14: {
                        ((CodedOutputByteBufferNano)object2).writeEnumNoTag((Integer)object);
                        return;
                    }
                    case 13: {
                        ((CodedOutputByteBufferNano)object2).writeUInt32NoTag((Integer)object);
                        return;
                    }
                    case 12: {
                        ((CodedOutputByteBufferNano)object2).writeBytesNoTag((byte[])object);
                        return;
                    }
                    case 9: {
                        ((CodedOutputByteBufferNano)object2).writeStringNoTag((String)object);
                        return;
                    }
                    case 8: {
                        ((CodedOutputByteBufferNano)object2).writeBoolNoTag((Boolean)object);
                        return;
                    }
                    case 7: {
                        ((CodedOutputByteBufferNano)object2).writeFixed32NoTag((Integer)object);
                        return;
                    }
                    case 6: {
                        ((CodedOutputByteBufferNano)object2).writeFixed64NoTag((Long)object);
                        return;
                    }
                    case 5: {
                        ((CodedOutputByteBufferNano)object2).writeInt32NoTag((Integer)object);
                        return;
                    }
                    case 4: {
                        ((CodedOutputByteBufferNano)object2).writeUInt64NoTag((Long)object);
                        return;
                    }
                    case 3: {
                        ((CodedOutputByteBufferNano)object2).writeInt64NoTag((Long)object);
                        return;
                    }
                    case 2: {
                        ((CodedOutputByteBufferNano)object2).writeFloatNoTag(((Float)object).floatValue());
                        return;
                    }
                    case 1: 
                }
                ((CodedOutputByteBufferNano)object2).writeDoubleNoTag((Double)object);
                return;
            }
            catch (IOException iOException) {
                throw new IllegalStateException(iOException);
            }
        }
    }
}


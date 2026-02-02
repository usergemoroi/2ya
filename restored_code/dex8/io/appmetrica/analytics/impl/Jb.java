/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Kj;
import io.appmetrica.analytics.impl.Lj;
import io.appmetrica.analytics.impl.lk;
import io.appmetrica.analytics.impl.ro;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public abstract class jb {
    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(File object) {
        Object object2;
        Object var5_1;
        block17: {
            block16: {
                Object object3;
                block15: {
                    Object object4;
                    Object object5;
                    block14: {
                        var5_1 = null;
                        if (object == null || !((File)object).exists()) break block16;
                        object2 = new RandomAccessFile((File)object, "r");
                        object3 = ((RandomAccessFile)object2).getChannel();
                        object5 = ((FileChannel)object3).lock(0L, Long.MAX_VALUE, true);
                        try {
                            ByteBuffer byteBuffer = ByteBuffer.allocate((int)((File)object).length());
                            ((FileChannel)object3).read(byteBuffer);
                            byteBuffer.flip();
                            object3 = byteBuffer.array();
                        }
                        catch (Throwable throwable) {
                            object4 = object2;
                            object2 = object5;
                            break block14;
                        }
                        ((File)object).getAbsolutePath();
                        jb.a((FileLock)object5);
                        ro.a((Closeable)object2);
                        object2 = object3;
                        break block17;
                        catch (Throwable throwable) {
                            object5 = null;
                            object4 = object2;
                            object2 = object5;
                            break block14;
                        }
                        catch (IOException | SecurityException exception) {
                            Object var3_13 = null;
                            object3 = object2;
                            object2 = var3_13;
                            break block15;
                        }
                        catch (Throwable throwable) {
                            object4 = null;
                            object2 = null;
                        }
                    }
                    try {
                        object5 = Kj.a;
                        object5.getClass();
                        Lj lj3 = new Lj("error_during_file_reading", (Throwable)object3);
                        ((lk)object5).a(lj3);
                    }
                    finally {
                        ((File)object).getAbsolutePath();
                        jb.a((FileLock)object2);
                        ro.a((Closeable)object4);
                    }
                    catch (IOException | SecurityException exception) {
                        object3 = null;
                        object2 = null;
                        break block15;
                    }
                    catch (IOException | SecurityException exception) {
                        object3 = object2;
                        object2 = object5;
                    }
                }
                ((File)object).getAbsolutePath();
                jb.a((FileLock)object2);
                ro.a((Closeable)object3);
            }
            object2 = null;
        }
        object = var5_1;
        if (object2 == null) return object;
        try {
            return new String((byte[])object2, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            object = new String((byte[])object2);
            object2 = Kj.a;
            object2.getClass();
            ((lk)object2).a(new Lj("read_share_file_with_unsupported_encoding", unsupportedEncodingException));
        }
        return object;
    }

    public static void a(String object, FileOutputStream fileOutputStream) {
        FileLock fileLock = null;
        Object object2 = null;
        FileLock fileLock2 = object2;
        FileLock fileLock3 = fileLock;
        FileChannel fileChannel = fileOutputStream.getChannel();
        fileLock2 = object2;
        fileLock3 = fileLock;
        fileLock2 = fileLock = fileChannel.lock();
        fileLock3 = fileLock;
        object = ((String)object).getBytes("UTF-8");
        fileLock2 = fileLock;
        fileLock3 = fileLock;
        object2 = ByteBuffer.allocate(((Object)object).length);
        fileLock2 = fileLock;
        fileLock3 = fileLock;
        ((ByteBuffer)object2).put((byte[])object);
        fileLock2 = fileLock;
        fileLock3 = fileLock;
        ((ByteBuffer)object2).flip();
        fileLock2 = fileLock;
        fileLock3 = fileLock;
        fileChannel.write((ByteBuffer)object2);
        fileLock2 = fileLock;
        fileLock3 = fileLock;
        try {
            fileChannel.force(true);
        }
        catch (Throwable throwable) {
            jb.a(fileLock2);
            ro.a(fileOutputStream);
            throw throwable;
        }
        catch (IOException iOException) {
            jb.a(fileLock3);
            ro.a(fileOutputStream);
        }
        jb.a(fileLock);
        ro.a(fileOutputStream);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(FileLock fileLock) {
        if (fileLock == null) return;
        if (!fileLock.isValid()) return;
        try {
            fileLock.release();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }
}


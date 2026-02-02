/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.AssetFileDescriptor
 *  android.net.Uri
 *  android.os.Bundle
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mv
 *  com.yandex.mobile.ads.impl.pv
 */
package com.yandex.mobile.ads.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mv;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.tj;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class rr
extends tj {
    private final ContentResolver e;
    @Nullable
    private Uri f;
    @Nullable
    private AssetFileDescriptor g;
    @Nullable
    private FileInputStream h;
    private long i;
    private boolean j;

    public rr(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long a(pv object) throws a {
        IOException iOException2;
        Object object2;
        Object object3;
        int n10;
        block14: {
            block15: {
                block17: {
                    long l10;
                    block18: {
                        n10 = 2000;
                        object3 = object.a;
                        this.f = object3;
                        this.b((pv)object);
                        if ("content".equals(object.a.getScheme())) {
                            object2 = new Bundle();
                            object2.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                            object2 = this.e.openTypedAssetFileDescriptor((Uri)object3, "*/*", (Bundle)object2);
                        } else {
                            object2 = this.e.openAssetFileDescriptor((Uri)object3, "r");
                        }
                        this.g = object2;
                        if (object2 == null) break block14;
                        l10 = object2.getLength();
                        object3 = new FileInputStream(object2.getFileDescriptor());
                        this.h = object3;
                        long l11 = l10 - -1L;
                        long l13 = l11 == 0L ? 0 : (l11 < 0L ? -1 : 1);
                        if (l13 != false && object.f > l10) {
                            object = new a(null, 2008);
                            throw object;
                        }
                        long l14 = object2.getStartOffset();
                        if ((l14 = ((FileInputStream)object3).skip(object.f + l14) - l14) != object.f) break block15;
                        if (l13 == false) {
                            object2 = ((FileInputStream)object3).getChannel();
                            l10 = ((FileChannel)object2).size();
                            if (l10 == 0L) {
                                this.i = -1L;
                            } else {
                                this.i = l10 -= ((FileChannel)object2).position();
                                if (l10 < 0L) {
                                    object = new a(null, 2008);
                                    throw object;
                                }
                            }
                        } else {
                            this.i = l10 -= l14;
                            if (l10 < 0L) break block17;
                        }
                        l10 = object.g;
                        if (l10 == -1L) break block18;
                        l14 = this.i;
                        if (l14 != -1L) {
                            l10 = Math.min(l14, l10);
                        }
                        this.i = l10;
                    }
                    this.j = true;
                    this.c((pv)object);
                    l10 = object.g;
                    if (l10 == -1L) return this.i;
                    return l10;
                }
                try {
                    object = new a(null, 2008);
                    throw object;
                }
                catch (IOException iOException2) {
                }
                catch (a a14) {
                    throw a14;
                }
            }
            object = new a(null, 2008);
            throw object;
        }
        StringBuilder stringBuilder = new StringBuilder("Could not open file descriptor for: ");
        stringBuilder.append(object3);
        object = new IOException(stringBuilder.toString());
        object2 = new a((IOException)object, 2000);
        throw object2;
        if (!(iOException2 instanceof FileNotFoundException)) throw new a(iOException2, n10);
        n10 = 2005;
        throw new a(iOException2, n10);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() throws a {
        Throwable throwable422222;
        block21: {
            Throwable throwable2222222;
            IOException iOException322222;
            block20: {
                Throwable throwable3222222;
                block19: {
                    block18: {
                        this.f = null;
                        FileInputStream fileInputStream = this.h;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        this.h = null;
                        fileInputStream = this.g;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            this.e();
                        }
                        return;
                        catch (Throwable throwable3222222) {
                            break block18;
                        }
                        catch (IOException iOException2) {}
                        {
                            a a14 = new a(iOException2, 2000);
                            throw a14;
                        }
                    }
                    this.h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.g = null;
                        if (!this.j) break block19;
                        this.j = false;
                        this.e();
                    }
                    catch (Throwable throwable422222) {
                        break block21;
                    }
                    catch (IOException iOException322222) {}
                }
                throw throwable3222222;
                catch (Throwable throwable2222222) {
                    break block20;
                }
                catch (IOException iOException4) {}
                {
                    a a15 = new a(iOException4, 2000);
                    throw a15;
                }
            }
            this.g = null;
            if (this.j) {
                this.j = false;
                this.e();
            }
            throw throwable2222222;
            {
                a a16 = new a(iOException322222, 2000);
                throw a16;
            }
        }
        this.g = null;
        if (this.j) {
            this.j = false;
            this.e();
        }
        throw throwable422222;
    }

    @Override
    @Nullable
    public final Uri getUri() {
        return this.f;
    }

    /*
     * Unable to fully structure code
     */
    public final int read(byte[] var1_1, int var2_3, int var3_4) throws a {
        block5: {
            if (var3_4 == 0) {
                return 0;
            }
            var7_5 = this.i;
            if (var7_5 == 0L) {
                return -1;
            }
            if (var7_5 == -1L) ** GOTO lbl10
            var5_6 = var3_4;
            try {
                var3_4 = (int)Math.min(var7_5, var5_6);
lbl10:
                // 2 sources

                var9_7 = this.h;
                var4_8 = m92.a;
                var2_3 = var9_7.read(var1_1, var2_3, var3_4);
                if (var2_3 == -1) {
                    return -1;
                }
                var5_6 = this.i;
                if (var5_6 == -1L) break block5;
            }
            catch (IOException var1_2) {
                throw new a(var1_2, 2000);
            }
            this.i = var5_6 - (long)var2_3;
        }
        this.c(var2_3);
        return var2_3;
    }

    public static final class a
    extends mv {
        public a(@Nullable IOException iOException, int n10) {
            super((Throwable)iOException, n10);
        }
    }
}


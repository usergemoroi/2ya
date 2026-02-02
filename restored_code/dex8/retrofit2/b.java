/*
 * Decompiled with CFR 0.152.
 */
package retrofit2;

import okhttp3.b0;
import okio.m0;
import retrofit2.d;

public interface b<T>
extends Cloneable {
    public void cancel();

    public b<T> clone();

    public void enqueue(d<T> var1);

    public boolean isCanceled();

    public boolean isExecuted();

    public b0 request();

    public m0 timeout();
}


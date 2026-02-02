/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.stream.JsonWriter
 *  com.google.gson.w
 *  okhttp3.c0
 *  okhttp3.x
 *  okio.h
 *  retrofit2.h
 */
package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import com.google.gson.w;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import okhttp3.c0;
import okhttp3.x;
import okio.e;
import retrofit2.h;

final class b<T>
implements h<T, c0> {
    private static final x c = x.e((String)"application/json; charset=UTF-8");
    private static final Charset d = Charset.forName("UTF-8");
    private final Gson a;
    private final w<T> b;

    b(Gson gson, w<T> w3) {
        this.a = gson;
        this.b = w3;
    }

    public c0 a(T t3) throws IOException {
        e e4 = new e();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(e4.outputStream(), d);
        outputStreamWriter = this.a.newJsonWriter((Writer)outputStreamWriter);
        this.b.write((JsonWriter)outputStreamWriter, t3);
        outputStreamWriter.close();
        return c0.create((x)c, (okio.h)e4.readByteString());
    }
}


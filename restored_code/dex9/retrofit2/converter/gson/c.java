/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.j
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonToken
 *  com.google.gson.w
 *  okhttp3.e0
 *  retrofit2.h
 */
package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.w;
import java.io.IOException;
import okhttp3.e0;
import retrofit2.h;

final class c<T>
implements h<e0, T> {
    private final Gson a;
    private final w<T> b;

    c(Gson gson, w<T> w3) {
        this.a = gson;
        this.b = w3;
    }

    public T a(e0 e02) throws IOException {
        Object object;
        block3: {
            JsonReader jsonReader = this.a.newJsonReader(e02.charStream());
            try {
                object = this.b.read(jsonReader);
                JsonToken jsonToken = jsonReader.peek();
                jsonReader = JsonToken.END_DOCUMENT;
                if (jsonToken != jsonReader) break block3;
            }
            catch (Throwable throwable) {
                e02.close();
                throw throwable;
            }
            e02.close();
            return (T)object;
        }
        object = new j("JSON document was not fully consumed.");
        throw object;
    }
}


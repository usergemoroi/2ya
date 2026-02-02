/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.ILoggerFactory
 *  org.slf4j.a
 */
package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.a;
import org.slf4j.event.d;
import org.slf4j.helpers.e;

public class f
implements ILoggerFactory {
    boolean a = false;
    final Map<String, e> b = new HashMap<String, e>();
    final LinkedBlockingQueue<d> c = new LinkedBlockingQueue();

    public a a(String string) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                e e4;
                block4: {
                    try {
                        e e5;
                        e4 = e5 = this.b.get(string);
                        if (e5 != null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    e4 = new e(string, this.c, this.a);
                    this.b.put(string, e4);
                }
                return e4;
            }
            throw throwable2;
        }
    }

    public void b() {
        this.b.clear();
        this.c.clear();
    }

    public LinkedBlockingQueue<d> c() {
        return this.c;
    }

    public List<e> d() {
        return new ArrayList<e>(this.b.values());
    }

    public void e() {
        this.a = true;
    }
}


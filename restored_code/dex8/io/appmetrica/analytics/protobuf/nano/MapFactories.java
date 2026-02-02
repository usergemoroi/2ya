/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.protobuf.nano;

import java.util.HashMap;
import java.util.Map;

public final class MapFactories {
    private static volatile MapFactory mapFactory = new DefaultMapFactory();

    private MapFactories() {
    }

    public static MapFactory getMapFactory() {
        return mapFactory;
    }

    static void setMapFactory(MapFactory mapFactory) {
        MapFactories.mapFactory = mapFactory;
    }

    public static class DefaultMapFactory
    implements MapFactory {
        private DefaultMapFactory() {
        }

        @Override
        public <K, V> Map<K, V> forMap(Map<K, V> map2) {
            Map<K, V> map3 = map2;
            if (map2 == null) {
                map3 = new HashMap();
            }
            return map3;
        }
    }

    public static interface MapFactory {
        public <K, V> Map<K, V> forMap(Map<K, V> var1);
    }
}


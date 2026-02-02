/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.google.gson.Gson
 *  com.google.gson.q
 */
package io.intercom.android.sdk.api;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.gson.Gson;
import com.google.gson.q;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DeDuper {
    private static final String CUSTOM_ATTRIBUTES = "custom_attributes";
    private static final String EMPTY_JSON = "{}";
    private static final String PREFS_CACHED_ATTRIBUTES = "CachedAttributes";
    private static final String PREFS_EARLIEST_UPDATE_AT = "EarliestUpdateAt";
    private final Provider<AppConfig> appConfigProvider;
    private final Map<String, Object> cachedAttributes = new HashMap<String, Object>();
    private long earliestUpdateAt = 0L;
    private final Gson gson = new Gson();
    private final SharedPreferences prefs;

    public DeDuper(Provider<AppConfig> provider, SharedPreferences sharedPreferences) {
        this.appConfigProvider = provider;
        this.prefs = sharedPreferences;
    }

    private static boolean containsOnlyEmptyCustomAttributes(Map<String, Object> map2) {
        int n10 = map2.size();
        boolean bl2 = true;
        if (n10 != 1 || !Collections.EMPTY_MAP.equals(map2.get(CUSTOM_ATTRIBUTES))) {
            bl2 = false;
        }
        return bl2;
    }

    @Nullable
    private static Map<String, Object> getCustomAttributes(Map<String, ?> map2) {
        if (!((map2 = map2.get(CUSTOM_ATTRIBUTES)) instanceof Map)) {
            map2 = null;
        }
        return map2;
    }

    private boolean hasExpiredCache() {
        long l10 = this.earliestUpdateAt;
        boolean bl2 = false;
        if (l10 == 0L) {
            return false;
        }
        l10 = this.appConfigProvider.get().getUserUpdateCacheMaxAgeMs();
        if (TimeProvider.SYSTEM.currentTimeMillis() - this.earliestUpdateAt > l10) {
            bl2 = true;
        }
        return bl2;
    }

    private boolean hasNewAttributeValues(Map<String, Object> object) {
        Map<String, Object> map2 = DeDuper.getCustomAttributes(this.cachedAttributes);
        Map<String, Object> object22 = DeDuper.getCustomAttributes(object);
        if (object22 != null) {
            if (map2 == null) {
                return true;
            }
            for (Map.Entry<String, Object> entry : object22.entrySet()) {
                Object object2 = entry.getValue();
                if (object2 == null || object2.equals(map2.get(entry.getKey()))) continue;
                return true;
            }
        }
        for (Map.Entry entry : object.entrySet()) {
            if (CUSTOM_ATTRIBUTES.equals(entry.getKey()) || (map2 = entry.getValue()) == null || ((Object)map2).equals(this.cachedAttributes.get(entry.getKey()))) continue;
            return true;
        }
        return false;
    }

    private boolean isEmpty() {
        return this.cachedAttributes.isEmpty();
    }

    private static Map<String, Object> mergeMaps(Map<String, ?> map2, Map<String, ?> map3) {
        map2 = new HashMap(map2);
        map2.putAll(map3);
        return map2;
    }

    private void persistCachedAttributes() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>(this.cachedAttributes);
        this.prefs.edit().putString(PREFS_CACHED_ATTRIBUTES, this.gson.toJson(hashMap)).putLong(PREFS_EARLIEST_UPDATE_AT, this.earliestUpdateAt).apply();
    }

    @VisibleForTesting
    long getEarliestUpdateAt() {
        return this.earliestUpdateAt;
    }

    @VisibleForTesting
    Map<String, Object> getMap() {
        return this.cachedAttributes;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void readPersistedCachedAttributes() {
        if (!this.prefs.contains(PREFS_CACHED_ATTRIBUTES)) return;
        if (!this.prefs.contains(PREFS_EARLIEST_UPDATE_AT)) return;
        Object object = this.prefs.getString(PREFS_CACHED_ATTRIBUTES, EMPTY_JSON);
        try {
            object = (Map)this.gson.fromJson((String)object, Map.class);
            this.cachedAttributes.putAll((Map<String, Object>)object);
        }
        catch (q q12) {
            return;
        }
        this.earliestUpdateAt = this.prefs.getLong(PREFS_EARLIEST_UPDATE_AT, 0L);
    }

    public void reset() {
        this.cachedAttributes.clear();
        this.earliestUpdateAt = 0L;
        this.persistCachedAttributes();
    }

    @VisibleForTesting
    void setEarliestUpdateAt(long l10) {
        this.earliestUpdateAt = l10;
    }

    public boolean shouldUpdateUser(Map<String, Object> map2) {
        boolean bl2;
        block2: {
            block4: {
                boolean bl3;
                block3: {
                    boolean bl4 = map2.isEmpty();
                    bl2 = bl3 = false;
                    if (bl4) break block2;
                    if (!DeDuper.containsOnlyEmptyCustomAttributes(map2)) break block3;
                    bl2 = bl3;
                    break block2;
                }
                if (this.hasNewAttributeValues(map2) || this.isEmpty()) break block4;
                bl2 = bl3;
                if (!this.hasExpiredCache()) break block2;
            }
            bl2 = true;
        }
        return bl2;
    }

    public void update(Map<String, ?> map2) {
        if (this.hasExpiredCache()) {
            this.cachedAttributes.clear();
            this.setEarliestUpdateAt(TimeProvider.SYSTEM.currentTimeMillis());
        }
        if (this.earliestUpdateAt == 0L) {
            this.setEarliestUpdateAt(TimeProvider.SYSTEM.currentTimeMillis());
        }
        Map<String, Object> map3 = DeDuper.getCustomAttributes(this.cachedAttributes);
        Map<String, Object> map4 = DeDuper.getCustomAttributes(map2);
        this.cachedAttributes.putAll(map2);
        if (map3 != null && map4 != null) {
            this.cachedAttributes.put(CUSTOM_ATTRIBUTES, DeDuper.mergeMaps(map3, map4));
        }
        this.persistCachedAttributes();
    }
}


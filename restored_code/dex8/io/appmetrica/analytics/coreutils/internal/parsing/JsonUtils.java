/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.o0
 *  kotlin.ranges.j
 *  kotlin.sequences.l
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.coreutils.internal.parsing;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.o0;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.y;
import kotlin.ranges.j;
import kotlin.sequences.i;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0011\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0010H\u0007J\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0014\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0007J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u001e\u0010\u0017\u001a\u00020\u0016*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0016H\u0007J)\u0010\u0018\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0016H\u0007\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\"\u0010\u001d\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0014\u0010 \u001a\u00020\u0016*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0007J\u0014\u0010 \u001a\u00020\u0016*\u00020!2\u0006\u0010\u001f\u001a\u00020!H\u0007J$\u0010#\u001a\u0004\u0018\u00010\"*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\"H\u0007\u00a8\u0006$"}, d2={"Lio/appmetrica/analytics/coreutils/internal/parsing/JsonUtils;", "", "Lorg/json/JSONObject;", "", "key", "", "fallback", "optLongOrDefault", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;", "optLongOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", "", "optIntOrDefault", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;", "optIntOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "", "optFloatOrDefault", "optFloatOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Float;", "optStringOrNullable", "optStringOrNull", "", "optBooleanOrDefault", "optBooleanOrNullable", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "optBooleanOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;", "optJsonObjectOrDefault", "optJsonObjectOrNullable", "optJsonObjectOrNull", "value", "isEqualTo", "Lorg/json/JSONArray;", "", "optHexByteArray", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class JsonUtils {
    @NotNull
    public static final JsonUtils INSTANCE = new JsonUtils();

    private JsonUtils() {
    }

    @JvmStatic
    public static final boolean isEqualTo(@NotNull JSONArray jSONArray, @NotNull JSONArray jSONArray2) {
        boolean bl2;
        block7: {
            int n10 = jSONArray.length();
            int n13 = jSONArray2.length();
            boolean bl3 = false;
            if (n10 != n13) {
                return false;
            }
            Object object = j.v((int)0, (int)jSONArray.length());
            if (!(object instanceof Collection) || !((Collection)object).isEmpty()) {
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    n10 = ((o0)iterator).nextInt();
                    Object object2 = jSONArray.get(n10);
                    object = jSONArray2.get(n10);
                    if (object2 instanceof JSONObject) {
                        bl2 = bl3;
                        if (!(object instanceof JSONObject)) break block7;
                        bl2 = JsonUtils.isEqualTo((JSONObject)object2, (JSONObject)object);
                    } else if (object2 instanceof JSONArray) {
                        bl2 = bl3;
                        if (!(object instanceof JSONArray)) break block7;
                        bl2 = JsonUtils.isEqualTo((JSONArray)object2, (JSONArray)object);
                    } else {
                        bl2 = object2.equals(object);
                    }
                    if (bl2) continue;
                    bl2 = bl3;
                    break block7;
                }
            }
            bl2 = true;
        }
        return bl2;
    }

    @JvmStatic
    public static final boolean isEqualTo(@NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2) {
        boolean bl2;
        block6: {
            bl2 = y.e(l.J((i)l.c((Iterator)jSONObject.keys())), l.J((i)l.c((Iterator)jSONObject2.keys())));
            boolean bl3 = false;
            if (!bl2) {
                return false;
            }
            Iterator iterator = l.c((Iterator)jSONObject.keys()).iterator();
            while (iterator.hasNext()) {
                Object object = (String)iterator.next();
                Object object2 = jSONObject.get((String)object);
                object = jSONObject2.get((String)object);
                if (object2 instanceof JSONObject) {
                    bl2 = bl3;
                    if (!(object instanceof JSONObject)) break block6;
                    bl2 = JsonUtils.isEqualTo((JSONObject)object2, (JSONObject)object);
                } else if (object2 instanceof JSONArray) {
                    bl2 = bl3;
                    if (!(object instanceof JSONArray)) break block6;
                    bl2 = JsonUtils.isEqualTo((JSONArray)object2, (JSONArray)object);
                } else {
                    bl2 = object2.equals(object);
                }
                if (bl2) continue;
                bl2 = bl3;
                break block6;
            }
            bl2 = true;
        }
        return bl2;
    }

    @JvmStatic
    public static final boolean optBooleanOrDefault(@Nullable JSONObject object, @NotNull String string2, boolean bl2) {
        if ((object = JsonUtils.optBooleanOrNull((JSONObject)object, string2)) != null) {
            bl2 = (Boolean)object;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @JvmStatic
    @Nullable
    public static final Boolean optBooleanOrNull(@Nullable JSONObject jSONObject, @NotNull String string2) {
        if (jSONObject == null) return null;
        if (!jSONObject.has(string2)) return null;
        try {
            boolean bl2 = jSONObject.getBoolean(string2);
            return bl2;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final Boolean optBooleanOrNullable(@Nullable JSONObject object, @NotNull String string2, @Nullable Boolean bl2) {
        block0: {
            if ((object = JsonUtils.optBooleanOrNull(object, string2)) != null) break block0;
            object = bl2;
        }
        return object;
    }

    @JvmStatic
    public static final float optFloatOrDefault(@Nullable JSONObject object, @NotNull String string2, float f11) {
        if ((object = JsonUtils.optFloatOrNull((JSONObject)object, string2)) != null) {
            f11 = ((Float)object).floatValue();
        }
        return f11;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @JvmStatic
    @Nullable
    public static final Float optFloatOrNull(@Nullable JSONObject jSONObject, @NotNull String string2) {
        if (jSONObject == null) return null;
        if (!jSONObject.has(string2)) return null;
        try {
            float f11 = (float)jSONObject.getDouble(string2);
            return Float.valueOf(f11);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final byte[] optHexByteArray(@Nullable JSONObject object, @NotNull String string2, @Nullable byte[] byArray) {
        Object object2 = byArray;
        if (object != null) {
            object = JsonUtils.optStringOrNull(object, string2);
            object2 = byArray;
            if (object != null) {
                try {
                    object = StringUtils.hexToBytes((String)object);
                }
                catch (Throwable throwable) {
                    object = null;
                }
                object2 = byArray;
                if (object != null) {
                    object2 = object;
                }
            }
        }
        return object2;
    }

    public static /* synthetic */ byte[] optHexByteArray$default(JSONObject jSONObject, String string2, byte[] byArray, int n10, Object object) {
        if ((n10 & 2) != 0) {
            byArray = null;
        }
        return JsonUtils.optHexByteArray(jSONObject, string2, byArray);
    }

    @JvmStatic
    @Nullable
    public static final Integer optIntOrDefault(@Nullable JSONObject object, @NotNull String string2, @Nullable Integer n10) {
        if ((object = JsonUtils.optIntOrNull(object, string2)) != null) {
            n10 = object;
        }
        return n10;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @JvmStatic
    @Nullable
    public static final Integer optIntOrNull(@Nullable JSONObject jSONObject, @NotNull String string2) {
        if (jSONObject == null) return null;
        if (!jSONObject.has(string2)) return null;
        try {
            int n10 = jSONObject.getInt(string2);
            return n10;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final JSONObject optJsonObjectOrDefault(@Nullable JSONObject jSONObject, @NotNull String string2, @NotNull JSONObject jSONObject2) {
        block0: {
            if ((jSONObject = JsonUtils.optJsonObjectOrNull(jSONObject, string2)) != null) break block0;
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    @JvmStatic
    @Nullable
    public static final JSONObject optJsonObjectOrNull(@Nullable JSONObject object, @NotNull String string2) {
        object = object != null ? object.optJSONObject(string2) : null;
        return object;
    }

    @JvmStatic
    @Nullable
    public static final JSONObject optJsonObjectOrNullable(@Nullable JSONObject jSONObject, @NotNull String string2, @Nullable JSONObject jSONObject2) {
        if ((jSONObject = JsonUtils.optJsonObjectOrNull(jSONObject, string2)) != null) {
            jSONObject2 = jSONObject;
        }
        return jSONObject2;
    }

    @JvmStatic
    @Nullable
    public static final Long optLongOrDefault(@Nullable JSONObject object, @NotNull String string2, @Nullable Long l10) {
        if ((object = JsonUtils.optLongOrNull(object, string2)) != null) {
            l10 = object;
        }
        return l10;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @JvmStatic
    @Nullable
    public static final Long optLongOrNull(@Nullable JSONObject jSONObject, @NotNull String string2) {
        if (jSONObject == null) return null;
        if (!jSONObject.has(string2)) return null;
        try {
            long l10 = jSONObject.getLong(string2);
            return l10;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @JvmStatic
    @Nullable
    public static final String optStringOrNull(@Nullable JSONObject object, @NotNull String string2) {
        void var1_3;
        if (object == null) return null;
        if (!object.has((String)var1_3)) return null;
        try {
            return object.getString((String)var1_3);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final String optStringOrNullable(@Nullable JSONObject object, @NotNull String string2, @Nullable String string3) {
        if ((object = JsonUtils.optStringOrNull(object, string2)) != null) {
            string3 = object;
        }
        return string3;
    }
}


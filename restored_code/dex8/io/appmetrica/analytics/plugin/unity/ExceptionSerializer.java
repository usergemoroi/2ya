/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.plugin.unity;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.plugins.StackTraceItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class ExceptionSerializer {
    private ExceptionSerializer() {
    }

    @NonNull
    public static PluginErrorDetails fromJsonString(@NonNull String object) throws JSONException {
        JSONObject jSONObject = new JSONObject((String)object);
        object = new PluginErrorDetails.Builder();
        ((PluginErrorDetails.Builder)object).withPlatform("unity");
        if (jSONObject.has("ExceptionClass")) {
            ((PluginErrorDetails.Builder)object).withExceptionClass(jSONObject.getString("ExceptionClass"));
        }
        if (jSONObject.has("Message")) {
            ((PluginErrorDetails.Builder)object).withMessage(jSONObject.getString("Message"));
        }
        if (jSONObject.has("StackTrace")) {
            ((PluginErrorDetails.Builder)object).withStacktrace(ExceptionSerializer.getStackTrace(jSONObject.getJSONArray("StackTrace")));
        }
        if (jSONObject.has("VirtualMachineVersion")) {
            ((PluginErrorDetails.Builder)object).withVirtualMachineVersion(jSONObject.getString("VirtualMachineVersion"));
        }
        if (jSONObject.has("PluginEnvironment")) {
            ((PluginErrorDetails.Builder)object).withPluginEnvironment(ExceptionSerializer.getPluginEnvironment(jSONObject.getJSONObject("PluginEnvironment")));
        }
        return ((PluginErrorDetails.Builder)object).build();
    }

    @NonNull
    private static Map<String, String> getPluginEnvironment(@NonNull JSONObject jSONObject) throws JSONException {
        HashMap<String, String> hashMap = new HashMap<String, String>(jSONObject.length());
        Iterator iterator = jSONObject.keys();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            hashMap.put(string2, jSONObject.getString(string2));
        }
        return hashMap;
    }

    @NonNull
    private static List<StackTraceItem> getStackTrace(@NonNull JSONArray jSONArray) throws JSONException {
        LinkedList<StackTraceItem> linkedList = new LinkedList<StackTraceItem>();
        for (int i14 = 0; i14 < jSONArray.length(); ++i14) {
            linkedList.add(ExceptionSerializer.getStackTraceItem(jSONArray.getJSONObject(i14)));
        }
        return linkedList;
    }

    @NonNull
    private static StackTraceItem getStackTraceItem(@NonNull JSONObject jSONObject) throws JSONException {
        StackTraceItem.Builder builder = new StackTraceItem.Builder();
        if (jSONObject.has("FileName")) {
            builder.withFileName(jSONObject.getString("FileName"));
        }
        if (jSONObject.has("ClassName")) {
            builder.withClassName(jSONObject.getString("ClassName"));
        }
        if (jSONObject.has("MethodName")) {
            builder.withMethodName(jSONObject.getString("MethodName"));
        }
        if (jSONObject.has("Line")) {
            builder.withLine(jSONObject.getInt("Line"));
        }
        if (jSONObject.has("Column")) {
            builder.withColumn(jSONObject.getInt("Column"));
        }
        return builder.build();
    }
}


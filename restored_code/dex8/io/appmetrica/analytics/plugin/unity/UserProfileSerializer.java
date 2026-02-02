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
import io.appmetrica.analytics.profile.Attribute;
import io.appmetrica.analytics.profile.BirthDateAttribute;
import io.appmetrica.analytics.profile.BooleanAttribute;
import io.appmetrica.analytics.profile.CounterAttribute;
import io.appmetrica.analytics.profile.GenderAttribute;
import io.appmetrica.analytics.profile.NameAttribute;
import io.appmetrica.analytics.profile.NotificationsEnabledAttribute;
import io.appmetrica.analytics.profile.NumberAttribute;
import io.appmetrica.analytics.profile.StringAttribute;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class UserProfileSerializer {
    private UserProfileSerializer() {
    }

    @NonNull
    public static UserProfile fromJsonString(@NonNull String string2) throws JSONException {
        string2 = new JSONArray(string2);
        UserProfile.Builder builder = UserProfile.newBuilder();
        for (int i14 = 0; i14 < string2.length(); ++i14) {
            builder.apply(UserProfileSerializer.parseUserProfileUpdate(string2.getJSONObject(i14)));
        }
        return builder.build();
    }

    @NonNull
    private static GenderAttribute.Gender getGender(@NonNull String string2) {
        string2.hashCode();
        if (!string2.equals("Male")) {
            if (!string2.equals("Female")) {
                return GenderAttribute.Gender.OTHER;
            }
            return GenderAttribute.Gender.FEMALE;
        }
        return GenderAttribute.Gender.MALE;
    }

    @NonNull
    private static UserProfileUpdate<?> parseBirthDate(@NonNull String userProfileUpdate, @NonNull JSONObject object) throws JSONException {
        BirthDateAttribute birthDateAttribute = Attribute.birthDate();
        ((String)((Object)userProfileUpdate)).hashCode();
        int n10 = ((String)((Object)userProfileUpdate)).hashCode();
        int n13 = -1;
        switch (n10) {
            default: {
                break;
            }
            case 468880500: {
                if (!((String)((Object)userProfileUpdate)).equals("BirthDateMonthUserProfileUpdate")) break;
                n13 = 4;
                break;
            }
            case 404148035: {
                if (!((String)((Object)userProfileUpdate)).equals("BirthDateDaysUserProfileUpdate")) break;
                n13 = 3;
                break;
            }
            case -291919483: {
                if (!((String)((Object)userProfileUpdate)).equals("BirthDateResetUserProfileUpdate")) break;
                n13 = 2;
                break;
            }
            case -1298186211: {
                if (!((String)((Object)userProfileUpdate)).equals("BirthDateYearUserProfileUpdate")) break;
                n13 = 1;
                break;
            }
            case -1394076907: {
                if (!((String)((Object)userProfileUpdate)).equals("BirthDateAgeUserProfileUpdate")) break;
                n13 = 0;
            }
        }
        switch (n13) {
            default: {
                object = new StringBuilder();
                ((StringBuilder)object).append("Unknown UserProfile type ");
                ((StringBuilder)object).append((String)((Object)userProfileUpdate));
                throw new JSONException(((StringBuilder)object).toString());
            }
            case 4: {
                n13 = object.getInt("Year");
                n10 = object.getInt("Month");
                userProfileUpdate = object.getBoolean("IfUndefined") ? birthDateAttribute.withBirthDateIfUndefined(n13, n10) : birthDateAttribute.withBirthDate(n13, n10);
                return userProfileUpdate;
            }
            case 3: {
                int n14 = object.getInt("Year");
                n10 = object.getInt("Month");
                n13 = object.getInt("DayOfMonth");
                userProfileUpdate = object.getBoolean("IfUndefined") ? birthDateAttribute.withBirthDateIfUndefined(n14, n10, n13) : birthDateAttribute.withBirthDate(n14, n10, n13);
                return userProfileUpdate;
            }
            case 2: {
                return birthDateAttribute.withValueReset();
            }
            case 1: {
                n13 = object.getInt("Year");
                userProfileUpdate = object.getBoolean("IfUndefined") ? birthDateAttribute.withBirthDateIfUndefined(n13) : birthDateAttribute.withBirthDate(n13);
                return userProfileUpdate;
            }
            case 0: 
        }
        n13 = object.getInt("Age");
        userProfileUpdate = object.getBoolean("IfUndefined") ? birthDateAttribute.withAgeIfUndefined(n13) : birthDateAttribute.withAge(n13);
        return userProfileUpdate;
    }

    @NonNull
    private static UserProfileUpdate<?> parseBoolean(@NonNull String userProfileUpdate, @NonNull JSONObject object) throws JSONException {
        BooleanAttribute booleanAttribute = Attribute.customBoolean(object.getString("Key"));
        ((String)((Object)userProfileUpdate)).hashCode();
        if (!((String)((Object)userProfileUpdate)).equals("BooleanValueUserProfileUpdate")) {
            if (((String)((Object)userProfileUpdate)).equals("BooleanResetUserProfileUpdate")) {
                return booleanAttribute.withValueReset();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unknown UserProfile type ");
            ((StringBuilder)object).append((String)((Object)userProfileUpdate));
            throw new JSONException(((StringBuilder)object).toString());
        }
        boolean bl2 = object.getBoolean("Value");
        userProfileUpdate = object.getBoolean("IfUndefined") ? booleanAttribute.withValueIfUndefined(bl2) : booleanAttribute.withValue(bl2);
        return userProfileUpdate;
    }

    @NonNull
    private static UserProfileUpdate<?> parseCounter(@NonNull String string2, @NonNull JSONObject object) throws JSONException {
        CounterAttribute counterAttribute = Attribute.customCounter(object.getString("Key"));
        if (string2.equals("CounterDeltaUserProfileUpdate")) {
            return counterAttribute.withDelta(object.getDouble("Delta"));
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unknown UserProfile type ");
        ((StringBuilder)object).append(string2);
        throw new JSONException(((StringBuilder)object).toString());
    }

    @NonNull
    private static UserProfileUpdate<?> parseGender(@NonNull String object, @NonNull JSONObject object2) throws JSONException {
        GenderAttribute genderAttribute = Attribute.gender();
        object.hashCode();
        if (!object.equals("GenderValueUserProfileUpdate")) {
            if (object.equals("GenderResetUserProfileUpdate")) {
                return genderAttribute.withValueReset();
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Unknown UserProfile type ");
            ((StringBuilder)object2).append((String)object);
            throw new JSONException(((StringBuilder)object2).toString());
        }
        object = UserProfileSerializer.getGender(object2.getString("Value"));
        object = object2.getBoolean("IfUndefined") ? genderAttribute.withValueIfUndefined((GenderAttribute.Gender)((Object)object)) : genderAttribute.withValue((GenderAttribute.Gender)((Object)object));
        return object;
    }

    @NonNull
    private static UserProfileUpdate<?> parseName(@NonNull String userProfileUpdate, @NonNull JSONObject object) throws JSONException {
        NameAttribute nameAttribute = Attribute.name();
        ((String)((Object)userProfileUpdate)).hashCode();
        if (!((String)((Object)userProfileUpdate)).equals("NameValueUserProfileUpdate")) {
            if (((String)((Object)userProfileUpdate)).equals("NameResetUserProfileUpdate")) {
                return nameAttribute.withValueReset();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unknown UserProfile type ");
            ((StringBuilder)object).append((String)((Object)userProfileUpdate));
            throw new JSONException(((StringBuilder)object).toString());
        }
        userProfileUpdate = object.getString("Value");
        userProfileUpdate = object.getBoolean("IfUndefined") ? nameAttribute.withValueIfUndefined((String)((Object)userProfileUpdate)) : nameAttribute.withValue((String)((Object)userProfileUpdate));
        return userProfileUpdate;
    }

    @NonNull
    private static UserProfileUpdate<?> parseNotificationsEnabled(@NonNull String userProfileUpdate, @NonNull JSONObject object) throws JSONException {
        NotificationsEnabledAttribute notificationsEnabledAttribute = Attribute.notificationsEnabled();
        ((String)((Object)userProfileUpdate)).hashCode();
        if (!((String)((Object)userProfileUpdate)).equals("NotificationsEnabledValueUserProfileUpdate")) {
            if (((String)((Object)userProfileUpdate)).equals("NotificationsEnabledResetUserProfileUpdate")) {
                return notificationsEnabledAttribute.withValueReset();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unknown UserProfile type ");
            ((StringBuilder)object).append((String)((Object)userProfileUpdate));
            throw new JSONException(((StringBuilder)object).toString());
        }
        boolean bl2 = object.getBoolean("Value");
        userProfileUpdate = object.getBoolean("IfUndefined") ? notificationsEnabledAttribute.withValueIfUndefined(bl2) : notificationsEnabledAttribute.withValue(bl2);
        return userProfileUpdate;
    }

    @NonNull
    private static UserProfileUpdate<?> parseNumber(@NonNull String userProfileUpdate, @NonNull JSONObject object) throws JSONException {
        NumberAttribute numberAttribute = Attribute.customNumber(object.getString("Key"));
        ((String)((Object)userProfileUpdate)).hashCode();
        if (!((String)((Object)userProfileUpdate)).equals("NumberValueUserProfileUpdate")) {
            if (((String)((Object)userProfileUpdate)).equals("NumberResetUserProfileUpdate")) {
                return numberAttribute.withValueReset();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unknown UserProfile type ");
            ((StringBuilder)object).append((String)((Object)userProfileUpdate));
            throw new JSONException(((StringBuilder)object).toString());
        }
        double d14 = object.getDouble("Value");
        userProfileUpdate = object.getBoolean("IfUndefined") ? numberAttribute.withValueIfUndefined(d14) : numberAttribute.withValue(d14);
        return userProfileUpdate;
    }

    @NonNull
    private static UserProfileUpdate<?> parseString(@NonNull String userProfileUpdate, @NonNull JSONObject object) throws JSONException {
        StringAttribute stringAttribute = Attribute.customString(object.getString("Key"));
        ((String)((Object)userProfileUpdate)).hashCode();
        if (!((String)((Object)userProfileUpdate)).equals("StringValueUserProfileUpdate")) {
            if (((String)((Object)userProfileUpdate)).equals("StringResetUserProfileUpdate")) {
                return stringAttribute.withValueReset();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unknown UserProfile type ");
            ((StringBuilder)object).append((String)((Object)userProfileUpdate));
            throw new JSONException(((StringBuilder)object).toString());
        }
        userProfileUpdate = object.getString("Value");
        userProfileUpdate = object.getBoolean("IfUndefined") ? stringAttribute.withValueIfUndefined((String)((Object)userProfileUpdate)) : stringAttribute.withValue((String)((Object)userProfileUpdate));
        return userProfileUpdate;
    }

    @NonNull
    private static UserProfileUpdate<?> parseUserProfileUpdate(@NonNull JSONObject object) throws JSONException {
        String string2 = object.getString("Type");
        if (string2.startsWith("BirthDate")) {
            return UserProfileSerializer.parseBirthDate(string2, (JSONObject)object);
        }
        if (string2.startsWith("Boolean")) {
            return UserProfileSerializer.parseBoolean(string2, (JSONObject)object);
        }
        if (string2.startsWith("Counter")) {
            return UserProfileSerializer.parseCounter(string2, (JSONObject)object);
        }
        if (string2.startsWith("Gender")) {
            return UserProfileSerializer.parseGender(string2, (JSONObject)object);
        }
        if (string2.startsWith("Name")) {
            return UserProfileSerializer.parseName(string2, (JSONObject)object);
        }
        if (string2.startsWith("NotificationsEnabled")) {
            return UserProfileSerializer.parseNotificationsEnabled(string2, (JSONObject)object);
        }
        if (string2.startsWith("Number")) {
            return UserProfileSerializer.parseNumber(string2, (JSONObject)object);
        }
        if (string2.startsWith("String")) {
            return UserProfileSerializer.parseString(string2, (JSONObject)object);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unknown UserProfile type ");
        ((StringBuilder)object).append(string2);
        throw new JSONException(((StringBuilder)object).toString());
    }
}


package cabpoint.cabigate.apps.com.cabpoint.database;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesHelper {
    private static final String PREFS_NAME = "CabPointPrefs";
    private static SharedPreferences sharedPreferences;

    public SharedPreferencesHelper(Context context) {
        sharedPreferences = context.getSharedPreferences(SharedPreferencesHelper.PREFS_NAME, Context.MODE_PRIVATE);
    }

    public static SharedPreferences getInstance() {
        return sharedPreferences;
    }

    public static String getString(String key) {
        return sharedPreferences.getString(key, null);
    }

    public static int getInt(String key) {
        return sharedPreferences.getInt(key, 0);
    }

    public static boolean getBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }

    public static SharedPreferences.Editor getEditor() {
        return sharedPreferences.edit();
    }

    public static void setString(String key, String value) {
        SharedPreferences.Editor editor = getEditor();
        editor.putString(key, value);
        editor.apply();
    }
    public void setLogin(boolean islogin) {
        SharedPreferences.Editor edit =  getEditor();
        edit.putBoolean("islogin", islogin);
        edit.commit();
    }

    public static void putBooelan(String key, Boolean value) {
        SharedPreferences.Editor editor = getEditor();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public static void clearPreferenceStore() {
        SharedPreferences.Editor editor = getEditor();
        editor.clear();
        editor.commit();
    }
    public static void clearPreference(String key) {
        SharedPreferences.Editor editor = getEditor();
        editor.remove(key);
        editor.commit();
    }
}

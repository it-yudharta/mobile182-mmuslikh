package id.codemerindu.amalankuu;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

public class Config {


    final public static int FONT_QALAM_MAJEED = 0;
    final public static int FONT_HAFS = 1;
    final public static int FONT_NOOREHUDA = 2;
    final public static int FONT_ME_QURAN = 3;
    final public static int FONT_MAX = 3;


    final public static String LANG = "lang";
    final public static String LANG_INDO = "indo";
    final public static String SHOW_TRANSLATION = "showTranslation";
    final public static String WORD_BY_WORD = "wordByWord";
    final public static String KEEP_SCREEN_ON = "keepScreenOn";
    final public static String ARABIC_FONT = "arabicFont";
    final public static String FONT_SIZE_ARABIC = "fontSizeArabic";
    final public static String FONT_SIZE_TRANSLATION = "fontSizeTranslation";
    final public static String FIRST_RUN = "firstRun";
    final public static String DATABASE_VERSION = "dbVersion";

    final public static String defaultLang = "in";
    final public static boolean defaultShowTranslation = true;
    final public static boolean defaultWordByWord = true;
    final public static boolean defaultKeepScreenOn = true;
    final public static String defaultArabicFont = "PDMS_IslamicFont.ttf";
    final public static String defaultFontSizeArabic = "30";
    final public static String defaultFontSizeTranslation = "14";

    // public String lang;
    public boolean rtl;
    public boolean showTranslation;
    public boolean wordByWord;
    public boolean fullWidth;
    public boolean keepScreenOn;
    public boolean enableAnalytics;
    public String fontArabic;
    public String fontSizeArabic;
    public int fontSizeTranslation;


    public void load(Context context) {
        Log.d("Config", "Load");
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        try {
            loadDefault();
            fontArabic = sp.getString(Config.ARABIC_FONT, Config.defaultArabicFont);
            fontSizeArabic = sp.getString(Config.FONT_SIZE_ARABIC, Config.defaultFontSizeArabic);
            Log.d("Config", "Loading Custom");

        } catch (Exception e) {
            loadDefault();
            Log.d("Config", "Exception Loading Defaults");
        }
    }


    public void loadDefault() {
        fontArabic = defaultArabicFont;
        fontSizeArabic = defaultFontSizeArabic;

    }


    private int getStringInt(SharedPreferences sp, String key, int defValue) {
        return Integer.parseInt(sp.getString(key, Integer.toString(defValue)));
    }



}

package id.codemerindu.amalankuu.database;


import android.content.Context;
import android.util.Log;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseHelper extends SQLiteAssetHelper {

    public static final String DATABASE_NAME = "AlQuran.db";
    public static final int DATABASE_VERSION = 8;

    public DatabaseHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        this.setForcedUpgrade();
        Log.d( "DatabaseHelper: ","constructor");
    }
}

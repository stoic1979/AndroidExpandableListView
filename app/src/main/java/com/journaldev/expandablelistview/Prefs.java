package com.journaldev.expandablelistview;


import android.content.Context;
import android.content.SharedPreferences;

public class Prefs {

    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor prefsEditor;

    public static void initPrefs(Context context)
    {
        sharedPreferences = context.getSharedPreferences("prefs", Context.MODE_PRIVATE);
        prefsEditor = sharedPreferences.edit();

    }//initPrefs

}

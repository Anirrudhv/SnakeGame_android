package com.example.anirudhv.snakegame.activities.models;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by anirudhv on 10/28/17.
 */

public class MySharedPreferences {
        private static final String VELOCITY_KEY = "velocityKey";

        public static int loadVelocity(Context context) {
            SharedPreferences tmpSharedPreferences
                    = PreferenceManager.getDefaultSharedPreferences(context);

            String storedVelocity = tmpSharedPreferences.getString(VELOCITY_KEY, "0");
            return Integer.parseInt(storedVelocity);
        }
    }


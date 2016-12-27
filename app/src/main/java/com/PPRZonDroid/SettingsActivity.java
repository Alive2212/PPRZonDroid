/*
 * Copyright (C) 2014 Savas Sen - ENAC UAV Lab
 *
 * This file is part of paparazzi..
 *
 * paparazzi is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2, or (at your option)
 * any later version.
 *
 * paparazzi is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with paparazzi; see the file COPYING.  If not, write to
 * the Free Software Foundation, 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 *
 */

/**
 * Handle Settings
 */
package com.PPRZonDroid;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.util.Log;

/**
 * SettingsActivity content
 */

public class SettingsActivity extends Activity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Display the fragment as the main content.
    getFragmentManager().beginTransaction()
            .replace(android.R.id.content, new SettingsFragment())
            .commit();
  }

}

@SuppressLint("ValidFragment")
class SettingsFragment extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener {

  public static final String USE_GPS = "use_gps_checkbox";
  public static final String SERVER_IP_ADDRESS = "server_ip_address_text";
  public static final String SERVER_PORT_ADDRESS = "server_port_number_text";
  public static final String LOCAL_PORT_ADDRESS = "local_port_number_text";
  public static final String MIN_AIRSPEED = "minimum_air_speed";
  public static final String BLOCK_C_TIMEOUT = "block_change_timeout";

  public static final String HOME_LATITUDE = "home_latitude";
  public static final String HOME_LONGITUDE = "home_longitude";
  public static final String HOME_ALTITUDE = "home_altitude";

  public static final String STDBY_LATITUDE = "stdby_latitude";
  public static final String STDBY_LONGITUDE = "stdby_longitude";
  public static final String STDBY_ALTITUDE = "stdby_altitude";

  public static final String CLIMB_LATITUDE = "climb_latitude";
  public static final String CLIMB_LONGITUDE = "climb_longitude";
  public static final String CLIMB_ALTITUDE = "climb_altitude";

  public static final String MOB_LATITUDE = "mob_latitude";
  public static final String MOB_LONGITUDE = "mob_longitude";
  public static final String MOB_ALTITUDE = "mob_altitude";

  public static final String TD_LATITUDE = "td_latitude";
  public static final String TD_LONGITUDE = "td_longitude";
  public static final String TD_ALTITUDE = "td_altitude";

  public static final String AF_LATITUDE = "af_latitude";
  public static final String AF_LONGITUDE = "af_longitude";
  public static final String AF_ALTITUDE = "af_altitude";

  public static final String S1_LATITUDE = "s1_latitude";
  public static final String S1_LONGITUDE = "s1_longitude";
  public static final String S1_ALTITUDE = "s1_altitude";

  public static final String S2_LATITUDE = "s2_latitude";
  public static final String S2_LONGITUDE = "s2_longitude";
  public static final String S2_ALTITUDE = "s2_altitude";

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);


    // Load the preferences from an XML resource
    addPreferencesFromResource(R.xml.preferences);
    Preference connectionPref = findPreference(SERVER_IP_ADDRESS);
    connectionPref.setSummary(PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(SERVER_IP_ADDRESS, ""));

    Preference connectionPref2 = findPreference(SERVER_PORT_ADDRESS);
    connectionPref2.setSummary(PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(SERVER_PORT_ADDRESS, ""));

    Preference connectionPref3 = findPreference(LOCAL_PORT_ADDRESS);
    connectionPref3.setSummary(PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(LOCAL_PORT_ADDRESS, ""));

    Preference connectionPref4 = findPreference(MIN_AIRSPEED);
    connectionPref4.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(MIN_AIRSPEED, "")) + " m/s");

    Preference connectionPref5 = findPreference(BLOCK_C_TIMEOUT);
    connectionPref5.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(BLOCK_C_TIMEOUT, "")) + " sec");

    Preference connectionPref6 = findPreference(HOME_LATITUDE);
    connectionPref6.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(HOME_LATITUDE, "")));

    Preference connectionPref7 = findPreference(HOME_LONGITUDE);
    connectionPref7.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(HOME_LONGITUDE, "")));

    Preference connectionPref8 = findPreference(HOME_ALTITUDE);
    connectionPref8.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(HOME_ALTITUDE, "")));

    Preference connectionPref9 = findPreference(STDBY_LATITUDE);
    connectionPref9.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(STDBY_LATITUDE, "")));

    Preference connectionPref10 = findPreference(STDBY_LONGITUDE);
    connectionPref10.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(STDBY_LONGITUDE, "")));

    Preference connectionPref11 = findPreference(STDBY_ALTITUDE);
    connectionPref11.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(STDBY_ALTITUDE, "")));

    Preference connectionPref12 = findPreference(CLIMB_LATITUDE);
    connectionPref12.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(CLIMB_LATITUDE, "")));

    Preference connectionPref13 = findPreference(CLIMB_LONGITUDE);
    connectionPref13.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(CLIMB_LONGITUDE, "")));

    Preference connectionPref14 = findPreference(CLIMB_ALTITUDE);
    connectionPref14.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(CLIMB_ALTITUDE, "")));

    Preference connectionPref15 = findPreference(MOB_LATITUDE);
    connectionPref15.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(MOB_LATITUDE, "")));

    Preference connectionPref16 = findPreference(MOB_LONGITUDE);
    connectionPref16.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(MOB_LONGITUDE, "")));

    Preference connectionPref17 = findPreference(MOB_ALTITUDE);
    connectionPref17.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(MOB_ALTITUDE, "")));

    Preference connectionPref18 = findPreference(TD_LATITUDE);
    connectionPref18.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(TD_LATITUDE, "")));

    Preference connectionPref19 = findPreference(TD_LONGITUDE);
    connectionPref19.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(TD_LONGITUDE, "")));

    Preference connectionPref20 = findPreference(TD_ALTITUDE);
    connectionPref20.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(TD_ALTITUDE, "")));

    Preference connectionPref21 = findPreference(AF_LATITUDE);
    connectionPref21.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(AF_LATITUDE, "")));

    Preference connectionPref22 = findPreference(AF_LONGITUDE);
    connectionPref22.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(AF_LONGITUDE, "")));

    Preference connectionPref23 = findPreference(AF_ALTITUDE);
    connectionPref23.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(AF_ALTITUDE, "")));

    Preference connectionPref24 = findPreference(S1_LATITUDE);
    connectionPref24.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(S1_LATITUDE, "")));

    Preference connectionPref25 = findPreference(S1_LONGITUDE);
    connectionPref25.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(S1_LONGITUDE, "")));

    Preference connectionPref26 = findPreference(S1_ALTITUDE);
    connectionPref26.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(S1_ALTITUDE, "")));

    Preference connectionPref27 = findPreference(S2_LATITUDE);
    connectionPref27.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(S2_LATITUDE, "")));

    Preference connectionPref28 = findPreference(S2_LONGITUDE);
    connectionPref28.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(S2_LONGITUDE, "")));

    Preference connectionPref29 = findPreference(S2_ALTITUDE);
    connectionPref29.setSummary((PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(S2_ALTITUDE, "")));
  }

  @Override
  public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

    if (key.equals(SERVER_IP_ADDRESS)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }

    if (key.equals(SERVER_PORT_ADDRESS)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }

    if (key.equals(LOCAL_PORT_ADDRESS)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }

    if (key.equals(MIN_AIRSPEED)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, "") + " m/s");
    }

    if (key.equals(BLOCK_C_TIMEOUT)) {
        Preference connectionPref = findPreference(key);
        //Set summary to be the user-description for the selected value
        assert connectionPref != null;
        connectionPref.setSummary(sharedPreferences.getString(key, "") + " sec");
    }

//    On Home position changed
//    Latitude
    if (key.equals(HOME_LATITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }
//    Longitude
    if (key.equals(HOME_LONGITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }
//    Altitude
    if (key.equals(HOME_ALTITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }

//    On STDBY position changed
//    Latitude
    if (key.equals(STDBY_LATITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }
//    Longitude
    if (key.equals(STDBY_LONGITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }
//    Altitude
    if (key.equals(STDBY_ALTITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }

//    On Climb position changed
//    Latitude
    if (key.equals(CLIMB_LATITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }
//    Longitude
    if (key.equals(CLIMB_LONGITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }
//    Altitude
    if (key.equals(CLIMB_ALTITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }

//    On MOB position changed
//    Latitude
    if (key.equals(MOB_LATITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }
//    Longitude
    if (key.equals(MOB_LONGITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }
//    Altitude
    if (key.equals(MOB_ALTITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }

//    On TD position changed
//    Latitude
    if (key.equals(TD_LATITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }
//    Longitude
    if (key.equals(TD_LONGITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }
//    Altitude
    if (key.equals(TD_ALTITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }

//    On AF position changed
//    Latitude
    if (key.equals(AF_LATITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }
//    Longitude
    if (key.equals(AF_LONGITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }
//    Altitude
    if (key.equals(AF_ALTITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }

//    On S1 position changed
//    Latitude
    if (key.equals(S1_LATITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }
//    Longitude
    if (key.equals(S1_LONGITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }
//    Altitude
    if (key.equals(S1_ALTITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }

//    On S2 position changed
//    Latitude
    if (key.equals(S2_LATITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }
//    Longitude
    if (key.equals(S2_LONGITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }
//    Altitude
    if (key.equals(S2_ALTITUDE)) {
      Preference connectionPref = findPreference(key);
      //Set summary to be the user-description for the selected value
      connectionPref.setSummary(sharedPreferences.getString(key, ""));
    }


    //Log.d("PPRZ_info", "Preference changed");
  }

  @Override
  public void onResume() {
    super.onResume();
    getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);

  }

  @Override
  public void onPause() {
    super.onPause();
    getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
  }
}
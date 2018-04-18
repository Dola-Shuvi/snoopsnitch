package de.srlabs.patchalyzer;

import android.graphics.Color;

import de.srlabs.snoopsnitch.PAAppFlavorSNSN;

/**
 * Keeps some constant values, which are used by Patchalyzer
 */
public class Constants  {
    public static final String LOG_TAG="PatchAnalyzer";

    public static final int APP_VERSION = 10;
    public static final String DEFAULT_APK_UPGRADE_URL = "https://snoopsnitch-api.srlabs.de/patchalyzer.apk";
    // needed so that subsequent calls to loaddata work on the same webview
    public static final String WEBVIEW_URL_LOADDATA = "arbitrary://invalid/url";

    //testmode (decide whether we want to test files on OS or external files extracted to /sdcard/system)
    // can be useful when testing 64Bit builds on a 32Bit device
    public static final boolean IS_TEST_MODE=false;
    public static final String TEST_MODE_BASIC_TEST_FILE_PREFIX = "/sdcard";

    public enum ActivityState {START, PATCHLEVEL_DATES, VULNERABILITY_LIST, TESTING}

    //colors
    public static final int COLOR_INCONCLUSIVE=0xFF7575EC;
    public static final int COLOR_MISSING= 0xFFD36031;
    public static final int COLOR_PATCHED=0xFF84B538;
    public static final int COLOR_NOTAFFECTED=Color.GRAY;
    public static final int COLOR_NOTCLAIMED=0xFFFF8000;

    private static AppFlavor APP_FLAVOR = new PAAppFlavorSNSN();

    public static void setAppFlavor(AppFlavor appFlavor){
        APP_FLAVOR = appFlavor;
    }

    public static AppFlavor getAppFlavor(){
        return APP_FLAVOR;
    }

}

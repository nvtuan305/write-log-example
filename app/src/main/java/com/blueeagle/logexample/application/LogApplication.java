package com.blueeagle.logexample.application;

import android.app.Application;
import android.util.Log;

import com.blueeagle.logexample.BuildConfig;

import timber.log.Timber;


public class LogApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        } else {
            Timber.plant(new CrashReportingTree());
        }
    }

    /**
     * A tree which logs important information for crash reporting.
     */
    private static class CrashReportingTree extends Timber.Tree {
        @Override
        protected void log(int priority, String tag, String message, Throwable t) {
            if (priority == Log.VERBOSE || priority == Log.DEBUG) {
                return;
            }

            LogCrashLibrary.log(priority, tag, message);

            if (t != null) {
                if (priority == Log.ERROR) {
                    LogCrashLibrary.logError(t);

                } else if (priority == Log.WARN) {
                    LogCrashLibrary.logWarning(t);
                }
            }
        }
    }
}

package com.blueeagle.logexample.application;

public class LogCrashLibrary {

    public static void log(int priority, String tag, String message) {
        // TODO add log entry to circular buffer.
    }

    public static void logWarning(Throwable t) {
        // TODO report non-fatal warning.
    }

    public static void logError(Throwable t) {
        // TODO report non-fatal error.
    }

    private LogCrashLibrary() {
        throw new AssertionError("No instances.");
    }
}

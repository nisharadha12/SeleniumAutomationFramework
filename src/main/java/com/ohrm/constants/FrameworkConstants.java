package com.ohrm.constants;

public final class FrameworkConstants {

    private FrameworkConstants() {
    }
    private static final String REPORTPATH = System.getProperty("user.dir") + "/index.html";
    public static String getReportpath() {
        return REPORTPATH;
    }
}

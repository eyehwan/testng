package org.testng.internal;

public class Version {

    public static final String VERSION = "DEV-SNAPSHOT-01e7fb59fb43af3b-6.14.14";

    public static String getVersionString() {
        return VERSION;
    }

    public static void displayBanner() {
        System.out.println("...\n... TestNG " + getVersionString() + " by Cédric Beust (cedric@beust.com)\n...\n");
    }
}

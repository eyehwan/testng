package org.testng.internal;

public class Version {

    public static final String VERSION = "DEV-SNAPSHOT-9e19cd0514586cfb460af-6.14.15";

    public static String getVersionString() {
        return VERSION;
    }

    public static void displayBanner() {
        System.out.println("...\n... TestNG " + getVersionString() + " by Cédric Beust (cedric@beust.com)\n...\n");
    }
}
